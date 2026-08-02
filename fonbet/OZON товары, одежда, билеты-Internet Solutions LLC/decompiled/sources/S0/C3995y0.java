package S0;

import gd.InterfaceC6712a;
import gd.InterfaceC6714c;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* renamed from: S0.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3995y0 extends AbstractC7737t implements Function0<C3976o0<Object, C3940a0>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C3997z0 f25589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3995y0(C3997z0 c3997z0) {
        super(0);
        this.f25589b = c3997z0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [S0.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    @Override // kotlin.jvm.functions.Function0
    public final C3976o0<Object, C3940a0> invoke() {
        C3997z0 c3997z0 = this.f25589b;
        androidx.collection.L l11 = new androidx.collection.L(((ArrayList) c3997z0.b()).size());
        int size = ((ArrayList) c3997z0.b()).size();
        for (int i11 = 0; i11 < size; i11++) {
            ?? r52 = (C3940a0) ((ArrayList) c3997z0.b()).get(i11);
            Object z11 = r52.d() != null ? new Z(Integer.valueOf(r52.a()), r52.d()) : Integer.valueOf(r52.a());
            int e11 = l11.e(z11);
            boolean z12 = e11 < 0;
            Object obj = z12 ? null : l11.f38658c[e11];
            if (obj != null) {
                if (!(obj instanceof List) || ((obj instanceof InterfaceC6712a) && !(obj instanceof InterfaceC6714c))) {
                    r52 = C7714v.m0(obj, r52);
                } else {
                    List c11 = kotlin.jvm.internal.U.c(obj);
                    c11.add(r52);
                    r52 = c11;
                }
            }
            if (z12) {
                int i12 = ~e11;
                l11.f38657b[i12] = z11;
                l11.f38658c[i12] = r52;
            } else {
                l11.f38658c[e11] = r52;
            }
        }
        return C3976o0.a(l11);
    }
}
