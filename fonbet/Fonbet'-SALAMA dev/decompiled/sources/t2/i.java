package t2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c2.f0;
import java.util.Map;

/* loaded from: classes.dex */
public final class i extends v {

    /* renamed from: g0, reason: collision with root package name */
    public static final /* synthetic */ int f16341g0 = 0;

    /* renamed from: R, reason: collision with root package name */
    public final boolean f16342R;

    /* renamed from: S, reason: collision with root package name */
    public final boolean f16343S;

    /* renamed from: T, reason: collision with root package name */
    public final boolean f16344T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f16345U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f16346V;

    /* renamed from: W, reason: collision with root package name */
    public final boolean f16347W;

    /* renamed from: X, reason: collision with root package name */
    public final boolean f16348X;

    /* renamed from: Y, reason: collision with root package name */
    public final boolean f16349Y;

    /* renamed from: Z, reason: collision with root package name */
    public final boolean f16350Z;

    /* renamed from: a0, reason: collision with root package name */
    public final boolean f16351a0;

    /* renamed from: b0, reason: collision with root package name */
    public final boolean f16352b0;
    public final boolean c0;

    /* renamed from: d0, reason: collision with root package name */
    public final boolean f16353d0;

    /* renamed from: e0, reason: collision with root package name */
    public final SparseArray f16354e0;

    /* renamed from: f0, reason: collision with root package name */
    public final SparseBooleanArray f16355f0;

    static {
        new i(new h());
    }

    public i(h hVar) {
        super(hVar);
        this.f16342R = hVar.f16337w;
        this.f16343S = hVar.f16338x;
        this.f16344T = hVar.f16339y;
        this.f16345U = hVar.f16340z;
        this.f16346V = hVar.f16326A;
        this.f16347W = hVar.f16327B;
        this.f16348X = hVar.f16328C;
        this.f16349Y = hVar.f16329D;
        this.f16350Z = hVar.f16330E;
        this.f16351a0 = hVar.f16331F;
        this.f16352b0 = hVar.f16332G;
        this.c0 = hVar.f16333H;
        this.f16353d0 = hVar.f16334I;
        this.f16354e0 = hVar.f16335J;
        this.f16355f0 = hVar.f16336K;
    }

    @Override // t2.v
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (super.equals(iVar) && this.f16342R == iVar.f16342R && this.f16343S == iVar.f16343S && this.f16344T == iVar.f16344T && this.f16345U == iVar.f16345U && this.f16346V == iVar.f16346V && this.f16347W == iVar.f16347W && this.f16348X == iVar.f16348X && this.f16349Y == iVar.f16349Y && this.f16350Z == iVar.f16350Z && this.f16351a0 == iVar.f16351a0 && this.f16352b0 == iVar.f16352b0 && this.c0 == iVar.c0 && this.f16353d0 == iVar.f16353d0) {
            SparseBooleanArray sparseBooleanArray = this.f16355f0;
            int size = sparseBooleanArray.size();
            SparseBooleanArray sparseBooleanArray2 = iVar.f16355f0;
            if (sparseBooleanArray2.size() == size) {
                int i7 = 0;
                while (true) {
                    if (i7 >= size) {
                        SparseArray sparseArray = this.f16354e0;
                        int size2 = sparseArray.size();
                        SparseArray sparseArray2 = iVar.f16354e0;
                        if (sparseArray2.size() == size2) {
                            for (int i8 = 0; i8 < size2; i8++) {
                                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i8));
                                if (indexOfKey >= 0) {
                                    Map map = (Map) sparseArray.valueAt(i8);
                                    Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                    if (map2.size() == map.size()) {
                                        for (Map.Entry entry : map.entrySet()) {
                                            f0 f0Var = (f0) entry.getKey();
                                            if (map2.containsKey(f0Var) && v2.t.a(entry.getValue(), map2.get(f0Var))) {
                                            }
                                        }
                                    }
                                }
                            }
                            return true;
                        }
                    } else {
                        if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i7)) < 0) {
                            break;
                        }
                        i7++;
                    }
                }
            }
        }
        return false;
    }

    @Override // t2.v
    public final int hashCode() {
        return ((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.f16342R ? 1 : 0)) * 31) + (this.f16343S ? 1 : 0)) * 31) + (this.f16344T ? 1 : 0)) * 31) + (this.f16345U ? 1 : 0)) * 31) + (this.f16346V ? 1 : 0)) * 31) + (this.f16347W ? 1 : 0)) * 31) + (this.f16348X ? 1 : 0)) * 31) + (this.f16349Y ? 1 : 0)) * 31) + (this.f16350Z ? 1 : 0)) * 31) + (this.f16351a0 ? 1 : 0)) * 31) + (this.f16352b0 ? 1 : 0)) * 31) + (this.c0 ? 1 : 0)) * 31) + (this.f16353d0 ? 1 : 0);
    }
}
