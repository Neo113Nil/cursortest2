package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: Refresh.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H¦B¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/core/domain/Refresh;", "", "invoke", "Lgatewayprotocol/v1/AdDataRefreshResponseOuterClass$AdDataRefreshResponse;", "opportunityId", "Lcom/google/protobuf/ByteString;", HandleInvocationsFromAdViewer.KEY_AD_DATA_REFRESH_TOKEN, "(Lcom/google/protobuf/ByteString;Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface Refresh {
    Object invoke(ByteString byteString, ByteString byteString2, Continuation<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> continuation);
}
