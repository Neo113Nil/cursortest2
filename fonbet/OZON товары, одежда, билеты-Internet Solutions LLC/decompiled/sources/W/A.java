package W;

import W.C4845p;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final List<C4852x> f32855a;

    /* renamed from: b, reason: collision with root package name */
    private final C4845p f32856b;

    A(@NonNull List<C4852x> list, @NonNull C4845p c4845p) {
        x2.i.a("No preferred quality and fallback strategy.", (list.isEmpty() && c4845p == C4845p.f33113a) ? false : true);
        this.f32855a = Collections.unmodifiableList(new ArrayList(list));
        this.f32856b = c4845p;
    }

    @NonNull
    public static A a(@NonNull C4852x c4852x, @NonNull C4845p c4845p) {
        x2.i.e(c4852x, "quality cannot be null");
        x2.i.a("Invalid quality: " + c4852x, C4852x.a(c4852x));
        return new A(Collections.singletonList(c4852x), c4845p);
    }

    @NonNull
    public static A b(@NonNull List<C4852x> list, @NonNull C4845p c4845p) {
        x2.i.e(list, "qualities cannot be null");
        x2.i.a("qualities cannot be empty", !list.isEmpty());
        for (C4852x c4852x : list) {
            x2.i.a("qualities contain invalid quality: " + c4852x, C4852x.a(c4852x));
        }
        return new A(list, c4845p);
    }

    @NonNull
    final ArrayList c(@NonNull List list) {
        if (list.isEmpty()) {
            C.S.k("QualitySelector", "No supported quality on the device.");
            return new ArrayList();
        }
        C.S.a("QualitySelector", "supportedQualities = " + list);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C4852x> it = this.f32855a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4852x next = it.next();
            if (next == C4852x.f33152f) {
                linkedHashSet.addAll(list);
                break;
            }
            if (next == C4852x.f33151e) {
                ArrayList arrayList = new ArrayList(list);
                Collections.reverse(arrayList);
                linkedHashSet.addAll(arrayList);
                break;
            }
            if (list.contains(next)) {
                linkedHashSet.add(next);
            } else {
                C.S.k("QualitySelector", "quality is not supported and will be ignored: " + next);
            }
        }
        if (!list.isEmpty() && !linkedHashSet.containsAll(list)) {
            StringBuilder sb2 = new StringBuilder("Select quality by fallbackStrategy = ");
            C4845p c4845p = this.f32856b;
            sb2.append(c4845p);
            C.S.a("QualitySelector", sb2.toString());
            if (c4845p != C4845p.f33113a) {
                x2.i.f("Currently only support type RuleStrategy", Objects.nonNull(c4845p));
                C4845p.a aVar = (C4845p.a) c4845p;
                ArrayList b11 = C4852x.b();
                C4852x b12 = aVar.b() == C4852x.f33152f ? (C4852x) b11.get(0) : aVar.b() == C4852x.f33151e ? (C4852x) C.o0.b(1, b11) : aVar.b();
                int indexOf = b11.indexOf(b12);
                x2.i.f(null, indexOf != -1);
                ArrayList arrayList2 = new ArrayList();
                for (int i11 = indexOf - 1; i11 >= 0; i11--) {
                    C4852x c4852x = (C4852x) b11.get(i11);
                    if (list.contains(c4852x)) {
                        arrayList2.add(c4852x);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (int i12 = indexOf + 1; i12 < b11.size(); i12++) {
                    C4852x c4852x2 = (C4852x) b11.get(i12);
                    if (list.contains(c4852x2)) {
                        arrayList3.add(c4852x2);
                    }
                }
                C.S.a("QualitySelector", "sizeSortedQualities = " + b11 + ", fallback quality = " + b12 + ", largerQualities = " + arrayList2 + ", smallerQualities = " + arrayList3);
                int c11 = aVar.c();
                if (c11 != 0) {
                    if (c11 == 1) {
                        linkedHashSet.addAll(arrayList2);
                        linkedHashSet.addAll(arrayList3);
                    } else if (c11 == 2) {
                        linkedHashSet.addAll(arrayList2);
                    } else if (c11 == 3) {
                        linkedHashSet.addAll(arrayList3);
                        linkedHashSet.addAll(arrayList2);
                    } else {
                        if (c11 != 4) {
                            throw new AssertionError("Unhandled fallback strategy: " + c4845p);
                        }
                        linkedHashSet.addAll(arrayList3);
                    }
                }
            }
        }
        return new ArrayList(linkedHashSet);
    }

    @NonNull
    public final String toString() {
        return "QualitySelector{preferredQualities=" + this.f32855a + ", fallbackStrategy=" + this.f32856b + "}";
    }
}
