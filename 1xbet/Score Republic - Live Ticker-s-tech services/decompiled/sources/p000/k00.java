package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class k00 extends bh0 implements f60 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f4241k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ Object f4242l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k00(int i, Object obj) {
        super(0);
        this.f4241k = i;
        this.f4242l = obj;
    }

    @Override // p000.f60
    /* JADX INFO: renamed from: a */
    public final Object mo1083a() {
        switch (this.f4241k) {
            case 0:
                Object obj = l00.f4619d;
                File file = (File) this.f4242l;
                synchronized (obj) {
                    l00.f4618c.remove(file.getAbsolutePath());
                }
                return kf1.f4365a;
            case 1:
                File file2 = (File) ((pw0) this.f4242l).mo1083a();
                String name = file2.getName();
                name.getClass();
                int iLastIndexOf = name.lastIndexOf(46, name.length() - 1);
                if ((iLastIndexOf != -1 ? name.substring(iLastIndexOf + 1, name.length()) : "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    absoluteFile.getClass();
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            default:
                return xe1.m5640h((hi1) this.f4242l);
        }
    }
}
