package Sa;

import Ja.h;
import Ma.b;
import Ma.d;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.chromium.net.D;
import org.chromium.net.f;
import org.chromium.net.impl.a0;
import org.chromium.net.y;
import org.jetbrains.annotations.NotNull;

/* renamed from: Sa.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3998a {

    /* renamed from: Sa.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0518a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26076a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.QUIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.HTTP_2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f26076a = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x004a  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final b a(@NotNull a0 a0Var, long j11, long j12, d dVar) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(a0Var, "<this>");
        Long l11 = a0Var.c().l();
        if (l11 == null) {
            l11 = 0L;
        }
        long longValue = l11.longValue();
        if (dVar != null) {
            h d11 = dVar.d();
            int i11 = d11 == null ? -1 : C0518a.f26076a[d11.ordinal()];
            if (i11 != 1) {
                str2 = i11 == 2 ? "1.2" : "1.3";
            }
            str = str2;
            D d12 = a0Var.d();
            String e11 = d12 == null ? d12.e() : null;
            String str3 = (e11 != null || e11.equals(":0")) ? "" : e11;
            b.a aVar = b.a.CRONET;
            boolean i12 = a0Var.c().i();
            boolean z11 = !kotlin.text.h.K(str3);
            boolean z12 = a0Var.b() == 1;
            f a11 = a0Var.a();
            String message = a11 == null ? a11.getMessage() : null;
            h d13 = dVar != null ? dVar.d() : null;
            y.b c11 = a0Var.c();
            Intrinsics.checkNotNullExpressionValue(c11, "getMetrics(...)");
            Date d14 = c11.d();
            long time = d14 == null ? d14.getTime() : 0L;
            Date c12 = c11.c();
            long time2 = c12 == null ? c12.getTime() : 0L;
            Date b11 = c11.b();
            long time3 = b11 == null ? b11.getTime() : 0L;
            Date a12 = c11.a();
            long time4 = a12 == null ? a12.getTime() : 0L;
            Date k11 = c11.k();
            long time5 = k11 == null ? k11.getTime() : 0L;
            Date j13 = c11.j();
            long time6 = j13 == null ? j13.getTime() : 0L;
            Date h11 = c11.h();
            long time7 = h11 == null ? h11.getTime() : 0L;
            Date g10 = c11.g();
            long time8 = g10 == null ? g10.getTime() : 0L;
            Date f7 = c11.f();
            long time9 = f7 == null ? f7.getTime() : 0L;
            Date e12 = c11.e();
            return new b(aVar, i12, str, z11, str3, longValue, j12, j11, z12, d13, message, new Ma.a(time, time2, time3, time4, time5, time6, time7, time8, time9, e12 != null ? e12.getTime() : 0L, c11.i()));
        }
        str = "";
        D d122 = a0Var.d();
        if (d122 == null) {
        }
        if (e11 != null) {
        }
        b.a aVar2 = b.a.CRONET;
        boolean i122 = a0Var.c().i();
        boolean z112 = !kotlin.text.h.K(str3);
        boolean z122 = a0Var.b() == 1;
        f a112 = a0Var.a();
        if (a112 == null) {
        }
        h d132 = dVar != null ? dVar.d() : null;
        y.b c112 = a0Var.c();
        Intrinsics.checkNotNullExpressionValue(c112, "getMetrics(...)");
        Date d142 = c112.d();
        if (d142 == null) {
        }
        Date c122 = c112.c();
        if (c122 == null) {
        }
        Date b112 = c112.b();
        if (b112 == null) {
        }
        Date a122 = c112.a();
        if (a122 == null) {
        }
        Date k112 = c112.k();
        if (k112 == null) {
        }
        Date j132 = c112.j();
        if (j132 == null) {
        }
        Date h112 = c112.h();
        if (h112 == null) {
        }
        Date g102 = c112.g();
        if (g102 == null) {
        }
        Date f72 = c112.f();
        if (f72 == null) {
        }
        Date e122 = c112.e();
        return new b(aVar2, i122, str, z112, str3, longValue, j12, j11, z122, d132, message, new Ma.a(time, time2, time3, time4, time5, time6, time7, time8, time9, e122 != null ? e122.getTime() : 0L, c112.i()));
    }

    @NotNull
    public static final h b(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (!kotlin.text.h.D(str, "h2", true) && !kotlin.text.h.D(str, "http/2", true)) {
            if (kotlin.text.h.D(str, "http/1.1", true)) {
                return h.HTTP_1_1;
            }
            if (!kotlin.text.h.t(str, "h3", true) && !kotlin.text.h.t(str, "quic", true)) {
                if (kotlin.text.h.t(str, "spdy", true)) {
                    return h.SPDY;
                }
                h.Companion.getClass();
                return h.HTTP_2;
            }
            return h.QUIC;
        }
        return h.HTTP_2;
    }
}
