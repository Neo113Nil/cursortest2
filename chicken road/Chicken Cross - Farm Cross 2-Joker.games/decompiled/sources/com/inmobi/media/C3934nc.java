package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.nc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3934nc extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f7264a;
    public Object b;
    public Mutex c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3991pc e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3934nc(C3991pc c3991pc, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3991pc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
