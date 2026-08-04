package com.google.android.recaptcha.internal;

import C6.o;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import p050g6.h;
import p050g6.j;
import z6.b;
import z6.c;

/* JADX INFO: loaded from: classes.dex */
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
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            if (fileArrListFiles != null) {
                ArrayList arrayList = new ArrayList();
                for (File file : fileArrListFiles) {
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
    public final void zzc(String str, String str2) throws IOException {
        c cVar = new c('A', 'z');
        ArrayList arrayList = new ArrayList(j.N0(cVar));
        Iterator it = cVar.iterator();
        while (((b) it).f18538c) {
            b bVar = (b) it;
            int i7 = bVar.f18539d;
            if (i7 != bVar.f18537b) {
                bVar.f18539d = bVar.f18536a + i7;
            } else {
                if (!bVar.f18538c) {
                    throw new NoSuchElementException();
                }
                bVar.f18538c = false;
            }
            arrayList.add(Character.valueOf((char) i7));
        }
        List listD1 = h.d1(arrayList);
        Collections.shuffle(listD1);
        String strT0 = h.T0(((ArrayList) listD1).subList(0, 8), "", null, null, null, 62);
        File file = new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(strT0)));
        zzbx.zzb(file, String.valueOf(str2).getBytes(StandardCharsets.UTF_8));
        file.renameTo(new File(this.zza.getCacheDir(), this.zzb.concat(String.valueOf(str))));
    }

    @Override // com.google.android.recaptcha.internal.zzav
    public final boolean zzd(String str) {
        try {
            File[] fileArrListFiles = this.zza.getCacheDir().listFiles();
            File file = null;
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (t6.h.a(file2.getName(), this.zzb + str)) {
                        file = file2;
                        break;
                    }
                }
            }
            return file != null;
        } catch (Exception unused) {
            return false;
        }
    }
}
