package amex;

/* loaded from: classes5.dex */
public class AMEXKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final amex.AMEXKernel f2657a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f2657a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public AMEXKernelProvider(java.lang.String str, java.lang.String str2) {
        this.f2657a = new amex.AMEXKernel();
        this.b = str;
        this.c = str2;
    }

    public AMEXKernelProvider() {
        this.f2657a = new amex.AMEXKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_AMEX_A00000002501;
        this.c = "04";
    }
}
