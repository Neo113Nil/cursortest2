package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/ui/text/CacheTextLayoutInput;", "", "Landroidx/compose/ui/text/TextLayoutInput;", "textLayoutInput", "<init>", "(Landroidx/compose/ui/text/TextLayoutInput;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/TextLayoutInput;", "getTextLayoutInput", "()Landroidx/compose/ui/text/TextLayoutInput;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CacheTextLayoutInput {
    public static final int $stable = 0;
    private final androidx.compose.ui.text.TextLayoutInput textLayoutInput;

    public CacheTextLayoutInput(androidx.compose.ui.text.TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public final androidx.compose.ui.text.TextLayoutInput getTextLayoutInput() {
        return this.textLayoutInput;
    }

    public final int hashCode() {
        androidx.compose.ui.text.TextLayoutInput textLayoutInput = this.textLayoutInput;
        int hashCode = textLayoutInput.getText().hashCode();
        int hashCodeLayoutAffectingAttributes$ui_text = textLayoutInput.getStyle().hashCodeLayoutAffectingAttributes$ui_text();
        int hashCode2 = textLayoutInput.getPlaceholders().hashCode();
        int maxLines = textLayoutInput.getMaxLines();
        int hashCode3 = java.lang.Boolean.hashCode(textLayoutInput.getSoftWrap());
        int m8492hashCodeimpl = androidx.compose.ui.text.style.TextOverflow.m8492hashCodeimpl(textLayoutInput.getOverflow());
        int hashCode4 = textLayoutInput.getDensity().hashCode();
        return (((((((((((((((((hashCode * 31) + hashCodeLayoutAffectingAttributes$ui_text) * 31) + hashCode2) * 31) + maxLines) * 31) + hashCode3) * 31) + m8492hashCodeimpl) * 31) + hashCode4) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + androidx.compose.ui.unit.Constraints.m8557hashCodeimpl(textLayoutInput.getConstraints());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.ui.text.CacheTextLayoutInput)) {
            return false;
        }
        androidx.compose.ui.text.TextLayoutInput textLayoutInput = this.textLayoutInput;
        androidx.compose.ui.text.CacheTextLayoutInput cacheTextLayoutInput = (androidx.compose.ui.text.CacheTextLayoutInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(textLayoutInput.getText(), cacheTextLayoutInput.textLayoutInput.getText()) && textLayoutInput.getStyle().hasSameLayoutAffectingAttributes(cacheTextLayoutInput.textLayoutInput.getStyle()) && kotlin.jvm.internal.Intrinsics.areEqual(textLayoutInput.getPlaceholders(), cacheTextLayoutInput.textLayoutInput.getPlaceholders()) && textLayoutInput.getMaxLines() == cacheTextLayoutInput.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == cacheTextLayoutInput.textLayoutInput.getSoftWrap() && androidx.compose.ui.text.style.TextOverflow.m8491equalsimpl0(textLayoutInput.getOverflow(), cacheTextLayoutInput.textLayoutInput.getOverflow()) && kotlin.jvm.internal.Intrinsics.areEqual(textLayoutInput.getDensity(), cacheTextLayoutInput.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == cacheTextLayoutInput.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == cacheTextLayoutInput.textLayoutInput.getFontFamilyResolver() && androidx.compose.ui.unit.Constraints.m8548equalsimpl0(textLayoutInput.getConstraints(), cacheTextLayoutInput.textLayoutInput.getConstraints());
    }
}
