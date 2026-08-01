package com.unity3d.ads.core.domain.events;

import com.ironsource.Te;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: AndroidHandleGatewayEventResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0096B¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/events/AndroidHandleGatewayEventResponse;", "Lcom/unity3d/ads/core/domain/events/HandleGatewayEventResponse;", "<init>", "()V", "invoke", "", Te.n, "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "(Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidHandleGatewayEventResponse implements HandleGatewayEventResponse {
    @Override // com.unity3d.ads.core.domain.events.HandleGatewayEventResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, Continuation<? super Unit> continuation) {
        return Unit.INSTANCE;
    }
}
