package sg.bigo.ads.e0;

import android.graphics.Rect;

/* renamed from: sg.bigo.ads.e0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5084b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f12750a;
    public final /* synthetic */ int b;
    public final /* synthetic */ C5085c c;

    public C5084b(C5085c c5085c, Rect rect, int i) {
        this.c = c5085c;
        this.f12750a = rect;
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (java.lang.Math.abs(r13) < r15) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Rect rect) {
        int i;
        int i2;
        int abs;
        int abs2;
        Rect rect2 = this.f12750a;
        C5085c c5085c = this.c;
        int i3 = c5085c.g;
        int i4 = c5085c.h;
        int i5 = this.b;
        if (Rect.intersects(rect, rect2)) {
            int i6 = rect.left;
            int i7 = rect2.right;
            int i8 = i6 - i7;
            int i9 = rect.right - rect2.left;
            int i10 = rect.top;
            int i11 = rect2.bottom;
            int i12 = i10 - i11;
            int i13 = rect.bottom - rect2.top;
            int i14 = Integer.MAX_VALUE;
            if (i5 == 1) {
                if (i7 <= i6 || !AbstractC5083a.a(new Rect(rect2), i8, 0, i3, i4) || (abs2 = Math.abs(i8)) >= Integer.MAX_VALUE) {
                    i8 = 0;
                } else {
                    i14 = abs2;
                }
                if (rect2.left >= rect.right || !AbstractC5083a.a(new Rect(rect2), i9, 0, i3, i4) || Math.abs(i9) >= i14) {
                    i9 = i8;
                }
                i2 = i9;
                i13 = 0;
            } else {
                if (i5 != 2) {
                    AbstractC5083a.a(rect, rect2, i3, i4);
                    return;
                }
                if (i11 > i10) {
                    Rect rect3 = new Rect(rect2);
                    if (AbstractC5083a.a(rect3, 0, i12, i3, i4) && !Rect.intersects(rect3, rect) && (abs = Math.abs(i12)) < Integer.MAX_VALUE) {
                        i14 = abs;
                        if (rect2.top >= rect.bottom) {
                            Rect rect4 = new Rect(rect2);
                            i = 0;
                            if (AbstractC5083a.a(rect4, 0, i13, i3, i4)) {
                                if (!Rect.intersects(rect4, rect)) {
                                }
                            }
                        } else {
                            i = 0;
                        }
                        i13 = i12;
                        i2 = i;
                    }
                }
                i12 = 0;
                if (rect2.top >= rect.bottom) {
                }
                i13 = i12;
                i2 = i;
            }
            rect2.toString();
            rect.toString();
            rect2.offset(i2, i13);
        }
    }
}
