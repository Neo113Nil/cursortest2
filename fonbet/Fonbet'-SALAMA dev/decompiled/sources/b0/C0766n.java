package b0;

import java.io.File;
import java.util.LinkedHashSet;

/* renamed from: b0.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0766n extends t6.i implements s6.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10083a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ O f10084b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0766n(O o7, int i7) {
        super(0);
        this.f10083a = i7;
        this.f10084b = o7;
    }

    @Override // s6.a
    public final Object invoke() {
        switch (this.f10083a) {
            case 0:
                return ((W) this.f10084b.j.getValue()).f10001b;
            default:
                T t7 = this.f10084b.f9964a;
                File canonicalFile = ((File) t7.f9986b.invoke()).getCanonicalFile();
                synchronized (T.f9984d) {
                    String absolutePath = canonicalFile.getAbsolutePath();
                    LinkedHashSet linkedHashSet = T.f9983c;
                    if (linkedHashSet.contains(absolutePath)) {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                    t6.h.d(absolutePath, "path");
                    linkedHashSet.add(absolutePath);
                }
                return new W(canonicalFile, (h0) t7.f9985a.invoke(canonicalFile), new U0.i(canonicalFile, 2));
        }
    }
}
