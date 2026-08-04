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

/* JADX INFO: loaded from: classes.dex */
public final class zzdjq {
    private final x zza;
    private final p090m3.a zzb;
    private final Executor zzc;

    public zzdjq(x xVar, p090m3.a aVar, Executor executor) {
        this.zza = xVar;
        this.zzb = aVar;
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
        ((p090m3.b) this.zzb).getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        ((p090m3.b) this.zzb).getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        if (bitmapDecodeByteArray != null) {
            long j = jElapsedRealtime2 - jElapsedRealtime;
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            int allocationByteCount = bitmapDecodeByteArray.getAllocationByteCount();
            boolean z4 = Looper.getMainLooper().getThread() == Thread.currentThread();
            StringBuilder sbG = p150v0.a.g("Decoded image w: ", width, " h:", height, " bytes: ");
            sbG.append(allocationByteCount);
            sbG.append(" time: ");
            sbG.append(j);
            sbG.append(" on ui thread: ");
            sbG.append(z4);
            J.k(sbG.toString());
        }
        return bitmapDecodeByteArray;
    }

    public final I3.b zzb(String str, final double d7, final boolean z4) {
        this.zza.getClass();
        zzbzf zzbzfVar = new zzbzf();
        x.f3655a.zza(new w(str, zzbzfVar));
        return zzgbc.zzm(zzbzfVar, new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdjp
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                return zzdjq.zza(this.zza, d7, z4, (zzaox) obj);
            }
        }, this.zzc);
    }
}
