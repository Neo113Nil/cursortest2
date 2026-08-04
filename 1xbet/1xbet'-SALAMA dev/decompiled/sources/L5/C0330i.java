package L5;

import F2.F0;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: L5.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0330i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4478c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0327f f4479d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f4480e;

    public C0330i(p167y2.v vVar) {
        String strZzi;
        String strZzg;
        vVar.getClass();
        F0 f7 = vVar.f18189a;
        if (f7 != null) {
            try {
                strZzi = f7.zzi();
            } catch (RemoteException e7) {
                J2.j.e("Could not forward getResponseId to ResponseInfo.", e7);
                strZzi = null;
            }
        } else {
            strZzi = null;
        }
        this.f4476a = strZzi;
        if (f7 != null) {
            try {
                strZzg = f7.zzg();
            } catch (RemoteException e8) {
                J2.j.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
                strZzg = null;
            }
        } else {
            strZzg = null;
        }
        this.f4477b = strZzg;
        ArrayList arrayList = new ArrayList();
        Iterator it = vVar.f18190b.iterator();
        while (it.hasNext()) {
            arrayList.add(new C0327f((p167y2.k) it.next()));
        }
        this.f4478c = arrayList;
        p167y2.k kVar = vVar.f18191c;
        if (kVar != null) {
            this.f4479d = new C0327f(kVar);
        } else {
            this.f4479d = null;
        }
        HashMap map = new HashMap();
        if (vVar.a() != null) {
            for (String str : vVar.a().keySet()) {
                map.put(str, vVar.a().getString(str));
            }
        }
        this.f4480e = map;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0330i)) {
            return false;
        }
        C0330i c0330i = (C0330i) obj;
        return Objects.equals(this.f4476a, c0330i.f4476a) && Objects.equals(this.f4477b, c0330i.f4477b) && Objects.equals(this.f4478c, c0330i.f4478c) && Objects.equals(this.f4479d, c0330i.f4479d);
    }

    public final int hashCode() {
        return Objects.hash(this.f4476a, this.f4477b, this.f4478c, this.f4479d);
    }

    public C0330i(String str, String str2, List list, C0327f c0327f, Map map) {
        this.f4476a = str;
        this.f4477b = str2;
        this.f4478c = list;
        this.f4479d = c0327f;
        this.f4480e = map;
    }
}
