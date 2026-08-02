package com.facetec.sdk;

/* loaded from: classes8.dex */
abstract class ai {

    /* renamed from: a, reason: collision with root package name */
    static boolean f3384a = false;
    protected static com.facetec.sdk.ao b = null;
    static java.lang.String c = "";
    static boolean d = false;
    static com.facetec.sdk.ao e = null;
    static float f = -1.0f;
    static float g = -1.0f;
    static int j = 0;
    static com.facetec.sdk.ao l = null;
    private static com.facetec.sdk.ao m = null;
    private static java.lang.ref.WeakReference<com.facetec.sdk.ai> n = null;
    private static /* synthetic */ boolean r = true;
    private static com.facetec.sdk.ai.b t = com.facetec.sdk.ai.b.NONE;
    private static boolean p = false;
    static boolean k = true;
    private static int q = 0;
    protected boolean i = false;
    protected boolean h = true;

    /* renamed from: o, reason: collision with root package name */
    protected boolean f3385o = false;

    enum b {
        NONE,
        CONTEXT_SWITCH_BEFORE_CAMERA_INIT,
        CONTEXT_SWITCH_AFTER_CAMERA_INIT
    }

    abstract void a();

    abstract void a(boolean z);

    abstract android.view.View b();

    abstract void c();

    abstract void c(android.hardware.Camera.PictureCallback pictureCallback);

    abstract void c(boolean z);

    void d() {
    }

    abstract void d(android.view.ViewGroup viewGroup);

    abstract void d(boolean z);

    abstract void d(boolean z, android.view.ViewGroup viewGroup);

    abstract void e();

    ai() {
    }

    static com.facetec.sdk.ai b(android.view.ViewGroup viewGroup, android.app.Activity activity, boolean z, boolean z2) throws com.facetec.sdk.ak {
        com.facetec.sdk.ai b2;
        d = z2;
        f3384a = z;
        c(activity);
        if (!z) {
            com.facetec.sdk.ba.c(activity);
        }
        if (!com.facetec.sdk.bd.h) {
            c((android.content.Context) activity);
            if (!r && b == null) {
                throw new java.lang.AssertionError();
            }
        } else {
            b(activity);
            if (!r && m == null) {
                throw new java.lang.AssertionError();
            }
        }
        if (o().booleanValue()) {
            b2 = new com.facetec.sdk.ah();
        } else if (d) {
            b2 = com.facetec.sdk.aj.b(activity);
        } else if (a(activity).booleanValue()) {
            com.facetec.sdk.af afVar = new com.facetec.sdk.af(activity);
            com.facetec.sdk.k.f3633a = 2;
            b2 = afVar;
        } else {
            b2 = com.facetec.sdk.aj.b(activity);
            com.facetec.sdk.k.f3633a = 1;
        }
        android.view.View b3 = b2.b();
        viewGroup.addView(b3);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        b3.setLayoutParams(layoutParams);
        n = new java.lang.ref.WeakReference<>(b2);
        return b2;
    }

    private static java.lang.Boolean o() {
        try {
            return java.lang.Boolean.FALSE;
        } catch (java.lang.Throwable unused) {
            return java.lang.Boolean.FALSE;
        }
    }

    public static final class c {
        private static final byte[] $$a = null;
        private static final int $$b = 0;

        /* renamed from: a, reason: collision with root package name */
        private static int f3388a;
        private static int b;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:4:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private static void c(int i, int i2, int i3, java.lang.Object[] objArr) {
            int i4;
            int i5 = 101 - (i * 2);
            byte[] bArr = $$a;
            int i6 = (i2 * 17) + 1;
            int i7 = 20 - (i3 * 17);
            byte[] bArr2 = new byte[i6];
            if (bArr == null) {
                int i8 = i5;
                i5 = i6;
                i4 = 0;
                i5 = i5 + (-i8) + 3;
                i7++;
                bArr2[i4] = (byte) i5;
                i4++;
                if (i4 == i6) {
                    objArr[0] = new java.lang.String(bArr2, 0);
                    return;
                }
                i8 = bArr[i7];
                i5 = i5 + (-i8) + 3;
                i7++;
                bArr2[i4] = (byte) i5;
                i4++;
                if (i4 == i6) {
                }
            } else {
                i4 = 0;
                i7++;
                bArr2[i4] = (byte) i5;
                i4++;
                if (i4 == i6) {
                }
            }
        }

