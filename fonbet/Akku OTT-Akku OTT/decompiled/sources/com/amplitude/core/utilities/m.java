package com.amplitude.core.utilities;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.core.utilities.EventsFileManager", f = "EventsFileManager.kt", i = {0, 0, 0}, l = {374}, m = "storeEvent", n = {"this", NotificationCompat.CATEGORY_EVENT, "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
public final class m extends ContinuationImpl {
    public h a;
    public String b;
    public kotlinx.coroutines.sync.a c;
    public /* synthetic */ Object d;
    public final /* synthetic */ h e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.i(null, this);
    }
}
