package K;

import java.io.File;

/* loaded from: classes.dex */
public final class S extends kotlin.jvm.internal.k implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public static final S f797e = new S(1);

    @Override // o2.l
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.j.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new i0(absolutePath);
    }
}
