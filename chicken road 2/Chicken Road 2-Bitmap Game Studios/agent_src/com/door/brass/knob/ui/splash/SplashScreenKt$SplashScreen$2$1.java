package com.door.brass.knob.ui.splash;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.ui.splash.SplashScreenKt$SplashScreen$2$1", f = "SplashScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SplashScreenKt$SplashScreen$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ Function0 Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplashScreenKt$SplashScreen$2$1(Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.Uo5pffGf8LUU = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        ResultKt.hRNgd2zGCE5kj(obj);
        this.Uo5pffGf8LUU.hRNgd2zGCE5kj();
        return Unit.yzPsTade5rL7D3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new SplashScreenKt$SplashScreen$2$1(this.Uo5pffGf8LUU, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        SplashScreenKt$SplashScreen$2$1 splashScreenKt$SplashScreen$2$1 = (SplashScreenKt$SplashScreen$2$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2);
        Unit unit = Unit.yzPsTade5rL7D3;
        splashScreenKt$SplashScreen$2$1.AGl7HBCQ8xrHABq(unit);
        return unit;
    }
}
