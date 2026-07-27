package sg.bigo.ads.o1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import sg.bigo.ads.q0.ThreadFactoryC5440d;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f13234a = Executors.newSingleThreadExecutor(new ThreadFactoryC5440d("Ping", false));
    public final String b = "127.0.0.1";
    public final int c;

    public k(int i) {
        this.c = i;
    }

    public static void a(Socket socket) {
        try {
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write("HTTP/1.1 200 OK\n\n".getBytes());
            outputStream.write("ping ok".getBytes());
        } catch (IOException e) {
            AbstractC5496a.a("ProxyCache", "Pinger#responseToPing, error message is : " + e.toString());
        }
    }
}
