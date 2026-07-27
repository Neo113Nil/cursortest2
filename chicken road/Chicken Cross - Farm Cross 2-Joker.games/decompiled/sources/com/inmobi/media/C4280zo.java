package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.zo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4280zo extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bo f7530a;
    public final /* synthetic */ C3868l4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4280zo(Bo bo, C3868l4 c3868l4, Continuation continuation) {
        super(2, continuation);
        this.f7530a = bo;
        this.b = c3868l4;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4280zo(this.f7530a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4280zo(this.f7530a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Z9 z9 = this.f7530a.e;
        if (z9 != null) {
            z9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.f7530a.j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout parentView = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (parentView != null) {
            parentView.removeAllViews();
        }
        Bo bo = this.f7530a;
        bo.j = null;
        InterfaceC3679ed interfaceC3679ed = bo.h;
        if (interfaceC3679ed == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC3679ed = null;
        }
        ((Te) interfaceC3679ed).a();
        if (parentView == null) {
            return null;
        }
        C3868l4 c3868l4 = this.b;
        c3868l4.getClass();
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (!Intrinsics.areEqual(c3868l4.i, C3898m4.f7238a)) {
            AbstractC4011q4 abstractC4011q4 = c3868l4.i;
            throw new C3811j4(!Intrinsics.areEqual(abstractC4011q4, C3926n4.f7259a) ? !Intrinsics.areEqual(abstractC4011q4, C3983p4.f7298a) ? Intrinsics.areEqual(abstractC4011q4, C3954o4.f7279a) ? "Companion ad failed to load" : "Companion ad view is not available" : "Companion ad is still loading" : "Companion ad has not started loading");
        }
        Z9 z92 = c3868l4.c;
        if (z92 != null) {
            z92.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        parentView.addView(c3868l4.f, layoutParams);
        c3868l4.b();
        C4251yn c4251yn = c3868l4.g;
        if (c4251yn != null) {
            List plus = CollectionsKt.plus((Collection) c4251yn.b, (Iterable) c4251yn.c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : plus) {
                if (Intrinsics.areEqual(((C4189wf) obj2).b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C4189wf) it.next()).f7460a);
            }
            Map a2 = AbstractC4169vm.a(c3868l4.b.f7451a);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("CompanionAdRendered", a2, EnumC3944nm.f7271a);
            AbstractC4012q5.a(c3868l4.d, c3868l4.f7215a, new C4205x4(arrayList2));
        }
        return Unit.INSTANCE;
    }
}
