package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0014\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType;", "", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class KeyboardType {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.input.KeyboardType.Companion INSTANCE = new androidx.compose.ui.text.input.KeyboardType.Companion(null);
    private static final int Unspecified = getHighResolutionOutputSizeshNQ4ISI(0);
    private static final int Text = getHighResolutionOutputSizeshNQ4ISI(1);
    private static final int Ascii = getHighResolutionOutputSizeshNQ4ISI(2);
    private static final int Number = getHighResolutionOutputSizeshNQ4ISI(3);
    private static final int Phone = getHighResolutionOutputSizeshNQ4ISI(4);
    private static final int Uri = getHighResolutionOutputSizeshNQ4ISI(5);
    private static final int Email = getHighResolutionOutputSizeshNQ4ISI(6);
    private static final int Password = getHighResolutionOutputSizeshNQ4ISI(7);
    private static final int NumberPassword = getHighResolutionOutputSizeshNQ4ISI(8);
    private static final int Decimal = getHighResolutionOutputSizeshNQ4ISI(9);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8251equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i;
    }

    private /* synthetic */ KeyboardType(int i) {
        this.getHighSpeedVideoSizes = i;
    }

    public final java.lang.String toString() {
        return m8253toStringimpl(this.getHighSpeedVideoSizes);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8253toStringimpl(int i) {
        return m8251equalsimpl0(i, Unspecified) ? "Unspecified" : m8251equalsimpl0(i, Text) ? "Text" : m8251equalsimpl0(i, Ascii) ? "Ascii" : m8251equalsimpl0(i, Number) ? "Number" : m8251equalsimpl0(i, Phone) ? "Phone" : m8251equalsimpl0(i, Uri) ? "Uri" : m8251equalsimpl0(i, Email) ? "Email" : m8251equalsimpl0(i, Password) ? "Password" : m8251equalsimpl0(i, NumberPassword) ? "NumberPassword" : m8251equalsimpl0(i, Decimal) ? "Decimal" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b \b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\bR\u001d\u0010\u0010\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u0011\u0010\bR\u001d\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0013\u0010\u0006\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0014\u0010\bR\u001d\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0016\u0010\u0006\u0012\u0004\b\u0018\u0010\u0003\u001a\u0004\b\u0017\u0010\bR\u001d\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0019\u0010\u0006\u0012\u0004\b\u001b\u0010\u0003\u001a\u0004\b\u001a\u0010\bR\u001d\u0010\u001c\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u001d\u0010\bR\u001d\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u001f\u0010\u0006\u0012\u0004\b!\u0010\u0003\u001a\u0004\b \u0010\bR\u001d\u0010\"\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010\b"}, d2 = {"Landroidx/compose/ui/text/input/KeyboardType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/input/KeyboardType;", "Unspecified", com.visa.cbp.getEncExpo.warmup, "getUnspecified-PjHm6EE", "()I", "getUnspecified-PjHm6EE$annotations", "Text", "getText-PjHm6EE", "getText-PjHm6EE$annotations", "Ascii", "getAscii-PjHm6EE", "getAscii-PjHm6EE$annotations", "Number", "getNumber-PjHm6EE", "getNumber-PjHm6EE$annotations", "Phone", "getPhone-PjHm6EE", "getPhone-PjHm6EE$annotations", "Uri", "getUri-PjHm6EE", "getUri-PjHm6EE$annotations", "Email", "getEmail-PjHm6EE", "getEmail-PjHm6EE$annotations", "Password", "getPassword-PjHm6EE", "getPassword-PjHm6EE$annotations", "NumberPassword", "getNumberPassword-PjHm6EE", "getNumberPassword-PjHm6EE$annotations", "Decimal", "getDecimal-PjHm6EE", "getDecimal-PjHm6EE$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getAscii-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8255getAsciiPjHm6EE$annotations() {
        }

        /* renamed from: getDecimal-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8256getDecimalPjHm6EE$annotations() {
        }

        /* renamed from: getEmail-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8257getEmailPjHm6EE$annotations() {
        }

        /* renamed from: getNumber-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8258getNumberPjHm6EE$annotations() {
        }

        /* renamed from: getNumberPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8259getNumberPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getPassword-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8260getPasswordPjHm6EE$annotations() {
        }

        /* renamed from: getPhone-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8261getPhonePjHm6EE$annotations() {
        }

        /* renamed from: getText-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8262getTextPjHm6EE$annotations() {
        }

        /* renamed from: getUnspecified-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8263getUnspecifiedPjHm6EE$annotations() {
        }

        /* renamed from: getUri-PjHm6EE$annotations, reason: not valid java name */
        public static /* synthetic */ void m8264getUriPjHm6EE$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-PjHm6EE, reason: not valid java name */
        public final int m8273getUnspecifiedPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Unspecified;
        }

        /* renamed from: getText-PjHm6EE, reason: not valid java name */
        public final int m8272getTextPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Text;
        }

        /* renamed from: getAscii-PjHm6EE, reason: not valid java name */
        public final int m8265getAsciiPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Ascii;
        }

        /* renamed from: getNumber-PjHm6EE, reason: not valid java name */
        public final int m8268getNumberPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Number;
        }

        /* renamed from: getPhone-PjHm6EE, reason: not valid java name */
        public final int m8271getPhonePjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Phone;
        }

        /* renamed from: getUri-PjHm6EE, reason: not valid java name */
        public final int m8274getUriPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Uri;
        }

        /* renamed from: getEmail-PjHm6EE, reason: not valid java name */
        public final int m8267getEmailPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Email;
        }

        /* renamed from: getPassword-PjHm6EE, reason: not valid java name */
        public final int m8270getPasswordPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Password;
        }

        /* renamed from: getNumberPassword-PjHm6EE, reason: not valid java name */
        public final int m8269getNumberPasswordPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.NumberPassword;
        }

        /* renamed from: getDecimal-PjHm6EE, reason: not valid java name */
        public final int m8266getDecimalPjHm6EE() {
            return androidx.compose.ui.text.input.KeyboardType.Decimal;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final int hashCode() {
        return m8252hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m8250equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8252hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8250equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.input.KeyboardType) && i == ((androidx.compose.ui.text.input.KeyboardType) obj).getGetHighSpeedVideoSizes();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.input.KeyboardType m8249boximpl(int i) {
        return new androidx.compose.ui.text.input.KeyboardType(i);
    }
}
