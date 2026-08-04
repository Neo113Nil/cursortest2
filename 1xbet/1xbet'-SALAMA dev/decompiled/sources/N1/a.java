package N1;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends D1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4634d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f4635e;

    public a(int i7, long j) {
        super(i7);
        this.f4633c = j;
        this.f4634d = new ArrayList();
        this.f4635e = new ArrayList();
    }

    public final a t(int i7) {
        ArrayList arrayList = this.f4635e;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            a aVar = (a) arrayList.get(i8);
            if (aVar.f1675b == i7) {
                return aVar;
            }
        }
        return null;
    }

    @Override // D1.a
    public final String toString() {
        return D1.a.c(this.f1675b) + " leaves: " + Arrays.toString(this.f4634d.toArray()) + " containers: " + Arrays.toString(this.f4635e.toArray());
    }

    public final b y(int i7) {
        ArrayList arrayList = this.f4634d;
        int size = arrayList.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = (b) arrayList.get(i8);
            if (bVar.f1675b == i7) {
                return bVar;
            }
        }
        return null;
    }
}
