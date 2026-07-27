package t3;

import kotlin.jvm.internal.t;
import m2.EnumC1281d;
import m2.EnumC1289l;
import m2.InterfaceC1290m;

/* loaded from: classes.dex */
public enum h implements InterfaceC1290m {
    SEVERITY_NUMBER_UNSPECIFIED(0),
    SEVERITY_NUMBER_TRACE(1),
    SEVERITY_NUMBER_TRACE2(2),
    SEVERITY_NUMBER_TRACE3(3),
    SEVERITY_NUMBER_TRACE4(4),
    SEVERITY_NUMBER_DEBUG(5),
    SEVERITY_NUMBER_DEBUG2(6),
    SEVERITY_NUMBER_DEBUG3(7),
    SEVERITY_NUMBER_DEBUG4(8),
    SEVERITY_NUMBER_INFO(9),
    SEVERITY_NUMBER_INFO2(10),
    SEVERITY_NUMBER_INFO3(11),
    SEVERITY_NUMBER_INFO4(12),
    SEVERITY_NUMBER_WARN(13),
    SEVERITY_NUMBER_WARN2(14),
    SEVERITY_NUMBER_WARN3(15),
    SEVERITY_NUMBER_WARN4(16),
    SEVERITY_NUMBER_ERROR(17),
    SEVERITY_NUMBER_ERROR2(18),
    SEVERITY_NUMBER_ERROR3(19),
    SEVERITY_NUMBER_ERROR4(20),
    SEVERITY_NUMBER_FATAL(21),
    SEVERITY_NUMBER_FATAL2(22),
    SEVERITY_NUMBER_FATAL3(23),
    SEVERITY_NUMBER_FATAL4(24);


    /* renamed from: A, reason: collision with root package name */
    public static final g f11942A;

    /* renamed from: a, reason: collision with root package name */
    public final int f11968a;

    static {
        h hVar = SEVERITY_NUMBER_UNSPECIFIED;
        f11942A = new g(EnumC1281d.f11151b, t.a(h.class), EnumC1289l.f11191c, hVar);
    }

    h(int i2) {
        this.f11968a = i2;
    }
}
