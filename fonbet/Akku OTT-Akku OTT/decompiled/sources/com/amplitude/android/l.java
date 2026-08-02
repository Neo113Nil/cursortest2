package com.amplitude.android;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Deprecated;
import kotlin.jvm.JvmOverloads;

@Deprecated(message = "Use AutocaptureOption instead")
/* loaded from: classes3.dex */
public final class l {
    public static final a Companion = new a();
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final ArrayList e;

    public static final class a {
    }

    static {
        new l(true, true, true, true);
        new l(false, false, false, false);
    }

    @JvmOverloads
    public l() {
        this(0);
    }

    public final LinkedHashSet a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (this.a) {
            linkedHashSet.add(f.c);
        }
        if (this.b) {
            linkedHashSet.add(f.d);
        }
        if (this.c) {
            linkedHashSet.add(f.e);
        }
        if (this.d) {
            linkedHashSet.add(f.f);
        }
        return linkedHashSet;
    }

    @JvmOverloads
    public l(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = new ArrayList();
    }

    public /* synthetic */ l(int i) {
        this(true, false, false, false);
    }
}
