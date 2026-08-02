package com.bbflight.background_downloader;

import com.bbflight.background_downloader.M;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.Callbacks$Companion", f = "Callbacks.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {114, 177, 128}, m = "invokeCallback", n = {"context", "methodName", "task", "statusUpdate", "context", "methodName", "task", "statusUpdate", "methodChannel", "$this$withLock_u24default$iv", "$i$f$withLock", "context", "methodName", "task", "statusUpdate", "methodChannel", "$this$withLock_u24default$iv", "resultingTaskAsJsonStringCompleter", "$i$f$withLock", "$i$a$-withLock$default-Callbacks$Companion$invokeCallback$2"}, nl = {115, 178, 129}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "I$1"}, v = 2)
/* loaded from: classes3.dex */
public final class I extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public kotlinx.coroutines.sync.a f;
    public Object i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ M.a l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(M.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.l = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(null, null, null, null, this);
    }
}
