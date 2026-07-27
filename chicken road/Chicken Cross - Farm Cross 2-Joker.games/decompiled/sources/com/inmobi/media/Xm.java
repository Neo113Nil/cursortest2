package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Xm extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public int f6956a;
    public String b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Zm e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xm(Zm zm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = zm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(0, null, this);
    }
}
