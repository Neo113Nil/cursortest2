package com.inmobi.media;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.w, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4173w extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7447a;
    public final /* synthetic */ C4200x b;
    public final /* synthetic */ String c;
    public final /* synthetic */ C3972ol d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4173w(C4200x c4200x, String str, C3972ol c3972ol, Continuation continuation) {
        super(2, continuation);
        this.b = c4200x;
        this.c = str;
        this.d = c3972ol;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4173w(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4173w) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f7447a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        C4200x c4200x = this.b;
        String str = this.c;
        C3972ol c3972ol = this.d;
        this.f7447a = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(this), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new C4118u(c4200x));
        Picasso picasso = Ug.f6893a;
        Ug.b(c4200x.f7469a).load(str).tag(c4200x.e).transform(new Pg(Bitmap.Config.RGB_565)).into(c3972ol, new C4146v(c4200x, cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(this);
        }
        return result == coroutine_suspended ? coroutine_suspended : result;
    }
}
