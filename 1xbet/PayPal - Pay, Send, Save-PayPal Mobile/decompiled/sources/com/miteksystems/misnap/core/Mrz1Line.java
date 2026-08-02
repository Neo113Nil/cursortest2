package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/core/Mrz1Line;", "Lcom/miteksystems/misnap/core/Mrz;", "", "mrzString", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/core/Mrz1Line;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/miteksystems/misnap/core/Mrz1Line;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getMrzString", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Mrz1Line extends com.miteksystems.misnap.core.Mrz {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.Mrz1Line.Companion INSTANCE = new com.miteksystems.misnap.core.Mrz1Line.Companion(null);

    /* renamed from: b, reason: from kotlin metadata */
    private final java.lang.String mrzString;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Mrz1Line(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        super(i, serializationConstructorMarker);
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.core.Mrz1Line$$serializer.INSTANCE.getDescriptor());
        }
        this.mrzString = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mrz1Line(java.lang.String str) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.mrzString = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Mrz1Line(mrzString=");
        sb.append(this.mrzString);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return this.mrzString.hashCode();
    }

    public final java.lang.String getMrzString() {
        return this.mrzString;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.miteksystems.misnap.core.Mrz1Line) && kotlin.jvm.internal.Intrinsics.areEqual(this.mrzString, ((com.miteksystems.misnap.core.Mrz1Line) other).mrzString);
    }

    public final com.miteksystems.misnap.core.Mrz1Line copy(java.lang.String mrzString) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mrzString, "");
        return new com.miteksystems.misnap.core.Mrz1Line(mrzString);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getMrzString() {
        return this.mrzString;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/Mrz1Line$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Mrz1Line;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.Mrz1Line> serializer() {
            return com.miteksystems.misnap.core.Mrz1Line$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.core.Mrz1Line self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        com.miteksystems.misnap.core.Mrz.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.mrzString);
    }

    public static /* synthetic */ com.miteksystems.misnap.core.Mrz1Line copy$default(com.miteksystems.misnap.core.Mrz1Line mrz1Line, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = mrz1Line.mrzString;
        }
        return mrz1Line.copy(str);
    }
}
