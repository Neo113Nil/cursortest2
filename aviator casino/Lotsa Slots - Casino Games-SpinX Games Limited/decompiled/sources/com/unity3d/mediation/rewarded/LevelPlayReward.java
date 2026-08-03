package com.unity3d.mediation.rewarded;

/* loaded from: classes5.dex */
public final class LevelPlayReward {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f8050a;
    private final int b;

    public LevelPlayReward(java.lang.String name, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        this.f8050a = name;
        this.b = i;
    }

    public static /* synthetic */ com.unity3d.mediation.rewarded.LevelPlayReward copy$default(com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = levelPlayReward.f8050a;
        }
        if ((i2 & 2) != 0) {
            i = levelPlayReward.b;
        }
        return levelPlayReward.copy(str, i);
    }

    public final java.lang.String component1() {
        return this.f8050a;
    }

    public final int component2() {
        return this.b;
    }

    public final com.unity3d.mediation.rewarded.LevelPlayReward copy(java.lang.String name, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name, "name");
        return new com.unity3d.mediation.rewarded.LevelPlayReward(name, i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.unity3d.mediation.rewarded.LevelPlayReward)) {
            return false;
        }
        com.unity3d.mediation.rewarded.LevelPlayReward levelPlayReward = (com.unity3d.mediation.rewarded.LevelPlayReward) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f8050a, levelPlayReward.f8050a) && this.b == levelPlayReward.b;
    }

    public final int getAmount() {
        return this.b;
    }

    public final java.lang.String getName() {
        return this.f8050a;
    }

    public int hashCode() {
        return (this.f8050a.hashCode() * 31) + this.b;
    }

    public java.lang.String toString() {
        return "LevelPlayReward(name=" + this.f8050a + ", amount=" + this.b + ")";
    }
}
