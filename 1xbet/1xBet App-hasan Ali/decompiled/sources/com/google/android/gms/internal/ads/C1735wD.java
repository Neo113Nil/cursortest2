package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.wD, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1735wD extends AbstractC1400ot {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f16098l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16099m;

    public C1735wD(String str, int i) {
        this.f16098l = i;
        switch (i) {
            case 1:
                this.f16099m = Logger.getLogger(str);
                break;
            default:
                this.f16099m = str;
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1400ot
    public final void k(String str) {
        switch (this.f16098l) {
            case 0:
                String str2 = (String) this.f16099m;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + String.valueOf(str2).length() + 1);
                sb.append(str2);
                sb.append(":");
                sb.append(str);
                Log.d("isoparser", sb.toString());
                break;
            default:
                ((Logger) this.f16099m).logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
                break;
        }
    }
}
