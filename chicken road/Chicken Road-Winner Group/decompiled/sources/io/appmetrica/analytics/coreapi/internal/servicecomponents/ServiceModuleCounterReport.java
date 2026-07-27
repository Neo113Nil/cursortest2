package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import java.util.Arrays;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class ServiceModuleCounterReport {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f5369a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5370b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5371c;

    /* renamed from: d, reason: collision with root package name */
    private final int f5372d;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private String f5373a;

        /* renamed from: b, reason: collision with root package name */
        private String f5374b;

        /* renamed from: c, reason: collision with root package name */
        private byte[] f5375c;

        /* renamed from: d, reason: collision with root package name */
        private int f5376d;

        public final ServiceModuleCounterReport build() {
            return new ServiceModuleCounterReport(this.f5373a, this.f5374b, this.f5375c, this.f5376d);
        }

        public final Builder withName(String str) {
            this.f5373a = str;
            return this;
        }

        public final Builder withType(int i3) {
            this.f5376d = i3;
            return this;
        }

        public final Builder withValue(String str) {
            this.f5374b = str;
            return this;
        }

        public final Builder withValueBytes(byte[] bArr) {
            this.f5375c = bArr;
            return this;
        }
    }

    public static final class Companion {
        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public final Builder newBuilder() {
            return new Builder();
        }

        private Companion() {
        }
    }

    public ServiceModuleCounterReport(String str, String str2, byte[] bArr, int i3) {
        this.f5369a = str;
        this.f5370b = str2;
        this.f5371c = bArr;
        this.f5372d = i3;
    }

    public static /* synthetic */ ServiceModuleCounterReport copy$default(ServiceModuleCounterReport serviceModuleCounterReport, String str, String str2, byte[] bArr, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = serviceModuleCounterReport.f5369a;
        }
        if ((i4 & 2) != 0) {
            str2 = serviceModuleCounterReport.f5370b;
        }
        if ((i4 & 4) != 0) {
            bArr = serviceModuleCounterReport.f5371c;
        }
        if ((i4 & 8) != 0) {
            i3 = serviceModuleCounterReport.f5372d;
        }
        return serviceModuleCounterReport.copy(str, str2, bArr, i3);
    }

    public final String component1() {
        return this.f5369a;
    }

    public final String component2() {
        return this.f5370b;
    }

    public final byte[] component3() {
        return this.f5371c;
    }

    public final int component4() {
        return this.f5372d;
    }

    public final ServiceModuleCounterReport copy(String str, String str2, byte[] bArr, int i3) {
        return new ServiceModuleCounterReport(str, str2, bArr, i3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ServiceModuleCounterReport)) {
            return false;
        }
        ServiceModuleCounterReport serviceModuleCounterReport = (ServiceModuleCounterReport) obj;
        return this.f5372d == serviceModuleCounterReport.f5372d && j.a(this.f5369a, serviceModuleCounterReport.f5369a) && j.a(this.f5370b, serviceModuleCounterReport.f5370b) && Arrays.equals(this.f5371c, serviceModuleCounterReport.f5371c);
    }

    public final String getName() {
        return this.f5369a;
    }

    public final int getType() {
        return this.f5372d;
    }

    public final String getValue() {
        return this.f5370b;
    }

    public final byte[] getValueBytes() {
        return this.f5371c;
    }

    public int hashCode() {
        int i3 = this.f5372d * 31;
        String str = this.f5369a;
        int hashCode = (i3 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5370b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        byte[] bArr = this.f5371c;
        return hashCode2 + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        return "ServiceModuleCounterReport(name=" + this.f5369a + ", value=" + this.f5370b + ", valueBytes=" + Arrays.toString(this.f5371c) + ", type=" + this.f5372d + ')';
    }
}
