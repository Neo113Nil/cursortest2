package com.caverock.androidsvg;

/* loaded from: classes7.dex */
class SVGParser {
    private int getHighSpeedVideoSizes;
    private com.caverock.androidsvg.SVG getInputSizeshNQ4ISI = null;
    private com.caverock.androidsvg.SVG.SvgContainer Camera2StreamConfigurationMap = null;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    private boolean getHighSpeedVideoFpsRanges = false;
    private com.caverock.androidsvg.SVGParser.SVGElem getInputFormats = null;
    private java.lang.StringBuilder getOutputFormats = null;
    private boolean getHighSpeedVideoFpsRangesFor = false;
    private java.lang.StringBuilder getHighSpeedVideoSizesFor = null;

    private static float Camera2StreamConfigurationMap(float f, float f2, float f3) {
        float f4;
        if (f3 < 0.0f) {
            f3 += 6.0f;
        }
        if (f3 >= 6.0f) {
            f3 -= 6.0f;
        }
        if (f3 < 1.0f) {
            f4 = (f2 - f) * f3;
        } else {
            if (f3 < 3.0f) {
                return f2;
            }
            if (f3 >= 4.0f) {
                return f;
            }
            f4 = (f2 - f) * (4.0f - f3);
        }
        return f4 + f;
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI() {
    }

    SVGParser() {
    }

    enum SVGElem {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;

        private static final java.util.Map<java.lang.String, com.caverock.androidsvg.SVGParser.SVGElem> AMEXKernel = new java.util.HashMap();

        static {
            for (com.caverock.androidsvg.SVGParser.SVGElem sVGElem : values()) {
                if (sVGElem == SWITCH) {
                    AMEXKernel.put("switch", sVGElem);
                } else if (sVGElem != UNSUPPORTED) {
                    AMEXKernel.put(sVGElem.name(), sVGElem);
                }
            }
        }

        public static com.caverock.androidsvg.SVGParser.SVGElem getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            com.caverock.androidsvg.SVGParser.SVGElem sVGElem = AMEXKernel.get(str);
            return sVGElem != null ? sVGElem : UNSUPPORTED;
        }
    }

    enum SVGAttr {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;

        private static final java.util.Map<java.lang.String, com.caverock.androidsvg.SVGParser.SVGAttr> onMinimized = new java.util.HashMap();

        static {
            for (com.caverock.androidsvg.SVGParser.SVGAttr sVGAttr : values()) {
                if (sVGAttr == CLASS) {
                    onMinimized.put(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, sVGAttr);
                } else if (sVGAttr != UNSUPPORTED) {
                    onMinimized.put(sVGAttr.name().replace('_', '-'), sVGAttr);
                }
            }
        }

