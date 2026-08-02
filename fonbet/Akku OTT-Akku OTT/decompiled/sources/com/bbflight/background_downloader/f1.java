package com.bbflight.background_downloader;

import androidx.compose.runtime.ComposerKt;
import androidx.core.app.NotificationCompat;
import androidx.core.location.LocationRequestCompat;
import androidx.work.Operation;
import com.bbflight.background_downloader.TaskWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$Companion", f = "TaskWorker.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11}, l = {LocationRequestCompat.QUALITY_LOW_POWER, 113, 118, 131, 135, 144, 150, 154, 189, 212, 232, 234}, m = "processStatusUpdate", n = {"task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "taskStatusUpdate", "arg", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "taskStatusUpdate", "workManager", "operation", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "taskStatusUpdate", "retryNeeded", "canSendStatusUpdate", "task", NotificationCompat.CATEGORY_STATUS, "prefs", "taskException", "responseBody", "responseHeaders", "responseStatusCode", "mimeType", "charSet", "context", "taskStatusUpdate", "retryNeeded", "canSendStatusUpdate"}, nl = {112, 115, 127, 135, 140, 150, 154, 162, ComposerKt.providerValuesKey, 215, 233, 237}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1"}, v = 2)
/* loaded from: classes3.dex */
public final class f1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Operation o;
    public int p;
    public int q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ TaskWorker.Companion t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(TaskWorker.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.f(null, null, null, null, null, null, null, null, null, null, this);
    }
}
