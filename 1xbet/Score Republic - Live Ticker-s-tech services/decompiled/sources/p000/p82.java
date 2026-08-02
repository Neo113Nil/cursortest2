package p000;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p82 extends r82 implements n82 {

    /* JADX INFO: renamed from: j */
    public final File f6021j;

    public p82(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.f6021j = file;
    }

    @Override // p000.n82
    /* JADX INFO: renamed from: a */
    public final File mo3504a() {
        return this.f6021j;
    }
}
