package Jf0;

import Ae.O0;
import Ae.x0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import qf0.EnumC9053a;

/* loaded from: classes7.dex */
final class c extends AbstractC7737t implements Function0<x0<Map<String, ? extends Lf0.c>>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b f14724b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c(b bVar) {
        super(0);
        this.f14724b = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final x0<Map<String, ? extends Lf0.c>> invoke() {
        Map map;
        wf0.a b11 = wf0.c.b();
        if (b11 != null) {
            LinkedHashMap h11 = b11.b().g().h();
            map = new LinkedHashMap(U.h(h11.size()));
            for (Map.Entry entry : h11.entrySet()) {
                map.put(entry.getKey(), b.a(this.f14724b, b11, (String) entry.getKey(), (EnumC9053a) entry.getValue()));
            }
        } else {
            map = null;
        }
        if (map == null) {
            map = U.c();
        }
        return O0.a(map);
    }
}
