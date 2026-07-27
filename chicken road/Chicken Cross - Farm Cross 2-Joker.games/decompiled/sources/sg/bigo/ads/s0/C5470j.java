package sg.bigo.ads.s0;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import sg.bigo.ads.w0.AbstractC5496a;

/* renamed from: sg.bigo.ads.s0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5470j {

    /* renamed from: a, reason: collision with root package name */
    public final String f13291a;
    public final String b;
    public final boolean c;
    public final ArrayList d;
    public volatile boolean e;
    public final /* synthetic */ k f;

    public C5470j(k kVar, String str, String str2, boolean z, z zVar) {
        this.f = kVar;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = false;
        this.f13291a = str;
        this.b = str2;
        this.c = z;
        arrayList.add(zVar);
    }

    public static void a(C5470j c5470j, Context context, int i, String str, y yVar) {
        synchronized (c5470j.f.f) {
            AbstractC5496a.b(c5470j.f.b(), "Failed to download image: " + c5470j.f13291a);
            Iterator it = c5470j.d.iterator();
            while (it.hasNext()) {
                ((z) it.next()).a(i, str, yVar);
            }
            c5470j.f.f13292a.remove(c5470j.f13291a);
            c5470j.f.c(context);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5470j.class != obj.getClass()) {
            return false;
        }
        return this.f13291a.equals(((C5470j) obj).f13291a);
    }

    public static void a(C5470j c5470j, z zVar) {
        synchronized (c5470j.f.f) {
            c5470j.d.add(zVar);
        }
    }
}
