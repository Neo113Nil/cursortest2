package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.k9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3844k9 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Vg f7199a;
    public Object b;
    public InterfaceC3968oh c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C3931n9 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3844k9(C3931n9 c3931n9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c3931n9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
