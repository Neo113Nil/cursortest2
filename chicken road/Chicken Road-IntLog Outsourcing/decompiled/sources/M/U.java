package M;

import P4.C0143w;
import android.content.Context;
import c0.C0304f;
import c0.C0305g;
import java.io.File;
import java.math.BigInteger;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class U extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1634f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(int i2, Object obj) {
        super(0);
        this.f1633e = i2;
        this.f1634f = obj;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        String substring;
        C0304f c0304f;
        switch (this.f1633e) {
            case 0:
                Object obj = V.f1636d;
                File file = (File) this.f1634f;
                synchronized (obj) {
                    V.f1635c.remove(file.getAbsolutePath());
                }
                return f4.v.f5689a;
            case 1:
                N4.f fVar = (N4.f) this.f1634f;
                return Integer.valueOf(P4.I.c(fVar, fVar.f2182i));
            case 2:
                File file2 = (File) ((O.b) this.f1634f).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.i.d(name, "getName(...)");
                int b02 = B4.k.b0(name, '.', 0, 6);
                if (b02 == -1) {
                    substring = "";
                } else {
                    substring = name.substring(b02 + 1, name.length());
                    kotlin.jvm.internal.i.d(substring, "substring(...)");
                }
                if (substring.equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.i.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 3:
                return e5.g.h("kotlin.Unit", N4.j.f2193e, new N4.e[0], new F4.o(5, (C0143w) this.f1634f));
            case 4:
                return ((X.m) this.f1634f).k();
            case 5:
                return androidx.lifecycle.M.g((androidx.lifecycle.Z) this.f1634f);
            case 6:
                C0305g c0305g = (C0305g) this.f1634f;
                String str = c0305g.f4885b;
                Context context = c0305g.f4884a;
                if (str == null || !c0305g.f4887d) {
                    c0304f = new C0304f(context, c0305g.f4885b, new V0.j(8), c0305g.f4886c, c0305g.f4888e);
                } else {
                    File noBackupFilesDir = context.getNoBackupFilesDir();
                    kotlin.jvm.internal.i.d(noBackupFilesDir, "context.noBackupFilesDir");
                    c0304f = new C0304f(context, new File(noBackupFilesDir, c0305g.f4885b).getAbsolutePath(), new V0.j(8), c0305g.f4886c, c0305g.f4888e);
                }
                c0304f.setWriteAheadLoggingEnabled(c0305g.f4890g);
                return c0304f;
            default:
                j0.i iVar = (j0.i) this.f1634f;
                return BigInteger.valueOf(iVar.f10458a).shiftLeft(32).or(BigInteger.valueOf(iVar.f10459b)).shiftLeft(32).or(BigInteger.valueOf(iVar.f10460c));
        }
    }
}
