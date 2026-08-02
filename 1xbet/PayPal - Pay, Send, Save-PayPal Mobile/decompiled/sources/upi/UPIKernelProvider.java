package upi;

/* loaded from: classes18.dex */
public class UPIKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final upi.UPIKernel f7067a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f7067a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public UPIKernelProvider(java.lang.String str, java.lang.String str2) {
        this.f7067a = new upi.UPIKernel();
        this.b = str;
        this.c = str2;
    }

    public UPIKernelProvider() {
        this.f7067a = new upi.UPIKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_CUP_A000000333010101;
        this.c = "07";
    }
}
