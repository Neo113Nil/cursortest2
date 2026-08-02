package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class MessageSetSchema<T> implements androidx.content.preferences.protobuf.Schema<T> {
    private final androidx.content.preferences.protobuf.MessageLite Camera2StreamConfigurationMap;
    private final androidx.content.preferences.protobuf.ExtensionSchema<?> getHighSpeedVideoFpsRanges;
    private final androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    private MessageSetSchema(androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.content.preferences.protobuf.MessageLite messageLite) {
        this.getHighSpeedVideoFpsRangesFor = unknownFieldSchema;
        this.getHighSpeedVideoSizes = extensionSchema.getHighResolutionOutputSizeshNQ4ISI(messageLite);
        this.getHighSpeedVideoFpsRanges = extensionSchema;
        this.Camera2StreamConfigurationMap = messageLite;
    }

    static <T> androidx.content.preferences.protobuf.MessageSetSchema<T> getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.content.preferences.protobuf.MessageLite messageLite) {
        return new androidx.content.preferences.protobuf.MessageSetSchema<>(unknownFieldSchema, extensionSchema, messageLite);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final T Camera2StreamConfigurationMap() {
        androidx.content.preferences.protobuf.MessageLite messageLite = this.Camera2StreamConfigurationMap;
        if (messageLite instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) {
            return (T) ((androidx.content.preferences.protobuf.GeneratedMessageLite) messageLite).getOutputSizes();
        }
        return (T) messageLite.newBuilderForType().buildPartial();
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final boolean getHighSpeedVideoFpsRangesFor(T t, T t2) {
        if (!this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(t).equals(this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(t2))) {
            return false;
        }
        if (this.getHighSpeedVideoSizes) {
            return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(t).equals(this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(t2));
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final int getHighSpeedVideoFpsRangesFor(T t) {
        int hashCode = this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(t).hashCode();
        return this.getHighSpeedVideoSizes ? (hashCode * 53) + this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(t).hashCode() : hashCode;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final void Camera2StreamConfigurationMap(T t, T t2) {
        androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, t, t2);
        if (this.getHighSpeedVideoSizes) {
            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges, t, t2);
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final void getHighResolutionOutputSizeshNQ4ISI(T t, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> inputSizeshNQ4ISI = this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(t).getInputSizeshNQ4ISI();
        while (inputSizeshNQ4ISI.hasNext()) {
            java.util.Map.Entry<?, java.lang.Object> next = inputSizeshNQ4ISI.next();
            androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite fieldDescriptorLite = (androidx.datastore.preferences.protobuf.FieldSet.FieldDescriptorLite) next.getKey();
            if (fieldDescriptorLite.getLiteJavaType() != androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE || fieldDescriptorLite.isRepeated() || fieldDescriptorLite.isPacked()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof androidx.datastore.preferences.protobuf.LazyField.LazyEntry) {
                writer.getHighSpeedVideoFpsRangesFor(fieldDescriptorLite.getNumber(), ((androidx.datastore.preferences.protobuf.LazyField.LazyEntry) next).getHighSpeedVideoSizes.getValue().toByteString());
            } else {
                writer.getHighSpeedVideoFpsRangesFor(fieldDescriptorLite.getNumber(), next.getValue());
            }
        }
        androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = this.getHighSpeedVideoFpsRangesFor;
        unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?>) unknownFieldSchema.getHighSpeedVideoSizes(t), writer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c9 A[EDGE_INSN: B:24:0x00c9->B:25:0x00c9 BREAK  A[LOOP:1: B:10:0x006d->B:18:0x006d], SYNTHETIC] */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getHighSpeedVideoFpsRangesFor(T t, byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) t;
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            unknownFieldSetLite = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
            generatedMessageLite.unknownFields = unknownFieldSetLite;
        }
        androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> outputMinFrameDurationlomOqCM = ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) t).getOutputMinFrameDurationlomOqCM();
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = null;
        while (i < i2) {
            int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
            int i3 = registers.getHighSpeedVideoSizes;
            if (i3 == androidx.content.preferences.protobuf.WireFormat.getHighResolutionOutputSizeshNQ4ISI) {
                int i4 = 0;
                androidx.content.preferences.protobuf.ByteString byteString = null;
                while (Camera2StreamConfigurationMap < i2) {
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, Camera2StreamConfigurationMap, registers);
                    int i5 = registers.getHighSpeedVideoSizes;
                    int tagFieldNumber = androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i5);
                    int tagWireType = androidx.content.preferences.protobuf.WireFormat.getTagWireType(i5);
                    if (tagFieldNumber != 2) {
                        if (tagFieldNumber == 3) {
                            if (generatedExtension != null) {
                                Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(generatedExtension.getMessageDefaultInstance().getClass()), bArr, Camera2StreamConfigurationMap, i2, registers);
                                outputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, registers.getHighSpeedVideoFpsRangesFor);
                            } else if (tagWireType == 2) {
                                Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr, Camera2StreamConfigurationMap, registers);
                                byteString = (androidx.content.preferences.protobuf.ByteString) registers.getHighSpeedVideoFpsRangesFor;
                            }
                        }
                        if (i5 != androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor) {
                            break;
                        } else {
                            Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(i5, bArr, Camera2StreamConfigurationMap, i2, registers);
                        }
                    } else if (tagWireType == 0) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, Camera2StreamConfigurationMap, registers);
                        i4 = registers.getHighSpeedVideoSizes;
                        generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(registers.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, i4);
                    } else if (i5 != androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor) {
                    }
                }
                if (byteString != null) {
                    unknownFieldSetLite.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap(i4, 2), byteString);
                }
                i = Camera2StreamConfigurationMap;
            } else if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(i3) == 2) {
                androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension2 = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges(registers.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(i3));
                if (generatedExtension2 != null) {
                    i = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(generatedExtension2.getMessageDefaultInstance().getClass()), bArr, Camera2StreamConfigurationMap, i2, registers);
                    outputMinFrameDurationlomOqCM.getHighSpeedVideoSizes(generatedExtension2.Camera2StreamConfigurationMap, registers.getHighSpeedVideoFpsRangesFor);
                } else {
                    i = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i3, bArr, Camera2StreamConfigurationMap, i2, unknownFieldSetLite, registers);
                }
                generatedExtension = generatedExtension2;
            } else {
                i = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(i3, bArr, Camera2StreamConfigurationMap, i2, registers);
            }
        }
        if (i != i2) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final void Camera2StreamConfigurationMap(T t, androidx.content.preferences.protobuf.Reader reader, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        boolean CoroutineDebuggingKt;
        androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = this.getHighSpeedVideoFpsRangesFor;
        androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema = this.getHighSpeedVideoFpsRanges;
        java.lang.Object highSpeedVideoFpsRangesFor = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(t);
        androidx.content.preferences.protobuf.FieldSet<?> highSpeedVideoFpsRangesFor2 = extensionSchema.getHighSpeedVideoFpsRangesFor(t);
        while (reader.getHighSpeedVideoFpsRangesFor() != Integer.MAX_VALUE) {
            try {
                int highResolutionOutputSizeshNQ4ISI = reader.getHighResolutionOutputSizeshNQ4ISI();
                int i = 0;
                if (highResolutionOutputSizeshNQ4ISI != androidx.content.preferences.protobuf.WireFormat.getHighResolutionOutputSizeshNQ4ISI) {
                    if (androidx.content.preferences.protobuf.WireFormat.getTagWireType(highResolutionOutputSizeshNQ4ISI) == 2) {
                        java.lang.Object highSpeedVideoFpsRanges = extensionSchema.getHighSpeedVideoFpsRanges(extensionRegistryLite, this.Camera2StreamConfigurationMap, androidx.content.preferences.protobuf.WireFormat.getTagFieldNumber(highResolutionOutputSizeshNQ4ISI));
                        if (highSpeedVideoFpsRanges != null) {
                            extensionSchema.getHighSpeedVideoFpsRangesFor(reader, highSpeedVideoFpsRanges, extensionRegistryLite, highSpeedVideoFpsRangesFor2);
                        } else {
                            CoroutineDebuggingKt = unknownFieldSchema.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?>) highSpeedVideoFpsRangesFor, reader, 0);
                        }
                    } else {
                        CoroutineDebuggingKt = reader.CoroutineDebuggingKt();
                    }
                    if (!CoroutineDebuggingKt) {
                        return;
                    }
                } else {
                    java.lang.Object obj = null;
                    androidx.content.preferences.protobuf.ByteString byteString = null;
                    while (reader.getHighSpeedVideoFpsRangesFor() != Integer.MAX_VALUE) {
                        int highResolutionOutputSizeshNQ4ISI2 = reader.getHighResolutionOutputSizeshNQ4ISI();
                        if (highResolutionOutputSizeshNQ4ISI2 == androidx.content.preferences.protobuf.WireFormat.Camera2StreamConfigurationMap) {
                            i = reader.unwrapAs();
                            obj = extensionSchema.getHighSpeedVideoFpsRanges(extensionRegistryLite, this.Camera2StreamConfigurationMap, i);
                        } else if (highResolutionOutputSizeshNQ4ISI2 == androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRanges) {
                            if (obj != null) {
                                extensionSchema.getHighSpeedVideoFpsRangesFor(reader, obj, extensionRegistryLite, highSpeedVideoFpsRangesFor2);
                            } else {
                                byteString = reader.Camera2StreamConfigurationMap();
                            }
                        } else if (!reader.CoroutineDebuggingKt()) {
                            break;
                        }
                    }
                    if (reader.getHighResolutionOutputSizeshNQ4ISI() != androidx.content.preferences.protobuf.WireFormat.getHighSpeedVideoFpsRangesFor) {
                        throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoFpsRangesFor();
                    }
                    if (byteString != null) {
                        if (obj != null) {
                            extensionSchema.getHighSpeedVideoFpsRanges(byteString, obj, extensionRegistryLite, highSpeedVideoFpsRangesFor2);
                        } else {
                            unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, i, byteString);
                        }
                    }
                }
            } finally {
                unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) t, (T) highSpeedVideoFpsRangesFor);
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final void getHighSpeedVideoFpsRanges(T t) {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges(t);
        this.getHighSpeedVideoFpsRanges.Camera2StreamConfigurationMap(t);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final boolean Camera2StreamConfigurationMap(T t) {
        return this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(t).Camera2StreamConfigurationMap();
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final int getHighSpeedVideoSizes(T t) {
        androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = this.getHighSpeedVideoFpsRangesFor;
        int highResolutionOutputSizeshNQ4ISI = unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI(unknownFieldSchema.getHighSpeedVideoSizes(t));
        return this.getHighSpeedVideoSizes ? highResolutionOutputSizeshNQ4ISI + this.getHighSpeedVideoFpsRanges.getHighResolutionOutputSizeshNQ4ISI(t).getHighResolutionOutputSizeshNQ4ISI() : highResolutionOutputSizeshNQ4ISI;
    }
}
