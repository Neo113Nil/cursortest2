package Md;

import Md.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class g extends b.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.d f17897b;

    g(b.d dVar) {
        this.f17897b = dVar;
    }

    @Override // Md.b.a
    protected final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'data' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2.visitEnd must not be null");
        }
        b.this.f17885e = strArr;
    }
}
