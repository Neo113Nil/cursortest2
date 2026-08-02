package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B;\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB+\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ4\u0010\u0010\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dHÇ\u0001¢\u0006\u0004\b \u0010!R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\"\u001a\u0004\b#\u0010\u000eR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/core/user/ReaderProvisioning;", "", "", "seen1", "", "", com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.AVAILABLE_CONDITION_KEY, "deprecated", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/zettle/sdk/core/user/ReaderProvisioning;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/ReaderProvisioning;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/util/List;", "getAvailable", "getDeprecated", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class ReaderProvisioning {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.ReaderProvisioning.Companion INSTANCE = new com.zettle.sdk.core.user.ReaderProvisioning.Companion(null);
    private final java.util.List<java.lang.String> available;
    private final java.util.List<java.lang.String> deprecated;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/ReaderProvisioning$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/ReaderProvisioning;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.ReaderProvisioning> serializer() {
            return com.zettle.sdk.core.user.ReaderProvisioning$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ReaderProvisioning(int i, java.util.List list, java.util.List list2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.available = null;
        } else {
            this.available = list;
        }
        if ((i & 2) == 0) {
            this.deprecated = null;
        } else {
            this.deprecated = list2;
        }
    }

    public ReaderProvisioning(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        this.available = list;
        this.deprecated = list2;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.ReaderProvisioning self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.available != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.available);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.deprecated != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.deprecated);
        }
    }

    public /* synthetic */ ReaderProvisioning(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2);
    }

    public final java.util.List<java.lang.String> getAvailable() {
        return this.available;
    }

    public final java.util.List<java.lang.String> getDeprecated() {
        return this.deprecated;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.available;
        java.util.List<java.lang.String> list2 = this.deprecated;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ReaderProvisioning(available=");
        sb.append(list);
        sb.append(", deprecated=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.util.List<java.lang.String> list = this.available;
        int hashCode = list == null ? 0 : list.hashCode();
        java.util.List<java.lang.String> list2 = this.deprecated;
        return (hashCode * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.ReaderProvisioning)) {
            return false;
        }
        com.zettle.sdk.core.user.ReaderProvisioning readerProvisioning = (com.zettle.sdk.core.user.ReaderProvisioning) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.available, readerProvisioning.available) && kotlin.jvm.internal.Intrinsics.areEqual(this.deprecated, readerProvisioning.deprecated);
    }

    public final com.zettle.sdk.core.user.ReaderProvisioning copy(java.util.List<java.lang.String> available, java.util.List<java.lang.String> deprecated) {
        return new com.zettle.sdk.core.user.ReaderProvisioning(available, deprecated);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.deprecated;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.available;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.zettle.sdk.core.user.ReaderProvisioning copy$default(com.zettle.sdk.core.user.ReaderProvisioning readerProvisioning, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = readerProvisioning.available;
        }
        if ((i & 2) != 0) {
            list2 = readerProvisioning.deprecated;
        }
        return readerProvisioning.copy(list, list2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReaderProvisioning() {
        this((java.util.List) null, (java.util.List) (0 == true ? 1 : 0), 3, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0));
    }
}
