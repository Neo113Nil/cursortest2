package k3;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class d extends Exception {

    /* renamed from: k, reason: collision with root package name */
    public final Status f17587k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public d(Status status) {
        super(r0 + ": " + (r1 == null ? "" : r1));
        int i = status.f7483k;
        String str = status.f7484l;
        this.f17587k = status;
    }
}
