package Ub;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* loaded from: classes9.dex */
final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f27519a = new HashMap(3);

    s() {
    }

    public final <T> T a(@NonNull p<T> pVar) {
        return (T) this.f27519a.get(pVar);
    }

    @NonNull
    public final Object b(@NonNull p pVar) {
        Boolean bool = Boolean.FALSE;
        Object obj = this.f27519a.get(pVar);
        return obj != null ? obj : bool;
    }

    public final <T> void c(@NonNull p<T> pVar, T t2) {
        HashMap hashMap = this.f27519a;
        if (t2 == null) {
            hashMap.remove(pVar);
        } else {
            hashMap.put(pVar, t2);
        }
    }
}
