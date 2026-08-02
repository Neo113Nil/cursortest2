package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorkerKt", f = "TaskWorker.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {830, 851}, m = "getModifiedTask", n = {"context", "task", "authTask", "auth", "context", "task", "authTask", "auth"}, nl = {834, 854}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"}, v = 2)
/* loaded from: classes3.dex */
public final class n1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Ref.ObjectRef c;
    public Object d;
    public Ref.ObjectRef e;
    public /* synthetic */ Object f;
    public int i;

    public n1() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.i |= Integer.MIN_VALUE;
        return q1.a(null, null, this);
    }
}
