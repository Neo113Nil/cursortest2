package org.bouncycastle.jcajce.spec;

/* loaded from: classes17.dex */
public class CompositeAlgorithmSpec implements java.security.spec.AlgorithmParameterSpec {
    private final java.util.List<java.security.spec.AlgorithmParameterSpec> getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

    public static class Builder {
        private java.util.List<java.lang.String> getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        private java.util.List<java.security.spec.AlgorithmParameterSpec> getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();

        public org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec build() {
            if (this.getHighSpeedVideoFpsRanges.isEmpty()) {
                throw new java.lang.IllegalStateException("cannot call build with no algorithm names added");
            }
            return new org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec(this);
        }

        public org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec.Builder add(java.lang.String str, java.security.spec.AlgorithmParameterSpec algorithmParameterSpec) {
            this.getHighSpeedVideoFpsRanges.add(str);
            this.getHighResolutionOutputSizeshNQ4ISI.add(algorithmParameterSpec);
            return this;
        }

        public org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec.Builder add(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges.add(str);
            this.getHighResolutionOutputSizeshNQ4ISI.add(null);
            return this;
        }
    }

    public java.util.List<java.security.spec.AlgorithmParameterSpec> getParameterSpecs() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.util.List<java.lang.String> getAlgorithmNames() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public CompositeAlgorithmSpec(org.bouncycastle.jcajce.spec.CompositeAlgorithmSpec.Builder builder) {
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(new java.util.ArrayList(builder.getHighSpeedVideoFpsRanges));
        this.getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.unmodifiableList(new java.util.ArrayList(builder.getHighResolutionOutputSizeshNQ4ISI));
    }
}
