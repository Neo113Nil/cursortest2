package com.inmobi.media;

import android.content.Context;
import androidx.media3.exoplayer.ExoPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* renamed from: com.inmobi.media.w8, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4182w8 {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7453a;
    public final ExoPlayer b;
    public final MutableSharedFlow c;
    public final C3809j2 d;
    public boolean e;

    public C4182w8(Context context, CoroutineScope coroutineScope, ExoPlayer exoPlayer, boolean z, MutableSharedFlow playerEventsFlow) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(playerEventsFlow, "playerEventsFlow");
        this.f7453a = coroutineScope;
        this.b = exoPlayer;
        this.c = playerEventsFlow;
        C3809j2 c3809j2 = new C3809j2(context);
        this.d = c3809j2;
        this.e = z;
        C4127u8 listener = new C4127u8(this);
        Intrinsics.checkNotNullParameter(listener, "listener");
        c3809j2.c = new WeakReference(listener);
    }

    public final void a() {
        this.b.setVolume(0.0f);
        AbstractC4012q5.a(this.c, this.f7453a, new C3866l2(0.0f, true));
        this.e = true;
    }
}
