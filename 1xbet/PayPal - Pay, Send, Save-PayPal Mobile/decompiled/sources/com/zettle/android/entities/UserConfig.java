package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Lcom/zettle/android/entities/UserConfig;", "", "Lcom/zettle/android/entities/TransactionConfig;", "getTransactionConfig", "()Lcom/zettle/android/entities/TransactionConfig;", "transactionConfig", "", "getTransactionConfigHash", "()Ljava/lang/String;", "transactionConfigHash", "Lcom/zettle/android/entities/UserInfo;", "getUserInfo", "()Lcom/zettle/android/entities/UserInfo;", "userInfo", "getUserInfoHash", "userInfoHash", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface UserConfig {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.android.entities.UserConfig.Companion INSTANCE = com.zettle.android.entities.UserConfig.Companion.$$INSTANCE;

    com.zettle.android.entities.TransactionConfig getTransactionConfig();

    java.lang.String getTransactionConfigHash();

    com.zettle.android.entities.UserInfo getUserInfo();

    java.lang.String getUserInfoHash();

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/zettle/android/entities/UserConfig$Companion;", "Lkotlin/Function4;", "Lcom/zettle/android/entities/UserInfo;", "", "Lcom/zettle/android/entities/TransactionConfig;", "Lcom/zettle/android/entities/UserConfig;", "<init>", "()V", "userInfo", "userInfoHash", "transactionConfigHash", "transactionConfig", "invoke", "(Lcom/zettle/android/entities/UserInfo;Ljava/lang/String;Ljava/lang/String;Lcom/zettle/android/entities/TransactionConfig;)Lcom/zettle/android/entities/UserConfig;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes16.dex */
    public static final class Companion implements kotlin.jvm.functions.Function4<com.zettle.android.entities.UserInfo, java.lang.String, java.lang.String, com.zettle.android.entities.TransactionConfig, com.zettle.android.entities.UserConfig> {
        static final /* synthetic */ com.zettle.android.entities.UserConfig.Companion $$INSTANCE = new com.zettle.android.entities.UserConfig.Companion();

        private Companion() {
        }

        @Override // kotlin.jvm.functions.Function4
        public final com.zettle.android.entities.UserConfig invoke(com.zettle.android.entities.UserInfo userInfo, java.lang.String userInfoHash, java.lang.String transactionConfigHash, com.zettle.android.entities.TransactionConfig transactionConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoHash, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigHash, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
            return new com.zettle.android.entities.UserConfigImpl(userInfo, userInfoHash, transactionConfigHash, transactionConfig);
        }
    }
}
