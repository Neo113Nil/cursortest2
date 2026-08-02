package y2;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i implements f {

    /* renamed from: a, reason: collision with root package name */
    public final W3.m f21199a;

    /* renamed from: b, reason: collision with root package name */
    public final W3.m f21200b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f21201c;

    public i(W3.m mVar, W3.m mVar2, boolean z3) {
        this.f21199a = mVar;
        this.f21200b = mVar2;
        this.f21201c = z3;
    }

    @Override // y2.f
    public final g a(Object obj, E2.m mVar) {
        Uri uri = (Uri) obj;
        if (kotlin.jvm.internal.l.a(uri.getScheme(), "http") || kotlin.jvm.internal.l.a(uri.getScheme(), "https")) {
            return new l(uri.toString(), mVar, this.f21199a, this.f21200b, this.f21201c);
        }
        return null;
    }
}
