package lib.android.paypal.com.magnessdk.network.base;

/* loaded from: classes5.dex */
public final class e extends android.os.Handler {
    private static lib.android.paypal.com.magnessdk.network.base.e Camera2StreamConfigurationMap;
    private java.lang.ref.WeakReference<lib.android.paypal.com.magnessdk.MagnesSDK> getHighSpeedVideoFpsRangesFor;

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        lib.android.paypal.com.magnessdk.c.h.d a2;
        if (this.getHighSpeedVideoFpsRangesFor.get() == null || (a2 = lib.android.paypal.com.magnessdk.c.h.d.a(message.what)) == null) {
            return;
        }
        switch (lib.android.paypal.com.magnessdk.network.base.e.a.Camera2StreamConfigurationMap[a2.ordinal()]) {
            case 1:
                java.lang.StringBuilder sb = new java.lang.StringBuilder("GET request to ");
                sb.append(lib.android.paypal.com.magnessdk.c.h.e.RAMP_CONFIG_URL.toString());
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.e.class, 0, sb.toString());
                break;
            case 2:
                break;
            case 3:
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("GET request to ");
                sb2.append(message.obj);
                sb2.append(" error.");
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.e.class, 3, sb2.toString());
                return;
            case 4:
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("POST request to ");
                sb3.append(message.obj);
                sb3.append(" started.");
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.e.class, 0, sb3.toString());
                return;
            case 5:
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("POST request to ");
                sb4.append(message.obj);
                sb4.append(" successfully.");
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.e.class, 0, sb4.toString());
                return;
            case 6:
                java.lang.StringBuilder sb5 = new java.lang.StringBuilder("POST request to ");
                sb5.append(message.obj);
                sb5.append(" error.");
                lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.e.class, 3, sb5.toString());
                return;
            default:
                return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GET request to ");
        sb6.append(message.obj);
        sb6.append(" succeeded");
        lib.android.paypal.com.magnessdk.log.a.a((java.lang.Class<?>) lib.android.paypal.com.magnessdk.network.base.e.class, 0, sb6.toString());
    }

    static /* synthetic */ class a {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[lib.android.paypal.com.magnessdk.c.h.d.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_STARTED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_SUCCEEDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.d.GET_REQUEST_ERROR.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_STARTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_SUCCEEDED.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[lib.android.paypal.com.magnessdk.c.h.d.POST_REQUEST_ERROR.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public static lib.android.paypal.com.magnessdk.network.base.e a(android.os.Looper looper, lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK) {
        lib.android.paypal.com.magnessdk.network.base.e eVar;
        synchronized (lib.android.paypal.com.magnessdk.network.base.e.class) {
            if (Camera2StreamConfigurationMap == null) {
                Camera2StreamConfigurationMap = new lib.android.paypal.com.magnessdk.network.base.e(looper, magnesSDK);
            }
            eVar = Camera2StreamConfigurationMap;
        }
        return eVar;
    }

    private e(android.os.Looper looper, lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK) {
        super(looper);
        this.getHighSpeedVideoFpsRangesFor = new java.lang.ref.WeakReference<>(magnesSDK);
    }
}
