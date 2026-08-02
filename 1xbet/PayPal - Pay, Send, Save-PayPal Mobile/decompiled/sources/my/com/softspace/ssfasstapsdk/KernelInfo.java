package my.com.softspace.ssfasstapsdk;

/* loaded from: classes17.dex */
public final class KernelInfo {
    java.lang.String checksum;

    /* renamed from: name, reason: collision with root package name */
    java.lang.String f6947name;
    java.lang.String version;

    enum KernelType {
        Master("Master"),
        Visa("Visa"),
        MyDebit("MyDebit");

        java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        KernelType(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }
    }

    KernelInfo(my.com.softspace.ssfasstapsdk.KernelInfo.KernelType kernelType, java.lang.String str, java.lang.String str2) {
        this.f6947name = kernelType.getHighResolutionOutputSizeshNQ4ISI;
        this.checksum = str;
        this.version = str2;
    }

    public final java.lang.String getName() {
        return this.f6947name;
    }

    public final java.lang.String getChecksum() {
        return this.checksum;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }
}
