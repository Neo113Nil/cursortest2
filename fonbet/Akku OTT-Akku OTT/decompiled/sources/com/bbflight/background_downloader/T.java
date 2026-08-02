package com.bbflight.background_downloader;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.bbflight.background_downloader.EnqueueItem", f = "HoldingQueue.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, l = {295, 297, 306, 313, 316}, m = "enqueue", n = {"afterDelayMillis", "timeSinceCreatedMillis", "afterDelayMillis", "timeSinceCreatedMillis", "afterDelayMillis", "timeSinceCreatedMillis", "afterDelayMillis", "timeSinceCreatedMillis", "afterDelayMillis", "timeSinceCreatedMillis"}, nl = {297, 305, 313, 314, 317}, s = {"I$0", "J$0", "I$0", "J$0", "I$0", "J$0", "I$0", "J$0", "I$0", "J$0"}, v = 2)
/* loaded from: classes3.dex */
public final class T extends ContinuationImpl {
    public int a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ U d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(U u, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = u;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, this);
    }
}
