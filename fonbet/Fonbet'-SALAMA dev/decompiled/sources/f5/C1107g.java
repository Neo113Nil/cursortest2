package f5;

import A5.o;
import A5.p;
import A5.q;
import A5.r;
import A5.s;
import U5.C0436c;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: f5.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1107g implements InterfaceC1783c, q {

    /* renamed from: c, reason: collision with root package name */
    public static Map f12993c;

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList f12994d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public s f12995a;

    /* renamed from: b, reason: collision with root package name */
    public C1106f f12996b;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        A5.f fVar = c1782b.f18077c;
        s sVar = new s(fVar, "com.ryanheise.audio_session");
        this.f12995a = sVar;
        sVar.b(this);
        C1106f c1106f = new C1106f();
        if (C1106f.f12991b == null) {
            C0436c c0436c = new C0436c();
            Handler handler = new Handler(Looper.getMainLooper());
            c0436c.f6462b = new ArrayList();
            c0436c.f6461a = new ArrayList();
            Context context = c1782b.f18075a;
            c0436c.f6466f = context;
            c0436c.f6467g = (AudioManager) context.getSystemService("audio");
            C1104d c1104d = new C1104d(c0436c);
            c0436c.f6468h = c1104d;
            ((AudioManager) c0436c.f6467g).registerAudioDeviceCallback(c1104d, handler);
            C1106f.f12991b = c0436c;
        }
        c1106f.f12992a = new s(fVar, "com.ryanheise.android_audio_manager");
        ((ArrayList) C1106f.f12991b.f6462b).add(c1106f);
        c1106f.f12992a.b(c1106f);
        this.f12996b = c1106f;
        f12994d.add(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        this.f12995a.b(null);
        this.f12995a = null;
        C1106f c1106f = this.f12996b;
        c1106f.f12992a.b(null);
        ((ArrayList) C1106f.f12991b.f6462b).remove(c1106f);
        if (((ArrayList) C1106f.f12991b.f6462b).size() == 0) {
            C0436c c0436c = C1106f.f12991b;
            c0436c.a();
            ((AudioManager) c0436c.f6467g).unregisterAudioDeviceCallback((C1104d) c0436c.f6468h);
            c0436c.f6466f = null;
            c0436c.f6467g = null;
            C1106f.f12991b = null;
        }
        c1106f.f12992a = null;
        this.f12996b = null;
        f12994d.remove(this);
    }

    @Override // A5.q
    public final void onMethodCall(o oVar, r rVar) {
        List list = (List) oVar.f677b;
        String str = oVar.f676a;
        str.getClass();
        if (!str.equals("setConfiguration")) {
            if (!str.equals("getConfiguration")) {
                ((p) rVar).notImplemented();
                return;
            } else {
                ((p) rVar).success(f12993c);
                return;
            }
        }
        f12993c = (Map) list.get(0);
        ((p) rVar).success(null);
        Object[] objArr = {f12993c};
        Iterator it = f12994d.iterator();
        while (it.hasNext()) {
            C1107g c1107g = (C1107g) it.next();
            c1107g.f12995a.a("onConfigurationChanged", new ArrayList(Arrays.asList(objArr)), null);
        }
    }
}
