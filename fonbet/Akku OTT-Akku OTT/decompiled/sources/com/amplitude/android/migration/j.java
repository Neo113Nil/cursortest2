package com.amplitude.android.migration;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.android.migration.MigrationManager", f = "MigrationManager.kt", i = {0, 0, 1, 1, 2}, l = {42, 46, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX}, m = "safePerformMigration$android_release", n = {"this", "config", "this", "config", "this"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
public final class j extends ContinuationImpl {
    public k a;
    public com.amplitude.android.h b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(this);
    }
}
