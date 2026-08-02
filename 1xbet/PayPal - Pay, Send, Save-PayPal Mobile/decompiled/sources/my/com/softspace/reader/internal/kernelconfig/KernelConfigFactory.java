package my.com.softspace.reader.internal.kernelconfig;

/* loaded from: classes17.dex */
public class KernelConfigFactory {
    private static final my.com.softspace.reader.internal.kernelconfig.KernelConfigFactory getHighResolutionOutputSizeshNQ4ISI = new my.com.softspace.reader.internal.kernelconfig.KernelConfigFactory();
    private my.com.softspace.reader.internal.kernelconfig.KernelConfigGenerator getHighSpeedVideoFpsRangesFor = new my.com.softspace.reader.internal.kernelconfig.KernelConfigContactless();

    public static my.com.softspace.reader.internal.kernelconfig.KernelConfigFactory getInstance() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private KernelConfigFactory() {
    }

    public my.com.softspace.reader.internal.kernelconfig.KernelConfig getDefaultConfiguration(android.content.Context context, int i, my.com.softspace.reader.TransactionConfigurations transactionConfigurations) {
        return this.getHighSpeedVideoFpsRangesFor.generate(context, i, transactionConfigurations);
    }
}
