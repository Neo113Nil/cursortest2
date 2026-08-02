package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.AndroidStorageMigration", f = "AndroidStorageMigration.kt", i = {0}, l = {15, 16}, m = "execute", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class a extends ContinuationImpl {
    public e a;
    public /* synthetic */ Object b;
    public final /* synthetic */ e c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(this);
    }
}
