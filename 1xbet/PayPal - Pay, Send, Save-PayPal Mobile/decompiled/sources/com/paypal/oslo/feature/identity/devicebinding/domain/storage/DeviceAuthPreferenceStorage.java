package com.paypal.oslo.feature.identity.devicebinding.domain.storage;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/domain/storage/DeviceAuthPreferenceStorage;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "", "disabled", "", "setDisabledByUser", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isDisabledByUser", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeviceAuthPreferenceStorage {
    java.lang.Object isDisabledByUser(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object reset(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object setDisabledByUser(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
