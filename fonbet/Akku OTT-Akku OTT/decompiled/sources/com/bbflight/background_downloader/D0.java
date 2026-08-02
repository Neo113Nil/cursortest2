package com.bbflight.background_downloader;

import androidx.work.WorkManager;
import java.util.Iterator;
import java.util.Map;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.RequireWiFiChange", f = "WiFi.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {112}, m = "execute", n = {"prefs", "tasksMap", "workManager", "workInfos", "workInfo", "tags", "taskId", "task", "haveReEnqueued"}, nl = {118}, s = {"L$0", "L$1", "L$2", "L$3", "L$5", "L$6", "L$7", "L$8", "I$0"}, v = 2)
/* loaded from: classes3.dex */
public final class D0 extends ContinuationImpl {
    public Object a;
    public Map b;
    public WorkManager c;
    public Object d;
    public Iterator e;
    public Object f;
    public Object i;
    public Object j;
    public M0 k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ C0 n;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D0(C0 c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.n = c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.m = obj;
        this.o |= Integer.MIN_VALUE;
        return this.n.a(this);
    }
}
