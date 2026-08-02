package b7;

import android.os.SystemClock;
import c9.C5769a;
import com.google.android.gms.internal.mlkit_vision_text_common.zzu;
import java.util.UUID;
import org.joda.time.format.m;
import org.joda.time.format.n;

/* loaded from: classes9.dex */
public final class d implements InterfaceC5572a, zzu {

    /* renamed from: a, reason: collision with root package name */
    private static m f55578a;

    /* renamed from: b, reason: collision with root package name */
    private static String f55579b;

    /* renamed from: c, reason: collision with root package name */
    private static long f55580c;

    public static void a() {
        f55579b = null;
        f55580c = 0L;
    }

    public static long b() {
        return f55580c;
    }

    public static String c() {
        return f55579b;
    }

    public static void d() {
        f55579b = UUID.randomUUID().toString();
        f55580c = SystemClock.elapsedRealtimeNanos();
    }

    public static m e() {
        if (f55578a == null) {
            n nVar = new n();
            nVar.e("P");
            nVar.o();
            nVar.m("Y");
            nVar.g();
            nVar.m("M");
            nVar.n();
            nVar.m("W");
            nVar.b();
            nVar.m("D");
            nVar.l();
            nVar.d();
            nVar.m("H");
            nVar.f();
            nVar.m("M");
            nVar.i();
            nVar.m("S");
            f55578a = nVar.t();
        }
        return f55578a;
    }

    @Override // b7.InterfaceC5572a
    public long t() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_common.zzu
    public Object zza(Object obj) {
        return ((C5769a.e) obj).c();
    }
}
