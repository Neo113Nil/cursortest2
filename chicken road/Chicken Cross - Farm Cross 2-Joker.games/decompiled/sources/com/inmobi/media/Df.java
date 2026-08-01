package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Df implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f6513a;

    public Df(CoroutineScope coroutineScope, Function1 function1) {
        this.f6513a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f6513a.invoke(Boxing.boxBoolean(((Boolean) obj).booleanValue()));
        return Unit.INSTANCE;
    }
}
