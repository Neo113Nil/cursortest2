package com.google.android.exoplayer2.text.webvtt;

/* loaded from: classes3.dex */
final class WebvttCssParser {
    private static final java.lang.String PROPERTY_BGCOLOR = "background-color";
    private static final java.lang.String PROPERTY_COLOR = "color";
    private static final java.lang.String PROPERTY_FONT_FAMILY = "font-family";
    private static final java.lang.String PROPERTY_FONT_SIZE = "font-size";
    private static final java.lang.String PROPERTY_FONT_STYLE = "font-style";
    private static final java.lang.String PROPERTY_FONT_WEIGHT = "font-weight";
    private static final java.lang.String PROPERTY_RUBY_POSITION = "ruby-position";
    private static final java.lang.String PROPERTY_TEXT_COMBINE_UPRIGHT = "text-combine-upright";
    private static final java.lang.String PROPERTY_TEXT_DECORATION = "text-decoration";
    private static final java.lang.String RULE_END = "}";
    private static final java.lang.String RULE_START = "{";
    private static final java.lang.String TAG = "WebvttCssParser";
    private static final java.lang.String VALUE_ALL = "all";
    private static final java.lang.String VALUE_BOLD = "bold";
    private static final java.lang.String VALUE_DIGITS = "digits";
    private static final java.lang.String VALUE_ITALIC = "italic";
    private static final java.lang.String VALUE_OVER = "over";
    private static final java.lang.String VALUE_UNDER = "under";
    private static final java.lang.String VALUE_UNDERLINE = "underline";
    private static final java.util.regex.Pattern VOICE_NAME_PATTERN = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final java.util.regex.Pattern FONT_SIZE_PATTERN = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final com.google.android.exoplayer2.util.ParsableByteArray styleInput = new com.google.android.exoplayer2.util.ParsableByteArray();
    private final java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();

