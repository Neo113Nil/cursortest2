package com.inmobi.media;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Ga extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f6579a;
    public final /* synthetic */ Ha b;
    public final /* synthetic */ ArrayList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ga(Ha ha, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.b = ha;
        this.c = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ga(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ga(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Ia ia;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f6579a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C4213xc c4213xc = (C4213xc) AbstractC4240yc.f7500a.getValue();
            this.f6579a = 1;
            obj = c4213xc.b(this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        ArrayList arrayList = this.c;
        for (C4019qc c4019qc : (Iterable) obj) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mc.f6715a;
            if (!Lc.a(c4019qc.f7325a)) {
                String b = Tc.b(c4019qc.f7325a);
                if (b != null) {
                    JSONObject jSONObject = new JSONObject(b);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("vitals");
                    JSONArray jSONArray = jSONObject.getJSONArray("log");
                    Intrinsics.checkNotNull(jSONObject2);
                    Intrinsics.checkNotNull(jSONArray);
                    ia = new Ia(jSONObject2, jSONArray, c4019qc);
                } else {
                    ia = null;
                }
                if (ia != null) {
                    arrayList.add(ia);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
