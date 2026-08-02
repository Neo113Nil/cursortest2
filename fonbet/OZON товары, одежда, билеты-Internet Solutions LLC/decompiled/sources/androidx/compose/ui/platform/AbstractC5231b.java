package androidx.compose.ui.platform;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC5231b {

    /* renamed from: a, reason: collision with root package name */
    protected String f40816a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final int[] f40817b = new int[2];

    public abstract int[] a(int i11);

    protected final int[] b(int i11, int i12) {
        if (i11 < 0 || i12 < 0 || i11 == i12) {
            return null;
        }
        int[] iArr = this.f40817b;
        iArr[0] = i11;
        iArr[1] = i12;
        return iArr;
    }

    @NotNull
    protected final String c() {
        String str = this.f40816a;
        if (str != null) {
            return str;
        }
        Intrinsics.n("text");
        throw null;
    }

    public void d(@NotNull String str) {
        this.f40816a = str;
    }

    public abstract int[] e(int i11);
}
