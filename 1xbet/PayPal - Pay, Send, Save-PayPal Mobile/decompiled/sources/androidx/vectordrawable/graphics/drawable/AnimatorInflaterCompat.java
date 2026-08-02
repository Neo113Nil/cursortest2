package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes7.dex */
public class AnimatorInflaterCompat {
    private static boolean getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i >= 28 && i <= 31;
    }

    public static android.animation.Animator loadAnimator(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        return android.animation.AnimatorInflater.loadAnimator(context, i);
    }

    public static android.animation.Animator loadAnimator(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, int i) throws android.content.res.Resources.NotFoundException {
        return loadAnimator(context, resources, theme, i, 1.0f);
    }

    public static android.animation.Animator loadAnimator(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, int i, float f) throws android.content.res.Resources.NotFoundException {
        android.content.res.XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = resources.getAnimation(i);
                    return getHighSpeedVideoFpsRangesFor(context, resources, theme, xmlResourceParser, f);
                } catch (org.xmlpull.v1.XmlPullParserException e) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't load animation resource ID #0x");
                    sb.append(java.lang.Integer.toHexString(i));
                    android.content.res.Resources.NotFoundException notFoundException = new android.content.res.Resources.NotFoundException(sb.toString());
                    notFoundException.initCause(e);
                    throw notFoundException;
                }
            } catch (java.io.IOException e2) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't load animation resource ID #0x");
                sb2.append(java.lang.Integer.toHexString(i));
                android.content.res.Resources.NotFoundException notFoundException2 = new android.content.res.Resources.NotFoundException(sb2.toString());
                notFoundException2.initCause(e2);
                throw notFoundException2;
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }

    static class PathDataEvaluator implements android.animation.TypeEvaluator<androidx.core.graphics.PathParser.PathDataNode[]> {
        private androidx.core.graphics.PathParser.PathDataNode[] Camera2StreamConfigurationMap;

        PathDataEvaluator() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
        public androidx.core.graphics.PathParser.PathDataNode[] evaluate(float f, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr, androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr2) {
            if (!androidx.core.graphics.PathParser.canMorph(pathDataNodeArr, pathDataNodeArr2)) {
                throw new java.lang.IllegalArgumentException("Can't interpolate between two incompatible pathData");
            }
            if (!androidx.core.graphics.PathParser.canMorph(this.Camera2StreamConfigurationMap, pathDataNodeArr)) {
                this.Camera2StreamConfigurationMap = androidx.core.graphics.PathParser.deepCopyNodes(pathDataNodeArr);
            }
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                this.Camera2StreamConfigurationMap[i].interpolatePathDataNode(pathDataNodeArr[i], pathDataNodeArr2[i], f);
            }
            return this.Camera2StreamConfigurationMap;
        }
    }

    private static android.animation.PropertyValuesHolder getHighResolutionOutputSizeshNQ4ISI(android.content.res.TypedArray typedArray, int i, int i2, int i3, java.lang.String str) {
        int i4;
        int i5;
        int i6;
        float f;
        android.animation.PropertyValuesHolder ofFloat;
        float f2;
        float f3;
        android.util.TypedValue peekValue = typedArray.peekValue(i2);
        boolean z = peekValue != null;
        int i7 = z ? peekValue.type : 0;
        android.util.TypedValue peekValue2 = typedArray.peekValue(i3);
        boolean z2 = peekValue2 != null;
        int i8 = z2 ? peekValue2.type : 0;
        if (i == 4) {
            i = ((z && getHighResolutionOutputSizeshNQ4ISI(i7)) || (z2 && getHighResolutionOutputSizeshNQ4ISI(i8))) ? 3 : 0;
        }
        boolean z3 = i == 0;
        android.animation.PropertyValuesHolder propertyValuesHolder = null;
        if (i == 2) {
            java.lang.String string = typedArray.getString(i2);
            java.lang.String string2 = typedArray.getString(i3);
            androidx.core.graphics.PathParser.PathDataNode[] createNodesFromPathData = androidx.core.graphics.PathParser.createNodesFromPathData(string);
            androidx.core.graphics.PathParser.PathDataNode[] createNodesFromPathData2 = androidx.core.graphics.PathParser.createNodesFromPathData(string2);
            if (createNodesFromPathData != null || createNodesFromPathData2 != null) {
                if (createNodesFromPathData != null) {
                    androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.PathDataEvaluator pathDataEvaluator = new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.PathDataEvaluator();
                    if (createNodesFromPathData2 != null) {
                        if (!androidx.core.graphics.PathParser.canMorph(createNodesFromPathData, createNodesFromPathData2)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(" Can't morph from ");
                            sb.append(string);
                            sb.append(" to ");
                            sb.append(string2);
                            throw new android.view.InflateException(sb.toString());
                        }
                        return android.animation.PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData, createNodesFromPathData2);
                    }
                    return android.animation.PropertyValuesHolder.ofObject(str, pathDataEvaluator, createNodesFromPathData);
                }
                if (createNodesFromPathData2 != null) {
                    return android.animation.PropertyValuesHolder.ofObject(str, new androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.PathDataEvaluator(), createNodesFromPathData2);
                }
            }
            return null;
        }
        androidx.vectordrawable.graphics.drawable.ArgbEvaluator argbEvaluator = i == 3 ? androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance() : null;
        if (z3) {
            if (z) {
                if (i7 == 5) {
                    f2 = typedArray.getDimension(i2, 0.0f);
                } else {
                    f2 = typedArray.getFloat(i2, 0.0f);
                }
                if (z2) {
                    if (i8 == 5) {
                        f3 = typedArray.getDimension(i3, 0.0f);
                    } else {
                        f3 = typedArray.getFloat(i3, 0.0f);
                    }
                    ofFloat = android.animation.PropertyValuesHolder.ofFloat(str, f2, f3);
                } else {
                    ofFloat = android.animation.PropertyValuesHolder.ofFloat(str, f2);
                }
            } else {
                if (i8 == 5) {
                    f = typedArray.getDimension(i3, 0.0f);
                } else {
                    f = typedArray.getFloat(i3, 0.0f);
                }
                ofFloat = android.animation.PropertyValuesHolder.ofFloat(str, f);
            }
            propertyValuesHolder = ofFloat;
        } else if (z) {
            if (i7 == 5) {
                i5 = (int) typedArray.getDimension(i2, 0.0f);
            } else if (getHighResolutionOutputSizeshNQ4ISI(i7)) {
                i5 = typedArray.getColor(i2, 0);
            } else {
                i5 = typedArray.getInt(i2, 0);
            }
            if (z2) {
                if (i8 == 5) {
                    i6 = (int) typedArray.getDimension(i3, 0.0f);
                } else if (getHighResolutionOutputSizeshNQ4ISI(i8)) {
                    i6 = typedArray.getColor(i3, 0);
                } else {
                    i6 = typedArray.getInt(i3, 0);
                }
                propertyValuesHolder = android.animation.PropertyValuesHolder.ofInt(str, i5, i6);
            } else {
                propertyValuesHolder = android.animation.PropertyValuesHolder.ofInt(str, i5);
            }
        } else if (z2) {
            if (i8 == 5) {
                i4 = (int) typedArray.getDimension(i3, 0.0f);
            } else if (getHighResolutionOutputSizeshNQ4ISI(i8)) {
                i4 = typedArray.getColor(i3, 0);
            } else {
                i4 = typedArray.getInt(i3, 0);
            }
            propertyValuesHolder = android.animation.PropertyValuesHolder.ofInt(str, i4);
        }
        if (propertyValuesHolder != null && argbEvaluator != null) {
            propertyValuesHolder.setEvaluator(argbEvaluator);
        }
        return propertyValuesHolder;
    }

    private static void getHighSpeedVideoSizes(android.animation.ValueAnimator valueAnimator, android.content.res.TypedArray typedArray, android.content.res.TypedArray typedArray2, float f, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        long namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "duration", 1, 300);
        long namedInt2 = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "startOffset", 2, 0);
        int namedInt3 = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "valueType", 7, 4);
        if (androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "valueFrom") && androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "valueTo")) {
            if (namedInt3 == 4) {
                namedInt3 = Camera2StreamConfigurationMap(typedArray, 5, 6);
            }
            android.animation.PropertyValuesHolder highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(typedArray, namedInt3, 5, 6, "");
            if (highResolutionOutputSizeshNQ4ISI != null) {
                valueAnimator.setValues(highResolutionOutputSizeshNQ4ISI);
            }
        }
        valueAnimator.setDuration(namedInt);
        valueAnimator.setStartDelay(namedInt2);
        valueAnimator.setRepeatCount(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatCount", 3, 0));
        valueAnimator.setRepeatMode(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "repeatMode", 4, 1));
        if (typedArray2 != null) {
            getHighSpeedVideoFpsRanges(valueAnimator, typedArray2, namedInt3, f, xmlPullParser);
        }
    }

    private static void getHighSpeedVideoFpsRanges(android.animation.ValueAnimator valueAnimator, android.content.res.TypedArray typedArray, int i, float f, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) valueAnimator;
        java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "pathData", 1);
        if (namedString != null) {
            java.lang.String namedString2 = androidx.core.content.res.TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyXName", 2);
            java.lang.String namedString3 = androidx.core.content.res.TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyYName", 3);
            if (namedString2 == null && namedString3 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(typedArray.getPositionDescription());
                sb.append(" propertyXName or propertyYName is needed for PathData");
                throw new android.view.InflateException(sb.toString());
            }
            Camera2StreamConfigurationMap(androidx.core.graphics.PathParser.createPathFromPathData(namedString), objectAnimator, f * 0.5f, namedString2, namedString3);
            return;
        }
        objectAnimator.setPropertyName(androidx.core.content.res.TypedArrayUtils.getNamedString(typedArray, xmlPullParser, "propertyName", 0));
    }

    private static void Camera2StreamConfigurationMap(android.graphics.Path path, android.animation.ObjectAnimator objectAnimator, float f, java.lang.String str, java.lang.String str2) {
        char c = 0;
        android.graphics.PathMeasure pathMeasure = new android.graphics.PathMeasure(path, false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        float f2 = 0.0f;
        arrayList.add(java.lang.Float.valueOf(0.0f));
        float f3 = 0.0f;
        do {
            f3 += pathMeasure.getLength();
            arrayList.add(java.lang.Float.valueOf(f3));
        } while (pathMeasure.nextContour());
        android.graphics.PathMeasure pathMeasure2 = new android.graphics.PathMeasure(path, false);
        int min = java.lang.Math.min(100, ((int) (f3 / f)) + 1);
        float[] fArr = new float[min];
        float[] fArr2 = new float[min];
        float[] fArr3 = new float[2];
        float f4 = f3 / (min - 1);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= min) {
                break;
            }
            pathMeasure2.getPosTan(f2 - ((java.lang.Float) arrayList.get(i)).floatValue(), fArr3, null);
            fArr[i2] = fArr3[c];
            fArr2[i2] = fArr3[1];
            f2 += f4;
            int i3 = i + 1;
            if (i3 < arrayList.size() && f2 > ((java.lang.Float) arrayList.get(i3)).floatValue()) {
                pathMeasure2.nextContour();
                i = i3;
            }
            i2++;
            c = 0;
        }
        android.animation.PropertyValuesHolder ofFloat = str != null ? android.animation.PropertyValuesHolder.ofFloat(str, fArr) : null;
        android.animation.PropertyValuesHolder ofFloat2 = str2 != null ? android.animation.PropertyValuesHolder.ofFloat(str2, fArr2) : null;
        if (ofFloat == null) {
            objectAnimator.setValues(ofFloat2);
        } else if (ofFloat2 == null) {
            objectAnimator.setValues(ofFloat);
        } else {
            objectAnimator.setValues(ofFloat, ofFloat2);
        }
    }

    private static android.animation.Animator getHighSpeedVideoFpsRangesFor(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, float f) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        return getHighResolutionOutputSizeshNQ4ISI(context, resources, theme, xmlPullParser, android.util.Xml.asAttributeSet(xmlPullParser), null, 0, f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f4, code lost:
    
        if (r2.hasNext() == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x00f6, code lost:
    
        r1[r14] = (android.animation.Animator) r2.next();
        r14 = r14 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0100, code lost:
    
        if (r24 != 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0102, code lost:
    
        r23.playTogether(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0105, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0106, code lost:
    
        r23.playSequentially(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0109, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x00e2, code lost:
    
        if (r23 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x00e4, code lost:
    
        if (r13 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00e6, code lost:
    
        r1 = new android.animation.Animator[r13.size()];
        r2 = r13.iterator();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static android.animation.Animator getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.animation.AnimatorSet animatorSet, int i, float f) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth();
        android.animation.ValueAnimator valueAnimator = null;
        java.util.ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            boolean z = true;
            int i2 = 0;
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    java.lang.String name2 = xmlPullParser.getName();
                    if (name2.equals("objectAnimator")) {
                        valueAnimator = getHighResolutionOutputSizeshNQ4ISI(context, resources, theme, attributeSet, f, xmlPullParser);
                    } else if (name2.equals("animator")) {
                        valueAnimator = Camera2StreamConfigurationMap(context, resources, theme, attributeSet, null, f, xmlPullParser);
                    } else {
                        if (name2.equals("set")) {
                            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
                            android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getHighSpeedVideoFpsRanges);
                            getHighResolutionOutputSizeshNQ4ISI(context, resources, theme, xmlPullParser, attributeSet, animatorSet2, androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "ordering", 0, 0), f);
                            obtainAttributes.recycle();
                            z = false;
                            valueAnimator = animatorSet2;
                        } else if (name2.equals("propertyValuesHolder")) {
                            android.animation.PropertyValuesHolder[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, resources, theme, xmlPullParser, android.util.Xml.asAttributeSet(xmlPullParser));
                            if (highSpeedVideoFpsRanges != null && (valueAnimator instanceof android.animation.ValueAnimator)) {
                                valueAnimator.setValues(highSpeedVideoFpsRanges);
                            }
                        } else {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown animator name: ");
                            sb.append(xmlPullParser.getName());
                            throw new java.lang.RuntimeException(sb.toString());
                        }
                        if (animatorSet != null && !z) {
                            if (arrayList == null) {
                                arrayList = new java.util.ArrayList();
                            }
                            arrayList.add(valueAnimator);
                        }
                    }
                    z = false;
                    if (animatorSet != null) {
                        if (arrayList == null) {
                        }
                        arrayList.add(valueAnimator);
                    }
                }
            }
        }
    }

    private static android.animation.PropertyValuesHolder[] getHighSpeedVideoFpsRanges(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int i;
        java.util.ArrayList arrayList = null;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            if (eventType == 3 || eventType == 1) {
                break;
            }
            if (eventType != 2) {
                xmlPullParser.next();
            } else {
                if (xmlPullParser.getName().equals("propertyValuesHolder")) {
                    android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getOutputFormats);
                    java.lang.String namedString = androidx.core.content.res.TypedArrayUtils.getNamedString(obtainAttributes, xmlPullParser, "propertyName", 3);
                    int namedInt = androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, "valueType", 2, 4);
                    android.animation.PropertyValuesHolder highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(context, resources, theme, xmlPullParser, namedString, namedInt);
                    if (highSpeedVideoFpsRanges == null) {
                        highSpeedVideoFpsRanges = getHighResolutionOutputSizeshNQ4ISI(obtainAttributes, namedInt, 0, 1, namedString);
                    }
                    if (highSpeedVideoFpsRanges != null) {
                        if (arrayList == null) {
                            arrayList = new java.util.ArrayList();
                        }
                        arrayList.add(highSpeedVideoFpsRanges);
                    }
                    obtainAttributes.recycle();
                }
                xmlPullParser.next();
            }
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        android.animation.PropertyValuesHolder[] propertyValuesHolderArr = new android.animation.PropertyValuesHolder[size];
        for (i = 0; i < size; i++) {
            propertyValuesHolderArr[i] = (android.animation.PropertyValuesHolder) arrayList.get(i);
        }
        return propertyValuesHolderArr;
    }

    private static int getHighSpeedVideoSizes(android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, org.xmlpull.v1.XmlPullParser xmlPullParser) {
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getHighSpeedVideoFpsRangesFor);
        int i = 0;
        android.util.TypedValue peekNamedValue = androidx.core.content.res.TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, 0);
        if (peekNamedValue != null && getHighResolutionOutputSizeshNQ4ISI(peekNamedValue.type)) {
            i = 3;
        }
        obtainAttributes.recycle();
        return i;
    }

    private static int Camera2StreamConfigurationMap(android.content.res.TypedArray typedArray, int i, int i2) {
        android.util.TypedValue peekValue = typedArray.peekValue(i);
        boolean z = peekValue != null;
        int i3 = z ? peekValue.type : 0;
        android.util.TypedValue peekValue2 = typedArray.peekValue(i2);
        boolean z2 = peekValue2 != null;
        int i4 = z2 ? peekValue2.type : 0;
        if (z && getHighResolutionOutputSizeshNQ4ISI(i3)) {
            return 3;
        }
        return (z2 && getHighResolutionOutputSizeshNQ4ISI(i4)) ? 3 : 0;
    }

    private static android.animation.PropertyValuesHolder getHighSpeedVideoFpsRanges(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.String str, int i) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int size;
        java.util.ArrayList arrayList = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 3 || next == 1) {
                break;
            }
            if (xmlPullParser.getName().equals("keyframe")) {
                if (i == 4) {
                    i = getHighSpeedVideoSizes(resources, theme, android.util.Xml.asAttributeSet(xmlPullParser), xmlPullParser);
                }
                android.animation.Keyframe Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(context, resources, theme, android.util.Xml.asAttributeSet(xmlPullParser), i, xmlPullParser);
                if (Camera2StreamConfigurationMap != null) {
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList();
                    }
                    arrayList.add(Camera2StreamConfigurationMap);
                }
                xmlPullParser.next();
            }
        }
        if (arrayList == null || (size = arrayList.size()) <= 0) {
            return null;
        }
        android.animation.Keyframe keyframe = (android.animation.Keyframe) arrayList.get(0);
        android.animation.Keyframe keyframe2 = (android.animation.Keyframe) arrayList.get(size - 1);
        float fraction = keyframe2.getFraction();
        if (fraction < 1.0f) {
            if (fraction < 0.0f) {
                keyframe2.setFraction(1.0f);
            } else {
                arrayList.add(arrayList.size(), getHighSpeedVideoFpsRangesFor(keyframe2, 1.0f));
                size++;
            }
        }
        float fraction2 = keyframe.getFraction();
        if (fraction2 != 0.0f) {
            if (fraction2 < 0.0f) {
                keyframe.setFraction(0.0f);
            } else {
                arrayList.add(0, getHighSpeedVideoFpsRangesFor(keyframe, 0.0f));
                size++;
            }
        }
        android.animation.Keyframe[] keyframeArr = new android.animation.Keyframe[size];
        arrayList.toArray(keyframeArr);
        for (int i2 = 0; i2 < size; i2++) {
            android.animation.Keyframe keyframe3 = keyframeArr[i2];
            if (keyframe3.getFraction() < 0.0f) {
                if (i2 == 0) {
                    keyframe3.setFraction(0.0f);
                } else {
                    int i3 = size - 1;
                    if (i2 == i3) {
                        keyframe3.setFraction(1.0f);
                    } else {
                        int i4 = i2;
                        for (int i5 = i2 + 1; i5 < i3 && keyframeArr[i5].getFraction() < 0.0f; i5++) {
                            i4 = i5;
                        }
                        getHighSpeedVideoFpsRanges(keyframeArr, keyframeArr[i4 + 1].getFraction() - keyframeArr[i2 - 1].getFraction(), i2, i4);
                    }
                }
            }
        }
        android.animation.PropertyValuesHolder ofKeyframe = android.animation.PropertyValuesHolder.ofKeyframe(str, keyframeArr);
        if (i == 3) {
            ofKeyframe.setEvaluator(androidx.vectordrawable.graphics.drawable.ArgbEvaluator.getInstance());
        }
        return ofKeyframe;
    }

    private static android.animation.Keyframe getHighSpeedVideoFpsRangesFor(android.animation.Keyframe keyframe, float f) {
        if (keyframe.getType() == java.lang.Float.TYPE) {
            return android.animation.Keyframe.ofFloat(f);
        }
        if (keyframe.getType() == java.lang.Integer.TYPE) {
            return android.animation.Keyframe.ofInt(f);
        }
        return android.animation.Keyframe.ofObject(f);
    }

    private static void getHighSpeedVideoFpsRanges(android.animation.Keyframe[] keyframeArr, float f, int i, int i2) {
        float f2 = f / ((i2 - i) + 2);
        while (i <= i2) {
            keyframeArr[i].setFraction(keyframeArr[i - 1].getFraction() + f2);
            i++;
        }
    }

    private static android.animation.Keyframe Camera2StreamConfigurationMap(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, int i, org.xmlpull.v1.XmlPullParser xmlPullParser) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.animation.Keyframe ofInt;
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getHighSpeedVideoFpsRangesFor);
        float namedFloat = androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, "fraction", 3, -1.0f);
        android.util.TypedValue peekNamedValue = androidx.core.content.res.TypedArrayUtils.peekNamedValue(obtainAttributes, xmlPullParser, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, 0);
        boolean z = peekNamedValue != null;
        if (i == 4) {
            i = (z && getHighResolutionOutputSizeshNQ4ISI(peekNamedValue.type)) ? 3 : 0;
        }
        if (z) {
            if (i == 0) {
                ofInt = android.animation.Keyframe.ofFloat(namedFloat, androidx.core.content.res.TypedArrayUtils.getNamedFloat(obtainAttributes, xmlPullParser, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, 0, 0.0f));
            } else {
                ofInt = (i == 1 || i == 3) ? android.animation.Keyframe.ofInt(namedFloat, androidx.core.content.res.TypedArrayUtils.getNamedInt(obtainAttributes, xmlPullParser, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, 0, 0)) : null;
            }
        } else if (i == 0) {
            ofInt = android.animation.Keyframe.ofFloat(namedFloat);
        } else {
            ofInt = android.animation.Keyframe.ofInt(namedFloat);
        }
        int namedResourceId = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 1, 0);
        if (namedResourceId > 0) {
            ofInt.setInterpolator(androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        return ofInt;
    }

    private static android.animation.ObjectAnimator getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, float f, org.xmlpull.v1.XmlPullParser xmlPullParser) throws android.content.res.Resources.NotFoundException {
        android.animation.ObjectAnimator objectAnimator = new android.animation.ObjectAnimator();
        Camera2StreamConfigurationMap(context, resources, theme, attributeSet, objectAnimator, f, xmlPullParser);
        return objectAnimator;
    }

    private static android.animation.ValueAnimator Camera2StreamConfigurationMap(android.content.Context context, android.content.res.Resources resources, android.content.res.Resources.Theme theme, android.util.AttributeSet attributeSet, android.animation.ValueAnimator valueAnimator, float f, org.xmlpull.v1.XmlPullParser xmlPullParser) throws android.content.res.Resources.NotFoundException {
        android.content.res.TypedArray obtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getHighResolutionOutputSizeshNQ4ISI);
        android.content.res.TypedArray obtainAttributes2 = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.getHighSpeedVideoSizesFor);
        if (valueAnimator == null) {
            valueAnimator = new android.animation.ValueAnimator();
        }
        getHighSpeedVideoSizes(valueAnimator, obtainAttributes, obtainAttributes2, f, xmlPullParser);
        int namedResourceId = androidx.core.content.res.TypedArrayUtils.getNamedResourceId(obtainAttributes, xmlPullParser, "interpolator", 0, 0);
        if (namedResourceId > 0) {
            valueAnimator.setInterpolator(androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat.loadInterpolator(context, namedResourceId));
        }
        obtainAttributes.recycle();
        if (obtainAttributes2 != null) {
            obtainAttributes2.recycle();
        }
        return valueAnimator;
    }

    private AnimatorInflaterCompat() {
    }
}
