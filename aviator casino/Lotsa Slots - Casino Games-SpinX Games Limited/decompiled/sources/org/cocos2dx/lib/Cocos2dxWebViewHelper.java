package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxWebViewHelper {
    private static final java.lang.String TAG = "Cocos2dxWebViewHelper";
    private static org.cocos2dx.lib.Cocos2dxActivity sCocos2dxActivity;
    private static android.os.Handler sHandler;
    private static android.widget.FrameLayout sLayout;
    private static int viewTag;
    private static android.util.SparseArray<org.cocos2dx.lib.Cocos2dxWebView> webViews;

    private static native void didFailLoading(int i, java.lang.String str);

    private static native void didFinishLoading(int i, java.lang.String str);

    private static native void onJsCallback(int i, java.lang.String str);

    private static native boolean shouldStartLoading(int i, java.lang.String str);

    public Cocos2dxWebViewHelper(android.widget.FrameLayout frameLayout) {
        sLayout = frameLayout;
        sHandler = new android.os.Handler(android.os.Looper.myLooper());
        sCocos2dxActivity = (org.cocos2dx.lib.Cocos2dxActivity) org.cocos2dx.lib.Cocos2dxActivity.getContext();
        webViews = new android.util.SparseArray<>();
    }

    public static boolean _shouldStartLoading(int i, java.lang.String str) {
        return !shouldStartLoading(i, str);
    }

    public static void _didFinishLoading(int i, java.lang.String str) {
        didFinishLoading(i, str);
    }

    public static void _didFailLoading(int i, java.lang.String str) {
        didFailLoading(i, str);
    }

    public static void _onJsCallback(int i, java.lang.String str) {
        onJsCallback(i, str);
    }

    public static int createWebView() {
        final int i = viewTag;
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.1
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = new org.cocos2dx.lib.Cocos2dxWebView(org.cocos2dx.lib.Cocos2dxWebViewHelper.sCocos2dxActivity, i);
                org.cocos2dx.lib.Cocos2dxWebViewHelper.sLayout.addView(cocos2dxWebView, new android.widget.FrameLayout.LayoutParams(-2, -2));
                org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.put(i, cocos2dxWebView);
            }
        });
        int i2 = viewTag;
        viewTag = i2 + 1;
        return i2;
    }

    public static void removeWebView(final int i) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.2
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.remove(i);
                    org.cocos2dx.lib.Cocos2dxWebViewHelper.sLayout.removeView(cocos2dxWebView);
                }
            }
        });
    }

    public static void setVisible(final int i, final boolean z) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.3
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.setVisibility(z ? 0 : 8);
                }
            }
        });
    }

    public static void setWebViewRect(final int i, final int i2, final int i3, final int i4, final int i5) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.4
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.setWebViewRect(i2, i3, i4, i5);
                }
            }
        });
    }

    public static void setJavascriptInterfaceScheme(final int i, final java.lang.String str) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.5
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.setJavascriptInterfaceScheme(str);
                }
            }
        });
    }

    public static void loadData(final int i, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.6
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.loadDataWithBaseURL(str4, str, str2, str3, null);
                }
            }
        });
    }

    public static void loadHTMLString(final int i, final java.lang.String str, final java.lang.String str2) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.7
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.loadDataWithBaseURL(str2, str, null, null, null);
                }
            }
        });
    }

    public static void loadUrl(final int i, final java.lang.String str) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.8
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.loadUrl(str);
                }
            }
        });
    }

    public static void loadFile(final int i, final java.lang.String str) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.9
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.loadUrl(str);
                }
            }
        });
    }

    public static void stopLoading(final int i) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.10
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.stopLoading();
                }
            }
        });
    }

    public static void reload(final int i) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.11
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.reload();
                }
            }
        });
    }

    public static <T> T callInMainThread(java.util.concurrent.Callable<T> callable) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
        java.util.concurrent.FutureTask futureTask = new java.util.concurrent.FutureTask(callable);
        sHandler.post(futureTask);
        return (T) futureTask.get();
    }

    public static boolean canGoBack(final int i) {
        try {
            return ((java.lang.Boolean) callInMainThread(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.12
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public java.lang.Boolean call() throws java.lang.Exception {
                    org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                    return java.lang.Boolean.valueOf(cocos2dxWebView != null && cocos2dxWebView.canGoBack());
                }
            })).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    public static boolean canGoForward(final int i) {
        try {
            return ((java.lang.Boolean) callInMainThread(new java.util.concurrent.Callable<java.lang.Boolean>() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.13
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // java.util.concurrent.Callable
                public java.lang.Boolean call() throws java.lang.Exception {
                    org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                    return java.lang.Boolean.valueOf(cocos2dxWebView != null && cocos2dxWebView.canGoForward());
                }
            })).booleanValue();
        } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException unused) {
            return false;
        }
    }

    public static void goBack(final int i) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.14
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.goBack();
                }
            }
        });
    }

    public static void goForward(final int i) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.15
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.goForward();
                }
            }
        });
    }

    public static void evaluateJS(final int i, final java.lang.String str) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.16
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.loadUrl("javascript:" + str);
                }
            }
        });
    }

    public static void setScalesPageToFit(final int i, final boolean z) {
        sCocos2dxActivity.runOnUiThread(new java.lang.Runnable() { // from class: org.cocos2dx.lib.Cocos2dxWebViewHelper.17
            @Override // java.lang.Runnable
            public void run() {
                org.cocos2dx.lib.Cocos2dxWebView cocos2dxWebView = (org.cocos2dx.lib.Cocos2dxWebView) org.cocos2dx.lib.Cocos2dxWebViewHelper.webViews.get(i);
                if (cocos2dxWebView != null) {
                    cocos2dxWebView.setScalesPageToFit(z);
                }
            }
        });
    }
}
