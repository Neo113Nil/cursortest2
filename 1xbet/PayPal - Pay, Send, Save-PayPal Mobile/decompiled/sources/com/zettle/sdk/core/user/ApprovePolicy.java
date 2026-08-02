package com.zettle.sdk.core.user;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>Bk\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011BC\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0010\u0010\u001b\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJX\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\f2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J(\u0010+\u001a\u00020*2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(HÇ\u0001¢\u0006\u0004\b+\u0010,R \u0010\b\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010-\u0012\u0004\b/\u00100\u001a\u0004\b.\u0010\u0016R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00101\u0012\u0004\b3\u00100\u001a\u0004\b2\u0010\u0014R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b5\u00100\u001a\u0004\b4\u0010\u0014R \u0010\n\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00106\u0012\u0004\b8\u00100\u001a\u0004\b7\u0010\u0018R \u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00106\u0012\u0004\b:\u00100\u001a\u0004\b9\u0010\u0018R \u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010;\u0012\u0004\b=\u00100\u001a\u0004\b<\u0010\u001c"}, d2 = {"Lcom/zettle/sdk/core/user/ApprovePolicy;", "", "", "seen1", "", "", "cardEntryModes", "", "amountMax", "tvrMask", "tsiMask", "disallowedAid", "", "unexpiredApplication", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/util/List;", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Z", "copy", "(Ljava/util/List;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/zettle/sdk/core/user/ApprovePolicy;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self", "(Lcom/zettle/sdk/core/user/ApprovePolicy;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "J", "getAmountMax", "getAmountMax$annotations", "()V", "Ljava/util/List;", "getCardEntryModes", "getCardEntryModes$annotations", "getDisallowedAid", "getDisallowedAid$annotations", "Ljava/lang/String;", "getTsiMask", "getTsiMask$annotations", "getTvrMask", "getTvrMask$annotations", "Z", "getUnexpiredApplication", "getUnexpiredApplication$annotations", "Companion", "$serializer"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final /* data */ class ApprovePolicy {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.zettle.sdk.core.user.ApprovePolicy.Companion INSTANCE = new com.zettle.sdk.core.user.ApprovePolicy.Companion(null);
    private final long amountMax;
    private final java.util.List<java.lang.String> cardEntryModes;
    private final java.util.List<java.lang.String> disallowedAid;
    private final java.lang.String tsiMask;
    private final java.lang.String tvrMask;
    private final boolean unexpiredApplication;

    @kotlinx.serialization.SerialName("amount_max")
    public static /* synthetic */ void getAmountMax$annotations() {
    }

    @kotlinx.serialization.SerialName("card_entry_modes")
    public static /* synthetic */ void getCardEntryModes$annotations() {
    }

    @kotlinx.serialization.SerialName("disallowed_aid")
    public static /* synthetic */ void getDisallowedAid$annotations() {
    }

    @kotlinx.serialization.SerialName("tsi_mask")
    public static /* synthetic */ void getTsiMask$annotations() {
    }

    @kotlinx.serialization.SerialName("tvr_mask")
    public static /* synthetic */ void getTvrMask$annotations() {
    }

    @kotlinx.serialization.SerialName("unexpired_application")
    public static /* synthetic */ void getUnexpiredApplication$annotations() {
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/zettle/sdk/core/user/ApprovePolicy$Companion;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/zettle/sdk/core/user/ApprovePolicy;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.zettle.sdk.core.user.ApprovePolicy> serializer() {
            return com.zettle.sdk.core.user.ApprovePolicy$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ ApprovePolicy(int i, @kotlinx.serialization.SerialName("card_entry_modes") java.util.List list, @kotlinx.serialization.SerialName("amount_max") long j, @kotlinx.serialization.SerialName("tvr_mask") java.lang.String str, @kotlinx.serialization.SerialName("tsi_mask") java.lang.String str2, @kotlinx.serialization.SerialName("disallowed_aid") java.util.List list2, @kotlinx.serialization.SerialName("unexpired_application") boolean z, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.zettle.sdk.core.user.ApprovePolicy$$serializer.INSTANCE.getDescriptor());
        }
        this.cardEntryModes = list;
        this.amountMax = j;
        this.tvrMask = str;
        this.tsiMask = str2;
        this.disallowedAid = list2;
        this.unexpiredApplication = z;
    }

    public ApprovePolicy(java.util.List<java.lang.String> list, long j, java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.cardEntryModes = list;
        this.amountMax = j;
        this.tvrMask = str;
        this.tsiMask = str2;
        this.disallowedAid = list2;
        this.unexpiredApplication = z;
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.zettle.sdk.core.user.ApprovePolicy self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "");
        output.encodeSerializableElement(serialDesc, 0, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.cardEntryModes);
        output.encodeLongElement(serialDesc, 1, self.amountMax);
        output.encodeStringElement(serialDesc, 2, self.tvrMask);
        output.encodeStringElement(serialDesc, 3, self.tsiMask);
        output.encodeSerializableElement(serialDesc, 4, new kotlinx.serialization.internal.ArrayListSerializer(kotlinx.serialization.internal.StringSerializer.INSTANCE), self.disallowedAid);
        output.encodeBooleanElement(serialDesc, 5, self.unexpiredApplication);
    }

    public final java.util.List<java.lang.String> getCardEntryModes() {
        return this.cardEntryModes;
    }

    public final long getAmountMax() {
        return this.amountMax;
    }

    public final java.lang.String getTvrMask() {
        return this.tvrMask;
    }

    public final java.lang.String getTsiMask() {
        return this.tsiMask;
    }

    public final java.util.List<java.lang.String> getDisallowedAid() {
        return this.disallowedAid;
    }

    public final boolean getUnexpiredApplication() {
        return this.unexpiredApplication;
    }

    public final java.lang.String toString() {
        java.util.List<java.lang.String> list = this.cardEntryModes;
        long j = this.amountMax;
        java.lang.String str = this.tvrMask;
        java.lang.String str2 = this.tsiMask;
        java.util.List<java.lang.String> list2 = this.disallowedAid;
        boolean z = this.unexpiredApplication;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ApprovePolicy(cardEntryModes=");
        sb.append(list);
        sb.append(", amountMax=");
        sb.append(j);
        sb.append(", tvrMask=");
        sb.append(str);
        sb.append(", tsiMask=");
        sb.append(str2);
        sb.append(", disallowedAid=");
        sb.append(list2);
        sb.append(", unexpiredApplication=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.cardEntryModes.hashCode();
        int hashCode2 = java.lang.Long.hashCode(this.amountMax);
        int hashCode3 = this.tvrMask.hashCode();
        int hashCode4 = this.tsiMask.hashCode();
        int hashCode5 = this.disallowedAid.hashCode();
        boolean z = this.unexpiredApplication;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.core.user.ApprovePolicy)) {
            return false;
        }
        com.zettle.sdk.core.user.ApprovePolicy approvePolicy = (com.zettle.sdk.core.user.ApprovePolicy) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cardEntryModes, approvePolicy.cardEntryModes) && this.amountMax == approvePolicy.amountMax && kotlin.jvm.internal.Intrinsics.areEqual(this.tvrMask, approvePolicy.tvrMask) && kotlin.jvm.internal.Intrinsics.areEqual(this.tsiMask, approvePolicy.tsiMask) && kotlin.jvm.internal.Intrinsics.areEqual(this.disallowedAid, approvePolicy.disallowedAid) && this.unexpiredApplication == approvePolicy.unexpiredApplication;
    }

    public final com.zettle.sdk.core.user.ApprovePolicy copy(java.util.List<java.lang.String> cardEntryModes, long amountMax, java.lang.String tvrMask, java.lang.String tsiMask, java.util.List<java.lang.String> disallowedAid, boolean unexpiredApplication) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardEntryModes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tvrMask, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tsiMask, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disallowedAid, "");
        return new com.zettle.sdk.core.user.ApprovePolicy(cardEntryModes, amountMax, tvrMask, tsiMask, disallowedAid, unexpiredApplication);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getUnexpiredApplication() {
        return this.unexpiredApplication;
    }

    public final java.util.List<java.lang.String> component5() {
        return this.disallowedAid;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getTsiMask() {
        return this.tsiMask;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getTvrMask() {
        return this.tvrMask;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAmountMax() {
        return this.amountMax;
    }

    public final java.util.List<java.lang.String> component1() {
        return this.cardEntryModes;
    }

    public static /* synthetic */ com.zettle.sdk.core.user.ApprovePolicy copy$default(com.zettle.sdk.core.user.ApprovePolicy approvePolicy, java.util.List list, long j, java.lang.String str, java.lang.String str2, java.util.List list2, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = approvePolicy.cardEntryModes;
        }
        if ((i & 2) != 0) {
            j = approvePolicy.amountMax;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            str = approvePolicy.tvrMask;
        }
        java.lang.String str3 = str;
        if ((i & 8) != 0) {
            str2 = approvePolicy.tsiMask;
        }
        java.lang.String str4 = str2;
        if ((i & 16) != 0) {
            list2 = approvePolicy.disallowedAid;
        }
        java.util.List list3 = list2;
        if ((i & 32) != 0) {
            z = approvePolicy.unexpiredApplication;
        }
        return approvePolicy.copy(list, j2, str3, str4, list3, z);
    }
}
