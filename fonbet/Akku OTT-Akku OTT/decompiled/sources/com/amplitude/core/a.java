package com.amplitude.core;

import android.content.SharedPreferences;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.File;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.K;

@DebugMetadata(c = "com.amplitude.core.Amplitude$build$built$1", f = "Amplitude.kt", i = {}, l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class a extends SuspendLambda implements Function2<K, Continuation<? super Boolean>, Object> {
    public int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, b bVar2, Continuation<? super a> continuation) {
        super(2, continuation);
        this.b = bVar;
        this.c = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new a(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super Boolean> continuation) {
        return ((a) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b bVar = this.b;
        com.amplitude.android.h hVar = bVar.a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            hVar.w.getClass();
            b amplitude = this.c;
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            com.amplitude.android.h configuration = amplitude.a;
            Intrinsics.checkNotNull(configuration, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            SharedPreferences sharedPreferences = configuration.b.getSharedPreferences("amplitude-identify-intercept-" + configuration.e, 0);
            String str = configuration.e;
            com.amplitude.common.a a = configuration.h.a(amplitude);
            Intrinsics.checkNotNull(sharedPreferences);
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            bVar.i = new com.amplitude.android.storage.i(str, a, sharedPreferences, new File(configuration.a(), "identify-intercept"), amplitude.n);
            com.amplitude.id.d d = bVar.d();
            bVar.j = hVar.x.a(d);
            this.a = 1;
            if (amplitude.c(d, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxBoolean(true);
    }
}
