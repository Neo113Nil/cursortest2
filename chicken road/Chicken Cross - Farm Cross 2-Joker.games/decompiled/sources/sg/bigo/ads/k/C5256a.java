package sg.bigo.ads.k;

import java.util.HashMap;
import java.util.HashSet;

/* renamed from: sg.bigo.ads.k.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5256a {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f13012a = new HashSet();

    public final void a(sg.bigo.ads.P.c cVar, int i, long j) {
        if (this.f13012a.contains(Integer.valueOf(i))) {
            return;
        }
        this.f13012a.add(Integer.valueOf(i));
        sg.bigo.ads.s1.b.a(cVar, i, j, (String) null, -1, (String) null, (String) null, (HashMap) null);
    }

    public final void a(sg.bigo.ads.P.c cVar, int i, long j, HashMap hashMap) {
        if (this.f13012a.contains(Integer.valueOf(i))) {
            return;
        }
        this.f13012a.add(Integer.valueOf(i));
        sg.bigo.ads.s1.b.a(cVar, i, j, (String) null, -1, (String) null, (String) null, hashMap);
    }
}
