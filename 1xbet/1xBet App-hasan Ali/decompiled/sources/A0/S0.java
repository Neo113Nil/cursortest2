package A0;

import android.graphics.Rect;
import android.view.View;
import java.util.Comparator;
import r.C2321G;
import z0.C2731G;

/* loaded from: classes.dex */
public final /* synthetic */ class S0 implements Comparator {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f387k;

    public /* synthetic */ S0(int i) {
        this.f387k = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f387k) {
            case 0:
                View view = (View) obj;
                View view2 = (View) obj2;
                if (view == view2) {
                    return 0;
                }
                C2321G c2321g = T0.f392d;
                Object g5 = c2321g.g(view);
                kotlin.jvm.internal.l.c(g5);
                Rect rect = (Rect) g5;
                Object g6 = c2321g.g(view2);
                kotlin.jvm.internal.l.c(g6);
                Rect rect2 = (Rect) g6;
                int i = rect.top - rect2.top;
                return i == 0 ? rect.bottom - rect2.bottom : i;
            case 1:
                View view3 = (View) obj;
                View view4 = (View) obj2;
                if (view3 == view4) {
                    return 0;
                }
                C2321G c2321g2 = T0.f392d;
                Object g7 = c2321g2.g(view3);
                kotlin.jvm.internal.l.c(g7);
                Rect rect3 = (Rect) g7;
                Object g8 = c2321g2.g(view4);
                kotlin.jvm.internal.l.c(g8);
                Rect rect4 = (Rect) g8;
                int i5 = rect3.left - rect4.left;
                return i5 == 0 ? (rect3.right - rect4.right) * T0.f391c : T0.f391c * i5;
            case 2:
                W3.h hVar = (W3.h) obj;
                W3.h hVar2 = (W3.h) obj2;
                return (((Number) hVar.f6037l).intValue() - ((Number) hVar.f6036k).intValue()) - (((Number) hVar2.f6037l).intValue() - ((Number) hVar2.f6036k).intValue());
            case 3:
                return kotlin.jvm.internal.l.g(((P.S) obj).f4393b, ((P.S) obj2).f4393b);
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i6 = 0; i6 < bArr.length; i6++) {
                    byte b3 = bArr[i6];
                    byte b5 = bArr2[i6];
                    if (b3 != b5) {
                        return b3 - b5;
                    }
                }
                return 0;
            default:
                C2731G c2731g = (C2731G) obj;
                C2731G c2731g2 = (C2731G) obj2;
                float f = c2731g.f21613P.f21663p.f21743N;
                float f5 = c2731g2.f21613P.f21663p.f21743N;
                return f == f5 ? kotlin.jvm.internal.l.g(c2731g.v(), c2731g2.v()) : Float.compare(f, f5);
        }
    }
}
