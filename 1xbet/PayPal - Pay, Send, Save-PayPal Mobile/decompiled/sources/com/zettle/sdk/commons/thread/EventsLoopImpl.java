package com.zettle.sdk.commons.thread;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00112\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010 \u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0002H\u0016¢\u0006\u0004\b \u0010!R\u001e\u0010$\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R&\u0010)\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00190'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Lcom/zettle/sdk/commons/thread/EventsLoopImpl;", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "Lkotlin/Function0;", "", "Lcom/zettle/sdk/commons/thread/GetUptimeMillis;", "getUptimeMillis", "", "sdkInt", "Landroid/os/Handler;", "handler", "<init>", "(Lkotlin/jvm/functions/Function0;ILandroid/os/Handler;)V", "Lkotlinx/coroutines/CoroutineDispatcher;", "asDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "", "tag", "", com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, "(Ljava/lang/String;)V", "initHandler", "(Landroid/os/Handler;)V", "action", "post", "(Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function1;", "p0", "getHighSpeedVideoSizes", "(Lkotlin/jvm/functions/Function1;)V", "delay", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "schedule", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;Lkotlin/jvm/functions/Function0;)V", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/os/Handler;", "", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class EventsLoopImpl implements com.zettle.sdk.commons.thread.EventsLoop {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Long> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private android.os.Handler getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit>> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    public EventsLoopImpl(kotlin.jvm.functions.Function0<java.lang.Long> function0, int i, android.os.Handler handler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighSpeedVideoFpsRanges = function0;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes = handler;
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
    }

    public /* synthetic */ EventsLoopImpl(kotlin.jvm.functions.Function0 function0, int i, android.os.Handler handler, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, i, (i2 & 4) != 0 ? null : handler);
    }

    @Override // com.zettle.sdk.commons.thread.EventsLoop
    public final void post(kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        com.zettle.sdk.commons.thread.EventsLoopImpl$post$1 eventsLoopImpl$post$1 = new com.zettle.sdk.commons.thread.EventsLoopImpl$post$1(action, this);
        android.os.Handler handler = this.getHighSpeedVideoSizes;
        if (handler != null) {
            eventsLoopImpl$post$1.invoke(handler);
        } else {
            getHighSpeedVideoSizes(eventsLoopImpl$post$1);
        }
    }

    @Override // com.zettle.sdk.commons.thread.EventsLoop
    public final void cancel(final java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit> function1 = new kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit>() { // from class: com.zettle.sdk.commons.thread.EventsLoopImpl$cancel$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(android.os.Handler handler) {
                getHighSpeedVideoSizes(handler);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighSpeedVideoSizes(android.os.Handler handler) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
                handler.removeCallbacksAndMessages(tag);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }
        };
        android.os.Handler handler = this.getHighSpeedVideoSizes;
        if (handler != null) {
            function1.invoke(handler);
        } else {
            getHighSpeedVideoSizes(function1);
        }
    }

    @Override // com.zettle.sdk.commons.thread.EventsLoop
    public final kotlinx.coroutines.CoroutineDispatcher asDispatcher() {
        kotlinx.coroutines.android.HandlerDispatcher from$default;
        android.os.Handler handler = this.getHighSpeedVideoSizes;
        return (handler == null || (from$default = kotlinx.coroutines.android.HandlerDispatcherKt.from$default(handler, null, 1, null)) == null) ? new kotlinx.coroutines.CoroutineDispatcher() { // from class: com.zettle.sdk.commons.thread.EventsLoopImpl$asDispatcher$1
            @Override // kotlinx.coroutines.CoroutineDispatcher
            public final void dispatch(final kotlin.coroutines.CoroutineContext context, final java.lang.Runnable block) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(block, "");
                com.zettle.sdk.commons.thread.EventsLoopImpl.access$runWithHandler(com.zettle.sdk.commons.thread.EventsLoopImpl.this, new kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit>() { // from class: com.zettle.sdk.commons.thread.EventsLoopImpl$asDispatcher$1$dispatch$1
                    public final void getHighSpeedVideoFpsRangesFor(android.os.Handler handler2) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler2, "");
                        kotlinx.coroutines.android.HandlerDispatcherKt.from$default(handler2, null, 1, null).dispatch(kotlin.coroutines.CoroutineContext.this, block);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ kotlin.Unit invoke(android.os.Handler handler2) {
                        getHighSpeedVideoFpsRangesFor(handler2);
                        return kotlin.Unit.INSTANCE;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }
                });
            }
        } : from$default;
    }

    @Override // com.zettle.sdk.commons.thread.EventsLoop
    public final void schedule(java.lang.String tag, long delay, java.util.concurrent.TimeUnit timeUnit, kotlin.jvm.functions.Function0<kotlin.Unit> action) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeUnit, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(action, "");
        com.zettle.sdk.commons.thread.EventsLoopImpl$schedule$1 eventsLoopImpl$schedule$1 = new com.zettle.sdk.commons.thread.EventsLoopImpl$schedule$1(this, timeUnit, delay, action, tag);
        android.os.Handler handler = this.getHighSpeedVideoSizes;
        if (handler != null) {
            eventsLoopImpl$schedule$1.invoke(handler);
        } else {
            getHighSpeedVideoSizes(eventsLoopImpl$schedule$1);
        }
    }

    public final void initHandler(android.os.Handler handler) {
        synchronized (this) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            if (this.getHighSpeedVideoSizes != null) {
                return;
            }
            this.getHighSpeedVideoSizes = handler;
            java.util.List<kotlin.jvm.functions.Function1<android.os.Handler, kotlin.Unit>> list = this.getHighSpeedVideoFpsRangesFor;
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function1) it.next()).invoke(handler);
            }
            list.clear();
        }
    }

    private final void getHighSpeedVideoSizes(kotlin.jvm.functions.Function1<? super android.os.Handler, kotlin.Unit> p0) {
        synchronized (this) {
            android.os.Handler handler = this.getHighSpeedVideoSizes;
            if (handler == null) {
                this.getHighSpeedVideoFpsRangesFor.add(p0);
            } else {
                p0.invoke(handler);
            }
        }
    }

    public static final /* synthetic */ void access$runWithHandler(com.zettle.sdk.commons.thread.EventsLoopImpl eventsLoopImpl, kotlin.jvm.functions.Function1 function1) {
        android.os.Handler handler = eventsLoopImpl.getHighSpeedVideoSizes;
        if (handler != null) {
            function1.invoke(handler);
        } else {
            eventsLoopImpl.getHighSpeedVideoSizes(function1);
        }
    }
}
