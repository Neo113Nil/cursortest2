package B;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f955a;

    public final void a(int i7, r rVar) {
        HashMap hashMap = this.f955a;
        HashSet hashSet = (HashSet) hashMap.get(Integer.valueOf(i7));
        if (hashSet == null) {
            hashSet = new HashSet();
            hashMap.put(Integer.valueOf(i7), hashSet);
        }
        hashSet.add(new WeakReference(rVar));
    }
}
