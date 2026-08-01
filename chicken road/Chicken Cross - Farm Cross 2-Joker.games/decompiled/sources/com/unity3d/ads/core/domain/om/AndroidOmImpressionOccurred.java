package com.unity3d.ads.core.domain.om;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OMResult;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AndroidOmImpressionOccurred.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096B¢\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/unity3d/ads/core/domain/om/AndroidOmImpressionOccurred;", "Lcom/unity3d/ads/core/domain/om/OmImpressionOccurred;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "signalLoaded", "", "(Lcom/unity3d/ads/core/data/model/AdObject;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidOmImpressionOccurred implements OmImpressionOccurred {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidOmImpressionOccurred(OpenMeasurementRepository openMeasurementRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.openMeasurementRepository = openMeasurementRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.unity3d.ads.core.domain.om.OmImpressionOccurred
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(AdObject adObject, boolean z, Continuation<? super Unit> continuation) {
        AndroidOmImpressionOccurred$invoke$1 androidOmImpressionOccurred$invoke$1;
        int i;
        OMResult oMResult;
        if (continuation instanceof AndroidOmImpressionOccurred$invoke$1) {
            androidOmImpressionOccurred$invoke$1 = (AndroidOmImpressionOccurred$invoke$1) continuation;
            if ((androidOmImpressionOccurred$invoke$1.label & Integer.MIN_VALUE) != 0) {
                androidOmImpressionOccurred$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = androidOmImpressionOccurred$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = androidOmImpressionOccurred$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    OpenMeasurementRepository openMeasurementRepository = this.openMeasurementRepository;
                    ByteString opportunityId = adObject.getOpportunityId();
                    androidOmImpressionOccurred$invoke$1.L$0 = adObject;
                    androidOmImpressionOccurred$invoke$1.label = 1;
                    obj = openMeasurementRepository.impressionOccurred(opportunityId, z, androidOmImpressionOccurred$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    adObject = (AdObject) androidOmImpressionOccurred$invoke$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                AdObject adObject2 = adObject;
                oMResult = (OMResult) obj;
                if (!(oMResult instanceof OMResult.Success)) {
                    SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "om_impression_occurred_success", (Double) null, (Map) null, (Map) null, adObject2, (Integer) null, (ByteString) null, 110, (Object) null);
                } else {
                    if (!(oMResult instanceof OMResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
                    Map createMapBuilder = MapsKt.createMapBuilder();
                    OMResult.Failure failure = (OMResult.Failure) oMResult;
                    createMapBuilder.put("reason", failure.getReason());
                    if (failure.getReasonDebug() != null) {
                        createMapBuilder.put("reason_debug", failure.getReasonDebug());
                    }
                    Unit unit = Unit.INSTANCE;
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "om_impression_occurred_failure", (Double) null, MapsKt.build(createMapBuilder), (Map) null, adObject2, (Integer) null, (ByteString) null, 106, (Object) null);
                }
                return Unit.INSTANCE;
            }
        }
        androidOmImpressionOccurred$invoke$1 = new AndroidOmImpressionOccurred$invoke$1(this, continuation);
        Object obj2 = androidOmImpressionOccurred$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidOmImpressionOccurred$invoke$1.label;
        if (i != 0) {
        }
        AdObject adObject22 = adObject;
        oMResult = (OMResult) obj2;
        if (!(oMResult instanceof OMResult.Success)) {
        }
        return Unit.INSTANCE;
    }
}
