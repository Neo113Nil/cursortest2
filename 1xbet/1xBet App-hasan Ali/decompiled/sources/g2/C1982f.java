package g2;

import G.v;
import P.W;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import q3.AbstractC2309b;
import r3.AbstractC2349a;

/* renamed from: g2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1982f implements X1.a {

    /* renamed from: k, reason: collision with root package name */
    public final Context f17113k;

    public /* synthetic */ C1982f(Context context) {
        this.f17113k = context;
    }

    @Override // X1.a
    public X1.b a(W w5) {
        v vVar = (v) w5.f4414n;
        if (vVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        }
        Context context = this.f17113k;
        if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        String str = (String) w5.f4413m;
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
        W w6 = new W(context, (Object) str, (Object) vVar, true);
        return new Y1.e((Context) w6.f4412l, (String) w6.f4413m, (v) w6.f4414n, w6.f4411k);
    }

    public ApplicationInfo b(String str, int i) {
        return this.f17113k.getPackageManager().getApplicationInfo(str, i);
    }

    public PackageInfo c(String str, int i) {
        return this.f17113k.getPackageManager().getPackageInfo(str, i);
    }

    public boolean d() {
        String nameForUid;
        boolean isInstantApp;
        int callingUid = Binder.getCallingUid();
        int myUid = Process.myUid();
        Context context = this.f17113k;
        if (callingUid == myUid) {
            return AbstractC2349a.G(context);
        }
        if (!AbstractC2309b.e() || (nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        isInstantApp = context.getPackageManager().isInstantApp(nameForUid);
        return isInstantApp;
    }
}
