package com.github.mikephil.charting.utils;

/* loaded from: classes8.dex */
public class ColorTemplate {
    public static final int COLOR_NONE = 1122867;
    public static final int COLOR_SKIP = 1122868;
    public static final int[] LIBERTY_COLORS = {android.graphics.Color.rgb(207, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE), android.graphics.Color.rgb(148, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_OVERRIDE_VALUE), android.graphics.Color.rgb(136, com.plaid.internal.EnumC0527g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 187), android.graphics.Color.rgb(118, 174, 175), android.graphics.Color.rgb(42, 109, 130)};
    public static final int[] JOYFUL_COLORS = {android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, 80, 138), android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 149, 7), android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 247, 120), android.graphics.Color.rgb(106, 167, 134), android.graphics.Color.rgb(53, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_EXTERNAL_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOMPLETE_VALUE)};
    public static final int[] PASTEL_COLORS = {android.graphics.Color.rgb(64, 89, 128), android.graphics.Color.rgb(149, 165, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PROGRESS_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE), android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 134, 134), android.graphics.Color.rgb(179, 48, 80)};
    public static final int[] COLORFUL_COLORS = {android.graphics.Color.rgb(193, 37, 82), android.graphics.Color.rgb(255, 102, 0), android.graphics.Color.rgb(com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 199, 0), android.graphics.Color.rgb(106, 150, 31), android.graphics.Color.rgb(179, 100, 53)};
    public static final int[] VORDIPLOM_COLORS = {android.graphics.Color.rgb(192, 255, 140), android.graphics.Color.rgb(255, 247, 140), android.graphics.Color.rgb(255, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_INCOME_VALUE, 140), android.graphics.Color.rgb(140, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 255), android.graphics.Color.rgb(255, 140, 157)};
    public static final int[] MATERIAL_COLORS = {rgb("#2ecc71"), rgb("#f1c40f"), rgb("#e74c3c"), rgb("#3498db")};

    public static int colorWithAlpha(int i, int i2) {
        return (i & 16777215) | ((i2 & 255) << 24);
    }

    public static int rgb(java.lang.String str) {
        int parseLong = (int) java.lang.Long.parseLong(str.replace("#", ""), 16);
        return android.graphics.Color.rgb((parseLong >> 16) & 255, (parseLong >> 8) & 255, parseLong & 255);
    }

    public static int getHoloBlue() {
        return android.graphics.Color.rgb(51, 181, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
    }

    public static java.util.List<java.lang.Integer> createColors(android.content.res.Resources resources, int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(resources.getColor(i)));
        }
        return arrayList;
    }

    public static java.util.List<java.lang.Integer> createColors(int[] iArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList;
    }
}
