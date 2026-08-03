package com.facebook.ads.internal.util.activity;

/* loaded from: assets/audience_network/classes2.dex */
public final class ActivityUtils implements android.app.Application.ActivityLifecycleCallbacks {
    public static android.content.Context A01;
    public static com.facebook.ads.redexgen.core.C1632ge A02;
    public static byte[] A03;
    public static java.lang.String[] A04 = {"92eOfmmmV4HUmtBKNwX5jODUm9snbisL", "83A6RHTc3uHHgwZu0l", "xT8NDmJO40EcDZzCFYpPknxtJdrIGRIs", "yd9OYuKBF31VEKohInrUKVptjNnIlgtF", "ffDhLNnwXMIpP", "gJJ", "YtTChd0N7kYfN", "CHt0mr4gyt"};
    public static final com.facebook.ads.redexgen.core.X0 A05;
    public static final java.util.List<com.facebook.ads.redexgen.core.InterfaceC1142Ww> A06;
    public static final java.util.List<java.lang.Runnable> A07;
    public static final java.util.Map<android.app.Activity, java.lang.Integer> A08;
    public final java.lang.Class<? extends android.app.Activity> A00;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {com.google.common.base.Ascii.SO, 2, 35, 69, 86, 75, 88, 75, 86, 91, com.google.common.base.Ascii.FS, 2, -90, -102, -20, -33, -32, -76, -102, 6, 40, 57, 46, 59, 46, 57, 62, -27, 41, 46, 56, 40, 55, 42, 53, 38, 51, 40, 46, 42, 56, -13, 56, 103, 103, 58, 102, 101, 107, 92, 111, 107, com.google.common.base.Ascii.ETB, 96, 106, com.google.common.base.Ascii.ETB, 101, 102, 107, com.google.common.base.Ascii.ETB, 56, 103, 103, 99, 96, 90, 88, 107, 96, 102, 101, 37, -3, 41, 40, com.google.common.base.Ascii.GS, 47, 44, 44, com.google.common.base.Ascii.US, 40, 46, -38, 39, 41, com.google.common.base.Ascii.RS, 35, 32, 35, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.ESC, 46, 35, 41, 40, -38, com.google.common.base.Ascii.US, 50, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.US, 42, 46, 35, 41, 40, -38, 46, 34, 44, 41, 49, 40, com.google.common.base.Ascii.RS, 47, 44, 35, 40, 33, -38, 44, com.google.common.base.Ascii.US, 33, 35, 45, 46, com.google.common.base.Ascii.US, 44, -5, com.google.common.base.Ascii.GS, 46, 35, 48, 35, 46, 51, -3, com.google.common.base.Ascii.ESC, 38, 38, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.GS, 37, 45, 6, 35, 45, 46, com.google.common.base.Ascii.US, 40, com.google.common.base.Ascii.US, 44, 45, 74, 66, -2, 63, 65, 82, 71, 84, 71, 82, 87, -2, 81, 82, 63, 82, 67, com.google.common.base.Ascii.CAN, -2, com.google.common.base.Ascii.CAN, 41, kotlin.io.encoding.Base64.padSymbol, 59, 45, 44, -24, 41, 43, 60, 49, 62, 49, 60, 65, -24, 49, 59, -24, 54, 55, 60, -24, 58, 45, 59, kotlin.io.encoding.Base64.padSymbol, 53, 45, 44, -10, 44, 63, 77, com.google.common.base.Ascii.DC4, -6, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, 42, com.google.common.base.Ascii.NAK, 43, 42, com.google.common.base.Ascii.US, 34, -35, -20, -27, 58, 57, com.google.common.base.Ascii.FF, 46, 63, 52, 65, 52, 63, 68, com.google.common.base.Ascii.SO, kotlin.io.encoding.Base64.padSymbol, 48, 44, 63, 48, 47};
        if (A04[0].charAt(5) != 'm') {
            throw new java.lang.RuntimeException();
        }
        A04[7] = "OT1BI2x3SK";
        A03 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static synchronized void A04(com.facebook.ads.redexgen.core.C1632ge c1632ge, java.lang.Class<? extends android.app.Activity> cls) {
        synchronized (com.facebook.ads.internal.util.activity.ActivityUtils.class) {
            A02 = c1632ge;
            A01 = c1632ge.getApplicationContext();
            if (A01 instanceof android.app.Application) {
                com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener aNActivityLifecycleCallbacksListener = com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.getANActivityLifecycleCallbacksListener();
                if (aNActivityLifecycleCallbacksListener != null) {
                    java.util.Map<android.app.Activity, java.lang.Integer> activityStateMap = aNActivityLifecycleCallbacksListener.getActivityStateMap();
                    synchronized (activityStateMap) {
                        try {
                            A08.putAll(activityStateMap);
                        } catch (java.util.ConcurrentModificationException unused) {
                            c1632ge.A08().ABC(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), com.facebook.ads.redexgen.core.AbstractC1048Td.A02, new com.facebook.ads.redexgen.core.C1049Te(A01(72, 80, 65)));
                        }
                    }
                    com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener.unregisterActivityCallbacks(c1632ge);
                }
                ((android.app.Application) A01).registerActivityLifecycleCallbacks(new com.facebook.ads.internal.util.activity.ActivityUtils(cls));
            } else {
                c1632ge.A08().ABC(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 3, 3), com.facebook.ads.redexgen.core.AbstractC1048Td.A0d, new com.facebook.ads.redexgen.core.C1049Te(A01(42, 30, 126)));
            }
        }
    }

    static {
        A02();
        A08 = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());
        A06 = java.util.Collections.synchronizedList(new java.util.ArrayList());
        A07 = new java.util.ArrayList();
        A05 = com.facebook.ads.redexgen.core.X0.A00();
    }

    public ActivityUtils(java.lang.Class<? extends android.app.Activity> adsActivityClass) {
        this.A00 = adsActivityClass;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d A[Catch: all -> 0x00a0, TryCatch #0 {, blocks: (B:5:0x0004, B:6:0x000e, B:8:0x0014, B:11:0x0027, B:14:0x0031, B:19:0x003d, B:20:0x0041, B:24:0x0049), top: B:4:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009c A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009e A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static synchronized android.app.Activity A00() {
        boolean z;
        synchronized (com.facebook.ads.internal.util.activity.ActivityUtils.class) {
            android.app.Activity activity = null;
            java.util.Iterator<java.util.Map.Entry<android.app.Activity, java.lang.Integer>> it = A08.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry<android.app.Activity, java.lang.Integer> next = it.next();
                if (next.getValue().intValue() == 3) {
                    activity = next.getKey();
                    break;
                }
            }
            android.app.Activity activity2 = null;
            if (activity != null && android.os.Build.VERSION.SDK_INT >= 28) {
                z = false;
                if (z) {
                    activity2 = com.facebook.ads.redexgen.core.AbstractC1139Wt.A00();
                }
                if (A02 != null && z && activity != activity2) {
                    com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A01(19, 23, 76), A01(203, 5, 97) + activity + A01(12, 7, 1) + activity2);
                    c1049Te.A05(1);
                    A02.A08().ABC(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), com.facebook.ads.redexgen.core.AbstractC1048Td.A03, c1049Te);
                }
                return activity == null ? activity : activity2;
            }
            z = true;
            if (z) {
            }
            if (A02 != null) {
                com.facebook.ads.redexgen.core.C1049Te c1049Te2 = new com.facebook.ads.redexgen.core.C1049Te(A01(19, 23, 76), A01(203, 5, 97) + activity + A01(12, 7, 1) + activity2);
                c1049Te2.A05(1);
                A02.A08().ABC(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), com.facebook.ads.redexgen.core.AbstractC1048Td.A03, c1049Te2);
            }
            if (activity == null) {
            }
        }
    }

    public static void A03(com.facebook.ads.redexgen.core.C1636gi c1636gi) {
        if (!com.facebook.ads.redexgen.core.C1086Up.A1p(c1636gi) || android.os.Build.VERSION.SDK_INT >= 29) {
            return;
        }
        com.facebook.ads.redexgen.core.RunnableC1141Wv runnableC1141Wv = new com.facebook.ads.redexgen.core.RunnableC1141Wv(c1636gi);
        synchronized (A07) {
            A07.add(runnableC1141Wv);
        }
        com.facebook.ads.redexgen.core.Y4.A01.A01().postDelayed(runnableC1141Wv, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        A08.put(activity, 1);
        java.util.Iterator<com.facebook.ads.redexgen.core.InterfaceC1142Ww> it = A06.iterator();
        boolean hasNext = it.hasNext();
        java.lang.String[] strArr = A04;
        if (strArr[4].length() != strArr[6].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A04;
        strArr2[3] = "6ucg7ZQRC52PgbYLp0IlsO8L9UBIqtAr";
        strArr2[2] = "XfsAw5zLn3vJHYKMay1aCQiNLVOIwPXI";
        if (hasNext) {
            it.next();
            throw new java.lang.NullPointerException(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 17, 82));
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(android.app.Activity activity) {
        A08.put(activity, 6);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) {
        java.util.ArrayList arrayList;
        java.lang.Integer num = A08.get(activity);
        if (num == null || num.intValue() != 3) {
            com.facebook.ads.redexgen.core.C1049Te c1049Te = new com.facebook.ads.redexgen.core.C1049Te(A01(172, 31, 79), A01(com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor.MODULE_VERSION, 20, 101) + num + A01(0, 12, 105) + activity);
            c1049Te.A05(0);
            A02.A08().ABC(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 8, 61), com.facebook.ads.redexgen.core.AbstractC1048Td.A03, c1049Te);
        }
        A08.put(activity, 4);
        if (activity.getClass() != this.A00) {
            synchronized (A07) {
                arrayList = new java.util.ArrayList(A07);
                A07.clear();
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                com.facebook.ads.redexgen.core.Y4.A01.A01().removeCallbacks((java.lang.Runnable) it.next());
            }
        }
        A05.A01();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) {
        A08.put(activity, 3);
        A05.A02();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        A08.put(activity, 2);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        A08.put(activity, 5);
    }
}
