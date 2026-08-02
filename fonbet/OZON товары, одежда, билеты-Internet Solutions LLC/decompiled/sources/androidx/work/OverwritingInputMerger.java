package androidx.work;

import androidx.annotation.NonNull;
import androidx.work.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends j {
    @Override // androidx.work.j
    @NonNull
    public final e b(@NonNull ArrayList arrayList) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((e) it.next()).f45283a));
        }
        aVar.c(hashMap);
        return aVar.a();
    }
}
