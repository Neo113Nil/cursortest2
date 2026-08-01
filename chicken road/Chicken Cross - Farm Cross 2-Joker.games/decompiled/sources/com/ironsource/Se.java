package com.ironsource;

import com.ironsource.AbstractC4736xg;
import com.ironsource.AbstractC4754yg;
import com.ironsource.M3;
import com.unity3d.mediation.LevelPlay;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Se {
    public final AbstractC4754yg a(Qe response) {
        Intrinsics.checkNotNullParameter(response, "response");
        AbstractC4736xg a2 = a(response.d(), response.e());
        return a2 == null ? AbstractC4754yg.b.f8785a : new AbstractC4754yg.a(a2);
    }

    private final AbstractC4736xg a(M3 m3, Fd fd) {
        M3.a e = m3.e();
        if (e == null) {
            return null;
        }
        AbstractC4736xg a2 = a(LevelPlay.AdFormat.REWARDED, fd.h(), e.h());
        if (a2 != null) {
            return a2;
        }
        AbstractC4736xg a3 = a(LevelPlay.AdFormat.INTERSTITIAL, fd.f(), e.f());
        if (a3 != null) {
            return a3;
        }
        AbstractC4736xg a4 = a(LevelPlay.AdFormat.BANNER, fd.e(), e.e());
        if (a4 != null) {
            return a4;
        }
        AbstractC4736xg a5 = a(LevelPlay.AdFormat.NATIVE_AD, fd.g(), e.g());
        if (a5 != null) {
            return a5;
        }
        return null;
    }

    private final AbstractC4736xg a(LevelPlay.AdFormat adFormat, Map<String, ? extends List<String>> map, M3.a.InterfaceC0310a interfaceC0310a) {
        if (map == null) {
            return null;
        }
        Collection<? extends List<String>> values = map.values();
        if (!(values instanceof Collection) || !values.isEmpty()) {
            Iterator<T> it = values.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((List) it.next()).isEmpty()) {
                    if (interfaceC0310a != null) {
                        List<M3.a.e> a2 = interfaceC0310a.a();
                        if (a2 == null) {
                            return new AbstractC4736xg.b(adFormat);
                        }
                        if (a2.isEmpty()) {
                            return new AbstractC4736xg.a(adFormat);
                        }
                    }
                }
            }
        }
        return null;
    }
}
