package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class ExtensionSchemaLite extends androidx.content.preferences.protobuf.ExtensionSchema<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> {
    ExtensionSchemaLite() {
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final boolean getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.MessageLite messageLite) {
        return messageLite instanceof androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage;
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> getHighSpeedVideoFpsRangesFor(java.lang.Object obj) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) obj).getOutputMinFrameDurationlomOqCM();
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final <UT, UB> UB getHighSpeedVideoFpsRangesFor(java.lang.Object obj, androidx.content.preferences.protobuf.Reader reader, java.lang.Object obj2, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema) throws java.io.IOException {
        java.lang.Object valueOf;
        java.util.ArrayList arrayList;
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.Camera2StreamConfigurationMap.isRepeated() && generatedExtension.Camera2StreamConfigurationMap.isPacked()) {
            switch (androidx.content.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.getHighSpeedVideoFpsRanges[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new java.util.ArrayList();
                    reader.getHighSpeedVideoSizes(arrayList);
                    break;
                case 2:
                    arrayList = new java.util.ArrayList();
                    reader.getInputSizeshNQ4ISI(arrayList);
                    break;
                case 3:
                    arrayList = new java.util.ArrayList();
                    reader.getInputFormats(arrayList);
                    break;
                case 4:
                    arrayList = new java.util.ArrayList();
                    reader.isOutputSupportedFor(arrayList);
                    break;
                case 5:
                    arrayList = new java.util.ArrayList();
                    reader.getOutputFormats(arrayList);
                    break;
                case 6:
                    arrayList = new java.util.ArrayList();
                    reader.getOutputMinFrameDuration(arrayList);
                    break;
                case 7:
                    arrayList = new java.util.ArrayList();
                    reader.getHighSpeedVideoFpsRanges(arrayList);
                    break;
                case 8:
                    arrayList = new java.util.ArrayList();
                    reader.getHighResolutionOutputSizeshNQ4ISI(arrayList);
                    break;
                case 9:
                    arrayList = new java.util.ArrayList();
                    reader.toString(arrayList);
                    break;
                case 10:
                    arrayList = new java.util.ArrayList();
                    reader.getHighSpeedVideoSizesFor(arrayList);
                    break;
                case 11:
                    arrayList = new java.util.ArrayList();
                    reader.getOutputSizes(arrayList);
                    break;
                case 12:
                    arrayList = new java.util.ArrayList();
                    reader.getOutputSizeshNQ4ISI(arrayList);
                    break;
                case 13:
                    arrayList = new java.util.ArrayList();
                    reader.getOutputStallDuration(arrayList);
                    break;
                case 14:
                    arrayList = new java.util.ArrayList();
                    reader.getHighSpeedVideoFpsRangesFor(arrayList);
                    ub = (UB) androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(obj, number, arrayList, generatedExtension.Camera2StreamConfigurationMap.getEnumType(), ub, unknownFieldSchema);
                    break;
                default:
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Type cannot be packed: ");
                    sb.append(generatedExtension.Camera2StreamConfigurationMap.getLiteType());
                    throw new java.lang.IllegalStateException(sb.toString());
            }
            fieldSet.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, arrayList);
            return ub;
        }
        if (generatedExtension.getLiteType() == androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM) {
            int outputMinFrameDuration = reader.getOutputMinFrameDuration();
            if (generatedExtension.Camera2StreamConfigurationMap.getEnumType().findValueByNumber(outputMinFrameDuration) == null) {
                return (UB) androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(obj, number, outputMinFrameDuration, ub, unknownFieldSchema);
            }
            valueOf = java.lang.Integer.valueOf(outputMinFrameDuration);
        } else {
            switch (androidx.content.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.getHighSpeedVideoFpsRanges[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    valueOf = java.lang.Double.valueOf(reader.getHighSpeedVideoSizes());
                    break;
                case 2:
                    valueOf = java.lang.Float.valueOf(reader.getHighSpeedVideoSizesFor());
                    break;
                case 3:
                    valueOf = java.lang.Long.valueOf(reader.getOutputStallDuration());
                    break;
                case 4:
                    valueOf = java.lang.Long.valueOf(reader.getValidOutputFormatsForInputhNQ4ISI());
                    break;
                case 5:
                    valueOf = java.lang.Integer.valueOf(reader.getOutputMinFrameDuration());
                    break;
                case 6:
                    valueOf = java.lang.Long.valueOf(reader.getInputSizeshNQ4ISI());
                    break;
                case 7:
                    valueOf = java.lang.Integer.valueOf(reader.getInputFormats());
                    break;
                case 8:
                    valueOf = java.lang.Boolean.valueOf(reader.getHighSpeedVideoFpsRanges());
                    break;
                case 9:
                    valueOf = java.lang.Integer.valueOf(reader.unwrapAs());
                    break;
                case 10:
                    valueOf = java.lang.Integer.valueOf(reader.getOutputMinFrameDurationlomOqCM());
                    break;
                case 11:
                    valueOf = java.lang.Long.valueOf(reader.getOutputSizeshNQ4ISI());
                    break;
                case 12:
                    valueOf = java.lang.Integer.valueOf(reader.getOutputStallDurationlomOqCM());
                    break;
                case 13:
                    valueOf = java.lang.Long.valueOf(reader.getOutputSizes());
                    break;
                case 14:
                    throw new java.lang.IllegalStateException("Shouldn't reach here.");
                case 15:
                    valueOf = reader.Camera2StreamConfigurationMap();
                    break;
                case 16:
                    valueOf = reader.isOutputSupportedForhNQ4ISI();
                    break;
                case 17:
                    if (!generatedExtension.isRepeated()) {
                        java.lang.Object obj3 = fieldSet.getHighSpeedVideoFpsRangesFor.get(generatedExtension.Camera2StreamConfigurationMap);
                        if (obj3 instanceof androidx.content.preferences.protobuf.LazyField) {
                            obj3 = ((androidx.content.preferences.protobuf.LazyField) obj3).getValue();
                        }
                        if (obj3 instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) {
                            androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj3.getClass());
                            if (!((androidx.content.preferences.protobuf.GeneratedMessageLite) obj3).getOutputStallDurationlomOqCM()) {
                                java.lang.Object Camera2StreamConfigurationMap = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap();
                                highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, obj3);
                                fieldSet.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap);
                                obj3 = Camera2StreamConfigurationMap;
                            }
                            reader.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.Reader) obj3, (androidx.content.preferences.protobuf.Schema<androidx.content.preferences.protobuf.Reader>) highResolutionOutputSizeshNQ4ISI, extensionRegistryLite);
                            return ub;
                        }
                    }
                    valueOf = reader.getHighSpeedVideoSizes(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                case 18:
                    if (!generatedExtension.isRepeated()) {
                        java.lang.Object obj4 = fieldSet.getHighSpeedVideoFpsRangesFor.get(generatedExtension.Camera2StreamConfigurationMap);
                        if (obj4 instanceof androidx.content.preferences.protobuf.LazyField) {
                            obj4 = ((androidx.content.preferences.protobuf.LazyField) obj4).getValue();
                        }
                        if (obj4 instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) {
                            androidx.content.preferences.protobuf.Schema highResolutionOutputSizeshNQ4ISI2 = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj4.getClass());
                            if (!((androidx.content.preferences.protobuf.GeneratedMessageLite) obj4).getOutputStallDurationlomOqCM()) {
                                java.lang.Object Camera2StreamConfigurationMap2 = highResolutionOutputSizeshNQ4ISI2.Camera2StreamConfigurationMap();
                                highResolutionOutputSizeshNQ4ISI2.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, obj4);
                                fieldSet.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, Camera2StreamConfigurationMap2);
                                obj4 = Camera2StreamConfigurationMap2;
                            }
                            reader.getHighSpeedVideoFpsRanges(obj4, highResolutionOutputSizeshNQ4ISI2, extensionRegistryLite);
                            return ub;
                        }
                    }
                    valueOf = reader.getHighSpeedVideoFpsRangesFor(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                    break;
                default:
                    valueOf = null;
                    break;
            }
        }
        if (generatedExtension.isRepeated()) {
            fieldSet.getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor>) generatedExtension.Camera2StreamConfigurationMap, valueOf);
            return ub;
        }
        int i = androidx.content.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.getHighSpeedVideoFpsRanges[generatedExtension.getLiteType().ordinal()];
        if (i == 17 || i == 18) {
            java.lang.Object obj5 = fieldSet.getHighSpeedVideoFpsRangesFor.get(generatedExtension.Camera2StreamConfigurationMap);
            if (obj5 instanceof androidx.content.preferences.protobuf.LazyField) {
                obj5 = ((androidx.content.preferences.protobuf.LazyField) obj5).getValue();
            }
            if (obj5 != null) {
                valueOf = androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes(obj5, valueOf);
            }
        }
        fieldSet.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, valueOf);
        return ub;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.ExtensionSchemaLite$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.GROUP.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRanges[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
        }
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final int getHighResolutionOutputSizeshNQ4ISI(java.util.Map.Entry<?, ?> entry) {
        return ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getNumber();
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final void Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.Writer writer, java.util.Map.Entry<?, ?> entry) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor extensionDescriptor = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor) entry.getKey();
        if (extensionDescriptor.isRepeated()) {
            switch (androidx.content.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.getHighSpeedVideoFpsRanges[extensionDescriptor.getLiteType().ordinal()]) {
                case 1:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 2:
                    androidx.content.preferences.protobuf.SchemaUtil.getInputFormats(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 3:
                    androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 4:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputSizeshNQ4ISI(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 5:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 6:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 7:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 8:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(extensionDescriptor.getNumber(), (java.util.List<java.lang.Boolean>) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 9:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputSizes(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 10:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 11:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 12:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputStallDuration(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 13:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDurationlomOqCM(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 14:
                    androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(extensionDescriptor.getNumber(), (java.util.List) entry.getValue(), writer, extensionDescriptor.isPacked());
                    break;
                case 15:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(extensionDescriptor.getNumber(), (java.util.List<androidx.content.preferences.protobuf.ByteString>) entry.getValue(), writer);
                    break;
                case 16:
                    androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(extensionDescriptor.getNumber(), (java.util.List<java.lang.String>) entry.getValue(), writer);
                    break;
                case 17:
                    java.util.List list = (java.util.List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(extensionDescriptor.getNumber(), (java.util.List<?>) entry.getValue(), writer, androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    java.util.List list2 = (java.util.List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(extensionDescriptor.getNumber(), (java.util.List<?>) entry.getValue(), writer, androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (androidx.content.preferences.protobuf.ExtensionSchemaLite.AnonymousClass1.getHighSpeedVideoFpsRanges[extensionDescriptor.getLiteType().ordinal()]) {
            case 1:
                writer.getHighSpeedVideoFpsRangesFor(extensionDescriptor.getNumber(), ((java.lang.Double) entry.getValue()).doubleValue());
                break;
            case 2:
                writer.getHighSpeedVideoSizes(extensionDescriptor.getNumber(), ((java.lang.Float) entry.getValue()).floatValue());
                break;
            case 3:
                writer.getHighResolutionOutputSizeshNQ4ISI(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 4:
                writer.getHighSpeedVideoSizes(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 5:
                writer.Camera2StreamConfigurationMap(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 6:
                writer.Camera2StreamConfigurationMap(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 7:
                writer.getHighSpeedVideoFpsRangesFor(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 8:
                writer.Camera2StreamConfigurationMap(extensionDescriptor.getNumber(), ((java.lang.Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                writer.getOutputFormats(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 10:
                writer.getHighSpeedVideoSizes(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 11:
                writer.getHighSpeedVideoFpsRanges(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 12:
                writer.getOutputMinFrameDuration(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 13:
                writer.getHighSpeedVideoFpsRangesFor(extensionDescriptor.getNumber(), ((java.lang.Long) entry.getValue()).longValue());
                break;
            case 14:
                writer.Camera2StreamConfigurationMap(extensionDescriptor.getNumber(), ((java.lang.Integer) entry.getValue()).intValue());
                break;
            case 15:
                writer.getHighSpeedVideoFpsRanges(extensionDescriptor.getNumber(), (androidx.content.preferences.protobuf.ByteString) entry.getValue());
                break;
            case 16:
                writer.getHighSpeedVideoFpsRanges(extensionDescriptor.getNumber(), (java.lang.String) entry.getValue());
                break;
            case 17:
                writer.getHighSpeedVideoSizes(extensionDescriptor.getNumber(), entry.getValue(), androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(entry.getValue().getClass()));
                break;
            case 18:
                writer.getHighSpeedVideoFpsRanges(extensionDescriptor.getNumber(), entry.getValue(), androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(entry.getValue().getClass()));
                break;
        }
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final java.lang.Object getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final void getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.Reader reader, java.lang.Object obj, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) obj;
        fieldSet.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, reader.getHighSpeedVideoFpsRangesFor(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.ByteString byteString, java.lang.Object obj, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite, androidx.content.preferences.protobuf.FieldSet<androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtensionDescriptor> fieldSet) throws java.io.IOException {
        androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension generatedExtension = (androidx.datastore.preferences.protobuf.GeneratedMessageLite.GeneratedExtension) obj;
        androidx.datastore.preferences.protobuf.MessageLite.Builder newBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        androidx.content.preferences.protobuf.CodedInputStream newCodedInput = byteString.newCodedInput();
        newBuilderForType.mergeFrom(newCodedInput, extensionRegistryLite);
        fieldSet.getHighSpeedVideoSizes(generatedExtension.Camera2StreamConfigurationMap, newBuilderForType.buildPartial());
        newCodedInput.checkLastTagWas(0);
    }

    @Override // androidx.content.preferences.protobuf.ExtensionSchema
    final void Camera2StreamConfigurationMap(java.lang.Object obj) {
        ((androidx.datastore.preferences.protobuf.GeneratedMessageLite.ExtendableMessage) obj).extensions.getOutputFormats();
    }
}
