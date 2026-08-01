package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidHandleOpenUrl.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.AndroidHandleOpenUrl", f = "AndroidHandleOpenUrl.kt", i = {}, l = {52}, m = "invoke", n = {}, s = {})
/* loaded from: classes7.dex */
final class AndroidHandleOpenUrl$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidHandleOpenUrl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidHandleOpenUrl$invoke$1(AndroidHandleOpenUrl androidHandleOpenUrl, Continuation<? super AndroidHandleOpenUrl$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidHandleOpenUrl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, false, this);
    }
}
