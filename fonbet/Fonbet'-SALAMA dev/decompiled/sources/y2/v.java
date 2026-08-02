package y2;

import F2.C0252s;
import F2.F0;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final F0 f18183a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f18184b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final k f18185c;

    public v(F0 f02) {
        this.f18183a = f02;
        if (f02 != null) {
            try {
                List<zzv> zzj = f02.zzj();
                if (zzj != null) {
                    for (zzv zzvVar : zzj) {
                        k kVar = zzvVar != null ? new k(zzvVar) : null;
                        if (kVar != null) {
                            this.f18184b.add(kVar);
                        }
                    }
                }
            } catch (RemoteException e7) {
                J2.j.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e7);
            }
        }
        F0 f03 = this.f18183a;
        if (f03 == null) {
            return;
        }
        try {
            zzv zzf = f03.zzf();
            if (zzf != null) {
                this.f18185c = new k(zzf);
            }
        } catch (RemoteException e8) {
            J2.j.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e8);
        }
    }

    public final Bundle a() {
        try {
            F0 f02 = this.f18183a;
            if (f02 != null) {
                return f02.zze();
            }
        } catch (RemoteException e7) {
            J2.j.e("Could not forward getResponseExtras to ResponseInfo.", e7);
        }
        return new Bundle();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[LOOP:0: B:12:0x0046->B:14:0x004c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject b() {
        String zzi;
        Iterator it;
        k kVar;
        Bundle a2;
        F0 f02 = this.f18183a;
        JSONObject jSONObject = new JSONObject();
        String str = null;
        if (f02 != null) {
            try {
                zzi = f02.zzi();
            } catch (RemoteException e7) {
                J2.j.e("Could not forward getResponseId to ResponseInfo.", e7);
            }
            if (zzi != null) {
                jSONObject.put("Response ID", "null");
            } else {
                jSONObject.put("Response ID", zzi);
            }
            if (f02 != null) {
                try {
                    str = f02.zzg();
                } catch (RemoteException e8) {
                    J2.j.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
                }
            }
            if (str != null) {
                jSONObject.put("Mediation Adapter Class Name", "null");
            } else {
                jSONObject.put("Mediation Adapter Class Name", str);
            }
            JSONArray jSONArray = new JSONArray();
            it = this.f18184b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((k) it.next()).a());
            }
            jSONObject.put("Adapter Responses", jSONArray);
            kVar = this.f18185c;
            if (kVar != null) {
                jSONObject.put("Loaded Adapter Response", kVar.a());
            }
            a2 = a();
            if (a2 != null) {
                jSONObject.put("Response Extras", C0252s.f2717f.f2718a.j(a2));
            }
            return jSONObject;
        }
        zzi = null;
        if (zzi != null) {
        }
        if (f02 != null) {
        }
        if (str != null) {
        }
        JSONArray jSONArray2 = new JSONArray();
        it = this.f18184b.iterator();
        while (it.hasNext()) {
        }
        jSONObject.put("Adapter Responses", jSONArray2);
        kVar = this.f18185c;
        if (kVar != null) {
        }
        a2 = a();
        if (a2 != null) {
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return b().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
