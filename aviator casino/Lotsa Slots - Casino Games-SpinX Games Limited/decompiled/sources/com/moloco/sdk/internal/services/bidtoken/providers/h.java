package com.moloco.sdk.internal.services.bidtoken.providers;

/* loaded from: classes5.dex */
public final class h {
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Integer f7237a;
    public final java.lang.Integer b;
    public final java.lang.Boolean c;

    public h() {
        this(null, null, null, 7, null);
    }

    public final java.lang.Integer a() {
        return this.f7237a;
    }

    public final java.lang.Integer b() {
        return this.b;
    }

    public final java.lang.Boolean c() {
        return this.c;
    }

    public final java.lang.Integer d() {
        return this.b;
    }

    public final java.lang.Integer e() {
        return this.f7237a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.moloco.sdk.internal.services.bidtoken.providers.h)) {
            return false;
        }
        com.moloco.sdk.internal.services.bidtoken.providers.h hVar = (com.moloco.sdk.internal.services.bidtoken.providers.h) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f7237a, hVar.f7237a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, hVar.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, hVar.c);
    }

    public final java.lang.Boolean f() {
        return this.c;
    }

    public int hashCode() {
        java.lang.Integer num = this.f7237a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        java.lang.Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Boolean bool = this.c;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BatteryInfoSignal(maxBatteryLevel=" + this.f7237a + ", batteryStatus=" + this.b + ", isPowerSaveMode=" + this.c + ')';
    }

    public h(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
        this.f7237a = num;
        this.b = num2;
        this.c = bool;
    }

    public final com.moloco.sdk.internal.services.bidtoken.providers.h a(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool) {
        return new com.moloco.sdk.internal.services.bidtoken.providers.h(num, num2, bool);
    }

    public static /* synthetic */ com.moloco.sdk.internal.services.bidtoken.providers.h a(com.moloco.sdk.internal.services.bidtoken.providers.h hVar, java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = hVar.f7237a;
        }
        if ((i & 2) != 0) {
            num2 = hVar.b;
        }
        if ((i & 4) != 0) {
            bool = hVar.c;
        }
        return hVar.a(num, num2, bool);
    }

    public /* synthetic */ h(java.lang.Integer num, java.lang.Integer num2, java.lang.Boolean bool, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : bool);
    }
}
