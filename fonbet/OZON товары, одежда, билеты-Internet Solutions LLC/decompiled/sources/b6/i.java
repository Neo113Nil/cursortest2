package b6;

import V5.v;
import androidx.annotation.NonNull;
import java.io.File;
import p6.k;

/* loaded from: classes8.dex */
public class i<T> implements v<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final File f55553a;

    public i(@NonNull File file) {
        k.c(file, "Argument must not be null");
        this.f55553a = file;
    }

    @Override // V5.v
    public final void a() {
    }

    @Override // V5.v
    @NonNull
    public final Class<T> b() {
        return (Class<T>) this.f55553a.getClass();
    }

    @Override // V5.v
    @NonNull
    public final T get() {
        return (T) this.f55553a;
    }

    @Override // V5.v
    public final int getSize() {
        return 1;
    }
}
