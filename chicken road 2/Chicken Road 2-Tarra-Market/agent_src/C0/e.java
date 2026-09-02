package C0;

import Q.E;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.skytonedarps.arskthrp.MainActivity;
import com.yandex.varioqub.appmetricaadapter.AppMetricaAdapter;
import com.yandex.varioqub.config.Varioqub;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import io.appmetrica.analytics.flutter.pigeon.Pigeon;
import io.appmetrica.analytics.impl.C0363l2;
import io.appmetrica.analytics.impl.C2;
import io.appmetrica.analytics.impl.E2;
import io.appmetrica.analytics.impl.P5;
import java.util.ArrayList;
import k0.C0783c;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements D0.c, D0.j, D0.b, FunctionWithThrowable, ActivationBarrierCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f59b;

    public /* synthetic */ e(int i2, Object obj) {
        this.f58a = i2;
        this.f59b = obj;
    }

    @Override // D0.b
    public void a(Object obj, Y.e eVar) {
        switch (this.f58a) {
            case 2:
                Pigeon.AppMetricaConfigConverterPigeon.lambda$setup$0((Pigeon.AppMetricaConfigConverterPigeon) this.f59b, obj, eVar);
                break;
            case 3:
                Pigeon.AppMetricaLibraryAdapterPigeon.lambda$setup$0((Pigeon.AppMetricaLibraryAdapterPigeon) this.f59b, obj, eVar);
                break;
            case 4:
                Pigeon.InitialDeepLinkHolderPigeon.lambda$setup$0((Pigeon.InitialDeepLinkHolderPigeon) this.f59b, obj, eVar);
                break;
            default:
                V.b bVar = (V.b) this.f59b;
                ArrayList arrayList = new ArrayList();
                C0783c c0783c = (C0783c) ((ArrayList) obj).get(0);
                try {
                    Context context = bVar.f498a;
                    try {
                        Varioqub.init(j0.c.a(c0783c), new AppMetricaAdapter(context), context);
                    } catch (Throwable th) {
                        Log.e("VarioqubFlutter", "Something went wrong while parsing Varioqub Settings", th);
                    }
                    arrayList.add(0, null);
                } catch (Throwable th2) {
                    arrayList = V.a.G(th2);
                }
                eVar.e(arrayList);
                break;
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        E2 a2;
        switch (this.f58a) {
            case 5:
                a2 = C2.a((C0363l2) this.f59b, (UsageStatsManager) obj);
                return a2;
            default:
                return io.appmetrica.analytics.location.impl.u.a((io.appmetrica.analytics.location.impl.u) this.f59b, (LocationManager) obj);
        }
    }

    @Override // D0.j
    public void d(Y.e call, p pVar) {
        MainActivity mainActivity = (MainActivity) this.f59b;
        int i2 = MainActivity.f755g;
        kotlin.jvm.internal.j.e(call, "call");
        if (!kotlin.jvm.internal.j.a((String) call.f523b, "openGallery")) {
            pVar.b();
            return;
        }
        String str = (String) call.n("phrase");
        if (str == null || a1.h.S(str)) {
            pVar.a("bad_args", "phrase required", null);
            return;
        }
        try {
            Y.e a2 = new e.d().a();
            Uri parse = Uri.parse(str);
            Intent intent = (Intent) a2.f523b;
            intent.setData(parse);
            mainActivity.startActivity(intent, (Bundle) a2.f524c);
            pVar.c(null);
        } catch (Exception e2) {
            pVar.a("gallery_fail", e2.getMessage(), null);
        }
    }

    @Override // D0.c
    public void e(Object obj) {
        boolean z2 = false;
        if (obj != null) {
            try {
                z2 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e2) {
                Log.e("KeyEventChannel", "Unable to unpack JSON message: " + e2);
            }
        }
        ((E) ((e) this.f59b).f59b).a(z2);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public void onWaitFinished() {
        P5.a((P5) this.f59b);
    }
}
