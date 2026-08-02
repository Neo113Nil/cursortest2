package pure;

/* loaded from: classes18.dex */
public class PureKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final pure.PureKernel f7061a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f7061a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public PureKernelProvider(pure.PureKernel pureKernel) {
        this.f7061a = pureKernel;
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_MCCS_A0000006150001;
        this.c = "0A";
    }

    public PureKernelProvider(java.lang.String str, java.lang.String str2, pure.PureKernel pureKernel) {
        this.f7061a = pureKernel;
        this.b = str;
        this.c = str2;
    }

    public PureKernelProvider() {
        this.f7061a = new pure.PureKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_MCCS_A0000006150001;
        this.c = "0A";
    }
}
