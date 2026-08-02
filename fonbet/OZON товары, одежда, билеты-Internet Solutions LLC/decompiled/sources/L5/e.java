package L5;

import B5.g;
import B5.w;
import android.content.Context;
import android.util.Pair;
import androidx.annotation.NonNull;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final d f16559a;

    public e(d dVar, @NonNull b bVar) {
        this.f16559a = dVar;
    }

    @NonNull
    private w<g> b(Context context, @NonNull String str, @NonNull InputStream inputStream, String str2, String str3) throws IOException {
        w<g> o11;
        c cVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        d dVar = this.f16559a;
        if (contains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            O5.c.a();
            c cVar2 = c.ZIP;
            o11 = str3 != null ? com.airbnb.lottie.a.o(context, new ZipInputStream(new FileInputStream(dVar.e(str, inputStream, cVar2))), str) : com.airbnb.lottie.a.o(context, new ZipInputStream(inputStream), null);
            cVar = cVar2;
        } else {
            O5.c.a();
            cVar = c.JSON;
            o11 = str3 != null ? com.airbnb.lottie.a.g(new FileInputStream(dVar.e(str, inputStream, cVar).getAbsolutePath()), str) : com.airbnb.lottie.a.g(inputStream, null);
        }
        if (str3 != null && o11.b() != null) {
            dVar.d(str, cVar);
        }
        return o11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final w<g> a(Context context, @NonNull String str, String str2) {
        g gVar;
        Pair<c, InputStream> a11;
        AutoCloseable autoCloseable = null;
        if (str2 != null && (a11 = this.f16559a.a(str)) != null) {
            c cVar = (c) a11.first;
            InputStream inputStream = (InputStream) a11.second;
            w<g> o11 = cVar == c.ZIP ? com.airbnb.lottie.a.o(context, new ZipInputStream(inputStream), str2) : com.airbnb.lottie.a.g(inputStream, str2);
            if (o11.b() != null) {
                gVar = o11.b();
                if (gVar == null) {
                    return new w<>(gVar);
                }
                O5.c.a();
                O5.c.a();
                try {
                    try {
                        a a12 = b.a(str);
                        try {
                            if (!a12.k()) {
                                w<g> wVar = new w<>(new IllegalArgumentException(a12.j()));
                                a12.close();
                                return wVar;
                            }
                            w<g> b11 = b(context, str, a12.c(), a12.d(), str2);
                            b11.getClass();
                            O5.c.a();
                            a12.close();
                            return b11;
                        } catch (IOException e11) {
                            O5.c.d("LottieFetchResult close failed ", e11);
                            return context;
                        }
                    } catch (Exception e12) {
                        w<g> wVar2 = new w<>(e12);
                        if (0 != 0) {
                            try {
                                autoCloseable.close();
                            } catch (IOException e13) {
                                O5.c.d("LottieFetchResult close failed ", e13);
                            }
                        }
                        return wVar2;
                    }
                } finally {
                }
            }
        }
        gVar = null;
        if (gVar == null) {
        }
    }
}
