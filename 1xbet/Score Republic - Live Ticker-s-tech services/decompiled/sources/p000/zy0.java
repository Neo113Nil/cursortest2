package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class zy0 implements hq0 {

    /* JADX INFO: renamed from: a */
    public final Context f9982a;

    /* JADX INFO: renamed from: b */
    public final hq0 f9983b;

    /* JADX INFO: renamed from: c */
    public final hq0 f9984c;

    /* JADX INFO: renamed from: d */
    public final Class f9985d;

    public zy0(Context context, hq0 hq0Var, hq0 hq0Var2, Class cls) {
        this.f9982a = context.getApplicationContext();
        this.f9983b = hq0Var;
        this.f9984c = hq0Var2;
        this.f9985d = cls;
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        return AbstractC0565p1.m3837g((Uri) obj);
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        Uri uri = (Uri) obj;
        return new gq0(new us0(uri), new yy0(this.f9982a, this.f9983b, this.f9984c, uri, i, i2, uu0Var, this.f9985d));
    }
}
