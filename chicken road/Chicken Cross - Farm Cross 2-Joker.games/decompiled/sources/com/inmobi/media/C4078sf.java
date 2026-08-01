package com.inmobi.media;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* renamed from: com.inmobi.media.sf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4078sf extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7374a;
    public final /* synthetic */ C4135uf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4078sf(C4135uf c4135uf, Continuation continuation) {
        super(2, continuation);
        this.b = c4135uf;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4078sf(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4078sf(this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7374a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Y9 l = this.b.l();
            if (l != null) {
                ((Z9) l).a("NativeRenderedState", "Track Views Attached to Telemetry Started - waiting for window state change");
            }
            MutableStateFlow mutableStateFlow = ((Mq) this.b.b.l.getValue()).b;
            C4050rf c4050rf = new C4050rf(null);
            this.f7374a = 1;
            if (FlowKt.first(mutableStateFlow, c4050rf, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        C4162vf c4162vf = this.b.b;
        c4162vf.b.b = true;
        c4162vf.f.b.e.a(Uf.f6892a);
        C4135uf c4135uf = this.b;
        Wd.a(c4135uf.b.c, c4135uf.l());
        C3639d0 c3639d0 = this.b.f7514a.f7489a.d;
        c3639d0.getClass();
        c3639d0.e = SystemClock.elapsedRealtime();
        Dd dd = (Dd) this.b.b.g.f.getValue();
        C3912mi publisherNativeViewData = this.b.b.c;
        dd.getClass();
        Intrinsics.checkNotNullParameter(publisherNativeViewData, "publisherNativeViewData");
        Map a2 = AbstractC4169vm.a(dd.f6512a);
        ViewGroup parentView = publisherNativeViewData.f7250a.getParentView();
        int i2 = 0;
        for (Pair pair : Wd.a(publisherNativeViewData)) {
            View view = (View) pair.component1();
            short shortValue = ((Number) pair.component2()).shortValue();
            if (view != null && view.getVisibility() == 0 && Jp.a(view, parentView)) {
                i2 |= 1 << shortValue;
            }
        }
        a2.put("viewState", Integer.valueOf(i2));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("ViewStateOnParentAttached", a2, EnumC3944nm.f7271a);
        return Unit.INSTANCE;
    }
}
