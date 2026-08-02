package S0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private ArrayList<Object> f25318a;

    private final boolean c(C3945c c3945c) {
        ArrayList<Object> arrayList = this.f25318a;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                Object obj = arrayList.get(i11);
                if (Intrinsics.d(obj, c3945c)) {
                    return true;
                }
                if ((obj instanceof V) && ((V) obj).c(c3945c)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final V d() {
        Object obj;
        ArrayList<Object> arrayList = this.f25318a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                obj = arrayList.get(size);
                if (obj instanceof V) {
                    ((V) obj).getClass();
                    break;
                }
            }
        }
        obj = null;
        V v11 = obj instanceof V ? (V) obj : null;
        return v11 != null ? v11.d() : this;
    }

    public final void a(@NotNull C3953e1 c3953e1, int i11, int i12) {
        C3945c T02;
        ArrayList<Object> arrayList = this.f25318a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f25318a = arrayList;
        }
        int i13 = 0;
        if (i11 >= 0 && (T02 = c3953e1.T0(i11)) != null) {
            int size = arrayList.size();
            while (true) {
                if (i13 >= size) {
                    i13 = -1;
                    break;
                }
                Object obj = arrayList.get(i13);
                if (Intrinsics.d(obj, T02) || ((obj instanceof V) && ((V) obj).c(T02))) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        arrayList.add(i13, c3953e1.E(i12));
    }

    public final ArrayList<Object> b() {
        return this.f25318a;
    }

    public final boolean e(@NotNull C3945c c3945c) {
        ArrayList<Object> arrayList = this.f25318a;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Object obj = arrayList.get(size);
                if (obj instanceof C3945c) {
                    if (Intrinsics.d(obj, c3945c)) {
                        arrayList.remove(size);
                    }
                } else if ((obj instanceof V) && !((V) obj).e(c3945c)) {
                    arrayList.remove(size);
                }
            }
            if (arrayList.isEmpty()) {
                this.f25318a = null;
                return false;
            }
        }
        return true;
    }

    public final void f(@NotNull C3953e1 c3953e1, int i11) {
        V d11 = d();
        C3945c E11 = c3953e1.E(i11);
        ArrayList<Object> arrayList = d11.f25318a;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        d11.f25318a = arrayList;
        arrayList.add(E11);
    }
}
