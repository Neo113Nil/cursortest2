package com.vungle.ads.internal;

import com.vungle.ads.internal.model.j3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.vungle.ads.internal.model.i0 f12195a;
    public final j3 b;
    public final com.vungle.ads.internal.presenter.z c;

    public v0(com.vungle.ads.internal.model.i0 adPayload, j3 placement, com.vungle.ads.internal.presenter.z zVar) {
        Intrinsics.checkNotNullParameter(adPayload, "adPayload");
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f12195a = adPayload;
        this.b = placement;
        this.c = zVar;
    }

    public final com.vungle.ads.internal.model.i0 a() {
        return this.f12195a;
    }

    public final j3 b() {
        return this.b;
    }

    public final com.vungle.ads.internal.presenter.z c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return Intrinsics.areEqual(this.f12195a, v0Var.f12195a) && Intrinsics.areEqual(this.b, v0Var.b) && Intrinsics.areEqual(this.c, v0Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.f12195a.hashCode() * 31)) * 31;
        com.vungle.ads.internal.presenter.z zVar = this.c;
        return hashCode + (zVar == null ? 0 : zVar.hashCode());
    }

    public final String toString() {
        return com.iab.omid.library.vungle.internal.l.a("PendingData(adPayload=").append(this.f12195a).append(", placement=").append(this.b).append(", presenterDelegate=").append(this.c).append(')').toString();
    }
}
