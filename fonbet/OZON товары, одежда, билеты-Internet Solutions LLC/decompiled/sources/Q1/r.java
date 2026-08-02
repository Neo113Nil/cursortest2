package Q1;

import B0.C2454a;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private static final r f22908g;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22909a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22910b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f22911c;

    /* renamed from: d, reason: collision with root package name */
    private final int f22912d;

    /* renamed from: e, reason: collision with root package name */
    private final int f22913e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final R1.c f22914f;

    static {
        R1.c cVar;
        cVar = R1.c.f24233c;
        f22908g = new r(false, 0, true, 1, 1, cVar);
    }

    public r(boolean z11, int i11, boolean z12, int i12, int i13, R1.c cVar) {
        this.f22909a = z11;
        this.f22910b = i11;
        this.f22911c = z12;
        this.f22912d = i12;
        this.f22913e = i13;
        this.f22914f = cVar;
    }

    public final boolean b() {
        return this.f22911c;
    }

    public final int c() {
        return this.f22910b;
    }

    @NotNull
    public final R1.c d() {
        return this.f22914f;
    }

    public final int e() {
        return this.f22913e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        if (this.f22909a != rVar.f22909a) {
            return false;
        }
        if (this.f22910b != rVar.f22910b || this.f22911c != rVar.f22911c) {
            return false;
        }
        if (this.f22912d == rVar.f22912d) {
            if (this.f22913e == rVar.f22913e) {
                rVar.getClass();
                return Intrinsics.d(this.f22914f, rVar.f22914f);
            }
        }
        return false;
    }

    public final int f() {
        return this.f22912d;
    }

    public final boolean g() {
        return this.f22909a;
    }

    public final int hashCode() {
        return this.f22914f.hashCode() + C2454a.a(this.f22913e, C2454a.a(this.f22912d, C3532b.a(C2454a.a(this.f22910b, Boolean.hashCode(this.f22909a) * 31, 31), 31, this.f22911c), 31), 961);
    }

    @NotNull
    public final String toString() {
        return "ImeOptions(singleLine=" + this.f22909a + ", capitalization=" + ((Object) C3852v.b(this.f22910b)) + ", autoCorrect=" + this.f22911c + ", keyboardType=" + ((Object) C3853w.b(this.f22912d)) + ", imeAction=" + ((Object) C3848q.b(this.f22913e)) + ", platformImeOptions=null, hintLocales=" + this.f22914f + ')';
    }
}
