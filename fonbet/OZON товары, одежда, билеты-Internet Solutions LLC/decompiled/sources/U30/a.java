package U30;

import android.content.ContentResolver;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.Base64InputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface a {
    File a(@NotNull InputStream inputStream, d dVar, String str, @NotNull String str2);

    @NotNull
    String b(@NotNull String str);

    boolean c(@NotNull String str);

    String d(@NotNull File file, @NotNull String str);

    @NotNull
    String e();

    byte[] f(@NotNull ContentResolver contentResolver, @NotNull Uri uri) throws IOException;

    boolean g(long j11, @NotNull String str, boolean z11);

    @NotNull
    File h(@NotNull String str);

    void i(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull Bitmap bitmap);

    void j(@NotNull String str);

    boolean k(@NotNull Base64InputStream base64InputStream, @NotNull String str);

    Uri l(@NotNull String str, @NotNull byte[] bArr);

    @NotNull
    String m(@NotNull File file) throws FileNotFoundException, IOException;

    void n();

    Uri o(@NotNull Bitmap bitmap, @NotNull String str);

    @NotNull
    String p(String str, d dVar);

    boolean q(@NotNull InputStream inputStream, @NotNull OutputStream outputStream);

    Uri r(@NotNull Base64InputStream base64InputStream, @NotNull String str);
}
