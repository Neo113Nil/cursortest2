package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@DebugMetadata(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", i = {0, 0}, l = {146}, m = "moveEvent", n = {"removeFromSource", "rowId"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
public final class n extends ContinuationImpl {
    public FunctionReferenceImpl a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ l d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, null, null, this);
    }
}
