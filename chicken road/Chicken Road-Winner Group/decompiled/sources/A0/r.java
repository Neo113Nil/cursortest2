package A0;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import android.util.Base64;
import android.view.View;
import b2.InterfaceC0166c;
import com.startapp.sdk.internal.e3;
import com.startapp.sdk.internal.ng;
import i1.InterfaceC0333c;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.Bo;
import io.appmetrica.analytics.impl.C0606jn;
import io.appmetrica.analytics.impl.C0715o2;
import io.appmetrica.analytics.impl.C0837sl;
import io.appmetrica.analytics.impl.C0966xk;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.InterfaceC0475el;
import io.appmetrica.analytics.impl.InterfaceC0684mn;
import io.appmetrica.analytics.impl.InterfaceC0745p6;
import io.appmetrica.analytics.impl.Pd;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.Yd;
import io.appmetrica.analytics.impl.yo;
import io.appmetrica.analytics.impl.zo;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class r implements H0.g, InterfaceC0166c, e3, InterfaceC0333c, FunctionWithThrowable, Yd, InterfaceC0745p6, InterfaceC0684mn, Bo {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84a;

    public /* synthetic */ r(int i3) {
        this.f84a = i3;
    }

    @Override // com.startapp.sdk.internal.e3
    public long a() {
        return System.currentTimeMillis();
    }

    @Override // H0.g, io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Boolean a3;
        List a4;
        switch (this.f84a) {
            case 3:
                Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
                try {
                    Cursor cursor = rawQuery;
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        j a5 = k.a();
                        a5.O(cursor.getString(1));
                        a5.f68d = K0.a.b(cursor.getInt(2));
                        String string = cursor.getString(3);
                        a5.f67c = string == null ? null : Base64.decode(string, 0);
                        arrayList.add(a5.t());
                    }
                    return arrayList;
                } finally {
                    rawQuery.close();
                }
            case 8:
                a3 = C2.a((ActivityManager) obj);
                return a3;
            case 11:
                return T7.a((UiModeManager) obj);
            case 12:
                return C0606jn.b((Activity) obj);
            default:
                a4 = C0837sl.a((SubscriptionManager) obj);
                return a4;
        }
    }

    @Override // i1.InterfaceC0333c
    public void onSuccess(Object obj) {
        ng.a((M0.a) obj);
    }

    @Override // io.appmetrica.analytics.impl.Yd
    public InterfaceC0475el a(E0 e02) {
        switch (this.f84a) {
            case 9:
                return Pd.a(e02);
            default:
                return Pd.b(e02);
        }
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f84a) {
            case 16:
                return yo.a(jSONObject, jSONObject2);
            default:
                return zo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0684mn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0966xk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0745p6
    public boolean a(Throwable th) {
        return C0715o2.a(th);
    }

    @Override // b2.InterfaceC0166c
    public boolean a(View view) {
        return view.hasFocus();
    }
}
