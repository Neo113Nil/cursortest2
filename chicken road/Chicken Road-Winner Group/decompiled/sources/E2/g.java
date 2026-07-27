package E2;

import K.O;
import K.X;
import K.a0;
import android.content.Intent;
import android.content.pm.PackageManager;
import d2.C0278h;
import d2.C0279i;
import o2.l;
import w2.C1227f;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f349e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i3, Object obj) {
        super(1);
        this.f349e = i3;
        this.f = obj;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        switch (this.f349e) {
            case 0:
                ((i) this.f).b();
                return C0279i.f4852a;
            case 1:
                Throwable th = (Throwable) obj;
                O o3 = (O) this.f;
                if (th != null) {
                    o3.f786h.x(new a0(th));
                }
                if (o3.f788j.f4849b != C0278h.f4851a) {
                    ((X) o3.f788j.a()).close();
                }
                return C0279i.f4852a;
            case 2:
                Intent intent = new Intent("android.support.customtabs.action.CustomTabsService").setPackage((String) obj);
                kotlin.jvm.internal.j.d(intent, "Intent(CustomTabsService…          .setPackage(it)");
                return Boolean.valueOf(((PackageManager) this.f).resolveService(intent, 0) != null);
            default:
                C0279i c0279i = C0279i.f4852a;
                ((C1227f) this.f).e(c0279i);
                return c0279i;
        }
    }
}
