package p000;

import java.net.URL;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: nf */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0505nf {

    /* JADX INFO: renamed from: a */
    public long f5391a;

    /* JADX INFO: renamed from: b */
    public int f5392b;

    /* JADX INFO: renamed from: c */
    public final Object f5393c;

    public C0505nf() {
        if (aa0.f107k == null) {
            Pattern pattern = dh1.f1650b;
            aa0.f107k = new aa0(16);
        }
        aa0 aa0Var = aa0.f107k;
        if (dh1.f1651c == null) {
            dh1.f1651c = new dh1(aa0Var);
        }
        this.f5393c = dh1.f1651c;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001d  */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m3531a() {
        boolean z;
        if (this.f5392b != 0) {
            ((dh1) this.f5393c).f1652a.getClass();
            if (System.currentTimeMillis() > this.f5391a) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m3532b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.f5392b = 0;
            }
            return;
        }
        this.f5392b++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.f5392b);
                ((dh1) this.f5393c).getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), 1800000.0d);
            } else {
                jMin = 86400000;
            }
            ((dh1) this.f5393c).f1652a.getClass();
            this.f5391a = System.currentTimeMillis() + jMin;
        }
        return;
        throw th;
    }

    public C0505nf(int i, URL url, long j) {
        this.f5392b = i;
        this.f5393c = url;
        this.f5391a = j;
    }
}
