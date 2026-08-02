package androidx.compose.ui.text.platform;

@kotlin.Deprecated(message = "This is not supported after downloadable fonts.")
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 $2\u00020\u0001:\u0001$B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00130\u001b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020 8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "fontFamily", "Landroid/content/Context;", "context", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "necessaryStyles", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "<init>", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "fontMatcher$1", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "", "Landroidx/compose/ui/text/font/Font;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "Camera2StreamConfigurationMap", "Landroidx/compose/ui/text/font/FontFamily;", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements androidx.compose.ui.text.platform.AndroidTypeface {
    private final androidx.compose.ui.text.font.FontFamily fontFamily;

    /* renamed from: fontMatcher$1, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.FontMatcher fontMatcher;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<androidx.compose.ui.text.font.Font, android.graphics.Typeface> Camera2StreamConfigurationMap;
    private static final androidx.compose.ui.text.platform.AndroidFontListTypeface.Companion Companion = new androidx.compose.ui.text.platform.AndroidFontListTypeface.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.ui.text.font.FontMatcher getHighSpeedVideoFpsRanges = new androidx.compose.ui.text.font.FontMatcher();

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidFontListTypeface(androidx.compose.ui.text.font.FontListFontFamily fontListFontFamily, android.content.Context context, java.util.List<kotlin.Pair<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle>> list, androidx.compose.ui.text.font.FontMatcher fontMatcher) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int size;
        this.fontMatcher = fontMatcher;
        java.util.List<androidx.compose.ui.text.font.Font> fonts = fontListFontFamily.getFonts();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(fonts.size());
        int size2 = fonts.size();
        for (int i = 0; i < size2; i++) {
            androidx.compose.ui.text.font.Font font = fonts.get(i);
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m8139equalsimpl0(font.getLoadingStrategy(), androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m8144getBlockingPKNRLFQ())) {
                arrayList3.add(font);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        if (list != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList(list.size());
            int size3 = list.size();
            for (int i2 = 0; i2 < size3; i2++) {
                kotlin.Pair<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle> pair = list.get(i2);
                arrayList5.add((androidx.compose.ui.text.font.Font) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.fontMatcher.m8148matchFontRetOiIg(arrayList4, pair.component1(), pair.component2().m8155unboximpl())));
            }
            java.util.List fastFilterNotNull = androidx.compose.ui.util.ListUtilsKt.fastFilterNotNull(arrayList5);
            if (fastFilterNotNull != null) {
                androidx.collection.MutableScatterSet mutableScatterSet = new androidx.collection.MutableScatterSet(fastFilterNotNull.size());
                java.util.ArrayList arrayList6 = new java.util.ArrayList(fastFilterNotNull.size());
                int size4 = fastFilterNotNull.size();
                for (int i3 = 0; i3 < size4; i3++) {
                    java.lang.Object obj = fastFilterNotNull.get(i3);
                    if (mutableScatterSet.add((androidx.compose.ui.text.font.Font) obj)) {
                        arrayList6.add(obj);
                    }
                }
                arrayList = arrayList6;
                arrayList4 = arrayList != null ? arrayList : arrayList4;
                arrayList2 = arrayList4;
                if (arrayList2.isEmpty()) {
                    androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException("Could not match font");
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    androidx.compose.ui.text.font.Font font2 = (androidx.compose.ui.text.font.Font) arrayList4.get(i4);
                    try {
                        linkedHashMap.put(font2, androidx.compose.ui.text.platform.AndroidTypefaceCache.INSTANCE.getOrCreate(context, font2));
                    } catch (java.lang.Exception unused) {
                        androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateException("Cannot create Typeface from ".concat(java.lang.String.valueOf(font2)));
                    }
                }
                this.Camera2StreamConfigurationMap = linkedHashMap;
                this.fontFamily = fontListFontFamily;
            }
        }
        arrayList = null;
        if (arrayList != null) {
        }
        arrayList2 = arrayList4;
        if (arrayList2.isEmpty()) {
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        size = arrayList2.size();
        while (i4 < size) {
        }
        this.Camera2StreamConfigurationMap = linkedHashMap2;
        this.fontFamily = fontListFontFamily;
    }

    public /* synthetic */ AndroidFontListTypeface(androidx.compose.ui.text.font.FontListFontFamily fontListFontFamily, android.content.Context context, java.util.List list, androidx.compose.ui.text.font.FontMatcher fontMatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? getHighSpeedVideoFpsRanges : fontMatcher);
    }

    public final androidx.compose.ui.text.font.FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/FontMatcher;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/ui/text/font/FontMatcher;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public final androidx.compose.ui.text.font.FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public final android.graphics.Typeface mo8282getNativeTypefacePYhJU0U(androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle, int synthesis) {
        androidx.compose.ui.text.font.Font font = (androidx.compose.ui.text.font.Font) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.fontMatcher.m8148matchFontRetOiIg(new java.util.ArrayList(this.Camera2StreamConfigurationMap.keySet()), fontWeight, fontStyle));
        if (font != null) {
            android.graphics.Typeface typeface = this.Camera2StreamConfigurationMap.get(font);
            if (typeface != null) {
                java.lang.Object m8174synthesizeTypefaceFxwP2eA = androidx.compose.ui.text.font.FontSynthesis_androidKt.m8174synthesizeTypefaceFxwP2eA(synthesis, typeface, font, fontWeight, fontStyle);
                kotlin.jvm.internal.Intrinsics.checkNotNull(m8174synthesizeTypefaceFxwP2eA, "");
                return (android.graphics.Typeface) m8174synthesizeTypefaceFxwP2eA;
            }
            androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
            throw new kotlin.KotlinNothingValueException();
        }
        androidx.compose.ui.text.internal.InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
        throw new kotlin.KotlinNothingValueException();
    }
}
