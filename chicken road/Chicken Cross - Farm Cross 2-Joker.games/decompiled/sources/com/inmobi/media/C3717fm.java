package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.fm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3717fm extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public C4057rm f7111a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3829jm d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3717fm(C3829jm c3829jm, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3829jm;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
