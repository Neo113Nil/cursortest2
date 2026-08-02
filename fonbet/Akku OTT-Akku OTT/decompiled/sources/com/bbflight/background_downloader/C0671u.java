package com.bbflight.background_downloader;

import android.content.SharedPreferences;
import androidx.core.app.NotificationCompat;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import io.flutter.plugin.common.MethodChannel;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4}, l = {522, 523, 530, 540, 546}, m = "methodReset", n = {NotificationCompat.CATEGORY_CALL, "result", "group", NotificationCompat.CATEGORY_CALL, "result", "group", NotificationCompat.CATEGORY_CALL, "result", "group", "tasksMap", "prefs", "workManager", "counter", NotificationCompat.CATEGORY_CALL, "result", "group", "tasksMap", "prefs", "workManager", "workInfos", "workInfo", "tags", "taskId", "task", "counter", NotificationCompat.CATEGORY_CALL, "result", "group", "tasksMap", "prefs", "workManager", "workInfos", "workInfo", "tags", "taskId", "task", "counter"}, nl = {523, 524, 533, 546, 549}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "L$10", "L$11", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$8", "L$9", "L$10", "L$11", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0671u extends ContinuationImpl {
    public Object a;
    public MethodChannel.Result b;
    public String c;
    public Ref.ObjectRef d;
    public SharedPreferences e;
    public WorkManager f;
    public Object i;
    public Iterator j;
    public WorkInfo k;
    public Object l;
    public Object m;
    public Object n;
    public int o;
    public /* synthetic */ Object p;
    public final /* synthetic */ BDPlugin q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0671u(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return BDPlugin.f(this.q, null, null, this);
    }
}
