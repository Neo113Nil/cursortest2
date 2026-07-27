package io.ktor.websocket;

import io.ktor.websocket.Frame;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: PingPong.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a[\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame$Pong;", "outgoing", "Lio/ktor/websocket/Frame$Ping;", "ponger", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;)Lkotlinx/coroutines/channels/SendChannel;", "Lio/ktor/websocket/Frame;", "", "periodMillis", "timeoutMillis", "Lkotlin/Function2;", "Lio/ktor/websocket/CloseReason;", "Lkotlin/coroutines/Continuation;", "", "", "onTimeout", "pinger", "(Lkotlinx/coroutines/CoroutineScope;Lkotlinx/coroutines/channels/SendChannel;JJLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "Lkotlinx/coroutines/CoroutineName;", "PongerCoroutineName", "Lkotlinx/coroutines/CoroutineName;", "PingerCoroutineName", "ktor-websockets"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PingPongKt {
    private static final CoroutineName PongerCoroutineName = new CoroutineName("ws-ponger");
    private static final CoroutineName PingerCoroutineName = new CoroutineName("ws-pinger");

    public static final SendChannel<Frame.Ping> ponger(CoroutineScope coroutineScope, SendChannel<? super Frame.Pong> outgoing) {
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        Channel Channel$default = ChannelKt.Channel$default(5, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, PongerCoroutineName, null, new PingPongKt$ponger$1(Channel$default, outgoing, null), 2, null);
        return Channel$default;
    }

    public static final SendChannel<Frame.Pong> pinger(CoroutineScope coroutineScope, SendChannel<? super Frame> outgoing, long j, long j2, Function2<? super CloseReason, ? super Continuation<? super Unit>, ? extends Object> onTimeout) {
        final CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(coroutineScope, "<this>");
        Intrinsics.checkNotNullParameter(outgoing, "outgoing");
        Intrinsics.checkNotNullParameter(onTimeout, "onTimeout");
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        Channel Channel$default = ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Job$default.plus(PingerCoroutineName), null, new PingPongKt$pinger$1(j, j2, onTimeout, Channel$default, outgoing, null), 2, null);
        CoroutineContext.Element element = coroutineScope.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        ((Job) element).invokeOnCompletion(new Function1() { // from class: io.ktor.websocket.PingPongKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit pinger$lambda$0;
                pinger$lambda$0 = PingPongKt.pinger$lambda$0(CompletableJob.this, (Throwable) obj);
                return pinger$lambda$0;
            }
        });
        return Channel$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit pinger$lambda$0(CompletableJob completableJob, Throwable th) {
        Job.DefaultImpls.cancel$default((Job) completableJob, (CancellationException) null, 1, (Object) null);
        return Unit.INSTANCE;
    }
}
