package com.razorpay;

import android.content.Context;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.core.os.EnvironmentCompat;

/* loaded from: classes4.dex */
class GpuInfoUtil {
    private static boolean I__1l = false;
    private static final String __l1_ = "gpu_vendor";
    private static String _l_1l__ = "unknown";
    private static String _llI = "unknown";
    private static final String l$1_I$l$ = "gpu_renderer";

    public static void extractGpuInfo(WebView webView, final Context context) {
        if (I__1l || webView == null) {
            return;
        }
        try {
            webView.evaluateJavascript("(function() {   try {     var canvas = document.createElement('canvas');     var gl = canvas.getContext('webgl') || canvas.getContext('experimental-webgl');     if (gl) {       var debugInfo = gl.getExtension('WEBGL_debug_renderer_info');       if (debugInfo) {         return gl.getParameter(debugInfo.UNMASKED_RENDERER_WEBGL);       }     }   } catch(e) { }   return 'unknown'; })()", new ValueCallback<String>() { // from class: com.razorpay.GpuInfoUtil.1
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    if (str == null || str.equals("null") || str.equals("\"unknown\"")) {
                        return;
                    }
                    String unused = GpuInfoUtil._llI = str.replace("\"", "");
                    Logger.d("GPU Renderer extracted: " + GpuInfoUtil._llI);
                }
            });
            webView.evaluateJavascript("(function() {   try {     var canvas = document.createElement('canvas');     var gl = canvas.getContext('webgl') || canvas.getContext('experimental-webgl');     if (gl) {       var debugInfo = gl.getExtension('WEBGL_debug_renderer_info');       if (debugInfo) {         return gl.getParameter(debugInfo.UNMASKED_VENDOR_WEBGL);       }     }   } catch(e) { }   return 'unknown'; })()", new ValueCallback<String>() { // from class: com.razorpay.GpuInfoUtil.2
                @Override // android.webkit.ValueCallback
                public void onReceiveValue(String str) {
                    if (str == null || str.equals("null") || str.equals("\"unknown\"")) {
                        return;
                    }
                    String unused = GpuInfoUtil._l_1l__ = str.replace("\"", "");
                    Logger.d("GPU Vendor extracted: " + GpuInfoUtil._l_1l__);
                    boolean unused2 = GpuInfoUtil.I__1l = true;
                    GpuInfoUtil.l$1_I$l$(context);
                    Lumberjack.updateGpuInfo();
                }
            });
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "error:exception", "Error extracting GPU info");
        }
    }

    public static String getGpuRenderer() {
        return _llI;
    }

    public static String getGpuVendor() {
        return _l_1l__;
    }

    public static boolean isGpuInfoAvailable() {
        return I__1l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l$1_I$l$(Context context) {
        try {
            SharedPreferenceUtil.setValue(context, l$1_I$l$, _llI);
            SharedPreferenceUtil.setValue(context, __l1_, _l_1l__);
            Logger.d("GPU info saved to cache");
        } catch (Exception e) {
            Logger.e("Error saving GPU info to cache", e);
        }
    }

    public static void loadFromCache(Context context) {
        try {
            String value = SharedPreferenceUtil.getValue(context, l$1_I$l$);
            String value2 = SharedPreferenceUtil.getValue(context, __l1_);
            if (value == null || value2 == null) {
                return;
            }
            _llI = value;
            _l_1l__ = value2;
            I__1l = true;
            Logger.d("GPU info loaded from cache: " + _llI + " (" + _l_1l__ + ")");
        } catch (Exception e) {
            Logger.e("Error loading GPU info from cache", e);
        }
    }

    public static void reset() {
        _llI = EnvironmentCompat.MEDIA_UNKNOWN;
        _l_1l__ = EnvironmentCompat.MEDIA_UNKNOWN;
        I__1l = false;
    }
}
