package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.InflateException;
import androidx.lifecycle.Lifecycle;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.ironsource.U3;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f {
    public static final int x = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11542a;
    public final boolean b;
    public final i c;
    public final MetricsRecorder d;
    public final String e;
    public final CoroutineScope f;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> g;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> h;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> i;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> j;
    public final MutableStateFlow<l> k;
    public final StateFlow<l> l;
    public final StyledPlayerView m;
    public String n;
    public boolean o;
    public final Looper p;
    public ExoPlayer q;
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c r;
    public boolean s;
    public final C1614d t;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e u;
    public long v;
    public Job w;

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$1", f = "SimplifiedExoPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11543a;
        public /* synthetic */ Object b;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar, Continuation<? super Unit> continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f11543a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b) this.b).e()) {
                d.this.M();
            } else {
                Job job = d.this.w;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f11544a;
        public final /* synthetic */ c b;

        public b(ExoPlayer exoPlayer, c cVar) {
            this.f11544a = exoPlayer;
            this.b = cVar;
        }

        public final void a(Throwable th) {
            this.f11544a.removeListener(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements Player.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f11545a;
        public final /* synthetic */ ExoPlayer b;
        public final /* synthetic */ CancellableContinuation<Unit> c;

        /* JADX WARN: Multi-variable type inference failed */
        public c(int i, ExoPlayer exoPlayer, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.f11545a = i;
            this.b = exoPlayer;
            this.c = cancellableContinuation;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == this.f11545a) {
                this.b.removeListener(this);
                if (this.c.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = this.c;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
                }
            }
        }
    }

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d$d, reason: collision with other inner class name */
    public static final class C1614d implements Player.Listener {
        public C1614d() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            super.onIsPlayingChanged(z);
            ExoPlayer l = d.this.l();
            long duration = l != null ? l.getDuration() : 0L;
            ExoPlayer l2 = d.this.l();
            boolean z2 = duration - (l2 != null ? l2.getCurrentPosition() : 0L) > 0;
            MolocoLogger.info$default(MolocoLogger.INSTANCE, d.this.e, "onIsPlayingChanged hasMore= " + z2, null, false, 12, null);
            d.this.i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(z, true, z2));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            super.onPlaybackStateChanged(i);
            String valueOf = i != 1 ? i != 2 ? i != 3 ? i != 4 ? String.valueOf(i) : "ENDED" : "READY" : "BUFFERING" : "IDLE";
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str = d.this.e;
            StringBuilder append = new StringBuilder("onPlaybackStateChanged: ").append(valueOf).append(" pos=");
            ExoPlayer l = d.this.l();
            StringBuilder append2 = append.append(l != null ? Long.valueOf(l.getCurrentPosition()) : null).append(" dur=");
            ExoPlayer l2 = d.this.l();
            MolocoLogger.info$default(molocoLogger, str, append2.append(l2 != null ? Long.valueOf(l2.getDuration()) : null).toString(), null, false, 12, null);
            if (i == 4) {
                d dVar = d.this;
                ExoPlayer l3 = d.this.l();
                dVar.b(new i.a(l3 != null ? l3.getDuration() : 1L));
                d.this.E();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException error) {
            String str;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c cVar;
            Intrinsics.checkNotNullParameter(error, "error");
            super.onPlayerError(error);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, d.this.e, "Exoplayer error (streaming enabled = " + d.this.b + ')', error, false, 8, null);
            MetricsRecorder metricsRecorder = d.this.d;
            CountEvent withTag = new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.c0.c()).withTag("error_code", String.valueOf(error.errorCode));
            String errorCodeName = PlaybackException.getErrorCodeName(error.errorCode);
            Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
            CountEvent withTag2 = withTag.withTag("error_code_name", errorCodeName);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c cVar2 = d.this.r;
            CountEvent withTag3 = withTag2.withTag("has_streaming_error", String.valueOf(cVar2 != null && cVar2.a()));
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) d.this.g.getValue();
            if (iVar instanceof i.b) {
                str = "not_available";
            } else if (iVar instanceof i.d) {
                str = "preparing";
            } else if (iVar instanceof i.c) {
                str = U3.i.L;
            } else {
                if (!(iVar instanceof i.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "finished";
            }
            metricsRecorder.recordCountEvent(withTag3.withTag("playback_progress", str));
            if (d.this.b && (cVar = d.this.r) != null && cVar.a()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) d.this.g.getValue();
                if ((iVar2 instanceof i.a) || (iVar2 instanceof i.c)) {
                    MolocoLogger.info$default(molocoLogger, d.this.e, "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                    return;
                } else {
                    if (!(iVar2 instanceof i.d) && !Intrinsics.areEqual(iVar2, i.b.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    MolocoLogger.info$default(molocoLogger, d.this.e, "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
                }
            }
            d.this.k.setValue(l.f10977a);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            super.onRenderedFirstFrame();
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            String str = d.this.e;
            StringBuilder sb = new StringBuilder("onRenderedFirstFrame pos=");
            ExoPlayer l = d.this.l();
            MolocoLogger.info$default(molocoLogger, str, sb.append(l != null ? Long.valueOf(l.getCurrentPosition()) : null).toString(), null, false, 12, null);
        }
    }

    public /* synthetic */ class e extends FunctionReferenceImpl implements Function0<Unit> {
        public e(Object obj) {
            super(0, obj, d.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0);
        }

        public final void a() {
            ((d) this.receiver).C();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class f extends FunctionReferenceImpl implements Function0<Unit> {
        public f(Object obj) {
            super(0, obj, d.class, "disposeExoPlayer", "disposeExoPlayer()V", 0);
        }

        public final void a() {
            ((d) this.receiver).k();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            a();
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.SimplifiedExoPlayer$startPlaybackProgressJob$1", f = "SimplifiedExoPlayer.kt", i = {}, l = {356}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f11547a;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return d.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f11547a;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                ExoPlayer l = d.this.l();
                if (l != null) {
                    d.this.b(new i.c(l.getCurrentPosition(), l.getDuration()));
                }
                this.f11547a = 1;
            } while (DelayKt.delay(500L, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    public d(Context context, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i mediaCacheRepository, Lifecycle lifecycle, MetricsRecorder metricsRecorder) {
        StyledPlayerView styledPlayerView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f11542a = context;
        this.b = z;
        this.c = mediaCacheRepository;
        this.d = metricsRecorder;
        this.e = "SimplifiedExoPlayer";
        this.f = CoroutineScopeKt.CoroutineScope(com.moloco.sdk.internal.scheduling.b.a().getMain());
        MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> MutableStateFlow = StateFlowKt.MutableStateFlow(i.b.b);
        this.g = MutableStateFlow;
        this.h = MutableStateFlow;
        MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> MutableStateFlow2 = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(false, false, false, 6, null));
        this.i = MutableStateFlow2;
        this.j = MutableStateFlow2;
        MutableStateFlow<l> MutableStateFlow3 = StateFlowKt.MutableStateFlow(null);
        this.k = MutableStateFlow3;
        this.l = MutableStateFlow3;
        try {
            styledPlayerView = new StyledPlayerView(context);
            styledPlayerView.setUseController(false);
        } catch (InflateException e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "ExoPlayerView could not be instantiated.", e2, false, 8, null);
            this.k.setValue(l.b);
            styledPlayerView = null;
        }
        this.m = styledPlayerView;
        this.p = Looper.getMainLooper();
        FlowKt.launchIn(FlowKt.onEach(isPlaying(), new a(null)), this.f);
        this.t = new C1614d();
        this.u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.e(lifecycle, new e(this), new f(this));
    }

    public static /* synthetic */ void A() {
    }

    public static /* synthetic */ void B() {
    }

    public static /* synthetic */ void o() {
    }

    public final void C() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Init exo player", null, false, 12, null);
        StyledPlayerView R = R();
        if (R == null) {
            return;
        }
        if (this.q == null) {
            ExoPlayer build = new ExoPlayer.Builder(this.f11542a).setLooper(this.p).setPauseAtEndOfMediaItems(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            R.setPlayer(build);
            this.q = build;
            build.setPlayWhenReady(false);
            build.addListener(this.t);
            b(build);
            if (Intrinsics.areEqual(p().getValue(), i.b.b)) {
                b(new i.d(build.getDuration()));
            }
        }
        R.onResume();
    }

    public final void E() {
        this.s = false;
        this.v = 0L;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public boolean G() {
        return this.o;
    }

    public final void M() {
        Job launch$default;
        Job job = this.w;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.f, null, null, new g(null), 3, null);
        this.w = launch$default;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        CoroutineScopeKt.cancel$default(this.f, null, 1, null);
        this.u.destroy();
        k();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> isPlaying() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public String m() {
        return this.n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> p() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void pause() {
        this.s = false;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void play() {
        this.s = true;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public StyledPlayerView R() {
        return this.m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void seekTo(long j) {
        this.v = j;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j);
        }
    }

    public final boolean v() {
        return this.s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void b(boolean z) {
        this.o = z;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            a(exoPlayer, z);
        }
    }

    public final void c(ExoPlayer exoPlayer) {
        this.v = exoPlayer.getCurrentPosition();
    }

    public final void d(ExoPlayer exoPlayer) {
        this.q = exoPlayer;
    }

    public final void e(boolean z) {
        this.s = z;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public StateFlow<l> f() {
        return this.l;
    }

    public final void k() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Disposing exo player", null, false, 12, null);
        StyledPlayerView R = R();
        if (R != null) {
            R.onPause();
            R.setPlayer(null);
        }
        ExoPlayer exoPlayer = this.q;
        long duration = exoPlayer != null ? exoPlayer.getDuration() : 0L;
        ExoPlayer exoPlayer2 = this.q;
        boolean z = duration - (exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : 0L) > 0;
        ExoPlayer exoPlayer3 = this.q;
        if (exoPlayer3 != null) {
            c(exoPlayer3);
            exoPlayer3.removeListener(this.t);
            exoPlayer3.release();
        }
        this.q = null;
        this.i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(false, false, z));
    }

    public final ExoPlayer l() {
        return this.q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void a(String str) {
        this.n = str;
        ExoPlayer exoPlayer = this.q;
        if (exoPlayer != null) {
            a(exoPlayer, str);
        }
        E();
    }

    public final void b(ExoPlayer exoPlayer) {
        a(exoPlayer, G());
        a(exoPlayer, m());
        exoPlayer.seekTo(this.v);
        if (this.s) {
            exoPlayer.play();
        } else {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public Object a(Continuation<? super Unit> continuation) {
        Object a2;
        ExoPlayer exoPlayer = this.q;
        return (exoPlayer == null || (a2 = a(exoPlayer, 3, continuation)) != IntrinsicsKt.getCOROUTINE_SUSPENDED()) ? Unit.INSTANCE : a2;
    }

    public final void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        this.g.setValue(iVar);
    }

    public final boolean a(ExoPlayer exoPlayer) {
        return exoPlayer.getVolume() == 0.0f;
    }

    public final void a(ExoPlayer exoPlayer, boolean z) {
        exoPlayer.setVolume(z ? 0.0f : 1.0f);
    }

    public final void a(ExoPlayer exoPlayer, final String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Streaming is enabled", null, false, 12, null);
                DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(new DataSource.Factory() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d$$ExternalSyntheticLambda0
                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public final DataSource createDataSource() {
                        return d.a(str, this);
                    }
                });
                MediaItem fromUri = MediaItem.fromUri(str);
                Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
                exoPlayer.setMediaSource(defaultMediaSourceFactory.createMediaSource(fromUri));
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.e, "Streaming is disabled", null, false, 12, null);
                exoPlayer.setMediaItem(MediaItem.fromUri(str));
            }
            exoPlayer.prepare();
        } catch (Exception e2) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.e, "ExoPlayer setMediaItem exception", e2, false, 8, null);
            this.k.setValue(l.c);
        }
    }

    public static final DataSource a(String str, d dVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(str, dVar.c);
        dVar.r = cVar;
        return cVar;
    }

    public final Object a(ExoPlayer exoPlayer, int i, Continuation<? super Unit> continuation) {
        if (exoPlayer.getPlaybackState() == i) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        c cVar = new c(i, exoPlayer, cancellableContinuationImpl);
        exoPlayer.addListener(cVar);
        if (exoPlayer.getPlaybackState() == i) {
            exoPlayer.removeListener(cVar);
            if (cancellableContinuationImpl.isActive()) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuationImpl.resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
            }
        }
        cancellableContinuationImpl.invokeOnCancellation(new b(exoPlayer, cVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }
}
