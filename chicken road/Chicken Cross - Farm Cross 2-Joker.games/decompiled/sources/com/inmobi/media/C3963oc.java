package com.inmobi.media;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.oc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3963oc extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public String f7285a;
    public Mutex b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C3991pc d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3963oc(C3991pc c3991pc, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c3991pc;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
