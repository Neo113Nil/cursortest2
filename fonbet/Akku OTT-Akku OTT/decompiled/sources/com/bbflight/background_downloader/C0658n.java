package com.bbflight.background_downloader;

import androidx.core.app.NotificationCompat;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.BDPlugin", f = "BDPlugin.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {564, 568}, m = "methodAllTasks", n = {NotificationCompat.CATEGORY_CALL, "result", "group", "tasksAsListOfJsonStrings", NotificationCompat.CATEGORY_CALL, "result", "group", "tasksAsListOfJsonStrings", "workManager"}, nl = {565, 571}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4"}, v = 2)
/* renamed from: com.bbflight.background_downloader.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0658n extends ContinuationImpl {
    public Object a;
    public MethodChannel.Result b;
    public String c;
    public List d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ BDPlugin i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0658n(BDPlugin bDPlugin, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = bDPlugin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.j |= Integer.MIN_VALUE;
        return BDPlugin.a(this.i, null, null, this);
    }
}
