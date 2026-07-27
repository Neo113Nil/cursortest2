package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.j9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3816j9 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Vg f7177a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C3931n9 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3816j9(C3931n9 c3931n9, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c3931n9;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b((Vg) null, this);
    }
}
