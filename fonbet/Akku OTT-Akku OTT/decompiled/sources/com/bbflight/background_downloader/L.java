package com.bbflight.background_downloader;

import com.bbflight.background_downloader.M;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.Callbacks$Companion", f = "Callbacks.kt", i = {0, 0}, l = {152}, m = "invokeOnTaskStartCallback", n = {"context", "task"}, nl = {153}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes3.dex */
public final class L extends ContinuationImpl {
    public Object a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ M.a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.f(null, null, this);
    }
}
