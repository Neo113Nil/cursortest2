package com.bbflight.background_downloader;

import android.content.Context;
import androidx.work.Operation;
import com.bbflight.background_downloader.BDPlugin;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$Companion", f = "BDPlugin.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {171, 176, 179}, m = "doEnqueue", n = {"context", "task", "notificationConfigJsonString", "resumeData", "plugin", "bgChannel", "dataBuilder", "data", "constraints", "requestBuilder", "workManager", "operation", "initialDelayMillis", "taskRequiresWifi", "context", "task", "notificationConfigJsonString", "resumeData", "plugin", "bgChannel", "dataBuilder", "data", "constraints", "requestBuilder", "workManager", "operation", "prefs", "initialDelayMillis", "taskRequiresWifi", "context", "task", "notificationConfigJsonString", "resumeData", "plugin", "bgChannel", "dataBuilder", "data", "constraints", "requestBuilder", "workManager", "operation", "prefs", "initialDelayMillis", "taskRequiresWifi"}, nl = {174, 178, 180}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$11", "L$12", "J$0", "Z$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0651j extends ContinuationImpl {
    public Context a;
    public M0 b;
    public String c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Operation n;
    public Object o;
    public long p;
    public boolean q;
    public /* synthetic */ Object r;
    public final /* synthetic */ BDPlugin.Companion s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0651j(BDPlugin.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.d(null, null, null, null, 0L, null, this);
    }
}
