package com.amplitude.android.storage;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.storage.AndroidStorageContextV1", f = "AndroidStorageContextV1.kt", i = {0, 1}, l = {116, 122}, m = "migrateToLatestVersion", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
public final class c extends ContinuationImpl {
    public d a;
    public /* synthetic */ Object b;
    public final /* synthetic */ d c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(this);
    }
}