        static void init$0() {
            $$a = new byte[]{105, -114, -20, 124, -9, 5, 66, -53, 8, 1, 1, -12, 18, 5, 56, -66, 18, -4, 64, com.visa.cbp.getEncExpo.kernelVersion, -20};
            $$b = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE;
        }

        c() {
        }

        /* renamed from: com.facetec.sdk.ai$c$c, reason: collision with other inner class name */
        static final class C0061c {

            /* renamed from: a, reason: collision with root package name */
            static final java.lang.String[] f3389a = {"SM-J", "SM-G570", "SM-G611", "SM-G615", "SM-G532", "SM-G610", "SM-S767VL", "SM-A23", "SM-S236DL", "SM-C710", "SM-A105", "SM-A115", "SM-A205", "SM-A207", "SM-A236", "SM-A260", "SM-A305", "SM-A325", "SM-A730", "LM-G900", "220333QAG", "PRA-LA1", "23026RN54G", "23028RN4DG", "220733SG", "220733SI", "220733SL", "220743FI", "220733SH", "23028RNCAG", "RMX3710", "RT112", "moto g"};
            static final java.lang.String[] e = {"Infinix X6515", "Nokia C2 Tennen"};
            static final java.lang.String[] c = {"LM-X210", "LM-X410", "LG-K200", "Moto E (4)", "moto e5 play", "23026RN54G"};
            static final java.lang.String[] b = {"Surface Duo 2", "2203129G"};
            static final java.lang.String[] d = {"ZTE B2017G"};
            static final java.lang.String[] j = {"22111317PG", "LG-M250"};
            static final java.lang.String[] h = {"RT112"};

            C0061c() {
            }
        }

