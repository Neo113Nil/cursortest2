package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzekf implements zzesh {
    private final zzgbn zza;
    private final Context zzb;
    private final zzfba zzc;
    private final View zzd;

    public zzekf(zzgbn zzgbnVar, Context context, zzfba zzfbaVar, ViewGroup viewGroup) {
        this.zza = zzgbnVar;
        this.zzb = context;
        this.zzc = zzfbaVar;
        this.zzd = viewGroup;
    }

    public static /* synthetic */ zzekg zzc(zzekf zzekfVar) {
        ArrayList arrayList = new ArrayList();
        View view = zzekfVar.zzd;
        while (view != null) {
            Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int iIndexOfChild = parent instanceof ViewGroup ? ((ViewGroup) parent).indexOfChild(view) : -1;
            Bundle bundle = new Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", iIndexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof View)) {
                break;
            }
            view = (View) parent;
        }
        return new zzekg(zzekfVar.zzb, zzekfVar.zzc.zze, arrayList);
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 3;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        zzbby.zza(this.zzb);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeke
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzekf.zzc(this.zza);
            }
        });
    }
}
