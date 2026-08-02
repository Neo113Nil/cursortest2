package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue", f = "HoldingQueue.kt", i = {0, 0}, l = {332}, m = "calculateState", n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {333}, s = {"L$0", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.f0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0644f0 extends ContinuationImpl {
    public kotlinx.coroutines.sync.c a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C0638c0 c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0644f0(C0638c0 c0638c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = c0638c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return C0638c0.a(this.c, this);
    }
}
