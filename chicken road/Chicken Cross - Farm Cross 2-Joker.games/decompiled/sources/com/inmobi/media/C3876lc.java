package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.lc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3876lc extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f7223a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3906mc c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3876lc(C3906mc c3906mc, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3906mc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
