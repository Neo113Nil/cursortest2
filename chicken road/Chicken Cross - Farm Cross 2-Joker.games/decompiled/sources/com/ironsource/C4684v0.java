package com.ironsource;

import com.ironsource.C4665u;
import com.ironsource.InterfaceC4530m7;
import com.unity3d.mediation.LevelPlay;
import java.util.Iterator;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.v0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4684v0 implements C3 {

    /* renamed from: a, reason: collision with root package name */
    private final C4659tb f8712a;
    private final Map<LevelPlay.AdFormat, C4665u> b;

    public C4684v0(C4659tb tools, Map<LevelPlay.AdFormat, C4665u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f8712a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(InterfaceC4530m7.a aVar, String str, C4665u.d dVar) {
        C4296ad e = dVar.e();
        if (e != null) {
            F3 f3 = F3.Pacing;
            a(aVar.a(str, f3, new C4705w3(e.a(), e.b(), e.c())), str, f3);
        }
    }

    @Override // com.ironsource.C3
    public void a(InterfaceC4530m7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        Iterator<Map.Entry<LevelPlay.AdFormat, C4665u>> it = this.b.entrySet().iterator();
        while (it.hasNext()) {
            for (Map.Entry<String, C4665u.d> entry : it.next().getValue().a().entrySet()) {
                String key = entry.getKey();
                C4665u.d value = entry.getValue();
                a(cappingService, key, value);
                b(cappingService, key, value);
            }
        }
    }

    private final void a(InterfaceC4530m7.a aVar, String str, C4665u.d dVar) {
        C4759z3 b = dVar.b();
        if (b != null) {
            F3 f3 = F3.ShowCount;
            a(aVar.a(str, f3, new C4705w3(b.a(), b.b(), b.c())), str, f3);
        }
    }

    private final void a(Object obj, String str, F3 f3) {
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj);
        if (m8082exceptionOrNullimpl != null) {
            this.f8712a.a(str, new A3().a(f3), m8082exceptionOrNullimpl.getMessage());
        }
    }
}
