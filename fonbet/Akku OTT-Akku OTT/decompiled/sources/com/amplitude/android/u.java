package com.amplitude.android;

import androidx.constraintlayout.widget.ConstraintLayout;
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
import kotlinx.coroutines.channels.b;

@DebugMetadata(c = "com.amplitude.android.Timeline$start$1$1", f = "Timeline.kt", i = {}, l = {41, ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX, 50}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class u extends SuspendLambda implements Function2<K, Continuation<? super Unit>, Object> {
    public kotlinx.coroutines.channels.i a;
    public int b;
    public final /* synthetic */ com.amplitude.core.b c;
    public final /* synthetic */ x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.amplitude.core.b bVar, x xVar, Continuation<? super u> continuation) {
        super(2, continuation);
        this.c = bVar;
        this.d = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new u(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Unit> continuation) {
        return ((u) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0095, code lost:
    
        if (com.amplitude.android.x.e(r6, r12, r11) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0097, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0038, code lost:
    
        if (r12.await(r11) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x007c, code lost:
    
        if (r12 != r0) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0095 -> B:7:0x0074). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        kotlinx.coroutines.channels.i aVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        com.amplitude.core.b bVar = this.c;
        x xVar = this.d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            S<Boolean> s = bVar.m;
            this.b = 1;
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            aVar = this.a;
            ResultKt.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                return Unit.INSTANCE;
            }
            m mVar = (m) aVar.next();
            this.a = aVar;
            this.b = 3;
        } else {
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.a;
            ResultKt.throwOnFailure(obj);
            this.a = aVar;
            this.b = 2;
            obj = aVar.b(this);
        }
        if (xVar.c == null) {
            xVar.e.set(x.f(xVar, bVar.j(), k.a.c, -1L));
        }
        xVar.g = x.f(xVar, bVar.j(), k.a.b, 0L);
        xVar.h = x.f(xVar, bVar.j(), k.a.d, 0L);
        kotlinx.coroutines.channels.b bVar2 = xVar.d;
        bVar2.getClass();
        aVar = new b.a();
        this.a = aVar;
        this.b = 2;
        obj = aVar.b(this);
    }
}
