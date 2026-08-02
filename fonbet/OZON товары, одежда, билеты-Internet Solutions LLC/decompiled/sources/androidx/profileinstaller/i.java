package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.os.Build;
import androidx.annotation.NonNull;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.c<c> f44640a = androidx.concurrent.futures.c.m();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f44641b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static c f44642c = null;

    /* loaded from: classes8.dex */
    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* loaded from: classes8.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final int f44643a;

        /* renamed from: b, reason: collision with root package name */
        final int f44644b;

        /* renamed from: c, reason: collision with root package name */
        final long f44645c;

        /* renamed from: d, reason: collision with root package name */
        final long f44646d;

        b(int i11, int i12, long j11, long j12) {
            this.f44643a = i11;
            this.f44644b = i12;
            this.f44645c = j11;
            this.f44646d = j12;
        }

        static b a(@NonNull File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        final void b(@NonNull File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f44643a);
                dataOutputStream.writeInt(this.f44644b);
                dataOutputStream.writeLong(this.f44645c);
                dataOutputStream.writeLong(this.f44646d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f44644b == bVar.f44644b && this.f44645c == bVar.f44645c && this.f44643a == bVar.f44643a && this.f44646d == bVar.f44646d) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f44644b), Long.valueOf(this.f44645c), Integer.valueOf(this.f44643a), Long.valueOf(this.f44646d));
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final int f44647a;

        c(int i11) {
            this.f44647a = i11;
        }

        public final int a() {
            return this.f44647a;
        }
    }

    @NonNull
    public static androidx.concurrent.futures.c a() {
        return f44640a;
    }

    private static long b(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c c(int i11) {
        c cVar = new c(i11);
        f44642c = cVar;
        f44640a.j(cVar);
        return f44642c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:23|(1:92)(1:27)|28|(1:91)(1:32)|33|34|35|(2:75|76)(1:37)|38|(9:45|(1:49)|(1:56)|57|(2:65|66)|61|62|63|64)|(1:72)(1:(1:74))|(1:49)|(3:51|54|56)|57|(1:59)|65|66|61|62|63|64) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fb, code lost:
    
        r14 = 196608;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c8, code lost:
    
        r5 = 327680;
     */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static void d(@NonNull Context context, boolean z11) {
        boolean z12;
        b a11;
        b bVar;
        int i11;
        if (z11 || f44642c == null) {
            synchronized (f44641b) {
                if (!z11) {
                    if (f44642c != null) {
                        return;
                    }
                }
                int i12 = 0;
                try {
                    AssetFileDescriptor openFd = context.getAssets().openFd("dexopt/baseline.prof");
                    try {
                        z12 = openFd.getLength() > 0;
                        openFd.close();
                    } finally {
                    }
                } catch (IOException unused) {
                    z12 = false;
                }
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 28 && i13 != 30) {
                    File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length = file.length();
                    boolean z13 = file.exists() && length > 0;
                    File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    long length2 = file2.length();
                    boolean z14 = file2.exists() && length2 > 0;
                    try {
                        long b11 = b(context);
                        File file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                a11 = b.a(file3);
                            } catch (IOException unused2) {
                                c(131072);
                                return;
                            }
                        } else {
                            a11 = null;
                        }
                        if (a11 != null && a11.f44645c == b11 && (i11 = a11.f44644b) != 2) {
                            i12 = i11;
                            if (z11 && z14 && i12 != 1) {
                                i12 = 2;
                            }
                            if (a11 != null && a11.f44644b == 2 && i12 == 1 && length < a11.f44646d) {
                                i12 = 3;
                            }
                            int i14 = i12;
                            bVar = new b(1, i14, b11, length2);
                            if (a11 != null || !a11.equals(bVar)) {
                                bVar.b(file3);
                            }
                            c(i14);
                            return;
                        }
                        if (z13) {
                            i12 = 1;
                        } else if (z14) {
                            i12 = 2;
                        }
                        if (z11) {
                            i12 = 2;
                        }
                        if (a11 != null) {
                            i12 = 3;
                        }
                        int i142 = i12;
                        bVar = new b(1, i142, b11, length2);
                        if (a11 != null) {
                        }
                        bVar.b(file3);
                        c(i142);
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        c(65536);
                        return;
                    }
                }
                c(262144);
            }
        }
    }
}
