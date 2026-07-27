package K;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: K.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046n extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f885e;
    public final /* synthetic */ O f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0046n(O o3, int i3) {
        super(0);
        this.f885e = i3;
        this.f = o3;
    }

    @Override // o2.a
    public final Object invoke() {
        switch (this.f885e) {
            case 0:
                return ((X) this.f.f788j.a()).f815b;
            default:
                U u3 = this.f.f780a;
                File canonicalFile = ((File) u3.f802b.invoke()).getCanonicalFile();
                synchronized (U.f800d) {
                    String path = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = U.f799c;
                    if (linkedHashSet.contains(path)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + path + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    kotlin.jvm.internal.j.d(path, "path");
                    linkedHashSet.add(path);
                }
                return new X(canonicalFile, (i0) u3.f801a.invoke(canonicalFile), new T(0, canonicalFile));
        }
    }
}
