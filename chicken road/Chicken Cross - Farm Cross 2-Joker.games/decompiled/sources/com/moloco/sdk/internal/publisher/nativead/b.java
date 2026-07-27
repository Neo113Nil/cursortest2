package com.moloco.sdk.internal.publisher.nativead;

import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.client_metrics_data.e;
import com.moloco.sdk.internal.ortb.model.C4785h;
import com.moloco.sdk.internal.publisher.C4786a;
import com.moloco.sdk.internal.publisher.C4792g;
import com.moloco.sdk.internal.publisher.nativead.c;
import com.moloco.sdk.internal.publisher.s;
import com.moloco.sdk.internal.publisher.z;
import com.moloco.sdk.internal.services.InterfaceC4805f;
import com.moloco.sdk.internal.u;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.i;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;

/* loaded from: classes7.dex */
public final class b implements NativeAd, s {
    public static final a p = new a(null);
    public static final int q = 8;
    public static final String r = "NativeAdImpl";

    /* renamed from: a, reason: collision with root package name */
    public final String f10634a;
    public final c b;
    public final com.moloco.sdk.internal.publisher.nativead.a c;
    public final InterfaceC4805f d;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a e;
    public final r f;
    public final i g;
    public final C4786a h;
    public final MetricsRecorder i;
    public NativeAd.InteractionListener j;
    public final AdFormatType k;
    public final CoroutineScope l;
    public final TimerEvent m;
    public d n;
    public Job o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.internal.publisher.nativead.NativeAdImpl$load$1", f = "NativeAdImpl.kt", i = {0}, l = {112}, m = "invokeSuspend", n = {"adLoadListenerWithTracker"}, s = {"L$0"})
    /* renamed from: com.moloco.sdk.internal.publisher.nativead.b$b, reason: collision with other inner class name */
    public static final class C1488b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f10635a;
        public int b;
        public final /* synthetic */ AdLoad.Listener d;
        public final /* synthetic */ String e;

