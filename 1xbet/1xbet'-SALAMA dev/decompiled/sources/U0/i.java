package U0;

import C6.o;
import androidx.lifecycle.M;
import androidx.lifecycle.Y;
import java.io.File;
import java.math.BigInteger;
import p010b0.T;

/* JADX INFO: loaded from: classes.dex */
public final class i extends t6.i implements s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6392b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i7) {
        super(0);
        this.f6391a = i7;
        this.f6392b = obj;
    }

    @Override // s6.a
    public final Object invoke() {
        switch (this.f6391a) {
            case 0:
                j jVar = (j) this.f6392b;
                return BigInteger.valueOf(jVar.f6394a).shiftLeft(32).or(BigInteger.valueOf(jVar.f6395b)).shiftLeft(32).or(BigInteger.valueOf(jVar.f6396c));
            case 1:
                return M.e((Y) this.f6392b);
            case 2:
                Object obj = T.f9984d;
                File file = (File) this.f6392b;
                synchronized (obj) {
                    T.f9983c.remove(file.getAbsolutePath());
                }
                return p044f6.i.f13014a;
            default:
                File file2 = (File) ((X0.j) this.f6392b).invoke();
                String name = file2.getName();
                t6.h.d(name, "getName(...)");
                if (o.D0(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    t6.h.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }
}
