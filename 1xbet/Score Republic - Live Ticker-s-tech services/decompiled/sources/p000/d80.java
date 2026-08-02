package p000;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class d80 implements ie1 {

    /* JADX INFO: renamed from: b */
    public final ie1 f1581b;

    public d80(ie1 ie1Var) {
        o80.m3647h(ie1Var, "Argument must not be null");
        this.f1581b = ie1Var;
    }

    @Override // p000.ie1
    /* JADX INFO: renamed from: a */
    public final v11 mo1139a(Context context, v11 v11Var, int i, int i2) {
        b80 b80Var = (b80) v11Var.get();
        C0354jc c0354jc = new C0354jc(ComponentCallbacks2C0106a.m983a(context).f1307j, b80Var.f756j.f61a.f3092l);
        ie1 ie1Var = this.f1581b;
        v11 v11VarMo1139a = ie1Var.mo1139a(context, c0354jc, i, i2);
        if (c0354jc != v11VarMo1139a) {
            c0354jc.mo269e();
        }
        b80Var.f756j.f61a.m2228c(ie1Var, (Bitmap) v11VarMo1139a.get());
        return v11Var;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        this.f1581b.mo1038b(messageDigest);
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof d80) {
            return this.f1581b.equals(((d80) obj).f1581b);
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        return this.f1581b.hashCode();
    }
}
