package L5;

import B0.A0;
import B5.C2598b;
import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final C2598b f16558a;

    public d(@NonNull C2598b c2598b) {
        this.f16558a = c2598b;
    }

    private static String b(String str, c cVar, boolean z11) {
        String str2 = z11 ? ".temp" + cVar.extension : cVar.extension;
        String replaceAll = str.replaceAll("\\W+", "");
        int length = 242 - str2.length();
        if (replaceAll.length() > length) {
            try {
                byte[] digest = MessageDigest.getInstance("MD5").digest(replaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b11 : digest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b11)));
                }
                replaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                replaceAll = replaceAll.substring(0, length);
            }
        }
        return A0.b("lottie_cache_", replaceAll, str2);
    }

    private File c() {
        C2598b c2598b = this.f16558a;
        c2598b.getClass();
        File file = new File(((Context) c2598b.f2725a).getCacheDir(), "lottie_network_cache");
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    final Pair<c, InputStream> a(String str) {
        try {
            File c11 = c();
            c cVar = c.JSON;
            File file = new File(c11, b(str, cVar, false));
            if (!file.exists()) {
                file = new File(c(), b(str, c.ZIP, false));
                if (!file.exists()) {
                    file = null;
                }
            }
            if (file == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            if (file.getAbsolutePath().endsWith(".zip")) {
                cVar = c.ZIP;
            }
            file.getAbsolutePath();
            O5.c.a();
            return new Pair<>(cVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    final void d(String str, c cVar) {
        File file = new File(c(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        file2.toString();
        O5.c.a();
        if (renameTo) {
            return;
        }
        O5.c.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    final File e(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(c(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }
}
