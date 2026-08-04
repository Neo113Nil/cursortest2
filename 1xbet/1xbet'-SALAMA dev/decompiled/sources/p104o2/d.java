package p104o2;

import android.graphics.Color;
import p151v2.a;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f15600c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f15601d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f15602e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15603f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f15604g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15605h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f15606i;
    public final int j;

    public d(String str, int i7, Integer num, Integer num2, float f7, boolean z4, boolean z7, boolean z8, boolean z9, int i8) {
        this.f15598a = str;
        this.f15599b = i7;
        this.f15600c = num;
        this.f15601d = num2;
        this.f15602e = f7;
        this.f15603f = z4;
        this.f15604g = z7;
        this.f15605h = z8;
        this.f15606i = z9;
        this.j = i8;
    }

    public static int a(String str) {
        boolean z4;
        try {
            int i7 = Integer.parseInt(str.trim());
            switch (i7) {
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
                return i7;
            }
        } catch (NumberFormatException unused) {
        }
        L.l("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int i7 = Integer.parseInt(str);
            return i7 == 1 || i7 == -1;
        } catch (NumberFormatException e7) {
            a.G(e7, "SsaStyle", "Failed to parse boolean value: '" + str + "'");
            return false;
        }
    }

    public static Integer c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            a.f(j <= 4294967295L);
            return Integer.valueOf(Color.argb(Q0.a.g(((j >> 24) & 255) ^ 255), Q0.a.g(j & 255), Q0.a.g((j >> 8) & 255), Q0.a.g((j >> 16) & 255)));
        } catch (IllegalArgumentException e7) {
            a.G(e7, "SsaStyle", "Failed to parse color expression: '" + str + "'");
            return null;
        }
    }
}
