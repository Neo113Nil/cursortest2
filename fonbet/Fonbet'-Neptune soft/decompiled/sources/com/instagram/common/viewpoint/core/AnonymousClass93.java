package com.instagram.common.viewpoint.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.core.view.PointerIconCompat;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.93, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass93 extends C1789oA implements C1S {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    @MetaExoPlayerCustomization("D25277746")
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final SparseArray<Map<C1667mA, C1645lo>> A0E;
    public final SparseBooleanArray A0F;
    public static String[] A0G = {"aGn7PxmzFVI8pseTQREUgmPTmRn3c3Qe", "IWvjCaXZ0UNcR9QsrMbq4cwMoqcNO01w", "zzFjDnJDYUSk81dZD4bwc1a4UEkJCW7c", "AfyHMFnboWczrAj6gDYBkfictlCviIiz", "ZudaxJy5LTgucmpkRl3p1l6eoKWNEQ3P", "dJwbxLQye6WGEEeA8Aa4EZe7IW3A7RwI", "l9ypC7Hglf3jtTkN6zxYkfXofkc9mvwo", "bL7rVgPoAdAWEHuIi5lDma"};
    public static final AnonymousClass93 A0J = new C1653lw().A0p();

    @Deprecated
    public static final AnonymousClass93 A0I = A0J;
    public static final String A0W = AbstractC01424a.A0h(1000);
    public static final String A0Q = AbstractC01424a.A0h(1001);
    public static final String A0R = AbstractC01424a.A0h(1002);
    public static final String A0T = AbstractC01424a.A0h(PointerIconCompat.TYPE_HELP);
    public static final String A0M = AbstractC01424a.A0h(PointerIconCompat.TYPE_WAIT);
    public static final String A0N = AbstractC01424a.A0h(1005);
    public static final String A0K = AbstractC01424a.A0h(PointerIconCompat.TYPE_CELL);
    public static final String A0V = AbstractC01424a.A0h(PointerIconCompat.TYPE_CROSSHAIR);
    public static final String A0b = AbstractC01424a.A0h(PointerIconCompat.TYPE_TEXT);
    public static final String A0O = AbstractC01424a.A0h(PointerIconCompat.TYPE_VERTICAL_TEXT);
    public static final String A0Z = AbstractC01424a.A0h(PointerIconCompat.TYPE_ALIAS);
    public static final String A0a = AbstractC01424a.A0h(PointerIconCompat.TYPE_COPY);
    public static final String A0Y = AbstractC01424a.A0h(PointerIconCompat.TYPE_NO_DROP);
    public static final String A0X = AbstractC01424a.A0h(PointerIconCompat.TYPE_ALL_SCROLL);
    public static final String A0P = AbstractC01424a.A0h(PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW);
    public static final String A0L = AbstractC01424a.A0h(PointerIconCompat.TYPE_VERTICAL_DOUBLE_ARROW);
    public static final String A0S = AbstractC01424a.A0h(PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW);
    public static final String A0U = AbstractC01424a.A0h(PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW);
    public static final C1R<AnonymousClass93> A0H = new C1R() { // from class: com.facebook.ads.redexgen.X.lx
        @Override // com.instagram.common.viewpoint.core.C1R
        public final C1S A6X(Bundle bundle) {
            AnonymousClass93 A0p;
            A0p = new C1653lw(bundle).A0p();
            return A0p;
        }
    };

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0M(SparseArray<Map<C1667mA, C1645lo>> sparseArray, SparseArray<Map<C1667mA, C1645lo>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
            if (indexOfKey < 0 || !A0O(sparseArray.valueAt(i), sparseArray2.valueAt(indexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static boolean A0O(Map<C1667mA, C1645lo> map, Map<C1667mA, C1645lo> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<C1667mA, C1645lo> entry : map.entrySet()) {
            C1667mA key = entry.getKey();
            if (!map2.containsKey(key) || !AbstractC01424a.A1E(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public AnonymousClass93(C1653lw c1653lw) {
        super(c1653lw);
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        SparseArray<Map<C1667mA, C1645lo>> sparseArray;
        SparseBooleanArray sparseBooleanArray;
        boolean z14;
        z = c1653lw.A0C;
        this.A0C = z;
        z2 = c1653lw.A06;
        this.A06 = z2;
        z3 = c1653lw.A07;
        this.A07 = z3;
        z4 = c1653lw.A05;
        this.A05 = z4;
        z5 = c1653lw.A09;
        this.A09 = z5;
        z6 = c1653lw.A02;
        this.A02 = z6;
        z7 = c1653lw.A03;
        this.A03 = z7;
        z8 = c1653lw.A00;
        this.A00 = z8;
        z9 = c1653lw.A01;
        this.A01 = z9;
        z10 = c1653lw.A08;
        this.A08 = z10;
        z11 = c1653lw.A0B;
        this.A0B = z11;
        z12 = c1653lw.A0D;
        this.A0D = z12;
        z13 = c1653lw.A04;
        this.A04 = z13;
        sparseArray = c1653lw.A0E;
        this.A0E = sparseArray;
        sparseBooleanArray = c1653lw.A0F;
        this.A0F = sparseBooleanArray;
        z14 = c1653lw.A0A;
        this.A0A = z14;
    }

    public static AnonymousClass93 A02(Context context) {
        return new C1653lw(context).A0p();
    }

    public static /* synthetic */ String A0B() {
        String str = A0Z;
        String[] strArr = A0G;
        if (strArr[0].charAt(18) == strArr[1].charAt(18)) {
            throw new RuntimeException();
        }
        A0G[2] = "q21ODw35C4tKhNLL23C7ozdatpTCdbhY";
        return str;
    }

    public static /* synthetic */ String A0C() {
        String str = A0a;
        if (A0G[2].charAt(14) == 'E') {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "0vyQVqHCYWPXhQOTbdu3xGlynIqeANBb";
        strArr[6] = "GRyh1cWelO50ilzlDGPvyp85W4uMwhgp";
        return str;
    }

    public static /* synthetic */ String A0H() {
        String str = A0P;
        String[] strArr = A0G;
        if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
            throw new RuntimeException();
        }
        A0G[7] = "pTwWTj5vm";
        return str;
    }

    public static /* synthetic */ String A0J() {
        String str = A0M;
        String[] strArr = A0G;
        if (strArr[3].charAt(2) != strArr[6].charAt(2)) {
            throw new RuntimeException();
        }
        A0G[7] = "PzaI";
        return str;
    }

    public static boolean A0N(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final C1653lw A0P() {
        return new C1653lw(this);
    }

    @Deprecated
    public final C1645lo A0Q(int i, C1667mA c1667mA) {
        Map<C1667mA, C1645lo> map = this.A0E.get(i);
        if (map != null) {
            return map.get(c1667mA);
        }
        return null;
    }

    public final boolean A0R(int i) {
        return this.A0F.get(i);
    }

    @Deprecated
    public final boolean A0S(int i, C1667mA c1667mA) {
        Map<C1667mA, C1645lo> map = this.A0E.get(i);
        return map != null && map.containsKey(c1667mA);
    }

    @Override // com.instagram.common.viewpoint.core.C1789oA
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A0G;
            if (strArr[4].charAt(4) != strArr[5].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[0] = "DcJRbXEfPLE5m3v2P2UTupH85cHshXE1";
            strArr2[1] = "UExlWRKDpxUDxSKj0OTM8Ioa8cI6hcv0";
            if (cls == cls2) {
                AnonymousClass93 anonymousClass93 = (AnonymousClass93) obj;
                if (super.equals(anonymousClass93) && this.A0C == anonymousClass93.A0C && this.A06 == anonymousClass93.A06 && this.A07 == anonymousClass93.A07 && this.A05 == anonymousClass93.A05 && this.A09 == anonymousClass93.A09 && this.A02 == anonymousClass93.A02 && this.A03 == anonymousClass93.A03 && this.A00 == anonymousClass93.A00 && this.A01 == anonymousClass93.A01 && this.A08 == anonymousClass93.A08 && this.A0B == anonymousClass93.A0B && this.A0D == anonymousClass93.A0D && this.A04 == anonymousClass93.A04 && A0N(this.A0F, anonymousClass93.A0F) && A0M(this.A0E, anonymousClass93.A0E)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    @Override // com.instagram.common.viewpoint.core.C1789oA
    public final int hashCode() {
        return (((((((((((((((((((((((((((1 * 31) + super.hashCode()) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A06 ? 1 : 0)) * 31) + (this.A07 ? 1 : 0)) * 31) + (this.A05 ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A03 ? 1 : 0)) * 31) + (this.A00 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A08 ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A04 ? 1 : 0);
    }
}
