package com.bbflight.background_downloader;

import androidx.compose.runtime.ComposerKt;
import androidx.core.location.LocationRequestCompat;
import com.bbflight.background_downloader.UploadTaskWorker;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.UploadTaskWorker", f = "UploadTaskWorker.kt", i = {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {LocationRequestCompat.QUALITY_LOW_POWER, ComposerKt.reuseKey}, m = "processBinaryUpload", n = {"connection", "filePath", "usesAndroidUri", "connection", "filePath", "fileSize", "inputStream", "start", "rangeHeader", "usesAndroidUri", "end", "contentLength"}, nl = {174, -1}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0", "J$0", "J$1"}, v = 2)
/* loaded from: classes3.dex */
public final class w1 extends ContinuationImpl {
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public int i;
    public /* synthetic */ Object j;
    public final /* synthetic */ UploadTaskWorker k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(UploadTaskWorker uploadTaskWorker, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.k = uploadTaskWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        UploadTaskWorker.Companion companion = UploadTaskWorker.INSTANCE;
        return this.k.t(null, null, this);
    }
}
