package p134s4;

import com.google.android.gms.common.internal.w;
import java.util.Comparator;
import p120q4.k;
import v4.p;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w f16168a;

    public f(w wVar) {
        this.f16168a = wVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        c cVar = (c) obj;
        c cVar2 = (c) obj2;
        k.c((cVar.f16162d == null || cVar2.f16162d == null) ? false : true);
        return ((v4.k) this.f16168a.f11336c).compare(new p(cVar.f16162d, cVar.f16160b.f17192a), new p(cVar2.f16162d, cVar2.f16160b.f17192a));
    }
}
