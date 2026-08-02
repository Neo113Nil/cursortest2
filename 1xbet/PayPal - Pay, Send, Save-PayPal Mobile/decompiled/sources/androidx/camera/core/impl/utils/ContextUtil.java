package androidx.camera.core.impl.utils;

/* loaded from: classes6.dex */
public final class ContextUtil {
    private static final java.lang.Object getHighSpeedVideoFpsRanges = new java.lang.Object();
    private static final java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> getHighSpeedVideoSizes = new java.util.HashMap();

    public static int getDefaultDeviceId() {
        return 0;
    }

    public static android.content.Context getPersistentApplicationContext(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        android.content.Context context2 = null;
        java.lang.String format = java.lang.String.format("%d-%d-%s", java.lang.Integer.valueOf(context.getApplicationContext().hashCode()), java.lang.Integer.valueOf(getDeviceId(context)), android.os.Build.VERSION.SDK_INT >= 30 ? androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getHighSpeedVideoSizes(context) : null);
        synchronized (getHighSpeedVideoFpsRanges) {
            java.util.Map<java.lang.String, java.lang.ref.WeakReference<android.content.Context>> map = getHighSpeedVideoSizes;
            java.lang.ref.WeakReference<android.content.Context> weakReference = map.get(format);
            if (weakReference != null) {
                android.content.Context context3 = weakReference.get();
                if (context3 != null) {
                    context2 = context3;
                } else {
                    map.remove(format);
                }
            }
            if (context2 != null) {
                return context2;
            }
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                applicationContext = androidx.camera.core.impl.utils.ContextUtil.Api34Impl.getHighSpeedVideoSizes(applicationContext, androidx.camera.core.impl.utils.ContextUtil.Api34Impl.getHighSpeedVideoFpsRangesFor(context));
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                java.lang.String highSpeedVideoSizes = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getHighSpeedVideoSizes(context);
                if (!java.util.Objects.equals(highSpeedVideoSizes, androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getHighSpeedVideoSizes(applicationContext))) {
                    applicationContext = androidx.camera.core.impl.utils.ContextUtil.Api30Impl.getHighSpeedVideoSizes(applicationContext, highSpeedVideoSizes);
                }
            }
            map.put(format, new java.lang.ref.WeakReference<>(applicationContext));
            return applicationContext;
        }
    }

    public static android.app.Application getApplication(android.content.Context context) {
        for (android.content.Context applicationContext = context.getApplicationContext(); applicationContext instanceof android.content.ContextWrapper; applicationContext = ((android.content.ContextWrapper) applicationContext).getBaseContext()) {
            if (applicationContext instanceof android.app.Application) {
                return (android.app.Application) applicationContext;
            }
        }
        return null;
    }

    public static int getDeviceId(android.content.Context context) {
        return android.os.Build.VERSION.SDK_INT >= 34 ? androidx.camera.core.impl.utils.ContextUtil.Api34Impl.getHighSpeedVideoFpsRangesFor(context) : getDefaultDeviceId();
    }

    private ContextUtil() {
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.content.Context getHighSpeedVideoSizes(android.content.Context context, java.lang.String str) {
            return context.createAttributionContext(str);
        }

        static java.lang.String getHighSpeedVideoSizes(android.content.Context context) {
            return context.getAttributionTag();
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static android.content.Context getHighSpeedVideoSizes(android.content.Context context, int i) {
            return context.createDeviceContext(i);
        }

        static int getHighSpeedVideoFpsRangesFor(android.content.Context context) {
            return context.getDeviceId();
        }
    }
}
