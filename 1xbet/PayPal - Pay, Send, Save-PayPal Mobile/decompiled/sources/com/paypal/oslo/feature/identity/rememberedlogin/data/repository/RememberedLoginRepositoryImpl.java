package com.paypal.oslo.feature.identity.rememberedlogin.data.repository;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\u000e\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u000e\u0010\nJ\u001e\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/data/repository/RememberedLoginRepositoryImpl;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/repository/RememberedLoginRepository;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "<init>", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;)V", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedLoginError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedUser;", "getRememberedUser", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "clearRememberedUserProfile", "", "hasRememberedUser", "", "Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyAllowedCredential;", "allowedCredentials", "updateAllowedCredentials", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;", "loginType", "saveLoginType", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "publicCredential", "saveVerifiedCredential", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RememberedLoginRepositoryImpl implements com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public RememberedLoginRepositoryImpl(com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rememberedUserStorageWithProfile, "");
        this.getHighSpeedVideoFpsRangesFor = rememberedUserStorageWithProfile;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRememberedUser(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser>> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl$getRememberedUser$1 rememberedLoginRepositoryImpl$getRememberedUser$1;
        int i;
        arrow.core.Either either;
        arrow.core.Either.Right right;
        java.util.ArrayList arrayList;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl$getRememberedUser$1) {
            rememberedLoginRepositoryImpl$getRememberedUser$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl$getRememberedUser$1) continuation;
            if ((rememberedLoginRepositoryImpl$getRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                rememberedLoginRepositoryImpl$getRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = rememberedLoginRepositoryImpl$getRememberedUser$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedLoginRepositoryImpl$getRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile = this.getHighSpeedVideoFpsRangesFor;
                    rememberedLoginRepositoryImpl$getRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = rememberedUserStorageWithProfile.getRememberedUser(rememberedLoginRepositoryImpl$getRememberedUser$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Left)) {
                    right = new arrow.core.Either.Left((com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError) ((arrow.core.Either.Left) either).getValue());
                } else {
                    if (!(either instanceof arrow.core.Either.Right)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    right = new arrow.core.Either.Right(((arrow.core.Either.Right) either).getValue());
                }
                if (!(right instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) ((arrow.core.Either.Right) right).getValue();
                    java.lang.String displayName = rememberedUserData.getDisplayName();
                    java.lang.String publicCredential = rememberedUserData.getPublicCredential();
                    java.lang.String avatarUrl = rememberedUserData.getAvatarUrl();
                    java.lang.String userId = rememberedUserData.getUserId();
                    java.util.List<com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData> allowedCredentials = rememberedUserData.getAllowedCredentials();
                    if (allowedCredentials != null) {
                        java.util.List<com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData> list = allowedCredentials;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                        java.util.Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.paypal.oslo.feature.identity.rememberedlogin.data.mapper.PasskeyCredentialMapperKt.toDomain((com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData) it.next()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    return new arrow.core.Either.Right(new com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedUser(displayName, publicCredential, avatarUrl, userId, arrayList, rememberedUserData.getLoginType(), rememberedUserData.getPrimaryPhone()));
                }
                if (right instanceof arrow.core.Either.Left) {
                    return right;
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        rememberedLoginRepositoryImpl$getRememberedUser$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.repository.RememberedLoginRepositoryImpl$getRememberedUser$1(this, continuation);
        java.lang.Object obj2 = rememberedLoginRepositoryImpl$getRememberedUser$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedLoginRepositoryImpl$getRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Left)) {
        }
        if (!(right instanceof arrow.core.Either.Right)) {
        }
    }

    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository
    public final java.lang.Object clearRememberedUserProfile(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object clearProfileFromStorage = this.getHighSpeedVideoFpsRangesFor.clearProfileFromStorage(continuation);
        return clearProfileFromStorage == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearProfileFromStorage : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository
    public final java.lang.Object hasRememberedUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.getHighSpeedVideoFpsRangesFor.hasRememberedUser(continuation);
    }

    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository
    public final java.lang.Object updateAllowedCredentials(java.util.List<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.List<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.identity.rememberedlogin.data.mapper.PasskeyCredentialMapperKt.toData((com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential) it.next()));
        }
        java.lang.Object updateAllowedCredentials = this.getHighSpeedVideoFpsRangesFor.updateAllowedCredentials(arrayList, continuation);
        return updateAllowedCredentials == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? updateAllowedCredentials : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository
    public final java.lang.Object saveLoginType(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object saveLoginType = this.getHighSpeedVideoFpsRangesFor.saveLoginType(loginType, continuation);
        return saveLoginType == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveLoginType : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.rememberedlogin.domain.repository.RememberedLoginRepository
    public final java.lang.Object saveVerifiedCredential(java.lang.String str, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object savePublicCredentialWithLoginType = this.getHighSpeedVideoFpsRangesFor.savePublicCredentialWithLoginType(str, loginType, continuation);
        return savePublicCredentialWithLoginType == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? savePublicCredentialWithLoginType : kotlin.Unit.INSTANCE;
    }
}
