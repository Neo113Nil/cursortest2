package com.izettle.android.auth.model.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001b\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010"}, d2 = {"Lcom/izettle/android/auth/model/mapper/UserConfigMapper;", "Lcom/izettle/android/auth/model/mapper/Mapper;", "Lcom/izettle/android/auth/dto/UserConfigDto;", "Lcom/zettle/android/entities/UserConfig;", "Lcom/izettle/android/auth/model/mapper/UserInfoMapper;", "userInfoMapper", "Lcom/izettle/android/auth/model/mapper/TransactionConfigMapper;", "transactionConfigMapper", "<init>", "(Lcom/izettle/android/auth/model/mapper/UserInfoMapper;Lcom/izettle/android/auth/model/mapper/TransactionConfigMapper;)V", "from", "inverseMap", "(Lcom/zettle/android/entities/UserConfig;)Lcom/izettle/android/auth/dto/UserConfigDto;", "map", "(Lcom/izettle/android/auth/dto/UserConfigDto;)Lcom/zettle/android/entities/UserConfig;", "Lcom/izettle/android/auth/model/mapper/TransactionConfigMapper;", "Lcom/izettle/android/auth/model/mapper/UserInfoMapper;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class UserConfigMapper implements com.izettle.android.auth.model.mapper.Mapper<com.izettle.android.auth.dto.UserConfigDto, com.zettle.android.entities.UserConfig> {
    private final com.izettle.android.auth.model.mapper.TransactionConfigMapper transactionConfigMapper;
    private final com.izettle.android.auth.model.mapper.UserInfoMapper userInfoMapper;

    public UserConfigMapper(com.izettle.android.auth.model.mapper.UserInfoMapper userInfoMapper, com.izettle.android.auth.model.mapper.TransactionConfigMapper transactionConfigMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userInfoMapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionConfigMapper, "");
        this.userInfoMapper = userInfoMapper;
        this.transactionConfigMapper = transactionConfigMapper;
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.izettle.android.auth.dto.UserConfigDto> inverseMap(java.lang.Iterable<? extends com.zettle.android.entities.UserConfig> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.inverseMap(this, iterable);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final java.lang.Iterable<com.zettle.android.entities.UserConfig> map(java.lang.Iterable<? extends com.izettle.android.auth.dto.UserConfigDto> iterable) {
        return com.izettle.android.auth.model.mapper.Mapper.DefaultImpls.map(this, iterable);
    }

    public /* synthetic */ UserConfigMapper(com.izettle.android.auth.model.mapper.UserInfoMapper userInfoMapper, com.izettle.android.auth.model.mapper.TransactionConfigMapper transactionConfigMapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.izettle.android.auth.model.mapper.UserInfoMapper(null, null, null, 7, null) : userInfoMapper, (i & 2) != 0 ? new com.izettle.android.auth.model.mapper.TransactionConfigMapper(null, 1, null) : transactionConfigMapper);
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.zettle.android.entities.UserConfig map(com.izettle.android.auth.dto.UserConfigDto from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        com.zettle.android.entities.UserConfig.Companion companion = com.zettle.android.entities.UserConfig.INSTANCE;
        java.lang.String userInfoHash = from.getUserInfoHash();
        java.lang.String transactionConfigHash = from.getTransactionConfigHash();
        return companion.invoke(this.userInfoMapper.map(from.getUserInfo()), userInfoHash, transactionConfigHash, this.transactionConfigMapper.map(from.getTransactionConfig()));
    }

    @Override // com.izettle.android.auth.model.mapper.Mapper
    public final com.izettle.android.auth.dto.UserConfigDto inverseMap(com.zettle.android.entities.UserConfig from) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(from, "");
        java.lang.String userInfoHash = from.getUserInfoHash();
        java.lang.String transactionConfigHash = from.getTransactionConfigHash();
        return new com.izettle.android.auth.dto.UserConfigDto(this.userInfoMapper.inverseMap(from.getUserInfo()), userInfoHash, transactionConfigHash, this.transactionConfigMapper.inverseMap(from.getTransactionConfig()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserConfigMapper() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
