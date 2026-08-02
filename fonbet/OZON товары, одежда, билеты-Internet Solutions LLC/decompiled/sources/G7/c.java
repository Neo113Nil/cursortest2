package G7;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class c extends ApiException {

    /* renamed from: a, reason: collision with root package name */
    private final Exception f9732a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(int i11, Exception exc) {
        super(new Status(i11, Nh.a.c(i11, "Integrity API error (", "): ", H7.a.a(i11), ".")));
        Locale locale = Locale.ROOT;
        if (i11 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f9732a = exc;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f9732a;
    }
}
