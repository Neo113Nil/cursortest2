package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import v.C10100h;

/* loaded from: classes8.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<EnumC5122v> f38215a = Collections.unmodifiableSet(EnumSet.of(EnumC5122v.PASSIVE_FOCUSED, EnumC5122v.PASSIVE_NOT_FOCUSED, EnumC5122v.LOCKED_FOCUSED, EnumC5122v.LOCKED_NOT_FOCUSED));

    /* renamed from: b, reason: collision with root package name */
    private static final Set<EnumC5126x> f38216b = Collections.unmodifiableSet(EnumSet.of(EnumC5126x.CONVERGED, EnumC5126x.UNKNOWN));

    /* renamed from: c, reason: collision with root package name */
    private static final Set<EnumC5118t> f38217c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<EnumC5118t> f38218d;

    static {
        EnumC5118t enumC5118t = EnumC5118t.CONVERGED;
        EnumC5118t enumC5118t2 = EnumC5118t.FLASH_REQUIRED;
        EnumC5118t enumC5118t3 = EnumC5118t.UNKNOWN;
        Set<EnumC5118t> unmodifiableSet = Collections.unmodifiableSet(EnumSet.of(enumC5118t, enumC5118t2, enumC5118t3));
        f38217c = unmodifiableSet;
        EnumSet copyOf = EnumSet.copyOf((Collection) unmodifiableSet);
        copyOf.remove(enumC5118t2);
        copyOf.remove(enumC5118t3);
        f38218d = Collections.unmodifiableSet(copyOf);
    }

    public static boolean a(@NonNull C10100h c10100h, boolean z11) {
        boolean z12 = c10100h.i() == EnumC5120u.OFF || c10100h.i() == EnumC5120u.UNKNOWN || f38215a.contains(c10100h.c());
        boolean z13 = c10100h.h() == EnumC5116s.OFF;
        boolean z14 = !z11 ? !(z13 || f38217c.contains(c10100h.e())) : !(z13 || f38218d.contains(c10100h.e()));
        boolean z15 = c10100h.j() == EnumC5124w.OFF || f38216b.contains(c10100h.d());
        C.S.a("ConvergenceUtils", "checkCaptureResult, AE=" + c10100h.e() + " AF =" + c10100h.c() + " AWB=" + c10100h.d());
        return z12 && z14 && z15;
    }
}
