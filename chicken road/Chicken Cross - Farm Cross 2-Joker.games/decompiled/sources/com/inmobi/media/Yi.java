package com.inmobi.media;

import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class Yi extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public List f6975a;
    public ArrayList b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Zi d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Yi(Zi zi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = zi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a((Of) null, (List) null, this);
    }
}
