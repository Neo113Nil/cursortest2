package p049g5;

import A5.f;
import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import android.content.Context;
import com.ryanheise.audioservice.AudioService;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;
import p121q5.c;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f13265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f13266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f13267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13269e;

    public j(f fVar) {
        this.f13267c = fVar;
        new s(fVar, "com.ryanheise.audio_service.client.methods").b(this);
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        int iIntValue;
        try {
            if (this.f13268d) {
                throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
            }
            String str = oVar.f676a;
            if (str.hashCode() == -804429082 && str.equals("configure")) {
                if (this.f13269e) {
                    throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                }
                l.f13275C = true;
                Map map = (Map) ((Map) oVar.f677b).get("config");
                c cVar = new c(this.f13265a.getApplicationContext());
                cVar.f13245i = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                cVar.j = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                cVar.f13238b = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                cVar.f13239c = (String) map.get("androidNotificationChannelId");
                cVar.f13240d = (String) map.get("androidNotificationChannelName");
                cVar.f13241e = (String) map.get("androidNotificationChannelDescription");
                if (map.get("notificationColor") == null) {
                    iIntValue = -1;
                } else {
                    Object obj = map.get("notificationColor");
                    iIntValue = ((obj == null || (obj instanceof Integer)) ? (Integer) obj : Integer.valueOf((int) ((Long) obj).longValue())).intValue();
                }
                cVar.f13242f = iIntValue;
                cVar.f13243g = (String) map.get("androidNotificationIcon");
                cVar.f13244h = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                cVar.f13246k = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                cVar.f13247l = map.get("artDownscaleWidth") != null ? ((Integer) map.get("artDownscaleWidth")).intValue() : -1;
                cVar.f13248m = map.get("artDownscaleHeight") != null ? ((Integer) map.get("artDownscaleHeight")).intValue() : -1;
                Map map2 = (Map) map.get("androidBrowsableRootExtras");
                if (map2 != null) {
                    cVar.f13250o = new JSONObject(map2).toString();
                } else {
                    cVar.f13250o = null;
                }
                c cVar2 = this.f13266b;
                if (cVar2 != null) {
                    cVar.f13249n = cVar2.getClass().getName();
                }
                cVar.a();
                AudioService audioService = AudioService.f12300P;
                if (audioService != null) {
                    audioService.h(cVar);
                }
                l.f13280y = this;
                I4.j jVar = l.f13281z;
                f fVar = this.f13267c;
                if (jVar == null) {
                    I4.j jVar2 = new I4.j(fVar);
                    l.f13281z = jVar2;
                    AudioService.f12302R = jVar2;
                } else {
                    if (((f) jVar.f3678b) != fVar) {
                        ((s) jVar.f3679c).b(null);
                        jVar.f3678b = fVar;
                        s sVar = new s(fVar, "com.ryanheise.audio_service.handler.methods");
                        jVar.f3679c = sVar;
                        sVar.b(jVar);
                    }
                    I4.j jVar3 = l.f13281z;
                    LinkedList<k> linkedList = (LinkedList) jVar3.f3682f;
                    for (k kVar : linkedList) {
                        ((s) jVar3.f3679c).a(kVar.f13270a, kVar.f13271b, kVar.f13272c);
                    }
                    linkedList.clear();
                }
                if (l.f13277E != null) {
                    ((p) rVar).success(l.k(new Object[0]));
                } else {
                    l.f13274B = (p) rVar;
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            ((p) rVar).error(e7.getMessage(), null, null);
        }
    }
}
