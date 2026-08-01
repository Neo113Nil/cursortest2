package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidCacheWebViewAssets.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidCacheWebViewAssets", f = "AndroidCacheWebViewAssets.kt", i = {0, 0}, l = {57}, m = "warmFromDisk", n = {"config", "path"}, s = {"L$0", "L$2"})
/* loaded from: classes7.dex */
final class AndroidCacheWebViewAssets$warmFromDisk$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidCacheWebViewAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheWebViewAssets$warmFromDisk$1(AndroidCacheWebViewAssets androidCacheWebViewAssets, Continuation<? super AndroidCacheWebViewAssets$warmFromDisk$1> continuation) {
        super(continuation);
        this.this$0 = androidCacheWebViewAssets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.warmFromDisk(null, this);
    }
}
