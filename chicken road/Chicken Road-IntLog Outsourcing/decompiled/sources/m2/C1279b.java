package m2;

import kotlin.jvm.internal.t;

/* renamed from: m2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1279b extends AbstractC1286i {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f11148t = 0;

    /* renamed from: u, reason: collision with root package name */
    public final AbstractC1286i f11149u;

    public C1279b(C1280c c1280c) {
        super(EnumC1281d.f11153d, t.a(double[].class), c1280c.f11179c, new double[0], 32);
        this.f11149u = c1280c;
    }

    @Override // m2.AbstractC1286i
    public final Object b(V0.j jVar) {
        switch (this.f11148t) {
            case 0:
                return new double[]{Double.longBitsToDouble(((C1278a) jVar.f3212b).i())};
            default:
                return new float[]{Float.intBitsToFloat(((C1278a) jVar.f3212b).h())};
        }
    }

    @Override // m2.AbstractC1286i
    public final Object c(C1278a reader) {
        switch (this.f11148t) {
            case 0:
                kotlin.jvm.internal.i.e(reader, "reader");
                return new double[]{Double.longBitsToDouble(reader.i())};
            default:
                kotlin.jvm.internal.i.e(reader, "reader");
                return new float[]{Float.intBitsToFloat(reader.h())};
        }
    }

    @Override // m2.AbstractC1286i
    public final void d(U.e writer, Object obj) {
        switch (this.f11148t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value, "value");
                for (double d6 : value) {
                    ((C1280c) this.f11149u).d(writer, Double.valueOf(d6));
                }
                break;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                kotlin.jvm.internal.i.e(value2, "value");
                for (float f3 : value2) {
                    ((C1280c) this.f11149u).d(writer, Float.valueOf(f3));
                }
                break;
        }
    }

    @Override // m2.AbstractC1286i
    public final void e(U.e writer, int i2, Object obj) {
        switch (this.f11148t) {
            case 0:
                double[] dArr = (double[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (dArr != null && dArr.length != 0) {
                    super.e(writer, i2, dArr);
                    break;
                }
                break;
            default:
                float[] fArr = (float[]) obj;
                kotlin.jvm.internal.i.e(writer, "writer");
                if (fArr != null && fArr.length != 0) {
                    super.e(writer, i2, fArr);
                    break;
                }
                break;
        }
    }

    @Override // m2.AbstractC1286i
    public final int f(Object obj) {
        switch (this.f11148t) {
            case 0:
                double[] value = (double[]) obj;
                kotlin.jvm.internal.i.e(value, "value");
                int i2 = 0;
                for (double d6 : value) {
                    ((C1280c) this.f11149u).f(Double.valueOf(d6));
                    i2 += 8;
                }
                return i2;
            default:
                float[] value2 = (float[]) obj;
                kotlin.jvm.internal.i.e(value2, "value");
                int i3 = 0;
                for (float f3 : value2) {
                    ((C1280c) this.f11149u).getClass();
                    i3 += 4;
                }
                return i3;
        }
    }

    @Override // m2.AbstractC1286i
    public final int g(int i2, Object obj) {
        switch (this.f11148t) {
            case 0:
                double[] dArr = (double[]) obj;
                if (dArr == null || dArr.length == 0) {
                    return 0;
                }
                return super.g(i2, dArr);
            default:
                float[] fArr = (float[]) obj;
                if (fArr == null || fArr.length == 0) {
                    return 0;
                }
                return super.g(i2, fArr);
        }
    }

    public C1279b(C1280c c1280c, byte b6) {
        super(EnumC1281d.f11153d, t.a(float[].class), c1280c.f11179c, new float[0], 32);
        this.f11149u = c1280c;
    }
}
