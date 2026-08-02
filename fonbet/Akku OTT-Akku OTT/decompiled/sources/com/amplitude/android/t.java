package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.Timeline", f = "Timeline.kt", i = {0}, l = {89, 91, 94, 98}, m = "processEventMessage", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class t extends ContinuationImpl {
    public x a;
    public /* synthetic */ Object b;
    public final /* synthetic */ x c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return x.e(this.c, null, this);
    }
}
