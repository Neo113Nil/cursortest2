package com.door.brass.knob.data.device;

import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.concurrent.CancellationException;
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
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@DebugMetadata(c = "com.door.brass.knob.data.device.AdvertisingIdSource$read$2", f = "AdvertisingIdSource.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class AdvertisingIdSource$read$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    public final /* synthetic */ AdvertisingIdSource Uo5pffGf8LUU;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvertisingIdSource$read$2(AdvertisingIdSource advertisingIdSource, Continuation continuation) {
        super(2, continuation);
        this.Uo5pffGf8LUU = advertisingIdSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object AGl7HBCQ8xrHABq(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.oyjLVtGms9eZwJ0;
        ResultKt.hRNgd2zGCE5kj(obj);
        try {
            String str = AdvertisingIdClient.yzPsTade5rL7D3(this.Uo5pffGf8LUU.yzPsTade5rL7D3).yzPsTade5rL7D3;
            return str == null ? "" : str;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Log.w("DeviceSignals", "Advertising ID unavailable", e2);
            return "";
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation FTJ2XS7ULgY8(Object obj, Continuation continuation) {
        return new AdvertisingIdSource$read$2(this.Uo5pffGf8LUU, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object kSPEzfraxudm4i(Object obj, Object obj2) {
        return ((AdvertisingIdSource$read$2) FTJ2XS7ULgY8((CoroutineScope) obj, (Continuation) obj2)).AGl7HBCQ8xrHABq(Unit.yzPsTade5rL7D3);
    }
}
