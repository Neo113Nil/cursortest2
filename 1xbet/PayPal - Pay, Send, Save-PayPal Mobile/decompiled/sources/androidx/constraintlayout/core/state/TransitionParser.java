package androidx.constraintlayout.core.state;

/* loaded from: classes7.dex */
public class TransitionParser {
    @java.lang.Deprecated
    public static void parse(androidx.constraintlayout.core.parser.CLObject cLObject, androidx.constraintlayout.core.state.Transition transition, androidx.constraintlayout.core.state.CorePixelDp corePixelDp) throws androidx.constraintlayout.core.parser.CLParsingException {
        parse(cLObject, transition);
    }

    private static void Camera2StreamConfigurationMap(androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle, int i, java.lang.String str, java.lang.String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (strArr[i2].equals(str)) {
                typedBundle.add(i, i2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x058e  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0593 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseKeyFrames(androidx.constraintlayout.core.parser.CLObject cLObject, androidx.constraintlayout.core.state.Transition transition) throws androidx.constraintlayout.core.parser.CLParsingException {
        java.lang.String str;
        androidx.constraintlayout.core.parser.CLArray cLArray;
        int i;
        java.lang.String str2;
        java.lang.String str3;
        androidx.constraintlayout.core.motion.utils.TypedBundle[] typedBundleArr;
        int i2;
        int i3;
        androidx.constraintlayout.core.parser.CLObject cLObject2;
        int i4;
        java.lang.String str4;
        java.lang.String str5;
        androidx.constraintlayout.core.parser.CLArray cLArray2;
        java.lang.String str6;
        androidx.constraintlayout.core.parser.CLArray cLArray3;
        androidx.constraintlayout.core.motion.CustomVariable[][] customVariableArr;
        androidx.constraintlayout.core.parser.CLObject cLObject3;
        int i5;
        androidx.constraintlayout.core.parser.CLArray cLArray4;
        androidx.constraintlayout.core.parser.CLArray cLArray5;
        androidx.constraintlayout.core.state.Transition transition2;
        androidx.constraintlayout.core.parser.CLObject cLObject4;
        androidx.constraintlayout.core.parser.CLArray cLArray6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        int i6;
        androidx.constraintlayout.core.state.Transition transition3 = transition;
        androidx.constraintlayout.core.parser.CLObject objectOrNull = cLObject.getObjectOrNull("KeyFrames");
        if (objectOrNull != null) {
            androidx.constraintlayout.core.parser.CLArray arrayOrNull = objectOrNull.getArrayOrNull("KeyPositions");
            java.lang.String str11 = "curveFit";
            java.lang.String str12 = "transitionEasing";
            java.lang.String str13 = "frames";
            java.lang.String str14 = androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET;
            if (arrayOrNull != null) {
                int i7 = 0;
                while (i7 < arrayOrNull.size()) {
                    androidx.constraintlayout.core.parser.CLElement cLElement = arrayOrNull.get(i7);
                    if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                        androidx.constraintlayout.core.parser.CLObject cLObject5 = (androidx.constraintlayout.core.parser.CLObject) cLElement;
                        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
                        androidx.constraintlayout.core.parser.CLArray array = cLObject5.getArray(str14);
                        androidx.constraintlayout.core.parser.CLArray array2 = cLObject5.getArray(str13);
                        androidx.constraintlayout.core.parser.CLArray arrayOrNull2 = cLObject5.getArrayOrNull("percentX");
                        androidx.constraintlayout.core.parser.CLArray arrayOrNull3 = cLObject5.getArrayOrNull("percentY");
                        cLArray6 = arrayOrNull;
                        androidx.constraintlayout.core.parser.CLArray arrayOrNull4 = cLObject5.getArrayOrNull("percentWidth");
                        str9 = str13;
                        androidx.constraintlayout.core.parser.CLArray arrayOrNull5 = cLObject5.getArrayOrNull("percentHeight");
                        str10 = str14;
                        java.lang.String stringOrNull = cLObject5.getStringOrNull(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_PATH_MOTION_ARC);
                        cLObject4 = objectOrNull;
                        java.lang.String stringOrNull2 = cLObject5.getStringOrNull(str12);
                        str8 = str12;
                        java.lang.String stringOrNull3 = cLObject5.getStringOrNull(str11);
                        str7 = str11;
                        java.lang.String stringOrNull4 = cLObject5.getStringOrNull("type");
                        java.lang.String str15 = "parentRelative";
                        if (stringOrNull4 == null) {
                            stringOrNull4 = "parentRelative";
                        }
                        i6 = i7;
                        if ((arrayOrNull2 == null || array2.size() == arrayOrNull2.size()) && (arrayOrNull3 == null || array2.size() == arrayOrNull3.size())) {
                            int i8 = 0;
                            while (i8 < array.size()) {
                                java.lang.String string = array.getString(i8);
                                androidx.constraintlayout.core.parser.CLArray cLArray7 = array;
                                int i9 = i8;
                                java.lang.String[] strArr = {"deltaRelative", "pathRelative", str15};
                                java.lang.String str16 = str15;
                                int i10 = 0;
                                while (true) {
                                    if (i10 >= 3) {
                                        i10 = 0;
                                        break;
                                    } else if (strArr[i10].equals(stringOrNull4)) {
                                        break;
                                    } else {
                                        i10++;
                                    }
                                }
                                typedBundle.clear();
                                typedBundle.add(510, i10);
                                if (stringOrNull3 != null) {
                                    Camera2StreamConfigurationMap(typedBundle, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, stringOrNull3, "spline", "linear");
                                }
                                typedBundle.addIfNotNull(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, stringOrNull2);
                                if (stringOrNull != null) {
                                    Camera2StreamConfigurationMap(typedBundle, 509, stringOrNull, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                                }
                                for (int i11 = 0; i11 < array2.size(); i11++) {
                                    typedBundle.add(100, array2.getInt(i11));
                                    if (arrayOrNull2 != null) {
                                        typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_PERCENT_X, arrayOrNull2.getFloat(i11));
                                    }
                                    if (arrayOrNull3 != null) {
                                        typedBundle.add(507, arrayOrNull3.getFloat(i11));
                                    }
                                    if (arrayOrNull4 != null) {
                                        typedBundle.add(503, arrayOrNull4.getFloat(i11));
                                    }
                                    if (arrayOrNull5 != null) {
                                        typedBundle.add(504, arrayOrNull5.getFloat(i11));
                                    }
                                    transition.addKeyPosition(string, typedBundle);
                                }
                                i8 = i9 + 1;
                                array = cLArray7;
                                str15 = str16;
                            }
                        }
                        transition2 = transition;
                    } else {
                        transition2 = transition3;
                        cLObject4 = objectOrNull;
                        cLArray6 = arrayOrNull;
                        str7 = str11;
                        str8 = str12;
                        str9 = str13;
                        str10 = str14;
                        i6 = i7;
                    }
                    i7 = i6 + 1;
                    transition3 = transition2;
                    arrayOrNull = cLArray6;
                    str13 = str9;
                    str14 = str10;
                    objectOrNull = cLObject4;
                    str12 = str8;
                    str11 = str7;
                }
            }
            androidx.constraintlayout.core.state.Transition transition4 = transition3;
            java.lang.String str17 = str11;
            java.lang.String str18 = str12;
            java.lang.String str19 = str13;
            java.lang.String str20 = str14;
            androidx.constraintlayout.core.parser.CLObject cLObject6 = objectOrNull;
            androidx.constraintlayout.core.parser.CLArray arrayOrNull6 = cLObject6.getArrayOrNull(androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.NAME);
            if (arrayOrNull6 != null) {
                int i12 = 0;
                while (i12 < arrayOrNull6.size()) {
                    androidx.constraintlayout.core.parser.CLElement cLElement2 = arrayOrNull6.get(i12);
                    if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) {
                        androidx.constraintlayout.core.parser.CLObject cLObject7 = (androidx.constraintlayout.core.parser.CLObject) cLElement2;
                        java.lang.String str21 = str20;
                        androidx.constraintlayout.core.parser.CLArray arrayOrNull7 = cLObject7.getArrayOrNull(str21);
                        if (arrayOrNull7 != null) {
                            java.lang.String str22 = str19;
                            androidx.constraintlayout.core.parser.CLArray arrayOrNull8 = cLObject7.getArrayOrNull(str22);
                            if (arrayOrNull8 != null) {
                                java.lang.String stringOrNull5 = cLObject7.getStringOrNull(str18);
                                java.lang.String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
                                int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
                                cLArray2 = arrayOrNull6;
                                boolean[] zArr = {false, false, true, true, true, false, false, false, false};
                                int size = arrayOrNull8.size();
                                androidx.constraintlayout.core.motion.utils.TypedBundle[] typedBundleArr2 = new androidx.constraintlayout.core.motion.utils.TypedBundle[size];
                                str5 = str21;
                                str4 = str22;
                                for (int i13 = 0; i13 < arrayOrNull8.size(); i13++) {
                                    typedBundleArr2[i13] = new androidx.constraintlayout.core.motion.utils.TypedBundle();
                                }
                                int i14 = 0;
                                while (i14 < 9) {
                                    java.lang.String str23 = strArr2[i14];
                                    java.lang.String[] strArr3 = strArr2;
                                    int i15 = iArr[i14];
                                    boolean z = zArr[i14];
                                    boolean[] zArr2 = zArr;
                                    androidx.constraintlayout.core.parser.CLArray arrayOrNull9 = cLObject7.getArrayOrNull(str23);
                                    int[] iArr2 = iArr;
                                    if (arrayOrNull9 != null && arrayOrNull9.size() != size) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder("incorrect size for ");
                                        sb.append(str23);
                                        sb.append(" array, not matching targets array!");
                                        throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), cLObject7);
                                    }
                                    if (arrayOrNull9 != null) {
                                        int i16 = 0;
                                        while (i16 < size) {
                                            float f = arrayOrNull9.getFloat(i16);
                                            androidx.constraintlayout.core.parser.CLArray cLArray8 = arrayOrNull9;
                                            if (z) {
                                                f = transition4.getInputSizeshNQ4ISI.toPixels(f);
                                            }
                                            typedBundleArr2[i16].add(i15, f);
                                            i16++;
                                            arrayOrNull9 = cLArray8;
                                        }
                                    } else {
                                        float floatOrNaN = cLObject7.getFloatOrNaN(str23);
                                        if (!java.lang.Float.isNaN(floatOrNaN)) {
                                            if (z) {
                                                floatOrNaN = transition4.getInputSizeshNQ4ISI.toPixels(floatOrNaN);
                                            }
                                            for (int i17 = 0; i17 < size; i17++) {
                                                typedBundleArr2[i17].add(i15, floatOrNaN);
                                            }
                                        }
                                    }
                                    i14++;
                                    strArr2 = strArr3;
                                    zArr = zArr2;
                                    iArr = iArr2;
                                }
                                androidx.constraintlayout.core.parser.CLElement orNull = cLObject7.getOrNull(io.reactivex.annotations.SchedulerSupport.CUSTOM);
                                if (orNull == null || !(orNull instanceof androidx.constraintlayout.core.parser.CLObject)) {
                                    cLObject2 = cLObject6;
                                    i4 = i12;
                                    cLArray3 = arrayOrNull8;
                                    customVariableArr = null;
                                } else {
                                    androidx.constraintlayout.core.parser.CLObject cLObject8 = (androidx.constraintlayout.core.parser.CLObject) orNull;
                                    int size2 = cLObject8.size();
                                    customVariableArr = (androidx.constraintlayout.core.motion.CustomVariable[][]) java.lang.reflect.Array.newInstance((java.lang.Class<?>) androidx.constraintlayout.core.motion.CustomVariable.class, arrayOrNull8.size(), size2);
                                    int i18 = 0;
                                    while (i18 < size2) {
                                        androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) cLObject8.get(i18);
                                        androidx.constraintlayout.core.parser.CLObject cLObject9 = cLObject8;
                                        java.lang.String content = cLKey.content();
                                        int i19 = size2;
                                        if (cLKey.getValue() instanceof androidx.constraintlayout.core.parser.CLArray) {
                                            androidx.constraintlayout.core.parser.CLArray cLArray9 = (androidx.constraintlayout.core.parser.CLArray) cLKey.getValue();
                                            int size3 = cLArray9.size();
                                            if (size3 != size || size3 <= 0) {
                                                cLObject3 = cLObject6;
                                            } else {
                                                cLObject3 = cLObject6;
                                                if (cLArray9.get(0) instanceof androidx.constraintlayout.core.parser.CLNumber) {
                                                    int i20 = 0;
                                                    while (i20 < size) {
                                                        customVariableArr[i20][i18] = new androidx.constraintlayout.core.motion.CustomVariable(content, 901, cLArray9.get(i20).getFloat());
                                                        i20++;
                                                        i12 = i12;
                                                        arrayOrNull8 = arrayOrNull8;
                                                    }
                                                } else {
                                                    i5 = i12;
                                                    cLArray4 = arrayOrNull8;
                                                    int i21 = 0;
                                                    while (i21 < size) {
                                                        androidx.constraintlayout.core.parser.CLArray cLArray10 = cLArray9;
                                                        long Camera2StreamConfigurationMap = androidx.constraintlayout.core.state.ConstraintSetParser.Camera2StreamConfigurationMap(cLArray9.get(i21).content());
                                                        if (Camera2StreamConfigurationMap != -1) {
                                                            cLArray5 = cLArray10;
                                                            customVariableArr[i21][i18] = new androidx.constraintlayout.core.motion.CustomVariable(content, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, (int) Camera2StreamConfigurationMap);
                                                        } else {
                                                            cLArray5 = cLArray10;
                                                        }
                                                        i21++;
                                                        cLArray9 = cLArray5;
                                                    }
                                                }
                                            }
                                            i5 = i12;
                                            cLArray4 = arrayOrNull8;
                                        } else {
                                            cLObject3 = cLObject6;
                                            i5 = i12;
                                            cLArray4 = arrayOrNull8;
                                            androidx.constraintlayout.core.parser.CLElement value = cLKey.getValue();
                                            if (value instanceof androidx.constraintlayout.core.parser.CLNumber) {
                                                float f2 = value.getFloat();
                                                for (int i22 = 0; i22 < size; i22++) {
                                                    customVariableArr[i22][i18] = new androidx.constraintlayout.core.motion.CustomVariable(content, 901, f2);
                                                }
                                            } else {
                                                long Camera2StreamConfigurationMap2 = androidx.constraintlayout.core.state.ConstraintSetParser.Camera2StreamConfigurationMap(value.content());
                                                if (Camera2StreamConfigurationMap2 != -1) {
                                                    int i23 = 0;
                                                    while (i23 < size) {
                                                        customVariableArr[i23][i18] = new androidx.constraintlayout.core.motion.CustomVariable(content, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.TYPE_COLOR, (int) Camera2StreamConfigurationMap2);
                                                        i23++;
                                                        customVariableArr = customVariableArr;
                                                    }
                                                }
                                            }
                                        }
                                        i18++;
                                        cLObject8 = cLObject9;
                                        size2 = i19;
                                        cLObject6 = cLObject3;
                                        i12 = i5;
                                        arrayOrNull8 = cLArray4;
                                        customVariableArr = customVariableArr;
                                    }
                                    cLObject2 = cLObject6;
                                    i4 = i12;
                                    cLArray3 = arrayOrNull8;
                                }
                                str6 = str17;
                                java.lang.String stringOrNull6 = cLObject7.getStringOrNull(str6);
                                for (int i24 = 0; i24 < arrayOrNull7.size(); i24++) {
                                    int i25 = 0;
                                    while (i25 < size) {
                                        java.lang.String string2 = arrayOrNull7.getString(i24);
                                        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle2 = typedBundleArr2[i25];
                                        if (stringOrNull6 != null) {
                                            java.lang.String[] strArr4 = {"spline", "linear"};
                                            int i26 = 0;
                                            while (true) {
                                                if (i26 >= 2) {
                                                    i26 = 0;
                                                    break;
                                                } else if (strArr4[i26].equals(stringOrNull6)) {
                                                    break;
                                                } else {
                                                    i26++;
                                                }
                                            }
                                            typedBundle2.add(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_CURVE_FIT, i26);
                                        }
                                        typedBundle2.addIfNotNull(androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING, stringOrNull5);
                                        androidx.constraintlayout.core.parser.CLArray cLArray11 = cLArray3;
                                        typedBundle2.add(100, cLArray11.getInt(i25));
                                        transition.addKeyAttribute(string2, typedBundle2, customVariableArr != null ? customVariableArr[i25] : null);
                                        i25++;
                                        cLArray3 = cLArray11;
                                    }
                                }
                                transition4 = transition;
                                i12 = i4 + 1;
                                str17 = str6;
                                arrayOrNull6 = cLArray2;
                                str19 = str4;
                                str20 = str5;
                                cLObject6 = cLObject2;
                            } else {
                                cLArray2 = arrayOrNull6;
                                cLObject2 = cLObject6;
                                i4 = i12;
                                str5 = str21;
                                str4 = str22;
                                str6 = str17;
                                i12 = i4 + 1;
                                str17 = str6;
                                arrayOrNull6 = cLArray2;
                                str19 = str4;
                                str20 = str5;
                                cLObject6 = cLObject2;
                            }
                        } else {
                            cLObject2 = cLObject6;
                            i4 = i12;
                            str5 = str21;
                            str4 = str19;
                        }
                    } else {
                        cLObject2 = cLObject6;
                        i4 = i12;
                        str4 = str19;
                        str5 = str20;
                    }
                    cLArray2 = arrayOrNull6;
                    str6 = str17;
                    i12 = i4 + 1;
                    str17 = str6;
                    arrayOrNull6 = cLArray2;
                    str19 = str4;
                    str20 = str5;
                    cLObject6 = cLObject2;
                }
            }
            java.lang.String str24 = str19;
            java.lang.String str25 = str20;
            java.lang.String str26 = str17;
            androidx.constraintlayout.core.parser.CLArray arrayOrNull10 = cLObject6.getArrayOrNull("KeyCycles");
            if (arrayOrNull10 != null) {
                int i27 = 0;
                while (i27 < arrayOrNull10.size()) {
                    androidx.constraintlayout.core.parser.CLElement cLElement3 = arrayOrNull10.get(i27);
                    if (cLElement3 instanceof androidx.constraintlayout.core.parser.CLObject) {
                        androidx.constraintlayout.core.parser.CLObject cLObject10 = (androidx.constraintlayout.core.parser.CLObject) cLElement3;
                        java.lang.String str27 = str25;
                        androidx.constraintlayout.core.parser.CLArray array3 = cLObject10.getArray(str27);
                        java.lang.String str28 = str24;
                        androidx.constraintlayout.core.parser.CLArray array4 = cLObject10.getArray(str28);
                        java.lang.String str29 = str18;
                        java.lang.String stringOrNull7 = cLObject10.getStringOrNull(str29);
                        java.lang.String[] strArr5 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PERIOD, "offset", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_PHASE};
                        int[] iArr3 = {311, 312, 304, 305, 306, 308, 309, 310, 403, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PERIOD, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_OFFSET, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_WAVE_PHASE};
                        cLArray = arrayOrNull10;
                        int[] iArr4 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
                        int size4 = array4.size();
                        str25 = str27;
                        androidx.constraintlayout.core.motion.utils.TypedBundle[] typedBundleArr3 = new androidx.constraintlayout.core.motion.utils.TypedBundle[size4];
                        str24 = str28;
                        for (int i28 = 0; i28 < size4; i28++) {
                            typedBundleArr3[i28] = new androidx.constraintlayout.core.motion.utils.TypedBundle();
                        }
                        str2 = str29;
                        int i29 = 0;
                        boolean z2 = false;
                        while (i29 < 12) {
                            if (cLObject10.has(strArr5[i29])) {
                                i3 = i27;
                                if (iArr4[i29] == 1) {
                                    z2 = true;
                                }
                            } else {
                                i3 = i27;
                            }
                            i29++;
                            i27 = i3;
                        }
                        i = i27;
                        int i30 = 0;
                        for (int i31 = 12; i30 < i31; i31 = 12) {
                            java.lang.String str30 = strArr5[i30];
                            int i32 = iArr3[i30];
                            java.lang.String[] strArr6 = strArr5;
                            int i33 = iArr4[i30];
                            int[] iArr5 = iArr4;
                            androidx.constraintlayout.core.parser.CLArray arrayOrNull11 = cLObject10.getArrayOrNull(str30);
                            int[] iArr6 = iArr3;
                            if (arrayOrNull11 != null && arrayOrNull11.size() != size4) {
                                throw new androidx.constraintlayout.core.parser.CLParsingException("incorrect size for $attrName array, not matching targets array!", cLObject10);
                            }
                            if (arrayOrNull11 != null) {
                                int i34 = 0;
                                while (i34 < size4) {
                                    float f3 = arrayOrNull11.getFloat(i34);
                                    androidx.constraintlayout.core.parser.CLArray cLArray12 = arrayOrNull11;
                                    if (i33 == 1) {
                                        f3 = transition4.getInputSizeshNQ4ISI.toPixels(f3);
                                    } else if (i33 == 2 && z2) {
                                        f3 = transition4.getInputSizeshNQ4ISI.toPixels(f3);
                                    }
                                    typedBundleArr3[i34].add(i32, f3);
                                    i34++;
                                    arrayOrNull11 = cLArray12;
                                }
                            } else {
                                float floatOrNaN2 = cLObject10.getFloatOrNaN(str30);
                                if (!java.lang.Float.isNaN(floatOrNaN2)) {
                                    if (i33 == 1) {
                                        floatOrNaN2 = transition4.getInputSizeshNQ4ISI.toPixels(floatOrNaN2);
                                    } else if (i33 == 2 && z2) {
                                        floatOrNaN2 = transition4.getInputSizeshNQ4ISI.toPixels(floatOrNaN2);
                                    }
                                    for (int i35 = 0; i35 < size4; i35++) {
                                        typedBundleArr3[i35].add(i32, floatOrNaN2);
                                    }
                                    i30++;
                                    strArr5 = strArr6;
                                    iArr4 = iArr5;
                                    iArr3 = iArr6;
                                }
                            }
                            i30++;
                            strArr5 = strArr6;
                            iArr4 = iArr5;
                            iArr3 = iArr6;
                        }
                        java.lang.String stringOrNull8 = cLObject10.getStringOrNull(str26);
                        java.lang.String stringOrNull9 = cLObject10.getStringOrNull("easing");
                        java.lang.String stringOrNull10 = cLObject10.getStringOrNull("waveShape");
                        java.lang.String stringOrNull11 = cLObject10.getStringOrNull(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE);
                        int i36 = 0;
                        while (i36 < array3.size()) {
                            int i37 = 0;
                            while (i37 < size4) {
                                java.lang.String string3 = array3.getString(i36);
                                java.lang.String str31 = str26;
                                androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle3 = typedBundleArr3[i37];
                                if (stringOrNull8 != null) {
                                    stringOrNull8.hashCode();
                                    if (stringOrNull8.equals("linear")) {
                                        str3 = stringOrNull8;
                                        typedBundleArr = typedBundleArr3;
                                        typedBundle3.add(401, 1);
                                    } else {
                                        if (stringOrNull8.equals("spline")) {
                                            str3 = stringOrNull8;
                                            typedBundleArr = typedBundleArr3;
                                            typedBundle3.add(401, 0);
                                        } else {
                                            str3 = stringOrNull8;
                                            typedBundleArr = typedBundleArr3;
                                        }
                                        i2 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                        typedBundle3.addIfNotNull(i2, stringOrNull7);
                                        if (stringOrNull9 != null) {
                                            typedBundle3.add(androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.TYPE_EASING, stringOrNull9);
                                        }
                                        if (stringOrNull10 != null) {
                                            typedBundle3.add(421, stringOrNull10);
                                        }
                                        if (stringOrNull11 == null) {
                                            typedBundle3.add(422, stringOrNull11);
                                        }
                                        typedBundle3.add(100, array4.getInt(i37));
                                        transition4.addKeyCycle(string3, typedBundle3);
                                        i37++;
                                        str26 = str31;
                                        stringOrNull8 = str3;
                                        typedBundleArr3 = typedBundleArr;
                                    }
                                } else {
                                    str3 = stringOrNull8;
                                    typedBundleArr = typedBundleArr3;
                                }
                                i2 = androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING;
                                typedBundle3.addIfNotNull(i2, stringOrNull7);
                                if (stringOrNull9 != null) {
                                }
                                if (stringOrNull10 != null) {
                                }
                                if (stringOrNull11 == null) {
                                }
                                typedBundle3.add(100, array4.getInt(i37));
                                transition4.addKeyCycle(string3, typedBundle3);
                                i37++;
                                str26 = str31;
                                stringOrNull8 = str3;
                                typedBundleArr3 = typedBundleArr;
                            }
                            i36++;
                            typedBundleArr3 = typedBundleArr3;
                        }
                        str = str26;
                    } else {
                        str = str26;
                        cLArray = arrayOrNull10;
                        i = i27;
                        str2 = str18;
                    }
                    i27 = i + 1;
                    arrayOrNull10 = cLArray;
                    str26 = str;
                    str18 = str2;
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x00b0, code lost:
    
        if (r2 != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parse(androidx.constraintlayout.core.parser.CLObject cLObject, androidx.constraintlayout.core.state.Transition transition) throws androidx.constraintlayout.core.parser.CLParsingException {
        boolean z;
        char c;
        transition.Camera2StreamConfigurationMap = null;
        transition.getHighSpeedVideoFpsRangesFor.clear();
        java.lang.String stringOrNull = cLObject.getStringOrNull(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_PATH_MOTION_ARC);
        androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
        if (stringOrNull != null) {
            stringOrNull.hashCode();
            switch (stringOrNull.hashCode()) {
                case -1857024520:
                    if (stringOrNull.equals("startVertical")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1007052250:
                    if (stringOrNull.equals("startHorizontal")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 3145837:
                    if (stringOrNull.equals("flip")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3387192:
                    if (stringOrNull.equals("none")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 92611485:
                    if (stringOrNull.equals("above")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 93621297:
                    if (stringOrNull.equals("below")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                typedBundle.add(509, 1);
            } else if (c == 1) {
                typedBundle.add(509, 2);
            } else if (c == 2) {
                typedBundle.add(509, 3);
            } else if (c == 3) {
                typedBundle.add(509, 0);
            } else if (c == 4) {
                typedBundle.add(509, 5);
            } else if (c == 5) {
                typedBundle.add(509, 4);
            }
            z = true;
        } else {
            z = false;
        }
        java.lang.String stringOrNull2 = cLObject.getStringOrNull("interpolator");
        if (stringOrNull2 != null) {
            typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_INTERPOLATOR, stringOrNull2);
            z = true;
        }
        float floatOrNaN = cLObject.getFloatOrNaN(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_STAGGERED);
        if (!java.lang.Float.isNaN(floatOrNaN)) {
            typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.TYPE_STAGGERED, floatOrNaN);
        }
        transition.setTransitionProperties(typedBundle);
        androidx.constraintlayout.core.parser.CLObject objectOrNull = cLObject.getObjectOrNull("onSwipe");
        if (objectOrNull != null) {
            java.lang.String stringOrNull3 = objectOrNull.getStringOrNull(io.ktor.http.LinkHeader.Parameters.Anchor);
            java.lang.String stringOrNull4 = objectOrNull.getStringOrNull("side");
            java.lang.String[] strArr = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighSpeedVideoSizes;
            int i = 0;
            while (true) {
                if (i >= strArr.length) {
                    i = 0;
                } else if (!strArr[i].equals(stringOrNull4)) {
                    i++;
                }
            }
            java.lang.String stringOrNull5 = objectOrNull.getStringOrNull("direction");
            java.lang.String[] strArr2 = androidx.constraintlayout.core.state.Transition.OnSwipe.Camera2StreamConfigurationMap;
            int i2 = 0;
            while (true) {
                if (i2 >= strArr2.length) {
                    i2 = 0;
                } else if (!strArr2[i2].equals(stringOrNull5)) {
                    i2++;
                }
            }
            float floatOrNaN2 = objectOrNull.getFloatOrNaN("scale");
            float floatOrNaN3 = objectOrNull.getFloatOrNaN("threshold");
            float floatOrNaN4 = objectOrNull.getFloatOrNaN("maxVelocity");
            float floatOrNaN5 = objectOrNull.getFloatOrNaN("maxAccel");
            java.lang.String stringOrNull6 = objectOrNull.getStringOrNull("limitBounds");
            java.lang.String stringOrNull7 = objectOrNull.getStringOrNull("mode");
            java.lang.String[] strArr3 = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighSpeedVideoFpsRanges;
            int i3 = 0;
            while (true) {
                if (i3 >= strArr3.length) {
                    i3 = 0;
                } else if (!strArr3[i3].equals(stringOrNull7)) {
                    i3++;
                }
            }
            java.lang.String stringOrNull8 = objectOrNull.getStringOrNull("touchUp");
            java.lang.String[] strArr4 = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighSpeedVideoSizesFor;
            int i4 = 0;
            while (true) {
                if (i4 >= strArr4.length) {
                    i4 = 0;
                } else if (!strArr4[i4].equals(stringOrNull8)) {
                    i4++;
                }
            }
            float floatOrNaN6 = objectOrNull.getFloatOrNaN("springMass");
            float floatOrNaN7 = objectOrNull.getFloatOrNaN("springStiffness");
            float floatOrNaN8 = objectOrNull.getFloatOrNaN("springDamping");
            float floatOrNaN9 = objectOrNull.getFloatOrNaN("stopThreshold");
            java.lang.String stringOrNull9 = objectOrNull.getStringOrNull("springBoundary");
            java.lang.String[] strArr5 = androidx.constraintlayout.core.state.Transition.OnSwipe.getHighSpeedVideoFpsRangesFor;
            int i5 = 0;
            while (true) {
                if (i5 >= strArr5.length) {
                    i5 = 0;
                } else if (!strArr5[i5].equals(stringOrNull9)) {
                    i5++;
                }
            }
            java.lang.String stringOrNull10 = objectOrNull.getStringOrNull("around");
            androidx.constraintlayout.core.state.Transition.OnSwipe onSwipe = new androidx.constraintlayout.core.state.Transition.OnSwipe();
            transition.Camera2StreamConfigurationMap = onSwipe;
            onSwipe.getInputSizeshNQ4ISI = stringOrNull3;
            onSwipe.getOutputFormats = i;
            onSwipe.getOutputSizes = i2;
            onSwipe.getOutputStallDurationlomOqCM = i2 < 2;
            if (!java.lang.Float.isNaN(floatOrNaN2)) {
                onSwipe.getOutputMinFrameDurationlomOqCM = floatOrNaN2;
            }
            if (!java.lang.Float.isNaN(floatOrNaN3)) {
                onSwipe.getOutputSizeshNQ4ISI = floatOrNaN3;
            }
            if (!java.lang.Float.isNaN(floatOrNaN4)) {
                onSwipe.toString = floatOrNaN4;
            }
            if (!java.lang.Float.isNaN(floatOrNaN5)) {
                onSwipe.unwrapAs = floatOrNaN5;
            }
            onSwipe.getValidOutputFormatsForInputhNQ4ISI = stringOrNull6;
            onSwipe.getInputFormats = i3;
            onSwipe.isOutputSupportedForhNQ4ISI = i4;
            if (!java.lang.Float.isNaN(floatOrNaN6)) {
                onSwipe.accessartificialFrame = floatOrNaN6;
            }
            if (!java.lang.Float.isNaN(floatOrNaN7)) {
                onSwipe.coroutineBoundary = floatOrNaN7;
            }
            if (!java.lang.Float.isNaN(floatOrNaN8)) {
                onSwipe.coroutineCreation = floatOrNaN8;
            }
            if (!java.lang.Float.isNaN(floatOrNaN9)) {
                onSwipe.f2722a = floatOrNaN9;
            }
            onSwipe.ArtificialStackFrames = i5;
            onSwipe.CoroutineDebuggingKt = stringOrNull10;
        }
        parseKeyFrames(cLObject, transition);
    }
}
