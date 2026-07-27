package com.inmobi.media;

import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.cj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3630cj extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3685ej f7051a;
    public final /* synthetic */ Ac b;
    public final /* synthetic */ JSONObject c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3630cj(C3685ej c3685ej, Ac ac, JSONObject jSONObject, Continuation continuation) {
        super(1, continuation);
        this.f7051a = c3685ej;
        this.b = ac;
        this.c = jSONObject;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3630cj(this.f7051a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C3630cj) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0043, code lost:
    
        if (r0 != com.inmobi.media.Ac.d) goto L31;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Ac eventLogLevel;
        int ordinal;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            Cc cc = this.f7051a.e;
            eventLogLevel = this.b;
            cc.getClass();
            Intrinsics.checkNotNullParameter(eventLogLevel, "eventLogLevel");
            ordinal = cc.f6493a.ordinal();
        } catch (Exception e) {
            this.f7051a.getClass();
            Lazy lazy = Ba.f6473a;
            U9.a(e);
        }
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (eventLogLevel == Ac.d) {
                    }
                    return Unit.INSTANCE;
                }
                if (eventLogLevel != Ac.c) {
                    if (eventLogLevel == Ac.d) {
                    }
                    return Unit.INSTANCE;
                }
            } else if (eventLogLevel != Ac.b) {
                if (eventLogLevel != Ac.c) {
                }
            }
        }
        this.f7051a.g.add(this.c);
        return Unit.INSTANCE;
    }
}
