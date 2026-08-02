package com.getcapacitor.plugin;

import android.content.res.Configuration;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.ValueCallback;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.facebook.internal.AnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.WebViewListener;
import com.getcapacitor.annotation.CapacitorPlugin;
import java.util.Locale;

@CapacitorPlugin
/* loaded from: classes.dex */
public class SystemBars extends Plugin {
    static final String BAR_GESTURE_BAR = "NavigationBar";
    static final String BAR_STATUS_BAR = "StatusBar";
    static final String INSETS_HANDLING_CSS = "css";
    static final String INSETS_HANDLING_DISABLE = "disable";
    static final String STYLE_DARK = "DARK";
    static final String STYLE_DEFAULT = "DEFAULT";
    static final String STYLE_LIGHT = "LIGHT";
    static final String viewportMetaJSFunction = "function capacitorSystemBarsCheckMetaViewport() {\n    const meta = document.querySelectorAll(\"meta[name=viewport]\");\n    if (meta.length == 0) {\n        return false;\n    }\n    // get the last found meta viewport tag\n    const metaContent = meta[meta.length - 1].content;\n    return metaContent.includes(\"viewport-fit=cover\");\n}\ncapacitorSystemBarsCheckMetaViewport();\n";
    private boolean insetHandlingEnabled = true;
    private boolean hasViewportCover = false;

