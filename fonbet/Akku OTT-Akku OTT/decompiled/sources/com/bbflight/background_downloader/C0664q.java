package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugin.common.MethodChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3}, l = {470, 485, 495, 504}, m = "methodEnqueue", n = {NotificationCompat.CATEGORY_CALL, "result", "args", "taskJsonMapString", "task", "notificationConfigJsonString", "resumeData", "isResume", NotificationCompat.CATEGORY_CALL, "result", "args", "taskJsonMapString", "task", "notificationConfigJsonString", "resumeData", "isResume", NotificationCompat.CATEGORY_CALL, "result", "args", "taskJsonMapString", "task", "notificationConfigJsonString", "resumeData", "isResume", NotificationCompat.CATEGORY_CALL, "result", "args", "taskJsonMapString", "task", "notificationConfigJsonString", "resumeData", "isResume"}, nl = {473, 484, 504, 510}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0664q extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public MethodChannel.Result j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ BDPlugin m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0664q(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return BDPlugin.c(this.m, null, null, this);
    }
}
