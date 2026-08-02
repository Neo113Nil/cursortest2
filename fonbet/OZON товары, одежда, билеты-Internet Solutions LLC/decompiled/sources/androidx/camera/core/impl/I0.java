package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class I0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final ArrayList f38125a;

    public I0(@NonNull List<E0> list) {
        this.f38125a = new ArrayList(list);
    }

    @NonNull
    public static String d(@NonNull I0 i02) {
        ArrayList arrayList = new ArrayList();
        Iterator it = i02.f38125a.iterator();
        while (it.hasNext()) {
            arrayList.add(((E0) it.next()).getClass().getSimpleName());
        }
        return String.join(" | ", arrayList);
    }

    public final boolean a(@NonNull Class<? extends E0> cls) {
        Iterator it = this.f38125a.iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(((E0) it.next()).getClass())) {
                return true;
            }
        }
        return false;
    }

    public final <T extends E0> T b(@NonNull Class<T> cls) {
        Iterator it = this.f38125a.iterator();
        while (it.hasNext()) {
            T t2 = (T) it.next();
            if (t2.getClass() == cls) {
                return t2;
            }
        }
        return null;
    }

    @NonNull
    public final ArrayList c(@NonNull Class cls) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f38125a.iterator();
        while (it.hasNext()) {
            E0 e02 = (E0) it.next();
            if (cls.isAssignableFrom(e02.getClass())) {
                arrayList.add(e02);
            }
        }
        return arrayList;
    }
}
