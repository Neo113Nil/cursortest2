package androidx.camera.view.internal;

/* loaded from: classes6.dex */
public class ScreenFlashUiInfo {
    private final androidx.camera.core.ImageCapture.ScreenFlash getHighSpeedVideoFpsRanges;
    private final androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType getHighSpeedVideoFpsRangesFor;

    public enum ProviderType {
        PREVIEW_VIEW,
        SCREEN_FLASH_VIEW
    }

    public ScreenFlashUiInfo(androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType providerType, androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.getHighSpeedVideoFpsRangesFor = providerType;
        this.getHighSpeedVideoFpsRanges = screenFlash;
    }

    public androidx.camera.view.internal.ScreenFlashUiInfo.ProviderType getProviderType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public androidx.camera.core.ImageCapture.ScreenFlash getScreenFlash() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.camera.view.internal.ScreenFlashUiInfo)) {
            return false;
        }
        androidx.camera.view.internal.ScreenFlashUiInfo screenFlashUiInfo = (androidx.camera.view.internal.ScreenFlashUiInfo) obj;
        return this.getHighSpeedVideoFpsRangesFor == screenFlashUiInfo.getHighSpeedVideoFpsRangesFor && java.util.Objects.equals(this.getHighSpeedVideoFpsRanges, screenFlashUiInfo.getHighSpeedVideoFpsRanges);
    }

    public int hashCode() {
        return java.util.Objects.hash(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges);
    }
}
