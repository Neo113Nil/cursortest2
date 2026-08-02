package com.paypal.oslo.feature.identity.rememberedlogin.data.storage;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0096@¢\u0006\u0004\b\u000e\u0010\nJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082@¢\u0006\u0004\b\u000f\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u000f\u0010\u0012J\u0018\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0013H\u0082@¢\u0006\u0004\b\u000f\u0010\u0014J \u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\u001c\u0010\nJ\u0010\u0010\u001d\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u001d\u0010\nJ\u001c\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0082@¢\u0006\u0004\b\u001e\u0010\nJ\u001e\u0010\"\u001a\u00020\u00112\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0086@¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b$\u0010\u0014R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010("}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorageWithProfile;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/storage/RememberedUserStorage;", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/userstore/UserStore;Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "", "syncUserStoreProfileToAppStorage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/RememberedLoginError;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/model/RememberedUserData;", "getRememberedUser", "getHighSpeedVideoSizes", "p0", "", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/data/model/RememberedUserData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "publicCredential", "loginType", "savePublicCredentialWithLoginType", "(Ljava/lang/String;Lcom/paypal/oslo/feature/identity/rememberedlogin/domain/model/LoginType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "savePublicCredentialOnly", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearProfileFromStorage", "hasRememberedUser", "getHighResolutionOutputSizeshNQ4ISI", "", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/model/PasskeyAllowedCredentialData;", "allowedCredentials", "updateAllowedCredentials", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLoginType", "getOutputFormats", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizesFor", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RememberedUserStorageWithProfile implements com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorage {

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage Camera2StreamConfigurationMap;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;
    public static final int $stable = 8;
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("remembered_user_display_name");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getInputSizeshNQ4ISI = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("remembered_user_public_credential");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getInputFormats = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("remembered_user_id");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("remembered_user_avatar_url");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("remembered_user_allowed_credentials");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighSpeedVideoSizes = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("remembered_user_login_type");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted Camera2StreamConfigurationMap = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("remembered_user_primary_phone");

    @javax.inject.Inject
    public RememberedUserStorageWithProfile(com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoSizes = userStore;
        this.Camera2StreamConfigurationMap = appStorage;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(1:18))(2:51|52)|19|(11:21|22|(1:24)|25|(1:27)(1:45)|28|(1:30)(1:44)|31|(2:43|(2:36|(2:38|39)(3:40|13|14)))|34|(0))(2:46|(1:48)(2:49|50))|41|13|14))|56|6|7|(0)(0)|19|(0)(0)|41|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0070, code lost:
    
        if (r0 != r3) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x012e, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to sync user profile to storage", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[Catch: Exception -> 0x012d, TRY_LEAVE, TryCatch #0 {Exception -> 0x012d, blocks: (B:12:0x0054, B:18:0x0061, B:19:0x0072, B:21:0x0078, B:25:0x008a, B:28:0x0092, B:30:0x00a0, B:31:0x00a6, B:36:0x00b9, B:46:0x0119, B:48:0x011d, B:49:0x0126, B:50:0x012b, B:52:0x0068), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b9 A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:12:0x0054, B:18:0x0061, B:19:0x0072, B:21:0x0078, B:25:0x008a, B:28:0x0092, B:30:0x00a0, B:31:0x00a6, B:36:0x00b9, B:46:0x0119, B:48:0x011d, B:49:0x0126, B:50:0x012b, B:52:0x0068), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0119 A[Catch: Exception -> 0x012d, TryCatch #0 {Exception -> 0x012d, blocks: (B:12:0x0054, B:18:0x0061, B:19:0x0072, B:21:0x0078, B:25:0x008a, B:28:0x0092, B:30:0x00a0, B:31:0x00a6, B:36:0x00b9, B:46:0x0119, B:48:0x011d, B:49:0x0126, B:50:0x012b, B:52:0x0068), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object syncUserStoreProfileToAppStorage(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1 rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1;
        int i;
        arrow.core.Either either;
        int i2;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1) {
            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1) continuation;
            if ((rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDurationlomOqCM -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDurationlomOqCM;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.userstore.UserStore userStore = this.getHighSpeedVideoSizes;
                    rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDurationlomOqCM = 1;
                    obj = com.paypal.oslo.core.userstore.UserStoreExtensionsKt.awaitUser(userStore, rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i3 = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighSpeedVideoFpsRanges;
                        int i5 = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    com.paypal.oslo.core.userstore.model.User user = (com.paypal.oslo.core.userstore.model.User) ((arrow.core.Either.Right) either).getValue();
                    java.lang.String fullName = user.getFullName();
                    java.lang.String str = "";
                    if (fullName == null) {
                        fullName = "";
                    }
                    java.lang.String primaryEmail = user.getPrimaryEmail();
                    if (primaryEmail != null) {
                        str = primaryEmail;
                    }
                    java.lang.String id = user.getId();
                    java.lang.String profileImageURL = user.getProfileImageURL();
                    com.paypal.oslo.core.userstore.model.ProfilePhone primaryMobilePhone = user.getPrimaryMobilePhone();
                    java.lang.String maskedPhoneNumber = primaryMobilePhone != null ? primaryMobilePhone.getMaskedPhoneNumber() : null;
                    if (str.length() <= 0 && maskedPhoneNumber == null) {
                        i2 = 0;
                        if (i2 != 0) {
                            com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData rememberedUserData = new com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData(fullName, str, profileImageURL, id, (java.util.List) null, (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType) null, maskedPhoneNumber, 48, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fullName);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileImageURL);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maskedPhoneNumber);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputStallDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rememberedUserData);
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighSpeedVideoSizes = 0;
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighSpeedVideoFpsRanges = 0;
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getHighResolutionOutputSizeshNQ4ISI = i2;
                            rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDurationlomOqCM = 2;
                            if (getHighSpeedVideoSizes(rememberedUserData, rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            z = true;
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                        }
                    }
                    i2 = 1;
                    if (i2 != 0) {
                    }
                } else {
                    if (!(either instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                }
                z = false;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$syncUserStoreProfileToAppStorage$1.getOutputMinFrameDurationlomOqCM;
        boolean z2 = true;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
        z2 = false;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0046, code lost:
    
        if (r6 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorage
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getRememberedUser(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError, com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData>> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUser$1 rememberedUserStorageWithProfile$getRememberedUser$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUser$1) {
            rememberedUserStorageWithProfile$getRememberedUser$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUser$1) continuation;
            if ((rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$getRememberedUser$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = getHighResolutionOutputSizeshNQ4ISI(rememberedUserStorageWithProfile$getRememberedUser$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!either.isRight()) {
                    return either;
                }
                rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoFpsRangesFor = 2;
                java.lang.Object highSpeedVideoSizes = getHighSpeedVideoSizes(rememberedUserStorageWithProfile$getRememberedUser$1);
                return highSpeedVideoSizes == coroutine_suspended ? coroutine_suspended : highSpeedVideoSizes;
            }
        }
        rememberedUserStorageWithProfile$getRememberedUser$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUser$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$getRememberedUser$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$getRememberedUser$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!either.isRight()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError, com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData>> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1 rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1;
        int i;
        java.lang.String fullName;
        java.lang.String primaryEmail;
        int i2;
        com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData rememberedUserData;
        com.paypal.oslo.core.userstore.model.ProfileName.PersonName personName;
        try {
            if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1) {
                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1) continuation;
                if ((rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputStallDurationlomOqCM & Integer.MIN_VALUE) != 0) {
                    rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputStallDurationlomOqCM -= 2147483648;
                    java.lang.Object obj = rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputSizeshNQ4ISI;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputStallDurationlomOqCM;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
                        if (!(value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded)) {
                            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.UserNotFound.INSTANCE);
                        }
                        com.paypal.oslo.core.userstore.model.User user = ((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser();
                        com.paypal.oslo.core.userstore.model.ProfileName legalName = user.getLegalName();
                        java.lang.String str = "";
                        if ((legalName == null || (personName = legalName.getPersonName()) == null || (fullName = personName.getFullName()) == null) && (fullName = user.getFullName()) == null) {
                            fullName = "";
                        }
                        com.paypal.oslo.core.userstore.model.ProfileEmail primaryEmailAddress = user.getPrimaryEmailAddress();
                        if ((primaryEmailAddress != null && (primaryEmail = primaryEmailAddress.getEmailAddress()) != null) || (primaryEmail = user.getPrimaryEmail()) != null) {
                            str = primaryEmail;
                        }
                        java.lang.String id = user.getId();
                        java.lang.String profileImageURL = user.getProfileImageURL();
                        com.paypal.oslo.core.userstore.model.ProfilePhone primaryMobilePhone = user.getPrimaryMobilePhone();
                        java.lang.String maskedPhoneNumber = primaryMobilePhone != null ? primaryMobilePhone.getMaskedPhoneNumber() : null;
                        if (str.length() <= 0 && maskedPhoneNumber == null) {
                            i2 = 0;
                            if (fullName.length() <= 0 && i2 != 0 && id.length() > 0) {
                                com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType = str.length() > 0 ? com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.EMAIL : com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.PHONE;
                                com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData rememberedUserData2 = new com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData(fullName, str, profileImageURL, id, (java.util.List) null, loginType, maskedPhoneNumber, 16, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(user);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(fullName);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(id);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(profileImageURL);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(maskedPhoneNumber);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginType);
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputFormats = rememberedUserData2;
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getHighSpeedVideoFpsRanges = i2;
                                rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputStallDurationlomOqCM = 1;
                                if (getHighSpeedVideoSizes(rememberedUserData2, rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                rememberedUserData = rememberedUserData2;
                            } else {
                                return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.UserNotFound.INSTANCE);
                            }
                        }
                        i2 = 1;
                        if (fullName.length() <= 0) {
                        }
                        return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.UserNotFound.INSTANCE);
                    }
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i3 = rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getHighSpeedVideoFpsRanges;
                    rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputFormats;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return arrow.core.EitherKt.right(rememberedUserData);
                }
            }
            if (i != 0) {
            }
            return arrow.core.EitherKt.right(rememberedUserData);
        } catch (java.lang.Exception e) {
            com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to get remembered user from UserStore", e);
            return arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.UserNotFound.INSTANCE);
        }
        rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromUserStore$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$getRememberedUserFromUserStore$1.getOutputStallDurationlomOqCM;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|77|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x01d2, code lost:
    
        if (r9.setString(r2, r3, r0) == r1) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01ac, code lost:
    
        if (r9 != r1) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d5, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01d6, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to save profile to storage", r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x016c A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0187 A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0147 A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00dd A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4 A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[Catch: Exception -> 0x01d5, TryCatch #0 {Exception -> 0x01d5, blocks: (B:13:0x0031, B:17:0x003a, B:18:0x01ae, B:20:0x01b6, B:24:0x0043, B:25:0x019e, B:29:0x005d, B:30:0x0166, B:32:0x016c, B:35:0x0187, B:40:0x0066, B:41:0x0107, B:43:0x010e, B:46:0x0147, B:50:0x006f, B:51:0x00d7, B:53:0x00dd, B:56:0x00f4, B:60:0x0077, B:61:0x00c0, B:65:0x007f, B:66:0x009d, B:68:0x00a9, B:72:0x0086), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData rememberedUserData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveProfileToStorage$1 rememberedUserStorageWithProfile$saveProfileToStorage$1;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted;
        java.lang.String userId;
        java.util.List<com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData> allowedCredentials;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveProfileToStorage$1) {
            rememberedUserStorageWithProfile$saveProfileToStorage$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveProfileToStorage$1) continuation;
            if ((rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$saveProfileToStorage$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighSpeedVideoFpsRanges;
                        java.lang.String displayName = rememberedUserData.getDisplayName();
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 1;
                        if (appStorage2.setString(unencrypted, displayName, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (rememberedUserData.getPublicCredential().length() > 0) {
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted2 = getInputSizeshNQ4ISI;
                            java.lang.String publicCredential = rememberedUserData.getPublicCredential();
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 2;
                            if (appStorage3.setString(encrypted2, publicCredential, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        appStorage = this.Camera2StreamConfigurationMap;
                        encrypted = getInputFormats;
                        userId = rememberedUserData.getUserId();
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 3;
                        if (appStorage.setString(encrypted, userId, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        if (rememberedUserData.getAvatarUrl() == null) {
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage4 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = getHighSpeedVideoFpsRangesFor;
                            java.lang.String avatarUrl = rememberedUserData.getAvatarUrl();
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 4;
                            if (appStorage4.setString(unencrypted2, avatarUrl, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            allowedCredentials = rememberedUserData.getAllowedCredentials();
                            if (allowedCredentials != null) {
                                kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                                companion.getSerializersModule();
                                java.lang.String encodeToString = companion.encodeToString(new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData.INSTANCE.serializer()), allowedCredentials);
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage5 = this.Camera2StreamConfigurationMap;
                                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted3 = getHighResolutionOutputSizeshNQ4ISI;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(allowedCredentials);
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoSizes = 0;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 6;
                                if (appStorage5.setString(encrypted3, encodeToString, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (rememberedUserData.getPrimaryPhone() == null) {
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage6 = this.Camera2StreamConfigurationMap;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4 = Camera2StreamConfigurationMap;
                                    java.lang.String primaryPhone = rememberedUserData.getPrimaryPhone();
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRangesFor = null;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.Camera2StreamConfigurationMap = null;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 8;
                                    if (appStorage6.setString(encrypted4, primaryPhone, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType = rememberedUserData.getLoginType();
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 10;
                                    obj = getHighSpeedVideoSizes(loginType, rememberedUserStorageWithProfile$saveProfileToStorage$1);
                                    break;
                                } else {
                                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage7 = this.Camera2StreamConfigurationMap;
                                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted5 = Camera2StreamConfigurationMap;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRangesFor = null;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.Camera2StreamConfigurationMap = null;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 9;
                                    if (appStorage7.remove(encrypted5, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType2 = rememberedUserData.getLoginType();
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                                    rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 10;
                                    obj = getHighSpeedVideoSizes(loginType2, rememberedUserStorageWithProfile$saveProfileToStorage$1);
                                }
                            } else {
                                com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile = this;
                                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage8 = this.Camera2StreamConfigurationMap;
                                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted6 = getHighResolutionOutputSizeshNQ4ISI;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(this);
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.Camera2StreamConfigurationMap = null;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoSizes = 0;
                                rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 7;
                                if (appStorage8.remove(encrypted6, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                if (rememberedUserData.getPrimaryPhone() == null) {
                                }
                            }
                        } else {
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage9 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted3 = getHighSpeedVideoFpsRangesFor;
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 5;
                            if (appStorage9.remove(unencrypted3, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            allowedCredentials = rememberedUserData.getAllowedCredentials();
                            if (allowedCredentials != null) {
                            }
                        }
                    case 1:
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (rememberedUserData.getPublicCredential().length() > 0) {
                        }
                        appStorage = this.Camera2StreamConfigurationMap;
                        encrypted = getInputFormats;
                        userId = rememberedUserData.getUserId();
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 3;
                        if (appStorage.setString(encrypted, userId, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                        }
                        if (rememberedUserData.getAvatarUrl() == null) {
                        }
                        break;
                    case 2:
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        appStorage = this.Camera2StreamConfigurationMap;
                        encrypted = getInputFormats;
                        userId = rememberedUserData.getUserId();
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 3;
                        if (appStorage.setString(encrypted, userId, rememberedUserStorageWithProfile$saveProfileToStorage$1) == coroutine_suspended) {
                        }
                        if (rememberedUserData.getAvatarUrl() == null) {
                        }
                        break;
                    case 3:
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (rememberedUserData.getAvatarUrl() == null) {
                        }
                        break;
                    case 4:
                    case 5:
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        allowedCredentials = rememberedUserData.getAllowedCredentials();
                        if (allowedCredentials != null) {
                        }
                        break;
                    case 6:
                        int i = rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoSizes;
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (rememberedUserData.getPrimaryPhone() == null) {
                        }
                        break;
                    case 7:
                        int i2 = rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoSizes;
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (rememberedUserData.getPrimaryPhone() == null) {
                        }
                        break;
                    case 8:
                    case 9:
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType22 = rememberedUserData.getLoginType();
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = rememberedUserData;
                        rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 10;
                        obj = getHighSpeedVideoSizes(loginType22, rememberedUserStorageWithProfile$saveProfileToStorage$1);
                        break;
                    case 10:
                        rememberedUserData = (com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData) rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (((java.lang.Boolean) obj).booleanValue()) {
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage10 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted4 = getHighSpeedVideoSizes;
                            java.lang.String name2 = rememberedUserData.getLoginType().name();
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rememberedUserData);
                            rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges = 11;
                            break;
                        }
                        return kotlin.Unit.INSTANCE;
                    case 11:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rememberedUserStorageWithProfile$saveProfileToStorage$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveProfileToStorage$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$saveProfileToStorage$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rememberedUserStorageWithProfile$saveProfileToStorage$1.getHighSpeedVideoFpsRanges) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$shouldUpdateLoginType$1 rememberedUserStorageWithProfile$shouldUpdateLoginType$1;
        java.lang.Object obj;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$shouldUpdateLoginType$1) {
            rememberedUserStorageWithProfile$shouldUpdateLoginType$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$shouldUpdateLoginType$1) continuation;
            if ((rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                obj = rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighResolutionOutputSizeshNQ4ISI;
                boolean z = true;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (loginType == com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.EMAIL) {
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginType);
                        rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                        obj = appStorage.getString(unencrypted, rememberedUserStorageWithProfile$shouldUpdateLoginType$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
                }
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                if (obj != null) {
                    z = false;
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        rememberedUserStorageWithProfile$shouldUpdateLoginType$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$shouldUpdateLoginType$1(this, continuation);
        obj = rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$shouldUpdateLoginType$1.getHighResolutionOutputSizeshNQ4ISI;
        boolean z2 = true;
        if (i != 0) {
        }
        if (obj != null) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(3:23|24|(2:26|22))|20))|29|6|7|(0)(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r9.setString(r2, r4, r0) != r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to save verified credential", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object savePublicCredentialWithLoginType(java.lang.String str, com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1 rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1) {
            rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1) continuation;
            if ((rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted = getInputSizeshNQ4ISI;
                    rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighSpeedVideoFpsRangesFor = loginType;
                    rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    if (appStorage.setString(encrypted, str, rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    loginType = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType) rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighSpeedVideoFpsRangesFor;
                    str = (java.lang.String) rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighSpeedVideoSizes;
                java.lang.String name2 = loginType.name();
                rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginType);
                rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI = 2;
            }
        }
        rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage22 = this.Camera2StreamConfigurationMap;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = getHighSpeedVideoSizes;
        java.lang.String name22 = loginType.name();
        rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
        rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginType);
        rememberedUserStorageWithProfile$savePublicCredentialWithLoginType$1.getHighResolutionOutputSizeshNQ4ISI = 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to save public credential", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object savePublicCredentialOnly(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialOnly$1 rememberedUserStorageWithProfile$savePublicCredentialOnly$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialOnly$1) {
            rememberedUserStorageWithProfile$savePublicCredentialOnly$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialOnly$1) continuation;
            if ((rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData rememberedUserData = new com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData(str, str, (java.lang.String) null, "", (java.util.List) null, (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType) null, (java.lang.String) null, 112, (kotlin.jvm.internal.DefaultConstructorMarker) null);
                    rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    rememberedUserStorageWithProfile$savePublicCredentialOnly$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(rememberedUserData);
                    rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoSizes = 1;
                    if (getHighSpeedVideoSizes(rememberedUserData, rememberedUserStorageWithProfile$savePublicCredentialOnly$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        rememberedUserStorageWithProfile$savePublicCredentialOnly$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$savePublicCredentialOnly$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$savePublicCredentialOnly$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|8))|45|6|7|8) */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00be, code lost:
    
        if (r5.remove(r2, r0) == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004b, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c1, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to clear profile from storage", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002c A[Catch: Exception -> 0x004b, TRY_ENTER, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[Catch: Exception -> 0x004b, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0047 A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #0 {Exception -> 0x004b, blocks: (B:12:0x002c, B:15:0x0031, B:16:0x00b1, B:19:0x0036, B:20:0x00a1, B:23:0x003b, B:24:0x0091, B:27:0x003f, B:28:0x0081, B:31:0x0043, B:32:0x0071, B:35:0x0047, B:36:0x0061, B:40:0x0051), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object clearProfileFromStorage(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$clearProfileFromStorage$1 rememberedUserStorageWithProfile$clearProfileFromStorage$1;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted2;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage4;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted3;
        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage5;
        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$clearProfileFromStorage$1) {
            rememberedUserStorageWithProfile$clearProfileFromStorage$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$clearProfileFromStorage$1) continuation;
            if ((rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage6 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted3 = getHighSpeedVideoFpsRanges;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 1;
                        if (appStorage6.remove(unencrypted3, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appStorage = this.Camera2StreamConfigurationMap;
                        encrypted = getInputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 2;
                        if (appStorage.remove(encrypted, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appStorage2 = this.Camera2StreamConfigurationMap;
                        encrypted2 = getInputFormats;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 3;
                        if (appStorage2.remove(encrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appStorage3 = this.Camera2StreamConfigurationMap;
                        unencrypted = getHighSpeedVideoFpsRangesFor;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 4;
                        if (appStorage3.remove(unencrypted, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appStorage4 = this.Camera2StreamConfigurationMap;
                        encrypted3 = getHighResolutionOutputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 5;
                        if (appStorage4.remove(encrypted3, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        appStorage5 = this.Camera2StreamConfigurationMap;
                        unencrypted2 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 6;
                        if (appStorage5.remove(unencrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage7 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 1:
                        kotlin.ResultKt.throwOnFailure(obj);
                        appStorage = this.Camera2StreamConfigurationMap;
                        encrypted = getInputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 2;
                        if (appStorage.remove(encrypted, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage2 = this.Camera2StreamConfigurationMap;
                        encrypted2 = getInputFormats;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 3;
                        if (appStorage2.remove(encrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage3 = this.Camera2StreamConfigurationMap;
                        unencrypted = getHighSpeedVideoFpsRangesFor;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 4;
                        if (appStorage3.remove(unencrypted, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage4 = this.Camera2StreamConfigurationMap;
                        encrypted3 = getHighResolutionOutputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 5;
                        if (appStorage4.remove(encrypted3, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage5 = this.Camera2StreamConfigurationMap;
                        unencrypted2 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 6;
                        if (appStorage5.remove(unencrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage72 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted42 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 2:
                        kotlin.ResultKt.throwOnFailure(obj);
                        appStorage2 = this.Camera2StreamConfigurationMap;
                        encrypted2 = getInputFormats;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 3;
                        if (appStorage2.remove(encrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage3 = this.Camera2StreamConfigurationMap;
                        unencrypted = getHighSpeedVideoFpsRangesFor;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 4;
                        if (appStorage3.remove(unencrypted, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage4 = this.Camera2StreamConfigurationMap;
                        encrypted3 = getHighResolutionOutputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 5;
                        if (appStorage4.remove(encrypted3, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage5 = this.Camera2StreamConfigurationMap;
                        unencrypted2 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 6;
                        if (appStorage5.remove(unencrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage722 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted422 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 3:
                        kotlin.ResultKt.throwOnFailure(obj);
                        appStorage3 = this.Camera2StreamConfigurationMap;
                        unencrypted = getHighSpeedVideoFpsRangesFor;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 4;
                        if (appStorage3.remove(unencrypted, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage4 = this.Camera2StreamConfigurationMap;
                        encrypted3 = getHighResolutionOutputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 5;
                        if (appStorage4.remove(encrypted3, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage5 = this.Camera2StreamConfigurationMap;
                        unencrypted2 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 6;
                        if (appStorage5.remove(unencrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage7222 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4222 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 4:
                        kotlin.ResultKt.throwOnFailure(obj);
                        appStorage4 = this.Camera2StreamConfigurationMap;
                        encrypted3 = getHighResolutionOutputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 5;
                        if (appStorage4.remove(encrypted3, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        appStorage5 = this.Camera2StreamConfigurationMap;
                        unencrypted2 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 6;
                        if (appStorage5.remove(unencrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage72222 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted42222 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 5:
                        kotlin.ResultKt.throwOnFailure(obj);
                        appStorage5 = this.Camera2StreamConfigurationMap;
                        unencrypted2 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 6;
                        if (appStorage5.remove(unencrypted2, rememberedUserStorageWithProfile$clearProfileFromStorage$1) == coroutine_suspended) {
                        }
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage722222 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted422222 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 6:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage7222222 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4222222 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor = 7;
                        break;
                    case 7:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rememberedUserStorageWithProfile$clearProfileFromStorage$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$clearProfileFromStorage$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (rememberedUserStorageWithProfile$clearProfileFromStorage$1.getHighSpeedVideoFpsRangesFor) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:10)(2:21|22))(3:23|24|(1:26))|11|(1:13)|20|15|16|17))|29|6|7|(0)(0)|11|(0)|20|15|16|17) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (r6.length() == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0055, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to check for remembered user", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b A[Catch: Exception -> 0x0054, TRY_LEAVE, TryCatch #0 {Exception -> 0x0054, blocks: (B:10:0x0027, B:11:0x0045, B:13:0x004b, B:24:0x0036), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object hasRememberedUser(kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$hasRememberedUser$1 rememberedUserStorageWithProfile$hasRememberedUser$1;
        int i;
        java.lang.String str;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$hasRememberedUser$1) {
            rememberedUserStorageWithProfile$hasRememberedUser$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$hasRememberedUser$1) continuation;
            if ((rememberedUserStorageWithProfile$hasRememberedUser$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$hasRememberedUser$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$hasRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$hasRememberedUser$1.getHighSpeedVideoFpsRanges;
                boolean z = false;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted = getInputSizeshNQ4ISI;
                    rememberedUserStorageWithProfile$hasRememberedUser$1.getHighSpeedVideoFpsRanges = 1;
                    obj = appStorage.getString(encrypted, rememberedUserStorageWithProfile$hasRememberedUser$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                str = (java.lang.String) obj;
                if (str != null) {
                }
                z = true;
                z = !z;
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z);
            }
        }
        rememberedUserStorageWithProfile$hasRememberedUser$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$hasRememberedUser$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$hasRememberedUser$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$hasRememberedUser$1.getHighSpeedVideoFpsRanges;
        boolean z2 = false;
        if (i != 0) {
        }
        str = (java.lang.String) obj2;
        if (str != null) {
        }
        z2 = true;
        z2 = !z2;
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0166, code lost:
    
        if (r15 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011d, code lost:
    
        if (r15 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        if (r15 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bd, code lost:
    
        if (r15 != r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0191 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError, com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData>> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromStorage$1 rememberedUserStorageWithProfile$getRememberedUserFromStorage$1;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.Object m23436constructorimpl;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType;
        java.lang.Object string;
        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType2;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.util.List list;
        java.lang.String str18;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromStorage$1) {
            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromStorage$1) continuation;
            if ((rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                boolean z = true;
                switch (rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighSpeedVideoFpsRanges;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 1;
                        obj = appStorage.getString(unencrypted, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        break;
                    case 1:
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str19 = (java.lang.String) obj;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage2 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted = getInputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str19;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 2;
                        java.lang.Object string2 = appStorage2.getString(encrypted, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        if (string2 != coroutine_suspended) {
                            str = str19;
                            obj = string2;
                            str2 = (java.lang.String) obj;
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage3 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted2 = getInputFormats;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str2;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 3;
                            obj = appStorage3.getString(encrypted2, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                            break;
                        }
                        return coroutine_suspended;
                    case 2:
                        java.lang.String str20 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str = str20;
                        str2 = (java.lang.String) obj;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage32 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted22 = getInputFormats;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str2;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 3;
                        obj = appStorage32.getString(encrypted22, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        break;
                    case 3:
                        str2 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap;
                        str = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str21 = (java.lang.String) obj;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage4 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted2 = getHighSpeedVideoFpsRangesFor;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str2;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges = str21;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 4;
                        java.lang.Object string3 = appStorage4.getString(unencrypted2, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        if (string3 != coroutine_suspended) {
                            str3 = str;
                            str4 = str21;
                            obj = string3;
                            str5 = str2;
                            str6 = (java.lang.String) obj;
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage5 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted3 = Camera2StreamConfigurationMap;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str5;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges = str4;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes = str6;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 5;
                            obj = appStorage5.getString(encrypted3, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                            break;
                        }
                        return coroutine_suspended;
                    case 4:
                        java.lang.String str22 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges;
                        java.lang.String str23 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap;
                        java.lang.String str24 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str3 = str24;
                        str5 = str23;
                        str4 = str22;
                        str6 = (java.lang.String) obj;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage52 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted32 = Camera2StreamConfigurationMap;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str5;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges = str4;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes = str6;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 5;
                        obj = appStorage52.getString(encrypted32, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        break;
                    case 5:
                        str6 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes;
                        str4 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges;
                        str5 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap;
                        str3 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String str25 = (java.lang.String) obj;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage6 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted3 = getHighSpeedVideoSizes;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str5;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges = str4;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes = str6;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRangesFor = str25;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 6;
                        java.lang.Object string4 = appStorage6.getString(unencrypted3, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        if (string4 != coroutine_suspended) {
                            java.lang.String str26 = str6;
                            str7 = str25;
                            obj = string4;
                            str8 = str5;
                            str9 = str4;
                            str10 = str26;
                            str11 = (java.lang.String) obj;
                            if (str11 != null) {
                                try {
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile rememberedUserStorageWithProfile = this;
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.valueOf(str11));
                                } catch (java.lang.Throwable th) {
                                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
                                }
                                if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
                                    m23436constructorimpl = null;
                                }
                                loginType = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType) m23436constructorimpl;
                                break;
                            }
                            loginType = com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.EMAIL;
                            com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage7 = this.Camera2StreamConfigurationMap;
                            com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted4 = getHighResolutionOutputSizeshNQ4ISI;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str8;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges = str9;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes = str10;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRangesFor = str7;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getInputSizeshNQ4ISI = loginType;
                            rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 7;
                            string = appStorage7.getString(encrypted4, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                            if (string != coroutine_suspended) {
                                loginType2 = loginType;
                                obj = string;
                                str12 = str7;
                                str13 = str9;
                                str14 = str3;
                                str15 = str8;
                                str16 = str10;
                                str17 = (java.lang.String) obj;
                                if (str17 != null) {
                                    try {
                                        kotlinx.serialization.json.Json.Companion companion3 = kotlinx.serialization.json.Json.INSTANCE;
                                        companion3.getSerializersModule();
                                        list = (java.util.List) companion3.decodeFromString(new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData.INSTANCE.serializer()), str17);
                                    } catch (java.lang.Exception e) {
                                        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to deserialize allowed credentials", e);
                                    }
                                    str18 = str15;
                                    if (str18 != null && str18.length() != 0) {
                                        z = false;
                                    }
                                    return (str14 != null || z || str13 == null) ? arrow.core.EitherKt.left(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.RememberedLoginError.UserNotFound.INSTANCE) : arrow.core.EitherKt.right(new com.paypal.oslo.feature.identity.rememberedlogin.data.model.RememberedUserData(str14, str15, str16, str13, list, loginType2, str12));
                                }
                                list = null;
                                str18 = str15;
                                if (str18 != null) {
                                    z = false;
                                }
                                if (str14 != null) {
                                }
                            }
                        }
                        return coroutine_suspended;
                    case 6:
                        str7 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRangesFor;
                        str10 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes;
                        str9 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges;
                        java.lang.String str27 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap;
                        java.lang.String str28 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        str8 = str27;
                        str3 = str28;
                        str11 = (java.lang.String) obj;
                        if (str11 != null) {
                        }
                        loginType = com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType.EMAIL;
                        com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage72 = this.Camera2StreamConfigurationMap;
                        com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted42 = getHighResolutionOutputSizeshNQ4ISI;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI = str3;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap = str8;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges = str9;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes = str10;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRangesFor = str7;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getInputSizeshNQ4ISI = loginType;
                        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor = 7;
                        string = appStorage72.getString(encrypted42, rememberedUserStorageWithProfile$getRememberedUserFromStorage$1);
                        if (string != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 7:
                        com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType3 = (com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getInputSizeshNQ4ISI;
                        java.lang.String str29 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRangesFor;
                        java.lang.String str30 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizes;
                        java.lang.String str31 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoFpsRanges;
                        str15 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.Camera2StreamConfigurationMap;
                        java.lang.String str32 = (java.lang.String) rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlin.ResultKt.throwOnFailure(obj);
                        loginType2 = loginType3;
                        str12 = str29;
                        str16 = str30;
                        str13 = str31;
                        str14 = str32;
                        str17 = (java.lang.String) obj;
                        if (str17 != null) {
                        }
                        list = null;
                        str18 = str15;
                        if (str18 != null) {
                        }
                        if (str14 != null) {
                        }
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        rememberedUserStorageWithProfile$getRememberedUserFromStorage$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$getRememberedUserFromStorage$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        boolean z2 = true;
        switch (rememberedUserStorageWithProfile$getRememberedUserFromStorage$1.getHighSpeedVideoSizesFor) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to update allowed credentials", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object updateAllowedCredentials(java.util.List<com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData> list, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$updateAllowedCredentials$1 rememberedUserStorageWithProfile$updateAllowedCredentials$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$updateAllowedCredentials$1) {
            rememberedUserStorageWithProfile$updateAllowedCredentials$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$updateAllowedCredentials$1) continuation;
            if ((rememberedUserStorageWithProfile$updateAllowedCredentials$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$updateAllowedCredentials$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$updateAllowedCredentials$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$updateAllowedCredentials$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                    companion.getSerializersModule();
                    java.lang.String encodeToString = companion.encodeToString(new kotlinx.serialization.internal.ArrayListSerializer(com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData.INSTANCE.serializer()), list);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted = getHighResolutionOutputSizeshNQ4ISI;
                    rememberedUserStorageWithProfile$updateAllowedCredentials$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    rememberedUserStorageWithProfile$updateAllowedCredentials$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(encodeToString);
                    rememberedUserStorageWithProfile$updateAllowedCredentials$1.Camera2StreamConfigurationMap = 1;
                    if (appStorage.setString(encrypted, encodeToString, rememberedUserStorageWithProfile$updateAllowedCredentials$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        rememberedUserStorageWithProfile$updateAllowedCredentials$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$updateAllowedCredentials$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$updateAllowedCredentials$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$updateAllowedCredentials$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:17|18))(3:19|20|(1:22))|12|13|14))|25|6|7|(0)(0)|12|13|14) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0052, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        com.paypal.oslo.feature.identity.LoggerKt.log.e("Failed to save login type", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object saveLoginType(com.paypal.oslo.feature.identity.rememberedlogin.domain.model.LoginType loginType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveLoginType$1 rememberedUserStorageWithProfile$saveLoginType$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveLoginType$1) {
            rememberedUserStorageWithProfile$saveLoginType$1 = (com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveLoginType$1) continuation;
            if ((rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = this.Camera2StreamConfigurationMap;
                    com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted unencrypted = getHighSpeedVideoSizes;
                    java.lang.String name2 = loginType.name();
                    rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(loginType);
                    rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRanges = 1;
                    if (appStorage.setString(unencrypted, name2, rememberedUserStorageWithProfile$saveLoginType$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.Unit.INSTANCE;
            }
        }
        rememberedUserStorageWithProfile$saveLoginType$1 = new com.paypal.oslo.feature.identity.rememberedlogin.data.storage.RememberedUserStorageWithProfile$saveLoginType$1(this, continuation);
        java.lang.Object obj2 = rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = rememberedUserStorageWithProfile$saveLoginType$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        return kotlin.Unit.INSTANCE;
    }
}
