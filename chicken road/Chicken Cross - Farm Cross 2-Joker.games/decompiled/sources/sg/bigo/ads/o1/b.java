package sg.bigo.ads.o1;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.ironsource.C4761z5;
import java.io.BufferedOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.regex.Pattern;
import sg.bigo.ads.K0.I;
import sg.bigo.ads.f0.C5115b;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.p1.a f13225a;
    public final Object b = new Object();
    public final Object c = new Object();
    public volatile boolean d;
    public final C5115b e;
    public final sg.bigo.ads.p1.a f;

    public b(C5115b c5115b) {
        this.e = c5115b;
        sg.bigo.ads.p1.a aVar = new sg.bigo.ads.p1.a(c5115b);
        this.f = aVar;
        this.f13225a = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(a aVar, Socket socket) {
        String str;
        sg.bigo.ads.p1.a aVar2;
        boolean z;
        String str2;
        String str3;
        String str4;
        MimeTypeMap singleton;
        String fileExtensionFromUrl;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        String str5 = aVar.f13224a;
        Pattern pattern = I.f12345a;
        try {
            str5 = URLDecoder.decode(str5, C4761z5.O);
        } catch (UnsupportedEncodingException e) {
            AbstractC5496a.a("StringUtils", "Error decoding url, error message is : " + e.toString());
        }
        try {
            singleton = MimeTypeMap.getSingleton();
            fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str5);
        } catch (Throwable unused) {
        }
        if (TextUtils.isEmpty(fileExtensionFromUrl)) {
            str = null;
            boolean isEmpty = TextUtils.isEmpty(str);
            aVar2 = this.f;
            synchronized (aVar2) {
                z = aVar2.c.j == 3;
            }
            long a2 = z ? this.f.a() : this.f.c.i;
            boolean z2 = a2 >= 0;
            boolean z3 = aVar.c;
            long j = z3 ? a2 - aVar.b : a2;
            boolean z4 = z2 && z3;
            StringBuilder append = new StringBuilder().append(aVar.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n").append("Accept-Ranges: bytes\n");
            if (z2) {
                Locale locale = Locale.US;
                str2 = "Content-Length: " + j + "\n";
            } else {
                str2 = "";
            }
            StringBuilder append2 = append.append(str2);
            if (z4) {
                long j2 = aVar.b;
                Locale locale2 = Locale.US;
                str3 = "Content-Range: bytes " + j2 + "-" + (a2 - 1) + "/" + a2 + "\n";
            } else {
                str3 = "";
            }
            StringBuilder append3 = append2.append(str3);
            if (isEmpty) {
                str4 = "";
            } else {
                Locale locale3 = Locale.US;
                str4 = "Content-Type: " + str + "\n";
            }
            bufferedOutputStream.write(append3.append(str4).append("\n").toString().getBytes("UTF-8"));
            a(bufferedOutputStream, aVar.b);
            return;
        }
        str = singleton.getMimeTypeFromExtension(fileExtensionFromUrl);
        boolean isEmpty2 = TextUtils.isEmpty(str);
        aVar2 = this.f;
        synchronized (aVar2) {
        }
    }

    public final void b() {
        synchronized (this.b) {
            try {
                Thread.currentThread().getName();
                String str = this.e.b;
                this.b.wait(1000L);
            } catch (InterruptedException e) {
                AbstractC5496a.a("ProxyCache", "Waiting source data is interrupted!" + e.toString());
            }
        }
    }

    public final void a(BufferedOutputStream bufferedOutputStream, long j) {
        int i;
        boolean z;
        byte[] bArr = new byte[8192];
        Thread.currentThread().getName();
        while (true) {
            if (j >= 0) {
                int i2 = 0;
                do {
                    sg.bigo.ads.p1.a aVar = this.f13225a;
                    synchronized (aVar) {
                        z = aVar.c.j == 3;
                    }
                    if (z || this.f13225a.a() >= 8192 + j || this.d) {
                        i = this.f13225a.a(bArr, j);
                    } else {
                        i2++;
                        b();
                    }
                } while (i2 < 15);
                AbstractC5496a.a("ProxyCache", "wait for downloading more than 15s.");
                throw new l("Error reading source " + i2 + " times");
            }
            AbstractC5496a.a("ProxyCache", "buffer or offset or length is wrong");
            i = 0;
            if (i == -1) {
                Thread.currentThread().getName();
                bufferedOutputStream.flush();
                return;
            } else {
                bufferedOutputStream.write(bArr, 0, i);
                j += i;
            }
        }
    }

    public final void a() {
        synchronized (this.c) {
            this.d = true;
            this.f13225a.b();
        }
    }
}
