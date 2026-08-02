package com.google.android.gms.internal.ads;

import android.media.Spatializer;

/* loaded from: classes.dex */
public final /* synthetic */ class XG implements InterfaceC1446pu {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C1112iH f12196k;

    public /* synthetic */ XG(C1112iH c1112iH) {
        this.f12196k = c1112iH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0058, code lost:
    
        if (r4 != 3) goto L43;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.InterfaceC1446pu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(Object obj) {
        boolean z3;
        P.W w5;
        boolean isAvailable;
        boolean isEnabled;
        C1112iH c1112iH = this.f12196k;
        C1407p c1407p = (C1407p) obj;
        synchronized (c1112iH.f13932c) {
            try {
                z3 = true;
                if (c1112iH.f.f12992p && !c1112iH.f13934e) {
                    int i = c1407p.f14886B;
                    char c5 = 65535;
                    if (i != -1 && i > 2) {
                        String str = c1407p.f14904m;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -2123537834:
                                    if (str.equals("audio/eac3-joc")) {
                                        c5 = 2;
                                        break;
                                    }
                                    break;
                                case 187078296:
                                    if (str.equals("audio/ac3")) {
                                        c5 = 0;
                                        break;
                                    }
                                    break;
                                case 187078297:
                                    if (str.equals("audio/ac4")) {
                                        c5 = 3;
                                        break;
                                    }
                                    break;
                                case 1504578661:
                                    if (str.equals("audio/eac3")) {
                                        c5 = 1;
                                        break;
                                    }
                                    break;
                            }
                            if (c5 != 0) {
                                if (c5 != 1) {
                                    if (c5 != 2) {
                                    }
                                }
                            }
                            if (AbstractC1260lo.f14419a >= 32) {
                                P.W w6 = c1112iH.f13935g;
                                if (w6 != null) {
                                    if (!w6.f4411k) {
                                    }
                                }
                            }
                        }
                        if (AbstractC1260lo.f14419a >= 32 && (w5 = c1112iH.f13935g) != null && w5.f4411k) {
                            isAvailable = ((Spatializer) w5.f4412l).isAvailable();
                            if (isAvailable) {
                                isEnabled = ((Spatializer) c1112iH.f13935g.f4412l).isEnabled();
                                if (isEnabled && c1112iH.f13935g.i(c1407p, c1112iH.f13936h)) {
                                }
                            }
                        }
                        z3 = false;
                    }
                }
            } finally {
            }
        }
        return z3;
    }
}
