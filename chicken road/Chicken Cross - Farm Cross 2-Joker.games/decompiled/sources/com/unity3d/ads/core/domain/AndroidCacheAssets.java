package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.CacheAssetsEvent;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.TimeoutCancellationException;

/* compiled from: AndroidCacheAssets.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096B¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidCacheAssets;", "Lcom/unity3d/ads/core/domain/CacheAssets;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "cacheFile", "Lcom/unity3d/ads/core/domain/CacheFile;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lcom/unity3d/ads/core/domain/CacheFile;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lcom/unity3d/ads/core/domain/CacheAssetsEvent;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "assets", "", "Lgatewayprotocol/v1/CampaignMetadataOuterClass$CampaignAsset;", "(Lcom/unity3d/ads/core/data/model/AdObject;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidCacheAssets implements CacheAssets {
    private final CacheFile cacheFile;
    private final CoroutineScope scope;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    public AndroidCacheAssets(CoroutineScope scope, CacheFile cacheFile, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(cacheFile, "cacheFile");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.scope = scope;
        this.cacheFile = cacheFile;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    @Override // com.unity3d.ads.core.domain.CacheAssets
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(AdObject adObject, List<CampaignMetadataOuterClass.CampaignAsset> list, Continuation<? super CacheAssetsEvent> continuation) {
        AndroidCacheAssets$invoke$1 androidCacheAssets$invoke$1;
        int i;
        Deferred async$default;
        try {
            if (continuation instanceof AndroidCacheAssets$invoke$1) {
                androidCacheAssets$invoke$1 = (AndroidCacheAssets$invoke$1) continuation;
                if ((androidCacheAssets$invoke$1.label & Integer.MIN_VALUE) != 0) {
                    androidCacheAssets$invoke$1.label -= Integer.MIN_VALUE;
                    Object obj = androidCacheAssets$invoke$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = androidCacheAssets$invoke$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        ArrayList arrayList = new ArrayList();
                        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(androidCacheAssets$invoke$1.get$context().plus(new CoroutineName("AssetDownloading")).plus(SupervisorKt.SupervisorJob((Job) this.scope.getCoroutineContext().get(Job.INSTANCE))));
                        for (CampaignMetadataOuterClass.CampaignAsset campaignAsset : list) {
                            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScope, null, null, new AndroidCacheAssets$invoke$2$downloadJob$1(this, campaignAsset, adObject, null), 3, null);
                            if (campaignAsset.getRequired()) {
                                arrayList.add(async$default);
                            }
                        }
                        androidCacheAssets$invoke$1.label = 1;
                        if (AwaitKt.awaitAll(arrayList, androidCacheAssets$invoke$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return CacheAssetsEvent.Success.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return CacheAssetsEvent.Success.INSTANCE;
        } catch (TimeoutCancellationException e) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_webview_less_asset_cache_timeout", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
            String message = e.getMessage();
            return new CacheAssetsEvent.Failure(message != null ? message : "");
        } catch (RuntimeException e2) {
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_webview_less_asset_cache_fail", (Double) null, (Map) null, (Map) null, (AdObject) null, (Integer) null, (ByteString) null, 126, (Object) null);
            String message2 = e2.getMessage();
            return new CacheAssetsEvent.Failure(message2 != null ? message2 : "");
        }
        androidCacheAssets$invoke$1 = new AndroidCacheAssets$invoke$1(this, continuation);
        Object obj2 = androidCacheAssets$invoke$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = androidCacheAssets$invoke$1.label;
    }
}
