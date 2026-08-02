package com.izettle.android.auth.repository;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0014\u0010\u0013J%\u0010\u0017\u001a\u00020\u00042\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u0015H&¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u0019\u001a\u00020\u00042\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0004\u0012\u00020\u00040\u0015H&¢\u0006\u0004\b\u0019\u0010\u0018"}, d2 = {"Lcom/izettle/android/auth/repository/UserConfigRepository;", "", "Lcom/izettle/android/auth/storage/Transaction;", "transaction", "", "applyDeleteToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;)V", "Lcom/izettle/android/auth/model/UserConfigWithRawData;", "userConfigWithRawData", "applyStoreCanonicalUserConfigToTransaction", "(Lcom/izettle/android/auth/storage/Transaction;Lcom/izettle/android/auth/model/UserConfigWithRawData;)V", "Lcom/izettle/android/core/data/result/Result;", "", "deleteUserConfig", "()Lcom/izettle/android/core/data/result/Result;", "Lcom/izettle/android/auth/repository/GetStrategy;", "strategy", "Lcom/zettle/android/entities/UserConfig;", "getUserConfig", "(Lcom/izettle/android/auth/repository/GetStrategy;)Lcom/izettle/android/core/data/result/Result;", "getUserConfigWithRawData", "Lkotlin/Function1;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "registerUserConfigUpdateListener", "(Lkotlin/jvm/functions/Function1;)V", "unregisterUserConfigUpdateListener"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface UserConfigRepository {
    void applyDeleteToTransaction(com.izettle.android.auth.storage.Transaction transaction);

    void applyStoreCanonicalUserConfigToTransaction(com.izettle.android.auth.storage.Transaction transaction, com.izettle.android.auth.model.UserConfigWithRawData userConfigWithRawData);

    com.izettle.android.core.data.result.Result<kotlin.Unit, java.lang.Throwable> deleteUserConfig();

    com.izettle.android.core.data.result.Result<com.zettle.android.entities.UserConfig, java.lang.Throwable> getUserConfig(com.izettle.android.auth.repository.GetStrategy strategy);

    com.izettle.android.core.data.result.Result<com.izettle.android.auth.model.UserConfigWithRawData, java.lang.Throwable> getUserConfigWithRawData(com.izettle.android.auth.repository.GetStrategy strategy);

    void registerUserConfigUpdateListener(kotlin.jvm.functions.Function1<? super com.zettle.android.entities.UserConfig, kotlin.Unit> listener);

    void unregisterUserConfigUpdateListener(kotlin.jvm.functions.Function1<? super com.zettle.android.entities.UserConfig, kotlin.Unit> listener);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ com.izettle.android.core.data.result.Result getUserConfigWithRawData$default(com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.repository.GetStrategy getStrategy, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserConfigWithRawData");
            }
            if ((i & 1) != 0) {
                getStrategy = com.izettle.android.auth.repository.PathOfLeastResistance.INSTANCE;
            }
            return userConfigRepository.getUserConfigWithRawData(getStrategy);
        }

        public static /* synthetic */ com.izettle.android.core.data.result.Result getUserConfig$default(com.izettle.android.auth.repository.UserConfigRepository userConfigRepository, com.izettle.android.auth.repository.GetStrategy getStrategy, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getUserConfig");
            }
            if ((i & 1) != 0) {
                getStrategy = com.izettle.android.auth.repository.PathOfLeastResistance.INSTANCE;
            }
            return userConfigRepository.getUserConfig(getStrategy);
        }
    }
}
