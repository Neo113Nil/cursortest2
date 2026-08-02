package com.google.android.gms.internal.firebase_database;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgt<T> {
    public T value;
    public Map<zzid, zzgt<T>> zzkk = new HashMap();

    final String toString(String str) {
        String valueOf = String.valueOf(this.value);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 10 + String.valueOf(valueOf).length());
        sb.append(str);
        sb.append("<value>: ");
        sb.append(valueOf);
        sb.append("\n");
        String sb2 = sb.toString();
        if (this.zzkk.isEmpty()) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(sb2).length() + 7 + String.valueOf(str).length());
            sb3.append(sb2);
            sb3.append(str);
            sb3.append("<empty>");
            return sb3.toString();
        }
        for (Map.Entry<zzid, zzgt<T>> entry : this.zzkk.entrySet()) {
            String valueOf2 = String.valueOf(sb2);
            String valueOf3 = String.valueOf(entry.getKey());
            String zzgtVar = entry.getValue().toString(String.valueOf(str).concat("\t"));
            StringBuilder sb4 = new StringBuilder(String.valueOf(valueOf2).length() + 3 + String.valueOf(str).length() + String.valueOf(valueOf3).length() + String.valueOf(zzgtVar).length());
            sb4.append(valueOf2);
            sb4.append(str);
            sb4.append(valueOf3);
            sb4.append(":\n");
            sb4.append(zzgtVar);
            sb4.append("\n");
            sb2 = sb4.toString();
        }
        return sb2;
    }
}
