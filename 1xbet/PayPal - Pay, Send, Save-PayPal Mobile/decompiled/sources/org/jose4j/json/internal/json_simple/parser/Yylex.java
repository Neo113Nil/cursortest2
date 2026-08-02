package org.jose4j.json.internal.json_simple.parser;

/* loaded from: classes18.dex */
class Yylex {
    private static final char[] getOutputMinFrameDurationlomOqCM;
    private static final int[] getOutputSizes;
    private static final int[] getOutputStallDuration;
    private static final java.lang.String[] getOutputStallDurationlomOqCM;
    private static final int[] getValidOutputFormatsForInputhNQ4ISI;
    private static final int[] isOutputSupportedFor = {0, 0, 1, 1};
    private static final int[] toString;
    private int ArtificialStackFrames;
    boolean getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    int getHighSpeedVideoSizesFor;
    int getInputSizeshNQ4ISI;
    int getOutputMinFrameDuration;
    int getOutputSizeshNQ4ISI;
    int getOutputFormats = 0;
    private char[] isOutputSupportedForhNQ4ISI = new char[16384];
    boolean Camera2StreamConfigurationMap = true;
    private java.lang.StringBuilder unwrapAs = new java.lang.StringBuilder();
    java.io.Reader getInputFormats = null;

    static {
        int i = 0;
        char[] cArr = new char[65536];
        int i2 = 0;
        int i3 = 0;
        while (i2 < 90) {
            int charAt = "\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000".charAt(i2);
            int i4 = i2 + 2;
            char charAt2 = "\t\u0000\u0001\u0007\u0001\u0007\u0002\u0000\u0001\u0007\u0012\u0000\u0001\u0007\u0001\u0000\u0001\t\b\u0000\u0001\u0006\u0001\u0019\u0001\u0002\u0001\u0004\u0001\n\n\u0003\u0001\u001a\u0006\u0000\u0004\u0001\u0001\u0005\u0001\u0001\u0014\u0000\u0001\u0017\u0001\b\u0001\u0018\u0003\u0000\u0001\u0012\u0001\u000b\u0002\u0001\u0001\u0011\u0001\f\u0005\u0000\u0001\u0013\u0001\u0000\u0001\r\u0003\u0000\u0001\u000e\u0001\u0014\u0001\u000f\u0001\u0010\u0005\u0000\u0001\u0015\u0001\u0000\u0001\u0016ﾂ\u0000".charAt(i2 + 1);
            do {
                cArr[i3] = charAt2;
                charAt--;
                i3++;
            } while (charAt > 0);
            i2 = i4;
        }
        getOutputMinFrameDurationlomOqCM = cArr;
        int[] iArr = new int[45];
        int i5 = 0;
        int i6 = 0;
        while (i5 < 66) {
            int charAt3 = "\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018".charAt(i5);
            int i7 = i5 + 2;
            char charAt4 = "\u0002\u0000\u0002\u0001\u0001\u0002\u0001\u0003\u0001\u0004\u0003\u0001\u0001\u0005\u0001\u0006\u0001\u0007\u0001\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0005\u0000\u0001\f\u0001\u000e\u0001\u000f\u0001\u0010\u0001\u0011\u0001\u0012\u0001\u0013\u0001\u0014\u0001\u0000\u0001\u0015\u0001\u0000\u0001\u0015\u0004\u0000\u0001\u0016\u0001\u0017\u0002\u0000\u0001\u0018".charAt(i5 + 1);
            do {
                iArr[i6] = charAt4;
                charAt3--;
                i6++;
            } while (charAt3 > 0);
            i5 = i7;
        }
        getOutputSizes = iArr;
        int[] iArr2 = new int[45];
        int i8 = 0;
        for (int i9 = 0; i9 < 90; i9 += 2) {
            iArr2[i8] = "\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006".charAt(i9 + 1) | ("\u0000\u0000\u0000\u001b\u00006\u0000Q\u0000l\u0000\u0087\u00006\u0000¢\u0000½\u0000Ø\u00006\u00006\u00006\u00006\u00006\u00006\u0000ó\u0000Ď\u00006\u0000ĩ\u0000ń\u0000ş\u0000ź\u0000ƕ\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u00006\u0000ư\u0000ǋ\u0000Ǧ\u0000Ǧ\u0000ȁ\u0000Ȝ\u0000ȷ\u0000ɒ\u00006\u00006\u0000ɭ\u0000ʈ\u00006".charAt(i9) << 16);
            i8++;
        }
        toString = iArr2;
        int[] iArr3 = new int[675];
        int[] iArr4 = new int[675];
        java.nio.ByteBuffer.wrap("\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0003\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0005\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0006\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0007\u0000\u0000\u0000\b\u0000\u0000\u0000\u0002\u0000\u0000\u0000\t\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\u0002\u0000\u0000\u0000\n\u0000\u0000\u0000\u000b\u0000\u0000\u0000\f\u0000\u0000\u0000\r\u0000\u0000\u0000\u000e\u0000\u0000\u0000\u000f\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0011\u0000\u0000\u0000\u0012\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0004ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0004\u0000\u0000\u0000\u0013\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0005ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0015ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0016ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0017ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010\u0000\u0000\u0000\u0010ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0018\u0000\u0000\u0000\u0019\u0000\u0000\u0000\u001a\u0000\u0000\u0000\u001b\u0000\u0000\u0000\u001c\u0000\u0000\u0000\u001d\u0000\u0000\u0000\u001e\u0000\u0000\u0000\u001f\u0000\u0000\u0000 ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000!ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\"\u0000\u0000\u0000#ÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\"ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000$ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000%ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000&ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿ\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000'\u0000\u0000\u0000'ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000!ÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000\u0014ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000#ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000&ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000(ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000)ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿ\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000*\u0000\u0000\u0000*ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿ\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000+\u0000\u0000\u0000+ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿ\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ\u0000\u0000\u0000,\u0000\u0000\u0000,ÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿÿ".getBytes("ISO-8859-1")).asIntBuffer().get(iArr4, 0, 675);
        java.lang.System.arraycopy(iArr4, 0, iArr3, 0, 675);
        getValidOutputFormatsForInputhNQ4ISI = iArr3;
        getOutputStallDurationlomOqCM = new java.lang.String[]{"Unkown internal scanner error", "Error: could not match input", "Error: pushback value was too large"};
        int[] iArr5 = new int[45];
        int i10 = 0;
        while (i < 36) {
            int charAt5 = "\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t".charAt(i);
            int i11 = i + 2;
            char charAt6 = "\u0002\u0000\u0001\t\u0003\u0001\u0001\t\u0003\u0001\u0006\t\u0002\u0001\u0001\t\u0005\u0000\b\t\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0004\u0000\u0002\t\u0002\u0000\u0001\t".charAt(i + 1);
            do {
                iArr5[i10] = charAt6;
                charAt5--;
                i10++;
            } while (charAt5 > 0);
            i = i11;
        }
        getOutputStallDuration = iArr5;
    }

