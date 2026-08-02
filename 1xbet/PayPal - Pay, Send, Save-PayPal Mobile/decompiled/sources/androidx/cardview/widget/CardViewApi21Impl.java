package androidx.cardview.widget;

/* loaded from: classes6.dex */
class CardViewApi21Impl implements androidx.cardview.widget.CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRanges() {
    }

    CardViewApi21Impl() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoSizes(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        cardViewDelegate.getHighSpeedVideoFpsRangesFor(new androidx.cardview.widget.RoundRectDrawable(colorStateList, f));
        android.view.View highSpeedVideoFpsRanges = cardViewDelegate.getHighSpeedVideoFpsRanges();
        highSpeedVideoFpsRanges.setClipToOutline(true);
        highSpeedVideoFpsRanges.setElevation(f2);
        getHighSpeedVideoSizes(cardViewDelegate, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRanges(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        androidx.cardview.widget.RoundRectDrawable highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        if (f != highSpeedVideoSizesFor.Camera2StreamConfigurationMap) {
            highSpeedVideoSizesFor.Camera2StreamConfigurationMap = f;
            highSpeedVideoSizesFor.Camera2StreamConfigurationMap(null);
            highSpeedVideoSizesFor.invalidateSelf();
        }
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoSizes(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        androidx.cardview.widget.RoundRectDrawable highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        boolean highSpeedVideoFpsRangesFor = cardViewDelegate.getHighSpeedVideoFpsRangesFor();
        boolean highResolutionOutputSizeshNQ4ISI = cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI();
        if (f != highSpeedVideoSizesFor.getHighSpeedVideoSizes || highSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor != highSpeedVideoFpsRangesFor || highSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI != highResolutionOutputSizeshNQ4ISI) {
            highSpeedVideoSizesFor.getHighSpeedVideoSizes = f;
            highSpeedVideoSizesFor.getHighSpeedVideoFpsRangesFor = highSpeedVideoFpsRangesFor;
            highSpeedVideoSizesFor.getHighResolutionOutputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI;
            highSpeedVideoSizesFor.Camera2StreamConfigurationMap(null);
            highSpeedVideoSizesFor.invalidateSelf();
        }
        getInputFormats(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getHighSpeedVideoFpsRangesFor(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).getHighSpeedVideoSizes;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getHighSpeedVideoFpsRanges(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getInputSizeshNQ4ISI(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getHighResolutionOutputSizeshNQ4ISI(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getInputSizeshNQ4ISI(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getInputSizeshNQ4ISI(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).Camera2StreamConfigurationMap;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void Camera2StreamConfigurationMap(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        cardViewDelegate.getHighSpeedVideoFpsRanges().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float Camera2StreamConfigurationMap(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.getHighSpeedVideoFpsRanges().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getInputFormats(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.getHighSpeedVideoFpsRangesFor()) {
            cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI(0, 0, 0, 0);
            return;
        }
        float highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(cardViewDelegate);
        float inputSizeshNQ4ISI = getInputSizeshNQ4ISI(cardViewDelegate);
        int ceil = (int) java.lang.Math.ceil(androidx.cardview.widget.RoundRectDrawableWithShadow.getHighSpeedVideoSizes(highSpeedVideoFpsRangesFor, inputSizeshNQ4ISI, cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI()));
        int ceil2 = (int) java.lang.Math.ceil(androidx.cardview.widget.RoundRectDrawableWithShadow.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRangesFor, inputSizeshNQ4ISI, cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI()));
        cardViewDelegate.getHighResolutionOutputSizeshNQ4ISI(ceil, ceil2, ceil, ceil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getOutputMinFrameDuration(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        getHighSpeedVideoSizes(cardViewDelegate, getHighSpeedVideoFpsRangesFor(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getOutputFormats(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        getHighSpeedVideoSizes(cardViewDelegate, getHighSpeedVideoFpsRangesFor(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void getHighSpeedVideoFpsRangesFor(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.res.ColorStateList colorStateList) {
        androidx.cardview.widget.RoundRectDrawable highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(cardViewDelegate);
        highSpeedVideoSizesFor.getHighSpeedVideoSizes(colorStateList);
        highSpeedVideoSizesFor.invalidateSelf();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public android.content.res.ColorStateList getHighSpeedVideoSizes(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getHighSpeedVideoSizesFor(cardViewDelegate).getHighSpeedVideoFpsRanges;
    }

    private androidx.cardview.widget.RoundRectDrawable getHighSpeedVideoSizesFor(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return (androidx.cardview.widget.RoundRectDrawable) cardViewDelegate.Camera2StreamConfigurationMap();
    }
}
