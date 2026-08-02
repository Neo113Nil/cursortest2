package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker", f = "TaskWorker.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {713, 721}, m = "updateProgressAndNotify", n = {"task", NotificationCompat.CATEGORY_PROGRESS, "expectedFileSize", "now", "timeSinceLastUpdate", "bytesSinceLastUpdate", "currentNetworkSpeed", "remainingBytes", "timeRemaining", "task", NotificationCompat.CATEGORY_PROGRESS, "expectedFileSize", "now", "timeSinceLastUpdate", "bytesSinceLastUpdate", "currentNetworkSpeed", "remainingBytes", "timeRemaining"}, nl = {721, 726}, s = {"L$0", "D$0", "J$0", "J$1", "J$2", "J$3", "D$1", "D$2", "J$4", "L$0", "D$0", "J$0", "J$1", "J$2", "J$3", "D$1", "D$2", "J$4"}, v = 2)
/* loaded from: classes3.dex */
public final class m1 extends ContinuationImpl {
    public double a;
    public double b;
    public double c;
    public long d;
    public long e;
    public long f;
    public long i;
    public long j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ TaskWorker m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(TaskWorker taskWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = taskWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.q(0.0d, 0L, null, this);
    }
}
