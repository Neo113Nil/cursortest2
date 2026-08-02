package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public class TextLayer extends com.airbnb.lottie.model.layer.BaseLayer {
    private final java.util.List<com.airbnb.lottie.model.layer.TextLayer.TextSubLine> AMEXKernel;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> AMEXKernela;
    private final java.lang.StringBuilder ArtificialStackFrames;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> CoroutineDebuggingKt;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> _BOUNDARY;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> f2827a;
    private final android.graphics.Paint accessartificialFrame;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> b;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> c;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> coroutineBoundary;
    private final java.lang.StringBuilder coroutineCreation;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> d;
    private final com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation getARTIFICIAL_FRAME_PACKAGE_NAME;
    private final java.util.List<java.lang.String> getInputSizeshNQ4ISI;
    private final androidx.collection.LongSparseArray<java.lang.String> getOutputFormats;
    private final java.lang.StringBuilder getOutputMinFrameDuration;
    private final java.util.Map<com.airbnb.lottie.model.FontCharacter, java.util.List<com.airbnb.lottie.animation.content.ContentGroup>> getOutputMinFrameDurationlomOqCM;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getOutputSizes;
    private final android.graphics.Paint getOutputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getOutputStallDuration;
    private final com.airbnb.lottie.LottieComposition getOutputStallDurationlomOqCM;
    private final android.graphics.RectF getValidOutputFormatsForInputhNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> init;
    private final android.graphics.Matrix isOutputSupportedFor;
    private final java.lang.StringBuilder isOutputSupportedForhNQ4ISI;
    private com.airbnb.lottie.model.content.TextRangeUnits kernelVersion;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.Typeface, android.graphics.Typeface> startTransaction;
    private final com.airbnb.lottie.LottieDrawable toString;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> unwrapAs;

    TextLayer(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer) {
        super(lottieDrawable, layer);
        this.ArtificialStackFrames = new java.lang.StringBuilder(2);
        this.getOutputMinFrameDuration = new java.lang.StringBuilder(0);
        this.isOutputSupportedForhNQ4ISI = new java.lang.StringBuilder(0);
        this.coroutineCreation = new java.lang.StringBuilder(0);
        this.getValidOutputFormatsForInputhNQ4ISI = new android.graphics.RectF();
        this.isOutputSupportedFor = new android.graphics.Matrix();
        this.getOutputSizeshNQ4ISI = new android.graphics.Paint() { // from class: com.airbnb.lottie.model.layer.TextLayer.1
            {
                setStyle(android.graphics.Paint.Style.FILL);
            }
        };
        this.accessartificialFrame = new android.graphics.Paint() { // from class: com.airbnb.lottie.model.layer.TextLayer.2
            {
                setStyle(android.graphics.Paint.Style.STROKE);
            }
        };
        this.getOutputMinFrameDurationlomOqCM = new java.util.HashMap();
        this.getOutputFormats = new androidx.collection.LongSparseArray<>();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList();
        this.AMEXKernel = new java.util.ArrayList();
        this.kernelVersion = com.airbnb.lottie.model.content.TextRangeUnits.INDEX;
        this.toString = lottieDrawable;
        this.getOutputStallDurationlomOqCM = layer.Camera2StreamConfigurationMap;
        com.airbnb.lottie.animation.keyframe.TextKeyframeAnimation createAnimation = layer.getOutputStallDuration.createAnimation();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = createAnimation;
        createAnimation.addUpdateListener(this);
        addAnimation(createAnimation);
        com.airbnb.lottie.model.animatable.AnimatableTextProperties animatableTextProperties = layer.getOutputSizeshNQ4ISI;
        if (animatableTextProperties != null && animatableTextProperties.textStyle != null && animatableTextProperties.textStyle.color != null) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation2 = animatableTextProperties.textStyle.color.createAnimation();
            this.getOutputStallDuration = createAnimation2;
            createAnimation2.addUpdateListener(this);
            addAnimation(this.getOutputStallDuration);
        }
        if (animatableTextProperties != null && animatableTextProperties.textStyle != null && animatableTextProperties.textStyle.stroke != null) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation3 = animatableTextProperties.textStyle.stroke.createAnimation();
            this.coroutineBoundary = createAnimation3;
            createAnimation3.addUpdateListener(this);
            addAnimation(this.coroutineBoundary);
        }
        if (animatableTextProperties != null && animatableTextProperties.textStyle != null && animatableTextProperties.textStyle.strokeWidth != null) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation4 = animatableTextProperties.textStyle.strokeWidth.createAnimation();
            this.f2827a = createAnimation4;
            createAnimation4.addUpdateListener(this);
            addAnimation(this.f2827a);
        }
        if (animatableTextProperties != null && animatableTextProperties.textStyle != null && animatableTextProperties.textStyle.tracking != null) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation5 = animatableTextProperties.textStyle.tracking.createAnimation();
            this.d = createAnimation5;
            createAnimation5.addUpdateListener(this);
            addAnimation(this.d);
        }
        if (animatableTextProperties != null && animatableTextProperties.textStyle != null && animatableTextProperties.textStyle.opacity != null) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation6 = animatableTextProperties.textStyle.opacity.createAnimation();
            this.unwrapAs = createAnimation6;
            createAnimation6.addUpdateListener(this);
            addAnimation(this.unwrapAs);
        }
        if (animatableTextProperties != null && animatableTextProperties.rangeSelector != null && animatableTextProperties.rangeSelector.start != null) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation7 = animatableTextProperties.rangeSelector.start.createAnimation();
            this.c = createAnimation7;
            createAnimation7.addUpdateListener(this);
            addAnimation(this.c);
        }
        if (animatableTextProperties != null && animatableTextProperties.rangeSelector != null && animatableTextProperties.rangeSelector.end != null) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation8 = animatableTextProperties.rangeSelector.end.createAnimation();
            this._BOUNDARY = createAnimation8;
            createAnimation8.addUpdateListener(this);
            addAnimation(this._BOUNDARY);
        }
        if (animatableTextProperties != null && animatableTextProperties.rangeSelector != null && animatableTextProperties.rangeSelector.offset != null) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation9 = animatableTextProperties.rangeSelector.offset.createAnimation();
            this._CREATION = createAnimation9;
            createAnimation9.addUpdateListener(this);
            addAnimation(this._CREATION);
        }
        if (animatableTextProperties == null || animatableTextProperties.rangeSelector == null) {
            return;
        }
        this.kernelVersion = animatableTextProperties.rangeSelector.units;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.getOutputStallDurationlomOqCM.getBounds().width(), this.getOutputStallDurationlomOqCM.getBounds().height());
    }

    /* JADX WARN: Code restructure failed: missing block: B:138:0x03cc, code lost:
    
        r24.getOutputMinFrameDuration.insert(0, r4);
        r3 = r3 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026b  */
    @Override // com.airbnb.lottie.model.layer.BaseLayer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void drawLayer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        android.graphics.Typeface typeface;
        float f;
        float floatValue;
        int size;
        int i2;
        java.util.List<com.airbnb.lottie.model.layer.TextLayer.TextSubLine> list;
        com.airbnb.lottie.model.Font font;
        java.util.List<java.lang.String> list2;
        int i3;
        java.lang.String str;
        float f2;
        float floatValue2;
        int i4;
        java.util.List<com.airbnb.lottie.model.layer.TextLayer.TextSubLine> list3;
        java.lang.String str2;
        int i5;
        java.util.List<com.airbnb.lottie.animation.content.ContentGroup> list4;
        com.airbnb.lottie.model.DocumentData value = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue();
        com.airbnb.lottie.model.Font font2 = this.getOutputStallDurationlomOqCM.getFonts().get(value.fontName);
        if (font2 == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        int i6 = 0;
        getHighSpeedVideoFpsRanges(value, i, 0);
        if (this.toString.useTextGlyphs()) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation = this.init;
            if (baseKeyframeAnimation != null) {
                f2 = baseKeyframeAnimation.getValue().floatValue();
            } else {
                f2 = value.size;
            }
            float f3 = f2 / 100.0f;
            com.airbnb.lottie.utils.Utils.getScale(matrix);
            java.util.List<java.lang.String> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(value.text);
            int size2 = Camera2StreamConfigurationMap.size();
            float f4 = value.tracking / 10.0f;
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2 = this.AMEXKernela;
            if (baseKeyframeAnimation2 != null) {
                floatValue2 = baseKeyframeAnimation2.getValue().floatValue();
            } else {
                com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation3 = this.d;
                if (baseKeyframeAnimation3 != null) {
                    floatValue2 = baseKeyframeAnimation3.getValue().floatValue();
                }
                float f5 = f4;
                int i7 = -1;
                i4 = 0;
                while (i4 < size2) {
                    int i8 = i4;
                    int i9 = size2;
                    java.util.List<com.airbnb.lottie.model.layer.TextLayer.TextSubLine> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap.get(i4), value.boxSize == null ? 0.0f : value.boxSize.x, font2, f3, f5, true);
                    int i10 = i6;
                    while (i10 < Camera2StreamConfigurationMap2.size()) {
                        com.airbnb.lottie.model.layer.TextLayer.TextSubLine textSubLine = Camera2StreamConfigurationMap2.get(i10);
                        int i11 = i7 + 1;
                        canvas.save();
                        if (getHighResolutionOutputSizeshNQ4ISI(canvas, value, i11, textSubLine.getHighSpeedVideoFpsRanges)) {
                            java.lang.String str3 = textSubLine.Camera2StreamConfigurationMap;
                            int i12 = i6;
                            while (i12 < str3.length()) {
                                com.airbnb.lottie.model.FontCharacter fontCharacter = this.getOutputStallDurationlomOqCM.getCharacters().get(com.airbnb.lottie.model.FontCharacter.hashFor(str3.charAt(i12), font2.getFamily(), font2.getStyle()));
                                if (fontCharacter != null) {
                                    getHighSpeedVideoFpsRanges(value, i, i12);
                                    if (this.getOutputMinFrameDurationlomOqCM.containsKey(fontCharacter)) {
                                        list4 = this.getOutputMinFrameDurationlomOqCM.get(fontCharacter);
                                        list3 = Camera2StreamConfigurationMap2;
                                        str2 = str3;
                                        i5 = i11;
                                    } else {
                                        java.util.List<com.airbnb.lottie.model.content.ShapeGroup> shapes = fontCharacter.getShapes();
                                        int size3 = shapes.size();
                                        java.util.ArrayList arrayList = new java.util.ArrayList(size3);
                                        list3 = Camera2StreamConfigurationMap2;
                                        int i13 = 0;
                                        while (i13 < size3) {
                                            arrayList.add(new com.airbnb.lottie.animation.content.ContentGroup(this.toString, this, shapes.get(i13), this.getOutputStallDurationlomOqCM));
                                            i13++;
                                            i11 = i11;
                                            str3 = str3;
                                            shapes = shapes;
                                            size3 = size3;
                                        }
                                        str2 = str3;
                                        i5 = i11;
                                        this.getOutputMinFrameDurationlomOqCM.put(fontCharacter, arrayList);
                                        list4 = arrayList;
                                    }
                                    for (int i14 = 0; i14 < list4.size(); i14++) {
                                        android.graphics.Path path = list4.get(i14).getPath();
                                        path.computeBounds(this.getValidOutputFormatsForInputhNQ4ISI, false);
                                        this.isOutputSupportedFor.reset();
                                        this.isOutputSupportedFor.preTranslate(0.0f, (-value.baselineShift) * com.airbnb.lottie.utils.Utils.dpScale());
                                        this.isOutputSupportedFor.preScale(f3, f3);
                                        path.transform(this.isOutputSupportedFor);
                                        if (value.strokeOverFill) {
                                            Camera2StreamConfigurationMap(path, this.getOutputSizeshNQ4ISI, canvas);
                                            Camera2StreamConfigurationMap(path, this.accessartificialFrame, canvas);
                                        } else {
                                            Camera2StreamConfigurationMap(path, this.accessartificialFrame, canvas);
                                            Camera2StreamConfigurationMap(path, this.getOutputSizeshNQ4ISI, canvas);
                                        }
                                    }
                                    canvas.translate((((float) fontCharacter.getWidth()) * f3 * com.airbnb.lottie.utils.Utils.dpScale()) + f5, 0.0f);
                                } else {
                                    list3 = Camera2StreamConfigurationMap2;
                                    str2 = str3;
                                    i5 = i11;
                                }
                                i12++;
                                Camera2StreamConfigurationMap2 = list3;
                                i11 = i5;
                                str3 = str2;
                            }
                        }
                        i7 = i11;
                        canvas.restore();
                        i10++;
                        Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap2;
                        i6 = 0;
                    }
                    i4 = i8 + 1;
                    size2 = i9;
                    i6 = 0;
                }
            }
            f4 += floatValue2;
            float f52 = f4;
            int i72 = -1;
            i4 = 0;
            while (i4 < size2) {
            }
        } else {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.Typeface, android.graphics.Typeface> baseKeyframeAnimation4 = this.startTransaction;
            if ((baseKeyframeAnimation4 == null || (typeface = baseKeyframeAnimation4.getValue()) == null) && (typeface = this.toString.getTypeface(font2)) == null) {
                typeface = font2.getTypeface();
            }
            if (typeface != null) {
                java.lang.String str4 = value.text;
                com.airbnb.lottie.TextDelegate textDelegate = this.toString.getTextDelegate();
                if (textDelegate != null) {
                    str4 = textDelegate.getTextInternal(getName(), str4);
                }
                this.getOutputSizeshNQ4ISI.setTypeface(typeface);
                com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation5 = this.init;
                if (baseKeyframeAnimation5 != null) {
                    f = baseKeyframeAnimation5.getValue().floatValue();
                } else {
                    f = value.size;
                }
                this.getOutputSizeshNQ4ISI.setTextSize(com.airbnb.lottie.utils.Utils.dpScale() * f);
                this.accessartificialFrame.setTypeface(this.getOutputSizeshNQ4ISI.getTypeface());
                this.accessartificialFrame.setTextSize(this.getOutputSizeshNQ4ISI.getTextSize());
                float f6 = value.tracking / 10.0f;
                com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation6 = this.AMEXKernela;
                if (baseKeyframeAnimation6 != null) {
                    floatValue = baseKeyframeAnimation6.getValue().floatValue();
                } else {
                    com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation7 = this.d;
                    if (baseKeyframeAnimation7 != null) {
                        floatValue = baseKeyframeAnimation7.getValue().floatValue();
                    }
                    float dpScale = ((f6 * com.airbnb.lottie.utils.Utils.dpScale()) * f) / 100.0f;
                    java.util.List<java.lang.String> Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(str4);
                    size = Camera2StreamConfigurationMap3.size();
                    int i15 = -1;
                    i2 = 0;
                    int i16 = 0;
                    while (i2 < size) {
                        int i17 = i2;
                        java.util.List<com.airbnb.lottie.model.layer.TextLayer.TextSubLine> Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap(Camera2StreamConfigurationMap3.get(i2), value.boxSize == null ? 0.0f : value.boxSize.x, font2, 0.0f, dpScale, false);
                        int i18 = 0;
                        while (i18 < Camera2StreamConfigurationMap4.size()) {
                            com.airbnb.lottie.model.layer.TextLayer.TextSubLine textSubLine2 = Camera2StreamConfigurationMap4.get(i18);
                            i15++;
                            canvas.save();
                            if (getHighResolutionOutputSizeshNQ4ISI(canvas, value, i15, (this.getARTIFICIAL_FRAME_PACKAGE_NAME == null && this.init == null && this.AMEXKernela == null) ? textSubLine2.getHighSpeedVideoFpsRanges : this.getOutputSizeshNQ4ISI.measureText(textSubLine2.Camera2StreamConfigurationMap))) {
                                java.lang.String str5 = textSubLine2.Camera2StreamConfigurationMap;
                                if (java.text.Bidi.requiresBidi(str5.toCharArray(), 0, str5.length())) {
                                    java.text.Bidi bidi = new java.text.Bidi(str5, -2);
                                    int runCount = bidi.getRunCount();
                                    byte[] bArr = new byte[runCount];
                                    list = Camera2StreamConfigurationMap4;
                                    java.lang.Integer[] numArr = new java.lang.Integer[runCount];
                                    font = font2;
                                    int i19 = 0;
                                    while (i19 < runCount) {
                                        bArr[i19] = (byte) bidi.getRunLevel(i19);
                                        numArr[i19] = java.lang.Integer.valueOf(i19);
                                        i19++;
                                        Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap3;
                                    }
                                    list2 = Camera2StreamConfigurationMap3;
                                    java.text.Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                    this.isOutputSupportedForhNQ4ISI.setLength(0);
                                    int i20 = 0;
                                    while (i20 < runCount) {
                                        int intValue = numArr[i20].intValue();
                                        int runStart = bidi.getRunStart(intValue);
                                        java.lang.Integer[] numArr2 = numArr;
                                        int runLimit = bidi.getRunLimit(intValue);
                                        int runLevel = bidi.getRunLevel(intValue);
                                        java.lang.String substring = str5.substring(runStart, runLimit);
                                        if ((runLevel & 1) == 0) {
                                            this.isOutputSupportedForhNQ4ISI.append(substring);
                                            str = str5;
                                        } else {
                                            this.coroutineCreation.setLength(0);
                                            int i21 = 0;
                                            while (i21 < substring.length()) {
                                                java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(substring, i21);
                                                this.coroutineCreation.insert(0, highSpeedVideoFpsRanges);
                                                i21 += highSpeedVideoFpsRanges.length();
                                                substring = substring;
                                                str5 = str5;
                                            }
                                            str = str5;
                                            this.isOutputSupportedForhNQ4ISI.append((java.lang.CharSequence) this.coroutineCreation);
                                        }
                                        i20++;
                                        numArr = numArr2;
                                        str5 = str;
                                    }
                                    str5 = this.isOutputSupportedForhNQ4ISI.toString();
                                } else {
                                    list = Camera2StreamConfigurationMap4;
                                    font = font2;
                                    list2 = Camera2StreamConfigurationMap3;
                                }
                                this.getInputSizeshNQ4ISI.clear();
                                int i22 = 0;
                                while (i22 < str5.length()) {
                                    java.lang.String highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(str5, i22);
                                    this.getInputSizeshNQ4ISI.add(highSpeedVideoFpsRanges2);
                                    i22 += highSpeedVideoFpsRanges2.length();
                                }
                                for (int i23 = 0; i23 < this.getInputSizeshNQ4ISI.size(); i23 = i3) {
                                    this.getOutputMinFrameDuration.setLength(0);
                                    this.getOutputMinFrameDuration.append(this.getInputSizeshNQ4ISI.get(i23));
                                    i3 = i23 + 1;
                                    while (i3 < this.getInputSizeshNQ4ISI.size()) {
                                        java.lang.String str6 = this.getInputSizeshNQ4ISI.get(i3);
                                        for (int i24 = 0; i24 < str6.length(); i24++) {
                                            if (java.lang.Character.getDirectionality(str6.codePointAt(i24)) == 2) {
                                                break;
                                            }
                                        }
                                    }
                                    java.lang.String obj = this.getOutputMinFrameDuration.toString();
                                    getHighSpeedVideoFpsRanges(value, i, i16 + i23);
                                    if (value.strokeOverFill) {
                                        getHighResolutionOutputSizeshNQ4ISI(obj, this.getOutputSizeshNQ4ISI, canvas);
                                        getHighResolutionOutputSizeshNQ4ISI(obj, this.accessartificialFrame, canvas);
                                    } else {
                                        getHighResolutionOutputSizeshNQ4ISI(obj, this.accessartificialFrame, canvas);
                                        getHighResolutionOutputSizeshNQ4ISI(obj, this.getOutputSizeshNQ4ISI, canvas);
                                    }
                                    canvas.translate(this.getOutputSizeshNQ4ISI.measureText(obj) + dpScale, 0.0f);
                                }
                            } else {
                                list = Camera2StreamConfigurationMap4;
                                font = font2;
                                list2 = Camera2StreamConfigurationMap3;
                            }
                            i16 += textSubLine2.Camera2StreamConfigurationMap.length();
                            canvas.restore();
                            i18++;
                            Camera2StreamConfigurationMap4 = list;
                            font2 = font;
                            Camera2StreamConfigurationMap3 = list2;
                        }
                        i2 = i17 + 1;
                    }
                }
                f6 += floatValue;
                float dpScale2 = ((f6 * com.airbnb.lottie.utils.Utils.dpScale()) * f) / 100.0f;
                java.util.List<java.lang.String> Camera2StreamConfigurationMap32 = Camera2StreamConfigurationMap(str4);
                size = Camera2StreamConfigurationMap32.size();
                int i152 = -1;
                i2 = 0;
                int i162 = 0;
                while (i2 < size) {
                }
            }
        }
        canvas.restore();
    }

    private void getHighSpeedVideoFpsRanges(com.airbnb.lottie.model.DocumentData documentData, int i, int i2) {
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation = this.getOutputSizes;
        if (baseKeyframeAnimation != null) {
            this.getOutputSizeshNQ4ISI.setColor(baseKeyframeAnimation.getValue().intValue());
        } else if (this.getOutputStallDuration != null && getHighSpeedVideoFpsRanges(i2)) {
            this.getOutputSizeshNQ4ISI.setColor(this.getOutputStallDuration.getValue().intValue());
        } else {
            this.getOutputSizeshNQ4ISI.setColor(documentData.color);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation2 = this.CoroutineDebuggingKt;
        if (baseKeyframeAnimation2 != null) {
            this.accessartificialFrame.setColor(baseKeyframeAnimation2.getValue().intValue());
        } else if (this.coroutineBoundary != null && getHighSpeedVideoFpsRanges(i2)) {
            this.accessartificialFrame.setColor(this.coroutineBoundary.getValue().intValue());
        } else {
            this.accessartificialFrame.setColor(documentData.strokeColor);
        }
        int i3 = 100;
        int intValue = this.transform.getOpacity() == null ? 100 : this.transform.getOpacity().getValue().intValue();
        if (this.unwrapAs != null && getHighSpeedVideoFpsRanges(i2)) {
            i3 = this.unwrapAs.getValue().intValue();
        }
        int round = java.lang.Math.round(((((intValue * 255.0f) / 100.0f) * (i3 / 100.0f)) * i) / 255.0f);
        this.getOutputSizeshNQ4ISI.setAlpha(round);
        this.accessartificialFrame.setAlpha(round);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation3 = this.b;
        if (baseKeyframeAnimation3 != null) {
            this.accessartificialFrame.setStrokeWidth(baseKeyframeAnimation3.getValue().floatValue());
        } else if (this.f2827a != null && getHighSpeedVideoFpsRanges(i2)) {
            this.accessartificialFrame.setStrokeWidth(this.f2827a.getValue().floatValue());
        } else {
            this.accessartificialFrame.setStrokeWidth(documentData.strokeWidth * com.airbnb.lottie.utils.Utils.dpScale());
        }
    }

    private boolean getHighSpeedVideoFpsRanges(int i) {
        int length = this.getARTIFICIAL_FRAME_PACKAGE_NAME.getValue().text.length();
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation = this.c;
        if (baseKeyframeAnimation == null || this._BOUNDARY == null) {
            return true;
        }
        int min = java.lang.Math.min(baseKeyframeAnimation.getValue().intValue(), this._BOUNDARY.getValue().intValue());
        int max = java.lang.Math.max(this.c.getValue().intValue(), this._BOUNDARY.getValue().intValue());
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation2 = this._CREATION;
        if (baseKeyframeAnimation2 != null) {
            int intValue = baseKeyframeAnimation2.getValue().intValue();
            min += intValue;
            max += intValue;
        }
        if (this.kernelVersion == com.airbnb.lottie.model.content.TextRangeUnits.INDEX) {
            return i >= min && i < max;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) min) && f < ((float) max);
    }

    private boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas, com.airbnb.lottie.model.DocumentData documentData, int i, float f) {
        android.graphics.PointF pointF = documentData.boxPosition;
        android.graphics.PointF pointF2 = documentData.boxSize;
        float dpScale = com.airbnb.lottie.utils.Utils.dpScale();
        float f2 = (i * documentData.lineHeight * dpScale) + (pointF == null ? 0.0f : (documentData.lineHeight * dpScale) + pointF.y);
        if (this.toString.getClipTextToBoundingBox() && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + documentData.size) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = com.airbnb.lottie.model.layer.TextLayer.AnonymousClass3.getHighSpeedVideoFpsRangesFor[documentData.justification.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
        } else if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
        } else if (i2 == 3) {
            canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f2);
        }
        return true;
    }

    /* renamed from: com.airbnb.lottie.model.layer.TextLayer$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.DocumentData.Justification.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.airbnb.lottie.model.DocumentData.Justification.LEFT_ALIGN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.DocumentData.Justification.RIGHT_ALIGN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.DocumentData.Justification.CENTER.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.lang.String str) {
        return java.util.Arrays.asList(str.replaceAll(io.ktor.sse.ServerSentEventKt.END_OF_LINE, "\r").replaceAll("\u0003", "\r").replaceAll(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "\r").split("\r"));
    }

    private java.util.List<com.airbnb.lottie.model.layer.TextLayer.TextSubLine> Camera2StreamConfigurationMap(java.lang.String str, float f, com.airbnb.lottie.model.Font font, float f2, float f3, boolean z) {
        float measureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                com.airbnb.lottie.model.FontCharacter fontCharacter = this.getOutputStallDurationlomOqCM.getCharacters().get(com.airbnb.lottie.model.FontCharacter.hashFor(charAt, font.getFamily(), font.getStyle()));
                if (fontCharacter != null) {
                    measureText = ((float) fontCharacter.getWidth()) * f2 * com.airbnb.lottie.utils.Utils.dpScale();
                }
            } else {
                measureText = this.getOutputSizeshNQ4ISI.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                com.airbnb.lottie.model.layer.TextLayer.TextSubLine highSpeedVideoSizes = getHighSpeedVideoSizes(i);
                if (i3 == i2) {
                    highSpeedVideoSizes.Camera2StreamConfigurationMap = str.substring(i2, i4).trim();
                    highSpeedVideoSizes.getHighSpeedVideoFpsRanges = (f4 - f7) - ((r9.length() - r7.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    highSpeedVideoSizes.Camera2StreamConfigurationMap = str.substring(i2, i3 - 1).trim();
                    highSpeedVideoSizes.getHighSpeedVideoFpsRanges = ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            com.airbnb.lottie.model.layer.TextLayer.TextSubLine highSpeedVideoSizes2 = getHighSpeedVideoSizes(i);
            highSpeedVideoSizes2.Camera2StreamConfigurationMap = str.substring(i2);
            highSpeedVideoSizes2.getHighSpeedVideoFpsRanges = f4;
        }
        return this.AMEXKernel.subList(0, i);
    }

    private com.airbnb.lottie.model.layer.TextLayer.TextSubLine getHighSpeedVideoSizes(int i) {
        for (int size = this.AMEXKernel.size(); size < i; size++) {
            this.AMEXKernel.add(new com.airbnb.lottie.model.layer.TextLayer.TextSubLine((byte) 0));
        }
        return this.AMEXKernel.get(i - 1);
    }

    private static void Camera2StreamConfigurationMap(android.graphics.Path path, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, android.graphics.Paint paint, android.graphics.Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == android.graphics.Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
                return;
            }
            canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
        }
    }

    private java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = java.lang.Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (java.lang.Character.getType(codePointAt2) != 16 && java.lang.Character.getType(codePointAt2) != 27 && java.lang.Character.getType(codePointAt2) != 6 && java.lang.Character.getType(codePointAt2) != 28 && java.lang.Character.getType(codePointAt2) != 8 && java.lang.Character.getType(codePointAt2) != 19) {
                break;
            }
            charCount += java.lang.Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.getOutputFormats.containsKey(j)) {
            return this.getOutputFormats.get(j);
        }
        this.ArtificialStackFrames.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.ArtificialStackFrames.appendCodePoint(codePointAt3);
            i += java.lang.Character.charCount(codePointAt3);
        }
        java.lang.String obj = this.ArtificialStackFrames.toString();
        this.getOutputFormats.put(j, obj);
        return obj;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.COLOR) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation = this.getOutputSizes;
            if (baseKeyframeAnimation != null) {
                removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.getOutputSizes = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getOutputSizes = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.getOutputSizes);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.STROKE_COLOR) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation2 = this.CoroutineDebuggingKt;
            if (baseKeyframeAnimation2 != null) {
                removeAnimation(baseKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.CoroutineDebuggingKt = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.CoroutineDebuggingKt = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            addAnimation(this.CoroutineDebuggingKt);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.STROKE_WIDTH) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation3 = this.b;
            if (baseKeyframeAnimation3 != null) {
                removeAnimation(baseKeyframeAnimation3);
            }
            if (lottieValueCallback == null) {
                this.b = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.b = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            addAnimation(this.b);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.TEXT_TRACKING) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation4 = this.AMEXKernela;
            if (baseKeyframeAnimation4 != null) {
                removeAnimation(baseKeyframeAnimation4);
            }
            if (lottieValueCallback == null) {
                this.AMEXKernela = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.AMEXKernela = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            addAnimation(this.AMEXKernela);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.TEXT_SIZE) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation5 = this.init;
            if (baseKeyframeAnimation5 != null) {
                removeAnimation(baseKeyframeAnimation5);
            }
            if (lottieValueCallback == null) {
                this.init = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation5 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.init = valueCallbackKeyframeAnimation5;
            valueCallbackKeyframeAnimation5.addUpdateListener(this);
            addAnimation(this.init);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.TYPEFACE) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.Typeface, android.graphics.Typeface> baseKeyframeAnimation6 = this.startTransaction;
            if (baseKeyframeAnimation6 != null) {
                removeAnimation(baseKeyframeAnimation6);
            }
            if (lottieValueCallback == null) {
                this.startTransaction = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation6 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.startTransaction = valueCallbackKeyframeAnimation6;
            valueCallbackKeyframeAnimation6.addUpdateListener(this);
            addAnimation(this.startTransaction);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.TEXT) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.setStringValueCallback(lottieValueCallback);
        }
    }

    static class TextSubLine {
        java.lang.String Camera2StreamConfigurationMap;
        float getHighSpeedVideoFpsRanges;

        private TextSubLine() {
            this.Camera2StreamConfigurationMap = "";
            this.getHighSpeedVideoFpsRanges = 0.0f;
        }

        /* synthetic */ TextSubLine(byte b) {
            this();
        }
    }
}
