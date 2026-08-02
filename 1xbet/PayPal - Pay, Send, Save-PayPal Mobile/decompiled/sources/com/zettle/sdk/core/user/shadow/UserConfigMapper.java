package com.zettle.sdk.core.user.shadow;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/zettle/sdk/core/user/shadow/UserConfigMapper;", "", "Lcom/zettle/sdk/core/user/shadow/UserInfoMapper;", "userInfoMapper", "Lcom/zettle/sdk/core/user/shadow/TransactionConfigMapper;", "transactionConfigMapper", "<init>", "(Lcom/zettle/sdk/core/user/shadow/UserInfoMapper;Lcom/zettle/sdk/core/user/shadow/TransactionConfigMapper;)V", "Lcom/zettle/sdk/core/user/shadow/UserConfigShadow;", "from", "Lcom/zettle/android/entities/UserConfig;", "map", "(Lcom/zettle/sdk/core/user/shadow/UserConfigShadow;)Lcom/zettle/android/entities/UserConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/user/shadow/TransactionConfigMapper;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/core/user/shadow/UserInfoMapper;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UserConfigMapper {
    private final com.zettle.sdk.core.user.shadow.UserInfoMapper Camera2StreamConfigurationMap;
    private final com.zettle.sdk.core.user.shadow.TransactionConfigMapper getHighSpeedVideoFpsRangesFor;

    public UserConfigMapper(com.zettle.sdk.core.user.shadow.UserInfoMapper userInfoMapper, com.zettle.sdk.core.user.shadow.TransactionConfigMapper transactionConfigMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigMapper, "");
        this.Camera2StreamConfigurationMap = userInfoMapper;
        this.getHighSpeedVideoFpsRangesFor = transactionConfigMapper;
    }

    public /* synthetic */ UserConfigMapper(com.zettle.sdk.core.user.shadow.UserInfoMapper userInfoMapper, com.zettle.sdk.core.user.shadow.TransactionConfigMapper transactionConfigMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.zettle.sdk.core.user.shadow.UserInfoMapper(null, null, null, 7, null) : userInfoMapper, (i & 2) != 0 ? new com.zettle.sdk.core.user.shadow.TransactionConfigMapper(null, 1, null) : transactionConfigMapper);
    }

    public final com.zettle.android.entities.UserConfig map(com.zettle.sdk.core.user.shadow.UserConfigShadow from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.UserConfig.Companion companion = com.zettle.android.entities.UserConfig.INSTANCE;
        java.lang.String userInfoHash = from.getUserInfoHash();
        java.lang.String transactionConfigHash = from.getTransactionConfigHash();
        return companion.invoke(this.Camera2StreamConfigurationMap.map(from.getUserInfo()), userInfoHash, transactionConfigHash, this.getHighSpeedVideoFpsRangesFor.map(from.getTransactionConfig()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserConfigMapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
