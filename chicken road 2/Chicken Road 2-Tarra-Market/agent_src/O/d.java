package O;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class d extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final Status f263a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i2 = status.f727a;
        String str = status.f728b;
        this.f263a = status;
    }
}
