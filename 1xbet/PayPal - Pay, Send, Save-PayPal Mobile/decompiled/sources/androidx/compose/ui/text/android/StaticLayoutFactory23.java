package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/compose/ui/text/android/StaticLayoutFactory23;", "Landroidx/compose/ui/text/android/StaticLayoutFactoryImpl;", "<init>", "()V", "Landroidx/compose/ui/text/android/StaticLayoutParams;", "p0", "Landroid/text/StaticLayout;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/ui/text/android/StaticLayoutParams;)Landroid/text/StaticLayout;", "", "p1", "getHighResolutionOutputSizeshNQ4ISI", "(Landroid/text/StaticLayout;Z)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class StaticLayoutFactory23 implements androidx.compose.ui.text.android.StaticLayoutFactoryImpl {
    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final android.text.StaticLayout getHighSpeedVideoFpsRangesFor(androidx.compose.ui.text.android.StaticLayoutParams p0) {
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(p0.getGetHighResolutionOutputSizeshNQ4ISI(), p0.getGetHighSpeedVideoFpsRangesFor(), p0.getGetHighSpeedVideoSizes(), p0.getCamera2StreamConfigurationMap(), p0.getGetHighSpeedVideoFpsRanges());
        obtain.setTextDirection(p0.getGetOutputFormats());
        obtain.setAlignment(p0.getGetOutputMinFrameDuration());
        obtain.setMaxLines(p0.getGetInputFormats());
        obtain.setEllipsize(p0.getGetHighSpeedVideoSizesFor());
        obtain.setEllipsizedWidth(p0.getGetInputSizeshNQ4ISI());
        obtain.setLineSpacing(p0.getGetOutputStallDuration(), p0.getGetOutputStallDurationlomOqCM());
        obtain.setIncludePad(p0.getGetOutputSizes());
        obtain.setBreakStrategy(p0.getGetValidOutputFormatsForInputhNQ4ISI());
        obtain.setHyphenationFrequency(p0.getUnwrapAs());
        obtain.setIndents(p0.getToString(), p0.getArtificialStackFrames());
        androidx.compose.ui.text.android.StaticLayoutFactory26.getHighSpeedVideoSizes(obtain, p0.getGetOutputSizeshNQ4ISI());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.compose.ui.text.android.StaticLayoutFactory28.getHighSpeedVideoFpsRangesFor(obtain, p0.getGetOutputMinFrameDurationlomOqCM());
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.compose.ui.text.android.StaticLayoutFactory33.getHighResolutionOutputSizeshNQ4ISI(obtain, p0.getIsOutputSupportedForhNQ4ISI(), p0.getIsOutputSupportedFor());
        }
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            androidx.compose.ui.text.android.StaticLayoutFactory35.Camera2StreamConfigurationMap(obtain);
        }
        return obtain.build();
    }

    @Override // androidx.compose.ui.text.android.StaticLayoutFactoryImpl
    public final boolean getHighResolutionOutputSizeshNQ4ISI(android.text.StaticLayout p0, boolean p1) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.compose.ui.text.android.StaticLayoutFactory33.getHighSpeedVideoSizes(p0);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return p1;
        }
        return false;
    }
}
