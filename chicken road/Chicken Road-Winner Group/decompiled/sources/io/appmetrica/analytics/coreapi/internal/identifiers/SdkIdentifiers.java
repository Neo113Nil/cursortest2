package io.appmetrica.analytics.coreapi.internal.identifiers;

import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class SdkIdentifiers {

    /* renamed from: a, reason: collision with root package name */
    private final String f5351a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5352b;

    /* renamed from: c, reason: collision with root package name */
    private final String f5353c;

    public SdkIdentifiers(String str, String str2, String str3) {
        this.f5351a = str;
        this.f5352b = str2;
        this.f5353c = str3;
    }

    public static /* synthetic */ SdkIdentifiers copy$default(SdkIdentifiers sdkIdentifiers, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sdkIdentifiers.f5351a;
        }
        if ((i3 & 2) != 0) {
            str2 = sdkIdentifiers.f5352b;
        }
        if ((i3 & 4) != 0) {
            str3 = sdkIdentifiers.f5353c;
        }
        return sdkIdentifiers.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f5351a;
    }

    public final String component2() {
        return this.f5352b;
    }

    public final String component3() {
        return this.f5353c;
    }

    public final SdkIdentifiers copy(String str, String str2, String str3) {
        return new SdkIdentifiers(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkIdentifiers)) {
            return false;
        }
        SdkIdentifiers sdkIdentifiers = (SdkIdentifiers) obj;
        return j.a(this.f5351a, sdkIdentifiers.f5351a) && j.a(this.f5352b, sdkIdentifiers.f5352b) && j.a(this.f5353c, sdkIdentifiers.f5353c);
    }

    public final String getDeviceId() {
        return this.f5352b;
    }

    public final String getDeviceIdHash() {
        return this.f5353c;
    }

    public final String getUuid() {
        return this.f5351a;
    }

    public int hashCode() {
        String str = this.f5351a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5352b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5353c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "SdkIdentifiers(uuid=" + this.f5351a + ", deviceId=" + this.f5352b + ", deviceIdHash=" + this.f5353c + ')';
    }
}
