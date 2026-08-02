package jcb;

/* loaded from: classes17.dex */
public class JCBKernelProvider implements common.emv.kernel.KernelProvider {

    /* renamed from: a, reason: collision with root package name */
    public final jcb.JCBKernel f6911a;
    public final java.lang.String b;
    public final java.lang.String c;

    @Override // common.emv.kernel.KernelProvider
    public common.emv.kernel.Kernel provide() {
        return this.f6911a;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String kernelID() {
        return this.c;
    }

    @Override // common.emv.kernel.KernelProvider
    public java.lang.String aid() {
        return this.b;
    }

    public JCBKernelProvider(java.lang.String str, java.lang.String str2) {
        this.f6911a = new jcb.JCBKernel();
        this.b = str;
        this.c = str2;
    }

    public JCBKernelProvider() {
        this.f6911a = new jcb.JCBKernel();
        this.b = my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_AID_JCB_A0000000651010;
        this.c = "05";
    }
}
