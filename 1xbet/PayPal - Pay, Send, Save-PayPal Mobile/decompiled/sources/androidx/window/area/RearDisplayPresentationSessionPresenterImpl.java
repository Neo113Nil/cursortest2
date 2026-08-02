package androidx.window.area;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Landroidx/window/area/RearDisplayPresentationSessionPresenterImpl;", "Landroidx/window/area/WindowAreaSessionPresenter;", "windowAreaComponent", "Landroidx/window/extensions/area/WindowAreaComponent;", "presentation", "Landroidx/window/extensions/area/ExtensionWindowAreaPresentation;", "vendorApiLevel", "", "<init>", "(Landroidx/window/extensions/area/WindowAreaComponent;Landroidx/window/extensions/area/ExtensionWindowAreaPresentation;I)V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", com.datadog.android.sessionreplay.internal.recorder.mapper.DecorViewMapper.WINDOW_KEY_NAME, "Landroid/view/Window;", "getWindow", "()Landroid/view/Window;", "setContentView", "", "view", "Landroid/view/View;", "close", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RearDisplayPresentationSessionPresenterImpl implements androidx.window.area.WindowAreaSessionPresenter {
    private final android.content.Context Camera2StreamConfigurationMap;
    private final android.view.Window getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.window.extensions.area.WindowAreaComponent getHighSpeedVideoFpsRangesFor;
    private final androidx.window.extensions.area.ExtensionWindowAreaPresentation getHighSpeedVideoSizes;

    public RearDisplayPresentationSessionPresenterImpl(androidx.window.extensions.area.WindowAreaComponent windowAreaComponent, androidx.window.extensions.area.ExtensionWindowAreaPresentation extensionWindowAreaPresentation, int i) {
        android.view.Window windowBeforeVendorApiLevel4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(windowAreaComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extensionWindowAreaPresentation, "");
        this.getHighSpeedVideoFpsRangesFor = windowAreaComponent;
        this.getHighSpeedVideoSizes = extensionWindowAreaPresentation;
        android.content.Context presentationContext = extensionWindowAreaPresentation.getPresentationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(presentationContext, "");
        this.Camera2StreamConfigurationMap = presentationContext;
        if (i >= 4) {
            windowBeforeVendorApiLevel4 = extensionWindowAreaPresentation.getWindow();
        } else {
            windowBeforeVendorApiLevel4 = androidx.window.area.utils.PresentationWindowCompatUtils.INSTANCE.getWindowBeforeVendorApiLevel4(extensionWindowAreaPresentation);
        }
        this.getHighResolutionOutputSizeshNQ4ISI = windowBeforeVendorApiLevel4;
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    /* renamed from: getContext, reason: from getter */
    public final android.content.Context getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    /* renamed from: getWindow, reason: from getter */
    public final android.view.Window getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // androidx.window.area.WindowAreaSessionPresenter
    public final void setContentView(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "");
        this.getHighSpeedVideoSizes.setPresentationView(view);
    }

    @Override // androidx.window.area.WindowAreaSession
    public final void close() {
        this.getHighSpeedVideoFpsRangesFor.endRearDisplayPresentationSession();
    }
}
