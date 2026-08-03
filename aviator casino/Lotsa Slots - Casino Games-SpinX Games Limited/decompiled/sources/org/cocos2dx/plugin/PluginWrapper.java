package org.cocos2dx.plugin;

/* loaded from: classes6.dex */
public class PluginWrapper {
    private static final java.lang.String TAG = "PluginWrapper";
    protected static android.content.Context sContext;
    protected static android.opengl.GLSurfaceView sGLSurfaceView;
    protected static android.os.Handler sGLThreadHandler;
    protected static android.os.Handler sMainThreadHandler;
    protected static java.util.Set<org.cocos2dx.plugin.PluginListener> sListeners = new java.util.LinkedHashSet();
    private static boolean firstResume = false;
    private static java.lang.String[] arrPlugins = {"PluginUser", "PluginShare", "PluginSocial", "PluginAds", "PluginAnalytics", "PluginIAP", "PluginOneSignal", "PluginGoogleGame"};

    public static void init(android.content.Context context) {
        sContext = context;
        if (sMainThreadHandler == null) {
            sMainThreadHandler = new android.os.Handler();
        }
    }

    public static void setGLSurfaceView(android.opengl.GLSurfaceView gLSurfaceView) {
        sGLSurfaceView = gLSurfaceView;
    }

    protected static void initFromNativeActivity(android.app.Activity activity) {
        sContext = activity;
    }

    public static void onResume() {
        firstResume = true;
        java.util.Iterator<org.cocos2dx.plugin.PluginListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().onResume();
        }
    }

    public static void onPause() {
        java.util.Iterator<org.cocos2dx.plugin.PluginListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().onPause();
        }
    }

    public static void onDestroy() {
        java.util.Iterator<org.cocos2dx.plugin.PluginListener> it = sListeners.iterator();
        while (it.hasNext()) {
            it.next().onDestroy();
        }
    }

    public static boolean onActivityResult(int i, int i2, android.content.Intent intent) {
        boolean z;
        java.util.Iterator<org.cocos2dx.plugin.PluginListener> it = sListeners.iterator();
        while (true) {
            while (it.hasNext()) {
                z = z && it.next().onActivityResult(i, i2, intent);
            }
            return z;
        }
    }

    public static void addListener(final org.cocos2dx.plugin.PluginListener pluginListener) {
        sListeners.add(pluginListener);
        if (firstResume) {
            runOnMainThread(new java.lang.Runnable() { // from class: org.cocos2dx.plugin.PluginWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    org.cocos2dx.plugin.PluginListener.this.onResume();
                }
            });
        }
    }

    public static void removeListener(org.cocos2dx.plugin.PluginListener pluginListener) {
        sListeners.remove(pluginListener);
    }

    protected static java.lang.Object initPlugin(java.lang.String str) {
        android.content.Context context;
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, '.'));
            try {
                context = getContext();
            } catch (java.lang.Exception e) {
                e.printStackTrace();
            }
            if (context != null) {
                return cls.getDeclaredConstructor(android.content.Context.class).newInstance(context);
            }
            android.util.Log.e(TAG, "Plugin " + str + " wasn't initialized.");
            return null;
        } catch (java.lang.ClassNotFoundException e2) {
            android.util.Log.e(TAG, "Class " + str + " not found.");
            e2.printStackTrace();
            return null;
        }
    }

    protected static int getPluginType(java.lang.Object obj) {
        try {
            return ((java.lang.Integer) obj.getClass().getField("PluginType").get(obj)).intValue();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public static android.content.Context getContext() {
        return sContext;
    }

    public static void runOnGLThread(java.lang.Runnable runnable) {
        android.opengl.GLSurfaceView gLSurfaceView = sGLSurfaceView;
        if (gLSurfaceView != null) {
            gLSurfaceView.queueEvent(runnable);
            return;
        }
        android.os.Handler handler = sGLThreadHandler;
        if (handler != null) {
            handler.post(runnable);
        } else {
            android.util.Log.i(TAG, "call back invoked on main thread");
            runnable.run();
        }
    }

    public static void runOnMainThread(java.lang.Runnable runnable) {
        android.os.Handler handler = sMainThreadHandler;
        if (handler != null) {
            handler.post(runnable);
            return;
        }
        android.content.Context context = sContext;
        if (context == null || !(context instanceof android.app.Activity)) {
            return;
        }
        ((android.app.Activity) context).runOnUiThread(runnable);
    }

    public static java.util.Hashtable<java.lang.String, java.lang.String> getPluginConfigure() {
        java.util.Hashtable<java.lang.String, java.lang.String> hashtable = new java.util.Hashtable<>();
        try {
            android.os.Bundle bundle = sContext.getPackageManager().getApplicationInfo(sContext.getPackageName(), 128).metaData;
            int i = 0;
            while (true) {
                java.lang.String[] strArr = arrPlugins;
                if (i >= strArr.length) {
                    break;
                }
                java.lang.String string = bundle.getString(strArr[i]);
                if (string != null && !"".equals(string)) {
                    hashtable.put(arrPlugins[i], string);
                }
                i++;
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return hashtable;
    }
}
