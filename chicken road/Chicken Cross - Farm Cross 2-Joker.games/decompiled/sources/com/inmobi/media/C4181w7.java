package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.w7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4181w7 implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final CoroutineScope f7452a;
    public final ViewGroup b;
    public final long c;
    public final MutableStateFlow d;
    public final Y9 e;
    public Job f;

    public C4181w7(long j, ViewGroup view, Y9 y9, CoroutineScope coroutineScope, MutableStateFlow visibilityStateFlow) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(visibilityStateFlow, "visibilityStateFlow");
        this.f7452a = coroutineScope;
        this.b = view;
        this.c = j;
        this.d = visibilityStateFlow;
        this.e = y9;
    }

    public final Unit a(boolean z) {
        Job launch$default;
        Y9 y9 = this.e;
        if (y9 != null) {
            ((Z9) y9).a("WindowLifecycleHandler", "FocusStateCollector - window focus changed: " + z);
        }
        if (z) {
            Y9 y92 = this.e;
            if (y92 != null) {
                ((Z9) y92).a("WindowLifecycleHandler", "FocusStateCollector - window gained focus, stopping polling");
            }
            AbstractC3787i7.a(this.f);
            this.f = null;
        } else {
            Y9 y93 = this.e;
            if (y93 != null) {
                ((Z9) y93).a("WindowLifecycleHandler", "FocusStateCollector - window lost focus, starting polling");
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.f7452a, null, null, new C4154v7(this, null), 3, null);
            this.f = launch$default;
        }
        boolean z2 = this.b.getWindowVisibility() == 0;
        Y9 y94 = this.e;
        if (y94 != null) {
            ((Z9) y94).a("WindowLifecycleHandler", "FocusStateCollector - setting visibility state: " + z2);
        }
        this.d.setValue(Boxing.boxBoolean(z2));
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue());
    }
}
