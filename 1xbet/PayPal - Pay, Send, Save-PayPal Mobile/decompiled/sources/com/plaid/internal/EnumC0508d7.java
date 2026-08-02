package com.plaid.internal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlinx.serialization.Serializable
/* renamed from: com.plaid.internal.d7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0508d7 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.EnumC0508d7> CREATOR;
    public static final com.plaid.internal.EnumC0508d7.c Companion;

    @kotlinx.serialization.SerialName("NO_SMS_AUTOFILL")
    public static final com.plaid.internal.EnumC0508d7 NO_SMS_AUTOFILL;

    @kotlinx.serialization.SerialName("SMS_RECEIVER")
    public static final com.plaid.internal.EnumC0508d7 SMS_RECEIVER;

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.Lazy<kotlinx.serialization.KSerializer<java.lang.Object>> f6395a;
    public static final /* synthetic */ com.plaid.internal.EnumC0508d7[] b;
    public static final /* synthetic */ kotlin.enums.EnumEntries c;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    /* renamed from: com.plaid.internal.d7$a */
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.EnumC0508d7> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.EnumC0508d7.a f6396a = new com.plaid.internal.EnumC0508d7.a();
        public static final /* synthetic */ kotlinx.serialization.internal.EnumDescriptor b;

        static {
            kotlinx.serialization.internal.EnumDescriptor enumDescriptor = new kotlinx.serialization.internal.EnumDescriptor("com.plaid.internal.workflow.model.SmsAutofillType", 2);
            enumDescriptor.addElement("SMS_RECEIVER", false);
            enumDescriptor.addElement("NO_SMS_AUTOFILL", false);
            b = enumDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[0];
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            return com.plaid.internal.EnumC0508d7.values()[decoder.decodeEnum(b)];
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.EnumC0508d7 enumC0508d7 = (com.plaid.internal.EnumC0508d7) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enumC0508d7, "");
            encoder.encodeEnum(b, enumC0508d7.ordinal());
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.plaid.internal.d7$c] */
    static {
        com.plaid.internal.EnumC0508d7 enumC0508d7 = new com.plaid.internal.EnumC0508d7("SMS_RECEIVER", 0);
        SMS_RECEIVER = enumC0508d7;
        com.plaid.internal.EnumC0508d7 enumC0508d72 = new com.plaid.internal.EnumC0508d7("NO_SMS_AUTOFILL", 1);
        NO_SMS_AUTOFILL = enumC0508d72;
        com.plaid.internal.EnumC0508d7[] enumC0508d7Arr = {enumC0508d7, enumC0508d72};
        b = enumC0508d7Arr;
        c = kotlin.enums.EnumEntriesKt.enumEntries(enumC0508d7Arr);
        Companion = new java.lang.Object() { // from class: com.plaid.internal.d7.c
        };
        CREATOR = new android.os.Parcelable.Creator<com.plaid.internal.EnumC0508d7>() { // from class: com.plaid.internal.d7.d
            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.EnumC0508d7 createFromParcel(android.os.Parcel parcel) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
                return com.plaid.internal.EnumC0508d7.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final com.plaid.internal.EnumC0508d7[] newArray(int i) {
                return new com.plaid.internal.EnumC0508d7[i];
            }
        };
        f6395a = kotlin.LazyKt.lazy(kotlin.LazyThreadSafetyMode.PUBLICATION, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlinx.serialization.KSerializer<java.lang.Object>>() { // from class: com.plaid.internal.d7.b
            @Override // kotlin.jvm.functions.Function0
            public final kotlinx.serialization.KSerializer<java.lang.Object> invoke() {
                return com.plaid.internal.EnumC0508d7.a.f6396a;
            }
        });
    }

    public EnumC0508d7(java.lang.String str, int i) {
    }

    public static kotlin.enums.EnumEntries<com.plaid.internal.EnumC0508d7> getEntries() {
        return c;
    }

    public static com.plaid.internal.EnumC0508d7 valueOf(java.lang.String str) {
        return (com.plaid.internal.EnumC0508d7) java.lang.Enum.valueOf(com.plaid.internal.EnumC0508d7.class, str);
    }

    public static com.plaid.internal.EnumC0508d7[] values() {
        return (com.plaid.internal.EnumC0508d7[]) b.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(name());
    }
}
