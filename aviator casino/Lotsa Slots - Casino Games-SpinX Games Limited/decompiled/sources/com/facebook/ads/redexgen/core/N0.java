package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class N0 {
    public static byte[] A09;
    public static java.lang.String[] A0A = {"jjDsG8QlYrxY", "", "TMhFK0S9G1", "6qW7u5SP6R0wlmhQUiBuXDFp8yf", "n7Dasyj9dq5sG0xOL43e0c5rVQV9l70l", "dOqhBdKnx9bW", "a7CXWDqETze4gqUmjqRBhcRjVGu0d2y8", "nE3PHSl6bqsIePbBJ"};
    public static final java.lang.String A0B;
    public android.app.Application A02;
    public com.facebook.ads.redexgen.core.InterfaceC0887Ms A04;
    public com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener A05;
    public final com.facebook.ads.redexgen.core.VA A08;
    public long A01 = 0;
    public long A00 = 0;
    public java.lang.String A06 = null;
    public com.facebook.ads.redexgen.core.EnumC0885Mq A03 = null;
    public boolean A07 = false;

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A09 = new byte[]{104, 83, 92, 95, 81, 88, com.google.common.base.Ascii.GS, 73, 82, com.google.common.base.Ascii.GS, 113, 82, 90, com.google.common.base.Ascii.GS, 104, 78, 88, 79, com.google.common.base.Ascii.GS, 111, 88, 73, 72, 79, 83, com.google.common.base.Ascii.GS, 74, 85, 88, 83, com.google.common.base.Ascii.GS, 73, 82, 86, 88, 83, com.google.common.base.Ascii.GS, 84, 78, com.google.common.base.Ascii.GS, 83, 72, 81, 81, 19, 2, 1, 3, com.google.common.base.Ascii.VT, 63, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.CR, 5, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.US, 8, com.google.common.base.Ascii.ESC, 33, 10, com.google.common.base.Ascii.ETB, 19, com.google.common.base.Ascii.ESC, 60, 38, 39, 48, 60, 62, 54, 118, 97, 116, 107, 118, 112, 109, 106, 99};
    }

    static {
        A03();
        A0B = com.facebook.ads.redexgen.core.N0.class.getSimpleName();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener] */
    public N0(com.facebook.ads.redexgen.core.VA va, final android.app.Activity activity, int i) {
        this.A08 = va;
        this.A02 = activity.getApplication();
        this.A05 = new android.app.Application.ActivityLifecycleCallbacks(activity, this) { // from class: com.facebook.ads.internal.action.UserReturnTracker$UserReturnListener
            public com.facebook.ads.redexgen.core.N0 A00;
            public final java.lang.ref.WeakReference<android.app.Activity> A01;

            {
                this.A01 = new java.lang.ref.WeakReference<>(activity);
                this.A00 = this;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityCreated(android.app.Activity activity2, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityDestroyed(android.app.Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityPaused(android.app.Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityResumed(android.app.Activity activity2) {
                if (this.A00 == null) {
                    return;
                }
                android.app.Activity trackedActivity = this.A01.get();
                if (trackedActivity == null || (trackedActivity != null && activity2.equals(trackedActivity))) {
                    this.A00.A05();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivitySaveInstanceState(android.app.Activity activity2, android.os.Bundle bundle) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStarted(android.app.Activity activity2) {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public final void onActivityStopped(android.app.Activity activity2) {
            }
        };
    }

    public static com.facebook.ads.redexgen.core.N0 A00(com.facebook.ads.redexgen.core.VA va, android.app.Activity activity) {
        return A01(va, activity, android.os.Build.VERSION.SDK_INT);
    }

    public static com.facebook.ads.redexgen.core.N0 A01(com.facebook.ads.redexgen.core.VA va, android.app.Activity activity, int i) {
        if (activity != null && i >= 14) {
            return new com.facebook.ads.redexgen.core.N0(va, activity, i);
        }
        return null;
    }

    private void A04(java.lang.String str, long j, long j2, com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(A02(54, 10, 111), java.lang.Long.toString(j));
        hashMap.put(A02(45, 9, 113), java.lang.Long.toString(j2));
        if (enumC0885Mq != null) {
            hashMap.put(A02(64, 7, 66), enumC0885Mq.name());
        }
        this.A08.AC9(str, hashMap);
    }

    public final void A05() {
        this.A00 = java.lang.System.currentTimeMillis();
        if (this.A00 - this.A01 < 2000 && this.A04 != null) {
            com.facebook.ads.redexgen.core.InterfaceC0887Ms interfaceC0887Ms = this.A04;
            if (A0A[2].length() != 10) {
                throw new java.lang.RuntimeException();
            }
            A0A[1] = "";
            interfaceC0887Ms.AFa();
        }
        if (this.A06 != null) {
            A04(this.A06, this.A01, this.A00, this.A03);
        } else {
            android.app.Application application = this.A02;
            java.lang.String A02 = A02(0, 45, 44);
            if (application != null && (this.A02.getBaseContext() instanceof com.facebook.ads.redexgen.core.C1636gi)) {
                ((com.facebook.ads.redexgen.core.C1636gi) this.A02.getBaseContext()).A08().ABC(A02(71, 9, 21), com.facebook.ads.redexgen.core.AbstractC1048Td.A22, new com.facebook.ads.redexgen.core.C1049Te(A02));
            }
            android.util.Log.w(A0B, A02);
        }
        if (this.A02 != null && this.A05 != null) {
            this.A02.unregisterActivityLifecycleCallbacks(this.A05);
            this.A07 = false;
        }
    }

    public final void A06(com.facebook.ads.redexgen.core.EnumC0885Mq enumC0885Mq) {
        this.A03 = enumC0885Mq;
    }

    public final void A07(com.facebook.ads.redexgen.core.InterfaceC0887Ms interfaceC0887Ms) {
        this.A04 = interfaceC0887Ms;
    }

    public final void A08(java.lang.String str) {
        this.A06 = str;
        this.A01 = java.lang.System.currentTimeMillis();
        if (this.A05 == null || this.A02 == null || this.A07) {
            A04(str, -1L, -1L, com.facebook.ads.redexgen.core.EnumC0885Mq.A05);
        } else {
            this.A07 = true;
            this.A02.registerActivityLifecycleCallbacks(this.A05);
        }
    }
}
