package M;

import java.io.File;
import java.util.LinkedHashSet;
import t4.InterfaceC1430a;

/* renamed from: M.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0085n extends kotlin.jvm.internal.j implements InterfaceC1430a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f1734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P f1735f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085n(P p5, int i2) {
        super(0);
        this.f1734e = i2;
        this.f1735f = p5;
    }

    @Override // t4.InterfaceC1430a
    public final Object invoke() {
        switch (this.f1734e) {
            case 0:
                return ((Y) this.f1735f.f1622j.getValue()).f1653b;
            default:
                V v4 = this.f1735f.f1613a;
                File canonicalFile = ((File) v4.f1638b.invoke()).getCanonicalFile();
                synchronized (V.f1636d) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = V.f1635c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.i.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new Y(canonicalFile, (j0) v4.f1637a.invoke(canonicalFile), new U(0, canonicalFile));
        }
    }
}
