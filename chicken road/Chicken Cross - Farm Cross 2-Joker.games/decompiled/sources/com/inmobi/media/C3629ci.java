package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.SignalsConfig;
import kotlin.Lazy;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3629ci extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7050a;

    public C3629ci(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3629ci(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3629ci((Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7050a;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C3770hi c3770hi = C3770hi.f7146a;
                c3770hi.getClass();
                Context context = AbstractC3914mk.f7252a;
                JSONObject jSONObject = null;
                if (context != null) {
                    c3770hi.getClass();
                    if (C3770hi.d == null) {
                        C3770hi.d = new Rh(context, "pub_signals_store");
                    }
                    Rh rh = C3770hi.d;
                    if (rh == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("prefDao");
                        rh = null;
                    }
                    String a2 = rh.a("saved_signals");
                    if (a2 != null) {
                        jSONObject = new JSONObject(a2);
                    }
                }
                if (jSONObject == null) {
                    return Unit.INSTANCE;
                }
                SignalsConfig.PublisherConfig d = C3770hi.d();
                JSONObject a3 = AbstractC3797ii.a(AbstractC3797ii.a(AbstractC3797ii.a(jSONObject, "obj_", d.getObj().getExpiry()), "auto_", d.getAuto().getExpiry()), "dir_", d.getDirect().getExpiry());
                this.f7050a = 1;
                if (c3770hi.a(a3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e) {
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
        return Unit.INSTANCE;
    }
}
