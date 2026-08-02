package com.bbflight.background_downloader;

import com.bbflight.background_downloader.M;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.Callbacks$Companion", f = "Callbacks.kt", i = {0, 0, 0, 1, 1, 1, 1, 1}, l = {177, 88}, m = "getMethodChannel", n = {"context", "$this$withLock_u24default$iv", "$i$f$withLock", "context", "$this$withLock_u24default$iv", "methodChannelCompleter", "$i$f$withLock", "$i$a$-withLock$default-Callbacks$Companion$getMethodChannel$2"}, nl = {178, 181}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "I$0", "I$1"}, v = 2)
/* loaded from: classes3.dex */
public final class H extends ContinuationImpl {
    public Object a;
    public kotlinx.coroutines.sync.a b;
    public Object c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ M.a f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(M.a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
