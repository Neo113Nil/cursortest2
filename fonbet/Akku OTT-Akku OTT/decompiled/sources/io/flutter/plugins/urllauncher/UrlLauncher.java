package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import io.flutter.plugins.urllauncher.Messages;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes3.dex */
final class UrlLauncher implements Messages.UrlLauncherApi {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "UrlLauncher";

    @Nullable
    private Activity activity;

    @NonNull
    private final Context applicationContext;

    @NonNull
    private final IntentResolver intentResolver;

    @VisibleForTesting
    public interface IntentResolver {
        String getHandlerComponentName(@NonNull Intent intent);
    }

    @VisibleForTesting
    public UrlLauncher(@NonNull Context context, @NonNull IntentResolver intentResolver) {
        this.applicationContext = context;
        this.intentResolver = intentResolver;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static boolean containsRestrictedHeader(Map<String, String> map) {
        Iterator<String> it = map.keySet().iterator();
        while (true) {
            char c = 0;
            if (!it.hasNext()) {
                return false;
            }
            String lowerCase = it.next().toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -1423461112:
                    if (lowerCase.equals("accept")) {
                        break;
                    }
                    c = 65535;
                    break;
                case -1229727188:
                    if (lowerCase.equals("content-language")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 785670158:
                    if (lowerCase.equals("content-type")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 802785917:
                    if (lowerCase.equals("accept-language")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                case 1:
                case 2:
                case 3:
                default:
                    return true;
            }
        }
    }

    private void ensureActivity() {
        if (this.activity == null) {
            throw new Messages.FlutterError("NO_ACTIVITY", "Launching a URL requires a foreground activity.", null);
        }
    }

    @NonNull
    private static Bundle extractBundle(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            bundle.putString(str, map.get(str));
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$new$0(Context context, Intent intent) {
        ComponentName resolveActivity = intent.resolveActivity(context.getPackageManager());
        if (resolveActivity == null) {
            return null;
        }
        return resolveActivity.toShortString();
    }

    private static boolean openCustomTab(@NonNull Context context, @NonNull Uri uri, @NonNull Bundle bundle, @NonNull Messages.BrowserOptions browserOptions) {
        CustomTabsIntent build = new CustomTabsIntent.Builder().setShowTitle(browserOptions.getShowTitle().booleanValue()).build();
        build.intent.putExtra("com.android.browser.headers", bundle);
        try {
            build.launchUrl(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean canLaunchUrl(@NonNull String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        return this.intentResolver.getHandlerComponentName(intent) == null ? Boolean.FALSE : Boolean.valueOf(!"{com.android.fallback/com.android.fallback.Fallback}".equals(r3));
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    public void closeWebView() {
        this.applicationContext.sendBroadcast(new Intent(WebViewActivity.ACTION_CLOSE));
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean launchUrl(@NonNull String str, @NonNull Map<String, String> map, @NonNull Boolean bool) {
        ensureActivity();
        Intent putExtra = new Intent("android.intent.action.VIEW").setData(Uri.parse(str)).putExtra("com.android.browser.headers", extractBundle(map));
        if (bool.booleanValue() && Build.VERSION.SDK_INT >= 30) {
            putExtra.addFlags(1024);
        }
        try {
            this.activity.startActivity(putExtra);
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean openUrlInApp(@NonNull String str, @NonNull Boolean bool, @NonNull Messages.WebViewOptions webViewOptions, @NonNull Messages.BrowserOptions browserOptions) {
        ensureActivity();
        Bundle extractBundle = extractBundle(webViewOptions.getHeaders());
        if (bool.booleanValue() && !containsRestrictedHeader(webViewOptions.getHeaders())) {
            if (openCustomTab(this.activity, Uri.parse(str), extractBundle, browserOptions)) {
                return Boolean.TRUE;
            }
        }
        try {
            this.activity.startActivity(WebViewActivity.createIntent(this.activity, str, webViewOptions.getEnableJavaScript().booleanValue(), webViewOptions.getEnableDomStorage().booleanValue(), extractBundle));
            return Boolean.TRUE;
        } catch (ActivityNotFoundException unused) {
            return Boolean.FALSE;
        }
    }

    public void setActivity(@Nullable Activity activity) {
        this.activity = activity;
    }

    @Override // io.flutter.plugins.urllauncher.Messages.UrlLauncherApi
    @NonNull
    public Boolean supportsCustomTabs() {
        return Boolean.valueOf(CustomTabsClient.getPackageName(this.applicationContext, Collections.EMPTY_LIST) != null);
    }

    public UrlLauncher(@NonNull final Context context) {
        this(context, new IntentResolver() { // from class: io.flutter.plugins.urllauncher.a
            @Override // io.flutter.plugins.urllauncher.UrlLauncher.IntentResolver
            public final String getHandlerComponentName(Intent intent) {
                String lambda$new$0;
                lambda$new$0 = UrlLauncher.lambda$new$0(context, intent);
                return lambda$new$0;
            }
        });
    }
}
