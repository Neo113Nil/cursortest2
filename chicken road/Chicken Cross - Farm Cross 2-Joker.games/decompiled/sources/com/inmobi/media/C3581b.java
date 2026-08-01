package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class C3581b extends FunctionReferenceImpl implements Function1, SuspendFunction {
    public C3581b(Object obj) {
        super(1, obj, Intrinsics.Kotlin.class, "suspendConversion1", "start$suspendConversion1(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((Function0) this.receiver).invoke();
        return Unit.INSTANCE;
    }
}
