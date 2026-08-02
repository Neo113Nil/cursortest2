package D0;

import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f1642a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1643b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1644c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f1645d;

    /* renamed from: e, reason: collision with root package name */
    public Executor f1646e;

    /* renamed from: f, reason: collision with root package name */
    public J0.b f1647f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1648g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1649h = true;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1650i;
    public final i j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f1651k;

    public h(Context context, String str) {
        this.f1643b = context;
        this.f1642a = str;
        i iVar = new i();
        iVar.f1652a = new HashMap();
        this.j = iVar;
    }

    public final void a(E0.a... aVarArr) {
        if (this.f1651k == null) {
            this.f1651k = new HashSet();
        }
        for (E0.a aVar : aVarArr) {
            this.f1651k.add(Integer.valueOf(aVar.f1898a));
            this.f1651k.add(Integer.valueOf(aVar.f1899b));
        }
        i iVar = this.j;
        iVar.getClass();
        for (E0.a aVar2 : aVarArr) {
            int i7 = aVar2.f1898a;
            HashMap hashMap = iVar.f1652a;
            TreeMap treeMap = (TreeMap) hashMap.get(Integer.valueOf(i7));
            if (treeMap == null) {
                treeMap = new TreeMap();
                hashMap.put(Integer.valueOf(i7), treeMap);
            }
            int i8 = aVar2.f1899b;
            E0.a aVar3 = (E0.a) treeMap.get(Integer.valueOf(i8));
            if (aVar3 != null) {
                Log.w("ROOM", "Overriding migration " + aVar3 + " with " + aVar2);
            }
            treeMap.put(Integer.valueOf(i8), aVar2);
        }
    }
}
