package W;

import W.C4852x;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: W.o, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C4844o {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f33106a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final TreeMap<Size, C4852x> f33107b = new TreeMap<>(new G.e(false));

    /* renamed from: c, reason: collision with root package name */
    private final Y.f f33108c;

    /* renamed from: d, reason: collision with root package name */
    private final Y.f f33109d;

    public C4844o(@NonNull Y.e eVar) {
        Iterator it = C4852x.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C4852x c4852x = (C4852x) it.next();
            x2.i.f("Currently only support ConstantQuality", c4852x instanceof C4852x.a);
            InterfaceC5086c0 a11 = eVar.a(((C4852x.a) c4852x).e());
            if (a11 != null) {
                C.S.a("CapabilitiesByQuality", "profiles = " + a11);
                Y.f e11 = a11.d().isEmpty() ? null : Y.f.e(a11);
                if (e11 == null) {
                    C.S.k("CapabilitiesByQuality", "EncoderProfiles of quality " + c4852x + " has no video validated profiles.");
                } else {
                    InterfaceC5086c0.c g10 = e11.g();
                    this.f33107b.put(new Size(g10.k(), g10.h()), c4852x);
                    this.f33106a.put(c4852x, e11);
                }
            }
        }
        if (this.f33106a.isEmpty()) {
            C.S.c("CapabilitiesByQuality", "No supported EncoderProfiles");
            this.f33109d = null;
            this.f33108c = null;
        } else {
            ArrayDeque arrayDeque = new ArrayDeque(this.f33106a.values());
            this.f33108c = (Y.f) arrayDeque.peekFirst();
            this.f33109d = (Y.f) arrayDeque.peekLast();
        }
    }

    @NonNull
    public final C4852x a(@NonNull Size size) {
        C4852x value;
        TreeMap<Size, C4852x> treeMap = this.f33107b;
        Size size2 = M.c.f17199a;
        Map.Entry<Size, C4852x> ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            value = ceilingEntry.getValue();
        } else {
            Map.Entry<Size, C4852x> floorEntry = treeMap.floorEntry(size);
            value = floorEntry != null ? floorEntry.getValue() : null;
        }
        C4852x c4852x = value;
        return c4852x != null ? c4852x : C4852x.f33153g;
    }

    public final Y.f b(@NonNull C4852x c4852x) {
        x2.i.a("Unknown quality: " + c4852x, C4852x.a(c4852x));
        return c4852x == C4852x.f33152f ? this.f33108c : c4852x == C4852x.f33151e ? this.f33109d : (Y.f) this.f33106a.get(c4852x);
    }

    @NonNull
    public final ArrayList c() {
        return new ArrayList(this.f33106a.keySet());
    }
}
