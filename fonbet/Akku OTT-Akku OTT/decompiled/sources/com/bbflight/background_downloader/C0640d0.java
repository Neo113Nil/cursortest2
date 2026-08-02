package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue", f = "HoldingQueue.kt", i = {0, 0, 0}, l = {332}, m = "add", n = {"item", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {333}, s = {"L$0", "L$1", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.d0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0640d0 extends ContinuationImpl {
    public U a;
    public kotlinx.coroutines.sync.c b;
    public /* synthetic */ Object c;
    public final /* synthetic */ C0638c0 d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0640d0(C0638c0 c0638c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = c0638c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
