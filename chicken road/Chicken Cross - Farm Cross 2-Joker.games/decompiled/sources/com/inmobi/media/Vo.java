package com.inmobi.media;

import android.media.MediaPlayer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final class Vo implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MediaPlayer f6917a;

    public Vo(MediaPlayer mediaPlayer) {
        this.f6917a = mediaPlayer;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.f6917a.release();
        return Unit.INSTANCE;
    }
}
