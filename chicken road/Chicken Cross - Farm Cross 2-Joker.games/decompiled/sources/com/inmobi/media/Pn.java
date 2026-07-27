package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Ref;

/* loaded from: classes6.dex */
public final class Pn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ref.BooleanRef f6788a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Rn c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pn(Rn rn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return Rn.c(this.c, null, this);
    }
}
