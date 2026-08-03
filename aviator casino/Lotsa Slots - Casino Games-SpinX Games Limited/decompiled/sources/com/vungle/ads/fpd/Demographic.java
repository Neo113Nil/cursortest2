package com.vungle.ads.fpd;

/* compiled from: Demographic.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB1\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bB\u0005¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0003J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0003H\u0007J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0003H\u0007J\u0010\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0007J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dHÇ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\n\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0083\u000e¢\u0006\n\n\u0002\u0010\u000b\u0012\u0004\b\f\u0010\t¨\u0006 "}, d2 = {"Lcom/vungle/ads/fpd/Demographic;", "", "seen1", "", "ageRange", "gender", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getAgeRange$annotations", "Ljava/lang/Integer;", "getGender$annotations", "setAgeRange", "age", "setGender", "Lcom/vungle/ads/fpd/LiftoffGender;", "setLengthOfResidence", "lengthOfResidence", "setMedianHomeValueUSD", "homeValue", "setMonthlyHousingCosts", "housingCost", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes6.dex */
public final class Demographic {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.vungle.ads.fpd.Demographic.Companion INSTANCE = new com.vungle.ads.fpd.Demographic.Companion(null);
    private java.lang.Integer ageRange;
    private java.lang.Integer gender;

    @kotlinx.serialization.SerialName("age_range")
    private static /* synthetic */ void getAgeRange$annotations() {
    }

    @kotlinx.serialization.SerialName("gender")
    private static /* synthetic */ void getGender$annotations() {
    }

    @kotlin.Deprecated(message = "Will be deprecated", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final com.vungle.ads.fpd.Demographic setLengthOfResidence(int lengthOfResidence) {
        return this;
    }

    @kotlin.Deprecated(message = "Will be deprecated", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final com.vungle.ads.fpd.Demographic setMedianHomeValueUSD(int homeValue) {
        return this;
    }

    @kotlin.Deprecated(message = "Will be deprecated", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public final com.vungle.ads.fpd.Demographic setMonthlyHousingCosts(int housingCost) {
        return this;
    }

    /* compiled from: Demographic.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/vungle/ads/fpd/Demographic$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/vungle/ads/fpd/Demographic;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final kotlinx.serialization.KSerializer<com.vungle.ads.fpd.Demographic> serializer() {
            return com.vungle.ads.fpd.Demographic$$serializer.INSTANCE;
        }
    }

    public Demographic() {
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ Demographic(int i, @kotlinx.serialization.SerialName("age_range") java.lang.Integer num, @kotlinx.serialization.SerialName("gender") java.lang.Integer num2, kotlinx.serialization.internal.SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.ageRange = null;
        } else {
            this.ageRange = num;
        }
        if ((i & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num2;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void write$Self(com.vungle.ads.fpd.Demographic self, kotlinx.serialization.encoding.CompositeEncoder output, kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(self, "self");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "output");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.ageRange != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.ageRange);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.gender == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, kotlinx.serialization.internal.IntSerializer.INSTANCE, self.gender);
    }

    public final com.vungle.ads.fpd.Demographic setGender(com.vungle.ads.fpd.LiftoffGender gender) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(gender, "gender");
        this.gender = java.lang.Integer.valueOf(gender.getValue());
        return this;
    }

    public final com.vungle.ads.fpd.Demographic setAgeRange(int age) {
        this.ageRange = java.lang.Integer.valueOf(com.vungle.ads.fpd.AgeRange.INSTANCE.fromAge$vungle_ads_release(age).getId());
        return this;
    }
}
