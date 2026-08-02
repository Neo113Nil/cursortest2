package com.zettle.android.entities;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J8\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u000eR\u001a\u0010\b\u001a\u00020\u00078\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010\u000e"}, d2 = {"Lcom/zettle/android/entities/UserConfigImpl;", "Lcom/zettle/android/entities/UserConfig;", "Lcom/zettle/android/entities/UserInfo;", "userInfo", "", "userInfoHash", "transactionConfigHash", "Lcom/zettle/android/entities/TransactionConfig;", "transactionConfig", "<init>", "(Lcom/zettle/android/entities/UserInfo;Ljava/lang/String;Ljava/lang/String;Lcom/zettle/android/entities/TransactionConfig;)V", "component1", "()Lcom/zettle/android/entities/UserInfo;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/zettle/android/entities/TransactionConfig;", "copy", "(Lcom/zettle/android/entities/UserInfo;Ljava/lang/String;Ljava/lang/String;Lcom/zettle/android/entities/TransactionConfig;)Lcom/zettle/android/entities/UserConfigImpl;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/zettle/android/entities/TransactionConfig;", "getTransactionConfig", "Ljava/lang/String;", "getTransactionConfigHash", "Lcom/zettle/android/entities/UserInfo;", "getUserInfo", "getUserInfoHash"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
final /* data */ class UserConfigImpl implements com.zettle.android.entities.UserConfig {
    private final com.zettle.android.entities.TransactionConfig transactionConfig;
    private final java.lang.String transactionConfigHash;
    private final com.zettle.android.entities.UserInfo userInfo;
    private final java.lang.String userInfoHash;

    public UserConfigImpl(com.zettle.android.entities.UserInfo userInfo, java.lang.String str, java.lang.String str2, com.zettle.android.entities.TransactionConfig transactionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
        this.userInfo = userInfo;
        this.userInfoHash = str;
        this.transactionConfigHash = str2;
        this.transactionConfig = transactionConfig;
    }

    @Override // com.zettle.android.entities.UserConfig
    public final com.zettle.android.entities.UserInfo getUserInfo() {
        return this.userInfo;
    }

    @Override // com.zettle.android.entities.UserConfig
    public final java.lang.String getUserInfoHash() {
        return this.userInfoHash;
    }

    @Override // com.zettle.android.entities.UserConfig
    public final java.lang.String getTransactionConfigHash() {
        return this.transactionConfigHash;
    }

    @Override // com.zettle.android.entities.UserConfig
    public final com.zettle.android.entities.TransactionConfig getTransactionConfig() {
        return this.transactionConfig;
    }

    public final java.lang.String toString() {
        com.zettle.android.entities.UserInfo userInfo = this.userInfo;
        java.lang.String str = this.userInfoHash;
        java.lang.String str2 = this.transactionConfigHash;
        com.zettle.android.entities.TransactionConfig transactionConfig = this.transactionConfig;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserConfigImpl(userInfo=");
        sb.append(userInfo);
        sb.append(", userInfoHash=");
        sb.append(str);
        sb.append(", transactionConfigHash=");
        sb.append(str2);
        sb.append(", transactionConfig=");
        sb.append(transactionConfig);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.userInfo.hashCode() * 31) + this.userInfoHash.hashCode()) * 31) + this.transactionConfigHash.hashCode()) * 31) + this.transactionConfig.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.android.entities.UserConfigImpl)) {
            return false;
        }
        com.zettle.android.entities.UserConfigImpl userConfigImpl = (com.zettle.android.entities.UserConfigImpl) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.userInfo, userConfigImpl.userInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.userInfoHash, userConfigImpl.userInfoHash) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionConfigHash, userConfigImpl.transactionConfigHash) && kotlin.jvm.internal.Intrinsics.areEqual(this.transactionConfig, userConfigImpl.transactionConfig);
    }

    public final com.zettle.android.entities.UserConfigImpl copy(com.zettle.android.entities.UserInfo userInfo, java.lang.String userInfoHash, java.lang.String transactionConfigHash, com.zettle.android.entities.TransactionConfig transactionConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoHash, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigHash, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfig, "");
        return new com.zettle.android.entities.UserConfigImpl(userInfo, userInfoHash, transactionConfigHash, transactionConfig);
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.android.entities.TransactionConfig getTransactionConfig() {
        return this.transactionConfig;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTransactionConfigHash() {
        return this.transactionConfigHash;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUserInfoHash() {
        return this.userInfoHash;
    }

    /* renamed from: component1, reason: from getter */
    public final com.zettle.android.entities.UserInfo getUserInfo() {
        return this.userInfo;
    }

    public static /* synthetic */ com.zettle.android.entities.UserConfigImpl copy$default(com.zettle.android.entities.UserConfigImpl userConfigImpl, com.zettle.android.entities.UserInfo userInfo, java.lang.String str, java.lang.String str2, com.zettle.android.entities.TransactionConfig transactionConfig, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userInfo = userConfigImpl.userInfo;
        }
        if ((i & 2) != 0) {
            str = userConfigImpl.userInfoHash;
        }
        if ((i & 4) != 0) {
            str2 = userConfigImpl.transactionConfigHash;
        }
        if ((i & 8) != 0) {
            transactionConfig = userConfigImpl.transactionConfig;
        }
        return userConfigImpl.copy(userInfo, str, str2, transactionConfig);
    }
}
