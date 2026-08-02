package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B\\\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u0015Js\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020\r2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010\u0015R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b1\u0010\u001bR\u001d\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b2\u0010\u0015R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b\u000e\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b4\u0010\u0015R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b5\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\u0019R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b9\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010\"\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "", "Lcom/zettle/sdk/headless/readers/ReaderId;", "id", "", "name", "Lcom/zettle/sdk/headless/readers/ReaderColor;", "readerColor", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "connectionType", "address", "Lcom/zettle/sdk/headless/readers/ReaderModel;", "readerModel", "", "isPowerOn", "", "signalStrength", "readerCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderColor;Lcom/zettle/sdk/headless/readers/ConnectionType;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderModel;ZLjava/lang/Short;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-6QNqO6s", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lcom/zettle/sdk/headless/readers/ReaderColor;", "component4", "()Lcom/zettle/sdk/headless/readers/ConnectionType;", "component5", "component6", "()Lcom/zettle/sdk/headless/readers/ReaderModel;", "component7", "()Z", "component8", "()Ljava/lang/Short;", "component9", "copy-OXOdeMM", "(Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderColor;Lcom/zettle/sdk/headless/readers/ConnectionType;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderModel;ZLjava/lang/Short;Ljava/lang/String;)Lcom/zettle/sdk/headless/readers/DiscoveredReader;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAddress", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "getConnectionType", "getId-6QNqO6s", "Z", "getName", "getReaderCode", "Lcom/zettle/sdk/headless/readers/ReaderColor;", "getReaderColor", "Lcom/zettle/sdk/headless/readers/ReaderModel;", "getReaderModel", "Ljava/lang/Short;", "getSignalStrength"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DiscoveredReader {
    private final java.lang.String address;
    private final com.zettle.sdk.headless.readers.ConnectionType connectionType;
    private final java.lang.String id;
    private final boolean isPowerOn;
    private final java.lang.String name;
    private final java.lang.String readerCode;
    private final com.zettle.sdk.headless.readers.ReaderColor readerColor;
    private final com.zettle.sdk.headless.readers.ReaderModel readerModel;
    private final java.lang.Short signalStrength;

    private DiscoveredReader(java.lang.String str, java.lang.String str2, com.zettle.sdk.headless.readers.ReaderColor readerColor, com.zettle.sdk.headless.readers.ConnectionType connectionType, java.lang.String str3, com.zettle.sdk.headless.readers.ReaderModel readerModel, boolean z, java.lang.Short sh, java.lang.String str4) {
        this.id = str;
        this.name = str2;
        this.readerColor = readerColor;
        this.connectionType = connectionType;
        this.address = str3;
        this.readerModel = readerModel;
        this.isPowerOn = z;
        this.signalStrength = sh;
        this.readerCode = str4;
    }

    public /* synthetic */ DiscoveredReader(java.lang.String str, java.lang.String str2, com.zettle.sdk.headless.readers.ReaderColor readerColor, com.zettle.sdk.headless.readers.ConnectionType connectionType, java.lang.String str3, com.zettle.sdk.headless.readers.ReaderModel readerModel, boolean z, java.lang.Short sh, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, readerColor, connectionType, str3, readerModel, z, (i & 128) != 0 ? null : sh, (i & 256) != 0 ? null : str4, null);
    }

    /* renamed from: getId-6QNqO6s, reason: not valid java name */
    public final java.lang.String m23195getId6QNqO6s() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.zettle.sdk.headless.readers.ReaderColor getReaderColor() {
        return this.readerColor;
    }

    public final com.zettle.sdk.headless.readers.ConnectionType getConnectionType() {
        return this.connectionType;
    }

    public final java.lang.String getAddress() {
        return this.address;
    }

    public final com.zettle.sdk.headless.readers.ReaderModel getReaderModel() {
        return this.readerModel;
    }

    public final boolean isPowerOn() {
        return this.isPowerOn;
    }

    public final java.lang.Short getSignalStrength() {
        return this.signalStrength;
    }

    public final java.lang.String getReaderCode() {
        return this.readerCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x003d, code lost:
    
        if (r2 == null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String toString() {
        java.lang.String str;
        java.lang.String str2 = this.isPowerOn ? "🟢" : "🔴";
        com.zettle.sdk.headless.readers.ReaderModel readerModel = this.readerModel;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" (");
        sb.append(readerModel);
        sb.append(")");
        java.lang.String obj = sb.toString();
        java.lang.Short sh = this.signalStrength;
        if (sh != null) {
            short shortValue = sh.shortValue();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(" ");
            sb2.append((int) shortValue);
            sb2.append("dBm");
            str = sb2.toString();
        }
        str = "";
        java.lang.String str3 = this.name;
        com.zettle.sdk.headless.readers.ConnectionType connectionType = this.connectionType;
        com.zettle.sdk.headless.readers.ReaderColor readerColor = this.readerColor;
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
        sb3.append(str2);
        sb3.append(" ");
        sb3.append(str3);
        sb3.append(obj);
        sb3.append(" • ");
        sb3.append(connectionType);
        sb3.append(" • ");
        sb3.append(readerColor);
        sb3.append(str);
        return sb3.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int m23204hashCodeimpl = com.zettle.sdk.headless.readers.ReaderId.m23204hashCodeimpl(this.id);
        int hashCode = this.name.hashCode();
        int hashCode2 = this.readerColor.hashCode();
        int hashCode3 = this.connectionType.hashCode();
        java.lang.String str = this.address;
        int hashCode4 = str == null ? 0 : str.hashCode();
        int hashCode5 = this.readerModel.hashCode();
        boolean z = this.isPowerOn;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        java.lang.Short sh = this.signalStrength;
        int hashCode6 = sh == null ? 0 : sh.hashCode();
        java.lang.String str2 = this.readerCode;
        return (((((((((((((((m23204hashCodeimpl * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i) * 31) + hashCode6) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.headless.readers.DiscoveredReader)) {
            return false;
        }
        com.zettle.sdk.headless.readers.DiscoveredReader discoveredReader = (com.zettle.sdk.headless.readers.DiscoveredReader) other;
        return com.zettle.sdk.headless.readers.ReaderId.m23203equalsimpl0(this.id, discoveredReader.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, discoveredReader.name) && this.readerColor == discoveredReader.readerColor && this.connectionType == discoveredReader.connectionType && kotlin.jvm.internal.Intrinsics.areEqual(this.address, discoveredReader.address) && this.readerModel == discoveredReader.readerModel && this.isPowerOn == discoveredReader.isPowerOn && kotlin.jvm.internal.Intrinsics.areEqual(this.signalStrength, discoveredReader.signalStrength) && kotlin.jvm.internal.Intrinsics.areEqual(this.readerCode, discoveredReader.readerCode);
    }

    /* renamed from: copy-OXOdeMM, reason: not valid java name */
    public final com.zettle.sdk.headless.readers.DiscoveredReader m23194copyOXOdeMM(java.lang.String id, java.lang.String name2, com.zettle.sdk.headless.readers.ReaderColor readerColor, com.zettle.sdk.headless.readers.ConnectionType connectionType, java.lang.String address, com.zettle.sdk.headless.readers.ReaderModel readerModel, boolean isPowerOn, java.lang.Short signalStrength, java.lang.String readerCode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerColor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(readerModel, "");
        return new com.zettle.sdk.headless.readers.DiscoveredReader(id, name2, readerColor, connectionType, address, readerModel, isPowerOn, signalStrength, readerCode, null);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getReaderCode() {
        return this.readerCode;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.Short getSignalStrength() {
        return this.signalStrength;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsPowerOn() {
        return this.isPowerOn;
    }

    /* renamed from: component6, reason: from getter */
    public final com.zettle.sdk.headless.readers.ReaderModel getReaderModel() {
        return this.readerModel;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getAddress() {
        return this.address;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.headless.readers.ConnectionType getConnectionType() {
        return this.connectionType;
    }

    /* renamed from: component3, reason: from getter */
    public final com.zettle.sdk.headless.readers.ReaderColor getReaderColor() {
        return this.readerColor;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1-6QNqO6s, reason: not valid java name and from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ DiscoveredReader(java.lang.String str, java.lang.String str2, com.zettle.sdk.headless.readers.ReaderColor readerColor, com.zettle.sdk.headless.readers.ConnectionType connectionType, java.lang.String str3, com.zettle.sdk.headless.readers.ReaderModel readerModel, boolean z, java.lang.Short sh, java.lang.String str4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, readerColor, connectionType, str3, readerModel, z, sh, str4);
    }
}
