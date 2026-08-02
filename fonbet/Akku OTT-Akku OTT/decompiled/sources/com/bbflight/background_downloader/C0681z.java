package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {871}, m = "methodUpdateChunkStatus", n = {NotificationCompat.CATEGORY_CALL, "result", "args", "taskId", "chunkTaskId", "exceptionJson", Constants.EXCEPTION, "responseBody", "statusOrdinal"}, nl = {877}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0681z extends ContinuationImpl {
    public Object a;
    public MethodChannel.Result b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ BDPlugin k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0681z(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return BDPlugin.j(this.k, null, null, this);
    }
}
