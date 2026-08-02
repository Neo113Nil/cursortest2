package H1;

import G1.C0140k;
import G1.C0141l;
import G1.E;
import G1.O;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public static final p f2231l = new p(2);

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        Bundle bundle;
        E e3 = (E) obj2;
        e3.getClass();
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : X3.z.T(e3.f1846v.f1877a).entrySet()) {
            ((O) entry.getValue()).getClass();
        }
        if (arrayList.isEmpty()) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        }
        X3.k kVar = e3.f1832g;
        if (!kVar.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[kVar.f6086m];
            Iterator<E> it = kVar.iterator();
            int i = 0;
            while (it.hasNext()) {
                parcelableArr[i] = new C0141l((C0140k) it.next());
                i++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        LinkedHashMap linkedHashMap = e3.f1837m;
        if (!linkedHashMap.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[linkedHashMap.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i5 = 0;
            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                int intValue = ((Number) entry2.getKey()).intValue();
                String str = (String) entry2.getValue();
                iArr[i5] = intValue;
                arrayList2.add(str);
                i5++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        LinkedHashMap linkedHashMap2 = e3.f1838n;
        if (!linkedHashMap2.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                String str2 = (String) entry3.getKey();
                X3.k kVar2 = (X3.k) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[kVar2.f6086m];
                Iterator it2 = kVar2.iterator();
                int i6 = 0;
                while (it2.hasNext()) {
                    Object next = it2.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        X3.n.R();
                        throw null;
                    }
                    parcelableArr2[i6] = (C0141l) next;
                    i6 = i7;
                }
                bundle.putParcelableArray(L1.a.m("android-support-nav:controller:backStackStates:", str2), parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (e3.f) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", e3.f);
        }
        return bundle;
    }
}
