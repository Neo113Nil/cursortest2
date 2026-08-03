package com.inmobi.media;

/* renamed from: com.inmobi.media.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2763t0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2709r1 f5455a;
    public final java.lang.String b;
    public final java.lang.Boolean c;
    public final java.lang.String d;
    public final byte e;
    public final java.lang.String f;

    public C2763t0(com.inmobi.media.C2709r1 adUnitTelemetry, java.lang.String str, java.lang.Boolean bool, java.lang.String str2, byte b, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.f5455a = adUnitTelemetry;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = b;
        this.f = str3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.inmobi.media.C2763t0)) {
            return false;
        }
        com.inmobi.media.C2763t0 c2763t0 = (com.inmobi.media.C2763t0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5455a, c2763t0.f5455a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, c2763t0.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, c2763t0.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, c2763t0.d) && this.e == c2763t0.e && kotlin.jvm.internal.Intrinsics.areEqual(this.f, c2763t0.f);
    }

    public final int hashCode() {
        int hashCode = this.f5455a.hashCode() * 31;
        java.lang.String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Boolean bool = this.c;
        int hashCode3 = (this.e + ((this.d.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        java.lang.String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        com.inmobi.media.C2709r1 c2709r1 = this.f5455a;
        java.lang.String str = this.b;
        java.lang.Boolean bool = this.c;
        java.lang.String str2 = this.d;
        byte b = this.e;
        return "AdNotReadyMetadata(adUnitTelemetry=" + c2709r1 + ", creativeType=" + str + ", isRewarded=" + bool + ", markupType=" + str2 + ", adState=" + ((int) b) + ", impressionId=" + this.f + ")";
    }
}
