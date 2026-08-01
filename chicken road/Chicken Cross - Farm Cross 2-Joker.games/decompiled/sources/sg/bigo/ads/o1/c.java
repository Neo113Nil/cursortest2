package sg.bigo.ads.o1;

import android.text.TextUtils;
import com.ironsource.C4761z5;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLDecoder;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class c implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final Socket f13226a;
    public final /* synthetic */ e b;

    public c(e eVar, Socket socket) {
        this.b = eVar;
        this.f13226a = socket;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        a a2;
        e eVar = this.b;
        Socket socket = this.f13226a;
        eVar.getClass();
        try {
            try {
                a2 = a.a(socket.getInputStream());
            } finally {
                e.a(socket);
                eVar.a();
            }
        } catch (SocketException unused) {
            str = "Closing socket… Socket is closed by client.";
            AbstractC5496a.a("ProxyCache", str);
        } catch (IOException e) {
            e = e;
            str = "Error processing request, error message is : " + e.toString();
            AbstractC5496a.a("ProxyCache", str);
        } catch (l e2) {
            e = e2;
            str = "Error processing request, error message is : " + e.toString();
            AbstractC5496a.a("ProxyCache", str);
        }
        if (a2 == null) {
            return;
        }
        a2.toString();
        String str2 = a2.f13224a;
        Pattern pattern = I.f12345a;
        try {
            str2 = URLDecoder.decode(str2, C4761z5.O);
        } catch (UnsupportedEncodingException e3) {
            AbstractC5496a.a("StringUtils", "Error decoding url, error message is : " + e3.toString());
        }
        eVar.f.getClass();
        if ("ping".equals(str2)) {
            eVar.f.getClass();
            k.a(socket);
        } else if (!TextUtils.isEmpty(str2)) {
            eVar.a(str2).a(a2, socket);
        }
    }
}
