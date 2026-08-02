package E;

import C.I;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes8.dex */
final class A implements N.o<a, I.h> {

    static abstract class a {
        a() {
        }

        @NonNull
        abstract I.g a();

        @NonNull
        abstract N.p<byte[]> b();
    }

    private static Uri b(@NonNull File file, @NonNull File file2) throws C.K {
        if (file2.exists()) {
            file2.delete();
        }
        if (file.renameTo(file2)) {
            return Uri.fromFile(file2);
        }
        throw new C.K("Failed to overwrite the file: " + file2.getAbsolutePath(), null);
    }

    @NonNull
    public final Object a(@NonNull Object obj) throws C.K {
        File createTempFile;
        a aVar = (a) obj;
        N.p<byte[]> b11 = aVar.b();
        I.g a11 = aVar.a();
        try {
            File a12 = a11.a();
            if (a12 != null) {
                String parent = a12.getParent();
                StringBuilder sb2 = new StringBuilder("CameraX");
                sb2.append(UUID.randomUUID().toString());
                String name = a12.getName();
                int lastIndexOf = name.lastIndexOf(46);
                sb2.append(lastIndexOf >= 0 ? name.substring(lastIndexOf) : "");
                createTempFile = new File(parent, sb2.toString());
            } else {
                createTempFile = File.createTempFile("CameraX", ".tmp");
            }
            byte[] c11 = b11.c();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
                try {
                    fileOutputStream.write(c11, 0, new L.b().a(c11));
                    fileOutputStream.close();
                    G.h d11 = b11.d();
                    Objects.requireNonNull(d11);
                    int f7 = b11.f();
                    try {
                        G.h b12 = G.h.b(createTempFile);
                        d11.a(b12);
                        if (b12.e() == 0 && f7 != 0) {
                            b12.f(f7);
                        }
                        a11.b().getClass();
                        b12.g();
                        Uri uri = null;
                        try {
                            try {
                                if (a11.a() != null) {
                                    File a13 = a11.a();
                                    Objects.requireNonNull(a13);
                                    uri = b(createTempFile, a13);
                                }
                                createTempFile.delete();
                                return new I.h(uri);
                            } catch (Throwable th2) {
                                createTempFile.delete();
                                throw th2;
                            }
                        } catch (IOException unused) {
                            throw new C.K("Failed to write to OutputStream.", null);
                        }
                    } catch (IOException e11) {
                        throw new C.K("Failed to update Exif data", e11);
                    }
                } finally {
                }
            } catch (IOException e12) {
                throw new C.K("Failed to write to temp file", e12);
            }
        } catch (IOException e13) {
            throw new C.K("Failed to create temp file.", e13);
        }
    }
}