        public static com.caverock.androidsvg.SVGParser.SVGAttr getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            com.caverock.androidsvg.SVGParser.SVGAttr sVGAttr = onMinimized.get(str);
            return sVGAttr != null ? sVGAttr : UNSUPPORTED;
        }
    }

    static class ColourKeywords {
        private static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoFpsRanges;

        private ColourKeywords() {
        }

        static {
            java.util.HashMap hashMap = new java.util.HashMap(47);
            getHighSpeedVideoFpsRanges = hashMap;
            hashMap.put("aliceblue", -984833);
            hashMap.put("antiquewhite", -332841);
            hashMap.put("aqua", -16711681);
            hashMap.put("aquamarine", -8388652);
            hashMap.put("azure", -983041);
            hashMap.put("beige", -657956);
            hashMap.put("bisque", -6972);
            hashMap.put("black", -16777216);
            hashMap.put("blanchedalmond", -5171);
            hashMap.put("blue", -16776961);
            hashMap.put("blueviolet", -7722014);
            hashMap.put("brown", -5952982);
            hashMap.put("burlywood", -2180985);
            hashMap.put("cadetblue", -10510688);
            hashMap.put("chartreuse", -8388864);
            hashMap.put("chocolate", -2987746);
            hashMap.put("coral", -32944);
            hashMap.put("cornflowerblue", -10185235);
            hashMap.put("cornsilk", -1828);
            hashMap.put("crimson", -2354116);
            hashMap.put("cyan", -16711681);
            hashMap.put("darkblue", -16777077);
            hashMap.put("darkcyan", -16741493);
            hashMap.put("darkgoldenrod", -4684277);
            hashMap.put("darkgray", -5658199);
            hashMap.put("darkgreen", -16751616);
            hashMap.put("darkgrey", -5658199);
            hashMap.put("darkkhaki", -4343957);
            hashMap.put("darkmagenta", -7667573);
            hashMap.put("darkolivegreen", -11179217);
            hashMap.put("darkorange", -29696);
            hashMap.put("darkorchid", -6737204);
            hashMap.put("darkred", -7667712);
            hashMap.put("darksalmon", -1468806);
            hashMap.put("darkseagreen", -7357297);
            hashMap.put("darkslateblue", -12042869);
            hashMap.put("darkslategray", -13676721);
            hashMap.put("darkslategrey", -13676721);
            hashMap.put("darkturquoise", -16724271);
            hashMap.put("darkviolet", -7077677);
            hashMap.put("deeppink", -60269);
            hashMap.put("deepskyblue", -16728065);
            hashMap.put("dimgray", -9868951);
            hashMap.put("dimgrey", -9868951);
            hashMap.put("dodgerblue", -14774017);
            hashMap.put("firebrick", -5103070);
            hashMap.put("floralwhite", -1296);
            hashMap.put("forestgreen", -14513374);
            hashMap.put("fuchsia", -65281);
            hashMap.put("gainsboro", -2302756);
            hashMap.put("ghostwhite", -460545);
            hashMap.put("gold", -10496);
            hashMap.put("goldenrod", -2448096);
            hashMap.put("gray", -8355712);
            hashMap.put("green", -16744448);
            hashMap.put("greenyellow", -5374161);
            hashMap.put("grey", -8355712);
            hashMap.put("honeydew", -983056);
            hashMap.put("hotpink", -38476);
            hashMap.put("indianred", -3318692);
            hashMap.put("indigo", -11861886);
            hashMap.put("ivory", -16);
            hashMap.put("khaki", -989556);
            hashMap.put("lavender", -1644806);
            hashMap.put("lavenderblush", -3851);
            hashMap.put("lawngreen", -8586240);
            hashMap.put("lemonchiffon", -1331);
            hashMap.put("lightblue", -5383962);
            hashMap.put("lightcoral", -1015680);
            hashMap.put("lightcyan", -2031617);
            hashMap.put("lightgoldenrodyellow", -329006);
            hashMap.put("lightgray", -2894893);
            hashMap.put("lightgreen", -7278960);
            hashMap.put("lightgrey", -2894893);
            hashMap.put("lightpink", -18751);
            hashMap.put("lightsalmon", -24454);
            hashMap.put("lightseagreen", -14634326);
            hashMap.put("lightskyblue", -7876870);
            hashMap.put("lightslategray", -8943463);
            hashMap.put("lightslategrey", -8943463);
            hashMap.put("lightsteelblue", -5192482);
            hashMap.put("lightyellow", -32);
            hashMap.put("lime", -16711936);
            hashMap.put("limegreen", -13447886);
            hashMap.put("linen", -331546);
            hashMap.put("magenta", -65281);
            hashMap.put("maroon", -8388608);
            hashMap.put("mediumaquamarine", -10039894);
            hashMap.put("mediumblue", -16777011);
            hashMap.put("mediumorchid", -4565549);
            hashMap.put("mediumpurple", -7114533);
            hashMap.put("mediumseagreen", -12799119);
            hashMap.put("mediumslateblue", -8689426);
            hashMap.put("mediumspringgreen", -16713062);
            hashMap.put("mediumturquoise", -12004916);
            hashMap.put("mediumvioletred", -3730043);
            hashMap.put("midnightblue", -15132304);
            hashMap.put("mintcream", -655366);
            hashMap.put("mistyrose", -6943);
            hashMap.put("moccasin", -6987);
            hashMap.put("navajowhite", -8531);
            hashMap.put("navy", -16777088);
            hashMap.put("oldlace", -133658);
            hashMap.put("olive", -8355840);
            hashMap.put("olivedrab", -9728477);
            hashMap.put("orange", -23296);
            hashMap.put("orangered", -47872);
            hashMap.put("orchid", -2461482);
            hashMap.put("palegoldenrod", -1120086);
            hashMap.put("palegreen", -6751336);
            hashMap.put("paleturquoise", -5247250);
            hashMap.put("palevioletred", -2396013);
            hashMap.put("papayawhip", -4139);
            hashMap.put("peachpuff", -9543);
            hashMap.put("peru", -3308225);
            hashMap.put("pink", -16181);
            hashMap.put("plum", -2252579);
            hashMap.put("powderblue", -5185306);
            hashMap.put("purple", -8388480);
            hashMap.put("rebeccapurple", -10079335);
            hashMap.put("red", java.lang.Integer.valueOf(androidx.core.internal.view.SupportMenu.CATEGORY_MASK));
            hashMap.put("rosybrown", -4419697);
            hashMap.put("royalblue", -12490271);
            hashMap.put("saddlebrown", -7650029);
            hashMap.put("salmon", -360334);
            hashMap.put("sandybrown", -744352);
            hashMap.put("seagreen", -13726889);
            hashMap.put("seashell", -2578);
            hashMap.put("sienna", -6270419);
            hashMap.put("silver", -4144960);
            hashMap.put("skyblue", -7876885);
            hashMap.put("slateblue", -9807155);
            hashMap.put("slategray", -9404272);
            hashMap.put("slategrey", -9404272);
            hashMap.put("snow", -1286);
            hashMap.put("springgreen", -16711809);
            hashMap.put("steelblue", -12156236);
            hashMap.put("tan", -2968436);
            hashMap.put("teal", -16744320);
            hashMap.put("thistle", -2572328);
            hashMap.put("tomato", -40121);
            hashMap.put("turquoise", -12525360);
            hashMap.put("violet", -1146130);
            hashMap.put("wheat", -663885);
            hashMap.put("white", -1);
            hashMap.put("whitesmoke", -657931);
            hashMap.put("yellow", -256);
            hashMap.put("yellowgreen", -6632142);
            hashMap.put("transparent", 0);
        }

        static java.lang.Integer Camera2StreamConfigurationMap(java.lang.String str) {
            return getHighSpeedVideoFpsRanges.get(str);
        }
    }

    static class FontSizeKeywords {
        private static final java.util.Map<java.lang.String, com.caverock.androidsvg.SVG.Length> getHighResolutionOutputSizeshNQ4ISI;

        private FontSizeKeywords() {
        }

        static {
            java.util.HashMap hashMap = new java.util.HashMap(9);
            getHighResolutionOutputSizeshNQ4ISI = hashMap;
            hashMap.put("xx-small", new com.caverock.androidsvg.SVG.Length(0.694f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put("x-small", new com.caverock.androidsvg.SVG.Length(0.833f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put(com.adjust.sdk.Constants.SMALL, new com.caverock.androidsvg.SVG.Length(10.0f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put("medium", new com.caverock.androidsvg.SVG.Length(12.0f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put(com.adjust.sdk.Constants.LARGE, new com.caverock.androidsvg.SVG.Length(14.4f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put("x-large", new com.caverock.androidsvg.SVG.Length(17.3f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put("xx-large", new com.caverock.androidsvg.SVG.Length(20.7f, com.caverock.androidsvg.SVG.Unit.pt));
            hashMap.put("smaller", new com.caverock.androidsvg.SVG.Length(83.33f, com.caverock.androidsvg.SVG.Unit.percent));
            hashMap.put("larger", new com.caverock.androidsvg.SVG.Length(120.0f, com.caverock.androidsvg.SVG.Unit.percent));
        }

        static com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap(java.lang.String str) {
            return getHighResolutionOutputSizeshNQ4ISI.get(str);
        }
    }

    static class FontWeightKeywords {
        private static final java.util.Map<java.lang.String, java.lang.Integer> getHighSpeedVideoSizes;

        private FontWeightKeywords() {
        }

        static {
            java.util.HashMap hashMap = new java.util.HashMap(13);
            getHighSpeedVideoSizes = hashMap;
            hashMap.put(com.adjust.sdk.Constants.NORMAL, 400);
            hashMap.put("bold", 700);
            hashMap.put("bolder", 1);
            hashMap.put("lighter", -1);
            hashMap.put("100", 100);
            hashMap.put("200", 200);
            hashMap.put("300", 300);
            hashMap.put("400", 400);
            hashMap.put("500", 500);
            hashMap.put(com.paypal.oslo.feature.pushnotification.shared.domain.CommsEventTypes.SILENT, 600);
            hashMap.put("700", 700);
            hashMap.put("800", java.lang.Integer.valueOf(com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MIN_TABLET_WIDTH_DP));
            hashMap.put("900", 900);
        }

        static java.lang.Integer getHighSpeedVideoFpsRanges(java.lang.String str) {
            return getHighSpeedVideoSizes.get(str);
        }
    }

    static class AspectRatioKeywords {
        private static final java.util.Map<java.lang.String, com.caverock.androidsvg.PreserveAspectRatio.Alignment> getHighSpeedVideoFpsRangesFor;

        private AspectRatioKeywords() {
        }

        static {
            java.util.HashMap hashMap = new java.util.HashMap(10);
            getHighSpeedVideoFpsRangesFor = hashMap;
            hashMap.put("none", com.caverock.androidsvg.PreserveAspectRatio.Alignment.none);
            hashMap.put("xMinYMin", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMin);
            hashMap.put("xMidYMin", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMin);
            hashMap.put("xMaxYMin", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMin);
            hashMap.put("xMinYMid", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMid);
            hashMap.put("xMidYMid", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMid);
            hashMap.put("xMaxYMid", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMid);
            hashMap.put("xMinYMax", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMinYMax);
            hashMap.put("xMidYMax", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMidYMax);
            hashMap.put("xMaxYMax", com.caverock.androidsvg.PreserveAspectRatio.Alignment.xMaxYMax);
        }

        static com.caverock.androidsvg.PreserveAspectRatio.Alignment getHighSpeedVideoSizes(java.lang.String str) {
            return getHighSpeedVideoFpsRangesFor.get(str);
        }
    }

    final com.caverock.androidsvg.SVG getHighSpeedVideoFpsRangesFor(java.io.InputStream inputStream, boolean z) throws com.caverock.androidsvg.SVGParseException {
        if (!inputStream.markSupported()) {
            inputStream = new java.io.BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int read = inputStream.read();
            int read2 = inputStream.read();
            inputStream.reset();
            if (read + (read2 << 8) == 35615) {
                inputStream = new java.io.BufferedInputStream(new java.util.zip.GZIPInputStream(inputStream));
            }
        } catch (java.io.IOException unused) {
        }
        try {
            inputStream.mark(4096);
            try {
                try {
                    org.xmlpull.v1.XmlPullParser newPullParser = android.util.Xml.newPullParser();
                    com.caverock.androidsvg.SVGParser.XPPAttributesWrapper xPPAttributesWrapper = new com.caverock.androidsvg.SVGParser.XPPAttributesWrapper(newPullParser);
                    byte b = 0;
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                    newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                    newPullParser.setInput(inputStream, null);
                    for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.nextToken()) {
                        if (eventType == 0) {
                            this.getInputSizeshNQ4ISI = new com.caverock.androidsvg.SVG();
                        } else if (eventType == 8) {
                            newPullParser.getText();
                            com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(newPullParser.getText());
                            getHighResolutionOutputSizeshNQ4ISI(textScanner.getHighSpeedVideoFpsRanges(' ', false), Camera2StreamConfigurationMap(textScanner));
                        } else if (eventType != 10) {
                            if (eventType == 2) {
                                java.lang.String name2 = newPullParser.getName();
                                if (newPullParser.getPrefix() != null) {
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    sb.append(newPullParser.getPrefix());
                                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                                    sb.append(name2);
                                    name2 = sb.toString();
                                }
                                getHighSpeedVideoFpsRanges(newPullParser.getNamespace(), newPullParser.getName(), name2, xPPAttributesWrapper);
                            } else if (eventType == 3) {
                                java.lang.String name3 = newPullParser.getName();
                                if (newPullParser.getPrefix() != null) {
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                    sb2.append(newPullParser.getPrefix());
                                    sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                                    sb2.append(name3);
                                    name3 = sb2.toString();
                                }
                                getHighResolutionOutputSizeshNQ4ISI(newPullParser.getNamespace(), newPullParser.getName(), name3);
                            } else if (eventType == 4) {
                                int[] iArr = new int[2];
                                char[] textCharacters = newPullParser.getTextCharacters(iArr);
                                int i = iArr[0];
                                int i2 = iArr[1];
                                if (!this.getHighResolutionOutputSizeshNQ4ISI) {
                                    if (this.getHighSpeedVideoFpsRanges) {
                                        if (this.getOutputFormats == null) {
                                            this.getOutputFormats = new java.lang.StringBuilder(i2);
                                        }
                                        this.getOutputFormats.append(textCharacters, i, i2);
                                    } else if (this.getHighSpeedVideoFpsRangesFor) {
                                        if (this.getHighSpeedVideoSizesFor == null) {
                                            this.getHighSpeedVideoSizesFor = new java.lang.StringBuilder(i2);
                                        }
                                        this.getHighSpeedVideoSizesFor.append(textCharacters, i, i2);
                                    } else if (this.Camera2StreamConfigurationMap instanceof com.caverock.androidsvg.SVG.TextContainer) {
                                        getHighSpeedVideoSizes(new java.lang.String(textCharacters, i, i2));
                                    }
                                }
                            } else if (eventType == 5) {
                                _BOUNDARY(newPullParser.getText());
                            }
                        } else if (z && this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes == null && newPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                inputStream.reset();
                                try {
                                    javax.xml.parsers.SAXParserFactory newInstance = javax.xml.parsers.SAXParserFactory.newInstance();
                                    newInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
                                    newInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
                                    org.xml.sax.XMLReader xMLReader = newInstance.newSAXParser().getXMLReader();
                                    com.caverock.androidsvg.SVGParser.SAXHandler sAXHandler = new com.caverock.androidsvg.SVGParser.SAXHandler(this, b);
                                    xMLReader.setContentHandler(sAXHandler);
                                    xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", sAXHandler);
                                    xMLReader.parse(new org.xml.sax.InputSource(inputStream));
                                    break;
                                } catch (java.io.IOException e) {
                                    throw new com.caverock.androidsvg.SVGParseException("Stream error", e);
                                } catch (javax.xml.parsers.ParserConfigurationException e2) {
                                    throw new com.caverock.androidsvg.SVGParseException("XML parser problem", e2);
                                } catch (org.xml.sax.SAXException e3) {
                                    throw new com.caverock.androidsvg.SVGParseException("SVG parse error", e3);
                                }
                            } catch (java.io.IOException unused2) {
                            }
                        }
                    }
                    return this.getInputSizeshNQ4ISI;
                } catch (java.io.IOException e4) {
                    throw new com.caverock.androidsvg.SVGParseException("Stream error", e4);
                }
            } catch (org.xmlpull.v1.XmlPullParserException e5) {
                throw new com.caverock.androidsvg.SVGParseException("XML parser problem", e5);
            }
        } finally {
            try {
                inputStream.close();
            } catch (java.io.IOException unused3) {
            }
        }
    }

    class XPPAttributesWrapper implements org.xml.sax.Attributes {
        private org.xmlpull.v1.XmlPullParser getHighSpeedVideoFpsRanges;

        @Override // org.xml.sax.Attributes
        public int getIndex(java.lang.String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(java.lang.String str, java.lang.String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getType(int i) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getType(java.lang.String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getType(java.lang.String str, java.lang.String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getValue(java.lang.String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getValue(java.lang.String str, java.lang.String str2) {
            return null;
        }

        public XPPAttributesWrapper(org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.getHighSpeedVideoFpsRanges = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.getHighSpeedVideoFpsRanges.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getURI(int i) {
            return this.getHighSpeedVideoFpsRanges.getAttributeNamespace(i);
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getLocalName(int i) {
            return this.getHighSpeedVideoFpsRanges.getAttributeName(i);
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getQName(int i) {
            java.lang.String attributeName = this.getHighSpeedVideoFpsRanges.getAttributeName(i);
            if (this.getHighSpeedVideoFpsRanges.getAttributePrefix(i) == null) {
                return attributeName;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(this.getHighSpeedVideoFpsRanges.getAttributePrefix(i));
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
            sb.append(attributeName);
            return sb.toString();
        }

        @Override // org.xml.sax.Attributes
        public java.lang.String getValue(int i) {
            return this.getHighSpeedVideoFpsRanges.getAttributeValue(i);
        }
    }

    class SAXHandler extends org.xml.sax.ext.DefaultHandler2 {
        private SAXHandler() {
        }

        /* synthetic */ SAXHandler(com.caverock.androidsvg.SVGParser sVGParser, byte b) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() throws org.xml.sax.SAXException {
            com.caverock.androidsvg.SVGParser.getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGParser.this);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws org.xml.sax.SAXException {
            com.caverock.androidsvg.SVGParser.this.getHighSpeedVideoFpsRanges(str, str2, str3, attributes);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws org.xml.sax.SAXException {
            com.caverock.androidsvg.SVGParser.this._BOUNDARY(new java.lang.String(cArr, i, i2));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(java.lang.String str, java.lang.String str2, java.lang.String str3) throws org.xml.sax.SAXException {
            com.caverock.androidsvg.SVGParser.this.getHighResolutionOutputSizeshNQ4ISI(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws org.xml.sax.SAXException {
            com.caverock.androidsvg.SVGParser.getHighResolutionOutputSizeshNQ4ISI();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(java.lang.String str, java.lang.String str2) throws org.xml.sax.SAXException {
            com.caverock.androidsvg.SVGParser.this.getHighResolutionOutputSizeshNQ4ISI(str, (java.util.Map<java.lang.String, java.lang.String>) com.caverock.androidsvg.SVGParser.Camera2StreamConfigurationMap(new com.caverock.androidsvg.SVGParser.TextScanner(str2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighSpeedVideoFpsRanges(java.lang.String str, java.lang.String str2, java.lang.String str3, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            this.getHighSpeedVideoSizes++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            com.caverock.androidsvg.SVGParser.SVGElem highResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.SVGParser.SVGElem.getHighResolutionOutputSizeshNQ4ISI(str2);
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[highResolutionOutputSizeshNQ4ISI.ordinal()]) {
                case 1:
                    getValidOutputFormatsForInputhNQ4ISI(attributes);
                    break;
                case 2:
                case 3:
                    getHighResolutionOutputSizeshNQ4ISI(attributes);
                    break;
                case 4:
                    getHighSpeedVideoFpsRangesFor(attributes);
                    break;
                case 5:
                    _CREATION(attributes);
                    break;
                case 6:
                    getOutputStallDuration(attributes);
                    break;
                case 7:
                    unwrapAs(attributes);
                    break;
                case 8:
                    getHighSpeedVideoFpsRanges(attributes);
                    break;
                case 9:
                    Camera2StreamConfigurationMap(attributes);
                    break;
                case 10:
                    getOutputFormats(attributes);
                    break;
                case 11:
                    getOutputMinFrameDurationlomOqCM(attributes);
                    break;
                case 12:
                    getOutputSizes(attributes);
                    break;
                case 13:
                    accessartificialFrame(attributes);
                    break;
                case 14:
                    CoroutineDebuggingKt(attributes);
                    break;
                case 15:
                    coroutineBoundary(attributes);
                    break;
                case 16:
                    b(attributes);
                    break;
                case 17:
                    coroutineCreation(attributes);
                    break;
                case 18:
                    getInputFormats(attributes);
                    break;
                case 19:
                    getInputSizeshNQ4ISI(attributes);
                    break;
                case 20:
                    getOutputSizeshNQ4ISI(attributes);
                    break;
                case 21:
                    isOutputSupportedForhNQ4ISI(attributes);
                    break;
                case 22:
                case 23:
                    this.getHighSpeedVideoFpsRanges = true;
                    this.getInputFormats = highResolutionOutputSizeshNQ4ISI;
                    break;
                case 24:
                    getHighSpeedVideoSizes(attributes);
                    break;
                case 25:
                    ArtificialStackFrames(attributes);
                    break;
                case 26:
                    getOutputStallDurationlomOqCM(attributes);
                    break;
                case 27:
                    getOutputMinFrameDuration(attributes);
                    break;
                case 28:
                    a(attributes);
                    break;
                case 29:
                    getHighSpeedVideoSizesFor(attributes);
                    break;
                case 30:
                    isOutputSupportedFor(attributes);
                    break;
                case 31:
                    toString(attributes);
                    break;
                default:
                    this.getHighResolutionOutputSizeshNQ4ISI = true;
                    this.getHighSpeedVideoSizes = 1;
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void _BOUNDARY(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (this.getHighSpeedVideoFpsRanges) {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = new java.lang.StringBuilder(str.length());
            }
            this.getOutputFormats.append(str);
        } else if (this.getHighSpeedVideoFpsRangesFor) {
            if (this.getHighSpeedVideoSizesFor == null) {
                this.getHighSpeedVideoSizesFor = new java.lang.StringBuilder(str.length());
            }
            this.getHighSpeedVideoSizesFor.append(str);
        } else if (this.Camera2StreamConfigurationMap instanceof com.caverock.androidsvg.SVG.TextContainer) {
            getHighSpeedVideoSizes(str);
        }
    }

    private void getHighSpeedVideoSizes(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.SvgConditionalContainer svgConditionalContainer = (com.caverock.androidsvg.SVG.SvgConditionalContainer) this.Camera2StreamConfigurationMap;
        int size = svgConditionalContainer.getInputSizeshNQ4ISI.size();
        com.caverock.androidsvg.SVG.SvgObject svgObject = size == 0 ? null : svgConditionalContainer.getInputSizeshNQ4ISI.get(size - 1);
        if (svgObject instanceof com.caverock.androidsvg.SVG.TextSequence) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.caverock.androidsvg.SVG.TextSequence textSequence = (com.caverock.androidsvg.SVG.TextSequence) svgObject;
            sb.append(textSequence.Camera2StreamConfigurationMap);
            sb.append(str);
            textSequence.Camera2StreamConfigurationMap = sb.toString();
            return;
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(new com.caverock.androidsvg.SVG.TextSequence(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.caverock.androidsvg.SVGParseException {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            int i = this.getHighSpeedVideoSizes - 1;
            this.getHighSpeedVideoSizes = i;
            if (i == 0) {
                this.getHighResolutionOutputSizeshNQ4ISI = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.getHighResolutionOutputSizeshNQ4ISI(str2).ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 4 && i2 != 5 && i2 != 13 && i2 != 14) {
                switch (i2) {
                    case 22:
                    case 23:
                        this.getHighSpeedVideoFpsRanges = false;
                        if (this.getOutputFormats != null) {
                            if (this.getInputFormats == com.caverock.androidsvg.SVGParser.SVGElem.title) {
                                this.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges = this.getOutputFormats.toString();
                            } else if (this.getInputFormats == com.caverock.androidsvg.SVGParser.SVGElem.desc) {
                                this.getInputSizeshNQ4ISI.Camera2StreamConfigurationMap = this.getOutputFormats.toString();
                            }
                            this.getOutputFormats.setLength(0);
                            break;
                        }
                        break;
                    case 30:
                        java.lang.StringBuilder sb = this.getHighSpeedVideoSizesFor;
                        if (sb != null) {
                            this.getHighSpeedVideoFpsRangesFor = false;
                            java.lang.String obj = sb.toString();
                            com.caverock.androidsvg.CSSParser cSSParser = new com.caverock.androidsvg.CSSParser(com.caverock.androidsvg.CSSParser.MediaType.screen, com.caverock.androidsvg.CSSParser.Source.Document);
                            com.caverock.androidsvg.SVG svg = this.getInputSizeshNQ4ISI;
                            com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner = new com.caverock.androidsvg.CSSParser.CSSTextScanner(obj);
                            cSSTextScanner.getOutputSizes();
                            svg.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(cSSParser.getHighResolutionOutputSizeshNQ4ISI(cSSTextScanner));
                            this.getHighSpeedVideoSizesFor.setLength(0);
                            break;
                        }
                        break;
                }
                return;
            }
            this.Camera2StreamConfigurationMap = ((com.caverock.androidsvg.SVG.SvgObject) this.Camera2StreamConfigurationMap).CoroutineDebuggingKt;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str2;
        java.lang.String resolveCSSStyleSheet;
        if (!str.equals("xml-stylesheet") || com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges() == null) {
            return;
        }
        if (map.get("type") == null || "text/css".equals(map.get("type"))) {
            if ((map.get("alternate") != null && !"no".equals(map.get("alternate"))) || (str2 = map.get("href")) == null || (resolveCSSStyleSheet = com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges().resolveCSSStyleSheet(str2)) == null) {
                return;
            }
            java.lang.String str3 = map.get(io.ktor.http.LinkHeader.Parameters.Media);
            if (str3 != null && !"all".equals(str3.trim())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("@media ");
                sb.append(str3);
                sb.append(" { ");
                sb.append(resolveCSSStyleSheet);
                sb.append("}");
                resolveCSSStyleSheet = sb.toString();
            }
            com.caverock.androidsvg.CSSParser cSSParser = new com.caverock.androidsvg.CSSParser(com.caverock.androidsvg.CSSParser.MediaType.screen, com.caverock.androidsvg.CSSParser.Source.Document);
            com.caverock.androidsvg.SVG svg = this.getInputSizeshNQ4ISI;
            com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner = new com.caverock.androidsvg.CSSParser.CSSTextScanner(resolveCSSStyleSheet);
            cSSTextScanner.getOutputSizes();
            svg.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(cSSParser.getHighResolutionOutputSizeshNQ4ISI(cSSTextScanner));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.util.Map<java.lang.String, java.lang.String> Camera2StreamConfigurationMap(com.caverock.androidsvg.SVGParser.TextScanner textScanner) {
        java.util.HashMap hashMap = new java.util.HashMap();
        textScanner.getOutputSizes();
        java.lang.String highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges('=', false);
        while (highSpeedVideoFpsRanges != null) {
            textScanner.Camera2StreamConfigurationMap('=');
            hashMap.put(highSpeedVideoFpsRanges, textScanner.getOutputMinFrameDuration());
            textScanner.getOutputSizes();
            highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges('=', false);
        }
        return hashMap;
    }

    private void getValidOutputFormatsForInputhNQ4ISI(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.Svg svg = new com.caverock.androidsvg.SVG.Svg();
        svg.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        svg.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(svg, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgElementBase) svg, attributes);
        getHighSpeedVideoFpsRangesFor((com.caverock.androidsvg.SVG.SvgConditional) svg, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgViewBoxContainer) svg, attributes);
        getHighSpeedVideoFpsRangesFor(svg, attributes);
        com.caverock.androidsvg.SVG.SvgContainer svgContainer = this.Camera2StreamConfigurationMap;
        if (svgContainer != null) {
            svgContainer.getHighResolutionOutputSizeshNQ4ISI(svg);
        } else {
            this.getInputSizeshNQ4ISI.getHighSpeedVideoSizes = svg;
        }
        this.Camera2StreamConfigurationMap = svg;
    }

    private static void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.Svg svg, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                svg.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 2) {
                svg.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 3) {
                svg.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                if (svg.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <svg> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                svg.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
                if (svg.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <svg> element. height cannot be negative");
                }
            } else if (i2 == 5) {
                svg.getHighSpeedVideoFpsRangesFor = trim;
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.SVGParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.caverock.androidsvg.SVGParser.SVGAttr.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.caverock.androidsvg.SVGParser.SVGAttr.x.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.y.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.width.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.height.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.version.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.href.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.preserveAspectRatio.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.d.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.pathLength.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.rx.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.ry.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.cx.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.cy.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.r.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.x1.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.y1.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.x2.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.y2.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.dx.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.dy.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.requiredFeatures.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.requiredExtensions.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.systemLanguage.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.requiredFormats.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.requiredFonts.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.refX.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.refY.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.markerWidth.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.markerHeight.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.markerUnits.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused30) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.orient.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused31) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.gradientUnits.ordinal()] = 32;
            } catch (java.lang.NoSuchFieldError unused32) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.gradientTransform.ordinal()] = 33;
            } catch (java.lang.NoSuchFieldError unused33) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.spreadMethod.ordinal()] = 34;
            } catch (java.lang.NoSuchFieldError unused34) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.fx.ordinal()] = 35;
            } catch (java.lang.NoSuchFieldError unused35) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.fy.ordinal()] = 36;
            } catch (java.lang.NoSuchFieldError unused36) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.offset.ordinal()] = 37;
            } catch (java.lang.NoSuchFieldError unused37) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.clipPathUnits.ordinal()] = 38;
            } catch (java.lang.NoSuchFieldError unused38) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.startOffset.ordinal()] = 39;
            } catch (java.lang.NoSuchFieldError unused39) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.patternUnits.ordinal()] = 40;
            } catch (java.lang.NoSuchFieldError unused40) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.patternContentUnits.ordinal()] = 41;
            } catch (java.lang.NoSuchFieldError unused41) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.patternTransform.ordinal()] = 42;
            } catch (java.lang.NoSuchFieldError unused42) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.maskUnits.ordinal()] = 43;
            } catch (java.lang.NoSuchFieldError unused43) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.maskContentUnits.ordinal()] = 44;
            } catch (java.lang.NoSuchFieldError unused44) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.style.ordinal()] = 45;
            } catch (java.lang.NoSuchFieldError unused45) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.CLASS.ordinal()] = 46;
            } catch (java.lang.NoSuchFieldError unused46) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.fill.ordinal()] = 47;
            } catch (java.lang.NoSuchFieldError unused47) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.fill_rule.ordinal()] = 48;
            } catch (java.lang.NoSuchFieldError unused48) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.fill_opacity.ordinal()] = 49;
            } catch (java.lang.NoSuchFieldError unused49) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke.ordinal()] = 50;
            } catch (java.lang.NoSuchFieldError unused50) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_opacity.ordinal()] = 51;
            } catch (java.lang.NoSuchFieldError unused51) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_width.ordinal()] = 52;
            } catch (java.lang.NoSuchFieldError unused52) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_linecap.ordinal()] = 53;
            } catch (java.lang.NoSuchFieldError unused53) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_linejoin.ordinal()] = 54;
            } catch (java.lang.NoSuchFieldError unused54) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_miterlimit.ordinal()] = 55;
            } catch (java.lang.NoSuchFieldError unused55) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_dasharray.ordinal()] = 56;
            } catch (java.lang.NoSuchFieldError unused56) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stroke_dashoffset.ordinal()] = 57;
            } catch (java.lang.NoSuchFieldError unused57) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.opacity.ordinal()] = 58;
            } catch (java.lang.NoSuchFieldError unused58) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.color.ordinal()] = 59;
            } catch (java.lang.NoSuchFieldError unused59) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.font.ordinal()] = 60;
            } catch (java.lang.NoSuchFieldError unused60) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.font_family.ordinal()] = 61;
            } catch (java.lang.NoSuchFieldError unused61) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.font_size.ordinal()] = 62;
            } catch (java.lang.NoSuchFieldError unused62) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.font_weight.ordinal()] = 63;
            } catch (java.lang.NoSuchFieldError unused63) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.font_style.ordinal()] = 64;
            } catch (java.lang.NoSuchFieldError unused64) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.text_decoration.ordinal()] = 65;
            } catch (java.lang.NoSuchFieldError unused65) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.direction.ordinal()] = 66;
            } catch (java.lang.NoSuchFieldError unused66) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.text_anchor.ordinal()] = 67;
            } catch (java.lang.NoSuchFieldError unused67) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.overflow.ordinal()] = 68;
            } catch (java.lang.NoSuchFieldError unused68) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.marker.ordinal()] = 69;
            } catch (java.lang.NoSuchFieldError unused69) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.marker_start.ordinal()] = 70;
            } catch (java.lang.NoSuchFieldError unused70) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.marker_mid.ordinal()] = 71;
            } catch (java.lang.NoSuchFieldError unused71) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.marker_end.ordinal()] = 72;
            } catch (java.lang.NoSuchFieldError unused72) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.display.ordinal()] = 73;
            } catch (java.lang.NoSuchFieldError unused73) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.visibility.ordinal()] = 74;
            } catch (java.lang.NoSuchFieldError unused74) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stop_color.ordinal()] = 75;
            } catch (java.lang.NoSuchFieldError unused75) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.stop_opacity.ordinal()] = 76;
            } catch (java.lang.NoSuchFieldError unused76) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.clip.ordinal()] = 77;
            } catch (java.lang.NoSuchFieldError unused77) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.clip_path.ordinal()] = 78;
            } catch (java.lang.NoSuchFieldError unused78) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.clip_rule.ordinal()] = 79;
            } catch (java.lang.NoSuchFieldError unused79) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.mask.ordinal()] = 80;
            } catch (java.lang.NoSuchFieldError unused80) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.solid_color.ordinal()] = 81;
            } catch (java.lang.NoSuchFieldError unused81) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.solid_opacity.ordinal()] = 82;
            } catch (java.lang.NoSuchFieldError unused82) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.viewport_fill.ordinal()] = 83;
            } catch (java.lang.NoSuchFieldError unused83) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.viewport_fill_opacity.ordinal()] = 84;
            } catch (java.lang.NoSuchFieldError unused84) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.vector_effect.ordinal()] = 85;
            } catch (java.lang.NoSuchFieldError unused85) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.image_rendering.ordinal()] = 86;
            } catch (java.lang.NoSuchFieldError unused86) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.viewBox.ordinal()] = 87;
            } catch (java.lang.NoSuchFieldError unused87) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.type.ordinal()] = 88;
            } catch (java.lang.NoSuchFieldError unused88) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.media.ordinal()] = 89;
            } catch (java.lang.NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[com.caverock.androidsvg.SVGParser.SVGElem.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr2;
            try {
                iArr2[com.caverock.androidsvg.SVGParser.SVGElem.svg.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused90) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.g.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused91) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.a.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused92) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.defs.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused93) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.use.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused94) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.path.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused95) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.rect.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused96) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.circle.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused97) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.ellipse.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused98) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.line.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused99) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.polyline.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused100) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.polygon.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused101) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.text.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused102) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.tspan.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused103) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.tref.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused104) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.SWITCH.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused105) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.symbol.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused106) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.marker.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused107) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.linearGradient.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused108) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.radialGradient.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused109) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.stop.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused110) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.title.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused111) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.desc.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused112) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.clipPath.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused113) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.textPath.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused114) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.pattern.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused115) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.image.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused116) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.view.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused117) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.mask.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused118) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.style.ordinal()] = 30;
            } catch (java.lang.NoSuchFieldError unused119) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.SVGParser.SVGElem.solidColor.ordinal()] = 31;
            } catch (java.lang.NoSuchFieldError unused120) {
            }
        }
    }

    private void getHighResolutionOutputSizeshNQ4ISI(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Group group = new com.caverock.androidsvg.SVG.Group();
        group.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        group.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) group, attributes);
        Camera2StreamConfigurationMap(group, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) group, attributes);
        getHighSpeedVideoFpsRangesFor(group, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(group);
        this.Camera2StreamConfigurationMap = group;
    }

    private void getHighSpeedVideoFpsRangesFor(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Defs defs = new com.caverock.androidsvg.SVG.Defs();
        defs.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        defs.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) defs, attributes);
        Camera2StreamConfigurationMap(defs, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) defs, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(defs);
        this.Camera2StreamConfigurationMap = defs;
    }

    private void _CREATION(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Use use = new com.caverock.androidsvg.SVG.Use();
        use.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        use.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) use, attributes);
        Camera2StreamConfigurationMap(use, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) use, attributes);
        getHighSpeedVideoFpsRangesFor(use, attributes);
        getHighResolutionOutputSizeshNQ4ISI(use, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(use);
        this.Camera2StreamConfigurationMap = use;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.Use use, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                use.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 2) {
                use.getInputFormats = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 3) {
                use.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
                if (use.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                use.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                if (use.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                use.getHighSpeedVideoFpsRangesFor = trim;
            }
        }
    }

    private void getOutputMinFrameDuration(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Image image = new com.caverock.androidsvg.SVG.Image();
        image.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        image.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) image, attributes);
        Camera2StreamConfigurationMap(image, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) image, attributes);
        getHighSpeedVideoFpsRangesFor(image, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                image.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 2) {
                image.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 3) {
                image.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
                if (image.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <use> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                image.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                if (image.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <use> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                if (i2 == 7) {
                    image.coroutineBoundary = Camera2StreamConfigurationMap(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                image.Camera2StreamConfigurationMap = trim;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(image);
        this.Camera2StreamConfigurationMap = image;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x037b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getOutputStallDuration(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        int i;
        float highSpeedVideoSizesFor;
        float highSpeedVideoSizesFor2;
        java.lang.Boolean outputFormats;
        float highSpeedVideoSizesFor3;
        boolean z;
        char c;
        float f;
        int i2;
        int i3;
        float highSpeedVideoSizesFor4;
        float highSpeedVideoSizesFor5;
        float highSpeedVideoSizesFor6;
        float highSpeedVideoSizesFor7;
        float f2;
        float f3;
        float f4;
        float f5;
        float highSpeedVideoSizesFor8;
        float highSpeedVideoSizesFor9;
        float highSpeedVideoSizesFor10;
        float highSpeedVideoSizesFor11;
        char charAt;
        org.xml.sax.Attributes attributes2 = attributes;
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Path path = new com.caverock.androidsvg.SVG.Path();
        path.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        path.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) path, attributes2);
        Camera2StreamConfigurationMap(path, attributes2);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) path, attributes2);
        getHighSpeedVideoFpsRangesFor(path, attributes2);
        int i4 = 0;
        while (i4 < attributes.getLength()) {
            java.lang.String trim = attributes2.getValue(i4).trim();
            int i5 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes2.getLocalName(i4)).ordinal()];
            byte b = 8;
            boolean z2 = false;
            if (i5 == 8) {
                com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(trim);
                com.caverock.androidsvg.SVG.PathDefinition pathDefinition = new com.caverock.androidsvg.SVG.PathDefinition();
                if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                    int intValue = textScanner.getHighSpeedVideoFpsRanges().intValue();
                    int i6 = 109;
                    if (intValue == 77 || intValue == 109) {
                        float f6 = 0.0f;
                        float f7 = 0.0f;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        float f10 = 0.0f;
                        int i7 = intValue;
                        float f11 = 0.0f;
                        while (true) {
                            textScanner.getOutputSizes();
                            float f12 = Float.NaN;
                            switch (i7) {
                                case 65:
                                case 97:
                                    i = i7;
                                    float highSpeedVideoSizesFor12 = textScanner.getHighSpeedVideoSizesFor();
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor12)) {
                                        highSpeedVideoSizesFor = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor)) {
                                        highSpeedVideoSizesFor2 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor2 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    java.lang.Boolean bool = null;
                                    if (java.lang.Float.valueOf(highSpeedVideoSizesFor2) == null) {
                                        outputFormats = null;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        outputFormats = textScanner.getOutputFormats();
                                    }
                                    if (outputFormats != null) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        bool = textScanner.getOutputFormats();
                                    }
                                    if (bool == null) {
                                        highSpeedVideoSizesFor3 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor3 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor3)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        z = false;
                                        if (highSpeedVideoSizesFor12 >= 0.0f && highSpeedVideoSizesFor >= 0.0f) {
                                            c = 'a';
                                            if (i == 97) {
                                                highSpeedVideoSizesFor3 += f11;
                                                f12 += f7;
                                            }
                                            float f13 = f12;
                                            f = highSpeedVideoSizesFor3;
                                            float f14 = highSpeedVideoSizesFor;
                                            i2 = i6;
                                            pathDefinition.getHighSpeedVideoSizes(highSpeedVideoSizesFor12, f14, highSpeedVideoSizesFor2, outputFormats.booleanValue(), bool.booleanValue(), f, f13);
                                            f7 = f13;
                                            i7 = i;
                                            f8 = f7;
                                            f11 = f;
                                            f6 = f11;
                                            textScanner.getOutputSizeshNQ4ISI();
                                            if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                                break;
                                            } else {
                                                int i8 = textScanner.Camera2StreamConfigurationMap;
                                                if (i8 != textScanner.getHighSpeedVideoSizes && (((charAt = textScanner.getHighSpeedVideoFpsRanges.charAt(i8)) >= c && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                                                    i7 = textScanner.getHighSpeedVideoFpsRanges().intValue();
                                                }
                                                i6 = i2;
                                                z2 = z;
                                                b = 8;
                                            }
                                        }
                                    }
                                    break;
                                case 67:
                                case 99:
                                    i3 = i7;
                                    float highSpeedVideoSizesFor13 = textScanner.getHighSpeedVideoSizesFor();
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor13)) {
                                        highSpeedVideoSizesFor4 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor4 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor4)) {
                                        highSpeedVideoSizesFor5 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor5 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor5)) {
                                        highSpeedVideoSizesFor6 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor6 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor6)) {
                                        highSpeedVideoSizesFor7 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor7 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor7)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        if (i3 == 99) {
                                            highSpeedVideoSizesFor7 += f11;
                                            f12 += f7;
                                            highSpeedVideoSizesFor13 += f11;
                                            highSpeedVideoSizesFor4 += f7;
                                            highSpeedVideoSizesFor5 += f11;
                                            highSpeedVideoSizesFor6 += f7;
                                        }
                                        float f15 = highSpeedVideoSizesFor4;
                                        f2 = highSpeedVideoSizesFor7;
                                        f3 = f12;
                                        float f16 = highSpeedVideoSizesFor13;
                                        f4 = highSpeedVideoSizesFor5;
                                        f5 = highSpeedVideoSizesFor6;
                                        pathDefinition.getHighSpeedVideoFpsRanges(f16, f15, f4, f5, f2, f3);
                                        f8 = f5;
                                        f7 = f3;
                                        f6 = f4;
                                        i7 = i3;
                                        i2 = i6;
                                        f11 = f2;
                                        c = 'a';
                                        z = false;
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 72:
                                case 104:
                                    int i9 = i7;
                                    float highSpeedVideoSizesFor14 = textScanner.getHighSpeedVideoSizesFor();
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor14)) {
                                        break;
                                    } else {
                                        if (i9 == 104) {
                                            highSpeedVideoSizesFor14 += f11;
                                        }
                                        pathDefinition.getHighSpeedVideoFpsRanges(highSpeedVideoSizesFor14, f7);
                                        f11 = highSpeedVideoSizesFor14;
                                        f6 = f11;
                                        i7 = i9;
                                        i2 = i6;
                                        c = 'a';
                                        z = false;
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 76:
                                case 108:
                                    i = i7;
                                    float highSpeedVideoSizesFor15 = textScanner.getHighSpeedVideoSizesFor();
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor15)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        if (i == 108) {
                                            highSpeedVideoSizesFor15 += f11;
                                            f12 += f7;
                                        }
                                        float f17 = f12;
                                        pathDefinition.getHighSpeedVideoFpsRanges(highSpeedVideoSizesFor15, f17);
                                        f = highSpeedVideoSizesFor15;
                                        f7 = f17;
                                        i2 = i6;
                                        c = 'a';
                                        z = false;
                                        i7 = i;
                                        f8 = f7;
                                        f11 = f;
                                        f6 = f11;
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 77:
                                case 109:
                                    int i10 = i7;
                                    float highSpeedVideoSizesFor16 = textScanner.getHighSpeedVideoSizesFor();
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor16)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        if (i10 == i6 && pathDefinition.getHighSpeedVideoSizes != 0) {
                                            highSpeedVideoSizesFor16 += f11;
                                            f12 += f7;
                                        }
                                        f7 = f12;
                                        pathDefinition.getHighSpeedVideoSizes(highSpeedVideoSizesFor16, f7);
                                        i7 = i10 == i6 ? 108 : 76;
                                        f11 = highSpeedVideoSizesFor16;
                                        f6 = f11;
                                        f9 = f6;
                                        f8 = f7;
                                        f10 = f8;
                                        i2 = i6;
                                        c = 'a';
                                        z = false;
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 81:
                                case 113:
                                    int i11 = i7;
                                    float highSpeedVideoSizesFor17 = textScanner.getHighSpeedVideoSizesFor();
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor17)) {
                                        highSpeedVideoSizesFor8 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor8 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor8)) {
                                        highSpeedVideoSizesFor9 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor9 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor9)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        if (i11 == 113) {
                                            highSpeedVideoSizesFor9 += f11;
                                            f12 += f7;
                                            highSpeedVideoSizesFor17 += f11;
                                            highSpeedVideoSizesFor8 += f7;
                                        }
                                        f7 = f12;
                                        pathDefinition.Camera2StreamConfigurationMap(highSpeedVideoSizesFor17, highSpeedVideoSizesFor8, highSpeedVideoSizesFor9, f7);
                                        i7 = i11;
                                        f11 = highSpeedVideoSizesFor9;
                                        c = 'a';
                                        z = false;
                                        f8 = highSpeedVideoSizesFor8;
                                        f6 = highSpeedVideoSizesFor17;
                                        i2 = i6;
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 83:
                                case 115:
                                    f4 = textScanner.getHighSpeedVideoSizesFor();
                                    if (java.lang.Float.isNaN(f4)) {
                                        highSpeedVideoSizesFor10 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor10 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor10)) {
                                        highSpeedVideoSizesFor11 = Float.NaN;
                                    } else {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        highSpeedVideoSizesFor11 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor11)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        if (i7 == 115) {
                                            highSpeedVideoSizesFor11 += f11;
                                            f12 += f7;
                                            f4 += f11;
                                            highSpeedVideoSizesFor10 += f7;
                                        }
                                        f2 = highSpeedVideoSizesFor11;
                                        f3 = f12;
                                        f5 = highSpeedVideoSizesFor10;
                                        i3 = i7;
                                        pathDefinition.getHighSpeedVideoFpsRanges((f11 * 2.0f) - f6, (f7 * 2.0f) - f8, f4, f5, f2, f3);
                                        f8 = f5;
                                        f7 = f3;
                                        f6 = f4;
                                        i7 = i3;
                                        i2 = i6;
                                        f11 = f2;
                                        c = 'a';
                                        z = false;
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 84:
                                case 116:
                                    float f18 = (f11 * 2.0f) - f6;
                                    f8 = (2.0f * f7) - f8;
                                    float highSpeedVideoSizesFor18 = textScanner.getHighSpeedVideoSizesFor();
                                    if (!java.lang.Float.isNaN(highSpeedVideoSizesFor18)) {
                                        textScanner.getOutputSizeshNQ4ISI();
                                        f12 = textScanner.getHighSpeedVideoSizesFor();
                                    }
                                    if (java.lang.Float.isNaN(f12)) {
                                        break;
                                    } else {
                                        if (i7 == 116) {
                                            highSpeedVideoSizesFor18 += f11;
                                            f12 += f7;
                                        }
                                        f7 = f12;
                                        pathDefinition.Camera2StreamConfigurationMap(f18, f8, highSpeedVideoSizesFor18, f7);
                                        z = z2;
                                        f11 = highSpeedVideoSizesFor18;
                                        f6 = f18;
                                        i2 = i6;
                                        c = 'a';
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 86:
                                case 118:
                                    float highSpeedVideoSizesFor19 = textScanner.getHighSpeedVideoSizesFor();
                                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor19)) {
                                        break;
                                    } else {
                                        if (i7 == 118) {
                                            highSpeedVideoSizesFor19 += f7;
                                        }
                                        pathDefinition.getHighSpeedVideoFpsRanges(f11, highSpeedVideoSizesFor19);
                                        f7 = highSpeedVideoSizesFor19;
                                        z = z2;
                                        f8 = f7;
                                        i2 = i6;
                                        c = 'a';
                                        textScanner.getOutputSizeshNQ4ISI();
                                        if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                        }
                                    }
                                    break;
                                case 90:
                                case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                                    pathDefinition.getHighSpeedVideoSizes(b);
                                    f11 = f9;
                                    f6 = f11;
                                    f7 = f10;
                                    z = z2;
                                    f8 = f7;
                                    i2 = i6;
                                    c = 'a';
                                    textScanner.getOutputSizeshNQ4ISI();
                                    if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                                    }
                                    break;
                            }
                        }
                    }
                }
                path.getHighResolutionOutputSizeshNQ4ISI = pathDefinition;
            } else if (i5 != 9) {
                continue;
            } else {
                int length = trim.length();
                if (length != 0) {
                    path.getHighSpeedVideoFpsRangesFor = java.lang.Float.valueOf(getHighResolutionOutputSizeshNQ4ISI(trim, length));
                    if (path.getHighSpeedVideoFpsRangesFor.floatValue() < 0.0f) {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid <path> element. pathLength cannot be negative");
                    }
                } else {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid float value (empty string)");
                }
            }
            i4++;
            attributes2 = attributes;
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(path);
    }

    private void unwrapAs(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Rect rect = new com.caverock.androidsvg.SVG.Rect();
        rect.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        rect.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) rect, attributes);
        Camera2StreamConfigurationMap(rect, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) rect, attributes);
        getHighSpeedVideoFpsRangesFor(rect, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                rect.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 2) {
                rect.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 3) {
                rect.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
                if (rect.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <rect> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                rect.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                if (rect.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <rect> element. height cannot be negative");
                }
            } else if (i2 == 10) {
                rect.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
                if (rect.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i2 == 11) {
                rect.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
                if (rect.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <rect> element. ry cannot be negative");
                }
            } else {
                continue;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(rect);
    }

    private void getHighSpeedVideoFpsRanges(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Circle circle = new com.caverock.androidsvg.SVG.Circle();
        circle.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        circle.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) circle, attributes);
        Camera2StreamConfigurationMap(circle, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) circle, attributes);
        getHighSpeedVideoFpsRangesFor(circle, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()]) {
                case 12:
                    circle.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 13:
                    circle.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 14:
                    circle.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                    if (circle.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges < 0.0f) {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid <circle> element. r cannot be negative");
                    }
                    break;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(circle);
    }

    private void Camera2StreamConfigurationMap(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Ellipse ellipse = new com.caverock.androidsvg.SVG.Ellipse();
        ellipse.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        ellipse.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) ellipse, attributes);
        Camera2StreamConfigurationMap(ellipse, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) ellipse, attributes);
        getHighSpeedVideoFpsRangesFor(ellipse, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()]) {
                case 10:
                    ellipse.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                    if (ellipse.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges < 0.0f) {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                case 11:
                    ellipse.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
                    if (ellipse.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges < 0.0f) {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                case 12:
                    ellipse.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 13:
                    ellipse.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                    break;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(ellipse);
    }

    private void getOutputFormats(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Line line = new com.caverock.androidsvg.SVG.Line();
        line.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        line.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) line, attributes);
        Camera2StreamConfigurationMap(line, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) line, attributes);
        getHighSpeedVideoFpsRangesFor(line, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    line.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 16:
                    line.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 17:
                    line.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 18:
                    line.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
                    break;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(line);
    }

    private void getOutputMinFrameDurationlomOqCM(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.PolyLine polyLine = new com.caverock.androidsvg.SVG.PolyLine();
        polyLine.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        polyLine.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) polyLine, attributes);
        Camera2StreamConfigurationMap(polyLine, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) polyLine, attributes);
        getHighSpeedVideoFpsRangesFor(polyLine, attributes);
        Camera2StreamConfigurationMap(polyLine, attributes, "polyline");
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(polyLine);
    }

    private static void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.PolyLine polyLine, org.xml.sax.Attributes attributes, java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)) == com.caverock.androidsvg.SVGParser.SVGAttr.points) {
                com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(attributes.getValue(i));
                java.util.ArrayList arrayList = new java.util.ArrayList();
                textScanner.getOutputSizes();
                while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                    float highSpeedVideoSizesFor = textScanner.getHighSpeedVideoSizesFor();
                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid <");
                        sb.append(str);
                        sb.append("> points attribute. Non-coordinate content found in list.");
                        throw new com.caverock.androidsvg.SVGParseException(sb.toString());
                    }
                    textScanner.getOutputSizeshNQ4ISI();
                    float highSpeedVideoSizesFor2 = textScanner.getHighSpeedVideoSizesFor();
                    if (java.lang.Float.isNaN(highSpeedVideoSizesFor2)) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Invalid <");
                        sb2.append(str);
                        sb2.append("> points attribute. There should be an even number of coordinates.");
                        throw new com.caverock.androidsvg.SVGParseException(sb2.toString());
                    }
                    textScanner.getOutputSizeshNQ4ISI();
                    arrayList.add(java.lang.Float.valueOf(highSpeedVideoSizesFor));
                    arrayList.add(java.lang.Float.valueOf(highSpeedVideoSizesFor2));
                }
                polyLine.getHighResolutionOutputSizeshNQ4ISI = new float[arrayList.size()];
                java.util.Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    polyLine.getHighResolutionOutputSizeshNQ4ISI[i2] = ((java.lang.Float) it.next()).floatValue();
                    i2++;
                }
            }
        }
    }

    private void getOutputSizes(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Polygon polygon = new com.caverock.androidsvg.SVG.Polygon();
        polygon.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        polygon.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) polygon, attributes);
        Camera2StreamConfigurationMap(polygon, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) polygon, attributes);
        getHighSpeedVideoFpsRangesFor(polygon, attributes);
        Camera2StreamConfigurationMap(polygon, attributes, "polygon");
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(polygon);
    }

    private void accessartificialFrame(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Text text = new com.caverock.androidsvg.SVG.Text();
        text.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        text.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) text, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgElementBase) text, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) text, attributes);
        getHighSpeedVideoFpsRangesFor(text, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.TextPositionedContainer) text, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(text);
        this.Camera2StreamConfigurationMap = text;
    }

    private static void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.TextPositionedContainer textPositionedContainer, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                textPositionedContainer.getHighSpeedVideoSizes = getOutputStallDurationlomOqCM(trim);
            } else if (i2 == 2) {
                textPositionedContainer.getHighSpeedVideoFpsRangesFor = getOutputStallDurationlomOqCM(trim);
            } else if (i2 == 19) {
                textPositionedContainer.getHighSpeedVideoFpsRanges = getOutputStallDurationlomOqCM(trim);
            } else if (i2 == 20) {
                textPositionedContainer.getHighResolutionOutputSizeshNQ4ISI = getOutputStallDurationlomOqCM(trim);
            }
        }
    }

    private void CoroutineDebuggingKt(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.SvgContainer svgContainer = this.Camera2StreamConfigurationMap;
        if (svgContainer == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof com.caverock.androidsvg.SVG.TextContainer)) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        com.caverock.androidsvg.SVG.TSpan tSpan = new com.caverock.androidsvg.SVG.TSpan();
        tSpan.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        tSpan.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(tSpan, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgElementBase) tSpan, attributes);
        getHighSpeedVideoFpsRangesFor(tSpan, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.TextPositionedContainer) tSpan, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(tSpan);
        this.Camera2StreamConfigurationMap = tSpan;
        if (tSpan.CoroutineDebuggingKt instanceof com.caverock.androidsvg.SVG.TextRoot) {
            tSpan.Camera2StreamConfigurationMap = (com.caverock.androidsvg.SVG.TextRoot) tSpan.CoroutineDebuggingKt;
        } else {
            tSpan.Camera2StreamConfigurationMap = ((com.caverock.androidsvg.SVG.TextChild) tSpan.CoroutineDebuggingKt).getOutputMinFrameDuration();
        }
    }

    private void coroutineBoundary(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.SvgContainer svgContainer = this.Camera2StreamConfigurationMap;
        if (svgContainer == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof com.caverock.androidsvg.SVG.TextContainer)) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        com.caverock.androidsvg.SVG.TRef tRef = new com.caverock.androidsvg.SVG.TRef();
        tRef.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        tRef.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) tRef, attributes);
        Camera2StreamConfigurationMap(tRef, attributes);
        getHighSpeedVideoFpsRangesFor(tRef, attributes);
        getHighResolutionOutputSizeshNQ4ISI(tRef, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(tRef);
        if (tRef.CoroutineDebuggingKt instanceof com.caverock.androidsvg.SVG.TextRoot) {
            tRef.getHighSpeedVideoSizes = (com.caverock.androidsvg.SVG.TextRoot) tRef.CoroutineDebuggingKt;
        } else {
            tRef.getHighSpeedVideoSizes = ((com.caverock.androidsvg.SVG.TextChild) tRef.CoroutineDebuggingKt).getOutputMinFrameDuration();
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.TRef tRef, org.xml.sax.Attributes attributes) {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            if (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()] == 6 && ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i)))) {
                tRef.getHighSpeedVideoFpsRanges = trim;
            }
        }
    }

    private void b(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Switch r0 = new com.caverock.androidsvg.SVG.Switch();
        r0.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        r0.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) r0, attributes);
        Camera2StreamConfigurationMap(r0, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) r0, attributes);
        getHighSpeedVideoFpsRangesFor(r0, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(r0);
        this.Camera2StreamConfigurationMap = r0;
    }

    private static void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.SvgConditional svgConditional, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()]) {
                case 21:
                    svgConditional.getHighSpeedVideoFpsRanges(isOutputSupportedForhNQ4ISI(trim));
                    break;
                case 22:
                    svgConditional.getHighSpeedVideoFpsRanges(trim);
                    break;
                case 23:
                    svgConditional.getHighSpeedVideoSizes(ArtificialStackFrames(trim));
                    break;
                case 24:
                    svgConditional.Camera2StreamConfigurationMap(isOutputSupportedFor(trim));
                    break;
                case 25:
                    java.util.List<java.lang.String> highSpeedVideoSizesFor = getHighSpeedVideoSizesFor(trim);
                    svgConditional.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizesFor != null ? new java.util.HashSet(highSpeedVideoSizesFor) : new java.util.HashSet(0));
                    break;
            }
        }
    }

    private void coroutineCreation(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Symbol symbol = new com.caverock.androidsvg.SVG.Symbol();
        symbol.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        symbol.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(symbol, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgElementBase) symbol, attributes);
        getHighSpeedVideoFpsRangesFor(symbol, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgViewBoxContainer) symbol, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(symbol);
        this.Camera2StreamConfigurationMap = symbol;
    }

    private void getInputFormats(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Marker marker = new com.caverock.androidsvg.SVG.Marker();
        marker.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        marker.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(marker, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgElementBase) marker, attributes);
        getHighSpeedVideoFpsRangesFor(marker, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgViewBoxContainer) marker, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()]) {
                case 26:
                    marker.getHighResolutionOutputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 27:
                    marker.getOutputFormats = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 28:
                    marker.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                    if (marker.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges < 0.0f) {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                case 29:
                    marker.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                    if (marker.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges < 0.0f) {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                case 30:
                    if ("strokeWidth".equals(trim)) {
                        marker.getHighSpeedVideoFpsRanges = false;
                        break;
                    } else if ("userSpaceOnUse".equals(trim)) {
                        marker.getHighSpeedVideoFpsRanges = true;
                        break;
                    } else {
                        throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute markerUnits");
                    }
                case 31:
                    if (kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(trim)) {
                        marker.getHighSpeedVideoSizes = java.lang.Float.valueOf(Float.NaN);
                        break;
                    } else {
                        int length = trim.length();
                        if (length != 0) {
                            marker.getHighSpeedVideoSizes = java.lang.Float.valueOf(getHighResolutionOutputSizeshNQ4ISI(trim, length));
                            break;
                        } else {
                            throw new com.caverock.androidsvg.SVGParseException("Invalid float value (empty string)");
                        }
                    }
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(marker);
        this.Camera2StreamConfigurationMap = marker;
    }

    private void getInputSizeshNQ4ISI(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.SvgLinearGradient svgLinearGradient = new com.caverock.androidsvg.SVG.SvgLinearGradient();
        svgLinearGradient.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        svgLinearGradient.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(svgLinearGradient, attributes);
        Camera2StreamConfigurationMap(svgLinearGradient, attributes);
        getHighSpeedVideoFpsRanges(svgLinearGradient, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()]) {
                case 15:
                    svgLinearGradient.getInputFormats = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 16:
                    svgLinearGradient.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 17:
                    svgLinearGradient.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges(trim);
                    break;
                case 18:
                    svgLinearGradient.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(trim);
                    break;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(svgLinearGradient);
        this.Camera2StreamConfigurationMap = svgLinearGradient;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.GradientElement gradientElement, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                switch (i2) {
                    case 32:
                        if ("objectBoundingBox".equals(trim)) {
                            gradientElement.Camera2StreamConfigurationMap = java.lang.Boolean.FALSE;
                            break;
                        } else if ("userSpaceOnUse".equals(trim)) {
                            gradientElement.Camera2StreamConfigurationMap = java.lang.Boolean.TRUE;
                            break;
                        } else {
                            throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute gradientUnits");
                        }
                    case 33:
                        gradientElement.getHighSpeedVideoFpsRanges = getARTIFICIAL_FRAME_PACKAGE_NAME(trim);
                        break;
                    case 34:
                        try {
                            gradientElement.getHighSpeedVideoFpsRangesFor = com.caverock.androidsvg.SVG.GradientSpread.valueOf(trim);
                            break;
                        } catch (java.lang.IllegalArgumentException unused) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid spreadMethod attribute. \"");
                            sb.append(trim);
                            sb.append("\" is not a valid value.");
                            throw new com.caverock.androidsvg.SVGParseException(sb.toString());
                        }
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                gradientElement.getHighResolutionOutputSizeshNQ4ISI = trim;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getOutputSizeshNQ4ISI(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.SvgRadialGradient svgRadialGradient = new com.caverock.androidsvg.SVG.SvgRadialGradient();
        svgRadialGradient.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        svgRadialGradient.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(svgRadialGradient, attributes);
        Camera2StreamConfigurationMap(svgRadialGradient, attributes);
        getHighSpeedVideoFpsRanges(svgRadialGradient, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 35) {
                svgRadialGradient.getOutputMinFrameDuration = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 != 36) {
                switch (i2) {
                    case 12:
                        svgRadialGradient.getOutputFormats = getHighSpeedVideoFpsRanges(trim);
                        break;
                    case 13:
                        svgRadialGradient.getInputFormats = getHighSpeedVideoFpsRanges(trim);
                        break;
                    case 14:
                        svgRadialGradient.getInputSizeshNQ4ISI = getHighSpeedVideoFpsRanges(trim);
                        if (svgRadialGradient.getInputSizeshNQ4ISI.getHighSpeedVideoFpsRanges < 0.0f) {
                            throw new com.caverock.androidsvg.SVGParseException("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                }
            } else {
                svgRadialGradient.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(trim);
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(svgRadialGradient);
        this.Camera2StreamConfigurationMap = svgRadialGradient;
    }

    private void isOutputSupportedForhNQ4ISI(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVG.SvgContainer svgContainer = this.Camera2StreamConfigurationMap;
        if (svgContainer == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        if (!(svgContainer instanceof com.caverock.androidsvg.SVG.GradientElement)) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        com.caverock.androidsvg.SVG.Stop stop = new com.caverock.androidsvg.SVG.Stop();
        stop.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        stop.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(stop, attributes);
        Camera2StreamConfigurationMap(stop, attributes);
        getHighSpeedVideoFpsRanges(stop, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(stop);
        this.Camera2StreamConfigurationMap = stop;
    }

    private static void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.Stop stop, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            if (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()] == 37) {
                stop.getHighSpeedVideoFpsRanges = getOutputSizes(trim);
            }
        }
    }

    private static java.lang.Float getOutputSizes(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        if (str.length() == 0) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z = false;
        }
        try {
            float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, length);
            float f = 100.0f;
            if (z) {
                highResolutionOutputSizeshNQ4ISI /= 100.0f;
            }
            if (highResolutionOutputSizeshNQ4ISI < 0.0f) {
                f = 0.0f;
            } else if (highResolutionOutputSizeshNQ4ISI <= 100.0f) {
                f = highResolutionOutputSizeshNQ4ISI;
            }
            return java.lang.Float.valueOf(f);
        } catch (java.lang.NumberFormatException e) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid offset value in <stop>: ".concat(java.lang.String.valueOf(str)), e);
        }
    }

    private void toString(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.SolidColor solidColor = new com.caverock.androidsvg.SVG.SolidColor();
        solidColor.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        solidColor.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(solidColor, attributes);
        Camera2StreamConfigurationMap(solidColor, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(solidColor);
        this.Camera2StreamConfigurationMap = solidColor;
    }

    private void getHighSpeedVideoSizes(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.ClipPath clipPath = new com.caverock.androidsvg.SVG.ClipPath();
        clipPath.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        clipPath.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.SvgElementBase) clipPath, attributes);
        Camera2StreamConfigurationMap(clipPath, attributes);
        getHighResolutionOutputSizeshNQ4ISI((com.caverock.androidsvg.SVG.HasTransform) clipPath, attributes);
        getHighSpeedVideoFpsRangesFor(clipPath, attributes);
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            if (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(trim)) {
                    clipPath.Camera2StreamConfigurationMap = java.lang.Boolean.FALSE;
                } else if ("userSpaceOnUse".equals(trim)) {
                    clipPath.Camera2StreamConfigurationMap = java.lang.Boolean.TRUE;
                } else {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute clipPathUnits");
                }
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(clipPath);
        this.Camera2StreamConfigurationMap = clipPath;
    }

    private void ArtificialStackFrames(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.TextPath textPath = new com.caverock.androidsvg.SVG.TextPath();
        textPath.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        textPath.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(textPath, attributes);
        Camera2StreamConfigurationMap(textPath, attributes);
        getHighSpeedVideoFpsRangesFor(textPath, attributes);
        getHighSpeedVideoFpsRanges(textPath, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(textPath);
        this.Camera2StreamConfigurationMap = textPath;
        if (textPath.CoroutineDebuggingKt instanceof com.caverock.androidsvg.SVG.TextRoot) {
            textPath.getHighResolutionOutputSizeshNQ4ISI = (com.caverock.androidsvg.SVG.TextRoot) textPath.CoroutineDebuggingKt;
        } else {
            textPath.getHighResolutionOutputSizeshNQ4ISI = ((com.caverock.androidsvg.SVG.TextChild) textPath.CoroutineDebuggingKt).getOutputMinFrameDuration();
        }
    }

    private static void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.SVG.TextPath textPath, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 != 6) {
                if (i2 == 39) {
                    textPath.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                textPath.getHighSpeedVideoFpsRangesFor = trim;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ef, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getOutputStallDurationlomOqCM(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Pattern pattern = new com.caverock.androidsvg.SVG.Pattern();
        pattern.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        pattern.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(pattern, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgElementBase) pattern, attributes);
        getHighSpeedVideoFpsRangesFor(pattern, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgViewBoxContainer) pattern, attributes);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                pattern.getOutputFormats = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 2) {
                pattern.getHighSpeedVideoSizesFor = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 3) {
                pattern.getInputFormats = getHighSpeedVideoFpsRanges(trim);
                if (pattern.getInputFormats.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                pattern.getHighSpeedVideoSizes = getHighSpeedVideoFpsRanges(trim);
                if (pattern.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i2 != 6) {
                switch (i2) {
                    case 40:
                        if ("objectBoundingBox".equals(trim)) {
                            pattern.getHighSpeedVideoFpsRangesFor = bool;
                            break;
                        } else if ("userSpaceOnUse".equals(trim)) {
                            pattern.getHighSpeedVideoFpsRangesFor = java.lang.Boolean.TRUE;
                            break;
                        } else {
                            throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute patternUnits");
                        }
                    case 41:
                        if ("objectBoundingBox".equals(trim)) {
                            pattern.getHighResolutionOutputSizeshNQ4ISI = bool;
                            break;
                        } else if ("userSpaceOnUse".equals(trim)) {
                            pattern.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.TRUE;
                            break;
                        } else {
                            throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute patternContentUnits");
                        }
                    case 42:
                        pattern.getHighSpeedVideoFpsRanges = getARTIFICIAL_FRAME_PACKAGE_NAME(trim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i))) {
                pattern.Camera2StreamConfigurationMap = trim;
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(pattern);
        this.Camera2StreamConfigurationMap = pattern;
    }

    private void a(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.View view = new com.caverock.androidsvg.SVG.View();
        view.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        view.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(view, attributes);
        getHighSpeedVideoFpsRangesFor(view, attributes);
        Camera2StreamConfigurationMap((com.caverock.androidsvg.SVG.SvgViewBoxContainer) view, attributes);
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(view);
        this.Camera2StreamConfigurationMap = view;
    }

    private void getHighSpeedVideoSizesFor(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        com.caverock.androidsvg.SVG.Mask mask = new com.caverock.androidsvg.SVG.Mask();
        mask.ArtificialStackFrames = this.getInputSizeshNQ4ISI;
        mask.CoroutineDebuggingKt = this.Camera2StreamConfigurationMap;
        getHighResolutionOutputSizeshNQ4ISI(mask, attributes);
        Camera2StreamConfigurationMap(mask, attributes);
        getHighSpeedVideoFpsRangesFor(mask, attributes);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 1) {
                mask.getHighSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 2) {
                mask.getInputFormats = getHighSpeedVideoFpsRanges(trim);
            } else if (i2 == 3) {
                mask.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRanges(trim);
                if (mask.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <mask> element. width cannot be negative");
                }
            } else if (i2 == 4) {
                mask.getHighSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRanges(trim);
                if (mask.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges < 0.0f) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid <mask> element. height cannot be negative");
                }
            } else if (i2 != 43) {
                if (i2 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(trim)) {
                    mask.getHighResolutionOutputSizeshNQ4ISI = bool;
                } else if ("userSpaceOnUse".equals(trim)) {
                    mask.getHighResolutionOutputSizeshNQ4ISI = java.lang.Boolean.TRUE;
                } else {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute maskContentUnits");
                }
            } else if ("objectBoundingBox".equals(trim)) {
                mask.getHighSpeedVideoSizes = bool;
            } else if ("userSpaceOnUse".equals(trim)) {
                mask.getHighSpeedVideoSizes = java.lang.Boolean.TRUE;
            } else {
                throw new com.caverock.androidsvg.SVGParseException("Invalid value for attribute maskUnits");
            }
        }
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(mask);
        this.Camera2StreamConfigurationMap = mask;
    }

    static class TextScanner {
        int Camera2StreamConfigurationMap = 0;
        private com.caverock.androidsvg.NumberParser getHighResolutionOutputSizeshNQ4ISI = new com.caverock.androidsvg.NumberParser();
        java.lang.String getHighSpeedVideoFpsRanges;
        int getHighSpeedVideoSizes;

        static boolean getHighSpeedVideoFpsRanges(int i) {
            return i == 32 || i == 10 || i == 13 || i == 9;
        }

        static boolean getHighSpeedVideoFpsRangesFor(int i) {
            return i == 10 || i == 13;
        }

        TextScanner(java.lang.String str) {
            this.getHighSpeedVideoSizes = 0;
            java.lang.String trim = str.trim();
            this.getHighSpeedVideoFpsRanges = trim;
            this.getHighSpeedVideoSizes = trim.length();
        }

        final void getOutputSizes() {
            while (true) {
                int i = this.Camera2StreamConfigurationMap;
                if (i >= this.getHighSpeedVideoSizes) {
                    return;
                }
                char charAt = this.getHighSpeedVideoFpsRanges.charAt(i);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    return;
                } else {
                    this.Camera2StreamConfigurationMap++;
                }
            }
        }

        final boolean getOutputSizeshNQ4ISI() {
            getOutputSizes();
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes || this.getHighSpeedVideoFpsRanges.charAt(i) != ',') {
                return false;
            }
            this.Camera2StreamConfigurationMap++;
            getOutputSizes();
            return true;
        }

        final float getHighSpeedVideoSizesFor() {
            float highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            if (!java.lang.Float.isNaN(highSpeedVideoFpsRanges)) {
                this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            }
            return highSpeedVideoFpsRanges;
        }

        final float getOutputStallDurationlomOqCM() {
            getOutputSizeshNQ4ISI();
            float highSpeedVideoFpsRanges = this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
            if (!java.lang.Float.isNaN(highSpeedVideoFpsRanges)) {
                this.Camera2StreamConfigurationMap = this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            }
            return highSpeedVideoFpsRanges;
        }

        final java.lang.Integer getHighSpeedVideoFpsRanges() {
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes) {
                return null;
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            this.Camera2StreamConfigurationMap = i + 1;
            return java.lang.Integer.valueOf(str.charAt(i));
        }

        final com.caverock.androidsvg.SVG.Length getInputSizeshNQ4ISI() {
            float highSpeedVideoSizesFor = getHighSpeedVideoSizesFor();
            if (java.lang.Float.isNaN(highSpeedVideoSizesFor)) {
                return null;
            }
            com.caverock.androidsvg.SVG.Unit outputStallDuration = getOutputStallDuration();
            if (outputStallDuration == null) {
                return new com.caverock.androidsvg.SVG.Length(highSpeedVideoSizesFor, com.caverock.androidsvg.SVG.Unit.px);
            }
            return new com.caverock.androidsvg.SVG.Length(highSpeedVideoSizesFor, outputStallDuration);
        }

        final java.lang.Boolean getOutputFormats() {
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes) {
                return null;
            }
            char charAt = this.getHighSpeedVideoFpsRanges.charAt(i);
            if (charAt != '0' && charAt != '1') {
                return null;
            }
            this.Camera2StreamConfigurationMap++;
            return java.lang.Boolean.valueOf(charAt == '1');
        }

        final boolean Camera2StreamConfigurationMap(char c) {
            int i = this.Camera2StreamConfigurationMap;
            boolean z = i < this.getHighSpeedVideoSizes && this.getHighSpeedVideoFpsRanges.charAt(i) == c;
            if (z) {
                this.Camera2StreamConfigurationMap++;
            }
            return z;
        }

        final boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
            int length = str.length();
            int i = this.Camera2StreamConfigurationMap;
            boolean z = i <= this.getHighSpeedVideoSizes - length && this.getHighSpeedVideoFpsRanges.substring(i, i + length).equals(str);
            if (z) {
                this.Camera2StreamConfigurationMap += length;
            }
            return z;
        }

        final int getHighSpeedVideoSizes() {
            int i = this.Camera2StreamConfigurationMap;
            int i2 = this.getHighSpeedVideoSizes;
            if (i == i2) {
                return -1;
            }
            int i3 = i + 1;
            this.Camera2StreamConfigurationMap = i3;
            if (i3 < i2) {
                return this.getHighSpeedVideoFpsRanges.charAt(i3);
            }
            return -1;
        }

        final java.lang.String getHighSpeedVideoFpsRangesFor() {
            char charAt;
            int i = this.Camera2StreamConfigurationMap;
            while (true) {
                int i2 = this.Camera2StreamConfigurationMap;
                if (i2 != this.getHighSpeedVideoSizes && (charAt = this.getHighSpeedVideoFpsRanges.charAt(i2)) != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.Camera2StreamConfigurationMap++;
                }
            }
            java.lang.String substring = this.getHighSpeedVideoFpsRanges.substring(i, this.Camera2StreamConfigurationMap);
            this.Camera2StreamConfigurationMap = i;
            return substring;
        }

        final java.lang.String getInputFormats() {
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes) {
                return null;
            }
            int charAt = this.getHighSpeedVideoFpsRanges.charAt(i);
            while (true) {
                if ((charAt < 97 || charAt > 122) && (charAt < 65 || charAt > 90)) {
                    break;
                }
                charAt = getHighSpeedVideoSizes();
            }
            int i2 = this.Camera2StreamConfigurationMap;
            while (true) {
                if (charAt != 32 && charAt != 10 && charAt != 13 && charAt != 9) {
                    break;
                }
                charAt = getHighSpeedVideoSizes();
            }
            if (charAt == 40) {
                this.Camera2StreamConfigurationMap++;
                return this.getHighSpeedVideoFpsRanges.substring(i, i2);
            }
            this.Camera2StreamConfigurationMap = i;
            return null;
        }

        final java.lang.String getOutputMinFrameDuration() {
            int highSpeedVideoSizes;
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes) {
                return null;
            }
            char charAt = this.getHighSpeedVideoFpsRanges.charAt(i);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            do {
                highSpeedVideoSizes = getHighSpeedVideoSizes();
                if (highSpeedVideoSizes == -1) {
                    break;
                }
            } while (highSpeedVideoSizes != charAt);
            if (highSpeedVideoSizes == -1) {
                this.Camera2StreamConfigurationMap = i;
                return null;
            }
            int i2 = this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = i2 + 1;
            return this.getHighSpeedVideoFpsRanges.substring(i + 1, i2);
        }

        final java.lang.String getHighSpeedVideoFpsRanges(char c, boolean z) {
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes) {
                return null;
            }
            char charAt = this.getHighSpeedVideoFpsRanges.charAt(i);
            if ((!z && (charAt == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) || charAt == c) {
                return null;
            }
            int i2 = this.Camera2StreamConfigurationMap;
            int highSpeedVideoSizes = getHighSpeedVideoSizes();
            while (highSpeedVideoSizes != -1 && highSpeedVideoSizes != c && (z || (highSpeedVideoSizes != 32 && highSpeedVideoSizes != 10 && highSpeedVideoSizes != 13 && highSpeedVideoSizes != 9))) {
                highSpeedVideoSizes = getHighSpeedVideoSizes();
            }
            return this.getHighSpeedVideoFpsRanges.substring(i2, this.Camera2StreamConfigurationMap);
        }

        final com.caverock.androidsvg.SVG.Unit getOutputStallDuration() {
            int i = this.Camera2StreamConfigurationMap;
            if (i == this.getHighSpeedVideoSizes) {
                return null;
            }
            if (this.getHighSpeedVideoFpsRanges.charAt(i) == '%') {
                this.Camera2StreamConfigurationMap++;
                return com.caverock.androidsvg.SVG.Unit.percent;
            }
            int i2 = this.Camera2StreamConfigurationMap;
            if (i2 > this.getHighSpeedVideoSizes - 2) {
                return null;
            }
            try {
                com.caverock.androidsvg.SVG.Unit valueOf = com.caverock.androidsvg.SVG.Unit.valueOf(this.getHighSpeedVideoFpsRanges.substring(i2, i2 + 2).toLowerCase(java.util.Locale.US));
                this.Camera2StreamConfigurationMap += 2;
                return valueOf;
            } catch (java.lang.IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.SvgElementBase svgElementBase, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String qName = attributes.getQName(i);
            if (qName.equals("id") || qName.equals("xml:id")) {
                svgElementBase.getValidOutputFormatsForInputhNQ4ISI = attributes.getValue(i).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                java.lang.String trim = attributes.getValue(i).trim();
                if (com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityLedgerFilters.KEY_DEFAULT.equals(trim)) {
                    svgElementBase.toString = java.lang.Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(trim)) {
                        svgElementBase.toString = java.lang.Boolean.TRUE;
                        return;
                    }
                    throw new com.caverock.androidsvg.SVGParseException("Invalid value for \"xml:space\" attribute: ".concat(java.lang.String.valueOf(trim)));
                }
            }
        }
    }

    private static void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.SvgElementBase svgElementBase, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            if (trim.length() != 0) {
                int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
                if (i2 == 45) {
                    getHighSpeedVideoFpsRangesFor(svgElementBase, trim);
                } else if (i2 == 46) {
                    svgElementBase.unwrapAs = com.caverock.androidsvg.CSSParser.getHighSpeedVideoFpsRangesFor(trim);
                } else {
                    if (svgElementBase.isOutputSupportedForhNQ4ISI == null) {
                        svgElementBase.isOutputSupportedForhNQ4ISI = new com.caverock.androidsvg.SVG.Style();
                    }
                    Camera2StreamConfigurationMap(svgElementBase.isOutputSupportedForhNQ4ISI, attributes.getLocalName(i), attributes.getValue(i).trim());
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.SVG.SvgElementBase svgElementBase, java.lang.String str) {
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            java.lang.String highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON, false);
            textScanner.getOutputSizes();
            if (!textScanner.Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                return;
            }
            textScanner.getOutputSizes();
            java.lang.String highSpeedVideoFpsRanges2 = textScanner.getHighSpeedVideoFpsRanges(';', true);
            if (highSpeedVideoFpsRanges2 == null) {
                return;
            }
            textScanner.getOutputSizes();
            if (textScanner.Camera2StreamConfigurationMap == textScanner.getHighSpeedVideoSizes || textScanner.Camera2StreamConfigurationMap(';')) {
                if (svgElementBase.coroutineCreation == null) {
                    svgElementBase.coroutineCreation = new com.caverock.androidsvg.SVG.Style();
                }
                Camera2StreamConfigurationMap(svgElementBase.coroutineCreation, highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2);
                textScanner.getOutputSizes();
            }
        }
    }

    static void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.Style style, java.lang.String str, java.lang.String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        com.caverock.androidsvg.SVG.Style.FillRule fillRule = null;
        try {
            switch (com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(str).ordinal()]) {
                case 47:
                    style.getInputFormats = getOutputMinFrameDurationlomOqCM(str2);
                    if (style.getInputFormats != null) {
                        style.ArtificialStackFrames |= 1;
                        return;
                    }
                    return;
                case 48:
                    if ("nonzero".equals(str2)) {
                        fillRule = com.caverock.androidsvg.SVG.Style.FillRule.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        fillRule = com.caverock.androidsvg.SVG.Style.FillRule.EvenOdd;
                    }
                    style.getOutputMinFrameDuration = fillRule;
                    if (style.getOutputMinFrameDuration != null) {
                        style.ArtificialStackFrames |= 2;
                        return;
                    }
                    return;
                case 49:
                    style.getOutputFormats = getOutputSizeshNQ4ISI(str2);
                    if (style.getOutputFormats != null) {
                        style.ArtificialStackFrames |= 4;
                        return;
                    }
                    return;
                case 50:
                    style.b = getOutputMinFrameDurationlomOqCM(str2);
                    if (style.b != null) {
                        style.ArtificialStackFrames |= 8;
                        return;
                    }
                    return;
                case 51:
                    style.AMEXKernel = getOutputSizeshNQ4ISI(str2);
                    if (style.AMEXKernel != null) {
                        style.ArtificialStackFrames |= 16;
                        return;
                    }
                    return;
                case 52:
                    style.kernelVersion = getHighSpeedVideoFpsRanges(str2);
                    style.ArtificialStackFrames |= 32;
                    return;
                case 53:
                    style._BOUNDARY = toString(str2);
                    if (style._BOUNDARY != null) {
                        style.ArtificialStackFrames |= 64;
                        return;
                    }
                    return;
                case 54:
                    style.f2840a = CoroutineDebuggingKt(str2);
                    if (style.f2840a != null) {
                        style.ArtificialStackFrames |= 128;
                        return;
                    }
                    return;
                case 55:
                    int length = str2.length();
                    if (length != 0) {
                        style.init = java.lang.Float.valueOf(getHighResolutionOutputSizeshNQ4ISI(str2, length));
                        style.ArtificialStackFrames |= 256;
                        return;
                    }
                    throw new com.caverock.androidsvg.SVGParseException("Invalid float value (empty string)");
                case 56:
                    if ("none".equals(str2)) {
                        style.getARTIFICIAL_FRAME_PACKAGE_NAME = null;
                        style.ArtificialStackFrames |= 512;
                        return;
                    } else {
                        style.getARTIFICIAL_FRAME_PACKAGE_NAME = getValidOutputFormatsForInputhNQ4ISI(str2);
                        if (style.getARTIFICIAL_FRAME_PACKAGE_NAME != null) {
                            style.ArtificialStackFrames |= 512;
                            return;
                        }
                        return;
                    }
                case 57:
                    style._CREATION = getHighSpeedVideoFpsRanges(str2);
                    style.ArtificialStackFrames |= okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE;
                    return;
                case 58:
                    style.toString = getOutputSizeshNQ4ISI(str2);
                    style.ArtificialStackFrames |= coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES;
                    return;
                case 59:
                    style.getHighResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str2);
                    style.ArtificialStackFrames |= 4096;
                    return;
                case 60:
                    Camera2StreamConfigurationMap(style, str2);
                    return;
                case 61:
                    style.getInputSizeshNQ4ISI = getHighSpeedVideoSizesFor(str2);
                    if (style.getInputSizeshNQ4ISI != null) {
                        style.ArtificialStackFrames |= 8192;
                        return;
                    }
                    return;
                case 62:
                    style.getOutputSizes = getOutputMinFrameDuration(str2);
                    if (style.getOutputSizes != null) {
                        style.ArtificialStackFrames |= okhttp3.internal.http2.Http2Stream.EMIT_BUFFER_SIZE;
                        return;
                    }
                    return;
                case 63:
                    style.getOutputMinFrameDurationlomOqCM = com.caverock.androidsvg.SVGParser.FontWeightKeywords.getHighSpeedVideoFpsRanges(str2);
                    if (style.getOutputMinFrameDurationlomOqCM != null) {
                        style.ArtificialStackFrames |= 32768;
                        return;
                    }
                    return;
                case 64:
                    style.getOutputStallDurationlomOqCM = getInputSizeshNQ4ISI(str2);
                    if (style.getOutputStallDurationlomOqCM != null) {
                        style.ArtificialStackFrames |= 65536;
                        return;
                    }
                    return;
                case 65:
                    style.c = coroutineBoundary(str2);
                    if (style.c != null) {
                        style.ArtificialStackFrames |= 131072;
                        return;
                    }
                    return;
                case 66:
                    style.getHighSpeedVideoFpsRanges = accessartificialFrame(str2);
                    if (style.getHighSpeedVideoFpsRanges != null) {
                        style.ArtificialStackFrames |= 68719476736L;
                        return;
                    }
                    return;
                case 67:
                    style.d = coroutineCreation(str2);
                    if (style.d != null) {
                        style.ArtificialStackFrames |= 262144;
                        return;
                    }
                    return;
                case 68:
                    style.getValidOutputFormatsForInputhNQ4ISI = getOutputStallDuration(str2);
                    if (style.getValidOutputFormatsForInputhNQ4ISI != null) {
                        style.ArtificialStackFrames |= com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_ITEM_SIZE;
                        return;
                    }
                    return;
                case 69:
                    style.unwrapAs = getOutputFormats(str2);
                    style.isOutputSupportedFor = style.unwrapAs;
                    style.getOutputStallDuration = style.unwrapAs;
                    style.ArtificialStackFrames |= 14680064;
                    return;
                case 70:
                    style.unwrapAs = getOutputFormats(str2);
                    style.ArtificialStackFrames |= 2097152;
                    return;
                case 71:
                    style.isOutputSupportedFor = getOutputFormats(str2);
                    style.ArtificialStackFrames |= 4194304;
                    return;
                case 72:
                    style.getOutputStallDuration = getOutputFormats(str2);
                    style.ArtificialStackFrames |= 8388608;
                    return;
                case 73:
                    if (str2.indexOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) < 0) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                        sb.append(str2);
                        sb.append('|');
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains(sb.toString())) {
                            style.getHighSpeedVideoSizesFor = java.lang.Boolean.valueOf(!str2.equals("none"));
                            style.ArtificialStackFrames |= 16777216;
                            return;
                        }
                        return;
                    }
                    return;
                case 74:
                    if (str2.indexOf(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) < 0) {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
                        sb2.append(str2);
                        sb2.append('|');
                        if ("|visible|hidden|collapse|".contains(sb2.toString())) {
                            style.exchange = java.lang.Boolean.valueOf(str2.equals("visible"));
                            style.ArtificialStackFrames |= 33554432;
                            return;
                        }
                        return;
                    }
                    return;
                case 75:
                    if (str2.equals("currentColor")) {
                        style.coroutineCreation = com.caverock.androidsvg.SVG.CurrentColor.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        try {
                            style.coroutineCreation = getHighResolutionOutputSizeshNQ4ISI(str2);
                        } catch (com.caverock.androidsvg.SVGParseException e) {
                            e.getMessage();
                            return;
                        }
                    }
                    style.ArtificialStackFrames |= 67108864;
                    return;
                case 76:
                    style.coroutineBoundary = getOutputSizeshNQ4ISI(str2);
                    style.ArtificialStackFrames |= 134217728;
                    return;
                case 77:
                    style.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor(str2);
                    if (style.Camera2StreamConfigurationMap != null) {
                        style.ArtificialStackFrames |= com.datadog.android.core.internal.system.DefaultAndroidInfoProvider.MB_IN_BYTES;
                        return;
                    }
                    return;
                case 78:
                    style.getHighSpeedVideoFpsRangesFor = getOutputFormats(str2);
                    style.ArtificialStackFrames |= 268435456;
                    return;
                case 79:
                    if ("nonzero".equals(str2)) {
                        fillRule = com.caverock.androidsvg.SVG.Style.FillRule.NonZero;
                    } else if ("evenodd".equals(str2)) {
                        fillRule = com.caverock.androidsvg.SVG.Style.FillRule.EvenOdd;
                    }
                    style.getHighSpeedVideoSizes = fillRule;
                    style.ArtificialStackFrames |= com.datadog.android.core.internal.persistence.file.FilePersistenceConfig.MAX_DISK_SPACE;
                    return;
                case 80:
                    style.isOutputSupportedForhNQ4ISI = getOutputFormats(str2);
                    style.ArtificialStackFrames |= com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.Colors.SHADOW_COLOR;
                    return;
                case 81:
                    if (str2.equals("currentColor")) {
                        style.CoroutineDebuggingKt = com.caverock.androidsvg.SVG.CurrentColor.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        try {
                            style.CoroutineDebuggingKt = getHighResolutionOutputSizeshNQ4ISI(str2);
                        } catch (com.caverock.androidsvg.SVGParseException e2) {
                            e2.getMessage();
                            return;
                        }
                    }
                    style.ArtificialStackFrames |= 2147483648L;
                    return;
                case 82:
                    style.accessartificialFrame = getOutputSizeshNQ4ISI(str2);
                    style.ArtificialStackFrames |= 4294967296L;
                    return;
                case 83:
                    if (str2.equals("currentColor")) {
                        style.AMEXKernela = com.caverock.androidsvg.SVG.CurrentColor.getHighResolutionOutputSizeshNQ4ISI();
                    } else {
                        try {
                            style.AMEXKernela = getHighResolutionOutputSizeshNQ4ISI(str2);
                        } catch (com.caverock.androidsvg.SVGParseException e3) {
                            e3.getMessage();
                            return;
                        }
                    }
                    style.ArtificialStackFrames |= 8589934592L;
                    return;
                case 84:
                    style.release = getOutputSizeshNQ4ISI(str2);
                    style.ArtificialStackFrames |= 17179869184L;
                    return;
                case 85:
                    style.resetTransaction = _CREATION(str2);
                    if (style.resetTransaction != null) {
                        style.ArtificialStackFrames |= 34359738368L;
                        return;
                    }
                    return;
                case 86:
                    style.getOutputSizeshNQ4ISI = unwrapAs(str2);
                    if (style.getOutputSizeshNQ4ISI != null) {
                        style.ArtificialStackFrames |= 137438953472L;
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (com.caverock.androidsvg.SVGParseException unused) {
        }
    }

    private static void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.SvgViewBoxContainer svgViewBoxContainer, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 7) {
                svgViewBoxContainer.coroutineBoundary = Camera2StreamConfigurationMap(trim);
            } else if (i2 == 87) {
                svgViewBoxContainer.getOutputMinFrameDuration = b(trim);
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVG.HasTransform hasTransform, org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        for (int i = 0; i < attributes.getLength(); i++) {
            if (com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)) == com.caverock.androidsvg.SVGParser.SVGAttr.transform) {
                hasTransform.getHighSpeedVideoFpsRanges(getARTIFICIAL_FRAME_PACKAGE_NAME(attributes.getValue(i)));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static android.graphics.Matrix getARTIFICIAL_FRAME_PACKAGE_NAME(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        char c;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        textScanner.getOutputSizes();
        while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
            java.lang.String inputFormats = textScanner.getInputFormats();
            if (inputFormats == null) {
                throw new com.caverock.androidsvg.SVGParseException("Bad transform function encountered in transform list: ".concat(java.lang.String.valueOf(str)));
            }
            inputFormats.hashCode();
            switch (inputFormats.hashCode()) {
                case -1081239615:
                    if (inputFormats.equals("matrix")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -925180581:
                    if (inputFormats.equals("rotate")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109250890:
                    if (inputFormats.equals("scale")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 109493390:
                    if (inputFormats.equals("skewX")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109493391:
                    if (inputFormats.equals("skewY")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1052832078:
                    if (inputFormats.equals("translate")) {
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
                textScanner.getOutputSizes();
                float highSpeedVideoSizesFor = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizeshNQ4ISI();
                float highSpeedVideoSizesFor2 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizeshNQ4ISI();
                float highSpeedVideoSizesFor3 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizeshNQ4ISI();
                float highSpeedVideoSizesFor4 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizeshNQ4ISI();
                float highSpeedVideoSizesFor5 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizeshNQ4ISI();
                float highSpeedVideoSizesFor6 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor6) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                android.graphics.Matrix matrix2 = new android.graphics.Matrix();
                matrix2.setValues(new float[]{highSpeedVideoSizesFor, highSpeedVideoSizesFor3, highSpeedVideoSizesFor5, highSpeedVideoSizesFor2, highSpeedVideoSizesFor4, highSpeedVideoSizesFor6, 0.0f, 0.0f, 1.0f});
                matrix.preConcat(matrix2);
            } else if (c == 1) {
                textScanner.getOutputSizes();
                float highSpeedVideoSizesFor7 = textScanner.getHighSpeedVideoSizesFor();
                float outputStallDurationlomOqCM = textScanner.getOutputStallDurationlomOqCM();
                float outputStallDurationlomOqCM2 = textScanner.getOutputStallDurationlomOqCM();
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor7) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                if (java.lang.Float.isNaN(outputStallDurationlomOqCM)) {
                    matrix.preRotate(highSpeedVideoSizesFor7);
                } else if (!java.lang.Float.isNaN(outputStallDurationlomOqCM2)) {
                    matrix.preRotate(highSpeedVideoSizesFor7, outputStallDurationlomOqCM, outputStallDurationlomOqCM2);
                } else {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
            } else if (c == 2) {
                textScanner.getOutputSizes();
                float highSpeedVideoSizesFor8 = textScanner.getHighSpeedVideoSizesFor();
                float outputStallDurationlomOqCM3 = textScanner.getOutputStallDurationlomOqCM();
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor8) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                if (java.lang.Float.isNaN(outputStallDurationlomOqCM3)) {
                    matrix.preScale(highSpeedVideoSizesFor8, highSpeedVideoSizesFor8);
                } else {
                    matrix.preScale(highSpeedVideoSizesFor8, outputStallDurationlomOqCM3);
                }
            } else if (c == 3) {
                textScanner.getOutputSizes();
                float highSpeedVideoSizesFor9 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor9) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                matrix.preSkew((float) java.lang.Math.tan(java.lang.Math.toRadians(highSpeedVideoSizesFor9)), 0.0f);
            } else if (c == 4) {
                textScanner.getOutputSizes();
                float highSpeedVideoSizesFor10 = textScanner.getHighSpeedVideoSizesFor();
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor10) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                matrix.preSkew(0.0f, (float) java.lang.Math.tan(java.lang.Math.toRadians(highSpeedVideoSizesFor10)));
            } else if (c == 5) {
                textScanner.getOutputSizes();
                float highSpeedVideoSizesFor11 = textScanner.getHighSpeedVideoSizesFor();
                float outputStallDurationlomOqCM4 = textScanner.getOutputStallDurationlomOqCM();
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor11) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Invalid transform list: ".concat(java.lang.String.valueOf(str)));
                }
                if (java.lang.Float.isNaN(outputStallDurationlomOqCM4)) {
                    matrix.preTranslate(highSpeedVideoSizesFor11, 0.0f);
                } else {
                    matrix.preTranslate(highSpeedVideoSizesFor11, outputStallDurationlomOqCM4);
                }
            } else {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid transform list fn: ");
                sb.append(inputFormats);
                sb.append(")");
                throw new com.caverock.androidsvg.SVGParseException(sb.toString());
            }
            if (textScanner.Camera2StreamConfigurationMap == textScanner.getHighSpeedVideoSizes) {
                return matrix;
            }
            textScanner.getOutputSizeshNQ4ISI();
        }
        return matrix;
    }

    static com.caverock.androidsvg.SVG.Length getHighSpeedVideoFpsRanges(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        if (str.length() == 0) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid length value (empty string)");
        }
        int length = str.length();
        com.caverock.androidsvg.SVG.Unit unit = com.caverock.androidsvg.SVG.Unit.px;
        int i = length - 1;
        char charAt = str.charAt(i);
        try {
            if (charAt == '%') {
                unit = com.caverock.androidsvg.SVG.Unit.percent;
            } else {
                if (length > 2 && java.lang.Character.isLetter(charAt)) {
                    i = length - 2;
                    if (java.lang.Character.isLetter(str.charAt(i))) {
                        try {
                            unit = com.caverock.androidsvg.SVG.Unit.valueOf(str.substring(i).toLowerCase(java.util.Locale.US));
                        } catch (java.lang.IllegalArgumentException unused) {
                            throw new com.caverock.androidsvg.SVGParseException("Invalid length unit specifier: ".concat(java.lang.String.valueOf(str)));
                        }
                    }
                }
                return new com.caverock.androidsvg.SVG.Length(getHighResolutionOutputSizeshNQ4ISI(str, length), unit);
            }
            return new com.caverock.androidsvg.SVG.Length(getHighResolutionOutputSizeshNQ4ISI(str, length), unit);
        } catch (java.lang.NumberFormatException e) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid length value: ".concat(java.lang.String.valueOf(str)), e);
        }
        length = i;
    }

    private static java.util.List<com.caverock.androidsvg.SVG.Length> getOutputStallDurationlomOqCM(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        if (str.length() == 0) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid length list (empty string)");
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        textScanner.getOutputSizes();
        while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
            float highSpeedVideoSizesFor = textScanner.getHighSpeedVideoSizesFor();
            if (java.lang.Float.isNaN(highSpeedVideoSizesFor)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid length list value: ");
                sb.append(textScanner.getHighSpeedVideoFpsRangesFor());
                throw new com.caverock.androidsvg.SVGParseException(sb.toString());
            }
            com.caverock.androidsvg.SVG.Unit outputStallDuration = textScanner.getOutputStallDuration();
            if (outputStallDuration == null) {
                outputStallDuration = com.caverock.androidsvg.SVG.Unit.px;
            }
            arrayList.add(new com.caverock.androidsvg.SVG.Length(highSpeedVideoSizesFor, outputStallDuration));
            textScanner.getOutputSizeshNQ4ISI();
        }
        return arrayList;
    }

    private static float getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i) throws com.caverock.androidsvg.SVGParseException {
        float highSpeedVideoFpsRanges = new com.caverock.androidsvg.NumberParser().getHighSpeedVideoFpsRanges(str, 0, i);
        if (java.lang.Float.isNaN(highSpeedVideoFpsRanges)) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid float value: ".concat(java.lang.String.valueOf(str)));
        }
        return highSpeedVideoFpsRanges;
    }

    private static com.caverock.androidsvg.SVG.Box b(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        textScanner.getOutputSizes();
        float highSpeedVideoSizesFor = textScanner.getHighSpeedVideoSizesFor();
        textScanner.getOutputSizeshNQ4ISI();
        float highSpeedVideoSizesFor2 = textScanner.getHighSpeedVideoSizesFor();
        textScanner.getOutputSizeshNQ4ISI();
        float highSpeedVideoSizesFor3 = textScanner.getHighSpeedVideoSizesFor();
        textScanner.getOutputSizeshNQ4ISI();
        float highSpeedVideoSizesFor4 = textScanner.getHighSpeedVideoSizesFor();
        if (java.lang.Float.isNaN(highSpeedVideoSizesFor) || java.lang.Float.isNaN(highSpeedVideoSizesFor2) || java.lang.Float.isNaN(highSpeedVideoSizesFor3) || java.lang.Float.isNaN(highSpeedVideoSizesFor4)) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid viewBox definition - should have four numbers");
        }
        if (highSpeedVideoSizesFor3 < 0.0f) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid viewBox. width cannot be negative");
        }
        if (highSpeedVideoSizesFor4 < 0.0f) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid viewBox. height cannot be negative");
        }
        return new com.caverock.androidsvg.SVG.Box(highSpeedVideoSizesFor, highSpeedVideoSizesFor2, highSpeedVideoSizesFor3, highSpeedVideoSizesFor4);
    }

    static com.caverock.androidsvg.PreserveAspectRatio Camera2StreamConfigurationMap(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        com.caverock.androidsvg.PreserveAspectRatio.Scale scale;
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        textScanner.getOutputSizes();
        java.lang.String highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges(' ', false);
        if ("defer".equals(highSpeedVideoFpsRanges)) {
            textScanner.getOutputSizes();
            highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges(' ', false);
        }
        com.caverock.androidsvg.PreserveAspectRatio.Alignment highSpeedVideoSizes = com.caverock.androidsvg.SVGParser.AspectRatioKeywords.getHighSpeedVideoSizes(highSpeedVideoFpsRanges);
        textScanner.getOutputSizes();
        if (textScanner.Camera2StreamConfigurationMap == textScanner.getHighSpeedVideoSizes) {
            scale = null;
        } else {
            java.lang.String highSpeedVideoFpsRanges2 = textScanner.getHighSpeedVideoFpsRanges(' ', false);
            highSpeedVideoFpsRanges2.hashCode();
            if (highSpeedVideoFpsRanges2.equals("meet")) {
                scale = com.caverock.androidsvg.PreserveAspectRatio.Scale.meet;
            } else if (highSpeedVideoFpsRanges2.equals("slice")) {
                scale = com.caverock.androidsvg.PreserveAspectRatio.Scale.slice;
            } else {
                throw new com.caverock.androidsvg.SVGParseException("Invalid preserveAspectRatio definition: ".concat(java.lang.String.valueOf(str)));
            }
        }
        return new com.caverock.androidsvg.PreserveAspectRatio(highSpeedVideoSizes, scale);
    }

    private static com.caverock.androidsvg.SVG.SvgPaint getOutputMinFrameDurationlomOqCM(java.lang.String str) {
        if (str.startsWith("url(")) {
            int indexOf = str.indexOf(")");
            if (indexOf != -1) {
                java.lang.String trim = str.substring(4, indexOf).trim();
                java.lang.String trim2 = str.substring(indexOf + 1).trim();
                return new com.caverock.androidsvg.SVG.PaintReference(trim, trim2.length() > 0 ? getInputFormats(trim2) : null);
            }
            return new com.caverock.androidsvg.SVG.PaintReference(str.substring(4).trim(), null);
        }
        return getInputFormats(str);
    }

    private static com.caverock.androidsvg.SVG.SvgPaint getInputFormats(java.lang.String str) {
        str.hashCode();
        if (str.equals("none")) {
            return com.caverock.androidsvg.SVG.Colour.getHighSpeedVideoFpsRanges;
        }
        if (str.equals("currentColor")) {
            return com.caverock.androidsvg.SVG.CurrentColor.getHighResolutionOutputSizeshNQ4ISI();
        }
        try {
            return getHighResolutionOutputSizeshNQ4ISI(str);
        } catch (com.caverock.androidsvg.SVGParseException unused) {
            return null;
        }
    }

    private static com.caverock.androidsvg.SVG.Colour getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws com.caverock.androidsvg.SVGParseException {
        float highSpeedVideoSizesFor;
        float highSpeedVideoSizesFor2;
        int round;
        int round2;
        int round3;
        int round4;
        int round5;
        float highSpeedVideoSizesFor3;
        float highSpeedVideoSizesFor4;
        int i = 0;
        if (str.charAt(0) == '#') {
            com.caverock.androidsvg.IntegerParser highResolutionOutputSizeshNQ4ISI = com.caverock.androidsvg.IntegerParser.getHighResolutionOutputSizeshNQ4ISI(str, str.length());
            if (highResolutionOutputSizeshNQ4ISI == null) {
                throw new com.caverock.androidsvg.SVGParseException("Bad hex colour value: ".concat(java.lang.String.valueOf(str)));
            }
            int i2 = highResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap;
            if (i2 == 4) {
                int i3 = (int) highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
                int i4 = i3 & 3840;
                int i5 = i3 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
                int i6 = i3 & 15;
                return new com.caverock.androidsvg.SVG.Colour(i6 | (i4 << 12) | (-16777216) | (i4 << 8) | (i5 << 8) | (i5 << 4) | (i6 << 4));
            }
            if (i2 != 5) {
                if (i2 == 7) {
                    return new com.caverock.androidsvg.SVG.Colour(((int) highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI) | (-16777216));
                }
                if (i2 == 9) {
                    return new com.caverock.androidsvg.SVG.Colour((((int) highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI) << 24) | (((int) highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI) >>> 8));
                }
                throw new com.caverock.androidsvg.SVGParseException("Bad hex colour value: ".concat(java.lang.String.valueOf(str)));
            }
            int i7 = (int) highResolutionOutputSizeshNQ4ISI.getHighResolutionOutputSizeshNQ4ISI;
            int i8 = 61440 & i7;
            int i9 = i7 & 3840;
            int i10 = i7 & com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
            int i11 = i7 & 15;
            return new com.caverock.androidsvg.SVG.Colour((i11 << 28) | (i11 << 24) | (i8 << 8) | (i8 << 4) | (i9 << 4) | i9 | i10 | (i10 >> 4));
        }
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.US);
        boolean startsWith = lowerCase.startsWith("rgba(");
        float f = Float.NaN;
        if (startsWith || lowerCase.startsWith("rgb(")) {
            com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str.substring(startsWith ? 5 : 4));
            textScanner.getOutputSizes();
            float highSpeedVideoSizesFor5 = textScanner.getHighSpeedVideoSizesFor();
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor5) && textScanner.Camera2StreamConfigurationMap('%')) {
                highSpeedVideoSizesFor5 = (highSpeedVideoSizesFor5 * 256.0f) / 100.0f;
            }
            if (java.lang.Float.isNaN(highSpeedVideoSizesFor5)) {
                highSpeedVideoSizesFor = Float.NaN;
            } else {
                textScanner.getOutputSizeshNQ4ISI();
                highSpeedVideoSizesFor = textScanner.getHighSpeedVideoSizesFor();
            }
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor) && textScanner.Camera2StreamConfigurationMap('%')) {
                highSpeedVideoSizesFor = (highSpeedVideoSizesFor * 256.0f) / 100.0f;
            }
            if (java.lang.Float.isNaN(highSpeedVideoSizesFor)) {
                highSpeedVideoSizesFor2 = Float.NaN;
            } else {
                textScanner.getOutputSizeshNQ4ISI();
                highSpeedVideoSizesFor2 = textScanner.getHighSpeedVideoSizesFor();
            }
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor2) && textScanner.Camera2StreamConfigurationMap('%')) {
                highSpeedVideoSizesFor2 = (highSpeedVideoSizesFor2 * 256.0f) / 100.0f;
            }
            if (!startsWith) {
                textScanner.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor2) || !textScanner.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Bad rgb() colour value: ".concat(java.lang.String.valueOf(str)));
                }
                if (highSpeedVideoSizesFor5 < 0.0f) {
                    round = 0;
                } else {
                    round = highSpeedVideoSizesFor5 > 255.0f ? 255 : java.lang.Math.round(highSpeedVideoSizesFor5);
                }
                int i12 = (round << 16) | (-16777216);
                if (highSpeedVideoSizesFor < 0.0f) {
                    round2 = 0;
                } else {
                    round2 = highSpeedVideoSizesFor > 255.0f ? 255 : java.lang.Math.round(highSpeedVideoSizesFor);
                }
                int i13 = i12 | (round2 << 8);
                if (highSpeedVideoSizesFor2 >= 0.0f) {
                    i = highSpeedVideoSizesFor2 > 255.0f ? 255 : java.lang.Math.round(highSpeedVideoSizesFor2);
                }
                return new com.caverock.androidsvg.SVG.Colour(i | i13);
            }
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor2)) {
                textScanner.getOutputSizeshNQ4ISI();
                f = textScanner.getHighSpeedVideoSizesFor();
            }
            textScanner.getOutputSizes();
            if (java.lang.Float.isNaN(f) || !textScanner.Camera2StreamConfigurationMap(')')) {
                throw new com.caverock.androidsvg.SVGParseException("Bad rgba() colour value: ".concat(java.lang.String.valueOf(str)));
            }
            float f2 = f * 256.0f;
            if (f2 < 0.0f) {
                round3 = 0;
            } else {
                round3 = f2 > 255.0f ? 255 : java.lang.Math.round(f2);
            }
            int i14 = round3 << 24;
            if (highSpeedVideoSizesFor5 < 0.0f) {
                round4 = 0;
            } else {
                round4 = highSpeedVideoSizesFor5 > 255.0f ? 255 : java.lang.Math.round(highSpeedVideoSizesFor5);
            }
            int i15 = i14 | (round4 << 16);
            if (highSpeedVideoSizesFor < 0.0f) {
                round5 = 0;
            } else {
                round5 = highSpeedVideoSizesFor > 255.0f ? 255 : java.lang.Math.round(highSpeedVideoSizesFor);
            }
            int i16 = i15 | (round5 << 8);
            if (highSpeedVideoSizesFor2 >= 0.0f) {
                i = highSpeedVideoSizesFor2 > 255.0f ? 255 : java.lang.Math.round(highSpeedVideoSizesFor2);
            }
            return new com.caverock.androidsvg.SVG.Colour(i | i16);
        }
        boolean startsWith2 = lowerCase.startsWith("hsla(");
        if (startsWith2 || lowerCase.startsWith("hsl(")) {
            com.caverock.androidsvg.SVGParser.TextScanner textScanner2 = new com.caverock.androidsvg.SVGParser.TextScanner(str.substring(startsWith2 ? 5 : 4));
            textScanner2.getOutputSizes();
            float highSpeedVideoSizesFor6 = textScanner2.getHighSpeedVideoSizesFor();
            if (java.lang.Float.isNaN(highSpeedVideoSizesFor6)) {
                highSpeedVideoSizesFor3 = Float.NaN;
            } else {
                textScanner2.getOutputSizeshNQ4ISI();
                highSpeedVideoSizesFor3 = textScanner2.getHighSpeedVideoSizesFor();
            }
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor3)) {
                textScanner2.Camera2StreamConfigurationMap('%');
            }
            if (java.lang.Float.isNaN(highSpeedVideoSizesFor3)) {
                highSpeedVideoSizesFor4 = Float.NaN;
            } else {
                textScanner2.getOutputSizeshNQ4ISI();
                highSpeedVideoSizesFor4 = textScanner2.getHighSpeedVideoSizesFor();
            }
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor4)) {
                textScanner2.Camera2StreamConfigurationMap('%');
            }
            if (!startsWith2) {
                textScanner2.getOutputSizes();
                if (java.lang.Float.isNaN(highSpeedVideoSizesFor4) || !textScanner2.Camera2StreamConfigurationMap(')')) {
                    throw new com.caverock.androidsvg.SVGParseException("Bad hsl() colour value: ".concat(java.lang.String.valueOf(str)));
                }
                return new com.caverock.androidsvg.SVG.Colour(getHighSpeedVideoFpsRanges(highSpeedVideoSizesFor6, highSpeedVideoSizesFor3, highSpeedVideoSizesFor4) | (-16777216));
            }
            if (!java.lang.Float.isNaN(highSpeedVideoSizesFor4)) {
                textScanner2.getOutputSizeshNQ4ISI();
                f = textScanner2.getHighSpeedVideoSizesFor();
            }
            textScanner2.getOutputSizes();
            if (java.lang.Float.isNaN(f) || !textScanner2.Camera2StreamConfigurationMap(')')) {
                throw new com.caverock.androidsvg.SVGParseException("Bad hsla() colour value: ".concat(java.lang.String.valueOf(str)));
            }
            float f3 = f * 256.0f;
            if (f3 >= 0.0f) {
                i = f3 > 255.0f ? 255 : java.lang.Math.round(f3);
            }
            return new com.caverock.androidsvg.SVG.Colour((i << 24) | getHighSpeedVideoFpsRanges(highSpeedVideoSizesFor6, highSpeedVideoSizesFor3, highSpeedVideoSizesFor4));
        }
        java.lang.Integer Camera2StreamConfigurationMap = com.caverock.androidsvg.SVGParser.ColourKeywords.Camera2StreamConfigurationMap(lowerCase);
        if (Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid colour keyword: ".concat(java.lang.String.valueOf(lowerCase)));
        }
        return new com.caverock.androidsvg.SVG.Colour(Camera2StreamConfigurationMap.intValue());
    }

    private static int getHighSpeedVideoFpsRanges(float f, float f2, float f3) {
        int round;
        int round2;
        float f4 = f % 360.0f;
        if (f < 0.0f) {
            f4 += 360.0f;
        }
        float f5 = f4 / 60.0f;
        float f6 = f2 / 100.0f;
        float f7 = f3 / 100.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        if (f7 < 0.0f) {
            f7 = 0.0f;
        } else if (f7 > 1.0f) {
            f7 = 1.0f;
        }
        float f8 = f7 <= 0.5f ? (f6 + 1.0f) * f7 : (f7 + f6) - (f6 * f7);
        float f9 = (f7 * 2.0f) - f8;
        float Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(f9, f8, f5 + 2.0f);
        float Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(f9, f8, f5);
        float Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap(f9, f8, f5 - 2.0f);
        float f10 = Camera2StreamConfigurationMap * 256.0f;
        int i = 255;
        if (f10 < 0.0f) {
            round = 0;
        } else {
            round = f10 > 255.0f ? 255 : java.lang.Math.round(f10);
        }
        float f11 = Camera2StreamConfigurationMap2 * 256.0f;
        if (f11 < 0.0f) {
            round2 = 0;
        } else {
            round2 = f11 > 255.0f ? 255 : java.lang.Math.round(f11);
        }
        float f12 = Camera2StreamConfigurationMap3 * 256.0f;
        if (f12 < 0.0f) {
            i = 0;
        } else if (f12 <= 255.0f) {
            i = java.lang.Math.round(f12);
        }
        return (round << 16) | (round2 << 8) | i;
    }

    private static void Camera2StreamConfigurationMap(com.caverock.androidsvg.SVG.Style style, java.lang.String str) {
        java.lang.String highSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.paypal.oslo.feature.identity.unifiedalert.data.repository.HandledAlertsRepositoryImpl.DELIMITER);
        sb.append(str);
        sb.append('|');
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains(sb.toString())) {
            com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
            java.lang.String str2 = null;
            java.lang.Integer num = null;
            com.caverock.androidsvg.SVG.Style.FontStyle fontStyle = null;
            java.lang.String str3 = null;
            while (true) {
                highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges(kotlinx.io.files.FileSystemKt.UnixPathSeparator, false);
                textScanner.getOutputSizes();
                if (highSpeedVideoFpsRanges != null) {
                    if (num != null && fontStyle != null) {
                        break;
                    }
                    if (!highSpeedVideoFpsRanges.equals(com.adjust.sdk.Constants.NORMAL) && (num != null || (num = com.caverock.androidsvg.SVGParser.FontWeightKeywords.getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges)) == null)) {
                        if (fontStyle != null || (fontStyle = getInputSizeshNQ4ISI(highSpeedVideoFpsRanges)) == null) {
                            if (str3 != null || !highSpeedVideoFpsRanges.equals("small-caps")) {
                                break;
                            } else {
                                str3 = highSpeedVideoFpsRanges;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            com.caverock.androidsvg.SVG.Length outputMinFrameDuration = getOutputMinFrameDuration(highSpeedVideoFpsRanges);
            if (textScanner.Camera2StreamConfigurationMap(kotlinx.io.files.FileSystemKt.UnixPathSeparator)) {
                textScanner.getOutputSizes();
                java.lang.String highSpeedVideoFpsRanges2 = textScanner.getHighSpeedVideoFpsRanges(' ', false);
                if (highSpeedVideoFpsRanges2 != null) {
                    try {
                        getHighSpeedVideoFpsRanges(highSpeedVideoFpsRanges2);
                    } catch (com.caverock.androidsvg.SVGParseException unused) {
                        return;
                    }
                }
                textScanner.getOutputSizes();
            }
            if (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
                int i = textScanner.Camera2StreamConfigurationMap;
                textScanner.Camera2StreamConfigurationMap = textScanner.getHighSpeedVideoSizes;
                str2 = textScanner.getHighSpeedVideoFpsRanges.substring(i);
            }
            style.getInputSizeshNQ4ISI = getHighSpeedVideoSizesFor(str2);
            style.getOutputSizes = outputMinFrameDuration;
            style.getOutputMinFrameDurationlomOqCM = java.lang.Integer.valueOf(num == null ? 400 : num.intValue());
            if (fontStyle == null) {
                fontStyle = com.caverock.androidsvg.SVG.Style.FontStyle.Normal;
            }
            style.getOutputStallDurationlomOqCM = fontStyle;
            style.ArtificialStackFrames |= 122880;
        }
    }

    private static java.util.List<java.lang.String> getHighSpeedVideoSizesFor(java.lang.String str) {
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        java.util.ArrayList arrayList = null;
        do {
            java.lang.String outputMinFrameDuration = textScanner.getOutputMinFrameDuration();
            if (outputMinFrameDuration == null) {
                outputMinFrameDuration = textScanner.getHighSpeedVideoFpsRanges(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA, true);
            }
            if (outputMinFrameDuration == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new java.util.ArrayList();
            }
            arrayList.add(outputMinFrameDuration);
            textScanner.getOutputSizeshNQ4ISI();
        } while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes);
        return arrayList;
    }

    private static com.caverock.androidsvg.SVG.Length getOutputMinFrameDuration(java.lang.String str) {
        try {
            com.caverock.androidsvg.SVG.Length Camera2StreamConfigurationMap = com.caverock.androidsvg.SVGParser.FontSizeKeywords.Camera2StreamConfigurationMap(str);
            return Camera2StreamConfigurationMap == null ? getHighSpeedVideoFpsRanges(str) : Camera2StreamConfigurationMap;
        } catch (com.caverock.androidsvg.SVGParseException unused) {
            return null;
        }
    }

    private static com.caverock.androidsvg.SVG.Style.FontStyle getInputSizeshNQ4ISI(java.lang.String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1657669071) {
            if (str.equals("oblique")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != -1178781136) {
            if (hashCode == -1039745817 && str.equals(com.adjust.sdk.Constants.NORMAL)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("italic")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.caverock.androidsvg.SVG.Style.FontStyle.Oblique;
        }
        if (c == 1) {
            return com.caverock.androidsvg.SVG.Style.FontStyle.Italic;
        }
        if (c != 2) {
            return null;
        }
        return com.caverock.androidsvg.SVG.Style.FontStyle.Normal;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.caverock.androidsvg.SVG.Style.TextDecoration coroutineBoundary(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1171789332:
                if (str.equals("line-through")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1026963764:
                if (str.equals("underline")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3387192:
                if (str.equals("none")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 93826908:
                if (str.equals(com.daon.sdk.face.license.License.FEATURE_BLINK)) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 529818312:
                if (str.equals("overline")) {
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
            return com.caverock.androidsvg.SVG.Style.TextDecoration.LineThrough;
        }
        if (c == 1) {
            return com.caverock.androidsvg.SVG.Style.TextDecoration.Underline;
        }
        if (c == 2) {
            return com.caverock.androidsvg.SVG.Style.TextDecoration.None;
        }
        if (c == 3) {
            return com.caverock.androidsvg.SVG.Style.TextDecoration.Blink;
        }
        if (c != 4) {
            return null;
        }
        return com.caverock.androidsvg.SVG.Style.TextDecoration.Overline;
    }

    private static com.caverock.androidsvg.SVG.Style.TextDirection accessartificialFrame(java.lang.String str) {
        str.hashCode();
        if (str.equals("ltr")) {
            return com.caverock.androidsvg.SVG.Style.TextDirection.LTR;
        }
        if (str.equals("rtl")) {
            return com.caverock.androidsvg.SVG.Style.TextDirection.RTL;
        }
        return null;
    }

    private static com.caverock.androidsvg.SVG.Style.LineCap toString(java.lang.String str) {
        if ("butt".equals(str)) {
            return com.caverock.androidsvg.SVG.Style.LineCap.Butt;
        }
        if ("round".equals(str)) {
            return com.caverock.androidsvg.SVG.Style.LineCap.Round;
        }
        if ("square".equals(str)) {
            return com.caverock.androidsvg.SVG.Style.LineCap.Square;
        }
        return null;
    }

    private static com.caverock.androidsvg.SVG.Style.LineJoin CoroutineDebuggingKt(java.lang.String str) {
        if ("miter".equals(str)) {
            return com.caverock.androidsvg.SVG.Style.LineJoin.Miter;
        }
        if ("round".equals(str)) {
            return com.caverock.androidsvg.SVG.Style.LineJoin.Round;
        }
        if ("bevel".equals(str)) {
            return com.caverock.androidsvg.SVG.Style.LineJoin.Bevel;
        }
        return null;
    }

    private static com.caverock.androidsvg.SVG.Length[] getValidOutputFormatsForInputhNQ4ISI(java.lang.String str) {
        com.caverock.androidsvg.SVG.Length inputSizeshNQ4ISI;
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        textScanner.getOutputSizes();
        if (textScanner.Camera2StreamConfigurationMap == textScanner.getHighSpeedVideoSizes || (inputSizeshNQ4ISI = textScanner.getInputSizeshNQ4ISI()) == null || inputSizeshNQ4ISI.getHighSpeedVideoFpsRanges < 0.0f) {
            return null;
        }
        float f = inputSizeshNQ4ISI.getHighSpeedVideoFpsRanges;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(inputSizeshNQ4ISI);
        while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
            textScanner.getOutputSizeshNQ4ISI();
            com.caverock.androidsvg.SVG.Length inputSizeshNQ4ISI2 = textScanner.getInputSizeshNQ4ISI();
            if (inputSizeshNQ4ISI2 == null || inputSizeshNQ4ISI2.getHighSpeedVideoFpsRanges < 0.0f) {
                return null;
            }
            arrayList.add(inputSizeshNQ4ISI2);
            f += inputSizeshNQ4ISI2.getHighSpeedVideoFpsRanges;
        }
        if (f == 0.0f) {
            return null;
        }
        return (com.caverock.androidsvg.SVG.Length[]) arrayList.toArray(new com.caverock.androidsvg.SVG.Length[arrayList.size()]);
    }

    private static com.caverock.androidsvg.SVG.Style.TextAnchor coroutineCreation(java.lang.String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -1074341483) {
            if (str.equals(com.paypal.oslo.feature.home.ui.components.fannedcollection.FannedCarouselConstants.PositionIds.MIDDLE)) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 100571) {
            if (hashCode == 109757538 && str.equals(com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START)) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals("end")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.caverock.androidsvg.SVG.Style.TextAnchor.Middle;
        }
        if (c == 1) {
            return com.caverock.androidsvg.SVG.Style.TextAnchor.End;
        }
        if (c != 2) {
            return null;
        }
        return com.caverock.androidsvg.SVG.Style.TextAnchor.Start;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static java.lang.Boolean getOutputStallDuration(java.lang.String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1217487446:
                if (str.equals("hidden")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -907680051:
                if (str.equals("scroll")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 3005871:
                if (str.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 466743410:
                if (str.equals("visible")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            return java.lang.Boolean.FALSE;
        }
        if (c == 2 || c == 3) {
            return java.lang.Boolean.TRUE;
        }
        return null;
    }

    private static com.caverock.androidsvg.SVG.CSSClipRect getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        com.caverock.androidsvg.SVG.Length inputSizeshNQ4ISI;
        com.caverock.androidsvg.SVG.Length inputSizeshNQ4ISI2;
        com.caverock.androidsvg.SVG.Length inputSizeshNQ4ISI3;
        com.caverock.androidsvg.SVG.Length inputSizeshNQ4ISI4;
        if (kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO.equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str.substring(5));
        textScanner.getOutputSizes();
        if (textScanner.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            inputSizeshNQ4ISI = new com.caverock.androidsvg.SVG.Length(0.0f);
        } else {
            inputSizeshNQ4ISI = textScanner.getInputSizeshNQ4ISI();
        }
        textScanner.getOutputSizeshNQ4ISI();
        if (textScanner.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            inputSizeshNQ4ISI2 = new com.caverock.androidsvg.SVG.Length(0.0f);
        } else {
            inputSizeshNQ4ISI2 = textScanner.getInputSizeshNQ4ISI();
        }
        textScanner.getOutputSizeshNQ4ISI();
        if (textScanner.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            inputSizeshNQ4ISI3 = new com.caverock.androidsvg.SVG.Length(0.0f);
        } else {
            inputSizeshNQ4ISI3 = textScanner.getInputSizeshNQ4ISI();
        }
        textScanner.getOutputSizeshNQ4ISI();
        if (textScanner.getHighSpeedVideoFpsRangesFor(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
            inputSizeshNQ4ISI4 = new com.caverock.androidsvg.SVG.Length(0.0f);
        } else {
            inputSizeshNQ4ISI4 = textScanner.getInputSizeshNQ4ISI();
        }
        textScanner.getOutputSizes();
        if (textScanner.Camera2StreamConfigurationMap(')') || textScanner.Camera2StreamConfigurationMap == textScanner.getHighSpeedVideoSizes) {
            return new com.caverock.androidsvg.SVG.CSSClipRect(inputSizeshNQ4ISI, inputSizeshNQ4ISI2, inputSizeshNQ4ISI3, inputSizeshNQ4ISI4);
        }
        return null;
    }

    private static com.caverock.androidsvg.SVG.Style.VectorEffect _CREATION(java.lang.String str) {
        str.hashCode();
        if (str.equals("none")) {
            return com.caverock.androidsvg.SVG.Style.VectorEffect.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return com.caverock.androidsvg.SVG.Style.VectorEffect.NonScalingStroke;
        }
        return null;
    }

    private static com.caverock.androidsvg.SVG.Style.RenderQuality unwrapAs(java.lang.String str) {
        char c;
        str.hashCode();
        int hashCode = str.hashCode();
        if (hashCode == -933002398) {
            if (str.equals("optimizeQuality")) {
                c = 0;
            }
            c = 65535;
        } else if (hashCode != 3005871) {
            if (hashCode == 362741610 && str.equals("optimizeSpeed")) {
                c = 2;
            }
            c = 65535;
        } else {
            if (str.equals(kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_AUTO)) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            return com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeQuality;
        }
        if (c == 1) {
            return com.caverock.androidsvg.SVG.Style.RenderQuality.auto;
        }
        if (c != 2) {
            return null;
        }
        return com.caverock.androidsvg.SVG.Style.RenderQuality.optimizeSpeed;
    }

    private static java.util.Set<java.lang.String> isOutputSupportedForhNQ4ISI(java.lang.String str) {
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
            java.lang.String highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges(' ', false);
            if (highSpeedVideoFpsRanges.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(highSpeedVideoFpsRanges.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            textScanner.getOutputSizes();
        }
        return hashSet;
    }

    private static java.util.Set<java.lang.String> ArtificialStackFrames(java.lang.String str) {
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
            java.lang.String highSpeedVideoFpsRanges = textScanner.getHighSpeedVideoFpsRanges(' ', false);
            int indexOf = highSpeedVideoFpsRanges.indexOf(45);
            if (indexOf != -1) {
                highSpeedVideoFpsRanges = highSpeedVideoFpsRanges.substring(0, indexOf);
            }
            hashSet.add(new java.util.Locale(highSpeedVideoFpsRanges, "", "").getLanguage());
            textScanner.getOutputSizes();
        }
        return hashSet;
    }

    private static java.util.Set<java.lang.String> isOutputSupportedFor(java.lang.String str) {
        com.caverock.androidsvg.SVGParser.TextScanner textScanner = new com.caverock.androidsvg.SVGParser.TextScanner(str);
        java.util.HashSet hashSet = new java.util.HashSet();
        while (textScanner.Camera2StreamConfigurationMap != textScanner.getHighSpeedVideoSizes) {
            hashSet.add(textScanner.getHighSpeedVideoFpsRanges(' ', false));
            textScanner.getOutputSizes();
        }
        return hashSet;
    }

    private static java.lang.String getOutputFormats(java.lang.String str) {
        if (str.equals("none") || !str.startsWith("url(")) {
            return null;
        }
        if (str.endsWith(")")) {
            return str.substring(4, str.length() - 1).trim();
        }
        return str.substring(4).trim();
    }

    private void isOutputSupportedFor(org.xml.sax.Attributes attributes) throws com.caverock.androidsvg.SVGParseException {
        if (this.Camera2StreamConfigurationMap == null) {
            throw new com.caverock.androidsvg.SVGParseException("Invalid document. Root element must be <svg>");
        }
        java.lang.String str = "all";
        boolean z = true;
        for (int i = 0; i < attributes.getLength(); i++) {
            java.lang.String trim = attributes.getValue(i).trim();
            int i2 = com.caverock.androidsvg.SVGParser.AnonymousClass1.getHighSpeedVideoFpsRanges[com.caverock.androidsvg.SVGParser.SVGAttr.getHighSpeedVideoFpsRangesFor(attributes.getLocalName(i)).ordinal()];
            if (i2 == 88) {
                z = trim.equals("text/css");
            } else if (i2 == 89) {
                str = trim;
            }
        }
        if (z && com.caverock.androidsvg.CSSParser.getHighSpeedVideoFpsRanges(str, com.caverock.androidsvg.CSSParser.MediaType.screen)) {
            this.getHighSpeedVideoFpsRangesFor = true;
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes = 1;
        }
    }

    static /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.SVGParser sVGParser) {
        sVGParser.getInputSizeshNQ4ISI = new com.caverock.androidsvg.SVG();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r2 > 1.0f) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.Float getOutputSizeshNQ4ISI(java.lang.String str) {
        try {
            int length = str.length();
            if (length == 0) {
                throw new com.caverock.androidsvg.SVGParseException("Invalid float value (empty string)");
            }
            float highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(str, length);
            float f = highResolutionOutputSizeshNQ4ISI >= 0.0f ? 1.0f : 0.0f;
            highResolutionOutputSizeshNQ4ISI = f;
            return java.lang.Float.valueOf(highResolutionOutputSizeshNQ4ISI);
        } catch (com.caverock.androidsvg.SVGParseException unused) {
            return null;
        }
    }
}
