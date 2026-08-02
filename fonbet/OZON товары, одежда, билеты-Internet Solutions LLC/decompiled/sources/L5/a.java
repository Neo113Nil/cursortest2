package L5;

import androidx.annotation.NonNull;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* loaded from: classes8.dex */
public final class a implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final HttpURLConnection f16557a;

    public a(@NonNull HttpURLConnection httpURLConnection) {
        this.f16557a = httpURLConnection;
    }

    @NonNull
    public final InputStream c() throws IOException {
        return this.f16557a.getInputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f16557a.disconnect();
    }

    public final String d() {
        return this.f16557a.getContentType();
    }

    public final String j() {
        HttpURLConnection httpURLConnection = this.f16557a;
        try {
            if (k()) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to fetch ");
            sb2.append(httpURLConnection.getURL());
            sb2.append(". Failed with ");
            sb2.append(httpURLConnection.getResponseCode());
            sb2.append("\n");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb3.append(readLine);
                        sb3.append('\n');
                    } else {
                        try {
                            break;
                        } catch (Exception unused) {
                        }
                    }
                } finally {
                    try {
                        bufferedReader.close();
                    } catch (Exception unused2) {
                    }
                }
            }
            sb2.append(sb3.toString());
            return sb2.toString();
        } catch (IOException e11) {
            O5.c.d("get error failed ", e11);
            return e11.getMessage();
        }
    }

    public final boolean k() {
        try {
            return this.f16557a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }
}
