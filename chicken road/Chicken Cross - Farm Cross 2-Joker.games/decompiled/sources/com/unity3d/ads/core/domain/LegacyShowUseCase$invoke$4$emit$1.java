package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.ShowEvent;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LegacyShowUseCase.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4", f = "LegacyShowUseCase.kt", i = {0}, l = {Sdk.SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit", n = {"it"}, s = {"L$0"})
/* loaded from: classes7.dex */
final class LegacyShowUseCase$invoke$4$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LegacyShowUseCase$invoke$4<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    LegacyShowUseCase$invoke$4$emit$1(LegacyShowUseCase$invoke$4<? super T> legacyShowUseCase$invoke$4, Continuation<? super LegacyShowUseCase$invoke$4$emit$1> continuation) {
        super(continuation);
        this.this$0 = legacyShowUseCase$invoke$4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((ShowEvent) null, (Continuation<? super Unit>) this);
    }
}
