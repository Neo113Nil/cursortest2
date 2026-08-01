package com.inmobi.media;

import android.media.MediaPlayer;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class To extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public MediaPlayer f6878a;
    public Y9 b;
    public Iterator c;
    public String d;
    public /* synthetic */ Object e;
    public int f;

    public To(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return AbstractC3579ap.a((MediaPlayer) null, (ArrayList) null, (Z9) null, this);
    }
}
