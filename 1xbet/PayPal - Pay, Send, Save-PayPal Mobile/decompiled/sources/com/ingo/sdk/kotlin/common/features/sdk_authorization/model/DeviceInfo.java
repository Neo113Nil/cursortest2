package com.ingo.sdk.kotlin.common.features.sdk_authorization.model;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eJ'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u000e"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/DeviceInfo;", "", "", "modelNumber", "platformVersion", "osVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/DeviceInfo;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sharedSdk_release", "(Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/DeviceInfo;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Ljava/lang/String;", "getModelNumber", "getPlatformVersion", "getOsVersion", "Companion", "$serializer"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes.dex */
public final /* data */ class DeviceInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo.Companion INSTANCE = new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo.Companion(null);
    private final java.lang.String modelNumber;
    private final java.lang.String osVersion;
    private final java.lang.String platformVersion;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/DeviceInfo$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingo/sdk/kotlin/common/features/sdk_authorization/model/DeviceInfo;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes9.dex */
    public static final class Companion {
        public final kotlinx.serialization.KSerializer<com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo> serializer() {
            return com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ DeviceInfo(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 7, com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.modelNumber = str;
        this.platformVersion = str2;
        this.osVersion = str3;
    }

    @kotlin.jvm.JvmStatic
    public static final /* synthetic */ void write$Self$sharedSdk_release(com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.modelNumber);
        output.encodeStringElement(serialDesc, 1, self.platformVersion);
        output.encodeStringElement(serialDesc, 2, self.osVersion);
    }

    public DeviceInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.modelNumber = str;
        this.platformVersion = str2;
        this.osVersion = str3;
    }

    public final java.lang.String getModelNumber() {
        return this.modelNumber;
    }

    public final java.lang.String getPlatformVersion() {
        return this.platformVersion;
    }

    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.modelNumber;
        java.lang.String str2 = this.platformVersion;
        java.lang.String str3 = this.osVersion;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo(modelNumber=");
        sb.append(str);
        sb.append(", platformVersion=");
        sb.append(str2);
        sb.append(", osVersion=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.modelNumber.hashCode() * 31) + this.platformVersion.hashCode()) * 31) + this.osVersion.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo)) {
            return false;
        }
        com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo deviceInfo = (com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.modelNumber, deviceInfo.modelNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformVersion, deviceInfo.platformVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.osVersion, deviceInfo.osVersion);
    }

    public final com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo copy(java.lang.String modelNumber, java.lang.String platformVersion, java.lang.String osVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelNumber, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(platformVersion, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(osVersion, "");
        return new com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo(modelNumber, platformVersion, osVersion);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getOsVersion() {
        return this.osVersion;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getPlatformVersion() {
        return this.platformVersion;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getModelNumber() {
        return this.modelNumber;
    }

    public static /* synthetic */ com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo copy$default(com.ingo.sdk.kotlin.common.features.sdk_authorization.model.DeviceInfo deviceInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = deviceInfo.modelNumber;
        }
        if ((i & 2) != 0) {
            str2 = deviceInfo.platformVersion;
        }
        if ((i & 4) != 0) {
            str3 = deviceInfo.osVersion;
        }
        return deviceInfo.copy(str, str2, str3);
    }
}
