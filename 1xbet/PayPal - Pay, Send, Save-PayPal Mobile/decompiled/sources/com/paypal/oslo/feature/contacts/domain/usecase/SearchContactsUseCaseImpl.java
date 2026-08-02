package com.paypal.oslo.feature.contacts.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/contacts/domain/usecase/SearchContactsUseCaseImpl;", "Lcom/paypal/oslo/feature/contacts/api/usecase/SearchContactsUseCase;", "Lcom/paypal/oslo/feature/contacts/domain/repository/ContactSearchRepository;", "contactSearchRepository", "<init>", "(Lcom/paypal/oslo/feature/contacts/domain/repository/ContactSearchRepository;)V", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchType;", com.paypal.oslo.feature.contacts.domain.constants.ContactsConstants.Log.Attributes.SEARCH_TYPE, "", "query", "", "limit", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;", "contactSearchNetworkType", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchError;", "", "Lcom/paypal/oslo/feature/contacts/api/ContactSearchContactItem;", "invoke", "(Lcom/paypal/oslo/feature/contacts/api/domain/ContactSearchType;Ljava/lang/String;ILcom/paypal/oslo/feature/contacts/api/ContactSearchNetworkType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/contacts/domain/repository/ContactSearchRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchContactsUseCaseImpl implements com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SearchContactsUseCaseImpl(com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository contactSearchRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(contactSearchRepository, "");
        this.getHighSpeedVideoFpsRangesFor = contactSearchRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.contacts.api.domain.ContactSearchType contactSearchType, java.lang.String str, int i, com.paypal.oslo.feature.contacts.api.ContactSearchNetworkType contactSearchNetworkType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.contacts.api.domain.ContactSearchError, ? extends java.util.List<? extends com.paypal.oslo.feature.contacts.api.ContactSearchContactItem>>> continuation) {
        com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1 searchContactsUseCaseImpl$invoke$1;
        int i2;
        arrow.core.Ior ior;
        if (continuation instanceof com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1) {
            searchContactsUseCaseImpl$invoke$1 = (com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1) continuation;
            if ((searchContactsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                searchContactsUseCaseImpl$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1 searchContactsUseCaseImpl$invoke$12 = searchContactsUseCaseImpl$invoke$1;
                java.lang.Object obj = searchContactsUseCaseImpl$invoke$12.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = searchContactsUseCaseImpl$invoke$12.getHighSpeedVideoFpsRanges;
                if (i2 != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository contactSearchRepository = this.getHighSpeedVideoFpsRangesFor;
                    searchContactsUseCaseImpl$invoke$12.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactSearchType);
                    searchContactsUseCaseImpl$invoke$12.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    searchContactsUseCaseImpl$invoke$12.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(contactSearchNetworkType);
                    searchContactsUseCaseImpl$invoke$12.getHighSpeedVideoFpsRangesFor = i;
                    searchContactsUseCaseImpl$invoke$12.getHighSpeedVideoFpsRanges = 1;
                    obj = contactSearchRepository.searchContacts(contactSearchType, str, i, contactSearchNetworkType, searchContactsUseCaseImpl$invoke$12);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = searchContactsUseCaseImpl$invoke$12.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                ior = (arrow.core.Ior) obj;
                if (!(ior instanceof arrow.core.Ior.Left)) {
                    return arrow.core.EitherKt.left(com.paypal.oslo.feature.contacts.api.domain.ContactSearchError.Failed.INSTANCE);
                }
                if (ior instanceof arrow.core.Ior.Right) {
                    return arrow.core.EitherKt.right(((arrow.core.Ior.Right) ior).getValue());
                }
                if (ior instanceof arrow.core.Ior.Both) {
                    return arrow.core.EitherKt.right(((arrow.core.Ior.Both) ior).getRightValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        searchContactsUseCaseImpl$invoke$1 = new com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1(this, continuation);
        com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl$invoke$1 searchContactsUseCaseImpl$invoke$122 = searchContactsUseCaseImpl$invoke$1;
        java.lang.Object obj2 = searchContactsUseCaseImpl$invoke$122.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = searchContactsUseCaseImpl$invoke$122.getHighSpeedVideoFpsRanges;
        if (i2 != 0) {
        }
        ior = (arrow.core.Ior) obj2;
        if (!(ior instanceof arrow.core.Ior.Left)) {
        }
    }
}
