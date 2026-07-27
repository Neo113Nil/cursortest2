package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import io.ktor.http.ContentDisposition;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: GetAdRequest.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH¦B¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/unity3d/ads/core/domain/GetAdRequest;", "", "invoke", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "placement", "", "impressionOpportunity", "Lcom/google/protobuf/ByteString;", ContentDisposition.Parameters.Size, "Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;", "loadConfiguration", "Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;", "(Ljava/lang/String;Lcom/google/protobuf/ByteString;Lgatewayprotocol/v1/AdRequestOuterClass$BannerSize;Lcom/unity3d/ads/core/data/model/LoadConfigurationInternal;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface GetAdRequest {
    Object invoke(String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, Continuation<? super UniversalRequestOuterClass.UniversalRequest> continuation);

    /* compiled from: GetAdRequest.kt */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(GetAdRequest getAdRequest, String str, ByteString byteString, AdRequestOuterClass.BannerSize bannerSize, LoadConfigurationInternal loadConfigurationInternal, Continuation continuation, int i, Object obj) {
            if (obj == null) {
                return getAdRequest.invoke(str, byteString, (i & 4) != 0 ? null : bannerSize, (i & 8) != 0 ? null : loadConfigurationInternal, continuation);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
        }
    }
}
