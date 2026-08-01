package com.inmobi.media;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* renamed from: com.inmobi.media.ko, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3860ko implements FlowCollector {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bo f7208a;

    public C3860ko(CoroutineScope coroutineScope, Bo bo) {
        this.f7208a = bo;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Job launch$default;
        Job launch$default2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        Z9 z9 = this.f7208a.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "attachWindowLifecycleObserver - window visibility changed: " + booleanValue);
        }
        if (booleanValue) {
            Bo bo = this.f7208a;
            Z9 z92 = bo.e;
            if (z92 != null) {
                z92.a("VideoExperienceManager", "handleOnWindowVisible called - starting media player and setting up observers");
            }
            InterfaceC3679ed interfaceC3679ed = bo.h;
            if (interfaceC3679ed == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC3679ed = null;
            }
            Te te = (Te) interfaceC3679ed;
            Dp dp = te.m;
            dp.d.set(true);
            Oh oh = (Oh) dp.i.d.getValue();
            oh.b.setValue(EnumC3580aq.f7019a);
            oh.f.set(true);
            AbstractC3787i7.a(oh.e);
            oh.e = null;
            Oh oh2 = (Oh) dp.i.d.getValue();
            oh2.a();
            launch$default = BuildersKt__Builders_commonKt.launch$default(dp.f6520a, Dispatchers.getMain(), null, new Bp(new C3832jp(oh2.b), null, dp), 2, null);
            ArrayList activeJobs = dp.e;
            Intrinsics.checkNotNullParameter(launch$default, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
            activeJobs.add(launch$default);
            dp.a();
            launch$default2 = BuildersKt__Builders_commonKt.launch$default(te.f6871a, null, null, new Le(new Oe(te.o), null, te), 3, null);
            ArrayList activeJobs2 = te.d;
            Intrinsics.checkNotNullParameter(launch$default2, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs2, "activeJobs");
            activeJobs2.add(launch$default2);
            te.l.b();
            Z9 z93 = bo.e;
            if (z93 != null) {
                z93.a("VideoExperienceManager", "observeMediaEvents - setting up media event observers");
            }
            InterfaceC3679ed interfaceC3679ed2 = bo.h;
            if (interfaceC3679ed2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
                interfaceC3679ed2 = null;
            }
            Job launchIn = FlowKt.launchIn(FlowKt.onEach(new C4171vo(FlowKt.onEach(((Te) interfaceC3679ed2).o, new C4198wo(bo, null))), new C4225xo(bo, null)), bo.b);
            ArrayList activeJobs3 = bo.f;
            Intrinsics.checkNotNullParameter(launchIn, "<this>");
            Intrinsics.checkNotNullParameter(activeJobs3, "activeJobs");
            activeJobs3.add(launchIn);
            AbstractC4012q5.a(bo.b, new Ao(bo, null));
            bo.c();
        } else {
            this.f7208a.b();
        }
        return Unit.INSTANCE;
    }
}
