package C0;

import P.U;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import p155w1.G0;
import p155w1.N0;

/* JADX INFO: renamed from: C0.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0090i implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a;

    public /* synthetic */ C0090i(int i7) {
        this.f1288a = i7;
    }

    public static int a(Runnable runnable) {
        if (runnable == null) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (!(runnable instanceof G0)) {
            return runnable instanceof N0 ? ((N0) runnable).f17471a : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        N0 n2 = (N0) ((Runnable) ((G0) runnable).f17389a.get());
        return n2 != null ? n2.f17471a : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i7 = 1;
        switch (this.f1288a) {
            case 0:
                C0092k c0092k = (C0092k) obj;
                C0092k c0092k2 = (C0092k) obj2;
                RecyclerView recyclerView = c0092k.f1295d;
                if ((recyclerView == null) == (c0092k2.f1295d == null)) {
                    boolean z4 = c0092k.f1292a;
                    if (z4 == c0092k2.f1292a) {
                        i7 = c0092k2.f1293b - c0092k.f1293b;
                        if (i7 == 0) {
                            int i8 = c0092k.f1294c - c0092k2.f1294c;
                            if (i8 != 0) {
                                return i8;
                            }
                            return 0;
                        }
                    } else if (z4) {
                        i7 = -1;
                    }
                } else if (recyclerView != null) {
                    i7 = -1;
                }
                return i7;
            case 1:
                WeakHashMap weakHashMap = U.f5037a;
                float fM = P.I.m((View) obj);
                float fM2 = P.I.m((View) obj2);
                if (fM > fM2) {
                    return -1;
                }
                return fM < fM2 ? 1 : 0;
            case 2:
                List list = p167y2.u.f18183f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 3:
                long j = ((p114p4.c) obj).f15707c;
                long j3 = ((p114p4.c) obj2).f15707c;
                char[] cArr = p120q4.k.f15871a;
                if (j < j3) {
                    return -1;
                }
                return j == j3 ? 0 : 1;
            case 4:
                return ((p136t.f) obj).f16259b - ((p136t.f) obj2).f16259b;
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                obj2.getClass();
                throw new ClassCastException();
            case 6:
                return ((v4.c) obj).compareTo((v4.c) obj2);
            case 7:
                int iA = a((Runnable) obj);
                int iA2 = a((Runnable) obj2);
                if (iA < iA2) {
                    return -1;
                }
                return iA > iA2 ? 1 : 0;
            default:
                return 0;
        }
    }
}
