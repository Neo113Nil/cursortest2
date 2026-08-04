package p107o5;

import A5.s;
import I4.j;
import Q3.o;
import android.content.Context;
import com.google.android.gms.common.internal.w;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import p159w5.c;
import p164x5.b;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c, p164x5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f15617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f15618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public s f15619c;

    @Override // p164x5.a
    public final void onAttachedToActivity(b bVar) {
        h.e(bVar, "binding");
        b bVar2 = this.f15618b;
        if (bVar2 == null) {
            h.h("manager");
            throw null;
        }
        o oVar = (o) bVar;
        ((HashSet) oVar.f5824c).add(bVar2);
        j jVar = this.f15617a;
        if (jVar != null) {
            jVar.f3679c = (p121q5.c) oVar.f5822a;
        } else {
            h.h("share");
            throw null;
        }
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
        h.e(bVar, "binding");
        this.f15619c = new s(bVar.f18083c, "dev.fluttercommunity.plus/share");
        Context context = bVar.f18081a;
        h.d(context, "getApplicationContext(...)");
        b bVar2 = new b();
        bVar2.f15621b = new AtomicBoolean(true);
        this.f15618b = bVar2;
        j jVar = new j(context, bVar2);
        this.f15617a = jVar;
        b bVar3 = this.f15618b;
        if (bVar3 == null) {
            h.h("manager");
            throw null;
        }
        w wVar = new w(jVar, bVar3);
        s sVar = this.f15619c;
        if (sVar != null) {
            sVar.b(wVar);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        j jVar = this.f15617a;
        if (jVar != null) {
            jVar.f3679c = null;
        } else {
            h.h("share");
            throw null;
        }
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
        h.e(bVar, "binding");
        s sVar = this.f15619c;
        if (sVar != null) {
            sVar.b(null);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(b bVar) {
        h.e(bVar, "binding");
        onAttachedToActivity(bVar);
    }
}
