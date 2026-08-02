package com.miteksystems.misnap.workflow;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0006\u0012\u0011\u0013\u0014\u0015\u0016B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0005\u0017\u0018\u0019\u001a\u001b"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "BarcodeSession", "DocumentSession", "FaceSession", "NfcSession", "VoiceSession", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$NfcSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class MiSnapFinalResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.workflow.MiSnapFinalResult.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapFinalResult.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f4143a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.miteksystems.misnap.workflow.MiSnapFinalResult$Companion$$cachedSerializer$delegate$1
        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
            return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapFinalResult", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapFinalResult.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession.class)}, new kotlinx.serialization.KSerializer[]{com.miteksystems.misnap.workflow.MiSnapFinalResult$BarcodeSession$$serializer.INSTANCE, com.miteksystems.misnap.workflow.MiSnapFinalResult$DocumentSession$$serializer.INSTANCE, com.miteksystems.misnap.workflow.MiSnapFinalResult$FaceSession$$serializer.INSTANCE, com.miteksystems.misnap.workflow.MiSnapFinalResult$NfcSession$$serializer.INSTANCE, com.miteksystems.misnap.workflow.MiSnapFinalResult$VoiceSession$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }
    });

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001e\b\u0007\u0018\u0000 92\u00020\u0001:\u0002:9BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Be\b\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J(\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aHÇ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "", "jpegImage", "video", "Lcom/miteksystems/misnap/core/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "", "rts", "<init>", "([B[BLcom/miteksystems/misnap/core/Barcode;Ljava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(I[B[BLcom/miteksystems/misnap/core/Barcode;Ljava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", util.h.xy.cb.b.f1091, "[B", "getJpegImage", "()[B", "c", "getVideo", "d", "Lcom/miteksystems/misnap/core/Barcode;", "getBarcode", "()Lcom/miteksystems/misnap/core/Barcode;", "e", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "f", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "g", "Z", "getLicenseExpired", "()Z", "h", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final class BarcodeSession extends com.miteksystems.misnap.workflow.MiSnapFinalResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession.Companion(null);

        /* renamed from: b, reason: from kotlin metadata */
        private final byte[] jpegImage;

        /* renamed from: c, reason: from kotlin metadata */
        private final byte[] video;

        /* renamed from: d, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.Barcode barcode;

        /* renamed from: e, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

        /* renamed from: f, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

        /* renamed from: g, reason: from kotlin metadata */
        private final boolean licenseExpired;

        /* renamed from: h, reason: from kotlin metadata */
        private final java.lang.String rts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ BarcodeSession(int i, byte[] bArr, byte[] bArr2, com.miteksystems.misnap.core.Barcode barcode, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (57 != (i & 57)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 57, com.miteksystems.misnap.workflow.MiSnapFinalResult$BarcodeSession$$serializer.INSTANCE.getDescriptor());
            }
            this.jpegImage = bArr;
            if ((i & 2) == 0) {
                this.video = null;
            } else {
                this.video = bArr2;
            }
            if ((i & 4) == 0) {
                this.barcode = null;
            } else {
                this.barcode = barcode;
            }
            this.warnings = list;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
            if ((i & 64) == 0) {
                this.rts = null;
            } else {
                this.rts = str;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public BarcodeSession(byte[] bArr, byte[] bArr2, com.miteksystems.misnap.core.Barcode barcode, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
            this.jpegImage = bArr;
            this.video = bArr2;
            this.barcode = barcode;
            this.warnings = list;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
            this.rts = str;
        }

        public /* synthetic */ BarcodeSession(byte[] bArr, byte[] bArr2, com.miteksystems.misnap.core.Barcode barcode, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? null : bArr2, (i & 4) != 0 ? null : barcode, list, miSnapMibiData, z, (i & 64) != 0 ? null : str);
        }

        public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
            return this.warnings;
        }

        public final byte[] getVideo() {
            return this.video;
        }

        public final java.lang.String getRts() {
            return this.rts;
        }

        public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
            return this.misnapMibiData;
        }

        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        public final byte[] getJpegImage() {
            return this.jpegImage;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$BarcodeSession;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession> serializer() {
                return com.miteksystems.misnap.workflow.MiSnapFinalResult$BarcodeSession$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final com.miteksystems.misnap.core.Barcode getBarcode() {
            return this.barcode;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapFinalResult.BarcodeSession self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapFinalResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.jpegImage);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.video != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.video);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.barcode != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, com.miteksystems.misnap.core.Barcode$$serializer.INSTANCE, self.barcode);
            }
            output.encodeSerializableElement(serialDesc, 3, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer()), self.warnings);
            output.encodeSerializableElement(serialDesc, 4, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, self.misnapMibiData);
            output.encodeBooleanElement(serialDesc, 5, self.licenseExpired);
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.rts != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.rts);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b&\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002FEBc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015By\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ(\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eHÇ\u0001¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "", "jpegImage", "video", "Lcom/miteksystems/misnap/core/DocumentExtraction;", "extraction", "Lcom/miteksystems/misnap/core/DocumentClassification;", "classification", "Lcom/miteksystems/misnap/core/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "", "rts", "<init>", "([B[BLcom/miteksystems/misnap/core/DocumentExtraction;Lcom/miteksystems/misnap/core/DocumentClassification;Lcom/miteksystems/misnap/core/Barcode;Ljava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(I[B[BLcom/miteksystems/misnap/core/DocumentExtraction;Lcom/miteksystems/misnap/core/DocumentClassification;Lcom/miteksystems/misnap/core/Barcode;Ljava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", util.h.xy.cb.b.f1091, "[B", "getJpegImage", "()[B", "c", "getVideo", "d", "Lcom/miteksystems/misnap/core/DocumentExtraction;", "getExtraction", "()Lcom/miteksystems/misnap/core/DocumentExtraction;", "e", "Lcom/miteksystems/misnap/core/DocumentClassification;", "getClassification", "()Lcom/miteksystems/misnap/core/DocumentClassification;", "f", "Lcom/miteksystems/misnap/core/Barcode;", "getBarcode", "()Lcom/miteksystems/misnap/core/Barcode;", "g", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "h", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "i", "Z", "getLicenseExpired", "()Z", "j", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final class DocumentSession extends com.miteksystems.misnap.workflow.MiSnapFinalResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession.Companion(null);

        /* renamed from: b, reason: from kotlin metadata */
        private final byte[] jpegImage;

        /* renamed from: c, reason: from kotlin metadata */
        private final byte[] video;

        /* renamed from: d, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.DocumentExtraction extraction;

        /* renamed from: e, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.DocumentClassification classification;

        /* renamed from: f, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.Barcode barcode;

        /* renamed from: g, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

        /* renamed from: h, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

        /* renamed from: i, reason: from kotlin metadata */
        private final boolean licenseExpired;

        /* renamed from: j, reason: from kotlin metadata */
        private final java.lang.String rts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ DocumentSession(int i, byte[] bArr, byte[] bArr2, com.miteksystems.misnap.core.DocumentExtraction documentExtraction, com.miteksystems.misnap.core.DocumentClassification documentClassification, com.miteksystems.misnap.core.Barcode barcode, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (253 != (i & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, com.miteksystems.misnap.workflow.MiSnapFinalResult$DocumentSession$$serializer.INSTANCE.getDescriptor());
            }
            this.jpegImage = bArr;
            if ((i & 2) == 0) {
                this.video = null;
            } else {
                this.video = bArr2;
            }
            this.extraction = documentExtraction;
            this.classification = documentClassification;
            this.barcode = barcode;
            this.warnings = list;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
            if ((i & 256) == 0) {
                this.rts = null;
            } else {
                this.rts = str;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public DocumentSession(byte[] bArr, byte[] bArr2, com.miteksystems.misnap.core.DocumentExtraction documentExtraction, com.miteksystems.misnap.core.DocumentClassification documentClassification, com.miteksystems.misnap.core.Barcode barcode, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
            this.jpegImage = bArr;
            this.video = bArr2;
            this.extraction = documentExtraction;
            this.classification = documentClassification;
            this.barcode = barcode;
            this.warnings = list;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
            this.rts = str;
        }

        public /* synthetic */ DocumentSession(byte[] bArr, byte[] bArr2, com.miteksystems.misnap.core.DocumentExtraction documentExtraction, com.miteksystems.misnap.core.DocumentClassification documentClassification, com.miteksystems.misnap.core.Barcode barcode, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? null : bArr2, documentExtraction, documentClassification, barcode, list, miSnapMibiData, z, (i & 256) != 0 ? null : str);
        }

        public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
            return this.warnings;
        }

        public final byte[] getVideo() {
            return this.video;
        }

        public final java.lang.String getRts() {
            return this.rts;
        }

        public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
            return this.misnapMibiData;
        }

        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        public final byte[] getJpegImage() {
            return this.jpegImage;
        }

        public final com.miteksystems.misnap.core.DocumentExtraction getExtraction() {
            return this.extraction;
        }

        public final com.miteksystems.misnap.core.DocumentClassification getClassification() {
            return this.classification;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$DocumentSession;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession> serializer() {
                return com.miteksystems.misnap.workflow.MiSnapFinalResult$DocumentSession$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final com.miteksystems.misnap.core.Barcode getBarcode() {
            return this.barcode;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapFinalResult.DocumentSession self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapFinalResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.jpegImage);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.video != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.video);
            }
            output.encodeNullableSerializableElement(serialDesc, 2, com.miteksystems.misnap.core.DocumentExtraction$$serializer.INSTANCE, self.extraction);
            output.encodeNullableSerializableElement(serialDesc, 3, com.miteksystems.misnap.core.DocumentClassification$$serializer.INSTANCE, self.classification);
            output.encodeNullableSerializableElement(serialDesc, 4, com.miteksystems.misnap.core.Barcode$$serializer.INSTANCE, self.barcode);
            output.encodeSerializableElement(serialDesc, 5, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer()), self.warnings);
            output.encodeSerializableElement(serialDesc, 6, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, self.misnapMibiData);
            output.encodeBooleanElement(serialDesc, 7, self.licenseExpired);
            if (output.shouldEncodeElementDefault(serialDesc, 8) || self.rts != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.rts);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 62\u00020\u0001:\u000276BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0010Be\b\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J(\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019HÇ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u001f\u001a\u0004\b5\u0010!"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "", "jpegImage", "video", "", "Lcom/miteksystems/misnap/core/UserAction;", "warnings", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "", "rts", "aIBasedRts", "<init>", "([B[BLjava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;[B)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(I[B[BLjava/util/List;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLjava/lang/String;[BLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", util.h.xy.cb.b.f1091, "[B", "getJpegImage", "()[B", "c", "getVideo", "d", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "e", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "f", "Z", "getLicenseExpired", "()Z", "g", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;", "h", "getAIBasedRts", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final class FaceSession extends com.miteksystems.misnap.workflow.MiSnapFinalResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession.Companion(null);

        /* renamed from: b, reason: from kotlin metadata */
        private final byte[] jpegImage;

        /* renamed from: c, reason: from kotlin metadata */
        private final byte[] video;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.UserAction> warnings;

        /* renamed from: e, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean licenseExpired;

        /* renamed from: g, reason: from kotlin metadata */
        private final java.lang.String rts;

        /* renamed from: h, reason: from kotlin metadata */
        private final byte[] aIBasedRts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ FaceSession(int i, byte[] bArr, byte[] bArr2, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, byte[] bArr3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (29 != (i & 29)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 29, com.miteksystems.misnap.workflow.MiSnapFinalResult$FaceSession$$serializer.INSTANCE.getDescriptor());
            }
            this.jpegImage = bArr;
            if ((i & 2) == 0) {
                this.video = null;
            } else {
                this.video = bArr2;
            }
            this.warnings = list;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
            if ((i & 32) == 0) {
                this.rts = null;
            } else {
                this.rts = str;
            }
            if ((i & 64) == 0) {
                this.aIBasedRts = null;
            } else {
                this.aIBasedRts = bArr3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public FaceSession(byte[] bArr, byte[] bArr2, java.util.List<? extends com.miteksystems.misnap.core.UserAction> list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, byte[] bArr3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
            this.jpegImage = bArr;
            this.video = bArr2;
            this.warnings = list;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
            this.rts = str;
            this.aIBasedRts = bArr3;
        }

        public /* synthetic */ FaceSession(byte[] bArr, byte[] bArr2, java.util.List list, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, java.lang.String str, byte[] bArr3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? null : bArr2, list, miSnapMibiData, z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : bArr3);
        }

        public final java.util.List<com.miteksystems.misnap.core.UserAction> getWarnings() {
            return this.warnings;
        }

        public final byte[] getVideo() {
            return this.video;
        }

        public final java.lang.String getRts() {
            return this.rts;
        }

        public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
            return this.misnapMibiData;
        }

        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        public final byte[] getJpegImage() {
            return this.jpegImage;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$FaceSession;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession> serializer() {
                return com.miteksystems.misnap.workflow.MiSnapFinalResult$FaceSession$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final byte[] getAIBasedRts() {
            return this.aIBasedRts;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapFinalResult.FaceSession self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapFinalResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.jpegImage);
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.video != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.video);
            }
            output.encodeSerializableElement(serialDesc, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.UserAction.INSTANCE.serializer()), self.warnings);
            output.encodeSerializableElement(serialDesc, 3, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, self.misnapMibiData);
            output.encodeBooleanElement(serialDesc, 4, self.licenseExpired);
            if (output.shouldEncodeElementDefault(serialDesc, 5) || self.rts != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, kotlinx.serialization.internal.StringSerializer.INSTANCE, self.rts);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 6) || self.aIBasedRts != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, kotlinx.serialization.internal.ByteArraySerializer.INSTANCE, self.aIBasedRts);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u001cB7\b\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b\u001b\u0010!J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u001a\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$NfcSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "Lcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData;", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData;", "getNfcData", "()Lcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData;", "nfcData", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "c", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "getMisnapMibiData", "()Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "d", "Z", "getLicenseExpired", "()Z", "licenseExpired", "<init>", "(Lcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData;Lcom/miteksystems/misnap/core/MiSnapMibiData;Z)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/miteksystems/misnap/nfc/MiSnapNfcReader$ChipData;Lcom/miteksystems/misnap/core/MiSnapMibiData;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Companion", "$serializer", "workflow_release"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final class NfcSession extends com.miteksystems.misnap.workflow.MiSnapFinalResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession.Companion(null);

        /* renamed from: b, reason: from kotlin metadata */
        private final com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData nfcData;

        /* renamed from: c, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.MiSnapMibiData misnapMibiData;

        /* renamed from: d, reason: from kotlin metadata */
        private final boolean licenseExpired;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ NfcSession(int i, com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData chipData, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (7 != (i & 7)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.miteksystems.misnap.workflow.MiSnapFinalResult$NfcSession$$serializer.INSTANCE.getDescriptor());
            }
            this.nfcData = chipData;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NfcSession(com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData chipData, com.miteksystems.misnap.core.MiSnapMibiData miSnapMibiData, boolean z) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipData, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(miSnapMibiData, "");
            this.nfcData = chipData;
            this.misnapMibiData = miSnapMibiData;
            this.licenseExpired = z;
        }

        public final com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData getNfcData() {
            return this.nfcData;
        }

        public final com.miteksystems.misnap.core.MiSnapMibiData getMisnapMibiData() {
            return this.misnapMibiData;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$NfcSession$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$NfcSession;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession> serializer() {
                return com.miteksystems.misnap.workflow.MiSnapFinalResult$NfcSession$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapFinalResult.NfcSession self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapFinalResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, com.miteksystems.misnap.nfc.MiSnapNfcReader.ChipData.Companion.serializer(), self.nfcData);
            output.encodeSerializableElement(serialDesc, 1, com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE, self.misnapMibiData);
            output.encodeBooleanElement(serialDesc, 2, self.licenseExpired);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 +2\u00020\u0001:\u0002,+BE\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\f\u0010\rB_\b\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÇ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b$\u0010\u001eR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\"\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u001c\u001a\u0004\b*\u0010\u001e"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "", "", "voiceSamples", "", "phrase", "Lcom/miteksystems/misnap/core/MiSnapMibiData;", "misnapMibiData", "", "licenseExpired", "rts", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;)V", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/util/List;ZLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", util.h.xy.cb.b.f1091, "Ljava/util/List;", "getVoiceSamples", "()Ljava/util/List;", "c", "Ljava/lang/String;", "getPhrase", "()Ljava/lang/String;", "d", "getMisnapMibiData", "e", "Z", "getLicenseExpired", "()Z", "f", "getRts", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0})
    @kotlinx.serialization.Serializable
    public static final class VoiceSession extends com.miteksystems.misnap.workflow.MiSnapFinalResult {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession.Companion INSTANCE = new com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession.Companion(null);

        /* renamed from: b, reason: from kotlin metadata */
        private final java.util.List<byte[]> voiceSamples;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.lang.String phrase;

        /* renamed from: d, reason: from kotlin metadata */
        private final java.util.List<com.miteksystems.misnap.core.MiSnapMibiData> misnapMibiData;

        /* renamed from: e, reason: from kotlin metadata */
        private final boolean licenseExpired;

        /* renamed from: f, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> rts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
        public /* synthetic */ VoiceSession(int i, java.util.List list, java.lang.String str, java.util.List list2, boolean z, java.util.List list3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
            super(i, serializationConstructorMarker);
            if (15 != (i & 15)) {
                kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 15, com.miteksystems.misnap.workflow.MiSnapFinalResult$VoiceSession$$serializer.INSTANCE.getDescriptor());
            }
            this.voiceSamples = list;
            this.phrase = str;
            this.misnapMibiData = list2;
            this.licenseExpired = z;
            if ((i & 16) == 0) {
                this.rts = kotlin.collections.CollectionsKt.emptyList();
            } else {
                this.rts = list3;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceSession(java.util.List<byte[]> list, java.lang.String str, java.util.List<com.miteksystems.misnap.core.MiSnapMibiData> list2, boolean z, java.util.List<java.lang.String> list3) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
            this.voiceSamples = list;
            this.phrase = str;
            this.misnapMibiData = list2;
            this.licenseExpired = z;
            this.rts = list3;
        }

        public /* synthetic */ VoiceSession(java.util.List list, java.lang.String str, java.util.List list2, boolean z, java.util.List list3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, str, list2, z, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3);
        }

        public final java.util.List<byte[]> getVoiceSamples() {
            return this.voiceSamples;
        }

        public final java.util.List<java.lang.String> getRts() {
            return this.rts;
        }

        public final java.lang.String getPhrase() {
            return this.phrase;
        }

        public final java.util.List<com.miteksystems.misnap.core.MiSnapMibiData> getMisnapMibiData() {
            return this.misnapMibiData;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$VoiceSession;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession> serializer() {
                return com.miteksystems.misnap.workflow.MiSnapFinalResult$VoiceSession$$serializer.INSTANCE;
            }

            private Companion() {
            }
        }

        public final boolean getLicenseExpired() {
            return this.licenseExpired;
        }

        @kotlin.jvm.JvmStatic
        public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapFinalResult.VoiceSession self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
            com.miteksystems.misnap.workflow.MiSnapFinalResult.write$Self(self, output, serialDesc);
            output.encodeSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.ByteArraySerializer.INSTANCE), self.voiceSamples);
            output.encodeStringElement(serialDesc, 1, self.phrase);
            output.encodeSerializableElement(serialDesc, 2, new kotlinx.serialization.internal.ArrayListSerializer(com.miteksystems.misnap.core.MiSnapMibiData$$serializer.INSTANCE), self.misnapMibiData);
            output.encodeBooleanElement(serialDesc, 3, self.licenseExpired);
            if (output.shouldEncodeElementDefault(serialDesc, 4) || !kotlin.jvm.internal.Intrinsics.areEqual(self.rts, kotlin.collections.CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(kotlinx.serialization.internal.StringSerializer.INSTANCE)), self.rts);
            }
        }
    }

    public /* synthetic */ MiSnapFinalResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/workflow/MiSnapFinalResult$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapFinalResult;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.workflow.MiSnapFinalResult> serializer() {
            return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.workflow.MiSnapFinalResult.f4143a.getValue();
        }

        private Companion() {
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.workflow.MiSnapFinalResult self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ MiSnapFinalResult(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    private MiSnapFinalResult() {
    }
}
