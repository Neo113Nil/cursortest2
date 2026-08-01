package com.inmobi.media;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Ec extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Iterator f6534a;
    public String b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Jc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ec(Jc jc, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = jc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((C4019qc) null, this);
    }
}
