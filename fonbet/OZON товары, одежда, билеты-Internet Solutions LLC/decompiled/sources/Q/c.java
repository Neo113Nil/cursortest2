package Q;

import android.util.Size;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    public static final c f22733c;

    /* renamed from: a, reason: collision with root package name */
    private Size f22734a;

    /* renamed from: b, reason: collision with root package name */
    private int f22735b;

    static {
        c cVar = new c();
        cVar.f22734a = null;
        cVar.f22735b = 0;
        f22733c = cVar;
    }

    public c(@NonNull Size size, int i11) {
        this.f22734a = size;
        this.f22735b = i11;
    }

    public final Size a() {
        return this.f22734a;
    }

    public final int b() {
        return this.f22735b;
    }
}
