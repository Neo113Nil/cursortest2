package G4;

import android.database.Cursor;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class N implements L4.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Cloneable f2922c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2923d;

    public /* synthetic */ N(Object obj, Cloneable cloneable, Object obj2, int i7) {
        this.f2920a = i7;
        this.f2921b = obj;
        this.f2922c = cloneable;
        this.f2923d = obj2;
    }

    @Override // L4.h
    public final void accept(Object obj) {
        Cursor cursor = (Cursor) obj;
        switch (this.f2920a) {
            case 0:
                E4.L l7 = (E4.L) this.f2921b;
                l7.getClass();
                int i7 = cursor.getInt(0);
                Integer numValueOf = Integer.valueOf(i7);
                HashSet hashSet = (HashSet) this.f2922c;
                if (!hashSet.contains(numValueOf)) {
                    hashSet.add(Integer.valueOf(i7));
                    ((ArrayList) this.f2923d).add(l7.m(i7, cursor.getBlob(1)));
                }
                break;
            default:
                W w7 = (W) this.f2921b;
                w7.getClass();
                int i8 = cursor.getInt(0);
                if (((SparseArray) this.f2922c).get(i8) == null) {
                    w7.i(i8);
                    w7.f2947a.b0("DELETE FROM targets WHERE target_id = ?", Integer.valueOf(i8));
                    w7.f2952f--;
                    int[] iArr = (int[]) this.f2923d;
                    iArr[0] = iArr[0] + 1;
                }
                break;
        }
    }
}
