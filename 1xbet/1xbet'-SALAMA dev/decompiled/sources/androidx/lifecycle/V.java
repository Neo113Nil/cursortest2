package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
public interface V {
    default S b(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default S i(Class cls, p087m0.c cVar) {
        return b(cls);
    }
}
