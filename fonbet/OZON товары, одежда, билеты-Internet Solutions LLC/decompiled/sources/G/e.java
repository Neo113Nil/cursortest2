package G;

import android.util.Size;
import androidx.annotation.NonNull;
import java.util.Comparator;

/* loaded from: classes8.dex */
public final class e implements Comparator<Size> {

    /* renamed from: a, reason: collision with root package name */
    private boolean f9604a;

    public e(boolean z11) {
        this.f9604a = z11;
    }

    @Override // java.util.Comparator
    public final int compare(@NonNull Size size, @NonNull Size size2) {
        Size size3 = size;
        Size size4 = size2;
        int signum = Long.signum((size3.getWidth() * size3.getHeight()) - (size4.getWidth() * size4.getHeight()));
        return this.f9604a ? signum * (-1) : signum;
    }
}
