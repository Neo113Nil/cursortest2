package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.NotificationService", f = "Notifications.kt", i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {966, 477, 527, 531}, m = "updateGroupNotification", n = {"taskWorker", "groupNotificationId", "notificationType", "stateChange", "groupNotification", "$this$withLock_u24default$iv", "$i$f$withLock", "taskWorker", "groupNotificationId", "notificationType", "stateChange", "groupNotification", "notification", "hasError", "isFinished", "taskWorker", "groupNotificationId", "notificationType", "stateChange", "groupNotification", "notification", "builder", "title", "body", "hasError", "isFinished", "iconDrawable", NotificationCompat.CATEGORY_PROGRESS, "progressBar", "taskWorker", "groupNotificationId", "notificationType", "stateChange", "groupNotification", "notification", "hasError", "isFinished"}, nl = {967, 480, 529, 541}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "Z$0", "Z$1", "I$0", "D$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "Z$0", "Z$1"}, v = 2)
/* renamed from: com.bbflight.background_downloader.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0665q0 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public Object j;
    public Object k;
    public boolean l;
    public boolean m;
    public /* synthetic */ Object n;
    public final /* synthetic */ C0657m0 o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0665q0(C0657m0 c0657m0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.o = c0657m0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        C0657m0 c0657m0 = C0657m0.a;
        return this.o.h(null, null, null, this);
    }
}
