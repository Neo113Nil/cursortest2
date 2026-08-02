package bd;

import B0.S1;
import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbd/f;", "Ljava/io/IOException;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public class f extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull File file, File file2, String str) {
        super(S1.b(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
    }
}
