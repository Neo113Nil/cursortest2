package androidx.compose.ui.text.platform;

/* compiled from: AndroidFontListTypeface.android.kt */
@kotlin.Deprecated(message = "This is not supported after downloadable fonts.")
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ*\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u000eX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000b\u001a\u00020\f¢\u0006\n\n\u0002\b\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "fontFamily", "Landroidx/compose/ui/text/font/FontListFontFamily;", "context", "Landroid/content/Context;", "necessaryStyles", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher$1", "loadedTypefaces", "", "Landroidx/compose/ui/text/font/Font;", "Landroid/graphics/Typeface;", "getNativeTypeface", "fontWeight", "fontStyle", "synthesis", "Landroidx/compose/ui/text/font/FontSynthesis;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidFontListTypeface implements androidx.compose.ui.text.platform.AndroidTypeface {
    private final androidx.compose.ui.text.font.FontFamily fontFamily;

    /* renamed from: fontMatcher$1, reason: from kotlin metadata */
    private final androidx.compose.ui.text.font.FontMatcher fontMatcher;
    private final java.util.Map<androidx.compose.ui.text.font.Font, android.graphics.Typeface> loadedTypefaces;
    private static final androidx.compose.ui.text.platform.AndroidFontListTypeface.Companion Companion = new androidx.compose.ui.text.platform.AndroidFontListTypeface.Companion(null);
    public static final int $stable = 8;
    private static final androidx.compose.ui.text.font.FontMatcher fontMatcher = new androidx.compose.ui.text.font.FontMatcher();

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidFontListTypeface(androidx.compose.ui.text.font.FontListFontFamily fontListFontFamily, android.content.Context context, java.util.List<kotlin.Pair<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle>> list, androidx.compose.ui.text.font.FontMatcher fontMatcher2) {
        java.util.ArrayList arrayList;
        this.fontMatcher = fontMatcher2;
        java.util.List<androidx.compose.ui.text.font.Font> fonts = fontListFontFamily.getFonts();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(fonts.size());
        int size = fonts.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.font.Font font = fonts.get(i);
            if (androidx.compose.ui.text.font.FontLoadingStrategy.m4063equalsimpl0(font.getLoadingStrategy(), androidx.compose.ui.text.font.FontLoadingStrategy.INSTANCE.m4068getBlockingPKNRLFQ())) {
                arrayList2.add(font);
            }
        }
        java.util.ArrayList arrayList3 = arrayList2;
        if (list != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                kotlin.Pair<androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontStyle> pair = list.get(i2);
                arrayList4.add((androidx.compose.ui.text.font.Font) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.fontMatcher.m4072matchFontRetOiIg(arrayList3, pair.component1(), pair.component2().m4079unboximpl())));
            }
            java.util.List fastFilterNotNull = androidx.compose.ui.util.ListUtilsKt.fastFilterNotNull(arrayList4);
            if (fastFilterNotNull != null) {
                java.util.HashSet hashSet = new java.util.HashSet(fastFilterNotNull.size());
                java.util.ArrayList arrayList5 = new java.util.ArrayList(fastFilterNotNull.size());
                int size3 = fastFilterNotNull.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    java.lang.Object obj = fastFilterNotNull.get(i3);
                    if (hashSet.add((androidx.compose.ui.text.font.Font) obj)) {
                        arrayList5.add(obj);
                    }
                }
                arrayList = arrayList5;
                arrayList3 = arrayList != null ? arrayList : arrayList3;
                if (!arrayList3.isEmpty()) {
                    throw new java.lang.IllegalStateException("Could not match font".toString());
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                int size4 = arrayList3.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    androidx.compose.ui.text.font.Font font2 = (androidx.compose.ui.text.font.Font) arrayList3.get(i4);
                    try {
                        linkedHashMap.put(font2, androidx.compose.ui.text.platform.AndroidTypefaceCache.INSTANCE.getOrCreate(context, font2));
                    } catch (java.lang.Exception unused) {
                        throw new java.lang.IllegalStateException("Cannot create Typeface from " + font2);
                    }
                }
                this.loadedTypefaces = linkedHashMap;
                this.fontFamily = fontListFontFamily;
                return;
            }
        }
        arrayList = null;
        if (arrayList != null) {
        }
        if (!arrayList3.isEmpty()) {
        }
    }

    public /* synthetic */ AndroidFontListTypeface(androidx.compose.ui.text.font.FontListFontFamily fontListFontFamily, android.content.Context context, java.util.List list, androidx.compose.ui.text.font.FontMatcher fontMatcher2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(fontListFontFamily, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? fontMatcher : fontMatcher2);
    }

    public final androidx.compose.ui.text.font.FontMatcher getFontMatcher() {
        return this.fontMatcher;
    }

    /* compiled from: AndroidFontListTypeface.android.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface$Companion;", "", "()V", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final androidx.compose.ui.text.font.FontMatcher getFontMatcher() {
            return androidx.compose.ui.text.platform.AndroidFontListTypeface.fontMatcher;
        }
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public androidx.compose.ui.text.font.FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public android.graphics.Typeface mo4210getNativeTypefacePYhJU0U(androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle, int synthesis) {
        androidx.compose.ui.text.font.Font font = (androidx.compose.ui.text.font.Font) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) this.fontMatcher.m4072matchFontRetOiIg(new java.util.ArrayList(this.loadedTypefaces.keySet()), fontWeight, fontStyle));
        if (font == null) {
            throw new java.lang.IllegalStateException("Could not load font".toString());
        }
        android.graphics.Typeface typeface = this.loadedTypefaces.get(font);
        if (typeface == null) {
            throw new java.lang.IllegalStateException("Could not load typeface".toString());
        }
        java.lang.Object m4097synthesizeTypefaceFxwP2eA = androidx.compose.ui.text.font.FontSynthesis_androidKt.m4097synthesizeTypefaceFxwP2eA(synthesis, typeface, font, fontWeight, fontStyle);
        kotlin.jvm.internal.Intrinsics.checkNotNull(m4097synthesizeTypefaceFxwP2eA, "null cannot be cast to non-null type android.graphics.Typeface");
        return (android.graphics.Typeface) m4097synthesizeTypefaceFxwP2eA;
    }
}
