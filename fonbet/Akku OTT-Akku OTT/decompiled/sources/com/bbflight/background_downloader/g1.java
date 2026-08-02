package com.bbflight.background_downloader;

import android.content.SharedPreferences;
import com.bbflight.background_downloader.TaskWorker;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.b;

@DebugMetadata(c = "com.bbflight.background_downloader.TaskWorker$Companion$processStatusUpdate$2", f = "TaskWorker.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
@SourceDebugExtension({"SMAP\nTaskWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion$processStatusUpdate$2\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,856:1\n113#2:857\n*S KotlinDebug\n*F\n+ 1 TaskWorker.kt\ncom/bbflight/background_downloader/TaskWorker$Companion$processStatusUpdate$2\n*L\n195#1:857\n*E\n"})
/* loaded from: classes3.dex */
public final class g1 extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {
    public final /* synthetic */ M0 a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ SharedPreferences c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(M0 m0, c1 c1Var, SharedPreferences sharedPreferences, Continuation<? super g1> continuation) {
        super(1, continuation);
        this.a = m0;
        this.b = c1Var;
        this.c = sharedPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new g1(this.a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((g1) create(continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        TaskWorker.Companion companion = TaskWorker.INSTANCE;
        String str = this.a.a;
        b.a aVar = kotlinx.serialization.json.b.d;
        aVar.getClass();
        TaskWorker.Companion.a(companion, "com.bbflight.background_downloader.statusUpdateMap.v2", str, aVar.b(c1.Companion.serializer(), this.b), this.c);
        return Unit.INSTANCE;
    }
}
