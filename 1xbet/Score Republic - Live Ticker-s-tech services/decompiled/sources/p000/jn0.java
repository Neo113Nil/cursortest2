package p000;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class jn0 implements hq0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4039a;

    /* JADX INFO: renamed from: b */
    public final Context f4040b;

    public jn0(Context context, int i) {
        this.f4039a = i;
        switch (i) {
            case 1:
                this.f4040b = context.getApplicationContext();
                break;
            case 2:
                this.f4040b = context.getApplicationContext();
                break;
            default:
                this.f4040b = context;
                break;
        }
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: a */
    public final boolean mo639a(Object obj) {
        switch (this.f4039a) {
            case 0:
                return AbstractC0565p1.m3837g((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC0565p1.m3837g(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC0565p1.m3837g(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p000.hq0
    /* JADX INFO: renamed from: b */
    public final gq0 mo640b(Object obj, int i, int i2, uu0 uu0Var) {
        Long l;
        int i3 = this.f4039a;
        Context context = this.f4040b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new gq0(new us0(uri), new in0(0, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new gq0(new us0(uri2), f00.m1547b(context, uri2, new b90(3, context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) uu0Var.m4955c(ph1.f6151d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new gq0(new us0(uri3), f00.m1547b(context, uri3, new nu1(2, context.getContentResolver())));
        }
    }
}
