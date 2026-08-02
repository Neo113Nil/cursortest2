package R;

import C.S;
import G.r;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.InterfaceC5121u0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.b1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    private static final double f23837h = Math.sqrt(2.3703703703703702d);

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final Size f23838a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    private final Rational f23839b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final Rational f23840c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    private final HashSet f23841d;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final J.k f23842e;

    /* renamed from: f, reason: collision with root package name */
    @NonNull
    private final H f23843f;

    /* renamed from: g, reason: collision with root package name */
    @NonNull
    private final HashMap f23844g;

    /* renamed from: R.a$a, reason: collision with other inner class name */
    private static class C0480a implements Comparator<Rational> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final Rational f23845a;

        C0480a(@NonNull Rational rational) {
            this.f23845a = rational;
        }

        @Override // java.util.Comparator
        public final int compare(@NonNull Rational rational, @NonNull Rational rational2) {
            Rational rational3 = rational2;
            Rational rational4 = this.f23845a;
            float floatValue = rational.floatValue();
            float floatValue2 = rational4.floatValue();
            float f7 = floatValue > floatValue2 ? floatValue2 / floatValue : floatValue / floatValue2;
            float floatValue3 = rational3.floatValue();
            float floatValue4 = rational4.floatValue();
            return Float.compare(floatValue3 > floatValue4 ? floatValue4 / floatValue3 : floatValue3 / floatValue4, f7);
        }
    }

    a(@NonNull I i11, @NonNull HashSet hashSet) {
        Size e11 = r.e(i11.k().k());
        H e12 = i11.e();
        J.k kVar = new J.k(e12, e11);
        this.f23844g = new HashMap();
        this.f23838a = e11;
        Rational rational = ((double) e11.getWidth()) / ((double) e11.getHeight()) > f23837h ? G.a.f9594c : G.a.f9592a;
        S.a("ResolutionsMerger", "The closer aspect ratio to the sensor size (" + e11 + ") is " + rational + ".");
        this.f23839b = rational;
        Rational rational2 = G.a.f9592a;
        if (rational.equals(rational2)) {
            rational2 = G.a.f9594c;
        } else if (!rational.equals(G.a.f9594c)) {
            throw new IllegalArgumentException("Invalid sensor aspect-ratio: " + rational);
        }
        this.f23840c = rational2;
        this.f23843f = e12;
        this.f23841d = hashSet;
        this.f23842e = kVar;
    }

    @NonNull
    static Rect a(@NonNull Size size, @NonNull Size size2) {
        RectF rectF;
        RectF rectF2;
        Rational i11 = i(size2);
        int width = size.getWidth();
        int height = size.getHeight();
        Rational i12 = i(size);
        if (i11.floatValue() == i12.floatValue()) {
            rectF2 = new RectF(0.0f, 0.0f, width, height);
        } else {
            if (i11.floatValue() > i12.floatValue()) {
                float f7 = width;
                float floatValue = f7 / i11.floatValue();
                float f11 = (height - floatValue) / 2.0f;
                rectF = new RectF(0.0f, f11, f7, floatValue + f11);
            } else {
                float f12 = height;
                float floatValue2 = i11.floatValue() * f12;
                float f13 = (width - floatValue2) / 2.0f;
                rectF = new RectF(f13, 0.0f, floatValue2 + f13, f12);
            }
            rectF2 = rectF;
        }
        Rect rect = new Rect();
        rectF2.round(rect);
        return rect;
    }

    @NonNull
    private List<Size> d(@NonNull b1<?> b1Var) {
        Rational rational;
        if (!this.f23841d.contains(b1Var)) {
            throw new IllegalArgumentException("Invalid child config: " + b1Var);
        }
        HashMap hashMap = this.f23844g;
        if (hashMap.containsKey(b1Var)) {
            List<Size> list = (List) hashMap.get(b1Var);
            Objects.requireNonNull(list);
            return list;
        }
        List<Size> b11 = this.f23842e.b(b1Var);
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) b11).iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Iterator it2 = hashMap2.keySet().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    rational = null;
                    break;
                }
                rational = (Rational) it2.next();
                Rational rational2 = G.a.f9592a;
                if (G.a.a(size, rational, M.c.f17201c)) {
                    break;
                }
            }
            if (rational != null) {
                Size size2 = (Size) hashMap2.get(rational);
                Objects.requireNonNull(size2);
                if (size.getHeight() <= size2.getHeight()) {
                    if (size.getWidth() <= size2.getWidth()) {
                        if (size.getWidth() == size2.getWidth() && size.getHeight() == size2.getHeight()) {
                        }
                    }
                }
            } else {
                rational = i(size);
            }
            arrayList.add(size);
            hashMap2.put(rational, size);
        }
        hashMap.put(b1Var, arrayList);
        return arrayList;
    }

    static boolean e(@NonNull Size size, @NonNull Size size2) {
        return size.getHeight() > size2.getHeight() || size.getWidth() > size2.getWidth();
    }

    private boolean f(@NonNull Rational rational, @NonNull Size size) {
        Rational rational2 = this.f23839b;
        if (rational2.equals(rational)) {
            return false;
        }
        Rational rational3 = G.a.f9592a;
        Size size2 = M.c.f17201c;
        if (G.a.a(size, rational, size2)) {
            return false;
        }
        float floatValue = rational2.floatValue();
        float floatValue2 = rational.floatValue();
        Rational rational4 = G.a.f9592a;
        if (!G.a.a(size, rational4, size2)) {
            rational4 = G.a.f9594c;
            if (!G.a.a(size, rational4, size2)) {
                rational4 = i(size);
            }
        }
        float floatValue3 = rational4.floatValue();
        if (floatValue == floatValue2 || floatValue2 == floatValue3) {
            return false;
        }
        return floatValue > floatValue2 ? floatValue2 < floatValue3 : floatValue2 > floatValue3;
    }

    @NonNull
    private ArrayList g(@NonNull List list, boolean z11) {
        List list2;
        HashMap hashMap = new HashMap();
        Rational rational = G.a.f9592a;
        hashMap.put(rational, new ArrayList());
        Rational rational2 = G.a.f9594c;
        hashMap.put(rational2, new ArrayList());
        ArrayList arrayList = new ArrayList();
        arrayList.add(rational);
        arrayList.add(rational2);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            if (size.getHeight() > 0) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        list2 = null;
                        break;
                    }
                    Rational rational3 = (Rational) it2.next();
                    if (G.a.a(size, rational3, M.c.f17201c)) {
                        list2 = (List) hashMap.get(rational3);
                        break;
                    }
                }
                if (list2 == null) {
                    list2 = new ArrayList();
                    Rational i11 = i(size);
                    arrayList.add(i11);
                    hashMap.put(i11, list2);
                }
                list2.add(size);
            }
        }
        ArrayList arrayList2 = new ArrayList(hashMap.keySet());
        Collections.sort(arrayList2, new C0480a(i(this.f23838a)));
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            Rational rational4 = (Rational) it3.next();
            if (!rational4.equals(G.a.f9594c) && !rational4.equals(G.a.f9592a)) {
                List list3 = (List) hashMap.get(rational4);
                Objects.requireNonNull(list3);
                arrayList3.addAll(h(rational4, list3, z11));
            }
        }
        return arrayList3;
    }

    private ArrayList h(@NonNull Rational rational, @NonNull List list, boolean z11) {
        ArrayList arrayList;
        ArrayList<Size> arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Size size = (Size) it.next();
            Rational rational2 = G.a.f9592a;
            if (G.a.a(size, rational, M.c.f17201c)) {
                arrayList2.add(size);
            }
        }
        Collections.sort(arrayList2, new G.e(true));
        HashSet hashSet = new HashSet(arrayList2);
        Iterator it2 = this.f23841d.iterator();
        while (it2.hasNext()) {
            List<Size> d11 = d((b1) it2.next());
            if (!z11) {
                ArrayList arrayList3 = new ArrayList();
                for (Size size2 : d11) {
                    if (!f(rational, size2)) {
                        arrayList3.add(size2);
                    }
                }
                d11 = arrayList3;
            }
            if (d11.isEmpty()) {
                return new ArrayList();
            }
            if (d11.isEmpty() || arrayList2.isEmpty()) {
                arrayList2 = new ArrayList();
            } else {
                ArrayList arrayList4 = new ArrayList();
                for (Size size3 : arrayList2) {
                    Iterator<Size> it3 = d11.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if (!e(it3.next(), size3)) {
                            arrayList4.add(size3);
                            break;
                        }
                    }
                }
                arrayList2 = arrayList4;
            }
            if (d11.isEmpty() || arrayList2.isEmpty()) {
                arrayList = new ArrayList();
            } else {
                ArrayList<Size> arrayList5 = arrayList2.isEmpty() ? arrayList2 : new ArrayList(new LinkedHashSet(arrayList2));
                arrayList = new ArrayList();
                for (Size size4 : arrayList5) {
                    Iterator<Size> it4 = d11.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            arrayList.add(size4);
                            break;
                        }
                        if (e(it4.next(), size4)) {
                            break;
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    Ej.b.b(1, arrayList);
                }
            }
            hashSet.retainAll(arrayList);
        }
        ArrayList arrayList6 = new ArrayList();
        for (Size size5 : arrayList2) {
            if (!hashSet.contains(size5)) {
                arrayList6.add(size5);
            }
        }
        return arrayList6;
    }

    @NonNull
    private static Rational i(@NonNull Size size) {
        return new Rational(size.getWidth(), size.getHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    final ArrayList b(@NonNull InterfaceC5121u0 interfaceC5121u0) {
        Object obj;
        Rational rational;
        List<Size> arrayList;
        Q.b E11;
        H h11 = this.f23843f;
        List<Size> m11 = h11.m(34);
        HashSet hashSet = this.f23841d;
        Iterator it = hashSet.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            b1 b1Var = (b1) it.next();
            if (!b1Var.j() && (b1Var instanceof InterfaceC5102k0) && (E11 = ((InterfaceC5102k0) b1Var).E()) != null && E11.a() == 1) {
                ArrayList arrayList2 = new ArrayList(m11);
                arrayList2.addAll(h11.j(34));
                m11 = arrayList2;
                break;
            }
        }
        T.a<List<Pair<Integer, Size[]>>> aVar = InterfaceC5102k0.f38349s;
        A0 a02 = (A0) interfaceC5121u0;
        a02.getClass();
        try {
            obj = a02.a(aVar);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList = new ArrayList<>();
                    break;
                }
                Pair pair = (Pair) it2.next();
                if (((Integer) pair.first).equals(34)) {
                    arrayList = Arrays.asList((Size[]) pair.second);
                    break;
                }
            }
            m11 = arrayList;
        }
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        Iterator it3 = hashSet.iterator();
        while (it3.hasNext()) {
            hashSet2.addAll(d((b1) it3.next()));
        }
        Iterator it4 = hashSet2.iterator();
        while (true) {
            boolean hasNext = it4.hasNext();
            rational = this.f23840c;
            if (!hasNext) {
                break;
            }
            Size size = (Size) it4.next();
            Rational rational2 = G.a.f9592a;
            if (!G.a.a(size, rational, M.c.f17201c)) {
                arrayList3.addAll(h(this.f23839b, m11, false));
                break;
            }
        }
        arrayList3.addAll(h(rational, m11, false));
        arrayList3.addAll(g(m11, false));
        if (arrayList3.isEmpty()) {
            S.k("ResolutionsMerger", "Failed to find a parent resolution that does not result in double-cropping, this might due to camera not supporting 4:3 and 16:9resolutions or a strict ResolutionSelector settings. Starting resolution selection process with resolutions that might have a smaller FOV.");
            arrayList3.addAll(g(m11, true));
        }
        S.a("ResolutionsMerger", "Parent resolutions: " + arrayList3);
        return arrayList3;
    }

    @NonNull
    final Pair<Rect, Size> c(@NonNull b1<?> b1Var, @NonNull Rect rect, int i11, boolean z11) {
        boolean z12;
        Size size;
        if (r.c(i11)) {
            z12 = true;
            rect = new Rect(rect.top, rect.left, rect.bottom, rect.right);
        } else {
            z12 = false;
        }
        if (z11) {
            size = r.e(rect);
            Iterator<Size> it = d(b1Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Size e11 = r.e(a(it.next(), size));
                if (!e(e11, size)) {
                    size = e11;
                    break;
                }
            }
        } else {
            Size e12 = r.e(rect);
            List<Size> d11 = d(b1Var);
            Iterator<Size> it2 = d11.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Iterator<Size> it3 = d11.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            size = e12;
                            break;
                        }
                        size = it3.next();
                        if (!e(size, e12)) {
                            break;
                        }
                    }
                } else {
                    Size next = it2.next();
                    Rational rational = G.a.f9592a;
                    Size size2 = M.c.f17201c;
                    if (!G.a.a(e12, rational, size2)) {
                        rational = G.a.f9594c;
                        if (!G.a.a(e12, rational, size2)) {
                            rational = i(e12);
                        }
                    }
                    if (!f(rational, next) && !e(next, e12)) {
                        size = next;
                        break;
                    }
                }
            }
            rect = a(e12, size);
        }
        Pair pair = new Pair(rect, size);
        Rect rect2 = (Rect) pair.first;
        Size size3 = (Size) pair.second;
        if (z12) {
            Size size4 = new Size(size3.getHeight(), size3.getWidth());
            rect2 = new Rect(rect2.top, rect2.left, rect2.bottom, rect2.right);
            size3 = size4;
        }
        return new Pair<>(rect2, size3);
    }
}
