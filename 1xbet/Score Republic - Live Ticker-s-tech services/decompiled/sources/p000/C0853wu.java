package p000;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0106a;
import java.security.MessageDigest;

/* JADX INFO: renamed from: wu */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0853wu implements ie1 {

    /* JADX INFO: renamed from: b */
    public final ie1 f8668b;

    public C0853wu(ie1 ie1Var) {
        this.f8668b = ie1Var;
    }

    @Override // p000.ie1
    /* JADX INFO: renamed from: a */
    public final v11 mo1139a(Context context, v11 v11Var, int i, int i2) {
        InterfaceC0318ic interfaceC0318ic = ComponentCallbacks2C0106a.m983a(context).f1307j;
        Drawable drawable = (Drawable) v11Var.get();
        C0354jc c0354jcM2314h = hn0.m2314h(interfaceC0318ic, drawable, i, i2);
        if (c0354jcM2314h == null) {
            C0042ay.m529f(drawable, " to a Bitmap", "Unable to convert ");
            return null;
        }
        v11 v11VarMo1139a = this.f8668b.mo1139a(context, c0354jcM2314h, i, i2);
        if (!v11VarMo1139a.equals(c0354jcM2314h)) {
            return new C0354jc(context.getResources(), v11VarMo1139a);
        }
        v11VarMo1139a.mo269e();
        return v11Var;
    }

    @Override // p000.xg0
    /* JADX INFO: renamed from: b */
    public final void mo1038b(MessageDigest messageDigest) {
        this.f8668b.mo1038b(messageDigest);
    }

    @Override // p000.xg0
    public final boolean equals(Object obj) {
        if (obj instanceof C0853wu) {
            return this.f8668b.equals(((C0853wu) obj).f8668b);
        }
        return false;
    }

    @Override // p000.xg0
    public final int hashCode() {
        return this.f8668b.hashCode();
    }
}
