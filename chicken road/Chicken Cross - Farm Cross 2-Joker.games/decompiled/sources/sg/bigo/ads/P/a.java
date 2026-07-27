package sg.bigo.ads.P;

import android.util.SparseArray;
import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseArray f12475a;

    static {
        SparseArray sparseArray = new SparseArray();
        f12475a = sparseArray;
        sparseArray.put(0, Arrays.asList(1, 2, 3));
        sparseArray.put(1, Arrays.asList(1, 2));
        sparseArray.put(2, Collections.singletonList(3));
        sparseArray.put(3, Arrays.asList(1, 2, 3));
        sparseArray.put(20, Arrays.asList(1, 2, 3));
        sparseArray.put(4, Arrays.asList(1, 2, 3));
        sparseArray.put(12, Arrays.asList(1, 2));
        sparseArray.put(15, Arrays.asList(1, 2, 5));
        sparseArray.put(16, Arrays.asList(1, 2, 5));
        sparseArray.put(17, Arrays.asList(1, 2, 5));
        sparseArray.put(18, Arrays.asList(1, 2, 5));
    }

    public static boolean a(int i) {
        return i == 3 || i == 4 || i == 20;
    }

    public static boolean b(int i) {
        return i == 12;
    }
}
