package com.unity3d.ads.core.domain.om;

import com.unity3d.ads.core.data.model.OMData;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonGetOmData.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u0007H\u0096B¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/om/CommonGetOmData;", "Lcom/unity3d/ads/core/domain/om/GetOmData;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;)V", "invoke", "Lcom/unity3d/ads/core/data/model/OMData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CommonGetOmData implements GetOmData {
    private final OpenMeasurementRepository openMeasurementRepository;

    public CommonGetOmData(OpenMeasurementRepository openMeasurementRepository) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        this.openMeasurementRepository = openMeasurementRepository;
    }

    @Override // com.unity3d.ads.core.domain.om.GetOmData
    public Object invoke(Continuation<? super OMData> continuation) {
        return this.openMeasurementRepository.getOmData();
    }
}
