package eftpos;

/* loaded from: classes17.dex */
public class EFTPOSKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final eftpos.EFTPOSKernel f6725a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f6725a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public EFTPOSKernelProvider(java.lang.String str, java.lang.String str2) {
        this.f6725a = new eftpos.EFTPOSKernel();
        this.b = str;
        this.c = str2;
    }

    public EFTPOSKernelProvider() {
        this.f6725a = new eftpos.EFTPOSKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_EFTPOS_A00000038410;
        this.c = "0B";
    }
}
