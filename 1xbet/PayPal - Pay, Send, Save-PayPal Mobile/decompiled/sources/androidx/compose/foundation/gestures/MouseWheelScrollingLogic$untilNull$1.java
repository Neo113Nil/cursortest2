package androidx.compose.foundation.gestures;

/* JADX INFO: Add missing generic type declarations: [E] */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1", f = "MouseWheelScrollable.kt", i = {0}, l = {207}, m = "invokeSuspend", n = {"$this$sequence"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class MouseWheelScrollingLogic$untilNull$1<E> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super E>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    int Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function0<E> getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0037 -> B:5:0x003b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.Camera2StreamConfigurationMap
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r4.getHighSpeedVideoSizes
            java.lang.Object r3 = r4.getHighSpeedVideoFpsRanges
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            kotlin.ResultKt.throwOnFailure(r5)
            goto L3b
        L15:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1d:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.getHighSpeedVideoFpsRanges
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            r3 = r5
        L25:
            kotlin.jvm.functions.Function0<E> r5 = r4.getHighSpeedVideoFpsRangesFor
            java.lang.Object r1 = r5.invoke()
            if (r1 == 0) goto L3a
            r4.getHighSpeedVideoFpsRanges = r3
            r4.getHighSpeedVideoSizes = r1
            r4.Camera2StreamConfigurationMap = r2
            java.lang.Object r5 = r3.yield(r1, r4)
            if (r5 != r0) goto L3b
            return r0
        L3a:
            r1 = 0
        L3b:
            if (r1 != 0) goto L25
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlin.sequences.SequenceScope<? super E> sequenceScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1) create(sequenceScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1 mouseWheelScrollingLogic$untilNull$1 = new androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1(this.getHighSpeedVideoFpsRangesFor, continuation);
        mouseWheelScrollingLogic$untilNull$1.getHighSpeedVideoFpsRanges = obj;
        return mouseWheelScrollingLogic$untilNull$1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MouseWheelScrollingLogic$untilNull$1(kotlin.jvm.functions.Function0<? extends E> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.MouseWheelScrollingLogic$untilNull$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = function0;
    }
}
