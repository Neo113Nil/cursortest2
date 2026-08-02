package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJH\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0080\b¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0016J+\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "<init>", "()V", "", "Landroidx/compose/ui/text/font/Font;", "fontList", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "matchFont-RetOiIg", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "matchFont", "", "preferBelow", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;ZLandroidx/compose/ui/text/font/FontWeight;Landroidx/compose/ui/text/font/FontWeight;)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ java.util.List filterByClosestWeight$ui_text$default(androidx.compose.ui.text.font.FontMatcher fontMatcher, java.util.List list, androidx.compose.ui.text.font.FontWeight fontWeight, boolean z, androidx.compose.ui.text.font.FontWeight fontWeight2, androidx.compose.ui.text.font.FontWeight fontWeight3, int i, java.lang.Object obj) {
        androidx.compose.ui.text.font.FontWeight fontWeight4 = null;
        if ((i & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i & 8) != 0) {
            fontWeight3 = null;
        }
        java.util.List list2 = list;
        int size = list2.size();
        androidx.compose.ui.text.font.FontWeight fontWeight5 = null;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges = ((androidx.compose.ui.text.font.Font) list.get(i2)).getGetHighSpeedVideoFpsRanges();
            if ((fontWeight2 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight3) <= 0)) {
                if (getHighSpeedVideoFpsRanges.compareTo(fontWeight) < 0) {
                    if (fontWeight5 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight5) > 0) {
                        fontWeight5 = getHighSpeedVideoFpsRanges;
                    }
                } else {
                    if (getHighSpeedVideoFpsRanges.compareTo(fontWeight) <= 0) {
                        fontWeight4 = getHighSpeedVideoFpsRanges;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight4 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight4) < 0) {
                        fontWeight4 = getHighSpeedVideoFpsRanges;
                    }
                }
            }
            i2++;
        }
        if (!z ? fontWeight4 == null : fontWeight5 != null) {
            fontWeight4 = fontWeight5;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            java.lang.Object obj2 = list.get(i3);
            if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.text.font.Font) obj2).getGetHighSpeedVideoFpsRanges(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final java.util.List<androidx.compose.ui.text.font.Font> filterByClosestWeight$ui_text(java.util.List<? extends androidx.compose.ui.text.font.Font> list, androidx.compose.ui.text.font.FontWeight fontWeight, boolean z, androidx.compose.ui.text.font.FontWeight fontWeight2, androidx.compose.ui.text.font.FontWeight fontWeight3) {
        java.util.List<? extends androidx.compose.ui.text.font.Font> list2 = list;
        int size = list2.size();
        androidx.compose.ui.text.font.FontWeight fontWeight4 = null;
        androidx.compose.ui.text.font.FontWeight fontWeight5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges = list.get(i).getGetHighSpeedVideoFpsRanges();
            if ((fontWeight2 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight3) <= 0)) {
                if (getHighSpeedVideoFpsRanges.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight4) > 0) {
                        fontWeight4 = getHighSpeedVideoFpsRanges;
                    }
                } else {
                    if (getHighSpeedVideoFpsRanges.compareTo(fontWeight) <= 0) {
                        fontWeight4 = getHighSpeedVideoFpsRanges;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight5) < 0) {
                        fontWeight5 = getHighSpeedVideoFpsRanges;
                    }
                }
            }
            i++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.font.Font font = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(font.getGetHighSpeedVideoFpsRanges(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.text.font.Font> m8146matchFontRetOiIg(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        if (!(fontFamily instanceof androidx.compose.ui.text.font.FontListFontFamily)) {
            throw new java.lang.IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
        }
        return m8147matchFontRetOiIg((androidx.compose.ui.text.font.FontListFontFamily) fontFamily, fontWeight, fontStyle);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.text.font.Font> m8147matchFontRetOiIg(androidx.compose.ui.text.font.FontListFontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        return m8148matchFontRetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.text.font.Font> m8148matchFontRetOiIg(java.util.List<? extends androidx.compose.ui.text.font.Font> fontList, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        java.util.ArrayList arrayList = new java.util.ArrayList(fontList.size());
        java.util.List<? extends androidx.compose.ui.text.font.Font> list = fontList;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.text.font.Font font = fontList.get(i2);
            androidx.compose.ui.text.font.Font font2 = font;
            if (kotlin.jvm.internal.Intrinsics.areEqual(font2.getGetHighSpeedVideoFpsRanges(), fontWeight) && androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(font2.getGetHighResolutionOutputSizeshNQ4ISI(), fontStyle)) {
                arrayList.add(font);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(fontList.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.text.font.Font font3 = fontList.get(i3);
            if (androidx.compose.ui.text.font.FontStyle.m8152equalsimpl0(font3.getGetHighResolutionOutputSizeshNQ4ISI(), fontStyle)) {
                arrayList3.add(font3);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            fontList = arrayList4;
        }
        java.util.List<? extends androidx.compose.ui.text.font.Font> list2 = fontList;
        androidx.compose.ui.text.font.FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(androidx.compose.ui.text.font.FontWeight.INSTANCE.getW400()) >= 0) {
            if (fontWeight.compareTo(androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500()) <= 0) {
                androidx.compose.ui.text.font.FontWeight w500 = androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500();
                java.util.List<? extends androidx.compose.ui.text.font.Font> list3 = list2;
                int size3 = list3.size();
                androidx.compose.ui.text.font.FontWeight fontWeight3 = null;
                androidx.compose.ui.text.font.FontWeight fontWeight4 = null;
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges = list2.get(i4).getGetHighSpeedVideoFpsRanges();
                    if (w500 == null || getHighSpeedVideoFpsRanges.compareTo(w500) <= 0) {
                        if (getHighSpeedVideoFpsRanges.compareTo(fontWeight) < 0) {
                            if (fontWeight3 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight3) > 0) {
                                fontWeight3 = getHighSpeedVideoFpsRanges;
                            }
                        } else {
                            if (getHighSpeedVideoFpsRanges.compareTo(fontWeight) <= 0) {
                                fontWeight3 = getHighSpeedVideoFpsRanges;
                                fontWeight4 = fontWeight3;
                                break;
                            }
                            if (fontWeight4 == null || getHighSpeedVideoFpsRanges.compareTo(fontWeight4) < 0) {
                                fontWeight4 = getHighSpeedVideoFpsRanges;
                            }
                        }
                    }
                    i4++;
                }
                if (fontWeight4 != null) {
                    fontWeight3 = fontWeight4;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList(list2.size());
                int size4 = list3.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    androidx.compose.ui.text.font.Font font4 = list2.get(i5);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(font4.getGetHighSpeedVideoFpsRanges(), fontWeight3)) {
                        arrayList5.add(font4);
                    }
                }
                java.util.ArrayList arrayList6 = arrayList5;
                if (arrayList6.isEmpty()) {
                    androidx.compose.ui.text.font.FontWeight w5002 = androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500();
                    int size5 = list3.size();
                    androidx.compose.ui.text.font.FontWeight fontWeight5 = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            break;
                        }
                        androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges2 = list2.get(i6).getGetHighSpeedVideoFpsRanges();
                        if (w5002 == null || getHighSpeedVideoFpsRanges2.compareTo(w5002) >= 0) {
                            if (getHighSpeedVideoFpsRanges2.compareTo(fontWeight) < 0) {
                                if (fontWeight2 == null || getHighSpeedVideoFpsRanges2.compareTo(fontWeight2) > 0) {
                                    fontWeight2 = getHighSpeedVideoFpsRanges2;
                                }
                            } else {
                                if (getHighSpeedVideoFpsRanges2.compareTo(fontWeight) <= 0) {
                                    fontWeight2 = getHighSpeedVideoFpsRanges2;
                                    fontWeight5 = fontWeight2;
                                    break;
                                }
                                if (fontWeight5 == null || getHighSpeedVideoFpsRanges2.compareTo(fontWeight5) < 0) {
                                    fontWeight5 = getHighSpeedVideoFpsRanges2;
                                }
                            }
                        }
                        i6++;
                    }
                    if (fontWeight5 != null) {
                        fontWeight2 = fontWeight5;
                    }
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(list2.size());
                    int size6 = list3.size();
                    while (i < size6) {
                        androidx.compose.ui.text.font.Font font5 = list2.get(i);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(font5.getGetHighSpeedVideoFpsRanges(), fontWeight2)) {
                            arrayList7.add(font5);
                        }
                        i++;
                    }
                    arrayList6 = arrayList7;
                }
                return arrayList6;
            }
            java.util.List<? extends androidx.compose.ui.text.font.Font> list4 = list2;
            int size7 = list4.size();
            androidx.compose.ui.text.font.FontWeight fontWeight6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges3 = list2.get(i7).getGetHighSpeedVideoFpsRanges();
                if (getHighSpeedVideoFpsRanges3.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || getHighSpeedVideoFpsRanges3.compareTo(fontWeight2) > 0) {
                        fontWeight2 = getHighSpeedVideoFpsRanges3;
                    }
                } else {
                    if (getHighSpeedVideoFpsRanges3.compareTo(fontWeight) <= 0) {
                        fontWeight2 = getHighSpeedVideoFpsRanges3;
                        fontWeight6 = fontWeight2;
                        break;
                    }
                    if (fontWeight6 == null || getHighSpeedVideoFpsRanges3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = getHighSpeedVideoFpsRanges3;
                    }
                }
                i7++;
            }
            if (fontWeight6 != null) {
                fontWeight2 = fontWeight6;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList(list2.size());
            int size8 = list4.size();
            while (i < size8) {
                androidx.compose.ui.text.font.Font font6 = list2.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(font6.getGetHighSpeedVideoFpsRanges(), fontWeight2)) {
                    arrayList8.add(font6);
                }
                i++;
            }
            return arrayList8;
        }
        java.util.List<? extends androidx.compose.ui.text.font.Font> list5 = list2;
        int size9 = list5.size();
        androidx.compose.ui.text.font.FontWeight fontWeight7 = null;
        int i8 = 0;
        while (true) {
            if (i8 >= size9) {
                break;
            }
            androidx.compose.ui.text.font.FontWeight getHighSpeedVideoFpsRanges4 = list2.get(i8).getGetHighSpeedVideoFpsRanges();
            if (getHighSpeedVideoFpsRanges4.compareTo(fontWeight) < 0) {
                if (fontWeight2 == null || getHighSpeedVideoFpsRanges4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = getHighSpeedVideoFpsRanges4;
                }
            } else {
                if (getHighSpeedVideoFpsRanges4.compareTo(fontWeight) <= 0) {
                    fontWeight2 = getHighSpeedVideoFpsRanges4;
                    fontWeight7 = fontWeight2;
                    break;
                }
                if (fontWeight7 == null || getHighSpeedVideoFpsRanges4.compareTo(fontWeight7) < 0) {
                    fontWeight7 = getHighSpeedVideoFpsRanges4;
                }
            }
            i8++;
        }
        if (fontWeight2 == null) {
            fontWeight2 = fontWeight7;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList(list2.size());
        int size10 = list5.size();
        while (i < size10) {
            androidx.compose.ui.text.font.Font font7 = list2.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(font7.getGetHighSpeedVideoFpsRanges(), fontWeight2)) {
                arrayList9.add(font7);
            }
            i++;
        }
        return arrayList9;
    }
}
