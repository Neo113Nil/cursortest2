package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlinx.coroutines.flow.FlowCollector;

/* renamed from: com.inmobi.media.e2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3668e2 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3697f2 f7077a;

    public C3668e2(C3697f2 c3697f2) {
        this.f7077a = c3697f2;
    }

    public final Unit a(boolean z) {
        Y9 y9 = this.f7077a.e;
        if (y9 != null) {
            ((Z9) y9).a("WindowLifecycleHandler", "startObservingVisibility - Window visibility changed: " + z);
        }
        this.f7077a.c.setValue(Boxing.boxBoolean(z));
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }
}
