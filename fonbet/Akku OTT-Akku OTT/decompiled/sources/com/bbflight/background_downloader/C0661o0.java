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

@DebugMetadata(c = "com.bbflight.background_downloader.NotificationService$displayNotification$2$2", f = "Notifications.kt", i = {}, l = {792}, m = "invokeSuspend", n = {}, nl = {793}, s = {}, v = 2)
/* renamed from: com.bbflight.background_downloader.o0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0661o0 extends SuspendLambda implements Function2<kotlinx.coroutines.K, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ NotificationManagerCompat c;
    public final /* synthetic */ TaskWorker d;
    public final /* synthetic */ Notification e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0661o0(long j, NotificationManagerCompat notificationManagerCompat, TaskWorker taskWorker, Notification notification, Continuation<? super C0661o0> continuation) {
        super(2, continuation);
        this.b = j;
        this.c = notificationManagerCompat;
        this.d = taskWorker;
        this.e = notification;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C0661o0(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(kotlinx.coroutines.K k, Continuation<? super Unit> continuation) {
        return ((C0661o0) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            long max = 2000 - Long.max(this.b, 1000L);
            this.a = 1;
            if (kotlinx.coroutines.W.b(max, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.c.notify(this.d.n, this.e);
        return Unit.INSTANCE;
    }
}
