package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugin.common.MethodChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0}, l = {632}, m = "methodTaskForId", n = {NotificationCompat.CATEGORY_CALL, "result", "taskId"}, nl = {633}, s = {"L$0", "L$1", "L$2"}, v = 2)
/* renamed from: com.bbflight.background_downloader.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0675w extends ContinuationImpl {
    public Object a;
    public MethodChannel.Result b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ BDPlugin e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0675w(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return BDPlugin.g(this.e, null, null, this);
    }
}
