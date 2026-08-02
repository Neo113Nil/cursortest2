package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugin.common.MethodChannel;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {753}, m = "methodMoveToSharedStorage", n = {NotificationCompat.CATEGORY_CALL, "result", "args", "filePath", FirebaseAnalytics.Param.DESTINATION, "directory", "mimeType", NotificationCompat.CATEGORY_STATUS, "asAndroidUri"}, nl = {752}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "Z$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0667s extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object i;
    public Object j;
    public MethodChannel.Result k;
    public /* synthetic */ Object l;
    public final /* synthetic */ BDPlugin m;
    public int n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0667s(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.m = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.n |= Integer.MIN_VALUE;
        return BDPlugin.d(this.m, null, null, this);
    }
}
