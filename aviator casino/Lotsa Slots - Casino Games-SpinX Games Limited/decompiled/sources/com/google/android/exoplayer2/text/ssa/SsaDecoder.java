package com.google.android.exoplayer2.text.ssa;

/* loaded from: classes3.dex */
public final class SsaDecoder extends com.google.android.exoplayer2.text.SimpleSubtitleDecoder {
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final java.lang.String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final java.lang.String FORMAT_LINE_PREFIX = "Format:";
    private static final java.util.regex.Pattern SSA_TIMECODE_PATTERN = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final java.lang.String STYLE_LINE_PREFIX = "Style:";
    private static final java.lang.String TAG = "SsaDecoder";
    private final com.google.android.exoplayer2.text.ssa.SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private float screenHeight;
    private float screenWidth;
    private java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ssa.SsaStyle> styles;

    private static float computeDefaultLineOrPosition(int i) {
        if (i == 0) {
            return DEFAULT_MARGIN;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    public SsaDecoder() {
        this(null);
    }

    public SsaDecoder(java.util.List<byte[]> list) {
        super(TAG);
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.haveInitializationData = true;
            java.lang.String fromUtf8Bytes = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(list.get(0));
            com.google.android.exoplayer2.util.Assertions.checkArgument(fromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
            this.dialogueFormatFromInitializationData = (com.google.android.exoplayer2.text.ssa.SsaDialogueFormat) com.google.android.exoplayer2.util.Assertions.checkNotNull(com.google.android.exoplayer2.text.ssa.SsaDialogueFormat.fromFormatLine(fromUtf8Bytes));
            parseHeader(new com.google.android.exoplayer2.util.ParsableByteArray(list.get(1)));
            return;
        }
        this.haveInitializationData = false;
        this.dialogueFormatFromInitializationData = null;
    }

    @Override // com.google.android.exoplayer2.text.SimpleSubtitleDecoder
    protected com.google.android.exoplayer2.text.Subtitle decode(byte[] bArr, int i, boolean z) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = new com.google.android.exoplayer2.util.ParsableByteArray(bArr, i);
        if (!this.haveInitializationData) {
            parseHeader(parsableByteArray);
        }
        parseEventBody(parsableByteArray, arrayList, arrayList2);
        return new com.google.android.exoplayer2.text.ssa.SsaSubtitle(arrayList, arrayList2);
    }

    private void parseHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        while (true) {
            java.lang.String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(readLine)) {
                parseScriptInfo(parsableByteArray);
            } else if ("[V4+ Styles]".equalsIgnoreCase(readLine)) {
                this.styles = parseStyles(parsableByteArray);
            } else if ("[V4 Styles]".equalsIgnoreCase(readLine)) {
                com.google.android.exoplayer2.util.Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(readLine)) {
                return;
            }
        }
    }

    private void parseScriptInfo(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        while (true) {
            java.lang.String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekUnsignedByte() == 91) {
                return;
            }
            java.lang.String[] split = readLine.split(":");
            if (split.length == 2) {
                java.lang.String lowerCase = com.google.common.base.Ascii.toLowerCase(split[0].trim());
                lowerCase.hashCode();
                if (lowerCase.equals("playresx")) {
                    this.screenWidth = java.lang.Float.parseFloat(split[1].trim());
                } else if (lowerCase.equals("playresy")) {
                    try {
                        this.screenHeight = java.lang.Float.parseFloat(split[1].trim());
                    } catch (java.lang.NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static java.util.Map<java.lang.String, com.google.android.exoplayer2.text.ssa.SsaStyle> parseStyles(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.google.android.exoplayer2.text.ssa.SsaStyle.Format format = null;
        while (true) {
            java.lang.String readLine = parsableByteArray.readLine();
            if (readLine == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekUnsignedByte() == 91)) {
                break;
            }
            if (readLine.startsWith(FORMAT_LINE_PREFIX)) {
                format = com.google.android.exoplayer2.text.ssa.SsaStyle.Format.fromFormatLine(readLine);
            } else if (readLine.startsWith(STYLE_LINE_PREFIX)) {
                if (format == null) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: " + readLine);
                } else {
                    com.google.android.exoplayer2.text.ssa.SsaStyle fromStyleLine = com.google.android.exoplayer2.text.ssa.SsaStyle.fromStyleLine(readLine, format);
                    if (fromStyleLine != null) {
                        linkedHashMap.put(fromStyleLine.name, fromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void parseEventBody(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> list, java.util.List<java.lang.Long> list2) {
        com.google.android.exoplayer2.text.ssa.SsaDialogueFormat ssaDialogueFormat = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            java.lang.String readLine = parsableByteArray.readLine();
            if (readLine == null) {
                return;
            }
            if (readLine.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormat = com.google.android.exoplayer2.text.ssa.SsaDialogueFormat.fromFormatLine(readLine);
            } else if (readLine.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormat == null) {
                    com.google.android.exoplayer2.util.Log.w(TAG, "Skipping dialogue line before complete format: " + readLine);
                } else {
                    parseDialogueLine(readLine, ssaDialogueFormat, list, list2);
                }
            }
        }
    }

    private void parseDialogueLine(java.lang.String str, com.google.android.exoplayer2.text.ssa.SsaDialogueFormat ssaDialogueFormat, java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> list, java.util.List<java.lang.Long> list2) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        java.lang.String[] split = str.substring(9).split(",", ssaDialogueFormat.length);
        if (split.length != ssaDialogueFormat.length) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long parseTimecodeUs = parseTimecodeUs(split[ssaDialogueFormat.startTimeIndex]);
        if (parseTimecodeUs == -9223372036854775807L) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        long parseTimecodeUs2 = parseTimecodeUs(split[ssaDialogueFormat.endTimeIndex]);
        if (parseTimecodeUs2 == -9223372036854775807L) {
            com.google.android.exoplayer2.util.Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        com.google.android.exoplayer2.text.ssa.SsaStyle ssaStyle = (this.styles == null || ssaDialogueFormat.styleIndex == -1) ? null : this.styles.get(split[ssaDialogueFormat.styleIndex].trim());
        java.lang.String str2 = split[ssaDialogueFormat.textIndex];
        com.google.android.exoplayer2.text.Cue createCue = createCue(com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle, com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
        int addCuePlacerholderByTime = addCuePlacerholderByTime(parseTimecodeUs2, list2, list);
        for (int addCuePlacerholderByTime2 = addCuePlacerholderByTime(parseTimecodeUs, list2, list); addCuePlacerholderByTime2 < addCuePlacerholderByTime; addCuePlacerholderByTime2++) {
            list.get(addCuePlacerholderByTime2).add(createCue);
        }
    }

    private static long parseTimecodeUs(java.lang.String str) {
        java.util.regex.Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        if (matcher.matches()) {
            return (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(matcher.group(1))) * 3600000000L) + (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(matcher.group(2))) * 60000000) + (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(matcher.group(3))) * 1000000) + (java.lang.Long.parseLong((java.lang.String) com.google.android.exoplayer2.util.Util.castNonNull(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    private static com.google.android.exoplayer2.text.Cue createCue(java.lang.String str, com.google.android.exoplayer2.text.ssa.SsaStyle ssaStyle, com.google.android.exoplayer2.text.ssa.SsaStyle.Overrides overrides, float f, float f2) {
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        com.google.android.exoplayer2.text.Cue.Builder text = new com.google.android.exoplayer2.text.Cue.Builder().setText(spannableString);
        if (ssaStyle != null) {
            if (ssaStyle.primaryColor != null) {
                spannableString.setSpan(new android.text.style.ForegroundColorSpan(ssaStyle.primaryColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && ssaStyle.outlineColor != null) {
                spannableString.setSpan(new android.text.style.BackgroundColorSpan(ssaStyle.outlineColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.fontSize != -3.4028235E38f && f2 != -3.4028235E38f) {
                text.setTextSize(ssaStyle.fontSize / f2, 1);
            }
            if (ssaStyle.bold && ssaStyle.italic) {
                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
            } else if (ssaStyle.bold) {
                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new android.text.style.UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new android.text.style.StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = -1;
        if (overrides.alignment != -1) {
            i = overrides.alignment;
        } else if (ssaStyle != null) {
            i = ssaStyle.alignment;
        }
        text.setTextAlignment(toTextAlignment(i)).setPositionAnchor(toPositionAnchor(i)).setLineAnchor(toLineAnchor(i));
        if (overrides.position != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            text.setPosition(overrides.position.x / f);
            text.setLine(overrides.position.y / f2, 0);
        } else {
            text.setPosition(computeDefaultLineOrPosition(text.getPositionAnchor()));
            text.setLine(computeDefaultLineOrPosition(text.getLineAnchor()), 0);
        }
        return text.build();
    }

    private static android.text.Layout.Alignment toTextAlignment(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return android.text.Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return android.text.Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return android.text.Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int toLineAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown alignment: " + i);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                com.google.android.exoplayer2.util.Log.w(TAG, "Unknown alignment: " + i);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int addCuePlacerholderByTime(long j, java.util.List<java.lang.Long> list, java.util.List<java.util.List<com.google.android.exoplayer2.text.Cue>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, java.lang.Long.valueOf(j));
        list2.add(i, i == 0 ? new java.util.ArrayList() : new java.util.ArrayList(list2.get(i - 1)));
        return i;
    }
}
