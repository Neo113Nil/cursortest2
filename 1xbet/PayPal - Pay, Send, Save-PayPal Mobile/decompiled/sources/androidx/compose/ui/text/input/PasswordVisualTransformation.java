package androidx.compose.ui.text.input;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/compose/ui/text/input/PasswordVisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation;", "", com.daon.sdk.face.license.License.FEATURE_MASK, "<init>", "(C)V", "Landroidx/compose/ui/text/AnnotatedString;", "text", "Landroidx/compose/ui/text/input/TransformedText;", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "(Landroidx/compose/ui/text/AnnotatedString;)Landroidx/compose/ui/text/input/TransformedText;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA, "getMask", "()C"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PasswordVisualTransformation implements androidx.compose.ui.text.input.VisualTransformation {
    public static final int $stable = 0;
    private final char mask;

    public PasswordVisualTransformation(char c) {
        this.mask = c;
    }

    public /* synthetic */ PasswordVisualTransformation(char c, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? (char) 8226 : c);
    }

    public final char getMask() {
        return this.mask;
    }

    @Override // androidx.compose.ui.text.input.VisualTransformation
    public final androidx.compose.ui.text.input.TransformedText filter(androidx.compose.ui.text.AnnotatedString text) {
        return new androidx.compose.ui.text.input.TransformedText(new androidx.compose.ui.text.AnnotatedString(kotlin.text.StringsKt.repeat(java.lang.String.valueOf(this.mask), text.getText().length()), null, 2, null), androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof androidx.compose.ui.text.input.PasswordVisualTransformation) && this.mask == ((androidx.compose.ui.text.input.PasswordVisualTransformation) other).mask;
    }

    public final int hashCode() {
        return java.lang.Character.hashCode(this.mask);
    }

    public PasswordVisualTransformation() {
        this((char) 0, 1, null);
    }
}
