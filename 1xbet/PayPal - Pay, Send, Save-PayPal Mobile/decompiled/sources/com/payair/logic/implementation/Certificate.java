package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0083\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/payair/logic/implementation/Certificate;", "", "", "alg", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "getE", "kid", "getKid", "kty", "getKty", "n", "getN", "use", "getUse", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlinx.serialization.Serializable
/* loaded from: classes2.dex */
public final /* data */ class Certificate {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.implementation.Certificate.Companion INSTANCE = new com.payair.logic.implementation.Certificate.Companion(null);
    public java.lang.String alg;
    public java.lang.String e;
    public java.lang.String kid;
    public java.lang.String kty;
    public java.lang.String n;
    public java.lang.String use;

    public /* synthetic */ Certificate(int i, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6) {
        if (63 != (i & 63)) {
            kotlinx.serialization.internal.PluginExceptionsKt.throwMissingFieldException(i, 63, com.payair.logic.implementation.Certificate$$serializer.INSTANCE.getDescriptor());
        }
        this.alg = str;
        this.e = str2;
        this.kid = str3;
        this.kty = str4;
        this.n = str5;
        this.use = str6;
    }

    public static final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.payair.logic.implementation.Certificate certificate, kotlinx.serialization.encoding.CompositeEncoder compositeEncoder, kotlinx.serialization.descriptors.SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, certificate.alg);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, certificate.e);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, certificate.kid);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, certificate.kty);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, certificate.n);
        compositeEncoder.encodeStringElement(serialDescriptor, 5, certificate.use);
    }

    public final int hashCode() {
        return this.use.hashCode() + com.payair.csdk.w3.a(this.n, com.payair.csdk.w3.a(this.kty, com.payair.csdk.w3.a(this.kid, com.payair.csdk.w3.a(this.e, this.alg.hashCode() * 31, 31), 31), 31), 31);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/payair/logic/implementation/Certificate$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/payair/logic/implementation/Certificate;", "serializer", "()Lkotlinx/serialization/KSerializer;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final kotlinx.serialization.KSerializer<com.payair.logic.implementation.Certificate> serializer() {
            return com.payair.logic.implementation.Certificate$$serializer.INSTANCE;
        }

        public static /* synthetic */ void Camera2StreamConfigurationMap(com.google.gson.stream.JsonReader jsonReader, o.Camera2StreamConfigurationMap camera2StreamConfigurationMap) {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(jsonReader);
                jsonReader.skipValue();
            }
            jsonReader.endObject();
        }

        public /* synthetic */ Companion() {
        }
    }

    public /* synthetic */ Certificate() {
    }

    public final java.lang.String toString() {
        java.lang.String str = this.alg;
        java.lang.String str2 = this.e;
        java.lang.String str3 = this.kid;
        java.lang.String str4 = this.kty;
        java.lang.String str5 = this.n;
        java.lang.String str6 = this.use;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Certificate(alg=");
        sb.append(str);
        sb.append(", e=");
        sb.append(str2);
        sb.append(", kid=");
        sb.append(str3);
        sb.append(", kty=");
        sb.append(str4);
        sb.append(", n=");
        sb.append(str5);
        sb.append(", use=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.payair.logic.implementation.Certificate)) {
            return false;
        }
        com.payair.logic.implementation.Certificate certificate = (com.payair.logic.implementation.Certificate) obj;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.alg, certificate.alg) && kotlin.jvm.internal.Intrinsics.areEqual(this.e, certificate.e) && kotlin.jvm.internal.Intrinsics.areEqual(this.kid, certificate.kid) && kotlin.jvm.internal.Intrinsics.areEqual(this.kty, certificate.kty) && kotlin.jvm.internal.Intrinsics.areEqual(this.n, certificate.n) && kotlin.jvm.internal.Intrinsics.areEqual(this.use, certificate.use);
    }
}
