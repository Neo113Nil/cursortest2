package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class RawMessageInfo implements androidx.content.preferences.protobuf.MessageInfo {
    final java.lang.Object[] Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRanges;
    final androidx.content.preferences.protobuf.MessageLite getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoSizes;

    RawMessageInfo(androidx.content.preferences.protobuf.MessageLite messageLite, java.lang.String str, java.lang.Object[] objArr) {
        this.getHighSpeedVideoFpsRangesFor = messageLite;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.getHighSpeedVideoFpsRanges = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            char charAt2 = str.charAt(i2);
            if (charAt2 < 55296) {
                this.getHighSpeedVideoFpsRanges = i | (charAt2 << i3);
                return;
            } else {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2++;
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public final androidx.content.preferences.protobuf.MessageLite Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public final androidx.content.preferences.protobuf.ProtoSyntax getHighResolutionOutputSizeshNQ4ISI() {
        int i = this.getHighSpeedVideoFpsRanges;
        if ((i & 1) != 0) {
            return androidx.content.preferences.protobuf.ProtoSyntax.PROTO2;
        }
        if ((i & 4) == 4) {
            return androidx.content.preferences.protobuf.ProtoSyntax.EDITIONS;
        }
        return androidx.content.preferences.protobuf.ProtoSyntax.PROTO3;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public final boolean getHighSpeedVideoFpsRangesFor() {
        return (this.getHighSpeedVideoFpsRanges & 2) == 2;
    }
}
