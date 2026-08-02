package Md;

import Md.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class e extends b.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.c f17895b;

    e(b.c cVar) {
        this.f17895b = cVar;
    }

    @Override // Md.b.a
    protected final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1.visitEnd must not be null");
        }
        b.this.f17888h = strArr;
    }
}