        public static void a(long j, long j2) {
            int i = b;
            f3388a = ((((i | 88) << 1) - (i ^ 88)) - 1) % 128;
            java.lang.Object obj = null;
            java.lang.Object obj2 = com.facetec.sdk.by.e.class.getField("a").get(null);
            int i2 = f3388a;
            b = (((i2 | 53) << 1) - (i2 ^ 53)) % 128;
            try {
                byte[] bArr = $$a;
                byte b2 = bArr[9];
                byte b3 = b2;
                java.lang.Object[] objArr = new java.lang.Object[1];
                c(b2, b3, b3, objArr);
                java.lang.Class<?> cls = java.lang.Class.forName((java.lang.String) objArr[0]);
                byte b4 = (byte) (bArr[9] - 1);
                byte b5 = b4;
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                c(b4, b5, b5, objArr2);
                java.lang.reflect.Method method = cls.getMethod((java.lang.String) objArr2[0], android.content.Context.class, com.facetec.sdk.by.e.class);
                method.setAccessible(true);
                method.invoke(null, null, obj2);
                int i3 = b;
                int i4 = (i3 | 15) << 1;
                int i5 = -((i3 & (-16)) | ((~i3) & 15));
                int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
                f3388a = i6 % 128;
                if (i6 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        static {
            init$0();
            f3388a = 0;
            b = 1;
        }
    }

    static java.lang.Boolean a(android.content.Context context) throws com.facetec.sdk.ak {
        if (com.facetec.sdk.ay.d(com.facetec.sdk.ai.c.C0061c.f3389a)) {
            return java.lang.Boolean.FALSE;
        }
        if (!com.facetec.sdk.bd.h) {
            return java.lang.Boolean.valueOf(com.facetec.sdk.af.e(context));
        }
        return java.lang.Boolean.valueOf(com.facetec.sdk.af.d(context));
    }

    static float j() throws com.facetec.sdk.ak {
        if (b != null) {
            return r0.b / b.c;
        }
        return 1.7777778f;
    }

    static void c(android.content.Context context) {
        synchronized (com.facetec.sdk.ai.class) {
            if (b == null) {
                com.facetec.sdk.t.c(context, com.facetec.sdk.c.CALCULATE_FRONT_CAMERA_SIZE_START, (java.lang.String) null, (java.lang.Throwable) null);
                try {
                    if (a(context).booleanValue()) {
                        b = com.facetec.sdk.af.h(context);
                    } else if (com.facetec.sdk.bj.d(context) == com.facetec.sdk.FaceTecSDK.CameraPermissionStatus.GRANTED) {
                        b = com.facetec.sdk.aj.e(context);
                    }
                } catch (java.lang.Exception e2) {
                    com.facetec.sdk.t.c(context, com.facetec.sdk.c.CALCULATE_FRONT_CAMERA_SIZE_EXCEPTION, (java.lang.String) null, e2);
                }
                if (b != null) {
                    com.facetec.sdk.c cVar = com.facetec.sdk.c.SELECTED_FRONT_CAMERA_SIZE;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(b.b);
                    sb.append("x");
                    sb.append(b.c);
                    com.facetec.sdk.t.c(context, cVar, sb.toString(), (java.lang.Throwable) null);
                }
            }
        }
    }

    static void b(android.content.Context context) {
        synchronized (com.facetec.sdk.ai.class) {
            if (m == null) {
                try {
                    m = a(context).booleanValue() ? com.facetec.sdk.af.i(context) : com.facetec.sdk.aj.m();
                } catch (java.lang.Exception e2) {
                    com.facetec.sdk.t.c(context, com.facetec.sdk.c.CAMERA_ERROR, e2.toString(), e2);
                }
            }
        }
    }

    static com.facetec.sdk.ao h() {
        com.facetec.sdk.ao aoVar;
        synchronized (com.facetec.sdk.ai.class) {
            aoVar = b;
        }
        return aoVar;
    }

    static com.facetec.sdk.ao f() {
        com.facetec.sdk.ao aoVar;
        synchronized (com.facetec.sdk.ai.class) {
            aoVar = m;
        }
        return aoVar;
    }

    final void d(final java.lang.Runnable runnable) {
        final java.util.Timer timer = new java.util.Timer();
        final android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        final java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: com.facetec.sdk.ai.5
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                if (com.facetec.sdk.ai.this.i) {
                    synchronized (timer) {
                        cancel();
                        handler.removeCallbacksAndMessages(null);
                        handler.post(runnable);
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(timerTask, 0L, 100L);
        handler.postDelayed(new java.lang.Runnable() { // from class: com.facetec.sdk.ai$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.facetec.sdk.ai.a(timer, timerTask, runnable);
            }
        }, 8000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(java.util.Timer timer, java.util.TimerTask timerTask, java.lang.Runnable runnable) {
        synchronized (timer) {
            timerTask.cancel();
            runnable.run();
        }
    }

    static void e(boolean z) {
        if (k == z) {
            return;
        }
        k = z;
        if (z) {
            java.lang.ref.WeakReference<com.facetec.sdk.ai> weakReference = n;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            n.get().a();
            return;
        }
        q++;
        if (p) {
            t = com.facetec.sdk.ai.b.CONTEXT_SWITCH_AFTER_CAMERA_INIT;
        } else {
            t = com.facetec.sdk.ai.b.CONTEXT_SWITCH_BEFORE_CAMERA_INIT;
        }
    }

    static void i() {
        p = true;
    }

    static void c(android.app.Activity activity) {
        t = com.facetec.sdk.ai.b.NONE;
        p = false;
        k = activity.hasWindowFocus();
        q = 0;
    }

    static java.lang.String g() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CR: ");
        sb.append(p);
        sb.append(" | CSB: ");
        sb.append(t);
        sb.append(" | CSF: ");
        sb.append(k);
        sb.append(" | CSC: ");
        sb.append(q);
        return sb.toString();
    }
}
