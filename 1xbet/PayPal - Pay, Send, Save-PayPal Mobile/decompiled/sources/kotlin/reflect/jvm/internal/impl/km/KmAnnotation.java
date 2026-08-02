package kotlin.reflect.jvm.internal.impl.km;

/* loaded from: classes5.dex */
public final class KmAnnotation {
    private final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public KmAnnotation(java.lang.String str, java.util.Map<java.lang.String, ? extends kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> map) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = map;
    }

    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument> getArguments() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.lang.String getClassName() {
        return this.getHighSpeedVideoSizes;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.km.KmAnnotation)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.km.KmAnnotation kmAnnotation = (kotlin.reflect.jvm.internal.impl.km.KmAnnotation) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, kmAnnotation.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, kmAnnotation.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final int hashCode() {
        return (this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(kotlin.collections.MapsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI), null, null, null, 0, null, new kotlin.jvm.functions.Function1() { // from class: kotlin.reflect.jvm.internal.impl.km.KmAnnotation$$Lambda$0
            @Override // kotlin.jvm.functions.Function1
            public java.lang.Object invoke(java.lang.Object obj) {
                return kotlin.reflect.jvm.internal.impl.km.KmAnnotation.getHighSpeedVideoFpsRanges((kotlin.Pair) obj);
            }
        }, 31, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("@");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append('(');
        sb.append(joinToString$default);
        sb.append(')');
        return sb.toString();
    }

    static /* synthetic */ java.lang.CharSequence getHighSpeedVideoFpsRanges(kotlin.Pair pair) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pair, "");
        java.lang.String str = (java.lang.String) pair.component1();
        kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument kmAnnotationArgument = (kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument) pair.component2();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.EQUALS_SIGN_WITH_SPACES);
        sb.append(kmAnnotationArgument);
        return sb.toString();
    }
}
