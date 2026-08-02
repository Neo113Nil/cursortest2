package com.caverock.androidsvg;

/* loaded from: classes7.dex */
class CSSParser {
    private com.caverock.androidsvg.CSSParser.MediaType getHighResolutionOutputSizeshNQ4ISI;
    private boolean getHighSpeedVideoFpsRanges;
    private com.caverock.androidsvg.CSSParser.Source getHighSpeedVideoSizes;

    enum AttribOp {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    enum Combinator {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum MediaType {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    interface PseudoClass {
        boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase);
    }

    enum Source {
        Document,
        RenderOptions
    }

    enum PseudoClassIdents {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;

        private static final java.util.Map<java.lang.String, com.caverock.androidsvg.CSSParser.PseudoClassIdents> getARTIFICIAL_FRAME_PACKAGE_NAME = new java.util.HashMap();

        static {
            for (com.caverock.androidsvg.CSSParser.PseudoClassIdents pseudoClassIdents : values()) {
                if (pseudoClassIdents != UNSUPPORTED) {
                    getARTIFICIAL_FRAME_PACKAGE_NAME.put(pseudoClassIdents.name().replace('_', '-'), pseudoClassIdents);
                }
            }
        }

        public static com.caverock.androidsvg.CSSParser.PseudoClassIdents Camera2StreamConfigurationMap(java.lang.String str) {
            com.caverock.androidsvg.CSSParser.PseudoClassIdents pseudoClassIdents = getARTIFICIAL_FRAME_PACKAGE_NAME.get(str);
            return pseudoClassIdents != null ? pseudoClassIdents : UNSUPPORTED;
        }
    }

    static class Attrib {
        public final java.lang.String Camera2StreamConfigurationMap;
        final com.caverock.androidsvg.CSSParser.AttribOp getHighSpeedVideoFpsRangesFor;
        public final java.lang.String getHighSpeedVideoSizes;

        Attrib(java.lang.String str, com.caverock.androidsvg.CSSParser.AttribOp attribOp, java.lang.String str2) {
            this.Camera2StreamConfigurationMap = str;
            this.getHighSpeedVideoFpsRangesFor = attribOp;
            this.getHighSpeedVideoSizes = str2;
        }
    }

    static class SimpleSelector {
        java.lang.String getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.CSSParser.Combinator getHighSpeedVideoSizes;
        java.util.List<com.caverock.androidsvg.CSSParser.Attrib> getHighSpeedVideoFpsRangesFor = null;
        java.util.List<com.caverock.androidsvg.CSSParser.PseudoClass> Camera2StreamConfigurationMap = null;

        SimpleSelector(com.caverock.androidsvg.CSSParser.Combinator combinator, java.lang.String str) {
            this.getHighSpeedVideoSizes = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getHighSpeedVideoSizes = combinator == null ? com.caverock.androidsvg.CSSParser.Combinator.DESCENDANT : combinator;
            this.getHighSpeedVideoFpsRanges = str;
        }

