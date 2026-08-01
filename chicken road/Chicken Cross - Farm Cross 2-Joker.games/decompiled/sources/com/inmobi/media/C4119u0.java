package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4119u0 {

    /* renamed from: a, reason: collision with root package name */
    public final C4092t1 f7405a;
    public final String b;
    public final Boolean c;
    public final String d;
    public final byte e;
    public final String f;

    public C4119u0(C4092t1 adUnitTelemetry, String str, Boolean bool, String str2, byte b, String str3) {
        Intrinsics.checkNotNullParameter(adUnitTelemetry, "adUnitTelemetry");
        this.f7405a = adUnitTelemetry;
        this.b = str;
        this.c = bool;
        this.d = str2;
        this.e = b;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4119u0)) {
            return false;
        }
        C4119u0 c4119u0 = (C4119u0) obj;
        return Intrinsics.areEqual(this.f7405a, c4119u0.f7405a) && Intrinsics.areEqual(this.b, c4119u0.b) && Intrinsics.areEqual(this.c, c4119u0.c) && Intrinsics.areEqual(this.d, c4119u0.d) && this.e == c4119u0.e && Intrinsics.areEqual(this.f, c4119u0.f);
    }

    public final int hashCode() {
        int hashCode = this.f7405a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.c;
        int hashCode3 = (Byte.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "AdNotReadyMetadata(adUnitTelemetry=" + this.f7405a + ", creativeType=" + this.b + ", isRewarded=" + this.c + ", markupType=" + this.d + ", adState=" + ((int) this.e) + ", impressionId=" + this.f + ")";
    }
}
