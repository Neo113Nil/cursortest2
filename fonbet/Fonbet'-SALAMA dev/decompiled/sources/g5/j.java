package g5;

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
import q5.AbstractActivityC1559c;

/* loaded from: classes2.dex */
public final class j implements q {

    /* renamed from: a, reason: collision with root package name */
    public Context f13259a;

    /* renamed from: b, reason: collision with root package name */
    public AbstractActivityC1559c f13260b;

    /* renamed from: c, reason: collision with root package name */
    public final A5.f f13261c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13262d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13263e;

    public j(A5.f fVar) {
        this.f13261c = fVar;
        new s(fVar, "com.ryanheise.audio_service.client.methods").b(this);
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        Integer num;
        int intValue;
        try {
            if (this.f13262d) {
                throw new IllegalStateException("The Activity class declared in your AndroidManifest.xml is wrong or has not provided the correct FlutterEngine. Please see the README for instructions.");
            }
            String str = oVar.f676a;
            if (str.hashCode() == -804429082 && str.equals("configure")) {
                if (this.f13263e) {
                    throw new IllegalStateException("Unable to bind to AudioService. Please ensure you have declared a <service> element as described in the README.");
                }
                l.f13269C = true;
                Map map = (Map) ((Map) oVar.f677b).get("config");
                C1148c c1148c = new C1148c(this.f13259a.getApplicationContext());
                c1148c.f13239i = ((Boolean) map.get("androidNotificationClickStartsActivity")).booleanValue();
                c1148c.j = ((Boolean) map.get("androidNotificationOngoing")).booleanValue();
                c1148c.f13232b = ((Boolean) map.get("androidResumeOnClick")).booleanValue();
                c1148c.f13233c = (String) map.get("androidNotificationChannelId");
                c1148c.f13234d = (String) map.get("androidNotificationChannelName");
                c1148c.f13235e = (String) map.get("androidNotificationChannelDescription");
                if (map.get("notificationColor") == null) {
                    intValue = -1;
                } else {
                    Object obj = map.get("notificationColor");
                    if (obj != null && !(obj instanceof Integer)) {
                        num = Integer.valueOf((int) ((Long) obj).longValue());
                        intValue = num.intValue();
                    }
                    num = (Integer) obj;
                    intValue = num.intValue();
                }
                c1148c.f13236f = intValue;
                c1148c.f13237g = (String) map.get("androidNotificationIcon");
                c1148c.f13238h = ((Boolean) map.get("androidShowNotificationBadge")).booleanValue();
                c1148c.f13240k = ((Boolean) map.get("androidStopForegroundOnPause")).booleanValue();
                c1148c.f13241l = map.get("artDownscaleWidth") != null ? ((Integer) map.get("artDownscaleWidth")).intValue() : -1;
                c1148c.f13242m = map.get("artDownscaleHeight") != null ? ((Integer) map.get("artDownscaleHeight")).intValue() : -1;
                Map map2 = (Map) map.get("androidBrowsableRootExtras");
                if (map2 != null) {
                    c1148c.f13244o = new JSONObject(map2).toString();
                } else {
                    c1148c.f13244o = null;
                }
                AbstractActivityC1559c abstractActivityC1559c = this.f13260b;
                if (abstractActivityC1559c != null) {
                    c1148c.f13243n = abstractActivityC1559c.getClass().getName();
                }
                c1148c.a();
                AudioService audioService = AudioService.f12300P;
                if (audioService != null) {
                    audioService.h(c1148c);
                }
                l.f13274y = this;
                I4.j jVar = l.f13275z;
                A5.f fVar = this.f13261c;
                if (jVar == null) {
                    I4.j jVar2 = new I4.j(fVar);
                    l.f13275z = jVar2;
                    AudioService.f12302R = jVar2;
                } else {
                    if (((A5.f) jVar.f3678b) != fVar) {
                        ((s) jVar.f3679c).b(null);
                        jVar.f3678b = fVar;
                        s sVar = new s(fVar, "com.ryanheise.audio_service.handler.methods");
                        jVar.f3679c = sVar;
                        sVar.b(jVar);
                    }
                    I4.j jVar3 = l.f13275z;
                    LinkedList<k> linkedList = (LinkedList) jVar3.f3682f;
                    for (k kVar : linkedList) {
                        ((s) jVar3.f3679c).a(kVar.f13264a, kVar.f13265b, kVar.f13266c);
                    }
                    linkedList.clear();
                }
                if (l.f13271E != null) {
                    ((p) rVar).success(l.k(new Object[0]));
                } else {
                    l.f13268B = (p) rVar;
                }
            }
        } catch (Exception e7) {
            e7.printStackTrace();
            ((p) rVar).error(e7.getMessage(), null, null);
        }
    }
}
