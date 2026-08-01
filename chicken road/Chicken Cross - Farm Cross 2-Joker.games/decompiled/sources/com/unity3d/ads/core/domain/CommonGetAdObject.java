package com.unity3d.ads.core.domain;

import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.AdRepository;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonGetAdObject.kt */
@Deprecated(message = "Should use directly AdRepository.getAd()", replaceWith = @ReplaceWith(expression = "adRepository.getAd(UUID.fromString(opportunityId).toByteString()", imports = {}))
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0096\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/domain/CommonGetAdObject;", "Lcom/unity3d/ads/core/domain/GetAdObject;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/AdRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/AdObject;", "opportunityId", "", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonGetAdObject implements GetAdObject {
    private final AdRepository adRepository;

    public CommonGetAdObject(AdRepository adRepository) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        this.adRepository = adRepository;
    }

    @Override // com.unity3d.ads.core.domain.GetAdObject
    public AdObject invoke(String opportunityId) {
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        return this.adRepository.getAd(ByteStringsKt.toByteStringUtf8(opportunityId));
    }
}
