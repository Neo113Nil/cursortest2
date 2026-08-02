package J2;

import Q2.C0379q;
import Q2.InterfaceC0383s0;
import Q2.c1;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0383s0 f2726a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2727b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final k f2728c;

    public q(InterfaceC0383s0 interfaceC0383s0) {
        this.f2726a = interfaceC0383s0;
        if (interfaceC0383s0 != null) {
            try {
                List<c1> h3 = interfaceC0383s0.h();
                if (h3 != null) {
                    for (c1 c1Var : h3) {
                        k kVar = c1Var != null ? new k(c1Var) : null;
                        if (kVar != null) {
                            this.f2727b.add(kVar);
                        }
                    }
                }
            } catch (RemoteException e3) {
                U2.j.g("Could not forward getAdapterResponseInfo to ResponseInfo.", e3);
            }
        }
        InterfaceC0383s0 interfaceC0383s02 = this.f2726a;
        if (interfaceC0383s02 == null) {
            return;
        }
        try {
            c1 c5 = interfaceC0383s02.c();
            if (c5 != null) {
                this.f2728c = new k(c5);
            }
        } catch (RemoteException e5) {
            U2.j.g("Could not forward getLoadedAdapterResponse to ResponseInfo.", e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0049 A[LOOP:0: B:12:0x0047->B:13:0x0049, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0025 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject a() {
        String e3;
        int size;
        int i;
        k kVar;
        Bundle b3;
        JSONObject jSONObject = new JSONObject();
        InterfaceC0383s0 interfaceC0383s0 = this.f2726a;
        String str = null;
        if (interfaceC0383s0 != null) {
            try {
                e3 = interfaceC0383s0.e();
            } catch (RemoteException e5) {
                U2.j.g("Could not forward getResponseId to ResponseInfo.", e5);
            }
            if (e3 != null) {
                jSONObject.put("Response ID", "null");
            } else {
                jSONObject.put("Response ID", e3);
            }
            if (interfaceC0383s0 != null) {
                try {
                    str = interfaceC0383s0.f();
                } catch (RemoteException e6) {
                    U2.j.g("Could not forward getMediationAdapterClassName to ResponseInfo.", e6);
                }
            }
            if (str != null) {
                jSONObject.put("Mediation Adapter Class Name", "null");
            } else {
                jSONObject.put("Mediation Adapter Class Name", str);
            }
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = this.f2727b;
            size = arrayList.size();
            i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                jSONArray.put(((k) obj).a());
            }
            jSONObject.put("Adapter Responses", jSONArray);
            kVar = this.f2728c;
            if (kVar != null) {
                jSONObject.put("Loaded Adapter Response", kVar.a());
            }
            if (interfaceC0383s0 != null) {
                try {
                    b3 = interfaceC0383s0.b();
                } catch (RemoteException e7) {
                    U2.j.g("Could not forward getResponseExtras to ResponseInfo.", e7);
                }
                if (b3 != null) {
                    jSONObject.put("Response Extras", C0379q.f.f5048a.f(b3));
                }
                return jSONObject;
            }
            b3 = new Bundle();
            if (b3 != null) {
            }
            return jSONObject;
        }
        e3 = null;
        if (e3 != null) {
        }
        if (interfaceC0383s0 != null) {
        }
        if (str != null) {
        }
        JSONArray jSONArray2 = new JSONArray();
        ArrayList arrayList2 = this.f2727b;
        size = arrayList2.size();
        i = 0;
        while (i < size) {
        }
        jSONObject.put("Adapter Responses", jSONArray2);
        kVar = this.f2728c;
        if (kVar != null) {
        }
        if (interfaceC0383s0 != null) {
        }
        b3 = new Bundle();
        if (b3 != null) {
        }
        return jSONObject;
    }

    public final String toString() {
        try {
            return a().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }
}
