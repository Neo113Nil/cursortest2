package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import B0.o;
import java.util.Arrays;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class ServiceModuleCounterReport {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f6189a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6190b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f6191c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6192d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f6193a;

        /* renamed from: b, reason: collision with root package name */
        private String f6194b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f6195c;

        /* renamed from: d, reason: collision with root package name */
        private int f6196d;

        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f6193a, this.f6194b, this.f6195c, this.f6196d);
        }

        public final Builder withName(String str) {
            this.f6193a = str;
            return this;
        }

        public final Builder withType(int i2) {
            this.f6196d = i2;
            return this;
        }

        public final Builder withValue(String str) {
            this.f6194b = str;
            return this;
        }

        public final Builder withValueBytes(byte[] bArr) {
            this.f6195c = bArr;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(String str, String str2, byte[] bArr, int i2) {
        this.f6189a = str;
        this.f6190b = str2;
        this.f6191c = bArr;
        this.f6192d = i2;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = serviceModuleCounterReport.f6189a;
        }
        if ((i3 & 2) != 0) {
            str2 = serviceModuleCounterReport.f6190b;
        }
        if ((i3 & 4) != 0) {
            bArr = serviceModuleCounterReport.f6191c;
        }
        if ((i3 & 8) != 0) {
            i2 = serviceModuleCounterReport.f6192d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i2);
    }

    public final String component1() {
        return this.f6189a;
    }

    public final String component2() {
        return this.f6190b;
    }

    public final byte[] component3() {
        return this.f6191c;
    }

    public final int component4() {
        return this.f6192d;
    }

    public final ServiceModuleCounterReport copy(String str, String str2, byte[] bArr, int i2) {
        return new ServiceModuleCounterReport(str, str2, bArr, i2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f6192d == serviceModuleCounterReport.f6192d && i.a(this.f6189a, serviceModuleCounterReport.f6189a) && i.a(this.f6190b, serviceModuleCounterReport.f6190b) && Arrays.equals(this.f6191c, serviceModuleCounterReport.f6191c);
    }

    public final String getName() {
        return this.f6189a;
    }

    public final int getType() {
        return this.f6192d;
    }

    public final String getValue() {
        return this.f6190b;
    }

    public final byte[] getValueBytes() {
        return this.f6191c;
    }

    public int hashCode() {
        int i2 = this.f6192d * 31;
        String str = this.f6189a;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6190b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f6191c;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ServiceModuleCounterReport(name=");
        sb.append(this.f6189a);
        sb.append(", value=");
        sb.append(this.f6190b);
        sb.append(", valueBytes=");
        sb.append(Arrays.toString(this.f6191c));
        sb.append(", type=");
        return o.k(sb, this.f6192d, ')');
    }
}
