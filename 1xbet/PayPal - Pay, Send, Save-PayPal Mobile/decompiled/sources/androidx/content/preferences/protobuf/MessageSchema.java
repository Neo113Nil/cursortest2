package androidx.content.preferences.protobuf;

@androidx.content.preferences.protobuf.CheckReturnValue
/* loaded from: classes3.dex */
final class MessageSchema<T> implements androidx.content.preferences.protobuf.Schema<T> {
    private static final int[] getHighSpeedVideoFpsRangesFor = new int[0];
    private static final sun.misc.Unsafe getHighSpeedVideoSizes = androidx.content.preferences.protobuf.UnsafeUtil.getHighResolutionOutputSizeshNQ4ISI();
    private final int Camera2StreamConfigurationMap;
    private final int[] getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.content.preferences.protobuf.MessageLite getHighSpeedVideoFpsRanges;
    private final int[] getHighSpeedVideoSizesFor;
    private final androidx.content.preferences.protobuf.ListFieldSchema getInputFormats;
    private final androidx.content.preferences.protobuf.ExtensionSchema<?> getInputSizeshNQ4ISI;
    private final boolean getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final int getOutputMinFrameDurationlomOqCM;
    private final int getOutputSizes;
    private final androidx.content.preferences.protobuf.NewInstanceSchema getOutputSizeshNQ4ISI;
    private final androidx.content.preferences.protobuf.MapFieldSchema getOutputStallDuration;
    private final java.lang.Object[] getOutputStallDurationlomOqCM;
    private final int getValidOutputFormatsForInputhNQ4ISI;
    private final boolean isOutputSupportedForhNQ4ISI;
    private final androidx.content.preferences.protobuf.ProtoSyntax toString;
    private final androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unwrapAs;

