package S0;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class z1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<T> f25607a = new ArrayList<>();

    public final void a() {
        this.f25607a.clear();
    }

    public final int b() {
        return this.f25607a.size();
    }

    public final boolean c() {
        return this.f25607a.isEmpty();
    }

    public final boolean d() {
        return !this.f25607a.isEmpty();
    }

    public final T e() {
        return (T) C.o0.b(1, this.f25607a);
    }

    public final T f(int i11) {
        return this.f25607a.get(i11);
    }

    public final T g() {
        return this.f25607a.remove(r0.size() - 1);
    }

    public final void h(Object obj) {
        this.f25607a.add(obj);
    }

    @NotNull
    public final T[] i() {
        ArrayList<T> arrayList = this.f25607a;
        int size = arrayList.size();
        T[] tArr = (T[]) new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            tArr[i11] = arrayList.get(i11);
        }
        return tArr;
    }
}
