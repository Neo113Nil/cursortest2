package p000;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: dp */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0145dp extends bh0 implements f60 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f1755k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0848wp f1756l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0145dp(C0848wp c0848wp, int i) {
        super(0);
        this.f1755k = i;
        this.f1756l = c0848wp;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: a */
    public final Object mo1083a() throws IOException {
        switch (this.f1755k) {
            case 0:
                return ((o00) this.f1756l.f8615s.m2847a()).f5572b;
            default:
                l00 l00Var = this.f1756l.f8606j;
                File canonicalFile = ((File) l00Var.f4621b.mo1083a()).getCanonicalFile();
                synchronized (l00.f4619d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = l00.f4618c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    absolutePath.getClass();
                    linkedHashSet.add(absolutePath);
                }
                return new o00(canonicalFile, (g81) l00Var.f4620a.mo170i(canonicalFile), new k00(0, canonicalFile));
        }
    }
}
