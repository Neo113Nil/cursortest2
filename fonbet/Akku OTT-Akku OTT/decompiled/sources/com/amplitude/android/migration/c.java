package com.amplitude.android.migration;

import com.amplitude.core.k;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.AndroidStorageMigration", f = "AndroidStorageMigration.kt", i = {0, 0, 1, 1}, l = {68, 74}, m = "moveSimpleValue", n = {"this", Constants.KEY, "this", Constants.KEY}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
public final class c extends ContinuationImpl {
    public e a;
    public k.a b;
    public /* synthetic */ Object c;
    public final /* synthetic */ e d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
