package com.paypal.oslo.core.commonui.components;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002 !B\u001f\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter;", "Landroidx/compose/ui/graphics/painter/Painter;", "Landroidx/compose/runtime/RememberObserver;", "Lcoil3/compose/AsyncImagePainter;", "initialDelegate", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "stateFlow", "<init>", "(Lcoil3/compose/AsyncImagePainter;Lkotlinx/coroutines/flow/StateFlow;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "", "onDraw", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", "onRemembered", "()V", "onForgotten", "onAbandoned", "newDelegate", "updateDelegate$common_ui_release", "(Lcoil3/compose/AsyncImagePainter;)V", "getHighSpeedVideoSizes", "Lcoil3/compose/AsyncImagePainter;", "Camera2StreamConfigurationMap", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "Landroidx/compose/ui/geometry/Size;", "getIntrinsicSize-NH-jbRc", "()J", "intrinsicSize", "ErrorResult", "State"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AsyncImagePainter extends androidx.compose.ui.graphics.painter.Painter implements androidx.compose.runtime.RememberObserver {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private coil3.compose.AsyncImagePainter Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.commonui.components.AsyncImagePainter.State> state;

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncImagePainter(coil3.compose.AsyncImagePainter asyncImagePainter, kotlinx.coroutines.flow.StateFlow<? extends com.paypal.oslo.core.commonui.components.AsyncImagePainter.State> stateFlow) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asyncImagePainter, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stateFlow, "");
        this.Camera2StreamConfigurationMap = asyncImagePainter;
        this.state = stateFlow;
    }

    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.commonui.components.AsyncImagePainter.State> getState() {
        return this.state;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public final long getIntrinsicSize() {
        return this.Camera2StreamConfigurationMap.getIntrinsicSize();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public final void onDraw(androidx.compose.ui.graphics.drawscope.DrawScope drawScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawScope, "");
        androidx.compose.ui.graphics.painter.Painter.m6651drawx_KDEd0$default(this.Camera2StreamConfigurationMap, drawScope, drawScope.mo6531getSizeNHjbRc(), 0.0f, null, 6, null);
    }

    public final void updateDelegate$common_ui_release(coil3.compose.AsyncImagePainter newDelegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newDelegate, "");
        this.Camera2StreamConfigurationMap = newDelegate;
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;", "", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/Throwable;)V", "component1", "()Ljava/lang/Throwable;", "copy", "(Ljava/lang/Throwable;)Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Throwable;", "getThrowable"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ErrorResult {
        public static final int $stable = 8;
        private final java.lang.Throwable throwable;

        public ErrorResult(java.lang.Throwable th) {
            this.throwable = th;
        }

        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public final java.lang.String toString() {
            java.lang.Throwable th = this.throwable;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorResult(throwable=");
            sb.append(th);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            java.lang.Throwable th = this.throwable;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, ((com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult) other).throwable);
        }

        public final com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult copy(java.lang.Throwable throwable) {
            return new com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult(throwable);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.Throwable getThrowable() {
            return this.throwable;
        }

        public static /* synthetic */ com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult copy$default(com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult errorResult, java.lang.Throwable th, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                th = errorResult.throwable;
            }
            return errorResult.copy(th);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "", "<init>", "()V", "Empty", "Loading", "Success", "Error", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Empty;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Error;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Loading;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Success;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class State {
        public static final int $stable = 0;

        private State() {
        }

        @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Empty;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Empty extends com.paypal.oslo.core.commonui.components.AsyncImagePainter.State {
            public static final int $stable = 0;
            public static final com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Empty INSTANCE = new com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Empty();

            public final int hashCode() {
                return -849764593;
            }

            private Empty() {
                super(null);
            }

            public final java.lang.String toString() {
                return "Empty";
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Empty)) {
                    return false;
                }
                return true;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Loading;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;)Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Loading;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Loading extends com.paypal.oslo.core.commonui.components.AsyncImagePainter.State {
            public static final int $stable = androidx.compose.ui.graphics.painter.Painter.$stable;
            private final androidx.compose.ui.graphics.painter.Painter painter;

            public Loading(androidx.compose.ui.graphics.painter.Painter painter) {
                super(null);
                this.painter = painter;
            }

            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public final java.lang.String toString() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Loading(painter=");
                sb.append(painter);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                if (painter == null) {
                    return 0;
                }
                return painter.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading) && kotlin.jvm.internal.Intrinsics.areEqual(this.painter, ((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading) other).painter);
            }

            public final com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading copy(androidx.compose.ui.graphics.painter.Painter painter) {
                return new com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading(painter);
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public static /* synthetic */ com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading copy$default(com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Loading loading, androidx.compose.ui.graphics.painter.Painter painter, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    painter = loading.painter;
                }
                return loading.copy(painter);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Success;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;)Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Success;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Success extends com.paypal.oslo.core.commonui.components.AsyncImagePainter.State {
            public static final int $stable = androidx.compose.ui.graphics.painter.Painter.$stable;
            private final androidx.compose.ui.graphics.painter.Painter painter;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(androidx.compose.ui.graphics.painter.Painter painter) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
                this.painter = painter;
            }

            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public final java.lang.String toString() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Success(painter=");
                sb.append(painter);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                return this.painter.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) && kotlin.jvm.internal.Intrinsics.areEqual(this.painter, ((com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success) other).painter);
            }

            public final com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success copy(androidx.compose.ui.graphics.painter.Painter painter) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(painter, "");
                return new com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success(painter);
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public static /* synthetic */ com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success copy$default(com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Success success, androidx.compose.ui.graphics.painter.Painter painter, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    painter = success.painter;
                }
                return success.copy(painter);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Error;", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State;", "Landroidx/compose/ui/graphics/painter/Painter;", com.google.android.libraries.places.api.model.PlaceTypes.PAINTER, "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;", "result", "<init>", "(Landroidx/compose/ui/graphics/painter/Painter;Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "(Landroidx/compose/ui/graphics/painter/Painter;Ljava/lang/Throwable;)V", "component1", "()Landroidx/compose/ui/graphics/painter/Painter;", "component2", "()Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;", "copy", "(Landroidx/compose/ui/graphics/painter/Painter;Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;)Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$State$Error;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/ui/graphics/painter/Painter;", "getPainter", "Lcom/paypal/oslo/core/commonui/components/AsyncImagePainter$ErrorResult;", "getResult", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Error extends com.paypal.oslo.core.commonui.components.AsyncImagePainter.State {
            public static final int $stable = 8;
            private final androidx.compose.ui.graphics.painter.Painter painter;
            private final com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(androidx.compose.ui.graphics.painter.Painter painter, com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult errorResult) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorResult, "");
                this.painter = painter;
                this.result = errorResult;
            }

            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public final com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult getResult() {
                return this.result;
            }

            public final java.lang.Throwable getThrowable() {
                return this.result.getThrowable();
            }

            public Error(androidx.compose.ui.graphics.painter.Painter painter, java.lang.Throwable th) {
                this(painter, new com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult(th));
            }

            public final java.lang.String toString() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult errorResult = this.result;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Error(painter=");
                sb.append(painter);
                sb.append(", result=");
                sb.append(errorResult);
                sb.append(")");
                return sb.toString();
            }

            public final int hashCode() {
                androidx.compose.ui.graphics.painter.Painter painter = this.painter;
                return ((painter == null ? 0 : painter.hashCode()) * 31) + this.result.hashCode();
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error)) {
                    return false;
                }
                com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error error = (com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.painter, error.painter) && kotlin.jvm.internal.Intrinsics.areEqual(this.result, error.result);
            }

            public final com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error copy(androidx.compose.ui.graphics.painter.Painter painter, com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                return new com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error(painter, result);
            }

            /* renamed from: component2, reason: from getter */
            public final com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult getResult() {
                return this.result;
            }

            /* renamed from: component1, reason: from getter */
            public final androidx.compose.ui.graphics.painter.Painter getPainter() {
                return this.painter;
            }

            public static /* synthetic */ com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error copy$default(com.paypal.oslo.core.commonui.components.AsyncImagePainter.State.Error error, androidx.compose.ui.graphics.painter.Painter painter, com.paypal.oslo.core.commonui.components.AsyncImagePainter.ErrorResult errorResult, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    painter = error.painter;
                }
                if ((i & 2) != 0) {
                    errorResult = error.result;
                }
                return error.copy(painter, errorResult);
            }
        }

        public /* synthetic */ State(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
