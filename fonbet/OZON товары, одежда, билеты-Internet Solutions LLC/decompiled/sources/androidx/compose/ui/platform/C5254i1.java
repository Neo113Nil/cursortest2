package androidx.compose.ui.platform;

import android.graphics.Matrix;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.C7783A;
import l1.C7837o0;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.compose.ui.platform.i1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5254i1<T> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final AbstractC7737t f40886a;

    /* renamed from: b, reason: collision with root package name */
    private Matrix f40887b;

    /* renamed from: c, reason: collision with root package name */
    private Matrix f40888c;

    /* renamed from: d, reason: collision with root package name */
    private float[] f40889d;

    /* renamed from: e, reason: collision with root package name */
    private float[] f40890e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f40891f = true;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40892g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f40893h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public C5254i1(@NotNull Function2<? super T, ? super Matrix, Unit> function2) {
        this.f40886a = (AbstractC7737t) function2;
    }

    public final float[] a(T t2) {
        float[] fArr = this.f40890e;
        if (fArr == null) {
            fArr = C7837o0.b();
            this.f40890e = fArr;
        }
        if (this.f40892g) {
            this.f40893h = C5248g1.a(b(t2), fArr);
            this.f40892g = false;
        }
        if (this.f40893h) {
            return fArr;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
    @NotNull
    public final float[] b(T t2) {
        float[] fArr = this.f40889d;
        if (fArr == null) {
            fArr = C7837o0.b();
            this.f40889d = fArr;
        }
        if (!this.f40891f) {
            return fArr;
        }
        Matrix matrix = this.f40887b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f40887b = matrix;
        }
        this.f40886a.invoke(t2, matrix);
        Matrix matrix2 = this.f40888c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            C7783A.b(matrix, fArr);
            this.f40887b = matrix2;
            this.f40888c = matrix;
        }
        this.f40891f = false;
        return fArr;
    }

    public final void c() {
        this.f40891f = true;
        this.f40892g = true;
    }
}
