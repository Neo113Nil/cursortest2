package sg.bigo.ads.t1;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f13324a;
    public int b;
    public final HashMap c;

    public b() {
        this.f13324a = 10;
        this.b = 900000;
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.f13324a = 10;
        this.b = 900000;
        hashMap.clear();
        a aVar = new a();
        aVar.f13323a = "06002002";
        aVar.b = true;
        aVar.c = true;
        aVar.d = 86400000;
        hashMap.put("06002002", aVar);
        a aVar2 = new a();
        aVar2.f13323a = "06002007";
        aVar2.b = true;
        aVar2.c = true;
        aVar2.d = 86400000;
        hashMap.put("06002007", aVar2);
    }
}