    public java.util.List<com.google.android.exoplayer2.text.webvtt.WebvttCssStyle> parseBlock(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        this.stringBuilder.setLength(0);
        int position = parsableByteArray.getPosition();
        skipStyleBlock(parsableByteArray);
        this.styleInput.reset(parsableByteArray.getData(), parsableByteArray.getPosition());
        this.styleInput.setPosition(position);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            java.lang.String parseSelector = parseSelector(this.styleInput, this.stringBuilder);
            if (parseSelector == null || !RULE_START.equals(parseNextToken(this.styleInput, this.stringBuilder))) {
                return arrayList;
            }
            com.google.android.exoplayer2.text.webvtt.WebvttCssStyle webvttCssStyle = new com.google.android.exoplayer2.text.webvtt.WebvttCssStyle();
            applySelectorToStyle(webvttCssStyle, parseSelector);
            java.lang.String str = null;
            boolean z = false;
            while (!z) {
                int position2 = this.styleInput.getPosition();
                java.lang.String parseNextToken = parseNextToken(this.styleInput, this.stringBuilder);
                boolean z2 = parseNextToken == null || RULE_END.equals(parseNextToken);
                if (!z2) {
                    this.styleInput.setPosition(position2);
                    parseStyleDeclaration(this.styleInput, webvttCssStyle, this.stringBuilder);
                }
                str = parseNextToken;
                z = z2;
            }
            if (RULE_END.equals(str)) {
                arrayList.add(webvttCssStyle);
            }
        }
    }

    private static java.lang.String parseSelector(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() < 5 || !"::cue".equals(parsableByteArray.readString(5))) {
            return null;
        }
        int position = parsableByteArray.getPosition();
        java.lang.String parseNextToken = parseNextToken(parsableByteArray, sb);
        if (parseNextToken == null) {
            return null;
        }
        if (RULE_START.equals(parseNextToken)) {
            parsableByteArray.setPosition(position);
            return "";
        }
        java.lang.String readCueTarget = "(".equals(parseNextToken) ? readCueTarget(parsableByteArray) : null;
        if (")".equals(parseNextToken(parsableByteArray, sb))) {
            return readCueTarget;
        }
        return null;
    }

    private static java.lang.String readCueTarget(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        boolean z = false;
        while (position < limit && !z) {
            int i = position + 1;
            z = ((char) parsableByteArray.getData()[position]) == ')';
            position = i;
        }
        return parsableByteArray.readString((position - 1) - parsableByteArray.getPosition()).trim();
    }

    private static void parseStyleDeclaration(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle webvttCssStyle, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        java.lang.String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if (!"".equals(parseIdentifier) && ":".equals(parseNextToken(parsableByteArray, sb))) {
            skipWhitespaceAndComments(parsableByteArray);
            java.lang.String parsePropertyValue = parsePropertyValue(parsableByteArray, sb);
            if (parsePropertyValue == null || "".equals(parsePropertyValue)) {
                return;
            }
            int position = parsableByteArray.getPosition();
            java.lang.String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (!";".equals(parseNextToken)) {
                if (!RULE_END.equals(parseNextToken)) {
                    return;
                } else {
                    parsableByteArray.setPosition(position);
                }
            }
            if ("color".equals(parseIdentifier)) {
                webvttCssStyle.setFontColor(com.google.android.exoplayer2.util.ColorParser.parseCssColor(parsePropertyValue));
                return;
            }
            if (PROPERTY_BGCOLOR.equals(parseIdentifier)) {
                webvttCssStyle.setBackgroundColor(com.google.android.exoplayer2.util.ColorParser.parseCssColor(parsePropertyValue));
                return;
            }
            boolean z = true;
            if (PROPERTY_RUBY_POSITION.equals(parseIdentifier)) {
                if (VALUE_OVER.equals(parsePropertyValue)) {
                    webvttCssStyle.setRubyPosition(1);
                    return;
                } else {
                    if (VALUE_UNDER.equals(parsePropertyValue)) {
                        webvttCssStyle.setRubyPosition(2);
                        return;
                    }
                    return;
                }
            }
            if (PROPERTY_TEXT_COMBINE_UPRIGHT.equals(parseIdentifier)) {
                if (!"all".equals(parsePropertyValue) && !parsePropertyValue.startsWith(VALUE_DIGITS)) {
                    z = false;
                }
                webvttCssStyle.setCombineUpright(z);
                return;
            }
            if (PROPERTY_TEXT_DECORATION.equals(parseIdentifier)) {
                if ("underline".equals(parsePropertyValue)) {
                    webvttCssStyle.setUnderline(true);
                    return;
                }
                return;
            }
            if (PROPERTY_FONT_FAMILY.equals(parseIdentifier)) {
                webvttCssStyle.setFontFamily(parsePropertyValue);
                return;
            }
            if (PROPERTY_FONT_WEIGHT.equals(parseIdentifier)) {
                if ("bold".equals(parsePropertyValue)) {
                    webvttCssStyle.setBold(true);
                }
            } else if (PROPERTY_FONT_STYLE.equals(parseIdentifier)) {
                if ("italic".equals(parsePropertyValue)) {
                    webvttCssStyle.setItalic(true);
                }
            } else if (PROPERTY_FONT_SIZE.equals(parseIdentifier)) {
                parseFontSize(parsePropertyValue, webvttCssStyle);
            }
        }
    }

    static void skipWhitespaceAndComments(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        while (true) {
            for (boolean z = true; parsableByteArray.bytesLeft() > 0 && z; z = false) {
                if (!maybeSkipWhitespace(parsableByteArray) && !maybeSkipComment(parsableByteArray)) {
                }
            }
            return;
        }
    }

    static java.lang.String parseNextToken(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        skipWhitespaceAndComments(parsableByteArray);
        if (parsableByteArray.bytesLeft() == 0) {
            return null;
        }
        java.lang.String parseIdentifier = parseIdentifier(parsableByteArray, sb);
        if (!"".equals(parseIdentifier)) {
            return parseIdentifier;
        }
        return "" + ((char) parsableByteArray.readUnsignedByte());
    }

    private static boolean maybeSkipWhitespace(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        char peekCharAtPosition = peekCharAtPosition(parsableByteArray, parsableByteArray.getPosition());
        if (peekCharAtPosition != '\t' && peekCharAtPosition != '\n' && peekCharAtPosition != '\f' && peekCharAtPosition != '\r' && peekCharAtPosition != ' ') {
            return false;
        }
        parsableByteArray.skipBytes(1);
        return true;
    }

    static void skipStyleBlock(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        while (!android.text.TextUtils.isEmpty(parsableByteArray.readLine())) {
        }
    }

    private static char peekCharAtPosition(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        return (char) parsableByteArray.getData()[i];
    }

    private static java.lang.String parsePropertyValue(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        boolean z = false;
        while (!z) {
            int position = parsableByteArray.getPosition();
            java.lang.String parseNextToken = parseNextToken(parsableByteArray, sb);
            if (parseNextToken == null) {
                return null;
            }
            if (RULE_END.equals(parseNextToken) || ";".equals(parseNextToken)) {
                parsableByteArray.setPosition(position);
                z = true;
            } else {
                sb2.append(parseNextToken);
            }
        }
        return sb2.toString();
    }

    private static boolean maybeSkipComment(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] data = parsableByteArray.getData();
        if (position + 2 > limit) {
            return false;
        }
        int i = position + 1;
        if (data[position] != 47) {
            return false;
        }
        int i2 = position + 2;
        if (data[i] != 42) {
            return false;
        }
        while (true) {
            int i3 = i2 + 1;
            if (i3 < limit) {
                if (((char) data[i2]) == '*' && ((char) data[i3]) == '/') {
                    i2 += 2;
                    limit = i2;
                } else {
                    i2 = i3;
                }
            } else {
                parsableByteArray.skipBytes(limit - parsableByteArray.getPosition());
                return true;
            }
        }
    }

    private static java.lang.String parseIdentifier(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, java.lang.StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        while (position < limit && !z) {
            char c = (char) parsableByteArray.getData()[position];
            if ((c < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                z = true;
            } else {
                position++;
                sb.append(c);
            }
        }
        parsableByteArray.skipBytes(position - parsableByteArray.getPosition());
        return sb.toString();
    }

    private static void parseFontSize(java.lang.String str, com.google.android.exoplayer2.text.webvtt.WebvttCssStyle webvttCssStyle) {
        java.util.regex.Matcher matcher = FONT_SIZE_PATTERN.matcher(com.google.common.base.Ascii.toLowerCase(str));
        if (!matcher.matches()) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Invalid font-size: '" + str + "'.");
            return;
        }
        java.lang.String str2 = (java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(2));
        str2.hashCode();
        switch (str2) {
            case "%":
                webvttCssStyle.setFontSizeUnit(3);
                break;
            case "em":
                webvttCssStyle.setFontSizeUnit(2);
                break;
            case "px":
                webvttCssStyle.setFontSizeUnit(1);
                break;
            default:
                throw new java.lang.IllegalStateException();
        }
        webvttCssStyle.setFontSize(java.lang.Float.parseFloat((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1))));
    }

    private void applySelectorToStyle(com.google.android.exoplayer2.text.webvtt.WebvttCssStyle webvttCssStyle, java.lang.String str) {
        if ("".equals(str)) {
            return;
        }
        int indexOf = str.indexOf(91);
        if (indexOf != -1) {
            java.util.regex.Matcher matcher = VOICE_NAME_PATTERN.matcher(str.substring(indexOf));
            if (matcher.matches()) {
                webvttCssStyle.setTargetVoice((java.lang.String) com.google.android.exoplayer2.util.Assertions.checkNotNull(matcher.group(1)));
            }
            str = str.substring(0, indexOf);
        }
        java.lang.String[] split = com.google.android.exoplayer2.util.Util.split(str, "\\.");
        java.lang.String str2 = split[0];
        int indexOf2 = str2.indexOf(35);
        if (indexOf2 != -1) {
            webvttCssStyle.setTargetTagName(str2.substring(0, indexOf2));
            webvttCssStyle.setTargetId(str2.substring(indexOf2 + 1));
        } else {
            webvttCssStyle.setTargetTagName(str2);
        }
        if (split.length > 1) {
            webvttCssStyle.setTargetClasses((java.lang.String[]) com.google.android.exoplayer2.util.Util.nullSafeArrayCopyOfRange(split, 1, split.length));
        }
    }
}
