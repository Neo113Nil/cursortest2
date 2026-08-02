package p000;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: gc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0244gc implements b21 {

    /* JADX INFO: renamed from: k */
    public static final ru0 f2689k = ru0.m4406a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: l */
    public static final ru0 f2690l = new ru0("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, ru0.f6969e);

    /* JADX INFO: renamed from: j */
    public final nk0 f2691j;

    public C0244gc(nk0 nk0Var) {
        this.f2691j = nk0Var;
    }

    @Override // p000.InterfaceC0670rw
    /* JADX INFO: renamed from: g */
    public final boolean mo2024g(Object obj, File file, uu0 uu0Var) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((v11) obj).get();
        ru0 ru0Var = f2690l;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) uu0Var.m4955c(ru0Var);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = hk0.f3252b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) uu0Var.m4955c(f2689k)).intValue();
        OutputStream c0761uc = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    nk0 nk0Var = this.f2691j;
                    if (nk0Var != null) {
                        try {
                            c0761uc = new C0761uc(fileOutputStream, nk0Var);
                        } catch (IOException e) {
                            e = e;
                            c0761uc = fileOutputStream;
                            if (Log.isLoggable("BitmapEncoder", 3)) {
                                Log.d("BitmapEncoder", "Failed to encode Bitmap", e);
                            }
                            if (c0761uc != null) {
                                try {
                                    c0761uc.close();
                                } catch (IOException unused) {
                                }
                            }
                            z = false;
                        } catch (Throwable th) {
                            th = th;
                            c0761uc = fileOutputStream;
                            if (c0761uc != null) {
                                try {
                                    c0761uc.close();
                                } catch (IOException unused2) {
                                }
                            }
                            throw th;
                        }
                    } else {
                        c0761uc = fileOutputStream;
                    }
                    bitmap.compress(compressFormat, iIntValue, c0761uc);
                    c0761uc.close();
                    try {
                        c0761uc.close();
                    } catch (IOException unused3) {
                    }
                    z = true;
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e2) {
                e = e2;
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                Log.v("BitmapEncoder", "Compressed with type: " + compressFormat + " of size " + zg1.m5896g(bitmap) + " in " + hk0.m2289a(jElapsedRealtimeNanos) + ", options format: " + uu0Var.m4955c(ru0Var) + ", hasAlpha: " + bitmap.hasAlpha());
            }
            return z;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // p000.b21
    /* JADX INFO: renamed from: l */
    public final int mo584l(uu0 uu0Var) {
        return 2;
    }
}
