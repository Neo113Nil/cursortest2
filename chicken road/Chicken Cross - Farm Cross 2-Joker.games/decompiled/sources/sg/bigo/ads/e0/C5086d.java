package sg.bigo.ads.e0;

import android.graphics.Rect;
import android.os.Build;
import android.view.RoundedCorner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: sg.bigo.ads.e0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5086d {

    /* renamed from: a, reason: collision with root package name */
    public RoundedCorner f12752a;
    public RoundedCorner b;
    public RoundedCorner c;
    public RoundedCorner d;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public final double i = Math.sin(Math.toRadians(45.0d));
    public final boolean[] j = {true, false, true, false};
    public final boolean[] k = {true, true, false, false};

    public static void a(ArrayList arrayList, int i, int i2) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            if (iArr[0] == i && iArr[1] == i2) {
                return;
            }
        }
        arrayList.add(new int[]{i, i2});
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00da, code lost:
    
        if (r12.isEmpty() != false) goto L48;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int radius;
        int i12;
        RoundedCorner[] roundedCornerArr;
        int i13;
        int max;
        int i14;
        Rect rect2;
        int i15;
        int i16;
        int i17;
        int i18;
        C5086d c5086d = this;
        int i19 = 31;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        int i20 = c5086d.g;
        if ((i20 == 0 && c5086d.h == 0) || i20 > i || c5086d.h > i2) {
            c5086d.a(i, i2);
        }
        int i21 = c5086d.e;
        int i22 = c5086d.f;
        int i23 = c5086d.g;
        if (i23 <= 0) {
            i23 = i;
        }
        int i24 = c5086d.h;
        if (i24 <= 0) {
            i24 = i2;
        }
        ArrayList arrayList = new ArrayList(4);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new int[]{0, 0});
        RoundedCorner[] roundedCornerArr2 = {c5086d.f12752a, c5086d.b, c5086d.c, c5086d.d};
        int i25 = 0;
        for (int i26 = 4; i25 < i26; i26 = 4) {
            RoundedCorner roundedCorner = roundedCornerArr2[i25];
            boolean z = c5086d.j[i25];
            boolean z2 = c5086d.k[i25];
            if (roundedCorner == null) {
                i15 = i22;
                roundedCornerArr = roundedCornerArr2;
                i14 = i25;
            } else {
                if (Build.VERSION.SDK_INT >= i19 && (radius = roundedCorner.getRadius()) > 0) {
                    i12 = i22;
                    int sin = (int) (radius * Math.sin(Math.toRadians(45.0d)));
                    int i27 = roundedCorner.getCenter().x;
                    int i28 = roundedCorner.getCenter().y;
                    if (z) {
                        roundedCornerArr = roundedCornerArr2;
                        max = 0;
                        i13 = 0;
                    } else {
                        roundedCornerArr = roundedCornerArr2;
                        i13 = 0;
                        max = Math.max(0, i27 - sin);
                    }
                    i14 = i25;
                    if (!z2) {
                        i13 = Math.max(i13, i28 - sin);
                    }
                    rect2 = new Rect(max, i13, z ? Math.min(i, i27 + sin) : i, z2 ? Math.min(i2, i28 + sin) : i2);
                } else {
                    i12 = i22;
                    roundedCornerArr = roundedCornerArr2;
                    i14 = i25;
                }
                rect2 = null;
                if (rect2 == null || !Rect.intersects(rect, rect2)) {
                    i15 = i12;
                } else {
                    arrayList.add(rect2);
                    if (z) {
                        int i29 = rect.left;
                        if (i29 < i21) {
                            i16 = i21 - i29;
                            i17 = i16;
                        }
                        i17 = 0;
                    } else {
                        int i30 = rect.right;
                        if (i30 > i23) {
                            i16 = i23 - i30;
                            i17 = i16;
                        }
                        i17 = 0;
                    }
                    if (z2) {
                        int i31 = rect.top;
                        i15 = i12;
                        if (i31 < i15) {
                            i18 = i15 - i31;
                            a(arrayList2, i17, 0);
                            a(arrayList2, 0, i18);
                            a(arrayList2, i17, i18);
                        }
                        i18 = 0;
                        a(arrayList2, i17, 0);
                        a(arrayList2, 0, i18);
                        a(arrayList2, i17, i18);
                    } else {
                        i15 = i12;
                        int i32 = rect.bottom;
                        if (i32 > i24) {
                            i18 = i24 - i32;
                            a(arrayList2, i17, 0);
                            a(arrayList2, 0, i18);
                            a(arrayList2, i17, i18);
                        }
                        i18 = 0;
                        a(arrayList2, i17, 0);
                        a(arrayList2, 0, i18);
                        a(arrayList2, i17, i18);
                    }
                }
            }
            i25 = i14 + 1;
            c5086d = this;
            i22 = i15;
            roundedCornerArr2 = roundedCornerArr;
            i19 = 31;
        }
        int i33 = i22;
        if (arrayList.isEmpty()) {
            Objects.toString(rect);
            return;
        }
        Iterator it = arrayList2.iterator();
        long j = Long.MAX_VALUE;
        int i34 = 0;
        int i35 = 0;
        boolean z3 = false;
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            Iterator it2 = it;
            int i36 = iArr[0];
            int i37 = iArr[1];
            Rect rect3 = new Rect(rect);
            if (AbstractC5083a.a(rect3, i36, i37, i, i2)) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    i9 = i34;
                    Rect rect4 = (Rect) it3.next();
                    if (rect4 == null || !Rect.intersects(rect3, rect4)) {
                        i34 = i9;
                    } else {
                        i8 = i33;
                    }
                }
                i8 = i33;
                i9 = i34;
                i11 = i23;
                i10 = i24;
                long abs = Math.abs(i36) + Math.abs(i37);
                if (!z3 || abs < j) {
                    j = abs;
                    i35 = i37;
                    i23 = i11;
                    z3 = true;
                    i24 = i10;
                    i33 = i8;
                    i34 = i36;
                    it = it2;
                } else {
                    i23 = i11;
                    it = it2;
                    i24 = i10;
                    i34 = i9;
                    i33 = i8;
                }
            } else {
                i8 = i33;
                i9 = i34;
            }
            i11 = i23;
            i10 = i24;
            i23 = i11;
            it = it2;
            i24 = i10;
            i34 = i9;
            i33 = i8;
        }
        int i38 = i33;
        int i39 = i34;
        int i40 = i23;
        int i41 = i24;
        if (z3) {
            i3 = i39;
        } else {
            Iterator it4 = arrayList.iterator();
            int i42 = 0;
            int i43 = 0;
            while (it4.hasNext()) {
                Rect rect5 = (Rect) it4.next();
                if (Rect.intersects(rect, rect5)) {
                    if (rect5.left == 0 && (i7 = rect.left) < i21) {
                        i43 = Math.max(i43, i21 - i7);
                    }
                    if (rect5.right == i) {
                        int i44 = rect.right;
                        i4 = i40;
                        if (i44 > i4) {
                            int i45 = i4 - i44;
                            if (i43 == 0 || Math.abs(i45) < Math.abs(i43)) {
                                i43 = i45;
                            }
                        }
                    } else {
                        i4 = i40;
                    }
                    if (rect5.top == 0) {
                        int i46 = rect.top;
                        i5 = i38;
                        if (i46 < i5) {
                            i42 = Math.max(i42, i5 - i46);
                        }
                    } else {
                        i5 = i38;
                    }
                    if (rect5.bottom == i2) {
                        int i47 = rect.bottom;
                        i6 = i41;
                        if (i47 > i6) {
                            int i48 = i6 - i47;
                            if (i42 == 0 || Math.abs(i48) < Math.abs(i42)) {
                                i42 = i48;
                            }
                        }
                    } else {
                        i6 = i41;
                    }
                    i41 = i6;
                    i40 = i4;
                    i38 = i5;
                }
            }
            int i49 = -rect.left;
            int i50 = i - rect.right;
            int i51 = -rect.top;
            int i52 = i2 - rect.bottom;
            i3 = i43 < i49 ? i49 : i43 > i50 ? i50 : i43;
            i35 = i42 < i51 ? i51 : i42 > i52 ? i52 : i42;
        }
        Objects.toString(rect);
        if (i3 == 0 && i35 == 0) {
            return;
        }
        rect.offset(i3, i35);
    }

    public final void a(int i, int i2) {
        int radius;
        int i3 = 31;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (i <= 0 || i2 <= 0) {
            this.f = 0;
            this.e = 0;
            this.h = 0;
            this.g = 0;
            return;
        }
        int[] iArr = {0, 0, i, i2};
        RoundedCorner[] roundedCornerArr = {this.f12752a, this.b, this.c, this.d};
        int i4 = 0;
        for (int i5 = 4; i4 < i5; i5 = 4) {
            RoundedCorner roundedCorner = roundedCornerArr[i4];
            boolean z = this.j[i4];
            boolean z2 = this.k[i4];
            if (roundedCorner != null && Build.VERSION.SDK_INT >= i3 && (radius = roundedCorner.getRadius()) > 0) {
                int i6 = (int) (radius * this.i);
                int i7 = roundedCorner.getCenter().x;
                int i8 = roundedCorner.getCenter().y;
                if (z) {
                    iArr[0] = Math.max(iArr[0], i7 - i6);
                } else {
                    iArr[2] = Math.min(iArr[2], i7 + i6);
                }
                if (z2) {
                    iArr[1] = Math.max(iArr[1], i8 - i6);
                } else {
                    iArr[3] = Math.min(iArr[3], i8 + i6);
                }
            }
            i4++;
            i3 = 31;
        }
        this.e = iArr[0];
        this.f = iArr[1];
        this.g = iArr[2];
        this.h = iArr[3];
    }
}
