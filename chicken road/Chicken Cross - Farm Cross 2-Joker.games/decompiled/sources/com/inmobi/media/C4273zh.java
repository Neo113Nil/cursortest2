package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.zh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4273zh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7526a;
    public final /* synthetic */ Gh b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4273zh(Gh gh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = gh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7526a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b((String) null, (Integer) null, this);
    }
}
