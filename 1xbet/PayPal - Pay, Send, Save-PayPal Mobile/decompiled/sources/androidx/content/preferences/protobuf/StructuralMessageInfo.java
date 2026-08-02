package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class StructuralMessageInfo implements androidx.content.preferences.protobuf.MessageInfo {
    final androidx.content.preferences.protobuf.ProtoSyntax Camera2StreamConfigurationMap;
    final androidx.content.preferences.protobuf.FieldInfo[] getHighResolutionOutputSizeshNQ4ISI;
    final int[] getHighSpeedVideoFpsRanges;
    final androidx.content.preferences.protobuf.MessageLite getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    StructuralMessageInfo(androidx.content.preferences.protobuf.ProtoSyntax protoSyntax, boolean z, int[] iArr, androidx.content.preferences.protobuf.FieldInfo[] fieldInfoArr, java.lang.Object obj) {
        this.Camera2StreamConfigurationMap = protoSyntax;
        this.getHighSpeedVideoSizes = z;
        this.getHighSpeedVideoFpsRanges = iArr;
        this.getHighResolutionOutputSizeshNQ4ISI = fieldInfoArr;
        this.getHighSpeedVideoFpsRangesFor = (androidx.content.preferences.protobuf.MessageLite) androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(obj, "defaultInstance");
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public final androidx.content.preferences.protobuf.ProtoSyntax getHighResolutionOutputSizeshNQ4ISI() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public final boolean getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.content.preferences.protobuf.MessageInfo
    public final androidx.content.preferences.protobuf.MessageLite Camera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* loaded from: classes7.dex */
    public static final class Builder {
        private java.lang.Object Camera2StreamConfigurationMap;
        private androidx.content.preferences.protobuf.ProtoSyntax getHighResolutionOutputSizeshNQ4ISI;
        private final java.util.List<androidx.content.preferences.protobuf.FieldInfo> getHighSpeedVideoFpsRanges;
        private int[] getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;

        public Builder() {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
        }

        public Builder(int i) {
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList(i);
        }

        public final void withDefaultInstance(java.lang.Object obj) {
            this.Camera2StreamConfigurationMap = obj;
        }

        public final void withSyntax(androidx.content.preferences.protobuf.ProtoSyntax protoSyntax) {
            this.getHighResolutionOutputSizeshNQ4ISI = (androidx.content.preferences.protobuf.ProtoSyntax) androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(protoSyntax, "syntax");
        }

        public final void withMessageSetWireFormat(boolean z) {
            this.getHighSpeedVideoSizes = z;
        }

        public final void withCheckInitialized(int[] iArr) {
            this.getHighSpeedVideoFpsRangesFor = iArr;
        }

        public final void withField(androidx.content.preferences.protobuf.FieldInfo fieldInfo) {
            if (this.getHighSpeedVideoSizesFor) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            this.getHighSpeedVideoFpsRanges.add(fieldInfo);
        }

        public final androidx.content.preferences.protobuf.StructuralMessageInfo build() {
            if (this.getHighSpeedVideoSizesFor) {
                throw new java.lang.IllegalStateException("Builder can only build once");
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
                throw new java.lang.IllegalStateException("Must specify a proto syntax");
            }
            this.getHighSpeedVideoSizesFor = true;
            java.util.Collections.sort(this.getHighSpeedVideoFpsRanges);
            return new androidx.content.preferences.protobuf.StructuralMessageInfo(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, (androidx.content.preferences.protobuf.FieldInfo[]) this.getHighSpeedVideoFpsRanges.toArray(new androidx.content.preferences.protobuf.FieldInfo[0]), this.Camera2StreamConfigurationMap);
        }
    }
}
