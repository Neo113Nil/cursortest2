package com.izettle.android.auth.dto;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017"}, d2 = {"Lcom/izettle/android/auth/dto/UserConfigDto;", "", "Lcom/izettle/android/auth/dto/UserInfoDto;", "userInfo", "", "userInfoHash", "transactionConfigHash", "Lcom/izettle/android/auth/dto/TransactionConfigDto;", "transactionConfig", "<init>", "(Lcom/izettle/android/auth/dto/UserInfoDto;Ljava/lang/String;Ljava/lang/String;Lcom/izettle/android/auth/dto/TransactionConfigDto;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/izettle/android/auth/dto/TransactionConfigDto;", "getTransactionConfig", "()Lcom/izettle/android/auth/dto/TransactionConfigDto;", "Ljava/lang/String;", "getTransactionConfigHash", "()Ljava/lang/String;", "Lcom/izettle/android/auth/dto/UserInfoDto;", "getUserInfo", "()Lcom/izettle/android/auth/dto/UserInfoDto;", "getUserInfoHash"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserConfigDto {

    @com.izettle.android.serialization.annotations.JsonSerialize("TRANSACTION_CONFIG")
    private final com.izettle.android.auth.dto.TransactionConfigDto transactionConfig;

    @com.izettle.android.serialization.annotations.JsonSerialize("TRANSACTION_CONFIG_HASH")
    private final java.lang.String transactionConfigHash;

    @com.izettle.android.serialization.annotations.JsonSerialize("USER_INFO")
    private final com.izettle.android.auth.dto.UserInfoDto userInfo;

    @com.izettle.android.serialization.annotations.JsonSerialize("USER_INFO_HASH")
    private final java.lang.String userInfoHash;

    public UserConfigDto(@com.izettle.android.serialization.annotations.JsonDeserialize("USER_INFO") com.izettle.android.auth.dto.UserInfoDto userInfoDto, @com.izettle.android.serialization.annotations.JsonDeserialize("USER_INFO_HASH") java.lang.String str, @com.izettle.android.serialization.annotations.JsonDeserialize("TRANSACTION_CONFIG_HASH") java.lang.String str2, @com.izettle.android.serialization.annotations.JsonDeserialize("TRANSACTION_CONFIG") com.izettle.android.auth.dto.TransactionConfigDto transactionConfigDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoDto, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigDto, "");
        this.userInfo = userInfoDto;
        this.userInfoHash = str;
        this.transactionConfigHash = str2;
        this.transactionConfig = transactionConfigDto;
    }

    public final com.izettle.android.auth.dto.UserInfoDto getUserInfo() {
        return this.userInfo;
    }

    public final java.lang.String getUserInfoHash() {
        return this.userInfoHash;
    }

    public final java.lang.String getTransactionConfigHash() {
        return this.transactionConfigHash;
    }

    public final com.izettle.android.auth.dto.TransactionConfigDto getTransactionConfig() {
        return this.transactionConfig;
    }

    public final boolean equals(java.lang.Object other) {
        if (!(other instanceof com.izettle.android.auth.dto.UserConfigDto)) {
            return false;
        }
        com.izettle.android.auth.dto.UserConfigDto userConfigDto = (com.izettle.android.auth.dto.UserConfigDto) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(userConfigDto.userInfo, this.userInfo) && kotlin.jvm.internal.Intrinsics.areEqual(userConfigDto.userInfoHash, this.userInfoHash) && kotlin.jvm.internal.Intrinsics.areEqual(userConfigDto.transactionConfigHash, this.transactionConfigHash) && kotlin.jvm.internal.Intrinsics.areEqual(userConfigDto.transactionConfig, this.transactionConfig);
    }

    public final int hashCode() {
        return java.util.Objects.hash(this.userInfo, this.userInfoHash, this.transactionConfigHash, this.transactionConfig);
    }
}
