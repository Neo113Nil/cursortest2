package p139t2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;
import p018c2.f0;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class i extends v {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f16347g0 = 0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final boolean f16348R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final boolean f16349S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public final boolean f16350T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final boolean f16351U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final boolean f16352V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final boolean f16353W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final boolean f16354X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final boolean f16355Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final boolean f16356Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final boolean f16357a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f16358b0;
    public final boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f16359d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final SparseArray f16360e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final SparseBooleanArray f16361f0;

    static {
        new i(new h());
    }

    public i(h hVar) {
        super(hVar);
        this.f16348R = hVar.f16343w;
        this.f16349S = hVar.f16344x;
        this.f16350T = hVar.f16345y;
        this.f16351U = hVar.f16346z;
        this.f16352V = hVar.f16332A;
        this.f16353W = hVar.f16333B;
        this.f16354X = hVar.f16334C;
        this.f16355Y = hVar.f16335D;
        this.f16356Z = hVar.f16336E;
        this.f16357a0 = hVar.f16337F;
        this.f16358b0 = hVar.f16338G;
        this.c0 = hVar.f16339H;
        this.f16359d0 = hVar.f16340I;
        this.f16360e0 = hVar.f16341J;
        this.f16361f0 = hVar.f16342K;
    }

    @Override // p139t2.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (super.equals(iVar) && this.f16348R == iVar.f16348R && this.f16349S == iVar.f16349S && this.f16350T == iVar.f16350T && this.f16351U == iVar.f16351U && this.f16352V == iVar.f16352V && this.f16353W == iVar.f16353W && this.f16354X == iVar.f16354X && this.f16355Y == iVar.f16355Y && this.f16356Z == iVar.f16356Z && this.f16357a0 == iVar.f16357a0 && this.f16358b0 == iVar.f16358b0 && this.c0 == iVar.c0 && this.f16359d0 == iVar.f16359d0) {
            SparseBooleanArray sparseBooleanArray = this.f16361f0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = iVar.f16361f0;
            if (sparseBooleanArray2.size() == size) {
                for (int i7 = 0; i7 < size; i7++) {
                    if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) >= 0) {
                    }
                }
                SparseArray sparseArray = this.f16360e0;
                int size2 = sparseArray.size();
                SparseArray sparseArray2 = iVar.f16360e0;
                if (sparseArray2.size() == size2) {
                    for (int i8 = 0; i8 < size2; i8++) {
                        int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                        if (iIndexOfKey >= 0) {
                            Map map = (Map) sparseArray.valueAt(i8);
                            Map map2 = (Map) sparseArray2.valueAt(iIndexOfKey);
                            if (map2.size() == map.size()) {
                                for (Map.Entry entry : map.entrySet()) {
                                    f0 f0Var = (f0) entry.getKey();
                                    if (!map2.containsKey(f0Var) || !t.a(entry.getValue(), map2.get(f0Var))) {
                                    }
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p139t2.v
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f16348R ? 1 : 0)) * 31) + (this.f16349S ? 1 : 0)) * 31) + (this.f16350T ? 1 : 0)) * 31) + (this.f16351U ? 1 : 0)) * 31) + (this.f16352V ? 1 : 0)) * 31) + (this.f16353W ? 1 : 0)) * 31) + (this.f16354X ? 1 : 0)) * 31) + (this.f16355Y ? 1 : 0)) * 31) + (this.f16356Z ? 1 : 0)) * 31) + (this.f16357a0 ? 1 : 0)) * 31) + (this.f16358b0 ? 1 : 0)) * 31) + (this.c0 ? 1 : 0)) * 31) + (this.f16359d0 ? 1 : 0);
    }
}
