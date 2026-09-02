package O;

import android.util.Log;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f325b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f326c;

    public /* synthetic */ l(int i2, Object obj, Object obj2) {
        this.f324a = i2;
        this.f326c = obj;
        this.f325b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f324a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((H.g) this.f325b).a(((P.k) ((E.b) ((C.a) this.f326c).f5d).f20c).h(str, str2, obj));
                break;
        }
    }

    public final void b() {
        switch (this.f324a) {
            case 0:
                break;
            default:
                ((H.g) this.f325b).a(null);
                break;
        }
    }

    public final void d(Object obj) {
        switch (this.f324a) {
            case 0:
                ((m) this.f326c).f328b = (byte[]) this.f325b;
                break;
            default:
                ((H.g) this.f325b).a(((P.k) ((E.b) ((C.a) this.f326c).f5d).f20c).c(obj));
                break;
        }
    }

    private final void c() {
    }
}
