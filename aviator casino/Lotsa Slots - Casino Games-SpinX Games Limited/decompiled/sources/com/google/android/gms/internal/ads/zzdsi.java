package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdsi {
    private final com.google.android.gms.ads.internal.util.zzbl zza;
    private final com.google.android.gms.common.util.Clock zzb;
    private final java.util.concurrent.Executor zzc;

    public zzdsi(com.google.android.gms.ads.internal.util.zzbl zzblVar, com.google.android.gms.common.util.Clock clock, java.util.concurrent.Executor executor) {
        this.zza = zzblVar;
        this.zzb = clock;
        this.zzc = executor;
    }

    private final android.graphics.Bitmap zzd(byte[] bArr, double d, boolean z) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inDensity = (int) (d * 160.0d);
        if (!z) {
            options.inPreferredConfig = android.graphics.Bitmap.Config.RGB_565;
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhd)).booleanValue()) {
            options.inJustDecodeBounds = true;
            zze(bArr, options);
            options.inJustDecodeBounds = false;
            int i = options.outWidth * options.outHeight;
            if (i > 0) {
                options.inSampleSize = 1 << ((33 - java.lang.Integer.numberOfLeadingZeros((i - 1) / ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhe)).intValue())) / 2);
            }
        }
        return zze(bArr, options);
    }

    private final android.graphics.Bitmap zze(byte[] bArr, android.graphics.BitmapFactory.Options options) {
        com.google.android.gms.common.util.Clock clock = this.zzb;
        long elapsedRealtime = clock.elapsedRealtime();
        android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        long elapsedRealtime2 = clock.elapsedRealtime();
        if (decodeByteArray != null) {
            long j = elapsedRealtime2 - elapsedRealtime;
            int width = decodeByteArray.getWidth();
            int height = decodeByteArray.getHeight();
            int allocationByteCount = decodeByteArray.getAllocationByteCount();
            boolean z = android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(width).length() + 20 + java.lang.String.valueOf(height).length() + 8 + java.lang.String.valueOf(allocationByteCount).length() + 7 + java.lang.String.valueOf(j).length() + 15 + java.lang.String.valueOf(z).length());
            sb.append("Decoded image w: ");
            sb.append(width);
            sb.append(" h:");
            sb.append(height);
            sb.append(" bytes: ");
            sb.append(allocationByteCount);
            sb.append(" time: ");
            sb.append(j);
            sb.append(" on ui thread: ");
            sb.append(z);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
        return decodeByteArray;
    }

    public final com.google.common.util.concurrent.ListenableFuture zza(final java.lang.String str, final double d, final boolean z) {
        return (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhf)).booleanValue() && str != null && str.startsWith("data:")) ? com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzdsi.this.zzc(str, d, z);
            }
        }, this.zzc) : com.google.android.gms.internal.ads.zzhbw.zzk(this.zza.zza(str), new com.google.android.gms.internal.ads.zzgta() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // com.google.android.gms.internal.ads.zzgta
            public final /* synthetic */ java.lang.Object apply(java.lang.Object obj) {
                return com.google.android.gms.internal.ads.zzdsi.this.zzb(d, z, (com.google.android.gms.internal.ads.zzata) obj);
            }
        }, this.zzc);
    }

    final /* synthetic */ android.graphics.Bitmap zzb(double d, boolean z, com.google.android.gms.internal.ads.zzata zzataVar) {
        return zzd(zzataVar.zzb, d, z);
    }

    final /* synthetic */ android.graphics.Bitmap zzc(java.lang.String str, double d, boolean z) {
        int indexOf = str.indexOf(",");
        if (indexOf == -1) {
            throw new java.lang.IllegalArgumentException("Bad data URL: no ',' found for base64 data");
        }
        if (!str.substring(0, indexOf).endsWith(";base64")) {
            throw new java.lang.IllegalArgumentException("Bad data URL: only base64 is supported");
        }
        int indexOf2 = str.indexOf(":");
        int indexOf3 = str.indexOf(";");
        if (indexOf2 == -1 || !str.substring(indexOf2 + 1, indexOf3).startsWith("image/")) {
            throw new java.lang.IllegalArgumentException("Bad data URL: only image media is supported");
        }
        return zzd(android.util.Base64.decode(str.substring(indexOf + 1), 0), d, z);
    }
}
