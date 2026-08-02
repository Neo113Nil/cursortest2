package D1;

import D1.H;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: D1.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2792b0 {

    /* renamed from: D1.b0$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5421a;

        static {
            int[] iArr = new int[H.d.values().length];
            try {
                iArr[H.d.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[H.d.LookaheadLayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[H.d.Measuring.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[H.d.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[H.d.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f5421a = iArr;
        }
    }

    @NotNull
    public static final ArrayList a(@NotNull B1.Y y11) {
        Intrinsics.g(y11, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        H B02 = ((InterfaceC2790a0) y11).B0();
        boolean b11 = b(B02);
        List<H> G11 = B02.G();
        ArrayList arrayList = new ArrayList(G11.size());
        int size = G11.size();
        for (int i11 = 0; i11 < size; i11++) {
            H h11 = G11.get(i11);
            arrayList.add(b11 ? h11.y() : h11.z());
        }
        return arrayList;
    }

    private static final boolean b(H h11) {
        int i11 = a.f5421a[h11.Q().ordinal()];
        if (i11 == 1 || i11 == 2) {
            return true;
        }
        if (i11 == 3 || i11 == 4) {
            return false;
        }
        if (i11 != 5) {
            throw new Sc.o();
        }
        H g02 = h11.g0();
        if (g02 != null) {
            return b(g02);
        }
        throw new IllegalArgumentException("no parent for idle node");
    }
}
