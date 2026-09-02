package F;

/* loaded from: classes.dex */
public final class T extends kotlin.jvm.internal.j implements s1.l {

    /* renamed from: e, reason: collision with root package name */
    public static final F.T f397e = new F.T(1);

    @Override // s1.l
    public final java.lang.Object invoke(java.lang.Object obj) {
        java.io.File it = (java.io.File) obj;
        kotlin.jvm.internal.i.e(it, "it");
        java.lang.String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.i.d(absolutePath, "file.canonicalFile.absolutePath");
        return new F.j0(absolutePath);
    }
}
