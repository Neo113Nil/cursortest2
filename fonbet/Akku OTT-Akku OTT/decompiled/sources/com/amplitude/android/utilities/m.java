package com.amplitude.android.utilities;

import com.amplitude.core.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.K;
import kotlinx.coroutines.S;

@DebugMetadata(c = "com.amplitude.android.utilities.DefaultEventUtils$trackAppUpdatedInstalledEvent$1", f = "DefaultEventUtils.kt", i = {}, l = {60, 62, 63}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class m extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ i b;
    public final /* synthetic */ com.amplitude.core.k c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, com.amplitude.core.k kVar, String str, String str2, Continuation<? super m> continuation) {
        super(2, continuation);
        this.b = iVar;
        this.c = kVar;
        this.d = str;
        this.e = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new m(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((m) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r2.d(r7, r6.e) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r2.d(r7, r6.d) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0036, code lost:
    
        if (r7.await(r6) == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        com.amplitude.core.k kVar = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S<Boolean> s = this.b.a.m;
            this.a = 1;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            k.a aVar = k.a.j;
            this.a = 3;
        }
        k.a aVar2 = k.a.i;
        this.a = 2;
    }
}
