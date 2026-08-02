package com.pichillilorenzo.flutter_inappwebview_android.in_app_browser;

import A5.r;
import A5.s;
import G0.a;
import Q3.o;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.SearchView;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.R;
import com.pichillilorenzo.flutter_inappwebview_android.Util;
import com.pichillilorenzo.flutter_inappwebview_android.find_interaction.FindInteractionController;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshLayout;
import com.pichillilorenzo.flutter_inappwebview_android.pull_to_refresh.PullToRefreshSettings;
import com.pichillilorenzo.flutter_inappwebview_android.types.AndroidResource;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import com.pichillilorenzo.flutter_inappwebview_android.types.InAppBrowserMenuItem;
import com.pichillilorenzo.flutter_inappwebview_android.types.URLRequest;
import com.pichillilorenzo.flutter_inappwebview_android.types.UserScript;
import com.pichillilorenzo.flutter_inappwebview_android.webview.InAppWebViewManager;
import com.pichillilorenzo.flutter_inappwebview_android.webview.WebViewChannelDelegate;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewChromeClient;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewSettings;
import i.AbstractActivityC1231i;
import i.AbstractC1223a;
import i.C1230h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m.k;
import x5.InterfaceC1790b;

/* loaded from: classes2.dex */
public class InAppBrowserActivity extends AbstractActivityC1231i implements InAppBrowserDelegate, Disposable {
    protected static final String LOG_TAG = "InAppBrowserActivity";
    public static final String METHOD_CHANNEL_NAME_PREFIX = "com.pichillilorenzo/flutter_inappbrowser_";
    public AbstractC1223a actionBar;
    private List<ActivityResultListener> activityResultListeners;
    public InAppBrowserChannelDelegate channelDelegate;
    public InAppBrowserSettings customSettings;
    public String fromActivity;
    public String id;
    public boolean isHidden;
    public InAppBrowserManager manager;
    public Menu menu;
    public List<InAppBrowserMenuItem> menuItems;
    public ProgressBar progressBar;
    public PullToRefreshLayout pullToRefreshLayout;
    public SearchView searchView;
    public InAppWebView webView;
    public Integer windowId;

