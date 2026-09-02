package H0;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import g0.f;
import g0.i;
import i1.s;
import java.io.Serializable;
import java.net.ProtocolException;
import s0.d;

/* loaded from: classes.dex */
public final class b implements i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179a;

    /* renamed from: b, reason: collision with root package name */
    public final int f180b;

    /* renamed from: c, reason: collision with root package name */
    public Object f181c;

    /* renamed from: d, reason: collision with root package name */
    public Object f182d;

    public /* synthetic */ b(Object obj, int i2, Serializable serializable, int i3) {
        this.f179a = i3;
        this.f181c = obj;
        this.f180b = i2;
        this.f182d = serializable;
    }

    public static b f(String str) {
        int i2;
        String str2;
        boolean startsWith = str.startsWith("HTTP/1.");
        s sVar = s.HTTP_1_0;
        if (startsWith) {
            i2 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt != 0) {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                sVar = s.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: ".concat(str));
            }
            i2 = 4;
        }
        int i3 = i2 + 3;
        if (str.length() < i3) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i2, i3));
            if (str.length() <= i3) {
                str2 = "";
            } else {
                if (str.charAt(i3) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(str));
                }
                str2 = str.substring(i2 + 4);
            }
            return new b(sVar, parseInt, str2, 3);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(str));
        }
    }

    @Override // g0.i
    public void b() {
        HandlerThread handlerThread = new HandlerThread("Sqflite", this.f180b);
        this.f181c = handlerThread;
        handlerThread.start();
        this.f182d = new Handler(((HandlerThread) this.f181c).getLooper());
    }

    @Override // g0.i
    public void c() {
        HandlerThread handlerThread = (HandlerThread) this.f181c;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f181c = null;
            this.f182d = null;
        }
    }

    @Override // g0.i
    public void d(f fVar) {
        ((Handler) this.f182d).post(fVar.f1090b);
    }

    public int e() {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            return 2;
        }
        d dVar = (d) this.f181c;
        int i2 = this.f180b;
        View findViewById = dVar.findViewById(i2);
        if (findViewById != null) {
            contentSensitivity = findViewById.getContentSensitivity();
            return contentSensitivity;
        }
        throw new IllegalArgumentException("FlutterView with ID " + i2 + "not found");
    }

    public void g(int i2) {
        int contentSensitivity;
        if (Build.VERSION.SDK_INT < 35) {
            throw new IllegalStateException("isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.");
        }
        d dVar = (d) this.f181c;
        int i3 = this.f180b;
        View findViewById = dVar.findViewById(i3);
        if (findViewById == null) {
            throw new IllegalArgumentException("FlutterView with ID " + i3 + "not found");
        }
        contentSensitivity = findViewById.getContentSensitivity();
        if (contentSensitivity == i2) {
            return;
        }
        findViewById.setContentSensitivity(i2);
        findViewById.invalidate();
    }

    public String toString() {
        switch (this.f179a) {
            case 3:
                StringBuilder sb = new StringBuilder();
                sb.append(((s) this.f181c) == s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
                sb.append(' ');
                sb.append(this.f180b);
                String str = (String) this.f182d;
                if (str != null) {
                    sb.append(' ');
                    sb.append(str);
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public b(int i2, d dVar, C0.a aVar) {
        this.f179a = 0;
        this.f181c = dVar;
        this.f180b = i2;
        this.f182d = aVar;
        aVar.f51b = this;
    }

    public b(int i2) {
        this.f179a = 1;
        this.f180b = i2;
    }
}
