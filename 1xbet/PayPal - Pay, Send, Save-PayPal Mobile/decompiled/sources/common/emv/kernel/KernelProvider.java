package common.emv.kernel;

/* loaded from: classes17.dex */
public interface KernelProvider {
    java.lang.String aid();

    java.lang.String kernelID();

    common.emv.kernel.Kernel provide();
}
