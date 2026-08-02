package androidx.compose.ui.text.platform.extensions;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u000f\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010\"\u0018\u0010\u0014\u001a\u00020\u000b*\u00020\u00118CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\"\u0018\u0010\u0017\u001a\u00020\u000b*\u00020\u00158CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016"}, d2 = {"Landroid/text/Spannable;", "", "Landroidx/compose/ui/text/AnnotatedString$Range;", "Landroidx/compose/ui/text/Placeholder;", "placeholders", "Landroidx/compose/ui/unit/Density;", "density", "", "setPlaceholders", "(Landroid/text/Spannable;Ljava/util/List;Landroidx/compose/ui/unit/Density;)V", "p0", "", "p1", "p2", "p3", "getHighSpeedVideoSizes", "(Landroid/text/Spannable;Landroidx/compose/ui/text/Placeholder;IILandroidx/compose/ui/unit/Density;)V", "Landroidx/compose/ui/unit/TextUnit;", "Camera2StreamConfigurationMap", "(J)I", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/compose/ui/text/PlaceholderVerticalAlign;", "(I)I", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlaceholderExtensions_androidKt {
    private static final void getHighSpeedVideoSizes(android.text.Spannable spannable, androidx.compose.ui.text.Placeholder placeholder, int i, int i2, androidx.compose.ui.unit.Density density) {
        for (java.lang.Object obj : spannable.getSpans(i, i2, androidx.emoji2.text.EmojiSpan.class)) {
            spannable.removeSpan((androidx.emoji2.text.EmojiSpan) obj);
        }
        androidx.compose.ui.text.platform.extensions.SpannableExtensions_androidKt.setSpan(spannable, new androidx.compose.ui.text.android.style.PlaceholderSpan(androidx.compose.ui.unit.TextUnit.m8795getValueimpl(placeholder.getWidth()), Camera2StreamConfigurationMap(placeholder.getWidth()), androidx.compose.ui.unit.TextUnit.m8795getValueimpl(placeholder.getHeight()), Camera2StreamConfigurationMap(placeholder.getHeight()), density, getHighSpeedVideoSizes(placeholder.getPlaceholderVerticalAlign())), i, i2);
    }

    private static final int Camera2StreamConfigurationMap(long j) {
        long m8794getTypeUIouoOA = androidx.compose.ui.unit.TextUnit.m8794getTypeUIouoOA(j);
        if (androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(m8794getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m8828getSpUIouoOA())) {
            return 0;
        }
        return androidx.compose.ui.unit.TextUnitType.m8823equalsimpl0(m8794getTypeUIouoOA, androidx.compose.ui.unit.TextUnitType.INSTANCE.m8827getEmUIouoOA()) ? 1 : 2;
    }

    private static final int getHighSpeedVideoSizes(int i) {
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7939getAboveBaselineJ6kI3mc())) {
            return 0;
        }
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7945getTopJ6kI3mc())) {
            return 1;
        }
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7940getBottomJ6kI3mc())) {
            return 2;
        }
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7941getCenterJ6kI3mc())) {
            return 3;
        }
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7944getTextTopJ6kI3mc())) {
            return 4;
        }
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7942getTextBottomJ6kI3mc())) {
            return 5;
        }
        if (androidx.compose.ui.text.PlaceholderVerticalAlign.m7935equalsimpl0(i, androidx.compose.ui.text.PlaceholderVerticalAlign.INSTANCE.m7943getTextCenterJ6kI3mc())) {
            return 6;
        }
        throw new java.lang.IllegalStateException("Invalid PlaceholderVerticalAlign".toString());
    }

    public static final void setPlaceholders(android.text.Spannable spannable, java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder>> list, androidx.compose.ui.unit.Density density) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.Placeholder> range = list.get(i);
            getHighSpeedVideoSizes(spannable, range.component1(), range.getStart(), range.getEnd(), density);
        }
    }
}
