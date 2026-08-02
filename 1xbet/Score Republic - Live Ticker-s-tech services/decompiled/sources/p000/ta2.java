package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ta2 extends db2 {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f7397f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ta2(String str, Class cls, boolean z, boolean z2, int i) {
        super(str, cls, z, z2);
        this.f7397f = i;
    }

    @Override // p000.db2
    /* JADX INFO: renamed from: a */
    public void mo1153a(Iterator it, qb2 qb2Var) {
        switch (this.f7397f) {
            case 0:
                if (it.hasNext()) {
                    Object next = it.next();
                    boolean zHasNext = it.hasNext();
                    String str = this.f1613a;
                    if (!zHasNext) {
                        qb2Var.m4053a(next, str);
                    } else {
                        StringBuilder sb = new StringBuilder("[");
                        sb.append(next);
                        do {
                            sb.append(',');
                            sb.append(it.next());
                        } while (it.hasNext());
                        sb.append(']');
                        qb2Var.m4053a(sb.toString(), str);
                    }
                }
                break;
            default:
                super.mo1153a(it, qb2Var);
                break;
        }
    }

    @Override // p000.db2
    /* JADX INFO: renamed from: b */
    public void mo1154b(Object obj, qb2 qb2Var) {
        switch (this.f7397f) {
            case 1:
                mn1 mn1Var = (mn1) obj;
                if (mn1Var == null) {
                    return;
                }
                kn1 kn1Var = mn1Var.f5103a.f4860l;
                kn1Var.getClass();
                int i = 0;
                while (true) {
                    if (!(i < kn1Var.m3058c() - kn1Var.m3057b())) {
                        return;
                    }
                    if (i >= kn1Var.m3058c() - kn1Var.m3057b()) {
                        throw new NoSuchElementException();
                    }
                    ln1 ln1Var = kn1Var.f4465k;
                    int iM3057b = kn1Var.m3057b() + i;
                    i++;
                    Map.Entry entry = (Map.Entry) ln1Var.f4858j[iM3057b];
                    if (((Set) entry.getValue()).isEmpty()) {
                        qb2Var.m4053a(null, (String) entry.getKey());
                    } else {
                        Iterator it = ((Set) entry.getValue()).iterator();
                        while (it.hasNext()) {
                            qb2Var.m4053a(it.next(), (String) entry.getKey());
                        }
                    }
                }
                break;
            default:
                super.mo1154b(obj, qb2Var);
                return;
        }
    }
}
