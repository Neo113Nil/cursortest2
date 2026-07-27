package com.inmobi.media;

import android.graphics.drawable.Drawable;
import androidx.core.content.ContextCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class J5 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f6642a;
    public final /* synthetic */ K5 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J5(K5 k5, int i, int i2, int i3, int i4, int i5, Continuation continuation) {
        super(2, continuation);
        this.b = k5;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        J5 j5 = new J5(this.b, this.c, this.d, this.e, this.f, this.g, continuation);
        j5.f6642a = obj;
        return j5;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((J5) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Drawable drawable = ContextCompat.getDrawable(this.b.getContext(), this.c);
        if (drawable != null) {
            this.b.a(drawable, this.d, this.e, this.f, this.g);
            return Unit.INSTANCE;
        }
        K5 k5 = this.b;
        Y9 y9 = k5.b;
        if (y9 != null) {
            ((Z9) y9).b("CustomView", "CustomView drawable for " + ((int) k5.f6664a) + " cannot be created");
        }
        return Unit.INSTANCE;
    }
}
