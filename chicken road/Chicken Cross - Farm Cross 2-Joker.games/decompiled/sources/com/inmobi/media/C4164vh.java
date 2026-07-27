package com.inmobi.media;

import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.vh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4164vh extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f7439a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Gh c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4164vh(Gh gh, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = gh;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0L, 0L, this);
    }
}
