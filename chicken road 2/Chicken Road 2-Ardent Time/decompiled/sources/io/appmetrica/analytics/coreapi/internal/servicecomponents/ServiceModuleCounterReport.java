package io.appmetrica.analytics.coreapi.internal.servicecomponents;

/* loaded from: classes.dex */
public final class ServiceModuleCounterReport {
    public static final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Companion Companion = new io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final java.lang.String f3686a;

    /* renamed from: b, reason: collision with root package name */
    private final java.lang.String f3687b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f3688c;

    /* renamed from: d, reason: collision with root package name */
    private final int f3689d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f3690a;

        /* renamed from: b, reason: collision with root package name */
        private java.lang.String f3691b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f3692c;

        /* renamed from: d, reason: collision with root package name */
        private int f3693d;

        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport build() {
            return new io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport(this.f3690a, this.f3691b, this.f3692c, this.f3693d);
        }

        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder withName(java.lang.String str) {
            this.f3690a = str;
            return this;
        }

        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder withType(int i2) {
            this.f3693d = i2;
            return this;
        }

        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder withValue(java.lang.String str) {
            this.f3691b = str;
            return this;
        }

        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder withValueBytes(byte[] bArr) {
            this.f3692c = bArr;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder newBuilder() {
            return new io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport.Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(java.lang.String str, java.lang.String str2, byte[] bArr, int i2) {
        this.f3686a = str;
        this.f3687b = str2;
        this.f3688c = bArr;
        this.f3689d = i2;
    }

    public static /* synthetic */ io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport copy$default(io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport serviceModuleCounterReport, java.lang.String str, java.lang.String str2, byte[] bArr, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            str = serviceModuleCounterReport.f3686a;
        }
        if ((i3 & 2) != 0) {
            str2 = serviceModuleCounterReport.f3687b;
        }
        if ((i3 & 4) != 0) {
            bArr = serviceModuleCounterReport.f3688c;
        }
        if ((i3 & 8) != 0) {
            i2 = serviceModuleCounterReport.f3689d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i2);
    }

    public final java.lang.String component1() {
        return this.f3686a;
    }

    public final java.lang.String component2() {
        return this.f3687b;
    }

    public final byte[] component3() {
        return this.f3688c;
    }

    public final int component4() {
        return this.f3689d;
    }

    public final io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport copy(java.lang.String str, java.lang.String str2, byte[] bArr, int i2) {
        return new io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport(str, str2, bArr, i2);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport)) {
            return false;
        }
        io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport serviceModuleCounterReport = (io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceModuleCounterReport) obj;
        return this.f3689d == serviceModuleCounterReport.f3689d && kotlin.jvm.internal.i.a(this.f3686a, serviceModuleCounterReport.f3686a) && kotlin.jvm.internal.i.a(this.f3687b, serviceModuleCounterReport.f3687b) && java.util.Arrays.equals(this.f3688c, serviceModuleCounterReport.f3688c);
    }

    public final java.lang.String getName() {
        return this.f3686a;
    }

    public final int getType() {
        return this.f3689d;
    }

    public final java.lang.String getValue() {
        return this.f3687b;
    }

    public final byte[] getValueBytes() {
        return this.f3688c;
    }

    public int hashCode() {
        int i2 = this.f3689d * 31;
        java.lang.String str = this.f3686a;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f3687b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f3688c;
        return hashCode2 + (bArr != null ? java.util.Arrays.hashCode(bArr) : 0);
    }

    public java.lang.String toString() {
        return "ServiceModuleCounterReport(name=" + this.f3686a + ", value=" + this.f3687b + ", valueBytes=" + java.util.Arrays.toString(this.f3688c) + ", type=" + this.f3689d + ')';
    }
}
