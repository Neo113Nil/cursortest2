package W;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.I0;
import androidx.camera.core.impl.InterfaceC5084b0;
import f0.C6390a;
import f0.C6391b;
import f0.C6392c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class V implements Z {

    /* renamed from: b, reason: collision with root package name */
    private final C6392c f32985b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f32986c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap f32987d = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [Y.b] */
    V(@NonNull androidx.camera.core.impl.H h11) {
        InterfaceC5084b0 h12 = h11.h();
        I0 c11 = androidx.camera.video.internal.compat.quirk.a.c();
        C6391b c6391b = new C6391b(new C6390a(h11, h12, c11), c11);
        Iterator<C.A> it = h11.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C.A next = it.next();
            Integer valueOf = Integer.valueOf(next.b());
            int a11 = next.a();
            if (valueOf.equals(3) && a11 == 10) {
                c6391b = new Y.b(c6391b);
                break;
            }
        }
        this.f32985b = new C6392c(h11, c6391b, c11);
        for (C.A a12 : h11.a()) {
            C4844o c4844o = new C4844o(new Y.e(this.f32985b, a12));
            if (!c4844o.c().isEmpty()) {
                this.f32986c.put(a12, c4844o);
            }
        }
        h11.n();
    }

    private C4844o e(@NonNull C.A dynamicRangeToTest) {
        Object obj;
        boolean z11;
        boolean d11 = dynamicRangeToTest.d();
        HashMap hashMap = this.f32986c;
        if (d11) {
            return (C4844o) hashMap.get(dynamicRangeToTest);
        }
        HashMap hashMap2 = this.f32987d;
        if (hashMap2.containsKey(dynamicRangeToTest)) {
            return (C4844o) hashMap2.get(dynamicRangeToTest);
        }
        Set fullySpecifiedDynamicRanges = hashMap.keySet();
        Intrinsics.checkNotNullParameter(dynamicRangeToTest, "dynamicRangeToTest");
        Intrinsics.checkNotNullParameter(fullySpecifiedDynamicRanges, "fullySpecifiedDynamicRanges");
        if (dynamicRangeToTest.d()) {
            z11 = fullySpecifiedDynamicRanges.contains(dynamicRangeToTest);
        } else {
            Iterator it = fullySpecifiedDynamicRanges.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                C.A a11 = (C.A) obj;
                x2.i.f("Fully specified range is not actually fully specified.", a11.d());
                if (dynamicRangeToTest.a() == 0 || dynamicRangeToTest.a() == a11.a()) {
                    x2.i.f("Fully specified range is not actually fully specified.", a11.d());
                    int b11 = dynamicRangeToTest.b();
                    if (b11 != 0) {
                        int b12 = a11.b();
                        if ((b11 == 2 && b12 != 1) || b11 == b12) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z11 = obj != null;
        }
        C4844o c4844o = z11 ? new C4844o(new Y.e(this.f32985b, dynamicRangeToTest)) : null;
        hashMap2.put(dynamicRangeToTest, c4844o);
        return c4844o;
    }

    @Override // W.Z
    public final Y.f a(@NonNull C4852x c4852x, @NonNull C.A a11) {
        C4844o e11 = e(a11);
        if (e11 == null) {
            return null;
        }
        return e11.b(c4852x);
    }

    @Override // W.Z
    @NonNull
    public final ArrayList b(@NonNull C.A a11) {
        C4844o e11 = e(a11);
        return e11 == null ? new ArrayList() : e11.c();
    }

    @Override // W.Z
    public final Y.f c(@NonNull Size size, @NonNull C.A a11) {
        C4844o e11 = e(a11);
        if (e11 == null) {
            return null;
        }
        C4852x a12 = e11.a(size);
        C.S.a("CapabilitiesByQuality", "Using supported quality of " + a12 + " for size " + size);
        if (a12 == C4852x.f33153g) {
            return null;
        }
        Y.f b11 = e11.b(a12);
        if (b11 != null) {
            return b11;
        }
        throw new AssertionError("Camera advertised available quality but did not produce EncoderProfiles for advertised quality.");
    }

    @NonNull
    public final C4852x d(@NonNull Size size, @NonNull C.A a11) {
        C4844o e11 = e(a11);
        return e11 == null ? C4852x.f33153g : e11.a(size);
    }
}
