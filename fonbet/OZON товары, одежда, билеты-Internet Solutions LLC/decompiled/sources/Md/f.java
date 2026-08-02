package Md;

import Md.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class f extends b.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.d f17896b;

    f(b.d dVar) {
        this.f17896b = dVar;
    }

    @Override // Md.b.a
    protected final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1.visitEnd must not be null");
        }
        b.this.f17884d = strArr;
    }
}
