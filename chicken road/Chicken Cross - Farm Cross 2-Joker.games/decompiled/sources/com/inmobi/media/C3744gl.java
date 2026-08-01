package com.inmobi.media;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.gl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3744gl extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3800il f7127a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3744gl(C3800il c3800il, Continuation continuation) {
        super(2, continuation);
        this.f7127a = c3800il;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3744gl(this.f7127a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3744gl(this.f7127a, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        return Z5.a(this.f7127a.f6571a) ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888;
    }
}
