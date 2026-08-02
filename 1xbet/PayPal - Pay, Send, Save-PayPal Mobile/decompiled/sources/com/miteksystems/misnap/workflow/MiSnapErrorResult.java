package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002+*B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0017\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010HÇ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0018"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;", "", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "error", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "<init>", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;Lcom/miteksystems/misnap/core/MiSnapMibiData;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/workflow/MiSnapWorkflowError;Lcom/miteksystems/misnap/core/MiSnapMibiData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "component2", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "copy", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;Lcom/miteksystems/misnap/core/MiSnapMibiData;)Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "getError", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class MiSnapErrorResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.MiSnapErrorResult.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapErrorResult.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.miteksystems.misnap.workflow.MiSnapWorkflowError error;

    /* renamed from: b, reason: from kotlin metadata */
    private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MiSnapErrorResult(int i, com.miteksystems.misnap.workflow.MiSnapWorkflowError miSnapWorkflowError, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.miteksystems.misnap.workflow.MiSnapErrorResult$$serializer.INSTANCE.getDescriptor());
        }
        this.error = miSnapWorkflowError;
        this.misnapMibiData = miSnapMibiData;
    }

    public MiSnapErrorResult(com.miteksystems.misnap.workflow.MiSnapWorkflowError miSnapWorkflowError, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapWorkflowError, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
        this.error = miSnapWorkflowError;
        this.misnapMibiData = miSnapMibiData;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MiSnapErrorResult(error=");
        sb.append(this.error);
        sb.append(", misnapMibiData=");
        sb.append(this.misnapMibiData);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.error.hashCode() * 31) + this.misnapMibiData.hashCode();
    }

    public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
        return this.misnapMibiData;
    }

    public final com.miteksystems.misnap.workflow.MiSnapWorkflowError getError() {
        return this.error;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.miteksystems.misnap.workflow.MiSnapErrorResult)) {
            return false;
        }
        com.miteksystems.misnap.workflow.MiSnapErrorResult miSnapErrorResult = (com.miteksystems.misnap.workflow.MiSnapErrorResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.error, miSnapErrorResult.error) && kotlin.jvm.internal.Intrinsics.areEqual(this.misnapMibiData, miSnapErrorResult.misnapMibiData);
    }

    public final com.miteksystems.misnap.workflow.MiSnapErrorResult copy(com.miteksystems.misnap.workflow.MiSnapWorkflowError error, com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(misnapMibiData, "");
        return new com.miteksystems.misnap.workflow.MiSnapErrorResult(error, misnapMibiData);
    }

    /* renamed from: component2, reason: from getter */
    public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
        return this.misnapMibiData;
    }

    /* renamed from: component1, reason: from getter */
    public final com.miteksystems.misnap.workflow.MiSnapWorkflowError getError() {
        return this.error;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapErrorResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapErrorResult> serializer() {
            return com.miteksystems.misnap.workflow.MiSnapErrorResult$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapErrorResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeSerializableElement(serialDesc, 0, com.miteksystems.misnap.workflow.MiSnapWorkflowError.INSTANCE.serializer(), self.error);
        output.encodeSerializableElement(serialDesc, 1, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, self.misnapMibiData);
    }

    public static /* synthetic */ com.miteksystems.misnap.workflow.MiSnapErrorResult copy$default(com.miteksystems.misnap.workflow.MiSnapErrorResult miSnapErrorResult, com.miteksystems.misnap.workflow.MiSnapWorkflowError miSnapWorkflowError, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            miSnapWorkflowError = miSnapErrorResult.error;
        }
        if ((i & 2) != 0) {
            miSnapMibiData = miSnapErrorResult.misnapMibiData;
        }
        return miSnapErrorResult.copy(miSnapWorkflowError, miSnapMibiData);
    }
}
