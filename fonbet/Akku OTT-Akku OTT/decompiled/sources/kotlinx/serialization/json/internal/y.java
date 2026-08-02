package kotlinx.serialization.json.internal;

import kotlin.DeepRecursiveScope;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function3;

@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
public final class y extends RestrictedSuspendLambda implements Function3<DeepRecursiveScope<Unit, kotlinx.serialization.json.h>, Unit, Continuation<? super kotlinx.serialization.json.h>, Object> {
    public int a;
    public /* synthetic */ DeepRecursiveScope b;
    public final /* synthetic */ A c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(A a, Continuation<? super y> continuation) {
        super(3, continuation);
        this.c = a;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(DeepRecursiveScope<Unit, kotlinx.serialization.json.h> deepRecursiveScope, Unit unit, Continuation<? super kotlinx.serialization.json.h> continuation) {
        y yVar = new y(this.c, continuation);
        yVar.b = deepRecursiveScope;
        return yVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        A a = this.c;
        F f = a.a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DeepRecursiveScope deepRecursiveScope = this.b;
            byte r = f.r();
            if (r == 1) {
                return a.d(true);
            }
            if (r == 0) {
                return a.d(false);
            }
            if (r != 6) {
                if (r == 8) {
                    return a.c();
                }
                F.m(f, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.a = 1;
            obj = A.a(a, deepRecursiveScope, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (kotlinx.serialization.json.h) obj;
    }
}
