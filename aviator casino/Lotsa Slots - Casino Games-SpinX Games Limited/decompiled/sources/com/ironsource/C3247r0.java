package com.ironsource;

/* renamed from: com.ironsource.r0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3247r0 {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.HashMap<java.lang.String, com.ironsource.S0> f6577a = new java.util.HashMap<>();

    /* renamed from: com.ironsource.r0$a */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    public final com.ironsource.S0 a(java.lang.String adUnitId, java.util.List<? extends com.ironsource.mediationsdk.model.NetworkSettings> providers, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(providers, "providers");
        com.ironsource.S0 s0 = this.f6577a.get(adUnitId);
        if (s0 != null) {
            return s0;
        }
        com.ironsource.S0 s02 = new com.ironsource.S0(providers, i);
        this.f6577a.put(adUnitId, s02);
        return s02;
    }
}
