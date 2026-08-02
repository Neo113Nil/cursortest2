package com.miteksystems.misnap.core.serverconnection;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "", "<init>", "()V", "DocumentResult", "FaceResult", "NfcResult", "VoiceResult", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$DocumentResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$FaceResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$VoiceResult;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public abstract class MiSnapTransactionResult {

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$DocumentResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "Lcom/miteksystems/misnap/core/Barcode;", com.google.mlkit.common.sdkinternal.OptionalModuleUtils.BARCODE, "", "rts", "<init>", "([BLcom/miteksystems/misnap/core/Barcode;Ljava/lang/String;)V", "a", "[B", "getFrame", "()[B", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/Barcode;", "getBarcode", "()Lcom/miteksystems/misnap/core/Barcode;", "c", "Ljava/lang/String;", "getRts", "()Ljava/lang/String;"}, k = 1, mv = {1, 8, 0})
    public static final class DocumentResult extends com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] frame;

        /* renamed from: b, reason: from kotlin metadata */
        private final com.miteksystems.misnap.core.Barcode barcode;

        /* renamed from: c, reason: from kotlin metadata */
        private final java.lang.String rts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DocumentResult(byte[] bArr, com.miteksystems.misnap.core.Barcode barcode, java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.frame = bArr;
            this.barcode = barcode;
            this.rts = str;
        }

        public /* synthetic */ DocumentResult(byte[] bArr, com.miteksystems.misnap.core.Barcode barcode, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? null : barcode, (i & 4) != 0 ? null : str);
        }

        public final java.lang.String getRts() {
            return this.rts;
        }

        public final byte[] getFrame() {
            return this.frame;
        }

        public final com.miteksystems.misnap.core.Barcode getBarcode() {
            return this.barcode;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$FaceResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_FRAME, "", "rts", "aiBasedRts", "<init>", "([BLjava/lang/String;[B)V", "a", "[B", "getFrame", "()[B", util.h.xy.cb.b.f1091, "Ljava/lang/String;", "getRts", "()Ljava/lang/String;", "c", "getAiBasedRts"}, k = 1, mv = {1, 8, 0})
    public static final class FaceResult extends com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final byte[] frame;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.lang.String rts;

        /* renamed from: c, reason: from kotlin metadata */
        private final byte[] aiBasedRts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FaceResult(byte[] bArr, java.lang.String str, byte[] bArr2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
            this.frame = bArr;
            this.rts = str;
            this.aiBasedRts = bArr2;
        }

        public /* synthetic */ FaceResult(byte[] bArr, java.lang.String str, byte[] bArr2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : bArr2);
        }

        public final java.lang.String getRts() {
            return this.rts;
        }

        public final byte[] getFrame() {
            return this.frame;
        }

        public final byte[] getAiBasedRts() {
            return this.aiBasedRts;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "<init>", "()V", "AuthenticationData", "EuDl", "Icao", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$EuDl;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$Icao;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class NfcResult extends com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult {

        @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001:\u0001/BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u000eJZ\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000eJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000eR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010!\u001a\u0004\b.\u0010\u000e"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "", "", "sod", "com", "dataFormat", "", "dataGroups", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;", "activeAuthInfo", "chipAuthInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/Map;", "component5", "()Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;Ljava/lang/String;)Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getSod", util.h.xy.cb.b.f1091, "getCom", "c", "getDataFormat", "d", "Ljava/util/Map;", "getDataGroups", "e", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;", "getActiveAuthInfo", "f", "getChipAuthInfo", "ActiveAuthInfo"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class AuthenticationData {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final java.lang.String sod;

            /* renamed from: b, reason: from kotlin metadata */
            private final java.lang.String com;

            /* renamed from: c, reason: from kotlin metadata */
            private final java.lang.String dataFormat;

            /* renamed from: d, reason: from kotlin metadata */
            private final java.util.Map<java.lang.String, java.lang.String> dataGroups;

            /* renamed from: e, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo;

            /* renamed from: f, reason: from kotlin metadata */
            private final java.lang.String chipAuthInfo;

            public AuthenticationData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map<java.lang.String, java.lang.String> map, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo, java.lang.String str4) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
                this.sod = str;
                this.com = str2;
                this.dataFormat = str3;
                this.dataGroups = map;
                this.activeAuthInfo = activeAuthInfo;
                this.chipAuthInfo = str4;
            }

            public /* synthetic */ AuthenticationData(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(str, str2, str3, map, (i & 16) != 0 ? null : activeAuthInfo, str4);
            }

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticationData(sod=");
                sb.append(this.sod);
                sb.append(", com=");
                sb.append(this.com);
                sb.append(", dataFormat=");
                sb.append(this.dataFormat);
                sb.append(", dataGroups=");
                sb.append(this.dataGroups);
                sb.append(", activeAuthInfo=");
                sb.append(this.activeAuthInfo);
                sb.append(", chipAuthInfo=");
                sb.append(this.chipAuthInfo);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                int hashCode = this.sod.hashCode();
                int hashCode2 = this.com.hashCode();
                int hashCode3 = this.dataFormat.hashCode();
                int hashCode4 = this.dataGroups.hashCode();
                com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo = this.activeAuthInfo;
                return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (activeAuthInfo == null ? 0 : activeAuthInfo.hashCode())) * 31) + this.chipAuthInfo.hashCode();
            }

            public final java.lang.String getSod() {
                return this.sod;
            }

            public final java.util.Map<java.lang.String, java.lang.String> getDataGroups() {
                return this.dataGroups;
            }

            @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;", "", "", "key", "signature", com.google.android.gms.fido.u2f.api.common.ClientData.KEY_CHALLENGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData$ActiveAuthInfo;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getKey", util.h.xy.cb.b.f1091, "getSignature", "c", "getChallenge"}, k = 1, mv = {1, 8, 0})
            public static final /* data */ class ActiveAuthInfo {

                /* renamed from: a, reason: collision with root package name and from kotlin metadata */
                private final java.lang.String key;

                /* renamed from: b, reason: from kotlin metadata */
                private final java.lang.String signature;

                /* renamed from: c, reason: from kotlin metadata */
                private final java.lang.String challenge;

                public final java.lang.String toString() {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("ActiveAuthInfo(key=");
                    sb.append(this.key);
                    sb.append(", signature=");
                    sb.append(this.signature);
                    sb.append(", challenge=");
                    sb.append(this.challenge);
                    sb.append(')');
                    return sb.toString();
                }

                public final int hashCode() {
                    return (((this.key.hashCode() * 31) + this.signature.hashCode()) * 31) + this.challenge.hashCode();
                }

                public final java.lang.String getSignature() {
                    return this.signature;
                }

                public final java.lang.String getKey() {
                    return this.key;
                }

                public final java.lang.String getChallenge() {
                    return this.challenge;
                }

                public final boolean equals(java.lang.Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo)) {
                        return false;
                    }
                    com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo = (com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo) other;
                    return kotlin.jvm.internal.Intrinsics.areEqual(this.key, activeAuthInfo.key) && kotlin.jvm.internal.Intrinsics.areEqual(this.signature, activeAuthInfo.signature) && kotlin.jvm.internal.Intrinsics.areEqual(this.challenge, activeAuthInfo.challenge);
                }

                public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo copy(java.lang.String key, java.lang.String signature, java.lang.String challenge) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
                    return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo(key, signature, challenge);
                }

                /* renamed from: component3, reason: from getter */
                public final java.lang.String getChallenge() {
                    return this.challenge;
                }

                /* renamed from: component2, reason: from getter */
                public final java.lang.String getSignature() {
                    return this.signature;
                }

                /* renamed from: component1, reason: from getter */
                public final java.lang.String getKey() {
                    return this.key;
                }

                public static /* synthetic */ com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo copy$default(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
                    if ((i & 1) != 0) {
                        str = activeAuthInfo.key;
                    }
                    if ((i & 2) != 0) {
                        str2 = activeAuthInfo.signature;
                    }
                    if ((i & 4) != 0) {
                        str3 = activeAuthInfo.challenge;
                    }
                    return activeAuthInfo.copy(str, str2, str3);
                }

                public ActiveAuthInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
                    this.key = str;
                    this.signature = str2;
                    this.challenge = str3;
                }
            }

            public final java.lang.String getDataFormat() {
                return this.dataFormat;
            }

            public final java.lang.String getCom() {
                return this.com;
            }

            public final java.lang.String getChipAuthInfo() {
                return this.chipAuthInfo;
            }

            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo getActiveAuthInfo() {
                return this.activeAuthInfo;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData = (com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.sod, authenticationData.sod) && kotlin.jvm.internal.Intrinsics.areEqual(this.com, authenticationData.com) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataFormat, authenticationData.dataFormat) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataGroups, authenticationData.dataGroups) && kotlin.jvm.internal.Intrinsics.areEqual(this.activeAuthInfo, authenticationData.activeAuthInfo) && kotlin.jvm.internal.Intrinsics.areEqual(this.chipAuthInfo, authenticationData.chipAuthInfo);
            }

            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData copy(java.lang.String sod, java.lang.String com2, java.lang.String dataFormat, java.util.Map<java.lang.String, java.lang.String> dataGroups, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo, java.lang.String chipAuthInfo) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sod, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(com2, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataFormat, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataGroups, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chipAuthInfo, "");
                return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData(sod, com2, dataFormat, dataGroups, activeAuthInfo, chipAuthInfo);
            }

            /* renamed from: component6, reason: from getter */
            public final java.lang.String getChipAuthInfo() {
                return this.chipAuthInfo;
            }

            /* renamed from: component5, reason: from getter */
            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo getActiveAuthInfo() {
                return this.activeAuthInfo;
            }

            public final java.util.Map<java.lang.String, java.lang.String> component4() {
                return this.dataGroups;
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getDataFormat() {
                return this.dataFormat;
            }

            /* renamed from: component2, reason: from getter */
            public final java.lang.String getCom() {
                return this.com;
            }

            /* renamed from: component1, reason: from getter */
            public final java.lang.String getSod() {
                return this.sod;
            }

            public static /* synthetic */ com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData copy$default(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.Map map, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo, java.lang.String str4, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    str = authenticationData.sod;
                }
                if ((i & 2) != 0) {
                    str2 = authenticationData.com;
                }
                java.lang.String str5 = str2;
                if ((i & 4) != 0) {
                    str3 = authenticationData.dataFormat;
                }
                java.lang.String str6 = str3;
                if ((i & 8) != 0) {
                    map = authenticationData.dataGroups;
                }
                java.util.Map map2 = map;
                if ((i & 16) != 0) {
                    activeAuthInfo = authenticationData.activeAuthInfo;
                }
                com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData.ActiveAuthInfo activeAuthInfo2 = activeAuthInfo;
                if ((i & 32) != 0) {
                    str4 = authenticationData.chipAuthInfo;
                }
                return authenticationData.copy(str, str5, str6, map2, activeAuthInfo2, str4);
            }
        }

        private NfcResult() {
            super(null);
        }

        public /* synthetic */ NfcResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$EuDl;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult;", "", "photo", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "authenticationData", "", "mibiString", "<init>", "([BLcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;Ljava/lang/String;)V", "component1", "()[B", "component2", "()Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "component3", "()Ljava/lang/String;", "copy", "([BLcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;Ljava/lang/String;)Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$EuDl;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getPhoto", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "getAuthenticationData", "c", "Ljava/lang/String;", "getMibiString"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class EuDl extends com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final byte[] photo;

            /* renamed from: b, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData;

            /* renamed from: c, reason: from kotlin metadata */
            private final java.lang.String mibiString;

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("EuDl(photo=");
                sb.append(java.util.Arrays.toString(this.photo));
                sb.append(", authenticationData=");
                sb.append(this.authenticationData);
                sb.append(", mibiString=");
                sb.append(this.mibiString);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return (((java.util.Arrays.hashCode(this.photo) * 31) + this.authenticationData.hashCode()) * 31) + this.mibiString.hashCode();
            }

            public final byte[] getPhoto() {
                return this.photo;
            }

            public final java.lang.String getMibiString() {
                return this.mibiString;
            }

            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData getAuthenticationData() {
                return this.authenticationData;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl euDl = (com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.photo, euDl.photo) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationData, euDl.authenticationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.mibiString, euDl.mibiString);
            }

            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl copy(byte[] photo, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String mibiString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationData, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mibiString, "");
                return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl(photo, authenticationData, mibiString);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getMibiString() {
                return this.mibiString;
            }

            /* renamed from: component2, reason: from getter */
            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData getAuthenticationData() {
                return this.authenticationData;
            }

            /* renamed from: component1, reason: from getter */
            public final byte[] getPhoto() {
                return this.photo;
            }

            public static /* synthetic */ com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl copy$default(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.EuDl euDl, byte[] bArr, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bArr = euDl.photo;
                }
                if ((i & 2) != 0) {
                    authenticationData = euDl.authenticationData;
                }
                if ((i & 4) != 0) {
                    str = euDl.mibiString;
                }
                return euDl.copy(bArr, authenticationData, str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public EuDl(byte[] bArr, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationData, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.photo = bArr;
                this.authenticationData = authenticationData;
                this.mibiString = str;
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000f"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$Icao;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult;", "", "photo", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "authenticationData", "", "mibiString", "<init>", "([BLcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;Ljava/lang/String;)V", "component1", "()[B", "component2", "()Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "component3", "()Ljava/lang/String;", "copy", "([BLcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;Ljava/lang/String;)Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$Icao;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "[B", "getPhoto", util.h.xy.cb.b.f1091, "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$NfcResult$AuthenticationData;", "getAuthenticationData", "c", "Ljava/lang/String;", "getMibiString"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class Icao extends com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult {

            /* renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final byte[] photo;

            /* renamed from: b, reason: from kotlin metadata */
            private final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData;

            /* renamed from: c, reason: from kotlin metadata */
            private final java.lang.String mibiString;

            public final java.lang.String toString() {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Icao(photo=");
                sb.append(java.util.Arrays.toString(this.photo));
                sb.append(", authenticationData=");
                sb.append(this.authenticationData);
                sb.append(", mibiString=");
                sb.append(this.mibiString);
                sb.append(')');
                return sb.toString();
            }

            public final int hashCode() {
                return (((java.util.Arrays.hashCode(this.photo) * 31) + this.authenticationData.hashCode()) * 31) + this.mibiString.hashCode();
            }

            public final byte[] getPhoto() {
                return this.photo;
            }

            public final java.lang.String getMibiString() {
                return this.mibiString;
            }

            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData getAuthenticationData() {
                return this.authenticationData;
            }

            public final boolean equals(java.lang.Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao)) {
                    return false;
                }
                com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao icao = (com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao) other;
                return kotlin.jvm.internal.Intrinsics.areEqual(this.photo, icao.photo) && kotlin.jvm.internal.Intrinsics.areEqual(this.authenticationData, icao.authenticationData) && kotlin.jvm.internal.Intrinsics.areEqual(this.mibiString, icao.mibiString);
            }

            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao copy(byte[] photo, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String mibiString) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(photo, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationData, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mibiString, "");
                return new com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao(photo, authenticationData, mibiString);
            }

            /* renamed from: component3, reason: from getter */
            public final java.lang.String getMibiString() {
                return this.mibiString;
            }

            /* renamed from: component2, reason: from getter */
            public final com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData getAuthenticationData() {
                return this.authenticationData;
            }

            /* renamed from: component1, reason: from getter */
            public final byte[] getPhoto() {
                return this.photo;
            }

            public static /* synthetic */ com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao copy$default(com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.Icao icao, byte[] bArr, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String str, int i, java.lang.Object obj) {
                if ((i & 1) != 0) {
                    bArr = icao.photo;
                }
                if ((i & 2) != 0) {
                    authenticationData = icao.authenticationData;
                }
                if ((i & 4) != 0) {
                    str = icao.mibiString;
                }
                return icao.copy(bArr, authenticationData, str);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Icao(byte[] bArr, com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult.NfcResult.AuthenticationData authenticationData, java.lang.String str) {
                super(null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationData, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                this.photo = bArr;
                this.authenticationData = authenticationData;
                this.mibiString = str;
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult$VoiceResult;", "Lcom/miteksystems/misnap/core/serverconnection/MiSnapTransactionResult;", "", "", "voiceSamples", "", "rts", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "Ljava/util/List;", "getVoiceSamples", "()Ljava/util/List;", util.h.xy.cb.b.f1091, "getRts"}, k = 1, mv = {1, 8, 0})
    public static final class VoiceResult extends com.miteksystems.misnap.core.serverconnection.MiSnapTransactionResult {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.util.List<byte[]> voiceSamples;

        /* renamed from: b, reason: from kotlin metadata */
        private final java.util.List<java.lang.String> rts;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VoiceResult(java.util.List<byte[]> list, java.util.List<java.lang.String> list2) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            this.voiceSamples = list;
            this.rts = list2;
        }

        public /* synthetic */ VoiceResult(java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
        }

        public final java.util.List<byte[]> getVoiceSamples() {
            return this.voiceSamples;
        }

        public final java.util.List<java.lang.String> getRts() {
            return this.rts;
        }
    }

    public /* synthetic */ MiSnapTransactionResult(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MiSnapTransactionResult() {
    }
}
