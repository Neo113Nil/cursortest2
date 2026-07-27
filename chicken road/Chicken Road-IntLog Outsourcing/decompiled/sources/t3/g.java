package t3;

import V0.j;
import io.appmetrica.analytics.impl.C0793l9;
import kotlin.jvm.internal.i;
import m2.AbstractC1286i;
import m2.C1278a;
import m2.C1285h;
import m2.InterfaceC1290m;

/* loaded from: classes.dex */
public final class g extends AbstractC1286i {
    public static h h(int i2) {
        switch (i2) {
            case 0:
                return h.SEVERITY_NUMBER_UNSPECIFIED;
            case 1:
                return h.SEVERITY_NUMBER_TRACE;
            case 2:
                return h.SEVERITY_NUMBER_TRACE2;
            case 3:
                return h.SEVERITY_NUMBER_TRACE3;
            case 4:
                return h.SEVERITY_NUMBER_TRACE4;
            case 5:
                return h.SEVERITY_NUMBER_DEBUG;
            case 6:
                return h.SEVERITY_NUMBER_DEBUG2;
            case 7:
                return h.SEVERITY_NUMBER_DEBUG3;
            case 8:
                return h.SEVERITY_NUMBER_DEBUG4;
            case 9:
                return h.SEVERITY_NUMBER_INFO;
            case 10:
                return h.SEVERITY_NUMBER_INFO2;
            case 11:
                return h.SEVERITY_NUMBER_INFO3;
            case 12:
                return h.SEVERITY_NUMBER_INFO4;
            case 13:
                return h.SEVERITY_NUMBER_WARN;
            case 14:
                return h.SEVERITY_NUMBER_WARN2;
            case 15:
                return h.SEVERITY_NUMBER_WARN3;
            case 16:
                return h.SEVERITY_NUMBER_WARN4;
            case 17:
                return h.SEVERITY_NUMBER_ERROR;
            case 18:
                return h.SEVERITY_NUMBER_ERROR2;
            case C0793l9.f8681C /* 19 */:
                return h.SEVERITY_NUMBER_ERROR3;
            case C0793l9.f8682D /* 20 */:
                return h.SEVERITY_NUMBER_ERROR4;
            case C0793l9.f8683E /* 21 */:
                return h.SEVERITY_NUMBER_FATAL;
            case 22:
                return h.SEVERITY_NUMBER_FATAL2;
            case 23:
                return h.SEVERITY_NUMBER_FATAL3;
            case 24:
                return h.SEVERITY_NUMBER_FATAL4;
            default:
                return null;
        }
    }

    @Override // m2.AbstractC1286i
    public final Object b(j reader) {
        i.e(reader, "reader");
        int l2 = ((C1278a) reader.f3212b).l();
        h h3 = h(l2);
        if (h3 != null) {
            return h3;
        }
        throw new C1285h(l2, this.f11178b);
    }

    @Override // m2.AbstractC1286i
    public final Object c(C1278a reader) {
        i.e(reader, "reader");
        int l2 = reader.l();
        h h3 = h(l2);
        if (h3 != null) {
            return h3;
        }
        throw new C1285h(l2, this.f11178b);
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e writer, Object obj) {
        InterfaceC1290m value = (InterfaceC1290m) obj;
        i.e(writer, "writer");
        i.e(value, "value");
        writer.F(((h) value).f11968a);
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        InterfaceC1290m value = (InterfaceC1290m) obj;
        i.e(value, "value");
        return 1;
    }
}
