package com.unity3d.mediation.rewarded;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class LevelPlayReward {

    /* renamed from: a, reason: collision with root package name */
    private final String f11693a;
    private final int b;

    public LevelPlayReward(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f11693a = name;
        this.b = i;
    }

    public static /* synthetic */ LevelPlayReward copy$default(LevelPlayReward levelPlayReward, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.f11693a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.b;
        }
        return levelPlayReward.copy(str, i);
    }

    public final String component1() {
        return this.f11693a;
    }

    public final int component2() {
        return this.b;
    }

    public final LevelPlayReward copy(String name, int i) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new LevelPlayReward(name, i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LevelPlayReward)) {
            return false;
        }
        LevelPlayReward levelPlayReward = (LevelPlayReward) obj;
        return Intrinsics.areEqual(this.f11693a, levelPlayReward.f11693a) && this.b == levelPlayReward.b;
    }

    public final int getAmount() {
        return this.b;
    }

    public final String getName() {
        return this.f11693a;
    }

    public int hashCode() {
        return (this.f11693a.hashCode() * 31) + Integer.hashCode(this.b);
    }

    public String toString() {
        return "LevelPlayReward(name=" + this.f11693a + ", amount=" + this.b + ")";
    }
}
