package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "", "p0", "Landroidx/compose/foundation/text/ContextMenuStrings;", "p1", "Landroidx/compose/foundation/text/ContextMenuIcons;", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/Object;II)V", "", "resolvedString", "(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "key", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "stringId", com.visa.cbp.getEncExpo.warmup, "getStringId-9Hzcbyc", "()I", "drawableId", "getDrawableId-3I4p1mQ", "Cut", "Copy", "Paste", "SelectAll", "Autofill"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextContextMenuItems {
    private static final /* synthetic */ androidx.compose.foundation.text.TextContextMenuItems[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private final int drawableId;
    private final java.lang.Object key;
    private final int stringId;
    public static final androidx.compose.foundation.text.TextContextMenuItems Cut = new androidx.compose.foundation.text.TextContextMenuItems("Cut", 0, androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys.INSTANCE.getCutKey(), androidx.compose.foundation.text.ContextMenuStrings.INSTANCE.m2038getCut9Hzcbyc(), androidx.compose.foundation.text.ContextMenuIcons.INSTANCE.m2025getActionModeCutDrawable3I4p1mQ());
    public static final androidx.compose.foundation.text.TextContextMenuItems Copy = new androidx.compose.foundation.text.TextContextMenuItems("Copy", 1, androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys.INSTANCE.getCopyKey(), androidx.compose.foundation.text.ContextMenuStrings.INSTANCE.m2037getCopy9Hzcbyc(), androidx.compose.foundation.text.ContextMenuIcons.INSTANCE.m2024getActionModeCopyDrawable3I4p1mQ());
    public static final androidx.compose.foundation.text.TextContextMenuItems Paste = new androidx.compose.foundation.text.TextContextMenuItems("Paste", 2, androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys.INSTANCE.getPasteKey(), androidx.compose.foundation.text.ContextMenuStrings.INSTANCE.m2039getPaste9Hzcbyc(), androidx.compose.foundation.text.ContextMenuIcons.INSTANCE.m2026getActionModePasteDrawable3I4p1mQ());
    public static final androidx.compose.foundation.text.TextContextMenuItems SelectAll = new androidx.compose.foundation.text.TextContextMenuItems("SelectAll", 3, androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys.INSTANCE.getSelectAllKey(), androidx.compose.foundation.text.ContextMenuStrings.INSTANCE.m2040getSelectAll9Hzcbyc(), androidx.compose.foundation.text.ContextMenuIcons.INSTANCE.m2027getActionModeSelectAllDrawable3I4p1mQ());
    public static final androidx.compose.foundation.text.TextContextMenuItems Autofill = new androidx.compose.foundation.text.TextContextMenuItems("Autofill", 4, androidx.compose.foundation.text.contextmenu.data.TextContextMenuKeys.INSTANCE.getAutofillKey(), androidx.compose.foundation.text.ContextMenuStrings.INSTANCE.m2036getAutofill9Hzcbyc(), androidx.compose.foundation.text.ContextMenuIcons.INSTANCE.m2028getID_NULL3I4p1mQ());

    private TextContextMenuItems(java.lang.String str, int i, java.lang.Object obj, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public final java.lang.Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc, reason: not valid java name and from getter */
    public final int getStringId() {
        return this.stringId;
    }

    /* renamed from: getDrawableId-3I4p1mQ, reason: not valid java name and from getter */
    public final int getDrawableId() {
        return this.drawableId;
    }

    static {
        androidx.compose.foundation.text.TextContextMenuItems[] Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(Camera2StreamConfigurationMap);
    }

    public final java.lang.String resolvedString(androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(479426150, i, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (CommonContextMenuArea.kt:178)");
        }
        java.lang.String m2041getStringtk4Tqcs = androidx.compose.foundation.text.ContextMenuStrings_androidKt.m2041getStringtk4Tqcs(this.stringId, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m2041getStringtk4Tqcs;
    }

    public static androidx.compose.foundation.text.TextContextMenuItems[] values() {
        return (androidx.compose.foundation.text.TextContextMenuItems[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static androidx.compose.foundation.text.TextContextMenuItems valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.TextContextMenuItems) java.lang.Enum.valueOf(androidx.compose.foundation.text.TextContextMenuItems.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.TextContextMenuItems> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }

    private static final /* synthetic */ androidx.compose.foundation.text.TextContextMenuItems[] Camera2StreamConfigurationMap() {
        return new androidx.compose.foundation.text.TextContextMenuItems[]{Cut, Copy, Paste, SelectAll, Autofill};
    }
}
