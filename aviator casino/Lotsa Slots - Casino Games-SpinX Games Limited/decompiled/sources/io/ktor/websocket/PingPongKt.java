package io.ktor.websocket;

/* compiled from: PingPong.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame$Pong;", "outgoing", "Lio/ktor/websocket/Frame$Ping;", "ponger", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;)Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame;", "", "periodMillis", "timeoutMillis", "Lkotlin/Function2;", "Lio/ktor/websocket/CloseReason;", "Lkotlin/coroutines/Continuation;", "", "", "onTimeout", "pinger", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;JJLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/CoroutineName;", "PongerCoroutineName", "Lkotlinx/coroutines/CoroutineName;", "PingerCoroutineName", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PingPongKt {
    private static final kotlinx.coroutines.CoroutineName PongerCoroutineName = new kotlinx.coroutines.CoroutineName("ws-ponger");
    private static final kotlinx.coroutines.CoroutineName PingerCoroutineName = new kotlinx.coroutines.CoroutineName("ws-pinger");

    public static final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Ping> ponger(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame.Pong> outgoing) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(5, null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, PongerCoroutineName, null, new io.ktor.websocket.PingPongKt$ponger$1(Channel$default, outgoing, null), 2, null);
        return Channel$default;
    }

    public static final kotlinx.coroutines.channels.SendChannel<io.ktor.websocket.Frame.Pong> pinger(kotlinx.coroutines.CoroutineScope coroutineScope, kotlinx.coroutines.channels.SendChannel<? super io.ktor.websocket.Frame> outgoing, long j, long j2, kotlin.jvm.functions.Function2<? super io.ktor.websocket.CloseReason, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> onTimeout) {
        final kotlinx.coroutines.CompletableJob Job$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        Job$default = kotlinx.coroutines.JobKt__JobKt.Job$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null);
        kotlinx.coroutines.channels.Channel Channel$default = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, Job$default.plus(PingerCoroutineName), null, new io.ktor.websocket.PingPongKt$pinger$1(j, j2, onTimeout, Channel$default, outgoing, null), 2, null);
        kotlin.coroutines.CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        kotlin.jvm.internal.Intrinsics.checkNotNull(element);
        ((kotlinx.coroutines.Job) element).invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: io.ktor.websocket.PingPongKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit pinger$lambda$0;
                pinger$lambda$0 = io.ktor.websocket.PingPongKt.pinger$lambda$0(kotlinx.coroutines.CompletableJob.this, (java.lang.Throwable) obj);
                return pinger$lambda$0;
            }
        });
        return Channel$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit pinger$lambda$0(kotlinx.coroutines.CompletableJob completableJob, java.lang.Throwable th) {
        kotlinx.coroutines.Job.DefaultImpls.cancel$default((kotlinx.coroutines.Job) completableJob, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }
}
