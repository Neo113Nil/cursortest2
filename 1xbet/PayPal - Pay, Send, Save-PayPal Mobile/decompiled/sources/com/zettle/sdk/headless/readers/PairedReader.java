package com.zettle.sdk.headless.readers;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001B|\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001b\u001a\u00020\u0002HÆ\u0003ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b*\u0010\u001aJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b+\u0010\u001aJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010\u001aJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b-\u0010\u001aJ\u009f\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u0006HÆ\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00106\u001a\u000205HÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b8\u0010\u001aR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010\u001aR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010)R\u001a\u0010\u0011\u001a\u00020\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010?\u001a\u0004\b@\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\bA\u0010\u001aR\u001d\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\bB\u0010\u001aR\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010C\u001a\u0004\bD\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\bE\u0010\u001aR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010;\u001a\u0004\bF\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\bG\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bI\u0010$R\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010;\u001a\u0004\bJ\u0010\u001aR\u001a\u0010\u0015\u001a\u00020\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010K\u001a\u0004\bL\u0010!\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!"}, d2 = {"Lcom/zettle/sdk/headless/readers/PairedReader;", "", "Lcom/zettle/sdk/headless/readers/ReaderId;", "id", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "state", "", "name", "Lcom/zettle/sdk/headless/readers/ReaderModel;", "model", "Lcom/zettle/sdk/headless/readers/ReaderColor;", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_COLOR, "serialNumber", "paVersion", "firmwareVersion", "bluetoothVersion", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "connectionType", "Lcom/zettle/sdk/headless/readers/BatteryInfo;", "battery", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "update", "tag", "<init>", "(Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderConnectionState;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderModel;Lcom/zettle/sdk/headless/readers/ReaderColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ConnectionType;Lcom/zettle/sdk/headless/readers/BatteryInfo;Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-6QNqO6s", "()Ljava/lang/String;", "component1", "component10", "()Lcom/zettle/sdk/headless/readers/ConnectionType;", "component11", "()Lcom/zettle/sdk/headless/readers/BatteryInfo;", "component12", "()Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "component13", "component2", "()Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "component3", "component4", "()Lcom/zettle/sdk/headless/readers/ReaderModel;", "component5", "()Lcom/zettle/sdk/headless/readers/ReaderColor;", "component6", "component7", "component8", "component9", "copy-OReJ8P4", "(Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderConnectionState;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ReaderModel;Lcom/zettle/sdk/headless/readers/ReaderColor;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zettle/sdk/headless/readers/ConnectionType;Lcom/zettle/sdk/headless/readers/BatteryInfo;Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;Ljava/lang/String;)Lcom/zettle/sdk/headless/readers/PairedReader;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/zettle/sdk/headless/readers/BatteryInfo;", "getBattery", "Ljava/lang/String;", "getBluetoothVersion", "Lcom/zettle/sdk/headless/readers/ReaderColor;", "getColor", "Lcom/zettle/sdk/headless/readers/ConnectionType;", "getConnectionType", "getFirmwareVersion", "getId-6QNqO6s", "Lcom/zettle/sdk/headless/readers/ReaderModel;", "getModel", "getName", "getPaVersion", "getSerialNumber", "Lcom/zettle/sdk/headless/readers/ReaderConnectionState;", "getState", "getTag", "Lcom/zettle/sdk/headless/readers/ReaderSoftwareUpdateState;", "getUpdate"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class PairedReader {
    private final com.zettle.sdk.headless.readers.BatteryInfo battery;
    private final java.lang.String bluetoothVersion;
    private final com.zettle.sdk.headless.readers.ReaderColor color;
    private final com.zettle.sdk.headless.readers.ConnectionType connectionType;
    private final java.lang.String firmwareVersion;
    private final java.lang.String id;
    private final com.zettle.sdk.headless.readers.ReaderModel model;
    private final java.lang.String name;
    private final java.lang.String paVersion;
    private final java.lang.String serialNumber;
    private final com.zettle.sdk.headless.readers.ReaderConnectionState state;
    private final java.lang.String tag;
    private final com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState update;

    private PairedReader(java.lang.String str, com.zettle.sdk.headless.readers.ReaderConnectionState readerConnectionState, java.lang.String str2, com.zettle.sdk.headless.readers.ReaderModel readerModel, com.zettle.sdk.headless.readers.ReaderColor readerColor, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.zettle.sdk.headless.readers.ConnectionType connectionType, com.zettle.sdk.headless.readers.BatteryInfo batteryInfo, com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState readerSoftwareUpdateState, java.lang.String str7) {
        this.id = str;
        this.state = readerConnectionState;
        this.name = str2;
        this.model = readerModel;
        this.color = readerColor;
        this.serialNumber = str3;
        this.paVersion = str4;
        this.firmwareVersion = str5;
        this.bluetoothVersion = str6;
        this.connectionType = connectionType;
        this.battery = batteryInfo;
        this.update = readerSoftwareUpdateState;
        this.tag = str7;
    }

    /* renamed from: getId-6QNqO6s, reason: not valid java name */
    public final java.lang.String m23199getId6QNqO6s() {
        return this.id;
    }

    public final com.zettle.sdk.headless.readers.ReaderConnectionState getState() {
        return this.state;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.zettle.sdk.headless.readers.ReaderModel getModel() {
        return this.model;
    }

    public final com.zettle.sdk.headless.readers.ReaderColor getColor() {
        return this.color;
    }

    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    public final java.lang.String getPaVersion() {
        return this.paVersion;
    }

    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    public final java.lang.String getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    public final com.zettle.sdk.headless.readers.ConnectionType getConnectionType() {
        return this.connectionType;
    }

    public final com.zettle.sdk.headless.readers.BatteryInfo getBattery() {
        return this.battery;
    }

    public final com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState getUpdate() {
        return this.update;
    }

    public final java.lang.String getTag() {
        return this.tag;
    }

    public final java.lang.String toString() {
        java.lang.String m23205toStringimpl = com.zettle.sdk.headless.readers.ReaderId.m23205toStringimpl(this.id);
        com.zettle.sdk.headless.readers.ReaderConnectionState readerConnectionState = this.state;
        java.lang.String str = this.name;
        com.zettle.sdk.headless.readers.ReaderModel readerModel = this.model;
        com.zettle.sdk.headless.readers.ReaderColor readerColor = this.color;
        java.lang.String str2 = this.serialNumber;
        java.lang.String str3 = this.paVersion;
        java.lang.String str4 = this.firmwareVersion;
        java.lang.String str5 = this.bluetoothVersion;
        com.zettle.sdk.headless.readers.ConnectionType connectionType = this.connectionType;
        com.zettle.sdk.headless.readers.BatteryInfo batteryInfo = this.battery;
        com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState readerSoftwareUpdateState = this.update;
        java.lang.String str6 = this.tag;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("PairedReader(id=");
        sb.append(m23205toStringimpl);
        sb.append(", state=");
        sb.append(readerConnectionState);
        sb.append(", name=");
        sb.append(str);
        sb.append(", model=");
        sb.append(readerModel);
        sb.append(", color=");
        sb.append(readerColor);
        sb.append(", serialNumber=");
        sb.append(str2);
        sb.append(", paVersion=");
        sb.append(str3);
        sb.append(", firmwareVersion=");
        sb.append(str4);
        sb.append(", bluetoothVersion=");
        sb.append(str5);
        sb.append(", connectionType=");
        sb.append(connectionType);
        sb.append(", battery=");
        sb.append(batteryInfo);
        sb.append(", update=");
        sb.append(readerSoftwareUpdateState);
        sb.append(", tag=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int m23204hashCodeimpl = com.zettle.sdk.headless.readers.ReaderId.m23204hashCodeimpl(this.id);
        int hashCode = this.state.hashCode();
        int hashCode2 = this.name.hashCode();
        int hashCode3 = this.model.hashCode();
        int hashCode4 = this.color.hashCode();
        java.lang.String str = this.serialNumber;
        int hashCode5 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.paVersion;
        int hashCode6 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.firmwareVersion;
        int hashCode7 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.bluetoothVersion;
        int hashCode8 = str4 == null ? 0 : str4.hashCode();
        int hashCode9 = this.connectionType.hashCode();
        com.zettle.sdk.headless.readers.BatteryInfo batteryInfo = this.battery;
        return (((((((((((((((((((((((m23204hashCodeimpl * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + (batteryInfo != null ? batteryInfo.hashCode() : 0)) * 31) + this.update.hashCode()) * 31) + this.tag.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.zettle.sdk.headless.readers.PairedReader)) {
            return false;
        }
        com.zettle.sdk.headless.readers.PairedReader pairedReader = (com.zettle.sdk.headless.readers.PairedReader) other;
        return com.zettle.sdk.headless.readers.ReaderId.m23203equalsimpl0(this.id, pairedReader.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.state, pairedReader.state) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, pairedReader.name) && this.model == pairedReader.model && this.color == pairedReader.color && kotlin.jvm.internal.Intrinsics.areEqual(this.serialNumber, pairedReader.serialNumber) && kotlin.jvm.internal.Intrinsics.areEqual(this.paVersion, pairedReader.paVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.firmwareVersion, pairedReader.firmwareVersion) && kotlin.jvm.internal.Intrinsics.areEqual(this.bluetoothVersion, pairedReader.bluetoothVersion) && this.connectionType == pairedReader.connectionType && kotlin.jvm.internal.Intrinsics.areEqual(this.battery, pairedReader.battery) && kotlin.jvm.internal.Intrinsics.areEqual(this.update, pairedReader.update) && kotlin.jvm.internal.Intrinsics.areEqual(this.tag, pairedReader.tag);
    }

    /* renamed from: copy-OReJ8P4, reason: not valid java name */
    public final com.zettle.sdk.headless.readers.PairedReader m23198copyOReJ8P4(java.lang.String id, com.zettle.sdk.headless.readers.ReaderConnectionState state, java.lang.String name2, com.zettle.sdk.headless.readers.ReaderModel model, com.zettle.sdk.headless.readers.ReaderColor color, java.lang.String serialNumber, java.lang.String paVersion, java.lang.String firmwareVersion, java.lang.String bluetoothVersion, com.zettle.sdk.headless.readers.ConnectionType connectionType, com.zettle.sdk.headless.readers.BatteryInfo battery, com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState update, java.lang.String tag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(model, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(color, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(connectionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(update, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        return new com.zettle.sdk.headless.readers.PairedReader(id, state, name2, model, color, serialNumber, paVersion, firmwareVersion, bluetoothVersion, connectionType, battery, update, tag, null);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getBluetoothVersion() {
        return this.bluetoothVersion;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getFirmwareVersion() {
        return this.firmwareVersion;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getPaVersion() {
        return this.paVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getSerialNumber() {
        return this.serialNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final com.zettle.sdk.headless.readers.ReaderColor getColor() {
        return this.color;
    }

    /* renamed from: component4, reason: from getter */
    public final com.zettle.sdk.headless.readers.ReaderModel getModel() {
        return this.model;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final com.zettle.sdk.headless.readers.ReaderConnectionState getState() {
        return this.state;
    }

    /* renamed from: component13, reason: from getter */
    public final java.lang.String getTag() {
        return this.tag;
    }

    /* renamed from: component12, reason: from getter */
    public final com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState getUpdate() {
        return this.update;
    }

    /* renamed from: component11, reason: from getter */
    public final com.zettle.sdk.headless.readers.BatteryInfo getBattery() {
        return this.battery;
    }

    /* renamed from: component10, reason: from getter */
    public final com.zettle.sdk.headless.readers.ConnectionType getConnectionType() {
        return this.connectionType;
    }

    /* renamed from: component1-6QNqO6s, reason: not valid java name and from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public /* synthetic */ PairedReader(java.lang.String str, com.zettle.sdk.headless.readers.ReaderConnectionState readerConnectionState, java.lang.String str2, com.zettle.sdk.headless.readers.ReaderModel readerModel, com.zettle.sdk.headless.readers.ReaderColor readerColor, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, com.zettle.sdk.headless.readers.ConnectionType connectionType, com.zettle.sdk.headless.readers.BatteryInfo batteryInfo, com.zettle.sdk.headless.readers.ReaderSoftwareUpdateState readerSoftwareUpdateState, java.lang.String str7, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, readerConnectionState, str2, readerModel, readerColor, str3, str4, str5, str6, connectionType, batteryInfo, readerSoftwareUpdateState, str7);
    }
}
