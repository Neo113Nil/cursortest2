package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.Amplitude", f = "Amplitude.kt", i = {0, 0}, l = {90}, m = "buildInternal$suspendImpl", n = {"$this", "identityConfiguration"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class b extends ContinuationImpl {
    public a a;
    public com.amplitude.id.d b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return a.n(this.d, null, this);
    }
}
