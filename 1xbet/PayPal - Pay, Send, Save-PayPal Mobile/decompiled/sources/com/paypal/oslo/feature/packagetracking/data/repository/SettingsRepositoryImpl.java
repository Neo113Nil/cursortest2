package com.paypal.oslo.feature.packagetracking.data.repository;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/repository/SettingsRepositoryImpl;", "Lcom/paypal/oslo/feature/packagetracking/domain/repository/SettingsRepository;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;)V", "Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;", "emailProvider", "", "userHasSeenUnlinkBySystemBanner", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeUserHasSeenUnlinkBySystemBanner", "", "getUserHasSeenUnlinkBySystemBanner", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Ljava/lang/Boolean;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/feature/packagetracking/domain/model/EmailProvider;)Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SettingsRepositoryImpl implements com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository {
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl.Companion INSTANCE = new com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl.Companion(null);
    public static final int $stable = 8;
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted GOOGLE_UNLINK_KEY = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("google_unlink_key");
    private static final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted OUTLOOK_UNLINK_KEY = new com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted("outlook_unlink_key");

    @javax.inject.Inject
    public SettingsRepositoryImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        this.getHighSpeedVideoFpsRanges = appStorage;
    }

    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository
    public final java.lang.Object userHasSeenUnlinkBySystemBanner(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj = this.getHighSpeedVideoFpsRanges.setBoolean(getHighSpeedVideoSizes(emailProvider), true, continuation);
        return obj == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? obj : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository
    public final java.lang.Object removeUserHasSeenUnlinkBySystemBanner(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object remove = this.getHighSpeedVideoFpsRanges.remove(getHighSpeedVideoSizes(emailProvider), continuation);
        return remove == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.packagetracking.domain.repository.SettingsRepository
    public final java.lang.Boolean getUserHasSeenUnlinkBySystemBanner(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        java.lang.Object runBlocking$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailProvider, "");
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl$getUserHasSeenUnlinkBySystemBanner$1(this, emailProvider, null), 1, null);
        return (java.lang.Boolean) runBlocking$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getHighSpeedVideoSizes(com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider emailProvider) {
        int i = com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[emailProvider.ordinal()];
        if (i == 1) {
            return GOOGLE_UNLINK_KEY;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return OUTLOOK_UNLINK_KEY;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/data/repository/SettingsRepositoryImpl$Companion;", "", "<init>", "()V", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "GOOGLE_UNLINK_KEY", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "getGOOGLE_UNLINK_KEY", "()Lcom/paypal/oslo/core/persistence/appstorage/AppStorageKey$Unencrypted;", "OUTLOOK_UNLINK_KEY", "getOUTLOOK_UNLINK_KEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getGOOGLE_UNLINK_KEY() {
            return com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl.GOOGLE_UNLINK_KEY;
        }

        public final com.paypal.oslo.core.persistence.appstorage.AppStorageKey.Unencrypted getOUTLOOK_UNLINK_KEY() {
            return com.paypal.oslo.feature.packagetracking.data.repository.SettingsRepositoryImpl.OUTLOOK_UNLINK_KEY;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.values().length];
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.GMAIL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.packagetracking.domain.model.EmailProvider.OUTLOOK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
