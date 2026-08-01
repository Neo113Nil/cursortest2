package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.gm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3745gm extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7128a;
    public int b;

    public C3745gm(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7128a = obj;
        this.b |= Integer.MIN_VALUE;
        return C3829jm.b(this);
    }
}
