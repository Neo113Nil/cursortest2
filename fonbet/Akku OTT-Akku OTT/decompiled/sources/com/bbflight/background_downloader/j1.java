package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker", f = "TaskWorker.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, l = {490, 501}, m = "doTask", n = {"urlString", "url", "proxyAddress", "proxy", "requestTimeoutSeconds", "proxyPort", "urlString", "url", "proxyAddress", "proxy", "$this$doTask_u24lambda_u240", "requestTimeoutSeconds", "proxyPort", "$i$a$-with-TaskWorker$doTask$3"}, nl = {493, 503}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2"}, v = 2)
/* loaded from: classes3.dex */
public final class j1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public int f;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ TaskWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(TaskWorker taskWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = taskWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return TaskWorker.b(this.k, this);
    }
}
