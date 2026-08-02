package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "Asset", "ContentProvider", "File", "JsonString", "RawRes", com.ingo.sdk.kotlin.common.analytics.IPropertyNames.Url, "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LottieCompositionSpec {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$RawRes;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "resId", "constructor-impl", "(I)I", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getResId", "()I"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class RawRes implements com.airbnb.lottie.compose.LottieCompositionSpec {
        private final int resId;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m9919constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9921equalsimpl0(int i, int i2) {
            return i == i2;
        }

        private /* synthetic */ RawRes(int i) {
            this.resId = i;
        }

        public final int getResId() {
            return this.resId;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m9924unboximpl() {
            return this.resId;
        }

        public final java.lang.String toString() {
            return m9923toStringimpl(this.resId);
        }

        public final int hashCode() {
            return m9922hashCodeimpl(this.resId);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9920equalsimpl(this.resId, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9923toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("RawRes(resId=");
            sb.append(i);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9922hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9920equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof com.airbnb.lottie.compose.LottieCompositionSpec.RawRes) && i == ((com.airbnb.lottie.compose.LottieCompositionSpec.RawRes) obj).m9924unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec.RawRes m9918boximpl(int i) {
            return new com.airbnb.lottie.compose.LottieCompositionSpec.RawRes(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Url;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "url", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Url implements com.airbnb.lottie.compose.LottieCompositionSpec {
        private final java.lang.String url;

        private /* synthetic */ Url(java.lang.String str) {
            this.url = str;
        }

        public final java.lang.String getUrl() {
            return this.url;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.String m9931unboximpl() {
            return this.url;
        }

        public final java.lang.String toString() {
            return m9930toStringimpl(this.url);
        }

        public final int hashCode() {
            return m9929hashCodeimpl(this.url);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9927equalsimpl(this.url, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9930toStringimpl(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Url(url=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9929hashCodeimpl(java.lang.String str) {
            return str.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9928equalsimpl0(java.lang.String str, java.lang.String str2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9927equalsimpl(java.lang.String str, java.lang.Object obj) {
            return (obj instanceof com.airbnb.lottie.compose.LottieCompositionSpec.Url) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.airbnb.lottie.compose.LottieCompositionSpec.Url) obj).m9931unboximpl());
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.String m9926constructorimpl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec.Url m9925boximpl(java.lang.String str) {
            return new com.airbnb.lottie.compose.LottieCompositionSpec.Url(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$File;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "fileName", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getFileName", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class File implements com.airbnb.lottie.compose.LottieCompositionSpec {
        private final java.lang.String fileName;

        private /* synthetic */ File(java.lang.String str) {
            this.fileName = str;
        }

        public final java.lang.String getFileName() {
            return this.fileName;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.String m9910unboximpl() {
            return this.fileName;
        }

        public final java.lang.String toString() {
            return m9909toStringimpl(this.fileName);
        }

        public final int hashCode() {
            return m9908hashCodeimpl(this.fileName);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9906equalsimpl(this.fileName, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9909toStringimpl(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("File(fileName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9908hashCodeimpl(java.lang.String str) {
            return str.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9907equalsimpl0(java.lang.String str, java.lang.String str2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9906equalsimpl(java.lang.String str, java.lang.Object obj) {
            return (obj instanceof com.airbnb.lottie.compose.LottieCompositionSpec.File) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.airbnb.lottie.compose.LottieCompositionSpec.File) obj).m9910unboximpl());
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.String m9905constructorimpl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec.File m9904boximpl(java.lang.String str) {
            return new com.airbnb.lottie.compose.LottieCompositionSpec.File(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$Asset;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "assetName", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getAssetName", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class Asset implements com.airbnb.lottie.compose.LottieCompositionSpec {
        private final java.lang.String assetName;

        private /* synthetic */ Asset(java.lang.String str) {
            this.assetName = str;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.String m9896unboximpl() {
            return this.assetName;
        }

        public final java.lang.String toString() {
            return m9895toStringimpl(this.assetName);
        }

        public final int hashCode() {
            return m9894hashCodeimpl(this.assetName);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9892equalsimpl(this.assetName, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9895toStringimpl(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Asset(assetName=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9894hashCodeimpl(java.lang.String str) {
            return str.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9893equalsimpl0(java.lang.String str, java.lang.String str2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9892equalsimpl(java.lang.String str, java.lang.Object obj) {
            return (obj instanceof com.airbnb.lottie.compose.LottieCompositionSpec.Asset) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.airbnb.lottie.compose.LottieCompositionSpec.Asset) obj).m9896unboximpl());
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.String m9891constructorimpl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec.Asset m9890boximpl(java.lang.String str) {
            return new com.airbnb.lottie.compose.LottieCompositionSpec.Asset(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$JsonString;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "", "jsonString", "constructor-impl", "(Ljava/lang/String;)Ljava/lang/String;", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "toString-impl", "toString", "Ljava/lang/String;", "getJsonString", "()Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class JsonString implements com.airbnb.lottie.compose.LottieCompositionSpec {
        private final java.lang.String jsonString;

        private /* synthetic */ JsonString(java.lang.String str) {
            this.jsonString = str;
        }

        public final java.lang.String getJsonString() {
            return this.jsonString;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ java.lang.String m9917unboximpl() {
            return this.jsonString;
        }

        public final java.lang.String toString() {
            return m9916toStringimpl(this.jsonString);
        }

        public final int hashCode() {
            return m9915hashCodeimpl(this.jsonString);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9913equalsimpl(this.jsonString, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9916toStringimpl(java.lang.String str) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("JsonString(jsonString=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9915hashCodeimpl(java.lang.String str) {
            return str.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9914equalsimpl0(java.lang.String str, java.lang.String str2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9913equalsimpl(java.lang.String str, java.lang.Object obj) {
            return (obj instanceof com.airbnb.lottie.compose.LottieCompositionSpec.JsonString) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((com.airbnb.lottie.compose.LottieCompositionSpec.JsonString) obj).m9917unboximpl());
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static java.lang.String m9912constructorimpl(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return str;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec.JsonString m9911boximpl(java.lang.String str) {
            return new com.airbnb.lottie.compose.LottieCompositionSpec.JsonString(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec$ContentProvider;", "Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "Landroid/net/Uri;", "uri", "constructor-impl", "(Landroid/net/Uri;)Landroid/net/Uri;", "", "other", "", "equals-impl", "(Landroid/net/Uri;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Landroid/net/Uri;)I", "hashCode", "", "toString-impl", "(Landroid/net/Uri;)Ljava/lang/String;", "toString", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class ContentProvider implements com.airbnb.lottie.compose.LottieCompositionSpec {
        private final android.net.Uri uri;

        private /* synthetic */ ContentProvider(android.net.Uri uri) {
            this.uri = uri;
        }

        public final android.net.Uri getUri() {
            return this.uri;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ android.net.Uri m9903unboximpl() {
            return this.uri;
        }

        public final java.lang.String toString() {
            return m9902toStringimpl(this.uri);
        }

        public final int hashCode() {
            return m9901hashCodeimpl(this.uri);
        }

        public final boolean equals(java.lang.Object obj) {
            return m9899equalsimpl(this.uri, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m9902toStringimpl(android.net.Uri uri) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ContentProvider(uri=");
            sb.append(uri);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m9901hashCodeimpl(android.net.Uri uri) {
            return uri.hashCode();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m9900equalsimpl0(android.net.Uri uri, android.net.Uri uri2) {
            return kotlin.jvm.internal.Intrinsics.areEqual(uri, uri2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m9899equalsimpl(android.net.Uri uri, java.lang.Object obj) {
            return (obj instanceof com.airbnb.lottie.compose.LottieCompositionSpec.ContentProvider) && kotlin.jvm.internal.Intrinsics.areEqual(uri, ((com.airbnb.lottie.compose.LottieCompositionSpec.ContentProvider) obj).m9903unboximpl());
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static android.net.Uri m9898constructorimpl(android.net.Uri uri) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
            return uri;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ com.airbnb.lottie.compose.LottieCompositionSpec.ContentProvider m9897boximpl(android.net.Uri uri) {
            return new com.airbnb.lottie.compose.LottieCompositionSpec.ContentProvider(uri);
        }
    }
}
