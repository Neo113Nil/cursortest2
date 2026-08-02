package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.J;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5366l implements t0 {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC5365k f42585a;

    private C5366l(AbstractC5365k abstractC5365k) {
        C5378y.a(abstractC5365k, "output");
        this.f42585a = abstractC5365k;
        abstractC5365k.f42577a = this;
    }

    public static C5366l a(AbstractC5365k abstractC5365k) {
        C5366l c5366l = abstractC5365k.f42577a;
        return c5366l != null ? c5366l : new C5366l(abstractC5365k);
    }

    public final void A(int i11, long j11) throws IOException {
        this.f42585a.t(i11, j11);
    }

    public final void B(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof H;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.t(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13 += 8;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.u(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        H h11 = (H) list;
        if (!z11) {
            while (i12 < h11.size()) {
                abstractC5365k.t(i11, h11.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < h11.size(); i17++) {
            h11.getLong(i17);
            int i18 = AbstractC5365k.f42576d;
            i16 += 8;
        }
        abstractC5365k.F(i16);
        while (i12 < h11.size()) {
            abstractC5365k.u(h11.getLong(i12));
            i12++;
        }
    }

    public final void C(int i11, int i12) throws IOException {
        this.f42585a.E(i11, (i12 >> 31) ^ (i12 << 1));
    }

    public final void D(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5377x;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    int intValue = list.get(i12).intValue();
                    abstractC5365k.E(i11, (intValue >> 31) ^ (intValue << 1));
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.e(list.get(i14).intValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                int intValue2 = list.get(i12).intValue();
                abstractC5365k.F((intValue2 >> 31) ^ (intValue2 << 1));
                i12++;
            }
            return;
        }
        C5377x c5377x = (C5377x) list;
        if (!z11) {
            while (i12 < c5377x.size()) {
                int i15 = c5377x.getInt(i12);
                abstractC5365k.E(i11, (i15 >> 31) ^ (i15 << 1));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5377x.size(); i17++) {
            i16 += AbstractC5365k.e(c5377x.getInt(i17));
        }
        abstractC5365k.F(i16);
        while (i12 < c5377x.size()) {
            int i18 = c5377x.getInt(i12);
            abstractC5365k.F((i18 >> 31) ^ (i18 << 1));
            i12++;
        }
    }

    public final void E(int i11, long j11) throws IOException {
        this.f42585a.G(i11, (j11 >> 63) ^ (j11 << 1));
    }

    public final void F(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof H;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    long longValue = list.get(i12).longValue();
                    abstractC5365k.G(i11, (longValue >> 63) ^ (longValue << 1));
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.f(list.get(i14).longValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                long longValue2 = list.get(i12).longValue();
                abstractC5365k.H((longValue2 >> 63) ^ (longValue2 << 1));
                i12++;
            }
            return;
        }
        H h11 = (H) list;
        if (!z11) {
            while (i12 < h11.size()) {
                long j11 = h11.getLong(i12);
                abstractC5365k.G(i11, (j11 >> 63) ^ (j11 << 1));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < h11.size(); i16++) {
            i15 += AbstractC5365k.f(h11.getLong(i16));
        }
        abstractC5365k.F(i15);
        while (i12 < h11.size()) {
            long j12 = h11.getLong(i12);
            abstractC5365k.H((j12 >> 63) ^ (j12 << 1));
            i12++;
        }
    }

    @Deprecated
    public final void G(int i11) throws IOException {
        this.f42585a.D(i11, 3);
    }

    public final void H(int i11, String str) throws IOException {
        this.f42585a.B(i11, str);
    }

    public final void I(int i11, List<String> list) throws IOException {
        boolean z11 = list instanceof D;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z11) {
            while (i12 < list.size()) {
                abstractC5365k.B(i11, list.get(i12));
                i12++;
            }
            return;
        }
        D d11 = (D) list;
        while (i12 < list.size()) {
            Object y11 = d11.y();
            if (y11 instanceof String) {
                abstractC5365k.B(i11, (String) y11);
            } else {
                abstractC5365k.p(i11, (AbstractC5362h) y11);
            }
            i12++;
        }
    }

    public final void J(int i11, int i12) throws IOException {
        this.f42585a.E(i11, i12);
    }

    public final void K(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5377x;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.E(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.i(list.get(i14).intValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.F(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5377x c5377x = (C5377x) list;
        if (!z11) {
            while (i12 < c5377x.size()) {
                abstractC5365k.E(i11, c5377x.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < c5377x.size(); i16++) {
            i15 += AbstractC5365k.i(c5377x.getInt(i16));
        }
        abstractC5365k.F(i15);
        while (i12 < c5377x.size()) {
            abstractC5365k.F(c5377x.getInt(i12));
            i12++;
        }
    }

    public final void L(int i11, long j11) throws IOException {
        this.f42585a.G(i11, j11);
    }

    public final void M(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof H;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.G(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.j(list.get(i14).longValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.H(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        H h11 = (H) list;
        if (!z11) {
            while (i12 < h11.size()) {
                abstractC5365k.G(i11, h11.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < h11.size(); i16++) {
            i15 += AbstractC5365k.j(h11.getLong(i16));
        }
        abstractC5365k.F(i15);
        while (i12 < h11.size()) {
            abstractC5365k.H(h11.getLong(i12));
            i12++;
        }
    }

    public final void b(int i11, boolean z11) throws IOException {
        this.f42585a.n(i11, z11);
    }

    public final void c(int i11, List<Boolean> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5359e;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.n(i11, list.get(i12).booleanValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13++;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.m(list.get(i12).booleanValue() ? (byte) 1 : (byte) 0);
                i12++;
            }
            return;
        }
        C5359e c5359e = (C5359e) list;
        if (!z11) {
            while (i12 < c5359e.size()) {
                abstractC5365k.n(i11, c5359e.getBoolean(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5359e.size(); i17++) {
            c5359e.getBoolean(i17);
            int i18 = AbstractC5365k.f42576d;
            i16++;
        }
        abstractC5365k.F(i16);
        while (i12 < c5359e.size()) {
            abstractC5365k.m(c5359e.getBoolean(i12) ? (byte) 1 : (byte) 0);
            i12++;
        }
    }

    public final void d(int i11, AbstractC5362h abstractC5362h) throws IOException {
        this.f42585a.p(i11, abstractC5362h);
    }

    public final void e(int i11, List<AbstractC5362h> list) throws IOException {
        for (int i12 = 0; i12 < list.size(); i12++) {
            this.f42585a.p(i11, list.get(i12));
        }
    }

    public final void f(int i11, double d11) throws IOException {
        AbstractC5365k abstractC5365k = this.f42585a;
        abstractC5365k.getClass();
        abstractC5365k.t(i11, Double.doubleToRawLongBits(d11));
    }

    public final void g(int i11, List<Double> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5367m;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    double doubleValue = list.get(i12).doubleValue();
                    abstractC5365k.getClass();
                    abstractC5365k.t(i11, Double.doubleToRawLongBits(doubleValue));
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13 += 8;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.u(Double.doubleToRawLongBits(list.get(i12).doubleValue()));
                i12++;
            }
            return;
        }
        C5367m c5367m = (C5367m) list;
        if (!z11) {
            while (i12 < c5367m.size()) {
                double d11 = c5367m.getDouble(i12);
                abstractC5365k.getClass();
                abstractC5365k.t(i11, Double.doubleToRawLongBits(d11));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5367m.size(); i17++) {
            c5367m.getDouble(i17);
            int i18 = AbstractC5365k.f42576d;
            i16 += 8;
        }
        abstractC5365k.F(i16);
        while (i12 < c5367m.size()) {
            abstractC5365k.u(Double.doubleToRawLongBits(c5367m.getDouble(i12)));
            i12++;
        }
    }

    @Deprecated
    public final void h(int i11) throws IOException {
        this.f42585a.D(i11, 4);
    }

    public final void i(int i11, int i12) throws IOException {
        this.f42585a.v(i11, i12);
    }

    public final void j(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5377x;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.v(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.j(list.get(i14).intValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.w(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5377x c5377x = (C5377x) list;
        if (!z11) {
            while (i12 < c5377x.size()) {
                abstractC5365k.v(i11, c5377x.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < c5377x.size(); i16++) {
            i15 += AbstractC5365k.j(c5377x.getInt(i16));
        }
        abstractC5365k.F(i15);
        while (i12 < c5377x.size()) {
            abstractC5365k.w(c5377x.getInt(i12));
            i12++;
        }
    }

    public final void k(int i11, int i12) throws IOException {
        this.f42585a.r(i11, i12);
    }

    public final void l(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5377x;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.r(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13 += 4;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.s(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5377x c5377x = (C5377x) list;
        if (!z11) {
            while (i12 < c5377x.size()) {
                abstractC5365k.r(i11, c5377x.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5377x.size(); i17++) {
            c5377x.getInt(i17);
            int i18 = AbstractC5365k.f42576d;
            i16 += 4;
        }
        abstractC5365k.F(i16);
        while (i12 < c5377x.size()) {
            abstractC5365k.s(c5377x.getInt(i12));
            i12++;
        }
    }

    public final void m(int i11, long j11) throws IOException {
        this.f42585a.t(i11, j11);
    }

    public final void n(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof H;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.t(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13 += 8;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.u(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        H h11 = (H) list;
        if (!z11) {
            while (i12 < h11.size()) {
                abstractC5365k.t(i11, h11.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < h11.size(); i17++) {
            h11.getLong(i17);
            int i18 = AbstractC5365k.f42576d;
            i16 += 8;
        }
        abstractC5365k.F(i16);
        while (i12 < h11.size()) {
            abstractC5365k.u(h11.getLong(i12));
            i12++;
        }
    }

    public final void o(int i11, float f7) throws IOException {
        AbstractC5365k abstractC5365k = this.f42585a;
        abstractC5365k.getClass();
        abstractC5365k.r(i11, Float.floatToRawIntBits(f7));
    }

    public final void p(int i11, List<Float> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5374u;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    float floatValue = list.get(i12).floatValue();
                    abstractC5365k.getClass();
                    abstractC5365k.r(i11, Float.floatToRawIntBits(floatValue));
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13 += 4;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.s(Float.floatToRawIntBits(list.get(i12).floatValue()));
                i12++;
            }
            return;
        }
        C5374u c5374u = (C5374u) list;
        if (!z11) {
            while (i12 < c5374u.size()) {
                float f7 = c5374u.getFloat(i12);
                abstractC5365k.getClass();
                abstractC5365k.r(i11, Float.floatToRawIntBits(f7));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5374u.size(); i17++) {
            c5374u.getFloat(i17);
            int i18 = AbstractC5365k.f42576d;
            i16 += 4;
        }
        abstractC5365k.F(i16);
        while (i12 < c5374u.size()) {
            abstractC5365k.s(Float.floatToRawIntBits(c5374u.getFloat(i12)));
            i12++;
        }
    }

    public final void q(int i11, Object obj, f0 f0Var) throws IOException {
        AbstractC5365k abstractC5365k = this.f42585a;
        abstractC5365k.D(i11, 3);
        f0Var.c((Q) obj, abstractC5365k.f42577a);
        abstractC5365k.D(i11, 4);
    }

    public final void r(int i11, int i12) throws IOException {
        this.f42585a.v(i11, i12);
    }

    public final void s(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5377x;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.v(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.j(list.get(i14).intValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.w(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5377x c5377x = (C5377x) list;
        if (!z11) {
            while (i12 < c5377x.size()) {
                abstractC5365k.v(i11, c5377x.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < c5377x.size(); i16++) {
            i15 += AbstractC5365k.j(c5377x.getInt(i16));
        }
        abstractC5365k.F(i15);
        while (i12 < c5377x.size()) {
            abstractC5365k.w(c5377x.getInt(i12));
            i12++;
        }
    }

    public final void t(int i11, long j11) throws IOException {
        this.f42585a.G(i11, j11);
    }

    public final void u(int i11, List<Long> list, boolean z11) throws IOException {
        boolean z12 = list instanceof H;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.G(i11, list.get(i12).longValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                i13 += AbstractC5365k.j(list.get(i14).longValue());
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.H(list.get(i12).longValue());
                i12++;
            }
            return;
        }
        H h11 = (H) list;
        if (!z11) {
            while (i12 < h11.size()) {
                abstractC5365k.G(i11, h11.getLong(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i15 = 0;
        for (int i16 = 0; i16 < h11.size(); i16++) {
            i15 += AbstractC5365k.j(h11.getLong(i16));
        }
        abstractC5365k.F(i15);
        while (i12 < h11.size()) {
            abstractC5365k.H(h11.getLong(i12));
            i12++;
        }
    }

    public final <K, V> void v(int i11, J.a<K, V> aVar, Map<K, V> map) throws IOException {
        AbstractC5365k abstractC5365k = this.f42585a;
        abstractC5365k.getClass();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            abstractC5365k.D(i11, 2);
            abstractC5365k.F(J.b(aVar, entry.getKey(), entry.getValue()));
            J.e(abstractC5365k, aVar, entry.getKey(), entry.getValue());
        }
    }

    public final void w(int i11, Object obj, f0 f0Var) throws IOException {
        this.f42585a.x(i11, (Q) obj, f0Var);
    }

    public final void x(int i11, Object obj) throws IOException {
        boolean z11 = obj instanceof AbstractC5362h;
        AbstractC5365k abstractC5365k = this.f42585a;
        if (z11) {
            abstractC5365k.A(i11, (AbstractC5362h) obj);
        } else {
            abstractC5365k.z(i11, (Q) obj);
        }
    }

    public final void y(int i11, int i12) throws IOException {
        this.f42585a.r(i11, i12);
    }

    public final void z(int i11, List<Integer> list, boolean z11) throws IOException {
        boolean z12 = list instanceof C5377x;
        AbstractC5365k abstractC5365k = this.f42585a;
        int i12 = 0;
        if (!z12) {
            if (!z11) {
                while (i12 < list.size()) {
                    abstractC5365k.r(i11, list.get(i12).intValue());
                    i12++;
                }
                return;
            }
            abstractC5365k.D(i11, 2);
            int i13 = 0;
            for (int i14 = 0; i14 < list.size(); i14++) {
                list.get(i14).getClass();
                int i15 = AbstractC5365k.f42576d;
                i13 += 4;
            }
            abstractC5365k.F(i13);
            while (i12 < list.size()) {
                abstractC5365k.s(list.get(i12).intValue());
                i12++;
            }
            return;
        }
        C5377x c5377x = (C5377x) list;
        if (!z11) {
            while (i12 < c5377x.size()) {
                abstractC5365k.r(i11, c5377x.getInt(i12));
                i12++;
            }
            return;
        }
        abstractC5365k.D(i11, 2);
        int i16 = 0;
        for (int i17 = 0; i17 < c5377x.size(); i17++) {
            c5377x.getInt(i17);
            int i18 = AbstractC5365k.f42576d;
            i16 += 4;
        }
        abstractC5365k.F(i16);
        while (i12 < c5377x.size()) {
            abstractC5365k.s(c5377x.getInt(i12));
            i12++;
        }
    }
}
