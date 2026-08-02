package a2;

import Z1.l;
import androidx.collection.a0;
import androidx.collection.b0;
import k0.C7445a;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final float[] f36210a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static volatile a0<InterfaceC4921a> f36211b = new a0<>(0);

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private static final Object[] f36212c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f36213d = 0;

    static {
        Object[] objArr = new Object[0];
        f36212c = objArr;
        synchronized (objArr) {
            f36211b.d((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f36211b.d((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f36211b.d((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f36211b.d((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f36211b.d((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            Unit unit = Unit.f71690a;
        }
        if ((f36211b.c(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        l.b("You should only apply non-linear scaling to font scales > 1");
        throw null;
    }

    public static InterfaceC4921a a(float f7) {
        float c11;
        InterfaceC4921a f11;
        if (f7 < 1.03f) {
            return null;
        }
        a0<InterfaceC4921a> a0Var = f36211b;
        int i11 = (int) (f7 * 100.0f);
        a0Var.getClass();
        InterfaceC4921a interfaceC4921a = (InterfaceC4921a) b0.c(a0Var, i11);
        if (interfaceC4921a != null) {
            return interfaceC4921a;
        }
        a0<InterfaceC4921a> a0Var2 = f36211b;
        if (a0Var2.f38684a) {
            b0.a(a0Var2);
        }
        int a11 = C7445a.a(a0Var2.f38687d, i11, a0Var2.f38685b);
        if (a11 >= 0) {
            return f36211b.f(a11);
        }
        int i12 = -(a11 + 1);
        int i13 = i12 - 1;
        if (i12 >= f36211b.e()) {
            c cVar = new c(new float[]{1.0f}, new float[]{f7});
            b(f7, cVar);
            return cVar;
        }
        float[] fArr = f36210a;
        if (i13 < 0) {
            f11 = new c(fArr, fArr);
            c11 = 1.0f;
        } else {
            c11 = f36211b.c(i13) / 100.0f;
            f11 = f36211b.f(i13);
        }
        float a12 = d.a(0.0f, 1.0f, c11, f36211b.c(i12) / 100.0f, f7);
        InterfaceC4921a f12 = f36211b.f(i12);
        float[] fArr2 = new float[9];
        for (int i14 = 0; i14 < 9; i14++) {
            float f13 = fArr[i14];
            fArr2[i14] = d.b(f11.b(f13), f12.b(f13), a12);
        }
        c cVar2 = new c(fArr, fArr2);
        b(f7, cVar2);
        return cVar2;
    }

    private static void b(float f7, c cVar) {
        synchronized (f36212c) {
            a0<InterfaceC4921a> clone = f36211b.clone();
            clone.d((int) (f7 * 100.0f), cVar);
            f36211b = clone;
            Unit unit = Unit.f71690a;
        }
    }
}
