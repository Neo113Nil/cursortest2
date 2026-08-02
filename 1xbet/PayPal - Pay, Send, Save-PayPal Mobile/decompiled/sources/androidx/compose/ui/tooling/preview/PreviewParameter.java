package androidx.compose.ui.tooling.preview;

@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u001e\u0012\u0012\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005R\u001d\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u00058\u0007¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Landroidx/compose/ui/tooling/preview/PreviewParameter;", "", "Lkotlin/reflect/KClass;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "provider", "", "limit", "()Ljava/lang/Class;", "()I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public @interface PreviewParameter {
    int limit() default Integer.MAX_VALUE;

    java.lang.Class<? extends androidx.compose.ui.tooling.preview.PreviewParameterProvider<?>> provider();
}
