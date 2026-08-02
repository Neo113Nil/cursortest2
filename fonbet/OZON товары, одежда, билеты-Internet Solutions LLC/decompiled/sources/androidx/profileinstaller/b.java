package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.profileinstaller.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final AssetManager f44616a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Executor f44617b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final g.b f44618c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f44619d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final File f44620e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final String f44621f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44622g = false;

    /* renamed from: h, reason: collision with root package name */
    private c[] f44623h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f44624i;

    public b(@NonNull AssetManager assetManager, @NonNull Executor executor, @NonNull g.b bVar, @NonNull String str, @NonNull File file) {
        byte[] bArr;
        this.f44616a = assetManager;
        this.f44617b = executor;
        this.f44618c = bVar;
        this.f44621f = str;
        this.f44620e = file;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 31) {
            switch (i11) {
                case TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER /* 26 */:
                    bArr = j.f44651d;
                    break;
                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                    bArr = j.f44650c;
                    break;
                case 28:
                case 29:
                case AppUpdateInfo.Factory.DAYS_BETWEEN_30 /* 30 */:
                    bArr = j.f44649b;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = j.f44648a;
        }
        this.f44619d = bArr;
    }

    private FileInputStream c(AssetManager assetManager, String str) throws IOException {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e11) {
            String message = e11.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f44618c.b();
            return null;
        }
    }

    private void e(int i11, Serializable serializable) {
        this.f44617b.execute(new H4.a(this, i11, serializable, 0));
    }

    public final boolean b() {
        if (this.f44619d == null) {
            e(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        File file = this.f44620e;
        if (!file.exists()) {
            try {
                if (!file.createNewFile()) {
                    e(4, null);
                    return false;
                }
            } catch (IOException unused) {
                e(4, null);
                return false;
            }
        } else if (!file.canWrite()) {
            e(4, null);
            return false;
        }
        this.f44622g = true;
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:5|(2:6|7)|8|9|(3:44|45|(4:47|48|49|50)(2:54|55))|11|(4:15|16|(3:23|24|(3:26|27|28)(2:29|30))(1:(1:19))|(1:21))) */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x005d, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x005e, code lost:
    
        r1.a(7, r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x002b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b d() {
        FileInputStream fileInputStream;
        c[] cVarArr;
        c[] cVarArr2;
        FileInputStream c11;
        AssetManager assetManager = this.f44616a;
        g.b bVar = this.f44618c;
        if (!this.f44622g) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        byte[] bArr = this.f44619d;
        if (bArr != null) {
            b bVar2 = null;
            try {
                try {
                    fileInputStream = c(assetManager, "dexopt/baseline.prof");
                } catch (FileNotFoundException e11) {
                    bVar.a(6, e11);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    cVarArr2 = this.f44623h;
                    if (cVarArr2 != null) {
                    }
                    return this;
                } catch (IOException e12) {
                    bVar.a(7, e12);
                    fileInputStream = null;
                    if (fileInputStream != null) {
                    }
                    cVarArr2 = this.f44623h;
                    if (cVarArr2 != null) {
                    }
                    return this;
                }
                if (fileInputStream != null) {
                    try {
                        try {
                        } catch (IOException e13) {
                            bVar.a(7, e13);
                            fileInputStream.close();
                            cVarArr = null;
                            this.f44623h = cVarArr;
                            cVarArr2 = this.f44623h;
                            if (cVarArr2 != null) {
                                try {
                                    c11 = c(assetManager, "dexopt/baseline.profm");
                                    if (c11 == null) {
                                    }
                                } catch (FileNotFoundException e14) {
                                    bVar.a(9, e14);
                                } catch (IOException e15) {
                                    bVar.a(7, e15);
                                } catch (IllegalStateException e16) {
                                    this.f44623h = null;
                                    bVar.a(8, e16);
                                }
                                if (bVar2 == null) {
                                }
                            }
                            return this;
                        }
                    } catch (IllegalStateException e17) {
                        bVar.a(8, e17);
                        fileInputStream.close();
                        cVarArr = null;
                        this.f44623h = cVarArr;
                        cVarArr2 = this.f44623h;
                        if (cVarArr2 != null) {
                        }
                        return this;
                    }
                    if (!Arrays.equals(h.f44638a, d.b(fileInputStream, 4))) {
                        throw new IllegalStateException("Invalid magic");
                    }
                    cVarArr = h.g(fileInputStream, d.b(fileInputStream, 4), this.f44621f);
                    this.f44623h = cVarArr;
                }
                cVarArr2 = this.f44623h;
                if (cVarArr2 != null && Build.VERSION.SDK_INT >= 31) {
                    c11 = c(assetManager, "dexopt/baseline.profm");
                    if (c11 == null) {
                        try {
                            if (!Arrays.equals(h.f44639b, d.b(c11, 4))) {
                                throw new IllegalStateException("Invalid magic");
                            }
                            this.f44623h = h.d(c11, d.b(c11, 4), bArr, cVarArr2);
                            c11.close();
                            bVar2 = this;
                        } catch (Throwable th2) {
                            try {
                                c11.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    } else if (c11 != null) {
                        c11.close();
                    }
                    if (bVar2 == null) {
                        return bVar2;
                    }
                }
            } finally {
                try {
                    fileInputStream.close();
                } catch (IOException e18) {
                    bVar.a(7, e18);
                }
            }
        }
        return this;
    }

    @NonNull
    public final void f() {
        byte[] bArr;
        ByteArrayOutputStream byteArrayOutputStream;
        g.b bVar = this.f44618c;
        c[] cVarArr = this.f44623h;
        if (cVarArr == null || (bArr = this.f44619d) == null) {
            return;
        }
        if (!this.f44622g) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byteArrayOutputStream.write(h.f44638a);
                byteArrayOutputStream.write(bArr);
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e11) {
            bVar.a(7, e11);
        } catch (IllegalStateException e12) {
            bVar.a(8, e12);
        }
        if (h.i(byteArrayOutputStream, bArr, cVarArr)) {
            this.f44624i = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            this.f44623h = null;
        } else {
            bVar.a(5, null);
            this.f44623h = null;
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        byte[] bArr = this.f44624i;
        if (bArr != null) {
            if (!this.f44622g) {
                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
            }
            try {
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(this.f44620e);
                        try {
                            FileChannel channel = fileOutputStream.getChannel();
                            try {
                                FileLock tryLock = channel.tryLock();
                                if (tryLock != null) {
                                    try {
                                        if (tryLock.isValid()) {
                                            byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_NONE];
                                            while (true) {
                                                int read = byteArrayInputStream.read(bArr2);
                                                if (read <= 0) {
                                                    e(1, null);
                                                    tryLock.close();
                                                    channel.close();
                                                    fileOutputStream.close();
                                                    byteArrayInputStream.close();
                                                    return true;
                                                }
                                                fileOutputStream.write(bArr2, 0, read);
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        try {
                            byteArrayInputStream.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                        throw th2;
                    }
                } catch (FileNotFoundException e11) {
                    e(6, e11);
                    return false;
                } catch (IOException e12) {
                    e(7, e12);
                    return false;
                }
            } finally {
                this.f44624i = null;
                this.f44623h = null;
            }
        }
        return false;
    }
}
