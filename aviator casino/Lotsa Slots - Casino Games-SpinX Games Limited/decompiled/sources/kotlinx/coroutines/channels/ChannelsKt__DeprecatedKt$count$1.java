package kotlinx.coroutines.channels;

/* compiled from: Deprecated.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0}, l = {514}, m = com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, n = {com.helpshift.HelpshiftEvent.DATA_MESSAGE_COUNT, "$this$consume$iv$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes6.dex */
final class ChannelsKt__DeprecatedKt$count$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;

    ChannelsKt__DeprecatedKt$count$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$count$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object count;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        count = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.count(null, this);
        return count;
    }
}
