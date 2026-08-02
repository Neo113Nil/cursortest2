package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002%$B\u001d\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B1\b\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0014\u0010\u0004\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ(\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fHÇ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0016\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R#\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00028\u0007¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/ExtractedDataCorners;", "", "", "", "optionalData1Corners", "<init>", "([[[I)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(I[[[ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/core/ExtractedDataCorners;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()[[[I", "copy", "([[[I)Lcom/miteksystems/misnap/core/ExtractedDataCorners;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[[[I", "getOptionalData1Corners", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class ExtractedDataCorners {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.ExtractedDataCorners.Companion INSTANCE = new com.miteksystems.misnap.core.ExtractedDataCorners.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int[][][] optionalData1Corners;

    /* JADX WARN: Multi-variable type inference failed */
    public ExtractedDataCorners() {
        this((int[][][]) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ExtractedDataCorners(int i, int[][][] iArr, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.optionalData1Corners = new int[0][][];
        } else {
            this.optionalData1Corners = iArr;
        }
    }

    public ExtractedDataCorners(int[][][] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        this.optionalData1Corners = iArr;
    }

    public /* synthetic */ ExtractedDataCorners(int[][][] iArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new int[0][][] : iArr);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtractedDataCorners(optionalData1Corners=");
        sb.append(java.util.Arrays.toString(this.optionalData1Corners));
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.optionalData1Corners);
    }

    public final int[][][] getOptionalData1Corners() {
        return this.optionalData1Corners;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.miteksystems.misnap.core.ExtractedDataCorners) && kotlin.jvm.internal.Intrinsics.areEqual(this.optionalData1Corners, ((com.miteksystems.misnap.core.ExtractedDataCorners) other).optionalData1Corners);
    }

    public final com.miteksystems.misnap.core.ExtractedDataCorners copy(int[][][] optionalData1Corners) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optionalData1Corners, "");
        return new com.miteksystems.misnap.core.ExtractedDataCorners(optionalData1Corners);
    }

    /* renamed from: component1, reason: from getter */
    public final int[][][] getOptionalData1Corners() {
        return this.optionalData1Corners;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/ExtractedDataCorners$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/ExtractedDataCorners;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.ExtractedDataCorners> serializer() {
            return com.miteksystems.misnap.core.ExtractedDataCorners$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.core.ExtractedDataCorners self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !kotlin.jvm.internal.Intrinsics.areEqual(self.optionalData1Corners, new int[0][][])) {
            output.encodeSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.ReferenceArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[][].class), new kotlinx.serialization.internal.ReferenceArraySerializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(int[].class), kotlinx.serialization.internal.IntArraySerializer.INSTANCE)), self.optionalData1Corners);
        }
    }

    public static /* synthetic */ com.miteksystems.misnap.core.ExtractedDataCorners copy$default(com.miteksystems.misnap.core.ExtractedDataCorners extractedDataCorners, int[][][] iArr, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            iArr = extractedDataCorners.optionalData1Corners;
        }
        return extractedDataCorners.copy(iArr);
    }
}
