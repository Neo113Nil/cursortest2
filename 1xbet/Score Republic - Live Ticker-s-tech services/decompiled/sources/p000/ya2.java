package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ya2 extends za2 {

    /* JADX INFO: renamed from: b */
    public int f9258b;

    @Override // p000.za2
    /* JADX INFO: renamed from: a */
    public final String mo5614a() {
        return "com/google/android/libraries/phenotype/client/Phlogger".replace('/', '.');
    }

    @Override // p000.za2
    /* JADX INFO: renamed from: b */
    public final String mo5615b() {
        return "logInternal";
    }

    @Override // p000.za2
    /* JADX INFO: renamed from: c */
    public final int mo5616c() {
        return 44;
    }

    @Override // p000.za2
    /* JADX INFO: renamed from: d */
    public final String mo5617d() {
        return "Phlogger.java".substring("Phlogger.java".lastIndexOf(File.separatorChar) + 1);
    }

    @Override // p000.za2
    /* JADX INFO: renamed from: e */
    public final String mo5752e() {
        return "Phlogger.java";
    }

    public final boolean equals(Object obj) {
        return obj instanceof ya2;
    }

    public final int hashCode() {
        int i = this.f9258b;
        if (i != 0) {
            return i;
        }
        this.f9258b = -1391114360;
        return -1391114360;
    }
}
