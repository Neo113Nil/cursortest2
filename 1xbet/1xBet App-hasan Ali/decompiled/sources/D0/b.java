package D0;

import A0.J0;
import A0.P;
import A0.X;
import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.Objects;
import k4.AbstractC2036a;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f921a;

    /* renamed from: b, reason: collision with root package name */
    public final View f922b;

    public b(ContentCaptureSession contentCaptureSession, View view) {
        this.f921a = contentCaptureSession;
        this.f922b = view;
    }

    public final AutofillId a(long j5) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession d5 = P.d(this.f921a);
        J0 x5 = AbstractC2036a.x(this.f922b);
        Objects.requireNonNull(x5);
        return a.b(d5, X.e(x5.f304k), j5);
    }
}
