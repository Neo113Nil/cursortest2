package com.inmobi.media;

import android.util.Log;
import android.view.View;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes6.dex */
public final class Z0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bf f6984a;
    public final /* synthetic */ View b;
    public final /* synthetic */ FriendlyObstructionPurpose c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(Bf bf, View view, FriendlyObstructionPurpose friendlyObstructionPurpose, Continuation continuation) {
        super(2, continuation);
        this.f6984a = bf;
        this.b = view;
        this.c = friendlyObstructionPurpose;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z0(this.f6984a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        try {
            AdSession adSession = this.f6984a.c;
            if (adSession != null) {
                adSession.addFriendlyObstruction(this.b, this.c, null);
            }
        } catch (IllegalArgumentException e) {
            Y9 y9 = this.f6984a.b;
            if (y9 != null) {
                ((Z9) y9).a(AbstractC3724g1.f, "Failed to addObstruction. Reason: " + Log.getStackTraceString(e));
            }
        }
        return Unit.INSTANCE;
    }
}
