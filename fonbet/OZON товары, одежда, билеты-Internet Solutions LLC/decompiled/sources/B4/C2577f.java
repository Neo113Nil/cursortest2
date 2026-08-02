package B4;

import android.os.Bundle;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: B4.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2577f {

    /* renamed from: a, reason: collision with root package name */
    private final int f2620a;

    /* renamed from: b, reason: collision with root package name */
    private S f2621b = null;

    /* renamed from: c, reason: collision with root package name */
    private Bundle f2622c = null;

    public C2577f(int i11) {
        this.f2620a = i11;
    }

    public final Bundle a() {
        return this.f2622c;
    }

    public final int b() {
        return this.f2620a;
    }

    public final S c() {
        return this.f2621b;
    }

    public final void d(Bundle bundle) {
        this.f2622c = bundle;
    }

    public final void e(S s11) {
        this.f2621b = s11;
    }

    public final boolean equals(Object obj) {
        Set<String> keySet;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2577f)) {
            C2577f c2577f = (C2577f) obj;
            if (this.f2620a == c2577f.f2620a && Intrinsics.d(this.f2621b, c2577f.f2621b)) {
                if (!Intrinsics.d(this.f2622c, c2577f.f2622c)) {
                    Bundle bundle = this.f2622c;
                    if (bundle != null && (keySet = bundle.keySet()) != null) {
                        Set<String> set = keySet;
                        if (!(set instanceof Collection) || !set.isEmpty()) {
                            for (String str : set) {
                                Bundle bundle2 = this.f2622c;
                                Object obj2 = bundle2 != null ? bundle2.get(str) : null;
                                Bundle bundle3 = c2577f.f2622c;
                                if (!Intrinsics.d(obj2, bundle3 != null ? bundle3.get(str) : null)) {
                                }
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Set<String> keySet;
        int hashCode = Integer.hashCode(this.f2620a) * 31;
        S s11 = this.f2621b;
        int hashCode2 = hashCode + (s11 != null ? s11.hashCode() : 0);
        Bundle bundle = this.f2622c;
        if (bundle != null && (keySet = bundle.keySet()) != null) {
            for (String str : keySet) {
                int i11 = hashCode2 * 31;
                Bundle bundle2 = this.f2622c;
                Object obj = bundle2 != null ? bundle2.get(str) : null;
                hashCode2 = i11 + (obj != null ? obj.hashCode() : 0);
            }
        }
        return hashCode2;
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(C2577f.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.f2620a));
        sb2.append(")");
        if (this.f2621b != null) {
            sb2.append(" navOptions=");
            sb2.append(this.f2621b);
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
