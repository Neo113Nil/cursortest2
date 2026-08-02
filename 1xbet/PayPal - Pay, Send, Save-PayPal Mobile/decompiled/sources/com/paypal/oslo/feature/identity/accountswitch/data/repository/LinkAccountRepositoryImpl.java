package com.paypal.oslo.feature.identity.accountswitch.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/accountswitch/data/repository/LinkAccountRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/accountswitch/domain/repository/LinkAccountRepository;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;)V", "Lcom/paypal/oslo/core/userstore/model/ProfileIntent;", "intent", "", "refreshUserStore", "(Lcom/paypal/oslo/core/userstore/model/ProfileIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/core/userstore/model/UserState;", "observeUserState", "()Lkotlinx/coroutines/flow/Flow;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LinkAccountRepositoryImpl implements com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public LinkAccountRepositoryImpl(com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = userStore;
    }

    @Override // com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository
    public final java.lang.Object refreshUserStore(com.paypal.oslo.core.userstore.model.ProfileIntent profileIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object refresh = this.getHighResolutionOutputSizeshNQ4ISI.refresh(profileIntent, continuation);
        return refresh == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? refresh : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.accountswitch.domain.repository.LinkAccountRepository
    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.core.userstore.model.UserState> observeUserState() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getUserState();
    }
}
