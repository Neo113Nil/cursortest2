package p000;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: ek */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0177ek {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f2098a = new LinkedHashMap();

    /* JADX INFO: renamed from: b */
    public final LinkedHashMap f2099b = new LinkedHashMap();

    /* JADX INFO: renamed from: c */
    public final LinkedHashMap f2100c = new LinkedHashMap();

    /* JADX INFO: renamed from: d */
    public final ArrayList f2101d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final transient LinkedHashMap f2102e = new LinkedHashMap();

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f2103f = new LinkedHashMap();

    /* JADX INFO: renamed from: g */
    public final Bundle f2104g = new Bundle();

    public C0177ek(AbstractActivityC0790v4 abstractActivityC0790v4) {
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1432a(int i, int i2, Intent intent) {
        String str = (String) this.f2098a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0160e3 c0160e3 = (C0160e3) this.f2102e.get(str);
        if ((c0160e3 != null ? c0160e3.f1911a : null) != null) {
            ArrayList arrayList = this.f2101d;
            if (arrayList.contains(str)) {
                c0160e3.f1911a.mo585f(c0160e3.f1912b.mo843e(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f2103f.remove(str);
        this.f2104g.putParcelable(str, new C0004a3(intent, i2));
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C0312i6 m1433b(String str, vk1 vk1Var, InterfaceC0048b3 interfaceC0048b3) {
        Object parcelable;
        Number number;
        Integer numValueOf;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = this.f2099b;
        if (((Integer) linkedHashMap2.get(str)) == null) {
            C0124d3 c0124d3 = new C0124d3();
            Iterator it = new C0548ol(new v70(c0124d3, new ab0(2, c0124d3))).iterator();
            do {
                if (!it.hasNext()) {
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                number = (Number) it.next();
                numValueOf = Integer.valueOf(number.intValue());
                linkedHashMap = this.f2098a;
            } while (linkedHashMap.containsKey(numValueOf));
            int iIntValue = number.intValue();
            linkedHashMap.put(Integer.valueOf(iIntValue), str);
            linkedHashMap2.put(str, Integer.valueOf(iIntValue));
        }
        this.f2102e.put(str, new C0160e3(interfaceC0048b3, vk1Var));
        LinkedHashMap linkedHashMap3 = this.f2103f;
        if (linkedHashMap3.containsKey(str)) {
            Object obj = linkedHashMap3.get(str);
            linkedHashMap3.remove(str);
            interfaceC0048b3.mo585f(obj);
        }
        int i = Build.VERSION.SDK_INT;
        Bundle bundle = this.f2104g;
        if (i >= 34) {
            parcelable = AbstractC0491n1.m3458b(bundle, str);
        } else {
            parcelable = bundle.getParcelable(str);
            if (!C0004a3.class.isInstance(parcelable)) {
                parcelable = null;
            }
        }
        C0004a3 c0004a3 = (C0004a3) parcelable;
        if (c0004a3 != null) {
            bundle.remove(str);
            interfaceC0048b3.mo585f(vk1Var.mo843e(c0004a3.f30k, c0004a3.f29j));
        }
        return new C0312i6(this, str, vk1Var);
    }
}
