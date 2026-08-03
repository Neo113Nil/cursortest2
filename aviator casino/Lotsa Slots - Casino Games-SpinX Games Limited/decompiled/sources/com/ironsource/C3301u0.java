package com.ironsource;

/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3301u0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.ironsource.AbstractC3230q0 f6747a;
    private final com.unity3d.mediation.LevelPlayAdInfo b;

    public C3301u0(com.ironsource.AbstractC3230q0 adUnit, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f6747a = adUnit;
        this.b = levelPlayAdInfo;
    }

    public final com.ironsource.AbstractC3230q0 a() {
        return this.f6747a;
    }

    public final com.unity3d.mediation.LevelPlayAdInfo b() {
        return this.b;
    }

    public final com.unity3d.mediation.LevelPlayAdInfo c() {
        return this.b;
    }

    public final com.ironsource.AbstractC3230q0 d() {
        return this.f6747a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.ironsource.C3301u0)) {
            return false;
        }
        com.ironsource.C3301u0 c3301u0 = (com.ironsource.C3301u0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f6747a, c3301u0.f6747a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c3301u0.b);
    }

    public int hashCode() {
        int hashCode = this.f6747a.hashCode() * 31;
        com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo = this.b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public java.lang.String toString() {
        return "AdUnitCallback(adUnit=" + this.f6747a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C3301u0(com.ironsource.AbstractC3230q0 abstractC3230q0, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC3230q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final com.ironsource.C3301u0 a(com.ironsource.AbstractC3230q0 adUnit, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new com.ironsource.C3301u0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ com.ironsource.C3301u0 a(com.ironsource.C3301u0 c3301u0, com.ironsource.AbstractC3230q0 abstractC3230q0, com.unity3d.mediation.LevelPlayAdInfo levelPlayAdInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            abstractC3230q0 = c3301u0.f6747a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c3301u0.b;
        }
        return c3301u0.a(abstractC3230q0, levelPlayAdInfo);
    }
}
