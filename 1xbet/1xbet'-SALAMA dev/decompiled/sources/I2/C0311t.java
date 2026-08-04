package I2;

import java.util.ArrayList;

/* JADX INFO: renamed from: I2.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f3645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double[] f3646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double[] f3647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f3648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f3649e;

    public C0311t(android.support.v4.media.session.t tVar) {
        ArrayList arrayList = (ArrayList) tVar.f8076b;
        int size = arrayList.size();
        this.f3645a = (String[]) ((ArrayList) tVar.f8078d).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i7 = 0; i7 < size2; i7++) {
            dArr[i7] = ((Double) arrayList.get(i7)).doubleValue();
        }
        this.f3646b = dArr;
        ArrayList arrayList2 = (ArrayList) tVar.f8077c;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i8 = 0; i8 < size3; i8++) {
            dArr2[i8] = ((Double) arrayList2.get(i8)).doubleValue();
        }
        this.f3647c = dArr2;
        this.f3648d = new int[size];
        this.f3649e = 0;
    }
}
