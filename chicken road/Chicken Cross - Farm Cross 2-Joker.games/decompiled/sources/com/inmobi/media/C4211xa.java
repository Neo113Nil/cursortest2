package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.xa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4211xa extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7474a;
    public int b;

    public C4211xa(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f7474a = obj;
        this.b |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.access$resetInternal(this);
    }
}
