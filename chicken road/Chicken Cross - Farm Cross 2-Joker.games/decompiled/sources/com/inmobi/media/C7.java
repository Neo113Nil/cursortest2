package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class C7 extends ContinuationImpl {

    /* renamed from: a, reason: collision with root package name */
    public InMobiUserDataModel f6490a;
    public Mutex b;
    public /* synthetic */ Object c;
    public int d;

    public C7(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return D7.a(null, this);
    }
}
