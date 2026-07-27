package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* renamed from: com.inmobi.media.ta, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4101ta extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public Object f7390a;
    public Mutex b;
    public /* synthetic */ Object c;
    public int d;

    public C4101ta(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(null, this);
    }
}
