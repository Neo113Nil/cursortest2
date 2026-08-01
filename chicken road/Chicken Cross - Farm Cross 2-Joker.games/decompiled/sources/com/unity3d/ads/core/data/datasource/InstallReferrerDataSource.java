package com.unity3d.ads.core.data.datasource;

import gatewayprotocol.v1.InitializationRequestOuterClass;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: InstallReferrerDataSource.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦B¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/InstallReferrerDataSource;", "", "invoke", "Lgatewayprotocol/v1/InitializationRequestOuterClass$InstallReferrer;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InstallReferrerDataSource {
    Object invoke(Continuation<? super InitializationRequestOuterClass.InstallReferrer> continuation);
}
