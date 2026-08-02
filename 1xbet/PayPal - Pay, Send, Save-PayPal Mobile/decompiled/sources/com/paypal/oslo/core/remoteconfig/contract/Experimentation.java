package com.paypal.oslo.core.remoteconfig.contract;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/contract/Experimentation;", "", "Lcom/paypal/oslo/core/remoteconfig/contract/ExperimentationSpec;", "experiment", "", "isUserInExperiment", "(Lcom/paypal/oslo/core/remoteconfig/contract/ExperimentationSpec;)Z", "T", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;", "key", "getExperimentValue", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigAnyKey;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface Experimentation {
    <T> T getExperimentValue(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigAnyKey<T> key);

    boolean isUserInExperiment(com.paypal.oslo.core.remoteconfig.contract.ExperimentationSpec experiment);
}
