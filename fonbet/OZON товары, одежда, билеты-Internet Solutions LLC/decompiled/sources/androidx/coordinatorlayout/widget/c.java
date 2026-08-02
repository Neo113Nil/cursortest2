package androidx.coordinatorlayout.widget;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.collection.Z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import x2.g;

/* loaded from: classes.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final g f41901a = new g(10);

    /* renamed from: b, reason: collision with root package name */
    private final Z<T, ArrayList<T>> f41902b = new Z<>();

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<T> f41903c = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashSet<T> f41904d = new HashSet<>();

    private void e(T t2, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t2)) {
            return;
        }
        if (hashSet.contains(t2)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(t2);
        ArrayList<T> arrayList2 = this.f41902b.get(t2);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                e(arrayList2.get(i11), arrayList, hashSet);
            }
        }
        hashSet.remove(t2);
        arrayList.add(t2);
    }

    public final void a(@NonNull View view, @NonNull View view2) {
        Z<T, ArrayList<T>> z11 = this.f41902b;
        if (!z11.containsKey(view) || !z11.containsKey(view2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList<T> arrayList = z11.get(view);
        if (arrayList == null) {
            arrayList = (ArrayList) this.f41901a.a();
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            z11.put(view, arrayList);
        }
        arrayList.add(view2);
    }

    public final void b(@NonNull View view) {
        Z<T, ArrayList<T>> z11 = this.f41902b;
        if (z11.containsKey(view)) {
            return;
        }
        z11.put(view, null);
    }

    public final void c() {
        Z<T, ArrayList<T>> z11 = this.f41902b;
        int size = z11.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> n11 = z11.n(i11);
            if (n11 != null) {
                n11.clear();
                this.f41901a.b(n11);
            }
        }
        z11.clear();
    }

    public final boolean d(@NonNull View view) {
        return this.f41902b.containsKey(view);
    }

    public final List f(@NonNull View view) {
        return this.f41902b.get(view);
    }

    public final ArrayList g(@NonNull View view) {
        Z<T, ArrayList<T>> z11 = this.f41902b;
        int size = z11.size();
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> n11 = z11.n(i11);
            if (n11 != null && n11.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(z11.j(i11));
            }
        }
        return arrayList;
    }

    @NonNull
    public final ArrayList<T> h() {
        ArrayList<T> arrayList = this.f41903c;
        arrayList.clear();
        HashSet<T> hashSet = this.f41904d;
        hashSet.clear();
        Z<T, ArrayList<T>> z11 = this.f41902b;
        int size = z11.size();
        for (int i11 = 0; i11 < size; i11++) {
            e(z11.j(i11), arrayList, hashSet);
        }
        return arrayList;
    }

    public final boolean i(@NonNull View view) {
        Z<T, ArrayList<T>> z11 = this.f41902b;
        int size = z11.size();
        for (int i11 = 0; i11 < size; i11++) {
            ArrayList<T> n11 = z11.n(i11);
            if (n11 != null && n11.contains(view)) {
                return true;
            }
        }
        return false;
    }
}
