package p010b0;

import com.google.android.gms.common.api.f;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class Z extends i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f10010b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Throwable th) {
        super(f.API_PRIORITY_OTHER);
        h.e(th, "finalException");
        this.f10010b = th;
    }
}
