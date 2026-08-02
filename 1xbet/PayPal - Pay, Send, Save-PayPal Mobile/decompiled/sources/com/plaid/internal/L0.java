package com.plaid.internal;

@kotlinx.serialization.Serializable
/* loaded from: classes3.dex */
public final class L0 implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.plaid.internal.L0> CREATOR = new com.plaid.internal.L0.b();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f5829a;
    public final com.plaid.internal.I0 b;
    public final com.plaid.internal.K0 c;
    public final com.plaid.internal.J0 d;
    public final boolean e;

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public static final class a implements kotlinx.serialization.internal.GeneratedSerializer<com.plaid.internal.L0> {

        /* renamed from: a, reason: collision with root package name */
        public static final com.plaid.internal.L0.a f5830a;
        public static final /* synthetic */ kotlinx.serialization.internal.PluginGeneratedSerialDescriptor b;

        static {
            com.plaid.internal.L0.a aVar = new com.plaid.internal.L0.a();
            f5830a = aVar;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new kotlinx.serialization.internal.PluginGeneratedSerialDescriptor("com.plaid.internal.models.EmbeddedOpenLinkConfiguration", aVar, 5);
            pluginGeneratedSerialDescriptor.addElement("embedded_workflow_session_id", false);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_default", true);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_with_institution_id", true);
            pluginGeneratedSerialDescriptor.addElement("open_link_action_link_with_account_numbers", true);
            pluginGeneratedSerialDescriptor.addElement("is_polling", true);
            b = pluginGeneratedSerialDescriptor;
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return new kotlinx.serialization.KSerializer[]{kotlinx.serialization.internal.StringSerializer.INSTANCE, kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.I0.a.f5806a), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.K0.a.f5823a), kotlinx.serialization.builtins.BuiltinSerializersKt.getNullable(com.plaid.internal.J0.a.f5815a), kotlinx.serialization.internal.BooleanSerializer.INSTANCE};
        }

        @Override // kotlinx.serialization.DeserializationStrategy
        public final java.lang.Object deserialize(kotlinx.serialization.encoding.Decoder decoder) {
            boolean z;
            int i;
            com.plaid.internal.K0 k0;
            com.plaid.internal.I0 i0;
            java.lang.String str;
            com.plaid.internal.J0 j0;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decoder, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeDecoder beginStructure = decoder.beginStructure(pluginGeneratedSerialDescriptor);
            if (beginStructure.decodeSequentially()) {
                java.lang.String decodeStringElement = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                com.plaid.internal.I0 i02 = (com.plaid.internal.I0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.I0.a.f5806a, null);
                com.plaid.internal.K0 k02 = (com.plaid.internal.K0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, com.plaid.internal.K0.a.f5823a, null);
                str = decodeStringElement;
                j0 = (com.plaid.internal.J0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.J0.a.f5815a, null);
                z = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 4);
                k0 = k02;
                i0 = i02;
                i = 31;
            } else {
                boolean z2 = false;
                boolean z3 = true;
                com.plaid.internal.K0 k03 = null;
                com.plaid.internal.I0 i03 = null;
                java.lang.String str2 = null;
                com.plaid.internal.J0 j02 = null;
                int i2 = 0;
                while (z3) {
                    int decodeElementIndex = beginStructure.decodeElementIndex(pluginGeneratedSerialDescriptor);
                    if (decodeElementIndex == -1) {
                        z3 = false;
                    } else if (decodeElementIndex == 0) {
                        str2 = beginStructure.decodeStringElement(pluginGeneratedSerialDescriptor, 0);
                        i2 |= 1;
                    } else if (decodeElementIndex == 1) {
                        i03 = (com.plaid.internal.I0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.I0.a.f5806a, i03);
                        i2 |= 2;
                    } else if (decodeElementIndex == 2) {
                        k03 = (com.plaid.internal.K0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, com.plaid.internal.K0.a.f5823a, k03);
                        i2 |= 4;
                    } else if (decodeElementIndex == 3) {
                        j02 = (com.plaid.internal.J0) beginStructure.decodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.J0.a.f5815a, j02);
                        i2 |= 8;
                    } else {
                        if (decodeElementIndex != 4) {
                            throw new kotlinx.serialization.UnknownFieldException(decodeElementIndex);
                        }
                        z2 = beginStructure.decodeBooleanElement(pluginGeneratedSerialDescriptor, 4);
                        i2 |= 16;
                    }
                }
                z = z2;
                i = i2;
                k0 = k03;
                i0 = i03;
                str = str2;
                j0 = j02;
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
            return new com.plaid.internal.L0(i, str, i0, k0, j0, z);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
        public final kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return b;
        }

        @Override // kotlinx.serialization.SerializationStrategy
        public final void serialize(kotlinx.serialization.encoding.Encoder encoder, java.lang.Object obj) {
            com.plaid.internal.L0 l0 = (com.plaid.internal.L0) obj;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encoder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l0, "");
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = b;
            kotlinx.serialization.encoding.CompositeEncoder beginStructure = encoder.beginStructure(pluginGeneratedSerialDescriptor);
            beginStructure.encodeStringElement(pluginGeneratedSerialDescriptor, 0, l0.f5829a);
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 1) || l0.b != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 1, com.plaid.internal.I0.a.f5806a, l0.b);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 2) || l0.c != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 2, com.plaid.internal.K0.a.f5823a, l0.c);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 3) || l0.d != null) {
                beginStructure.encodeNullableSerializableElement(pluginGeneratedSerialDescriptor, 3, com.plaid.internal.J0.a.f5815a, l0.d);
            }
            if (beginStructure.shouldEncodeElementDefault(pluginGeneratedSerialDescriptor, 4) || l0.e) {
                beginStructure.encodeBooleanElement(pluginGeneratedSerialDescriptor, 4, l0.e);
            }
            beginStructure.endStructure(pluginGeneratedSerialDescriptor);
        }

        @Override // kotlinx.serialization.internal.GeneratedSerializer
        public final kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return kotlinx.serialization.internal.GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
        }
    }

    public static final class b implements android.os.Parcelable.Creator<com.plaid.internal.L0> {
        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.L0 createFromParcel(android.os.Parcel parcel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            return new com.plaid.internal.L0(parcel.readString(), parcel.readInt() == 0 ? null : com.plaid.internal.I0.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : com.plaid.internal.K0.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? com.plaid.internal.J0.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final com.plaid.internal.L0[] newArray(int i) {
            return new com.plaid.internal.L0[i];
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @kotlin.ReplaceWith(expression = "", imports = {}))
    public L0(int i, @kotlinx.serialization.SerialName("embedded_workflow_session_id") java.lang.String str, @kotlinx.serialization.SerialName("open_link_action_default") com.plaid.internal.I0 i0, @kotlinx.serialization.SerialName("open_link_action_with_institution_id") com.plaid.internal.K0 k0, @kotlinx.serialization.SerialName("open_link_action_link_with_account_numbers") com.plaid.internal.J0 j0, @kotlinx.serialization.SerialName("is_polling") boolean z) {
        if (1 != (i & 1)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 1, com.plaid.internal.L0.a.b);
        }
        this.f5829a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = i0;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k0;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = j0;
        }
        if ((i & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.plaid.internal.L0)) {
            return false;
        }
        com.plaid.internal.L0 l0 = (com.plaid.internal.L0) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f5829a, l0.f5829a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, l0.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, l0.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.d, l0.d) && this.e == l0.e;
    }

    public final int hashCode() {
        int hashCode = this.f5829a.hashCode();
        com.plaid.internal.I0 i0 = this.b;
        int hashCode2 = i0 == null ? 0 : i0.hashCode();
        com.plaid.internal.K0 k0 = this.c;
        int hashCode3 = k0 == null ? 0 : k0.f5822a.hashCode();
        com.plaid.internal.J0 j0 = this.d;
        return java.lang.Boolean.hashCode(this.e) + (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (j0 != null ? j0.hashCode() : 0)) * 31);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.f5829a;
        com.plaid.internal.I0 i0 = this.b;
        com.plaid.internal.K0 k0 = this.c;
        com.plaid.internal.J0 j0 = this.d;
        boolean z = this.e;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmbeddedOpenLinkConfiguration(embeddedWorkflowSessionId=");
        sb.append(str);
        sb.append(", openLinkActionDefault=");
        sb.append(i0);
        sb.append(", openLinkActionWithInstitutionId=");
        sb.append(k0);
        sb.append(", openLinkActionLinkWithAccountNumbers=");
        sb.append(j0);
        sb.append(", isPolling=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.f5829a);
        if (this.b == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
        com.plaid.internal.K0 k0 = this.c;
        if (k0 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeString(k0.f5822a);
        }
        if (this.d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(parcel, "");
            parcel.writeInt(1);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }

    public L0(java.lang.String str, com.plaid.internal.I0 i0, com.plaid.internal.K0 k0, com.plaid.internal.J0 j0, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.f5829a = str;
        this.b = i0;
        this.c = k0;
        this.d = j0;
        this.e = z;
    }
}
