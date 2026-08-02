package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/SubcomposeAsyncImageScope;", "", "Lcoil3/compose/SubcomposeAsyncImageScope;", "delegate", "<init>", "(Lcoil3/compose/SubcomposeAsyncImageScope;)V", "Lcoil3/compose/SubcomposeAsyncImageScope;", "getDelegate$common_ui_release", "()Lcoil3/compose/SubcomposeAsyncImageScope;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SubcomposeAsyncImageScope {
    public static final int $stable = 0;
    private final coil3.compose.SubcomposeAsyncImageScope delegate;

    public SubcomposeAsyncImageScope(coil3.compose.SubcomposeAsyncImageScope subcomposeAsyncImageScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(subcomposeAsyncImageScope, "");
        this.delegate = subcomposeAsyncImageScope;
    }

    /* renamed from: getDelegate$common_ui_release, reason: from getter */
    public final coil3.compose.SubcomposeAsyncImageScope getDelegate() {
        return this.delegate;
    }

    public final androidx.compose.ui.graphics.painter.Painter getPainter() {
        return this.delegate.getPainter();
    }
}