        final void getHighSpeedVideoFpsRangesFor(java.lang.String str, com.caverock.androidsvg.CSSParser.AttribOp attribOp, java.lang.String str2) {
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            }
            this.getHighSpeedVideoFpsRangesFor.add(new com.caverock.androidsvg.CSSParser.Attrib(str, attribOp, str2));
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            if (this.getHighSpeedVideoSizes == com.caverock.androidsvg.CSSParser.Combinator.CHILD) {
                sb.append("> ");
            } else if (this.getHighSpeedVideoSizes == com.caverock.androidsvg.CSSParser.Combinator.FOLLOWS) {
                sb.append("+ ");
            }
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str == null) {
                str = "*";
            }
            sb.append(str);
            java.util.List<com.caverock.androidsvg.CSSParser.Attrib> list = this.getHighSpeedVideoFpsRangesFor;
            if (list != null) {
                for (com.caverock.androidsvg.CSSParser.Attrib attrib : list) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(attrib.Camera2StreamConfigurationMap);
                    int i = com.caverock.androidsvg.CSSParser.AnonymousClass1.getHighSpeedVideoSizes[attrib.getHighSpeedVideoFpsRangesFor.ordinal()];
                    if (i == 1) {
                        sb.append('=');
                        sb.append(attrib.getHighSpeedVideoSizes);
                    } else if (i == 2) {
                        sb.append("~=");
                        sb.append(attrib.getHighSpeedVideoSizes);
                    } else if (i == 3) {
                        sb.append("|=");
                        sb.append(attrib.getHighSpeedVideoSizes);
                    }
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
                }
            }
            java.util.List<com.caverock.androidsvg.CSSParser.PseudoClass> list2 = this.Camera2StreamConfigurationMap;
            if (list2 != null) {
                for (com.caverock.androidsvg.CSSParser.PseudoClass pseudoClass : list2) {
                    sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
                    sb.append(pseudoClass);
                }
            }
            return sb.toString();
        }
    }

    static class Ruleset {
        java.util.List<com.caverock.androidsvg.CSSParser.Rule> Camera2StreamConfigurationMap = null;

        Ruleset() {
        }

        final void getHighSpeedVideoFpsRanges(com.caverock.androidsvg.CSSParser.Rule rule) {
            if (this.Camera2StreamConfigurationMap == null) {
                this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            }
            for (int i = 0; i < this.Camera2StreamConfigurationMap.size(); i++) {
                if (this.Camera2StreamConfigurationMap.get(i).getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor > rule.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor) {
                    this.Camera2StreamConfigurationMap.add(i, rule);
                    return;
                }
            }
            this.Camera2StreamConfigurationMap.add(rule);
        }

        final void getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.CSSParser.Ruleset ruleset) {
            if (ruleset.Camera2StreamConfigurationMap != null) {
                if (this.Camera2StreamConfigurationMap == null) {
                    this.Camera2StreamConfigurationMap = new java.util.ArrayList(ruleset.Camera2StreamConfigurationMap.size());
                }
                java.util.Iterator<com.caverock.androidsvg.CSSParser.Rule> it = ruleset.Camera2StreamConfigurationMap.iterator();
                while (it.hasNext()) {
                    getHighSpeedVideoFpsRanges(it.next());
                }
            }
        }

        public java.lang.String toString() {
            if (this.Camera2StreamConfigurationMap == null) {
                return "";
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<com.caverock.androidsvg.CSSParser.Rule> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
                sb.append('\n');
            }
            return sb.toString();
        }
    }

    static class Rule {
        com.caverock.androidsvg.CSSParser.Source getHighSpeedVideoFpsRanges;
        com.caverock.androidsvg.CSSParser.Selector getHighSpeedVideoFpsRangesFor;
        com.caverock.androidsvg.SVG.Style getHighSpeedVideoSizes;

        Rule(com.caverock.androidsvg.CSSParser.Selector selector, com.caverock.androidsvg.SVG.Style style, com.caverock.androidsvg.CSSParser.Source source) {
            this.getHighSpeedVideoFpsRangesFor = selector;
            this.getHighSpeedVideoSizes = style;
            this.getHighSpeedVideoFpsRanges = source;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(java.lang.String.valueOf(this.getHighSpeedVideoFpsRangesFor));
            sb.append(" {...} (src=");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(")");
            return sb.toString();
        }
    }

    static class Selector {
        java.util.List<com.caverock.androidsvg.CSSParser.SimpleSelector> Camera2StreamConfigurationMap;
        int getHighSpeedVideoFpsRangesFor;

        private Selector() {
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoFpsRangesFor = 0;
        }

        /* synthetic */ Selector(byte b) {
            this();
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.util.Iterator<com.caverock.androidsvg.CSSParser.SimpleSelector> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                sb.append(' ');
            }
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(this.getHighSpeedVideoFpsRangesFor);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    CSSParser() {
        this(com.caverock.androidsvg.CSSParser.MediaType.screen, com.caverock.androidsvg.CSSParser.Source.Document);
    }

    CSSParser(com.caverock.androidsvg.CSSParser.Source source) {
        this(com.caverock.androidsvg.CSSParser.MediaType.screen, source);
    }

    CSSParser(com.caverock.androidsvg.CSSParser.MediaType mediaType, com.caverock.androidsvg.CSSParser.Source source) {
        this.getHighSpeedVideoFpsRanges = false;
        this.getHighResolutionOutputSizeshNQ4ISI = mediaType;
        this.getHighSpeedVideoSizes = source;
    }

    static boolean getHighSpeedVideoFpsRanges(java.lang.String str, com.caverock.androidsvg.CSSParser.MediaType mediaType) {
        com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner = new com.caverock.androidsvg.CSSParser.CSSTextScanner(str);
        cSSTextScanner.getOutputSizes();
        return Camera2StreamConfigurationMap(getHighSpeedVideoSizes(cSSTextScanner), mediaType);
    }

    static class CSSTextScanner extends com.caverock.androidsvg.SVGParser.TextScanner {
        static int Camera2StreamConfigurationMap(int i) {
            if (i >= 48 && i <= 57) {
                return i - 48;
            }
            if (i >= 65 && i <= 70) {
                return i - 55;
            }
            if (i < 97 || i > 102) {
                return -1;
            }
            return i - 87;
        }

        CSSTextScanner(java.lang.String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        final java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            int validOutputFormatsForInputhNQ4ISI = getValidOutputFormatsForInputhNQ4ISI();
            if (validOutputFormatsForInputhNQ4ISI == this.Camera2StreamConfigurationMap) {
                return null;
            }
            java.lang.String substring = this.getHighSpeedVideoFpsRanges.substring(this.Camera2StreamConfigurationMap, validOutputFormatsForInputhNQ4ISI);
            this.Camera2StreamConfigurationMap = validOutputFormatsForInputhNQ4ISI;
            return substring;
        }

        static class AnPlusB {
            public int getHighResolutionOutputSizeshNQ4ISI;
            public int getHighSpeedVideoFpsRangesFor;

            AnPlusB(int i, int i2) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                this.getHighSpeedVideoFpsRangesFor = i2;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        
            if (Camera2StreamConfigurationMap(')') == false) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        
            r19.Camera2StreamConfigurationMap = r4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00b9, code lost:
        
            continue;
         */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:97:0x0216  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x022c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private void getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.Selector selector, com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector) throws com.caverock.androidsvg.CSSParseException {
            com.caverock.androidsvg.IntegerParser integerParser;
            com.caverock.androidsvg.CSSParser.CSSTextScanner.AnPlusB anPlusB;
            com.caverock.androidsvg.CSSParser.CSSTextScanner.AnPlusB anPlusB2;
            java.util.List<com.caverock.androidsvg.CSSParser.Selector> list;
            com.caverock.androidsvg.CSSParser.PseudoClass pseudoClass;
            java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            if (highResolutionOutputSizeshNQ4ISI == null) {
                throw new com.caverock.androidsvg.CSSParseException("Invalid pseudo class");
            }
            com.caverock.androidsvg.CSSParser.PseudoClassIdents Camera2StreamConfigurationMap = com.caverock.androidsvg.CSSParser.PseudoClassIdents.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI);
            int i = 1;
            byte b = 0;
            switch (com.caverock.androidsvg.CSSParser.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[Camera2StreamConfigurationMap.ordinal()]) {
                case 1:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassAnPlusB = new com.caverock.androidsvg.CSSParser.PseudoClassAnPlusB(0, 1, true, false, null);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassAnPlusB;
                    break;
                case 2:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassAnPlusB2 = new com.caverock.androidsvg.CSSParser.PseudoClassAnPlusB(0, 1, false, false, null);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassAnPlusB2;
                    break;
                case 3:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassOnlyChild = new com.caverock.androidsvg.CSSParser.PseudoClassOnlyChild(false, null);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassOnlyChild;
                    break;
                case 4:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassAnPlusB3 = new com.caverock.androidsvg.CSSParser.PseudoClassAnPlusB(0, 1, true, true, simpleSelector.getHighSpeedVideoFpsRanges);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassAnPlusB3;
                    break;
                case 5:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassAnPlusB4 = new com.caverock.androidsvg.CSSParser.PseudoClassAnPlusB(0, 1, false, true, simpleSelector.getHighSpeedVideoFpsRanges);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassAnPlusB4;
                    break;
                case 6:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassOnlyChild2 = new com.caverock.androidsvg.CSSParser.PseudoClassOnlyChild(true, simpleSelector.getHighSpeedVideoFpsRanges);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassOnlyChild2;
                    break;
                case 7:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassRoot = new com.caverock.androidsvg.CSSParser.PseudoClassRoot(b);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassRoot;
                    break;
                case 8:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassEmpty = new com.caverock.androidsvg.CSSParser.PseudoClassEmpty((byte) 0);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassEmpty;
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z = Camera2StreamConfigurationMap == com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_child || Camera2StreamConfigurationMap == com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_of_type;
                    boolean z2 = Camera2StreamConfigurationMap == com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_of_type || Camera2StreamConfigurationMap == com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_last_of_type;
                    if (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes) {
                        int i2 = this.Camera2StreamConfigurationMap;
                        if (Camera2StreamConfigurationMap('(')) {
                            getOutputSizes();
                            if (getHighSpeedVideoFpsRangesFor("odd")) {
                                anPlusB = new com.caverock.androidsvg.CSSParser.CSSTextScanner.AnPlusB(2, 1);
                            } else if (getHighSpeedVideoFpsRangesFor("even")) {
                                anPlusB = new com.caverock.androidsvg.CSSParser.CSSTextScanner.AnPlusB(2, 0);
                            } else {
                                int i3 = (Camera2StreamConfigurationMap('+') || !Camera2StreamConfigurationMap('-')) ? 1 : -1;
                                com.caverock.androidsvg.IntegerParser highSpeedVideoFpsRangesFor = com.caverock.androidsvg.IntegerParser.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
                                if (highSpeedVideoFpsRangesFor != null) {
                                    this.Camera2StreamConfigurationMap = highSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap;
                                }
                                if (Camera2StreamConfigurationMap('n') || Camera2StreamConfigurationMap('N')) {
                                    if (highSpeedVideoFpsRangesFor == null) {
                                        highSpeedVideoFpsRangesFor = new com.caverock.androidsvg.IntegerParser(1L, this.Camera2StreamConfigurationMap);
                                    }
                                    getOutputSizes();
                                    boolean Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap('+');
                                    int i4 = (Camera2StreamConfigurationMap2 || !(Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap('-'))) ? 1 : -1;
                                    if (Camera2StreamConfigurationMap2) {
                                        getOutputSizes();
                                        integerParser = com.caverock.androidsvg.IntegerParser.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes);
                                        if (integerParser != null) {
                                            this.Camera2StreamConfigurationMap = integerParser.Camera2StreamConfigurationMap;
                                        } else {
                                            this.Camera2StreamConfigurationMap = i2;
                                        }
                                    } else {
                                        integerParser = null;
                                    }
                                    int i5 = i4;
                                    i = i3;
                                    i3 = i5;
                                } else {
                                    integerParser = highSpeedVideoFpsRangesFor;
                                    highSpeedVideoFpsRangesFor = null;
                                }
                                anPlusB = new com.caverock.androidsvg.CSSParser.CSSTextScanner.AnPlusB(highSpeedVideoFpsRangesFor == null ? 0 : i * ((int) highSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI), integerParser == null ? 0 : i3 * ((int) integerParser.getHighResolutionOutputSizeshNQ4ISI));
                            }
                            getOutputSizes();
                            if (Camera2StreamConfigurationMap(')')) {
                                anPlusB2 = anPlusB;
                                if (anPlusB2 != null) {
                                    throw new com.caverock.androidsvg.CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI)));
                                }
                                com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassAnPlusB5 = new com.caverock.androidsvg.CSSParser.PseudoClassAnPlusB(anPlusB2.getHighResolutionOutputSizeshNQ4ISI, anPlusB2.getHighSpeedVideoFpsRangesFor, z, z2, simpleSelector.getHighSpeedVideoFpsRanges);
                                selector.getHighSpeedVideoFpsRangesFor += 1000;
                                pseudoClass = pseudoClassAnPlusB5;
                                break;
                            } else {
                                this.Camera2StreamConfigurationMap = i2;
                            }
                        }
                    }
                    anPlusB2 = null;
                    if (anPlusB2 != null) {
                    }
                    break;
                case 13:
                    if (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes) {
                        int i6 = this.Camera2StreamConfigurationMap;
                        if (Camera2StreamConfigurationMap('(')) {
                            getOutputSizes();
                            java.util.List<com.caverock.androidsvg.CSSParser.Selector> unwrapAs = unwrapAs();
                            if (unwrapAs == null) {
                                this.Camera2StreamConfigurationMap = i6;
                            } else if (!Camera2StreamConfigurationMap(')')) {
                                this.Camera2StreamConfigurationMap = i6;
                            } else {
                                for (com.caverock.androidsvg.CSSParser.Selector selector2 : unwrapAs) {
                                    if (selector2.Camera2StreamConfigurationMap == null) {
                                        list = unwrapAs;
                                        if (list == null) {
                                            throw new com.caverock.androidsvg.CSSParseException("Invalid or missing parameter section for pseudo class: ".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI)));
                                        }
                                        com.caverock.androidsvg.CSSParser.PseudoClassNot pseudoClassNot = new com.caverock.androidsvg.CSSParser.PseudoClassNot(list);
                                        int i7 = Integer.MIN_VALUE;
                                        for (com.caverock.androidsvg.CSSParser.Selector selector3 : pseudoClassNot.getHighSpeedVideoFpsRanges) {
                                            if (selector3.getHighSpeedVideoFpsRangesFor > i7) {
                                                i7 = selector3.getHighSpeedVideoFpsRangesFor;
                                            }
                                        }
                                        selector.getHighSpeedVideoFpsRangesFor = i7;
                                        pseudoClass = pseudoClassNot;
                                        break;
                                    } else {
                                        for (com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector2 : selector2.Camera2StreamConfigurationMap) {
                                            if (simpleSelector2.Camera2StreamConfigurationMap != null) {
                                                java.util.Iterator<com.caverock.androidsvg.CSSParser.PseudoClass> it = simpleSelector2.Camera2StreamConfigurationMap.iterator();
                                                while (it.hasNext()) {
                                                    if (it.next() instanceof com.caverock.androidsvg.CSSParser.PseudoClassNot) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                list = unwrapAs;
                                if (list == null) {
                                }
                            }
                        }
                    }
                    list = null;
                    if (list == null) {
                    }
                    break;
                case 14:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassTarget = new com.caverock.androidsvg.CSSParser.PseudoClassTarget(b);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassTarget;
                    break;
                case 15:
                    if (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes) {
                        int i8 = this.Camera2StreamConfigurationMap;
                        if (Camera2StreamConfigurationMap('(')) {
                            getOutputSizes();
                            java.util.ArrayList arrayList = null;
                            while (true) {
                                java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
                                if (highResolutionOutputSizeshNQ4ISI2 == null) {
                                    break;
                                } else {
                                    if (arrayList == null) {
                                        arrayList = new java.util.ArrayList();
                                    }
                                    arrayList.add(highResolutionOutputSizeshNQ4ISI2);
                                    getOutputSizes();
                                    if (!getOutputSizeshNQ4ISI()) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassNotSupported = new com.caverock.androidsvg.CSSParser.PseudoClassNotSupported(highResolutionOutputSizeshNQ4ISI);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassNotSupported;
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    com.caverock.androidsvg.CSSParser.PseudoClass pseudoClassNotSupported2 = new com.caverock.androidsvg.CSSParser.PseudoClassNotSupported(highResolutionOutputSizeshNQ4ISI);
                    selector.getHighSpeedVideoFpsRangesFor += 1000;
                    pseudoClass = pseudoClassNotSupported2;
                    break;
                default:
                    throw new com.caverock.androidsvg.CSSParseException("Unsupported pseudo class: ".concat(java.lang.String.valueOf(highResolutionOutputSizeshNQ4ISI)));
            }
            if (simpleSelector.Camera2StreamConfigurationMap == null) {
                simpleSelector.Camera2StreamConfigurationMap = new java.util.ArrayList();
            }
            simpleSelector.Camera2StreamConfigurationMap.add(pseudoClass);
        }

        private java.lang.String getOutputMinFrameDurationlomOqCM() {
            if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes) {
                return null;
            }
            java.lang.String outputMinFrameDuration = getOutputMinFrameDuration();
            return outputMinFrameDuration != null ? outputMinFrameDuration : getHighResolutionOutputSizeshNQ4ISI();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public java.util.List<com.caverock.androidsvg.CSSParser.Selector> unwrapAs() throws com.caverock.androidsvg.CSSParseException {
            if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes) {
                return null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            byte b = 0;
            com.caverock.androidsvg.CSSParser.Selector selector = new com.caverock.androidsvg.CSSParser.Selector(b);
            while (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes && getHighSpeedVideoFpsRangesFor(selector)) {
                if (getOutputSizeshNQ4ISI()) {
                    arrayList.add(selector);
                    selector = new com.caverock.androidsvg.CSSParser.Selector(b);
                }
            }
            java.util.List<com.caverock.androidsvg.CSSParser.SimpleSelector> list = selector.Camera2StreamConfigurationMap;
            if (list != null && !list.isEmpty()) {
                arrayList.add(selector);
            }
            return arrayList;
        }

        private int getValidOutputFormatsForInputhNQ4ISI() {
            if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes) {
                return this.Camera2StreamConfigurationMap;
            }
            int i = this.Camera2StreamConfigurationMap;
            int i2 = this.Camera2StreamConfigurationMap;
            int charAt = this.getHighSpeedVideoFpsRanges.charAt(this.Camera2StreamConfigurationMap);
            if (charAt == 45) {
                charAt = getHighSpeedVideoSizes();
            }
            if ((charAt >= 65 && charAt <= 90) || ((charAt >= 97 && charAt <= 122) || charAt == 95)) {
                int highSpeedVideoSizes = getHighSpeedVideoSizes();
                while (true) {
                    if ((highSpeedVideoSizes < 65 || highSpeedVideoSizes > 90) && ((highSpeedVideoSizes < 97 || highSpeedVideoSizes > 122) && !((highSpeedVideoSizes >= 48 && highSpeedVideoSizes <= 57) || highSpeedVideoSizes == 45 || highSpeedVideoSizes == 95))) {
                        break;
                    }
                    highSpeedVideoSizes = getHighSpeedVideoSizes();
                }
                i2 = this.Camera2StreamConfigurationMap;
            }
            this.Camera2StreamConfigurationMap = i;
            return i2;
        }

        final java.lang.String Camera2StreamConfigurationMap() {
            int Camera2StreamConfigurationMap;
            if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes) {
                return null;
            }
            char charAt = this.getHighSpeedVideoFpsRanges.charAt(this.Camera2StreamConfigurationMap);
            if (charAt != '\'' && charAt != '\"') {
                return null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            this.Camera2StreamConfigurationMap++;
            int intValue = getHighSpeedVideoFpsRanges().intValue();
            while (intValue != -1 && intValue != charAt) {
                if (intValue == 92) {
                    intValue = getHighSpeedVideoFpsRanges().intValue();
                    if (intValue != -1) {
                        if (intValue == 10 || intValue == 13 || intValue == 12) {
                            intValue = getHighSpeedVideoFpsRanges().intValue();
                        } else {
                            int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(intValue);
                            if (Camera2StreamConfigurationMap2 != -1) {
                                for (int i = 1; i <= 5 && (Camera2StreamConfigurationMap = Camera2StreamConfigurationMap((intValue = getHighSpeedVideoFpsRanges().intValue()))) != -1; i++) {
                                    Camera2StreamConfigurationMap2 = (Camera2StreamConfigurationMap2 * 16) + Camera2StreamConfigurationMap;
                                }
                                sb.append((char) Camera2StreamConfigurationMap2);
                            }
                        }
                    }
                }
                sb.append((char) intValue);
                intValue = getHighSpeedVideoFpsRanges().intValue();
            }
            return sb.toString();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0144  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0155  */
        /* JADX WARN: Removed duplicated region for block: B:99:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private boolean getHighSpeedVideoFpsRangesFor(com.caverock.androidsvg.CSSParser.Selector selector) throws com.caverock.androidsvg.CSSParseException {
            com.caverock.androidsvg.CSSParser.Combinator combinator;
            com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector;
            com.caverock.androidsvg.CSSParser.AttribOp attribOp;
            java.lang.String str;
            if (this.Camera2StreamConfigurationMap == this.getHighSpeedVideoSizes) {
                return false;
            }
            int i = this.Camera2StreamConfigurationMap;
            java.util.List<com.caverock.androidsvg.CSSParser.SimpleSelector> list = selector.Camera2StreamConfigurationMap;
            if (list != null && !list.isEmpty()) {
                if (Camera2StreamConfigurationMap(kotlin.text.Typography.greater)) {
                    combinator = com.caverock.androidsvg.CSSParser.Combinator.CHILD;
                    getOutputSizes();
                } else if (Camera2StreamConfigurationMap('+')) {
                    combinator = com.caverock.androidsvg.CSSParser.Combinator.FOLLOWS;
                    getOutputSizes();
                }
                if (!Camera2StreamConfigurationMap('*')) {
                    simpleSelector = new com.caverock.androidsvg.CSSParser.SimpleSelector(combinator, null);
                } else {
                    java.lang.String highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
                    if (highResolutionOutputSizeshNQ4ISI != null) {
                        com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector2 = new com.caverock.androidsvg.CSSParser.SimpleSelector(combinator, highResolutionOutputSizeshNQ4ISI);
                        selector.getHighSpeedVideoFpsRangesFor++;
                        simpleSelector = simpleSelector2;
                    } else {
                        simpleSelector = null;
                    }
                }
                while (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes) {
                    if (Camera2StreamConfigurationMap(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR)) {
                        if (simpleSelector == null) {
                            simpleSelector = new com.caverock.androidsvg.CSSParser.SimpleSelector(combinator, null);
                        }
                        java.lang.String highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
                        if (highResolutionOutputSizeshNQ4ISI2 == null) {
                            throw new com.caverock.androidsvg.CSSParseException("Invalid \".class\" simpleSelectors");
                        }
                        simpleSelector.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS, com.caverock.androidsvg.CSSParser.AttribOp.EQUALS, highResolutionOutputSizeshNQ4ISI2);
                        selector.getHighSpeedVideoFpsRangesFor += 1000;
                    } else if (Camera2StreamConfigurationMap('#')) {
                        if (simpleSelector == null) {
                            simpleSelector = new com.caverock.androidsvg.CSSParser.SimpleSelector(combinator, null);
                        }
                        java.lang.String highResolutionOutputSizeshNQ4ISI3 = getHighResolutionOutputSizeshNQ4ISI();
                        if (highResolutionOutputSizeshNQ4ISI3 == null) {
                            throw new com.caverock.androidsvg.CSSParseException("Invalid \"#id\" simpleSelectors");
                        }
                        simpleSelector.getHighSpeedVideoFpsRangesFor("id", com.caverock.androidsvg.CSSParser.AttribOp.EQUALS, highResolutionOutputSizeshNQ4ISI3);
                        selector.getHighSpeedVideoFpsRangesFor += 1000000;
                    } else if (Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST)) {
                        if (simpleSelector == null) {
                            simpleSelector = new com.caverock.androidsvg.CSSParser.SimpleSelector(combinator, null);
                        }
                        getOutputSizes();
                        java.lang.String highResolutionOutputSizeshNQ4ISI4 = getHighResolutionOutputSizeshNQ4ISI();
                        if (highResolutionOutputSizeshNQ4ISI4 == null) {
                            throw new com.caverock.androidsvg.CSSParseException("Invalid attribute simpleSelectors");
                        }
                        getOutputSizes();
                        if (Camera2StreamConfigurationMap('=')) {
                            attribOp = com.caverock.androidsvg.CSSParser.AttribOp.EQUALS;
                        } else if (getHighSpeedVideoFpsRangesFor("~=")) {
                            attribOp = com.caverock.androidsvg.CSSParser.AttribOp.INCLUDES;
                        } else {
                            attribOp = getHighSpeedVideoFpsRangesFor("|=") ? com.caverock.androidsvg.CSSParser.AttribOp.DASHMATCH : null;
                        }
                        if (attribOp != null) {
                            getOutputSizes();
                            str = getOutputMinFrameDurationlomOqCM();
                            if (str == null) {
                                throw new com.caverock.androidsvg.CSSParseException("Invalid attribute simpleSelectors");
                            }
                            getOutputSizes();
                        } else {
                            str = null;
                        }
                        if (!Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST)) {
                            throw new com.caverock.androidsvg.CSSParseException("Invalid attribute simpleSelectors");
                        }
                        if (attribOp == null) {
                            attribOp = com.caverock.androidsvg.CSSParser.AttribOp.EXISTS;
                        }
                        simpleSelector.getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI4, attribOp, str);
                        selector.getHighSpeedVideoFpsRangesFor += 1000;
                    } else {
                        if (!Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                            break;
                        }
                        if (simpleSelector == null) {
                            simpleSelector = new com.caverock.androidsvg.CSSParser.SimpleSelector(combinator, null);
                        }
                        getHighSpeedVideoSizes(selector, simpleSelector);
                    }
                }
                if (simpleSelector != null) {
                    this.Camera2StreamConfigurationMap = i;
                    return false;
                }
                if (selector.Camera2StreamConfigurationMap == null) {
                    selector.Camera2StreamConfigurationMap = new java.util.ArrayList();
                }
                selector.Camera2StreamConfigurationMap.add(simpleSelector);
                return true;
            }
            combinator = null;
            if (!Camera2StreamConfigurationMap('*')) {
            }
            while (this.Camera2StreamConfigurationMap != this.getHighSpeedVideoSizes) {
            }
            if (simpleSelector != null) {
            }
        }
    }

    /* renamed from: com.caverock.androidsvg.CSSParser$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoSizes;

        static {
            int[] iArr = new int[com.caverock.androidsvg.CSSParser.PseudoClassIdents.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr;
            try {
                iArr[com.caverock.androidsvg.CSSParser.PseudoClassIdents.first_child.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.last_child.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.only_child.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.first_of_type.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.last_of_type.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.only_of_type.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.root.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.empty.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_child.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_last_child.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_of_type.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.nth_last_of_type.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.not.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.target.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.lang.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.link.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.visited.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.hover.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.active.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.focus.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.enabled.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.disabled.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.checked.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.caverock.androidsvg.CSSParser.PseudoClassIdents.indeterminate.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[com.caverock.androidsvg.CSSParser.AttribOp.values().length];
            getHighSpeedVideoSizes = iArr2;
            try {
                iArr2[com.caverock.androidsvg.CSSParser.AttribOp.EQUALS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                getHighSpeedVideoSizes[com.caverock.androidsvg.CSSParser.AttribOp.INCLUDES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                getHighSpeedVideoSizes[com.caverock.androidsvg.CSSParser.AttribOp.DASHMATCH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
        }
    }

    private static boolean Camera2StreamConfigurationMap(java.util.List<com.caverock.androidsvg.CSSParser.MediaType> list, com.caverock.androidsvg.CSSParser.MediaType mediaType) {
        for (com.caverock.androidsvg.CSSParser.MediaType mediaType2 : list) {
            if (mediaType2 == com.caverock.androidsvg.CSSParser.MediaType.all || mediaType2 == mediaType) {
                return true;
            }
        }
        return false;
    }

    private static java.util.List<com.caverock.androidsvg.CSSParser.MediaType> getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
            java.lang.String str = null;
            if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
                int i = cSSTextScanner.Camera2StreamConfigurationMap;
                char charAt = cSSTextScanner.getHighSpeedVideoFpsRanges.charAt(i);
                if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
                    int highSpeedVideoSizes = cSSTextScanner.getHighSpeedVideoSizes();
                    while (true) {
                        if ((highSpeedVideoSizes < 65 || highSpeedVideoSizes > 90) && (highSpeedVideoSizes < 97 || highSpeedVideoSizes > 122)) {
                            break;
                        }
                        highSpeedVideoSizes = cSSTextScanner.getHighSpeedVideoSizes();
                    }
                    str = cSSTextScanner.getHighSpeedVideoFpsRanges.substring(i, cSSTextScanner.Camera2StreamConfigurationMap);
                } else {
                    cSSTextScanner.Camera2StreamConfigurationMap = i;
                }
            }
            if (str == null) {
                break;
            }
            try {
                arrayList.add(com.caverock.androidsvg.CSSParser.MediaType.valueOf(str));
            } catch (java.lang.IllegalArgumentException unused) {
            }
            if (!cSSTextScanner.getOutputSizeshNQ4ISI()) {
                break;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x025a A[Catch: CSSParseException -> 0x02c7, TryCatch #0 {CSSParseException -> 0x02c7, blocks: (B:3:0x0005, B:5:0x000d, B:8:0x0016, B:11:0x001f, B:85:0x0030, B:87:0x0039, B:90:0x0040, B:93:0x0048, B:95:0x0052, B:97:0x005d, B:98:0x006c, B:101:0x01df, B:103:0x0074, B:107:0x007c, B:108:0x0081, B:109:0x0069, B:111:0x0082, B:112:0x0089, B:113:0x008a, B:115:0x008e, B:117:0x0096, B:121:0x016c, B:123:0x0172, B:126:0x0186, B:128:0x018c, B:130:0x0194, B:133:0x019e, B:137:0x0180, B:140:0x01ae, B:141:0x01b3, B:143:0x01b4, B:144:0x01bb, B:145:0x009e, B:148:0x00aa, B:150:0x00b3, B:151:0x00b8, B:208:0x0142, B:211:0x014a, B:153:0x00c0, B:161:0x00d8, B:163:0x00de, B:165:0x00e4, B:167:0x00ed, B:170:0x00f4, B:179:0x010c, B:189:0x0116, B:191:0x011d, B:193:0x012b, B:195:0x0136, B:182:0x013c, B:220:0x0151, B:221:0x0154, B:225:0x015e, B:227:0x0166, B:229:0x01bc, B:230:0x01bf, B:232:0x01c6, B:250:0x01d4, B:242:0x01db, B:256:0x01e4, B:257:0x01eb, B:14:0x01ec, B:16:0x01f2, B:18:0x01f8, B:20:0x01fe, B:21:0x0206, B:23:0x0215, B:27:0x025a, B:29:0x0263, B:31:0x026e, B:33:0x0272, B:34:0x0279, B:36:0x027a, B:41:0x0290, B:42:0x0297, B:44:0x029d, B:38:0x028a, B:51:0x02ae, B:52:0x02b5, B:53:0x0222, B:58:0x0236, B:60:0x023c, B:62:0x0242, B:64:0x0245, B:67:0x024a, B:69:0x024e, B:70:0x0255, B:76:0x02b6, B:77:0x02bd, B:79:0x02be, B:80:0x02c5), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02ae A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final com.caverock.androidsvg.CSSParser.Ruleset getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner) {
        int intValue;
        char charAt;
        int Camera2StreamConfigurationMap;
        java.lang.String substring;
        com.caverock.androidsvg.CSSParser.Ruleset ruleset = new com.caverock.androidsvg.CSSParser.Ruleset();
        while (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
            try {
                if (!cSSTextScanner.getHighSpeedVideoFpsRangesFor("<!--") && !cSSTextScanner.getHighSpeedVideoFpsRangesFor("-->")) {
                    java.lang.String str = null;
                    if (!cSSTextScanner.Camera2StreamConfigurationMap('@')) {
                        java.util.List unwrapAs = cSSTextScanner.unwrapAs();
                        if (unwrapAs == null || unwrapAs.isEmpty()) {
                            break;
                        }
                        if (!cSSTextScanner.Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ)) {
                            throw new com.caverock.androidsvg.CSSParseException("Malformed rule block: expected '{'");
                        }
                        cSSTextScanner.getOutputSizes();
                        com.caverock.androidsvg.SVG.Style style = new com.caverock.androidsvg.SVG.Style();
                        do {
                            java.lang.String highResolutionOutputSizeshNQ4ISI = cSSTextScanner.getHighResolutionOutputSizeshNQ4ISI();
                            cSSTextScanner.getOutputSizes();
                            if (!cSSTextScanner.Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON)) {
                                throw new com.caverock.androidsvg.CSSParseException("Expected ':'");
                            }
                            cSSTextScanner.getOutputSizes();
                            if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
                                int i = cSSTextScanner.Camera2StreamConfigurationMap;
                                int i2 = cSSTextScanner.Camera2StreamConfigurationMap;
                                int charAt2 = cSSTextScanner.getHighSpeedVideoFpsRanges.charAt(cSSTextScanner.Camera2StreamConfigurationMap);
                                while (charAt2 != -1 && charAt2 != 59 && charAt2 != 125 && charAt2 != 33 && !com.caverock.androidsvg.CSSParser.CSSTextScanner.getHighSpeedVideoFpsRangesFor(charAt2)) {
                                    if (!com.caverock.androidsvg.CSSParser.CSSTextScanner.getHighSpeedVideoFpsRanges(charAt2)) {
                                        i2 = cSSTextScanner.Camera2StreamConfigurationMap + 1;
                                    }
                                    charAt2 = cSSTextScanner.getHighSpeedVideoSizes();
                                }
                                if (cSSTextScanner.Camera2StreamConfigurationMap > i) {
                                    substring = cSSTextScanner.getHighSpeedVideoFpsRanges.substring(i, i2);
                                    if (substring != null) {
                                        throw new com.caverock.androidsvg.CSSParseException("Expected property value");
                                    }
                                    cSSTextScanner.getOutputSizes();
                                    if (cSSTextScanner.Camera2StreamConfigurationMap('!')) {
                                        cSSTextScanner.getOutputSizes();
                                        if (!cSSTextScanner.getHighSpeedVideoFpsRangesFor("important")) {
                                            throw new com.caverock.androidsvg.CSSParseException("Malformed rule set: found unexpected '!'");
                                        }
                                        cSSTextScanner.getOutputSizes();
                                    }
                                    cSSTextScanner.Camera2StreamConfigurationMap(';');
                                    com.caverock.androidsvg.SVGParser.Camera2StreamConfigurationMap(style, highResolutionOutputSizeshNQ4ISI, substring);
                                    cSSTextScanner.getOutputSizes();
                                    if (cSSTextScanner.Camera2StreamConfigurationMap == cSSTextScanner.getHighSpeedVideoSizes) {
                                        break;
                                    }
                                } else {
                                    cSSTextScanner.Camera2StreamConfigurationMap = i;
                                }
                            }
                            substring = null;
                            if (substring != null) {
                            }
                        } while (!cSSTextScanner.Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ));
                        cSSTextScanner.getOutputSizes();
                        java.util.Iterator it = unwrapAs.iterator();
                        while (it.hasNext()) {
                            ruleset.getHighSpeedVideoFpsRanges(new com.caverock.androidsvg.CSSParser.Rule((com.caverock.androidsvg.CSSParser.Selector) it.next(), style, this.getHighSpeedVideoSizes));
                        }
                    } else {
                        java.lang.String highResolutionOutputSizeshNQ4ISI2 = cSSTextScanner.getHighResolutionOutputSizeshNQ4ISI();
                        cSSTextScanner.getOutputSizes();
                        if (highResolutionOutputSizeshNQ4ISI2 == null) {
                            throw new com.caverock.androidsvg.CSSParseException("Invalid '@' rule");
                        }
                        int i3 = 0;
                        if (!this.getHighSpeedVideoFpsRanges && highResolutionOutputSizeshNQ4ISI2.equals(io.ktor.http.LinkHeader.Parameters.Media)) {
                            java.util.List<com.caverock.androidsvg.CSSParser.MediaType> highSpeedVideoSizes = getHighSpeedVideoSizes(cSSTextScanner);
                            if (!cSSTextScanner.Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ)) {
                                throw new com.caverock.androidsvg.CSSParseException("Invalid @media rule: missing rule set");
                            }
                            cSSTextScanner.getOutputSizes();
                            if (Camera2StreamConfigurationMap(highSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI)) {
                                this.getHighSpeedVideoFpsRanges = true;
                                ruleset.getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(cSSTextScanner));
                                this.getHighSpeedVideoFpsRanges = false;
                            } else {
                                getHighResolutionOutputSizeshNQ4ISI(cSSTextScanner);
                            }
                            if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes && !cSSTextScanner.Camera2StreamConfigurationMap(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ)) {
                                throw new com.caverock.androidsvg.CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                            }
                        } else if (this.getHighSpeedVideoFpsRanges || !highResolutionOutputSizeshNQ4ISI2.equals("import")) {
                            new java.lang.Object[]{highResolutionOutputSizeshNQ4ISI2};
                            while (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes && ((intValue = cSSTextScanner.getHighSpeedVideoFpsRanges().intValue()) != 59 || i3 != 0)) {
                                if (intValue == 123) {
                                    i3++;
                                } else if (intValue == 125 && i3 > 0 && i3 - 1 == 0) {
                                    break;
                                }
                            }
                        } else {
                            if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
                                int i4 = cSSTextScanner.Camera2StreamConfigurationMap;
                                if (cSSTextScanner.getHighSpeedVideoFpsRangesFor("url(")) {
                                    cSSTextScanner.getOutputSizes();
                                    java.lang.String Camera2StreamConfigurationMap2 = cSSTextScanner.Camera2StreamConfigurationMap();
                                    if (Camera2StreamConfigurationMap2 == null) {
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        while (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes && (charAt = cSSTextScanner.getHighSpeedVideoFpsRanges.charAt(cSSTextScanner.Camera2StreamConfigurationMap)) != '\'' && charAt != '\"' && charAt != '(' && charAt != ')' && !com.caverock.androidsvg.CSSParser.CSSTextScanner.getHighSpeedVideoFpsRanges(charAt) && !java.lang.Character.isISOControl((int) charAt)) {
                                            cSSTextScanner.Camera2StreamConfigurationMap++;
                                            if (charAt == '\\') {
                                                if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
                                                    java.lang.String str2 = cSSTextScanner.getHighSpeedVideoFpsRanges;
                                                    int i5 = cSSTextScanner.Camera2StreamConfigurationMap;
                                                    cSSTextScanner.Camera2StreamConfigurationMap = i5 + 1;
                                                    charAt = str2.charAt(i5);
                                                    if (charAt != '\n' && charAt != '\r' && charAt != '\f') {
                                                        int Camera2StreamConfigurationMap3 = com.caverock.androidsvg.CSSParser.CSSTextScanner.Camera2StreamConfigurationMap((int) charAt);
                                                        if (Camera2StreamConfigurationMap3 != -1) {
                                                            for (int i6 = 1; i6 <= 5 && cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes && (Camera2StreamConfigurationMap = com.caverock.androidsvg.CSSParser.CSSTextScanner.Camera2StreamConfigurationMap((int) cSSTextScanner.getHighSpeedVideoFpsRanges.charAt(cSSTextScanner.Camera2StreamConfigurationMap))) != -1; i6++) {
                                                                cSSTextScanner.Camera2StreamConfigurationMap++;
                                                                Camera2StreamConfigurationMap3 = (Camera2StreamConfigurationMap3 * 16) + Camera2StreamConfigurationMap;
                                                            }
                                                            sb.append((char) Camera2StreamConfigurationMap3);
                                                        }
                                                    }
                                                }
                                            }
                                            sb.append(charAt);
                                        }
                                        Camera2StreamConfigurationMap2 = sb.length() == 0 ? null : sb.toString();
                                    }
                                    if (Camera2StreamConfigurationMap2 == null) {
                                        cSSTextScanner.Camera2StreamConfigurationMap = i4;
                                    } else {
                                        cSSTextScanner.getOutputSizes();
                                        if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes && !cSSTextScanner.getHighSpeedVideoFpsRangesFor(")")) {
                                            cSSTextScanner.Camera2StreamConfigurationMap = i4;
                                        }
                                        str = Camera2StreamConfigurationMap2;
                                    }
                                }
                            }
                            if (str == null) {
                                str = cSSTextScanner.Camera2StreamConfigurationMap();
                            }
                            if (str == null) {
                                throw new com.caverock.androidsvg.CSSParseException("Invalid @import rule: expected string or url()");
                            }
                            cSSTextScanner.getOutputSizes();
                            java.util.List<com.caverock.androidsvg.CSSParser.MediaType> highSpeedVideoSizes2 = getHighSpeedVideoSizes(cSSTextScanner);
                            if (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes && !cSSTextScanner.Camera2StreamConfigurationMap(';')) {
                                throw new com.caverock.androidsvg.CSSParseException("Invalid @media rule: expected '}' at end of rule set");
                            }
                            if (com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges() != null && Camera2StreamConfigurationMap(highSpeedVideoSizes2, this.getHighResolutionOutputSizeshNQ4ISI)) {
                                java.lang.String resolveCSSStyleSheet = com.caverock.androidsvg.SVG.getHighSpeedVideoFpsRanges().resolveCSSStyleSheet(str);
                                if (resolveCSSStyleSheet != null) {
                                    com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner2 = new com.caverock.androidsvg.CSSParser.CSSTextScanner(resolveCSSStyleSheet);
                                    cSSTextScanner2.getOutputSizes();
                                    ruleset.getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI(cSSTextScanner2));
                                }
                            }
                        }
                        cSSTextScanner.getOutputSizes();
                    }
                }
            } catch (com.caverock.androidsvg.CSSParseException e) {
                e.getMessage();
                return ruleset;
            }
        }
        return ruleset;
    }

    public static java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        com.caverock.androidsvg.CSSParser.CSSTextScanner cSSTextScanner = new com.caverock.androidsvg.CSSParser.CSSTextScanner(str);
        java.util.ArrayList arrayList = null;
        while (cSSTextScanner.Camera2StreamConfigurationMap != cSSTextScanner.getHighSpeedVideoSizes) {
            java.lang.String highSpeedVideoFpsRanges = cSSTextScanner.getHighSpeedVideoFpsRanges(' ', false);
            if (highSpeedVideoFpsRanges != null) {
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                arrayList.add(highSpeedVideoFpsRanges);
                cSSTextScanner.getOutputSizes();
            }
        }
        return arrayList;
    }

    static class RuleMatchContext {
        com.caverock.androidsvg.SVG.SvgElementBase Camera2StreamConfigurationMap;

        RuleMatchContext() {
        }

        public java.lang.String toString() {
            com.caverock.androidsvg.SVG.SvgElementBase svgElementBase = this.Camera2StreamConfigurationMap;
            if (svgElementBase != null) {
                return java.lang.String.format("<%s id=\"%s\">", svgElementBase.getHighResolutionOutputSizeshNQ4ISI(), this.Camera2StreamConfigurationMap.getValidOutputFormatsForInputhNQ4ISI);
            }
            return "";
        }
    }

    static boolean getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.CSSParser.Selector selector, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object obj = svgElementBase.CoroutineDebuggingKt;
        while (true) {
            if (obj == null) {
                break;
            }
            arrayList.add(0, obj);
            obj = ((com.caverock.androidsvg.SVG.SvgObject) obj).CoroutineDebuggingKt;
        }
        int size = arrayList.size() - 1;
        java.util.List<com.caverock.androidsvg.CSSParser.SimpleSelector> list = selector.Camera2StreamConfigurationMap;
        if (list != null && list.size() == 1) {
            return getHighSpeedVideoSizes(ruleMatchContext, selector.Camera2StreamConfigurationMap.get(0), svgElementBase);
        }
        return getHighResolutionOutputSizeshNQ4ISI(ruleMatchContext, selector, (selector.Camera2StreamConfigurationMap != null ? r0.size() : 0) - 1, arrayList, size, svgElementBase);
    }

    private static int Camera2StreamConfigurationMap(java.util.List<com.caverock.androidsvg.SVG.SvgContainer> list, int i, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
        int i2 = 0;
        if (i < 0) {
            return 0;
        }
        if (list.get(i) != svgElementBase.CoroutineDebuggingKt) {
            return -1;
        }
        java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = svgElementBase.CoroutineDebuggingKt.getHighSpeedVideoFpsRanges().iterator();
        while (it.hasNext()) {
            if (it.next() == svgElementBase) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    private static boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
        if (simpleSelector.getHighSpeedVideoFpsRanges != null && !simpleSelector.getHighSpeedVideoFpsRanges.equals(svgElementBase.getHighResolutionOutputSizeshNQ4ISI().toLowerCase(java.util.Locale.US))) {
            return false;
        }
        if (simpleSelector.getHighSpeedVideoFpsRangesFor != null) {
            for (com.caverock.androidsvg.CSSParser.Attrib attrib : simpleSelector.getHighSpeedVideoFpsRangesFor) {
                java.lang.String str = attrib.Camera2StreamConfigurationMap;
                str.hashCode();
                if (str.equals("id")) {
                    if (!attrib.getHighSpeedVideoSizes.equals(svgElementBase.getValidOutputFormatsForInputhNQ4ISI)) {
                        return false;
                    }
                } else if (!str.equals(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.LogConstants.CLASS) || svgElementBase.unwrapAs == null || !svgElementBase.unwrapAs.contains(attrib.getHighSpeedVideoSizes)) {
                    return false;
                }
            }
        }
        if (simpleSelector.Camera2StreamConfigurationMap == null) {
            return true;
        }
        java.util.Iterator<com.caverock.androidsvg.CSSParser.PseudoClass> it = simpleSelector.Camera2StreamConfigurationMap.iterator();
        while (it.hasNext()) {
            if (!it.next().getHighSpeedVideoSizes(ruleMatchContext, svgElementBase)) {
                return false;
            }
        }
        return true;
    }

    static class PseudoClassAnPlusB implements com.caverock.androidsvg.CSSParser.PseudoClass {
        private boolean Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;
        private boolean getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;

        PseudoClassAnPlusB(int i, int i2, boolean z, boolean z2, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = i2;
            this.Camera2StreamConfigurationMap = z;
            this.getHighSpeedVideoFpsRangesFor = z2;
            this.getHighSpeedVideoFpsRanges = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            int i;
            int i2;
            java.lang.String highResolutionOutputSizeshNQ4ISI = (this.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges == null) ? svgElementBase.getHighResolutionOutputSizeshNQ4ISI() : this.getHighSpeedVideoFpsRanges;
            if (svgElementBase.CoroutineDebuggingKt != null) {
                java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = svgElementBase.CoroutineDebuggingKt.getHighSpeedVideoFpsRanges().iterator();
                i2 = 0;
                i = 0;
                while (it.hasNext()) {
                    com.caverock.androidsvg.SVG.SvgElementBase svgElementBase2 = (com.caverock.androidsvg.SVG.SvgElementBase) it.next();
                    if (svgElementBase2 == svgElementBase) {
                        i2 = i;
                    }
                    if (highResolutionOutputSizeshNQ4ISI == null || svgElementBase2.getHighResolutionOutputSizeshNQ4ISI().equals(highResolutionOutputSizeshNQ4ISI)) {
                        i++;
                    }
                }
            } else {
                i = 1;
                i2 = 0;
            }
            int i3 = this.Camera2StreamConfigurationMap ? i2 + 1 : i - i2;
            int i4 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (i4 == 0) {
                return i3 == this.getHighSpeedVideoSizes;
            }
            int i5 = i3 - this.getHighSpeedVideoSizes;
            return i5 % i4 == 0 && (java.lang.Integer.signum(i5) == 0 || java.lang.Integer.signum(i3 - this.getHighSpeedVideoSizes) == java.lang.Integer.signum(this.getHighResolutionOutputSizeshNQ4ISI));
        }

        public java.lang.String toString() {
            java.lang.String str = this.Camera2StreamConfigurationMap ? "" : "last-";
            if (!this.getHighSpeedVideoFpsRangesFor) {
                return java.lang.String.format("nth-%schild(%dn%+d)", str, java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes));
            }
            return java.lang.String.format("nth-%schild(%dn%+d of type <%s>)", str, java.lang.Integer.valueOf(this.getHighResolutionOutputSizeshNQ4ISI), java.lang.Integer.valueOf(this.getHighSpeedVideoSizes), this.getHighSpeedVideoFpsRanges);
        }
    }

    static class PseudoClassOnlyChild implements com.caverock.androidsvg.CSSParser.PseudoClass {
        private boolean getHighResolutionOutputSizeshNQ4ISI;
        private java.lang.String getHighSpeedVideoFpsRanges;

        public PseudoClassOnlyChild(boolean z, java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            this.getHighSpeedVideoFpsRanges = str;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            java.lang.String highResolutionOutputSizeshNQ4ISI = (this.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == null) ? svgElementBase.getHighResolutionOutputSizeshNQ4ISI() : this.getHighSpeedVideoFpsRanges;
            if (svgElementBase.CoroutineDebuggingKt != null) {
                java.util.Iterator<com.caverock.androidsvg.SVG.SvgObject> it = svgElementBase.CoroutineDebuggingKt.getHighSpeedVideoFpsRanges().iterator();
                int i = 0;
                while (it.hasNext()) {
                    com.caverock.androidsvg.SVG.SvgElementBase svgElementBase2 = (com.caverock.androidsvg.SVG.SvgElementBase) it.next();
                    if (highResolutionOutputSizeshNQ4ISI == null || svgElementBase2.getHighResolutionOutputSizeshNQ4ISI().equals(highResolutionOutputSizeshNQ4ISI)) {
                        i++;
                    }
                }
                if (i != 1) {
                    return false;
                }
            }
            return true;
        }

        public java.lang.String toString() {
            return this.getHighResolutionOutputSizeshNQ4ISI ? java.lang.String.format("only-of-type <%s>", this.getHighSpeedVideoFpsRanges) : java.lang.String.format("only-child", new java.lang.Object[0]);
        }
    }

    static class PseudoClassRoot implements com.caverock.androidsvg.CSSParser.PseudoClass {
        private PseudoClassRoot() {
        }

        /* synthetic */ PseudoClassRoot(byte b) {
            this();
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            return svgElementBase.CoroutineDebuggingKt == null;
        }

        public java.lang.String toString() {
            return "root";
        }
    }

    static class PseudoClassEmpty implements com.caverock.androidsvg.CSSParser.PseudoClass {
        private PseudoClassEmpty() {
        }

        /* synthetic */ PseudoClassEmpty(byte b) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            return !(svgElementBase instanceof com.caverock.androidsvg.SVG.SvgContainer) || ((com.caverock.androidsvg.SVG.SvgContainer) svgElementBase).getHighSpeedVideoFpsRanges().size() == 0;
        }

        public java.lang.String toString() {
            return "empty";
        }
    }

    static class PseudoClassNot implements com.caverock.androidsvg.CSSParser.PseudoClass {
        java.util.List<com.caverock.androidsvg.CSSParser.Selector> getHighSpeedVideoFpsRanges;

        PseudoClassNot(java.util.List<com.caverock.androidsvg.CSSParser.Selector> list) {
            this.getHighSpeedVideoFpsRanges = list;
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            java.util.Iterator<com.caverock.androidsvg.CSSParser.Selector> it = this.getHighSpeedVideoFpsRanges.iterator();
            while (it.hasNext()) {
                if (com.caverock.androidsvg.CSSParser.getHighResolutionOutputSizeshNQ4ISI(ruleMatchContext, it.next(), svgElementBase)) {
                    return false;
                }
            }
            return true;
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("not(");
            sb.append(this.getHighSpeedVideoFpsRanges);
            sb.append(")");
            return sb.toString();
        }
    }

    static class PseudoClassTarget implements com.caverock.androidsvg.CSSParser.PseudoClass {
        private PseudoClassTarget() {
        }

        /* synthetic */ PseudoClassTarget(byte b) {
            this();
        }

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            return ruleMatchContext != null && svgElementBase == ruleMatchContext.Camera2StreamConfigurationMap;
        }

        public java.lang.String toString() {
            return androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET;
        }
    }

    static class PseudoClassNotSupported implements com.caverock.androidsvg.CSSParser.PseudoClass {
        private java.lang.String getHighSpeedVideoFpsRanges;

        @Override // com.caverock.androidsvg.CSSParser.PseudoClass
        public final boolean getHighSpeedVideoSizes(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
            return false;
        }

        PseudoClassNotSupported(java.lang.String str) {
            this.getHighSpeedVideoFpsRanges = str;
        }

        public java.lang.String toString() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.CSSParser.Selector selector, int i, java.util.List<com.caverock.androidsvg.SVG.SvgContainer> list, int i2, com.caverock.androidsvg.SVG.SvgElementBase svgElementBase) {
        while (true) {
            com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector = selector.Camera2StreamConfigurationMap.get(i);
            if (!getHighSpeedVideoSizes(ruleMatchContext, simpleSelector, svgElementBase)) {
                return false;
            }
            if (simpleSelector.getHighSpeedVideoSizes == com.caverock.androidsvg.CSSParser.Combinator.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i2 >= 0) {
                    if (getHighSpeedVideoFpsRanges(ruleMatchContext, selector, i - 1, list, i2)) {
                        return true;
                    }
                    i2--;
                }
                return false;
            }
            if (simpleSelector.getHighSpeedVideoSizes == com.caverock.androidsvg.CSSParser.Combinator.CHILD) {
                return getHighSpeedVideoFpsRanges(ruleMatchContext, selector, i - 1, list, i2);
            }
            int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(list, i2, svgElementBase);
            if (Camera2StreamConfigurationMap <= 0) {
                return false;
            }
            svgElementBase = (com.caverock.androidsvg.SVG.SvgElementBase) svgElementBase.CoroutineDebuggingKt.getHighSpeedVideoFpsRanges().get(Camera2StreamConfigurationMap - 1);
            i--;
        }
    }

    private static boolean getHighSpeedVideoFpsRanges(com.caverock.androidsvg.CSSParser.RuleMatchContext ruleMatchContext, com.caverock.androidsvg.CSSParser.Selector selector, int i, java.util.List<com.caverock.androidsvg.SVG.SvgContainer> list, int i2) {
        int i3 = i2;
        while (true) {
            com.caverock.androidsvg.CSSParser.SimpleSelector simpleSelector = selector.Camera2StreamConfigurationMap.get(i);
            com.caverock.androidsvg.SVG.SvgElementBase svgElementBase = (com.caverock.androidsvg.SVG.SvgElementBase) list.get(i3);
            if (!getHighSpeedVideoSizes(ruleMatchContext, simpleSelector, svgElementBase)) {
                return false;
            }
            if (simpleSelector.getHighSpeedVideoSizes == com.caverock.androidsvg.CSSParser.Combinator.DESCENDANT) {
                if (i == 0) {
                    return true;
                }
                while (i3 > 0) {
                    i3--;
                    if (getHighSpeedVideoFpsRanges(ruleMatchContext, selector, i - 1, list, i3)) {
                        return true;
                    }
                }
                return false;
            }
            if (simpleSelector.getHighSpeedVideoSizes != com.caverock.androidsvg.CSSParser.Combinator.CHILD) {
                int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(list, i3, svgElementBase);
                if (Camera2StreamConfigurationMap <= 0) {
                    return false;
                }
                return getHighResolutionOutputSizeshNQ4ISI(ruleMatchContext, selector, i - 1, list, i3, (com.caverock.androidsvg.SVG.SvgElementBase) svgElementBase.CoroutineDebuggingKt.getHighSpeedVideoFpsRanges().get(Camera2StreamConfigurationMap - 1));
            }
            i--;
            i3--;
        }
    }
}
