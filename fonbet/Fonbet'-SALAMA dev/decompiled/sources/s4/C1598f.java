package s4;

import com.google.android.gms.common.internal.w;
import java.util.Comparator;
import q4.k;
import v4.p;

/* renamed from: s4.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1598f implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f16162a;

    public C1598f(w wVar) {
        this.f16162a = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        C1595c c1595c = (C1595c) obj;
        C1595c c1595c2 = (C1595c) obj2;
        k.c((c1595c.f16156d == null || c1595c2.f16156d == null) ? false : true);
        return ((v4.k) this.f16162a.f11336c).compare(new p(c1595c.f16156d, c1595c.f16154b.f17186a), new p(c1595c2.f16156d, c1595c2.f16154b.f17186a));
    }
}
