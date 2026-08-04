package p010b0;

import java.io.File;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class S extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f9982a = new S(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        File file = (File) obj;
        h.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        h.d(absolutePath, "file.canonicalFile.absolutePath");
        return new h0(absolutePath);
    }
}
