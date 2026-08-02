package org.betup.utils;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.facebook.share.internal.ShareConstants;
import com.tiktok.util.UrlConst;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ExternalBrowserOpener.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000bH\u0002¨\u0006\u0010"}, d2 = {"Lorg/betup/utils/ExternalBrowserOpener;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, "", "context", "Landroid/content/Context;", "url", "", "parseHttpUri", "Landroid/net/Uri;", "tryCustomTab", "", ShareConstants.MEDIA_URI, "tryBrowserIntentExcludingSelf", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExternalBrowserOpener {
    public static final int $stable = 0;
    public static final ExternalBrowserOpener INSTANCE = new ExternalBrowserOpener();

    private ExternalBrowserOpener() {
    }

    @JvmStatic
    public static final void open(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(url, "url");
        ExternalBrowserOpener externalBrowserOpener = INSTANCE;
        Uri parseHttpUri = externalBrowserOpener.parseHttpUri(url);
        if (parseHttpUri == null || externalBrowserOpener.tryCustomTab(context, parseHttpUri)) {
            return;
        }
        externalBrowserOpener.tryBrowserIntentExcludingSelf(context, parseHttpUri);
    }

    private final Uri parseHttpUri(String url) {
        String obj = StringsKt.trim((CharSequence) url).toString();
        if (obj.length() == 0) {
            return null;
        }
        if (!StringsKt.startsWith(obj, "http://", true) && !StringsKt.startsWith(obj, UrlConst.HTTPS, true)) {
            obj = UrlConst.HTTPS + obj;
        }
        return Uri.parse(obj);
    }

    private final boolean tryCustomTab(Context context, Uri uri) {
        String packageNameToUse = CustomTabsHelper.getPackageNameToUse(context);
        if (packageNameToUse == null) {
            return false;
        }
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            build.intent.setPackage(packageNameToUse);
            if (!(context instanceof Activity)) {
                build.intent.addFlags(268435456);
            }
            build.launchUrl(context, uri);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    private final boolean tryBrowserIntentExcludingSelf(Context context, Uri uri) {
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.addCategory("android.intent.category.BROWSABLE");
        Intent addCategory = new Intent("android.intent.action.VIEW", Uri.fromParts("http", "", null)).addCategory("android.intent.category.BROWSABLE");
        Intrinsics.checkNotNullExpressionValue(addCategory, "addCategory(...)");
        intent.setSelector(addCategory);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        try {
            context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }
}
