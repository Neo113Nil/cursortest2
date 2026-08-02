package androidx.view;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u000f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0018\u0082\u0001\u0002\u0019\u001a"}, d2 = {"Landroidx/navigationevent/OnBackInvokedInput;", "Landroidx/navigationevent/NavigationEventInput;", "Landroid/window/OnBackInvokedDispatcher;", "p0", "", "p1", "<init>", "(Landroid/window/OnBackInvokedDispatcher;I)V", "", "onRemoved", "()V", "", "hasEnabledHandlers", "onHasEnabledHandlersChanged", "(Z)V", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Landroid/window/OnBackInvokedDispatcher;", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Landroid/window/OnBackInvokedCallback;", "Camera2StreamConfigurationMap", "Landroid/window/OnBackInvokedCallback;", "getHighSpeedVideoFpsRanges", "Z", "Landroidx/navigationevent/OnBackInvokedDefaultInput;", "Landroidx/navigationevent/OnBackInvokedOverlayInput;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class OnBackInvokedInput extends androidx.view.NavigationEventInput {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.window.OnBackInvokedCallback getHighSpeedVideoFpsRanges;
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.window.OnBackInvokedDispatcher getHighSpeedVideoFpsRangesFor;

    private OnBackInvokedInput(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        android.window.OnBackAnimationCallback onBackAnimationCallback;
        this.getHighSpeedVideoFpsRangesFor = onBackInvokedDispatcher;
        this.getHighSpeedVideoSizes = i;
        if (android.os.Build.VERSION.SDK_INT == 33) {
            onBackAnimationCallback = new android.window.OnBackInvokedCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    androidx.view.OnBackInvokedInput.this.dispatchOnBackCompleted();
                }
            };
        } else {
            onBackAnimationCallback = new android.window.OnBackAnimationCallback() { // from class: androidx.navigationevent.OnBackInvokedInput$createOnBackAnimationCallback$1
                @Override // android.window.OnBackAnimationCallback
                public final void onBackStarted(android.window.BackEvent backEvent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
                    androidx.view.OnBackInvokedInput.this.dispatchOnBackStarted(androidx.view.BackEvent.NavigationEvent(backEvent));
                }

                @Override // android.window.OnBackAnimationCallback
                public final void onBackProgressed(android.window.BackEvent backEvent) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(backEvent, "");
                    androidx.view.OnBackInvokedInput.this.dispatchOnBackProgressed(androidx.view.BackEvent.NavigationEvent(backEvent));
                }

                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    androidx.view.OnBackInvokedInput.this.dispatchOnBackCompleted();
                }

                @Override // android.window.OnBackAnimationCallback
                public final void onBackCancelled() {
                    androidx.view.OnBackInvokedInput.this.dispatchOnBackCancelled();
                }
            };
        }
        this.getHighSpeedVideoFpsRanges = onBackAnimationCallback;
    }

    @Override // androidx.view.NavigationEventInput
    protected void onRemoved() {
        getHighResolutionOutputSizeshNQ4ISI(false);
    }

    @Override // androidx.view.NavigationEventInput
    protected void onHasEnabledHandlersChanged(boolean hasEnabledHandlers) {
        getHighResolutionOutputSizeshNQ4ISI(hasEnabledHandlers);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(boolean p0) {
        if (p0 && !this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoFpsRangesFor.registerOnBackInvokedCallback(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        } else {
            if (p0 || !this.getHighResolutionOutputSizeshNQ4ISI) {
                return;
            }
            this.getHighSpeedVideoFpsRangesFor.unregisterOnBackInvokedCallback(this.getHighSpeedVideoFpsRanges);
            this.getHighResolutionOutputSizeshNQ4ISI = false;
        }
    }

    public /* synthetic */ OnBackInvokedInput(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(onBackInvokedDispatcher, i);
    }
}
