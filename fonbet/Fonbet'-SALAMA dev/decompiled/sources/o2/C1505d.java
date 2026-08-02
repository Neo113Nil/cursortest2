package o2;

import android.graphics.Color;
import v2.AbstractC1664a;
import w1.L;

/* renamed from: o2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1505d {

    /* renamed from: a, reason: collision with root package name */
    public final String f15592a;

    /* renamed from: b, reason: collision with root package name */
    public final int f15593b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f15594c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f15595d;

    /* renamed from: e, reason: collision with root package name */
    public final float f15596e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f15597f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f15598g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f15599h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f15600i;
    public final int j;

    public C1505d(String str, int i7, Integer num, Integer num2, float f7, boolean z4, boolean z7, boolean z8, boolean z9, int i8) {
        this.f15592a = str;
        this.f15593b = i7;
        this.f15594c = num;
        this.f15595d = num2;
        this.f15596e = f7;
        this.f15597f = z4;
        this.f15598g = z7;
        this.f15599h = z8;
        this.f15600i = z9;
        this.j = i8;
    }

    public static int a(String str) {
        boolean z4;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
            if (z4) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        L.l("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e7) {
            AbstractC1664a.G(e7, "SsaStyle", "Failed to parse boolean value: '" + str + "'");
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1664a.f(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(Q0.a.g(((parseLong >> 24) & 255) ^ 255), Q0.a.g(parseLong & 255), Q0.a.g((parseLong >> 8) & 255), Q0.a.g((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            AbstractC1664a.G(e7, "SsaStyle", "Failed to parse color expression: '" + str + "'");
            return null;
        }
    }
}
