package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
class UnknownFieldSetLiteSchema extends androidx.content.preferences.protobuf.UnknownFieldSchema<androidx.content.preferences.protobuf.UnknownFieldSetLite, androidx.content.preferences.protobuf.UnknownFieldSetLite> {
    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ int Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSize();
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ androidx.content.preferences.protobuf.UnknownFieldSetLite Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite2) {
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite3 = unknownFieldSetLite;
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite4 = unknownFieldSetLite2;
        if (androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite4)) {
            return unknownFieldSetLite3;
        }
        if (androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite3)) {
            return androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes(unknownFieldSetLite3, unknownFieldSetLite4);
        }
        if (unknownFieldSetLite4.equals(androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance())) {
            return unknownFieldSetLite3;
        }
        if (unknownFieldSetLite3.getHighSpeedVideoFpsRanges) {
            int i = unknownFieldSetLite3.getHighSpeedVideoSizes + unknownFieldSetLite4.getHighSpeedVideoSizes;
            unknownFieldSetLite3.getHighSpeedVideoFpsRanges(i);
            java.lang.System.arraycopy(unknownFieldSetLite4.Camera2StreamConfigurationMap, 0, unknownFieldSetLite3.Camera2StreamConfigurationMap, unknownFieldSetLite3.getHighSpeedVideoSizes, unknownFieldSetLite4.getHighSpeedVideoSizes);
            java.lang.System.arraycopy(unknownFieldSetLite4.getHighResolutionOutputSizeshNQ4ISI, 0, unknownFieldSetLite3.getHighResolutionOutputSizeshNQ4ISI, unknownFieldSetLite3.getHighSpeedVideoSizes, unknownFieldSetLite4.getHighSpeedVideoSizes);
            unknownFieldSetLite3.getHighSpeedVideoSizes = i;
            return unknownFieldSetLite3;
        }
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, int i, int i2) {
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 5), java.lang.Integer.valueOf(i2));
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ int getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        return unknownFieldSetLite.getSerializedSizeAsMessageSet();
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, int i, androidx.content.preferences.protobuf.ByteString byteString) {
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 2), byteString);
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        if (writer.getHighResolutionOutputSizeshNQ4ISI() == androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING) {
            for (int i = unknownFieldSetLite2.getHighSpeedVideoSizes - 1; i >= 0; i--) {
                writer.getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(unknownFieldSetLite2.Camera2StreamConfigurationMap[i]), unknownFieldSetLite2.getHighResolutionOutputSizeshNQ4ISI[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < unknownFieldSetLite2.getHighSpeedVideoSizes; i2++) {
            writer.getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(unknownFieldSetLite2.Camera2StreamConfigurationMap[i2]), unknownFieldSetLite2.getHighResolutionOutputSizeshNQ4ISI[i2]);
        }
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* bridge */ /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj, androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        ((androidx.content.preferences.protobuf.GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 0), java.lang.Long.valueOf(j));
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, int i, androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite2) {
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 3), unknownFieldSetLite2);
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, int i, long j) {
        unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i, 1), java.lang.Long.valueOf(j));
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        unknownFieldSetLite.writeTo(writer);
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* bridge */ /* synthetic */ void getHighSpeedVideoSizes(java.lang.Object obj, androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        ((androidx.content.preferences.protobuf.GeneratedMessageLite) obj).unknownFields = unknownFieldSetLite;
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ androidx.content.preferences.protobuf.UnknownFieldSetLite getInputSizeshNQ4ISI(androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite) {
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite2 = unknownFieldSetLite;
        unknownFieldSetLite2.makeImmutable();
        return unknownFieldSetLite2;
    }

    UnknownFieldSetLiteSchema() {
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ androidx.content.preferences.protobuf.UnknownFieldSetLite getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) obj;
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        androidx.content.preferences.protobuf.UnknownFieldSetLite highSpeedVideoSizes = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
        generatedMessageLite.unknownFields = highSpeedVideoSizes;
        return highSpeedVideoSizes;
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* bridge */ /* synthetic */ androidx.content.preferences.protobuf.UnknownFieldSetLite getHighSpeedVideoSizes(java.lang.Object obj) {
        return ((androidx.content.preferences.protobuf.GeneratedMessageLite) obj).unknownFields;
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final void getHighSpeedVideoFpsRanges(java.lang.Object obj) {
        ((androidx.content.preferences.protobuf.GeneratedMessageLite) obj).unknownFields.makeImmutable();
    }

    @Override // androidx.content.preferences.protobuf.UnknownFieldSchema
    final /* synthetic */ androidx.content.preferences.protobuf.UnknownFieldSetLite getHighResolutionOutputSizeshNQ4ISI() {
        return androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
    }
}
