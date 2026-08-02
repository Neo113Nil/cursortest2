package b0;

import java.io.File;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class S extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final S f9982a = new S(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        File file = (File) obj;
        t6.h.e(file, "it");
        String absolutePath = file.getCanonicalFile().getAbsolutePath();
        t6.h.d(absolutePath, "file.canonicalFile.absolutePath");
        return new h0(absolutePath);
    }
}
