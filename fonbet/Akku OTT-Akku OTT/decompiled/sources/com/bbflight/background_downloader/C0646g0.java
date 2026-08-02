package com.bbflight.background_downloader;

import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue", f = "HoldingQueue.kt", i = {0, 0, 0}, l = {161}, m = "cancelAllTasks", n = {"context", "group", "taskIds"}, nl = {162}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* renamed from: com.bbflight.background_downloader.g0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0646g0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public List c;
    public /* synthetic */ Object d;
    public final /* synthetic */ C0638c0 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0646g0(C0638c0 c0638c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = c0638c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.e(null, null, this);
    }
}
