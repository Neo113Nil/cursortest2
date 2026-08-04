package p138t1;

import A5.s;
import Q3.o;
import android.content.Context;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import p155w1.C1009l0;
import p155w1.C1013m0;
import p159w5.c;
import p164x5.a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f16278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f16279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p164x5.b f16280c;

    @Override // p164x5.a
    public final void onAttachedToActivity(p164x5.b bVar) {
        o oVar = (o) bVar;
        p121q5.c cVar = (p121q5.c) oVar.f5822a;
        c cVar2 = this.f16278a;
        if (cVar2 != null) {
            cVar2.f16283c = cVar;
        }
        this.f16280c = bVar;
        ((HashSet) oVar.f5824c).add(cVar2);
        p164x5.b bVar2 = this.f16280c;
        ((HashSet) ((o) bVar2).f5823b).add(this.f16278a);
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        Context context = bVar.f18081a;
        this.f16278a = new c(context);
        s sVar = new s(bVar.f18083c, "flutter.baseflow.com/permissions/methods");
        this.f16279b = sVar;
        sVar.b(new w(context, new C1009l0(24), this.f16278a, new C1013m0(24)));
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        c cVar = this.f16278a;
        if (cVar != null) {
            cVar.f16283c = null;
        }
        p164x5.b bVar = this.f16280c;
        if (bVar != null) {
            ((HashSet) ((o) bVar).f5824c).remove(cVar);
            p164x5.b bVar2 = this.f16280c;
            ((HashSet) ((o) bVar2).f5823b).remove(this.f16278a);
        }
        this.f16280c = null;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        this.f16279b.b(null);
        this.f16279b = null;
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(p164x5.b bVar) {
        onAttachedToActivity(bVar);
    }
}
