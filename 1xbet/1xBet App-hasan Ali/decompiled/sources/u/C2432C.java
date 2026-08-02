package u;

/* renamed from: u.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2432C implements InterfaceC2431B {

    /* renamed from: a, reason: collision with root package name */
    public final float f19652a;

    /* renamed from: b, reason: collision with root package name */
    public final C2454d0 f19653b;

    public C2432C(float f, float f5, float f6) {
        this.f19652a = f6;
        C2454d0 c2454d0 = new C2454d0();
        c2454d0.f19791a = 1.0f;
        double sqrt = Math.sqrt(50.0d);
        c2454d0.f19792b = sqrt;
        c2454d0.f19796g = 1.0f;
        if (f < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        c2454d0.f19796g = f;
        c2454d0.f19793c = false;
        if (((float) (sqrt * sqrt)) <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        c2454d0.f19792b = Math.sqrt(f5);
        c2454d0.f19793c = false;
        this.f19653b = c2454d0;
    }

    @Override // u.InterfaceC2464k
    public final C0 a(A0 a02) {
        return new m2.g(this);
    }

    @Override // u.InterfaceC2431B
    public final float b(long j5, float f, float f5, float f6) {
        C2454d0 c2454d0 = this.f19653b;
        c2454d0.f19791a = f5;
        return Float.intBitsToFloat((int) (c2454d0.a(f, f6, j5 / 1000000) >> 32));
    }

    @Override // u.InterfaceC2431B
    public final float c(long j5, float f, float f5, float f6) {
        C2454d0 c2454d0 = this.f19653b;
        c2454d0.f19791a = f5;
        return Float.intBitsToFloat((int) (c2454d0.a(f, f6, j5 / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x0171  */
    @Override // u.InterfaceC2431B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long d(float f, float f5, float f6) {
        double d5;
        double d6;
        C2472t c2472t;
        double d7;
        long j5;
        double d8;
        C2454d0 c2454d0 = this.f19653b;
        double d9 = c2454d0.f19792b;
        float f7 = (float) (d9 * d9);
        float f8 = c2454d0.f19796g;
        float f9 = this.f19652a;
        float f10 = (f - f5) / f9;
        float f11 = f6 / f9;
        if (f8 == 0.0f) {
            j5 = 9223372036854L;
        } else {
            double d10 = f7;
            double d11 = f8;
            double d12 = f11;
            double d13 = f10;
            double d14 = 1.0f;
            double sqrt = d11 * 2.0d * Math.sqrt(d10);
            double d15 = (sqrt * sqrt) - (d10 * 4.0d);
            double d16 = -sqrt;
            if (d15 < 0.0d) {
                d6 = 2.0d;
                d5 = d11;
                c2472t = new C2472t(0.0d, Math.sqrt(Math.abs(d15)));
            } else {
                d5 = d11;
                d6 = 2.0d;
                c2472t = new C2472t(Math.sqrt(d15), 0.0d);
            }
            c2472t.f19935a = (c2472t.f19935a + d16) * 0.5d;
            c2472t.f19936b *= 0.5d;
            C2472t c2472t2 = d15 < 0.0d ? new C2472t(0.0d, Math.sqrt(Math.abs(d15))) : new C2472t(Math.sqrt(d15), 0.0d);
            double d17 = -1;
            double d18 = c2472t2.f19935a * d17;
            double d19 = c2472t2.f19936b * d17;
            c2472t2.f19935a = (d18 + d16) * 0.5d;
            c2472t2.f19936b = d19 * 0.5d;
            if (d13 == 0.0d && d12 == 0.0d) {
                j5 = 0;
            } else {
                if (d13 < 0.0d) {
                    d12 = -d12;
                }
                double abs = Math.abs(d13);
                double d20 = Double.MAX_VALUE;
                if (d5 > 1.0d) {
                    double d21 = c2472t.f19935a;
                    double d22 = c2472t2.f19935a;
                    double d23 = (d21 * abs) - d12;
                    double d24 = d21 - d22;
                    double d25 = d23 / d24;
                    double d26 = abs - d25;
                    d7 = Math.log(Math.abs(d14 / d26)) / d21;
                    double log = Math.log(Math.abs(d14 / d25)) / d22;
                    if (Double.isInfinite(d7) || Double.isNaN(d7)) {
                        d7 = log;
                    } else if (!Double.isInfinite(log) && !Double.isNaN(log)) {
                        d7 = Math.max(d7, log);
                    }
                    double d27 = d26 * d21;
                    double log2 = Math.log(d27 / ((-d25) * d22)) / (d22 - d21);
                    if (!Double.isNaN(log2) && log2 > 0.0d) {
                        if (log2 > 0.0d) {
                            if ((-((Math.exp(log2 * d22) * d25) + (Math.exp(d21 * log2) * d26))) < d14) {
                                if (d25 > 0.0d && d26 < 0.0d) {
                                    d7 = 0.0d;
                                }
                            }
                        }
                        d7 = Math.log((-((d25 * d22) * d22)) / (d27 * d21)) / d24;
                        d8 = d25 * d22;
                        if (Math.abs((Math.exp(d22 * d7) * d8) + (Math.exp(d21 * d7) * d27)) >= 1.0E-4d) {
                            int i = 0;
                            while (d20 > 0.001d && i < 100) {
                                i++;
                                double d28 = d21 * d7;
                                double d29 = d22 * d7;
                                double exp = d7 - ((((Math.exp(d29) * d25) + (Math.exp(d28) * d26)) + d14) / ((Math.exp(d29) * d8) + (Math.exp(d28) * d27)));
                                d20 = Math.abs(d7 - exp);
                                d7 = exp;
                            }
                        }
                    }
                    d14 = -d14;
                    d8 = d25 * d22;
                    if (Math.abs((Math.exp(d22 * d7) * d8) + (Math.exp(d21 * d7) * d27)) >= 1.0E-4d) {
                    }
                } else if (d5 < 1.0d) {
                    double d30 = c2472t.f19935a;
                    double d31 = (d12 - (d30 * abs)) / c2472t.f19936b;
                    d7 = Math.log(d14 / Math.sqrt((d31 * d31) + (abs * abs))) / d30;
                } else {
                    double d32 = c2472t.f19935a;
                    double d33 = d32 * abs;
                    double d34 = d12 - d33;
                    double log3 = Math.log(Math.abs(d14 / abs)) / d32;
                    double log4 = Math.log(Math.abs(d14 / d34));
                    double d35 = log4;
                    for (int i5 = 0; i5 < 6; i5++) {
                        d35 = log4 - Math.log(Math.abs(d35 / d32));
                    }
                    double d36 = d35 / d32;
                    if (Double.isInfinite(log3) || Double.isNaN(log3)) {
                        log3 = d36;
                    } else if (!Double.isInfinite(d36) && !Double.isNaN(d36)) {
                        log3 = Math.max(log3, d36);
                    }
                    double d37 = (-(d33 + d34)) / (d32 * d34);
                    double d38 = d32 * d37;
                    double exp2 = (Math.exp(d38) * d34 * d37) + (Math.exp(d38) * abs);
                    if (Double.isNaN(d37) || d37 <= 0.0d) {
                        d14 = -d14;
                    } else if (d37 <= 0.0d || (-exp2) >= d14) {
                        log3 = (-(d6 / d32)) - (abs / d34);
                    } else {
                        d14 = -d14;
                        log3 = (d34 >= 0.0d || abs <= 0.0d) ? log3 : 0.0d;
                    }
                    int i6 = 0;
                    while (d20 > 0.001d && i6 < 100) {
                        i6++;
                        double d39 = d32 * log3;
                        double exp3 = log3 - (((Math.exp(d39) * ((d34 * log3) + abs)) + d14) / (Math.exp(d39) * (((1 + d39) * d34) + d33)));
                        d20 = Math.abs(log3 - exp3);
                        log3 = exp3;
                    }
                    d7 = log3;
                }
                j5 = (long) (d7 * 1000.0d);
            }
        }
        return j5 * 1000000;
    }

    @Override // u.InterfaceC2431B
    public final float e(float f, float f5, float f6) {
        return 0.0f;
    }
}
