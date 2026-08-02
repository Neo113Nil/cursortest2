package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.facebook.C0728q;
import com.facebook.G;
import com.facebook.appevents.internal.h;
import com.facebook.appevents.l;
import com.facebook.appevents.p;
import com.facebook.internal.C0705a;
import com.facebook.internal.E;
import com.facebook.internal.u;
import com.facebook.w;
import com.facebook.z;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) obj2).lambda$audioSinkError$8((Exception) obj);
                return;
            case 1:
                Context applicationContext = (Context) obj2;
                String applicationId = (String) obj;
                Intrinsics.checkNotNullParameter(applicationContext, "$applicationContext");
                Intrinsics.checkNotNullParameter(applicationId, "$applicationId");
                w wVar = w.a;
                wVar.getClass();
                try {
                    if (com.facebook.internal.instrument.crashshield.a.b(wVar)) {
                        return;
                    }
                    try {
                        C0705a.Companion.getClass();
                        C0705a a = C0705a.C0089a.a(applicationContext);
                        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
                        String concat = applicationId.concat("ping");
                        long j = sharedPreferences.getLong(concat, 0L);
                        try {
                            h.a aVar = h.a.a;
                            com.facebook.appevents.l.Companion.getClass();
                            JSONObject a2 = com.facebook.appevents.internal.h.a(aVar, a, l.a.b(applicationContext), w.f(applicationContext), applicationContext);
                            com.facebook.appevents.p.Companion.getClass();
                            String d = p.a.d();
                            if (d != null) {
                                a2.put("install_referrer", d);
                            }
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format("%s/activities", Arrays.copyOf(new Object[]{applicationId}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
                            w.t.getClass();
                            z.Companion.getClass();
                            z h = z.c.h(null, format, a2, null);
                            if (j == 0 && h.c().c == null) {
                                SharedPreferences.Editor edit = sharedPreferences.edit();
                                edit.putLong(concat, System.currentTimeMillis());
                                edit.apply();
                                u.a aVar2 = u.Companion;
                                G g = G.d;
                                String TAG = w.b;
                                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                                aVar2.getClass();
                                u.a.a(g, TAG, "MOBILE_APP_INSTALL has been logged");
                                return;
                            }
                            return;
                        } catch (JSONException e) {
                            throw new C0728q("An error occurred while publishing install.", e);
                        }
                    } catch (Exception unused) {
                        E e2 = E.a;
                        return;
                    }
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, wVar);
                    return;
                }
            case 2:
                ((com.tekartik.sqflite.d) obj2).e((com.tekartik.sqflite.operation.c) obj);
                return;
            default:
                FlutterFirebaseMessagingPlugin.lambda$setDeliveryMetricsExportToBigQuery$8((Map) obj2, (TaskCompletionSource) obj);
                return;
        }
    }
}
