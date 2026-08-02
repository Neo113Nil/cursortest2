package p000;

import android.content.res.Resources;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: renamed from: fc */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0206fc implements h21, iq0 {

    /* JADX INFO: renamed from: j */
    public final Resources f2374j;

    public /* synthetic */ C0206fc(Resources resources) {
        this.f2374j = resources;
    }

    @Override // p000.h21
    /* JADX INFO: renamed from: o */
    public v11 mo1764o(v11 v11Var, uu0 uu0Var) {
        if (v11Var == null) {
            return null;
        }
        return new C0354jc(this.f2374j, v11Var);
    }

    @Override // p000.iq0
    /* JADX INFO: renamed from: t */
    public hq0 mo167t(f71 f71Var) {
        return new C0314i8(this.f2374j, f71Var.m1658d(Uri.class, InputStream.class));
    }
}
