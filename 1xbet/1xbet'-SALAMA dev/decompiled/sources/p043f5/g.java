package p043f5;

import A5.f;
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
import java.util.List;
import java.util.Map;
import p159w5.b;
import p159w5.c;

/* JADX INFO: loaded from: classes2.dex */
public class g implements c, q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Map f12999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f13000d = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f13001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f13002b;

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        f fVar = bVar.f18083c;
        s sVar = new s(fVar, "com.ryanheise.audio_session");
        this.f13001a = sVar;
        sVar.b(this);
        f fVar2 = new f();
        if (f.f12997b == null) {
            C0436c c0436c = new C0436c();
            Handler handler = new Handler(Looper.getMainLooper());
            c0436c.f6462b = new ArrayList();
            c0436c.f6461a = new ArrayList();
            Context context = bVar.f18081a;
            c0436c.f6466f = context;
            c0436c.f6467g = (AudioManager) context.getSystemService("audio");
            d dVar = new d(c0436c);
            c0436c.f6468h = dVar;
            ((AudioManager) c0436c.f6467g).registerAudioDeviceCallback(dVar, handler);
            f.f12997b = c0436c;
        }
        fVar2.f12998a = new s(fVar, "com.ryanheise.android_audio_manager");
        ((ArrayList) f.f12997b.f6462b).add(fVar2);
        fVar2.f12998a.b(fVar2);
        this.f13002b = fVar2;
        f13000d.add(this);
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        this.f13001a.b(null);
        this.f13001a = null;
        f fVar = this.f13002b;
        fVar.f12998a.b(null);
        ((ArrayList) f.f12997b.f6462b).remove(fVar);
        if (((ArrayList) f.f12997b.f6462b).size() == 0) {
            C0436c c0436c = f.f12997b;
            c0436c.a();
            ((AudioManager) c0436c.f6467g).unregisterAudioDeviceCallback((d) c0436c.f6468h);
            c0436c.f6466f = null;
            c0436c.f6467g = null;
            f.f12997b = null;
        }
        fVar.f12998a = null;
        this.f13002b = null;
        f13000d.remove(this);
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
                ((p) rVar).success(f12999c);
                return;
            }
        }
        f12999c = (Map) list.get(0);
        ((p) rVar).success(null);
        Object[] objArr = {f12999c};
        for (g gVar : f13000d) {
            gVar.f13001a.a("onConfigurationChanged", new ArrayList(Arrays.asList(objArr)), null);
        }
    }
}
