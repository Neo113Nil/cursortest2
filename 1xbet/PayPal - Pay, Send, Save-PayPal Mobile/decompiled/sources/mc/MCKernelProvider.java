package mc;

/* loaded from: classes17.dex */
public class MCKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final mc.MCKernel f6944a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f6944a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public MCKernelProvider(java.lang.String str, java.lang.String str2) {
        this.f6944a = new mc.MCKernel();
        this.b = str;
        this.c = str2;
    }

    public MCKernelProvider() {
        this.f6944a = new mc.MCKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_MASTER_A0000000041010;
        this.c = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_KERNEL_ID_MASTERCARD;
    }
}
