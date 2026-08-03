package io.appmetrica.analytics.coreapi.internal.identifiers;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3667a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3668b;

    /* renamed from: c, reason: collision with root package name */
    private final java.lang.String f3669c;

    public SdkIdentifiers(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f3667a = str;
        this.f3668b = str2;
        this.f3669c = str3;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers copy$default(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers, java.lang.String str, java.lang.String str2, java.lang.String str3, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = sdkIdentifiers.f3667a;
        }
        if ((i2 & 2) != 0) {
            str2 = sdkIdentifiers.f3668b;
        }
        if ((i2 & 4) != 0) {
            str3 = sdkIdentifiers.f3669c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final java.lang.String component1() {
        return this.f3667a;
    }

    public final java.lang.String component2() {
        return this.f3668b;
    }

    public final java.lang.String component3() {
        return this.f3669c;
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers copy(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        return new io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = (io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers) obj;
        return kotlin.jvm.internal.i.a(this.f3667a, sdkIdentifiers.f3667a) && kotlin.jvm.internal.i.a(this.f3668b, sdkIdentifiers.f3668b) && kotlin.jvm.internal.i.a(this.f3669c, sdkIdentifiers.f3669c);
    }

    public final java.lang.String getDeviceId() {
        return this.f3668b;
    }

    public final java.lang.String getDeviceIdHash() {
        return this.f3669c;
    }

    public final java.lang.String getUuid() {
        return this.f3667a;
    }

    public int hashCode() {
        java.lang.String str = this.f3667a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f3668b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f3669c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SdkIdentifiers(uuid=" + this.f3667a + ", deviceId=" + this.f3668b + ", deviceIdHash=" + this.f3669c + ')';
    }
}
