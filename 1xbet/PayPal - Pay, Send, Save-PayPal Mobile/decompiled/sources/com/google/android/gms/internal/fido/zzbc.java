package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzbc {
    public static final java.lang.Appendable zza(java.lang.Appendable appendable, java.util.Iterator it, com.google.android.gms.internal.fido.zzbd zzbdVar, java.lang.String str) throws java.io.IOException {
        java.lang.String str2;
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            appendable.append(com.google.android.gms.internal.fido.zzbd.zzd(entry.getKey()));
            appendable.append(" : ");
            appendable.append(com.google.android.gms.internal.fido.zzbd.zzd(entry.getValue()));
            while (it.hasNext()) {
                str2 = zzbdVar.zza;
                appendable.append(str2);
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
                appendable.append(com.google.android.gms.internal.fido.zzbd.zzd(entry2.getKey()));
                appendable.append(" : ");
                appendable.append(com.google.android.gms.internal.fido.zzbd.zzd(entry2.getValue()));
            }
        }
        return appendable;
    }
}
