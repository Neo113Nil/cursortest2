package com.unity3d.ads.core.data.repository;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidSessionRepository.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.AndroidSessionRepository", f = "AndroidSessionRepository.kt", i = {0}, l = {271, 272}, m = "setPrivacy", n = {"value"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class AndroidSessionRepository$setPrivacy$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidSessionRepository$setPrivacy$1(AndroidSessionRepository androidSessionRepository, Continuation<? super AndroidSessionRepository$setPrivacy$1> continuation) {
        super(continuation);
        this.this$0 = androidSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.setPrivacy(null, this);
    }
}
