package K;

import d0.C0268h;
import d2.C0279i;
import java.io.File;
import java.math.BigInteger;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.k implements o2.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f798e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(int i3, Object obj) {
        super(0);
        this.f798e = i3;
        this.f = obj;
    }

    @Override // o2.a
    public final Object invoke() {
        switch (this.f798e) {
            case 0:
                Object obj = U.f800d;
                File file = (File) this.f;
                synchronized (obj) {
                    U.f799c.remove(file.getAbsolutePath());
                }
                return C0279i.f4852a;
            case 1:
                File file2 = (File) ((M.b) this.f).invoke();
                String name = file2.getName();
                kotlin.jvm.internal.j.d(name, "getName(...)");
                if (v2.m.s0(name, "").equals("preferences_pb")) {
                    File absoluteFile = file2.getAbsoluteFile();
                    kotlin.jvm.internal.j.d(absoluteFile, "file.absoluteFile");
                    return absoluteFile;
                }
                throw new IllegalStateException(("File extension for file: " + file2 + " does not match required extension for Preferences file: preferences_pb").toString());
            case 2:
                androidx.lifecycle.A a3 = (androidx.lifecycle.A) this.f;
                androidx.lifecycle.z store = a3.d();
                Q.b defaultCreationExtras = a3 instanceof androidx.lifecycle.b ? ((androidx.lifecycle.b) a3).c() : Q.a.f1155b;
                kotlin.jvm.internal.j.e(store, "store");
                kotlin.jvm.internal.j.e(defaultCreationExtras, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = store.f2346a;
                androidx.lifecycle.x xVar = (androidx.lifecycle.x) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (androidx.lifecycle.x.class.isInstance(xVar)) {
                    kotlin.jvm.internal.j.c(xVar, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    ((LinkedHashMap) new Q.c(defaultCreationExtras).f1156a).put(androidx.lifecycle.y.f2345b, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        xVar = new androidx.lifecycle.x();
                        androidx.lifecycle.x xVar2 = (androidx.lifecycle.x) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", xVar);
                        if (xVar2 != null) {
                            xVar2.a();
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return xVar;
            default:
                C0268h c0268h = (C0268h) this.f;
                return BigInteger.valueOf(c0268h.f4838a).shiftLeft(32).or(BigInteger.valueOf(c0268h.f4839b)).shiftLeft(32).or(BigInteger.valueOf(c0268h.f4840c));
        }
    }
}
