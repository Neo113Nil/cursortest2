package C0;

import android.util.Log;
import u0.C0845g;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f102a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f103b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f104c;

    public /* synthetic */ p(int i2, Object obj, Object obj2) {
        this.f102a = i2;
        this.f104c = obj;
        this.f103b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f102a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((C0845g) this.f103b).a(((D0.k) ((t) ((Y.e) this.f104c).f524c).f118c).f(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((C0845g) this.f103b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f102a) {
            case 0:
                ((q) this.f104c).f106b = (byte[]) this.f103b;
                break;
            default:
                ((C0845g) this.f103b).a(((D0.k) ((t) ((Y.e) this.f104c).f524c).f118c).b(obj));
                break;
        }
    }
}
