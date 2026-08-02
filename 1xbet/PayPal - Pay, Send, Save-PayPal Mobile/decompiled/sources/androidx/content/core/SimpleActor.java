package androidx.content.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Be\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u00070\t\u0012\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R0\u0010\u0017\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001b"}, d2 = {"Landroidx/datastore/core/SimpleActor;", "T", "", "Lkotlinx/coroutines/CoroutineScope;", com.paypal.oslo.feature.identity.connect.inboundconnect.utils.Constants.SCOPE_KEY, "Lkotlin/Function1;", "", "", "onComplete", "Lkotlin/Function2;", "onUndeliveredElement", "Lkotlin/coroutines/Continuation;", "consumeMessage", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "offer", "(Ljava/lang/Object;)V", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRangesFor", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function2;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/channels/Channel;", "Lkotlinx/coroutines/channels/Channel;", "Landroidx/datastore/core/AtomicInt;", "Landroidx/datastore/core/AtomicInt;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SimpleActor<T> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.coroutines.channels.Channel<T> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.content.core.AtomicInt Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(kotlinx.coroutines.CoroutineScope coroutineScope, final kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> function1, final kotlin.jvm.functions.Function2<? super T, ? super java.lang.Throwable, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> function22) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function22, "");
        this.getHighSpeedVideoFpsRangesFor = coroutineScope;
        this.getHighSpeedVideoFpsRanges = function22;
        this.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.channels.ChannelKt.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
        this.Camera2StreamConfigurationMap = new androidx.content.core.AtomicInt(0);
        kotlinx.coroutines.Job job = (kotlinx.coroutines.Job) coroutineScope.getCoroutineContext().get(kotlinx.coroutines.Job.INSTANCE);
        if (job != null) {
            job.invokeOnCompletion(new kotlin.jvm.functions.Function1() { // from class: androidx.datastore.core.SimpleActor$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return androidx.content.core.SimpleActor.$r8$lambda$nRFxmKEQW4A55GP78dGHESugakE(kotlin.jvm.functions.Function1.this, this, function2, (java.lang.Throwable) obj);
                }
            });
        }
    }

    public final void offer(T msg) {
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.mo9266trySendJP2dKIU(msg);
        if (obj instanceof kotlinx.coroutines.channels.ChannelResult.Closed) {
            java.lang.Throwable m24083exceptionOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24083exceptionOrNullimpl(obj);
            if (m24083exceptionOrNullimpl != null) {
                throw m24083exceptionOrNullimpl;
            }
            throw new kotlinx.coroutines.channels.ClosedSendChannelException("Channel was closed normally");
        }
        if (!kotlinx.coroutines.channels.ChannelResult.m24089isSuccessimpl(obj)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (this.Camera2StreamConfigurationMap.getAndIncrement() == 0) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getHighSpeedVideoFpsRangesFor, null, null, new androidx.content.core.SimpleActor$offer$2(this, null), 3, null);
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nRFxmKEQW4A55GP78dGHESugakE(kotlin.jvm.functions.Function1 function1, androidx.content.core.SimpleActor simpleActor, kotlin.jvm.functions.Function2 function2, java.lang.Throwable th) {
        function1.invoke(th);
        simpleActor.getHighResolutionOutputSizeshNQ4ISI.close(th);
        while (true) {
            java.lang.Object m24084getOrNullimpl = kotlinx.coroutines.channels.ChannelResult.m24084getOrNullimpl(simpleActor.getHighResolutionOutputSizeshNQ4ISI.mo24073tryReceivePtdJZtk());
            if (m24084getOrNullimpl == null) {
                return kotlin.Unit.INSTANCE;
            }
            function2.invoke(m24084getOrNullimpl, th);
        }
    }
}
