package Ve;

import W2.f;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.da, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4180da implements InterfaceC4436m7 {

    /* renamed from: a, reason: collision with root package name */
    public final Ma f30861a;

    /* renamed from: b, reason: collision with root package name */
    public final xe.M f30862b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f30863c;

    public C4180da(Ma defaultPreferences, xe.M scope) {
        Intrinsics.checkNotNullParameter(defaultPreferences, "defaultPreferences");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f30861a = defaultPreferences;
        this.f30862b = scope;
        this.f30863c = Sc.k.a(Sc.n.SYNCHRONIZED, new Bl0.M(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C4180da c4180da, kotlin.coroutines.jvm.internal.c cVar) {
        Y8 y82;
        int i11;
        c4180da.getClass();
        if (cVar instanceof Y8) {
            y82 = (Y8) cVar;
            int i12 = y82.f30446g;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                y82.f30446g = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = y82.f30444e;
                Object obj2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = y82.f30446g;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    String str = y82.f30443d;
                    Sc.s.b(obj);
                    return str;
                }
                Sc.s.b(obj);
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID()\n            .toString()");
                StringBuilder sb2 = new StringBuilder();
                for (int i13 = 0; i13 < uuid.length(); i13++) {
                    char charAt = uuid.charAt(i13);
                    if (charAt != '-') {
                        sb2.append(charAt);
                    }
                }
                String sb3 = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
                String upperCase = kotlin.text.h.q0(16, sb3).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                Ma.f29467a.getClass();
                f.a aVar = C4381ka.f31431b;
                y82.f30443d = upperCase;
                y82.f30446g = 1;
                Le le2 = (Le) c4180da.f30861a;
                Object a11 = AbstractC4445mg.f31590b.getValue(le2.f29422b, AbstractC4445mg.f31589a[0]).a(new Dd(upperCase, le2, aVar, null), y82);
                if (a11 != Wc.a.COROUTINE_SUSPENDED) {
                    a11 = Unit.f71690a;
                }
                return a11 == obj2 ? obj2 : upperCase;
            }
        }
        y82 = new Y8(c4180da, cVar);
        Object obj3 = y82.f30444e;
        Object obj22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = y82.f30446g;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v2, types: [Sc.j, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(kotlin.coroutines.jvm.internal.c cVar) {
        A9 a92;
        int i11;
        if (cVar instanceof A9) {
            a92 = (A9) cVar;
            int i12 = a92.f28592f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                a92.f28592f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = a92.f28590d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = a92.f28592f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    xe.U u11 = (xe.U) this.f30863c.getValue();
                    a92.f28592f = 1;
                    obj = u11.s(a92);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return (String) obj;
            }
        }
        a92 = new A9(this, cVar);
        Object obj2 = a92.f28590d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = a92.f28592f;
        if (i11 != 0) {
        }
        return (String) obj2;
    }
}
