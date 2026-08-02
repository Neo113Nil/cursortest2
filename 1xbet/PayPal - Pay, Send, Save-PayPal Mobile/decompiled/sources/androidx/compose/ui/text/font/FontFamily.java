package androidx.compose.ui.text.font;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \f2\u00020\u0001:\u0002\r\fB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001d\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u000e\u000f\u0010"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily;", "", "", "p0", "<init>", "(Z)V", "canLoadSynchronously", "Z", "getCanLoadSynchronously", "()Z", "getCanLoadSynchronously$annotations", "()V", "Companion", "Resolver", "Landroidx/compose/ui/text/font/FileBasedFontFamily;", "Landroidx/compose/ui/text/font/LoadedFontFamily;", "Landroidx/compose/ui/text/font/SystemFontFamily;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.font.FontFamily.Companion INSTANCE = new androidx.compose.ui.text.font.FontFamily.Companion(null);
    private static final androidx.compose.ui.text.font.SystemFontFamily Default = new androidx.compose.ui.text.font.DefaultFontFamily();
    private static final androidx.compose.ui.text.font.GenericFontFamily SansSerif = new androidx.compose.ui.text.font.GenericFontFamily(androidx.media3.common.C.SANS_SERIF_NAME, "FontFamily.SansSerif");
    private static final androidx.compose.ui.text.font.GenericFontFamily Serif = new androidx.compose.ui.text.font.GenericFontFamily("serif", "FontFamily.Serif");
    private static final androidx.compose.ui.text.font.GenericFontFamily Monospace = new androidx.compose.ui.text.font.GenericFontFamily(com.datadog.android.sessionreplay.recorder.mapper.TextViewMapper.MONOSPACE_FAMILY_NAME, "FontFamily.Monospace");
    private static final androidx.compose.ui.text.font.GenericFontFamily Cursive = new androidx.compose.ui.text.font.GenericFontFamily("cursive", "FontFamily.Cursive");

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J?\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0001\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Resolver;", "", "Landroidx/compose/ui/text/font/FontFamily;", "fontFamily", "", io.ktor.http.LinkHeader.Rel.PreLoad, "(Landroidx/compose/ui/text/font/FontFamily;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/FontWeight;", "fontWeight", "Landroidx/compose/ui/text/font/FontStyle;", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "fontSynthesis", "Landroidx/compose/runtime/State;", "resolve-DPcqOEQ", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;II)Landroidx/compose/runtime/State;", "resolve", "Landroidx/compose/ui/text/font/FontFamilyResolverImpl;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Resolver {
        java.lang.Object preload(androidx.compose.ui.text.font.FontFamily fontFamily, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        androidx.compose.runtime.State<java.lang.Object> mo8125resolveDPcqOEQ(androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int fontStyle, int fontSynthesis);

        /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ androidx.compose.runtime.State m8124resolveDPcqOEQ$default(androidx.compose.ui.text.font.FontFamily.Resolver resolver, androidx.compose.ui.text.font.FontFamily fontFamily, androidx.compose.ui.text.font.FontWeight fontWeight, int i, int i2, int i3, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
            }
            if ((i3 & 1) != 0) {
                fontFamily = null;
            }
            if ((i3 & 2) != 0) {
                fontWeight = androidx.compose.ui.text.font.FontWeight.INSTANCE.getNormal();
            }
            if ((i3 & 4) != 0) {
                i = androidx.compose.ui.text.font.FontStyle.INSTANCE.m8159getNormal_LCdwA();
            }
            if ((i3 & 8) != 0) {
                i2 = androidx.compose.ui.text.font.FontSynthesis.INSTANCE.m8169getAllGVVA2EU();
            }
            return resolver.mo8125resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r"}, d2 = {"Landroidx/compose/ui/text/font/FontFamily$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/font/SystemFontFamily;", "Default", "Landroidx/compose/ui/text/font/SystemFontFamily;", "getDefault", "()Landroidx/compose/ui/text/font/SystemFontFamily;", "Landroidx/compose/ui/text/font/GenericFontFamily;", "SansSerif", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getSansSerif", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Serif", "getSerif", "Monospace", "getMonospace", "Cursive", "getCursive"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.ui.text.font.SystemFontFamily getDefault() {
            return androidx.compose.ui.text.font.FontFamily.Default;
        }

        public final androidx.compose.ui.text.font.GenericFontFamily getSansSerif() {
            return androidx.compose.ui.text.font.FontFamily.SansSerif;
        }

        public final androidx.compose.ui.text.font.GenericFontFamily getSerif() {
            return androidx.compose.ui.text.font.FontFamily.Serif;
        }

        public final androidx.compose.ui.text.font.GenericFontFamily getMonospace() {
            return androidx.compose.ui.text.font.FontFamily.Monospace;
        }

        public final androidx.compose.ui.text.font.GenericFontFamily getCursive() {
            return androidx.compose.ui.text.font.FontFamily.Cursive;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Unused property that has no meaning. Do not use.")
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    public /* synthetic */ FontFamily(boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z);
    }
}
