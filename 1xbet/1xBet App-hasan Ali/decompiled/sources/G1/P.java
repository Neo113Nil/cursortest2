package G1;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class P {

    /* renamed from: b, reason: collision with root package name */
    public static final LinkedHashMap f1876b = new LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f1877a = new LinkedHashMap();

    public final void a(O o5) {
        kotlin.jvm.internal.l.f("navigator", o5);
        String c5 = AbstractC0136g.c(o5.getClass());
        if (c5.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap = this.f1877a;
        O o6 = (O) linkedHashMap.get(c5);
        if (kotlin.jvm.internal.l.a(o6, o5)) {
            return;
        }
        boolean z3 = false;
        if (o6 != null && o6.f1875b) {
            z3 = true;
        }
        if (z3) {
            throw new IllegalStateException(("Navigator " + o5 + " is replacing an already attached " + o6).toString());
        }
        if (!o5.f1875b) {
            return;
        }
        throw new IllegalStateException(("Navigator " + o5 + " is already attached to another NavController").toString());
    }

    public final O b(String str) {
        kotlin.jvm.internal.l.f("name", str);
        if (str.length() <= 0) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        O o5 = (O) this.f1877a.get(str);
        if (o5 != null) {
            return o5;
        }
        throw new IllegalStateException(L1.a.n("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
