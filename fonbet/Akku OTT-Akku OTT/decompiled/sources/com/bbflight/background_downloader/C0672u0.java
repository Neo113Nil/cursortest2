package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.ParallelDownloadTaskWorker", f = "ParallelDownloadTaskWorker.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4}, l = {211, 212, 225, 231, 238}, m = "chunkStatusUpdate", n = {"chunkTaskId", NotificationCompat.CATEGORY_STATUS, "taskException", "responseBody", "chunk", "chunkTask", "waitTimeSeconds", "chunkTaskId", NotificationCompat.CATEGORY_STATUS, "taskException", "responseBody", "chunk", "chunkTask", "waitTimeSeconds", "chunkTaskId", NotificationCompat.CATEGORY_STATUS, "taskException", "responseBody", "chunk", "chunkTask", "newStatusUpdate", "chunkTaskId", NotificationCompat.CATEGORY_STATUS, "taskException", "responseBody", "chunk", "chunkTask", "newStatusUpdate", "chunkTaskId", NotificationCompat.CATEGORY_STATUS, "taskException", "responseBody", "chunk", "chunkTask", "newStatusUpdate"}, nl = {212, 248, 226, 232, 239}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"}, v = 2)
/* renamed from: com.bbflight.background_downloader.u0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0672u0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ParallelDownloadTaskWorker l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0672u0(ParallelDownloadTaskWorker parallelDownloadTaskWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.l = parallelDownloadTaskWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.s(null, null, null, null, this);
    }
}
