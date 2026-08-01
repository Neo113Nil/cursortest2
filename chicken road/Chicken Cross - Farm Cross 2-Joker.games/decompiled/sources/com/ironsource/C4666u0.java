package com.ironsource;

import com.unity3d.mediation.LevelPlayAdInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4666u0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4595q0 f8685a;
    private final LevelPlayAdInfo b;

    public C4666u0(AbstractC4595q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        this.f8685a = adUnit;
        this.b = levelPlayAdInfo;
    }

    public final AbstractC4595q0 a() {
        return this.f8685a;
    }

    public final LevelPlayAdInfo b() {
        return this.b;
    }

    public final LevelPlayAdInfo c() {
        return this.b;
    }

    public final AbstractC4595q0 d() {
        return this.f8685a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4666u0)) {
            return false;
        }
        C4666u0 c4666u0 = (C4666u0) obj;
        return Intrinsics.areEqual(this.f8685a, c4666u0.f8685a) && Intrinsics.areEqual(this.b, c4666u0.b);
    }

    public int hashCode() {
        int hashCode = this.f8685a.hashCode() * 31;
        LevelPlayAdInfo levelPlayAdInfo = this.b;
        return hashCode + (levelPlayAdInfo == null ? 0 : levelPlayAdInfo.hashCode());
    }

    public String toString() {
        return "AdUnitCallback(adUnit=" + this.f8685a + ", adInfo=" + this.b + ")";
    }

    public /* synthetic */ C4666u0(AbstractC4595q0 abstractC4595q0, LevelPlayAdInfo levelPlayAdInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC4595q0, (i & 2) != 0 ? null : levelPlayAdInfo);
    }

    public final C4666u0 a(AbstractC4595q0 adUnit, LevelPlayAdInfo levelPlayAdInfo) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return new C4666u0(adUnit, levelPlayAdInfo);
    }

    public static /* synthetic */ C4666u0 a(C4666u0 c4666u0, AbstractC4595q0 abstractC4595q0, LevelPlayAdInfo levelPlayAdInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC4595q0 = c4666u0.f8685a;
        }
        if ((i & 2) != 0) {
            levelPlayAdInfo = c4666u0.b;
        }
        return c4666u0.a(abstractC4595q0, levelPlayAdInfo);
    }
}
