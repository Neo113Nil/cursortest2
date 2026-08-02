package androidx.glance;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 176)
@SourceDebugExtension({"SMAP\nComposables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composables.kt\nandroidx/compose/runtime/ComposablesKt$ComposeNode$1\n*L\n1#1,490:1\n*E\n"})
/* loaded from: classes.dex */
public final class GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1<T> extends Lambda implements Function0<T> {
    final /* synthetic */ Function0 $factory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(Function0 function0) {
        super(0);
        this.$factory = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        return (T) this.$factory.invoke();
    }
}
