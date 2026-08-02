package com.paypal.oslo.feature.cashin.manager;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\fB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cashin/manager/ExperimentsManagerImpl;", "Lcom/paypal/oslo/feature/cashin/manager/ExperimentsManager;", "Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;", "experimentation", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;)V", "", "getSampleExperiment", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;", "getHighResolutionOutputSizeshNQ4ISI", "Experiments"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ExperimentsManagerImpl implements com.paypal.oslo.feature.cashin.manager.ExperimentsManager {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.contract.Experimentation getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public ExperimentsManagerImpl(com.paypal.oslo.core.remoteconfig.contract.Experimentation experimentation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(experimentation, "");
        this.getHighResolutionOutputSizeshNQ4ISI = experimentation;
    }

    @Override // com.paypal.oslo.feature.cashin.manager.ExperimentsManager
    public final java.lang.String getSampleExperiment() {
        return (java.lang.String) this.getHighResolutionOutputSizeshNQ4ISI.getExperimentValue((com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey) com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments.getHighSpeedVideoSizes.getValue(com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments.INSTANCE, com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments.getHighResolutionOutputSizeshNQ4ISI[0]));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048GX\u0086\u0084\u0002¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cashin/manager/ExperimentsManagerImpl$Experiments;", "Lcom/paypal/oslo/core/remoteconfig/contract/ExperimentationSpec;", "<init>", "()V", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "", "getHighSpeedVideoFpsRanges", "Lkotlin/properties/ReadOnlyProperty;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Experiments extends com.paypal.oslo.core.remoteconfig.contract.ExperimentationSpec {
        public static final com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments INSTANCE;
        static final /* synthetic */ kotlin.reflect.KProperty<java.lang.Object>[] getHighResolutionOutputSizeshNQ4ISI = {kotlin.jvm.internal.Reflection.property1(new kotlin.jvm.internal.PropertyReference1Impl(com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments.class, "sampleExperimentKey", "getSampleExperimentKey()Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", 0))};

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        static final kotlin.properties.ReadOnlyProperty getHighSpeedVideoSizes;

        private Experiments() {
            super(com.paypal.oslo.feature.cashin.common.CashInConstants.RemoteConfig.DOMAIN, "experiment_name");
        }

        static {
            com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments experiments = new com.paypal.oslo.feature.cashin.manager.ExperimentsManagerImpl.Experiments();
            INSTANCE = experiments;
            getHighSpeedVideoSizes = experiments.create("Ctrl", "sample_experiment_key");
        }
    }
}
