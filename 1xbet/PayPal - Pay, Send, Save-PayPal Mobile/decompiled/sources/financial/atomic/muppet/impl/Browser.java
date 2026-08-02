package financial.atomic.muppet.impl;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0001&B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0004¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\t2-\u0010\u0006\u001a)\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u0016H\u0096@¢\u0006\u0004\b\u0014\u0010\u001aJ$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@¢\u0006\u0004\b\u0014\u0010\u001bJ\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rH\u0096@¢\u0006\u0004\b\u001f\u0010\u0015R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b\u000e\u0010!R&\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\"8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010\u001e¨\u0006'"}, d2 = {"Lfinancial/atomic/muppet/impl/Browser;", "T", "Lfinancial/atomic/muppet/Emitter;", "", "Lfinancial/atomic/muppet/inter/Browser;", "Lfinancial/atomic/muppet/inter/Page$Factory;", "factory", "<init>", "(Lfinancial/atomic/muppet/inter/Page$Factory;)V", "Lfinancial/atomic/muppet/inter/Page;", "page", "", com.datadog.trace.bootstrap.instrumentation.api.SamplerConstants.KEEP, "", "a", "(Lfinancial/atomic/muppet/inter/Page;Z)V", "(Lfinancial/atomic/muppet/inter/Page;)V", "", "handle", "()Ljava/lang/String;", "newPage", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "browser", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lfinancial/atomic/muppet/inter/Page$Factory;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "pages", "()Ljava/util/List;", "close", "Lfinancial/atomic/muppet/inter/Page$Factory;", "()Lfinancial/atomic/muppet/inter/Page$Factory;", "", util.h.xy.cb.b.f1091, "Ljava/util/List;", "_pages", "Event", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Browser<T> extends financial.atomic.muppet.Emitter<java.lang.Object> implements financial.atomic.muppet.inter.Browser<T> {
    private final financial.atomic.muppet.inter.Page.Factory<T> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<financial.atomic.muppet.inter.Page<T>> getHighSpeedVideoFpsRanges;

    public Browser(financial.atomic.muppet.inter.Page.Factory<T> factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        this.getHighResolutionOutputSizeshNQ4ISI = factory;
        this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
    }

    public static /* synthetic */ void removePage$default(financial.atomic.muppet.impl.Browser browser, financial.atomic.muppet.inter.Page page, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removePage");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        browser.a(page, z);
    }

    public final financial.atomic.muppet.inter.Page.Factory<T> a() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<financial.atomic.muppet.inter.Page<T>> b() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // financial.atomic.muppet.inter.Browser
    public java.lang.Object close(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new financial.atomic.muppet.d.b(this, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    @Override // financial.atomic.muppet.inter.Browser
    public java.lang.String handle() {
        return java.lang.String.valueOf(hashCode());
    }

    @Override // financial.atomic.muppet.inter.Browser
    public java.lang.Object newPage(kotlin.jvm.functions.Function1<? super financial.atomic.muppet.inter.Browser<T>, ? extends financial.atomic.muppet.inter.Page<? extends T>> function1, kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends T>> continuation) {
        return a(this, function1, continuation);
    }

    @Override // financial.atomic.muppet.inter.Browser
    public java.util.List<financial.atomic.muppet.inter.Page<T>> pages() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void a(financial.atomic.muppet.inter.Page<? extends T> page, boolean keep) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        if (keep) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.remove(page);
    }

    @Override // financial.atomic.muppet.inter.Browser
    public java.lang.Object newPage(kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends T>> continuation) {
        return newPage(this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    public final void a(financial.atomic.muppet.inter.Page<? extends T> page) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(page, "");
        page.on(financial.atomic.muppet.impl.Page.Event.closed, new financial.atomic.muppet.d.a(this, null));
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getMain()), null, null, new financial.atomic.muppet.impl.a(this, page, null), 3, null);
        this.getHighSpeedVideoFpsRanges.add(page);
    }

    public java.lang.Object newPage(financial.atomic.muppet.inter.Page.Factory<T> factory, kotlin.coroutines.Continuation<? super financial.atomic.muppet.inter.Page<? extends T>> continuation) {
        financial.atomic.muppet.inter.Page<? extends T> create = factory.create(this);
        a(create);
        return create;
    }

    public static /* synthetic */ java.lang.Object a(final financial.atomic.muppet.impl.Browser browser, final kotlin.jvm.functions.Function1 function1, kotlin.coroutines.Continuation continuation) {
        return browser.newPage(new financial.atomic.muppet.inter.Page.Factory() { // from class: financial.atomic.muppet.impl.Browser$$ExternalSyntheticLambda0
            @Override // financial.atomic.muppet.inter.Page.Factory
            public final financial.atomic.muppet.inter.Page create(financial.atomic.muppet.inter.Browser browser2) {
                return financial.atomic.muppet.impl.Browser.$r8$lambda$APDdlpt_qQTnvU1mdrqLlR_7Ejo(kotlin.jvm.functions.Function1.this, browser, browser2);
            }
        }, continuation);
    }

    public static /* synthetic */ financial.atomic.muppet.inter.Page $r8$lambda$APDdlpt_qQTnvU1mdrqLlR_7Ejo(kotlin.jvm.functions.Function1 function1, financial.atomic.muppet.impl.Browser browser, financial.atomic.muppet.inter.Browser browser2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(browser2, "");
        return (financial.atomic.muppet.inter.Page) function1.invoke(browser);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lfinancial/atomic/muppet/impl/Browser$Event;", "", "<init>", "(Ljava/lang/String;I)V", "page", com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Event {
        public static final financial.atomic.muppet.impl.Browser.Event closed;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ financial.atomic.muppet.impl.Browser.Event[] getHighSpeedVideoSizes;
        public static final financial.atomic.muppet.impl.Browser.Event page;

        static {
            financial.atomic.muppet.impl.Browser.Event event = new financial.atomic.muppet.impl.Browser.Event("page", 0);
            page = event;
            financial.atomic.muppet.impl.Browser.Event event2 = new financial.atomic.muppet.impl.Browser.Event(com.paypal.oslo.feature.notificationcenter.analytics.NotificationCenterAnalyticsConstants.Action.CLOSED, 1);
            closed = event2;
            financial.atomic.muppet.impl.Browser.Event[] eventArr = {event, event2};
            getHighSpeedVideoSizes = eventArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(eventArr);
        }

        private Event(java.lang.String str, int i) {
        }

        public static financial.atomic.muppet.impl.Browser.Event valueOf(java.lang.String str) {
            return (financial.atomic.muppet.impl.Browser.Event) java.lang.Enum.valueOf(financial.atomic.muppet.impl.Browser.Event.class, str);
        }

        public static financial.atomic.muppet.impl.Browser.Event[] values() {
            return (financial.atomic.muppet.impl.Browser.Event[]) getHighSpeedVideoSizes.clone();
        }

        public static kotlin.enums.EnumEntries<financial.atomic.muppet.impl.Browser.Event> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }
}
