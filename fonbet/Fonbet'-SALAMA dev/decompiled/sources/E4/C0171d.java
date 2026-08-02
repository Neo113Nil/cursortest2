package E4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: E4.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0171d extends AbstractC0178k {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f2171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2172b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f2173c;

    public C0171d(int i7, List list) {
        this.f2171a = new ArrayList(list);
        this.f2172b = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
    
        r2 = false;
     */
    @Override // E4.AbstractC0178k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a() {
        boolean z4;
        String str;
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.f2171a;
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                if (((AbstractC0178k) it.next()) instanceof C0171d) {
                    break;
                }
            } else if (e()) {
                z4 = true;
            }
        }
        if (z4) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                sb.append(((AbstractC0178k) it2.next()).a());
            }
            return sb.toString();
        }
        int i7 = this.f2172b;
        if (i7 == 1) {
            str = "and";
        } else {
            if (i7 != 2) {
                throw null;
            }
            str = "or";
        }
        sb.append(str.concat("("));
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
        return sb.toString();
    }

    @Override // E4.AbstractC0178k
    public final List b() {
        return Collections.unmodifiableList(this.f2171a);
    }

    @Override // E4.AbstractC0178k
    public final List c() {
        ArrayList arrayList = this.f2173c;
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        this.f2173c = new ArrayList();
        Iterator it = this.f2171a.iterator();
        while (it.hasNext()) {
            this.f2173c.addAll(((AbstractC0178k) it.next()).c());
        }
        return Collections.unmodifiableList(this.f2173c);
    }

    @Override // E4.AbstractC0178k
    public final boolean d(H4.k kVar) {
        boolean e7 = e();
        ArrayList arrayList = this.f2171a;
        if (e7) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((AbstractC0178k) it.next()).d(kVar)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((AbstractC0178k) it2.next()).d(kVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        return this.f2172b == 1;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0171d)) {
            return false;
        }
        C0171d c0171d = (C0171d) obj;
        return this.f2172b == c0171d.f2172b && this.f2171a.equals(c0171d.f2171a);
    }

    public final int hashCode() {
        return this.f2171a.hashCode() + ((t.e.e(this.f2172b) + 1147) * 31);
    }

    public final String toString() {
        return a();
    }
}
