package Qe;

import Sc.r;
import Sc.s;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Qe.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3857a {

    /* renamed from: a, reason: collision with root package name */
    private static final int f23331a;

    static {
        Object a11;
        try {
            r.Companion companion = r.INSTANCE;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
            a11 = kotlin.text.h.w0(property);
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        Integer num = (Integer) a11;
        f23331a = num != null ? num.intValue() : 2097152;
    }
}
