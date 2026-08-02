package G1;

import androidx.lifecycle.S;
import androidx.lifecycle.X;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class r extends S {

    /* renamed from: b, reason: collision with root package name */
    public static final q f1932b = new q(0);

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1933a = new LinkedHashMap();

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        LinkedHashMap linkedHashMap = this.f1933a;
        Iterator it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            ((X) it.next()).a();
        }
        linkedHashMap.clear();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavControllerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} ViewModelStores (");
        Iterator it = this.f1933a.keySet().iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        String sb2 = sb.toString();
        kotlin.jvm.internal.l.e("sb.toString()", sb2);
        return sb2;
    }
}