        /* renamed from: com.moloco.sdk.internal.publisher.nativead.b$b$a */
        public /* synthetic */ class a extends FunctionReferenceImpl implements Function0<Unit> {
            public a(Object obj) {
                super(0, obj, b.class, "handleGeneralAdClick", "handleGeneralAdClick()V", 0);
            }

            public final void a() {
                ((b) this.receiver).handleGeneralAdClick();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                a();
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1488b(AdLoad.Listener listener, String str, Continuation<? super C1488b> continuation) {
            super(2, continuation);
            this.d = listener;
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C1488b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return b.this.new C1488b(this.d, this.e, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            z zVar;
            Object obj2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = b.this;
                z a2 = bVar.a(bVar.m, this.d);
                c cVar = b.this.b;
                String str = this.e;
                TimerEvent timerEvent = b.this.m;
                this.f10635a = a2;
                this.b = 1;
                Object b = cVar.b(str, timerEvent, a2, this);
                if (b == coroutine_suspended) {
                    return coroutine_suspended;
                }
                zVar = a2;
                obj2 = b;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                zVar = (z) this.f10635a;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).getValue();
            }
            Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj2);
            if (m8082exceptionOrNullimpl != null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, b.r, "Failed to load native ad.", m8082exceptionOrNullimpl, false, 8, null);
                return Unit.INSTANCE;
            }
            c.b bVar2 = (c.b) obj2;
            b bVar3 = b.this;
            boolean z = bVar2.f().d(2) != null;
            boolean z2 = bVar2.f().b(1) != null;
            if (z && !C4785h.c(bVar2.d()) && !bVar3.g()) {
                MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
                MolocoLogger.error$default(molocoLogger, b.r, "Compose dependency not available for native video ad", null, false, 12, null);
                MetricsRecorder metricsRecorder = bVar3.i;
                CountEvent countEvent = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.e0.c());
                String c = com.moloco.sdk.internal.client_metrics_data.d.c.c();
                String lowerCase = bVar3.k.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                metricsRecorder.recordCountEvent(countEvent.withTag(c, lowerCase));
                if (!z2) {
                    zVar.a(u.a(bVar3.f10634a, MolocoAdError.ErrorType.AD_LOAD_FAILED, f.f, null, 8, null), bVar2.d().getExt().getSdkEvents());
                    return Unit.INSTANCE;
                }
                MolocoLogger.warn$default(molocoLogger, b.r, "Compose not available, native video ad will fall back to image view", null, false, 12, null);
            }
            bVar3.a(new d(bVar3.f10634a, bVar2.d(), bVar2.e(), bVar3.d, bVar3.e, bVar3.k, bVar3.g, bVar3.f, bVar3.i));
            bVar3.getAssets().a(bVar2.f());
            bVar3.getAssets().a(new a(bVar3));
            bVar3.getAssets().a(C4785h.c(bVar2.d()));
            zVar.a(MolocoAdKt.createAdInfo$default(bVar3.f10634a, Boxing.boxFloat(bVar2.d().getPrice()), null, 4, null), bVar2.d().getExt().getSdkEvents());
            return Unit.INSTANCE;
        }
    }

    public b(String adUnitId, c nativeAdLoader, com.moloco.sdk.internal.publisher.nativead.a assets, InterfaceC4805f appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, r externalLinkHandler, i persistentHttpRequest, C4786a createLoadTimeoutManager, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(nativeAdLoader, "nativeAdLoader");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10634a = adUnitId;
        this.b = nativeAdLoader;
        this.c = assets;
        this.d = appLifecycleTrackerService;
        this.e = customUserEventBuilderService;
        this.f = externalLinkHandler;
        this.g = persistentHttpRequest;
        this.h = createLoadTimeoutManager;
        this.i = metricsRecorder;
        this.k = AdFormatType.NATIVE;
        this.l = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        this.m = metricsRecorder.startTimerEvent(e.j.c());
    }

    public static /* synthetic */ void b() {
    }

    public static /* synthetic */ void d() {
    }

    public static /* synthetic */ void f() {
    }

    @Override // com.moloco.sdk.internal.publisher.s
    public void a(long j, long j2) {
        this.h.a(j, j2);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.l, null, 1, null);
        getAssets().a();
        setInteractionListener(null);
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: getCreateAdObjectDuration-UwyO8pc */
    public long mo7561getCreateAdObjectDurationUwyO8pc() {
        return this.h.mo7561getCreateAdObjectDurationUwyO8pc();
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public NativeAd.InteractionListener getInteractionListener() {
        return this.j;
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleGeneralAdClick() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onGeneralClickHandled();
        }
        d dVar = this.n;
        if (dVar != null) {
            dVar.c();
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void handleImpression() {
        NativeAd.InteractionListener interactionListener = getInteractionListener();
        if (interactionListener != null) {
            interactionListener.onImpressionHandled();
        }
        d dVar = this.n;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return getAssets().d() != null;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public synchronized void load(String bidResponseJson, AdLoad.Listener listener) {
        Job launch$default;
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Job job = this.o;
        if (job != null && job.isActive()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, r, "load() called while another load operation is in progress. Ignoring this call.", null, false, 12, null);
        } else if (isLoaded()) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, r, "load() called but ad is already loaded. Ignoring this call.", null, false, 12, null);
        } else {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.l, null, null, new C1488b(listener, bidResponseJson, null), 3, null);
            this.o = launch$default;
        }
    }

    @Override // com.moloco.sdk.internal.publisher.s
    /* renamed from: setCreateAdObjectDuration-LRDsOJo */
    public void mo7562setCreateAdObjectDurationLRDsOJo(long j) {
        this.h.mo7562setCreateAdObjectDurationLRDsOJo(j);
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public void setInteractionListener(NativeAd.InteractionListener interactionListener) {
        this.j = interactionListener;
    }

    public final Job c() {
        return this.o;
    }

    public final CoroutineScope e() {
        return this.l;
    }

    public final boolean g() {
        try {
            Class.forName("androidx.compose.ui.platform.ComposeView");
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd
    public com.moloco.sdk.internal.publisher.nativead.a getAssets() {
        return this.c;
    }

    public final d a() {
        return this.n;
    }

    public final void a(d dVar) {
        this.n = dVar;
    }

    public final void a(Job job) {
        this.o = job;
    }

    public final z a(TimerEvent timerEvent, AdLoad.Listener listener) {
        return C4792g.a(listener, timerEvent, this.k, this.i, null, 16, null);
    }
}
