package com.inmobi.media;

import kotlin.collections.ArrayDeque;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Semaphore;

/* renamed from: com.inmobi.media.fh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3712fh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public CoroutineScope f7107a;
    public Function1 b;
    public Semaphore c;
    public ArrayDeque d;
    public Vg e;
    public /* synthetic */ Object f;
    public final /* synthetic */ AbstractC3796ih g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3712fh(AbstractC3796ih abstractC3796ih, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = abstractC3796ih;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, 0, null, this);
    }
}
