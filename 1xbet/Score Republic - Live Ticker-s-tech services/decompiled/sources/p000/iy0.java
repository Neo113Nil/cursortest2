package p000;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class iy0 implements ts0 {

    /* JADX INFO: renamed from: f */
    public static final Charset f3737f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g */
    public static final C0895xz f3738g = new C0895xz("key", AbstractC0024an.m288k(AbstractC0024an.m287j(dy0.class, new C0646r8(1))));

    /* JADX INFO: renamed from: h */
    public static final C0895xz f3739h = new C0895xz("value", AbstractC0024an.m288k(AbstractC0024an.m287j(dy0.class, new C0646r8(2))));

    /* JADX INFO: renamed from: i */
    public static final kg0 f3740i = new kg0(1);

    /* JADX INFO: renamed from: a */
    public OutputStream f3741a;

    /* JADX INFO: renamed from: b */
    public final HashMap f3742b;

    /* JADX INFO: renamed from: c */
    public final HashMap f3743c;

    /* JADX INFO: renamed from: d */
    public final ss0 f3744d;

    /* JADX INFO: renamed from: e */
    public final jy0 f3745e = new jy0(this);

    public iy0(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, ss0 ss0Var) {
        this.f3741a = byteArrayOutputStream;
        this.f3742b = map;
        this.f3743c = map2;
        this.f3744d = ss0Var;
    }

    /* JADX INFO: renamed from: h */
    public static int m2740h(C0895xz c0895xz) {
        dy0 dy0Var = (dy0) ((Annotation) c0895xz.f9110b.get(dy0.class));
        if (dy0Var != null) {
            return dy0Var.tag();
        }
        throw new C0855ww("Field has no @Protobuf config");
    }

    @Override // p000.ts0
    /* JADX INFO: renamed from: a */
    public final ts0 mo2741a(C0895xz c0895xz, Object obj) {
        m2746f(c0895xz, obj, true);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final void m2742b(C0895xz c0895xz, int i, boolean z) {
        if (z && i == 0) {
            return;
        }
        dy0 dy0Var = (dy0) ((Annotation) c0895xz.f9110b.get(dy0.class));
        if (dy0Var == null) {
            throw new C0855ww("Field has no @Protobuf config");
        }
        int iOrdinal = dy0Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            m2748i(dy0Var.tag() << 3);
            m2748i(i);
        } else if (iOrdinal == 1) {
            m2748i(dy0Var.tag() << 3);
            m2748i((i << 1) ^ (i >> 31));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m2748i((dy0Var.tag() << 3) | 5);
            this.f3741a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putInt(i).array());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m2743c(C0895xz c0895xz, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return;
        }
        dy0 dy0Var = (dy0) ((Annotation) c0895xz.f9110b.get(dy0.class));
        if (dy0Var == null) {
            throw new C0855ww("Field has no @Protobuf config");
        }
        int iOrdinal = dy0Var.intEncoding().ordinal();
        if (iOrdinal == 0) {
            m2748i(dy0Var.tag() << 3);
            m2749j(j);
        } else if (iOrdinal == 1) {
            m2748i(dy0Var.tag() << 3);
            m2749j((j >> 63) ^ (j << 1));
        } else {
            if (iOrdinal != 2) {
                return;
            }
            m2748i((dy0Var.tag() << 3) | 1);
            this.f3741a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(j).array());
        }
    }

    @Override // p000.ts0
    /* JADX INFO: renamed from: d */
    public final ts0 mo2744d(C0895xz c0895xz, int i) {
        m2742b(c0895xz, i, true);
        return this;
    }

    @Override // p000.ts0
    /* JADX INFO: renamed from: e */
    public final ts0 mo2745e(C0895xz c0895xz, long j) throws IOException {
        m2743c(c0895xz, j, true);
        return this;
    }

    /* JADX INFO: renamed from: f */
    public final void m2746f(C0895xz c0895xz, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            m2748i((m2740h(c0895xz) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f3737f);
            m2748i(bytes.length);
            this.f3741a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                m2746f(c0895xz, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                m2747g(f3740i, c0895xz, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z && dDoubleValue == 0.0d) {
                return;
            }
            m2748i((m2740h(c0895xz) << 3) | 1);
            this.f3741a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z && fFloatValue == 0.0f) {
                return;
            }
            m2748i((m2740h(c0895xz) << 3) | 5);
            this.f3741a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            m2743c(c0895xz, ((Number) obj).longValue(), z);
            return;
        }
        if (obj instanceof Boolean) {
            m2742b(c0895xz, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            m2748i((m2740h(c0895xz) << 3) | 2);
            m2748i(bArr.length);
            this.f3741a.write(bArr);
            return;
        }
        ss0 ss0Var = (ss0) this.f3742b.get(obj.getClass());
        if (ss0Var != null) {
            m2747g(ss0Var, c0895xz, obj, z);
            return;
        }
        eh1 eh1Var = (eh1) this.f3743c.get(obj.getClass());
        if (eh1Var != null) {
            jy0 jy0Var = this.f3745e;
            jy0Var.f4226a = false;
            jy0Var.f4228c = c0895xz;
            jy0Var.f4227b = z;
            eh1Var.mo103a(obj, jy0Var);
            return;
        }
        if (obj instanceof wx0) {
            m2742b(c0895xz, ((wx0) obj).mo950a(), true);
        } else if (obj instanceof Enum) {
            m2742b(c0895xz, ((Enum) obj).ordinal(), true);
        } else {
            m2747g(this.f3744d, c0895xz, obj, z);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2747g(ss0 ss0Var, C0895xz c0895xz, Object obj, boolean z) throws IOException {
        mh0 mh0Var = new mh0();
        mh0Var.f5046j = 0L;
        try {
            OutputStream outputStream = this.f3741a;
            this.f3741a = mh0Var;
            try {
                ss0Var.mo103a(obj, this);
                this.f3741a = outputStream;
                long j = mh0Var.f5046j;
                mh0Var.close();
                if (z && j == 0) {
                    return;
                }
                m2748i((m2740h(c0895xz) << 3) | 2);
                m2749j(j);
                ss0Var.mo103a(obj, this);
            } catch (Throwable th) {
                this.f3741a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                mh0Var.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m2748i(int i) throws IOException {
        while (true) {
            long j = i & (-128);
            OutputStream outputStream = this.f3741a;
            if (j == 0) {
                outputStream.write(i & 127);
                return;
            } else {
                outputStream.write((i & 127) | 128);
                i >>>= 7;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2749j(long j) throws IOException {
        while (true) {
            long j2 = (-128) & j;
            OutputStream outputStream = this.f3741a;
            if (j2 == 0) {
                outputStream.write(((int) j) & 127);
                return;
            } else {
                outputStream.write((((int) j) & 127) | 128);
                j >>>= 7;
            }
        }
    }
}
