package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: OrientationRepository.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, d2 = {"<anonymous>", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes7.dex */
final class OrientationRepository$invoke$4 extends SuspendLambda implements Function2<WeakReference<Activity>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OrientationRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OrientationRepository$invoke$4(OrientationRepository orientationRepository, Continuation<? super OrientationRepository$invoke$4> continuation) {
        super(2, continuation);
        this.this$0 = orientationRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OrientationRepository$invoke$4 orientationRepository$invoke$4 = new OrientationRepository$invoke$4(this.this$0, continuation);
        orientationRepository$invoke$4.L$0 = obj;
        return orientationRepository$invoke$4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(WeakReference<Activity> weakReference, Continuation<? super Unit> continuation) {
        return ((OrientationRepository$invoke$4) create(weakReference, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            mutableStateFlow = this.this$0._resumedActivityOrientation;
            Activity activity = (Activity) weakReference.get();
            mutableStateFlow.setValue(Boxing.boxInt(activity != null ? activity.getRequestedOrientation() : -1));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
