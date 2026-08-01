package com.inmobi.media;

import android.view.ViewGroup;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.s, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4062s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public C3972ol f7362a;
    public int b;
    public final /* synthetic */ C4200x c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4062s(C4200x c4200x, String str, int i, int i2, int i3, Continuation continuation) {
        super(2, continuation);
        this.c = c4200x;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.g = i3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4062s(this.c, this.d, this.e, this.f, this.g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4062s) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C3972ol c3972ol;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.b;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C3972ol c3972ol2 = new C3972ol(this.c.f7469a);
            c3972ol2.setLayoutParams(new ViewGroup.LayoutParams(this.f, this.g));
            C4200x c4200x = this.c;
            String str = this.d;
            int i2 = this.e;
            this.f7362a = c3972ol2;
            this.b = 1;
            Object a2 = C4200x.a(c4200x, c3972ol2, str, i2, this);
            if (a2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            c3972ol = c3972ol2;
            obj = a2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c3972ol = this.f7362a;
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            return c3972ol;
        }
        throw new C3652dd();
    }
}
