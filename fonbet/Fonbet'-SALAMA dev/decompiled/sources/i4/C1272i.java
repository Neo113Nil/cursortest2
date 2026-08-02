package i4;

import com.google.android.gms.common.internal.w;
import d6.C0977k;
import g4.C1142o;
import io.sentry.SentryReplayEvent;
import java.util.HashMap;
import n4.C1471e;
import n4.C1480n;

/* renamed from: i4.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1272i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f14000a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Y3.i f14001b;

    /* renamed from: c, reason: collision with root package name */
    public final C0977k f14002c;

    /* renamed from: d, reason: collision with root package name */
    public final w f14003d;

    public C1272i(Y3.i iVar, C1142o c1142o, C1142o c1142o2) {
        this.f14001b = iVar;
        this.f14002c = new C0977k(c1142o);
        this.f14003d = new w(c1142o2);
    }

    public final synchronized C1271h a(C1480n c1480n) {
        C1271h c1271h;
        try {
            c1271h = (C1271h) this.f14000a.get(c1480n);
            if (c1271h == null) {
                C1471e c1471e = new C1471e();
                c1471e.f15407h = 2;
                c1471e.j = SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE;
                c1471e.f15410l = false;
                Y3.i iVar = this.f14001b;
                iVar.b();
                if (!"[DEFAULT]".equals(iVar.f7664b)) {
                    Y3.i iVar2 = this.f14001b;
                    iVar2.b();
                    String str = iVar2.f7664b;
                    synchronized (c1471e) {
                        c1471e.a();
                        if (str == null || str.isEmpty()) {
                            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
                        }
                        c1471e.f15405f = str;
                    }
                }
                Y3.i iVar3 = this.f14001b;
                synchronized (c1471e) {
                    c1471e.f15409k = iVar3;
                }
                c1471e.f15402c = this.f14002c;
                c1471e.f15403d = this.f14003d;
                C1271h c1271h2 = new C1271h(c1471e, c1480n);
                this.f14000a.put(c1480n, c1271h2);
                c1271h = c1271h2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return c1271h;
    }
}