    private static long getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i & 1048575;
    }

    private MessageSchema(int[] iArr, java.lang.Object[] objArr, int i, int i2, androidx.content.preferences.protobuf.MessageLite messageLite, androidx.content.preferences.protobuf.ProtoSyntax protoSyntax, boolean z, int[] iArr2, int i3, int i4, androidx.content.preferences.protobuf.NewInstanceSchema newInstanceSchema, androidx.content.preferences.protobuf.ListFieldSchema listFieldSchema, androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.content.preferences.protobuf.MapFieldSchema mapFieldSchema) {
        this.getHighResolutionOutputSizeshNQ4ISI = iArr;
        this.getOutputStallDurationlomOqCM = objArr;
        this.getOutputSizes = i;
        this.getOutputMinFrameDurationlomOqCM = i2;
        this.getOutputFormats = messageLite instanceof androidx.content.preferences.protobuf.GeneratedMessageLite;
        this.toString = protoSyntax;
        this.getOutputMinFrameDuration = extensionSchema != null && extensionSchema.getHighResolutionOutputSizeshNQ4ISI(messageLite);
        this.isOutputSupportedForhNQ4ISI = z;
        this.getHighSpeedVideoSizesFor = iArr2;
        this.Camera2StreamConfigurationMap = i3;
        this.getValidOutputFormatsForInputhNQ4ISI = i4;
        this.getOutputSizeshNQ4ISI = newInstanceSchema;
        this.getInputFormats = listFieldSchema;
        this.unwrapAs = unknownFieldSchema;
        this.getInputSizeshNQ4ISI = extensionSchema;
        this.getHighSpeedVideoFpsRanges = messageLite;
        this.getOutputStallDuration = mapFieldSchema;
    }

    /* JADX WARN: Removed duplicated region for block: B:278:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05a8  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0563  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> androidx.content.preferences.protobuf.MessageSchema<T> getHighResolutionOutputSizeshNQ4ISI(androidx.content.preferences.protobuf.MessageInfo messageInfo, androidx.content.preferences.protobuf.NewInstanceSchema newInstanceSchema, androidx.content.preferences.protobuf.ListFieldSchema listFieldSchema, androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema, androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema, androidx.content.preferences.protobuf.MapFieldSchema mapFieldSchema) {
        int i;
        int i2;
        androidx.content.preferences.protobuf.StructuralMessageInfo structuralMessageInfo;
        androidx.content.preferences.protobuf.FieldInfo[] fieldInfoArr;
        int[] iArr;
        int id;
        int i3;
        long Camera2StreamConfigurationMap;
        int i4;
        int i5;
        int i6;
        int i7;
        int numberOfTrailingZeros;
        int i8;
        int i9;
        java.lang.Class<?> type;
        int i10;
        int i11;
        int i12;
        int i13;
        int charAt;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr2;
        int i20;
        int i21;
        int i22;
        char charAt2;
        int i23;
        char charAt3;
        int i24;
        char charAt4;
        int i25;
        char charAt5;
        int i26;
        char charAt6;
        int i27;
        char charAt7;
        int i28;
        char charAt8;
        int i29;
        char charAt9;
        androidx.content.preferences.protobuf.ProtoSyntax protoSyntax;
        int i30;
        int i31;
        int i32;
        int i33;
        androidx.content.preferences.protobuf.RawMessageInfo rawMessageInfo;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        java.lang.reflect.Field Camera2StreamConfigurationMap2;
        int i40;
        char charAt10;
        int i41;
        androidx.content.preferences.protobuf.ProtoSyntax protoSyntax2;
        int i42;
        java.lang.reflect.Field Camera2StreamConfigurationMap3;
        java.lang.reflect.Field Camera2StreamConfigurationMap4;
        androidx.content.preferences.protobuf.ProtoSyntax protoSyntax3;
        int i43;
        char charAt11;
        int i44;
        char charAt12;
        int i45;
        char charAt13;
        int i46;
        char charAt14;
        int i47 = 0;
        if (messageInfo instanceof androidx.content.preferences.protobuf.RawMessageInfo) {
            androidx.content.preferences.protobuf.RawMessageInfo rawMessageInfo2 = (androidx.content.preferences.protobuf.RawMessageInfo) messageInfo;
            java.lang.String str = rawMessageInfo2.getHighSpeedVideoSizes;
            int length = str.length();
            char c = 55296;
            if (str.charAt(0) >= 55296) {
                int i48 = 1;
                while (true) {
                    i10 = i48 + 1;
                    if (str.charAt(i48) < 55296) {
                        break;
                    }
                    i48 = i10;
                }
            } else {
                i10 = 1;
            }
            int i49 = i10 + 1;
            int charAt15 = str.charAt(i10);
            if (charAt15 >= 55296) {
                int i50 = charAt15 & 8191;
                int i51 = 13;
                while (true) {
                    i46 = i49 + 1;
                    charAt14 = str.charAt(i49);
                    if (charAt14 < 55296) {
                        break;
                    }
                    i50 |= (charAt14 & 8191) << i51;
                    i51 += 13;
                    i49 = i46;
                }
                charAt15 = i50 | (charAt14 << i51);
                i49 = i46;
            }
            if (charAt15 == 0) {
                i21 = 0;
                charAt = 0;
                i17 = 0;
                i18 = 0;
                i19 = 0;
                i20 = 0;
                iArr2 = getHighSpeedVideoFpsRangesFor;
            } else {
                int i52 = i49 + 1;
                int charAt16 = str.charAt(i49);
                if (charAt16 >= 55296) {
                    int i53 = charAt16 & 8191;
                    int i54 = 13;
                    while (true) {
                        i29 = i52 + 1;
                        charAt9 = str.charAt(i52);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i53 |= (charAt9 & 8191) << i54;
                        i54 += 13;
                        i52 = i29;
                    }
                    charAt16 = i53 | (charAt9 << i54);
                    i52 = i29;
                }
                int i55 = i52 + 1;
                int charAt17 = str.charAt(i52);
                if (charAt17 >= 55296) {
                    int i56 = charAt17 & 8191;
                    int i57 = i55;
                    int i58 = 13;
                    while (true) {
                        i28 = i57 + 1;
                        charAt8 = str.charAt(i57);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i56 |= (charAt8 & 8191) << i58;
                        i58 += 13;
                        i57 = i28;
                    }
                    charAt17 = i56 | (charAt8 << i58);
                    i11 = i28;
                } else {
                    i11 = i55;
                }
                int i59 = i11 + 1;
                int charAt18 = str.charAt(i11);
                if (charAt18 >= 55296) {
                    int i60 = charAt18 & 8191;
                    int i61 = i59;
                    int i62 = 13;
                    while (true) {
                        i27 = i61 + 1;
                        charAt7 = str.charAt(i61);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i60 |= (charAt7 & 8191) << i62;
                        i62 += 13;
                        i61 = i27;
                    }
                    charAt18 = i60 | (charAt7 << i62);
                    i12 = i27;
                } else {
                    i12 = i59;
                }
                int i63 = i12 + 1;
                int charAt19 = str.charAt(i12);
                if (charAt19 >= 55296) {
                    int i64 = charAt19 & 8191;
                    int i65 = i63;
                    int i66 = 13;
                    while (true) {
                        i26 = i65 + 1;
                        charAt6 = str.charAt(i65);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i64 |= (charAt6 & 8191) << i66;
                        i66 += 13;
                        i65 = i26;
                    }
                    charAt19 = i64 | (charAt6 << i66);
                    i13 = i26;
                } else {
                    i13 = i63;
                }
                int i67 = i13 + 1;
                charAt = str.charAt(i13);
                if (charAt >= 55296) {
                    int i68 = charAt & 8191;
                    int i69 = i67;
                    int i70 = 13;
                    while (true) {
                        i25 = i69 + 1;
                        charAt5 = str.charAt(i69);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i68 |= (charAt5 & 8191) << i70;
                        i70 += 13;
                        i69 = i25;
                    }
                    charAt = i68 | (charAt5 << i70);
                    i14 = i25;
                } else {
                    i14 = i67;
                }
                int i71 = i14 + 1;
                int charAt20 = str.charAt(i14);
                if (charAt20 >= 55296) {
                    int i72 = charAt20 & 8191;
                    int i73 = i71;
                    int i74 = 13;
                    while (true) {
                        i24 = i73 + 1;
                        charAt4 = str.charAt(i73);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i72 |= (charAt4 & 8191) << i74;
                        i74 += 13;
                        i73 = i24;
                    }
                    charAt20 = (charAt4 << i74) | i72;
                    i15 = i24;
                } else {
                    i15 = i71;
                }
                int i75 = i15 + 1;
                int charAt21 = str.charAt(i15);
                if (charAt21 >= 55296) {
                    int i76 = charAt21 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i23 = i77 + 1;
                        charAt3 = str.charAt(i77);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i76 |= (charAt3 & 8191) << i78;
                        i78 += 13;
                        i77 = i23;
                    }
                    charAt21 = i76 | (charAt3 << i78);
                    i16 = i23;
                } else {
                    i16 = i75;
                }
                int i79 = i16 + 1;
                int charAt22 = str.charAt(i16);
                if (charAt22 >= 55296) {
                    int i80 = charAt22 & 8191;
                    int i81 = i79;
                    int i82 = 13;
                    while (true) {
                        i22 = i81 + 1;
                        charAt2 = str.charAt(i81);
                        if (charAt2 < 55296) {
                            break;
                        }
                        i80 |= (charAt2 & 8191) << i82;
                        i82 += 13;
                        i81 = i22;
                    }
                    charAt22 = i80 | (charAt2 << i82);
                    i79 = i22;
                }
                i17 = (charAt16 * 2) + charAt17;
                i18 = charAt18;
                i19 = charAt19;
                iArr2 = new int[charAt22 + charAt20 + charAt21];
                i20 = charAt22;
                i21 = charAt20;
                i47 = charAt16;
                i49 = i79;
            }
            sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
            java.lang.Object[] objArr = rawMessageInfo2.Camera2StreamConfigurationMap;
            java.lang.Class<?> cls = rawMessageInfo2.getHighSpeedVideoFpsRangesFor.getClass();
            int[] iArr3 = new int[charAt * 3];
            java.lang.Object[] objArr2 = new java.lang.Object[charAt * 2];
            int i83 = i20 + i21;
            int i84 = i20;
            int i85 = i83;
            int i86 = 0;
            int i87 = 0;
            while (i49 < length) {
                int i88 = i49 + 1;
                int charAt23 = str.charAt(i49);
                if (charAt23 >= c) {
                    int i89 = charAt23 & 8191;
                    int i90 = i88;
                    int i91 = 13;
                    while (true) {
                        i45 = i90 + 1;
                        charAt13 = str.charAt(i90);
                        if (charAt13 < c) {
                            break;
                        }
                        i89 |= (charAt13 & 8191) << i91;
                        i91 += 13;
                        i90 = i45;
                    }
                    charAt23 = i89 | (charAt13 << i91);
                    i30 = i45;
                } else {
                    i30 = i88;
                }
                int i92 = i30 + 1;
                int charAt24 = str.charAt(i30);
                if (charAt24 >= c) {
                    int i93 = charAt24 & 8191;
                    int i94 = i92;
                    int i95 = 13;
                    while (true) {
                        i44 = i94 + 1;
                        charAt12 = str.charAt(i94);
                        if (charAt12 < c) {
                            break;
                        }
                        i93 |= (charAt12 & 8191) << i95;
                        i95 += 13;
                        i94 = i44;
                    }
                    charAt24 = i93 | (charAt12 << i95);
                    i31 = i44;
                } else {
                    i31 = i92;
                }
                int i96 = charAt24 & 255;
                if ((charAt24 & 1024) != 0) {
                    iArr2[i87] = i86;
                    i87++;
                }
                if (i96 >= 51) {
                    int i97 = i31 + 1;
                    int charAt25 = str.charAt(i31);
                    char c2 = 55296;
                    if (charAt25 >= 55296) {
                        int i98 = 13;
                        int i99 = charAt25 & 8191;
                        int i100 = i97;
                        while (true) {
                            i43 = i100 + 1;
                            charAt11 = str.charAt(i100);
                            if (charAt11 < c2) {
                                break;
                            }
                            i99 |= (charAt11 & 8191) << i98;
                            i98 += 13;
                            i100 = i43;
                            c2 = 55296;
                        }
                        charAt25 = i99 | (charAt11 << i98);
                        i42 = i43;
                    } else {
                        i42 = i97;
                    }
                    int i101 = i42;
                    int i102 = i96 - 51;
                    i32 = length;
                    if (i102 == 9 || i102 == 17) {
                        objArr2[((i86 / 3) * 2) + 1] = objArr[i17];
                        i17++;
                    } else if (i102 == 12) {
                        int i103 = rawMessageInfo2.getHighSpeedVideoFpsRanges;
                        if ((i103 & 1) != 0) {
                            protoSyntax3 = androidx.content.preferences.protobuf.ProtoSyntax.PROTO2;
                        } else if ((i103 & 4) == 4) {
                            protoSyntax3 = androidx.content.preferences.protobuf.ProtoSyntax.EDITIONS;
                        } else {
                            protoSyntax3 = androidx.content.preferences.protobuf.ProtoSyntax.PROTO3;
                        }
                        if (protoSyntax3.equals(androidx.content.preferences.protobuf.ProtoSyntax.PROTO2) || (charAt24 & 2048) != 0) {
                            objArr2[((i86 / 3) * 2) + 1] = objArr[i17];
                            i17++;
                        }
                    }
                    int i104 = charAt25 * 2;
                    java.lang.Object obj = objArr[i104];
                    if (obj instanceof java.lang.reflect.Field) {
                        Camera2StreamConfigurationMap3 = (java.lang.reflect.Field) obj;
                    } else {
                        Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(cls, (java.lang.String) obj);
                        objArr[i104] = Camera2StreamConfigurationMap3;
                    }
                    int i105 = i17;
                    i38 = (int) unsafe.objectFieldOffset(Camera2StreamConfigurationMap3);
                    int i106 = i104 + 1;
                    java.lang.Object obj2 = objArr[i106];
                    if (obj2 instanceof java.lang.reflect.Field) {
                        Camera2StreamConfigurationMap4 = (java.lang.reflect.Field) obj2;
                    } else {
                        Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(cls, (java.lang.String) obj2);
                        objArr[i106] = Camera2StreamConfigurationMap4;
                    }
                    i37 = (int) unsafe.objectFieldOffset(Camera2StreamConfigurationMap4);
                    i17 = i105;
                    rawMessageInfo = rawMessageInfo2;
                    i39 = 0;
                    i33 = charAt23;
                    i49 = i101;
                } else {
                    i32 = length;
                    int i107 = i17 + 1;
                    java.lang.reflect.Field Camera2StreamConfigurationMap5 = Camera2StreamConfigurationMap(cls, (java.lang.String) objArr[i17]);
                    i33 = charAt23;
                    if (i96 == 9 || i96 == 17) {
                        rawMessageInfo = rawMessageInfo2;
                        objArr2[((i86 / 3) * 2) + 1] = Camera2StreamConfigurationMap5.getType();
                    } else {
                        if (i96 == 27 || i96 == 49) {
                            rawMessageInfo = rawMessageInfo2;
                            i41 = i17 + 2;
                            objArr2[((i86 / 3) * 2) + 1] = objArr[i107];
                        } else if (i96 == 12 || i96 == 30 || i96 == 44) {
                            int i108 = rawMessageInfo2.getHighSpeedVideoFpsRanges;
                            if ((i108 & 1) != 0) {
                                protoSyntax2 = androidx.content.preferences.protobuf.ProtoSyntax.PROTO2;
                                rawMessageInfo = rawMessageInfo2;
                            } else {
                                rawMessageInfo = rawMessageInfo2;
                                if ((i108 & 4) == 4) {
                                    protoSyntax2 = androidx.content.preferences.protobuf.ProtoSyntax.EDITIONS;
                                } else {
                                    protoSyntax2 = androidx.content.preferences.protobuf.ProtoSyntax.PROTO3;
                                }
                            }
                            if (protoSyntax2 == androidx.content.preferences.protobuf.ProtoSyntax.PROTO2 || (charAt24 & 2048) != 0) {
                                i41 = i17 + 2;
                                objArr2[((i86 / 3) * 2) + 1] = objArr[i107];
                            }
                        } else {
                            if (i96 == 50) {
                                int i109 = i84 + 1;
                                iArr2[i84] = i86;
                                int i110 = (i86 / 3) * 2;
                                int i111 = i17 + 2;
                                objArr2[i110] = objArr[i107];
                                if ((charAt24 & 2048) != 0) {
                                    i107 = i17 + 3;
                                    objArr2[i110 + 1] = objArr[i111];
                                    rawMessageInfo = rawMessageInfo2;
                                    i84 = i109;
                                } else {
                                    i84 = i109;
                                    i107 = i111;
                                }
                            }
                            rawMessageInfo = rawMessageInfo2;
                        }
                        i107 = i41;
                    }
                    int objectFieldOffset = (int) unsafe.objectFieldOffset(Camera2StreamConfigurationMap5);
                    if ((charAt24 & 4096) == 0 || i96 > 17) {
                        i34 = 0;
                        i35 = 1048575;
                        i36 = 18;
                    } else {
                        int i112 = i31 + 1;
                        int charAt26 = str.charAt(i31);
                        if (charAt26 >= 55296) {
                            int i113 = charAt26 & 8191;
                            int i114 = 13;
                            while (true) {
                                i40 = i112 + 1;
                                charAt10 = str.charAt(i112);
                                if (charAt10 < 55296) {
                                    break;
                                }
                                i113 |= (charAt10 & 8191) << i114;
                                i114 += 13;
                                i112 = i40;
                            }
                            charAt26 = i113 | (charAt10 << i114);
                            i112 = i40;
                        }
                        int i115 = (i47 * 2) + (charAt26 / 32);
                        java.lang.Object obj3 = objArr[i115];
                        if (obj3 instanceof java.lang.reflect.Field) {
                            Camera2StreamConfigurationMap2 = (java.lang.reflect.Field) obj3;
                        } else {
                            Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(cls, (java.lang.String) obj3);
                            objArr[i115] = Camera2StreamConfigurationMap2;
                        }
                        i35 = (int) unsafe.objectFieldOffset(Camera2StreamConfigurationMap2);
                        i36 = 18;
                        int i116 = i112;
                        i34 = charAt26 % 32;
                        i31 = i116;
                    }
                    if (i96 >= i36 && i96 <= 49) {
                        iArr2[i85] = objectFieldOffset;
                        i85++;
                    }
                    i49 = i31;
                    i37 = i35;
                    int i117 = i107;
                    i38 = objectFieldOffset;
                    i39 = i34;
                    i17 = i117;
                }
                iArr3[i86] = i33;
                java.lang.String str2 = str;
                iArr3[i86 + 1] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | ((charAt24 & 2048) != 0 ? Integer.MIN_VALUE : 0) | (i96 << 20) | i38;
                iArr3[i86 + 2] = (i39 << 20) | i37;
                i86 += 3;
                rawMessageInfo2 = rawMessageInfo;
                str = str2;
                length = i32;
                c = 55296;
            }
            androidx.content.preferences.protobuf.MessageLite messageLite = rawMessageInfo2.getHighSpeedVideoFpsRangesFor;
            int i118 = rawMessageInfo2.getHighSpeedVideoFpsRanges;
            if ((i118 & 1) != 0) {
                protoSyntax = androidx.content.preferences.protobuf.ProtoSyntax.PROTO2;
            } else if ((i118 & 4) == 4) {
                protoSyntax = androidx.content.preferences.protobuf.ProtoSyntax.EDITIONS;
            } else {
                protoSyntax = androidx.content.preferences.protobuf.ProtoSyntax.PROTO3;
            }
            return new androidx.content.preferences.protobuf.MessageSchema<>(iArr3, objArr2, i18, i19, messageLite, protoSyntax, false, iArr2, i20, i83, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
        }
        androidx.content.preferences.protobuf.StructuralMessageInfo structuralMessageInfo2 = (androidx.content.preferences.protobuf.StructuralMessageInfo) messageInfo;
        androidx.content.preferences.protobuf.FieldInfo[] fieldInfoArr2 = structuralMessageInfo2.getHighResolutionOutputSizeshNQ4ISI;
        if (fieldInfoArr2.length == 0) {
            i = 0;
            i2 = 0;
        } else {
            i = fieldInfoArr2[0].getHighSpeedVideoFpsRanges;
            i2 = fieldInfoArr2[fieldInfoArr2.length - 1].getHighSpeedVideoFpsRanges;
        }
        int length2 = fieldInfoArr2.length;
        int[] iArr4 = new int[length2 * 3];
        java.lang.Object[] objArr3 = new java.lang.Object[length2 * 2];
        int i119 = 0;
        int i120 = 0;
        for (androidx.content.preferences.protobuf.FieldInfo fieldInfo : fieldInfoArr2) {
            if (fieldInfo.getOutputSizeshNQ4ISI == androidx.content.preferences.protobuf.FieldType.MAP) {
                i119++;
            } else if (fieldInfo.getOutputSizeshNQ4ISI.id() >= 18 && fieldInfo.getOutputSizeshNQ4ISI.id() <= 49) {
                i120++;
            }
        }
        int[] iArr5 = i119 > 0 ? new int[i119] : null;
        int[] iArr6 = i120 > 0 ? new int[i120] : null;
        int[] iArr7 = structuralMessageInfo2.getHighSpeedVideoFpsRanges;
        if (iArr7 == null) {
            iArr7 = getHighSpeedVideoFpsRangesFor;
        }
        int i121 = 0;
        int i122 = 0;
        int i123 = 0;
        int i124 = 0;
        int i125 = 0;
        while (i121 < fieldInfoArr2.length) {
            androidx.content.preferences.protobuf.FieldInfo fieldInfo2 = fieldInfoArr2[i121];
            int i126 = fieldInfo2.getHighSpeedVideoFpsRanges;
            androidx.content.preferences.protobuf.OneofInfo oneofInfo = fieldInfo2.getHighSpeedVideoSizesFor;
            if (oneofInfo == null) {
                structuralMessageInfo = structuralMessageInfo2;
                fieldInfoArr = fieldInfoArr2;
                androidx.content.preferences.protobuf.FieldType fieldType = fieldInfo2.getOutputSizeshNQ4ISI;
                iArr = iArr5;
                int Camera2StreamConfigurationMap6 = (int) androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(fieldInfo2.getHighSpeedVideoFpsRangesFor);
                id = fieldType.id();
                if (!fieldType.isList() && !fieldType.isMap()) {
                    java.lang.reflect.Field field = fieldInfo2.getOutputFormats;
                    if (field == null) {
                        i7 = Camera2StreamConfigurationMap6;
                        i6 = 1048575;
                    } else {
                        i7 = Camera2StreamConfigurationMap6;
                        i6 = (int) androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(field);
                    }
                    i5 = i121;
                    numberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(fieldInfo2.getOutputSizes);
                    i4 = i7;
                    i8 = id;
                    iArr4[i122] = fieldInfo2.getHighSpeedVideoFpsRanges;
                    int[] iArr8 = iArr6;
                    if (fieldInfo2.getHighSpeedVideoSizes) {
                    }
                    iArr4[i122 + 1] = i4 | (i8 << 20) | (fieldInfo2.getOutputStallDurationlomOqCM ? 268435456 : 0) | (fieldInfo2.getHighSpeedVideoSizes ? 536870912 : 0);
                    iArr4[i122 + 2] = i6 | (numberOfTrailingZeros << 20);
                    i9 = androidx.content.preferences.protobuf.FieldInfo.AnonymousClass1.getHighSpeedVideoFpsRanges[fieldInfo2.getOutputSizeshNQ4ISI.ordinal()];
                    if (i9 != 1) {
                    }
                    java.lang.reflect.Field field2 = fieldInfo2.getHighSpeedVideoFpsRangesFor;
                    if (field2 != null) {
                    }
                    if (fieldInfo2.getInputSizeshNQ4ISI != null) {
                    }
                    if (i123 < iArr7.length) {
                        iArr7[i123] = i122;
                        i123++;
                    }
                    if (fieldInfo2.getOutputSizeshNQ4ISI == androidx.content.preferences.protobuf.FieldType.MAP) {
                    }
                    i122 += 3;
                    i121 = i5 + 1;
                    iArr5 = iArr;
                    fieldInfoArr2 = fieldInfoArr;
                    structuralMessageInfo2 = structuralMessageInfo;
                    iArr6 = iArr8;
                } else {
                    i3 = Camera2StreamConfigurationMap6;
                    if (fieldInfo2.getHighResolutionOutputSizeshNQ4ISI != null) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(fieldInfo2.getHighResolutionOutputSizeshNQ4ISI);
                    } else {
                        i4 = i3;
                        i5 = i121;
                        i6 = 0;
                        i8 = id;
                        numberOfTrailingZeros = 0;
                        iArr4[i122] = fieldInfo2.getHighSpeedVideoFpsRanges;
                        int[] iArr82 = iArr6;
                        iArr4[i122 + 1] = i4 | (i8 << 20) | (fieldInfo2.getOutputStallDurationlomOqCM ? 268435456 : 0) | (fieldInfo2.getHighSpeedVideoSizes ? 536870912 : 0);
                        iArr4[i122 + 2] = i6 | (numberOfTrailingZeros << 20);
                        i9 = androidx.content.preferences.protobuf.FieldInfo.AnonymousClass1.getHighSpeedVideoFpsRanges[fieldInfo2.getOutputSizeshNQ4ISI.ordinal()];
                        if (i9 != 1 || i9 == 2) {
                            java.lang.reflect.Field field22 = fieldInfo2.getHighSpeedVideoFpsRangesFor;
                            type = field22 != null ? field22.getType() : fieldInfo2.getInputFormats;
                        } else {
                            if (i9 != 3 && i9 != 4) {
                                type = null;
                            }
                            type = fieldInfo2.getOutputMinFrameDuration;
                        }
                        if (fieldInfo2.getInputSizeshNQ4ISI != null) {
                            int i127 = (i122 / 3) * 2;
                            objArr3[i127] = fieldInfo2.getInputSizeshNQ4ISI;
                            if (type == null) {
                                if (fieldInfo2.Camera2StreamConfigurationMap != null) {
                                    objArr3[i127 + 1] = fieldInfo2.Camera2StreamConfigurationMap;
                                }
                            } else {
                                objArr3[i127 + 1] = type;
                            }
                        } else if (type == null) {
                            if (fieldInfo2.Camera2StreamConfigurationMap != null) {
                                objArr3[((i122 / 3) * 2) + 1] = fieldInfo2.Camera2StreamConfigurationMap;
                            }
                        } else {
                            objArr3[((i122 / 3) * 2) + 1] = type;
                        }
                        if (i123 < iArr7.length && iArr7[i123] == i126) {
                            iArr7[i123] = i122;
                            i123++;
                        }
                        if (fieldInfo2.getOutputSizeshNQ4ISI == androidx.content.preferences.protobuf.FieldType.MAP) {
                            iArr[i124] = i122;
                            i124++;
                        } else if (fieldInfo2.getOutputSizeshNQ4ISI.id() >= 18) {
                            if (fieldInfo2.getOutputSizeshNQ4ISI.id() <= 49) {
                                iArr82[i125] = (int) androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(fieldInfo2.getHighSpeedVideoFpsRangesFor);
                                i125++;
                            }
                            i122 += 3;
                            i121 = i5 + 1;
                            iArr5 = iArr;
                            fieldInfoArr2 = fieldInfoArr;
                            structuralMessageInfo2 = structuralMessageInfo;
                            iArr6 = iArr82;
                        }
                        i122 += 3;
                        i121 = i5 + 1;
                        iArr5 = iArr;
                        fieldInfoArr2 = fieldInfoArr;
                        structuralMessageInfo2 = structuralMessageInfo;
                        iArr6 = iArr82;
                    }
                }
            } else {
                id = fieldInfo2.getOutputSizeshNQ4ISI.id() + 51;
                fieldInfoArr = fieldInfoArr2;
                structuralMessageInfo = structuralMessageInfo2;
                int Camera2StreamConfigurationMap7 = (int) androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(oneofInfo.getHighResolutionOutputSizeshNQ4ISI);
                Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(oneofInfo.getHighSpeedVideoSizes);
                iArr = iArr5;
                i3 = Camera2StreamConfigurationMap7;
            }
            i6 = (int) Camera2StreamConfigurationMap;
            i4 = i3;
            i5 = i121;
            i8 = id;
            numberOfTrailingZeros = 0;
            iArr4[i122] = fieldInfo2.getHighSpeedVideoFpsRanges;
            int[] iArr822 = iArr6;
            if (fieldInfo2.getHighSpeedVideoSizes) {
            }
            iArr4[i122 + 1] = i4 | (i8 << 20) | (fieldInfo2.getOutputStallDurationlomOqCM ? 268435456 : 0) | (fieldInfo2.getHighSpeedVideoSizes ? 536870912 : 0);
            iArr4[i122 + 2] = i6 | (numberOfTrailingZeros << 20);
            i9 = androidx.content.preferences.protobuf.FieldInfo.AnonymousClass1.getHighSpeedVideoFpsRanges[fieldInfo2.getOutputSizeshNQ4ISI.ordinal()];
            if (i9 != 1) {
            }
            java.lang.reflect.Field field222 = fieldInfo2.getHighSpeedVideoFpsRangesFor;
            if (field222 != null) {
            }
            if (fieldInfo2.getInputSizeshNQ4ISI != null) {
            }
            if (i123 < iArr7.length) {
            }
            if (fieldInfo2.getOutputSizeshNQ4ISI == androidx.content.preferences.protobuf.FieldType.MAP) {
            }
            i122 += 3;
            i121 = i5 + 1;
            iArr5 = iArr;
            fieldInfoArr2 = fieldInfoArr;
            structuralMessageInfo2 = structuralMessageInfo;
            iArr6 = iArr822;
        }
        androidx.content.preferences.protobuf.StructuralMessageInfo structuralMessageInfo3 = structuralMessageInfo2;
        int[] iArr9 = iArr5;
        int[] iArr10 = iArr6;
        int[] iArr11 = iArr9 == null ? getHighSpeedVideoFpsRangesFor : iArr9;
        int[] iArr12 = iArr10 == null ? getHighSpeedVideoFpsRangesFor : iArr10;
        int[] iArr13 = new int[iArr7.length + iArr11.length + iArr12.length];
        java.lang.System.arraycopy(iArr7, 0, iArr13, 0, iArr7.length);
        java.lang.System.arraycopy(iArr11, 0, iArr13, iArr7.length, iArr11.length);
        java.lang.System.arraycopy(iArr12, 0, iArr13, iArr7.length + iArr11.length, iArr12.length);
        return new androidx.content.preferences.protobuf.MessageSchema<>(iArr4, objArr3, i, i2, structuralMessageInfo3.getHighSpeedVideoFpsRangesFor, structuralMessageInfo3.Camera2StreamConfigurationMap, true, iArr13, iArr7.length, iArr7.length + iArr11.length, newInstanceSchema, listFieldSchema, unknownFieldSchema, extensionSchema, mapFieldSchema);
    }

    private static java.lang.reflect.Field Camera2StreamConfigurationMap(java.lang.Class<?> cls, java.lang.String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (java.lang.NoSuchFieldException unused) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            for (java.lang.reflect.Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(cls.getName());
            sb.append(" not found. Known fields are ");
            sb.append(java.util.Arrays.toString(declaredFields));
            throw new java.lang.RuntimeException(sb.toString());
        }
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final T Camera2StreamConfigurationMap() {
        return (T) this.getOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final boolean getHighSpeedVideoFpsRangesFor(T t, T t2) {
        boolean highSpeedVideoSizes;
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        for (int i = 0; i < length; i += 3) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && java.lang.Double.doubleToLongBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputSizeshNQ4ISI(t, j)) == java.lang.Double.doubleToLongBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputSizeshNQ4ISI(t2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && java.lang.Float.floatToIntBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputFormats(t, j)) == java.lang.Float.floatToIntBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputFormats(t2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j) == androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i) == getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i) && androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    highSpeedVideoSizes = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j));
                    break;
                case 50:
                    highSpeedVideoSizes = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long j2 = iArr[i + 2] & 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) == androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j2) && androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j), androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!highSpeedVideoSizes) {
                return false;
            }
        }
        if (!this.unwrapAs.getHighSpeedVideoSizes(t).equals(this.unwrapAs.getHighSpeedVideoSizes(t2))) {
            return false;
        }
        if (this.getOutputMinFrameDuration) {
            return this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t).equals(this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t2));
        }
        return true;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final int getHighSpeedVideoFpsRangesFor(T t) {
        int i;
        int hashLong;
        int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i4 = iArr[i3 + 1];
            int i5 = iArr[i3];
            long j = i4 & 1048575;
            switch ((i4 & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputSizeshNQ4ISI(t, j)));
                    i2 = i + hashLong;
                    break;
                case 1:
                    i = i2 * 53;
                    hashLong = java.lang.Float.floatToIntBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputFormats(t, j));
                    i2 = i + hashLong;
                    break;
                case 2:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashLong(androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j));
                    i2 = i + hashLong;
                    break;
                case 3:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashLong(androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j));
                    i2 = i + hashLong;
                    break;
                case 4:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
                    i2 = i + hashLong;
                    break;
                case 5:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashLong(androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j));
                    i2 = i + hashLong;
                    break;
                case 6:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
                    i2 = i + hashLong;
                    break;
                case 7:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashBoolean(androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t, j));
                    i2 = i + hashLong;
                    break;
                case 8:
                    i = i2 * 53;
                    hashLong = ((java.lang.String) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).hashCode();
                    i2 = i + hashLong;
                    break;
                case 9:
                    java.lang.Object outputFormats = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j);
                    if (outputFormats != null) {
                        hashLong = outputFormats.hashCode();
                        i = i2 * 53;
                        i2 = i + hashLong;
                        break;
                    }
                    hashLong = 37;
                    i = i2 * 53;
                    i2 = i + hashLong;
                case 10:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j).hashCode();
                    i2 = i + hashLong;
                    break;
                case 11:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
                    i2 = i + hashLong;
                    break;
                case 12:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
                    i2 = i + hashLong;
                    break;
                case 13:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
                    i2 = i + hashLong;
                    break;
                case 14:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashLong(androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j));
                    i2 = i + hashLong;
                    break;
                case 15:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
                    i2 = i + hashLong;
                    break;
                case 16:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.Internal.hashLong(androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j));
                    i2 = i + hashLong;
                    break;
                case 17:
                    java.lang.Object outputFormats2 = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j);
                    if (outputFormats2 != null) {
                        hashLong = outputFormats2.hashCode();
                        i = i2 * 53;
                        i2 = i + hashLong;
                        break;
                    }
                    hashLong = 37;
                    i = i2 * 53;
                    i2 = i + hashLong;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j).hashCode();
                    i2 = i + hashLong;
                    break;
                case 50:
                    i = i2 * 53;
                    hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j).hashCode();
                    i2 = i + hashLong;
                    break;
                case 51:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashLong(java.lang.Double.doubleToLongBits(((java.lang.Double) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).doubleValue()));
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = java.lang.Float.floatToIntBits(((java.lang.Float) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).floatValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashLong(((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashLong(((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashLong(((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashBoolean(((java.lang.Boolean) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).booleanValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.String) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashLong(((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.Internal.hashLong(((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i3 + 2] & 1048575) == i5) {
                        i = i2 * 53;
                        hashLong = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j).hashCode();
                        i2 = i + hashLong;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.unwrapAs.getHighSpeedVideoSizes(t).hashCode();
        return this.getOutputMinFrameDuration ? (hashCode * 53) + this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t).hashCode() : hashCode;
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final void Camera2StreamConfigurationMap(T t, T t2) {
        getHighSpeedVideoSizesFor(t);
        int i = 0;
        while (true) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i >= iArr.length) {
                androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(this.unwrapAs, t, t2);
                if (this.getOutputMinFrameDuration) {
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(this.getInputSizeshNQ4ISI, t, t2);
                    return;
                }
                return;
            }
            int i2 = iArr[i + 1];
            long j = i2 & 1048575;
            int i3 = iArr[i];
            switch ((i2 & 267386880) >>> 20) {
                case 0:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getInputSizeshNQ4ISI(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 1:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getInputFormats(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 2:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 3:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 4:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 5:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 6:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 7:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 8:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 9:
                    getHighSpeedVideoFpsRangesFor(t, t2, i);
                    break;
                case 10:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 11:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 12:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 13:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 14:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 15:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 16:
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t2, j));
                        getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
                        break;
                    }
                case 17:
                    getHighSpeedVideoFpsRangesFor(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.getInputFormats.getHighSpeedVideoSizes(t, t2, j);
                    break;
                case 50:
                    androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(this.getOutputStallDuration, t, t2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    int i4 = i + 2;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, iArr[i4] & 1048575) != i3) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j));
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, this.getHighResolutionOutputSizeshNQ4ISI[i4] & 1048575, i3);
                        break;
                    }
                case 60:
                    getHighResolutionOutputSizeshNQ4ISI(t, t2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    int i5 = i + 2;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, iArr[i5] & 1048575) != i3) {
                        break;
                    } else {
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t, j, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j));
                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, this.getHighResolutionOutputSizeshNQ4ISI[i5] & 1048575, i3);
                        break;
                    }
                case 68:
                    getHighResolutionOutputSizeshNQ4ISI(t, t2, i);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getHighSpeedVideoFpsRangesFor(T t, T t2, int i) {
        if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t2, i)) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI[i + 1] & 1048575;
            sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
            java.lang.Object object = unsafe.getObject(t2, j);
            if (object == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Source subfield ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI[i]);
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            androidx.content.preferences.protobuf.Schema highSpeedVideoSizes = getHighSpeedVideoSizes(i);
            if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i)) {
                java.lang.Object object2 = unsafe.getObject(t, j);
                if (object2 == null || ((object2 instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) && !((androidx.content.preferences.protobuf.GeneratedMessageLite) object2).getOutputStallDurationlomOqCM())) {
                    java.lang.Object Camera2StreamConfigurationMap = highSpeedVideoSizes.Camera2StreamConfigurationMap();
                    highSpeedVideoSizes.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, object2);
                    unsafe.putObject(t, j, Camera2StreamConfigurationMap);
                    object2 = Camera2StreamConfigurationMap;
                }
                highSpeedVideoSizes.Camera2StreamConfigurationMap(object2, object);
                return;
            }
            if (object == null || ((object instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) && !((androidx.content.preferences.protobuf.GeneratedMessageLite) object).getOutputStallDurationlomOqCM())) {
                unsafe.putObject(t, j, object);
            } else {
                java.lang.Object Camera2StreamConfigurationMap2 = highSpeedVideoSizes.Camera2StreamConfigurationMap();
                highSpeedVideoSizes.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, object);
                unsafe.putObject(t, j, Camera2StreamConfigurationMap2);
            }
            getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // androidx.content.preferences.protobuf.Schema
    public final int getHighSpeedVideoSizes(T t) {
        int i;
        int i2;
        int i3;
        int computeDoubleSize;
        int computeFloatSize;
        int highSpeedVideoFpsRangesFor;
        int Camera2StreamConfigurationMap;
        int highSpeedVideoFpsRangesFor2;
        int computeTagSize;
        int computeUInt32SizeNoTag;
        int i4;
        int computeFixed64Size;
        boolean z;
        int i5;
        int highSpeedVideoFpsRangesFor3;
        sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
        int i6 = 1048575;
        int i7 = 1048575;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i8 >= iArr.length) {
                androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = this.unwrapAs;
                int Camera2StreamConfigurationMap2 = i9 + unknownFieldSchema.Camera2StreamConfigurationMap(unknownFieldSchema.getHighSpeedVideoSizes(t));
                return this.getOutputMinFrameDuration ? Camera2StreamConfigurationMap2 + this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t).getHighSpeedVideoFpsRanges() : Camera2StreamConfigurationMap2;
            }
            int i11 = iArr[i8 + 1];
            int i12 = (267386880 & i11) >>> 20;
            int i13 = iArr[i8];
            int i14 = iArr[i8 + 2];
            int i15 = i14 & i6;
            if (i12 <= 17) {
                if (i15 != i7) {
                    i10 = i15 == i6 ? 0 : unsafe.getInt(t, i15);
                    i7 = i15;
                }
                i = 1 << (i14 >>> 20);
            } else {
                i = 0;
            }
            long j = i11 & i6;
            if (i12 < androidx.content.preferences.protobuf.FieldType.DOUBLE_LIST_PACKED.id() || i12 > androidx.content.preferences.protobuf.FieldType.SINT64_LIST_PACKED.id()) {
                i15 = 0;
            }
            int i16 = i10;
            int i17 = i7;
            switch (i12) {
                case 0:
                    i2 = i17;
                    i3 = 1048575;
                    if (i2 != 1048575) {
                        if ((i16 & i) == 0) {
                            break;
                        }
                        computeDoubleSize = androidx.content.preferences.protobuf.CodedOutputStream.computeDoubleSize(i13, 0.0d);
                    } else {
                        if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                            break;
                        }
                        computeDoubleSize = androidx.content.preferences.protobuf.CodedOutputStream.computeDoubleSize(i13, 0.0d);
                    }
                    i9 += computeDoubleSize;
                    break;
                case 1:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeFloatSize(i13, 0.0f);
                        i9 += computeFloatSize;
                    }
                    i3 = 1048575;
                    break;
                case 2:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeInt64Size(i13, unsafe.getLong(t, j));
                        i9 += computeFloatSize;
                    }
                    i3 = 1048575;
                    break;
                case 3:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64Size(i13, unsafe.getLong(t, j));
                        i9 += computeFloatSize;
                    }
                    i3 = 1048575;
                    break;
                case 4:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeInt32Size(i13, unsafe.getInt(t, j));
                        i9 += computeFloatSize;
                    }
                    i3 = 1048575;
                    break;
                case 5:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64Size(i13, 0L);
                        i9 += computeFloatSize;
                    }
                    i3 = 1048575;
                    break;
                case 6:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32Size(i13, 0);
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 7:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeBoolSize(i13, true);
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 8:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        java.lang.Object object = unsafe.getObject(t, j);
                        if (object instanceof androidx.content.preferences.protobuf.ByteString) {
                            computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSize(i13, (androidx.content.preferences.protobuf.ByteString) object);
                        } else {
                            computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeStringSize(i13, (java.lang.String) object);
                        }
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 9:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(i13, unsafe.getObject(t, j), getHighSpeedVideoSizes(i8));
                        computeDoubleSize = highSpeedVideoFpsRangesFor;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 10:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSize(i13, (androidx.content.preferences.protobuf.ByteString) unsafe.getObject(t, j));
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 11:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32Size(i13, unsafe.getInt(t, j));
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 12:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSize(i13, unsafe.getInt(t, j));
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 13:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed32Size(i13, 0);
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 14:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed64Size(i13, 0L);
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 15:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32Size(i13, unsafe.getInt(t, j));
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 16:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        computeFloatSize = androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64Size(i13, unsafe.getLong(t, j));
                        i9 += computeFloatSize;
                        i3 = 1048575;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 17:
                    i2 = i17;
                    if (i2 != 1048575 ? (i16 & i) != 0 : getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i8)) {
                        highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.CodedOutputStream.getHighResolutionOutputSizeshNQ4ISI(i13, (androidx.content.preferences.protobuf.MessageLite) unsafe.getObject(t, j), getHighSpeedVideoSizes(i8));
                        computeDoubleSize = highSpeedVideoFpsRangesFor;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = 1048575;
                    break;
                case 18:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 19:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 20:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 21:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDurationlomOqCM(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 22:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 23:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 24:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 25:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(i13, (java.util.List<?>) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 26:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 27:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(i13, (java.util.List) unsafe.getObject(t, j), getHighSpeedVideoSizes(i8));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 28:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 29:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getOutputSizeshNQ4ISI(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 30:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 31:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 32:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 33:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 34:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getInputFormats(i13, (java.util.List) unsafe.getObject(t, j));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 35:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor((java.util.List<?>) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 36:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 37:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 38:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 39:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 40:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor((java.util.List<?>) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 41:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 42:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 43:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 44:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 45:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 46:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor((java.util.List<?>) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 47:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getInputFormats((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 48:
                    highSpeedVideoFpsRangesFor2 = androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration((java.util.List) unsafe.getObject(t, j));
                    if (highSpeedVideoFpsRangesFor2 > 0) {
                        if (this.isOutputSupportedForhNQ4ISI) {
                            unsafe.putInt(t, i15, highSpeedVideoFpsRangesFor2);
                        }
                        computeTagSize = androidx.content.preferences.protobuf.CodedOutputStream.computeTagSize(i13);
                        computeUInt32SizeNoTag = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32SizeNoTag(highSpeedVideoFpsRangesFor2);
                        i9 += computeTagSize + computeUInt32SizeNoTag + highSpeedVideoFpsRangesFor2;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 49:
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(i13, (java.util.List<androidx.content.preferences.protobuf.MessageLite>) unsafe.getObject(t, j), getHighSpeedVideoSizes(i8));
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 50:
                    Camera2StreamConfigurationMap = this.getOutputStallDuration.Camera2StreamConfigurationMap(i13, unsafe.getObject(t, j), this.getOutputStallDurationlomOqCM[(i8 / 3) * 2]);
                    computeDoubleSize = Camera2StreamConfigurationMap;
                    i2 = i17;
                    i3 = 1048575;
                    i9 += computeDoubleSize;
                    break;
                case 51:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeDoubleSize(i13, 0.0d);
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 52:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) != i13) {
                        i3 = 1048575;
                        i2 = i17;
                        break;
                    } else {
                        i2 = i17;
                        computeDoubleSize = androidx.content.preferences.protobuf.CodedOutputStream.computeFloatSize(i13, 0.0f);
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                case 53:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeInt64Size(i13, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 54:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt64Size(i13, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 55:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeInt32Size(i13, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 56:
                    i4 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        computeFixed64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeFixed64Size(i13, 0L);
                        computeDoubleSize = computeFixed64Size;
                        i3 = i4;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i4;
                    i2 = i17;
                    break;
                case 57:
                    i4 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        z = false;
                        computeDoubleSize = androidx.content.preferences.protobuf.CodedOutputStream.computeFixed32Size(i13, 0);
                        i3 = i4;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i4;
                    i2 = i17;
                    break;
                case 58:
                    i4 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        computeFixed64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeBoolSize(i13, true);
                        computeDoubleSize = computeFixed64Size;
                        i3 = i4;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i4;
                    i2 = i17;
                    break;
                case 59:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        java.lang.Object object2 = unsafe.getObject(t, j);
                        if (object2 instanceof androidx.content.preferences.protobuf.ByteString) {
                            Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSize(i13, (androidx.content.preferences.protobuf.ByteString) object2);
                        } else {
                            Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeStringSize(i13, (java.lang.String) object2);
                        }
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 60:
                    i5 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        highSpeedVideoFpsRangesFor3 = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(i13, unsafe.getObject(t, j), getHighSpeedVideoSizes(i8));
                        computeDoubleSize = highSpeedVideoFpsRangesFor3;
                        i3 = i5;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i5;
                    i2 = i17;
                    break;
                case 61:
                    i5 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        highSpeedVideoFpsRangesFor3 = androidx.content.preferences.protobuf.CodedOutputStream.computeBytesSize(i13, (androidx.content.preferences.protobuf.ByteString) unsafe.getObject(t, j));
                        computeDoubleSize = highSpeedVideoFpsRangesFor3;
                        i3 = i5;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i5;
                    i2 = i17;
                    break;
                case 62:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeUInt32Size(i13, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 63:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeEnumSize(i13, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 64:
                    i4 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        z = false;
                        computeDoubleSize = androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed32Size(i13, 0);
                        i3 = i4;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i4;
                    i2 = i17;
                    break;
                case 65:
                    i4 = 1048575;
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        computeFixed64Size = androidx.content.preferences.protobuf.CodedOutputStream.computeSFixed64Size(i13, 0L);
                        computeDoubleSize = computeFixed64Size;
                        i3 = i4;
                        i2 = i17;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i3 = i4;
                    i2 = i17;
                    break;
                case 66:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeSInt32Size(i13, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 67:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.computeSInt64Size(i13, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue());
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                case 68:
                    if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575) == i13) {
                        Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.CodedOutputStream.getHighResolutionOutputSizeshNQ4ISI(i13, (androidx.content.preferences.protobuf.MessageLite) unsafe.getObject(t, j), getHighSpeedVideoSizes(i8));
                        computeDoubleSize = Camera2StreamConfigurationMap;
                        i2 = i17;
                        i3 = 1048575;
                        i9 += computeDoubleSize;
                        break;
                    }
                    i2 = i17;
                    i3 = 1048575;
                    break;
                default:
                    i2 = i17;
                    i3 = 1048575;
                    break;
            }
            i8 += 3;
            i6 = i3;
            i7 = i2;
            i10 = i16;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x0c82  */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getHighResolutionOutputSizeshNQ4ISI(T t, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        java.util.Map.Entry<?, ?> entry;
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it;
        int length;
        int i;
        java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it2;
        int i2;
        java.util.Map.Entry<?, ?> entry2;
        int i3;
        int i4;
        java.util.Map.Entry<?, ?> entry3;
        int i5;
        boolean z;
        int i6;
        sun.misc.Unsafe unsafe;
        boolean z2;
        java.util.Iterator it3;
        java.util.Map.Entry<?, ?> entry4;
        int length2;
        androidx.content.preferences.protobuf.MessageSchema<T> messageSchema = this;
        int i7 = 267386880;
        int i8 = 1048575;
        if (writer.getHighResolutionOutputSizeshNQ4ISI() != androidx.datastore.preferences.protobuf.Writer.FieldOrder.DESCENDING) {
            if (messageSchema.getOutputMinFrameDuration) {
                androidx.content.preferences.protobuf.FieldSet<?> highResolutionOutputSizeshNQ4ISI = messageSchema.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t);
                if (!highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> inputSizeshNQ4ISI = highResolutionOutputSizeshNQ4ISI.getInputSizeshNQ4ISI();
                    entry = (java.util.Map.Entry) inputSizeshNQ4ISI.next();
                    it = inputSizeshNQ4ISI;
                    length = messageSchema.getHighResolutionOutputSizeshNQ4ISI.length;
                    sun.misc.Unsafe unsafe2 = getHighSpeedVideoSizes;
                    int i9 = 0;
                    i = 0;
                    int i10 = 1048575;
                    while (i < length) {
                        int i11 = messageSchema.getHighResolutionOutputSizeshNQ4ISI[i + 1];
                        int highSpeedVideoFpsRanges = messageSchema.getHighSpeedVideoFpsRanges(i);
                        int i12 = (i11 & i7) >>> 20;
                        if (i12 <= 17) {
                            int i13 = messageSchema.getHighResolutionOutputSizeshNQ4ISI[i + 2];
                            int i14 = i13 & i8;
                            it2 = it;
                            if (i14 != i10) {
                                i9 = i14 == i8 ? 0 : unsafe2.getInt(t, i14);
                                i10 = i14;
                            }
                            int i15 = 1 << (i13 >>> 20);
                            entry2 = entry;
                            i3 = i9;
                            i4 = i15;
                            i2 = i10;
                        } else {
                            it2 = it;
                            i2 = i10;
                            entry2 = entry;
                            i3 = i9;
                            i4 = 0;
                        }
                        while (entry2 != null && messageSchema.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(entry2) <= highSpeedVideoFpsRanges) {
                            messageSchema.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(writer, entry2);
                            entry2 = it2.hasNext() ? (java.util.Map.Entry) it2.next() : null;
                        }
                        long highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI(i11);
                        switch (i12) {
                            case 0:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, getHighResolutionOutputSizeshNQ4ISI(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, Camera2StreamConfigurationMap(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, unsafe.getLong(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, unsafe.getLong(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, unsafe.getInt(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, unsafe.getLong(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, unsafe.getInt(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, getHighSpeedVideoFpsRanges(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, unsafe.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, unsafe.getObject(t, highResolutionOutputSizeshNQ4ISI2), getHighSpeedVideoSizes(i6));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, (androidx.content.preferences.protobuf.ByteString) unsafe.getObject(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getOutputFormats(highSpeedVideoFpsRanges, unsafe.getInt(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, unsafe.getInt(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, unsafe.getInt(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, unsafe.getLong(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getOutputMinFrameDuration(highSpeedVideoFpsRanges, unsafe.getInt(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i6, i2, i3, i4)) {
                                    writer.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, unsafe.getLong(t, highResolutionOutputSizeshNQ4ISI2));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                z = false;
                                entry3 = entry2;
                                i6 = i;
                                i5 = length;
                                unsafe = unsafe2;
                                if (getHighSpeedVideoFpsRanges(t, i, i2, i3, i4)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, unsafe.getObject(t, highResolutionOutputSizeshNQ4ISI2), messageSchema.getHighSpeedVideoSizes(i6));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 19:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getInputFormats(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 20:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 21:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 22:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 23:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 24:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 25:
                                z2 = false;
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<java.lang.Boolean>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                z = z2;
                                entry3 = entry2;
                                i5 = length;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 26:
                                androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<java.lang.String>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 27:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<?>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, messageSchema.getHighSpeedVideoSizes(i));
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 28:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<androidx.content.preferences.protobuf.ByteString>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 29:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputSizes(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 30:
                                androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<java.lang.Integer>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 31:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 32:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 33:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputStallDuration(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 34:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDurationlomOqCM(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, false);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 35:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 36:
                                androidx.content.preferences.protobuf.SchemaUtil.getInputFormats(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 37:
                                androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 38:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 39:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 40:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 41:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 42:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<java.lang.Boolean>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 43:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputSizes(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 44:
                                androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<java.lang.Integer>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 45:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 46:
                                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 47:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputStallDuration(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 48:
                                androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDurationlomOqCM(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, true);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 49:
                                androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighSpeedVideoFpsRanges(i), (java.util.List<?>) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer, messageSchema.getHighSpeedVideoSizes(i));
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 50:
                                messageSchema.getHighSpeedVideoFpsRanges(writer, highSpeedVideoFpsRanges, unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), i);
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 51:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, ((java.lang.Double) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2)).doubleValue());
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 52:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, ((java.lang.Float) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2)).floatValue());
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 53:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 54:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 55:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, getHighSpeedVideoSizesFor(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 56:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 57:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, getHighSpeedVideoSizesFor(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 58:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, ((java.lang.Boolean) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2)).booleanValue());
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 59:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    Camera2StreamConfigurationMap(highSpeedVideoFpsRanges, unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), writer);
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 60:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), messageSchema.getHighSpeedVideoSizes(i));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 61:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, (androidx.content.preferences.protobuf.ByteString) unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 62:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getOutputFormats(highSpeedVideoFpsRanges, getHighSpeedVideoSizesFor(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 63:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRanges, getHighSpeedVideoSizesFor(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 64:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, getHighSpeedVideoSizesFor(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 65:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges, getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 66:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getOutputMinFrameDuration(highSpeedVideoFpsRanges, getHighSpeedVideoSizesFor(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 67:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoFpsRangesFor(highSpeedVideoFpsRanges, getOutputFormats(t, highResolutionOutputSizeshNQ4ISI2));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            case 68:
                                if (messageSchema.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRanges, i)) {
                                    writer.getHighSpeedVideoSizes(highSpeedVideoFpsRanges, unsafe2.getObject(t, highResolutionOutputSizeshNQ4ISI2), messageSchema.getHighSpeedVideoSizes(i));
                                }
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                            default:
                                entry3 = entry2;
                                i5 = length;
                                z = false;
                                i6 = i;
                                unsafe = unsafe2;
                                break;
                        }
                        i = i6 + 3;
                        messageSchema = this;
                        i10 = i2;
                        i9 = i3;
                        unsafe2 = unsafe;
                        it = it2;
                        entry = entry3;
                        length = i5;
                        i7 = 267386880;
                        i8 = 1048575;
                    }
                    java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it4 = it;
                    while (entry != null) {
                        this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(writer, entry);
                        entry = it4.hasNext() ? (java.util.Map.Entry) it4.next() : null;
                    }
                    androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema = this.unwrapAs;
                    unknownFieldSchema.getHighSpeedVideoFpsRangesFor(unknownFieldSchema.getHighSpeedVideoSizes(t), writer);
                    return;
                }
            }
            entry = null;
            it = null;
            length = messageSchema.getHighResolutionOutputSizeshNQ4ISI.length;
            sun.misc.Unsafe unsafe22 = getHighSpeedVideoSizes;
            int i92 = 0;
            i = 0;
            int i102 = 1048575;
            while (i < length) {
            }
            java.util.Iterator<java.util.Map.Entry<?, java.lang.Object>> it42 = it;
            while (entry != null) {
            }
            androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema2 = this.unwrapAs;
            unknownFieldSchema2.getHighSpeedVideoFpsRangesFor(unknownFieldSchema2.getHighSpeedVideoSizes(t), writer);
            return;
        }
        androidx.content.preferences.protobuf.UnknownFieldSchema<?, ?> unknownFieldSchema3 = messageSchema.unwrapAs;
        unknownFieldSchema3.getHighSpeedVideoFpsRangesFor(unknownFieldSchema3.getHighSpeedVideoSizes(t), writer);
        if (messageSchema.getOutputMinFrameDuration) {
            androidx.content.preferences.protobuf.FieldSet<?> highResolutionOutputSizeshNQ4ISI3 = messageSchema.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t);
            if (!highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                if (highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                    it3 = java.util.Collections.emptyIterator();
                } else if (!highResolutionOutputSizeshNQ4ISI3.getHighResolutionOutputSizeshNQ4ISI) {
                    androidx.content.preferences.protobuf.SmallSortedMap<?, java.lang.Object> smallSortedMap = highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoFpsRangesFor;
                    if (smallSortedMap.getHighSpeedVideoFpsRangesFor == null) {
                        smallSortedMap.getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntrySet(smallSortedMap, (byte) 0);
                    }
                    it3 = smallSortedMap.getHighSpeedVideoFpsRangesFor.iterator();
                } else {
                    androidx.content.preferences.protobuf.SmallSortedMap<?, java.lang.Object> smallSortedMap2 = highResolutionOutputSizeshNQ4ISI3.getHighSpeedVideoFpsRangesFor;
                    if (smallSortedMap2.getHighSpeedVideoFpsRangesFor == null) {
                        smallSortedMap2.getHighSpeedVideoFpsRangesFor = new androidx.datastore.preferences.protobuf.SmallSortedMap.DescendingEntrySet(smallSortedMap2, (byte) 0);
                    }
                    it3 = new androidx.datastore.preferences.protobuf.LazyField.LazyIterator(smallSortedMap2.getHighSpeedVideoFpsRangesFor.iterator());
                }
                entry4 = (java.util.Map.Entry) it3.next();
                for (length2 = messageSchema.getHighResolutionOutputSizeshNQ4ISI.length - 3; length2 >= 0; length2 -= 3) {
                    int[] iArr = messageSchema.getHighResolutionOutputSizeshNQ4ISI;
                    int i16 = iArr[length2 + 1];
                    int i17 = iArr[length2];
                    while (entry4 != null && messageSchema.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(entry4) > i17) {
                        messageSchema.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(writer, entry4);
                        entry4 = it3.hasNext() ? (java.util.Map.Entry) it3.next() : null;
                    }
                    switch ((i16 & 267386880) >>> 20) {
                        case 0:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoFpsRangesFor(i17, getHighResolutionOutputSizeshNQ4ISI(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoSizes(i17, Camera2StreamConfigurationMap(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighResolutionOutputSizeshNQ4ISI(i17, getHighSpeedVideoFpsRangesFor(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoSizes(i17, getHighSpeedVideoFpsRangesFor(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.Camera2StreamConfigurationMap(i17, getHighSpeedVideoSizes(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.Camera2StreamConfigurationMap(i17, getHighSpeedVideoFpsRangesFor(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoFpsRangesFor(i17, getHighSpeedVideoSizes(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.Camera2StreamConfigurationMap(i17, getHighSpeedVideoFpsRanges(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                Camera2StreamConfigurationMap(i17, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer);
                                break;
                            } else {
                                break;
                            }
                        case 9:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoFpsRanges(i17, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), messageSchema.getHighSpeedVideoSizes(length2));
                                break;
                            } else {
                                break;
                            }
                        case 10:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoFpsRanges(i17, (androidx.content.preferences.protobuf.ByteString) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 11:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getOutputFormats(i17, getHighSpeedVideoSizes(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighResolutionOutputSizeshNQ4ISI(i17, getHighSpeedVideoSizes(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoSizes(i17, getHighSpeedVideoSizes(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoFpsRanges(i17, getHighSpeedVideoFpsRangesFor(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getOutputMinFrameDuration(i17, getHighSpeedVideoSizes(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoFpsRangesFor(i17, getHighSpeedVideoFpsRangesFor(t, getHighResolutionOutputSizeshNQ4ISI(i16)));
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (messageSchema.getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, length2)) {
                                writer.getHighSpeedVideoSizes(i17, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), messageSchema.getHighSpeedVideoSizes(length2));
                                break;
                            } else {
                                break;
                            }
                        case 18:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 19:
                            androidx.content.preferences.protobuf.SchemaUtil.getInputFormats(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 20:
                            androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 21:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 22:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 23:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 24:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 25:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List<java.lang.Boolean>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 26:
                            androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List<java.lang.String>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer);
                            break;
                        case 27:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List<?>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, messageSchema.getHighSpeedVideoSizes(length2));
                            break;
                        case 28:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(messageSchema.getHighSpeedVideoFpsRanges(length2), (java.util.List<androidx.content.preferences.protobuf.ByteString>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer);
                            break;
                        case 29:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputSizes(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, getHighResolutionOutputSizeshNQ4ISI(i16)), writer, false);
                            break;
                        case 30:
                            androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List<java.lang.Integer>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, false);
                            break;
                        case 31:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, false);
                            break;
                        case 32:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, false);
                            break;
                        case 33:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputStallDuration(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, false);
                            break;
                        case 34:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDurationlomOqCM(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, false);
                            break;
                        case 35:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizes(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 36:
                            androidx.content.preferences.protobuf.SchemaUtil.getInputFormats(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 37:
                            androidx.content.preferences.protobuf.SchemaUtil.getInputSizeshNQ4ISI(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 38:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputSizeshNQ4ISI(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 39:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDuration(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 40:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 41:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighResolutionOutputSizeshNQ4ISI(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 42:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRangesFor(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List<java.lang.Boolean>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 43:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputSizes(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 44:
                            androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List<java.lang.Integer>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 45:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputFormats(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 46:
                            androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoSizesFor(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 47:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputStallDuration(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 48:
                            androidx.content.preferences.protobuf.SchemaUtil.getOutputMinFrameDurationlomOqCM(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, true);
                            break;
                        case 49:
                            androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2], (java.util.List<?>) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), writer, messageSchema.getHighSpeedVideoSizes(length2));
                            break;
                        case 50:
                            messageSchema.getHighSpeedVideoFpsRanges(writer, i17, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), length2);
                            break;
                        case 51:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighSpeedVideoFpsRangesFor(i17, ((java.lang.Double) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).doubleValue());
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighSpeedVideoSizes(i17, ((java.lang.Float) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).floatValue());
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighResolutionOutputSizeshNQ4ISI(i17, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).longValue());
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighSpeedVideoSizes(i17, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).longValue());
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.Camera2StreamConfigurationMap(i17, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).intValue());
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.Camera2StreamConfigurationMap(i17, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).longValue());
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighSpeedVideoFpsRangesFor(i17, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).intValue());
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.Camera2StreamConfigurationMap(i17, ((java.lang.Boolean) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).booleanValue());
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                java.lang.Object outputFormats = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575);
                                if (outputFormats instanceof java.lang.String) {
                                    writer.getHighSpeedVideoFpsRanges(i17, (java.lang.String) outputFormats);
                                    break;
                                } else {
                                    writer.getHighSpeedVideoFpsRanges(i17, (androidx.content.preferences.protobuf.ByteString) outputFormats);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 60:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighSpeedVideoFpsRanges(i17, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), messageSchema.getHighSpeedVideoSizes(length2));
                                break;
                            } else {
                                break;
                            }
                        case 61:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighSpeedVideoFpsRanges(i17, (androidx.content.preferences.protobuf.ByteString) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575));
                                break;
                            } else {
                                break;
                            }
                        case 62:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getOutputFormats(i17, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).intValue());
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (messageSchema.getHighSpeedVideoFpsRanges(t, i17, length2)) {
                                writer.getHighResolutionOutputSizeshNQ4ISI(i17, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).intValue());
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2 + 2] & 1048575) == i17) {
                                writer.getHighSpeedVideoSizes(i17, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).intValue());
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2 + 2] & 1048575) == i17) {
                                writer.getHighSpeedVideoFpsRanges(i17, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).longValue());
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2 + 2] & 1048575) == i17) {
                                writer.getOutputMinFrameDuration(i17, ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).intValue());
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2 + 2] & 1048575) == i17) {
                                writer.getHighSpeedVideoFpsRangesFor(i17, ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575)).longValue());
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, messageSchema.getHighResolutionOutputSizeshNQ4ISI[length2 + 2] & 1048575) == i17) {
                                writer.getHighSpeedVideoSizes(i17, androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i16 & 1048575), messageSchema.getHighSpeedVideoSizes(length2));
                                break;
                            } else {
                                break;
                            }
                    }
                }
                while (entry4 != null) {
                    messageSchema.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(writer, entry4);
                    entry4 = it3.hasNext() ? (java.util.Map.Entry) it3.next() : null;
                }
            }
        }
        it3 = null;
        entry4 = null;
        while (length2 >= 0) {
        }
        while (entry4 != null) {
        }
    }

    private <K, V> void getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.Writer writer, int i, java.lang.Object obj, int i2) throws java.io.IOException {
        if (obj != null) {
            writer.Camera2StreamConfigurationMap(i, this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM[(i2 / 3) * 2]), this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x075e A[Catch: all -> 0x075a, TRY_ENTER, TryCatch #10 {all -> 0x075a, blocks: (B:34:0x00d3, B:17:0x0738, B:39:0x075e, B:40:0x0763, B:99:0x0395, B:104:0x03a2, B:105:0x03b5, B:106:0x03c8, B:107:0x03db, B:108:0x03ee, B:109:0x0401, B:110:0x0414, B:111:0x0427, B:112:0x043a, B:113:0x044d, B:114:0x0460, B:115:0x0472, B:116:0x0484, B:117:0x0496, B:118:0x04c1, B:119:0x04d3, B:120:0x04e5, B:121:0x04fe, B:123:0x0506, B:124:0x0515, B:125:0x0524, B:126:0x0536, B:127:0x0549, B:128:0x055c, B:129:0x056f, B:130:0x0582, B:131:0x0595, B:132:0x05a8, B:134:0x05be, B:135:0x05de, B:136:0x05f0, B:137:0x0602, B:138:0x0614, B:139:0x0626, B:141:0x063b, B:144:0x0642, B:145:0x0649, B:146:0x0656, B:147:0x0668, B:148:0x067a, B:149:0x069d, B:150:0x06a8, B:151:0x06ba, B:152:0x06cc, B:153:0x06de, B:154:0x06f0, B:155:0x0702, B:156:0x0714, B:157:0x0726), top: B:33:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0769 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x07a0 A[LOOP:3: B:53:0x079c->B:55:0x07a0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x07b4  */
    /* JADX WARN: Type inference failed for: r21v0, types: [androidx.datastore.preferences.protobuf.Reader] */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Camera2StreamConfigurationMap(T t, androidx.content.preferences.protobuf.Reader reader, androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite) throws java.io.IOException {
        androidx.content.preferences.protobuf.UnknownFieldSchema unknownFieldSchema;
        T t2;
        java.lang.Object obj;
        int i;
        androidx.content.preferences.protobuf.UnknownFieldSchema unknownFieldSchema2;
        T t3;
        androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema;
        androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite2;
        androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite3;
        java.lang.Object highSpeedVideoFpsRanges;
        java.lang.Object obj2;
        T t4 = t;
        androidx.content.preferences.protobuf.ExtensionRegistryLite extensionRegistryLite4 = extensionRegistryLite;
        getHighSpeedVideoSizesFor(t);
        androidx.content.preferences.protobuf.UnknownFieldSchema unknownFieldSchema3 = this.unwrapAs;
        androidx.content.preferences.protobuf.ExtensionSchema<?> extensionSchema2 = this.getInputSizeshNQ4ISI;
        java.lang.Object obj3 = null;
        androidx.content.preferences.protobuf.FieldSet<?> fieldSet = null;
        while (true) {
            try {
                int highSpeedVideoFpsRangesFor = reader.getHighSpeedVideoFpsRangesFor();
                int highResolutionOutputSizeshNQ4ISI = (highSpeedVideoFpsRangesFor < this.getOutputSizes || highSpeedVideoFpsRangesFor > this.getOutputMinFrameDurationlomOqCM) ? -1 : getHighResolutionOutputSizeshNQ4ISI(highSpeedVideoFpsRangesFor, 0);
                if (highResolutionOutputSizeshNQ4ISI >= 0) {
                    unknownFieldSchema = unknownFieldSchema3;
                    t2 = t4;
                    try {
                        int i2 = this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 1];
                        switch ((267386880 & i2) >>> 20) {
                            case 0:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t2, 1048575 & i2, reader.getHighSpeedVideoSizes());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 1:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(t2, 1048575 & i2, reader.getHighSpeedVideoSizesFor());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 2:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t2, 1048575 & i2, reader.getOutputStallDuration());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 3:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t2, 1048575 & i2, reader.getValidOutputFormatsForInputhNQ4ISI());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 4:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, 1048575 & i2, reader.getOutputMinFrameDuration());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 5:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t2, 1048575 & i2, reader.getInputSizeshNQ4ISI());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 6:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, 1048575 & i2, reader.getInputFormats());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 7:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t2, 1048575 & i2, reader.getHighSpeedVideoFpsRanges());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 8:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                getHighSpeedVideoSizes(t2, i2, reader);
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 9:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.MessageLite messageLite = (androidx.content.preferences.protobuf.MessageLite) getHighSpeedVideoSizes((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                reader.getHighSpeedVideoFpsRanges(messageLite, getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI), extensionRegistryLite3);
                                getHighSpeedVideoSizes.putObject(t2, this.getHighResolutionOutputSizeshNQ4ISI[r12] & 1048575, messageLite);
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 10:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, 1048575 & i2, reader.Camera2StreamConfigurationMap());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 11:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, 1048575 & i2, reader.unwrapAs());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 12:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                int outputFormats = reader.getOutputFormats();
                                androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier = (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((highResolutionOutputSizeshNQ4ISI / 3) * 2) + 1];
                                if (enumVerifier != null && !enumVerifier.isInRange(outputFormats)) {
                                    obj = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(t2, highSpeedVideoFpsRangesFor, outputFormats, obj, unknownFieldSchema);
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                    break;
                                }
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, 1048575 & i2, outputFormats);
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 13:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, 1048575 & i2, reader.getOutputMinFrameDurationlomOqCM());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 14:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t2, 1048575 & i2, reader.getOutputSizeshNQ4ISI());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 15:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, 1048575 & i2, reader.getOutputStallDurationlomOqCM());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 16:
                                extensionSchema = extensionSchema2;
                                obj = obj3;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges(t2, 1048575 & i2, reader.getOutputSizes());
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 17:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                androidx.content.preferences.protobuf.MessageLite messageLite2 = (androidx.content.preferences.protobuf.MessageLite) getHighSpeedVideoSizes((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                reader.getHighSpeedVideoSizes(messageLite2, getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI), extensionRegistryLite3);
                                getHighSpeedVideoSizes.putObject(t2, this.getHighResolutionOutputSizeshNQ4ISI[r12] & 1048575, messageLite2);
                                getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highResolutionOutputSizeshNQ4ISI);
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 18:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighSpeedVideoSizes(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 19:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getInputSizeshNQ4ISI(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 20:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getInputFormats(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 21:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.isOutputSupportedFor(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 22:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputFormats(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 23:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputMinFrameDuration(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 24:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighSpeedVideoFpsRanges(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 25:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 26:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                if ((536870912 & i2) != 0) {
                                    reader.getOutputStallDurationlomOqCM(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                } else {
                                    reader.getOutputMinFrameDurationlomOqCM(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                }
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 27:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighSpeedVideoFpsRangesFor(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2), getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI), extensionRegistryLite2);
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 28:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.Camera2StreamConfigurationMap(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 29:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.toString(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 30:
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                java.util.List highResolutionOutputSizeshNQ4ISI2 = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, i2 & 1048575);
                                reader.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI2);
                                highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI2, (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((highResolutionOutputSizeshNQ4ISI / 3) * 2) + 1], obj3, unknownFieldSchema);
                                obj = highSpeedVideoFpsRanges;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 31:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighSpeedVideoSizesFor(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 32:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputSizes(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 33:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputSizeshNQ4ISI(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 34:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputStallDuration(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 35:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighSpeedVideoSizes(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 36:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getInputSizeshNQ4ISI(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 37:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getInputFormats(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 38:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.isOutputSupportedFor(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 39:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputFormats(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 40:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getOutputMinFrameDuration(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 41:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighSpeedVideoFpsRanges(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 42:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.getHighResolutionOutputSizeshNQ4ISI(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 43:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                reader.toString(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 44:
                                java.util.List highResolutionOutputSizeshNQ4ISI3 = this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, i2 & 1048575);
                                reader.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI3);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                try {
                                    highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(t, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI3, (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((highResolutionOutputSizeshNQ4ISI / 3) * 2) + 1], obj, unknownFieldSchema);
                                    obj = highSpeedVideoFpsRanges;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused) {
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    if (obj == null) {
                                    }
                                    if (!unknownFieldSchema.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema) obj, (androidx.content.preferences.protobuf.Reader) reader, 0)) {
                                    }
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                }
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 45:
                                reader.getHighSpeedVideoSizesFor(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 46:
                                reader.getOutputSizes(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 47:
                                reader.getOutputSizeshNQ4ISI(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite2 = extensionRegistryLite4;
                                extensionRegistryLite3 = extensionRegistryLite2;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 48:
                                try {
                                    reader.getOutputStallDuration(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2));
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite2 = extensionRegistryLite4;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused2) {
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite2 = extensionRegistryLite4;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    if (obj == null) {
                                    }
                                    if (!unknownFieldSchema.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema) obj, (androidx.content.preferences.protobuf.Reader) reader, 0)) {
                                    }
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                }
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 49:
                                try {
                                    reader.Camera2StreamConfigurationMap(this.getInputFormats.getHighResolutionOutputSizeshNQ4ISI(t2, 1048575 & i2), getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI), extensionRegistryLite4);
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite2 = extensionRegistryLite4;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                    break;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    obj = obj3;
                                    obj3 = obj;
                                    while (i < this.getValidOutputFormatsForInputhNQ4ISI) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 50:
                                try {
                                    java.lang.Object obj4 = this.getOutputStallDurationlomOqCM[(highResolutionOutputSizeshNQ4ISI / 3) * 2];
                                    long j = 1048575 & i2;
                                    java.lang.Object outputFormats2 = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t2, j);
                                    if (outputFormats2 == null) {
                                        outputFormats2 = this.getOutputStallDuration.getHighSpeedVideoSizes();
                                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, j, outputFormats2);
                                    } else if (this.getOutputStallDuration.getHighSpeedVideoFpsRanges(outputFormats2)) {
                                        java.lang.Object highSpeedVideoSizes = this.getOutputStallDuration.getHighSpeedVideoSizes();
                                        this.getOutputStallDuration.getHighSpeedVideoSizes(highSpeedVideoSizes, outputFormats2);
                                        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, j, highSpeedVideoSizes);
                                        outputFormats2 = highSpeedVideoSizes;
                                    }
                                    reader.getHighSpeedVideoSizes(this.getOutputStallDuration.getHighSpeedVideoSizes(outputFormats2), this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(obj4), extensionRegistryLite4);
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite2 = extensionRegistryLite4;
                                    extensionRegistryLite3 = extensionRegistryLite2;
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                    break;
                                } catch (java.lang.Throwable th2) {
                                    th = th2;
                                    while (i < this.getValidOutputFormatsForInputhNQ4ISI) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                                break;
                            case 51:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Double.valueOf(reader.getHighSpeedVideoSizes()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 52:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Float.valueOf(reader.getHighSpeedVideoSizesFor()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 53:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Long.valueOf(reader.getOutputStallDuration()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 54:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Long.valueOf(reader.getValidOutputFormatsForInputhNQ4ISI()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 55:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Integer.valueOf(reader.getOutputMinFrameDuration()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 56:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Long.valueOf(reader.getInputSizeshNQ4ISI()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 57:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Integer.valueOf(reader.getInputFormats()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 58:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Boolean.valueOf(reader.getHighSpeedVideoFpsRanges()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 59:
                                getHighSpeedVideoSizes(t2, i2, reader);
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 60:
                                androidx.content.preferences.protobuf.MessageLite messageLite3 = (androidx.content.preferences.protobuf.MessageLite) Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI);
                                reader.getHighSpeedVideoFpsRanges(messageLite3, getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI), extensionRegistryLite4);
                                Camera2StreamConfigurationMap(t2, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI, messageLite3);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 61:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, reader.Camera2StreamConfigurationMap());
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 62:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Integer.valueOf(reader.unwrapAs()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 63:
                                int outputFormats3 = reader.getOutputFormats();
                                androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier2 = (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((highResolutionOutputSizeshNQ4ISI / 3) * 2) + 1];
                                if (enumVerifier2 != null && !enumVerifier2.isInRange(outputFormats3)) {
                                    obj3 = androidx.content.preferences.protobuf.SchemaUtil.Camera2StreamConfigurationMap(t2, highSpeedVideoFpsRangesFor, outputFormats3, obj3, unknownFieldSchema);
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite3 = extensionRegistryLite4;
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                    break;
                                }
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Integer.valueOf(outputFormats3));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 64:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Integer.valueOf(reader.getOutputMinFrameDurationlomOqCM()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 65:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Long.valueOf(reader.getOutputSizeshNQ4ISI()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 66:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Integer.valueOf(reader.getOutputStallDurationlomOqCM()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 67:
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(t2, i2 & 1048575, java.lang.Long.valueOf(reader.getOutputSizes()));
                                androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t2, this.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI + 2] & 1048575, highSpeedVideoFpsRangesFor);
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                            case 68:
                                try {
                                    androidx.content.preferences.protobuf.MessageLite messageLite4 = (androidx.content.preferences.protobuf.MessageLite) Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.MessageSchema<T>) t2, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI);
                                    reader.getHighSpeedVideoSizes(messageLite4, getHighSpeedVideoSizes(highResolutionOutputSizeshNQ4ISI), extensionRegistryLite4);
                                    Camera2StreamConfigurationMap(t2, highSpeedVideoFpsRangesFor, highResolutionOutputSizeshNQ4ISI, messageLite4);
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite3 = extensionRegistryLite4;
                                } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused3) {
                                    obj = obj3;
                                    extensionSchema = extensionSchema2;
                                    extensionRegistryLite3 = extensionRegistryLite4;
                                    if (obj == null) {
                                        obj = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(t2);
                                    }
                                    if (!unknownFieldSchema.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema) obj, (androidx.content.preferences.protobuf.Reader) reader, 0)) {
                                        obj2 = obj;
                                        for (int i3 = this.Camera2StreamConfigurationMap; i3 < this.getValidOutputFormatsForInputhNQ4ISI; i3++) {
                                            obj2 = getHighSpeedVideoSizes(t, this.getHighSpeedVideoSizesFor[i3], obj2, unknownFieldSchema, t);
                                        }
                                        if (obj2 == null) {
                                            return;
                                        }
                                        unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) t2, (T) obj2);
                                        return;
                                    }
                                    extensionRegistryLite4 = extensionRegistryLite3;
                                    obj3 = obj;
                                    extensionSchema2 = extensionSchema;
                                    t4 = t2;
                                    unknownFieldSchema3 = unknownFieldSchema;
                                }
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                            default:
                                obj = obj3;
                                extensionSchema = extensionSchema2;
                                extensionRegistryLite3 = extensionRegistryLite4;
                                if (obj == null) {
                                    try {
                                        try {
                                            obj = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(t2);
                                        } catch (androidx.datastore.preferences.protobuf.InvalidProtocolBufferException.InvalidWireTypeException unused4) {
                                            if (obj == null) {
                                            }
                                            if (!unknownFieldSchema.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema) obj, (androidx.content.preferences.protobuf.Reader) reader, 0)) {
                                            }
                                            extensionRegistryLite4 = extensionRegistryLite3;
                                            obj3 = obj;
                                            extensionSchema2 = extensionSchema;
                                            t4 = t2;
                                            unknownFieldSchema3 = unknownFieldSchema;
                                        }
                                    } catch (java.lang.Throwable th3) {
                                        th = th3;
                                        obj3 = obj;
                                        while (i < this.getValidOutputFormatsForInputhNQ4ISI) {
                                        }
                                        if (obj3 != null) {
                                        }
                                        throw th;
                                    }
                                }
                                if (!unknownFieldSchema.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema) obj, (androidx.content.preferences.protobuf.Reader) reader, 0)) {
                                    obj2 = obj;
                                    for (int i4 = this.Camera2StreamConfigurationMap; i4 < this.getValidOutputFormatsForInputhNQ4ISI; i4++) {
                                        obj2 = getHighSpeedVideoSizes(t, this.getHighSpeedVideoSizesFor[i4], obj2, unknownFieldSchema, t);
                                    }
                                    if (obj2 == null) {
                                        return;
                                    }
                                }
                                extensionRegistryLite4 = extensionRegistryLite3;
                                obj3 = obj;
                                extensionSchema2 = extensionSchema;
                                t4 = t2;
                                unknownFieldSchema3 = unknownFieldSchema;
                                break;
                        }
                    } catch (java.lang.Throwable th4) {
                        th = th4;
                    }
                } else {
                    if (highSpeedVideoFpsRangesFor == Integer.MAX_VALUE) {
                        for (int i5 = this.Camera2StreamConfigurationMap; i5 < this.getValidOutputFormatsForInputhNQ4ISI; i5++) {
                            obj3 = getHighSpeedVideoSizes(t, this.getHighSpeedVideoSizesFor[i5], obj3, unknownFieldSchema3, t);
                        }
                        if (obj3 != null) {
                            unknownFieldSchema3.getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) t4, (T) obj3);
                            return;
                        }
                        return;
                    }
                    try {
                        java.lang.Object highSpeedVideoFpsRanges2 = !this.getOutputMinFrameDuration ? null : extensionSchema2.getHighSpeedVideoFpsRanges(extensionRegistryLite4, this.getHighSpeedVideoFpsRanges, highSpeedVideoFpsRangesFor);
                        if (highSpeedVideoFpsRanges2 != null) {
                            if (fieldSet == null) {
                                try {
                                    fieldSet = extensionSchema2.getHighSpeedVideoFpsRangesFor(t4);
                                } catch (java.lang.Throwable th5) {
                                    th = th5;
                                    unknownFieldSchema = unknownFieldSchema3;
                                    t2 = t4;
                                    while (i < this.getValidOutputFormatsForInputhNQ4ISI) {
                                    }
                                    if (obj3 != null) {
                                    }
                                    throw th;
                                }
                            }
                            androidx.content.preferences.protobuf.FieldSet<?> fieldSet2 = fieldSet;
                            unknownFieldSchema2 = unknownFieldSchema3;
                            t3 = t4;
                            try {
                                obj3 = extensionSchema2.getHighSpeedVideoFpsRangesFor(t, reader, highSpeedVideoFpsRanges2, extensionRegistryLite, fieldSet2, obj3, unknownFieldSchema2);
                                fieldSet = fieldSet2;
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                t2 = t3;
                                unknownFieldSchema = unknownFieldSchema2;
                                for (i = this.Camera2StreamConfigurationMap; i < this.getValidOutputFormatsForInputhNQ4ISI; i++) {
                                    obj3 = getHighSpeedVideoSizes(t, this.getHighSpeedVideoSizesFor[i], obj3, unknownFieldSchema, t);
                                }
                                if (obj3 != null) {
                                    unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) t2, (T) obj3);
                                }
                                throw th;
                            }
                        } else {
                            unknownFieldSchema2 = unknownFieldSchema3;
                            t3 = t4;
                            if (obj3 == null) {
                                obj3 = unknownFieldSchema2.getHighSpeedVideoFpsRangesFor(t3);
                            }
                            if (!unknownFieldSchema2.Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.UnknownFieldSchema) obj3, (androidx.content.preferences.protobuf.Reader) reader, 0)) {
                                int i6 = this.Camera2StreamConfigurationMap;
                                while (i6 < this.getValidOutputFormatsForInputhNQ4ISI) {
                                    androidx.content.preferences.protobuf.UnknownFieldSchema unknownFieldSchema4 = unknownFieldSchema2;
                                    obj3 = getHighSpeedVideoSizes(t, this.getHighSpeedVideoSizesFor[i6], obj3, unknownFieldSchema4, t);
                                    i6++;
                                    t3 = t3;
                                    unknownFieldSchema2 = unknownFieldSchema4;
                                }
                                java.lang.Object obj5 = t3;
                                androidx.content.preferences.protobuf.UnknownFieldSchema unknownFieldSchema5 = unknownFieldSchema2;
                                if (obj3 != null) {
                                    unknownFieldSchema5.getHighResolutionOutputSizeshNQ4ISI(obj5, obj3);
                                    return;
                                }
                                return;
                            }
                        }
                        t4 = t3;
                        unknownFieldSchema3 = unknownFieldSchema2;
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        unknownFieldSchema = unknownFieldSchema3;
                        t2 = t4;
                        obj = obj3;
                        obj3 = obj;
                        while (i < this.getValidOutputFormatsForInputhNQ4ISI) {
                        }
                        if (obj3 != null) {
                        }
                        throw th;
                    }
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                unknownFieldSchema = unknownFieldSchema3;
                t2 = t4;
            }
        }
    }

    static androidx.content.preferences.protobuf.UnknownFieldSetLite getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
        androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) obj;
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
        if (unknownFieldSetLite != androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
            return unknownFieldSetLite;
        }
        androidx.content.preferences.protobuf.UnknownFieldSetLite highSpeedVideoSizes = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
        generatedMessageLite.unknownFields = highSpeedVideoSizes;
        return highSpeedVideoSizes;
    }

    /* renamed from: androidx.datastore.preferences.protobuf.MessageSchema$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[androidx.datastore.preferences.protobuf.WireFormat.FieldType.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BOOL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.BYTES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.DOUBLE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED32.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED32.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FIXED64.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SFIXED64.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.FLOAT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.ENUM.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT32.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT32.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.INT64.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.UINT64.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.MESSAGE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT32.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.SINT64.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[androidx.datastore.preferences.protobuf.WireFormat.FieldType.STRING.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
        }
    }

    private static int getHighSpeedVideoSizes(byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.WireFormat.FieldType fieldType, java.lang.Class<?> cls, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        switch (androidx.content.preferences.protobuf.MessageSchema.AnonymousClass1.getHighSpeedVideoFpsRangesFor[fieldType.ordinal()]) {
            case 1:
                int highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, registers);
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Boolean.valueOf(registers.Camera2StreamConfigurationMap != 0);
                return highSpeedVideoFpsRanges;
            case 2:
                return androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr, i, registers);
            case 3:
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Double.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr, i));
                return i + 8;
            case 4:
            case 5:
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(bArr, i));
                return i + 4;
            case 6:
            case 7:
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i));
                return i + 8;
            case 8:
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Float.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(registers.getHighSpeedVideoSizes);
                return Camera2StreamConfigurationMap;
            case 12:
            case 13:
                int highSpeedVideoFpsRanges2 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, registers);
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(registers.Camera2StreamConfigurationMap);
                return highSpeedVideoFpsRanges2;
            case 14:
                return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(cls), bArr, i, i2, registers);
            case 15:
                int Camera2StreamConfigurationMap2 = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.getHighSpeedVideoSizes));
                return Camera2StreamConfigurationMap2;
            case 16:
                int highSpeedVideoFpsRanges3 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, registers);
                registers.getHighSpeedVideoFpsRangesFor = java.lang.Long.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.Camera2StreamConfigurationMap));
                return highSpeedVideoFpsRanges3;
            case 17:
                return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(bArr, i, registers);
            default:
                throw new java.lang.RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int getHighSpeedVideoSizes(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        int outputSizes;
        sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
        androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) unsafe.getObject(t, j2);
        if (!protobufList.isModifiable()) {
            int size = protobufList.size();
            protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j2, protobufList);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 19:
            case 36:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(bArr, i, (androidx.datastore.preferences.protobuf.Internal.ProtobufList<?>) protobufList, registers);
                }
                if (i5 == 5) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getOutputMinFrameDuration(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getOutputFormats(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getOutputStallDuration(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getOutputMinFrameDuration(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getOutputSizes(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(bArr, i, protobufList, registers);
                }
                if (i5 == 1) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(i3, bArr, i, i2, (androidx.datastore.preferences.protobuf.Internal.ProtobufList<?>) protobufList, registers);
                }
                return i;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, protobufList, registers);
                }
                if (i5 == 5) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 25:
            case 42:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i3, bArr, i, i2, (androidx.datastore.preferences.protobuf.Internal.ProtobufList<?>) protobufList, registers);
                }
                return i;
            case 26:
                if (i5 == 2) {
                    if ((j & com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_DISK_SPACE) == 0) {
                        return androidx.content.preferences.protobuf.ArrayDecoders.getInputSizeshNQ4ISI(i3, bArr, i, i2, protobufList, registers);
                    }
                    return androidx.content.preferences.protobuf.ArrayDecoders.getInputFormats(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 27:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(getHighSpeedVideoSizes(i6), i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 28:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(i3, bArr, i, i2, (androidx.datastore.preferences.protobuf.Internal.ProtobufList<?>) protobufList, registers);
                }
                return i;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        outputSizes = androidx.content.preferences.protobuf.ArrayDecoders.getOutputSizes(i3, bArr, i, i2, protobufList, registers);
                    }
                    return i;
                }
                outputSizes = androidx.content.preferences.protobuf.ArrayDecoders.getOutputMinFrameDuration(bArr, i, protobufList, registers);
                androidx.content.preferences.protobuf.SchemaUtil.getHighSpeedVideoFpsRanges(t, i4, protobufList, (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((i6 / 3) * 2) + 1], null, this.unwrapAs);
                return outputSizes;
            case 33:
            case 47:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getInputSizeshNQ4ISI(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizesFor(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 34:
            case 48:
                if (i5 == 2) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizesFor(bArr, i, protobufList, registers);
                }
                if (i5 == 0) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getOutputFormats(i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            case 49:
                if (i5 == 3) {
                    return androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(getHighSpeedVideoSizes(i6), i3, bArr, i, i2, protobufList, registers);
                }
                return i;
            default:
                return i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    private <K, V> int getHighSpeedVideoFpsRanges(T t, byte[] bArr, int i, int i2, int i3, long j, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
        java.lang.Object obj = this.getOutputStallDurationlomOqCM[(i3 / 3) * 2];
        java.lang.Object object = unsafe.getObject(t, j);
        if (this.getOutputStallDuration.getHighSpeedVideoFpsRanges(object)) {
            java.lang.Object highSpeedVideoSizes = this.getOutputStallDuration.getHighSpeedVideoSizes();
            this.getOutputStallDuration.getHighSpeedVideoSizes(highSpeedVideoSizes, object);
            unsafe.putObject(t, j, highSpeedVideoSizes);
            object = highSpeedVideoSizes;
        }
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> highResolutionOutputSizeshNQ4ISI = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(obj);
        java.util.Map<?, ?> highSpeedVideoSizes2 = this.getOutputStallDuration.getHighSpeedVideoSizes(object);
        int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
        int i4 = registers.getHighSpeedVideoSizes;
        if (i4 < 0 || i4 > i2 - Camera2StreamConfigurationMap) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getInputSizeshNQ4ISI();
        }
        int i5 = Camera2StreamConfigurationMap + i4;
        java.lang.Object obj2 = highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj3 = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
        while (Camera2StreamConfigurationMap < i5) {
            int i6 = Camera2StreamConfigurationMap + 1;
            byte b = bArr[Camera2StreamConfigurationMap];
            if (b < 0) {
                i6 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor((int) b, bArr, i6, registers);
                b = registers.getHighSpeedVideoSizes;
            }
            int i7 = b >>> 3;
            int i8 = b & 7;
            if (i7 == 1) {
                if (i8 == highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges.getWireType()) {
                    Camera2StreamConfigurationMap = getHighSpeedVideoSizes(bArr, i6, i2, highResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges, null, registers);
                    obj2 = registers.getHighSpeedVideoFpsRangesFor;
                } else {
                    Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(b, bArr, i6, i2, registers);
                }
            } else {
                if (i7 == 2 && i8 == highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI.getWireType()) {
                    Camera2StreamConfigurationMap = getHighSpeedVideoSizes(bArr, i6, i2, highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap.getClass(), registers);
                    obj3 = registers.getHighSpeedVideoFpsRangesFor;
                }
                Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(b, bArr, i6, i2, registers);
            }
        }
        if (Camera2StreamConfigurationMap != i5) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        highSpeedVideoSizes2.put(obj2, obj3);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int Camera2StreamConfigurationMap(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
        long j2 = this.getHighResolutionOutputSizeshNQ4ISI[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Double.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr, i)));
                    int i9 = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return i9;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Float.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(registers.Camera2StreamConfigurationMap));
                    unsafe.putInt(t, j2, i4);
                    return highSpeedVideoFpsRanges;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int Camera2StreamConfigurationMap = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(registers.getHighSpeedVideoSizes));
                    unsafe.putInt(t, j2, i4);
                    return Camera2StreamConfigurationMap;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, java.lang.Long.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(bArr, i)));
                    unsafe.putInt(t, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int highSpeedVideoFpsRanges2 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Boolean.valueOf(registers.Camera2StreamConfigurationMap != 0));
                    unsafe.putInt(t, j2, i4);
                    return highSpeedVideoFpsRanges2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int Camera2StreamConfigurationMap2 = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
                    int i10 = registers.getHighSpeedVideoSizes;
                    if (i10 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & 536870912) != 0 && !androidx.content.preferences.protobuf.Utf8.getHighSpeedVideoFpsRangesFor(bArr, Camera2StreamConfigurationMap2, Camera2StreamConfigurationMap2 + i10)) {
                            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getHighSpeedVideoSizes();
                        }
                        unsafe.putObject(t, j, new java.lang.String(bArr, Camera2StreamConfigurationMap2, i10, androidx.content.preferences.protobuf.Internal.getHighSpeedVideoSizes));
                        Camera2StreamConfigurationMap2 += i10;
                    }
                    unsafe.putInt(t, j2, i4);
                    return Camera2StreamConfigurationMap2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    java.lang.Object Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.MessageSchema<T>) t, i4, i8);
                    int highSpeedVideoSizes = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(Camera2StreamConfigurationMap3, getHighSpeedVideoSizes(i8), bArr, i, i2, registers);
                    unsafe.putObject(t, this.getHighResolutionOutputSizeshNQ4ISI[1 + i8] & 1048575, Camera2StreamConfigurationMap3);
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575, i4);
                    return highSpeedVideoSizes;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr, i, registers);
                    unsafe.putObject(t, j, registers.getHighSpeedVideoFpsRangesFor);
                    unsafe.putInt(t, j2, i4);
                    return highResolutionOutputSizeshNQ4ISI;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int Camera2StreamConfigurationMap4 = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
                    int i11 = registers.getHighSpeedVideoSizes;
                    androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier = (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((i8 / 3) * 2) + 1];
                    if (enumVerifier == null || enumVerifier.isInRange(i11)) {
                        unsafe.putObject(t, j, java.lang.Integer.valueOf(i11));
                        unsafe.putInt(t, j2, i4);
                        return Camera2StreamConfigurationMap4;
                    }
                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) t;
                    androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite = generatedMessageLite.unknownFields;
                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                        unknownFieldSetLite = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
                        generatedMessageLite.unknownFields = unknownFieldSetLite;
                    }
                    unknownFieldSetLite.getHighSpeedVideoSizes(i3, java.lang.Long.valueOf(i11));
                    return Camera2StreamConfigurationMap4;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int Camera2StreamConfigurationMap5 = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Integer.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers.getHighSpeedVideoSizes)));
                    unsafe.putInt(t, j2, i4);
                    return Camera2StreamConfigurationMap5;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int highSpeedVideoFpsRanges3 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i, registers);
                    unsafe.putObject(t, j, java.lang.Long.valueOf(androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers.Camera2StreamConfigurationMap)));
                    unsafe.putInt(t, j2, i4);
                    return highSpeedVideoFpsRanges3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    java.lang.Object Camera2StreamConfigurationMap6 = Camera2StreamConfigurationMap((androidx.content.preferences.protobuf.MessageSchema<T>) t, i4, i8);
                    int highSpeedVideoFpsRangesFor = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(Camera2StreamConfigurationMap6, getHighSpeedVideoSizes(i8), bArr, i, i2, (i3 & (-8)) | 4, registers);
                    unsafe.putObject(t, this.getHighResolutionOutputSizeshNQ4ISI[1 + i8] & 1048575, Camera2StreamConfigurationMap6);
                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, this.getHighResolutionOutputSizeshNQ4ISI[r13] & 1048575, i4);
                    return highSpeedVideoFpsRangesFor;
                }
                break;
        }
        return i;
    }

    private androidx.content.preferences.protobuf.Schema getHighSpeedVideoSizes(int i) {
        int i2 = (i / 3) * 2;
        androidx.content.preferences.protobuf.Schema schema = (androidx.content.preferences.protobuf.Schema) this.getOutputStallDurationlomOqCM[i2];
        if (schema != null) {
            return schema;
        }
        androidx.content.preferences.protobuf.Schema<T> highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI((java.lang.Class) this.getOutputStallDurationlomOqCM[i2 + 1]);
        this.getOutputStallDurationlomOqCM[i2] = highResolutionOutputSizeshNQ4ISI;
        return highResolutionOutputSizeshNQ4ISI;
    }

    /* JADX WARN: Code restructure failed: missing block: B:203:0x03d4, code lost:
    
        if (r0 == r15) goto L139;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:25:0x00b3. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0420 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0460  */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final int getHighResolutionOutputSizeshNQ4ISI(T t, byte[] bArr, int i, int i2, int i3, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        sun.misc.Unsafe unsafe;
        int i4;
        T t2;
        androidx.content.preferences.protobuf.MessageSchema<T> messageSchema;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers2;
        int i18;
        androidx.content.preferences.protobuf.MessageSchema<T> messageSchema2;
        T t3;
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite;
        T t4;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z;
        int i23;
        byte[] bArr2;
        int i24;
        byte[] bArr3;
        byte[] bArr4;
        int highResolutionOutputSizeshNQ4ISI;
        androidx.content.preferences.protobuf.MessageSchema<T> messageSchema3 = this;
        T t5 = t;
        byte[] bArr5 = bArr;
        int i25 = i2;
        int i26 = i3;
        androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers3 = registers;
        getHighSpeedVideoSizesFor(t);
        sun.misc.Unsafe unsafe2 = getHighSpeedVideoSizes;
        int i27 = i;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 0;
        int i32 = 1048575;
        while (true) {
            if (i27 < i25) {
                int i33 = i27 + 1;
                byte b = bArr5[i27];
                if (b < 0) {
                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor((int) b, bArr5, i33, registers3);
                    i7 = registers3.getHighSpeedVideoSizes;
                } else {
                    i7 = b;
                    i27 = i33;
                }
                int i34 = i7 >>> 3;
                int i35 = i7 & 7;
                if (i34 <= i28) {
                    if (i34 < messageSchema3.getOutputSizes || i34 > messageSchema3.getOutputMinFrameDurationlomOqCM) {
                        i8 = 0;
                        i9 = -1;
                    } else {
                        i8 = 0;
                        i9 = messageSchema3.getHighResolutionOutputSizeshNQ4ISI(i34, 0);
                    }
                } else {
                    i9 = (i34 < messageSchema3.getOutputSizes || i34 > messageSchema3.getOutputMinFrameDurationlomOqCM) ? -1 : messageSchema3.getHighResolutionOutputSizeshNQ4ISI(i34, i29 / 3);
                    i8 = 0;
                }
                if (i9 == -1) {
                    i10 = i7;
                    i11 = i31;
                    i12 = i32;
                    i13 = i34;
                    unsafe = unsafe2;
                    i14 = i8;
                } else {
                    int[] iArr = messageSchema3.getHighResolutionOutputSizeshNQ4ISI;
                    int i36 = iArr[i9 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    long j = i36 & 1048575;
                    int i38 = i27;
                    if (i37 <= 17) {
                        int i39 = iArr[i9 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        int i42 = i9;
                        if (i41 != i32) {
                            if (i32 != 1048575) {
                                unsafe2.putInt(t5, i32, i31);
                            }
                            if (i41 == 1048575) {
                                i12 = i41;
                                i21 = 0;
                            } else {
                                i12 = i41;
                                i21 = unsafe2.getInt(t5, i41);
                            }
                        } else {
                            i21 = i31;
                            i12 = i32;
                        }
                        switch (i37) {
                            case 0:
                                bArr2 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 1) {
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t5, j, androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr2, i22));
                                    i27 = i22 + 8;
                                    i24 = i21 | i40;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17 && i17 != 0) {
                                        messageSchema = this;
                                        t2 = t;
                                        i4 = i17;
                                        i5 = i16;
                                        i31 = i11;
                                        i32 = i12;
                                        break;
                                    } else {
                                        messageSchema2 = this;
                                        i18 = i17;
                                        registers2 = registers;
                                        if (!messageSchema2.getOutputMinFrameDuration && registers2.getHighResolutionOutputSizeshNQ4ISI != androidx.content.preferences.protobuf.ExtensionRegistryLite.getEmptyRegistry()) {
                                            i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, t, messageSchema2.getHighSpeedVideoFpsRanges, messageSchema2.unwrapAs, registers);
                                            t4 = t;
                                        } else {
                                            ?? r6 = t;
                                            androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) r6;
                                            unknownFieldSetLite = generatedMessageLite.unknownFields;
                                            if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                                unknownFieldSetLite = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
                                                generatedMessageLite.unknownFields = unknownFieldSetLite;
                                            }
                                            i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                            t4 = r6;
                                        }
                                        i29 = i15;
                                        i31 = i11;
                                        t3 = t4;
                                        i32 = i12;
                                        bArr5 = bArr;
                                        i25 = i2;
                                        t5 = t3;
                                        i30 = i6;
                                        messageSchema3 = messageSchema2;
                                        registers3 = registers2;
                                        i28 = i13;
                                        i26 = i18;
                                        unsafe2 = unsafe;
                                    }
                                }
                                break;
                            case 1:
                                bArr2 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 5) {
                                    androidx.content.preferences.protobuf.UnsafeUtil.Camera2StreamConfigurationMap(t5, j, androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr2, i22));
                                    i27 = i22 + 4;
                                    i24 = i21 | i40;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                        break;
                                    }
                                    ?? r62 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite2 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r62;
                                    unknownFieldSetLite = generatedMessageLite2.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r62;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 2:
                            case 3:
                                bArr2 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 0) {
                                    int highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr2, i22, registers3);
                                    unsafe2.putLong(t, j, registers3.Camera2StreamConfigurationMap);
                                    i31 = i21 | i40;
                                    i27 = highSpeedVideoFpsRanges;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r622 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite22 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r622;
                                    unknownFieldSetLite = generatedMessageLite22.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r622;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 4:
                            case 11:
                                bArr2 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 0) {
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr2, i22, registers3);
                                    unsafe2.putInt(t5, j, registers3.getHighSpeedVideoSizes);
                                    i24 = i21 | i40;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r6222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r6222;
                                    unknownFieldSetLite = generatedMessageLite222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r6222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 1) {
                                    bArr2 = bArr3;
                                    unsafe2.putLong(t, j, androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr3, i22));
                                    i27 = i22 + 8;
                                    i24 = i21 | i40;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r62222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite2222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r62222;
                                    unknownFieldSetLite = generatedMessageLite2222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r62222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 5) {
                                    unsafe2.putInt(t5, j, androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(bArr3, i22));
                                    i27 = i22 + 4;
                                    i24 = i21 | i40;
                                    bArr2 = bArr3;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r622222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite22222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r622222;
                                    unknownFieldSetLite = generatedMessageLite22222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r622222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 0) {
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr3, i22, registers3);
                                    androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t5, j, registers3.Camera2StreamConfigurationMap != 0);
                                    i24 = i21 | i40;
                                    bArr2 = bArr3;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r6222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r6222222;
                                    unknownFieldSetLite = generatedMessageLite222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r6222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 2) {
                                    if ((i36 & 536870912) != 0) {
                                        i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(bArr3, i22, registers3);
                                    } else {
                                        i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(bArr3, i22, registers3);
                                    }
                                    unsafe2.putObject(t5, j, registers3.getHighSpeedVideoFpsRangesFor);
                                    i24 = i21 | i40;
                                    bArr2 = bArr3;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r62222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite2222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r62222222;
                                    unknownFieldSetLite = generatedMessageLite2222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r62222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 9:
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 2) {
                                    java.lang.Object highSpeedVideoSizes = messageSchema3.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.MessageSchema<T>) t5, i15);
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(highSpeedVideoSizes, messageSchema3.getHighSpeedVideoSizes(i15), bArr, i22, i2, registers);
                                    getHighSpeedVideoSizes.putObject(t5, messageSchema3.getHighResolutionOutputSizeshNQ4ISI[r17] & 1048575, highSpeedVideoSizes);
                                    messageSchema3.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t5, i15);
                                    bArr3 = bArr;
                                    i24 = i21 | i40;
                                    bArr2 = bArr3;
                                    i31 = i24;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    bArr3 = bArr;
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r622222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite22222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r622222222;
                                    unknownFieldSetLite = generatedMessageLite22222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r622222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 2) {
                                    highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(bArr4, i22, registers3);
                                    unsafe2.putObject(t5, j, registers3.getHighSpeedVideoFpsRangesFor);
                                    i21 |= i40;
                                    bArr2 = bArr4;
                                    i27 = highResolutionOutputSizeshNQ4ISI;
                                    i31 = i21;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r6222222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r6222222222;
                                    unknownFieldSetLite = generatedMessageLite222222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r6222222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 12:
                                bArr4 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 0) {
                                    highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr4, i22, registers3);
                                    int i43 = registers3.getHighSpeedVideoSizes;
                                    androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier = (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) messageSchema3.getOutputStallDurationlomOqCM[((i15 / 3) * 2) + 1];
                                    if ((i36 & Integer.MIN_VALUE) == 0 || enumVerifier == null || enumVerifier.isInRange(i43)) {
                                        unsafe2.putInt(t5, j, i43);
                                        i21 |= i40;
                                        bArr2 = bArr4;
                                        i27 = highResolutionOutputSizeshNQ4ISI;
                                        i31 = i21;
                                        i30 = i23;
                                        bArr5 = bArr2;
                                        i29 = i15;
                                        i28 = i13;
                                        i32 = i12;
                                        i25 = i2;
                                        break;
                                    } else {
                                        androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite3 = (androidx.content.preferences.protobuf.GeneratedMessageLite) t5;
                                        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite2 = generatedMessageLite3.unknownFields;
                                        if (unknownFieldSetLite2 == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                            unknownFieldSetLite2 = androidx.content.preferences.protobuf.UnknownFieldSetLite.getHighSpeedVideoSizes();
                                            generatedMessageLite3.unknownFields = unknownFieldSetLite2;
                                        }
                                        unknownFieldSetLite2.getHighSpeedVideoSizes(i23, java.lang.Long.valueOf(i43));
                                        bArr2 = bArr4;
                                        i27 = highResolutionOutputSizeshNQ4ISI;
                                        i31 = i21;
                                        i30 = i23;
                                        bArr5 = bArr2;
                                        i29 = i15;
                                        i28 = i13;
                                        i32 = i12;
                                        i25 = i2;
                                    }
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r62222222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite2222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r62222222222;
                                    unknownFieldSetLite = generatedMessageLite2222222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r62222222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 0) {
                                    highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.ArrayDecoders.Camera2StreamConfigurationMap(bArr4, i22, registers3);
                                    unsafe2.putInt(t5, j, androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag32(registers3.getHighSpeedVideoSizes));
                                    i21 |= i40;
                                    bArr2 = bArr4;
                                    i27 = highResolutionOutputSizeshNQ4ISI;
                                    i31 = i21;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r622222222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite22222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r622222222222;
                                    unknownFieldSetLite = generatedMessageLite22222222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r622222222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 16:
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                if (i35 == 0) {
                                    highResolutionOutputSizeshNQ4ISI = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRanges(bArr, i22, registers3);
                                    unsafe2.putLong(t, j, androidx.content.preferences.protobuf.CodedInputStream.decodeZigZag64(registers3.Camera2StreamConfigurationMap));
                                    bArr4 = bArr;
                                    i21 |= i40;
                                    bArr2 = bArr4;
                                    i27 = highResolutionOutputSizeshNQ4ISI;
                                    i31 = i21;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    bArr4 = bArr;
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r6222222222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite222222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r6222222222222;
                                    unknownFieldSetLite = generatedMessageLite222222222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r6222222222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            case 17:
                                if (i35 == 3) {
                                    java.lang.Object highSpeedVideoSizes2 = messageSchema3.getHighSpeedVideoSizes((androidx.content.preferences.protobuf.MessageSchema<T>) t5, i42);
                                    i15 = i42;
                                    i13 = i34;
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes2, messageSchema3.getHighSpeedVideoSizes(i42), bArr, i38, i2, (i34 << 3) | 4, registers);
                                    getHighSpeedVideoSizes.putObject(t5, messageSchema3.getHighResolutionOutputSizeshNQ4ISI[r17] & 1048575, highSpeedVideoSizes2);
                                    messageSchema3.getHighSpeedVideoFpsRanges((androidx.content.preferences.protobuf.MessageSchema<T>) t5, i15);
                                    bArr2 = bArr;
                                    i31 = i21 | i40;
                                    i23 = i7;
                                    i30 = i23;
                                    bArr5 = bArr2;
                                    i29 = i15;
                                    i28 = i13;
                                    i32 = i12;
                                    i25 = i2;
                                    break;
                                } else {
                                    i15 = i42;
                                    i22 = i38;
                                    z = false;
                                    i13 = i34;
                                    i23 = i7;
                                    i17 = i3;
                                    i6 = i23;
                                    unsafe = unsafe2;
                                    i16 = i22;
                                    i11 = i21;
                                    if (i6 != i17) {
                                    }
                                    messageSchema2 = this;
                                    i18 = i17;
                                    registers2 = registers;
                                    if (!messageSchema2.getOutputMinFrameDuration) {
                                    }
                                    ?? r62222222222222 = t;
                                    androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite2222222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r62222222222222;
                                    unknownFieldSetLite = generatedMessageLite2222222222222.unknownFields;
                                    if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                    }
                                    i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                    t4 = r62222222222222;
                                    i29 = i15;
                                    i31 = i11;
                                    t3 = t4;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                                break;
                            default:
                                i15 = i42;
                                i22 = i38;
                                z = false;
                                i13 = i34;
                                i23 = i7;
                                i17 = i3;
                                i6 = i23;
                                unsafe = unsafe2;
                                i16 = i22;
                                i11 = i21;
                                if (i6 != i17) {
                                }
                                messageSchema2 = this;
                                i18 = i17;
                                registers2 = registers;
                                if (!messageSchema2.getOutputMinFrameDuration) {
                                }
                                ?? r622222222222222 = t;
                                androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite22222222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r622222222222222;
                                unknownFieldSetLite = generatedMessageLite22222222222222.unknownFields;
                                if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                }
                                i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                t4 = r622222222222222;
                                i29 = i15;
                                i31 = i11;
                                t3 = t4;
                                i32 = i12;
                                bArr5 = bArr;
                                i25 = i2;
                                t5 = t3;
                                i30 = i6;
                                messageSchema3 = messageSchema2;
                                registers3 = registers2;
                                i28 = i13;
                                i26 = i18;
                                unsafe2 = unsafe;
                                break;
                        }
                    } else {
                        int i44 = i9;
                        i13 = i34;
                        int i45 = i7;
                        if (i37 != 27) {
                            i11 = i31;
                            i12 = i32;
                            if (i37 <= 49) {
                                i10 = i45;
                                i20 = i44;
                                unsafe = unsafe2;
                                i27 = getHighSpeedVideoSizes(t, bArr, i38, i2, i45, i13, i35, i20, i36, i37, j, registers);
                                if (i27 != i38) {
                                    messageSchema2 = this;
                                    t3 = t;
                                    i18 = i3;
                                    registers2 = registers;
                                    i31 = i11;
                                    i6 = i10;
                                    i29 = i20;
                                    i32 = i12;
                                    bArr5 = bArr;
                                    i25 = i2;
                                    t5 = t3;
                                    i30 = i6;
                                    messageSchema3 = messageSchema2;
                                    registers3 = registers2;
                                    i28 = i13;
                                    i26 = i18;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i10 = i45;
                                unsafe = unsafe2;
                                i19 = i38;
                                i20 = i44;
                                if (i37 != 50) {
                                    i27 = Camera2StreamConfigurationMap(t, bArr, i19, i2, i10, i13, i35, i36, i37, j, i20, registers);
                                    if (i27 == i19) {
                                        i16 = i27;
                                        i6 = i10;
                                        i15 = i20;
                                        i17 = i3;
                                        if (i6 != i17) {
                                        }
                                        messageSchema2 = this;
                                        i18 = i17;
                                        registers2 = registers;
                                        if (!messageSchema2.getOutputMinFrameDuration) {
                                        }
                                        ?? r6222222222222222 = t;
                                        androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite222222222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r6222222222222222;
                                        unknownFieldSetLite = generatedMessageLite222222222222222.unknownFields;
                                        if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                                        }
                                        i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                                        t4 = r6222222222222222;
                                        i29 = i15;
                                        i31 = i11;
                                        t3 = t4;
                                        i32 = i12;
                                        bArr5 = bArr;
                                        i25 = i2;
                                        t5 = t3;
                                        i30 = i6;
                                        messageSchema3 = messageSchema2;
                                        registers3 = registers2;
                                        i28 = i13;
                                        i26 = i18;
                                        unsafe2 = unsafe;
                                    }
                                } else if (i35 == 2) {
                                    i27 = getHighSpeedVideoFpsRanges(t, bArr, i19, i2, i20, j, registers);
                                }
                                messageSchema3 = this;
                                t5 = t;
                                bArr5 = bArr;
                                i25 = i2;
                                i26 = i3;
                                registers3 = registers;
                                i31 = i11;
                                i30 = i10;
                                i29 = i20;
                                i28 = i13;
                                i32 = i12;
                                unsafe2 = unsafe;
                            }
                            i14 = i20;
                        } else if (i35 == 2) {
                            androidx.datastore.preferences.protobuf.Internal.ProtobufList protobufList = (androidx.datastore.preferences.protobuf.Internal.ProtobufList) unsafe2.getObject(t5, j);
                            if (!protobufList.isModifiable()) {
                                int size = protobufList.size();
                                protobufList = protobufList.mutableCopyWithCapacity2(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t5, j, protobufList);
                            }
                            i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighSpeedVideoSizes(messageSchema3.getHighSpeedVideoSizes(i44), i45, bArr, i38, i2, protobufList, registers);
                            i25 = i2;
                            i29 = i44;
                            i30 = i45;
                            bArr5 = bArr;
                            i31 = i31;
                            i28 = i13;
                            i32 = i32;
                        } else {
                            i11 = i31;
                            i12 = i32;
                            i10 = i45;
                            unsafe = unsafe2;
                            i19 = i38;
                            i20 = i44;
                        }
                        i27 = i19;
                        i14 = i20;
                    }
                    i26 = i3;
                }
                i16 = i27;
                i15 = i14;
                i6 = i10;
                i17 = i3;
                if (i6 != i17) {
                }
                messageSchema2 = this;
                i18 = i17;
                registers2 = registers;
                if (!messageSchema2.getOutputMinFrameDuration) {
                }
                ?? r62222222222222222 = t;
                androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite2222222222222222 = (androidx.content.preferences.protobuf.GeneratedMessageLite) r62222222222222222;
                unknownFieldSetLite = generatedMessageLite2222222222222222.unknownFields;
                if (unknownFieldSetLite == androidx.content.preferences.protobuf.UnknownFieldSetLite.getDefaultInstance()) {
                }
                i27 = androidx.content.preferences.protobuf.ArrayDecoders.getHighResolutionOutputSizeshNQ4ISI(i6, bArr, i16, i2, unknownFieldSetLite, registers);
                t4 = r62222222222222222;
                i29 = i15;
                i31 = i11;
                t3 = t4;
                i32 = i12;
                bArr5 = bArr;
                i25 = i2;
                t5 = t3;
                i30 = i6;
                messageSchema3 = messageSchema2;
                registers3 = registers2;
                i28 = i13;
                i26 = i18;
                unsafe2 = unsafe;
            } else {
                unsafe = unsafe2;
                i4 = i26;
                t2 = t5;
                messageSchema = messageSchema3;
                i5 = i27;
                i6 = i30;
            }
        }
        if (i32 != 1048575) {
            unsafe.putInt(t2, i32, i31);
        }
        androidx.content.preferences.protobuf.UnknownFieldSetLite unknownFieldSetLite3 = null;
        for (int i46 = messageSchema.Camera2StreamConfigurationMap; i46 < messageSchema.getValidOutputFormatsForInputhNQ4ISI; i46++) {
            unknownFieldSetLite3 = (androidx.content.preferences.protobuf.UnknownFieldSetLite) getHighSpeedVideoSizes(t, messageSchema.getHighSpeedVideoSizesFor[i46], unknownFieldSetLite3, messageSchema.unwrapAs, t);
        }
        if (unknownFieldSetLite3 != null) {
            messageSchema.unwrapAs.getHighResolutionOutputSizeshNQ4ISI((java.lang.Object) t2, (T) unknownFieldSetLite3);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw androidx.content.preferences.protobuf.InvalidProtocolBufferException.getOutputMinFrameDuration();
        }
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object getHighSpeedVideoSizes(T t, int i) {
        androidx.content.preferences.protobuf.Schema highSpeedVideoSizes = getHighSpeedVideoSizes(i);
        long j = this.getHighResolutionOutputSizeshNQ4ISI[i + 1] & 1048575;
        if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i)) {
            return highSpeedVideoSizes.Camera2StreamConfigurationMap();
        }
        java.lang.Object object = getHighSpeedVideoSizes.getObject(t, j);
        if (object != null && (!(object instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) || ((androidx.content.preferences.protobuf.GeneratedMessageLite) object).getOutputStallDurationlomOqCM())) {
            return object;
        }
        java.lang.Object Camera2StreamConfigurationMap = highSpeedVideoSizes.Camera2StreamConfigurationMap();
        if (object != null) {
            highSpeedVideoSizes.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, object);
        }
        return Camera2StreamConfigurationMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private java.lang.Object Camera2StreamConfigurationMap(T t, int i, int i2) {
        androidx.content.preferences.protobuf.Schema highSpeedVideoSizes = getHighSpeedVideoSizes(i2);
        if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[i2 + 2] & 1048575) != i) {
            return highSpeedVideoSizes.Camera2StreamConfigurationMap();
        }
        java.lang.Object object = getHighSpeedVideoSizes.getObject(t, this.getHighResolutionOutputSizeshNQ4ISI[i2 + 1] & 1048575);
        if (object != null && (!(object instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) || ((androidx.content.preferences.protobuf.GeneratedMessageLite) object).getOutputStallDurationlomOqCM())) {
            return object;
        }
        java.lang.Object Camera2StreamConfigurationMap = highSpeedVideoSizes.Camera2StreamConfigurationMap();
        if (object != null) {
            highSpeedVideoSizes.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, object);
        }
        return Camera2StreamConfigurationMap;
    }

    private void Camera2StreamConfigurationMap(T t, int i, int i2, java.lang.Object obj) {
        getHighSpeedVideoSizes.putObject(t, this.getHighResolutionOutputSizeshNQ4ISI[i2 + 1] & 1048575, obj);
        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, this.getHighResolutionOutputSizeshNQ4ISI[i2 + 2] & 1048575, i);
    }

    @Override // androidx.content.preferences.protobuf.Schema
    public final void getHighSpeedVideoFpsRangesFor(T t, byte[] bArr, int i, int i2, androidx.datastore.preferences.protobuf.ArrayDecoders.Registers registers) throws java.io.IOException {
        getHighResolutionOutputSizeshNQ4ISI((androidx.content.preferences.protobuf.MessageSchema<T>) t, bArr, i, i2, 0, registers);
    }

    private <K, V, UT, UB> UB Camera2StreamConfigurationMap(int i, int i2, java.util.Map<K, V> map, androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj) {
        androidx.datastore.preferences.protobuf.MapEntryLite.Metadata<?, ?> highResolutionOutputSizeshNQ4ISI = this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM[(i / 3) * 2]);
        java.util.Iterator<java.util.Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry<K, V> next = it.next();
            if (!enumVerifier.isInRange(((java.lang.Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = unknownFieldSchema.getHighSpeedVideoFpsRangesFor(obj);
                }
                androidx.datastore.preferences.protobuf.ByteString.CodedBuilder highSpeedVideoFpsRanges = androidx.content.preferences.protobuf.ByteString.getHighSpeedVideoFpsRanges(androidx.content.preferences.protobuf.MapEntryLite.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, next.getKey(), next.getValue()));
                try {
                    androidx.content.preferences.protobuf.MapEntryLite.Camera2StreamConfigurationMap(highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges, highResolutionOutputSizeshNQ4ISI, next.getKey(), next.getValue());
                    highSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges.checkNoSpaceLeft();
                    unknownFieldSchema.getHighResolutionOutputSizeshNQ4ISI(ub, i2, new androidx.datastore.preferences.protobuf.ByteString.LiteralByteString(highSpeedVideoFpsRanges.Camera2StreamConfigurationMap));
                    it.remove();
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.datastore.preferences.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.datastore.preferences.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.datastore.preferences.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28, types: [androidx.datastore.preferences.protobuf.Schema] */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    @Override // androidx.content.preferences.protobuf.Schema
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean Camera2StreamConfigurationMap(T t) {
        int i = 1048575;
        int i2 = 0;
        for (int i3 = 0; i3 < this.Camera2StreamConfigurationMap; i3++) {
            int i4 = this.getHighSpeedVideoSizesFor[i3];
            int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            int i7 = iArr[i4 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i) {
                if (i8 != 1048575) {
                    i2 = getHighSpeedVideoSizes.getInt(t, i8);
                }
                i = i8;
            }
            if ((268435456 & i6) != 0) {
                if (i == 1048575) {
                    if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i4)) {
                        return false;
                    }
                } else if ((i2 & i9) == 0) {
                    return false;
                }
            }
            int i10 = (267386880 & i6) >>> 20;
            if (i10 != 9 && i10 != 17) {
                if (i10 != 27) {
                    if (i10 == 60 || i10 == 68) {
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[r10] & 1048575) == i5 && !getHighSpeedVideoSizes(i4).Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i6 & 1048575))) {
                            return false;
                        }
                    } else if (i10 != 49) {
                        if (i10 == 50) {
                            java.util.Map<?, ?> highSpeedVideoFpsRangesFor = this.getOutputStallDuration.getHighSpeedVideoFpsRangesFor(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i6 & 1048575));
                            if (highSpeedVideoFpsRangesFor.isEmpty()) {
                                continue;
                            } else if (this.getOutputStallDuration.getHighResolutionOutputSizeshNQ4ISI(this.getOutputStallDurationlomOqCM[(i4 / 3) * 2]).getHighResolutionOutputSizeshNQ4ISI.getJavaType() == androidx.datastore.preferences.protobuf.WireFormat.JavaType.MESSAGE) {
                                ?? r6 = 0;
                                for (java.lang.Object obj : highSpeedVideoFpsRangesFor.values()) {
                                    r6 = r6;
                                    if (r6 == 0) {
                                        r6 = androidx.content.preferences.protobuf.Protobuf.getHighSpeedVideoFpsRangesFor().getHighResolutionOutputSizeshNQ4ISI(obj.getClass());
                                    }
                                    if (!r6.Camera2StreamConfigurationMap(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                java.util.List list = (java.util.List) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i6 & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? highSpeedVideoSizes = getHighSpeedVideoSizes(i4);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!highSpeedVideoSizes.Camera2StreamConfigurationMap(list.get(i11))) {
                            return false;
                        }
                    }
                }
            } else if (i != 1048575) {
                if ((i9 & i2) == 0) {
                    continue;
                }
                if (getHighSpeedVideoSizes(i4).Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i6 & 1048575))) {
                }
            } else {
                if (!getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i4)) {
                    continue;
                }
                if (getHighSpeedVideoSizes(i4).Camera2StreamConfigurationMap(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, i6 & 1048575))) {
                    return false;
                }
            }
        }
        return !this.getOutputMinFrameDuration || this.getInputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI(t).Camera2StreamConfigurationMap();
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.Object obj, androidx.content.preferences.protobuf.Writer writer) throws java.io.IOException {
        if (obj instanceof java.lang.String) {
            writer.getHighSpeedVideoFpsRanges(i, (java.lang.String) obj);
        } else {
            writer.getHighSpeedVideoFpsRanges(i, (androidx.content.preferences.protobuf.ByteString) obj);
        }
    }

    private void getHighSpeedVideoSizes(java.lang.Object obj, int i, androidx.content.preferences.protobuf.Reader reader) throws java.io.IOException {
        if ((536870912 & i) != 0) {
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, i & 1048575, reader.isOutputSupportedFor());
        } else if (this.getOutputFormats) {
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, i & 1048575, reader.isOutputSupportedForhNQ4ISI());
        } else {
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizes(obj, i & 1048575, reader.Camera2StreamConfigurationMap());
        }
    }

    private int getHighSpeedVideoFpsRanges(int i) {
        return this.getHighResolutionOutputSizeshNQ4ISI[i];
    }

    private static <T> double getHighResolutionOutputSizeshNQ4ISI(T t, long j) {
        return androidx.content.preferences.protobuf.UnsafeUtil.getInputSizeshNQ4ISI(t, j);
    }

    private static <T> float Camera2StreamConfigurationMap(T t, long j) {
        return androidx.content.preferences.protobuf.UnsafeUtil.getInputFormats(t, j);
    }

    private static <T> int getHighSpeedVideoSizes(T t, long j) {
        return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j);
    }

    private static <T> long getHighSpeedVideoFpsRangesFor(T t, long j) {
        return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j);
    }

    private static <T> boolean getHighSpeedVideoFpsRanges(T t, long j) {
        return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t, j);
    }

    private static <T> int getHighSpeedVideoSizesFor(T t, long j) {
        return ((java.lang.Integer) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).intValue();
    }

    private static <T> long getOutputFormats(T t, long j) {
        return ((java.lang.Long) androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j)).longValue();
    }

    private boolean getHighSpeedVideoFpsRanges(T t, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i);
        }
        return (i3 & i4) != 0;
    }

    private int getHighResolutionOutputSizeshNQ4ISI(int i, int i2) {
        int length = (this.getHighResolutionOutputSizeshNQ4ISI.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.getHighResolutionOutputSizeshNQ4ISI[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static void getHighSpeedVideoSizesFor(java.lang.Object obj) {
        if (obj == null || ((obj instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) && !((androidx.content.preferences.protobuf.GeneratedMessageLite) obj).getOutputStallDurationlomOqCM())) {
            throw new java.lang.IllegalArgumentException("Mutating immutable message: ".concat(java.lang.String.valueOf(obj)));
        }
    }

    private <UT, UB> UB getHighSpeedVideoSizes(java.lang.Object obj, int i, UB ub, androidx.content.preferences.protobuf.UnknownFieldSchema<UT, UB> unknownFieldSchema, java.lang.Object obj2) {
        androidx.datastore.preferences.protobuf.Internal.EnumVerifier enumVerifier;
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI[i];
        java.lang.Object outputFormats = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(obj, r0[i + 1] & 1048575);
        return (outputFormats == null || (enumVerifier = (androidx.datastore.preferences.protobuf.Internal.EnumVerifier) this.getOutputStallDurationlomOqCM[((i / 3) * 2) + 1]) == null) ? ub : (UB) Camera2StreamConfigurationMap(i, i2, this.getOutputStallDuration.getHighSpeedVideoSizes(outputFormats), enumVerifier, ub, unknownFieldSchema, obj2);
    }

    private boolean getHighSpeedVideoFpsRangesFor(T t, int i) {
        boolean equals;
        int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = iArr[i + 2];
        long j = i2 & 1048575;
        if (j != 1048575) {
            return (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j) & (1 << (i2 >>> 20))) != 0;
        }
        int i3 = iArr[i + 1];
        long j2 = i3 & 1048575;
        switch ((i3 & 267386880) >>> 20) {
            case 0:
                return java.lang.Double.doubleToRawLongBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputSizeshNQ4ISI(t, j2)) != 0;
            case 1:
                return java.lang.Float.floatToRawIntBits(androidx.content.preferences.protobuf.UnsafeUtil.getInputFormats(t, j2)) != 0;
            case 2:
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j2) != 0;
            case 3:
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j2) != 0;
            case 4:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) != 0;
            case 5:
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j2) != 0;
            case 6:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) != 0;
            case 7:
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRangesFor(t, j2);
            case 8:
                java.lang.Object outputFormats = androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j2);
                if (outputFormats instanceof java.lang.String) {
                    equals = ((java.lang.String) outputFormats).isEmpty();
                    break;
                } else if (outputFormats instanceof androidx.content.preferences.protobuf.ByteString) {
                    equals = androidx.content.preferences.protobuf.ByteString.EMPTY.equals(outputFormats);
                    break;
                } else {
                    throw new java.lang.IllegalArgumentException();
                }
            case 9:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j2) != null;
            case 10:
                equals = androidx.content.preferences.protobuf.ByteString.EMPTY.equals(androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j2));
                break;
            case 11:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) != 0;
            case 12:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) != 0;
            case 13:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) != 0;
            case 14:
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j2) != 0;
            case 15:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j2) != 0;
            case 16:
                return androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoSizesFor(t, j2) != 0;
            case 17:
                return androidx.content.preferences.protobuf.UnsafeUtil.getOutputFormats(t, j2) != null;
            default:
                throw new java.lang.IllegalArgumentException();
        }
        return !equals;
    }

    private boolean getHighSpeedVideoFpsRanges(T t, int i, int i2) {
        return androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, (long) (this.getHighResolutionOutputSizeshNQ4ISI[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void getHighResolutionOutputSizeshNQ4ISI(T t, T t2, int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI[i];
        int i3 = i + 2;
        if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t2, r0[i3] & 1048575) == i2) {
            long j = this.getHighResolutionOutputSizeshNQ4ISI[i + 1] & 1048575;
            sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
            java.lang.Object object = unsafe.getObject(t2, j);
            if (object == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Source subfield ");
                sb.append(this.getHighResolutionOutputSizeshNQ4ISI[i]);
                sb.append(" is present but null: ");
                sb.append(t2);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            androidx.content.preferences.protobuf.Schema highSpeedVideoSizes = getHighSpeedVideoSizes(i);
            if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, this.getHighResolutionOutputSizeshNQ4ISI[i3] & 1048575) == i2) {
                java.lang.Object object2 = unsafe.getObject(t, j);
                if (object2 == null || ((object2 instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) && !((androidx.content.preferences.protobuf.GeneratedMessageLite) object2).getOutputStallDurationlomOqCM())) {
                    java.lang.Object Camera2StreamConfigurationMap = highSpeedVideoSizes.Camera2StreamConfigurationMap();
                    highSpeedVideoSizes.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap, object2);
                    unsafe.putObject(t, j, Camera2StreamConfigurationMap);
                    object2 = Camera2StreamConfigurationMap;
                }
                highSpeedVideoSizes.Camera2StreamConfigurationMap(object2, object);
                return;
            }
            if (object == null || ((object instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) && !((androidx.content.preferences.protobuf.GeneratedMessageLite) object).getOutputStallDurationlomOqCM())) {
                unsafe.putObject(t, j, object);
            } else {
                java.lang.Object Camera2StreamConfigurationMap2 = highSpeedVideoSizes.Camera2StreamConfigurationMap();
                highSpeedVideoSizes.Camera2StreamConfigurationMap(Camera2StreamConfigurationMap2, object);
                unsafe.putObject(t, j, Camera2StreamConfigurationMap2);
            }
            androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, this.getHighResolutionOutputSizeshNQ4ISI[i3] & 1048575, i2);
        }
    }

    private void getHighSpeedVideoFpsRanges(T t, int i) {
        int i2 = this.getHighResolutionOutputSizeshNQ4ISI[i + 2];
        long j = 1048575 & i2;
        if (j == 1048575) {
            return;
        }
        androidx.content.preferences.protobuf.UnsafeUtil.getHighSpeedVideoFpsRanges((java.lang.Object) t, j, (1 << (i2 >>> 20)) | androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.content.preferences.protobuf.Schema
    public final void getHighSpeedVideoFpsRanges(T t) {
        if (t == 0) {
            return;
        }
        if (!(t instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) || ((androidx.content.preferences.protobuf.GeneratedMessageLite) t).getOutputStallDurationlomOqCM()) {
            if (t instanceof androidx.content.preferences.protobuf.GeneratedMessageLite) {
                androidx.content.preferences.protobuf.GeneratedMessageLite generatedMessageLite = (androidx.content.preferences.protobuf.GeneratedMessageLite) t;
                generatedMessageLite.getHighSpeedVideoSizesFor();
                generatedMessageLite.getInputSizeshNQ4ISI();
                generatedMessageLite.getOutputStallDuration();
            }
            int length = this.getHighResolutionOutputSizeshNQ4ISI.length;
            for (int i = 0; i < length; i += 3) {
                int[] iArr = this.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = iArr[i + 1];
                long j = i2 & 1048575;
                int i3 = (i2 & 267386880) >>> 20;
                if (i3 != 9) {
                    if (i3 != 60 && i3 != 68) {
                        switch (i3) {
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                            case 31:
                            case 32:
                            case 33:
                            case 34:
                            case 35:
                            case 36:
                            case 37:
                            case 38:
                            case 39:
                            case 40:
                            case 41:
                            case 42:
                            case 43:
                            case 44:
                            case 45:
                            case 46:
                            case 47:
                            case 48:
                            case 49:
                                this.getInputFormats.getHighSpeedVideoFpsRangesFor(t, j);
                                break;
                            case 50:
                                sun.misc.Unsafe unsafe = getHighSpeedVideoSizes;
                                java.lang.Object object = unsafe.getObject(t, j);
                                if (object != null) {
                                    unsafe.putObject(t, j, this.getOutputStallDuration.Camera2StreamConfigurationMap(object));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else {
                        if (androidx.content.preferences.protobuf.UnsafeUtil.getOutputMinFrameDuration(t, iArr[i + 2] & 1048575) == iArr[i]) {
                            getHighSpeedVideoSizes(i).getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes.getObject(t, j));
                        }
                    }
                }
                if (getHighSpeedVideoFpsRangesFor((androidx.content.preferences.protobuf.MessageSchema<T>) t, i)) {
                    getHighSpeedVideoSizes(i).getHighSpeedVideoFpsRanges(getHighSpeedVideoSizes.getObject(t, j));
                }
            }
            this.unwrapAs.getHighSpeedVideoFpsRanges(t);
            if (this.getOutputMinFrameDuration) {
                this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap(t);
            }
        }
    }
}
