package com.inmobi.media;

/* loaded from: classes5.dex */
public final class W7 {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.CoroutineScope f5025a;
    public final androidx.media3.exoplayer.ExoPlayer b;
    public final kotlinx.coroutines.flow.MutableSharedFlow c;
    public final com.inmobi.media.Q1 d;
    public boolean e;

    public W7(android.content.Context context, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.media3.exoplayer.ExoPlayer exoPlayer, boolean z, kotlinx.coroutines.flow.MutableSharedFlow playerEventsFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(playerEventsFlow, "playerEventsFlow");
        this.f5025a = coroutineScope;
        this.b = exoPlayer;
        this.c = playerEventsFlow;
        com.inmobi.media.Q1 q1 = new com.inmobi.media.Q1(context);
        this.d = q1;
        this.e = z;
        com.inmobi.media.U7 listener = new com.inmobi.media.U7(this);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        q1.c = new java.lang.ref.WeakReference(listener);
    }

    public final void a() {
        this.b.setVolume(0.0f);
        com.inmobi.media.T4.a(this.c, this.f5025a, new com.inmobi.media.S1(0.0f, true));
        this.e = true;
    }
}
