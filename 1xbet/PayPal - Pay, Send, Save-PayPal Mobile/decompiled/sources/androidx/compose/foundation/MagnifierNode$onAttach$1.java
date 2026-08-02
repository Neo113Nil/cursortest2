package androidx.compose.foundation;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.MagnifierNode$onAttach$1", f = "Magnifier.android.kt", i = {}, l = {382, 386}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class MagnifierNode$onAttach$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.MagnifierNode getHighSpeedVideoFpsRanges;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x003a -> B:8:0x0021). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004a -> B:6:0x004d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.Camera2StreamConfigurationMap
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r5)
            goto L4d
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1a:
            kotlin.ResultKt.throwOnFailure(r5)
            goto L34
        L1e:
            kotlin.ResultKt.throwOnFailure(r5)
        L21:
            androidx.compose.foundation.MagnifierNode r5 = r4.getHighSpeedVideoFpsRanges
            kotlinx.coroutines.channels.Channel r5 = androidx.compose.foundation.MagnifierNode.access$getDrawSignalChannel$p(r5)
            if (r5 == 0) goto L34
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r4.Camera2StreamConfigurationMap = r3
            java.lang.Object r5 = r5.receive(r1)
            if (r5 == r0) goto L4c
        L34:
            androidx.compose.foundation.MagnifierNode r5 = r4.getHighSpeedVideoFpsRanges
            androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
            if (r5 == 0) goto L21
            androidx.compose.foundation.MagnifierNode$onAttach$1$$ExternalSyntheticLambda0 r5 = new androidx.compose.foundation.MagnifierNode$onAttach$1$$ExternalSyntheticLambda0
            r5.<init>()
            r1 = r4
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r4.Camera2StreamConfigurationMap = r2
            java.lang.Object r5 = androidx.compose.runtime.MonotonicFrameClockKt.withFrameMillis(r5, r1)
            if (r5 != r0) goto L4d
        L4c:
            return r0
        L4d:
            androidx.compose.foundation.MagnifierNode r5 = r4.getHighSpeedVideoFpsRanges
            androidx.compose.foundation.PlatformMagnifier r5 = androidx.compose.foundation.MagnifierNode.access$getMagnifier$p(r5)
            if (r5 == 0) goto L21
            r5.updateContent()
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MagnifierNode$onAttach$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.MagnifierNode$onAttach$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.MagnifierNode$onAttach$1(this.getHighSpeedVideoFpsRanges, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MagnifierNode$onAttach$1(androidx.compose.foundation.MagnifierNode magnifierNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.MagnifierNode$onAttach$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = magnifierNode;
    }
}
