package L1;

import B0.C2454a;
import android.text.Layout;
import android.text.TextUtils;
import java.text.Bidi;
import java.util.ArrayList;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class B {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Layout f16133a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ArrayList f16134b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ArrayList f16135c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final boolean[] f16136d;

    /* renamed from: e, reason: collision with root package name */
    private char[] f16137e;

    /* loaded from: classes8.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f16138a;

        /* renamed from: b, reason: collision with root package name */
        private final int f16139b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f16140c;

        public a(int i11, int i12, boolean z11) {
            this.f16138a = i11;
            this.f16139b = i12;
            this.f16140c = z11;
        }

        public final int a() {
            return this.f16139b;
        }

        public final int b() {
            return this.f16138a;
        }

        public final boolean c() {
            return this.f16140c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f16138a == aVar.f16138a && this.f16139b == aVar.f16139b && this.f16140c == aVar.f16140c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16140c) + C2454a.a(this.f16139b, Integer.hashCode(this.f16138a) * 31, 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BidiRun(start=");
            sb2.append(this.f16138a);
            sb2.append(", end=");
            sb2.append(this.f16139b);
            sb2.append(", isRtl=");
            return B4.V.d(sb2, this.f16140c, ')');
        }
    }

    public B(@NotNull Layout layout) {
        this.f16133a = layout;
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            int I11 = kotlin.text.h.I('\n', i11, 4, this.f16133a.getText());
            i11 = I11 < 0 ? this.f16133a.getText().length() : I11 + 1;
            arrayList.add(Integer.valueOf(i11));
        } while (i11 < this.f16133a.getText().length());
        this.f16134b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList2.add(null);
        }
        this.f16135c = arrayList2;
        this.f16136d = new boolean[this.f16134b.size()];
        this.f16134b.size();
    }

    private final float b(int i11, boolean z11) {
        Layout layout = this.f16133a;
        int lineEnd = layout.getLineEnd(layout.getLineForOffset(i11));
        if (i11 > lineEnd) {
            i11 = lineEnd;
        }
        return z11 ? layout.getPrimaryHorizontal(i11) : layout.getSecondaryHorizontal(i11);
    }

    private final int h(int i11, int i12) {
        while (i11 > i12) {
            char charAt = this.f16133a.getText().charAt(i11 - 1);
            if (charAt != ' ' && charAt != '\n' && charAt != 5760 && ((Intrinsics.i(charAt, 8192) < 0 || Intrinsics.i(charAt, 8202) > 0 || charAt == 8199) && charAt != 8287 && charAt != 12288)) {
                return i11;
            }
            i11--;
        }
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006a, code lost:
    
        if (r5.getRunCount() == 1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Bidi a(int i11) {
        Bidi bidi;
        boolean[] zArr = this.f16136d;
        boolean z11 = zArr[i11];
        ArrayList arrayList = this.f16135c;
        if (z11) {
            return (Bidi) arrayList.get(i11);
        }
        ArrayList arrayList2 = this.f16134b;
        int intValue = i11 == 0 ? 0 : ((Number) arrayList2.get(i11 - 1)).intValue();
        int intValue2 = ((Number) arrayList2.get(i11)).intValue();
        int i12 = intValue2 - intValue;
        char[] cArr = this.f16137e;
        if (cArr == null || cArr.length < i12) {
            cArr = new char[i12];
        }
        char[] cArr2 = cArr;
        Layout layout = this.f16133a;
        TextUtils.getChars(layout.getText(), intValue, intValue2, cArr2, 0);
        if (Bidi.requiresBidi(cArr2, 0, i12)) {
            bidi = new Bidi(cArr2, 0, null, 0, i12, layout.getParagraphDirection(layout.getLineForOffset(g(i11))) == -1 ? 1 : 0);
        }
        bidi = null;
        arrayList.set(i11, bidi);
        zArr[i11] = true;
        if (bidi != null) {
            char[] cArr3 = this.f16137e;
            cArr2 = cArr2 == cArr3 ? null : cArr3;
        }
        this.f16137e = cArr2;
        return bidi;
    }

    public final float c(int i11, boolean z11, boolean z12) {
        int i12;
        int i13;
        int i14 = i11;
        if (!z12) {
            return b(i11, z11);
        }
        Layout layout = this.f16133a;
        int a11 = A.a(layout, i14, z12);
        int lineStart = layout.getLineStart(a11);
        int lineEnd = layout.getLineEnd(a11);
        if (i14 != lineStart && i14 != lineEnd) {
            return b(i11, z11);
        }
        if (i14 == 0 || i14 == layout.getText().length()) {
            return b(i11, z11);
        }
        int f7 = f(i14, z12);
        boolean z13 = layout.getParagraphDirection(layout.getLineForOffset(g(f7))) == -1;
        int h11 = h(lineEnd, lineStart);
        int g10 = g(f7);
        int i15 = lineStart - g10;
        int i16 = h11 - g10;
        Bidi a12 = a(f7);
        Bidi createLineBidi = a12 != null ? a12.createLineBidi(i15, i16) : null;
        if (createLineBidi == null || createLineBidi.getRunCount() == 1) {
            boolean isRtlCharAt = layout.isRtlCharAt(lineStart);
            if (z11 || z13 == isRtlCharAt) {
                z13 = !z13;
            }
            return i14 == lineStart ? z13 : !z13 ? layout.getLineLeft(a11) : layout.getLineRight(a11);
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i17 = 0; i17 < runCount; i17++) {
            aVarArr[i17] = new a(createLineBidi.getRunStart(i17) + lineStart, createLineBidi.getRunLimit(i17) + lineStart, createLineBidi.getRunLevel(i17) % 2 == 1);
        }
        int runCount2 = createLineBidi.getRunCount();
        byte[] bArr = new byte[runCount2];
        for (int i18 = 0; i18 < runCount2; i18++) {
            bArr[i18] = (byte) createLineBidi.getRunLevel(i18);
        }
        Bidi.reorderVisually(bArr, 0, aVarArr, 0, runCount);
        if (i14 == lineStart) {
            int i19 = 0;
            while (true) {
                if (i19 >= runCount) {
                    i13 = -1;
                    break;
                }
                if (aVarArr[i19].b() == i14) {
                    i13 = i19;
                    break;
                }
                i19++;
            }
            boolean z14 = (z11 || z13 == aVarArr[i13].c()) ? !z13 : z13;
            if (i13 == 0 && z14) {
                return layout.getLineLeft(a11);
            }
            Intrinsics.checkNotNullParameter(aVarArr, "<this>");
            return (i13 != runCount - 1 || z14) ? z14 ? layout.getPrimaryHorizontal(aVarArr[i13 - 1].b()) : layout.getPrimaryHorizontal(aVarArr[i13 + 1].b()) : layout.getLineRight(a11);
        }
        if (i14 > h11) {
            i14 = h(i14, lineStart);
        }
        int i21 = 0;
        while (true) {
            if (i21 >= runCount) {
                i12 = -1;
                break;
            }
            if (aVarArr[i21].a() == i14) {
                i12 = i21;
                break;
            }
            i21++;
        }
        boolean z15 = (z11 || z13 == aVarArr[i12].c()) ? z13 : !z13;
        if (i12 == 0 && z15) {
            return layout.getLineLeft(a11);
        }
        Intrinsics.checkNotNullParameter(aVarArr, "<this>");
        return (i12 != runCount - 1 || z15) ? z15 ? layout.getPrimaryHorizontal(aVarArr[i12 - 1].a()) : layout.getPrimaryHorizontal(aVarArr[i12 + 1].a()) : layout.getLineRight(a11);
    }

    @NotNull
    public final a[] d(int i11) {
        Bidi createLineBidi;
        Layout layout = this.f16133a;
        int lineStart = layout.getLineStart(i11);
        int lineEnd = layout.getLineEnd(i11);
        int f7 = f(lineStart, false);
        int g10 = g(f7);
        int i12 = lineStart - g10;
        int i13 = lineEnd - g10;
        Bidi a11 = a(f7);
        if (a11 == null || (createLineBidi = a11.createLineBidi(i12, i13)) == null) {
            return new a[]{new a(lineStart, lineEnd, layout.isRtlCharAt(lineStart))};
        }
        int runCount = createLineBidi.getRunCount();
        a[] aVarArr = new a[runCount];
        for (int i14 = 0; i14 < runCount; i14++) {
            int runStart = createLineBidi.getRunStart(i14) + lineStart;
            int runLimit = createLineBidi.getRunLimit(i14) + lineStart;
            boolean z11 = true;
            if (createLineBidi.getRunLevel(i14) % 2 != 1) {
                z11 = false;
            }
            aVarArr[i14] = new a(runStart, runLimit, z11);
        }
        return aVarArr;
    }

    public final int e(int i11) {
        Layout layout = this.f16133a;
        return h(layout.getLineEnd(i11), layout.getLineStart(i11));
    }

    public final int f(int i11, boolean z11) {
        ArrayList arrayList = this.f16134b;
        int a11 = C7714v.a(arrayList, Integer.valueOf(i11));
        int i12 = a11 < 0 ? -(a11 + 1) : a11 + 1;
        if (z11 && i12 > 0) {
            int i13 = i12 - 1;
            if (i11 == ((Number) arrayList.get(i13)).intValue()) {
                return i13;
            }
        }
        return i12;
    }

    public final int g(int i11) {
        if (i11 == 0) {
            return 0;
        }
        return ((Number) this.f16134b.get(i11 - 1)).intValue();
    }
}
