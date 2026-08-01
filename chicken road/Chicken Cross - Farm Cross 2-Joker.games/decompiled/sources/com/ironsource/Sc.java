package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Sc {

    /* renamed from: a, reason: collision with root package name */
    private final E0 f7896a;

    public Sc(E0 eventsWrapper) {
        Intrinsics.checkNotNullParameter(eventsWrapper, "eventsWrapper");
        this.f7896a = eventsWrapper;
    }

    public final void a() {
        this.f7896a.a(B0.OPERATIONAL_LOAD_AD, new HashMap());
    }

    public final void b() {
        this.f7896a.a(B0.PAUSE_AD, null);
    }

    public final void c() {
        this.f7896a.a(B0.RESUME_AD, null);
    }

    public final void a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f7896a.a(B0.OPERATIONAL_LOAD_SUCCESS, hashMap);
    }

    public final void a(long j, int i, String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i));
        hashMap.put("reason", reason);
        hashMap.put(IronSourceConstants.EVENTS_DURATION, Long.valueOf(j));
        this.f7896a.a(B0.OPERATIONAL_LOAD_FAILED, hashMap);
    }

    public final void a(double d) {
        this.f7896a.a(B0.OPERATIONAL_SET_CONFIGURATIONS, MapsKt.mapOf(TuplesKt.to(IronSourceConstants.EVENTS_EXT1, "flooring=" + d)));
    }

    public static /* synthetic */ void a(Sc sc, LevelPlayReward levelPlayReward, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        sc.a(levelPlayReward, str, str2);
    }

    public final void a(LevelPlayReward reward, String str, String str2) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_REWARD_NAME, reward.getName());
        hashMap.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(reward.getAmount()));
        if (str != null) {
            hashMap.put("placement", str);
        }
        if (str2 != null) {
            hashMap.put("reason", str2);
        }
        this.f7896a.a(B0.OPERATIONAL_GET_REWARD, hashMap);
    }
}
