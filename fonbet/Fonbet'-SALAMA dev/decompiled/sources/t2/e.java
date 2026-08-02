package t2;

import A1.X;
import android.media.Spatializer;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements D3.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f16305a;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0093, code lost:
    
        if (r3.f16389g.f(r9, r3.f16390h) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0039, code lost:
    
        if (r5.equals("audio/ac4") == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[Catch: all -> 0x0067, TRY_ENTER, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:22:0x0069, B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x007f, B:32:0x008b, B:34:0x0096), top: B:3:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x0067, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x000a, B:6:0x0010, B:8:0x0014, B:10:0x0018, B:15:0x005a, B:17:0x005e, B:19:0x0062, B:22:0x0069, B:24:0x006d, B:26:0x0071, B:28:0x0075, B:30:0x007f, B:32:0x008b, B:34:0x0096), top: B:3:0x000a }] */
    @Override // D3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean apply(Object obj) {
        boolean z4;
        D3.j jVar;
        boolean isAvailable;
        boolean isEnabled;
        D3.j jVar2;
        boolean z7 = false;
        char c3 = 2;
        p pVar = this.f16305a;
        X x4 = (X) obj;
        synchronized (pVar.f16385c) {
            try {
                if (pVar.f16388f.f16351a0 && !pVar.f16387e && x4.f296P > 2) {
                    String str = x4.f283C;
                    if (str != null) {
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 187078297:
                                break;
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                                z4 = true;
                                break;
                        }
                        if (z4) {
                            if (v2.t.f17153a >= 32 && (jVar2 = pVar.f16389g) != null && jVar2.f1724c) {
                            }
                        }
                        if (v2.t.f17153a >= 32 && (jVar = pVar.f16389g) != null && jVar.f1724c) {
                            isAvailable = ((Spatializer) jVar.f1723b).isAvailable();
                            if (isAvailable) {
                                isEnabled = ((Spatializer) pVar.f16389g.f1723b).isEnabled();
                                if (isEnabled) {
                                }
                            }
                        }
                    }
                    z4 = false;
                    if (z4) {
                    }
                    if (v2.t.f17153a >= 32) {
                        isAvailable = ((Spatializer) jVar.f1723b).isAvailable();
                        if (isAvailable) {
                        }
                    }
                }
                z7 = true;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }
}
