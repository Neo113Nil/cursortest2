package G4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* renamed from: G4.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0285s implements InterfaceC0268a {

    /* renamed from: a, reason: collision with root package name */
    public final TreeMap f3021a = new TreeMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f3022b = new HashMap();

    @Override // G4.InterfaceC0268a
    public final void G(int i7) {
        HashMap hashMap = this.f3022b;
        if (hashMap.containsKey(Integer.valueOf(i7))) {
            Set set = (Set) hashMap.get(Integer.valueOf(i7));
            hashMap.remove(Integer.valueOf(i7));
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.f3021a.remove((H4.h) it.next());
            }
        }
    }

    @Override // G4.InterfaceC0268a
    public final void b(int i7, HashMap hashMap) {
        for (Map.Entry entry : hashMap.entrySet()) {
            I4.h hVar = (I4.h) entry.getValue();
            Object[] objArr = {entry.getKey()};
            if (hVar == null) {
                throw new NullPointerException(String.format(Locale.US, "null value for key: %s", objArr));
            }
            TreeMap treeMap = this.f3021a;
            H4.h hVar2 = hVar.f3670a;
            I4.d dVar = (I4.d) treeMap.get(hVar2);
            HashMap hashMap2 = this.f3022b;
            if (dVar != null) {
                ((Set) hashMap2.get(Integer.valueOf(dVar.f3664a))).remove(hVar2);
            }
            treeMap.put(hVar2, new I4.d(i7, hVar));
            if (hashMap2.get(Integer.valueOf(i7)) == null) {
                hashMap2.put(Integer.valueOf(i7), new HashSet());
            }
            ((Set) hashMap2.get(Integer.valueOf(i7))).add(hVar2);
        }
    }

    @Override // G4.InterfaceC0268a
    public final I4.d e(H4.h hVar) {
        return (I4.d) this.f3021a.get(hVar);
    }

    @Override // G4.InterfaceC0268a
    public final HashMap g(H4.m mVar, int i7) {
        HashMap hashMap = new HashMap();
        int size = mVar.f3312a.size() + 1;
        for (I4.d dVar : this.f3021a.tailMap(new H4.h((H4.m) mVar.b(""))).values()) {
            H4.h hVar = dVar.f3665b.f3670a;
            if (!mVar.m(hVar.f3318a)) {
                break;
            }
            if (hVar.f3318a.f3312a.size() == size && dVar.f3664a > i7) {
                hashMap.put(dVar.f3665b.f3670a, dVar);
            }
        }
        return hashMap;
    }

    @Override // G4.InterfaceC0268a
    public final HashMap i(int i7, int i8, String str) {
        int i9;
        TreeMap treeMap = new TreeMap();
        for (I4.d dVar : this.f3021a.values()) {
            if (dVar.f3665b.f3670a.f3318a.l(r3.f3312a.size() - 2).equals(str) && (i9 = dVar.f3664a) > i7) {
                Map map = (Map) treeMap.get(Integer.valueOf(i9));
                if (map == null) {
                    map = new HashMap();
                    treeMap.put(Integer.valueOf(i9), map);
                }
                map.put(dVar.f3665b.f3670a, dVar);
            }
        }
        HashMap hashMap = new HashMap();
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            hashMap.putAll((Map) it.next());
            if (hashMap.size() >= i8) {
                break;
            }
        }
        return hashMap;
    }

    @Override // G4.InterfaceC0268a
    public final HashMap x(TreeSet treeSet) {
        HashMap hashMap = new HashMap();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            H4.h hVar = (H4.h) it.next();
            I4.d dVar = (I4.d) this.f3021a.get(hVar);
            if (dVar != null) {
                hashMap.put(hVar, dVar);
            }
        }
        return hashMap;
    }
}
