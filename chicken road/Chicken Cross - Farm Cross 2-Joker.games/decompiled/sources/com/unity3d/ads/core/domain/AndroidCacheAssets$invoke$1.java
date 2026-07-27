package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidCacheAssets.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidCacheAssets", f = "AndroidCacheAssets.kt", i = {}, l = {58}, m = "invoke", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidCacheAssets$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidCacheAssets this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidCacheAssets$invoke$1(AndroidCacheAssets androidCacheAssets, Continuation<? super AndroidCacheAssets$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidCacheAssets;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, this);
    }
}
