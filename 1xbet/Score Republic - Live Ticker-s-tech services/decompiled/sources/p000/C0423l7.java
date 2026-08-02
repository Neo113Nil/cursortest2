package p000;

import android.content.Context;
import android.graphics.RectF;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: l7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0423l7 {

    /* JADX INFO: renamed from: a */
    public int f4697a = 0;

    /* JADX INFO: renamed from: b */
    public float f4698b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f4699c = -1.0f;

    /* JADX INFO: renamed from: d */
    public float f4700d = -1.0f;

    /* JADX INFO: renamed from: e */
    public int[] f4701e = new int[0];

    /* JADX INFO: renamed from: f */
    public boolean f4702f = false;

    /* JADX INFO: renamed from: g */
    public final TextView f4703g;

    /* JADX INFO: renamed from: h */
    public final Context f4704h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C0423l7(TextView textView) {
        this.f4703g = textView;
        this.f4704h = textView.getContext();
        new C0349j7();
    }

    /* JADX INFO: renamed from: a */
    public static int[] m3186a(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i2 = 0; i2 < size; i2++) {
                    iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3187b() {
        return !(this.f4703g instanceof C0051b6);
    }
}
