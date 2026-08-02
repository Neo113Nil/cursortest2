package androidx.compose.ui.autofill;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/Modifier;", "Landroidx/compose/ui/autofill/ContentType;", org.bouncycastle.cms.CMSAttributeTableGenerator.CONTENT_TYPE, "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/autofill/ContentType;)Landroidx/compose/ui/Modifier;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AutofillModifierKt {
    public static final androidx.compose.ui.Modifier contentType(androidx.compose.ui.Modifier modifier, final androidx.compose.ui.autofill.ContentType contentType) {
        return androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(modifier, false, new kotlin.jvm.functions.Function1<androidx.compose.ui.semantics.SemanticsPropertyReceiver, kotlin.Unit>() { // from class: androidx.compose.ui.autofill.AutofillModifierKt$contentType$1
            public final void getHighSpeedVideoFpsRanges(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentType(semanticsPropertyReceiver, androidx.compose.ui.autofill.ContentType.this);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
                getHighSpeedVideoFpsRanges(semanticsPropertyReceiver);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        }, 1, null);
    }
}
