package p049g5;

import A5.r;
import android.os.Bundle;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p117q0.n;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f13264b;

    public /* synthetic */ i(n nVar, int i7) {
        this.f13263a = i7;
        this.f13264b = nVar;
    }

    @Override // A5.r
    public final void error(String str, String str2, Object obj) {
        switch (this.f13263a) {
            case 0:
                this.f13264b.d(new Bundle());
                throw null;
            default:
                this.f13264b.d(new Bundle());
                throw null;
        }
    }

    @Override // A5.r
    public final void notImplemented() {
        switch (this.f13263a) {
            case 0:
                this.f13264b.d(new Bundle());
                throw null;
            default:
                this.f13264b.d(new Bundle());
                throw null;
        }
    }

    @Override // A5.r
    public final void success(Object obj) {
        switch (this.f13263a) {
            case 0:
                List list = (List) ((Map) obj).get(ViewHierarchyNode.JsonKeys.CHILDREN);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l.a((Map) it.next()));
                }
                this.f13264b.e(arrayList);
                break;
            default:
                Map map = (Map) ((Map) obj).get("mediaItem");
                n nVar = this.f13264b;
                if (map == null) {
                    nVar.e(null);
                } else {
                    nVar.e(l.a(map));
                }
                break;
        }
    }
}
