package com.amplitude.android.storage;

import androidx.core.app.NotificationCompat;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.storage.AndroidStorageV2", f = "AndroidStorageV2.kt", i = {0, 0}, l = {54}, m = "writeEvent", n = {"this", NotificationCompat.CATEGORY_EVENT}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class h extends ContinuationImpl {
    public i a;
    public com.amplitude.core.events.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ i d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, this);
    }
}
