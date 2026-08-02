package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import io.flutter.plugin.common.MethodChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 0, 0, 0}, l = {896}, m = "methodUpdateChunkProgress", n = {NotificationCompat.CATEGORY_CALL, "result", "args", "taskId", "chunkTaskId", NotificationCompat.CATEGORY_PROGRESS}, nl = {DescriptorProtos.Edition.EDITION_LEGACY_VALUE}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "D$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0679y extends ContinuationImpl {
    public Object a;
    public MethodChannel.Result b;
    public Object c;
    public Object d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BDPlugin i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0679y(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.j |= Integer.MIN_VALUE;
        return BDPlugin.i(this.i, null, null, this);
    }
}
