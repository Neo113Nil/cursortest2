package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u000b\u0012\u0013\u0014\u0015\u0016\u0011\u0017\u0018\u0019\u001a\u001bB\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\n\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Analysis", "Camera", "Cancelled", "CombinedWorkflow", "CombinedWorkflowSkippedStep", com.miteksystems.misnap.core.MibiData.KEY_LICENSE, "Nfc", "Permission", "SettingState", "Voice", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Analysis;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Camera;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Cancelled;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflow;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflowSkippedStep;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Permission;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$SettingState;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class MiSnapWorkflowError {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f4146a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Companion$$cachedSerializer$delegate$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
            return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.License.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow", com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep", com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep.INSTANCE, new java.lang.annotation.Annotation[0]), com.miteksystems.misnap.workflow.MiSnapWorkflowError$License$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState", com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted.INSTANCE, new java.lang.annotation.Annotation[0]), com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$MissingRequirement$$serializer.INSTANCE, new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
        }
    });

    @kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0014J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0014"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "", "reason", "<init>", "(Ljava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getReason", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final /* data */ class License extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.License.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.License.Companion(null);

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String reason;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ License(int i, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (1 != (i & 1)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.workflow.MiSnapWorkflowError$License$$serializer.INSTANCE.getDescriptor());
            }
            this.reason = str;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public License(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.reason = str;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("License(reason=");
            sb.append(this.reason);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return this.reason.hashCode();
        }

        public final java.lang.String getReason() {
            return this.reason;
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.miteksystems.misnap.workflow.MiSnapWorkflowError.License) && kotlin.jvm.internal.Intrinsics.areEqual(this.reason, ((com.miteksystems.misnap.workflow.MiSnapWorkflowError.License) other).reason);
        }

        public final com.miteksystems.misnap.workflow.MiSnapWorkflowError.License copy(java.lang.String reason) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
            return new com.miteksystems.misnap.workflow.MiSnapWorkflowError.License(reason);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getReason() {
            return this.reason;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.License> serializer() {
                return com.miteksystems.misnap.workflow.MiSnapWorkflowError$License$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapWorkflowError.License self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapWorkflowError.write$Self(self, output, serialDesc);
            output.encodeStringElement(serialDesc, 0, self.reason);
        }

        public static /* synthetic */ com.miteksystems.misnap.workflow.MiSnapWorkflowError.License copy$default(com.miteksystems.misnap.workflow.MiSnapWorkflowError.License license, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = license.reason;
            }
            return license.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0005\u0011\u0012\u0013\u0014\u0015B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0016\u0017\u0018\u0019"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "DeviceDoesNotSupportNfc", "DocumentNotNfcEnabled", "InvalidCredentials", "Skipped", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DeviceDoesNotSupportNfc;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DocumentNotNfcEnabled;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$InvalidCredentials;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$Skipped;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static abstract class Nfc extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Companion(null);
        private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Nfc$Companion$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.class)}, new kotlinx.serialization.KSerializer[]{new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE, new java.lang.annotation.Annotation[0]), new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.INSTANCE, new java.lang.annotation.Annotation[0])}, new java.lang.annotation.Annotation[0]);
            }
        });

        private Nfc() {
            super(null);
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ Nfc(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
        }

        public /* synthetic */ Nfc(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc> serializer() {
                return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.b.getValue();
            }

            private Companion() {
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DeviceDoesNotSupportNfc;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class DeviceDoesNotSupportNfc extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Nfc$DeviceDoesNotSupportNfc$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            private DeviceDoesNotSupportNfc() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DocumentNotNfcEnabled;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class DocumentNotNfcEnabled extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Nfc$DocumentNotNfcEnabled$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            private DocumentNotNfcEnabled() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$InvalidCredentials;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class InvalidCredentials extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Nfc$InvalidCredentials$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            private InvalidCredentials() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$Skipped;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        public static final class Skipped extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> c = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Nfc$Skipped$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped> serializer() {
                return (kotlinx.serialization.KSerializer) c.getValue();
            }

            private Skipped() {
                super(null);
            }
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapWorkflowError.write$Self(self, output, serialDesc);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Execution", "Initialization", "InputFormat", "MicrophoneMuted", "MissingRequirement", "Skipped", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Execution;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Initialization;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$InputFormat;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MicrophoneMuted;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Skipped;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class Voice extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0003\u0018\u0017\u0019B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ(\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eHÇ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Reason;", "reason", "<init>", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Reason;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Reason;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Reason;", "getReason", "()Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Reason;", "Companion", "$serializer", "Reason"}, k = 1, mv = {1, 8, 0})
        @kotlinx.serialization.Serializable
        public static final class MissingRequirement extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Companion(null);

            /* renamed from: b, reason: from kotlin metadata */
            private final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason reason;

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Reason;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "Flow", "Phrase"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public enum Reason {
                Flow,
                Phrase;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
            public /* synthetic */ MissingRequirement(int i, com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason reason, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
                super(null);
                if (1 != (i & 1)) {
                    kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$MissingRequirement$$serializer.INSTANCE.getDescriptor());
                }
                this.reason = reason;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingRequirement(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason reason) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reason, "");
                this.reason = reason;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement> serializer() {
                    return com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$MissingRequirement$$serializer.INSTANCE;
                }

                private Companion() {
                }
            }

            public final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason getReason() {
                return this.reason;
            }

            @kotlin.jvm.JvmStatic
            public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
                output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.EnumsKt.createSimpleEnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason.values()), self.reason);
            }
        }

        private Voice() {
            super(null);
        }

        public /* synthetic */ Voice(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Execution;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes10.dex */
        public static final class Execution extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$Execution$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution> serializer() {
                return (kotlinx.serialization.KSerializer) b.getValue();
            }

            private Execution() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Initialization;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes10.dex */
        public static final class Initialization extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$Initialization$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization> serializer() {
                return (kotlinx.serialization.KSerializer) b.getValue();
            }

            private Initialization() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$InputFormat;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes10.dex */
        public static final class InputFormat extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$InputFormat$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat> serializer() {
                return (kotlinx.serialization.KSerializer) b.getValue();
            }

            private InputFormat() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MicrophoneMuted;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes10.dex */
        public static final class MicrophoneMuted extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$MicrophoneMuted$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted> serializer() {
                return (kotlinx.serialization.KSerializer) b.getValue();
            }

            private MicrophoneMuted() {
                super(null);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Skipped;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @kotlinx.serialization.Serializable
        /* loaded from: classes10.dex */
        public static final class Skipped extends com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice {
            public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped();
            private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Voice$Skipped$$cachedSerializer$delegate$1
                @Override // kotlin.jvm.functions.Function0
                public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                    return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped.INSTANCE, new java.lang.annotation.Annotation[0]);
                }
            });

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped> serializer() {
                return (kotlinx.serialization.KSerializer) b.getValue();
            }

            private Skipped() {
                super(null);
            }
        }
    }

    public /* synthetic */ MiSnapWorkflowError(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Analysis;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class Analysis extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Analysis$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private Analysis() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Camera;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class Camera extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private Camera() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Cancelled;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class Cancelled extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Cancelled$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private Cancelled() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflow;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class CombinedWorkflow extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$CombinedWorkflow$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow", com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private CombinedWorkflow() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflowSkippedStep;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class CombinedWorkflowSkippedStep extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$CombinedWorkflowSkippedStep$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep", com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private CombinedWorkflowSkippedStep() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError> serializer() {
            return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.workflow.MiSnapWorkflowError.f4146a.getValue();
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Permission;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class Permission extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$Permission$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission", com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private Permission() {
            super(null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004HÆ\u0001¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$SettingState;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @kotlinx.serialization.Serializable
    public static final class SettingState extends com.miteksystems.misnap.workflow.MiSnapWorkflowError {
        public static final com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState INSTANCE = new com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState();
        private static final /* synthetic */ kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> b = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapWorkflowError$SettingState$$cachedSerializer$delegate$1
            @Override // kotlin.jvm.functions.Function0
            public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return new kotlinx.serialization.internal.ObjectSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState", com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState.INSTANCE, new java.lang.annotation.Annotation[0]);
            }
        });

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState> serializer() {
            return (kotlinx.serialization.KSerializer) b.getValue();
        }

        private SettingState() {
            super(null);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapWorkflowError self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MiSnapWorkflowError(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    private MiSnapWorkflowError() {
    }
}
