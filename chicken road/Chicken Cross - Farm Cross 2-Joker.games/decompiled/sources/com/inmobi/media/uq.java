package com.inmobi.media;

import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class uq extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f7423a;
    public Y9 b;
    public Map c;
    public String d;
    public Of e;
    public long f;
    public /* synthetic */ Object g;
    public final /* synthetic */ xq h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(xq xqVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.h = xqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
