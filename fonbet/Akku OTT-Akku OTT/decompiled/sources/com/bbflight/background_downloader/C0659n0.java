package com.bbflight.background_downloader;

import android.app.Notification;
import androidx.core.app.NotificationManagerCompat;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@DebugMetadata(c = "com.bbflight.background_downloader.NotificationService$displayNotification$2$1", f = "Notifications.kt", i = {}, l = {778}, m = "invokeSuspend", n = {}, nl = {779}, s = {}, v = 2)
/* renamed from: com.bbflight.background_downloader.n0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0659n0 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ NotificationManagerCompat b;
    public final /* synthetic */ TaskWorker c;
    public final /* synthetic */ Notification d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0659n0(NotificationManagerCompat notificationManagerCompat, TaskWorker taskWorker, Notification notification, Continuation<? super C0659n0> continuation) {
        super(2, continuation);
        this.b = notificationManagerCompat;
        this.c = taskWorker;
        this.d = notification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0659n0(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
        return ((C0659n0) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.a = 1;
            if (kotlinx.coroutines.W.b(200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.b.notify(this.c.n, this.d);
        return Unit.INSTANCE;
    }
}
