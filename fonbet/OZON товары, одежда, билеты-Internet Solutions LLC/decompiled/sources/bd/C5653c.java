package bd;

import java.io.ByteArrayOutputStream;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: bd.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C5653c extends ByteArrayOutputStream {
    public C5653c() {
        super(8193);
    }

    @NotNull
    public final byte[] c() {
        byte[] buf = ((ByteArrayOutputStream) this).buf;
        Intrinsics.checkNotNullExpressionValue(buf, "buf");
        return buf;
    }
}
