package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgfb extends com.google.android.gms.internal.ads.zzget {
    private final java.util.concurrent.ExecutorService zzb;
    private final com.google.android.gms.internal.ads.zzgfa zzc;
    private final com.google.android.gms.internal.ads.zzgta zzd;

    public zzgfb(java.io.File file, java.util.concurrent.ExecutorService executorService, com.google.android.gms.internal.ads.zzgfa zzgfaVar, com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        super(file);
        this.zzb = executorService;
        this.zzc = zzgfaVar;
        this.zzd = zzgtaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final com.google.common.util.concurrent.ListenableFuture zzb() {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgey
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                return com.google.android.gms.internal.ads.zzgfb.this.zzd();
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final com.google.common.util.concurrent.ListenableFuture zzc(final java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzhbw.zzd(new java.util.concurrent.Callable() { // from class: com.google.android.gms.internal.ads.zzgex
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ java.lang.Object call() {
                com.google.android.gms.internal.ads.zzgfb.this.zze(obj);
                return null;
            }
        }, this.zzb);
    }

    final /* synthetic */ java.lang.Object zzd() {
        java.lang.Object apply;
        synchronized (this) {
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(this.zza);
                try {
                    apply = this.zzc.zzb(fileInputStream);
                    fileInputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (com.google.android.gms.internal.ads.zzgew e) {
                apply = this.zzd.apply(e);
            } catch (java.io.FileNotFoundException unused) {
                apply = this.zzc.zzc();
            } catch (java.io.IOException e2) {
                apply = this.zzd.apply(new com.google.android.gms.internal.ads.zzgew(e2));
            }
        }
        return apply;
    }

    final /* synthetic */ java.lang.Void zze(java.lang.Object obj) {
        synchronized (this) {
            java.io.File file = this.zza;
            com.google.android.gms.internal.ads.zzgzt.zzb(file);
            java.lang.String parent = file.getParent();
            java.lang.String name = file.getName();
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(name).length() + 5);
            sb.append(name);
            sb.append(".temp");
            java.io.File file2 = new java.io.File(parent, sb.toString());
            try {
                java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                try {
                    this.zzc.zza(obj, fileOutputStream);
                    fileOutputStream.close();
                    if (!file2.renameTo(this.zza)) {
                        throw new java.io.IOException("Failed to rename file.");
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        fileOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e) {
                file2.delete();
                throw e;
            }
        }
        return null;
    }
}
