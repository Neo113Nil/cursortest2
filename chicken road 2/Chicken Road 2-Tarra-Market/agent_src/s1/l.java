package s1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f6634a = Logger.getLogger(l.class.getName());

    public static a a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        i1.t tVar = new i1.t(2, socket);
        OutputStream outputStream = socket.getOutputStream();
        if (outputStream != null) {
            return new a(tVar, new a(tVar, outputStream, 1), 0);
        }
        throw new IllegalArgumentException("out == null");
    }

    public static b b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        i1.t tVar = new i1.t(2, socket);
        InputStream inputStream = socket.getInputStream();
        if (inputStream != null) {
            return new b(tVar, new b(tVar, inputStream));
        }
        throw new IllegalArgumentException("in == null");
    }
}
