package R1;

import android.content.Context;
import android.util.Log;
import e2.C1930k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f5142a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5143b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f5144c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f5145d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f5146e;
    public X1.a f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f5147g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5148h = true;
    public boolean i;

    /* renamed from: j, reason: collision with root package name */
    public final C1930k f5149j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f5150k;

    public g(Context context, String str) {
        this.f5143b = context;
        this.f5142a = str;
        C1930k c1930k = new C1930k(15, false);
        c1930k.f16910l = new HashMap();
        this.f5149j = c1930k;
    }

    public final void a(S1.a... aVarArr) {
        if (this.f5150k == null) {
            this.f5150k = new HashSet();
        }
        for (S1.a aVar : aVarArr) {
            this.f5150k.add(Integer.valueOf(aVar.f5282a));
            this.f5150k.add(Integer.valueOf(aVar.f5283b));
        }
        C1930k c1930k = this.f5149j;
        c1930k.getClass();
        for (S1.a aVar2 : aVarArr) {
            int i = aVar2.f5282a;
            HashMap hashMap = (HashMap) c1930k.f16910l;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i), treeMap);
            }
            int i5 = aVar2.f5283b;
            S1.a aVar3 = (S1.a) treeMap.get(Integer.valueOf(i5));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i5), aVar2);
        }
    }
}
