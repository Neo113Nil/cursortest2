package C0;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.UiModeManager;
import android.database.sqlite.SQLiteDatabase;
import android.telephony.SubscriptionManager;
import com.yandex.varioqub.config.Varioqub;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.Bo;
import io.appmetrica.analytics.impl.C0332jn;
import io.appmetrica.analytics.impl.C0370l9;
import io.appmetrica.analytics.impl.C0441o2;
import io.appmetrica.analytics.impl.C0563sl;
import io.appmetrica.analytics.impl.C0692xk;
import io.appmetrica.analytics.impl.C0722yo;
import io.appmetrica.analytics.impl.C0748zo;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E0;
import io.appmetrica.analytics.impl.InterfaceC0201el;
import io.appmetrica.analytics.impl.InterfaceC0410mn;
import io.appmetrica.analytics.impl.InterfaceC0471p6;
import io.appmetrica.analytics.impl.Pd;
import io.appmetrica.analytics.impl.T7;
import io.appmetrica.analytics.impl.Yd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements FunctionWithThrowable, Yd, InterfaceC0471p6, InterfaceC0410mn, Bo, D0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f98a;

    public /* synthetic */ n(int i2) {
        this.f98a = i2;
    }

    @Override // io.appmetrica.analytics.impl.Yd
    public InterfaceC0201el a(E0 e02) {
        switch (this.f98a) {
            case 2:
                return Pd.a(e02);
            default:
                return Pd.b(e02);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        Boolean a2;
        List a3;
        switch (this.f98a) {
            case 1:
                a2 = C2.a((ActivityManager) obj);
                return a2;
            case 2:
            case 3:
            default:
                a3 = C0563sl.a((SubscriptionManager) obj);
                return a3;
            case 4:
                return T7.a((UiModeManager) obj);
            case 5:
                return C0332jn.b((Activity) obj);
        }
    }

    public /* synthetic */ n(int i2, Object obj) {
        this.f98a = i2;
    }

    @Override // io.appmetrica.analytics.impl.Bo
    public JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        switch (this.f98a) {
            case 9:
                return C0722yo.a(jSONObject, jSONObject2);
            default:
                return C0748zo.a(jSONObject, jSONObject2);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0410mn
    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return C0692xk.a(sQLiteDatabase);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0471p6
    public boolean a(Throwable th) {
        return C0441o2.a(th);
    }

    @Override // D0.b
    public void a(Object obj, Y.e eVar) {
        Long valueOf;
        switch (this.f98a) {
            case 11:
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = (ArrayList) obj;
                try {
                    Varioqub.putClientFeature((String) arrayList2.get(0), (String) arrayList2.get(1));
                    arrayList.add(0, null);
                } catch (Throwable th) {
                    arrayList = V.a.G(th);
                }
                eVar.e(arrayList);
                break;
            case 12:
                ArrayList arrayList3 = new ArrayList();
                try {
                    Varioqub.clearClientFeatures();
                    arrayList3.add(0, null);
                } catch (Throwable th2) {
                    arrayList3 = V.a.G(th2);
                }
                eVar.e(arrayList3);
                break;
            case 13:
                ArrayList arrayList4 = new ArrayList();
                try {
                    arrayList4.add(0, new ArrayList(Varioqub.getAllKeys()));
                } catch (Throwable th3) {
                    arrayList4 = V.a.G(th3);
                }
                eVar.e(arrayList4);
                break;
            case 14:
                ArrayList arrayList5 = new ArrayList();
                try {
                    Varioqub.setDefaults((Map) ((ArrayList) obj).get(0));
                    arrayList5.add(0, null);
                } catch (Throwable th4) {
                    arrayList5 = V.a.G(th4);
                }
                eVar.e(arrayList5);
                break;
            case 15:
                Varioqub.fetchConfig(new io.flutter.plugin.editing.a(4, new Y.e(new ArrayList(), eVar, 25, false)));
                break;
            case 16:
                ArrayList arrayList6 = new ArrayList();
                try {
                    Varioqub.activateConfig(null);
                    arrayList6.add(0, null);
                } catch (Throwable th5) {
                    arrayList6 = V.a.G(th5);
                }
                eVar.e(arrayList6);
                break;
            case 17:
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = (ArrayList) obj;
                try {
                    arrayList7.add(0, Varioqub.getString((String) arrayList8.get(0), (String) arrayList8.get(1)));
                } catch (Throwable th6) {
                    arrayList7 = V.a.G(th6);
                }
                eVar.e(arrayList7);
                break;
            case 18:
                ArrayList arrayList9 = new ArrayList();
                ArrayList arrayList10 = (ArrayList) obj;
                try {
                    arrayList9.add(0, Boolean.valueOf(Varioqub.getBoolean((String) arrayList10.get(0), ((Boolean) arrayList10.get(1)).booleanValue())));
                } catch (Throwable th7) {
                    arrayList9 = V.a.G(th7);
                }
                eVar.e(arrayList9);
                break;
            case C0370l9.f4317C /* 19 */:
                ArrayList arrayList11 = new ArrayList();
                ArrayList arrayList12 = (ArrayList) obj;
                String str = (String) arrayList12.get(0);
                Number number = (Number) arrayList12.get(1);
                if (number == null) {
                    valueOf = null;
                } else {
                    try {
                        valueOf = Long.valueOf(number.longValue());
                    } catch (Throwable th8) {
                        arrayList11 = V.a.G(th8);
                    }
                }
                arrayList11.add(0, Long.valueOf(Varioqub.getLong(str, valueOf.longValue())));
                eVar.e(arrayList11);
                break;
            case C0370l9.f4318D /* 20 */:
                ArrayList arrayList13 = new ArrayList();
                ArrayList arrayList14 = (ArrayList) obj;
                try {
                    arrayList13.add(0, Double.valueOf(Varioqub.getDouble((String) arrayList14.get(0), ((Double) arrayList14.get(1)).doubleValue())));
                } catch (Throwable th9) {
                    arrayList13 = V.a.G(th9);
                }
                eVar.e(arrayList13);
                break;
            default:
                ArrayList arrayList15 = new ArrayList();
                try {
                    arrayList15.add(0, Varioqub.getId());
                } catch (Throwable th10) {
                    arrayList15 = V.a.G(th10);
                }
                eVar.e(arrayList15);
                break;
        }
    }
}
