package com.ironsource;

/* renamed from: com.ironsource.td, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3296td implements com.ironsource.InterfaceC3314ud {

    /* renamed from: a, reason: collision with root package name */
    private final com.unity3d.mediation.LevelPlay.AdFormat f6740a;

    /* renamed from: com.ironsource.td$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6741a;

        static {
            int[] iArr = new int[com.unity3d.mediation.LevelPlay.AdFormat.values().length];
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.unity3d.mediation.LevelPlay.AdFormat.REWARDED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            f6741a = iArr;
        }
    }

    public C3296td(com.unity3d.mediation.LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.f6740a = adFormat;
    }

    private final com.ironsource.C3260rd a(com.ironsource.Fd.c cVar, int i, com.ironsource.Ua ua) {
        java.lang.String c = cVar.c();
        if (c == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("invalid adUnitId");
            return null;
        }
        java.util.List<java.lang.String> d = cVar.d();
        if (d == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("invalid instances");
            return null;
        }
        com.ironsource.C3069h0 c3069h0 = new com.ironsource.C3069h0(com.unity3d.mediation.a.a(this.f6740a), com.ironsource.C3326v7.f6774a.a(), c, null, null, null, 56, null);
        com.ironsource.AbstractC3355x0 a2 = a(c3069h0, ua);
        if (a2 == null) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.warning("adunit data is null");
            return null;
        }
        com.ironsource.mediationsdk.IronSource.a a3 = com.unity3d.mediation.a.a(this.f6740a);
        com.ironsource.F0.b bVar = com.ironsource.F0.b.MEDIATION;
        com.ironsource.V0 v0 = new com.ironsource.V0(new com.ironsource.C3212p0(a3, bVar), a2, bVar);
        v0.e().a(new com.ironsource.D0(v0, c3069h0, null, 4, null));
        return new com.ironsource.C3260rd(c, d, i, new com.ironsource.C3368xd(v0, a2, null, 4, null), v0);
    }

    private final com.ironsource.AbstractC3355x0 a(com.ironsource.C3069h0 c3069h0, com.ironsource.Ua ua) {
        try {
            int i = com.ironsource.C3296td.a.f6741a[this.f6740a.ordinal()];
            if (i == 1) {
                return com.ironsource.B9.z.a(c3069h0, ua, false);
            }
            if (i == 2) {
                return com.ironsource.C2993ce.z.a(c3069h0, ua, false);
            }
            throw new java.lang.IllegalArgumentException("Unsupported ad format for preload: " + this.f6740a);
        } catch (java.lang.Exception e) {
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Failed to create AdUnitData for ad format " + this.f6740a + ": " + e.getMessage() + "\n" + kotlin.ExceptionsKt.stackTraceToString(e));
            return null;
        }
    }

    @Override // com.ironsource.InterfaceC3314ud
    public java.util.List<com.ironsource.InterfaceC3278sd> a(java.util.List<com.ironsource.Fd.c> config, int i, com.ironsource.Ua levelPlayConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "config");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(levelPlayConfig, "levelPlayConfig");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = config.iterator();
        while (it.hasNext()) {
            com.ironsource.C3260rd a2 = a((com.ironsource.Fd.c) it.next(), i, levelPlayConfig);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }
}
