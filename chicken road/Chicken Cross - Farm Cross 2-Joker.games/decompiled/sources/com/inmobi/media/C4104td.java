package com.inmobi.media;

import android.content.Context;
import android.media.AudioManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4104td extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4133ud f7393a;
    public final /* synthetic */ C4187wd b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4104td(C4133ud c4133ud, C4187wd c4187wd, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f7393a = c4133ud;
        this.b = c4187wd;
        this.c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4104td(this.f7393a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4104td) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Context context = this.f7393a.b;
        if (context != null) {
            AudioManager audioManager = null;
            try {
                Object systemService = context.getSystemService("audio");
                if (!(systemService instanceof AudioManager)) {
                    systemService = null;
                }
                audioManager = (AudioManager) systemService;
            } catch (Throwable unused) {
            }
            if (audioManager != null) {
                try {
                    int streamVolume = audioManager.getStreamVolume(3);
                    C4133ud c4133ud = this.f7393a;
                    if (streamVolume != c4133ud.c) {
                        c4133ud.c = streamVolume;
                        Y9 y9 = this.b.b;
                        if (y9 != null) {
                            ((Z9) y9).a("MraidMediaProcessor", "volume change detected - " + this.c);
                        }
                        this.b.a(this.f7393a.f7414a, streamVolume);
                    }
                } catch (Exception e) {
                    Y9 y92 = this.b.b;
                    if (y92 != null) {
                        ((Z9) y92).a("MraidMediaProcessor", "Unexpected error in volume listener", e);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }
}
