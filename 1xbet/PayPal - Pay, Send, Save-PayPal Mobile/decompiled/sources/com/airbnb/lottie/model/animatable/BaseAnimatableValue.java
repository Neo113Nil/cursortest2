package com.airbnb.lottie.model.animatable;

/* loaded from: classes7.dex */
abstract class BaseAnimatableValue<V, O> implements com.airbnb.lottie.model.animatable.AnimatableValue<V, O> {
    final java.util.List<com.airbnb.lottie.value.Keyframe<V>> getHighResolutionOutputSizeshNQ4ISI;

    BaseAnimatableValue(V v) {
        this(java.util.Collections.singletonList(new com.airbnb.lottie.value.Keyframe(v)));
    }

    BaseAnimatableValue(java.util.List<com.airbnb.lottie.value.Keyframe<V>> list) {
        this.getHighResolutionOutputSizeshNQ4ISI = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public java.util.List<com.airbnb.lottie.value.Keyframe<V>> getKeyframes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isEmpty() || (this.getHighResolutionOutputSizeshNQ4ISI.size() == 1 && this.getHighResolutionOutputSizeshNQ4ISI.get(0).isStatic());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            sb.append("values=");
            sb.append(java.util.Arrays.toString(this.getHighResolutionOutputSizeshNQ4ISI.toArray()));
        }
        return sb.toString();
    }
}
