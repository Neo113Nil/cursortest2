package R2;

import java.io.File;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
final class K extends AbstractC7737t implements Function1<File, U> {

    /* renamed from: b, reason: collision with root package name */
    public static final K f24292b = new K(1);

    @Override // kotlin.jvm.functions.Function1
    public final U invoke(File file) {
        File file2 = file;
        Intrinsics.checkNotNullParameter(file2, "it");
        Intrinsics.checkNotNullParameter(file2, "file");
        String filePath = file2.getCanonicalFile().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(filePath, "file.canonicalFile.absolutePath");
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        return new f0(filePath);
    }
}
