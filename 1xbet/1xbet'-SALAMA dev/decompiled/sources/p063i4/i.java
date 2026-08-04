package p063i4;

import com.google.android.gms.common.internal.w;
import io.sentry.SentryReplayEvent;
import java.util.HashMap;
import p028d6.k;
import p048g4.o;
import p098n4.C0932e;
import p098n4.C0941n;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f14006a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y3.i f14007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f14008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final w f14009d;

    public i(Y3.i iVar, o oVar, o oVar2) {
        this.f14007b = iVar;
        this.f14008c = new k(oVar);
        this.f14009d = new w(oVar2);
    }

    public final synchronized h a(C0941n c0941n) {
        h hVar;
        try {
            hVar = (h) this.f14006a.get(c0941n);
            if (hVar == null) {
                C0932e c0932e = new C0932e();
                c0932e.f15413h = 2;
                c0932e.j = SentryReplayEvent.REPLAY_VIDEO_MAX_SIZE;
                c0932e.f15416l = false;
                Y3.i iVar = this.f14007b;
                iVar.b();
                if (!"[DEFAULT]".equals(iVar.f7664b)) {
                    Y3.i iVar2 = this.f14007b;
                    iVar2.b();
                    String str = iVar2.f7664b;
                    synchronized (c0932e) {
                        c0932e.a();
                        if (str == null || str.isEmpty()) {
                            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
                        }
                        c0932e.f15411f = str;
                    }
                }
                Y3.i iVar3 = this.f14007b;
                synchronized (c0932e) {
                    c0932e.f15415k = iVar3;
                }
                c0932e.f15408c = this.f14008c;
                c0932e.f15409d = this.f14009d;
                h hVar2 = new h(c0932e, c0941n);
                this.f14006a.put(c0941n, hVar2);
                hVar = hVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }
}
