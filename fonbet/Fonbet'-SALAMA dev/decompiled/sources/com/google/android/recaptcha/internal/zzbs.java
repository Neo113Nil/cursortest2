package com.google.android.recaptcha.internal;

import C6.o;
import android.content.Context;
import g6.AbstractC1159h;
import g6.AbstractC1161j;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import t6.h;
import z6.b;
import z6.c;

/* loaded from: classes.dex */
public final class zzbs implements zzav {
    private final Context zza;
    private final String zzb = "rce_";

    public zzbs(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final String zza(String str) {
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str)));
        if (file.exists()) {
            return new String(zzbx.zza(file), StandardCharsets.UTF_8);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final void zzb() {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            if (listFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : listFiles) {
                    if (o.B0(file.getName(), this.zzb)) {
                        arrayList.add(file);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((File) it.next()).delete();
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final void zzc(String str, String str2) {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(AbstractC1161j.N0(cVar));
        Iterator it = cVar.iterator();
        while (((b) it).f18532c) {
            b bVar = (b) it;
            int i7 = bVar.f18533d;
            if (i7 != bVar.f18531b) {
                bVar.f18533d = bVar.f18530a + i7;
            } else {
                if (!bVar.f18532c) {
                    throw new NoSuchElementException();
                }
                bVar.f18532c = false;
            }
            arrayList.add(Character.valueOf((char) i7));
        }
        List d12 = AbstractC1159h.d1(arrayList);
        Collections.shuffle(d12);
        String T02 = AbstractC1159h.T0(((ArrayList) d12).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(T02)));
        zzbx.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final boolean zzd(String str) {
        try {
            File[] listFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (listFiles != null) {
                int length = listFiles.length;
                int i7 = 0;
                while (true) {
                    if (i7 >= length) {
                        break;
                    }
                    File file2 = listFiles[i7];
                    if (h.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                    i7++;
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
