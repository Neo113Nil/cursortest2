package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Uo extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ExoPlayer f6900a;
    public Y9 b;
    public C3783i3 c;
    public Iterator d;
    public String e;
    public boolean f;
    public int g;
    public int h;
    public /* synthetic */ Object i;
    public int j;

    public Uo(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.j |= Integer.MIN_VALUE;
        return AbstractC3579ap.a((ExoPlayer) null, (ArrayList) null, (Y9) null, (C3783i3) null, false, (ContinuationImpl) this);
    }
}
