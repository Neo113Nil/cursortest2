package com.ironsource;

/* loaded from: classes5.dex */
public final class Sc {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.F0 f5963a;

    public Sc(com.ironsource.F0 eventsWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.f5963a = eventsWrapper;
    }

    public final void a() {
        this.f5963a.a(com.ironsource.C0.OPERATIONAL_LOAD_AD, new java.util.HashMap());
    }

    public final void b() {
        this.f5963a.a(com.ironsource.C0.PAUSE_AD, null);
    }

    public final void c() {
        this.f5963a.a(com.ironsource.C0.RESUME_AD, null);
    }

    public final void a(long j) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f5963a.a(com.ironsource.C0.OPERATIONAL_LOAD_SUCCESS, hashMap);
    }

    public final void a(long j, int i, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "reason");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("errorCode", java.lang.Integer.valueOf(i));
        hashMap.put("reason", reason);
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, java.lang.Long.valueOf(j));
        this.f5963a.a(com.ironsource.C0.OPERATIONAL_LOAD_FAILED, hashMap);
    }

    public final void a(double d) {
        this.f5963a.a(com.ironsource.C0.OPERATIONAL_SET_CONFIGURATIONS, kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }

    public static /* synthetic */ void a(com.ironsource.Sc sc, com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        sc.a(levelPlayReward, str, str2);
    }

    public final void a(com.unity3d.mediation.rewarded.LevelPlayReward reward, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reward, "reward");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_NAME, reward.getName());
        hashMap.put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_REWARD_AMOUNT, java.lang.Integer.valueOf(reward.getAmount()));
        if (str != null) {
            hashMap.put("placement", str);
        }
        if (str2 != null) {
            hashMap.put("reason", str2);
        }
        this.f5963a.a(com.ironsource.C0.OPERATIONAL_GET_REWARD, hashMap);
    }
}
