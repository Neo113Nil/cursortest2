package androidx.compose.foundation.text;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b8\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:"}, d2 = {"Landroidx/compose/foundation/text/KeyCommand;", "", "", "p0", "<init>", "(Ljava/lang/String;IZ)V", "editsText", "Z", "getEditsText", "()Z", "LEFT_CHAR", "RIGHT_CHAR", "RIGHT_WORD", "LEFT_WORD", "NEXT_PARAGRAPH", "PREV_PARAGRAPH", "LINE_START", "LINE_END", "LINE_LEFT", "LINE_RIGHT", "UP", "DOWN", "CENTER", "PAGE_UP", "PAGE_DOWN", "HOME", "END", "COPY", "PASTE", "CUT", "DELETE_PREV_CHAR", "DELETE_NEXT_CHAR", "DELETE_PREV_WORD", "DELETE_NEXT_WORD", "DELETE_FROM_LINE_START", "DELETE_TO_LINE_END", "SELECT_ALL", "SELECT_LEFT_CHAR", "SELECT_RIGHT_CHAR", "SELECT_UP", "SELECT_DOWN", "SELECT_PAGE_UP", "SELECT_PAGE_DOWN", "SELECT_HOME", "SELECT_END", "SELECT_LEFT_WORD", "SELECT_RIGHT_WORD", "SELECT_NEXT_PARAGRAPH", "SELECT_PREV_PARAGRAPH", "SELECT_LINE_START", "SELECT_LINE_END", "SELECT_LINE_LEFT", "SELECT_LINE_RIGHT", "DESELECT", "NEW_LINE", "TAB", "UNDO", "REDO", "CHARACTER_PALETTE"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyCommand {
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ androidx.compose.foundation.text.KeyCommand[] getHighSpeedVideoFpsRanges;
    private final boolean editsText;
    public static final androidx.compose.foundation.text.KeyCommand LEFT_CHAR = new androidx.compose.foundation.text.KeyCommand("LEFT_CHAR", 0, false);
    public static final androidx.compose.foundation.text.KeyCommand RIGHT_CHAR = new androidx.compose.foundation.text.KeyCommand("RIGHT_CHAR", 1, false);
    public static final androidx.compose.foundation.text.KeyCommand RIGHT_WORD = new androidx.compose.foundation.text.KeyCommand("RIGHT_WORD", 2, false);
    public static final androidx.compose.foundation.text.KeyCommand LEFT_WORD = new androidx.compose.foundation.text.KeyCommand("LEFT_WORD", 3, false);
    public static final androidx.compose.foundation.text.KeyCommand NEXT_PARAGRAPH = new androidx.compose.foundation.text.KeyCommand("NEXT_PARAGRAPH", 4, false);
    public static final androidx.compose.foundation.text.KeyCommand PREV_PARAGRAPH = new androidx.compose.foundation.text.KeyCommand("PREV_PARAGRAPH", 5, false);
    public static final androidx.compose.foundation.text.KeyCommand LINE_START = new androidx.compose.foundation.text.KeyCommand("LINE_START", 6, false);
    public static final androidx.compose.foundation.text.KeyCommand LINE_END = new androidx.compose.foundation.text.KeyCommand("LINE_END", 7, false);
    public static final androidx.compose.foundation.text.KeyCommand LINE_LEFT = new androidx.compose.foundation.text.KeyCommand("LINE_LEFT", 8, false);
    public static final androidx.compose.foundation.text.KeyCommand LINE_RIGHT = new androidx.compose.foundation.text.KeyCommand("LINE_RIGHT", 9, false);
    public static final androidx.compose.foundation.text.KeyCommand UP = new androidx.compose.foundation.text.KeyCommand("UP", 10, false);
    public static final androidx.compose.foundation.text.KeyCommand DOWN = new androidx.compose.foundation.text.KeyCommand("DOWN", 11, false);
    public static final androidx.compose.foundation.text.KeyCommand CENTER = new androidx.compose.foundation.text.KeyCommand("CENTER", 12, false);
    public static final androidx.compose.foundation.text.KeyCommand PAGE_UP = new androidx.compose.foundation.text.KeyCommand("PAGE_UP", 13, false);
    public static final androidx.compose.foundation.text.KeyCommand PAGE_DOWN = new androidx.compose.foundation.text.KeyCommand("PAGE_DOWN", 14, false);
    public static final androidx.compose.foundation.text.KeyCommand HOME = new androidx.compose.foundation.text.KeyCommand("HOME", 15, false);
    public static final androidx.compose.foundation.text.KeyCommand END = new androidx.compose.foundation.text.KeyCommand("END", 16, false);
    public static final androidx.compose.foundation.text.KeyCommand COPY = new androidx.compose.foundation.text.KeyCommand("COPY", 17, false);
    public static final androidx.compose.foundation.text.KeyCommand PASTE = new androidx.compose.foundation.text.KeyCommand("PASTE", 18, true);
    public static final androidx.compose.foundation.text.KeyCommand CUT = new androidx.compose.foundation.text.KeyCommand("CUT", 19, true);
    public static final androidx.compose.foundation.text.KeyCommand DELETE_PREV_CHAR = new androidx.compose.foundation.text.KeyCommand("DELETE_PREV_CHAR", 20, true);
    public static final androidx.compose.foundation.text.KeyCommand DELETE_NEXT_CHAR = new androidx.compose.foundation.text.KeyCommand("DELETE_NEXT_CHAR", 21, true);
    public static final androidx.compose.foundation.text.KeyCommand DELETE_PREV_WORD = new androidx.compose.foundation.text.KeyCommand("DELETE_PREV_WORD", 22, true);
    public static final androidx.compose.foundation.text.KeyCommand DELETE_NEXT_WORD = new androidx.compose.foundation.text.KeyCommand("DELETE_NEXT_WORD", 23, true);
    public static final androidx.compose.foundation.text.KeyCommand DELETE_FROM_LINE_START = new androidx.compose.foundation.text.KeyCommand("DELETE_FROM_LINE_START", 24, true);
    public static final androidx.compose.foundation.text.KeyCommand DELETE_TO_LINE_END = new androidx.compose.foundation.text.KeyCommand("DELETE_TO_LINE_END", 25, true);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_ALL = new androidx.compose.foundation.text.KeyCommand("SELECT_ALL", 26, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_LEFT_CHAR = new androidx.compose.foundation.text.KeyCommand("SELECT_LEFT_CHAR", 27, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_RIGHT_CHAR = new androidx.compose.foundation.text.KeyCommand("SELECT_RIGHT_CHAR", 28, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_UP = new androidx.compose.foundation.text.KeyCommand("SELECT_UP", 29, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_DOWN = new androidx.compose.foundation.text.KeyCommand("SELECT_DOWN", 30, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_PAGE_UP = new androidx.compose.foundation.text.KeyCommand("SELECT_PAGE_UP", 31, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_PAGE_DOWN = new androidx.compose.foundation.text.KeyCommand("SELECT_PAGE_DOWN", 32, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_HOME = new androidx.compose.foundation.text.KeyCommand("SELECT_HOME", 33, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_END = new androidx.compose.foundation.text.KeyCommand("SELECT_END", 34, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_LEFT_WORD = new androidx.compose.foundation.text.KeyCommand("SELECT_LEFT_WORD", 35, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_RIGHT_WORD = new androidx.compose.foundation.text.KeyCommand("SELECT_RIGHT_WORD", 36, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_NEXT_PARAGRAPH = new androidx.compose.foundation.text.KeyCommand("SELECT_NEXT_PARAGRAPH", 37, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_PREV_PARAGRAPH = new androidx.compose.foundation.text.KeyCommand("SELECT_PREV_PARAGRAPH", 38, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_LINE_START = new androidx.compose.foundation.text.KeyCommand("SELECT_LINE_START", 39, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_LINE_END = new androidx.compose.foundation.text.KeyCommand("SELECT_LINE_END", 40, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_LINE_LEFT = new androidx.compose.foundation.text.KeyCommand("SELECT_LINE_LEFT", 41, false);
    public static final androidx.compose.foundation.text.KeyCommand SELECT_LINE_RIGHT = new androidx.compose.foundation.text.KeyCommand("SELECT_LINE_RIGHT", 42, false);
    public static final androidx.compose.foundation.text.KeyCommand DESELECT = new androidx.compose.foundation.text.KeyCommand("DESELECT", 43, false);
    public static final androidx.compose.foundation.text.KeyCommand NEW_LINE = new androidx.compose.foundation.text.KeyCommand("NEW_LINE", 44, true);
    public static final androidx.compose.foundation.text.KeyCommand TAB = new androidx.compose.foundation.text.KeyCommand("TAB", 45, true);
    public static final androidx.compose.foundation.text.KeyCommand UNDO = new androidx.compose.foundation.text.KeyCommand("UNDO", 46, true);
    public static final androidx.compose.foundation.text.KeyCommand REDO = new androidx.compose.foundation.text.KeyCommand("REDO", 47, true);
    public static final androidx.compose.foundation.text.KeyCommand CHARACTER_PALETTE = new androidx.compose.foundation.text.KeyCommand("CHARACTER_PALETTE", 48, true);

    private KeyCommand(java.lang.String str, int i, boolean z) {
        this.editsText = z;
    }

    public final boolean getEditsText() {
        return this.editsText;
    }

    static {
        androidx.compose.foundation.text.KeyCommand[] highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        getHighSpeedVideoFpsRanges = highSpeedVideoFpsRangesFor;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(highSpeedVideoFpsRangesFor);
    }

    public static androidx.compose.foundation.text.KeyCommand[] values() {
        return (androidx.compose.foundation.text.KeyCommand[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static androidx.compose.foundation.text.KeyCommand valueOf(java.lang.String str) {
        return (androidx.compose.foundation.text.KeyCommand) java.lang.Enum.valueOf(androidx.compose.foundation.text.KeyCommand.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.foundation.text.KeyCommand> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    private static final /* synthetic */ androidx.compose.foundation.text.KeyCommand[] getHighSpeedVideoFpsRangesFor() {
        return new androidx.compose.foundation.text.KeyCommand[]{LEFT_CHAR, RIGHT_CHAR, RIGHT_WORD, LEFT_WORD, NEXT_PARAGRAPH, PREV_PARAGRAPH, LINE_START, LINE_END, LINE_LEFT, LINE_RIGHT, UP, DOWN, CENTER, PAGE_UP, PAGE_DOWN, HOME, END, COPY, PASTE, CUT, DELETE_PREV_CHAR, DELETE_NEXT_CHAR, DELETE_PREV_WORD, DELETE_NEXT_WORD, DELETE_FROM_LINE_START, DELETE_TO_LINE_END, SELECT_ALL, SELECT_LEFT_CHAR, SELECT_RIGHT_CHAR, SELECT_UP, SELECT_DOWN, SELECT_PAGE_UP, SELECT_PAGE_DOWN, SELECT_HOME, SELECT_END, SELECT_LEFT_WORD, SELECT_RIGHT_WORD, SELECT_NEXT_PARAGRAPH, SELECT_PREV_PARAGRAPH, SELECT_LINE_START, SELECT_LINE_END, SELECT_LINE_LEFT, SELECT_LINE_RIGHT, DESELECT, NEW_LINE, TAB, UNDO, REDO, CHARACTER_PALETTE};
    }
}
