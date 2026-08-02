package p000;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d21 implements iq0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1527j;

    /* JADX INFO: renamed from: k */
    public final Resources f1528k;

    public /* synthetic */ d21(Resources resources, int i) {
        this.f1527j = i;
        this.f1528k = resources;
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public final hq0 mo167t(f71 f71Var) {
        int i = this.f1527j;
        Resources resources = this.f1528k;
        switch (i) {
            case 0:
                return new C0314i8(resources, f71Var.m1658d(Uri.class, AssetFileDescriptor.class));
            default:
                return new C0314i8(resources, lf1.f4798b);
        }
    }
}
