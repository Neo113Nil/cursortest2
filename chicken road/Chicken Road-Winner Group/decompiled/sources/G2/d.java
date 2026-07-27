package G2;

import H2.p;
import S1.i;
import T1.l;
import T1.m;
import T1.n;
import T1.o;
import android.content.Context;
import android.media.AudioManager;
import d2.C0274d;
import e2.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d implements P1.b {

    /* renamed from: a, reason: collision with root package name */
    public a1.e f442a;

    /* renamed from: b, reason: collision with root package name */
    public Context f443b;

    /* renamed from: c, reason: collision with root package name */
    public T1.f f444c;

    /* renamed from: d, reason: collision with root package name */
    public a1.e f445d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentHashMap f446e = new ConcurrentHashMap();
    public a f = new a(false, false, 2, 1, 1, 0);

    public static void c(p player, boolean z3) {
        j.e(player, "player");
        player.f547b.E("audio.onPrepared", r.l0(new C0274d("value", Boolean.valueOf(z3))));
    }

    public final AudioManager a() {
        Context context = this.f443b;
        if (context == null) {
            j.g("context");
            throw null;
        }
        Object systemService = context.getApplicationContext().getSystemService("audio");
        j.c(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        return (AudioManager) systemService;
    }

    public final void b(String message) {
        j.e(message, "message");
        a1.e eVar = this.f442a;
        if (eVar != null) {
            eVar.E("audio.onLog", r.l0(new C0274d("value", message)));
        } else {
            j.g("globalEvents");
            throw null;
        }
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a binding) {
        j.e(binding, "binding");
        this.f443b = binding.f1152a;
        T1.f fVar = binding.f1153b;
        this.f444c = fVar;
        this.f445d = new a1.e(this);
        final int i3 = 0;
        new o(fVar, "xyz.luan/audioplayers").b(new m(this) { // from class: G2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f440b;

            {
                this.f440b = this;
            }

            @Override // T1.m
            public final void onMethodCall(l call, n nVar) {
                switch (i3) {
                    case 0:
                        j.e(call, "call");
                        d dVar = this.f440b;
                        c cVar = new c(2, dVar, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0);
                        i iVar = (i) nVar;
                        dVar.getClass();
                        try {
                            cVar.invoke(call, iVar);
                            break;
                        } catch (Throwable th) {
                            iVar.b("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        j.e(call, "call");
                        d dVar2 = this.f440b;
                        c cVar2 = new c(2, dVar2, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                        i iVar2 = (i) nVar;
                        dVar2.getClass();
                        try {
                            cVar2.invoke(call, iVar2);
                            break;
                        } catch (Throwable th2) {
                            iVar2.b("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        final int i4 = 1;
        new o(fVar, "xyz.luan/audioplayers.global").b(new m(this) { // from class: G2.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f440b;

            {
                this.f440b = this;
            }

            @Override // T1.m
            public final void onMethodCall(l call, n nVar) {
                switch (i4) {
                    case 0:
                        j.e(call, "call");
                        d dVar = this.f440b;
                        c cVar = new c(2, dVar, d.class, "methodHandler", "methodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 0);
                        i iVar = (i) nVar;
                        dVar.getClass();
                        try {
                            cVar.invoke(call, iVar);
                            break;
                        } catch (Throwable th) {
                            iVar.b("Unexpected AndroidAudioError", th.getMessage(), th);
                            return;
                        }
                    default:
                        j.e(call, "call");
                        d dVar2 = this.f440b;
                        c cVar2 = new c(2, dVar2, d.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0, 1);
                        i iVar2 = (i) nVar;
                        dVar2.getClass();
                        try {
                            cVar2.invoke(call, iVar2);
                            break;
                        } catch (Throwable th2) {
                            iVar2.b("Unexpected AndroidAudioError", th2.getMessage(), th2);
                        }
                }
            }
        });
        this.f442a = new a1.e(new A0.j(fVar, "xyz.luan/audioplayers.global/events"));
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a binding) {
        j.e(binding, "binding");
        ConcurrentHashMap concurrentHashMap = this.f446e;
        Collection<p> values = concurrentHashMap.values();
        j.d(values, "<get-values>(...)");
        for (p pVar : values) {
            pVar.e();
            pVar.f547b.x();
        }
        concurrentHashMap.clear();
        a1.e eVar = this.f445d;
        if (eVar == null) {
            j.g("soundPoolManager");
            throw null;
        }
        HashMap hashMap = (HashMap) eVar.f1789c;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            H2.m mVar = (H2.m) ((Map.Entry) it.next()).getValue();
            mVar.f539a.release();
            mVar.f540b.clear();
            mVar.f541c.clear();
        }
        hashMap.clear();
        a1.e eVar2 = this.f442a;
        if (eVar2 == null) {
            j.g("globalEvents");
            throw null;
        }
        eVar2.x();
    }
}
