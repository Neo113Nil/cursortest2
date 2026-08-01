package com.inmobi.media;

import android.app.Activity;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Rg extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Activity f6828a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Tg d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Rg(Tg tg, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = tg;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
