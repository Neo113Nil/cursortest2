package androidx.core.widget;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import androidx.media3.ui.PlayerView;
import androidx.room.QueryInterceptorStatement;
import com.facebook.F;
import com.facebook.appevents.internal.g;
import com.facebook.internal.C0705a;
import com.facebook.internal.E;
import com.facebook.w;
import com.facebook.z;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Locale locale;
        switch (this.a) {
            case 0:
                ((ContentLoadingProgressBar) this.b).lambda$new$1();
                break;
            case 1:
                ((PlayerView) this.b).invalidate();
                break;
            case 2:
                QueryInterceptorStatement.executeUpdateDelete$lambda$1((QueryInterceptorStatement) this.b);
                break;
            case 3:
                String str = (String) this.b;
                String str2 = SessionDescription.SUPPORTED_SDP_VERSION;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.codeless.b.class)) {
                    try {
                        Bundle bundle = new Bundle();
                        Context a = w.a();
                        C0705a.Companion.getClass();
                        C0705a a2 = C0705a.C0089a.a(a);
                        JSONArray jSONArray = new JSONArray();
                        String str3 = Build.MODEL;
                        if (str3 == null) {
                            str3 = "";
                        }
                        jSONArray.put(str3);
                        if ((a2 != null ? a2.a() : null) != null) {
                            jSONArray.put(a2.a());
                        } else {
                            jSONArray.put("");
                        }
                        jSONArray.put(SessionDescription.SUPPORTED_SDP_VERSION);
                        if (g.b()) {
                            str2 = "1";
                        }
                        jSONArray.put(str2);
                        E e = E.a;
                        try {
                            locale = w.a().getResources().getConfiguration().locale;
                        } catch (Exception unused) {
                            locale = null;
                        }
                        if (locale == null) {
                            locale = Locale.getDefault();
                            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
                        }
                        jSONArray.put(locale.getLanguage() + '_' + locale.getCountry());
                        String jSONArray2 = jSONArray.toString();
                        Intrinsics.checkNotNullExpressionValue(jSONArray2, "extInfoArray.toString()");
                        bundle.putString("device_session_id", com.facebook.appevents.codeless.b.a());
                        bundle.putString("extinfo", jSONArray2);
                        z.c cVar = z.Companion;
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        boolean z = true;
                        String format = String.format(Locale.US, "%s/app_indexing_session", Arrays.copyOf(new Object[]{str}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
                        cVar.getClass();
                        JSONObject jSONObject = new z(null, format, bundle, F.b, null, 32).c().b;
                        AtomicBoolean atomicBoolean = com.facebook.appevents.codeless.b.g;
                        if (jSONObject == null || !jSONObject.optBoolean("is_app_indexing_enabled", false)) {
                            z = false;
                        }
                        atomicBoolean.set(z);
                        if (atomicBoolean.get()) {
                            com.facebook.appevents.codeless.g gVar = com.facebook.appevents.codeless.b.d;
                            if (gVar != null) {
                                gVar.c();
                            }
                        } else {
                            com.facebook.appevents.codeless.b.e = null;
                        }
                        com.facebook.appevents.codeless.b.h = false;
                        break;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.codeless.b.class);
                        return;
                    }
                }
                break;
            default:
                ((CarouselLayoutManager) this.b).s();
                break;
        }
    }
}
