package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC5376w;
import java.io.IOException;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5371q extends AbstractC5370p<AbstractC5376w.d> {

    /* renamed from: androidx.datastore.preferences.protobuf.q$a */
    /* loaded from: classes8.dex */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42608a;

        static {
            int[] iArr = new int[r0.values().length];
            f42608a = iArr;
            try {
                iArr[r0.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42608a[r0.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f42608a[r0.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f42608a[r0.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f42608a[r0.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f42608a[r0.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f42608a[r0.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f42608a[r0.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f42608a[r0.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f42608a[r0.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f42608a[r0.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f42608a[r0.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f42608a[r0.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f42608a[r0.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f42608a[r0.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f42608a[r0.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f42608a[r0.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f42608a[r0.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final void a(Map.Entry entry) {
        ((AbstractC5376w.d) entry.getKey()).getClass();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final AbstractC5376w.e b(C5369o c5369o, Q q11, int i11) {
        return c5369o.a(i11, q11);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final C5372s<AbstractC5376w.d> c(Object obj) {
        return ((AbstractC5376w.c) obj).extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final C5372s<AbstractC5376w.d> d(Object obj) {
        AbstractC5376w.c cVar = (AbstractC5376w.c) obj;
        if (cVar.extensions.j()) {
            cVar.extensions = cVar.extensions.clone();
        }
        return cVar.extensions;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final boolean e(Q q11) {
        return q11 instanceof AbstractC5376w.c;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final void f(Object obj) {
        ((AbstractC5376w.c) obj).extensions.n();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final Object g(Object obj) throws IOException {
        AbstractC5376w.e.i();
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final void h(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final void i(Object obj) throws IOException {
        throw null;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC5370p
    final void j(Map.Entry entry) throws IOException {
        ((AbstractC5376w.d) entry.getKey()).getClass();
        int[] iArr = a.f42608a;
        throw null;
    }
}
