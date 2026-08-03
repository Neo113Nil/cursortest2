package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class f {
    public static final int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.z f7236a;
    public final java.lang.Integer b;

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final com.moloco.sdk.internal.services.z a() {
        return this.f7236a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final java.lang.Integer c() {
        return this.b;
    }

    public final com.moloco.sdk.internal.services.z d() {
        return this.f7236a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.f)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.f fVar = (com.moloco.sdk.internal.services.bidtoken.providers.f) obj;
        return this.f7236a == fVar.f7236a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, fVar.b);
    }

    public int hashCode() {
        com.moloco.sdk.internal.services.z zVar = this.f7236a;
        int hashCode = (zVar == null ? 0 : zVar.hashCode()) * 31;
        java.lang.Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AudioSignal(muteSwitchState=" + this.f7236a + ", mediaVolume=" + this.b + ')';
    }

    public f(com.moloco.sdk.internal.services.z zVar, java.lang.Integer num) {
        this.f7236a = zVar;
        this.b = num;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.f a(com.moloco.sdk.internal.services.z zVar, java.lang.Integer num) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.f(zVar, num);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.f a(com.moloco.sdk.internal.services.bidtoken.providers.f fVar, com.moloco.sdk.internal.services.z zVar, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            zVar = fVar.f7236a;
        }
        if ((i & 2) != 0) {
            num = fVar.b;
        }
        return fVar.a(zVar, num);
    }

    public /* synthetic */ f(com.moloco.sdk.internal.services.z zVar, java.lang.Integer num, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : zVar, (i & 2) != 0 ? null : num);
    }
}
