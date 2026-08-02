package L1;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class T {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final CharSequence f16150a;

    /* renamed from: b, reason: collision with root package name */
    private final int f16151b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final S1.f f16152c;

    /* renamed from: d, reason: collision with root package name */
    private final int f16153d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final TextDirectionHeuristic f16154e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final Layout.Alignment f16155f;

    /* renamed from: g, reason: collision with root package name */
    private final int f16156g;

    /* renamed from: h, reason: collision with root package name */
    private final TextUtils.TruncateAt f16157h;

    /* renamed from: i, reason: collision with root package name */
    private final int f16158i;

    /* renamed from: j, reason: collision with root package name */
    private final int f16159j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f16160k;

    /* renamed from: l, reason: collision with root package name */
    private final boolean f16161l;

    /* renamed from: m, reason: collision with root package name */
    private final int f16162m;

    /* renamed from: n, reason: collision with root package name */
    private final int f16163n;

    /* renamed from: o, reason: collision with root package name */
    private final int f16164o;

    /* renamed from: p, reason: collision with root package name */
    private final int f16165p;

    public T(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, @NotNull S1.f fVar, @NotNull Layout.Alignment alignment, @NotNull TextDirectionHeuristic textDirectionHeuristic, TextUtils.TruncateAt truncateAt, @NotNull CharSequence charSequence, boolean z11, boolean z12) {
        this.f16150a = charSequence;
        this.f16151b = i11;
        this.f16152c = fVar;
        this.f16153d = i12;
        this.f16154e = textDirectionHeuristic;
        this.f16155f = alignment;
        this.f16156g = i13;
        this.f16157h = truncateAt;
        this.f16158i = i14;
        this.f16159j = i15;
        this.f16160k = z11;
        this.f16161l = z12;
        this.f16162m = i16;
        this.f16163n = i17;
        this.f16164o = i18;
        this.f16165p = i19;
        if (i11 < 0) {
            throw new IllegalArgumentException("invalid start value");
        }
        int length = charSequence.length();
        if (i11 < 0 || i11 > length) {
            throw new IllegalArgumentException("invalid end value");
        }
        if (i13 < 0) {
            throw new IllegalArgumentException("invalid maxLines value");
        }
        if (i12 < 0) {
            throw new IllegalArgumentException("invalid width value");
        }
        if (i14 < 0) {
            throw new IllegalArgumentException("invalid ellipsizedWidth value");
        }
    }

    @NotNull
    public final Layout.Alignment a() {
        return this.f16155f;
    }

    public final int b() {
        return this.f16162m;
    }

    public final TextUtils.TruncateAt c() {
        return this.f16157h;
    }

    public final int d() {
        return this.f16158i;
    }

    public final int e() {
        return this.f16151b;
    }

    public final int f() {
        return this.f16165p;
    }

    public final boolean g() {
        return this.f16160k;
    }

    public final int h() {
        return this.f16159j;
    }

    public final int i() {
        return this.f16163n;
    }

    public final int j() {
        return this.f16164o;
    }

    public final int k() {
        return this.f16156g;
    }

    @NotNull
    public final TextPaint l() {
        return this.f16152c;
    }

    @NotNull
    public final CharSequence m() {
        return this.f16150a;
    }

    @NotNull
    public final TextDirectionHeuristic n() {
        return this.f16154e;
    }

    public final boolean o() {
        return this.f16161l;
    }

    public final int p() {
        return this.f16153d;
    }
}
