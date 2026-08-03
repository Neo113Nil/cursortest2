package com.unity3d.ads.core.domain;

/* compiled from: CommonGetAdObject.kt */
@kotlin.Deprecated(message = "Should use directly AdRepository.getAd()", replaceWith = @kotlin.ReplaceWith(expression = "adRepository.getAd(UUID.fromString(opportunityId).toByteString()", imports = {}))
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetAdObject;", "Lcom/unity3d/ads/core/domain/GetAdObject;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommonGetAdObject implements com.unity3d.ads.core.domain.GetAdObject {
    private final com.unity3d.ads.core.data.repository.AdRepository adRepository;

    public CommonGetAdObject(com.unity3d.ads.core.data.repository.AdRepository adRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public com.unity3d.ads.core.data.model.AdObject invoke(java.lang.String opportunityId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.adRepository.getAd(com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(opportunityId));
    }
}
