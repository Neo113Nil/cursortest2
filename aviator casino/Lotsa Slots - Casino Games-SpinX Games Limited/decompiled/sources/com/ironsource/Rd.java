package com.ironsource;

/* loaded from: classes5.dex */
public final class Rd implements com.ironsource.N7, com.ironsource.N7.a {

    /* renamed from: a, reason: collision with root package name */
    private final java.util.Map<java.lang.String, com.unity3d.mediation.rewarded.LevelPlayReward> f5951a = new java.util.LinkedHashMap();
    private final java.util.Map<java.lang.String, com.unity3d.mediation.rewarded.LevelPlayReward> b = new java.util.LinkedHashMap();

    @Override // com.ironsource.N7.a
    public void a(java.lang.String placement, java.lang.String rewardName, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placement, "placement");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f5951a.put(placement, new com.unity3d.mediation.rewarded.LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.N7.a
    public void b(java.lang.String adUnitId, java.lang.String rewardName, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.b.put(adUnitId, new com.unity3d.mediation.rewarded.LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.N7
    public com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String str, java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        com.unity3d.mediation.rewarded.LevelPlayReward a2 = a(str);
        if (a2 != null) {
            return a2;
        }
        com.unity3d.mediation.rewarded.LevelPlayReward b = b(adUnitId);
        return b == null ? a() : b;
    }

    @Override // com.ironsource.N7
    public com.unity3d.mediation.rewarded.LevelPlayReward b(java.lang.String adUnitId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.b.get(adUnitId);
    }

    @Override // com.ironsource.N7
    public com.unity3d.mediation.rewarded.LevelPlayReward a(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f5951a.get(str);
    }

    private final com.unity3d.mediation.rewarded.LevelPlayReward a() {
        return new com.unity3d.mediation.rewarded.LevelPlayReward("", 0);
    }
}
