package androidx.core.os;

/* loaded from: classes3.dex */
final class LocaleListPlatformWrapper implements androidx.core.os.LocaleListInterface {
    private final android.os.LocaleList getHighSpeedVideoSizes;

    LocaleListPlatformWrapper(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = (android.os.LocaleList) obj;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.util.Locale getHighSpeedVideoFpsRanges(int i) {
        return this.getHighSpeedVideoSizes.get(i);
    }

    @Override // androidx.core.os.LocaleListInterface
    public final boolean getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes.isEmpty();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes.size();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final int Camera2StreamConfigurationMap(java.util.Locale locale) {
        return this.getHighSpeedVideoSizes.indexOf(locale);
    }

    public final boolean equals(java.lang.Object obj) {
        return this.getHighSpeedVideoSizes.equals(((androidx.core.os.LocaleListInterface) obj).getHighResolutionOutputSizeshNQ4ISI());
    }

    public final int hashCode() {
        return this.getHighSpeedVideoSizes.hashCode();
    }

    public final java.lang.String toString() {
        return this.getHighSpeedVideoSizes.toString();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.lang.String getHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoSizes.toLanguageTags();
    }

    @Override // androidx.core.os.LocaleListInterface
    public final java.util.Locale getHighSpeedVideoFpsRangesFor(java.lang.String[] strArr) {
        return this.getHighSpeedVideoSizes.getFirstMatch(strArr);
    }
}
