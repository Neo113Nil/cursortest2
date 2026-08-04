package g2;

import A1.X;
import E3.AbstractC0167z;
import android.net.Uri;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class l extends m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j f13162f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final R4.c f13163x;

    public l(long j, X x4, AbstractC0167z abstractC0167z, r rVar, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(x4, abstractC0167z, rVar, arrayList, arrayList2, arrayList3);
        Uri.parse(((b) abstractC0167z.get(0)).f13111a);
        long j3 = rVar.f13180e;
        j jVar = j3 <= 0 ? null : new j(null, rVar.f13179d, j3);
        this.f13162f = jVar;
        this.f13163x = jVar == null ? new R4.c(new j(null, 0L, -1L), 16) : null;
    }

    @Override // g2.m
    public final String a() {
        return null;
    }

    @Override // g2.m
    public final p040f2.g c() {
        return this.f13163x;
    }

    @Override // g2.m
    public final j d() {
        return this.f13162f;
    }
}
