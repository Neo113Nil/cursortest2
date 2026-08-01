package com.inmobi.media;

import androidx.webkit.Profile;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* loaded from: classes6.dex */
public final class Bj extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Mutex f6478a;
    public Ej b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Ej e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bj(Ej ej, Continuation continuation) {
        super(2, continuation);
        this.e = ej;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Bj bj = new Bj(this.e, continuation);
        bj.d = obj;
        return bj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Bj bj = new Bj(this.e, (Continuation) obj2);
        bj.d = (CoroutineScope) obj;
        return bj.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        Ej ej;
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.c;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.d;
            Ej ej2 = this.e;
            Mutex mutex2 = ej2.y;
            this.d = coroutineScope2;
            this.f6478a = mutex2;
            this.b = ej2;
            this.c = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            coroutineScope = coroutineScope2;
            ej = ej2;
            mutex = mutex2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ej = this.b;
            mutex = this.f6478a;
            coroutineScope = (CoroutineScope) this.d;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (Intrinsics.areEqual("Loading", ej.B)) {
                Y9 y9 = ej.i;
                if (y9 != null) {
                    String str = Ej.j1;
                    Intrinsics.checkNotNullExpressionValue(str, "access$getTAG$cp(...)");
                    ((Z9) y9).a(str, "updateWebViewLoaded " + coroutineScope);
                }
                ej.getListener().g(ej);
                ej.setAndUpdateViewState(Profile.DEFAULT_PROFILE_NAME);
                Y9 y92 = ej.i;
                if (y92 != null) {
                    String str2 = Ej.j1;
                    Intrinsics.checkNotNullExpressionValue(str2, "access$getTAG$cp(...)");
                    ((Z9) y92).a(str2, "updateWebViewLoaded state changed to " + ej.getViewState());
                }
            }
            return Unit.INSTANCE;
        } finally {
            mutex.unlock(null);
        }
    }
}
