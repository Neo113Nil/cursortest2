package com.ironsource;

import com.ironsource.L7;
import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Qd implements L7, L7.a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, LevelPlayReward> f7861a = new LinkedHashMap();
    private final Map<String, LevelPlayReward> b = new LinkedHashMap();

    @Override // com.ironsource.L7.a
    public void a(String placement, String rewardName, int i) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.f7861a.put(placement, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.L7.a
    public void b(String adUnitId, String rewardName, int i) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(rewardName, "rewardName");
        this.b.put(adUnitId, new LevelPlayReward(rewardName, i));
    }

    @Override // com.ironsource.L7
    public LevelPlayReward a(String str, String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        LevelPlayReward a2 = a(str);
        if (a2 != null) {
            return a2;
        }
        LevelPlayReward b = b(adUnitId);
        return b == null ? a() : b;
    }

    @Override // com.ironsource.L7
    public LevelPlayReward b(String adUnitId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        return this.b.get(adUnitId);
    }

    @Override // com.ironsource.L7
    public LevelPlayReward a(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f7861a.get(str);
    }

    private final LevelPlayReward a() {
        return new LevelPlayReward("", 0);
    }
}
