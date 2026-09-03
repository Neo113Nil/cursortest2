package com.door.brass.knob.data.remote;

import android.webkit.WebSettings;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-24254e9e31496375de47ca9ce3233ebe3b0427ab0cb10649855f926fd35e5650 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.remote.MeringueSocketClient$resolveUserAgent$resolved$1", f = "MeringueSocketClient.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class MeringueSocketClient$resolveUserAgent$resolved$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ MeringueSocketClient Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeringueSocketClient$resolveUserAgent$resolved$1(MeringueSocketClient meringueSocketClient, Continuation continuation) {
        super(2, continuation);
        this.Uo5pffGf8LUU = meringueSocketClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        ResultKt.hRNgd2zGCE5kj(obj);
        try {
            return WebSettings.getDefaultUserAgent(this.Uo5pffGf8LUU.yzPsTade5rL7D3);
        } catch (Throwable unused) {
            String property = System.getProperty("http.agent");
            return property == null ? "" : property;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new MeringueSocketClient$resolveUserAgent$resolved$1(this.Uo5pffGf8LUU, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((MeringueSocketClient$resolveUserAgent$resolved$1) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
