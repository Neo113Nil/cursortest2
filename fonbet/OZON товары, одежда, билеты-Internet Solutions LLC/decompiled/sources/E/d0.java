package E;

import C.I;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.AbstractC5111p;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes8.dex */
public abstract class d0 {

    /* renamed from: a, reason: collision with root package name */
    private int f6889a = new L.a().a();

    @NonNull
    public static d0 l(@NonNull Executor executor, I.f fVar, I.g gVar, @NonNull Rect rect, @NonNull Matrix matrix, int i11, int i12, int i13, @NonNull List list) {
        x2.i.a("onDiskCallback and outputFileOptions should be both null or both non-null.", fVar != null);
        x2.i.a("One and only one on-disk or in-memory callback should be present.", !(fVar == null));
        return new C2892h(executor, fVar, gVar, rect, matrix, i11, i12, i13, list);
    }

    final boolean a() {
        G.q.a();
        int i11 = this.f6889a;
        if (i11 <= 0) {
            return false;
        }
        this.f6889a = i11 - 1;
        return true;
    }

    @NonNull
    abstract Executor b();

    abstract int c();

    @NonNull
    abstract Rect d();

    public abstract I.e e();

    abstract int f();

    public abstract I.f g();

    abstract I.g h();

    abstract int i();

    @NonNull
    abstract Matrix j();

    @NonNull
    abstract List<AbstractC5111p> k();
}
