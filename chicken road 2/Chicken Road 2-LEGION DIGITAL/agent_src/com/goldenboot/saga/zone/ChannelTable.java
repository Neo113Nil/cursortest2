package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract /* synthetic */ class ChannelTable {
    public static final /* synthetic */ int[] evictLayout;

    static {
        int[] iArr = new int[HeaderNode.values().length];
        evictLayout = iArr;
        try {
            iArr[HeaderNode.CLEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            evictLayout[HeaderNode.SRC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            evictLayout[HeaderNode.DST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            evictLayout[HeaderNode.SRC_OVER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            evictLayout[HeaderNode.DST_OVER.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            evictLayout[HeaderNode.SRC_IN.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            evictLayout[HeaderNode.DST_IN.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            evictLayout[HeaderNode.SRC_OUT.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            evictLayout[HeaderNode.DST_OUT.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            evictLayout[HeaderNode.SRC_ATOP.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            evictLayout[HeaderNode.DST_ATOP.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            evictLayout[HeaderNode.XOR.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            evictLayout[HeaderNode.PLUS.ordinal()] = 13;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            evictLayout[HeaderNode.MODULATE.ordinal()] = 14;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            evictLayout[HeaderNode.SCREEN.ordinal()] = 15;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            evictLayout[HeaderNode.OVERLAY.ordinal()] = 16;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            evictLayout[HeaderNode.DARKEN.ordinal()] = 17;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            evictLayout[HeaderNode.LIGHTEN.ordinal()] = 18;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            evictLayout[HeaderNode.COLOR_DODGE.ordinal()] = 19;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            evictLayout[HeaderNode.COLOR_BURN.ordinal()] = 20;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            evictLayout[HeaderNode.HARD_LIGHT.ordinal()] = 21;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            evictLayout[HeaderNode.SOFT_LIGHT.ordinal()] = 22;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            evictLayout[HeaderNode.DIFFERENCE.ordinal()] = 23;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            evictLayout[HeaderNode.EXCLUSION.ordinal()] = 24;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            evictLayout[HeaderNode.MULTIPLY.ordinal()] = 25;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            evictLayout[HeaderNode.HUE.ordinal()] = 26;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            evictLayout[HeaderNode.SATURATION.ordinal()] = 27;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            evictLayout[HeaderNode.COLOR.ordinal()] = 28;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            evictLayout[HeaderNode.LUMINOSITY.ordinal()] = 29;
        } catch (NoSuchFieldError unused29) {
        }
    }
}
