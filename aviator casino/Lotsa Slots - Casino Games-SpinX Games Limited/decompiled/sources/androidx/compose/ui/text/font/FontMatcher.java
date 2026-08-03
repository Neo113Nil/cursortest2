package androidx.compose.ui.text.font;

/* compiled from: FontMatcher.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000fJ4\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\tH\u0080\b¢\u0006\u0002\b\u0017\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FontMatcher {
    public static final int $stable = 0;

    public static /* synthetic */ java.util.List filterByClosestWeight$ui_text_release$default(androidx.compose.ui.text.font.FontMatcher fontMatcher, java.util.List list, androidx.compose.ui.text.font.FontWeight fontWeight, boolean z, androidx.compose.ui.text.font.FontWeight fontWeight2, androidx.compose.ui.text.font.FontWeight fontWeight3, int i, java.lang.Object obj) {
        androidx.compose.ui.text.font.FontWeight fontWeight4 = null;
        if ((i & 4) != 0) {
            fontWeight2 = null;
        }
        if ((i & 8) != 0) {
            fontWeight3 = null;
        }
        int size = list.size();
        androidx.compose.ui.text.font.FontWeight fontWeight5 = null;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            androidx.compose.ui.text.font.FontWeight weight = ((androidx.compose.ui.text.font.Font) list.get(i2)).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                }
            }
            i2++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            java.lang.Object obj2 = list.get(i3);
            if (kotlin.jvm.internal.Intrinsics.areEqual(((androidx.compose.ui.text.font.Font) obj2).getWeight(), fontWeight4)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final java.util.List<androidx.compose.ui.text.font.Font> filterByClosestWeight$ui_text_release(java.util.List<? extends androidx.compose.ui.text.font.Font> list, androidx.compose.ui.text.font.FontWeight fontWeight, boolean z, androidx.compose.ui.text.font.FontWeight fontWeight2, androidx.compose.ui.text.font.FontWeight fontWeight3) {
        int size = list.size();
        androidx.compose.ui.text.font.FontWeight fontWeight4 = null;
        androidx.compose.ui.text.font.FontWeight fontWeight5 = null;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            androidx.compose.ui.text.font.FontWeight weight = list.get(i).getWeight();
            if ((fontWeight2 == null || weight.compareTo(fontWeight2) >= 0) && (fontWeight3 == null || weight.compareTo(fontWeight3) <= 0)) {
                if (weight.compareTo(fontWeight) < 0) {
                    if (fontWeight4 == null || weight.compareTo(fontWeight4) > 0) {
                        fontWeight4 = weight;
                    }
                } else {
                    if (weight.compareTo(fontWeight) <= 0) {
                        fontWeight4 = weight;
                        fontWeight5 = fontWeight4;
                        break;
                    }
                    if (fontWeight5 == null || weight.compareTo(fontWeight5) < 0) {
                        fontWeight5 = weight;
                    }
                }
            }
            i++;
        }
        if (!z ? fontWeight5 != null : fontWeight4 == null) {
            fontWeight4 = fontWeight5;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            androidx.compose.ui.text.font.Font font = list.get(i2);
            if (kotlin.jvm.internal.Intrinsics.areEqual(font.getWeight(), fontWeight4)) {
                arrayList.add(font);
            }
        }
        return arrayList;
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.text.font.Font> m4070matchFontRetOiIg(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        if (!(fontFamily instanceof androidx.compose.ui.text.font.FontListFontFamily)) {
            throw new java.lang.IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
        }
        return m4071matchFontRetOiIg((androidx.compose.ui.text.font.FontListFontFamily) fontFamily, fontWeight, fontStyle);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.text.font.Font> m4071matchFontRetOiIg(androidx.compose.ui.text.font.FontListFontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        return m4072matchFontRetOiIg(fontFamily.getFonts(), fontWeight, fontStyle);
    }

    /* renamed from: matchFont-RetOiIg, reason: not valid java name */
    public final java.util.List<androidx.compose.ui.text.font.Font> m4072matchFontRetOiIg(java.util.List<? extends androidx.compose.ui.text.font.Font> fontList, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle) {
        java.util.ArrayList arrayList = new java.util.ArrayList(fontList.size());
        int size = fontList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.compose.ui.text.font.Font font = fontList.get(i2);
            androidx.compose.ui.text.font.Font font2 = font;
            if (kotlin.jvm.internal.Intrinsics.areEqual(font2.getWeight(), fontWeight) && androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(font2.getStyle(), fontStyle)) {
                arrayList.add(font);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(fontList.size());
        int size2 = fontList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            androidx.compose.ui.text.font.Font font3 = fontList.get(i3);
            if (androidx.compose.ui.text.font.FontStyle.m4076equalsimpl0(font3.getStyle(), fontStyle)) {
                arrayList3.add(font3);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (!arrayList4.isEmpty()) {
            fontList = arrayList4;
        }
        java.util.List<? extends androidx.compose.ui.text.font.Font> list = fontList;
        androidx.compose.ui.text.font.FontWeight fontWeight2 = null;
        if (fontWeight.compareTo(androidx.compose.ui.text.font.FontWeight.INSTANCE.getW400()) >= 0) {
            if (fontWeight.compareTo(androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500()) <= 0) {
                androidx.compose.ui.text.font.FontWeight w500 = androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500();
                int size3 = list.size();
                androidx.compose.ui.text.font.FontWeight fontWeight3 = null;
                androidx.compose.ui.text.font.FontWeight fontWeight4 = null;
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        break;
                    }
                    androidx.compose.ui.text.font.FontWeight weight = list.get(i4).getWeight();
                    if (w500 == null || weight.compareTo(w500) <= 0) {
                        if (weight.compareTo(fontWeight) < 0) {
                            if (fontWeight3 == null || weight.compareTo(fontWeight3) > 0) {
                                fontWeight3 = weight;
                            }
                        } else {
                            if (weight.compareTo(fontWeight) <= 0) {
                                fontWeight3 = weight;
                                fontWeight4 = fontWeight3;
                                break;
                            }
                            if (fontWeight4 == null || weight.compareTo(fontWeight4) < 0) {
                                fontWeight4 = weight;
                            }
                        }
                    }
                    i4++;
                }
                if (fontWeight4 != null) {
                    fontWeight3 = fontWeight4;
                }
                java.util.ArrayList arrayList5 = new java.util.ArrayList(list.size());
                int size4 = list.size();
                for (int i5 = 0; i5 < size4; i5++) {
                    androidx.compose.ui.text.font.Font font4 = list.get(i5);
                    if (kotlin.jvm.internal.Intrinsics.areEqual(font4.getWeight(), fontWeight3)) {
                        arrayList5.add(font4);
                    }
                }
                java.util.ArrayList arrayList6 = arrayList5;
                if (arrayList6.isEmpty()) {
                    androidx.compose.ui.text.font.FontWeight w5002 = androidx.compose.ui.text.font.FontWeight.INSTANCE.getW500();
                    int size5 = list.size();
                    androidx.compose.ui.text.font.FontWeight fontWeight5 = null;
                    int i6 = 0;
                    while (true) {
                        if (i6 >= size5) {
                            break;
                        }
                        androidx.compose.ui.text.font.FontWeight weight2 = list.get(i6).getWeight();
                        if (w5002 == null || weight2.compareTo(w5002) >= 0) {
                            if (weight2.compareTo(fontWeight) < 0) {
                                if (fontWeight2 == null || weight2.compareTo(fontWeight2) > 0) {
                                    fontWeight2 = weight2;
                                }
                            } else {
                                if (weight2.compareTo(fontWeight) <= 0) {
                                    fontWeight2 = weight2;
                                    fontWeight5 = fontWeight2;
                                    break;
                                }
                                if (fontWeight5 == null || weight2.compareTo(fontWeight5) < 0) {
                                    fontWeight5 = weight2;
                                }
                            }
                        }
                        i6++;
                    }
                    if (fontWeight5 != null) {
                        fontWeight2 = fontWeight5;
                    }
                    java.util.ArrayList arrayList7 = new java.util.ArrayList(list.size());
                    int size6 = list.size();
                    while (i < size6) {
                        androidx.compose.ui.text.font.Font font5 = list.get(i);
                        if (kotlin.jvm.internal.Intrinsics.areEqual(font5.getWeight(), fontWeight2)) {
                            arrayList7.add(font5);
                        }
                        i++;
                    }
                    arrayList6 = arrayList7;
                }
                return arrayList6;
            }
            int size7 = list.size();
            androidx.compose.ui.text.font.FontWeight fontWeight6 = null;
            int i7 = 0;
            while (true) {
                if (i7 >= size7) {
                    break;
                }
                androidx.compose.ui.text.font.FontWeight weight3 = list.get(i7).getWeight();
                if (weight3.compareTo(fontWeight) < 0) {
                    if (fontWeight2 == null || weight3.compareTo(fontWeight2) > 0) {
                        fontWeight2 = weight3;
                    }
                } else {
                    if (weight3.compareTo(fontWeight) <= 0) {
                        fontWeight2 = weight3;
                        fontWeight6 = fontWeight2;
                        break;
                    }
                    if (fontWeight6 == null || weight3.compareTo(fontWeight6) < 0) {
                        fontWeight6 = weight3;
                    }
                }
                i7++;
            }
            if (fontWeight6 != null) {
                fontWeight2 = fontWeight6;
            }
            java.util.ArrayList arrayList8 = new java.util.ArrayList(list.size());
            int size8 = list.size();
            while (i < size8) {
                androidx.compose.ui.text.font.Font font6 = list.get(i);
                if (kotlin.jvm.internal.Intrinsics.areEqual(font6.getWeight(), fontWeight2)) {
                    arrayList8.add(font6);
                }
                i++;
            }
            return arrayList8;
        }
        int size9 = list.size();
        androidx.compose.ui.text.font.FontWeight fontWeight7 = null;
        int i8 = 0;
        while (true) {
            if (i8 >= size9) {
                break;
            }
            androidx.compose.ui.text.font.FontWeight weight4 = list.get(i8).getWeight();
            if (weight4.compareTo(fontWeight) < 0) {
                if (fontWeight2 == null || weight4.compareTo(fontWeight2) > 0) {
                    fontWeight2 = weight4;
                }
            } else {
                if (weight4.compareTo(fontWeight) <= 0) {
                    fontWeight2 = weight4;
                    fontWeight7 = fontWeight2;
                    break;
                }
                if (fontWeight7 == null || weight4.compareTo(fontWeight7) < 0) {
                    fontWeight7 = weight4;
                }
            }
            i8++;
        }
        if (fontWeight2 == null) {
            fontWeight2 = fontWeight7;
        }
        java.util.ArrayList arrayList9 = new java.util.ArrayList(list.size());
        int size10 = list.size();
        while (i < size10) {
            androidx.compose.ui.text.font.Font font7 = list.get(i);
            if (kotlin.jvm.internal.Intrinsics.areEqual(font7.getWeight(), fontWeight2)) {
                arrayList9.add(font7);
            }
            i++;
        }
        return arrayList9;
    }
}
