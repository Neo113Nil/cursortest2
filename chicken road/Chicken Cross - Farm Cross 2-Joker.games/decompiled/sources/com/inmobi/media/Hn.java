package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Hn extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public List f6610a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Rn c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hn(Rn rn, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = rn;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a((String) null, (ArrayList) null, this);
    }
}
