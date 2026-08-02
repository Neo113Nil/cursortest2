package com.amplitude.android.migration;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 2}, l = {77, 82, 87}, m = "moveSessionData", n = {"this", "currentLastEventTime", "currentLastEventId", "lastEventTime", "lastEventId", "this", "currentLastEventId", "lastEventId", "this"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes3.dex */
public final class u extends ContinuationImpl {
    public l a;
    public Long b;
    public Long c;
    public Long d;
    public Long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ l i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.i = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.g(this);
    }
}
