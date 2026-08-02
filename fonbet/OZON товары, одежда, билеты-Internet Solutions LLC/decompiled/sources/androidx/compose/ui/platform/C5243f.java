package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.f, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5243f extends AbstractC5231b {

    /* renamed from: c, reason: collision with root package name */
    private static C5243f f40872c;

    /* renamed from: androidx.compose.ui.platform.f$a */
    public static final class a {
        @NotNull
        public static C5243f a() {
            if (C5243f.f40872c == null) {
                C5243f.f40872c = new C5243f();
            }
            C5243f c5243f = C5243f.f40872c;
            Intrinsics.g(c5243f, "null cannot be cast to non-null type androidx.compose.ui.platform.AccessibilityIterators.ParagraphTextSegmentIterator");
            return c5243f;
        }
    }

    private final boolean h(int i11) {
        if (i11 <= 0 || c().charAt(i11 - 1) == '\n') {
            return false;
        }
        return i11 == c().length() || c().charAt(i11) == '\n';
    }

    @Override // androidx.compose.ui.platform.AbstractC5231b
    public final int[] a(int i11) {
        int length = c().length();
        if (length <= 0 || i11 >= length) {
            return null;
        }
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < length && c().charAt(i11) == '\n' && (c().charAt(i11) == '\n' || (i11 != 0 && c().charAt(i11 - 1) != '\n'))) {
            i11++;
        }
        if (i11 >= length) {
            return null;
        }
        int i12 = i11 + 1;
        while (i12 < length && !h(i12)) {
            i12++;
        }
        return b(i11, i12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return null;
     */
    @Override // androidx.compose.ui.platform.AbstractC5231b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int[] e(int i11) {
        int length = c().length();
        if (length <= 0 || i11 <= 0) {
            return null;
        }
        if (i11 > length) {
            i11 = length;
        }
        while (i11 > 0 && c().charAt(i11 - 1) == '\n' && !h(i11)) {
            i11--;
        }
        int i12 = i11 - 1;
        while (i12 > 0 && (c().charAt(i12) == '\n' || (i12 != 0 && c().charAt(i12 - 1) != '\n'))) {
            i12--;
        }
        return b(i12, i11);
    }
}
