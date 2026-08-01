package sg.bigo.ads.o1;

import io.ktor.sse.ServerSentEventKt;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class j implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f13233a;

    public j(k kVar) {
        this.f13233a = kVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        k kVar = this.f13233a;
        kVar.getClass();
        Locale locale = Locale.US;
        i iVar = new i("http://" + kVar.b + ServerSentEventKt.COLON + kVar.c + "/ping");
        try {
            byte[] bytes = "ping ok".getBytes();
            iVar.b();
            byte[] bArr = new byte[bytes.length];
            iVar.a(bArr);
            boolean equals = Arrays.equals(bytes, bArr);
            new String(bArr);
            iVar.a();
            return Boolean.valueOf(equals);
        } catch (Throwable th) {
            iVar.a();
            throw th;
        }
    }
}
