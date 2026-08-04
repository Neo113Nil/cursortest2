package p054h2;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f13369b = {8, 13, 11, 2, 0, 1, 7};

    public static void a(ArrayList arrayList, int i7) {
        int[] iArr = f13369b;
        int i8 = 0;
        while (true) {
            if (i8 >= 7) {
                i8 = -1;
                break;
            } else if (iArr[i8] == i7) {
                break;
            } else {
                i8++;
            }
        }
        if (i8 == -1 || arrayList.contains(Integer.valueOf(i7))) {
            return;
        }
        arrayList.add(Integer.valueOf(i7));
    }
}
