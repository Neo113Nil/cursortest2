package com.google.android.gms.internal.ads;

import F2.C0254t;
import I2.J;
import I2.w;
import I2.x;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import m3.InterfaceC1436a;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
public final class zzdjq {
    private final x zza;
    private final InterfaceC1436a zzb;
    private final Executor zzc;

    public zzdjq(x xVar, InterfaceC1436a interfaceC1436a, Executor executor) {
        this.zza = xVar;
        this.zzb = interfaceC1436a;
        this.zzc = executor;
    }

    public static Bitmap zza(zzdjq zzdjqVar, double d7, boolean z4, zzaox zzaoxVar) {
        byte[] bArr = zzaoxVar.zzb;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDensity = (int) (d7 * 160.0d);
        if (!z4) {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        zzbbp zzbbpVar = zzbby.zzgd;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zzdjqVar.zzc(bArr, options);
            options.inJustDecodeBounds = false;
            int i7 = options.outWidth * options.outHeight;
            if (i7 > 0) {
                options.inSampleSize = 1 << ((33 - Integer.numberOfLeadingZeros((i7 - 1) / ((Integer) c0254t.f2726c.zzb(zzbby.zzge)).intValue())) / 2);
            }
        }
        return zzdjqVar.zzc(bArr, options);
    }

    private final Bitmap zzc(byte[] bArr, BitmapFactory.Options options) {
        ((m3.b) this.zzb).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ((m3.b) this.zzb).getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z4 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder g3 = AbstractC1663a.g("Decoded image w: ", width, " h:", height, " bytes: ");
            g3.append(allocationByteCount);
            g3.append(" time: ");
            g3.append(j);
            g3.append(" on ui thread: ");
            g3.append(z4);
            J.k(g3.toString());
        }
        return decodeByteArray;
    }

    public final I3.b zzb(String str, final double d7, final boolean z4) {
        this.zza.getClass();
        zzbzf zzbzfVar = new zzbzf();
        x.f3655a.zza(new w(str, zzbzfVar));
        return zzgbc.zzm(zzbzfVar, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdjp
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzdjq.zza(zzdjq.this, d7, z4, (zzaox) obj);
            }
        }, this.zzc);
    }
}
