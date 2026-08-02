package com.paypal.oslo.feature.verificationcapture.config;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0087@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/config/FaceTecConfig;", "", "<init>", "()V", "", "getSessionToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FaceTecConfig {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.verificationcapture.config.FaceTecConfig INSTANCE = new com.paypal.oslo.feature.verificationcapture.config.FaceTecConfig();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "This is a placeholder. Integrate with your verification backend to obtain session tokens instead.", replaceWith = @kotlin.ReplaceWith(expression = "yourRepository.getSessionToken()", imports = {}))
    public final java.lang.Object getSessionToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return null;
    }

    private FaceTecConfig() {
    }
}
