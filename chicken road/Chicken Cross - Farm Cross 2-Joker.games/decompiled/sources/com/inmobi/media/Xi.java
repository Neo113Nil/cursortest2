package com.inmobi.media;

import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.ProducerScope;

/* loaded from: classes6.dex */
public final class Xi extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f6953a;
    public String b;
    public ProducerScope c;
    public List d;
    public Of e;
    public List f;
    public Iterator g;
    public List h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public long n;
    public /* synthetic */ Object o;
    public final /* synthetic */ Zi p;
    public int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xi(Zi zi, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.p = zi;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.o = obj;
        this.q |= Integer.MIN_VALUE;
        return this.p.a(null, null, null, null, null, this);
    }
}
