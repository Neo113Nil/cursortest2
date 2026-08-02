package W;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: W.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C4854z {

    /* renamed from: b, reason: collision with root package name */
    private static final HashMap f33157b;

    /* renamed from: c, reason: collision with root package name */
    private static final HashMap f33158c;

    /* renamed from: a, reason: collision with root package name */
    private final HashMap f33159a = new HashMap();

    /* renamed from: W.z$a */
    static abstract class a {
        a() {
        }

        abstract int a();

        @NonNull
        abstract C4852x b();
    }

    static {
        HashMap hashMap = new HashMap();
        f33157b = hashMap;
        hashMap.put(C4852x.f33150d, Range.create(2160, 4319));
        hashMap.put(C4852x.f33149c, Range.create(1080, 1439));
        hashMap.put(C4852x.f33148b, Range.create(720, 1079));
        hashMap.put(C4852x.f33147a, Range.create(241, 719));
        HashMap hashMap2 = new HashMap();
        f33158c = hashMap2;
        hashMap2.put(0, G.a.f9592a);
        hashMap2.put(1, G.a.f9594c);
    }

    C4854z(@NonNull List list, @NonNull HashMap hashMap) {
        HashMap hashMap2;
        Integer num;
        C4852x c4852x;
        HashMap hashMap3 = f33157b;
        Iterator it = hashMap3.keySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            hashMap2 = f33158c;
            if (!hasNext) {
                break;
            }
            C4852x c4852x2 = (C4852x) it.next();
            this.f33159a.put(new C4838i(c4852x2, -1), new ArrayList());
            Iterator it2 = hashMap2.keySet().iterator();
            while (it2.hasNext()) {
                this.f33159a.put(new C4838i(c4852x2, ((Integer) it2.next()).intValue()), new ArrayList());
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List list2 = (List) this.f33159a.get(new C4838i((C4852x) entry.getKey(), -1));
            Objects.requireNonNull(list2);
            list2.add((Size) entry.getValue());
        }
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            Size size = (Size) it3.next();
            Iterator it4 = hashMap3.entrySet().iterator();
            while (true) {
                num = null;
                if (!it4.hasNext()) {
                    c4852x = null;
                    break;
                }
                Map.Entry entry2 = (Map.Entry) it4.next();
                if (((Range) entry2.getValue()).contains((Range) Integer.valueOf(size.getHeight()))) {
                    c4852x = (C4852x) entry2.getKey();
                    break;
                }
            }
            if (c4852x != null) {
                Iterator it5 = hashMap2.entrySet().iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Map.Entry entry3 = (Map.Entry) it5.next();
                    if (G.a.a(size, (Rational) entry3.getValue(), M.c.f17200b)) {
                        num = (Integer) entry3.getKey();
                        break;
                    }
                }
                if (num != null) {
                    List list3 = (List) this.f33159a.get(new C4838i(c4852x, num.intValue()));
                    Objects.requireNonNull(list3);
                    list3.add(size);
                }
            }
        }
        for (Map.Entry entry4 : this.f33159a.entrySet()) {
            Size size2 = (Size) hashMap.get(((a) entry4.getKey()).b());
            if (size2 != null) {
                Size size3 = M.c.f17199a;
                final int height = size2.getHeight() * size2.getWidth();
                Collections.sort((List) entry4.getValue(), new Comparator() { // from class: W.y
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int a11 = M.c.a((Size) obj);
                        int i11 = height;
                        return Math.abs(a11 - i11) - Math.abs(M.c.a((Size) obj2) - i11);
                    }
                });
            }
        }
    }

    @NonNull
    final ArrayList a(@NonNull C4852x c4852x, int i11) {
        List list = (List) this.f33159a.get(new C4838i(c4852x, i11));
        return list != null ? new ArrayList(list) : new ArrayList(0);
    }
}
