package com.miteksystems.misnap.core;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u001b\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0004¢\u0006\u0004\b\u0006\u0010\bJ(\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fHÇ\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0001\u0002\u0012\u0013"}, d2 = {"Lcom/miteksystems/misnap/core/Mrz;", "", "", "seen1", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/miteksystems/misnap/core/Mrz;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Lcom/miteksystems/misnap/core/Mrz1Line;", "Lcom/miteksystems/misnap/core/MrzData;"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public abstract class Mrz {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.miteksystems.misnap.core.Mrz.Companion INSTANCE = new com.miteksystems.misnap.core.Mrz.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f4067a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) com.miteksystems.misnap.core.Mrz.a.Camera2StreamConfigurationMap);

    public /* synthetic */ Mrz(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/miteksystems/misnap/core/Mrz$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/Mrz;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kotlinx.serialization.KSerializer<com.miteksystems.misnap.core.Mrz> serializer() {
            return (kotlinx.serialization.KSerializer) com.miteksystems.misnap.core.Mrz.f4067a.getValue();
        }

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>> {
        public static final com.miteksystems.misnap.core.Mrz.a Camera2StreamConfigurationMap = new com.miteksystems.misnap.core.Mrz.a();

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
            return new kotlinx.serialization.SealedClassSerializer("com.miteksystems.misnap.core.Mrz", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.Mrz.class), new kotlin.reflect.KClass[]{kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.Mrz1Line.class), kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.miteksystems.misnap.core.MrzData.class)}, new kotlinx.serialization.KSerializer[]{com.miteksystems.misnap.core.Mrz1Line$$serializer.INSTANCE, com.miteksystems.misnap.core.MrzData$$serializer.INSTANCE}, new java.lang.annotation.Annotation[0]);
        }

        a() {
            super(0);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.miteksystems.misnap.core.Mrz self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Mrz(int i, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
    }

    private Mrz() {
    }
}
