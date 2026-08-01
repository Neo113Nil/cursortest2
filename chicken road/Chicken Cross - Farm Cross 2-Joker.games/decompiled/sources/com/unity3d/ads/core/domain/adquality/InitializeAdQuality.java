package com.unity3d.ads.core.domain.adquality;

import com.google.protobuf.ByteString;
import kotlin.Metadata;

/* compiled from: InitializeAdQuality.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦\u0002J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/adquality/InitializeAdQuality;", "", "invoke", "", "appKey", "", "sessionToken", "Lcom/google/protobuf/ByteString;", "invokeWithGameId", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InitializeAdQuality {
    void invoke(String appKey, ByteString sessionToken);

    void invokeWithGameId(ByteString sessionToken);
}
