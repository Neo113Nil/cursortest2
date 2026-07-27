package S1;

import android.util.Log;

/* loaded from: classes.dex */
public final class i implements T1.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1427c;

    public /* synthetic */ i(Object obj, int i3, Object obj2) {
        this.f1425a = i3;
        this.f1427c = obj;
        this.f1426b = obj2;
    }

    @Override // T1.n
    public final void a() {
        switch (this.f1425a) {
            case 0:
                break;
            default:
                ((K1.g) this.f1426b).a(null);
                break;
        }
    }

    @Override // T1.n
    public final void b(String str, String str2, Object obj) {
        switch (this.f1425a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((K1.g) this.f1426b).a(((T1.o) ((a1.e) this.f1427c).f1789c).f1472c.d(str, str2, obj));
                break;
        }
    }

    @Override // T1.n
    public final void success(Object obj) {
        switch (this.f1425a) {
            case 0:
                ((j) this.f1427c).f1429b = (byte[]) this.f1426b;
                break;
            default:
                ((K1.g) this.f1426b).a(((T1.o) ((a1.e) this.f1427c).f1789c).f1472c.a(obj));
                break;
        }
    }

    private final void c() {
    }
}
