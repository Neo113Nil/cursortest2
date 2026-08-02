package p000;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q82 extends s82 implements n82 {

    /* JADX INFO: renamed from: j */
    public final FileOutputStream f6417j;

    /* JADX INFO: renamed from: k */
    public final File f6418k;

    public q82(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.f6417j = fileOutputStream;
        this.f6418k = file;
    }

    @Override // p000.n82
    /* JADX INFO: renamed from: a */
    public final File mo3504a() {
        return this.f6418k;
    }
}
