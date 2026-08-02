package com.paypal.oslo.feature.consumerprivacy.domain.repository;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/PersonalizedAdsRepository;", "", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/DataResultError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/PersonalizedAdsPreference;", "getPersonalizedAdsPreference", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "enabled", "updatePersonalizedAdsPreference", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface PersonalizedAdsRepository {
    java.lang.Object getPersonalizedAdsPreference(kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, com.paypal.oslo.feature.consumerprivacy.domain.model.PersonalizedAdsPreference>> continuation);

    java.lang.Object updatePersonalizedAdsPreference(boolean z, kotlin.coroutines.Continuation<? super arrow.core.Ior<? extends com.paypal.oslo.feature.consumerprivacy.domain.model.DataResultError, java.lang.Boolean>> continuation);
}
