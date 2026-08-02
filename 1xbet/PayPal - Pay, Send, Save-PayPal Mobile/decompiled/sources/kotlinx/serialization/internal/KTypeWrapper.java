package kotlinx.serialization.internal;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0002\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00160\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00068WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lkotlinx/serialization/internal/KTypeWrapper;", "Lkotlin/reflect/KType;", "p0", "<init>", "(Lkotlin/reflect/KType;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lkotlin/reflect/KType;", "getHighSpeedVideoFpsRangesFor", "", "", "getAnnotations", "()Ljava/util/List;", "Lkotlin/reflect/KTypeProjection;", "getArguments", "getHighSpeedVideoSizes", "Lkotlin/reflect/KClassifier;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "getHighResolutionOutputSizeshNQ4ISI", "isMarkedNullable", "()Z", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
final class KTypeWrapper implements kotlin.reflect.KType {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlin.reflect.KType getHighSpeedVideoFpsRangesFor;

    public KTypeWrapper(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kType, "");
        this.getHighSpeedVideoFpsRangesFor = kType;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    public final java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return this.getHighSpeedVideoFpsRangesFor.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    public final java.util.List<kotlin.reflect.KTypeProjection> getArguments() {
        return this.getHighSpeedVideoFpsRangesFor.getArguments();
    }

    @Override // kotlin.reflect.KType
    public final kotlin.reflect.KClassifier getClassifier() {
        return this.getHighSpeedVideoFpsRangesFor.getClassifier();
    }

    @Override // kotlin.reflect.KType
    public final boolean isMarkedNullable() {
        return this.getHighSpeedVideoFpsRangesFor.isMarkedNullable();
    }

    public final boolean equals(java.lang.Object p0) {
        if (p0 == null) {
            return false;
        }
        kotlin.reflect.KType kType = this.getHighSpeedVideoFpsRangesFor;
        kotlinx.serialization.internal.KTypeWrapper kTypeWrapper = p0 instanceof kotlinx.serialization.internal.KTypeWrapper ? (kotlinx.serialization.internal.KTypeWrapper) p0 : null;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(kType, kTypeWrapper != null ? kTypeWrapper.getHighSpeedVideoFpsRangesFor : null)) {
            return false;
        }
        kotlin.reflect.KClassifier classifier = getClassifier();
        if (classifier instanceof kotlin.reflect.KClass) {
            kotlin.reflect.KType kType2 = p0 instanceof kotlin.reflect.KType ? (kotlin.reflect.KType) p0 : null;
            kotlin.reflect.KClassifier classifier2 = kType2 != null ? kType2.getClassifier() : null;
            if (classifier2 != null && (classifier2 instanceof kotlin.reflect.KClass)) {
                return kotlin.jvm.internal.Intrinsics.areEqual(kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) classifier), kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) classifier2));
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.getHighSpeedVideoFpsRangesFor.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("KTypeWrapper: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        return sb.toString();
    }
}
