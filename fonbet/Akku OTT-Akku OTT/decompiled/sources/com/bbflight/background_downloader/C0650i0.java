package com.bbflight.background_downloader;

import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.HoldingQueue", f = "HoldingQueue.kt", i = {0, 0, 0, 0, 0}, l = {332}, m = "executeTaskFinished", n = {"task", URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, "group", "$this$withLock_u24default$iv", "$i$f$withLock"}, nl = {333}, s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, v = 2)
/* renamed from: com.bbflight.background_downloader.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0650i0 extends ContinuationImpl {
    public Object a;
    public String b;
    public String c;
    public kotlinx.coroutines.sync.c d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C0638c0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0650i0(C0638c0 c0638c0, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f = c0638c0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return C0638c0.b(this.f, null, this);
    }
}
