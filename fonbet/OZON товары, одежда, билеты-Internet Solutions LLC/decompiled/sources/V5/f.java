package V5;

import X5.a;
import androidx.annotation.NonNull;
import java.io.File;

/* loaded from: classes.dex */
final class f<DataType> implements a.InterfaceC0604a {

    /* renamed from: a, reason: collision with root package name */
    private final T5.d<DataType> f28135a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f28136b;

    /* renamed from: c, reason: collision with root package name */
    private final T5.i f28137c;

    f(T5.d<DataType> dVar, DataType datatype, T5.i iVar) {
        this.f28135a = dVar;
        this.f28136b = datatype;
        this.f28137c = iVar;
    }

    @Override // X5.a.InterfaceC0604a
    public final boolean a(@NonNull File file) {
        return this.f28135a.a(this.f28136b, file, this.f28137c);
    }
}
