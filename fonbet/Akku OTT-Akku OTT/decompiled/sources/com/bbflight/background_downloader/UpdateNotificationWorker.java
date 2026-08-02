package com.bbflight.background_downloader;

import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.b;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\f"}, d2 = {"Lcom/bbflight/background_downloader/UpdateNotificationWorker;", "Lcom/bbflight/background_downloader/TaskWorker;", "applicationContext", "Landroid/content/Context;", "workerParams", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "background_downloader_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUpdateNotificationWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UpdateNotificationWorker.kt\ncom/bbflight/background_downloader/UpdateNotificationWorker\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,48:1\n96#2:49\n96#2:50\n*S KotlinDebug\n*F\n+ 1 UpdateNotificationWorker.kt\ncom/bbflight/background_downloader/UpdateNotificationWorker\n*L\n29#1:49\n32#1:50\n*E\n"})
/* loaded from: classes3.dex */
public final class UpdateNotificationWorker extends TaskWorker {

    @DebugMetadata(c = "com.bbflight.background_downloader.UpdateNotificationWorker", f = "UpdateNotificationWorker.kt", i = {0, 0}, l = {43}, m = "doWork", n = {"taskStatus", "taskStatusOrdinal"}, nl = {45}, s = {"L$0", "I$0"}, v = 2)
    public static final class b extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return UpdateNotificationWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateNotificationWorker(Context applicationContext, WorkerParameters workerParams) {
        super(applicationContext, workerParams);
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(workerParams, "workerParams");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.bbflight.background_downloader.TaskWorker, androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        b bVar;
        int i;
        C0654k0 c0654k0;
        Object i2;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i3 = bVar.d;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.d = i3 - Integer.MIN_VALUE;
                Object obj = bVar.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bVar.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    b.a aVar = kotlinx.serialization.json.b.d;
                    String string = getInputData().getString("Task");
                    Intrinsics.checkNotNull(string);
                    aVar.getClass();
                    M0 m0 = (M0) aVar.a(M0.Companion.serializer(), string);
                    Intrinsics.checkNotNullParameter(m0, "<set-?>");
                    this.a = m0;
                    String string2 = getInputData().getString("notificationConfig");
                    this.l = string2;
                    if (string2 != null) {
                        Intrinsics.checkNotNull(string2);
                        c0654k0 = (C0654k0) aVar.a(kotlinx.serialization.builtins.a.c(C0654k0.Companion.serializer()), string2);
                    } else {
                        c0654k0 = null;
                    }
                    this.m = c0654k0;
                    int i4 = getInputData().getInt("taskStatusOrdinal", -1);
                    this.n = k().a.hashCode();
                    if (i4 == -1) {
                        NotificationManagerCompat.from(getApplicationContext()).cancel(this.n);
                    } else {
                        W0 w0 = (W0) W0.m.get(i4);
                        C0657m0 c0657m0 = C0657m0.a;
                        bVar.a = SpillingKt.nullOutSpilledVariable(w0);
                        bVar.d = 1;
                        i2 = C0657m0.a.i(this, w0, 2.0d, -1000L, bVar);
                        if (i2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                ListenableWorker.Result success = ListenableWorker.Result.success();
                Intrinsics.checkNotNullExpressionValue(success, "success(...)");
                return success;
            }
        }
        bVar = new b(continuation);
        Object obj2 = bVar.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bVar.d;
        if (i != 0) {
        }
        ListenableWorker.Result success2 = ListenableWorker.Result.success();
        Intrinsics.checkNotNullExpressionValue(success2, "success(...)");
        return success2;
    }
}
