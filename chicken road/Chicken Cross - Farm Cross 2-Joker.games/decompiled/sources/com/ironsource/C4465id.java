package com.ironsource;

import com.ironsource.C4665u;
import com.ironsource.H7;
import com.unity3d.mediation.LevelPlay;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4465id {

    /* renamed from: a, reason: collision with root package name */
    private final C4659tb f8253a;
    private final Map<LevelPlay.AdFormat, C4665u> b;

    public C4465id(C4659tb tools, Map<LevelPlay.AdFormat, C4665u> adFormatsConfigurations) {
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adFormatsConfigurations, "adFormatsConfigurations");
        this.f8253a = tools;
        this.b = adFormatsConfigurations;
    }

    private final void b(H7.a aVar, String str, LevelPlay.AdFormat adFormat, C4665u.d dVar) {
        F3 f3 = F3.Delivery;
        J4 c = dVar.c();
        a(aVar.a(str, adFormat, f3, new C4705w3(c != null ? Boolean.valueOf(c.a()) : null, null, null, 6, null)), str, adFormat, f3);
    }

    private final void c(H7.a aVar, String str, LevelPlay.AdFormat adFormat, C4665u.d dVar) {
        C4296ad e = dVar.e();
        if (e != null) {
            F3 f3 = F3.Pacing;
            a(aVar.a(str, adFormat, f3, new C4705w3(e.a(), e.b(), E3.Second)), str, adFormat, f3);
        }
    }

    public final void a(H7.a cappingService) {
        Intrinsics.checkNotNullParameter(cappingService, "cappingService");
        for (Map.Entry<LevelPlay.AdFormat, C4665u> entry : this.b.entrySet()) {
            LevelPlay.AdFormat key = entry.getKey();
            for (Map.Entry<String, C4665u.d> entry2 : entry.getValue().c().entrySet()) {
                String key2 = entry2.getKey();
                C4665u.d value = entry2.getValue();
                b(cappingService, key2, key, value);
                a(cappingService, key2, key, value);
                c(cappingService, key2, key, value);
            }
        }
    }

    private final void a(H7.a aVar, String str, LevelPlay.AdFormat adFormat, C4665u.d dVar) {
        C4759z3 b = dVar.b();
        if (b != null) {
            F3 f3 = F3.ShowCount;
            a(aVar.a(str, adFormat, f3, new C4705w3(b.a(), b.b(), b.c())), str, adFormat, f3);
        }
    }

    private final void a(Object obj, String str, LevelPlay.AdFormat adFormat, F3 f3) {
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(obj);
        if (m8082exceptionOrNullimpl != null) {
            this.f8253a.a(str, adFormat, new A3().a(f3), m8082exceptionOrNullimpl.getMessage());
        }
    }
}
