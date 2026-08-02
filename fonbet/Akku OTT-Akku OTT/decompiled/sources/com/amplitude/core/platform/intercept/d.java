package com.amplitude.core.platform.intercept;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.core.platform.intercept.IdentifyInterceptor", f = "IdentifyInterceptor.kt", i = {0, 0, 1, 2, 3, 4}, l = {52, 59, 65, 70, 81}, m = "intercept", n = {"this", NotificationCompat.CATEGORY_EVENT, "this", NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT, NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
public final class d extends ContinuationImpl {
    public Object a;
    public com.amplitude.core.events.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ h d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
