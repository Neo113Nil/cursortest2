package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", i = {0, 0, 1, 2, 3, 4}, l = {31, 34, 35, 37, 38, 39}, m = "execute", n = {"this", "firstRunSinceUpgrade", "this", "this", "this", "this"}, s = {"L$0", "I$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
public final class m extends ContinuationImpl {
    public l a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(this);
    }
}
