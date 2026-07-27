package m1;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import j1.C1054b;
import j1.C1055c;
import j1.InterfaceC1056d;
import j1.InterfaceC1057e;
import j1.InterfaceC1058f;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import l1.C1107a;

/* loaded from: classes.dex */
public final class e implements InterfaceC1057e {
    public static final Charset f = Charset.forName(CharEncoding.UTF_8);

    /* renamed from: g, reason: collision with root package name */
    public static final C1055c f10100g;

    /* renamed from: h, reason: collision with root package name */
    public static final C1055c f10101h;

    /* renamed from: i, reason: collision with root package name */
    public static final C1107a f10102i;

    /* renamed from: a, reason: collision with root package name */
    public OutputStream f10103a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f10104b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f10105c;

    /* renamed from: d, reason: collision with root package name */
    public final C1107a f10106d;

    /* renamed from: e, reason: collision with root package name */
    public final g f10107e = new g(this);

    static {
        C1131a c1131a = new C1131a(1);
        HashMap hashMap = new HashMap();
        hashMap.put(InterfaceC1134d.class, c1131a);
        f10100g = new C1055c("key", Collections.unmodifiableMap(new HashMap(hashMap)));
        C1131a c1131a2 = new C1131a(2);
        HashMap hashMap2 = new HashMap();
        hashMap2.put(InterfaceC1134d.class, c1131a2);
        f10101h = new C1055c("value", Collections.unmodifiableMap(new HashMap(hashMap2)));
        f10102i = new C1107a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, C1107a c1107a) {
        this.f10103a = byteArrayOutputStream;
        this.f10104b = hashMap;
        this.f10105c = hashMap2;
        this.f10106d = c1107a;
    }

    public static int f(C1055c c1055c) {
        InterfaceC1134d interfaceC1134d = (InterfaceC1134d) ((Annotation) c1055c.f9527b.get(InterfaceC1134d.class));
        if (interfaceC1134d != null) {
            return ((C1131a) interfaceC1134d).f10096a;
        }
        throw new C1054b("Field has no @Protobuf config");
    }

    @Override // j1.InterfaceC1057e
    public final InterfaceC1057e a(C1055c c1055c, Object obj) {
        c(c1055c, obj, true);
        return this;
    }

    public final void b(C1055c c1055c, int i3, boolean z3) {
        if (z3 && i3 == 0) {
            return;
        }
        InterfaceC1134d interfaceC1134d = (InterfaceC1134d) ((Annotation) c1055c.f9527b.get(InterfaceC1134d.class));
        if (interfaceC1134d == null) {
            throw new C1054b("Field has no @Protobuf config");
        }
        g(((C1131a) interfaceC1134d).f10096a << 3);
        g(i3);
    }

    public final void c(C1055c c1055c, Object obj, boolean z3) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return;
            }
            g((f(c1055c) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            g(bytes.length);
            this.f10103a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                c(c1055c, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                e(f10102i, c1055c, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (z3 && doubleValue == 0.0d) {
                return;
            }
            g((f(c1055c) << 3) | 1);
            this.f10103a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(doubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z3 && floatValue == 0.0f) {
                return;
            }
            g((f(c1055c) << 3) | 5);
            this.f10103a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z3 && longValue == 0) {
                return;
            }
            InterfaceC1134d interfaceC1134d = (InterfaceC1134d) ((Annotation) c1055c.f9527b.get(InterfaceC1134d.class));
            if (interfaceC1134d == null) {
                throw new C1054b("Field has no @Protobuf config");
            }
            g(((C1131a) interfaceC1134d).f10096a << 3);
            h(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            b(c1055c, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return;
            }
            g((f(c1055c) << 3) | 2);
            g(bArr.length);
            this.f10103a.write(bArr);
            return;
        }
        InterfaceC1056d interfaceC1056d = (InterfaceC1056d) this.f10104b.get(obj.getClass());
        if (interfaceC1056d != null) {
            e(interfaceC1056d, c1055c, obj, z3);
            return;
        }
        InterfaceC1058f interfaceC1058f = (InterfaceC1058f) this.f10105c.get(obj.getClass());
        if (interfaceC1058f != null) {
            g gVar = this.f10107e;
            gVar.f10109a = false;
            gVar.f10111c = c1055c;
            gVar.f10110b = z3;
            interfaceC1058f.a(obj, gVar);
            return;
        }
        if (obj instanceof D0.d) {
            b(c1055c, ((D0.d) obj).f278a, true);
        } else if (obj instanceof Enum) {
            b(c1055c, ((Enum) obj).ordinal(), true);
        } else {
            e(this.f10106d, c1055c, obj, z3);
        }
    }

    @Override // j1.InterfaceC1057e
    public final InterfaceC1057e d(C1055c c1055c, long j3) {
        if (j3 == 0) {
            return this;
        }
        InterfaceC1134d interfaceC1134d = (InterfaceC1134d) ((Annotation) c1055c.f9527b.get(InterfaceC1134d.class));
        if (interfaceC1134d == null) {
            throw new C1054b("Field has no @Protobuf config");
        }
        g(((C1131a) interfaceC1134d).f10096a << 3);
        h(j3);
        return this;
    }

    public final void e(InterfaceC1056d interfaceC1056d, C1055c c1055c, Object obj, boolean z3) {
        C1132b c1132b = new C1132b();
        c1132b.f10097a = 0L;
        try {
            OutputStream outputStream = this.f10103a;
            this.f10103a = c1132b;
            try {
                interfaceC1056d.a(obj, this);
                this.f10103a = outputStream;
                long j3 = c1132b.f10097a;
                c1132b.close();
                if (z3 && j3 == 0) {
                    return;
                }
                g((f(c1055c) << 3) | 2);
                h(j3);
                interfaceC1056d.a(obj, this);
            } catch (Throwable th) {
                this.f10103a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c1132b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void g(int i3) {
        while ((i3 & (-128)) != 0) {
            this.f10103a.write((i3 & 127) | 128);
            i3 >>>= 7;
        }
        this.f10103a.write(i3 & 127);
    }

    public final void h(long j3) {
        while (((-128) & j3) != 0) {
            this.f10103a.write((((int) j3) & 127) | 128);
            j3 >>>= 7;
        }
        this.f10103a.write(((int) j3) & 127);
    }
}
