package com.unity3d.ads.core.domain.scar;

/* compiled from: CommonScarEligibleEffectiveUseCase.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/scar/CommonScarEligibleEffectiveUseCase;", "Lcom/unity3d/ads/core/domain/scar/ScarEligibleEffectiveUseCase;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "getSessionRepository", "()Lcom/unity3d/ads/core/data/repository/SessionRepository;", "invoke", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "tokenConfiguration", "Lcom/unity3d/ads/TokenConfiguration;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonScarEligibleEffectiveUseCase implements com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase {
    private final com.unity3d.ads.core.data.repository.SessionRepository sessionRepository;

    public CommonScarEligibleEffectiveUseCase(com.unity3d.ads.core.data.repository.SessionRepository sessionRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    public final com.unity3d.ads.core.data.repository.SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.scar.ScarEligibleEffectiveUseCase
    public java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> invoke(com.unity3d.ads.TokenConfiguration tokenConfiguration) {
        java.util.List<gatewayprotocol.v1.AdFormatOuterClass.AdFormat> listOf;
        if (tokenConfiguration == null) {
            return this.sessionRepository.getScarEligibleFormats();
        }
        gatewayprotocol.v1.AdFormatOuterClass.AdFormat protoAdFormat = com.unity3d.ads.core.extensions.AdFormatExtensions.toProtoAdFormat(tokenConfiguration.getAdFormat());
        if (!this.sessionRepository.getScarEligibleFormats().contains(protoAdFormat)) {
            protoAdFormat = null;
        }
        return (protoAdFormat == null || (listOf = kotlin.collections.CollectionsKt.listOf(protoAdFormat)) == null) ? kotlin.collections.CollectionsKt.emptyList() : listOf;
    }
}
