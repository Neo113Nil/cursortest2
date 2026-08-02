package c5;

import A5.f;
import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import w5.C1782b;
import w5.InterfaceC1783c;

/* loaded from: classes2.dex */
public class c implements q, InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public s f10444a;

    /* renamed from: b, reason: collision with root package name */
    public C0820a f10445b;

    /* renamed from: c, reason: collision with root package name */
    public HandlerThread f10446c;

    /* renamed from: d, reason: collision with root package name */
    public Handler f10447d;

    public static String a(c cVar, o oVar) {
        cVar.getClass();
        return ((String) cVar.f10445b.f10435c) + "_" + ((String) ((Map) oVar.f677b).get("key"));
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        f fVar = c1782b.f18077c;
        Context context = c1782b.f18075a;
        try {
            C0820a c0820a = new C0820a();
            c0820a.f10435c = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
            c0820a.f10436d = "FlutterSecureStorage";
            c0820a.f10441i = Boolean.FALSE;
            c0820a.f10434b = context.getApplicationContext();
            c0820a.f10433a = StandardCharsets.UTF_8;
            this.f10445b = c0820a;
            HandlerThread handlerThread = new HandlerThread("com.it_nomads.fluttersecurestorage.worker");
            this.f10446c = handlerThread;
            handlerThread.start();
            this.f10447d = new Handler(this.f10446c.getLooper());
            s sVar = new s(fVar, "plugins.it_nomads.com/flutter_secure_storage");
            this.f10444a = sVar;
            sVar.b(this);
        } catch (Exception e7) {
            Log.e("FlutterSecureStoragePl", "Registration failed", e7);
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        if (this.f10444a != null) {
            this.f10446c.quitSafely();
            this.f10446c = null;
            this.f10444a.b(null);
            this.f10444a = null;
        }
        this.f10445b = null;
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        this.f10447d.post(new H2.q(12, this, oVar, new p((p) rVar), false));
    }
}
