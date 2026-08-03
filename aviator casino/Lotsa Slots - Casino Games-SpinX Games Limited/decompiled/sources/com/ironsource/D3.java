package com.ironsource;

/* loaded from: classes5.dex */
public final class D3 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5665a;

        static {
            int[] iArr = new int[com.ironsource.I3.values().length];
            try {
                iArr[com.ironsource.I3.Pacing.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.I3.ShowCount.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.I3.Delivery.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f5665a = iArr;
        }
    }

    public final int a(com.ironsource.I3 cappingType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        int i = com.ironsource.D3.a.f5665a[cappingType.ordinal()];
        if (i == 1 || i == 2) {
            return 3000;
        }
        if (i == 3) {
            return 3001;
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }
}
