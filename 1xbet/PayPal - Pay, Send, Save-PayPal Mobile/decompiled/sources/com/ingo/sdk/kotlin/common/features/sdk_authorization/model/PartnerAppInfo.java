package com.ingo.sdk.kotlin.common.features.sdk_authorization.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002$#B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\rJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/PartnerAppInfo;", "", "", "version", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/PartnerAppInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/PartnerAppInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getVersion", "getName", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class PartnerAppInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo.Companion(null);
    private final java.lang.String name;
    private final java.lang.String version;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/PartnerAppInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/PartnerAppInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo> serializer() {
            return com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ PartnerAppInfo(int i, java.lang.String str, java.lang.String str2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 3, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.version = str;
        this.name = str2;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.version);
        output.encodeStringElement(serialDesc, 1, self.name);
    }

    public PartnerAppInfo(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.version = str;
        this.name = str2;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getVersion() {
        return this.version;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.version;
        java.lang.String str2 = this.name;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PartnerAppInfo(version=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.version.hashCode() * 31) + this.name.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo partnerAppInfo = (com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.version, partnerAppInfo.version) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, partnerAppInfo.name);
    }

    public final com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo copy(java.lang.String version, java.lang.String name2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(version, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        return new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo(version, name2);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getVersion() {
        return this.version;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo copy$default(com.ingo.sdk.kotlin.common.features.sdk_authorization.model.PartnerAppInfo partnerAppInfo, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = partnerAppInfo.version;
        }
        if ((i & 2) != 0) {
            str2 = partnerAppInfo.name;
        }
        return partnerAppInfo.copy(str, str2);
    }
}
