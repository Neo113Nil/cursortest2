package N3;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class c extends IOException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j5, long j6, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat("Pos: " + j5 + ", limit: " + j6 + ", len: " + i), indexOutOfBoundsException);
        Locale locale = Locale.US;
    }

    public c(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
