package com.inmobi.media;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* renamed from: com.inmobi.media.xo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4225xo extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7486a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Bo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4225xo(Bo bo, Continuation continuation) {
        super(2, continuation);
        this.c = bo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C4225xo c4225xo = new C4225xo(this.c, continuation);
        c4225xo.b = obj;
        return c4225xo;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C4225xo c4225xo = new C4225xo(this.c, (Continuation) obj2);
        c4225xo.b = (AbstractC3691eo) obj;
        return c4225xo.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7486a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AbstractC3691eo abstractC3691eo = (AbstractC3691eo) this.b;
            Bo bo = this.c;
            this.f7486a = 1;
            if (bo.c.b.isEmpty()) {
                Z9 z9 = bo.e;
                if (z9 != null) {
                    z9.a("VideoExperienceManager", "Companion Ads are Empty");
                }
                obj2 = Unit.INSTANCE;
            } else {
                if (bo.i == null) {
                    bo.i = new C3868l4(bo.f6571a, bo.b, bo.c.h, bo.e);
                    bo.c();
                }
                C3868l4 c3868l4 = bo.i;
                if ((c3868l4 == null || !Intrinsics.areEqual(c3868l4.i, C3926n4.f7259a)) ? false : abstractC3691eo instanceof C4199wp) {
                    C3868l4 c3868l42 = bo.i;
                    if (c3868l42 != null) {
                        c3868l42.a(bo.c.b);
                    }
                } else if (abstractC3691eo instanceof C3607bo) {
                    C3868l4 c3868l43 = bo.i;
                    if (c3868l43 != null) {
                        if (Intrinsics.areEqual(c3868l43.i, C3898m4.f7238a)) {
                            obj2 = BuildersKt.withContext(Dispatchers.getMain(), new C4280zo(bo, c3868l43, null), this);
                            if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            }
                        } else {
                            Z9 z92 = bo.e;
                            if (z92 != null) {
                                z92.a("VideoExperienceManager", "Companion Ad is not Available");
                            }
                            Map a2 = AbstractC4169vm.a(bo.c.h.f7451a);
                            C3829jm c3829jm = C3829jm.f7187a;
                            C3829jm.b("CompanionAdDropped", a2, EnumC3944nm.f7271a);
                            obj2 = BuildersKt.withContext(Dispatchers.getMain(), new C4252yo(c3868l43, null), this);
                            if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                                obj2 = Unit.INSTANCE;
                            }
                        }
                        if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            obj2 = Unit.INSTANCE;
                        }
                    }
                    obj2 = Unit.INSTANCE;
                    if (obj2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                }
                obj2 = Unit.INSTANCE;
            }
            if (obj2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
