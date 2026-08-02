package p000;

import java.io.File;

/* JADX INFO: renamed from: nt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0519nt {

    /* JADX INFO: renamed from: a */
    public final String f5532a;

    /* JADX INFO: renamed from: b */
    public final long[] f5533b;

    /* JADX INFO: renamed from: c */
    public final File[] f5534c;

    /* JADX INFO: renamed from: d */
    public final File[] f5535d;

    /* JADX INFO: renamed from: e */
    public boolean f5536e;

    /* JADX INFO: renamed from: f */
    public C0809vn f5537f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0556ot f5538g;

    public C0519nt(C0556ot c0556ot, String str) {
        this.f5538g = c0556ot;
        this.f5532a = str;
        int i = c0556ot.f5860p;
        File file = c0556ot.f5854j;
        this.f5533b = new long[i];
        this.f5534c = new File[i];
        this.f5535d = new File[i];
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(i2);
            this.f5534c[i2] = new File(file, sb.toString());
            sb.append(".tmp");
            this.f5535d[i2] = new File(file, sb.toString());
            sb.setLength(length);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m3588a() {
        StringBuilder sb = new StringBuilder();
        for (long j : this.f5533b) {
            sb.append(' ');
            sb.append(j);
        }
        return sb.toString();
    }
}
