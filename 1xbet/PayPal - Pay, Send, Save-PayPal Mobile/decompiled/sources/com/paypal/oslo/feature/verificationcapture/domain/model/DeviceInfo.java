package com.paypal.oslo.feature.verificationcapture.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b'\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0012Jv\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u0014J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b)\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b*\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b\t\u0010\u0018R\u001a\u0010\n\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b\n\u0010\u0018R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b,\u0010\u0012R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b-\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010%\u001a\u0004\b.\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b/\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "", "", "clientOs", "", "screenSizeX", "screenSizeY", "touchPoint", "", "isRoot", "isEmulator", "macAddrs", "board", "cpuAbi1", "cpuArch", "<init>", "(Ljava/lang/String;IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "()Z", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;IIIZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/verificationcapture/domain/model/DeviceInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Ljava/lang/String;", "getClientOs", com.visa.cbp.getEncExpo.warmup, "getScreenSizeX", "getScreenSizeY", "getTouchPoint", "Z", "getMacAddrs", "getBoard", "getCpuAbi1", "getCpuArch"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class DeviceInfo {
    public static final int $stable = 0;
    private final java.lang.String board;
    private final java.lang.String clientOs;
    private final java.lang.String cpuAbi1;
    private final java.lang.String cpuArch;
    private final boolean isEmulator;
    private final boolean isRoot;
    private final java.lang.String macAddrs;
    private final int screenSizeX;
    private final int screenSizeY;
    private final int touchPoint;

    public DeviceInfo(java.lang.String str, int i, int i2, int i3, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.clientOs = str;
        this.screenSizeX = i;
        this.screenSizeY = i2;
        this.touchPoint = i3;
        this.isRoot = z;
        this.isEmulator = z2;
        this.macAddrs = str2;
        this.board = str3;
        this.cpuAbi1 = str4;
        this.cpuArch = str5;
    }

    public /* synthetic */ DeviceInfo(java.lang.String str, int i, int i2, int i3, boolean z, boolean z2, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, i2, (i4 & 8) != 0 ? 1 : i3, z, z2, (i4 & 64) != 0 ? null : str2, str3, str4, str5);
    }

    public final java.lang.String getClientOs() {
        return this.clientOs;
    }

    public final int getScreenSizeX() {
        return this.screenSizeX;
    }

    public final int getScreenSizeY() {
        return this.screenSizeY;
    }

    public final int getTouchPoint() {
        return this.touchPoint;
    }

    public final boolean isRoot() {
        return this.isRoot;
    }

    public final boolean isEmulator() {
        return this.isEmulator;
    }

    public final java.lang.String getMacAddrs() {
        return this.macAddrs;
    }

    public final java.lang.String getBoard() {
        return this.board;
    }

    public final java.lang.String getCpuAbi1() {
        return this.cpuAbi1;
    }

    public final java.lang.String getCpuArch() {
        return this.cpuArch;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.clientOs;
        int i = this.screenSizeX;
        int i2 = this.screenSizeY;
        int i3 = this.touchPoint;
        boolean z = this.isRoot;
        boolean z2 = this.isEmulator;
        java.lang.String str2 = this.macAddrs;
        java.lang.String str3 = this.board;
        java.lang.String str4 = this.cpuAbi1;
        java.lang.String str5 = this.cpuArch;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DeviceInfo(clientOs=");
        sb.append(str);
        sb.append(", screenSizeX=");
        sb.append(i);
        sb.append(", screenSizeY=");
        sb.append(i2);
        sb.append(", touchPoint=");
        sb.append(i3);
        sb.append(", isRoot=");
        sb.append(z);
        sb.append(", isEmulator=");
        sb.append(z2);
        sb.append(", macAddrs=");
        sb.append(str2);
        sb.append(", board=");
        sb.append(str3);
        sb.append(", cpuAbi1=");
        sb.append(str4);
        sb.append(", cpuArch=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.clientOs.hashCode();
        int hashCode2 = java.lang.Integer.hashCode(this.screenSizeX);
        int hashCode3 = java.lang.Integer.hashCode(this.screenSizeY);
        int hashCode4 = java.lang.Integer.hashCode(this.touchPoint);
        int hashCode5 = java.lang.Boolean.hashCode(this.isRoot);
        int hashCode6 = java.lang.Boolean.hashCode(this.isEmulator);
        java.lang.String str = this.macAddrs;
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.board.hashCode()) * 31) + this.cpuAbi1.hashCode()) * 31) + this.cpuArch.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo)) {
            return false;
        }
        com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo deviceInfo = (com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.clientOs, deviceInfo.clientOs) && this.screenSizeX == deviceInfo.screenSizeX && this.screenSizeY == deviceInfo.screenSizeY && this.touchPoint == deviceInfo.touchPoint && this.isRoot == deviceInfo.isRoot && this.isEmulator == deviceInfo.isEmulator && kotlin.jvm.internal.Intrinsics.areEqual(this.macAddrs, deviceInfo.macAddrs) && kotlin.jvm.internal.Intrinsics.areEqual(this.board, deviceInfo.board) && kotlin.jvm.internal.Intrinsics.areEqual(this.cpuAbi1, deviceInfo.cpuAbi1) && kotlin.jvm.internal.Intrinsics.areEqual(this.cpuArch, deviceInfo.cpuArch);
    }

    public final com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo copy(java.lang.String clientOs, int screenSizeX, int screenSizeY, int touchPoint, boolean isRoot, boolean isEmulator, java.lang.String macAddrs, java.lang.String board, java.lang.String cpuAbi1, java.lang.String cpuArch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientOs, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(board, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpuAbi1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cpuArch, "");
        return new com.paypal.oslo.feature.verificationcapture.domain.model.DeviceInfo(clientOs, screenSizeX, screenSizeY, touchPoint, isRoot, isEmulator, macAddrs, board, cpuAbi1, cpuArch);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getCpuAbi1() {
        return this.cpuAbi1;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getBoard() {
        return this.board;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getMacAddrs() {
        return this.macAddrs;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsEmulator() {
        return this.isEmulator;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsRoot() {
        return this.isRoot;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTouchPoint() {
        return this.touchPoint;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScreenSizeY() {
        return this.screenSizeY;
    }

    /* renamed from: component2, reason: from getter */
    public final int getScreenSizeX() {
        return this.screenSizeX;
    }

    /* renamed from: component10, reason: from getter */
    public final java.lang.String getCpuArch() {
        return this.cpuArch;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getClientOs() {
        return this.clientOs;
    }
}
