package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Qk extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Ok f6808a;
    public Ok b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Rk e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qk(Rk rk, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = rk;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
