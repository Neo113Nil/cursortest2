package Md;

import Md.b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class c extends b.a {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ b.C0347b f17893b;

    c(b.C0347b c0347b) {
        this.f17893b = c0347b;
    }

    @Override // Md.b.a
    protected final void f(@NotNull String[] strArr) {
        if (strArr == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'result' of kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1.visitEnd must not be null");
        }
        b.this.f17884d = strArr;
    }
}
