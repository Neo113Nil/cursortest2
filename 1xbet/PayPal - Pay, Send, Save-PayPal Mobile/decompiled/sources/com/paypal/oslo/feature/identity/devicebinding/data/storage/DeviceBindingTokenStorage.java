package com.paypal.oslo.feature.identity.devicebinding.data.storage;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0006H¦@¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/storage/DeviceBindingTokenStorage;", "", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "saveBindingToken", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBindingToken", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearBindingToken", "clearAllBindingTokens", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface DeviceBindingTokenStorage {
    java.lang.Object clearAllBindingTokens(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object clearBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object getBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object saveBindingToken(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod, java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
