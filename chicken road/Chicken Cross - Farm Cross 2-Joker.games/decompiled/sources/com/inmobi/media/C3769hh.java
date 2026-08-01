package com.inmobi.media;

import kotlin.collections.ArrayDeque;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.hh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3769hh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ArrayDeque f7145a;
    public /* synthetic */ Object b;
    public int c;

    public C3769hh(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return AbstractC3796ih.a(null, null, this);
    }
}