    Yylex() {
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00a5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final org.jose4j.json.internal.json_simple.parser.Yytoken getHighSpeedVideoFpsRangesFor() throws java.io.IOException, org.jose4j.json.internal.json_simple.parser.ParseException {
        char c;
        boolean z;
        int read;
        int i;
        java.lang.String str;
        int i2 = this.getOutputMinFrameDuration;
        char[] cArr = this.isOutputSupportedForhNQ4ISI;
        char[] cArr2 = getOutputMinFrameDurationlomOqCM;
        int[] iArr = getValidOutputFormatsForInputhNQ4ISI;
        int[] iArr2 = toString;
        int[] iArr3 = getOutputStallDuration;
        while (true) {
            int i3 = this.getInputSizeshNQ4ISI;
            this.getHighSpeedVideoFpsRangesFor += i3 - this.getOutputSizeshNQ4ISI;
            this.getOutputSizeshNQ4ISI = i3;
            this.getHighSpeedVideoSizesFor = i3;
            this.ArtificialStackFrames = isOutputSupportedFor[this.getOutputFormats];
            char c2 = 65535;
            int i4 = i3;
            int i5 = -1;
            while (true) {
                if (i3 < i2) {
                    i = i3 + 1;
                    c = cArr[i3];
                } else if (this.getHighResolutionOutputSizeshNQ4ISI) {
                    c = c2;
                } else {
                    this.getHighSpeedVideoSizesFor = i3;
                    this.getInputSizeshNQ4ISI = i4;
                    int i6 = this.getOutputSizeshNQ4ISI;
                    if (i6 > 0) {
                        char[] cArr3 = this.isOutputSupportedForhNQ4ISI;
                        java.lang.System.arraycopy(cArr3, i6, cArr3, 0, this.getOutputMinFrameDuration - i6);
                        int i7 = this.getOutputMinFrameDuration;
                        int i8 = this.getOutputSizeshNQ4ISI;
                        this.getOutputMinFrameDuration = i7 - i8;
                        this.getHighSpeedVideoSizesFor -= i8;
                        this.getInputSizeshNQ4ISI -= i8;
                        this.getOutputSizeshNQ4ISI = 0;
                    }
                    int i9 = this.getHighSpeedVideoSizesFor;
                    char[] cArr4 = this.isOutputSupportedForhNQ4ISI;
                    if (i9 >= cArr4.length) {
                        char[] cArr5 = new char[i9 * 2];
                        java.lang.System.arraycopy(cArr4, 0, cArr5, 0, cArr4.length);
                        this.isOutputSupportedForhNQ4ISI = cArr5;
                    }
                    java.io.Reader reader = this.getInputFormats;
                    char[] cArr6 = this.isOutputSupportedForhNQ4ISI;
                    int i10 = this.getOutputMinFrameDuration;
                    int read2 = reader.read(cArr6, i10, cArr6.length - i10);
                    if (read2 > 0) {
                        this.getOutputMinFrameDuration += read2;
                    } else if (read2 != 0 || (read = this.getInputFormats.read()) == c2) {
                        z = true;
                        int i11 = this.getHighSpeedVideoSizesFor;
                        i4 = this.getInputSizeshNQ4ISI;
                        char[] cArr7 = this.isOutputSupportedForhNQ4ISI;
                        int i12 = this.getOutputMinFrameDuration;
                        if (z) {
                            c = cArr7[i11];
                            i2 = i12;
                            i = i11 + 1;
                            cArr = cArr7;
                        } else {
                            cArr = cArr7;
                            c = c2;
                            i2 = i12;
                        }
                    } else {
                        char[] cArr8 = this.isOutputSupportedForhNQ4ISI;
                        int i13 = this.getOutputMinFrameDuration;
                        this.getOutputMinFrameDuration = i13 + 1;
                        cArr8[i13] = (char) read;
                    }
                    z = false;
                    int i112 = this.getHighSpeedVideoSizesFor;
                    i4 = this.getInputSizeshNQ4ISI;
                    char[] cArr72 = this.isOutputSupportedForhNQ4ISI;
                    int i122 = this.getOutputMinFrameDuration;
                    if (z) {
                    }
                }
                int i14 = iArr[iArr2[this.ArtificialStackFrames] + cArr2[c]];
                if (i14 != c2) {
                    this.ArtificialStackFrames = i14;
                    int i15 = iArr3[i14];
                    if ((i15 & 1) != 1) {
                        c2 = 65535;
                    } else if ((i15 & 8) == 8) {
                        i4 = i;
                        i5 = i14;
                    } else {
                        c2 = 65535;
                        i4 = i;
                        i5 = i14;
                    }
                    i3 = i;
                }
            }
            this.getInputSizeshNQ4ISI = i4;
            if (i5 >= 0) {
                i5 = getOutputSizes[i5];
            }
            switch (i5) {
                case 1:
                    throw new org.jose4j.json.internal.json_simple.parser.ParseException(this.getHighSpeedVideoFpsRangesFor, 0, new java.lang.Character(this.isOutputSupportedForhNQ4ISI[this.getOutputSizeshNQ4ISI]));
                case 2:
                    char[] cArr9 = this.isOutputSupportedForhNQ4ISI;
                    int i16 = this.getOutputSizeshNQ4ISI;
                    java.lang.String str2 = new java.lang.String(cArr9, i16, i4 - i16);
                    try {
                        return new org.jose4j.json.internal.json_simple.parser.Yytoken(0, java.lang.Long.valueOf(str2));
                    } catch (java.lang.NumberFormatException unused) {
                        return new org.jose4j.json.internal.json_simple.parser.Yytoken(0, new java.math.BigInteger(str2));
                    }
                case 3:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                    break;
                case 4:
                    this.unwrapAs = null;
                    this.unwrapAs = new java.lang.StringBuilder();
                    this.getOutputFormats = 2;
                    break;
                case 5:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(1, null);
                case 6:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(2, null);
                case 7:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(3, null);
                case 8:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(4, null);
                case 9:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(5, null);
                case 10:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(6, null);
                case 11:
                    java.lang.StringBuilder sb = this.unwrapAs;
                    char[] cArr10 = this.isOutputSupportedForhNQ4ISI;
                    int i17 = this.getOutputSizeshNQ4ISI;
                    sb.append(new java.lang.String(cArr10, i17, i4 - i17));
                    break;
                case 12:
                    this.unwrapAs.append('\\');
                    break;
                case 13:
                    this.getOutputFormats = 0;
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(0, this.unwrapAs.toString());
                case 14:
                    this.unwrapAs.append('\"');
                    break;
                case 15:
                    this.unwrapAs.append(kotlinx.io.files.FileSystemKt.UnixPathSeparator);
                    break;
                case 16:
                    this.unwrapAs.append('\b');
                    break;
                case 17:
                    this.unwrapAs.append('\f');
                    break;
                case 18:
                    this.unwrapAs.append('\n');
                    break;
                case 19:
                    this.unwrapAs.append('\r');
                    break;
                case 20:
                    this.unwrapAs.append('\t');
                    break;
                case 21:
                    char[] cArr11 = this.isOutputSupportedForhNQ4ISI;
                    int i18 = this.getOutputSizeshNQ4ISI;
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(0, java.lang.Double.valueOf(new java.lang.String(cArr11, i18, i4 - i18)));
                case 22:
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(0, null);
                case 23:
                    char[] cArr12 = this.isOutputSupportedForhNQ4ISI;
                    int i19 = this.getOutputSizeshNQ4ISI;
                    return new org.jose4j.json.internal.json_simple.parser.Yytoken(0, java.lang.Boolean.valueOf(new java.lang.String(cArr12, i19, i4 - i19)));
                case 24:
                    try {
                        char[] cArr13 = this.isOutputSupportedForhNQ4ISI;
                        int i20 = this.getOutputSizeshNQ4ISI;
                        this.unwrapAs.append((char) java.lang.Integer.parseInt(new java.lang.String(cArr13, i20, i4 - i20).substring(2), 16));
                        break;
                    } catch (java.lang.Exception e) {
                        throw new org.jose4j.json.internal.json_simple.parser.ParseException(this.getHighSpeedVideoFpsRangesFor, 2, e);
                    }
                default:
                    if (c == 65535 && this.getOutputSizeshNQ4ISI == this.getHighSpeedVideoSizesFor) {
                        this.getHighResolutionOutputSizeshNQ4ISI = true;
                        return null;
                    }
                    try {
                        str = getOutputStallDurationlomOqCM[1];
                    } catch (java.lang.ArrayIndexOutOfBoundsException unused2) {
                        str = getOutputStallDurationlomOqCM[0];
                    }
                    throw new java.lang.Error(str);
            }
        }
    }
}
