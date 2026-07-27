package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.TextureView;
import android.view.View;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.impl.oe;
import com.chartboost.sdk.impl.qe;
import java.io.File;
import java.net.URL;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;

/* loaded from: classes4.dex */
public final class q7 implements dk {

    /* renamed from: a, reason: collision with root package name */
    public final w7 f4968a;
    public final se b;
    public final long c;
    public final CoroutineScope d;
    public ek e;
    public ExoPlayer f;
    public PlayerView g;
    public URL h;
    public CancellableContinuation i;
    public final r7 j;
    public boolean k;
    public final a l;

    public static final class a implements Player.Listener {
        public a() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            if (i == 1) {
                mb.a("Player is idle.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i == 2) {
                mb.a("Player is buffering.", (Throwable) null, 2, (Object) null);
                q7.this.g();
            } else {
                if (i != 3) {
                    if (i != 4) {
                        return;
                    }
                    q7.this.f();
                    q7.this.j.a(oe.e.f4935a);
                    return;
                }
                qe b = q7.this.j.b();
                if (b instanceof qe.c) {
                    q7.this.j.a(new oe.g(((qe.c) b).a()));
                }
                q7.this.f();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Intrinsics.checkNotNullParameter(error, "error");
            q7.this.j.a(new oe.f(error));
        }
    }

    public static final class b extends ContinuationImpl {
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public /* synthetic */ Object f;
        public int h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.h |= Integer.MIN_VALUE;
            Object a2 = q7.this.a(null, null, null, this);
            return a2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a2 : Result.m8078boximpl(a2);
        }
    }

