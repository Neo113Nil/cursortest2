package C;

import android.graphics.Rect;
import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class d0 extends androidx.camera.core.f {

    /* renamed from: d, reason: collision with root package name */
    private final Object f4174d;

    /* renamed from: e, reason: collision with root package name */
    private final L f4175e;

    /* renamed from: f, reason: collision with root package name */
    private final int f4176f;

    /* renamed from: g, reason: collision with root package name */
    private final int f4177g;

    public d0(@NonNull androidx.camera.core.p pVar, Size size, @NonNull L l11) {
        super(pVar);
        this.f4174d = new Object();
        if (size == null) {
            this.f4176f = this.f38083b.getWidth();
            this.f4177g = this.f38083b.getHeight();
        } else {
            this.f4176f = size.getWidth();
            this.f4177g = size.getHeight();
        }
        this.f4175e = l11;
    }

    public final void d(Rect rect) {
        if (rect != null) {
            Rect rect2 = new Rect(rect);
            if (!rect2.intersect(0, 0, this.f4176f, this.f4177g)) {
                rect2.setEmpty();
            }
        }
        synchronized (this.f4174d) {
        }
    }

    @Override // androidx.camera.core.f, androidx.camera.core.p
    public final int getHeight() {
        return this.f4177g;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.p
    public final int getWidth() {
        return this.f4176f;
    }

    @Override // androidx.camera.core.f, androidx.camera.core.p
    @NonNull
    public final L x0() {
        return this.f4175e;
    }
}
