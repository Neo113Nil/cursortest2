package p019c5;

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
import p159w5.b;

/* JADX INFO: loaded from: classes2.dex */
public class c implements q, p159w5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f10444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HandlerThread f10446c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f10447d;

    public static String a(c cVar, o oVar) {
        cVar.getClass();
        return ((String) cVar.f10445b.f10435c) + "_" + ((String) ((Map) oVar.f677b).get("key"));
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        f fVar = bVar.f18083c;
        Context context = bVar.f18081a;
        try {
            a aVar = new a();
            aVar.f10435c = "VGhpcyBpcyB0aGUgcHJlZml4IGZvciBhIHNlY3VyZSBzdG9yYWdlCg";
            aVar.f10436d = "FlutterSecureStorage";
            aVar.f10441i = Boolean.FALSE;
            aVar.f10434b = context.getApplicationContext();
            aVar.f10433a = StandardCharsets.UTF_8;
            this.f10445b = aVar;
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

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
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
