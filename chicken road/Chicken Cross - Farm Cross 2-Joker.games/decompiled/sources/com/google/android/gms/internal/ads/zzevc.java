package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzevc implements zzfdi {
    private final zzhdi zza;
    private final Context zzb;
    private final zzflw zzc;
    private final View zzd;

    public zzevc(zzhdi zzhdiVar, Context context, zzflw zzflwVar, ViewGroup viewGroup) {
        this.zza = zzhdiVar;
        this.zzb = context;
        this.zzc = zzflwVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final ListenableFuture zza() {
        zzbjg.zza(this.zzb);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzevb
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzevc.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfdi
    public final int zzb() {
        return 3;
    }

    final /* synthetic */ zzevd zzc() {
        ArrayList arrayList = new ArrayList();
        View view = this.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzevd(this.zzb, this.zzc.zzf, arrayList);
    }
}
