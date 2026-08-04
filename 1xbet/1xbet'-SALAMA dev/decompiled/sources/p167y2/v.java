package p167y2;

import F2.C0252s;
import F2.F0;
import J2.j;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzv;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F0 f18189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f18190b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f18191c;

    public v(F0 f7) {
        this.f18189a = f7;
        if (f7 != null) {
            try {
                List<zzv> listZzj = f7.zzj();
                if (listZzj != null) {
                    for (zzv zzvVar : listZzj) {
                        k kVar = zzvVar != null ? new k(zzvVar) : null;
                        if (kVar != null) {
                            this.f18190b.add(kVar);
                        }
                    }
                }
            } catch (RemoteException e7) {
                j.e("Could not forward getAdapterResponseInfo to ResponseInfo.", e7);
            }
        }
        F0 f8 = this.f18189a;
        if (f8 == null) {
            return;
        }
        try {
            zzv zzvVarZzf = f8.zzf();
            if (zzvVarZzf != null) {
                this.f18191c = new k(zzvVarZzf);
            }
        } catch (RemoteException e8) {
            j.e("Could not forward getLoadedAdapterResponse to ResponseInfo.", e8);
        }
    }

    public final Bundle a() {
        try {
            F0 f7 = this.f18189a;
            if (f7 != null) {
                return f7.zze();
            }
        } catch (RemoteException e7) {
            j.e("Could not forward getResponseExtras to ResponseInfo.", e7);
        }
        return new Bundle();
    }

    public final JSONObject b() throws JSONException {
        String strZzi;
        F0 f7 = this.f18189a;
        JSONObject jSONObject = new JSONObject();
        String strZzg = null;
        if (f7 != null) {
            try {
                strZzi = f7.zzi();
            } catch (RemoteException e7) {
                j.e("Could not forward getResponseId to ResponseInfo.", e7);
                strZzi = null;
            }
        } else {
            strZzi = null;
        }
        if (strZzi == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", strZzi);
        }
        if (f7 != null) {
            try {
                strZzg = f7.zzg();
            } catch (RemoteException e8) {
                j.e("Could not forward getMediationAdapterClassName to ResponseInfo.", e8);
            }
        }
        if (strZzg == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", strZzg);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = this.f18190b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((k) it.next()).a());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        k kVar = this.f18191c;
        if (kVar != null) {
            jSONObject.put("Loaded Adapter Response", kVar.a());
        }
        Bundle bundleA = a();
        if (bundleA != null) {
            jSONObject.put("Response Extras", C0252s.f2717f.f2718a.j(bundleA));
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
