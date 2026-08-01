package com.inmobi.media;

import com.adjust.sdk.Constants;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;

/* renamed from: com.inmobi.media.ag, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3570ag extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f7013a;
    public final /* synthetic */ C3682eg b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3570ag(C3682eg c3682eg, int i, Continuation continuation) {
        super(1, continuation);
        this.b = c3682eg;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new C3570ag(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3570ag(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r5 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r5 == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7013a;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
                return (List) obj;
            }
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return (List) obj;
        }
        ResultKt.throwOnFailure(obj);
        if (Sf.a() != null) {
            Gh gh = this.b.f7163a;
            Integer boxInt = Boxing.boxInt(this.c);
            this.f7013a = 1;
            obj = gh.a(Constants.NORMAL, "idle", boxInt, this);
        } else {
            Gh gh2 = this.b.f7163a;
            Integer boxInt2 = Boxing.boxInt(this.c);
            this.f7013a = 2;
            obj = gh2.a(Constants.NORMAL, boxInt2, this);
        }
        return coroutine_suspended;
    }
}
