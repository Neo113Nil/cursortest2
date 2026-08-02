package io.reactivex.disposables;

/* loaded from: classes17.dex */
final class ActionDisposable extends io.reactivex.disposables.ReferenceDisposable<io.reactivex.functions.Action> {
    private static final long serialVersionUID = -8219729196779211169L;

    @Override // io.reactivex.disposables.ReferenceDisposable
    protected final /* synthetic */ void getHighSpeedVideoSizes(io.reactivex.functions.Action action) {
        try {
            action.run();
        } catch (java.lang.Throwable th) {
            throw io.reactivex.internal.util.ExceptionHelper.wrapOrThrow(th);
        }
    }

    ActionDisposable(io.reactivex.functions.Action action) {
        super(action);
    }
}
