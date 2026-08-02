package u;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public abstract class G0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f19673a;

    static {
        Float valueOf = Float.valueOf(0.5f);
        A0 a02 = B0.f19646b;
        Float valueOf2 = Float.valueOf(1.0f);
        W3.h[] hVarArr = {new W3.h(a02, valueOf2), new W3.h(B0.f19651h, valueOf2), new W3.h(B0.f19650g, valueOf2), new W3.h(B0.f19645a, Float.valueOf(0.01f)), new W3.h(B0.i, valueOf), new W3.h(B0.f19649e, valueOf), new W3.h(B0.f, valueOf), new W3.h(B0.f19647c, Float.valueOf(0.1f)), new W3.h(B0.f19648d, Float.valueOf(0.1f))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(X3.z.R(9));
        X3.z.S(linkedHashMap, hVarArr);
        f19673a = linkedHashMap;
    }
}
