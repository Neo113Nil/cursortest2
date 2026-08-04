package com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs;

import A5.s;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.widget.RemoteViews;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsActionButton;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.CustomTabsSecondaryToolbar;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p017c.b;
import p109p.a;
import p109p.k;
import p109p.l;
import p109p.p;
import p109p.q;
import p109p.r;

/* JADX INFO: loaded from: classes2.dex */
public class ChromeCustomTabsActivity extends Activity implements Disposable {
    public static final int CHROME_CUSTOM_TAB_REQUEST_CODE = 100;
    protected static final String LOG_TAG = "CustomTabsActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_chromesafaribrowser_";
    public static final int NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE = 101;
    public CustomTabsActionButton actionButton;
    public k builder;
    public ChromeCustomTabsChannelDelegate channelDelegate;
    public q customTabsSession;
    public String id;
    public Map<String, String> initialHeaders;
    public List<String> initialOtherLikelyURLs;
    public String initialReferrer;
    public String initialUrl;
    public ChromeSafariBrowserManager manager;
    public CustomTabsSecondaryToolbar secondaryToolbar;
    public ChromeCustomTabsSettings customSettings = new ChromeCustomTabsSettings();
    public CustomTabActivityHelper customTabActivityHelper = new CustomTabActivityHelper();
    protected boolean onOpened = false;
    protected boolean onCompletedInitialLoad = false;
    protected boolean isBindSuccess = false;
    public List<CustomTabsMenuItem> menuItems = new ArrayList();

