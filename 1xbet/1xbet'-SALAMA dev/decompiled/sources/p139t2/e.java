package p139t2;

import A1.X;
import D3.j;
import D3.l;
import android.media.Spatializer;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f16311a;

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    @Override // D3.l
    public final boolean apply(Object obj) {
        boolean z4;
        j jVar;
        j jVar2;
        boolean z7 = false;
        byte b7 = 2;
        p pVar = this.f16311a;
        X x4 = (X) obj;
        synchronized (pVar.f16391c) {
            try {
                if (!pVar.f16394f.f16357a0 || pVar.f16393e || x4.f296P <= 2) {
                    z7 = true;
                } else {
                    String str = x4.f283C;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                b7 = !str.equals("audio/eac3-joc") ? (byte) -1 : (byte) 0;
                                break;
                            case 187078296:
                                b7 = !str.equals("audio/ac3") ? (byte) -1 : (byte) 1;
                                break;
                            case 187078297:
                                if (!str.equals("audio/ac4")) {
                                    b7 = -1;
                                }
                                break;
                            case 1504578661:
                                b7 = !str.equals("audio/eac3") ? (byte) -1 : (byte) 3;
                                break;
                            default:
                                b7 = -1;
                                break;
                        }
                        switch (b7) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                z4 = true;
                                break;
                            default:
                                z4 = false;
                                break;
                        }
                    } else {
                        z4 = false;
                    }
                    if (z4 && (t.f17159a < 32 || (jVar2 = pVar.f16395g) == null || !jVar2.f1724c)) {
                        z7 = true;
                    } else if (t.f17159a >= 32 && (jVar = pVar.f16395g) != null && jVar.f1724c && ((Spatializer) jVar.f1723b).isAvailable() && ((Spatializer) pVar.f16395g.f1723b).isEnabled() && pVar.f16395g.f(x4, pVar.f16396h)) {
                        z7 = true;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
