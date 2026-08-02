package com.paypal.oslo.feature.identity.sso.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/sso/data/mapper/PKCEChallengeMethodMapper;", "", "<init>", "()V", "", "toGraphQL", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;", "toDomain", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEChallengeMethod;", "S256_STRING", "Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PKCEChallengeMethodMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.sso.data.mapper.PKCEChallengeMethodMapper INSTANCE = new com.paypal.oslo.feature.identity.sso.data.mapper.PKCEChallengeMethodMapper();
    public static final java.lang.String S256_STRING = "S256";

    private PKCEChallengeMethodMapper() {
    }

    public final java.lang.String toGraphQL() {
        return S256_STRING;
    }

    public final com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod toDomain() {
        return com.paypal.oslo.feature.identity.shared.domain.model.PKCEChallengeMethod.S256;
    }
}
