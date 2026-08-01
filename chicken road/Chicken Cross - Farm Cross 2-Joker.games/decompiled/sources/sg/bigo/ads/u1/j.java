package sg.bigo.ads.u1;

import com.ironsource.U3;
import io.ktor.sse.ServerSentEventKt;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f13342a = new ConcurrentHashMap();
    public final String b;

    public j(String str) {
        this.b = str;
    }

    public final void a(String str, String str2) {
        if (I.a((CharSequence) str) || I.a((CharSequence) str2)) {
            return;
        }
        this.f13342a.put(str, str2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("eventId = ");
        sb.append(this.b).append(ServerSentEventKt.COLON);
        for (Map.Entry entry : this.f13342a.entrySet()) {
            sb.append((String) entry.getKey()).append(U3.j.b).append((String) entry.getValue()).append(",");
        }
        return sb.toString();
    }
}
