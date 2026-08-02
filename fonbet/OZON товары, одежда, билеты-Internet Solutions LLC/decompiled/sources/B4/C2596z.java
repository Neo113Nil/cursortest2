package B4;

import androidx.lifecycle.A0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"LB4/z;", "Landroidx/lifecycle/w0;", "LB4/X;", "<init>", "()V", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: B4.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C2596z extends w0 implements X {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final a f2722b = new a();

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f2723a = new LinkedHashMap();

    /* renamed from: B4.z$a */
    public static final class a implements z0.b {
        @Override // androidx.lifecycle.z0.b
        public final <T extends w0> T create(Class<T> modelClass) {
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            return new C2596z();
        }
    }

    @Override // B4.X
    @NotNull
    public final A0 I(@NotNull String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        LinkedHashMap linkedHashMap = this.f2723a;
        A0 a02 = (A0) linkedHashMap.get(backStackEntryId);
        if (a02 != null) {
            return a02;
        }
        A0 a03 = new A0();
        linkedHashMap.put(backStackEntryId, a03);
        return a03;
    }

    public final void e0(@NotNull String backStackEntryId) {
        Intrinsics.checkNotNullParameter(backStackEntryId, "backStackEntryId");
        A0 a02 = (A0) this.f2723a.remove(backStackEntryId);
        if (a02 != null) {
            a02.a();
        }
    }

    @Override // androidx.lifecycle.w0
    protected final void onCleared() {
        LinkedHashMap linkedHashMap = this.f2723a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((A0) it.next()).a();
        }
        linkedHashMap.clear();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavControllerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} ViewModelStores (");
        Iterator it = this.f2723a.keySet().iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "sb.toString()");
        return sb3;
    }
}
