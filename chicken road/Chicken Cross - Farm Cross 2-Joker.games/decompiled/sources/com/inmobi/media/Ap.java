package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes6.dex */
public final class Ap implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dp f6463a;

    public Ap(CoroutineScope coroutineScope, Dp dp) {
        this.f6463a = dp;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Z9 z9 = this.f6463a.c;
        if (z9 != null) {
            z9.a("VideoSurfaceViewabilityController", "Viewability " + booleanValue);
        }
        if (booleanValue) {
            InterfaceC4141ul interfaceC4141ul = this.f6463a.h;
            if (interfaceC4141ul != null) {
                interfaceC4141ul.a();
            }
        } else {
            InterfaceC4141ul interfaceC4141ul2 = this.f6463a.h;
            if (interfaceC4141ul2 != null) {
                interfaceC4141ul2.b();
            }
        }
        return Unit.INSTANCE;
    }
}
