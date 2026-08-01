package com.unity3d.ads.core.domain.adload;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: AndroidWebViewLessLoadStrategy.kt */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.domain.adload.AndroidWebViewLessLoadStrategy", f = "AndroidWebViewLessLoadStrategy.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {51, 58}, m = "invoke", n = {HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", "placementId", "adObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "opportunityId", "placementId", "adObject", HandleInvocationsFromAdViewer.KEY_IS_HEADER_BIDDING}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"})
/* loaded from: classes7.dex */
final class AndroidWebViewLessLoadStrategy$invoke$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AndroidWebViewLessLoadStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidWebViewLessLoadStrategy$invoke$1(AndroidWebViewLessLoadStrategy androidWebViewLessLoadStrategy, Continuation<? super AndroidWebViewLessLoadStrategy$invoke$1> continuation) {
        super(continuation);
        this.this$0 = androidWebViewLessLoadStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.invoke(null, null, null, null, null, null, null, false, this);
    }
}
