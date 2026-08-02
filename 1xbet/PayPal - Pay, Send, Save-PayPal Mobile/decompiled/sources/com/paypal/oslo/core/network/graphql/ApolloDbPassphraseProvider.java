package com.paypal.oslo.core.network.graphql;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/ApolloDbPassphraseProvider;", "", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "Lkotlinx/coroutines/CoroutineScope;", "applicationScope", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lkotlinx/coroutines/CoroutineScope;)V", "", "getPassphrase", "()[B", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/Deferred;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/Deferred;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ApolloDbPassphraseProvider {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider.Companion INSTANCE = new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider.Companion(null);
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted PASSPHRASE_KEY = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted("db_passphrase");
    public static final int PASSPHRASE_LENGTH = 32;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final kotlinx.coroutines.Deferred<byte[]> getHighSpeedVideoSizes;

    @javax.inject.Inject
    public ApolloDbPassphraseProvider(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, @com.paypal.oslo.core.di.annotations.IoApplicationScope kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlinx.coroutines.Deferred<byte[]> async$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoFpsRanges = appStorage;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        async$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$deferredPassphrase$1(this, null), 3, null);
        this.getHighSpeedVideoSizes = async$default;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$generateAndStorePassphrase(com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider apolloDbPassphraseProvider, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$generateAndStorePassphrase$1 apolloDbPassphraseProvider$generateAndStorePassphrase$1;
        int i;
        if (continuation instanceof com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$generateAndStorePassphrase$1) {
            apolloDbPassphraseProvider$generateAndStorePassphrase$1 = (com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$generateAndStorePassphrase$1) continuation;
            if ((apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = apolloDbPassphraseProvider$generateAndStorePassphrase$1.Camera2StreamConfigurationMap;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoSizes;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i2 = apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighResolutionOutputSizeshNQ4ISI;
                    byte[] bArr = (byte[]) apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return bArr;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                byte[] bArr2 = new byte[32];
                new java.security.SecureRandom().nextBytes(bArr2);
                com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage = apolloDbPassphraseProvider.getHighSpeedVideoFpsRanges;
                com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted encrypted = PASSPHRASE_KEY;
                apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoFpsRanges = bArr2;
                apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(bArr2);
                apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoSizes = 1;
                return appStorage.set(encrypted, bArr2, apolloDbPassphraseProvider$generateAndStorePassphrase$1) == coroutine_suspended ? coroutine_suspended : bArr2;
            }
        }
        apolloDbPassphraseProvider$generateAndStorePassphrase$1 = new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$generateAndStorePassphrase$1(apolloDbPassphraseProvider, continuation);
        java.lang.Object obj2 = apolloDbPassphraseProvider$generateAndStorePassphrase$1.Camera2StreamConfigurationMap;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = apolloDbPassphraseProvider$generateAndStorePassphrase$1.getHighSpeedVideoSizes;
        if (i == 0) {
        }
    }

    public final byte[] getPassphrase() {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider$getPassphrase$1(this, null), 1, null);
        return (byte[]) runBlocking$default;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/network/graphql/ApolloDbPassphraseProvider$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "PASSPHRASE_KEY", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "getPASSPHRASE_KEY", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Encrypted;", "", "PASSPHRASE_LENGTH", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Encrypted getPASSPHRASE_KEY() {
            return com.paypal.oslo.core.network.graphql.ApolloDbPassphraseProvider.PASSPHRASE_KEY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
