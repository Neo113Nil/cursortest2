package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeue implements com.google.android.gms.internal.ads.zzfck {
    private final com.google.android.gms.internal.ads.zzhcg zza;
    private final android.content.Context zzb;
    private final com.google.android.gms.internal.ads.zzfky zzc;
    private final android.view.View zzd;

    public zzeue(com.google.android.gms.internal.ads.zzhcg zzhcgVar, android.content.Context context, com.google.android.gms.internal.ads.zzfky zzfkyVar, android.view.ViewGroup viewGroup) {
        this.zza = zzhcgVar;
        this.zzb = context;
        this.zzc = zzfkyVar;
        this.zzd = viewGroup;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        com.google.android.gms.internal.ads.zzbiq.zza(this.zzb);
        return this.zza.zzc(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzeud
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzeue.this.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 3;
    }

    final /* synthetic */ com.google.android.gms.internal.ads.zzeuf zzc() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.view.View view = this.zzd;
        while (view != null) {
            java.lang.Object parent = view.getParent();
            if (parent == null) {
                break;
            }
            int indexOfChild = parent instanceof android.view.ViewGroup ? ((android.view.ViewGroup) parent).indexOfChild(view) : -1;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("type", parent.getClass().getName());
            bundle.putInt("index_of_child", indexOfChild);
            arrayList.add(bundle);
            if (!(parent instanceof android.view.View)) {
                break;
            }
            view = (android.view.View) parent;
        }
        return new com.google.android.gms.internal.ads.zzeuf(this.zzb, this.zzc.zzf, arrayList);
    }
}
