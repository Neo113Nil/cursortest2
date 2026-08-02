package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker", f = "TaskWorker.kt", i = {0, 0, 0}, l = {526}, m = "connectAndProcess$suspendImpl", n = {"$this", "connection", "filePath"}, nl = {569}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* loaded from: classes3.dex */
public final class i1 extends ContinuationImpl {
    public TaskWorker a;
    public Object b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ TaskWorker e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(TaskWorker taskWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = taskWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return TaskWorker.d(this.e, null, this);
    }
}
