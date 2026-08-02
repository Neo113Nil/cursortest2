package L5;

import F2.F0;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: L5.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0330i {

    /* renamed from: a, reason: collision with root package name */
    public final String f4476a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4477b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4478c;

    /* renamed from: d, reason: collision with root package name */
    public final C0327f f4479d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f4480e;

    /* JADX WARN: Removed duplicated region for block: B:10:0x003a A[LOOP:0: B:8:0x0034->B:10:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x001b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0330i(y2.v vVar) {
        String zzi;
        String zzg;
        Iterator it;
        y2.k kVar;
        vVar.getClass();
        F0 f02 = vVar.f18183a;
        if (f02 != null) {
            try {
                zzi = f02.zzi();
            } catch (RemoteException e7) {
                J2.j.e("Could not forward getResponseId to ResponseInfo.", e7);
            }
            this.f4476a = zzi;
            if (f02 != null) {
                try {
                    zzg = f02.zzg();
                } catch (RemoteException e8) {
                    J2.j.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
                }
                this.f4477b = zzg;
                ArrayList arrayList = new ArrayList();
                it = vVar.f18184b.iterator();
                while (it.hasNext()) {
                    arrayList.add(new C0327f((y2.k) it.next()));
                }
                this.f4478c = arrayList;
                kVar = vVar.f18185c;
                if (kVar != null) {
                    this.f4479d = new C0327f(kVar);
                } else {
                    this.f4479d = null;
                }
                HashMap hashMap = new HashMap();
                if (vVar.a() != null) {
                    for (String str : vVar.a().keySet()) {
                        hashMap.put(str, vVar.a().getString(str));
                    }
                }
                this.f4480e = hashMap;
            }
            zzg = null;
            this.f4477b = zzg;
            ArrayList arrayList2 = new ArrayList();
            it = vVar.f18184b.iterator();
            while (it.hasNext()) {
            }
            this.f4478c = arrayList2;
            kVar = vVar.f18185c;
            if (kVar != null) {
            }
            HashMap hashMap2 = new HashMap();
            if (vVar.a() != null) {
            }
            this.f4480e = hashMap2;
        }
        zzi = null;
        this.f4476a = zzi;
        if (f02 != null) {
        }
        zzg = null;
        this.f4477b = zzg;
        ArrayList arrayList22 = new ArrayList();
        it = vVar.f18184b.iterator();
        while (it.hasNext()) {
        }
        this.f4478c = arrayList22;
        kVar = vVar.f18185c;
        if (kVar != null) {
        }
        HashMap hashMap22 = new HashMap();
        if (vVar.a() != null) {
        }
        this.f4480e = hashMap22;
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
