package com.unity3d.ads.core.domain.exposure;

import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.Refresh;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: CommonAdViewerExposedFunctions.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CommonAdViewerExposedFunctionsKt$refreshAdData$1 implements ExposedFunction {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ Refresh $refresh;

    CommonAdViewerExposedFunctionsKt$refreshAdData$1(Refresh refresh, AdObject adObject) {
        this.$refresh = refresh;
        this.$adObject = adObject;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object[] objArr, Continuation<? super Object> continuation) {
        return invoke2(objArr, (Continuation<Object>) continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke2(Object[] objArr, Continuation<Object> continuation) {
        CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1;
        int i;
        ByteString fromBase64$default;
        AdDataRefreshResponseOuterClass.AdDataRefreshResponse adDataRefreshResponse;
        if (continuation instanceof CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) {
            commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = (CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1) continuation;
            if ((commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label & Integer.MIN_VALUE) != 0) {
                commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label -= Integer.MIN_VALUE;
                Object obj = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (objArr.length == 0) {
                        fromBase64$default = ByteString.EMPTY;
                    } else {
                        Object obj2 = objArr[0];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        String optString = ((JSONObject) obj2).optString(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN);
                        Intrinsics.checkNotNull(optString);
                        fromBase64$default = ProtobufExtensionsKt.fromBase64$default(optString, false, 1, null);
                    }
                    Refresh refresh = this.$refresh;
                    Intrinsics.checkNotNull(fromBase64$default);
                    ByteString opportunityId = this.$adObject.getOpportunityId();
                    commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label = 1;
                    obj = refresh.invoke(fromBase64$default, opportunityId, commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj;
                if (!adDataRefreshResponse.hasError()) {
                    throw new IllegalArgumentException("Refresh failed");
                }
                Map createMapBuilder = MapsKt.createMapBuilder();
                ByteString adData = adDataRefreshResponse.getAdData();
                Intrinsics.checkNotNullExpressionValue(adData, "getAdData(...)");
                createMapBuilder.put("adData", ProtobufExtensionsKt.toBase64$default(adData, false, 1, null));
                ByteString adDataRefreshToken = adDataRefreshResponse.getAdDataRefreshToken();
                Intrinsics.checkNotNullExpressionValue(adDataRefreshToken, "getAdDataRefreshToken(...)");
                createMapBuilder.put(HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, ProtobufExtensionsKt.toBase64$default(adDataRefreshToken, false, 1, null));
                ByteString trackingToken = adDataRefreshResponse.getTrackingToken();
                Intrinsics.checkNotNullExpressionValue(trackingToken, "getTrackingToken(...)");
                createMapBuilder.put(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(trackingToken, false, 1, null));
                return MapsKt.build(createMapBuilder);
            }
        }
        commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1 = new CommonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1(this, continuation);
        Object obj3 = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = commonAdViewerExposedFunctionsKt$refreshAdData$1$invoke$1.label;
        if (i != 0) {
        }
        adDataRefreshResponse = (AdDataRefreshResponseOuterClass.AdDataRefreshResponse) obj3;
        if (!adDataRefreshResponse.hasError()) {
        }
    }
}