    public InAppBrowserActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new a(this));
        addOnContextAvailableListener(new C1230h(this));
        this.customSettings = new InAppBrowserSettings();
        this.isHidden = false;
        this.activityResultListeners = new ArrayList();
        this.menuItems = new ArrayList();
    }

    private void prepareView() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.prepare();
        }
        if (this.customSettings.hidden.booleanValue()) {
            hide();
        } else {
            show();
        }
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        this.progressBar = progressBar;
        if (progressBar != null) {
            if (this.customSettings.hideProgressBar.booleanValue()) {
                this.progressBar.setMax(0);
            } else {
                this.progressBar.setMax(100);
            }
        }
        AbstractC1223a abstractC1223a = this.actionBar;
        if (abstractC1223a != null) {
            abstractC1223a.p(!this.customSettings.hideTitleBar.booleanValue());
            if (this.customSettings.hideToolbarTop.booleanValue()) {
                this.actionBar.f();
            }
            String str = this.customSettings.toolbarTopBackgroundColor;
            if (str != null && !str.isEmpty()) {
                this.actionBar.n(new ColorDrawable(Color.parseColor(this.customSettings.toolbarTopBackgroundColor)));
            }
            String str2 = this.customSettings.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                return;
            }
            this.actionBar.r(this.customSettings.toolbarTopFixedTitle);
        }
    }

    public boolean canGoBack() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoBack();
        }
        return false;
    }

    public boolean canGoForward() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            return inAppWebView.canGoForward();
        }
        return false;
    }

    public void close(r rVar) {
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.onExit();
        }
        dispose();
        if (rVar != null) {
            rVar.success(Boolean.TRUE);
        }
    }

    public void closeButtonClicked(MenuItem menuItem) {
        close(null);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public void didChangeProgress(int i7) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            this.progressBar.setProgress(i7, true);
            if (i7 == 100) {
                this.progressBar.setVisibility(8);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public void didChangeTitle(String str) {
        if (this.actionBar != null) {
            String str2 = this.customSettings.toolbarTopFixedTitle;
            if (str2 == null || str2.isEmpty()) {
                this.actionBar.r(str);
            }
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public void didFailNavigation(String str, int i7, String str2) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public void didFinishNavigation(String str) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public void didStartNavigation(String str) {
        ProgressBar progressBar = this.progressBar;
        if (progressBar != null) {
            progressBar.setProgress(0);
        }
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public void didUpdateVisitedHistory(String str) {
        SearchView searchView = this.searchView;
        if (searchView != null) {
            searchView.setQuery(str, false);
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        InterfaceC1790b interfaceC1790b;
        InAppWebViewChromeClient inAppWebViewChromeClient;
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.activityResultListeners.clear();
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            InAppBrowserManager inAppBrowserManager = this.manager;
            if (inAppBrowserManager != null && (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) != null && (interfaceC1790b = inAppWebViewFlutterPlugin.activityPluginBinding) != null && (inAppWebViewChromeClient = inAppWebView.inAppWebViewChromeClient) != null) {
                ((HashSet) ((o) interfaceC1790b).f5824c).remove(inAppWebViewChromeClient);
            }
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.container);
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
            this.webView.dispose();
            this.webView = null;
            finish();
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public Activity getActivity() {
        return this;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserDelegate
    public List<ActivityResultListener> getActivityResultListeners() {
        return this.activityResultListeners;
    }

    public Map<String, Object> getCustomSettingsMap() {
        InAppWebView inAppWebView = this.webView;
        Map<String, Object> customSettingsMap = inAppWebView != null ? inAppWebView.getCustomSettingsMap() : null;
        InAppBrowserSettings inAppBrowserSettings = this.customSettings;
        if (inAppBrowserSettings == null || customSettingsMap == null) {
            return null;
        }
        Map<String, Object> realSettings = inAppBrowserSettings.getRealSettings(this);
        realSettings.putAll(customSettingsMap);
        return realSettings;
    }

    public void goBack() {
        if (this.webView == null || !canGoBack()) {
            return;
        }
        this.webView.goBack();
    }

    public void goBackButtonClicked(MenuItem menuItem) {
        goBack();
    }

    public void goForward() {
        if (this.webView == null || !canGoForward()) {
            return;
        }
        this.webView.goForward();
    }

    public void goForwardButtonClicked(MenuItem menuItem) {
        goForward();
    }

    public void hide() {
        if (this.fromActivity != null) {
            try {
                this.isHidden = true;
                Intent intent = new Intent(this, Class.forName(this.fromActivity));
                intent.setFlags(131072);
                startActivityIfNeeded(intent, 0);
            } catch (ClassNotFoundException e7) {
                Log.d(LOG_TAG, "", e7);
            }
        }
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, android.app.Activity
    public void onActivityResult(int i7, int i8, Intent intent) {
        Iterator<ActivityResultListener> it = this.activityResultListeners.iterator();
        while (it.hasNext()) {
            if (it.next().onActivityResult(i7, i8, intent)) {
                return;
            }
        }
        super.onActivityResult(i7, i8, intent);
    }

    @Override // androidx.fragment.app.A, androidx.activity.o, F.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin;
        URLRequest fromMap;
        InAppWebViewManager inAppWebViewManager;
        Message message;
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            if (bundle != null) {
                finish();
                return;
            }
            return;
        }
        this.id = extras.getString("id");
        InAppBrowserManager inAppBrowserManager = InAppBrowserManager.shared.get(extras.getString("managerId"));
        this.manager = inAppBrowserManager;
        if (inAppBrowserManager == null || (inAppWebViewFlutterPlugin = inAppBrowserManager.plugin) == null || inAppWebViewFlutterPlugin.messenger == null) {
            if (bundle != null) {
                finish();
                return;
            }
            return;
        }
        Map<String, Object> map = (Map) extras.getSerializable("settings");
        this.customSettings.parse2(map);
        this.windowId = Integer.valueOf(extras.getInt("windowId"));
        setContentView(R.layout.activity_web_view);
        Map<String, Object> map2 = (Map) extras.getSerializable("pullToRefreshInitialSettings");
        s sVar = new s(this.manager.plugin.messenger, PullToRefreshLayout.METHOD_CHANNEL_NAME_PREFIX + this.id);
        PullToRefreshSettings pullToRefreshSettings = new PullToRefreshSettings();
        pullToRefreshSettings.parse2(map2);
        PullToRefreshLayout pullToRefreshLayout = (PullToRefreshLayout) findViewById(R.id.pullToRefresh);
        this.pullToRefreshLayout = pullToRefreshLayout;
        pullToRefreshLayout.channelDelegate = new PullToRefreshChannelDelegate(pullToRefreshLayout, sVar);
        PullToRefreshLayout pullToRefreshLayout2 = this.pullToRefreshLayout;
        pullToRefreshLayout2.settings = pullToRefreshSettings;
        pullToRefreshLayout2.prepare();
        InAppWebView inAppWebView = (InAppWebView) findViewById(R.id.webView);
        this.webView = inAppWebView;
        inAppWebView.id = this.id;
        if (this.windowId.intValue() != -1) {
            this.webView.windowId = this.windowId;
        }
        InAppWebView inAppWebView2 = this.webView;
        inAppWebView2.inAppBrowserDelegate = this;
        InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin2 = this.manager.plugin;
        inAppWebView2.plugin = inAppWebViewFlutterPlugin2;
        FindInteractionController findInteractionController = new FindInteractionController(inAppWebView2, inAppWebViewFlutterPlugin2, this.id, null);
        this.webView.findInteractionController = findInteractionController;
        findInteractionController.prepare();
        s sVar2 = new s(this.manager.plugin.messenger, METHOD_CHANNEL_NAME_PREFIX + this.id);
        this.channelDelegate = new InAppBrowserChannelDelegate(sVar2);
        InAppWebView inAppWebView3 = this.webView;
        inAppWebView3.channelDelegate = new WebViewChannelDelegate(inAppWebView3, sVar2);
        this.fromActivity = extras.getString("fromActivity");
        Map<String, Object> map3 = (Map) extras.getSerializable("contextMenu");
        List list = (List) extras.getSerializable("initialUserScripts");
        Iterator it = ((List) extras.getSerializable("menuItems")).iterator();
        while (it.hasNext()) {
            this.menuItems.add(InAppBrowserMenuItem.fromMap((Map) it.next()));
        }
        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse2(map);
        InAppWebView inAppWebView4 = this.webView;
        inAppWebView4.customSettings = inAppWebViewSettings;
        inAppWebView4.contextMenu = map3;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(UserScript.fromMap((Map) it2.next()));
            }
        }
        this.webView.userContentController.addUserOnlyScripts(arrayList);
        this.actionBar = getSupportActionBar();
        prepareView();
        if (this.windowId.intValue() != -1) {
            InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin3 = this.webView.plugin;
            if (inAppWebViewFlutterPlugin3 != null && (inAppWebViewManager = inAppWebViewFlutterPlugin3.inAppWebViewManager) != null && (message = inAppWebViewManager.windowWebViewMessages.get(this.windowId)) != null) {
                ((WebView.WebViewTransport) message.obj).setWebView(this.webView);
                message.sendToTarget();
            }
        } else {
            String string = extras.getString("initialFile");
            Map map4 = (Map) extras.getSerializable("initialUrlRequest");
            String string2 = extras.getString("initialData");
            if (string != null) {
                try {
                    this.webView.loadFile(string);
                } catch (IOException e7) {
                    Log.e(LOG_TAG, string.concat(" asset file cannot be found!"), e7);
                    return;
                }
            } else if (string2 != null) {
                this.webView.loadDataWithBaseURL(extras.getString("initialBaseUrl"), string2, extras.getString("initialMimeType"), extras.getString("initialEncoding"), extras.getString("initialHistoryUrl"));
            } else if (map4 != null && (fromMap = URLRequest.fromMap(map4)) != null) {
                this.webView.loadUrl(fromMap);
            }
        }
        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = this.channelDelegate;
        if (inAppBrowserChannelDelegate != null) {
            inAppBrowserChannelDelegate.onBrowserCreated();
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        String str;
        this.menu = menu;
        if (this.actionBar != null && ((str = this.customSettings.toolbarTopFixedTitle) == null || str.isEmpty())) {
            AbstractC1223a abstractC1223a = this.actionBar;
            InAppWebView inAppWebView = this.webView;
            abstractC1223a.r(inAppWebView != null ? inAppWebView.getTitle() : "");
        }
        Menu menu2 = this.menu;
        if (menu2 == null) {
            return super.onCreateOptionsMenu(menu);
        }
        if (menu2 instanceof k) {
            ((k) menu2).f15131J = true;
        }
        try {
            getMenuInflater().inflate(R.menu.menu_main, this.menu);
            MenuItem findItem = this.menu.findItem(R.id.menu_search);
            if (findItem != null) {
                if (this.customSettings.hideUrlBar.booleanValue()) {
                    findItem.setVisible(false);
                }
                SearchView searchView = (SearchView) findItem.getActionView();
                this.searchView = searchView;
                if (searchView != null) {
                    searchView.setFocusable(true);
                    SearchView searchView2 = this.searchView;
                    InAppWebView inAppWebView2 = this.webView;
                    searchView2.setQuery(inAppWebView2 != null ? inAppWebView2.getUrl() : "", false);
                    this.searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.1
                        @Override // android.widget.SearchView.OnQueryTextListener
                        public boolean onQueryTextChange(String str2) {
                            return false;
                        }

                        @Override // android.widget.SearchView.OnQueryTextListener
                        public boolean onQueryTextSubmit(String str2) {
                            if (str2.isEmpty()) {
                                return false;
                            }
                            InAppWebView inAppWebView3 = InAppBrowserActivity.this.webView;
                            if (inAppWebView3 != null) {
                                inAppWebView3.loadUrl(str2);
                            }
                            SearchView searchView3 = InAppBrowserActivity.this.searchView;
                            if (searchView3 != null) {
                                searchView3.setQuery("", false);
                                InAppBrowserActivity.this.searchView.setIconified(true);
                            }
                            return true;
                        }
                    });
                    this.searchView.setOnCloseListener(new SearchView.OnCloseListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.2
                        @Override // android.widget.SearchView.OnCloseListener
                        public boolean onClose() {
                            SearchView searchView3 = InAppBrowserActivity.this.searchView;
                            if (searchView3 != null && searchView3.getQuery().toString().isEmpty()) {
                                InAppBrowserActivity inAppBrowserActivity = InAppBrowserActivity.this;
                                SearchView searchView4 = inAppBrowserActivity.searchView;
                                InAppWebView inAppWebView3 = inAppBrowserActivity.webView;
                                searchView4.setQuery(inAppWebView3 != null ? inAppWebView3.getUrl() : "", false);
                            }
                            return false;
                        }
                    });
                    this.searchView.setOnQueryTextFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.3
                        @Override // android.view.View.OnFocusChangeListener
                        public void onFocusChange(View view, boolean z4) {
                            SearchView searchView3;
                            if (z4 || (searchView3 = InAppBrowserActivity.this.searchView) == null) {
                                return;
                            }
                            searchView3.setQuery("", false);
                            InAppBrowserActivity.this.searchView.setIconified(true);
                        }
                    });
                }
            }
            if (this.customSettings.hideDefaultMenuItems.booleanValue()) {
                MenuItem findItem2 = this.menu.findItem(R.id.action_close);
                if (findItem2 != null) {
                    findItem2.setVisible(false);
                }
                MenuItem findItem3 = this.menu.findItem(R.id.action_go_back);
                if (findItem3 != null) {
                    findItem3.setVisible(false);
                }
                MenuItem findItem4 = this.menu.findItem(R.id.action_reload);
                if (findItem4 != null) {
                    findItem4.setVisible(false);
                }
                MenuItem findItem5 = this.menu.findItem(R.id.action_go_forward);
                if (findItem5 != null) {
                    findItem5.setVisible(false);
                }
                MenuItem findItem6 = this.menu.findItem(R.id.action_share);
                if (findItem6 != null) {
                    findItem6.setVisible(false);
                }
            }
            for (final InAppBrowserMenuItem inAppBrowserMenuItem : this.menuItems) {
                MenuItem add = this.menu.add(0, inAppBrowserMenuItem.getId(), inAppBrowserMenuItem.getOrder() != null ? inAppBrowserMenuItem.getOrder().intValue() : 0, inAppBrowserMenuItem.getTitle());
                if (inAppBrowserMenuItem.isShowAsAction()) {
                    add.setShowAsAction(2);
                }
                Object icon = inAppBrowserMenuItem.getIcon();
                if (icon != null) {
                    if (icon instanceof AndroidResource) {
                        add.setIcon(((AndroidResource) icon).getIdentifier(this));
                    } else {
                        add.setIcon(Util.drawableFromBytes(this, (byte[]) icon));
                    }
                    String iconColor = inAppBrowserMenuItem.getIconColor();
                    if (iconColor != null && !iconColor.isEmpty()) {
                        add.getIcon().setTint(Color.parseColor(iconColor));
                    }
                }
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.pichillilorenzo.flutter_inappwebview_android.in_app_browser.InAppBrowserActivity.4
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        InAppBrowserChannelDelegate inAppBrowserChannelDelegate = InAppBrowserActivity.this.channelDelegate;
                        if (inAppBrowserChannelDelegate == null) {
                            return true;
                        }
                        inAppBrowserChannelDelegate.onMenuItemClicked(inAppBrowserMenuItem);
                        return true;
                    }
                });
            }
            return true;
        } catch (Exception e7) {
            e7.printStackTrace();
            Log.e(LOG_TAG, "Cannot inflate com.pichillilorenzo.flutter_inappwebview_android.R.menu.menu_main.To make it work, you need to set minifyEnabled false and shrinkResources false in your build.gradle file.");
            return super.onCreateOptionsMenu(menu);
        }
    }

    @Override // i.AbstractActivityC1231i, androidx.fragment.app.A, android.app.Activity
    public void onDestroy() {
        dispose();
        super.onDestroy();
    }

    @Override // i.AbstractActivityC1231i, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i7, KeyEvent keyEvent) {
        if (i7 == 4) {
            if (this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
                close(null);
                return true;
            }
            if (this.customSettings.allowGoBackWithBackButton.booleanValue()) {
                if (canGoBack()) {
                    goBack();
                } else if (this.customSettings.closeOnCannotGoBack.booleanValue()) {
                    close(null);
                }
                return true;
            }
            if (!this.customSettings.shouldCloseOnBackButtonPressed.booleanValue()) {
                return true;
            }
        }
        return super.onKeyDown(i7, keyEvent);
    }

    public void reload() {
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.reload();
        }
    }

    public void reloadButtonClicked(MenuItem menuItem) {
        reload();
    }

    public void setSettings(InAppBrowserSettings inAppBrowserSettings, HashMap<String, Object> hashMap) {
        MenuItem findItem;
        String str;
        String str2;
        InAppWebViewSettings inAppWebViewSettings = new InAppWebViewSettings();
        inAppWebViewSettings.parse2((Map<String, Object>) hashMap);
        InAppWebView inAppWebView = this.webView;
        if (inAppWebView != null) {
            inAppWebView.setSettings(inAppWebViewSettings, hashMap);
        }
        if (hashMap.get("hidden") != null) {
            Boolean bool = this.customSettings.hidden;
            Boolean bool2 = inAppBrowserSettings.hidden;
            if (bool != bool2) {
                if (bool2.booleanValue()) {
                    hide();
                } else {
                    show();
                }
            }
        }
        if (hashMap.get("hideProgressBar") != null) {
            Boolean bool3 = this.customSettings.hideProgressBar;
            Boolean bool4 = inAppBrowserSettings.hideProgressBar;
            if (bool3 != bool4 && this.progressBar != null) {
                if (bool4.booleanValue()) {
                    this.progressBar.setMax(0);
                } else {
                    this.progressBar.setMax(100);
                }
            }
        }
        if (this.actionBar != null && hashMap.get("hideTitleBar") != null) {
            if (this.customSettings.hideTitleBar != inAppBrowserSettings.hideTitleBar) {
                this.actionBar.p(!r1.booleanValue());
            }
        }
        if (this.actionBar != null && hashMap.get("hideToolbarTop") != null) {
            Boolean bool5 = this.customSettings.hideToolbarTop;
            Boolean bool6 = inAppBrowserSettings.hideToolbarTop;
            if (bool5 != bool6) {
                if (bool6.booleanValue()) {
                    this.actionBar.f();
                } else {
                    this.actionBar.t();
                }
            }
        }
        if (this.actionBar != null && hashMap.get("toolbarTopBackgroundColor") != null && !Util.objEquals(this.customSettings.toolbarTopBackgroundColor, inAppBrowserSettings.toolbarTopBackgroundColor) && (str2 = inAppBrowserSettings.toolbarTopBackgroundColor) != null && !str2.isEmpty()) {
            this.actionBar.n(new ColorDrawable(Color.parseColor(inAppBrowserSettings.toolbarTopBackgroundColor)));
        }
        if (this.actionBar != null && hashMap.get("toolbarTopFixedTitle") != null && !Util.objEquals(this.customSettings.toolbarTopFixedTitle, inAppBrowserSettings.toolbarTopFixedTitle) && (str = inAppBrowserSettings.toolbarTopFixedTitle) != null && !str.isEmpty()) {
            this.actionBar.r(inAppBrowserSettings.toolbarTopFixedTitle);
        }
        if (this.menu != null && hashMap.get("hideUrlBar") != null && this.customSettings.hideUrlBar != inAppBrowserSettings.hideUrlBar && (findItem = this.menu.findItem(R.id.menu_search)) != null) {
            findItem.setVisible(!inAppBrowserSettings.hideUrlBar.booleanValue());
        }
        if (this.menu != null && hashMap.get("hideDefaultMenuItems") != null && this.customSettings.hideDefaultMenuItems != inAppBrowserSettings.hideDefaultMenuItems) {
            MenuItem findItem2 = this.menu.findItem(R.id.action_close);
            if (findItem2 != null) {
                findItem2.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem3 = this.menu.findItem(R.id.action_go_back);
            if (findItem3 != null) {
                findItem3.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem4 = this.menu.findItem(R.id.action_reload);
            if (findItem4 != null) {
                findItem4.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem5 = this.menu.findItem(R.id.action_go_forward);
            if (findItem5 != null) {
                findItem5.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
            MenuItem findItem6 = this.menu.findItem(R.id.action_share);
            if (findItem6 != null) {
                findItem6.setVisible(!inAppBrowserSettings.hideDefaultMenuItems.booleanValue());
            }
        }
        this.customSettings = inAppBrowserSettings;
    }

    public void shareButtonClicked(MenuItem menuItem) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        InAppWebView inAppWebView = this.webView;
        intent.putExtra("android.intent.extra.TEXT", inAppWebView != null ? inAppWebView.getUrl() : "");
        startActivity(Intent.createChooser(intent, "Share"));
    }

    public void show() {
        this.isHidden = false;
        Intent intent = new Intent(this, (Class<?>) InAppBrowserActivity.class);
        intent.setFlags(131072);
        startActivityIfNeeded(intent, 0);
    }
}
