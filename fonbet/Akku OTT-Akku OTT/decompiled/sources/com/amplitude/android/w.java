package com.amplitude.android;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.Timeline", f = "Timeline.kt", i = {}, l = {146, 149}, m = "startNewSessionIfNeeded", n = {}, s = {})
/* loaded from: classes3.dex */
public final class w extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ x b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.l(0L, this);
    }
}
