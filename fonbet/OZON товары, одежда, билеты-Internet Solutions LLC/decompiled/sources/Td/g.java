package Td;

import Td.g.b;
import Td.h;
import Td.i;
import Td.k;
import Td.p;
import Td.u;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class g<FieldDescriptorType extends b<FieldDescriptorType>> {

    /* renamed from: d, reason: collision with root package name */
    private static final g f27069d = new g(0);

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27070e = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f27072b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27073c = false;

    /* renamed from: a, reason: collision with root package name */
    private final t f27071a = new t(16);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27074a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f27075b;

        static {
            int[] iArr = new int[y.values().length];
            f27075b = iArr;
            try {
                iArr[y.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27075b[y.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27075b[y.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27075b[y.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27075b[y.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27075b[y.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27075b[y.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27075b[y.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27075b[y.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f27075b[y.BYTES.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f27075b[y.UINT32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f27075b[y.SFIXED32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f27075b[y.SFIXED64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f27075b[y.SINT32.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f27075b[y.SINT64.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f27075b[y.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f27075b[y.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f27075b[y.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            int[] iArr2 = new int[z.values().length];
            f27074a = iArr2;
            try {
                iArr2[z.INT.ordinal()] = 1;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f27074a[z.LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f27074a[z.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f27074a[z.DOUBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f27074a[z.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f27074a[z.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f27074a[z.BYTE_STRING.ordinal()] = 7;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f27074a[z.ENUM.ordinal()] = 8;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f27074a[z.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    public interface b<T extends b<T>> extends Comparable<T> {
        h.b K0(p.a aVar, p pVar);

        z getLiteJavaType();

        y getLiteType();

        int getNumber();

        boolean isPacked();

        boolean isRepeated();
    }

    private g() {
    }

    private static int c(y yVar, Object obj) {
        int f7;
        int size;
        switch (a.f27075b[yVar.ordinal()]) {
            case 1:
                ((Double) obj).getClass();
                return 8;
            case 2:
                ((Float) obj).getClass();
                return 4;
            case 3:
                return e.g(((Long) obj).longValue());
            case 4:
                return e.g(((Long) obj).longValue());
            case 5:
                return e.c(((Integer) obj).intValue());
            case 6:
                ((Long) obj).getClass();
                return 8;
            case 7:
                ((Integer) obj).getClass();
                return 4;
            case 8:
                ((Boolean) obj).getClass();
                return 1;
            case 9:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return e.f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e11) {
                    throw new RuntimeException("UTF-8 not supported.", e11);
                }
            case 10:
                if (!(obj instanceof c)) {
                    byte[] bArr = (byte[]) obj;
                    return e.f(bArr.length) + bArr.length;
                }
                c cVar = (c) obj;
                f7 = e.f(cVar.size());
                size = cVar.size();
                break;
            case 11:
                return e.f(((Integer) obj).intValue());
            case 12:
                ((Integer) obj).getClass();
                return 4;
            case 13:
                ((Long) obj).getClass();
                return 8;
            case 14:
                int intValue = ((Integer) obj).intValue();
                return e.f((intValue >> 31) ^ (intValue << 1));
            case 15:
                long longValue = ((Long) obj).longValue();
                return e.g((longValue >> 63) ^ (longValue << 1));
            case 16:
                return ((p) obj).getSerializedSize();
            case 17:
                if (!(obj instanceof k)) {
                    return e.e((p) obj);
                }
                f7 = ((k) obj).f27095a.getSerializedSize();
                size = e.f(f7);
                break;
            case 18:
                return obj instanceof i.a ? e.c(((i.a) obj).getNumber()) : e.c(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return size + f7;
    }

    public static int d(b<?> bVar, Object obj) {
        y liteType = bVar.getLiteType();
        int number = bVar.getNumber();
        if (!bVar.isRepeated()) {
            int h11 = e.h(number);
            if (liteType == y.GROUP) {
                h11 *= 2;
            }
            return h11 + c(liteType, obj);
        }
        int i11 = 0;
        if (bVar.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i11 += c(liteType, it.next());
            }
            return e.f(i11) + e.h(number) + i11;
        }
        for (Object obj2 : (List) obj) {
            int h12 = e.h(number);
            if (liteType == y.GROUP) {
                h12 *= 2;
            }
            i11 += h12 + c(liteType, obj2);
        }
        return i11;
    }

    public static <T extends b<T>> g<T> e() {
        return f27069d;
    }

    private static boolean j(Map.Entry entry) {
        b bVar = (b) entry.getKey();
        if (bVar.getLiteJavaType() != z.MESSAGE) {
            return true;
        }
        if (bVar.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!((p) it.next()).isInitialized()) {
                    return false;
                }
            }
            return true;
        }
        Object value = entry.getValue();
        if (value instanceof p) {
            return ((p) value).isInitialized();
        }
        if (value instanceof k) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private void n(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof k) {
            value = ((k) value).a();
        }
        boolean isRepeated = key.isRepeated();
        t tVar = this.f27071a;
        if (isRepeated) {
            Object f7 = f(key);
            if (f7 == null) {
                f7 = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) f7;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            tVar.q(key, f7);
            return;
        }
        if (key.getLiteJavaType() != z.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            tVar.q(key, value);
            return;
        }
        Object f11 = f(key);
        if (f11 != null) {
            tVar.q(key, key.K0(((p) f11).toBuilder(), (p) value).build());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        tVar.q(key, value);
    }

    public static <T extends b<T>> g<T> o() {
        return new g<>();
    }

    public static Object p(d dVar, y yVar) throws IOException {
        switch (a.f27075b[yVar.ordinal()]) {
            case 1:
                return Double.valueOf(Double.longBitsToDouble(dVar.m()));
            case 2:
                return Float.valueOf(Float.intBitsToFloat(dVar.l()));
            case 3:
                return Long.valueOf(dVar.o());
            case 4:
                return Long.valueOf(dVar.o());
            case 5:
                return Integer.valueOf(dVar.n());
            case 6:
                return Long.valueOf(dVar.m());
            case 7:
                return Integer.valueOf(dVar.l());
            case 8:
                return Boolean.valueOf(dVar.o() != 0);
            case 9:
                return dVar.q();
            case 10:
                return dVar.f();
            case 11:
                return Integer.valueOf(dVar.n());
            case 12:
                return Integer.valueOf(dVar.l());
            case 13:
                return Long.valueOf(dVar.m());
            case 14:
                int n11 = dVar.n();
                return Integer.valueOf((-(n11 & 1)) ^ (n11 >>> 1));
            case 15:
                long o11 = dVar.o();
                return Long.valueOf((-(o11 & 1)) ^ (o11 >>> 1));
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0027, code lost:
    
        if ((r3 instanceof Td.i.a) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof Td.k) == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        r0 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void r(y yVar, Object obj) {
        obj.getClass();
        boolean z11 = true;
        boolean z12 = false;
        switch (a.f27074a[yVar.a().ordinal()]) {
            case 1:
                z12 = obj instanceof Integer;
                break;
            case 2:
                z12 = obj instanceof Long;
                break;
            case 3:
                z12 = obj instanceof Float;
                break;
            case 4:
                z12 = obj instanceof Double;
                break;
            case 5:
                z12 = obj instanceof Boolean;
                break;
            case 6:
                z12 = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof c)) {
                    break;
                }
                z12 = z11;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z12 = z11;
                break;
            case 9:
                if (!(obj instanceof p)) {
                    break;
                }
                z12 = z11;
                break;
        }
        if (!z12) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    private static void s(e eVar, y yVar, int i11, Object obj) throws IOException {
        if (yVar == y.GROUP) {
            eVar.x(i11, 3);
            ((p) obj).a(eVar);
            eVar.x(i11, 4);
        }
        eVar.x(i11, yVar.b());
        switch (a.f27075b[yVar.ordinal()]) {
            case 1:
                double doubleValue = ((Double) obj).doubleValue();
                eVar.getClass();
                eVar.u(Double.doubleToRawLongBits(doubleValue));
                break;
            case 2:
                float floatValue = ((Float) obj).floatValue();
                eVar.getClass();
                eVar.t(Float.floatToRawIntBits(floatValue));
                break;
            case 3:
                eVar.w(((Long) obj).longValue());
                break;
            case 4:
                eVar.w(((Long) obj).longValue());
                break;
            case 5:
                eVar.n(((Integer) obj).intValue());
                break;
            case 6:
                eVar.u(((Long) obj).longValue());
                break;
            case 7:
                eVar.t(((Integer) obj).intValue());
                break;
            case 8:
                eVar.q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 9:
                eVar.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                eVar.v(bytes.length);
                eVar.s(bytes);
                break;
            case 10:
                if (!(obj instanceof c)) {
                    byte[] bArr = (byte[]) obj;
                    eVar.getClass();
                    eVar.v(bArr.length);
                    eVar.s(bArr);
                    break;
                } else {
                    c cVar = (c) obj;
                    eVar.getClass();
                    eVar.v(cVar.size());
                    eVar.r(cVar);
                    break;
                }
            case 11:
                eVar.v(((Integer) obj).intValue());
                break;
            case 12:
                eVar.t(((Integer) obj).intValue());
                break;
            case 13:
                eVar.u(((Long) obj).longValue());
                break;
            case 14:
                int intValue = ((Integer) obj).intValue();
                eVar.v((intValue >> 31) ^ (intValue << 1));
                break;
            case 15:
                long longValue = ((Long) obj).longValue();
                eVar.w((longValue >> 63) ^ (longValue << 1));
                break;
            case 16:
                eVar.getClass();
                ((p) obj).a(eVar);
                break;
            case 17:
                eVar.p((p) obj);
                break;
            case 18:
                if (!(obj instanceof i.a)) {
                    eVar.n(((Integer) obj).intValue());
                    break;
                } else {
                    eVar.n(((i.a) obj).getNumber());
                    break;
                }
        }
    }

    public static void t(b<?> bVar, Object obj, e eVar) throws IOException {
        y yVar = ((h.e) bVar).f27084b;
        h.e eVar2 = (h.e) bVar;
        int i11 = eVar2.f27083a;
        if (eVar2.f27085c) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                s(eVar, yVar, i11, it.next());
            }
        } else if (obj instanceof k) {
            s(eVar, yVar, i11, ((k) obj).a());
        } else {
            s(eVar, yVar, i11, obj);
        }
    }

    public final void a(FieldDescriptorType fielddescriptortype, Object obj) {
        List list;
        if (!((h.e) fielddescriptortype).f27085c) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        r(((h.e) fielddescriptortype).f27084b, obj);
        Object f7 = f(fielddescriptortype);
        if (f7 == null) {
            list = new ArrayList();
            this.f27071a.q(fielddescriptortype, list);
        } else {
            list = (List) f7;
        }
        list.add(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final g<FieldDescriptorType> clone() {
        t tVar;
        g<FieldDescriptorType> gVar = (g<FieldDescriptorType>) new g();
        int i11 = 0;
        while (true) {
            tVar = this.f27071a;
            if (i11 >= tVar.l()) {
                break;
            }
            Map.Entry<Object, Object> k11 = tVar.k(i11);
            gVar.q((b) k11.getKey(), k11.getValue());
            i11++;
        }
        for (Map.Entry<Object, Object> entry : tVar.m()) {
            gVar.q((b) entry.getKey(), entry.getValue());
        }
        gVar.f27073c = this.f27073c;
        return gVar;
    }

    public final Object f(FieldDescriptorType fielddescriptortype) {
        Object obj = this.f27071a.get(fielddescriptortype);
        return obj instanceof k ? ((k) obj).a() : obj;
    }

    public final int g() {
        t tVar;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            tVar = this.f27071a;
            if (i11 >= tVar.l()) {
                break;
            }
            Map.Entry<Object, Object> k11 = tVar.k(i11);
            i12 += d((b) k11.getKey(), k11.getValue());
            i11++;
        }
        for (Map.Entry<Object, Object> entry : tVar.m()) {
            i12 += d((b) entry.getKey(), entry.getValue());
        }
        return i12;
    }

    public final boolean h(FieldDescriptorType fielddescriptortype) {
        if (fielddescriptortype.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.f27071a.get(fielddescriptortype) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0032, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i() {
        int i11 = 0;
        while (true) {
            t tVar = this.f27071a;
            if (i11 >= tVar.l()) {
                Iterator<Map.Entry<Object, Object>> it = tVar.m().iterator();
                while (it.hasNext()) {
                    if (!j(it.next())) {
                    }
                }
                return true;
            }
            if (!j(tVar.k(i11))) {
                break;
            }
            i11++;
        }
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> k() {
        boolean z11 = this.f27073c;
        t tVar = this.f27071a;
        return z11 ? new k.b(((u.d) tVar.entrySet()).iterator()) : ((u.d) tVar.entrySet()).iterator();
    }

    public final void l() {
        if (this.f27072b) {
            return;
        }
        this.f27071a.p();
        this.f27072b = true;
    }

    public final void m(g<FieldDescriptorType> gVar) {
        t tVar;
        int i11 = 0;
        while (true) {
            int l11 = gVar.f27071a.l();
            tVar = gVar.f27071a;
            if (i11 >= l11) {
                break;
            }
            n(tVar.k(i11));
            i11++;
        }
        Iterator<Map.Entry<Object, Object>> it = tVar.m().iterator();
        while (it.hasNext()) {
            n((Map.Entry) it.next());
        }
    }

    public final void q(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.isRepeated()) {
            r(fielddescriptortype.getLiteType(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                r(fielddescriptortype.getLiteType(), it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof k) {
            this.f27073c = true;
        }
        this.f27071a.q(fielddescriptortype, obj);
    }

    private g(int i11) {
        l();
    }
}
