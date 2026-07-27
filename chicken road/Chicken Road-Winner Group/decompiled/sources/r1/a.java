package r1;

import java.util.Collections;
import java.util.Iterator;
import o1.i;
import s1.C1196c;
import s1.C1202i;
import s1.C1203j;
import v1.AbstractC1217a;

/* loaded from: classes.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f10280a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A.b f10281b;

    public a(A.b bVar, float f) {
        this.f10281b = bVar;
        this.f10280a = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1203j c1203j = ((b) this.f10281b.f4b).f10286e;
        float f = this.f10280a;
        c1203j.f10334a = f;
        if (c1203j.f10337d == null) {
            c1203j.f10337d = C1196c.f10320c;
        }
        Iterator it = Collections.unmodifiableCollection(c1203j.f10337d.f10322b).iterator();
        while (it.hasNext()) {
            AbstractC1217a abstractC1217a = ((i) it.next()).f10172e;
            C1202i.f10332a.a(abstractC1217a.g(), "setDeviceVolume", Float.valueOf(f), abstractC1217a.f10406a);
        }
    }
}
