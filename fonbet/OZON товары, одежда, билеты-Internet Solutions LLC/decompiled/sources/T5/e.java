package T5;

import Ve.C4598rp;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class e extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private final int f26661a;

    public e(String str, int i11) {
        this(str, i11, null);
    }

    public final int a() {
        return this.f26661a;
    }

    public e(String str, int i11, IOException iOException) {
        super(C4598rp.c(i11, str, ", status code: "), iOException);
        this.f26661a = i11;
    }
}
