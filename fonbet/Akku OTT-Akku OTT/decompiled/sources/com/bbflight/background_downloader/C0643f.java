package com.bbflight.background_downloader;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.BDPlugin;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$Companion", f = "BDPlugin.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4}, l = {237, 238, 253, 259, 282}, m = "cancelActiveTaskWithId", n = {"context", "taskId", "workManager", "context", "taskId", "workManager", "context", "taskId", "workManager", "workInfos", "prefs", "tasksMap", "workInfo", "task", "context", "taskId", "workManager", "workInfos", "prefs", "tasksMap", "workInfo", "task", "context", "taskId", "workManager", "workInfos", "prefs", "tasksMap", "workInfo", "operation"}, nl = {238, 241, 259, 262, 285}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$7", "L$8"}, v = 2)
/* renamed from: com.bbflight.background_downloader.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0643f extends ContinuationImpl {
    public Context a;
    public String b;
    public WorkManager c;
    public Object d;
    public SharedPreferences e;
    public Map f;
    public Iterator i;
    public Object j;
    public Object k;
    public /* synthetic */ Object l;
    public final /* synthetic */ BDPlugin.Companion m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0643f(BDPlugin.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return this.m.b(null, null, null, this);
    }
}
