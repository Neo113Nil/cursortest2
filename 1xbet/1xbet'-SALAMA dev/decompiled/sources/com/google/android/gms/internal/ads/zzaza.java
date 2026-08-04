package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import android.util.Base64OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
final class zzaza {
    ByteArrayOutputStream zza = new ByteArrayOutputStream(4096);
    Base64OutputStream zzb = new Base64OutputStream(this.zza, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.zzb.close();
        } catch (IOException e7) {
            int i7 = J.f3546b;
            j.e("HashManager: Unable to convert to Base64.", e7);
        }
        try {
            try {
                this.zza.close();
                string = this.zza.toString();
            } catch (IOException e8) {
                int i8 = J.f3546b;
                j.e("HashManager: Unable to convert to Base64.", e8);
                string = "";
            }
            return string;
        } finally {
            this.zza = null;
            this.zzb = null;
        }
    }
}
