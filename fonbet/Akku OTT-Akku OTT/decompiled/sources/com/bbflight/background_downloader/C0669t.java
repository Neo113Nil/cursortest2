package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugin.common.MethodChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 0, 0}, l = {833}, m = "methodRequireWiFi", n = {NotificationCompat.CATEGORY_CALL, "result", "args", "newRequireWiFi", "rescheduleRunning"}, nl = {840}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0669t extends ContinuationImpl {
    public Object a;
    public MethodChannel.Result b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ BDPlugin f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0669t(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return BDPlugin.e(this.f, null, null, this);
    }
}