    public static final class c implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {
            public int b;
            public final /* synthetic */ q7 c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q7 q7Var, Continuation continuation) {
                super(2, continuation);
                this.c = q7Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.c.j.a(oe.j.f4940a);
                return Unit.INSTANCE;
            }
        }

        public c() {
        }

        public final void a(Throwable th) {
            BuildersKt__Builders_commonKt.launch$default(q7.this.d, NonCancellable.INSTANCE, null, new a(q7.this, null), 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    public q7(w7 exoPlayerFactory, se playerViewFactory, long j, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(playerViewFactory, "playerViewFactory");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f4968a = exoPlayerFactory;
        this.b = playerViewFactory;
        this.c = j;
        this.d = coroutineScope;
        this.j = new r7(this, coroutineScope);
        this.l = new a();
    }

    public final void f() {
        if (this.k) {
            this.k = false;
            ek d = d();
            if (d != null) {
                d.h();
            }
        }
    }

    public final void g() {
        if (!this.k && e() && (this.j.b() instanceof qe.e)) {
            this.k = true;
            ek d = d();
            if (d != null) {
                d.g();
            }
        }
    }

    @Override // com.chartboost.sdk.impl.dk
    public float getVolume() {
        ExoPlayer exoPlayer = this.f;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 1.0f;
    }

    public final void h() {
        ek d = d();
        if (d != null) {
            d.c();
        }
    }

    public final void i() {
        CancellableContinuation cancellableContinuation = this.i;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m8079constructorimpl(Result.m8078boximpl(Result.m8079constructorimpl(Unit.INSTANCE))));
            }
        }
        this.i = null;
        ek d = d();
        if (d != null) {
            d.e();
        }
    }

    public final void j() {
        ExoPlayer exoPlayer = this.f;
        if (exoPlayer != null) {
            exoPlayer.removeListener(this.l);
        }
        ExoPlayer exoPlayer2 = this.f;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        this.f = null;
        f();
        PlayerView playerView = this.g;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        this.g = null;
        mb.a("ExoPlayer instance has been released.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.dk
    public void pause() {
        f();
        this.j.a(oe.h.f4938a);
    }

    @Override // com.chartboost.sdk.impl.dk
    public void play() {
        ExoPlayer exoPlayer;
        boolean z = this.j.b() instanceof qe.d;
        this.j.a(oe.i.f4939a);
        if (z && (exoPlayer = this.f) != null && exoPlayer.getPlaybackState() == 2) {
            g();
        }
    }

    @Override // com.chartboost.sdk.impl.dk
    public void release() {
        this.j.a(oe.j.f4940a);
    }

    @Override // com.chartboost.sdk.impl.dk
    public void setVolume(float f) {
        this.j.a(new oe.k(f));
    }

    @Override // com.chartboost.sdk.impl.dk
    public Bitmap b() {
        PlayerView playerView = this.g;
        if (playerView == null) {
            return null;
        }
        View videoSurfaceView = playerView.getVideoSurfaceView();
        TextureView textureView = videoSurfaceView instanceof TextureView ? (TextureView) videoSurfaceView : null;
        if (textureView == null) {
            mb.e("captureFrame: PlayerView surface is not a TextureView.", null, 2, null);
            return null;
        }
        try {
            return textureView.getBitmap();
        } catch (Exception e) {
            mb.e("captureFrame: Failed to capture bitmap: " + e.getMessage(), null, 2, null);
            return null;
        }
    }

    @Override // com.chartboost.sdk.impl.dk
    public long c() {
        return this.j.a();
    }

    public ek d() {
        return this.e;
    }

    public final boolean e() {
        return this.c >= 0;
    }

    public final ExoPlayer c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j();
        ExoPlayer a2 = this.f4968a.a(context, this.c);
        this.f = a2;
        a2.addListener(this.l);
        return a2;
    }

    public final void d(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.stop();
        URL url = this.h;
        mb.a("Stop command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.dk
    public void a(ek ekVar) {
        this.e = ekVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.chartboost.sdk.impl.dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Context context, URL url, w6 w6Var, Continuation continuation) {
        b bVar;
        int i;
        CancellableContinuation cancellableContinuation;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.h = i2 - Integer.MIN_VALUE;
                Object obj = bVar.f;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.h;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    bVar.b = this;
                    bVar.c = context;
                    bVar.d = url;
                    bVar.e = w6Var;
                    bVar.h = 1;
                    CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bVar), 1);
                    cancellableContinuationImpl.initCancellability();
                    CancellableContinuation cancellableContinuation2 = this.i;
                    if (cancellableContinuation2 != null && cancellableContinuation2.isActive() && (cancellableContinuation = this.i) != null) {
                        Boxing.boxBoolean(CancellableContinuation.DefaultImpls.cancel$default(cancellableContinuation, null, 1, null));
                    }
                    this.i = cancellableContinuationImpl;
                    this.h = url;
                    this.j.a(new oe.a(context, url, w6Var));
                    cancellableContinuationImpl.invokeOnCancellation(new c());
                    obj = cancellableContinuationImpl.getResult();
                    if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbesKt.probeCoroutineSuspended(bVar);
                    }
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.f;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.h;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final void c(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.prepare();
    }

    public final ExoPlayer b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        j();
        ExoPlayer b2 = this.f4968a.b(context);
        this.f = b2;
        b2.addListener(this.l);
        return b2;
    }

    public final void b(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(true);
        URL url = this.h;
        mb.a("Play command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    public /* synthetic */ q7(w7 w7Var, se seVar, long j, CoroutineScope coroutineScope, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(w7Var, seVar, (i & 4) != 0 ? -1L : j, (i & 8) != 0 ? CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate())) : coroutineScope);
    }

    @Override // com.chartboost.sdk.impl.dk
    public void a(gh reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        f();
        this.j.a(new oe.l(reason));
    }

    @Override // com.chartboost.sdk.impl.dk
    public long a() {
        return this.j.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0 != null ? r0.getContext() : null, r3) == false) goto L12;
     */
    @Override // com.chartboost.sdk.impl.dk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public View a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f == null) {
            return null;
        }
        PlayerView playerView = this.g;
        if (playerView != null) {
        }
        f();
        PlayerView playerView2 = this.g;
        if (playerView2 != null) {
            playerView2.setPlayer(null);
        }
        PlayerView a2 = this.b.a(context);
        a2.setPlayer(this.f);
        this.g = a2;
        return this.g;
    }

    public final void a(ExoPlayer player, URL url) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(url, "url");
        MediaItem fromUri = MediaItem.fromUri(url.toString());
        Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
        player.setMediaItem(fromUri);
        player.prepare();
        mb.a("Progressive player preparing for " + url + ".", (Throwable) null, 2, (Object) null);
    }

    public final void a(ExoPlayer player) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setPlayWhenReady(false);
        URL url = this.h;
        mb.a("Pause command sent to player for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }

    public final void a(ExoPlayer player, float f) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setVolume(RangesKt.coerceIn(f, 0.0f, 1.0f));
    }

    public final void a(Throwable error) {
        ChartboostError videoPlaybackError;
        Intrinsics.checkNotNullParameter(error, "error");
        URL url = this.h;
        mb.b("ExoPlayerAdapter error for " + (url != null ? url.toString() : null), error);
        if (error instanceof ChartboostError) {
            videoPlaybackError = (ChartboostError) error;
        } else if ((error instanceof PlaybackException) && (error.getCause() instanceof ChartboostError)) {
            Throwable cause = error.getCause();
            Intrinsics.checkNotNull(cause, "null cannot be cast to non-null type com.chartboost.sdk.events.ChartboostError");
            videoPlaybackError = (ChartboostError) cause;
        } else {
            CancellableContinuation cancellableContinuation = this.i;
            if (cancellableContinuation != null && cancellableContinuation.isActive()) {
                videoPlaybackError = new ChartboostError.Load.Unknown(error.getMessage(), error);
            } else {
                String str = e() ? "[progressive] " : "";
                String message = error.getMessage();
                String str2 = str + (message != null ? message : "");
                if (StringsKt.isBlank(str2)) {
                    str2 = null;
                }
                videoPlaybackError = new ChartboostError.Render.VideoPlaybackError(str2, error);
            }
        }
        CancellableContinuation cancellableContinuation2 = this.i;
        if (cancellableContinuation2 != null) {
            if (!cancellableContinuation2.isActive()) {
                cancellableContinuation2 = null;
            }
            if (cancellableContinuation2 != null) {
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation2.resumeWith(Result.m8079constructorimpl(ResultKt.createFailure(videoPlaybackError)));
            }
        }
        this.i = null;
        if (!(videoPlaybackError instanceof ChartboostError.Load.AssetUnavailable) && !(videoPlaybackError instanceof ChartboostError.Show.AdInvalidated)) {
            ek d = d();
            if (d != null) {
                d.a(videoPlaybackError);
            }
        } else {
            ek d2 = d();
            if (d2 != null) {
                d2.d();
            }
        }
        this.j.a(oe.j.f4940a);
    }

    public final void a(ExoPlayer player, File cachedFile) {
        Intrinsics.checkNotNullParameter(player, "player");
        Intrinsics.checkNotNullParameter(cachedFile, "cachedFile");
        MediaItem fromUri = MediaItem.fromUri(Uri.fromFile(cachedFile));
        Intrinsics.checkNotNullExpressionValue(fromUri, "fromUri(...)");
        player.setMediaItem(fromUri);
        player.prepare();
        URL url = this.h;
        mb.a("Player created and preparing for " + (url != null ? url.toString() : null) + ".", (Throwable) null, 2, (Object) null);
    }
}
