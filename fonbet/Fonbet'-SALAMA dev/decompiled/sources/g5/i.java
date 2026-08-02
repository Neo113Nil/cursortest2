package g5;

import A5.r;
import android.os.Bundle;
import io.sentry.protocol.ViewHierarchyNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13257a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q0.n f13258b;

    public /* synthetic */ i(q0.n nVar, int i7) {
        this.f13257a = i7;
        this.f13258b = nVar;
    }

    @Override // A5.r
    public final void error(String str, String str2, Object obj) {
        switch (this.f13257a) {
            case 0:
                this.f13258b.d(new Bundle());
                throw null;
            default:
                this.f13258b.d(new Bundle());
                throw null;
        }
    }

    @Override // A5.r
    public final void notImplemented() {
        switch (this.f13257a) {
            case 0:
                this.f13258b.d(new Bundle());
                throw null;
            default:
                this.f13258b.d(new Bundle());
                throw null;
        }
    }

    @Override // A5.r
    public final void success(Object obj) {
        switch (this.f13257a) {
            case 0:
                List list = (List) ((Map) obj).get(ViewHierarchyNode.JsonKeys.CHILDREN);
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l.a((Map) it.next()));
                }
                this.f13258b.e(arrayList);
                break;
            default:
                Map map = (Map) ((Map) obj).get("mediaItem");
                q0.n nVar = this.f13258b;
                if (map == null) {
                    nVar.e(null);
                    break;
                } else {
                    nVar.e(l.a(map));
                    break;
                }
        }
    }
}
