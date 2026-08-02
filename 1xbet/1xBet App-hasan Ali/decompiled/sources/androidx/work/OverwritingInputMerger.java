package androidx.work;

import A0.J0;
import f2.AbstractC1950h;
import f2.C1948f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class OverwritingInputMerger extends AbstractC1950h {
    @Override // f2.AbstractC1950h
    public final C1948f a(ArrayList arrayList) {
        J0 j02 = new J0(27);
        HashMap hashMap = new HashMap();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            hashMap.putAll(Collections.unmodifiableMap(((C1948f) obj).f16994a));
        }
        j02.w(hashMap);
        C1948f c1948f = new C1948f((HashMap) j02.f304k);
        C1948f.c(c1948f);
        return c1948f;
    }
}