    @Override // com.getcapacitor.Plugin
    public void load() {
        getBridge().getWebView().addJavascriptInterface(this, "CapacitorSystemBarsAndroidInterface");
        super.load();
        initSystemBars();
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnStart() {
        super.handleOnStart();
        getBridge().addWebViewListener(new WebViewListener() { // from class: com.getcapacitor.plugin.SystemBars.1
            @Override // com.getcapacitor.WebViewListener
            public void onPageCommitVisible(android.webkit.WebView webView, String str) {
                super.onPageCommitVisible(webView, str);
                SystemBars.this.getBridge().getWebView().requestApplyInsets();
            }
        });
    }

    @Override // com.getcapacitor.Plugin
    protected void handleOnConfigurationChanged(Configuration configuration) {
        super.handleOnConfigurationChanged(configuration);
        setStyle(STYLE_DEFAULT, "");
    }

    private void initSystemBars() {
        final String upperCase = getConfig().getString(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, STYLE_DEFAULT).toUpperCase(Locale.US);
        final boolean z = getConfig().getBoolean("hidden", false);
        if (getConfig().getString("insetsHandling", INSETS_HANDLING_CSS).equals(INSETS_HANDLING_DISABLE)) {
            this.insetHandlingEnabled = false;
        }
        initWindowInsetsListener();
        initSafeAreaInsets();
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$initSystemBars$0(upperCase, z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSystemBars$0(String str, boolean z) {
        setStyle(str, "");
        setHidden(z, "");
    }

    @PluginMethod
    public void setStyle(final PluginCall pluginCall) {
        final String string = pluginCall.getString("bar", "");
        final String string2 = pluginCall.getString(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, STYLE_DEFAULT);
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$setStyle$1(string2, string, pluginCall);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setStyle$1(String str, String str2, PluginCall pluginCall) {
        setStyle(str, str2);
        pluginCall.resolve();
    }

    @PluginMethod
    public void show(final PluginCall pluginCall) {
        final String string = pluginCall.getString("bar", "");
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$show$2(string, pluginCall);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$show$2(String str, PluginCall pluginCall) {
        setHidden(false, str);
        pluginCall.resolve();
    }

    @PluginMethod
    public void hide(final PluginCall pluginCall) {
        final String string = pluginCall.getString("bar", "");
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$hide$3(string, pluginCall);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$hide$3(String str, PluginCall pluginCall) {
        setHidden(true, str);
        pluginCall.resolve();
    }

    @PluginMethod
    public void setAnimation(PluginCall pluginCall) {
        pluginCall.resolve();
    }

    @JavascriptInterface
    public void onDOMReady() {
        getActivity().runOnUiThread(new Runnable() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$onDOMReady$5();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDOMReady$5() {
        this.bridge.getWebView().evaluateJavascript(viewportMetaJSFunction, new ValueCallback() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda7
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                SystemBars.this.lambda$onDOMReady$4((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDOMReady$4(String str) {
        this.hasViewportCover = str.equals(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        getBridge().getWebView().requestApplyInsets();
    }

    private Insets calcSafeAreaInsets(WindowInsetsCompat windowInsetsCompat) {
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
        return Insets.of(insets.left, insets.top, insets.right, insets.bottom);
    }

    private void initSafeAreaInsets() {
        WindowInsetsCompat rootWindowInsets;
        if (Build.VERSION.SDK_INT < 35 || !this.insetHandlingEnabled || (rootWindowInsets = ViewCompat.getRootWindowInsets((View) getBridge().getWebView().getParent())) == null) {
            return;
        }
        Insets calcSafeAreaInsets = calcSafeAreaInsets(rootWindowInsets);
        injectSafeAreaCSS(calcSafeAreaInsets.top, calcSafeAreaInsets.right, calcSafeAreaInsets.bottom, calcSafeAreaInsets.left);
    }

    private void initWindowInsetsListener() {
        if (Build.VERSION.SDK_INT < 35 || !this.insetHandlingEnabled) {
            return;
        }
        ViewCompat.setOnApplyWindowInsetsListener((View) getBridge().getWebView().getParent(), new OnApplyWindowInsetsListener() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda1
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                WindowInsetsCompat lambda$initWindowInsetsListener$6;
                lambda$initWindowInsetsListener$6 = SystemBars.this.lambda$initWindowInsetsListener$6(view, windowInsetsCompat);
                return lambda$initWindowInsetsListener$6;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ WindowInsetsCompat lambda$initWindowInsetsListener$6(View view, WindowInsetsCompat windowInsetsCompat) {
        if (!this.hasViewportCover) {
            return windowInsetsCompat;
        }
        Insets calcSafeAreaInsets = calcSafeAreaInsets(windowInsetsCompat);
        if (windowInsetsCompat.isVisible(WindowInsetsCompat.Type.ime())) {
            calcSafeAreaInsets = Insets.of(calcSafeAreaInsets.left, calcSafeAreaInsets.top, calcSafeAreaInsets.right, 0);
            setViewMargins(view, Insets.of(0, 0, 0, windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom));
        } else {
            setViewMargins(view, Insets.NONE);
        }
        injectSafeAreaCSS(calcSafeAreaInsets.top, calcSafeAreaInsets.right, calcSafeAreaInsets.bottom, calcSafeAreaInsets.left);
        return WindowInsetsCompat.CONSUMED;
    }

    private void setViewMargins(View view, Insets insets) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.leftMargin = insets.left;
        marginLayoutParams.bottomMargin = insets.bottom;
        marginLayoutParams.rightMargin = insets.right;
        marginLayoutParams.topMargin = insets.top;
        view.setLayoutParams(marginLayoutParams);
    }

    private void injectSafeAreaCSS(int i, int i2, int i3, int i4) {
        float f = getActivity().getResources().getDisplayMetrics().density;
        final float f2 = i / f;
        final float f3 = i2 / f;
        final float f4 = i3 / f;
        final float f5 = i4 / f;
        getBridge().executeOnMainThread(new Runnable() { // from class: com.getcapacitor.plugin.SystemBars$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                SystemBars.this.lambda$injectSafeAreaCSS$7(f2, f3, f4, f5);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$injectSafeAreaCSS$7(float f, float f2, float f3, float f4) {
        if (this.bridge == null || this.bridge.getWebView() == null) {
            return;
        }
        this.bridge.getWebView().evaluateJavascript(String.format(Locale.US, "try {\n  document.documentElement.style.setProperty(\"--safe-area-inset-top\", \"%dpx\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-right\", \"%dpx\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-bottom\", \"%dpx\");\n  document.documentElement.style.setProperty(\"--safe-area-inset-left\", \"%dpx\");\n} catch(e) { console.error('Error injecting safe area CSS:', e); }\n", Integer.valueOf((int) f), Integer.valueOf((int) f2), Integer.valueOf((int) f3), Integer.valueOf((int) f4)), null);
    }

    private void setStyle(String str, String str2) {
        if (str.equals(STYLE_DEFAULT)) {
            str = getStyleForTheme();
        }
        Window window = getActivity().getWindow();
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        if (str2.isEmpty() || str2.equals(BAR_STATUS_BAR)) {
            insetsController.setAppearanceLightStatusBars(!str.equals(STYLE_DARK));
        }
        if (str2.isEmpty() || str2.equals(BAR_GESTURE_BAR)) {
            insetsController.setAppearanceLightNavigationBars(!str.equals(STYLE_DARK));
        }
    }

    private void setHidden(boolean z, String str) {
        Window window = getActivity().getWindow();
        WindowInsetsControllerCompat insetsController = WindowCompat.getInsetsController(window, window.getDecorView());
        if (z) {
            if (str.isEmpty() || str.equals(BAR_STATUS_BAR)) {
                insetsController.hide(WindowInsetsCompat.Type.statusBars());
            }
            if (str.isEmpty() || str.equals(BAR_GESTURE_BAR)) {
                insetsController.hide(WindowInsetsCompat.Type.navigationBars());
                return;
            }
            return;
        }
        if (str.isEmpty() || str.equals(BAR_STATUS_BAR)) {
            insetsController.show(WindowInsetsCompat.Type.systemBars());
        }
        if (str.isEmpty() || str.equals(BAR_GESTURE_BAR)) {
            insetsController.show(WindowInsetsCompat.Type.navigationBars());
        }
    }

    private String getStyleForTheme() {
        if ((getActivity().getResources().getConfiguration().uiMode & 48) != 32) {
            return STYLE_LIGHT;
        }
        return STYLE_DARK;
    }
}
