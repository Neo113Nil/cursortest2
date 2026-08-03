package kotlinx.coroutines.channels;

/* compiled from: Deprecated.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", f = "Deprecated.kt", i = {0, 0, 0}, l = {514}, m = "indexOf", n = {"element", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes6.dex */
final class ChannelsKt__DeprecatedKt$indexOf$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;
    /* synthetic */ java.lang.Object result;

    ChannelsKt__DeprecatedKt$indexOf$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$indexOf$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object indexOf;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        indexOf = kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt.indexOf(null, null, this);
        return indexOf;
    }
}
