package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import androidx.window.embedding.SplitRule;
import io.flutter.plugin.common.MethodChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0}, l = {599}, m = "methodCancelTasksWithIds", n = {NotificationCompat.CATEGORY_CALL, "result", "taskIds"}, nl = {SplitRule.SPLIT_MIN_DIMENSION_DP_DEFAULT}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* renamed from: com.bbflight.background_downloader.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0662p extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public MethodChannel.Result d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BDPlugin f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0662p(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return BDPlugin.b(this.f, null, null, this);
    }
}
