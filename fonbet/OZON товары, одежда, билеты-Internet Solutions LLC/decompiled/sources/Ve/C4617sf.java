package Ve;

import B90.C2618u;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.sf, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4617sf {

    /* renamed from: a, reason: collision with root package name */
    public final List f32049a;

    /* renamed from: b, reason: collision with root package name */
    public final List f32050b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer[] f32051c;

    public C4617sf(List adapters, List data) {
        Intrinsics.checkNotNullParameter(adapters, "adapters");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f32049a = adapters;
        this.f32050b = data;
        int size = data.size();
        Integer[] numArr = new Integer[size];
        for (int i11 = 0; i11 < size; i11++) {
            numArr[i11] = -1;
        }
        this.f32051c = numArr;
    }

    public final int a(int i11) {
        List items;
        Integer[] numArr = this.f32051c;
        Integer num = numArr[i11];
        Integer num2 = null;
        if (num.intValue() == -1) {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        Iterator it = this.f32049a.iterator();
        int i12 = 0;
        while (true) {
            boolean hasNext = it.hasNext();
            items = this.f32050b;
            if (!hasNext) {
                i12 = -1;
                break;
            }
            Kp kp2 = (Kp) it.next();
            kp2.getClass();
            Intrinsics.checkNotNullParameter(items, "items");
            if (kp2.c(items.get(i11))) {
                break;
            }
            i12++;
        }
        Integer valueOf = Integer.valueOf(i12);
        if (i12 == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            numArr[i11] = Integer.valueOf(valueOf.intValue());
            num2 = valueOf;
        }
        if (num2 != null) {
            return num2.intValue();
        }
        throw new IllegalStateException(("Provide adapter for type " + items.get(i11).getClass() + " at position: " + i11).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4617sf)) {
            return false;
        }
        C4617sf c4617sf = (C4617sf) obj;
        return Intrinsics.d(this.f32049a, c4617sf.f32049a) && Intrinsics.d(this.f32050b, c4617sf.f32050b);
    }

    public final int hashCode() {
        return this.f32050b.hashCode() + (this.f32049a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdaptersState(adapters=");
        sb2.append(this.f32049a);
        sb2.append(", data=");
        return C2618u.h(sb2, this.f32050b, ")");
    }
}
