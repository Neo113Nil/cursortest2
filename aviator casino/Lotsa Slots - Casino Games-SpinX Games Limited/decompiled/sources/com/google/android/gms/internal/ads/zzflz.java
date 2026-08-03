package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzflz {
    public static android.os.ParcelFileDescriptor zza(final java.io.InputStream inputStream) throws java.io.IOException {
        android.os.ParcelFileDescriptor[] createPipe = android.os.ParcelFileDescriptor.createPipe();
        android.os.ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
        final android.os.ParcelFileDescriptor parcelFileDescriptor2 = createPipe[1];
        com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzfly
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                android.os.ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor2;
                java.io.InputStream inputStream2 = inputStream;
                try {
                    try {
                        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor3);
                        try {
                            com.google.android.gms.common.util.IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.io.IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
