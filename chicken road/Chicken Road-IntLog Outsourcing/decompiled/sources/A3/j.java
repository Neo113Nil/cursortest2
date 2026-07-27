package A3;

import java.io.UncheckedIOException;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.List;
import y3.C1568b;

/* loaded from: classes.dex */
public abstract class j implements y3.n {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f66a = new byte[0];

    /* renamed from: b, reason: collision with root package name */
    public static final n[] f67b = new n[0];

    public static y3.i a(Q2.g gVar) {
        String str;
        switch (O.j.b(gVar.getType())) {
            case 0:
                return new f(1, y3.h.f((String) gVar.getValue()));
            case 1:
                return new e(((Boolean) gVar.getValue()).booleanValue());
            case 2:
                return new m(((Long) gVar.getValue()).longValue());
            case 3:
                return new g(((Double) gVar.getValue()).doubleValue());
            case 4:
                return d.d((List) gVar.getValue(), new b(4));
            case 5:
                List list = (List) gVar.getValue();
                int size = list.size();
                n[] nVarArr = new n[list.size()];
                for (int i2 = 0; i2 < size; i2++) {
                    Q2.d dVar = (Q2.d) list.get(i2);
                    nVarArr[i2] = new n(dVar.f2485a.getBytes(StandardCharsets.UTF_8), a(dVar.f2486b));
                }
                return new d(new c(nVarArr), (byte) 0);
            case 6:
                ByteBuffer byteBuffer = (ByteBuffer) gVar.getValue();
                byte[] bArr = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr);
                return new f(0, bArr);
            default:
                switch (gVar.getType()) {
                    case 1:
                        str = "STRING";
                        break;
                    case 2:
                        str = "BOOLEAN";
                        break;
                    case 3:
                        str = "LONG";
                        break;
                    case 4:
                        str = "DOUBLE";
                        break;
                    case 5:
                        str = "ARRAY";
                        break;
                    case 6:
                        str = "KEY_VALUE_LIST";
                        break;
                    case 7:
                        str = "BYTES";
                        break;
                    default:
                        str = "null";
                        break;
                }
                throw new IllegalArgumentException("Unsupported Value type: ".concat(str));
        }
    }

    public static R2.b c(N3.a aVar) {
        if (aVar instanceof O3.a) {
            return ((O3.a) aVar).d();
        }
        throw new IllegalArgumentException("logRecordData must be ExtendedLogRecordData");
    }

    public static void e(y3.m mVar, C1568b c1568b, R2.b bVar, y3.g gVar) {
        mVar.Q(c1568b);
        if (!bVar.isEmpty()) {
            try {
                bVar.forEach(new h(mVar, c1568b, gVar));
            } catch (UncheckedIOException e3) {
                throw e3.getCause();
            }
        }
        mVar.G();
    }

    public static int f(C1568b c1568b, R2.b bVar, y3.g gVar) {
        if (bVar.isEmpty()) {
            return 0;
        }
        int[] iArr = {0};
        bVar.forEach(new h(gVar, iArr, c1568b));
        return iArr[0];
    }
}
