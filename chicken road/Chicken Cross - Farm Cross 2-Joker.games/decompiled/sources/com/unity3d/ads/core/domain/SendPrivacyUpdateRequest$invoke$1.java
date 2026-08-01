package com.unity3d.ads.core.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SendPrivacyUpdateRequest.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.SendPrivacyUpdateRequest", f = "SendPrivacyUpdateRequest.kt", i = {}, l = {21, 23}, m = "invoke", n = {}, s = {})
/* loaded from: classes7.dex */
final class SendPrivacyUpdateRequest$invoke$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SendPrivacyUpdateRequest this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SendPrivacyUpdateRequest$invoke$1(SendPrivacyUpdateRequest sendPrivacyUpdateRequest, Continuation<? super SendPrivacyUpdateRequest$invoke$1> continuation) {
        super(continuation);
        this.this$0 = sendPrivacyUpdateRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(0, null, this);
    }
}
