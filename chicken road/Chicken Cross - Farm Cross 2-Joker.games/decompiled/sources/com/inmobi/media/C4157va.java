package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* renamed from: com.inmobi.media.va, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4157va extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f7433a;
    public int b;

    public C4157va(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a2;
        this.f7433a = obj;
        this.b |= Integer.MIN_VALUE;
        a2 = InMobiUnifiedIdService.a((InMobiUserDataModel) null, this);
        return a2;
    }
}
