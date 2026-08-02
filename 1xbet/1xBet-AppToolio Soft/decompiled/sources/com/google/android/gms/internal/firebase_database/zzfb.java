package com.google.android.gms.internal.firebase_database;

import com.google.firebase.database.DatabaseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzfb {
    private final List<String> zzlw = new ArrayList();
    private int zzlx;

    private zzfb(zzch zzchVar) throws DatabaseException {
        this.zzlx = 0;
        Iterator<zzid> it = zzchVar.iterator();
        while (it.hasNext()) {
            this.zzlw.add(it.next().zzfg());
        }
        this.zzlx = Math.max(1, this.zzlw.size());
        for (int i = 0; i < this.zzlw.size(); i++) {
            this.zzlx += zza(this.zzlw.get(i));
        }
        zzcs();
    }

    private static int zza(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt <= 127) {
                i2++;
            } else if (charAt <= 2047) {
                i2 += 2;
            } else if (Character.isHighSurrogate(charAt)) {
                i2 += 4;
                i++;
            } else {
                i2 += 3;
            }
            i++;
        }
        return i2;
    }

    public static void zza(zzch zzchVar, Object obj) throws DatabaseException {
        new zzfb(zzchVar).zzc(obj);
    }

    private final void zzc(Object obj) throws DatabaseException {
        if (obj instanceof Map) {
            Map map = (Map) obj;
            for (String str : map.keySet()) {
                if (!str.startsWith(".")) {
                    zzs(str);
                    zzc(map.get(str));
                    zzcr();
                }
            }
            return;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            for (int i = 0; i < list.size(); i++) {
                zzs(Integer.toString(i));
                zzc(list.get(i));
                zzcr();
            }
        }
    }

    private final String zzcr() {
        String remove = this.zzlw.remove(r0.size() - 1);
        this.zzlx -= zza(remove);
        if (this.zzlw.size() > 0) {
            this.zzlx--;
        }
        return remove;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final void zzcs() throws DatabaseException {
        String sb;
        int i = this.zzlx;
        if (i > 768) {
            StringBuilder sb2 = new StringBuilder(56);
            sb2.append("Data has a key path longer than 768 bytes (");
            sb2.append(i);
            sb2.append(").");
            throw new DatabaseException(sb2.toString());
        }
        if (this.zzlw.size() > 32) {
            String valueOf = String.valueOf("Path specified exceeds the maximum depth that can be written (32) or object contains a cycle ");
            if (this.zzlw.size() == 0) {
                sb = "";
            } else {
                List<String> list = this.zzlw;
                StringBuilder sb3 = new StringBuilder();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (i2 > 0) {
                        sb3.append("/");
                    }
                    sb3.append(list.get(i2));
                }
                String sb4 = sb3.toString();
                StringBuilder sb5 = new StringBuilder(String.valueOf(sb4).length() + 10);
                sb5.append("in path '");
                sb5.append(sb4);
                sb5.append("'");
                sb = sb5.toString();
            }
            String valueOf2 = String.valueOf(sb);
            throw new DatabaseException(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf));
        }
    }

    private final void zzs(String str) throws DatabaseException {
        if (this.zzlw.size() > 0) {
            this.zzlx++;
        }
        this.zzlw.add(str);
        this.zzlx += zza(str);
        zzcs();
    }
}
