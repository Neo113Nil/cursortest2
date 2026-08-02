package com.amplitude.core.utilities;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.amplitude.core.platform.f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.amplitude.core.utilities.ExponentialBackoffRetryHandler", f = "ExponentialBackoffRetryHandler.kt", i = {0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG}, m = "attemptRetry", n = {"this", "block"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
public final class p extends ContinuationImpl {
    public o a;
    public f.b b;
    public /* synthetic */ Object c;
    public final /* synthetic */ o d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
