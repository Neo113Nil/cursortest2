package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: com.inmobi.media.c1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3612c1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bf f7037a;
    public final /* synthetic */ View b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3612c1(Bf bf, View view, Continuation continuation) {
        super(2, continuation);
        this.f7037a = bf;
        this.b = view;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3612c1(this.f7037a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3612c1(this.f7037a, this.b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            AdSession adSession = this.f7037a.c;
            if (adSession != null) {
                adSession.removeFriendlyObstruction(this.b);
            }
        } catch (IllegalArgumentException e) {
            String str = AbstractC3724g1.f;
            String str2 = "Failed to removeObstruction. Reason: " + Log.getStackTraceString(e);
        }
        return Unit.INSTANCE;
    }
}
