package sg.bigo.ads.k1;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f13026a;

    public Y(List list, int[] iArr) {
        int i;
        int i2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            arrayList.add(Integer.valueOf(rect.left));
            arrayList.add(Integer.valueOf(rect.right));
        }
        Collections.sort(arrayList, new W());
        this.f13026a = new ArrayList();
        int i3 = 0;
        while (i3 < arrayList.size() - 1) {
            int intValue = ((Integer) arrayList.get(i3)).intValue();
            i3++;
            int intValue2 = ((Integer) arrayList.get(i3)).intValue();
            if (intValue < intValue2) {
                ArrayList<X> arrayList2 = new ArrayList();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Rect rect2 = (Rect) it2.next();
                    if (intValue < rect2.right && intValue2 > rect2.left) {
                        X x = new X(rect2.top, rect2.bottom);
                        ArrayList arrayList3 = new ArrayList();
                        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                            X x2 = (X) arrayList2.get(i4);
                            int i5 = x.f13025a;
                            int i6 = x2.b;
                            if (i5 > i6 || (i = x.b) < (i2 = x2.f13025a)) {
                                arrayList3.add(x2);
                            } else if (i5 <= i6 && i >= i2) {
                                x = new X(i5 >= i2 ? i2 : i5, i > i6 ? i : i6);
                            }
                        }
                        arrayList3.add(x);
                        arrayList2 = arrayList3;
                    }
                }
                ArrayList arrayList4 = this.f13026a;
                ArrayList arrayList5 = new ArrayList();
                for (X x3 : arrayList2) {
                    arrayList5.add(new Rect(intValue, x3.f13025a, intValue2, x3.b));
                }
                arrayList4.addAll(arrayList5);
            }
        }
        Collections.sort(this.f13026a, new V());
        Iterator it3 = this.f13026a.iterator();
        while (it3.hasNext()) {
            ((Rect) it3.next()).offset(-iArr[0], -iArr[1]);
        }
    }
}
