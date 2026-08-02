package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zztg extends com.google.android.libraries.places.internal.zztv {
    zztg(java.lang.String str, java.lang.Class cls, boolean z) {
        super("tags", cls, false);
    }

    @Override // com.google.android.libraries.places.internal.zztv
    public final /* synthetic */ void zzb(java.lang.Object obj, com.google.android.libraries.places.internal.zztu zztuVar) {
        com.google.android.libraries.places.internal.zzwo zzwoVar = (com.google.android.libraries.places.internal.zzwo) obj;
        if (zzwoVar != null) {
            for (java.util.Map.Entry entry : zzwoVar.zzb().entrySet()) {
                if (((java.util.Set) entry.getValue()).isEmpty()) {
                    zztuVar.zza((java.lang.String) entry.getKey(), null);
                } else {
                    java.util.Iterator it = ((java.util.Set) entry.getValue()).iterator();
                    while (it.hasNext()) {
                        zztuVar.zza((java.lang.String) entry.getKey(), it.next());
                    }
                }
            }
        }
    }
}
