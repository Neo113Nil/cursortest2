package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n"}, d2 = {"Lcoil3/compose/AsyncImagePainter$State;", "previous", "current", "Landroidx/compose/ui/layout/ContentScale;", "contentScale", "Lcoil3/compose/CrossfadePainter;", "maybeNewCrossfadePainter", "(Lcoil3/compose/AsyncImagePainter$State;Lcoil3/compose/AsyncImagePainter$State;Landroidx/compose/ui/layout/ContentScale;)Lcoil3/compose/CrossfadePainter;", "Lcoil3/compose/AsyncImagePainter_androidKt$FakeTransitionTarget$1;", "getHighSpeedVideoSizes", "Lcoil3/compose/AsyncImagePainter_androidKt$FakeTransitionTarget$1;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AsyncImagePainter_androidKt {
    private static final coil3.compose.AsyncImagePainter_androidKt$FakeTransitionTarget$1 getHighSpeedVideoSizes = new coil3.transition.TransitionTarget() { // from class: coil3.compose.AsyncImagePainter_androidKt$FakeTransitionTarget$1
        @Override // coil3.transition.TransitionTarget
        public final android.graphics.drawable.Drawable getDrawable() {
            return null;
        }

        @Override // coil3.transition.TransitionTarget
        public final android.view.View getView() {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    public static final coil3.compose.CrossfadePainter maybeNewCrossfadePainter(coil3.compose.AsyncImagePainter.State state, coil3.compose.AsyncImagePainter.State state2, androidx.compose.ui.layout.ContentScale contentScale) {
        coil3.view.ErrorResult result;
        if (!(state2 instanceof coil3.compose.AsyncImagePainter.State.Success)) {
            if (state2 instanceof coil3.compose.AsyncImagePainter.State.Error) {
                result = ((coil3.compose.AsyncImagePainter.State.Error) state2).getResult();
            }
            return null;
        }
        result = ((coil3.compose.AsyncImagePainter.State.Success) state2).getResult();
        coil3.transition.Transition create = coil3.view.ImageRequests_androidKt.getTransitionFactory(result.getRequest()).create(getHighSpeedVideoSizes, result);
        if (create instanceof coil3.transition.CrossfadeTransition) {
            androidx.compose.ui.graphics.painter.Painter painter = state instanceof coil3.compose.AsyncImagePainter.State.Loading ? state.getPainter() : null;
            androidx.compose.ui.graphics.painter.Painter painter2 = state2.getPainter();
            kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
            coil3.transition.CrossfadeTransition crossfadeTransition = (coil3.transition.CrossfadeTransition) create;
            return new coil3.compose.CrossfadePainter(painter, painter2, contentScale, kotlin.time.DurationKt.toDuration(crossfadeTransition.getDurationMillis(), kotlin.time.DurationUnit.MILLISECONDS), null, ((result instanceof coil3.view.SuccessResult) && ((coil3.view.SuccessResult) result).getIsPlaceholderCached()) ? false : true, crossfadeTransition.getPreferExactIntrinsicSize(), coil3.compose.ImageRequestsKt.getPreferEndFirstIntrinsicSize(result.getRequest()), 16, null);
        }
        return null;
    }
}
