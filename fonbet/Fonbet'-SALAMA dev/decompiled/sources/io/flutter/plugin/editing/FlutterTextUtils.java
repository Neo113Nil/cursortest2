package io.flutter.plugin.editing;

import io.flutter.embedding.engine.FlutterJNI;

/* loaded from: classes2.dex */
class FlutterTextUtils {
    public static final int CANCEL_TAG = 917631;
    public static final int CARRIAGE_RETURN = 13;
    public static final int COMBINING_ENCLOSING_KEYCAP = 8419;
    public static final int LINE_FEED = 10;
    public static final int ZERO_WIDTH_JOINER = 8205;
    private final FlutterJNI flutterJNI;

    public FlutterTextUtils(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
    }

    public int getOffsetAfter(CharSequence charSequence, int i7) {
        int charCount;
        int charCount2;
        int charCount3;
        int length = charSequence.length();
        int i8 = length - 1;
        if (i7 >= i8) {
            return length;
        }
        int codePointAt = Character.codePointAt(charSequence, i7);
        int charCount4 = Character.charCount(codePointAt);
        int i9 = i7 + charCount4;
        int i10 = 0;
        if (i9 == 0) {
            return 0;
        }
        if (codePointAt == 10) {
            if (Character.codePointAt(charSequence, i9) == 13) {
                charCount4++;
            }
            return i7 + charCount4;
        }
        if (isRegionalIndicatorSymbol(codePointAt)) {
            if (i9 >= i8 || !isRegionalIndicatorSymbol(Character.codePointAt(charSequence, i9))) {
                return i9;
            }
            int i11 = i7;
            while (i11 > 0 && isRegionalIndicatorSymbol(Character.codePointBefore(charSequence, i7))) {
                i11 -= Character.charCount(Character.codePointBefore(charSequence, i7));
                i10++;
            }
            if (i10 % 2 == 0) {
                charCount4 += 2;
            }
            return i7 + charCount4;
        }
        if (isKeycapBase(codePointAt)) {
            charCount4 += Character.charCount(codePointAt);
        }
        if (codePointAt == 8419) {
            int codePointBefore = Character.codePointBefore(charSequence, i9);
            int charCount5 = Character.charCount(codePointBefore) + i9;
            if (charCount5 >= length || !isVariationSelector(codePointBefore)) {
                if (isKeycapBase(codePointBefore)) {
                    charCount3 = Character.charCount(codePointBefore);
                    charCount4 += charCount3;
                }
                return i7 + charCount4;
            }
            int codePointAt2 = Character.codePointAt(charSequence, charCount5);
            if (isKeycapBase(codePointAt2)) {
                charCount3 = Character.charCount(codePointAt2) + Character.charCount(codePointBefore);
                charCount4 += charCount3;
            }
            return i7 + charCount4;
        }
        if (isEmoji(codePointAt)) {
            boolean z4 = false;
            int i12 = 0;
            do {
                if (z4) {
                    charCount4 = Character.charCount(codePointAt) + i12 + 1 + charCount4;
                    z4 = false;
                }
                if (isEmojiModifier(codePointAt)) {
                    break;
                }
                if (i9 < length) {
                    codePointAt = Character.codePointAt(charSequence, i9);
                    int charCount6 = Character.charCount(codePointAt) + i9;
                    if (codePointAt != 8419) {
                        if (isEmojiModifier(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (isVariationSelector(codePointAt)) {
                            charCount2 = Character.charCount(codePointAt);
                        } else if (codePointAt == 8205) {
                            codePointAt = Character.codePointAt(charSequence, charCount6);
                            i9 = Character.charCount(codePointAt) + charCount6;
                            if (i9 >= length || !isVariationSelector(codePointAt)) {
                                i12 = 0;
                            } else {
                                codePointAt = Character.codePointAt(charSequence, i9);
                                int charCount7 = Character.charCount(codePointAt);
                                i9 = Character.charCount(codePointAt) + i9;
                                i12 = charCount7;
                            }
                            z4 = true;
                            if (i9 < length || !z4) {
                                break;
                                break;
                            }
                        } else {
                            i9 = charCount6;
                        }
                        charCount4 += charCount2;
                        break;
                    }
                    int codePointBefore2 = Character.codePointBefore(charSequence, charCount6);
                    int charCount8 = Character.charCount(codePointBefore2) + charCount6;
                    if (charCount8 >= length || !isVariationSelector(codePointBefore2)) {
                        if (isKeycapBase(codePointBefore2)) {
                            charCount = Character.charCount(codePointBefore2);
                            charCount4 += charCount;
                        }
                        return i7 + charCount4;
                    }
                    int codePointAt3 = Character.codePointAt(charSequence, charCount8);
                    if (isKeycapBase(codePointAt3)) {
                        charCount = Character.charCount(codePointAt3) + Character.charCount(codePointBefore2);
                        charCount4 += charCount;
                    }
                    return i7 + charCount4;
                }
                i12 = 0;
                if (i9 < length) {
                    break;
                }
            } while (isEmoji(codePointAt));
        }
        return i7 + charCount4;
    }

    public int getOffsetBefore(CharSequence charSequence, int i7) {
        int codePointBefore;
        int charCount;
        int charCount2;
        int charCount3;
        int i8 = 0;
        int i9 = 1;
        if (i7 <= 1 || (charCount2 = i7 - (charCount = Character.charCount((codePointBefore = Character.codePointBefore(charSequence, i7))))) == 0) {
            return 0;
        }
        if (codePointBefore == 10) {
            if (Character.codePointBefore(charSequence, charCount2) == 13) {
                charCount++;
            }
            return i7 - charCount;
        }
        if (isRegionalIndicatorSymbol(codePointBefore)) {
            int codePointBefore2 = Character.codePointBefore(charSequence, charCount2);
            int charCount4 = charCount2 - Character.charCount(codePointBefore2);
            while (charCount4 > 0 && isRegionalIndicatorSymbol(codePointBefore2)) {
                codePointBefore2 = Character.codePointBefore(charSequence, charCount4);
                charCount4 -= Character.charCount(codePointBefore2);
                i9++;
            }
            if (i9 % 2 == 0) {
                charCount += 2;
            }
            return i7 - charCount;
        }
        if (codePointBefore == 8419) {
            int codePointBefore3 = Character.codePointBefore(charSequence, charCount2);
            int charCount5 = charCount2 - Character.charCount(codePointBefore3);
            if (charCount5 <= 0 || !isVariationSelector(codePointBefore3)) {
                if (isKeycapBase(codePointBefore3)) {
                    charCount3 = Character.charCount(codePointBefore3);
                    charCount += charCount3;
                }
                return i7 - charCount;
            }
            int codePointBefore4 = Character.codePointBefore(charSequence, charCount5);
            if (isKeycapBase(codePointBefore4)) {
                charCount3 = Character.charCount(codePointBefore4) + Character.charCount(codePointBefore3);
                charCount += charCount3;
            }
            return i7 - charCount;
        }
        if (codePointBefore == 917631) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            int charCount6 = Character.charCount(codePointBefore);
            while (true) {
                charCount2 -= charCount6;
                if (charCount2 <= 0 || !isTagSpecChar(codePointBefore)) {
                    break;
                }
                charCount += Character.charCount(codePointBefore);
                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                charCount6 = Character.charCount(codePointBefore);
            }
            if (!isEmoji(codePointBefore)) {
                return i7 - 2;
            }
            charCount += Character.charCount(codePointBefore);
        }
        if (isVariationSelector(codePointBefore)) {
            codePointBefore = Character.codePointBefore(charSequence, charCount2);
            if (!isEmoji(codePointBefore)) {
                return i7 - charCount;
            }
            charCount += Character.charCount(codePointBefore);
            charCount2 -= charCount;
        }
        if (isEmoji(codePointBefore)) {
            boolean z4 = false;
            int i10 = 0;
            while (true) {
                if (z4) {
                    charCount = Character.charCount(codePointBefore) + i10 + 1 + charCount;
                    z4 = false;
                }
                if (isEmojiModifier(codePointBefore)) {
                    int codePointBefore5 = Character.codePointBefore(charSequence, charCount2);
                    int charCount7 = charCount2 - Character.charCount(codePointBefore5);
                    if (charCount7 > 0 && isVariationSelector(codePointBefore5)) {
                        codePointBefore5 = Character.codePointBefore(charSequence, charCount7);
                        if (!isEmoji(codePointBefore5)) {
                            return i7 - charCount;
                        }
                        i8 = Character.charCount(codePointBefore5);
                        Character.charCount(codePointBefore5);
                    }
                    if (isEmojiModifierBase(codePointBefore5)) {
                        charCount += Character.charCount(codePointBefore5) + i8;
                    }
                } else {
                    if (charCount2 > 0) {
                        codePointBefore = Character.codePointBefore(charSequence, charCount2);
                        charCount2 -= Character.charCount(codePointBefore);
                        if (codePointBefore == 8205) {
                            codePointBefore = Character.codePointBefore(charSequence, charCount2);
                            charCount2 -= Character.charCount(codePointBefore);
                            if (charCount2 <= 0 || !isVariationSelector(codePointBefore)) {
                                i10 = 0;
                            } else {
                                codePointBefore = Character.codePointBefore(charSequence, charCount2);
                                int charCount8 = Character.charCount(codePointBefore);
                                charCount2 -= Character.charCount(codePointBefore);
                                i10 = charCount8;
                            }
                            z4 = true;
                            if (charCount2 != 0 || !z4 || !isEmoji(codePointBefore)) {
                                break;
                                break;
                            }
                        }
                    }
                    i10 = 0;
                    if (charCount2 != 0) {
                        break;
                    }
                }
            }
        }
        return i7 - charCount;
    }

    public boolean isEmoji(int i7) {
        return this.flutterJNI.isCodePointEmoji(i7);
    }

    public boolean isEmojiModifier(int i7) {
        return this.flutterJNI.isCodePointEmojiModifier(i7);
    }

    public boolean isEmojiModifierBase(int i7) {
        return this.flutterJNI.isCodePointEmojiModifierBase(i7);
    }

    public boolean isKeycapBase(int i7) {
        return (48 <= i7 && i7 <= 57) || i7 == 35 || i7 == 42;
    }

    public boolean isRegionalIndicatorSymbol(int i7) {
        return this.flutterJNI.isCodePointRegionalIndicator(i7);
    }

    public boolean isTagSpecChar(int i7) {
        return 917536 <= i7 && i7 <= 917630;
    }

    public boolean isVariationSelector(int i7) {
        return this.flutterJNI.isCodePointVariantSelector(i7);
    }
}
