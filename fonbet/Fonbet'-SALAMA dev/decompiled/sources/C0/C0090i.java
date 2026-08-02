package C0;

import P.U;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import w1.G0;
import w1.N0;

/* renamed from: C0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0090i implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1288a;

    public /* synthetic */ C0090i(int i7) {
        this.f1288a = i7;
    }

    public static int a(Runnable runnable) {
        if (runnable == null) {
            return com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        if (!(runnable instanceof G0)) {
            return runnable instanceof N0 ? ((N0) runnable).f17465a : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        }
        N0 n02 = (N0) ((Runnable) ((G0) runnable).f17383a.get());
        return n02 != null ? n02.f17465a : com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0095, code lost:
    
        if (r3 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00a1, code lost:
    
        if (r3 != false) goto L48;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
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
                    }
                    return i7;
                }
                break;
            case 1:
                WeakHashMap weakHashMap = U.f5037a;
                float m7 = P.I.m((View) obj);
                float m8 = P.I.m((View) obj2);
                if (m7 > m8) {
                    return -1;
                }
                return m7 < m8 ? 1 : 0;
            case 2:
                List list = y2.u.f18177f;
                return list.indexOf((String) obj) - list.indexOf((String) obj2);
            case 3:
                long j = ((p4.c) obj).f15701c;
                long j3 = ((p4.c) obj2).f15701c;
                char[] cArr = q4.k.f15865a;
                if (j < j3) {
                    return -1;
                }
                return j == j3 ? 0 : 1;
            case 4:
                return ((t.f) obj).f16253b - ((t.f) obj2).f16253b;
            case 5:
                if (obj != null) {
                    throw new ClassCastException();
                }
                obj2.getClass();
                throw new ClassCastException();
            case 6:
                return ((v4.c) obj).compareTo((v4.c) obj2);
            case 7:
                int a2 = a((Runnable) obj);
                int a4 = a((Runnable) obj2);
                if (a2 < a4) {
                    return -1;
                }
                return a2 > a4 ? 1 : 0;
            default:
                return 0;
        }
    }
}
