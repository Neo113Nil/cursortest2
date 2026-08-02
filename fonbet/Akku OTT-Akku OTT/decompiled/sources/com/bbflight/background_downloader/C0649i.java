package com.bbflight.background_downloader;

import android.content.Context;
import androidx.work.WorkManager;
import com.bbflight.background_downloader.BDPlugin;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin$Companion", f = "BDPlugin.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2}, l = {216, 218, 222}, m = "cancelTasksWithIds", n = {"context", "taskIds", "workManager", "context", "taskIds", "workManager", "context", "taskIds", "workManager", "taskIdsRemovedFromHoldingQueue", "taskIdsRemaining", "taskId", FirebaseAnalytics.Param.SUCCESS}, nl = {218, 218, 224}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0649i extends ContinuationImpl {
    public Context a;
    public Object b;
    public WorkManager c;
    public Object d;
    public Object e;
    public Iterator f;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ BDPlugin.Companion k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0649i(BDPlugin.Companion companion, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.c(null, null, this);
    }
}
