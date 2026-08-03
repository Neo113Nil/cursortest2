package com.ironsource;

/* renamed from: com.ironsource.q1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3231q1 implements com.ironsource.InterfaceC3248r1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.mediationsdk.IronSource.a f6564a;

    /* renamed from: com.ironsource.q1$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6565a;

        static {
            int[] iArr = new int[com.ironsource.mediationsdk.IronSource.a.values().length];
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.ironsource.mediationsdk.IronSource.a.BANNER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            f6565a = iArr;
        }
    }

    public C3231q1(com.ironsource.mediationsdk.IronSource.a adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f6564a = adFormat;
    }

    @Override // com.ironsource.InterfaceC3248r1
    public com.ironsource.InterfaceC3266s1 a(com.ironsource.InterfaceC3177n1 eventBaseData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventBaseData, "eventBaseData");
        int i = com.ironsource.C3231q1.a.f6565a[this.f6564a.ordinal()];
        if (i == 1) {
            return new com.ironsource.C9(eventBaseData);
        }
        if (i == 2) {
            return new com.ironsource.C3011de(eventBaseData);
        }
        if (i == 3) {
            return new com.ironsource.R2(eventBaseData);
        }
        throw new java.lang.IllegalArgumentException("Unsupported ad format: " + this.f6564a);
    }
}
