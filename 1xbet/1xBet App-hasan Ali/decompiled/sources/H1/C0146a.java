package H1;

import Q2.C0375o;
import androidx.lifecycle.J;
import androidx.lifecycle.S;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.UUID;
import s4.M;

/* renamed from: H1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0146a extends S {

    /* renamed from: a, reason: collision with root package name */
    public final String f2208a = "SaveableStateHolder_BackStackEntryKey";

    /* renamed from: b, reason: collision with root package name */
    public final UUID f2209b;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference f2210c;

    public C0146a(J j5) {
        Object obj;
        j5.getClass();
        C0375o c0375o = j5.f7015b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) c0375o.f5042l;
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) c0375o.f5045o;
        try {
            s4.v vVar = (s4.v) linkedHashMap2.get("SaveableStateHolder_BackStackEntryKey");
            if (vVar == null || (obj = ((M) vVar).getValue()) == null) {
                obj = linkedHashMap.get("SaveableStateHolder_BackStackEntryKey");
            }
        } catch (ClassCastException unused) {
            linkedHashMap.remove("SaveableStateHolder_BackStackEntryKey");
            ((LinkedHashMap) c0375o.f5044n).remove("SaveableStateHolder_BackStackEntryKey");
            linkedHashMap2.remove("SaveableStateHolder_BackStackEntryKey");
            obj = null;
        }
        UUID uuid = (UUID) obj;
        if (uuid == null) {
            uuid = UUID.randomUUID();
            String str = this.f2208a;
            kotlin.jvm.internal.l.f("key", str);
            if (uuid != null) {
                ArrayList arrayList = C1.a.f816a;
                if (arrayList == null || !arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((Class) obj2).isInstance(uuid)) {
                        }
                    }
                }
                throw new IllegalArgumentException(("Can't put value with type " + uuid.getClass() + " into saved state").toString());
            }
            ArrayList arrayList2 = C1.a.f816a;
            Object obj3 = j5.f7014a.get(str);
            androidx.lifecycle.B b3 = obj3 instanceof androidx.lifecycle.B ? (androidx.lifecycle.B) obj3 : null;
            if (b3 != null) {
                b3.b(uuid);
            }
            c0375o.B(str, uuid);
        }
        this.f2209b = uuid;
    }

    @Override // androidx.lifecycle.S
    public final void onCleared() {
        super.onCleared();
        WeakReference weakReference = this.f2210c;
        if (weakReference == null) {
            kotlin.jvm.internal.l.k("saveableStateHolderRef");
            throw null;
        }
        Y.c cVar = (Y.c) weakReference.get();
        if (cVar != null) {
            cVar.a(this.f2209b);
        }
        WeakReference weakReference2 = this.f2210c;
        if (weakReference2 != null) {
            weakReference2.clear();
        } else {
            kotlin.jvm.internal.l.k("saveableStateHolderRef");
            throw null;
        }
    }
}
