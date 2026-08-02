package okio;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class z {
    public static final E a(J j) {
        Intrinsics.checkNotNullParameter(j, "<this>");
        return new E(j);
    }

    public static final F b(K k) {
        Intrinsics.checkNotNullParameter(k, "<this>");
        return new F(k);
    }

    public static final J c(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        okio.internal.o oVar = new okio.internal.o(socket);
        OutputStream outputStream = socket.getOutputStream();
        Intrinsics.checkNotNullExpressionValue(outputStream, "getOutputStream(...)");
        return oVar.sink(new B(outputStream, oVar));
    }

    public static final t d(InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        return new t(inputStream, new L());
    }

    public static final K e(Socket socket) throws IOException {
        Intrinsics.checkNotNullParameter(socket, "<this>");
        okio.internal.o oVar = new okio.internal.o(socket);
        InputStream inputStream = socket.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        return oVar.source(new t(inputStream, oVar));
    }
}
