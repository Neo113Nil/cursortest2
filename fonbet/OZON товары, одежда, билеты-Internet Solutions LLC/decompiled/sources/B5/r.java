package B5;

import B90.o0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2769b;

    public /* synthetic */ r(Object obj, int i11) {
        this.f2768a = i11;
        this.f2769b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2768a) {
            case 0:
                com.airbnb.lottie.g.b((com.airbnb.lottie.g) this.f2769b);
                break;
            default:
                jm0.e.b().execute(new o0((Function0) this.f2769b, 2));
                break;
        }
    }
}
