package androidx.constraintlayout.widget;

import android.util.SparseIntArray;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private HashMap<Integer, HashSet<WeakReference<a>>> f41869a;

    public interface a {
    }

    public j() {
        new SparseIntArray();
        this.f41869a = new HashMap<>();
    }

    public final void a(int i11, a aVar) {
        HashMap<Integer, HashSet<WeakReference<a>>> hashMap = this.f41869a;
        HashSet<WeakReference<a>> hashSet = hashMap.get(Integer.valueOf(i11));
        if (hashSet == null) {
            hashSet = new HashSet<>();
            hashMap.put(Integer.valueOf(i11), hashSet);
        }
        hashSet.add(new WeakReference<>(aVar));
    }
}