    private PendingIntent createPendingIntent(int i7) {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putInt(ActionBroadcastReceiver.KEY_ACTION_ID, i7);
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, i7, intent, 167772160) : PendingIntent.getBroadcast(this, i7, intent, 134217728);
    }

    private void prepareCustomTabs() {
        k kVar = this.builder;
        if (kVar == null) {
            return;
        }
        ChromeCustomTabsSettings chromeCustomTabsSettings = this.customSettings;
        Boolean bool = chromeCustomTabsSettings.addDefaultShareMenuItem;
        if (bool != null) {
            kVar.b(bool.booleanValue() ? 1 : 2);
        } else {
            kVar.b(chromeCustomTabsSettings.shareState.intValue());
        }
        String str = this.customSettings.toolbarBackgroundColor;
        Integer numValueOf = null;
        Integer numValueOf2 = (str == null || str.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.toolbarBackgroundColor) | (-16777216));
        String str2 = this.customSettings.navigationBarColor;
        Integer numValueOf3 = (str2 == null || str2.isEmpty()) ? null : Integer.valueOf((-16777216) | Color.parseColor(this.customSettings.navigationBarColor));
        String str3 = this.customSettings.navigationBarDividerColor;
        Integer numValueOf4 = (str3 == null || str3.isEmpty()) ? null : Integer.valueOf(Color.parseColor(this.customSettings.navigationBarDividerColor));
        String str4 = this.customSettings.secondaryToolbarColor;
        if (str4 != null && !str4.isEmpty()) {
            numValueOf = Integer.valueOf(Color.parseColor(this.customSettings.secondaryToolbarColor));
        }
        k kVar2 = this.builder;
        kVar2.getClass();
        Bundle bundle = new Bundle();
        if (numValueOf2 != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", numValueOf2.intValue());
        }
        if (numValueOf != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", numValueOf.intValue());
        }
        if (numValueOf3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", numValueOf3.intValue());
        }
        if (numValueOf4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", numValueOf4.intValue());
        }
        kVar2.f15653e = bundle;
        this.builder.f15649a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", this.customSettings.showTitle.booleanValue() ? 1 : 0);
        this.builder.f15649a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", this.customSettings.enableUrlBarHiding.booleanValue());
        this.builder.f15655g = this.customSettings.instantAppsEnabled.booleanValue();
        if (this.customSettings.startAnimations.size() == 2) {
            k kVar3 = this.builder;
            int identifier = this.customSettings.startAnimations.get(0).getIdentifier(this);
            int identifier2 = this.customSettings.startAnimations.get(1).getIdentifier(this);
            kVar3.getClass();
            kVar3.f15652d = ActivityOptions.makeCustomAnimation(this, identifier, identifier2);
        }
        if (this.customSettings.exitAnimations.size() == 2) {
            k kVar4 = this.builder;
            int identifier3 = this.customSettings.exitAnimations.get(0).getIdentifier(this);
            int identifier4 = this.customSettings.exitAnimations.get(1).getIdentifier(this);
            kVar4.getClass();
            kVar4.f15649a.putExtra("android.support.customtabs.extra.EXIT_ANIMATION_BUNDLE", ActivityOptions.makeCustomAnimation(this, identifier3, identifier4).toBundle());
        }
        for (CustomTabsMenuItem customTabsMenuItem : this.menuItems) {
            k kVar5 = this.builder;
            String label = customTabsMenuItem.getLabel();
            PendingIntent pendingIntentCreatePendingIntent = createPendingIntent(customTabsMenuItem.getId());
            if (kVar5.f15651c == null) {
                kVar5.f15651c = new ArrayList();
            }
            Bundle bundle2 = new Bundle();
            bundle2.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", label);
            bundle2.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntentCreatePendingIntent);
            kVar5.f15651c.add(bundle2);
        }
        CustomTabsActionButton customTabsActionButton = this.actionButton;
        if (customTabsActionButton != null) {
            byte[] icon = customTabsActionButton.getIcon();
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inMutable = true;
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(icon, 0, icon.length, options);
            k kVar6 = this.builder;
            String description = this.actionButton.getDescription();
            PendingIntent pendingIntentCreatePendingIntent2 = createPendingIntent(this.actionButton.getId());
            boolean zIsShouldTint = this.actionButton.isShouldTint();
            kVar6.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt("android.support.customtabs.customaction.ID", 0);
            bundle3.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeByteArray);
            bundle3.putString("android.support.customtabs.customaction.DESCRIPTION", description);
            bundle3.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", pendingIntentCreatePendingIntent2);
            Intent intent = kVar6.f15649a;
            intent.putExtra("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle3);
            intent.putExtra("android.support.customtabs.extra.TINT_ACTION_BUTTON", zIsShouldTint);
        }
        CustomTabsSecondaryToolbar customTabsSecondaryToolbar = this.secondaryToolbar;
        if (customTabsSecondaryToolbar != null) {
            AndroidResource layout = customTabsSecondaryToolbar.getLayout();
            RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
            int[] iArr = new int[this.secondaryToolbar.getClickableIDs().size()];
            int size = this.secondaryToolbar.getClickableIDs().size();
            for (int i7 = 0; i7 < size; i7++) {
                iArr[i7] = this.secondaryToolbar.getClickableIDs().get(i7).getIdentifier(this);
            }
            k kVar7 = this.builder;
            PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
            Intent intent2 = kVar7.f15649a;
            intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
            intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
            intent2.putExtra("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
        }
    }

    private void prepareCustomTabsIntent(l lVar) {
        String str = this.customSettings.packageName;
        if (str != null) {
            lVar.f15656a.setPackage(str);
        } else {
            lVar.f15656a.setPackage(CustomTabsHelper.getPackageNameToUse(this));
        }
        if (this.customSettings.keepAliveEnabled.booleanValue()) {
            CustomTabsHelper.addKeepAliveExtra(this, lVar.f15656a);
        }
        if (this.customSettings.alwaysUseBrowserUI.booleanValue()) {
            Intent intent = lVar.f15656a;
            if (intent == null) {
                intent = new Intent("android.intent.action.VIEW");
            }
            intent.addFlags(268435456);
            intent.putExtra("android.support.customtabs.extra.user_opt_out", true);
        }
    }

    public void close() {
        onStop();
        onDestroy();
        this.customTabsSession = null;
        finish();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.onClosed();
        }
    }

    public void customTabsConnected() {
        String str;
        q session = this.customTabActivityHelper.getSession();
        this.customTabsSession = session;
        if (session != null) {
            try {
                Bundle bundle = new Bundle();
                if (this.customTabsSession.b(bundle)) {
                    q qVar = this.customTabsSession;
                    r rVar = new r() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.3
                        @Override // p109p.r
                        public void onGreatestScrollPercentageIncreased(int i7, Bundle bundle2) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onGreatestScrollPercentageIncreased(i7);
                            }
                        }

                        @Override // p109p.r
                        public void onSessionEnded(boolean z4, Bundle bundle2) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onSessionEnded(z4);
                            }
                        }

                        @Override // p109p.r
                        public void onVerticalScrollEvent(boolean z4, Bundle bundle2) {
                            ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                            if (chromeCustomTabsChannelDelegate != null) {
                                chromeCustomTabsChannelDelegate.onVerticalScrollEvent(z4);
                            }
                        }
                    };
                    Bundle bundleA = qVar.a(bundle);
                    try {
                        ((b) qVar.f15665b).y0(qVar.f15666c, new p(rVar), bundleA);
                    } catch (SecurityException e7) {
                        throw new UnsupportedOperationException("This method isn't supported by the Custom Tabs implementation.", e7);
                    }
                }
            } catch (Throwable th) {
                Log.d(LOG_TAG, "Custom Tabs Engagement Signals API not supported", th);
            }
        }
        if (!this.isBindSuccess || (str = this.initialUrl) == null) {
            return;
        }
        launchUrl(str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        onStop();
        onDestroy();
        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = this.channelDelegate;
        if (chromeCustomTabsChannelDelegate != null) {
            chromeCustomTabsChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        if (chromeSafariBrowserManager != null && chromeSafariBrowserManager.browsers.containsKey(this.id)) {
            this.manager.browsers.put(this.id, null);
        }
        this.manager = null;
    }

    public PendingIntent getSecondaryToolbarOnClickPendingIntent() {
        Intent intent = new Intent(this, (Class<?>) ActionBroadcastReceiver.class);
        Bundle bundle = new Bundle();
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_VIEW_ID, this.id);
        ChromeSafariBrowserManager chromeSafariBrowserManager = this.manager;
        bundle.putString(ActionBroadcastReceiver.KEY_ACTION_MANAGER_ID, chromeSafariBrowserManager != null ? chromeSafariBrowserManager.id : null);
        intent.putExtras(bundle);
        return Build.VERSION.SDK_INT >= 31 ? PendingIntent.getBroadcast(this, 0, intent, 167772160) : PendingIntent.getBroadcast(this, 0, intent, 134217728);
    }

    public void launchUrl(String str, Map<String, String> map, String str2, List<String> list) {
        launchUrlWithSession(this.customTabsSession, str, map, str2, list);
    }

    public void launchUrlWithSession(q qVar, String str, Map<String, String> map, String str2, List<String> list) {
        mayLaunchUrl(str, list);
        this.builder = new k(qVar);
        prepareCustomTabs();
        l lVarA = this.builder.a();
        prepareCustomTabsIntent(lVarA);
        CustomTabActivityHelper.openCustomTab(this, lVarA, Uri.parse(str), map, str2 != null ? Uri.parse(str2) : null, 100);
    }

    public boolean mayLaunchUrl(String str, List<String> list) {
        Uri uri = str != null ? Uri.parse(str) : null;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Bundle bundle = new Bundle();
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                bundle.putString("android.support.customtabs.otherurls.URL", it.next());
            }
        }
        return this.customTabActivityHelper.mayLaunchUrl(uri, null, arrayList);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        if (i7 == 100) {
            close();
            dispose();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        NoHistoryCustomTabsActivityCallbacks noHistoryCustomTabsActivityCallbacks;
        super.onCreate(bundle);
        setContentView(R.layout.chrome_custom_tabs_layout);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            if (bundle != null) {
                close();
                return;
            }
            return;
        }
        this.id = extras.getString("id");
        ChromeSafariBrowserManager chromeSafariBrowserManager = ChromeSafariBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = chromeSafariBrowserManager;
        if (chromeSafariBrowserManager == null || (inAppWebViewFlutterPlugin = chromeSafariBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
            if (bundle != null) {
                close();
                return;
            }
            return;
        }
        chromeSafariBrowserManager.browsers.put(this.id, this);
        this.channelDelegate = new ChromeCustomTabsChannelDelegate(this, new s(this.manager.plugin.messenger, METHOD_CHANNEL_NAME_PREFIX + this.id));
        this.initialUrl = extras.getString("url");
        this.initialHeaders = (Map) extras.getSerializable("headers");
        this.initialReferrer = extras.getString("referrer");
        this.initialOtherLikelyURLs = extras.getStringArrayList("otherLikelyURLs");
        ChromeCustomTabsSettings chromeCustomTabsSettings = new ChromeCustomTabsSettings();
        this.customSettings = chromeCustomTabsSettings;
        chromeCustomTabsSettings.parse2((Map<String, Object>) extras.getSerializable("settings"));
        this.actionButton = CustomTabsActionButton.fromMap((Map) extras.getSerializable("actionButton"));
        this.secondaryToolbar = CustomTabsSecondaryToolbar.fromMap((Map) extras.getSerializable("secondaryToolbar"));
        Iterator it = ((List) extras.getSerializable("menuItemList")).iterator();
        while (it.hasNext()) {
            this.menuItems.add(CustomTabsMenuItem.fromMap((Map) it.next()));
        }
        if (this.customSettings.noHistory.booleanValue() && (noHistoryCustomTabsActivityCallbacks = this.manager.plugin.noHistoryCustomTabsActivityCallbacks) != null) {
            Map<String, String> map = noHistoryCustomTabsActivityCallbacks.noHistoryBrowserIDs;
            String str = this.id;
            map.put(str, str);
        }
        this.customTabActivityHelper.setConnectionCallback(new CustomTabActivityHelper.ConnectionCallback() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.1
            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsConnected() {
                ChromeCustomTabsActivity.this.customTabsConnected();
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onServiceConnected();
                }
            }

            @Override // com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.CustomTabActivityHelper.ConnectionCallback
            public void onCustomTabsDisconnected() {
                this.close();
                ChromeCustomTabsActivity.this.dispose();
            }
        });
        this.customTabActivityHelper.setCustomTabsCallback(new a() { // from class: com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity.2
            @Override // p109p.a
            public void extraCallback(String str2, Bundle bundle2) {
            }

            @Override // p109p.a
            public void onMessageChannelReady(Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onMessageChannelReady();
                }
            }

            @Override // p109p.a
            public void onNavigationEvent(int i7, Bundle bundle2) {
                if (i7 == 5) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity.onOpened) {
                        chromeCustomTabsActivity.onOpened = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = chromeCustomTabsActivity.channelDelegate;
                        if (chromeCustomTabsChannelDelegate != null) {
                            chromeCustomTabsChannelDelegate.onOpened();
                        }
                    }
                }
                if (i7 == 2) {
                    ChromeCustomTabsActivity chromeCustomTabsActivity2 = ChromeCustomTabsActivity.this;
                    if (!chromeCustomTabsActivity2.onCompletedInitialLoad) {
                        chromeCustomTabsActivity2.onCompletedInitialLoad = true;
                        ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate2 = chromeCustomTabsActivity2.channelDelegate;
                        if (chromeCustomTabsChannelDelegate2 != null) {
                            chromeCustomTabsChannelDelegate2.onCompletedInitialLoad();
                        }
                    }
                }
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate3 = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate3 != null) {
                    chromeCustomTabsChannelDelegate3.onNavigationEvent(i7);
                }
            }

            @Override // p109p.a
            public void onPostMessage(String str2, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onPostMessage(str2);
                }
            }

            @Override // p109p.a
            public void onRelationshipValidationResult(int i7, Uri uri, boolean z4, Bundle bundle2) {
                ChromeCustomTabsChannelDelegate chromeCustomTabsChannelDelegate = ChromeCustomTabsActivity.this.channelDelegate;
                if (chromeCustomTabsChannelDelegate != null) {
                    chromeCustomTabsChannelDelegate.onRelationshipValidationResult(i7, uri, z4);
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onStart() {
        String str;
        super.onStart();
        boolean zBindCustomTabsService = this.customTabActivityHelper.bindCustomTabsService(this);
        this.isBindSuccess = zBindCustomTabsService;
        if (zBindCustomTabsService || (str = this.initialUrl) == null) {
            return;
        }
        launchUrlWithSession(null, str, this.initialHeaders, this.initialReferrer, this.initialOtherLikelyURLs);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.customTabActivityHelper.unbindCustomTabsService(this);
        this.isBindSuccess = false;
    }

    public void updateActionButton(byte[] bArr, String str) {
        if (this.customTabsSession == null || this.actionButton == null) {
            return;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inMutable = true;
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        q qVar = this.customTabsSession;
        qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.customaction.ICON", bitmapDecodeByteArray);
        bundle.putString("android.support.customtabs.customaction.DESCRIPTION", str);
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("android.support.customtabs.extra.ACTION_BUTTON_BUNDLE", bundle);
        try {
            ((b) qVar.f15665b).z0(qVar.f15666c, bundle2);
        } catch (RemoteException unused) {
        }
        this.actionButton.setIcon(bArr);
        this.actionButton.setDescription(str);
    }

    public void updateSecondaryToolbar(CustomTabsSecondaryToolbar customTabsSecondaryToolbar) {
        if (this.customTabsSession == null) {
            return;
        }
        AndroidResource layout = customTabsSecondaryToolbar.getLayout();
        RemoteViews remoteViews = new RemoteViews(layout.getDefPackage(), layout.getIdentifier(this));
        int[] iArr = new int[customTabsSecondaryToolbar.getClickableIDs().size()];
        int size = customTabsSecondaryToolbar.getClickableIDs().size();
        for (int i7 = 0; i7 < size; i7++) {
            iArr[i7] = customTabsSecondaryToolbar.getClickableIDs().get(i7).getIdentifier(this);
        }
        q qVar = this.customTabsSession;
        PendingIntent secondaryToolbarOnClickPendingIntent = getSecondaryToolbarOnClickPendingIntent();
        qVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS", remoteViews);
        bundle.putIntArray("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_VIEW_IDS", iArr);
        bundle.putParcelable("android.support.customtabs.extra.EXTRA_REMOTEVIEWS_PENDINGINTENT", secondaryToolbarOnClickPendingIntent);
        try {
            ((b) qVar.f15665b).z0(qVar.f15666c, bundle);
        } catch (RemoteException unused) {
        }
        this.secondaryToolbar = customTabsSecondaryToolbar;
    }
}
