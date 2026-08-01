package sg.bigo.ads.E0;

import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class t {
    public static final q f = new q();

    /* renamed from: a, reason: collision with root package name */
    public final List f12275a;
    public final List b;
    public final s e;
    public final SparseBooleanArray d = new SparseBooleanArray();
    public final Map c = new ArrayMap();

    public t(ArrayList arrayList, ArrayList arrayList2) {
        this.f12275a = arrayList;
        this.b = arrayList2;
        int size = arrayList.size();
        int i = Integer.MIN_VALUE;
        s sVar = null;
        for (int i2 = 0; i2 < size; i2++) {
            s sVar2 = (s) this.f12275a.get(i2);
            int i3 = sVar2.e;
            if (i3 > i) {
                sVar = sVar2;
                i = i3;
            }
        }
        this.e = sVar;
    }
}
