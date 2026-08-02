package com.paypal.oslo.feature.taptopay.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/repository/IntroPreferencesRepository;", "", "", "hasSeenAnyIntro", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;", "entryPoint", "", "setHasSeenIntro", "(Lcom/paypal/oslo/feature/taptopay/api/navigation/SetupFlowDestination$EntryPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IntroPreferencesRepository {
    java.lang.Object hasSeenAnyIntro(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object setHasSeenIntro(com.paypal.oslo.feature.taptopay.api.navigation.SetupFlowDestination.EntryPoint entryPoint, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
