package androidx.constraintlayout.core.parser;

/* loaded from: classes6.dex */
public class CLParser {
    static boolean getHighSpeedVideoSizes = false;
    private java.lang.String Camera2StreamConfigurationMap;
    private boolean getHighSpeedVideoFpsRanges = false;
    private int getHighSpeedVideoFpsRangesFor;

    enum TYPE {
        UNKNOWN,
        OBJECT,
        ARRAY,
        NUMBER,
        STRING,
        KEY,
        TOKEN
    }

    public static androidx.constraintlayout.core.parser.CLObject parse(java.lang.String str) throws androidx.constraintlayout.core.parser.CLParsingException {
        return new androidx.constraintlayout.core.parser.CLParser(str).parse();
    }

    public CLParser(java.lang.String str) {
        this.Camera2StreamConfigurationMap = str;
    }

    public androidx.constraintlayout.core.parser.CLObject parse() throws androidx.constraintlayout.core.parser.CLParsingException {
        char c;
        char[] charArray = this.Camera2StreamConfigurationMap.toCharArray();
        int length = charArray.length;
        int i = 1;
        this.getHighSpeedVideoFpsRangesFor = 1;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            }
            char c2 = charArray[i2];
            if (c2 == '{') {
                break;
            }
            if (c2 == '\n') {
                this.getHighSpeedVideoFpsRangesFor++;
            }
            i2++;
        }
        if (i2 == -1) {
            throw new androidx.constraintlayout.core.parser.CLParsingException("invalid json content", null);
        }
        androidx.constraintlayout.core.parser.CLObject allocate = androidx.constraintlayout.core.parser.CLObject.allocate(charArray);
        allocate.setLine(this.getHighSpeedVideoFpsRangesFor);
        allocate.setStart(i2);
        int i3 = i2 + 1;
        androidx.constraintlayout.core.parser.CLElement cLElement = allocate;
        while (i3 < length) {
            char c3 = charArray[i3];
            if (c3 == '\n') {
                this.getHighSpeedVideoFpsRangesFor += i;
            }
            if (this.getHighSpeedVideoFpsRanges) {
                if (c3 == '\n') {
                    this.getHighSpeedVideoFpsRanges = z;
                } else {
                    continue;
                    i3++;
                    i = 1;
                    z = false;
                }
            }
            if (cLElement == null) {
                break;
            }
            if (cLElement.isDone()) {
                cLElement = Camera2StreamConfigurationMap(i3, c3, cLElement, charArray);
            } else if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                if (c3 == '}') {
                    cLElement.setEnd(i3 - 1);
                } else {
                    cLElement = Camera2StreamConfigurationMap(i3, c3, cLElement, charArray);
                }
            } else if (!(cLElement instanceof androidx.constraintlayout.core.parser.CLArray)) {
                boolean z2 = cLElement instanceof androidx.constraintlayout.core.parser.CLString;
                if (z2) {
                    if (charArray[(int) cLElement.mStart] == c3) {
                        cLElement.setStart(cLElement.mStart + 1);
                        cLElement.setEnd(i3 - 1);
                    }
                } else {
                    if (cLElement instanceof androidx.constraintlayout.core.parser.CLToken) {
                        androidx.constraintlayout.core.parser.CLToken cLToken = (androidx.constraintlayout.core.parser.CLToken) cLElement;
                        if (!cLToken.validate(c3, i3)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("parsing incorrect token ");
                            sb.append(cLToken.content());
                            sb.append(" at line ");
                            sb.append(this.getHighSpeedVideoFpsRangesFor);
                            throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), cLToken);
                        }
                    }
                    if (((cLElement instanceof androidx.constraintlayout.core.parser.CLKey) || z2) && (((c = charArray[(int) cLElement.mStart]) == '\'' || c == '\"') && c == c3)) {
                        cLElement.setStart(cLElement.mStart + 1);
                        cLElement.setEnd(i3 - 1);
                    }
                    if (!cLElement.isDone() && (c3 == '}' || c3 == ']' || c3 == ',' || c3 == ' ' || c3 == '\t' || c3 == '\r' || c3 == '\n' || c3 == ':')) {
                        long j = i3 - 1;
                        cLElement.setEnd(j);
                        if (c3 == '}' || c3 == ']') {
                            cLElement = cLElement.getContainer();
                            cLElement.setEnd(j);
                            if (cLElement instanceof androidx.constraintlayout.core.parser.CLKey) {
                                cLElement = cLElement.getContainer();
                                cLElement.setEnd(j);
                            }
                        }
                    }
                }
            } else if (c3 == ']') {
                cLElement.setEnd(i3 - 1);
            } else {
                cLElement = Camera2StreamConfigurationMap(i3, c3, cLElement, charArray);
            }
            if (cLElement.isDone() && (!(cLElement instanceof androidx.constraintlayout.core.parser.CLKey) || ((androidx.constraintlayout.core.parser.CLKey) cLElement).getHighSpeedVideoFpsRangesFor.size() > 0)) {
                cLElement = cLElement.getContainer();
            }
            i3++;
            i = 1;
            z = false;
        }
        while (cLElement != null && !cLElement.isDone()) {
            if (cLElement instanceof androidx.constraintlayout.core.parser.CLString) {
                cLElement.setStart(((int) cLElement.mStart) + 1);
            }
            cLElement.setEnd(length - 1);
            cLElement = cLElement.getContainer();
        }
        if (getHighSpeedVideoSizes) {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Root: ");
            sb2.append(allocate.toJSON());
            printStream.println(sb2.toString());
        }
        return allocate;
    }

    private androidx.constraintlayout.core.parser.CLElement Camera2StreamConfigurationMap(int i, char c, androidx.constraintlayout.core.parser.CLElement cLElement, char[] cArr) throws androidx.constraintlayout.core.parser.CLParsingException {
        if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
            if (c == '\"' || c == '\'') {
                if (cLElement instanceof androidx.constraintlayout.core.parser.CLObject) {
                    return getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.KEY, cArr);
                }
                return getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.STRING, cArr);
            }
            if (c == '[') {
                return getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.ARRAY, cArr);
            }
            if (c != ']') {
                if (c == '{') {
                    return getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.OBJECT, cArr);
                }
                if (c != '}') {
                    switch (c) {
                        case '+':
                        case '-':
                        case '.':
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            return getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.NUMBER, cArr);
                        case '/':
                            int i2 = i + 1;
                            if (i2 < cArr.length && cArr[i2] == '/') {
                                this.getHighSpeedVideoFpsRanges = true;
                                return cLElement;
                            }
                            break;
                        case ',':
                        case ':':
                            return cLElement;
                        default:
                            if ((cLElement instanceof androidx.constraintlayout.core.parser.CLContainer) && !(cLElement instanceof androidx.constraintlayout.core.parser.CLObject)) {
                                androidx.constraintlayout.core.parser.CLElement highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.TOKEN, cArr);
                                androidx.constraintlayout.core.parser.CLToken cLToken = (androidx.constraintlayout.core.parser.CLToken) highSpeedVideoFpsRangesFor;
                                if (cLToken.validate(c, i)) {
                                    return highSpeedVideoFpsRangesFor;
                                }
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("incorrect token <");
                                sb.append(c);
                                sb.append("> at line ");
                                sb.append(this.getHighSpeedVideoFpsRangesFor);
                                throw new androidx.constraintlayout.core.parser.CLParsingException(sb.toString(), cLToken);
                            }
                            return getHighSpeedVideoFpsRangesFor(cLElement, i, androidx.constraintlayout.core.parser.CLParser.TYPE.KEY, cArr);
                    }
                }
            }
            cLElement.setEnd(i - 1);
            androidx.constraintlayout.core.parser.CLElement container = cLElement.getContainer();
            container.setEnd(i);
            return container;
        }
        return cLElement;
    }

    private androidx.constraintlayout.core.parser.CLElement getHighSpeedVideoFpsRangesFor(androidx.constraintlayout.core.parser.CLElement cLElement, int i, androidx.constraintlayout.core.parser.CLParser.TYPE type, char[] cArr) {
        androidx.constraintlayout.core.parser.CLElement allocate;
        if (getHighSpeedVideoSizes) {
            java.io.PrintStream printStream = java.lang.System.out;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CREATE ");
            sb.append(type);
            sb.append(" at ");
            sb.append(cArr[i]);
            printStream.println(sb.toString());
        }
        switch (type.ordinal()) {
            case 1:
                allocate = androidx.constraintlayout.core.parser.CLObject.allocate(cArr);
                i++;
                break;
            case 2:
                allocate = androidx.constraintlayout.core.parser.CLArray.allocate(cArr);
                i++;
                break;
            case 3:
                allocate = androidx.constraintlayout.core.parser.CLNumber.allocate(cArr);
                break;
            case 4:
                allocate = androidx.constraintlayout.core.parser.CLString.allocate(cArr);
                break;
            case 5:
                allocate = androidx.constraintlayout.core.parser.CLKey.allocate(cArr);
                break;
            case 6:
                allocate = androidx.constraintlayout.core.parser.CLToken.allocate(cArr);
                break;
            default:
                allocate = null;
                break;
        }
        if (allocate == null) {
            return null;
        }
        allocate.setLine(this.getHighSpeedVideoFpsRangesFor);
        allocate.setStart(i);
        if (cLElement instanceof androidx.constraintlayout.core.parser.CLContainer) {
            allocate.setContainer((androidx.constraintlayout.core.parser.CLContainer) cLElement);
        }
        return allocate;
    }
}
