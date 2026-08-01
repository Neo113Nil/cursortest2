package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.domain.CacheFile;
import gatewayprotocol.v1.CampaignMetadataOuterClass;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AndroidCacheAssets.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidCacheAssets$invoke$2$downloadJob$1", f = "AndroidCacheAssets.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidCacheAssets$invoke$2$downloadJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AdObject $adObject;
    final /* synthetic */ CampaignMetadataOuterClass.CampaignAsset $asset;
    int label;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheAssets$invoke$2$downloadJob$1(AndroidCacheAssets androidCacheAssets, CampaignMetadataOuterClass.CampaignAsset campaignAsset, AdObject adObject, Continuation<? super AndroidCacheAssets$invoke$2$downloadJob$1> continuation) {
        super(2, continuation);
        this.this$0 = androidCacheAssets;
        this.$asset = campaignAsset;
        this.$adObject = adObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AndroidCacheAssets$invoke$2$downloadJob$1(this.this$0, this.$asset, this.$adObject, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AndroidCacheAssets$invoke$2$downloadJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CacheFile cacheFile;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            cacheFile = this.this$0.cacheFile;
            String url = this.$asset.getUrl();
            Intrinsics.checkNotNullExpressionValue(url, "getUrl(...)");
            this.label = 1;
            obj = CacheFile.DefaultImpls.invoke$default(cacheFile, url, this.$adObject, null, this.$asset.getPriority(), 0, null, this, 48, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((CacheResult) obj) instanceof CacheResult.Failure) {
            throw new RuntimeException("Failed To Load Asset: " + this.$asset.getUrl());
        }
        return Unit.INSTANCE;
    }
}
