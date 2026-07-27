package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class S0 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f6838a;
    public AdResponse b;
    public Iterator c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ T0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S0(T0 t0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = t0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, null, this);
    }
}
