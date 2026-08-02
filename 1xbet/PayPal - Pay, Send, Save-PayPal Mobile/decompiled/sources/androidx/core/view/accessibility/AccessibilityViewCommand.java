package androidx.core.view.accessibility;

/* loaded from: classes3.dex */
public interface AccessibilityViewCommand {
    boolean perform(android.view.View view, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments);

    public static abstract class CommandArguments {
        android.os.Bundle getHighSpeedVideoSizes;

        public void setBundle(android.os.Bundle bundle) {
            this.getHighSpeedVideoSizes = bundle;
        }
    }

    public static final class MoveAtGranularityArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final int getGranularity() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT);
        }

        public final boolean getExtendSelection() {
            return this.getHighSpeedVideoSizes.getBoolean(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN);
        }
    }

    public static final class MoveHtmlArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final java.lang.String getHTMLElement() {
            return this.getHighSpeedVideoSizes.getString(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_HTML_ELEMENT_STRING);
        }
    }

    public static final class SetSelectionArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final int getStart() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_START_INT);
        }

        public final int getEnd() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SELECTION_END_INT);
        }
    }

    public static final class SetTextArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final java.lang.CharSequence getText() {
            return this.getHighSpeedVideoSizes.getCharSequence(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE);
        }
    }

    public static final class ScrollToPositionArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final int getRow() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_ROW_INT);
        }

        public final int getColumn() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_COLUMN_INT);
        }
    }

    public static final class SetProgressArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final float getProgress() {
            return this.getHighSpeedVideoSizes.getFloat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_PROGRESS_VALUE);
        }
    }

    public static final class MoveWindowArguments extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments {
        public final int getX() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVE_WINDOW_X);
        }

        public final int getY() {
            return this.getHighSpeedVideoSizes.getInt(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.ACTION_ARGUMENT_MOVE_WINDOW_Y);
        }
    }
}
