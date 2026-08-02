package visa;

/* loaded from: classes18.dex */
public class VISAKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final visa.VISAKernel f7085a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f7085a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public VISAKernelProvider(java.lang.String str, java.lang.String str2) {
        this.f7085a = new visa.VISAKernel();
        this.b = str;
        this.c = str2;
    }

    public VISAKernelProvider() {
        this.f7085a = new visa.VISAKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_VISA_A0000000031010;
        this.c = "03";
    }
}
