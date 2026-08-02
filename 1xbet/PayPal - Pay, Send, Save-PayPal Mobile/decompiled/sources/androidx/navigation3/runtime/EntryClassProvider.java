package androidx.navigation3.runtime;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001Bg\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0017\u0010\u0007\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u001e\u0010\n\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b0\u0005\u0012\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R(\u0010\u001e\u001a\u0013\u0012\t\u0012\u00078\u0000¢\u0006\u0002\b\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b0\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\u001dR+\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000b0\u0005¢\u0006\u0002\b\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001f\u0010!"}, d2 = {"Landroidx/navigation3/runtime/EntryClassProvider;", "", "K", "Lkotlin/reflect/KClass;", "p0", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "p1", "", "", "p2", "", "Landroidx/compose/runtime/Composable;", "p3", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Lkotlin/reflect/KClass;", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function1;", "Camera2StreamConfigurationMap", "()Lkotlin/jvm/functions/Function1;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/jvm/functions/Function3;", "()Lkotlin/jvm/functions/Function3;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final /* data */ class EntryClassProvider<K> {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function3<K, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoSizes;
    private final kotlin.jvm.functions.Function1<K, java.util.Map<java.lang.String, java.lang.Object>> getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.KClass<K> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<K, java.lang.Object> getHighSpeedVideoFpsRanges;

    /* JADX WARN: Multi-variable type inference failed */
    public EntryClassProvider(kotlin.reflect.KClass<K> kClass, kotlin.jvm.functions.Function1<? super K, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function1<? super K, ? extends java.util.Map<java.lang.String, ? extends java.lang.Object>> function12, kotlin.jvm.functions.Function3<? super K, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function3) {
        this.getHighSpeedVideoFpsRangesFor = kClass;
        this.getHighSpeedVideoFpsRanges = function1;
        this.getHighResolutionOutputSizeshNQ4ISI = function12;
        this.getHighSpeedVideoSizes = function3;
    }

    public final kotlin.jvm.functions.Function1<K, java.lang.Object> Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function1<K, java.util.Map<java.lang.String, java.lang.Object>> getHighSpeedVideoFpsRanges() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.jvm.functions.Function3<K, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EntryClassProvider(getHighSpeedVideoFpsRangesFor=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof androidx.navigation3.runtime.EntryClassProvider)) {
            return false;
        }
        androidx.navigation3.runtime.EntryClassProvider entryClassProvider = (androidx.navigation3.runtime.EntryClassProvider) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, entryClassProvider.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, entryClassProvider.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, entryClassProvider.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, entryClassProvider.getHighSpeedVideoSizes);
    }
}
