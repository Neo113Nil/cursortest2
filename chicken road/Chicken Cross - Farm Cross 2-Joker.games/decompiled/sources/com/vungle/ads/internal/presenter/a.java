package com.vungle.ads.internal.presenter;

import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.j3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final b f12078a;
    public j3 b;
    public boolean c;

    public a(b bVar, j3 j3Var) {
        this.f12078a = bVar;
        this.b = j3Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void a(String s, String str, String str2) {
        j3 j3Var;
        b bVar;
        b bVar2;
        b bVar3;
        b bVar4;
        Intrinsics.checkNotNullParameter(s, "s");
        boolean z = com.vungle.ads.internal.util.u.f12190a;
        com.vungle.ads.internal.util.t.a("AdEventListener", "s=" + s + ", value=" + str + ", id=" + str2);
        switch (s.hashCode()) {
            case -1912374177:
                if (s.equals("successfulView") && (j3Var = this.b) != null && j3Var.j() && !this.c) {
                    this.c = true;
                    b bVar5 = this.f12078a;
                    if (bVar5 != null) {
                        bVar5.onAdRewarded(str2);
                        break;
                    }
                }
                break;
            case -1627831289:
                if (s.equals("adViewed") && (bVar = this.f12078a) != null) {
                    bVar.onAdImpression(str2);
                    break;
                }
                break;
            case 100571:
                if (s.equals("end") && (bVar2 = this.f12078a) != null) {
                    bVar2.onAdEnd(str2);
                    break;
                }
                break;
            case 3417674:
                if (s.equals("open")) {
                    if (!Intrinsics.areEqual(str, "adClick")) {
                        if (Intrinsics.areEqual(str, "adLeftApplication") && (bVar3 = this.f12078a) != null) {
                            bVar3.onAdLeftApplication(str2);
                            break;
                        }
                    } else {
                        b bVar6 = this.f12078a;
                        if (bVar6 != null) {
                            bVar6.onAdClick(str2);
                            break;
                        }
                    }
                }
                break;
            case 109757538:
                if (s.equals("start") && (bVar4 = this.f12078a) != null) {
                    bVar4.onAdStart(str2);
                    break;
                }
                break;
        }
    }

    public final void a(VungleError error, String str) {
        Intrinsics.checkNotNullParameter(error, "error");
        b bVar = this.f12078a;
        if (bVar != null) {
            bVar.onFailure(error);
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.a("AdEventListener", "AdEventListener#PlayAdCallback " + str, error);
        }
    }
}
