package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes7.dex */
public final class a implements f {
    public static final C1613a l = new C1613a(null);
    public static final int m = 8;
    public static final String n = "BlurBackgroundVideoPlayer";

    /* renamed from: a, reason: collision with root package name */
    public final TextureView f11534a;
    public final boolean b;
    public final i c;
    public ExoPlayer d;
    public final MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> e;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> f;
    public final StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> g;
    public final StateFlow<l> h;
    public final d i;
    public boolean j;
    public String k;

    /* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a$a, reason: collision with other inner class name */
    public static final class C1613a {
        public /* synthetic */ C1613a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(final Context context, boolean z, i mediaCacheRepository) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
            return new a(new TextureView(context), z, mediaCacheRepository, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a$a$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return a.C1613a.a(context);
                }
            });
        }

        public C1613a() {
        }

        public static final ExoPlayer a(Context context) {
            ExoPlayer build = new ExoPlayer.Builder(context).setLooper(Looper.getMainLooper()).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            return build;
        }
    }

    public static final class b implements Function1<Throwable, Unit> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f11535a;
        public final /* synthetic */ c b;

        public b(ExoPlayer exoPlayer, c cVar) {
            this.f11535a = exoPlayer;
            this.b = cVar;
        }

        public final void a(Throwable th) {
            this.f11535a.removeListener(this.b);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            a(th);
            return Unit.INSTANCE;
        }
    }

    public static final class c implements Player.Listener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f11536a;
        public final /* synthetic */ CancellableContinuation<Unit> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(ExoPlayer exoPlayer, CancellableContinuation<? super Unit> cancellableContinuation) {
            this.f11536a = exoPlayer;
            this.b = cancellableContinuation;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == 3) {
                this.f11536a.removeListener(this);
                if (this.b.isActive()) {
                    CancellableContinuation<Unit> cancellableContinuation = this.b;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m8079constructorimpl(Unit.INSTANCE));
                }
            }
        }
    }

    public static final class d implements Player.Listener {
        public d() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            a.this.e.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(z, false, false, 6, null));
        }
    }

    public a(TextureView textureView, boolean z, i mediaCacheRepository, Function0<? extends ExoPlayer> exoPlayerFactory) {
        Intrinsics.checkNotNullParameter(textureView, "textureView");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        this.f11534a = textureView;
        this.b = z;
        this.c = mediaCacheRepository;
        MutableStateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> MutableStateFlow = StateFlowKt.MutableStateFlow(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(false, false, false, 6, null));
        this.e = MutableStateFlow;
        this.f = MutableStateFlow;
        this.g = StateFlowKt.MutableStateFlow(i.b.b);
        this.h = StateFlowKt.MutableStateFlow(null);
        d dVar = new d();
        this.i = dVar;
        ExoPlayer invoke = exoPlayerFactory.invoke();
        invoke.setVideoTextureView(textureView);
        invoke.setVolume(0.0f);
        invoke.addListener(dVar);
        this.d = invoke;
        this.j = true;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public boolean G() {
        return this.j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public View R() {
        return this.f11534a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void b(boolean z) {
        this.j = z;
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.setVolume(z ? 0.0f : 1.0f);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void destroy() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.i);
            exoPlayer.release();
        }
        this.d = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public StateFlow<l> f() {
        return this.h;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b> isPlaying() {
        return this.f;
    }

    public final ExoPlayer k() {
        return this.d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public String m() {
        return this.k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public StateFlow<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i> p() {
        return this.g;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void pause() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void play() {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void seekTo(long j) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public void a(final String str) {
        this.k = str;
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer == null || str == null) {
            return;
        }
        try {
            if (this.b) {
                exoPlayer.setMediaSource(new DefaultMediaSourceFactory(new DataSource.Factory() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a$$ExternalSyntheticLambda0
                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public final DataSource createDataSource() {
                        return a.a(str, this);
                    }
                }).createMediaSource(MediaItem.fromUri(str)));
            } else {
                exoPlayer.setMediaItem(MediaItem.fromUri(str));
            }
            exoPlayer.prepare();
        } catch (Exception e) {
            MolocoLogger.warn$default(MolocoLogger.INSTANCE, n, "Failed to set background media item", e, false, 8, null);
        }
    }

    public static final DataSource a(String str, a aVar) {
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c(str, aVar.c);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f
    public Object a(Continuation<? super Unit> continuation) {
        ExoPlayer exoPlayer = this.d;
        if (exoPlayer != null && exoPlayer.getPlaybackState() != 3) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            c cVar = new c(exoPlayer, cancellableContinuationImpl);
            exoPlayer.addListener(cVar);
            if (exoPlayer.getPlaybackState() == 3) {
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
        return Unit.INSTANCE;
    }
}
