package com.amplitude.android.migration;

import java.util.Iterator;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", i = {0}, l = {102}, m = "moveEvents", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class o extends ContinuationImpl {
    public l a;
    public Iterator b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.d(this);
    }
}
