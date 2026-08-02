package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public class ConstraintSetParser {

    /* loaded from: classes6.dex */
    interface GeneratedValue {
        float Camera2StreamConfigurationMap();
    }

    /* loaded from: classes6.dex */
    public enum MotionLayoutDebugFlags {
        NONE,
        SHOW_ALL,
        UNKNOWN
    }

    public static class DesignElement {
        java.lang.String getHighResolutionOutputSizeshNQ4ISI;
        java.lang.String getHighSpeedVideoFpsRangesFor;
        java.util.HashMap<java.lang.String, java.lang.String> getHighSpeedVideoSizes;

        public java.lang.String getId() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public java.lang.String getType() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public java.util.HashMap<java.lang.String, java.lang.String> getParams() {
            return this.getHighSpeedVideoSizes;
        }

        DesignElement(java.lang.String str, java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
            this.getHighSpeedVideoFpsRangesFor = str;
            this.getHighResolutionOutputSizeshNQ4ISI = str2;
            this.getHighSpeedVideoSizes = hashMap;
        }
    }

    public static class LayoutVariables {
        java.util.HashMap<java.lang.String, java.lang.Integer> getHighSpeedVideoSizes = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue> getHighSpeedVideoFpsRangesFor = new java.util.HashMap<>();
        java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> Camera2StreamConfigurationMap = new java.util.HashMap<>();

        public void putOverride(java.lang.String str, float f) {
            this.getHighSpeedVideoFpsRangesFor.put(str, new androidx.constraintlayout.core.state.ConstraintSetParser.OverrideValue(f));
        }

        final float getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            if (obj instanceof androidx.constraintlayout.core.parser.CLString) {
                java.lang.String content = ((androidx.constraintlayout.core.parser.CLString) obj).content();
                if (this.getHighSpeedVideoFpsRangesFor.containsKey(content)) {
                    return this.getHighSpeedVideoFpsRangesFor.get(content).Camera2StreamConfigurationMap();
                }
                if (this.getHighSpeedVideoSizes.containsKey(content)) {
                    return this.getHighSpeedVideoSizes.get(content).floatValue();
                }
                return 0.0f;
            }
            if (obj instanceof androidx.constraintlayout.core.parser.CLNumber) {
                return ((androidx.constraintlayout.core.parser.CLNumber) obj).getFloat();
            }
            return 0.0f;
        }
    }

    /* loaded from: classes6.dex */
    static class Generator implements androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue {
        float Camera2StreamConfigurationMap;
        float getHighSpeedVideoFpsRanges;
        float getHighSpeedVideoFpsRangesFor;
        boolean getHighSpeedVideoSizes = false;

        Generator(float f, float f2) {
            this.getHighSpeedVideoFpsRangesFor = f;
            this.Camera2StreamConfigurationMap = f2;
            this.getHighSpeedVideoFpsRanges = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public final float Camera2StreamConfigurationMap() {
            if (!this.getHighSpeedVideoSizes) {
                this.getHighSpeedVideoFpsRanges += this.Camera2StreamConfigurationMap;
            }
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    /* loaded from: classes6.dex */
    static class FiniteGenerator implements androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue {
        float Camera2StreamConfigurationMap;
        float getHighResolutionOutputSizeshNQ4ISI;
        float getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoSizes;
        float getHighSpeedVideoSizesFor;
        java.lang.String getOutputFormats;
        boolean getInputSizeshNQ4ISI = false;
        float getHighSpeedVideoFpsRangesFor = 0.0f;
        float getOutputMinFrameDuration = 1.0f;

        FiniteGenerator(float f, float f2, float f3, java.lang.String str, java.lang.String str2) {
            this.getHighSpeedVideoFpsRanges = f;
            this.getHighSpeedVideoSizesFor = f2;
            this.getOutputFormats = str == null ? "" : str;
            this.getHighSpeedVideoSizes = str2 == null ? "" : str2;
            this.Camera2StreamConfigurationMap = f2;
            this.getHighResolutionOutputSizeshNQ4ISI = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public final float Camera2StreamConfigurationMap() {
            float f = this.getHighSpeedVideoFpsRangesFor;
            if (f >= this.Camera2StreamConfigurationMap) {
                this.getInputSizeshNQ4ISI = true;
            }
            if (!this.getInputSizeshNQ4ISI) {
                this.getHighSpeedVideoFpsRangesFor = f + this.getOutputMinFrameDuration;
            }
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    /* loaded from: classes6.dex */
    static class OverrideValue implements androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue {
        float getHighSpeedVideoFpsRangesFor;

        OverrideValue(float f) {
            this.getHighSpeedVideoFpsRangesFor = f;
        }

        @Override // androidx.constraintlayout.core.state.ConstraintSetParser.GeneratedValue
        public final float Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor;
        }
    }

    public static void parseJSON(java.lang.String str, androidx.constraintlayout.core.state.Transition transition, int i) {
        androidx.constraintlayout.core.parser.CLObject objectOrNull;
        try {
            androidx.constraintlayout.core.parser.CLObject parse = androidx.constraintlayout.core.parser.CLParser.parse(str);
            java.util.ArrayList<java.lang.String> names = parse.names();
            if (names != null) {
                java.util.Iterator<java.lang.String> it = names.iterator();
                while (it.hasNext()) {
                    java.lang.String next = it.next();
                    androidx.constraintlayout.core.parser.CLElement cLElement = parse.get(next);
                    if ((cLElement instanceof androidx.constraintlayout.core.parser.CLObject) && (objectOrNull = ((androidx.constraintlayout.core.parser.CLObject) cLElement).getObjectOrNull(io.reactivex.annotations.SchedulerSupport.CUSTOM)) != null) {
                        java.util.Iterator<java.lang.String> it2 = objectOrNull.names().iterator();
                        while (it2.hasNext()) {
                            java.lang.String next2 = it2.next();
                            androidx.constraintlayout.core.parser.CLElement cLElement2 = objectOrNull.get(next2);
                            if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLNumber) {
                                transition.addCustomFloat(i, next, next2, cLElement2.getFloat());
                            } else if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLString) {
                                long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cLElement2.content());
                                if (Camera2StreamConfigurationMap != -1) {
                                    transition.addCustomColor(i, next, next2, (int) Camera2StreamConfigurationMap);
                                }
                            }
                        }
                    }
                }
            }
        } catch (androidx.constraintlayout.core.parser.CLParsingException e) {
            java.lang.System.err.println("Error parsing JSON ".concat(java.lang.String.valueOf(e)));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0156 A[Catch: CLParsingException -> 0x0222, TryCatch #0 {CLParsingException -> 0x0222, blocks: (B:3:0x0004, B:5:0x000e, B:6:0x0012, B:8:0x0018, B:12:0x0026, B:19:0x003b, B:22:0x0043, B:24:0x0049, B:25:0x004d, B:27:0x0053, B:29:0x0065, B:31:0x006b, B:34:0x0071, B:37:0x007b, B:38:0x007f, B:40:0x0085, B:43:0x0093, B:97:0x009b, B:46:0x009f, B:47:0x00ab, B:49:0x00b1, B:92:0x00bd, B:52:0x00c5, B:53:0x00ca, B:55:0x00d0, B:57:0x00d6, B:69:0x011b, B:71:0x019c, B:72:0x011f, B:74:0x012b, B:76:0x0156, B:78:0x00f4, B:81:0x00fe, B:84:0x0108, B:101:0x01a6, B:108:0x01b4, B:118:0x01d0, B:120:0x01de, B:122:0x01e4, B:123:0x01e8, B:125:0x01ee, B:128:0x0200, B:130:0x020e, B:132:0x0216), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void parseMotionSceneJSON(androidx.constraintlayout.core.state.CoreMotionScene coreMotionScene, java.lang.String str) {
        java.lang.String str2;
        androidx.constraintlayout.core.parser.CLObject cLObject;
        java.util.Iterator<java.lang.String> it;
        java.lang.String stringOrNull;
        java.util.ArrayList<java.lang.String> names;
        java.lang.String str3;
        androidx.constraintlayout.core.parser.CLObject cLObject2;
        java.util.Iterator<java.lang.String> it2;
        java.lang.String str4;
        androidx.constraintlayout.core.parser.CLObject cLObject3;
        java.util.Iterator<java.lang.String> it3;
        char c;
        java.lang.String str5 = "clear";
        try {
            androidx.constraintlayout.core.parser.CLObject parse = androidx.constraintlayout.core.parser.CLParser.parse(str);
            java.util.ArrayList<java.lang.String> names2 = parse.names();
            if (names2 != null) {
                java.util.Iterator<java.lang.String> it4 = names2.iterator();
                while (it4.hasNext()) {
                    java.lang.String next = it4.next();
                    androidx.constraintlayout.core.parser.CLElement cLElement = parse.get(next);
                    if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                        androidx.constraintlayout.core.parser.CLObject cLObject4 = (androidx.constraintlayout.core.parser.CLObject) cLElement;
                        int hashCode = next.hashCode();
                        if (hashCode == -2137403731) {
                            str2 = str5;
                            cLObject = parse;
                            it = it4;
                            if (next.equals("Header") && (stringOrNull = cLObject4.getStringOrNull("export")) != null) {
                                coreMotionScene.setDebugName(stringOrNull);
                            }
                        } else if (hashCode == -241441378) {
                            str2 = str5;
                            cLObject = parse;
                            it = it4;
                            if (next.equals(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.NAME) && (names = cLObject4.names()) != null) {
                                java.util.Iterator<java.lang.String> it5 = names.iterator();
                                while (it5.hasNext()) {
                                    java.lang.String next2 = it5.next();
                                    coreMotionScene.setTransitionContent(next2, cLObject4.getObject(next2).toJSON());
                                }
                            }
                        } else if (hashCode == 1101852654 && next.equals("ConstraintSets")) {
                            java.util.ArrayList<java.lang.String> names3 = cLObject4.names();
                            if (names3 != null) {
                                java.util.Iterator<java.lang.String> it6 = names3.iterator();
                                while (it6.hasNext()) {
                                    java.lang.String next3 = it6.next();
                                    androidx.constraintlayout.core.parser.CLObject object = cLObject4.getObject(next3);
                                    java.lang.String stringOrNull2 = object.getStringOrNull("Extends");
                                    if (stringOrNull2 != null && !stringOrNull2.isEmpty()) {
                                        java.lang.String constraintSet = coreMotionScene.getConstraintSet(stringOrNull2);
                                        if (constraintSet != null) {
                                            androidx.constraintlayout.core.parser.CLObject parse2 = androidx.constraintlayout.core.parser.CLParser.parse(constraintSet);
                                            java.util.ArrayList<java.lang.String> names4 = object.names();
                                            if (names4 != null) {
                                                java.util.Iterator<java.lang.String> it7 = names4.iterator();
                                                while (it7.hasNext()) {
                                                    java.lang.String next4 = it7.next();
                                                    androidx.constraintlayout.core.parser.CLElement cLElement2 = object.get(next4);
                                                    if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) {
                                                        androidx.constraintlayout.core.parser.CLObject cLObject5 = (androidx.constraintlayout.core.parser.CLObject) cLElement2;
                                                        if (!parse2.has(next4)) {
                                                            parse2.put(next4, cLObject5);
                                                        } else {
                                                            androidx.constraintlayout.core.parser.CLObject object2 = parse2.getObject(next4);
                                                            java.util.Iterator<java.lang.String> it8 = cLObject5.names().iterator();
                                                            while (it8.hasNext()) {
                                                                java.lang.String next5 = it8.next();
                                                                if (!next5.equals(str5)) {
                                                                    object2.put(next5, cLObject5.get(next5));
                                                                } else {
                                                                    androidx.constraintlayout.core.parser.CLArray array = cLObject5.getArray(str5);
                                                                    int i = 0;
                                                                    while (i < array.size()) {
                                                                        java.lang.String stringOrNull3 = array.getStringOrNull(i);
                                                                        if (stringOrNull3 != null) {
                                                                            stringOrNull3.hashCode();
                                                                            str4 = str5;
                                                                            int hashCode2 = stringOrNull3.hashCode();
                                                                            cLObject3 = parse;
                                                                            it3 = it4;
                                                                            if (hashCode2 == -1727069561) {
                                                                                if (stringOrNull3.equals("transforms")) {
                                                                                    c = 0;
                                                                                    if (c != 0) {
                                                                                    }
                                                                                }
                                                                                c = 65535;
                                                                                if (c != 0) {
                                                                                }
                                                                            } else if (hashCode2 != -1606703562) {
                                                                                if (hashCode2 == 414334925 && stringOrNull3.equals("dimensions")) {
                                                                                    c = 2;
                                                                                    if (c != 0) {
                                                                                        object2.remove("visibility");
                                                                                        object2.remove("alpha");
                                                                                        object2.remove("pivotX");
                                                                                        object2.remove("pivotY");
                                                                                        object2.remove("rotationX");
                                                                                        object2.remove("rotationY");
                                                                                        object2.remove("rotationZ");
                                                                                        object2.remove("scaleX");
                                                                                        object2.remove("scaleY");
                                                                                        object2.remove("translationX");
                                                                                        object2.remove("translationY");
                                                                                    } else if (c == 1) {
                                                                                        object2.remove(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START);
                                                                                        object2.remove("end");
                                                                                        object2.remove(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP);
                                                                                        object2.remove(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM);
                                                                                        object2.remove("baseline");
                                                                                        object2.remove(com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER);
                                                                                        object2.remove("centerHorizontally");
                                                                                        object2.remove("centerVertically");
                                                                                    } else if (c == 2) {
                                                                                        object2.remove("width");
                                                                                        object2.remove("height");
                                                                                    } else {
                                                                                        object2.remove(stringOrNull3);
                                                                                    }
                                                                                }
                                                                                c = 65535;
                                                                                if (c != 0) {
                                                                                }
                                                                            } else {
                                                                                if (stringOrNull3.equals("constraints")) {
                                                                                    c = 1;
                                                                                    if (c != 0) {
                                                                                    }
                                                                                }
                                                                                c = 65535;
                                                                                if (c != 0) {
                                                                                }
                                                                            }
                                                                        } else {
                                                                            str4 = str5;
                                                                            cLObject3 = parse;
                                                                            it3 = it4;
                                                                        }
                                                                        i++;
                                                                        str5 = str4;
                                                                        parse = cLObject3;
                                                                        it4 = it3;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                str3 = str5;
                                                cLObject2 = parse;
                                                it2 = it4;
                                                coreMotionScene.setConstraintSetContent(next3, parse2.toJSON());
                                            }
                                        }
                                    } else {
                                        str3 = str5;
                                        cLObject2 = parse;
                                        it2 = it4;
                                        coreMotionScene.setConstraintSetContent(next3, object.toJSON());
                                    }
                                    str5 = str3;
                                    parse = cLObject2;
                                    it4 = it2;
                                }
                            }
                            str2 = str5;
                            cLObject = parse;
                            it = it4;
                        }
                        str5 = str2;
                        parse = cLObject;
                        it4 = it;
                    }
                }
            }
        } catch (androidx.constraintlayout.core.parser.CLParsingException e) {
            java.lang.System.err.println("Error parsing JSON ".concat(java.lang.String.valueOf(e)));
        }
    }

    public static void parseJSON(java.lang.String str, androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables layoutVariables) throws androidx.constraintlayout.core.parser.CLParsingException {
        try {
            populateState(androidx.constraintlayout.core.parser.CLParser.parse(str), state, layoutVariables);
        } catch (androidx.constraintlayout.core.parser.CLParsingException e) {
            java.lang.System.err.println("Error parsing JSON ".concat(java.lang.String.valueOf(e)));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(13:68|69|(2:71|(11:73|(1:75)|76|77|(1:79)|80|(1:82)|83|84|85|61))(1:89)|88|76|77|(0)|80|(0)|83|84|85|61) */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x01ff. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:117:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x053e A[Catch: NumberFormatException -> 0x05dd, TryCatch #1 {NumberFormatException -> 0x05dd, blocks: (B:77:0x037d, B:79:0x038c, B:80:0x0393, B:82:0x039b, B:162:0x052f, B:164:0x053e, B:165:0x0545, B:167:0x054d), top: B:76:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x054d A[Catch: NumberFormatException -> 0x05dd, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x05dd, blocks: (B:77:0x037d, B:79:0x038c, B:80:0x0393, B:82:0x039b, B:162:0x052f, B:164:0x053e, B:165:0x0545, B:167:0x054d), top: B:76:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x059c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x07e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:426:0x07cd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x038c A[Catch: NumberFormatException -> 0x05dd, TryCatch #1 {NumberFormatException -> 0x05dd, blocks: (B:77:0x037d, B:79:0x038c, B:80:0x0393, B:82:0x039b, B:162:0x052f, B:164:0x053e, B:165:0x0545, B:167:0x054d), top: B:76:0x037d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x039b A[Catch: NumberFormatException -> 0x05dd, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x05dd, blocks: (B:77:0x037d, B:79:0x038c, B:80:0x0393, B:82:0x039b, B:162:0x052f, B:164:0x053e, B:165:0x0545, B:167:0x054d), top: B:76:0x037d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void populateState(androidx.constraintlayout.core.parser.CLObject cLObject, androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables layoutVariables) throws androidx.constraintlayout.core.parser.CLParsingException {
        char c;
        java.util.Iterator<java.lang.String> it;
        char c2;
        androidx.constraintlayout.core.parser.CLObject cLObject2;
        java.util.ArrayList<java.lang.String> names;
        androidx.constraintlayout.core.parser.CLObject cLObject3;
        java.util.ArrayList<java.lang.String> names2;
        java.lang.String str;
        char c3;
        char c4;
        float f;
        float f2;
        float f3;
        float f4;
        java.lang.String str2;
        int i;
        androidx.constraintlayout.core.parser.CLElement cLElement;
        char c5;
        java.util.Iterator<java.lang.String> it2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        java.lang.String content;
        char c6;
        androidx.constraintlayout.core.parser.CLArray arrayOrNull;
        char c7;
        char c8;
        java.util.Iterator<java.lang.String> it3;
        java.lang.String str3;
        float f12;
        float f13;
        float f14;
        java.util.Iterator<java.lang.String> it4;
        java.lang.String str4;
        boolean z;
        java.lang.String content2;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.Float f15;
        java.lang.Float valueOf;
        java.lang.Float f16;
        char c9;
        java.lang.String content3;
        java.lang.String str7;
        java.lang.String str8;
        float f17;
        float f18;
        float f19;
        float f20;
        java.lang.Float f21;
        java.lang.Float valueOf2;
        java.util.ArrayList<java.lang.String> names3 = cLObject.names();
        if (names3 != null) {
            java.util.Iterator<java.lang.String> it5 = names3.iterator();
            while (it5.hasNext()) {
                java.lang.String next = it5.next();
                androidx.constraintlayout.core.parser.CLElement cLElement2 = cLObject.get(next);
                next.hashCode();
                int hashCode = next.hashCode();
                if (hashCode == -1824489883) {
                    if (next.equals("Helpers")) {
                        c = 0;
                    }
                    c = 65535;
                } else if (hashCode != 1875016085) {
                    if (hashCode == 1921490263 && next.equals("Variables")) {
                        c = 2;
                    }
                    c = 65535;
                } else {
                    if (next.equals("Generate")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c != 0) {
                    java.lang.String str9 = null;
                    if (c == 1) {
                        it = it5;
                        if ((cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) && (names = (cLObject2 = (androidx.constraintlayout.core.parser.CLObject) cLElement2).names()) != null) {
                            java.util.Iterator<java.lang.String> it6 = names.iterator();
                            while (it6.hasNext()) {
                                java.lang.String next2 = it6.next();
                                androidx.constraintlayout.core.parser.CLElement cLElement3 = cLObject2.get(next2);
                                java.util.ArrayList<java.lang.String> arrayList = layoutVariables.Camera2StreamConfigurationMap.containsKey(next2) ? layoutVariables.Camera2StreamConfigurationMap.get(next2) : null;
                                if (arrayList != null && (cLElement3 instanceof androidx.constraintlayout.core.parser.CLObject)) {
                                    java.util.Iterator<java.lang.String> it7 = arrayList.iterator();
                                    while (it7.hasNext()) {
                                        Camera2StreamConfigurationMap(state, layoutVariables, it7.next(), (androidx.constraintlayout.core.parser.CLObject) cLElement3);
                                    }
                                }
                            }
                        }
                    } else if (c == 2) {
                        it = it5;
                        if ((cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) && (names2 = (cLObject3 = (androidx.constraintlayout.core.parser.CLObject) cLElement2).names()) != null) {
                            java.util.Iterator<java.lang.String> it8 = names2.iterator();
                            while (it8.hasNext()) {
                                java.lang.String next3 = it8.next();
                                androidx.constraintlayout.core.parser.CLElement cLElement4 = cLObject3.get(next3);
                                if (cLElement4 instanceof androidx.constraintlayout.core.parser.CLNumber) {
                                    layoutVariables.getHighSpeedVideoSizes.put(next3, java.lang.Integer.valueOf(cLElement4.getInt()));
                                } else if (cLElement4 instanceof androidx.constraintlayout.core.parser.CLObject) {
                                    androidx.constraintlayout.core.parser.CLObject cLObject4 = (androidx.constraintlayout.core.parser.CLObject) cLElement4;
                                    if (cLObject4.has("from") && cLObject4.has(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO)) {
                                        float highResolutionOutputSizeshNQ4ISI = layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject4.get("from"));
                                        float highResolutionOutputSizeshNQ4ISI2 = layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject4.get(androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO));
                                        java.lang.String stringOrNull = cLObject4.getStringOrNull("prefix");
                                        java.lang.String stringOrNull2 = cLObject4.getStringOrNull("postfix");
                                        if (!layoutVariables.getHighSpeedVideoFpsRangesFor.containsKey(next3) || !(layoutVariables.getHighSpeedVideoFpsRangesFor.get(next3) instanceof androidx.constraintlayout.core.state.ConstraintSetParser.OverrideValue)) {
                                            androidx.constraintlayout.core.state.ConstraintSetParser.FiniteGenerator finiteGenerator = new androidx.constraintlayout.core.state.ConstraintSetParser.FiniteGenerator(highResolutionOutputSizeshNQ4ISI, highResolutionOutputSizeshNQ4ISI2, 1.0f, stringOrNull, stringOrNull2);
                                            layoutVariables.getHighSpeedVideoFpsRangesFor.put(next3, finiteGenerator);
                                            java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>> hashMap = layoutVariables.Camera2StreamConfigurationMap;
                                            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
                                            int i2 = (int) finiteGenerator.getHighResolutionOutputSizeshNQ4ISI;
                                            int i3 = (int) finiteGenerator.Camera2StreamConfigurationMap;
                                            int i4 = i2;
                                            while (i2 <= i3) {
                                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                                sb.append(finiteGenerator.getOutputFormats);
                                                sb.append(i4);
                                                sb.append(finiteGenerator.getHighSpeedVideoSizes);
                                                arrayList2.add(sb.toString());
                                                i4 += (int) finiteGenerator.getOutputMinFrameDuration;
                                                i2++;
                                            }
                                            hashMap.put(next3, arrayList2);
                                        }
                                    } else if (cLObject4.has("from") && cLObject4.has("step")) {
                                        float highResolutionOutputSizeshNQ4ISI3 = layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject4.get("from"));
                                        float highResolutionOutputSizeshNQ4ISI4 = layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject4.get("step"));
                                        if (!layoutVariables.getHighSpeedVideoFpsRangesFor.containsKey(next3) || !(layoutVariables.getHighSpeedVideoFpsRangesFor.get(next3) instanceof androidx.constraintlayout.core.state.ConstraintSetParser.OverrideValue)) {
                                            layoutVariables.getHighSpeedVideoFpsRangesFor.put(next3, new androidx.constraintlayout.core.state.ConstraintSetParser.Generator(highResolutionOutputSizeshNQ4ISI3, highResolutionOutputSizeshNQ4ISI4));
                                        }
                                    } else if (cLObject4.has("ids")) {
                                        androidx.constraintlayout.core.parser.CLArray array = cLObject4.getArray("ids");
                                        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                                        for (int i5 = 0; i5 < array.size(); i5++) {
                                            arrayList3.add(array.getString(i5));
                                        }
                                        layoutVariables.Camera2StreamConfigurationMap.put(next3, arrayList3);
                                    } else if (cLObject4.has("tag")) {
                                        layoutVariables.Camera2StreamConfigurationMap.put(next3, state.getIdsForTag(cLObject4.getString("tag")));
                                    }
                                }
                            }
                        }
                    } else if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) {
                        androidx.constraintlayout.core.parser.CLObject cLObject5 = (androidx.constraintlayout.core.parser.CLObject) cLElement2;
                        java.util.Iterator<java.lang.String> it9 = cLObject5.names().iterator();
                        while (true) {
                            str = "type";
                            if (it9.hasNext()) {
                                if (it9.next().equals("type")) {
                                    str9 = cLObject5.getString("type");
                                }
                            }
                        }
                        if (str9 != null) {
                            str9.hashCode();
                            switch (str9.hashCode()) {
                                case -1785507558:
                                    if (str9.equals("vGuideline")) {
                                        c3 = 0;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1354837162:
                                    if (str9.equals("column")) {
                                        c3 = 1;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -1252464839:
                                    if (str9.equals("hChain")) {
                                        c3 = 2;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -851656725:
                                    if (str9.equals("vChain")) {
                                        c3 = 3;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case -333143113:
                                    if (str9.equals("barrier")) {
                                        c3 = 4;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 113114:
                                    if (str9.equals("row")) {
                                        c3 = 5;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 3181382:
                                    if (str9.equals("grid")) {
                                        c3 = 6;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 98238902:
                                    if (str9.equals("hFlow")) {
                                        c3 = 7;
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 111168196:
                                    if (str9.equals("vFlow")) {
                                        c3 = '\b';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                case 965681512:
                                    if (str9.equals("hGuideline")) {
                                        c3 = '\t';
                                        break;
                                    }
                                    c3 = 65535;
                                    break;
                                default:
                                    c3 = 65535;
                                    break;
                            }
                            switch (c3) {
                                case 0:
                                    it = it5;
                                    getHighSpeedVideoFpsRangesFor(1, state, next, cLObject5);
                                    break;
                                case 1:
                                case 5:
                                case 6:
                                    it = it5;
                                    androidx.constraintlayout.core.state.helpers.GridReference grid = state.getGrid(next, str9);
                                    java.util.Iterator<java.lang.String> it10 = cLObject5.names().iterator();
                                    while (it10.hasNext()) {
                                        java.lang.String next4 = it10.next();
                                        next4.hashCode();
                                        switch (next4.hashCode()) {
                                            case -1439500848:
                                                if (next4.equals("orientation")) {
                                                    c4 = 0;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -806339567:
                                                if (next4.equals("padding")) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case -567445985:
                                                if (next4.equals("contains")) {
                                                    c4 = 2;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3169614:
                                                if (next4.equals("hGap")) {
                                                    c4 = 3;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3506649:
                                                if (next4.equals("rows")) {
                                                    c4 = 4;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 3586688:
                                                if (next4.equals("vGap")) {
                                                    c4 = 5;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 97513095:
                                                if (next4.equals("flags")) {
                                                    c4 = 6;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 109497044:
                                                if (next4.equals("skips")) {
                                                    c4 = 7;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 109638249:
                                                if (next4.equals(com.datadog.android.trace.internal.domain.event.SpanEventSerializer.TAG_SPANS)) {
                                                    c4 = '\b';
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 144441793:
                                                if (next4.equals("rowWeights")) {
                                                    c4 = '\t';
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 949721053:
                                                if (next4.equals("columns")) {
                                                    c4 = '\n';
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            case 2033353925:
                                                if (next4.equals("columnWeights")) {
                                                    c4 = 11;
                                                    break;
                                                }
                                                c4 = 65535;
                                                break;
                                            default:
                                                c4 = 65535;
                                                break;
                                        }
                                        switch (c4) {
                                            case 0:
                                                grid.setOrientation(cLObject5.get(next4).getInt());
                                                break;
                                            case 1:
                                                androidx.constraintlayout.core.parser.CLElement cLElement5 = cLObject5.get(next4);
                                                if (cLElement5 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray = (androidx.constraintlayout.core.parser.CLArray) cLElement5;
                                                    if (cLArray.size() > 1) {
                                                        f = cLArray.getInt(0);
                                                        f4 = cLArray.getInt(1);
                                                        if (cLArray.size() > 2) {
                                                            f3 = cLArray.getInt(2);
                                                            try {
                                                                f2 = ((androidx.constraintlayout.core.parser.CLArray) cLElement5).getInt(3);
                                                            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                                                                f2 = 0.0f;
                                                            }
                                                        } else {
                                                            f3 = f;
                                                            f2 = f4;
                                                        }
                                                        grid.setPaddingStart(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f)));
                                                        grid.setPaddingTop(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f4)));
                                                        grid.setPaddingEnd(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f3)));
                                                        grid.setPaddingBottom(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f2)));
                                                        break;
                                                    }
                                                }
                                                f = cLElement5.getInt();
                                                f2 = f;
                                                f3 = f2;
                                                f4 = f3;
                                                grid.setPaddingStart(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f)));
                                                grid.setPaddingTop(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f4)));
                                                grid.setPaddingEnd(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f3)));
                                                grid.setPaddingBottom(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f2)));
                                            case 2:
                                                androidx.constraintlayout.core.parser.CLArray arrayOrNull2 = cLObject5.getArrayOrNull(next4);
                                                if (arrayOrNull2 != null) {
                                                    for (int i6 = 0; i6 < arrayOrNull2.size(); i6++) {
                                                        grid.add(state.constraints(arrayOrNull2.get(i6).content()));
                                                    }
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 3:
                                                grid.setHorizontalGaps(state.getHighSpeedVideoFpsRanges.toPixels(cLObject5.get(next4).getFloat()));
                                                break;
                                            case 4:
                                                int i7 = cLObject5.get(next4).getInt();
                                                if (i7 > 0) {
                                                    grid.setRowsSet(i7);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 5:
                                                grid.setVerticalGaps(state.getHighSpeedVideoFpsRanges.toPixels(cLObject5.get(next4).getFloat()));
                                                break;
                                            case 6:
                                                try {
                                                    cLElement = cLObject5.get(next4);
                                                } catch (java.lang.Exception e) {
                                                    java.lang.System.err.println("Error parsing grid flags ".concat(java.lang.String.valueOf(e)));
                                                    str2 = "";
                                                }
                                                if (cLElement instanceof androidx.constraintlayout.core.parser.CLNumber) {
                                                    i = cLElement.getInt();
                                                    str2 = "";
                                                    if (str2 == null && !str2.isEmpty()) {
                                                        grid.setFlags(str2);
                                                        break;
                                                    } else {
                                                        grid.setFlags(i);
                                                        break;
                                                    }
                                                } else {
                                                    str2 = cLElement.content();
                                                    i = 0;
                                                    if (str2 == null) {
                                                    }
                                                    grid.setFlags(i);
                                                }
                                            case 7:
                                                java.lang.String content4 = cLObject5.get(next4).content();
                                                if (content4 != null && content4.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
                                                    grid.setSkips(content4);
                                                    break;
                                                }
                                                break;
                                            case '\b':
                                                java.lang.String content5 = cLObject5.get(next4).content();
                                                if (content5 != null && content5.contains(io.ktor.sse.ServerSentEventKt.COLON)) {
                                                    grid.setSpans(content5);
                                                    break;
                                                }
                                                break;
                                            case '\t':
                                                java.lang.String content6 = cLObject5.get(next4).content();
                                                if (content6 != null && content6.contains(",")) {
                                                    grid.setRowWeights(content6);
                                                    break;
                                                }
                                                break;
                                            case '\n':
                                                int i8 = cLObject5.get(next4).getInt();
                                                if (i8 > 0) {
                                                    grid.setColumnsSet(i8);
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            case 11:
                                                java.lang.String content7 = cLObject5.get(next4).content();
                                                if (content7 != null && content7.contains(",")) {
                                                    grid.setColumnWeights(content7);
                                                    break;
                                                }
                                                break;
                                            default:
                                                getHighSpeedVideoFpsRangesFor(state, layoutVariables, state.constraints(next), cLObject5, next4);
                                                break;
                                        }
                                    }
                                    break;
                                case 2:
                                case 3:
                                    it = it5;
                                    androidx.constraintlayout.core.state.helpers.ChainReference horizontalChain = str9.charAt(0) == 'h' ? state.horizontalChain() : state.verticalChain();
                                    horizontalChain.setKey(next);
                                    java.util.Iterator<java.lang.String> it11 = cLObject5.names().iterator();
                                    while (it11.hasNext()) {
                                        java.lang.String next5 = it11.next();
                                        next5.hashCode();
                                        switch (next5.hashCode()) {
                                            case -1383228885:
                                                if (next5.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                                                    c5 = 0;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case -567445985:
                                                if (next5.equals("contains")) {
                                                    c5 = 1;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 100571:
                                                if (next5.equals("end")) {
                                                    c5 = 2;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 115029:
                                                if (next5.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                                                    c5 = 3;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 3317767:
                                                if (next5.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                                                    c5 = 4;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 108511772:
                                                if (next5.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                                                    c5 = 5;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 109757538:
                                                if (next5.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                                                    c5 = 6;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            case 109780401:
                                                if (next5.equals(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE)) {
                                                    c5 = 7;
                                                    break;
                                                }
                                                c5 = 65535;
                                                break;
                                            default:
                                                c5 = 65535;
                                                break;
                                        }
                                        switch (c5) {
                                            case 0:
                                            case 2:
                                            case 3:
                                            case 4:
                                            case 5:
                                            case 6:
                                                Camera2StreamConfigurationMap(state, layoutVariables, cLObject5, horizontalChain, next5);
                                            case 1:
                                                androidx.constraintlayout.core.parser.CLElement cLElement6 = cLObject5.get(next5);
                                                if (cLElement6 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray2 = (androidx.constraintlayout.core.parser.CLArray) cLElement6;
                                                    if (cLArray2.size() > 0) {
                                                        int i9 = 0;
                                                        while (i9 < cLArray2.size()) {
                                                            androidx.constraintlayout.core.parser.CLElement cLElement7 = cLArray2.get(i9);
                                                            if (cLElement7 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                                androidx.constraintlayout.core.parser.CLArray cLArray3 = (androidx.constraintlayout.core.parser.CLArray) cLElement7;
                                                                if (cLArray3.size() > 0) {
                                                                    java.lang.String content8 = cLArray3.get(0).content();
                                                                    int size = cLArray3.size();
                                                                    if (size == 2) {
                                                                        it2 = it11;
                                                                        f5 = cLArray3.getFloat(1);
                                                                    } else {
                                                                        if (size == 3) {
                                                                            it2 = it11;
                                                                            f11 = cLArray3.getFloat(1);
                                                                            f9 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(2));
                                                                            f8 = f9;
                                                                        } else if (size == 4) {
                                                                            it2 = it11;
                                                                            f11 = cLArray3.getFloat(1);
                                                                            f9 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(2));
                                                                            f8 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(3));
                                                                        } else if (size != 6) {
                                                                            it2 = it11;
                                                                            f5 = Float.NaN;
                                                                        } else {
                                                                            float f22 = cLArray3.getFloat(1);
                                                                            float pixels = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(2));
                                                                            it2 = it11;
                                                                            float pixels2 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(3));
                                                                            f7 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(4));
                                                                            f6 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray3.getFloat(5));
                                                                            f9 = pixels;
                                                                            f10 = f22;
                                                                            f8 = pixels2;
                                                                            horizontalChain.addChainElement(content8, f10, f9, f8, f7, f6);
                                                                        }
                                                                        f10 = f11;
                                                                        f7 = Float.NaN;
                                                                        f6 = f7;
                                                                        horizontalChain.addChainElement(content8, f10, f9, f8, f7, f6);
                                                                    }
                                                                    f10 = f5;
                                                                    f9 = Float.NaN;
                                                                    f8 = Float.NaN;
                                                                    f7 = Float.NaN;
                                                                    f6 = f7;
                                                                    horizontalChain.addChainElement(content8, f10, f9, f8, f7, f6);
                                                                } else {
                                                                    it2 = it11;
                                                                }
                                                            } else {
                                                                it2 = it11;
                                                                horizontalChain.add(cLElement7.content());
                                                            }
                                                            i9++;
                                                            it11 = it2;
                                                        }
                                                        it11 = it11;
                                                    }
                                                }
                                                java.io.PrintStream printStream = java.lang.System.err;
                                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                                sb2.append(next);
                                                sb2.append(" contains should be an array \"");
                                                sb2.append(cLElement6.content());
                                                sb2.append("\"");
                                                printStream.println(sb2.toString());
                                                break;
                                            case 7:
                                                androidx.constraintlayout.core.parser.CLElement cLElement8 = cLObject5.get(next5);
                                                if (cLElement8 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray4 = (androidx.constraintlayout.core.parser.CLArray) cLElement8;
                                                    if (cLArray4.size() > 1) {
                                                        content = cLArray4.getString(0);
                                                        horizontalChain.bias(cLArray4.getFloat(1));
                                                        content.hashCode();
                                                        if (!content.equals("packed")) {
                                                            horizontalChain.style(androidx.constraintlayout.core.state.State.Chain.PACKED);
                                                        } else if (content.equals("spread_inside")) {
                                                            horizontalChain.style(androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE);
                                                        } else {
                                                            horizontalChain.style(androidx.constraintlayout.core.state.State.Chain.SPREAD);
                                                        }
                                                    }
                                                }
                                                content = cLElement8.content();
                                                content.hashCode();
                                                if (!content.equals("packed")) {
                                                }
                                            default:
                                                it11 = it11;
                                        }
                                    }
                                    break;
                                case 4:
                                    it = it5;
                                    boolean isRtl = state.isRtl();
                                    androidx.constraintlayout.core.state.helpers.BarrierReference barrier = state.barrier(next, androidx.constraintlayout.core.state.State.Direction.END);
                                    java.util.ArrayList<java.lang.String> names4 = cLObject5.names();
                                    if (names4 != null) {
                                        java.util.Iterator<java.lang.String> it12 = names4.iterator();
                                        while (it12.hasNext()) {
                                            java.lang.String next6 = it12.next();
                                            next6.hashCode();
                                            int hashCode2 = next6.hashCode();
                                            if (hashCode2 == -1081309778) {
                                                if (next6.equals("margin")) {
                                                    c6 = 0;
                                                }
                                                c6 = 65535;
                                            } else if (hashCode2 != -962590849) {
                                                if (hashCode2 == -567445985 && next6.equals("contains")) {
                                                    c6 = 2;
                                                }
                                                c6 = 65535;
                                            } else {
                                                if (next6.equals("direction")) {
                                                    c6 = 1;
                                                }
                                                c6 = 65535;
                                            }
                                            if (c6 == 0) {
                                                float floatOrNaN = cLObject5.getFloatOrNaN(next6);
                                                if (!java.lang.Float.isNaN(floatOrNaN)) {
                                                    barrier.margin(java.lang.Float.valueOf(state.getHighSpeedVideoFpsRanges.toPixels(floatOrNaN)));
                                                }
                                            } else if (c6 == 1) {
                                                java.lang.String string = cLObject5.getString(next6);
                                                string.hashCode();
                                                switch (string.hashCode()) {
                                                    case -1383228885:
                                                        if (string.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                                                            c7 = 0;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 100571:
                                                        if (string.equals("end")) {
                                                            c7 = 1;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 115029:
                                                        if (string.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                                                            c7 = 2;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 3317767:
                                                        if (string.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                                                            c7 = 3;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 108511772:
                                                        if (string.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                                                            c7 = 4;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    case 109757538:
                                                        if (string.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                                                            c7 = 5;
                                                            break;
                                                        }
                                                        c7 = 65535;
                                                        break;
                                                    default:
                                                        c7 = 65535;
                                                        break;
                                                }
                                                if (c7 == 0) {
                                                    barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.BOTTOM);
                                                } else if (c7 != 1) {
                                                    if (c7 == 2) {
                                                        barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.TOP);
                                                    } else if (c7 == 3) {
                                                        barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.LEFT);
                                                    } else if (c7 == 4) {
                                                        barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.RIGHT);
                                                    } else if (c7 == 5) {
                                                        if (!isRtl) {
                                                            barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.LEFT);
                                                        } else {
                                                            barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.RIGHT);
                                                        }
                                                    }
                                                } else if (!isRtl) {
                                                    barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.RIGHT);
                                                } else {
                                                    barrier.setBarrierDirection(androidx.constraintlayout.core.state.State.Direction.LEFT);
                                                }
                                            } else if (c6 == 2 && (arrayOrNull = cLObject5.getArrayOrNull(next6)) != null) {
                                                for (int i10 = 0; i10 < arrayOrNull.size(); i10++) {
                                                    barrier.add(state.constraints(arrayOrNull.get(i10).content()));
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case 7:
                                case '\b':
                                    androidx.constraintlayout.core.state.helpers.FlowReference flow = state.getFlow(next, str9.charAt(0) == 'v');
                                    java.util.Iterator<java.lang.String> it13 = cLObject5.names().iterator();
                                    while (it13.hasNext()) {
                                        java.lang.String next7 = it13.next();
                                        next7.hashCode();
                                        switch (next7.hashCode()) {
                                            case -1254185091:
                                                it = it5;
                                                if (next7.equals("hAlign")) {
                                                    c8 = 0;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -1237307863:
                                                it = it5;
                                                if (next7.equals("hStyle")) {
                                                    c8 = 1;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -1198076529:
                                                it = it5;
                                                if (next7.equals("hFlowBias")) {
                                                    c8 = 2;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -853376977:
                                                it = it5;
                                                if (next7.equals("vAlign")) {
                                                    c8 = 3;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -836499749:
                                                it = it5;
                                                if (next7.equals("vStyle")) {
                                                    c8 = 4;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -806339567:
                                                it = it5;
                                                if (next7.equals("padding")) {
                                                    c8 = 5;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -732635235:
                                                it = it5;
                                                if (next7.equals("vFlowBias")) {
                                                    c8 = 6;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -567445985:
                                                it = it5;
                                                if (next7.equals("contains")) {
                                                    c8 = 7;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case -488900360:
                                                it = it5;
                                                if (next7.equals("maxElement")) {
                                                    c8 = '\b';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3169614:
                                                it = it5;
                                                if (next7.equals("hGap")) {
                                                    c8 = '\t';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3575610:
                                                it = it5;
                                                if (next7.equals(str)) {
                                                    c8 = '\n';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3586688:
                                                it = it5;
                                                if (next7.equals("vGap")) {
                                                    c8 = 11;
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            case 3657802:
                                                it = it5;
                                                if (next7.equals("wrap")) {
                                                    c8 = '\f';
                                                    break;
                                                }
                                                c8 = 65535;
                                                break;
                                            default:
                                                it = it5;
                                                c8 = 65535;
                                                break;
                                        }
                                        switch (c8) {
                                            case 0:
                                                it4 = it13;
                                                str4 = str;
                                                java.lang.String content9 = cLObject5.get(next7).content();
                                                content9.hashCode();
                                                if (content9.equals("end")) {
                                                    flow.setHorizontalAlign(1);
                                                } else if (content9.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                                                    z = false;
                                                    flow.setHorizontalAlign(0);
                                                    it5 = it;
                                                    it13 = it4;
                                                    str = str4;
                                                } else {
                                                    flow.setHorizontalAlign(2);
                                                }
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                            case 1:
                                                it4 = it13;
                                                str4 = str;
                                                androidx.constraintlayout.core.parser.CLElement cLElement9 = cLObject5.get(next7);
                                                if (cLElement9 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray5 = (androidx.constraintlayout.core.parser.CLArray) cLElement9;
                                                    if (cLArray5.size() > 1) {
                                                        str5 = cLArray5.getString(0);
                                                        content2 = cLArray5.getString(1);
                                                        str6 = cLArray5.size() > 2 ? cLArray5.getString(2) : "";
                                                        if (!content2.equals("")) {
                                                            flow.setHorizontalStyle(androidx.constraintlayout.core.state.State.Chain.getValueByString(content2));
                                                        }
                                                        if (!str5.equals("")) {
                                                            flow.setFirstHorizontalStyle(androidx.constraintlayout.core.state.State.Chain.getValueByString(str5));
                                                        }
                                                        if (!str6.equals("")) {
                                                            flow.setLastHorizontalStyle(androidx.constraintlayout.core.state.State.Chain.getValueByString(str6));
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                }
                                                content2 = cLElement9.content();
                                                str5 = "";
                                                str6 = str5;
                                                if (!content2.equals("")) {
                                                }
                                                if (!str5.equals("")) {
                                                }
                                                if (!str6.equals("")) {
                                                }
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                            case 2:
                                                it4 = it13;
                                                str4 = str;
                                                androidx.constraintlayout.core.parser.CLElement cLElement10 = cLObject5.get(next7);
                                                java.lang.Float valueOf3 = java.lang.Float.valueOf(0.5f);
                                                java.lang.Float valueOf4 = java.lang.Float.valueOf(0.5f);
                                                if (cLElement10 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray6 = (androidx.constraintlayout.core.parser.CLArray) cLElement10;
                                                    f15 = valueOf3;
                                                    if (cLArray6.size() > 1) {
                                                        f16 = java.lang.Float.valueOf(cLArray6.getFloat(0));
                                                        java.lang.Float valueOf5 = java.lang.Float.valueOf(cLArray6.getFloat(1));
                                                        if (cLArray6.size() > 2) {
                                                            valueOf4 = java.lang.Float.valueOf(cLArray6.getFloat(2));
                                                        }
                                                        valueOf = valueOf5;
                                                        flow.horizontalBias(valueOf.floatValue());
                                                        if (f16.floatValue() != 0.5f) {
                                                            flow.setFirstHorizontalBias(f16.floatValue());
                                                        }
                                                        if (valueOf4.floatValue() != 0.5f) {
                                                            flow.setLastHorizontalBias(valueOf4.floatValue());
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                } else {
                                                    f15 = valueOf3;
                                                }
                                                valueOf = java.lang.Float.valueOf(cLElement10.getFloat());
                                                f16 = f15;
                                                flow.horizontalBias(valueOf.floatValue());
                                                if (f16.floatValue() != 0.5f) {
                                                }
                                                if (valueOf4.floatValue() != 0.5f) {
                                                }
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                            case 3:
                                                it4 = it13;
                                                str4 = str;
                                                java.lang.String content10 = cLObject5.get(next7).content();
                                                content10.hashCode();
                                                int hashCode3 = content10.hashCode();
                                                if (hashCode3 == -1720785339) {
                                                    if (content10.equals("baseline")) {
                                                        c9 = 0;
                                                        if (c9 != 0) {
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                    c9 = 65535;
                                                    if (c9 != 0) {
                                                    }
                                                    it5 = it;
                                                    it13 = it4;
                                                    str = str4;
                                                } else if (hashCode3 != -1383228885) {
                                                    if (hashCode3 == 115029 && content10.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                                                        c9 = 2;
                                                        if (c9 != 0) {
                                                            flow.setVerticalAlign(3);
                                                        } else if (c9 == 1) {
                                                            flow.setVerticalAlign(1);
                                                        } else if (c9 == 2) {
                                                            z = false;
                                                            flow.setVerticalAlign(0);
                                                        } else {
                                                            flow.setVerticalAlign(2);
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                    c9 = 65535;
                                                    if (c9 != 0) {
                                                    }
                                                    it5 = it;
                                                    it13 = it4;
                                                    str = str4;
                                                } else {
                                                    if (content10.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                                                        c9 = 1;
                                                        if (c9 != 0) {
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                    c9 = 65535;
                                                    if (c9 != 0) {
                                                    }
                                                    it5 = it;
                                                    it13 = it4;
                                                    str = str4;
                                                }
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                                break;
                                            case 4:
                                                it4 = it13;
                                                str4 = str;
                                                androidx.constraintlayout.core.parser.CLElement cLElement11 = cLObject5.get(next7);
                                                if (cLElement11 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray7 = (androidx.constraintlayout.core.parser.CLArray) cLElement11;
                                                    if (cLArray7.size() > 1) {
                                                        str7 = cLArray7.getString(0);
                                                        content3 = cLArray7.getString(1);
                                                        str8 = cLArray7.size() > 2 ? cLArray7.getString(2) : "";
                                                        if (!content3.equals("")) {
                                                            flow.setVerticalStyle(androidx.constraintlayout.core.state.State.Chain.getValueByString(content3));
                                                        }
                                                        if (!str7.equals("")) {
                                                            flow.setFirstVerticalStyle(androidx.constraintlayout.core.state.State.Chain.getValueByString(str7));
                                                        }
                                                        if (!str8.equals("")) {
                                                            flow.setLastVerticalStyle(androidx.constraintlayout.core.state.State.Chain.getValueByString(str8));
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                }
                                                content3 = cLElement11.content();
                                                str7 = "";
                                                str8 = str7;
                                                if (!content3.equals("")) {
                                                }
                                                if (!str7.equals("")) {
                                                }
                                                if (!str8.equals("")) {
                                                }
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                            case 5:
                                                it4 = it13;
                                                str4 = str;
                                                androidx.constraintlayout.core.parser.CLElement cLElement12 = cLObject5.get(next7);
                                                if (cLElement12 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray8 = (androidx.constraintlayout.core.parser.CLArray) cLElement12;
                                                    if (cLArray8.size() > 1) {
                                                        float f23 = cLArray8.getInt(0);
                                                        f20 = cLArray8.getInt(1);
                                                        if (cLArray8.size() > 2) {
                                                            f19 = cLArray8.getInt(2);
                                                            try {
                                                                f18 = ((androidx.constraintlayout.core.parser.CLArray) cLElement12).getInt(3);
                                                            } catch (java.lang.ArrayIndexOutOfBoundsException unused2) {
                                                                f18 = 0.0f;
                                                            }
                                                            f17 = f23;
                                                        } else {
                                                            f18 = f20;
                                                            f19 = f23;
                                                            f17 = f19;
                                                        }
                                                        flow.setPaddingLeft(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f17)));
                                                        flow.setPaddingTop(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f20)));
                                                        flow.setPaddingRight(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f19)));
                                                        flow.setPaddingBottom(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f18)));
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                }
                                                f17 = cLElement12.getInt();
                                                f18 = f17;
                                                f19 = f18;
                                                f20 = f19;
                                                flow.setPaddingLeft(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f17)));
                                                flow.setPaddingTop(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f20)));
                                                flow.setPaddingRight(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f19)));
                                                flow.setPaddingBottom(java.lang.Math.round(state.getHighSpeedVideoFpsRanges.toPixels(f18)));
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                            case 6:
                                                it4 = it13;
                                                str4 = str;
                                                androidx.constraintlayout.core.parser.CLElement cLElement13 = cLObject5.get(next7);
                                                java.lang.Float valueOf6 = java.lang.Float.valueOf(0.5f);
                                                java.lang.Float valueOf7 = java.lang.Float.valueOf(0.5f);
                                                if (cLElement13 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray9 = (androidx.constraintlayout.core.parser.CLArray) cLElement13;
                                                    f21 = valueOf6;
                                                    if (cLArray9.size() > 1) {
                                                        java.lang.Float valueOf8 = java.lang.Float.valueOf(cLArray9.getFloat(0));
                                                        valueOf2 = java.lang.Float.valueOf(cLArray9.getFloat(1));
                                                        f21 = valueOf8;
                                                        if (cLArray9.size() > 2) {
                                                            valueOf7 = java.lang.Float.valueOf(cLArray9.getFloat(2));
                                                        }
                                                        flow.verticalBias(valueOf2.floatValue());
                                                        if (f21.floatValue() != 0.5f) {
                                                            flow.setFirstVerticalBias(f21.floatValue());
                                                        }
                                                        if (valueOf7.floatValue() != 0.5f) {
                                                            flow.setLastVerticalBias(valueOf7.floatValue());
                                                        }
                                                        it5 = it;
                                                        it13 = it4;
                                                        str = str4;
                                                    }
                                                } else {
                                                    f21 = valueOf6;
                                                }
                                                valueOf2 = java.lang.Float.valueOf(cLElement13.getFloat());
                                                flow.verticalBias(valueOf2.floatValue());
                                                if (f21.floatValue() != 0.5f) {
                                                }
                                                if (valueOf7.floatValue() != 0.5f) {
                                                }
                                                it5 = it;
                                                it13 = it4;
                                                str = str4;
                                            case 7:
                                                androidx.constraintlayout.core.parser.CLElement cLElement14 = cLObject5.get(next7);
                                                if (cLElement14 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                    androidx.constraintlayout.core.parser.CLArray cLArray10 = (androidx.constraintlayout.core.parser.CLArray) cLElement14;
                                                    if (cLArray10.size() > 0) {
                                                        int i11 = 0;
                                                        while (i11 < cLArray10.size()) {
                                                            androidx.constraintlayout.core.parser.CLElement cLElement15 = cLArray10.get(i11);
                                                            androidx.constraintlayout.core.parser.CLArray cLArray11 = cLArray10;
                                                            if (cLElement15 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                                                androidx.constraintlayout.core.parser.CLArray cLArray12 = (androidx.constraintlayout.core.parser.CLArray) cLElement15;
                                                                if (cLArray12.size() > 0) {
                                                                    java.lang.String content11 = cLArray12.get(0).content();
                                                                    it3 = it13;
                                                                    int size2 = cLArray12.size();
                                                                    str3 = str;
                                                                    if (size2 == 2) {
                                                                        f12 = cLArray12.getFloat(1);
                                                                        f13 = Float.NaN;
                                                                        f14 = Float.NaN;
                                                                    } else if (size2 == 3) {
                                                                        f12 = cLArray12.getFloat(1);
                                                                        f14 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray12.getFloat(2));
                                                                        f13 = f14;
                                                                    } else if (size2 != 4) {
                                                                        f13 = Float.NaN;
                                                                        f14 = Float.NaN;
                                                                        f12 = Float.NaN;
                                                                    } else {
                                                                        float f24 = cLArray12.getFloat(1);
                                                                        f14 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray12.getFloat(2));
                                                                        f13 = state.getHighSpeedVideoFpsRanges.toPixels(cLArray12.getFloat(3));
                                                                        f12 = f24;
                                                                    }
                                                                    flow.addFlowElement(content11, f12, f14, f13);
                                                                } else {
                                                                    it3 = it13;
                                                                    str3 = str;
                                                                }
                                                            } else {
                                                                it3 = it13;
                                                                str3 = str;
                                                                flow.add(cLElement15.content());
                                                            }
                                                            i11++;
                                                            cLArray10 = cLArray11;
                                                            it13 = it3;
                                                            str = str3;
                                                        }
                                                        it5 = it;
                                                    }
                                                }
                                                java.io.PrintStream printStream2 = java.lang.System.err;
                                                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                                                sb3.append(next);
                                                sb3.append(" contains should be an array \"");
                                                sb3.append(cLElement14.content());
                                                sb3.append("\"");
                                                printStream2.println(sb3.toString());
                                                break;
                                            case '\b':
                                                flow.setMaxElementsWrap(cLObject5.get(next7).getInt());
                                                it5 = it;
                                            case '\t':
                                                flow.setHorizontalGap(cLObject5.get(next7).getInt());
                                                it5 = it;
                                            case '\n':
                                                if (cLObject5.get(next7).content().equals("hFlow")) {
                                                    flow.setOrientation(0);
                                                    it5 = it;
                                                } else {
                                                    flow.setOrientation(1);
                                                    it5 = it;
                                                }
                                            case 11:
                                                flow.setVerticalGap(cLObject5.get(next7).getInt());
                                                it5 = it;
                                            case '\f':
                                                flow.setWrapMode(androidx.constraintlayout.core.state.State.Wrap.getValueByString(cLObject5.get(next7).content()));
                                                it5 = it;
                                            default:
                                                getHighSpeedVideoFpsRangesFor(state, layoutVariables, state.constraints(next), cLObject5, next7);
                                                it5 = it;
                                        }
                                    }
                                    break;
                                case '\t':
                                    getHighSpeedVideoFpsRangesFor(0, state, next, cLObject5);
                                    continue;
                            }
                        } else {
                            Camera2StreamConfigurationMap(state, layoutVariables, next, cLObject5);
                        }
                    } else {
                        it = it5;
                        if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLNumber) {
                            layoutVariables.getHighSpeedVideoSizes.put(next, java.lang.Integer.valueOf(cLElement2.getInt()));
                        }
                    }
                } else {
                    it = it5;
                    if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLArray) {
                        androidx.constraintlayout.core.parser.CLArray cLArray13 = (androidx.constraintlayout.core.parser.CLArray) cLElement2;
                        for (int i12 = 0; i12 < cLArray13.size(); i12++) {
                            androidx.constraintlayout.core.parser.CLElement cLElement16 = cLArray13.get(i12);
                            if (cLElement16 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                androidx.constraintlayout.core.parser.CLArray cLArray14 = (androidx.constraintlayout.core.parser.CLArray) cLElement16;
                                if (cLArray14.size() > 1) {
                                    java.lang.String string2 = cLArray14.getString(0);
                                    string2.hashCode();
                                    switch (string2.hashCode()) {
                                        case -1785507558:
                                            if (string2.equals("vGuideline")) {
                                                c2 = 0;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -1252464839:
                                            if (string2.equals("hChain")) {
                                                c2 = 1;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case -851656725:
                                            if (string2.equals("vChain")) {
                                                c2 = 2;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        case 965681512:
                                            if (string2.equals("hGuideline")) {
                                                c2 = 3;
                                                break;
                                            }
                                            c2 = 65535;
                                            break;
                                        default:
                                            c2 = 65535;
                                            break;
                                    }
                                    if (c2 == 0) {
                                        getHighSpeedVideoSizes(1, state, cLArray14);
                                    } else if (c2 == 1) {
                                        getHighSpeedVideoFpsRanges(0, state, layoutVariables, cLArray14);
                                    } else if (c2 == 2) {
                                        getHighSpeedVideoFpsRanges(1, state, layoutVariables, cLArray14);
                                    } else if (c2 == 3) {
                                        getHighSpeedVideoSizes(0, state, cLArray14);
                                    }
                                }
                            }
                        }
                    }
                }
                it5 = it;
            }
        }
    }

    public static void parseDesignElementsJSON(java.lang.String str, java.util.ArrayList<androidx.constraintlayout.core.state.ConstraintSetParser.DesignElement> arrayList) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLObject parse = androidx.constraintlayout.core.parser.CLParser.parse(str);
        java.util.ArrayList<java.lang.String> names = parse.names();
        if (names == null || names.size() <= 0) {
            return;
        }
        java.lang.String str2 = names.get(0);
        androidx.constraintlayout.core.parser.CLElement cLElement = parse.get(str2);
        str2.hashCode();
        if (str2.equals("Design") && (cLElement instanceof androidx.constraintlayout.core.parser.CLObject)) {
            androidx.constraintlayout.core.parser.CLObject cLObject = (androidx.constraintlayout.core.parser.CLObject) cLElement;
            java.util.ArrayList<java.lang.String> names2 = cLObject.names();
            for (int i = 0; i < names2.size(); i++) {
                java.lang.String str3 = names2.get(i);
                androidx.constraintlayout.core.parser.CLObject cLObject2 = (androidx.constraintlayout.core.parser.CLObject) cLObject.get(str3);
                java.lang.System.out.printf("element found ".concat(java.lang.String.valueOf(str3)), new java.lang.Object[0]);
                java.lang.String stringOrNull = cLObject2.getStringOrNull("type");
                if (stringOrNull != null) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    int size = cLObject2.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        androidx.constraintlayout.core.parser.CLKey cLKey = (androidx.constraintlayout.core.parser.CLKey) cLObject2.get(i);
                        java.lang.String content = cLKey.content();
                        java.lang.String content2 = cLKey.getValue().content();
                        if (content2 != null) {
                            hashMap.put(content, content2);
                        }
                    }
                    arrayList.add(new androidx.constraintlayout.core.state.ConstraintSetParser.DesignElement(str2, stringOrNull, hashMap));
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(int i, androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables layoutVariables, androidx.constraintlayout.core.parser.CLArray cLArray) throws androidx.constraintlayout.core.parser.CLParsingException {
        java.lang.String content;
        androidx.constraintlayout.core.state.helpers.ChainReference horizontalChain = i == 0 ? state.horizontalChain() : state.verticalChain();
        androidx.constraintlayout.core.parser.CLElement cLElement = cLArray.get(1);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLArray) {
            androidx.constraintlayout.core.parser.CLArray cLArray2 = (androidx.constraintlayout.core.parser.CLArray) cLElement;
            if (cLArray2.size() <= 0) {
                return;
            }
            for (int i2 = 0; i2 < cLArray2.size(); i2++) {
                horizontalChain.add(cLArray2.getString(i2));
            }
            if (cLArray.size() > 2) {
                androidx.constraintlayout.core.parser.CLElement cLElement2 = cLArray.get(2);
                if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) {
                    androidx.constraintlayout.core.parser.CLObject cLObject = (androidx.constraintlayout.core.parser.CLObject) cLElement2;
                    java.util.Iterator<java.lang.String> it = cLObject.names().iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        next.hashCode();
                        if (next.equals(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE)) {
                            androidx.constraintlayout.core.parser.CLElement cLElement3 = cLObject.get(next);
                            if (cLElement3 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                androidx.constraintlayout.core.parser.CLArray cLArray3 = (androidx.constraintlayout.core.parser.CLArray) cLElement3;
                                if (cLArray3.size() > 1) {
                                    content = cLArray3.getString(0);
                                    horizontalChain.bias(cLArray3.getFloat(1));
                                    content.hashCode();
                                    if (!content.equals("packed")) {
                                        horizontalChain.style(androidx.constraintlayout.core.state.State.Chain.PACKED);
                                    } else if (content.equals("spread_inside")) {
                                        horizontalChain.style(androidx.constraintlayout.core.state.State.Chain.SPREAD_INSIDE);
                                    } else {
                                        horizontalChain.style(androidx.constraintlayout.core.state.State.Chain.SPREAD);
                                    }
                                }
                            }
                            content = cLElement3.content();
                            content.hashCode();
                            if (!content.equals("packed")) {
                            }
                        } else {
                            Camera2StreamConfigurationMap(state, layoutVariables, cLObject, horizontalChain, next);
                        }
                    }
                }
            }
        }
    }

    private static void getHighSpeedVideoSizes(int i, androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.parser.CLArray cLArray) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLObject cLObject;
        java.lang.String stringOrNull;
        androidx.constraintlayout.core.parser.CLElement cLElement = cLArray.get(1);
        if (!(cLElement instanceof androidx.constraintlayout.core.parser.CLObject) || (stringOrNull = (cLObject = (androidx.constraintlayout.core.parser.CLObject) cLElement).getStringOrNull("id")) == null) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(i, state, stringOrNull, cLObject);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void getHighSpeedVideoFpsRangesFor(int i, androidx.constraintlayout.core.state.State state, java.lang.String str, androidx.constraintlayout.core.parser.CLObject cLObject) throws androidx.constraintlayout.core.parser.CLParsingException {
        char c;
        char c2;
        java.util.ArrayList<java.lang.String> names = cLObject.names();
        if (names == null) {
            return;
        }
        androidx.constraintlayout.core.state.ConstraintReference constraints = state.constraints(str);
        if (i == 0) {
            state.horizontalGuideline(str);
        } else {
            state.verticalGuideline(str);
        }
        boolean z = !state.isRtl() || i == 0;
        androidx.constraintlayout.core.state.helpers.GuidelineReference guidelineReference = (androidx.constraintlayout.core.state.helpers.GuidelineReference) constraints.getFacade();
        java.util.Iterator<java.lang.String> it = names.iterator();
        float f = 0.0f;
        boolean z2 = false;
        while (true) {
            boolean z3 = true;
            while (it.hasNext()) {
                java.lang.String next = it.next();
                next.hashCode();
                switch (next.hashCode()) {
                    case -678927291:
                        if (next.equals("percent")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 100571:
                        if (next.equals("end")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3317767:
                        if (next.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 108511772:
                        if (next.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 109757538:
                        if (next.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    androidx.constraintlayout.core.parser.CLArray arrayOrNull = cLObject.getArrayOrNull(next);
                    if (arrayOrNull == null) {
                        f = cLObject.getFloat(next);
                        z2 = true;
                    } else {
                        if (arrayOrNull.size() > 1) {
                            java.lang.String string = arrayOrNull.getString(0);
                            float f2 = arrayOrNull.getFloat(1);
                            string.hashCode();
                            switch (string.hashCode()) {
                                case 100571:
                                    if (string.equals("end")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 3317767:
                                    if (string.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 108511772:
                                    if (string.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case 109757538:
                                    if (string.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                z3 = !z;
                            } else if (c2 == 1) {
                                z3 = true;
                                f = f2;
                                z2 = true;
                            } else if (c2 == 2) {
                                z3 = false;
                            } else if (c2 == 3) {
                                z3 = z;
                            }
                            f = f2;
                        }
                        z2 = true;
                    }
                } else if (c == 1) {
                    f = state.getHighSpeedVideoFpsRanges.toPixels(cLObject.getFloat(next));
                    z3 = !z;
                } else if (c == 2) {
                    f = state.getHighSpeedVideoFpsRanges.toPixels(cLObject.getFloat(next));
                } else if (c == 3) {
                    f = state.getHighSpeedVideoFpsRanges.toPixels(cLObject.getFloat(next));
                    z3 = false;
                } else if (c == 4) {
                    f = state.getHighSpeedVideoFpsRanges.toPixels(cLObject.getFloat(next));
                    z3 = z;
                }
            }
            if (z2) {
                if (z3) {
                    guidelineReference.percent(f);
                    return;
                } else {
                    guidelineReference.percent(1.0f - f);
                    return;
                }
            }
            if (z3) {
                guidelineReference.start(java.lang.Float.valueOf(f));
                return;
            } else {
                guidelineReference.end(java.lang.Float.valueOf(f));
                return;
            }
        }
    }

    private static void Camera2StreamConfigurationMap(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables layoutVariables, java.lang.String str, androidx.constraintlayout.core.parser.CLObject cLObject) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.state.ConstraintReference constraints = state.constraints(str);
        if (constraints.getWidth() == null) {
            constraints.setWidth(androidx.constraintlayout.core.state.Dimension.createWrap());
        }
        if (constraints.getHeight() == null) {
            constraints.setHeight(androidx.constraintlayout.core.state.Dimension.createWrap());
        }
        java.util.ArrayList<java.lang.String> names = cLObject.names();
        if (names != null) {
            java.util.Iterator<java.lang.String> it = names.iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRangesFor(state, layoutVariables, constraints, cLObject, it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables layoutVariables, androidx.constraintlayout.core.state.ConstraintReference constraintReference, androidx.constraintlayout.core.parser.CLObject cLObject, java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        char c;
        androidx.constraintlayout.core.state.ConstraintReference constraints;
        java.util.ArrayList<java.lang.String> names;
        char c2;
        str.hashCode();
        char c3 = 65535;
        switch (str.hashCode()) {
            case -1448775240:
                if (str.equals("centerVertically")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.CENTER)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1349088399:
                if (str.equals(io.reactivex.annotations.SchedulerSupport.CUSTOM)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1221029593:
                if (str.equals("height")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -1068318794:
                if (str.equals("motion")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case -247669061:
                if (str.equals("hRtlBias")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case -61505906:
                if (str.equals("vWeight")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 98116417:
                if (str.equals("hBias")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 111045711:
                if (str.equals("vBias")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 398344448:
                if (str.equals("hWeight")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            case 1404070310:
                if (str.equals("centerHorizontally")) {
                    c = 22;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 23;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                java.lang.Object string = cLObject.getString(str);
                if (string.equals("parent")) {
                    string = androidx.constraintlayout.core.state.State.PARENT;
                }
                androidx.constraintlayout.core.state.ConstraintReference constraints2 = state.constraints(string);
                constraintReference.topToTop(constraints2);
                constraintReference.bottomToBottom(constraints2);
                break;
            case 1:
                java.lang.String string2 = cLObject.getString(str);
                if (string2.equals("parent")) {
                    constraints = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
                } else {
                    constraints = state.constraints(string2);
                }
                constraintReference.startToStart(constraints);
                constraintReference.endToEnd(constraints);
                constraintReference.topToTop(constraints);
                constraintReference.bottomToBottom(constraints);
                break;
            case 2:
                androidx.constraintlayout.core.parser.CLObject objectOrNull = cLObject.getObjectOrNull(str);
                if (objectOrNull != null && (names = objectOrNull.names()) != null) {
                    java.util.Iterator<java.lang.String> it = names.iterator();
                    while (it.hasNext()) {
                        java.lang.String next = it.next();
                        androidx.constraintlayout.core.parser.CLElement cLElement = objectOrNull.get(next);
                        if (cLElement instanceof androidx.constraintlayout.core.parser.CLNumber) {
                            constraintReference.addCustomFloat(next, cLElement.getFloat());
                        } else if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
                            long Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(cLElement.content());
                            if (Camera2StreamConfigurationMap != -1) {
                                constraintReference.addCustomColor(next, (int) Camera2StreamConfigurationMap);
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                constraintReference.rotationX(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 4:
                constraintReference.rotationY(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 5:
                constraintReference.rotationZ(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 6:
                constraintReference.translationX(state.getHighSpeedVideoFpsRanges.toPixels(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str))));
                break;
            case 7:
                constraintReference.translationY(state.getHighSpeedVideoFpsRanges.toPixels(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str))));
                break;
            case '\b':
                constraintReference.translationZ(state.getHighSpeedVideoFpsRanges.toPixels(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str))));
                break;
            case '\t':
                constraintReference.setHeight(Camera2StreamConfigurationMap(cLObject, str, state, state.getHighSpeedVideoFpsRanges));
                break;
            case '\n':
                androidx.constraintlayout.core.parser.CLElement cLElement2 = cLObject.get(str);
                if (cLElement2 instanceof androidx.constraintlayout.core.parser.CLObject) {
                    androidx.constraintlayout.core.parser.CLObject cLObject2 = (androidx.constraintlayout.core.parser.CLObject) cLElement2;
                    androidx.constraintlayout.core.motion.utils.TypedBundle typedBundle = new androidx.constraintlayout.core.motion.utils.TypedBundle();
                    java.util.ArrayList<java.lang.String> names2 = cLObject2.names();
                    if (names2 != null) {
                        java.util.Iterator<java.lang.String> it2 = names2.iterator();
                        while (it2.hasNext()) {
                            java.lang.String next2 = it2.next();
                            next2.hashCode();
                            switch (next2.hashCode()) {
                                case -1897525331:
                                    if (next2.equals("stagger")) {
                                        c2 = 0;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1310311125:
                                    if (next2.equals("easing")) {
                                        c2 = 1;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -1285003983:
                                    if (next2.equals("quantize")) {
                                        c2 = 2;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -791482387:
                                    if (next2.equals("pathArc")) {
                                        c2 = 3;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                case -236944793:
                                    if (next2.equals("relativeTo")) {
                                        c2 = 4;
                                        break;
                                    }
                                    c2 = 65535;
                                    break;
                                default:
                                    c2 = 65535;
                                    break;
                            }
                            if (c2 == 0) {
                                typedBundle.add(600, cLObject2.getFloat(next2));
                            } else if (c2 == 1) {
                                typedBundle.add(603, cLObject2.getString(next2));
                            } else if (c2 == 2) {
                                androidx.constraintlayout.core.parser.CLElement cLElement3 = cLObject2.get(next2);
                                if (cLElement3 instanceof androidx.constraintlayout.core.parser.CLArray) {
                                    androidx.constraintlayout.core.parser.CLArray cLArray = (androidx.constraintlayout.core.parser.CLArray) cLElement3;
                                    int size = cLArray.size();
                                    if (size > 0) {
                                        typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLArray.getInt(0));
                                        if (size > 1) {
                                            typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_INTERPOLATOR_TYPE, cLArray.getString(1));
                                            if (size > 2) {
                                                typedBundle.add(602, cLArray.getFloat(2));
                                            }
                                        }
                                    }
                                } else {
                                    typedBundle.add(androidx.constraintlayout.core.motion.utils.TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS, cLObject2.getInt(next2));
                                }
                            } else if (c2 == 3) {
                                java.lang.String string3 = cLObject2.getString(next2);
                                java.lang.String[] strArr = {"none", "startVertical", "startHorizontal", "flip", "below", "above"};
                                int i = 0;
                                while (true) {
                                    if (i >= 6) {
                                        i = -1;
                                    } else if (!strArr[i].equals(string3)) {
                                        i++;
                                    }
                                }
                                if (i == -1) {
                                    java.io.PrintStream printStream = java.lang.System.err;
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(cLObject2.getLine());
                                    sb.append(" pathArc = '");
                                    sb.append(string3);
                                    sb.append("'");
                                    printStream.println(sb.toString());
                                } else {
                                    typedBundle.add(607, i);
                                }
                            } else if (c2 == 4) {
                                typedBundle.add(605, cLObject2.getString(next2));
                            }
                        }
                        constraintReference.getOutputMinFrameDurationlomOqCM = typedBundle;
                        break;
                    }
                }
                break;
            case 11:
                constraintReference.pivotX(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case '\f':
                constraintReference.pivotY(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case '\r':
                constraintReference.scaleX(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 14:
                constraintReference.scaleY(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 15:
                float highResolutionOutputSizeshNQ4ISI = layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str));
                if (state.isRtl()) {
                    highResolutionOutputSizeshNQ4ISI = 1.0f - highResolutionOutputSizeshNQ4ISI;
                }
                constraintReference.horizontalBias(highResolutionOutputSizeshNQ4ISI);
                break;
            case 16:
                constraintReference.setVerticalChainWeight(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 17:
                constraintReference.alpha(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 18:
                constraintReference.horizontalBias(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 19:
                constraintReference.verticalBias(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 20:
                constraintReference.setWidth(Camera2StreamConfigurationMap(cLObject, str, state, state.getHighSpeedVideoFpsRanges));
                break;
            case 21:
                constraintReference.setHorizontalChainWeight(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(cLObject.get(str)));
                break;
            case 22:
                java.lang.Object string4 = cLObject.getString(str);
                if (string4.equals("parent")) {
                    string4 = androidx.constraintlayout.core.state.State.PARENT;
                }
                androidx.constraintlayout.core.state.ConstraintReference constraints3 = state.constraints(string4);
                constraintReference.startToStart(constraints3);
                constraintReference.endToEnd(constraints3);
                break;
            case 23:
                java.lang.String string5 = cLObject.getString(str);
                string5.hashCode();
                int hashCode = string5.hashCode();
                if (hashCode != -1901805651) {
                    if (hashCode != 3178655) {
                        if (hashCode == 466743410 && string5.equals("visible")) {
                            c3 = 2;
                        }
                    } else if (string5.equals("gone")) {
                        c3 = 1;
                    }
                } else if (string5.equals("invisible")) {
                    c3 = 0;
                }
                if (c3 == 0) {
                    constraintReference.visibility(4);
                    constraintReference.alpha(0.0f);
                    break;
                } else if (c3 == 1) {
                    constraintReference.visibility(8);
                    break;
                } else if (c3 == 2) {
                    constraintReference.visibility(0);
                    break;
                }
                break;
            default:
                Camera2StreamConfigurationMap(state, layoutVariables, cLObject, constraintReference, str);
                break;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0168  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void Camera2StreamConfigurationMap(androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.ConstraintSetParser.LayoutVariables layoutVariables, androidx.constraintlayout.core.parser.CLObject cLObject, androidx.constraintlayout.core.state.ConstraintReference constraintReference, java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.state.ConstraintReference constraints;
        char c;
        androidx.constraintlayout.core.state.ConstraintReference constraints2;
        char c2;
        boolean z;
        boolean z2;
        char c3;
        char c4;
        char c5;
        char c6;
        boolean isRtl = state.isRtl();
        boolean z3 = !isRtl;
        androidx.constraintlayout.core.parser.CLArray arrayOrNull = cLObject.getArrayOrNull(str);
        if (arrayOrNull != null && arrayOrNull.size() > 1) {
            java.lang.String string = arrayOrNull.getString(0);
            java.lang.String stringOrNull = arrayOrNull.getStringOrNull(1);
            float pixels = arrayOrNull.size() > 2 ? state.getHighSpeedVideoFpsRanges.toPixels(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(arrayOrNull.getOrNull(2))) : 0.0f;
            float pixels2 = arrayOrNull.size() > 3 ? state.getHighSpeedVideoFpsRanges.toPixels(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(arrayOrNull.getOrNull(3))) : 0.0f;
            if (string.equals("parent")) {
                constraints2 = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
            } else {
                constraints2 = state.constraints(string);
            }
            str.hashCode();
            float f = pixels2;
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1383228885:
                    if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 115029:
                    if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3317767:
                    if (str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 108511772:
                    if (str.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (str.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    stringOrNull.hashCode();
                    int hashCode = stringOrNull.hashCode();
                    if (hashCode == -1720785339) {
                        if (stringOrNull.equals("baseline")) {
                            c3 = 0;
                            if (c3 != 0) {
                            }
                            z = true;
                            z2 = false;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        z = true;
                        z2 = false;
                    } else if (hashCode != -1383228885) {
                        if (hashCode == 115029 && stringOrNull.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                            c3 = 2;
                            if (c3 != 0) {
                                state.baselineNeededFor(constraintReference.getKey());
                                state.baselineNeededFor(constraints2.getKey());
                                constraintReference.baselineToBaseline(constraints2);
                            } else if (c3 == 1) {
                                state.baselineNeededFor(constraintReference.getKey());
                                constraintReference.baselineToBottom(constraints2);
                            } else if (c3 == 2) {
                                state.baselineNeededFor(constraintReference.getKey());
                                constraintReference.baselineToTop(constraints2);
                            }
                            z = true;
                            z2 = false;
                            break;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        z = true;
                        z2 = false;
                    } else {
                        if (stringOrNull.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                            c3 = 1;
                            if (c3 != 0) {
                            }
                            z = true;
                            z2 = false;
                        }
                        c3 = 65535;
                        if (c3 != 0) {
                        }
                        z = true;
                        z2 = false;
                    }
                    break;
                case 1:
                    constraintReference.circularConstraint(constraints2, layoutVariables.getHighResolutionOutputSizeshNQ4ISI(arrayOrNull.get(1)), arrayOrNull.size() > 2 ? state.getHighSpeedVideoFpsRanges.toPixels(layoutVariables.getHighResolutionOutputSizeshNQ4ISI(arrayOrNull.getOrNull(2))) : 0.0f);
                    z = true;
                    z2 = false;
                    break;
                case 2:
                    stringOrNull.hashCode();
                    int hashCode2 = stringOrNull.hashCode();
                    if (hashCode2 == -1720785339) {
                        if (stringOrNull.equals("baseline")) {
                            c4 = 0;
                            if (c4 != 0) {
                            }
                            z = true;
                            z2 = false;
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        z = true;
                        z2 = false;
                    } else if (hashCode2 != -1383228885) {
                        if (hashCode2 == 115029 && stringOrNull.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                            c4 = 2;
                            if (c4 != 0) {
                                state.baselineNeededFor(constraints2.getKey());
                                constraintReference.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.BOTTOM_TO_BASELINE;
                                constraintReference.getHighResolutionOutputSizeshNQ4ISI = constraints2;
                            } else if (c4 == 1) {
                                constraintReference.bottomToBottom(constraints2);
                            } else if (c4 == 2) {
                                constraintReference.bottomToTop(constraints2);
                            }
                            z = true;
                            z2 = false;
                            break;
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        z = true;
                        z2 = false;
                    } else {
                        if (stringOrNull.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                            c4 = 1;
                            if (c4 != 0) {
                            }
                            z = true;
                            z2 = false;
                        }
                        c4 = 65535;
                        if (c4 != 0) {
                        }
                        z = true;
                        z2 = false;
                    }
                    break;
                case 3:
                    z = isRtl;
                    z2 = true;
                    break;
                case 4:
                    stringOrNull.hashCode();
                    int hashCode3 = stringOrNull.hashCode();
                    if (hashCode3 == -1720785339) {
                        if (stringOrNull.equals("baseline")) {
                            c5 = 0;
                            if (c5 != 0) {
                            }
                            z = true;
                            z2 = false;
                        }
                        c5 = 65535;
                        if (c5 != 0) {
                        }
                        z = true;
                        z2 = false;
                    } else if (hashCode3 != -1383228885) {
                        if (hashCode3 == 115029 && stringOrNull.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                            c5 = 2;
                            if (c5 != 0) {
                                state.baselineNeededFor(constraints2.getKey());
                                constraintReference.getOutputSizes = androidx.constraintlayout.core.state.State.Constraint.TOP_TO_BASELINE;
                                constraintReference.accessartificialFrame = constraints2;
                            } else if (c5 == 1) {
                                constraintReference.topToBottom(constraints2);
                            } else if (c5 == 2) {
                                constraintReference.topToTop(constraints2);
                            }
                            z = true;
                            z2 = false;
                            break;
                        }
                        c5 = 65535;
                        if (c5 != 0) {
                        }
                        z = true;
                        z2 = false;
                    } else {
                        if (stringOrNull.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                            c5 = 1;
                            if (c5 != 0) {
                            }
                            z = true;
                            z2 = false;
                        }
                        c5 = 65535;
                        if (c5 != 0) {
                        }
                        z = true;
                        z2 = false;
                    }
                    break;
                case 5:
                    z = true;
                    z2 = true;
                    break;
                case 6:
                    z = false;
                    z2 = true;
                    break;
                case 7:
                    z = z3;
                    z2 = true;
                    break;
                default:
                    z = true;
                    z2 = false;
                    break;
            }
            if (z2) {
                stringOrNull.hashCode();
                switch (stringOrNull.hashCode()) {
                    case 100571:
                        if (stringOrNull.equals("end")) {
                            c6 = 0;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 3317767:
                        if (stringOrNull.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_LEFT)) {
                            c6 = 1;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 108511772:
                        if (stringOrNull.equals(com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_RIGHT)) {
                            c6 = 2;
                            break;
                        }
                        c6 = 65535;
                        break;
                    case 109757538:
                        if (stringOrNull.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                            c6 = 3;
                            break;
                        }
                        c6 = 65535;
                        break;
                    default:
                        c6 = 65535;
                        break;
                }
                boolean z4 = c6 != 0 ? c6 != 2 ? c6 != 3 ? true : z3 : false : isRtl;
                if (z) {
                    if (z4) {
                        constraintReference.leftToLeft(constraints2);
                    } else {
                        constraintReference.leftToRight(constraints2);
                    }
                } else if (z4) {
                    constraintReference.rightToLeft(constraints2);
                } else {
                    constraintReference.rightToRight(constraints2);
                }
            }
            constraintReference.margin(java.lang.Float.valueOf(pixels)).marginGone(java.lang.Float.valueOf(f));
            return;
        }
        java.lang.String stringOrNull2 = cLObject.getStringOrNull(str);
        if (stringOrNull2 != null) {
            if (stringOrNull2.equals("parent")) {
                constraints = state.constraints(androidx.constraintlayout.core.state.State.PARENT);
            } else {
                constraints = state.constraints(stringOrNull2);
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1383228885:
                    if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.BOTTOM)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals(com.dyneti.android.dyscan.DyScanHelperTextPosition.TOP)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109757538:
                    if (str.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            if (c == 0) {
                state.baselineNeededFor(constraintReference.getKey());
                state.baselineNeededFor(constraints.getKey());
                constraintReference.baselineToBaseline(constraints);
                return;
            }
            if (c == 1) {
                constraintReference.bottomToBottom(constraints);
                return;
            }
            if (c == 2) {
                if (!isRtl) {
                    constraintReference.rightToRight(constraints);
                    return;
                } else {
                    constraintReference.leftToLeft(constraints);
                    return;
                }
            }
            if (c == 3) {
                constraintReference.topToTop(constraints);
            } else {
                if (c != 4) {
                    return;
                }
                if (!isRtl) {
                    constraintReference.leftToLeft(constraints);
                } else {
                    constraintReference.rightToRight(constraints);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static androidx.constraintlayout.core.state.Dimension getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        char c;
        androidx.constraintlayout.core.state.Dimension createFixed = androidx.constraintlayout.core.state.Dimension.createFixed(0);
        str.hashCode();
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return androidx.constraintlayout.core.state.Dimension.createSuggested(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
        }
        if (c == 1) {
            return androidx.constraintlayout.core.state.Dimension.createParent();
        }
        if (c == 2) {
            return androidx.constraintlayout.core.state.Dimension.createSuggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION);
        }
        if (c == 3) {
            return androidx.constraintlayout.core.state.Dimension.createWrap();
        }
        if (str.endsWith("%")) {
            return androidx.constraintlayout.core.state.Dimension.createPercent(0, java.lang.Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f).suggested(0);
        }
        return str.contains(io.ktor.sse.ServerSentEventKt.COLON) ? androidx.constraintlayout.core.state.Dimension.createRatio(str).suggested(androidx.constraintlayout.core.state.Dimension.SPREAD_DIMENSION) : createFixed;
    }

    private static androidx.constraintlayout.core.state.Dimension Camera2StreamConfigurationMap(androidx.constraintlayout.core.parser.CLObject cLObject, java.lang.String str, androidx.constraintlayout.core.state.State state, androidx.constraintlayout.core.state.CorePixelDp corePixelDp) throws androidx.constraintlayout.core.parser.CLParsingException {
        androidx.constraintlayout.core.parser.CLElement cLElement = cLObject.get(str);
        androidx.constraintlayout.core.state.Dimension createFixed = androidx.constraintlayout.core.state.Dimension.createFixed(0);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
            return getHighSpeedVideoFpsRangesFor(cLElement.content());
        }
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLNumber) {
            return androidx.constraintlayout.core.state.Dimension.createFixed(state.convertDimension(java.lang.Float.valueOf(corePixelDp.toPixels(cLObject.getFloat(str)))));
        }
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
            androidx.constraintlayout.core.parser.CLObject cLObject2 = (androidx.constraintlayout.core.parser.CLObject) cLElement;
            java.lang.String stringOrNull = cLObject2.getStringOrNull(com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
            if (stringOrNull != null) {
                createFixed = getHighSpeedVideoFpsRangesFor(stringOrNull);
            }
            androidx.constraintlayout.core.parser.CLElement orNull = cLObject2.getOrNull(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY);
            if (orNull != null) {
                if (orNull instanceof androidx.constraintlayout.core.parser.CLNumber) {
                    createFixed.min(state.convertDimension(java.lang.Float.valueOf(corePixelDp.toPixels(((androidx.constraintlayout.core.parser.CLNumber) orNull).getFloat()))));
                } else if (orNull instanceof androidx.constraintlayout.core.parser.CLString) {
                    createFixed.min(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
            }
            androidx.constraintlayout.core.parser.CLElement orNull2 = cLObject2.getOrNull(com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY);
            if (orNull2 != null) {
                if (orNull2 instanceof androidx.constraintlayout.core.parser.CLNumber) {
                    createFixed.max(state.convertDimension(java.lang.Float.valueOf(corePixelDp.toPixels(((androidx.constraintlayout.core.parser.CLNumber) orNull2).getFloat()))));
                    return createFixed;
                }
                if (orNull2 instanceof androidx.constraintlayout.core.parser.CLString) {
                    createFixed.max(androidx.constraintlayout.core.state.Dimension.WRAP_DIMENSION);
                }
            }
        }
        return createFixed;
    }

    static long Camera2StreamConfigurationMap(java.lang.String str) {
        if (!str.startsWith("#")) {
            return -1L;
        }
        java.lang.String substring = str.substring(1);
        if (substring.length() == 6) {
            substring = "FF".concat(java.lang.String.valueOf(substring));
        }
        return java.lang.Long.parseLong(substring, 16);
    }
}
