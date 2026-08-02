package com.airbnb.lottie.model.animatable;

/* loaded from: classes7.dex */
public class AnimatableTextRangeSelector {
    public final com.airbnb.lottie.model.animatable.AnimatableIntegerValue end;
    public final com.airbnb.lottie.model.animatable.AnimatableIntegerValue offset;
    public final com.airbnb.lottie.model.animatable.AnimatableIntegerValue start;
    public final com.airbnb.lottie.model.content.TextRangeUnits units;

    public AnimatableTextRangeSelector(com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue2, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue3, com.airbnb.lottie.model.content.TextRangeUnits textRangeUnits) {
        this.start = animatableIntegerValue;
        this.end = animatableIntegerValue2;
        this.offset = animatableIntegerValue3;
        this.units = textRangeUnits;
    }
}
