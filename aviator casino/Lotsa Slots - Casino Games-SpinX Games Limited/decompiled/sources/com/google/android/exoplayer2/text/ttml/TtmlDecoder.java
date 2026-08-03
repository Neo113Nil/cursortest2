package com.google.android.exoplayer2.text.ttml;

/* loaded from: classes3.dex */
public final class TtmlDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final java.lang.String ATTR_BEGIN = "begin";
    private static final java.lang.String ATTR_DURATION = "dur";
    private static final java.lang.String ATTR_END = "end";
    private static final java.lang.String ATTR_IMAGE = "backgroundImage";
    private static final java.lang.String ATTR_REGION = "region";
    private static final java.lang.String ATTR_STYLE = "style";
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final java.lang.String TAG = "TtmlDecoder";
    private static final java.lang.String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final org.xmlpull.v1.XmlPullParserFactory xmlParserFactory;
    private static final java.util.regex.Pattern CLOCK_TIME = java.util.regex.Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final java.util.regex.Pattern OFFSET_TIME = java.util.regex.Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final java.util.regex.Pattern FONT_SIZE = java.util.regex.Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final java.util.regex.Pattern SIGNED_PERCENTAGE = java.util.regex.Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final java.util.regex.Pattern PERCENTAGE_COORDINATES = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    private static final java.util.regex.Pattern PIXEL_COORDINATES = java.util.regex.Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    private static final java.util.regex.Pattern CELL_RESOLUTION = java.util.regex.Pattern.compile("^(\\d+) (\\d+)$");
    private static final com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate(30.0f, 1, 1);
    private static final com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution DEFAULT_CELL_RESOLUTION = new com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution(32, 15);

    public TtmlDecoder() {
        super(TAG);
        try {
            org.xmlpull.v1.XmlPullParserFactory newInstance = org.xmlpull.v1.XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (org.xmlpull.v1.XmlPullParserException e) {
            throw new java.lang.RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate frameAndTickRate;
        try {
            org.xmlpull.v1.XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            java.util.HashMap hashMap3 = new java.util.HashMap();
            hashMap2.put("", new com.google.android.exoplayer2.text.ttml.TtmlRegion(""));
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent ttsExtent = null;
            newPullParser.setInput(new java.io.ByteArrayInputStream(bArr, 0, i), null);
            java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate frameAndTickRate2 = DEFAULT_FRAME_AND_TICK_RATE;
            com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution cellResolution = DEFAULT_CELL_RESOLUTION;
            com.google.android.exoplayer2.text.ttml.TtmlSubtitle ttmlSubtitle = null;
            int i2 = 0;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                com.google.android.exoplayer2.text.ttml.TtmlNode ttmlNode = (com.google.android.exoplayer2.text.ttml.TtmlNode) arrayDeque.peek();
                if (i2 == 0) {
                    java.lang.String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRate2 = parseFrameAndTickRates(newPullParser);
                            cellResolution = parseCellResolution(newPullParser, DEFAULT_CELL_RESOLUTION);
                            ttsExtent = parseTtsExtent(newPullParser);
                        }
                        com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent ttsExtent2 = ttsExtent;
                        com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate frameAndTickRate3 = frameAndTickRate2;
                        com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution cellResolution2 = cellResolution;
                        if (isSupportedTag(name)) {
                            if ("head".equals(name)) {
                                frameAndTickRate = frameAndTickRate3;
                                parseHeader(newPullParser, hashMap, cellResolution2, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                frameAndTickRate = frameAndTickRate3;
                                try {
                                    com.google.android.exoplayer2.text.ttml.TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (com.google.android.exoplayer2.text.SubtitleDecoderException e) {
                                    com.google.android.exoplayer2.util.Log.w(TAG, "Suppressing parser error", e);
                                    i2++;
                                }
                            }
                            frameAndTickRate2 = frameAndTickRate;
                        } else {
                            com.google.android.exoplayer2.util.Log.i(TAG, "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            frameAndTickRate2 = frameAndTickRate3;
                        }
                        ttsExtent = ttsExtent2;
                        cellResolution = cellResolution2;
                    } else if (eventType == 4) {
                        ((com.google.android.exoplayer2.text.ttml.TtmlNode) com.google.android.exoplayer2.util.Assertions.checkNotNull(ttmlNode)).addChild(com.google.android.exoplayer2.text.ttml.TtmlNode.buildTextNode(newPullParser.getText()));
                    } else if (eventType == 3) {
                        if (newPullParser.getName().equals("tt")) {
                            ttmlSubtitle = new com.google.android.exoplayer2.text.ttml.TtmlSubtitle((com.google.android.exoplayer2.text.ttml.TtmlNode) com.google.android.exoplayer2.util.Assertions.checkNotNull((com.google.android.exoplayer2.text.ttml.TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                        }
                        arrayDeque.pop();
                    }
                } else if (eventType == 2) {
                    i2++;
                } else if (eventType == 3) {
                    i2--;
                }
                newPullParser.next();
            }
            if (ttmlSubtitle != null) {
                return ttmlSubtitle;
            }
            throw new com.google.android.exoplayer2.text.SubtitleDecoderException("No TTML subtitles found");
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException("Unexpected error when reading input.", e2);
        } catch (org.xmlpull.v1.XmlPullParserException e3) {
            throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Unable to decode source", e3);
        }
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate parseFrameAndTickRates(org.xmlpull.v1.XmlPullParser xmlPullParser) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        float f;
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int parseInt = attributeValue != null ? java.lang.Integer.parseInt(attributeValue) : 30;
        java.lang.String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            if (com.google.android.exoplayer2.util.Util.split(attributeValue2, io.ktor.sse.ServerSentEventKt.SPACE).length != 2) {
                throw new com.google.android.exoplayer2.text.SubtitleDecoderException("frameRateMultiplier doesn't have 2 parts");
            }
            f = java.lang.Integer.parseInt(r2[0]) / java.lang.Integer.parseInt(r2[1]);
        } else {
            f = 1.0f;
        }
        com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i = frameAndTickRate.subFrameRate;
        java.lang.String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i = java.lang.Integer.parseInt(attributeValue3);
        }
        int i2 = frameAndTickRate.tickRate;
        java.lang.String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i2 = java.lang.Integer.parseInt(attributeValue4);
        }
        return new com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate(parseInt * f, i, i2);
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution parseCellResolution(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution cellResolution) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        java.lang.String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return cellResolution;
        }
        java.util.regex.Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
        try {
            int parseInt = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Invalid cell resolution " + parseInt + io.ktor.sse.ServerSentEventKt.SPACE + parseInt2);
            }
            return new com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution(parseInt, parseInt2);
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return cellResolution;
        }
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent parseTtsExtent(org.xmlpull.v1.XmlPullParser xmlPullParser) {
        java.lang.String attributeValue = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue == null) {
            return null;
        }
        java.util.regex.Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent(java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1))), java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2))));
        } catch (java.lang.NumberFormatException unused) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    private static java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> parseHeader(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlStyle> map, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution cellResolution, com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent ttsExtent, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> map2, java.util.Map<java.lang.String, java.lang.String> map3) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        do {
            xmlPullParser.next();
            if (com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                java.lang.String attributeValue = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                com.google.android.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new com.google.android.exoplayer2.text.ttml.TtmlStyle());
                if (attributeValue != null) {
                    for (java.lang.String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                java.lang.String id = parseStyleAttributes.getId();
                if (id != null) {
                    map.put(id, parseStyleAttributes);
                }
            } else if (com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                com.google.android.exoplayer2.text.ttml.TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, cellResolution, ttsExtent);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.id, parseRegionAttributes);
                }
            } else if (com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(xmlPullParser, "metadata")) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(xmlPullParser, "head"));
        return map;
    }

    private static void parseMetadata(org.xmlpull.v1.XmlPullParser xmlPullParser, java.util.Map<java.lang.String, java.lang.String> map) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        java.lang.String attributeValue;
        do {
            xmlPullParser.next();
            if (com.google.android.exoplayer2.util.XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!com.google.android.exoplayer2.util.XmlPullParserUtil.isEndTag(xmlPullParser, "metadata"));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x019d, code lost:
    
        if (r0.equals("tb") == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0170  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.exoplayer2.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution cellResolution, com.google.android.exoplayer2.text.ttml.TtmlDecoder.TtsExtent ttsExtent) {
        float parseFloat;
        float f;
        float parseFloat2;
        float parseFloat3;
        com.google.android.exoplayer2.text.ttml.TtmlDecoder.CellResolution cellResolution2;
        float f2;
        int i;
        java.lang.String attributeValue;
        int i2;
        java.lang.String attributeValue2 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "id");
        if (attributeValue2 == null) {
            return null;
        }
        java.lang.String attributeValue3 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "origin");
        if (attributeValue3 == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region without an origin");
            return null;
        }
        java.util.regex.Pattern pattern = PERCENTAGE_COORDINATES;
        java.util.regex.Matcher matcher = pattern.matcher(attributeValue3);
        java.util.regex.Pattern pattern2 = PIXEL_COORDINATES;
        java.util.regex.Matcher matcher2 = pattern2.matcher(attributeValue3);
        if (matcher.matches()) {
            try {
                float parseFloat4 = java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1))) / 100.0f;
                parseFloat = java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2))) / 100.0f;
                f = parseFloat4;
            } catch (java.lang.NumberFormatException unused) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue3);
                return null;
            }
        } else {
            if (!matcher2.matches()) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with unsupported origin: " + attributeValue3);
                return null;
            }
            if (ttsExtent == null) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue3);
                return null;
            }
            try {
                int parseInt = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher2.group(1)));
                f = parseInt / ttsExtent.width;
                parseFloat = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher2.group(2))) / ttsExtent.height;
            } catch (java.lang.NumberFormatException unused2) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with malformed origin: " + attributeValue3);
                return null;
            }
        }
        java.lang.String attributeValue4 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "extent");
        if (attributeValue4 == null) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region without an extent");
            return null;
        }
        java.util.regex.Matcher matcher3 = pattern.matcher(attributeValue4);
        java.util.regex.Matcher matcher4 = pattern2.matcher(attributeValue4);
        if (matcher3.matches()) {
            try {
                parseFloat2 = java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher3.group(1))) / 100.0f;
                parseFloat3 = java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher3.group(2))) / 100.0f;
            } catch (java.lang.NumberFormatException unused3) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue3);
                return null;
            }
        } else {
            if (!matcher4.matches()) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with unsupported extent: " + attributeValue3);
                return null;
            }
            if (ttsExtent == null) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with missing tts:extent: " + attributeValue3);
                return null;
            }
            try {
                int parseInt2 = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher4.group(1)));
                parseFloat2 = parseInt2 / ttsExtent.width;
                parseFloat3 = java.lang.Integer.parseInt((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher4.group(2))) / ttsExtent.height;
            } catch (java.lang.NumberFormatException unused4) {
                com.google.android.exoplayer2.util.Log.w(TAG, "Ignoring region with malformed extent: " + attributeValue3);
                return null;
            }
        }
        java.lang.String attributeValue5 = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "displayAlign");
        char c = 0;
        if (attributeValue5 != null) {
            java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(attributeValue5);
            lowerCase.hashCode();
            if (lowerCase.equals("center")) {
                cellResolution2 = cellResolution;
                f2 = parseFloat + (parseFloat3 / 2.0f);
                i = 1;
            } else if (lowerCase.equals("after")) {
                cellResolution2 = cellResolution;
                f2 = parseFloat + parseFloat3;
                i = 2;
            }
            float f3 = 1.0f / cellResolution2.rows;
            attributeValue = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "writingMode");
            if (attributeValue != null) {
                java.lang.String lowerCase2 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                lowerCase2.hashCode();
                switch (lowerCase2.hashCode()) {
                    case 3694:
                        break;
                    case 3553396:
                        if (lowerCase2.equals("tblr")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3553576:
                        if (lowerCase2.equals("tbrl")) {
                            c = 2;
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
                    case 1:
                        i2 = 2;
                        break;
                    case 2:
                        i2 = 1;
                        break;
                }
                return new com.google.android.exoplayer2.text.ttml.TtmlRegion(attributeValue2, f, f2, 0, i, parseFloat2, parseFloat3, 1, f3, i2);
            }
            i2 = Integer.MIN_VALUE;
            return new com.google.android.exoplayer2.text.ttml.TtmlRegion(attributeValue2, f, f2, 0, i, parseFloat2, parseFloat3, 1, f3, i2);
        }
        cellResolution2 = cellResolution;
        f2 = parseFloat;
        i = 0;
        float f32 = 1.0f / cellResolution2.rows;
        attributeValue = com.google.android.exoplayer2.util.XmlPullParserUtil.getAttributeValue(xmlPullParser, "writingMode");
        if (attributeValue != null) {
        }
        i2 = Integer.MIN_VALUE;
        return new com.google.android.exoplayer2.text.ttml.TtmlRegion(attributeValue2, f, f2, 0, i, parseFloat2, parseFloat3, 1, f32, i2);
    }

    private static java.lang.String[] parseStyleIds(java.lang.String str) {
        java.lang.String trim = str.trim();
        return trim.isEmpty() ? new java.lang.String[0] : com.google.android.exoplayer2.util.Util.split(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d7, code lost:
    
        if (r3.equals("text") == false) goto L100;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.google.android.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlStyle ttmlStyle) {
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            char c2 = 5;
            switch (attributeName.hashCode()) {
                case -1550943582:
                    if (attributeName.equals("fontStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1224696685:
                    if (attributeName.equals("fontFamily")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1065511464:
                    if (attributeName.equals("textAlign")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -879295043:
                    if (attributeName.equals("textDecoration")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case -734428249:
                    if (attributeName.equals("fontWeight")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 3355:
                    if (attributeName.equals("id")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 3511770:
                    if (attributeName.equals("ruby")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 94842723:
                    if (attributeName.equals("color")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 109403361:
                    if (attributeName.equals("shear")) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 110138194:
                    if (attributeName.equals("textCombine")) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 365601008:
                    if (attributeName.equals("fontSize")) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 921125321:
                    if (attributeName.equals("textEmphasis")) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                case 1115953443:
                    if (attributeName.equals("rubyPosition")) {
                        c = '\f';
                        break;
                    }
                    c = 65535;
                    break;
                case 1287124693:
                    if (attributeName.equals("backgroundColor")) {
                        c = '\r';
                        break;
                    }
                    c = 65535;
                    break;
                case 1754920356:
                    if (attributeName.equals("multiRowAlign")) {
                        c = 14;
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
                    ttmlStyle = createIfNull(ttmlStyle).setItalic("italic".equalsIgnoreCase(attributeValue));
                    break;
                case 1:
                    ttmlStyle = createIfNull(ttmlStyle).setFontFamily(attributeValue);
                    break;
                case 2:
                    ttmlStyle = createIfNull(ttmlStyle).setTextAlign(parseAlignment(attributeValue));
                    break;
                case 3:
                    java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase.hashCode();
                    switch (lowerCase) {
                        case "nounderline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(false);
                            break;
                        case "underline":
                            ttmlStyle = createIfNull(ttmlStyle).setUnderline(true);
                            break;
                        case "nolinethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(false);
                            break;
                        case "linethrough":
                            ttmlStyle = createIfNull(ttmlStyle).setLinethrough(true);
                            break;
                    }
                case 4:
                    ttmlStyle = createIfNull(ttmlStyle).setBold("bold".equalsIgnoreCase(attributeValue));
                    break;
                case 5:
                    if ("style".equals(xmlPullParser.getName())) {
                        ttmlStyle = createIfNull(ttmlStyle).setId(attributeValue);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    java.lang.String lowerCase2 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase2.hashCode();
                    switch (lowerCase2.hashCode()) {
                        case -618561360:
                            if (lowerCase2.equals("baseContainer")) {
                                c2 = 0;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -410956671:
                            if (lowerCase2.equals("container")) {
                                c2 = 1;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -250518009:
                            if (lowerCase2.equals("delimiter")) {
                                c2 = 2;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case -136074796:
                            if (lowerCase2.equals("textContainer")) {
                                c2 = 3;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3016401:
                            if (lowerCase2.equals("base")) {
                                c2 = 4;
                                break;
                            }
                            c2 = 65535;
                            break;
                        case 3556653:
                            break;
                        default:
                            c2 = 65535;
                            break;
                    }
                    switch (c2) {
                        case 0:
                        case 4:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(2);
                            break;
                        case 1:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(1);
                            break;
                        case 2:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(4);
                            break;
                        case 3:
                        case 5:
                            ttmlStyle = createIfNull(ttmlStyle).setRubyType(3);
                            break;
                    }
                case 7:
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setFontColor(com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Failed parsing color value: " + attributeValue);
                        break;
                    }
                case '\b':
                    ttmlStyle = createIfNull(ttmlStyle).setShearPercentage(parseShear(attributeValue));
                    break;
                case '\t':
                    java.lang.String lowerCase3 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase3.hashCode();
                    if (lowerCase3.equals("all")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(true);
                        break;
                    } else if (lowerCase3.equals("none")) {
                        ttmlStyle = createIfNull(ttmlStyle).setTextCombine(false);
                        break;
                    } else {
                        break;
                    }
                case '\n':
                    try {
                        ttmlStyle = createIfNull(ttmlStyle);
                        parseFontSize(attributeValue, ttmlStyle);
                        break;
                    } catch (com.google.android.exoplayer2.text.SubtitleDecoderException unused2) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Failed parsing fontSize value: " + attributeValue);
                        break;
                    }
                case 11:
                    ttmlStyle = createIfNull(ttmlStyle).setTextEmphasis(com.google.android.exoplayer2.text.ttml.TextEmphasis.parse(attributeValue));
                    break;
                case '\f':
                    java.lang.String lowerCase4 = com.google.common.base.Ascii.toLowerCase(attributeValue);
                    lowerCase4.hashCode();
                    if (lowerCase4.equals("before")) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(1);
                        break;
                    } else if (lowerCase4.equals("after")) {
                        ttmlStyle = createIfNull(ttmlStyle).setRubyPosition(2);
                        break;
                    } else {
                        break;
                    }
                case '\r':
                    ttmlStyle = createIfNull(ttmlStyle);
                    try {
                        ttmlStyle.setBackgroundColor(com.google.android.exoplayer2.util.ColorParser.parseTtmlColor(attributeValue));
                        break;
                    } catch (java.lang.IllegalArgumentException unused3) {
                        com.google.android.exoplayer2.util.Log.w(TAG, "Failed parsing background value: " + attributeValue);
                        break;
                    }
                case 14:
                    ttmlStyle = createIfNull(ttmlStyle).setMultiRowAlign(parseAlignment(attributeValue));
                    break;
            }
        }
        return ttmlStyle;
    }

    private static com.google.android.exoplayer2.text.ttml.TtmlStyle createIfNull(com.google.android.exoplayer2.text.ttml.TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new com.google.android.exoplayer2.text.ttml.TtmlStyle() : ttmlStyle;
    }

    private static android.text.Layout.Alignment parseAlignment(java.lang.String str) {
        java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(str);
        lowerCase.hashCode();
        switch (lowerCase) {
            case "center":
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static com.google.android.exoplayer2.text.ttml.TtmlNode parseNode(org.xmlpull.v1.XmlPullParser xmlPullParser, com.google.android.exoplayer2.text.ttml.TtmlNode ttmlNode, java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ttml.TtmlRegion> map, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate frameAndTickRate) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        long j;
        long j2;
        char c;
        int attributeCount = xmlPullParser.getAttributeCount();
        com.google.android.exoplayer2.text.ttml.TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, null);
        java.lang.String[] strArr = null;
        java.lang.String str = null;
        java.lang.String str2 = "";
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        long j5 = -9223372036854775807L;
        for (int i = 0; i < attributeCount; i++) {
            java.lang.String attributeName = xmlPullParser.getAttributeName(i);
            java.lang.String attributeValue = xmlPullParser.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 99841:
                    if (attributeName.equals(ATTR_DURATION)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals(ATTR_BEGIN)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals(ATTR_IMAGE)) {
                        c = 5;
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
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case 1:
                    j5 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 2:
                    j4 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 3:
                    j3 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case 4:
                    java.lang.String[] parseStyleIds = parseStyleIds(attributeValue);
                    if (parseStyleIds.length > 0) {
                        strArr = parseStyleIds;
                        break;
                    }
                    break;
                case 5:
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
        }
        if (ttmlNode != null) {
            j = -9223372036854775807L;
            if (ttmlNode.startTimeUs != -9223372036854775807L) {
                if (j3 != -9223372036854775807L) {
                    j3 += ttmlNode.startTimeUs;
                }
                if (j4 != -9223372036854775807L) {
                    j4 += ttmlNode.startTimeUs;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        long j6 = j3;
        if (j4 == j) {
            if (j5 != j) {
                j2 = j6 + j5;
            } else if (ttmlNode != null && ttmlNode.endTimeUs != j) {
                j2 = ttmlNode.endTimeUs;
            }
            return com.google.android.exoplayer2.text.ttml.TtmlNode.buildNode(xmlPullParser.getName(), j6, j2, parseStyleAttributes, strArr, str2, str, ttmlNode);
        }
        j2 = j4;
        return com.google.android.exoplayer2.text.ttml.TtmlNode.buildNode(xmlPullParser.getName(), j6, j2, parseStyleAttributes, strArr, str2, str, ttmlNode);
    }

    private static boolean isSupportedTag(java.lang.String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    private static void parseFontSize(java.lang.String str, com.google.android.exoplayer2.text.ttml.TtmlStyle ttmlStyle) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        java.util.regex.Matcher matcher;
        java.lang.String str2;
        java.lang.String[] split = com.google.android.exoplayer2.util.Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else if (split.length == 2) {
            matcher = FONT_SIZE.matcher(split[1]);
            com.google.android.exoplayer2.util.Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        } else {
            throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Invalid number of entries for fontSize: " + split.length + ".");
        }
        if (matcher.matches()) {
            str2 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(3));
            str2.hashCode();
            switch (str2) {
                case "%":
                    ttmlStyle.setFontSizeUnit(3);
                    break;
                case "em":
                    ttmlStyle.setFontSizeUnit(2);
                    break;
                case "px":
                    ttmlStyle.setFontSizeUnit(1);
                    break;
                default:
                    throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
            }
            ttmlStyle.setFontSize(java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1))));
            return;
        }
        throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
    }

    private static float parseShear(java.lang.String str) {
        java.util.regex.Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return java.lang.Math.min(100.0f, java.lang.Math.max(-100.0f, java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1)))));
        } catch (java.lang.NumberFormatException e) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Failed to parse shear: " + str, e);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bf, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static long parseTimeExpression(java.lang.String str, com.google.android.exoplayer2.text.ttml.TtmlDecoder.FrameAndTickRate frameAndTickRate) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        double d;
        double d2;
        java.util.regex.Matcher matcher = CLOCK_TIME.matcher(str);
        char c = 4;
        if (matcher.matches()) {
            double parseLong = (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1))) * 3600) + (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2))) * 60) + java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(3)));
            java.lang.String group = matcher.group(4);
            return (long) ((parseLong + (group != null ? java.lang.Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? java.lang.Long.parseLong(r13) / frameAndTickRate.effectiveFrameRate : 0.0d) + (matcher.group(6) != null ? (java.lang.Long.parseLong(r13) / frameAndTickRate.subFrameRate) / frameAndTickRate.effectiveFrameRate : 0.0d)) * 1000000.0d);
        }
        java.util.regex.Matcher matcher2 = OFFSET_TIME.matcher(str);
        if (matcher2.matches()) {
            double parseDouble = java.lang.Double.parseDouble((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher2.group(1)));
            java.lang.String str2 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher2.group(2));
            str2.hashCode();
            switch (str2.hashCode()) {
                case 102:
                    if (str2.equals(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE)) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 104:
                    if (str2.equals(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 109:
                    if (str2.equals(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 116:
                    if (str2.equals("t")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3494:
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    d = frameAndTickRate.effectiveFrameRate;
                    parseDouble /= d;
                    break;
                case 1:
                    d2 = 3600.0d;
                    break;
                case 2:
                    d2 = 60.0d;
                    break;
                case 3:
                    d = frameAndTickRate.tickRate;
                    parseDouble /= d;
                    break;
                case 4:
                    d = 1000.0d;
                    parseDouble /= d;
                    break;
            }
            parseDouble *= d2;
            return (long) (parseDouble * 1000000.0d);
        }
        throw new com.google.android.exoplayer2.text.SubtitleDecoderException("Malformed time expression: " + str);
    }

    private static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        FrameAndTickRate(float f, int i, int i2) {
            this.effectiveFrameRate = f;
            this.subFrameRate = i;
            this.tickRate = i2;
        }
    }

    private static final class CellResolution {
        final int columns;
        final int rows;

        CellResolution(int i, int i2) {
            this.columns = i;
            this.rows = i2;
        }
    }

    private static final class TtsExtent {
        final int height;
        final int width;

        TtsExtent(int i, int i2) {
            this.width = i;
            this.height = i2;
        }
    }
}
