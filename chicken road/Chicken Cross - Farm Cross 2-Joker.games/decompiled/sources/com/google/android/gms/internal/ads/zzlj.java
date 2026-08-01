package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzlj {
    final /* synthetic */ zzlk zza;
    private final WeakReference zzb;
    private final IntConsumer zzc;

    /* synthetic */ zzlj(zzlk zzlkVar, Context context, byte[] bArr) {
        Objects.requireNonNull(zzlkVar);
        this.zza = zzlkVar;
        this.zzb = new WeakReference(context);
        IntConsumer intConsumer = new IntConsumer() { // from class: com.google.android.gms.internal.ads.zzlh
            @Override // java.util.function.IntConsumer
            public final /* synthetic */ void accept(int i) {
                zzlk zzlkVar2 = zzlj.this.zza;
                if (zzlkVar2.zzae()) {
                    return;
                }
                zzlkVar2.zzT(1, 19, Integer.valueOf(i));
            }
        };
        this.zzc = intConsumer;
        final zzea zzd = zzlkVar.zzX().zzd(zzlkVar.zzW(), null);
        Objects.requireNonNull(zzd);
        context.registerDeviceIdChangeListener(new Executor() { // from class: com.google.android.gms.internal.ads.zzli
            @Override // java.util.concurrent.Executor
            public final /* synthetic */ void execute(Runnable runnable) {
                zzea.this.zzm(runnable);
            }
        }, intConsumer);
    }

    final /* synthetic */ void zza() {
        Context context = (Context) this.zzb.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.zzc);
    }
}
