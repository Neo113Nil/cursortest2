package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* loaded from: classes5.dex */
public final class ClassData {
    private final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement getHighSpeedVideoSizes;

    public ClassData(kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver nameResolver, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class r3, kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion binaryVersion, kotlin.reflect.jvm.internal.impl.descriptors.SourceElement sourceElement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameResolver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binaryVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sourceElement, "");
        this.getHighSpeedVideoFpsRanges = nameResolver;
        this.getHighResolutionOutputSizeshNQ4ISI = r3;
        this.getHighSpeedVideoFpsRangesFor = binaryVersion;
        this.getHighSpeedVideoSizes = sourceElement;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassData(nameResolver=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", classProto=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", metadataVersion=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", sourceElement=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.getHighSpeedVideoFpsRanges.hashCode() * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode()) * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData classData = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.ClassData) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, classData.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, classData.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, classData.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, classData.getHighSpeedVideoSizes);
    }

    public final kotlin.reflect.jvm.internal.impl.descriptors.SourceElement component4() {
        return this.getHighSpeedVideoSizes;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion component3() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Class component2() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver component1() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
