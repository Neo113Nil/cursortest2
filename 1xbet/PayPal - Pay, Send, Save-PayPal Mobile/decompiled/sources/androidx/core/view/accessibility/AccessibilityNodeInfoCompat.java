package androidx.core.view.accessibility;

/* loaded from: classes3.dex */
public class AccessibilityNodeInfoCompat {
    public static final int ACTION_ACCESSIBILITY_FOCUS = 64;
    public static final java.lang.String ACTION_ARGUMENT_COLUMN_INT = "android.view.accessibility.action.ARGUMENT_COLUMN_INT";
    public static final java.lang.String ACTION_ARGUMENT_DIRECTION_INT = "androidx.core.view.accessibility.action.ARGUMENT_DIRECTION_INT";
    public static final java.lang.String ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN = "ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN";
    public static final java.lang.String ACTION_ARGUMENT_HTML_ELEMENT_STRING = "ACTION_ARGUMENT_HTML_ELEMENT_STRING";
    public static final java.lang.String ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT = "ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_X = "ACTION_ARGUMENT_MOVE_WINDOW_X";
    public static final java.lang.String ACTION_ARGUMENT_MOVE_WINDOW_Y = "ACTION_ARGUMENT_MOVE_WINDOW_Y";
    public static final java.lang.String ACTION_ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT = "android.view.accessibility.action.ARGUMENT_PRESS_AND_HOLD_DURATION_MILLIS_INT";
    public static final java.lang.String ACTION_ARGUMENT_PROGRESS_VALUE = "android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE";
    public static final java.lang.String ACTION_ARGUMENT_ROW_INT = "android.view.accessibility.action.ARGUMENT_ROW_INT";
    public static final java.lang.String ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT = "androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_END_INT = "ACTION_ARGUMENT_SELECTION_END_INT";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_PARCELABLE = "androidx.core.view.accessibility.action.ARGUMENT_SELECTION_PARCELABLE";
    public static final java.lang.String ACTION_ARGUMENT_SELECTION_START_INT = "ACTION_ARGUMENT_SELECTION_START_INT";
    public static final java.lang.String ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
    public static final int ACTION_CLEAR_ACCESSIBILITY_FOCUS = 128;
    public static final int ACTION_CLEAR_FOCUS = 2;
    public static final int ACTION_CLEAR_SELECTION = 8;
    public static final int ACTION_CLICK = 16;
    public static final int ACTION_COLLAPSE = 524288;
    public static final int ACTION_COPY = 16384;
    public static final int ACTION_CUT = 65536;
    public static final int ACTION_DISMISS = 1048576;
    public static final int ACTION_EXPAND = 262144;
    public static final int ACTION_FOCUS = 1;
    public static final int ACTION_LONG_CLICK = 32;
    public static final int ACTION_NEXT_AT_MOVEMENT_GRANULARITY = 256;
    public static final int ACTION_NEXT_HTML_ELEMENT = 1024;
    public static final int ACTION_PASTE = 32768;
    public static final int ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = 512;
    public static final int ACTION_PREVIOUS_HTML_ELEMENT = 2048;
    public static final int ACTION_SCROLL_BACKWARD = 8192;
    public static final int ACTION_SCROLL_FORWARD = 4096;
    public static final int ACTION_SELECT = 4;
    public static final int ACTION_SET_SELECTION = 131072;
    public static final int ACTION_SET_TEXT = 2097152;
    public static final int CHECKED_STATE_FALSE = 0;
    public static final int CHECKED_STATE_PARTIAL = 2;
    public static final int CHECKED_STATE_TRUE = 1;
    public static final int EXPANDED_STATE_COLLAPSED = 1;
    public static final int EXPANDED_STATE_FULL = 3;
    public static final int EXPANDED_STATE_PARTIAL = 2;
    public static final int EXPANDED_STATE_UNDEFINED = 0;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH";
    public static final int EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_MAX_LENGTH = 20000;
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_IN_WINDOW_KEY";
    public static final java.lang.String EXTRA_DATA_TEXT_CHARACTER_LOCATION_KEY = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY";
    public static final int FLAG_PREFETCH_ANCESTORS = 1;
    public static final int FLAG_PREFETCH_DESCENDANTS_BREADTH_FIRST = 16;
    public static final int FLAG_PREFETCH_DESCENDANTS_DEPTH_FIRST = 8;
    public static final int FLAG_PREFETCH_DESCENDANTS_HYBRID = 4;
    public static final int FLAG_PREFETCH_SIBLINGS = 2;
    public static final int FLAG_PREFETCH_UNINTERRUPTIBLE = 32;
    public static final int FOCUS_ACCESSIBILITY = 2;
    public static final int FOCUS_INPUT = 1;
    public static final int MAX_NUMBER_OF_PREFETCHED_NODES = 50;
    public static final int MOVEMENT_GRANULARITY_CHARACTER = 1;
    public static final int MOVEMENT_GRANULARITY_LINE = 4;
    public static final int MOVEMENT_GRANULARITY_PAGE = 16;
    public static final int MOVEMENT_GRANULARITY_PARAGRAPH = 8;
    public static final int MOVEMENT_GRANULARITY_WORD = 2;
    private final android.view.accessibility.AccessibilityNodeInfo getHighSpeedVideoSizes;
    public int mParentVirtualDescendantId = -1;
    private int getHighResolutionOutputSizeshNQ4ISI = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface CheckedState {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ExpandedState {
    }

    public void addSpansToExtras(java.lang.CharSequence charSequence, android.view.View view) {
    }

    @java.lang.Deprecated
    public void recycle() {
    }

    public static class AccessibilityActionCompat {
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CONTEXT_CLICK;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_CANCEL;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_DROP;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DRAG_START;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_HIDE_TOOLTIP;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_IME_ENTER;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_MOVE_WINDOW;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_DOWN;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_LEFT;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_RIGHT;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PAGE_UP;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PRESS_AND_HOLD;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_IN_DIRECTION;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_EXTENDED_SELECTION;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_PROGRESS;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_TEXT_SUGGESTIONS;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_TOOLTIP;
        private final int Camera2StreamConfigurationMap;
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
        private final java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> getHighSpeedVideoSizes;
        protected final androidx.core.view.accessibility.AccessibilityViewCommand mCommand;
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_FOCUS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(1, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_FOCUS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(2, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SELECT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(4, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_SELECTION = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(8, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLICK = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_LONG_CLICK = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(32, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_ACCESSIBILITY_FOCUS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(64, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CLEAR_ACCESSIBILITY_FOCUS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(128, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_NEXT_AT_MOVEMENT_GRANULARITY = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(256, (java.lang.CharSequence) null, (java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments>) androidx.core.view.accessibility.AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(512, (java.lang.CharSequence) null, (java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments>) androidx.core.view.accessibility.AccessibilityViewCommand.MoveAtGranularityArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_NEXT_HTML_ELEMENT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(1024, (java.lang.CharSequence) null, (java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments>) androidx.core.view.accessibility.AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PREVIOUS_HTML_ELEMENT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(2048, (java.lang.CharSequence) null, (java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments>) androidx.core.view.accessibility.AccessibilityViewCommand.MoveHtmlArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_FORWARD = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(4096, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_BACKWARD = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(8192, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_COPY = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(16384, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_PASTE = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(32768, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_CUT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(65536, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_SELECTION = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(131072, (java.lang.CharSequence) null, (java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments>) androidx.core.view.accessibility.AccessibilityViewCommand.SetSelectionArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_EXPAND = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(262144, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_COLLAPSE = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(524288, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_DISMISS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(1048576, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SET_TEXT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(2097152, (java.lang.CharSequence) null, (java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments>) androidx.core.view.accessibility.AccessibilityViewCommand.SetTextArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SHOW_ON_SCREEN = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, android.R.id.accessibilityActionShowOnScreen, null, null, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_TO_POSITION = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, android.R.id.accessibilityActionScrollToPosition, null, null, androidx.core.view.accessibility.AccessibilityViewCommand.ScrollToPositionArguments.class);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_UP = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, android.R.id.accessibilityActionScrollUp, null, null, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_LEFT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, android.R.id.accessibilityActionScrollLeft, null, null, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_DOWN = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, android.R.id.accessibilityActionScrollDown, null, null, null);
        public static final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat ACTION_SCROLL_RIGHT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, android.R.id.accessibilityActionScrollRight, null, null, null);

        static {
            ACTION_PAGE_UP = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, android.R.id.accessibilityActionPageUp, null, null, null);
            ACTION_PAGE_DOWN = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, android.R.id.accessibilityActionPageDown, null, null, null);
            ACTION_PAGE_LEFT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, android.R.id.accessibilityActionPageLeft, null, null, null);
            ACTION_PAGE_RIGHT = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 29 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, android.R.id.accessibilityActionPageRight, null, null, null);
            ACTION_CONTEXT_CLICK = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, android.R.id.accessibilityActionContextClick, null, null, null);
            ACTION_SET_PROGRESS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, android.R.id.accessibilityActionSetProgress, null, null, androidx.core.view.accessibility.AccessibilityViewCommand.SetProgressArguments.class);
            ACTION_MOVE_WINDOW = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW, android.R.id.accessibilityActionMoveWindow, null, null, androidx.core.view.accessibility.AccessibilityViewCommand.MoveWindowArguments.class);
            ACTION_SHOW_TOOLTIP = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 28 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, android.R.id.accessibilityActionShowTooltip, null, null, null);
            ACTION_HIDE_TOOLTIP = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 28 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, android.R.id.accessibilityActionHideTooltip, null, null, null);
            ACTION_PRESS_AND_HOLD = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, android.R.id.accessibilityActionPressAndHold, null, null, null);
            ACTION_IME_ENTER = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 30 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, android.R.id.accessibilityActionImeEnter, null, null, null);
            ACTION_DRAG_START = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, android.R.id.accessibilityActionDragStart, null, null, null);
            ACTION_DRAG_DROP = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, android.R.id.accessibilityActionDragDrop, null, null, null);
            ACTION_DRAG_CANCEL = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 32 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, android.R.id.accessibilityActionDragCancel, null, null, null);
            ACTION_SHOW_TEXT_SUGGESTIONS = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 33 ? android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, android.R.id.accessibilityActionShowTextSuggestions, null, null, null);
            ACTION_SCROLL_IN_DIRECTION = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(android.os.Build.VERSION.SDK_INT >= 34 ? androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighSpeedVideoFpsRangesFor() : null, android.R.id.accessibilityActionScrollInDirection, null, null, null);
            ACTION_SET_EXTENDED_SELECTION = new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(androidx.core.os.BuildCompat.isAtLeastB_1() ? androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36MinorImpl.getHighSpeedVideoFpsRanges() : null, android.R.id.ALT, null, null, null);
        }

        public AccessibilityActionCompat(int i, java.lang.CharSequence charSequence) {
            this(null, i, charSequence, null, null);
        }

        public AccessibilityActionCompat(int i, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
            this(null, i, charSequence, accessibilityViewCommand, null);
        }

        AccessibilityActionCompat(java.lang.Object obj) {
            this(obj, 0, null, null, null);
        }

        private AccessibilityActionCompat(int i, java.lang.CharSequence charSequence, java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> cls) {
            this(null, i, charSequence, null, cls);
        }

        AccessibilityActionCompat(java.lang.Object obj, int i, java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand, java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> cls) {
            this.Camera2StreamConfigurationMap = i;
            this.mCommand = accessibilityViewCommand;
            if (obj == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = new android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction(i, charSequence);
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = obj;
            }
            this.getHighSpeedVideoSizes = cls;
        }

        public int getId() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) this.getHighResolutionOutputSizeshNQ4ISI).getId();
        }

        public java.lang.CharSequence getLabel() {
            return ((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) this.getHighResolutionOutputSizeshNQ4ISI).getLabel();
        }

        public boolean perform(android.view.View view, android.os.Bundle bundle) {
            if (this.mCommand == null) {
                return false;
            }
            java.lang.Class<? extends androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments> cls = this.getHighSpeedVideoSizes;
            androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments commandArguments = null;
            if (cls != null) {
                try {
                    androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments newInstance = cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                    try {
                        newInstance.setBundle(bundle);
                    } catch (java.lang.Exception unused) {
                    }
                    commandArguments = newInstance;
                } catch (java.lang.Exception unused2) {
                }
            }
            return this.mCommand.perform(view, commandArguments);
        }

        public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat createReplacementAction(java.lang.CharSequence charSequence, androidx.core.view.accessibility.AccessibilityViewCommand accessibilityViewCommand) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, this.Camera2StreamConfigurationMap, charSequence, accessibilityViewCommand, this.getHighSpeedVideoSizes);
        }

        public int hashCode() {
            java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(java.lang.Object obj) {
            if (obj == null || !(obj instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat)) {
                return false;
            }
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat) obj;
            java.lang.Object obj2 = this.getHighResolutionOutputSizeshNQ4ISI;
            return obj2 == null ? accessibilityActionCompat.getHighResolutionOutputSizeshNQ4ISI == null : obj2.equals(accessibilityActionCompat.getHighResolutionOutputSizeshNQ4ISI);
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("AccessibilityActionCompat: ");
            java.lang.String highSpeedVideoFpsRangesFor = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoFpsRangesFor(this.Camera2StreamConfigurationMap);
            if (highSpeedVideoFpsRangesFor.equals("ACTION_UNKNOWN") && getLabel() != null) {
                highSpeedVideoFpsRangesFor = getLabel().toString();
            }
            sb.append(highSpeedVideoFpsRangesFor);
            return sb.toString();
        }
    }

    /* loaded from: classes7.dex */
    public static class CollectionInfoCompat {
        public static final int SELECTION_MODE_MULTIPLE = 2;
        public static final int SELECTION_MODE_NONE = 0;
        public static final int SELECTION_MODE_SINGLE = 1;
        public static final int UNDEFINED = -1;
        final java.lang.Object getHighResolutionOutputSizeshNQ4ISI;

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat obtain(int i, int i2, boolean z, int i3) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat obtain(int i, int i2, boolean z) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat(android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z));
        }

        CollectionInfoCompat(java.lang.Object obj) {
            this.getHighResolutionOutputSizeshNQ4ISI = obj;
        }

        public int getColumnCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) this.getHighResolutionOutputSizeshNQ4ISI).getColumnCount();
        }

        public int getRowCount() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) this.getHighResolutionOutputSizeshNQ4ISI).getRowCount();
        }

        public boolean isHierarchical() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) this.getHighResolutionOutputSizeshNQ4ISI).isHierarchical();
        }

        public int getSelectionMode() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) this.getHighResolutionOutputSizeshNQ4ISI).getSelectionMode();
        }

        public int getItemCount() {
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api35Impl.Camera2StreamConfigurationMap(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return -1;
        }

        public int getImportantForAccessibilityItemCount() {
            if (android.os.Build.VERSION.SDK_INT >= 35) {
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api35Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighResolutionOutputSizeshNQ4ISI);
            }
            return -1;
        }

        public static final class Builder {
            private int getInputSizeshNQ4ISI;
            private int getHighResolutionOutputSizeshNQ4ISI = 0;
            private int getHighSpeedVideoFpsRangesFor = 0;
            private boolean getHighSpeedVideoSizes = false;
            private int Camera2StreamConfigurationMap = -1;
            private int getHighSpeedVideoFpsRanges = -1;

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setRowCount(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setColumnCount(int i) {
                this.getHighSpeedVideoFpsRangesFor = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setHierarchical(boolean z) {
                this.getHighSpeedVideoSizes = z;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setSelectionMode(int i) {
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setItemCount(int i) {
                this.Camera2StreamConfigurationMap = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.Builder setImportantForAccessibilityItemCount(int i) {
                this.getHighSpeedVideoFpsRanges = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat build() {
                if (android.os.Build.VERSION.SDK_INT >= 35) {
                    return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api35Impl.getHighSpeedVideoFpsRanges(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges);
                }
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputSizeshNQ4ISI);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class CollectionItemInfoCompat {
        public static final int SORT_DIRECTION_ASCENDING = 1;
        public static final int SORT_DIRECTION_DESCENDING = 2;
        public static final int SORT_DIRECTION_NONE = 0;
        public static final int SORT_DIRECTION_OTHER = 3;
        final java.lang.Object getHighSpeedVideoFpsRanges;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface SortDirection {
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat obtain(int i, int i2, int i3, int i4, boolean z) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z));
        }

        CollectionItemInfoCompat(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRanges = obj;
        }

        public int getColumnIndex() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) this.getHighSpeedVideoFpsRanges).getColumnIndex();
        }

        public int getColumnSpan() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) this.getHighSpeedVideoFpsRanges).getColumnSpan();
        }

        public int getRowIndex() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) this.getHighSpeedVideoFpsRanges).getRowIndex();
        }

        public int getRowSpan() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) this.getHighSpeedVideoFpsRanges).getRowSpan();
        }

        @java.lang.Deprecated
        public boolean isHeading() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) this.getHighSpeedVideoFpsRanges).isHeading();
        }

        public boolean isSelected() {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) this.getHighSpeedVideoFpsRanges).isSelected();
        }

        public java.lang.String getRowTitle() {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
            }
            return null;
        }

        public java.lang.String getColumnTitle() {
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            }
            return null;
        }

        public int getSortDirection() {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36MinorImpl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRanges);
            }
            return 0;
        }

        public static final class Builder {
            private int Camera2StreamConfigurationMap;
            private int getHighResolutionOutputSizeshNQ4ISI;
            private boolean getHighSpeedVideoFpsRanges;
            private java.lang.String getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private int getHighSpeedVideoSizesFor;
            private java.lang.String getInputFormats;
            private int getInputSizeshNQ4ISI;
            private boolean getOutputMinFrameDuration;

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setHeading(boolean z) {
                this.getHighSpeedVideoFpsRanges = z;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setColumnIndex(int i) {
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setRowIndex(int i) {
                this.Camera2StreamConfigurationMap = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setColumnSpan(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setRowSpan(int i) {
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setSelected(boolean z) {
                this.getOutputMinFrameDuration = z;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setRowTitle(java.lang.String str) {
                this.getInputFormats = str;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setColumnTitle(java.lang.String str) {
                this.getHighSpeedVideoFpsRangesFor = str;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.Builder setSortDirection(int i) {
                this.getHighSpeedVideoSizesFor = i;
                return this;
            }

            public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat build() {
                if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                    return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36MinorImpl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizesFor);
                }
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getOutputMinFrameDuration, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor);
                }
                return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat(android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.obtain(this.Camera2StreamConfigurationMap, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.getOutputMinFrameDuration));
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class RangeInfoCompat {
        public static final int RANGE_TYPE_FLOAT = 1;
        public static final int RANGE_TYPE_INT = 0;
        public static final int RANGE_TYPE_PERCENT = 2;
        final java.lang.Object getHighSpeedVideoFpsRangesFor;

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat obtain(int i, float f, float f2, float f3) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat(android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3));
        }

        RangeInfoCompat(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = obj;
        }

        public RangeInfoCompat(int i, float f, float f2, float f3) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.getHighSpeedVideoFpsRangesFor = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api30Impl.getHighResolutionOutputSizeshNQ4ISI(i, f, f2, f3);
            } else {
                this.getHighSpeedVideoFpsRangesFor = android.view.accessibility.AccessibilityNodeInfo.RangeInfo.obtain(i, f, f2, f3);
            }
        }

        public float getCurrent() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) this.getHighSpeedVideoFpsRangesFor).getCurrent();
        }

        public float getMax() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) this.getHighSpeedVideoFpsRangesFor).getMax();
        }

        public float getMin() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) this.getHighSpeedVideoFpsRangesFor).getMin();
        }

        public int getType() {
            return ((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) this.getHighSpeedVideoFpsRangesFor).getType();
        }
    }

    /* loaded from: classes7.dex */
    public static final class TouchDelegateInfoCompat {
        final android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo Camera2StreamConfigurationMap;

        public TouchDelegateInfoCompat(java.util.Map<android.graphics.Region, android.view.View> map) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.Camera2StreamConfigurationMap = new android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo(map);
            } else {
                this.Camera2StreamConfigurationMap = null;
            }
        }

        TouchDelegateInfoCompat(android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo) {
            this.Camera2StreamConfigurationMap = touchDelegateInfo;
        }

        public final int getRegionCount() {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return this.Camera2StreamConfigurationMap.getRegionCount();
            }
            return 0;
        }

        public final android.graphics.Region getRegionAt(int i) {
            if (android.os.Build.VERSION.SDK_INT >= 29) {
                return this.Camera2StreamConfigurationMap.getRegionAt(i);
            }
            return null;
        }

        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTargetForRegion(android.graphics.Region region) {
            android.view.accessibility.AccessibilityNodeInfo targetForRegion;
            if (android.os.Build.VERSION.SDK_INT < 29 || (targetForRegion = this.Camera2StreamConfigurationMap.getTargetForRegion(region)) == null) {
                return null;
            }
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(targetForRegion);
        }
    }

    /* loaded from: classes7.dex */
    public static final class SelectionPositionCompat {
        final android.view.accessibility.AccessibilityNodeInfo.SelectionPosition Camera2StreamConfigurationMap;

        public SelectionPositionCompat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i) {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                this.Camera2StreamConfigurationMap = new android.view.accessibility.AccessibilityNodeInfo.SelectionPosition(accessibilityNodeInfoCompat.unwrap(), i);
            } else {
                this.Camera2StreamConfigurationMap = null;
            }
        }

        public SelectionPositionCompat(android.view.View view, int i) {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                this.Camera2StreamConfigurationMap = new android.view.accessibility.AccessibilityNodeInfo.SelectionPosition(view, i);
            } else {
                this.Camera2StreamConfigurationMap = null;
            }
        }

        public SelectionPositionCompat(android.view.View view, int i, int i2) {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                this.Camera2StreamConfigurationMap = new android.view.accessibility.AccessibilityNodeInfo.SelectionPosition(view, i, i2);
            } else {
                this.Camera2StreamConfigurationMap = null;
            }
        }

        public SelectionPositionCompat(android.view.accessibility.AccessibilityNodeInfo.SelectionPosition selectionPosition) {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                this.Camera2StreamConfigurationMap = selectionPosition;
            } else {
                this.Camera2StreamConfigurationMap = null;
            }
        }

        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat getNode() {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(this.Camera2StreamConfigurationMap.getNode());
            }
            return null;
        }

        public final int getOffset() {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                return this.Camera2StreamConfigurationMap.getOffset();
            }
            return -1;
        }

        public final int hashCode() {
            android.view.accessibility.AccessibilityNodeInfo.SelectionPosition selectionPosition;
            if (!androidx.core.os.BuildCompat.isAtLeastB_1() || (selectionPosition = this.Camera2StreamConfigurationMap) == null) {
                return 0;
            }
            return selectionPosition.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            android.view.accessibility.AccessibilityNodeInfo.SelectionPosition selectionPosition;
            if (!androidx.core.os.BuildCompat.isAtLeastB_1() || (selectionPosition = this.Camera2StreamConfigurationMap) == null) {
                return false;
            }
            return selectionPosition.equals(obj);
        }
    }

    /* loaded from: classes7.dex */
    public static final class SelectionCompat {
        final android.view.accessibility.AccessibilityNodeInfo.Selection getHighSpeedVideoSizes;

        public SelectionCompat(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionPositionCompat selectionPositionCompat, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionPositionCompat selectionPositionCompat2) {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                this.getHighSpeedVideoSizes = new android.view.accessibility.AccessibilityNodeInfo.Selection(selectionPositionCompat.Camera2StreamConfigurationMap, selectionPositionCompat2.Camera2StreamConfigurationMap);
            } else {
                this.getHighSpeedVideoSizes = null;
            }
        }

        public SelectionCompat(android.view.accessibility.AccessibilityNodeInfo.Selection selection) {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                this.getHighSpeedVideoSizes = selection;
            } else {
                this.getHighSpeedVideoSizes = null;
            }
        }

        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionPositionCompat getStart() {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionPositionCompat(this.getHighSpeedVideoSizes.getStart());
            }
            return null;
        }

        public final androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionPositionCompat getEnd() {
            if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
                return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionPositionCompat(this.getHighSpeedVideoSizes.getEnd());
            }
            return null;
        }

        public final int hashCode() {
            android.view.accessibility.AccessibilityNodeInfo.Selection selection;
            if (!androidx.core.os.BuildCompat.isAtLeastB_1() || (selection = this.getHighSpeedVideoSizes) == null) {
                return 0;
            }
            return selection.hashCode();
        }

        public final boolean equals(java.lang.Object obj) {
            android.view.accessibility.AccessibilityNodeInfo.Selection selection;
            if (!androidx.core.os.BuildCompat.isAtLeastB_1() || (selection = this.getHighSpeedVideoSizes) == null) {
                return false;
            }
            return selection.equals(obj);
        }
    }

    static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighSpeedVideoSizes(java.lang.Object obj) {
        if (obj != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat(obj);
        }
        return null;
    }

    @java.lang.Deprecated
    public AccessibilityNodeInfoCompat(java.lang.Object obj) {
        this.getHighSpeedVideoSizes = (android.view.accessibility.AccessibilityNodeInfo) obj;
    }

    private AccessibilityNodeInfoCompat(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        this.getHighSpeedVideoSizes = accessibilityNodeInfo;
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat wrap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat(accessibilityNodeInfo);
    }

    public android.view.accessibility.AccessibilityNodeInfo unwrap() {
        return this.getHighSpeedVideoSizes;
    }

    @java.lang.Deprecated
    public java.lang.Object getInfo() {
        return this.getHighSpeedVideoSizes;
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(android.view.View view) {
        return wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(view));
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(android.view.View view, int i) {
        return getHighSpeedVideoSizes(android.view.accessibility.AccessibilityNodeInfo.obtain(view, i));
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain() {
        return wrap(android.view.accessibility.AccessibilityNodeInfo.obtain());
    }

    public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat obtain(androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        return wrap(android.view.accessibility.AccessibilityNodeInfo.obtain(accessibilityNodeInfoCompat.getHighSpeedVideoSizes));
    }

    public void setSource(android.view.View view) {
        this.getHighResolutionOutputSizeshNQ4ISI = -1;
        this.getHighSpeedVideoSizes.setSource(view);
    }

    public void setSource(android.view.View view, int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoSizes.setSource(view, i);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat findFocus(int i) {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.findFocus(i));
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat focusSearch(int i) {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.focusSearch(i));
    }

    public int getWindowId() {
        return this.getHighSpeedVideoSizes.getWindowId();
    }

    public int getChildCount() {
        return this.getHighSpeedVideoSizes.getChildCount();
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getChild(int i) {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getChild(i));
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getChild(int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, i, i2);
        }
        return getChild(i);
    }

    public void addChild(android.view.View view) {
        this.getHighSpeedVideoSizes.addChild(view);
    }

    public void addChild(android.view.View view, int i) {
        this.getHighSpeedVideoSizes.addChild(view, i);
    }

    public boolean removeChild(android.view.View view) {
        return this.getHighSpeedVideoSizes.removeChild(view);
    }

    public boolean removeChild(android.view.View view, int i) {
        return this.getHighSpeedVideoSizes.removeChild(view, i);
    }

    @java.lang.Deprecated
    public int getActions() {
        return this.getHighSpeedVideoSizes.getActions();
    }

    public void addAction(int i) {
        this.getHighSpeedVideoSizes.addAction(i);
    }

    private java.util.List<java.lang.Integer> Camera2StreamConfigurationMap(java.lang.String str) {
        java.util.ArrayList<java.lang.Integer> integerArrayList = this.getHighSpeedVideoSizes.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        this.getHighSpeedVideoSizes.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public void addAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        this.getHighSpeedVideoSizes.addAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.getHighResolutionOutputSizeshNQ4ISI);
    }

    public boolean removeAction(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat) {
        return this.getHighSpeedVideoSizes.removeAction((android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) accessibilityActionCompat.getHighResolutionOutputSizeshNQ4ISI);
    }

    public boolean performAction(int i) {
        return this.getHighSpeedVideoSizes.performAction(i);
    }

    public boolean performAction(int i, android.os.Bundle bundle) {
        return this.getHighSpeedVideoSizes.performAction(i, bundle);
    }

    public void setMovementGranularities(int i) {
        this.getHighSpeedVideoSizes.setMovementGranularities(i);
    }

    public int getMovementGranularities() {
        return this.getHighSpeedVideoSizes.getMovementGranularities();
    }

    public int getExpandedState() {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void setExpandedState(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, i);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", i);
        }
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByText = this.getHighSpeedVideoSizes.findAccessibilityNodeInfosByText(str);
        int size = findAccessibilityNodeInfosByText.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(wrap(findAccessibilityNodeInfosByText.get(i)));
        }
        return arrayList;
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getParent() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getParent());
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getParent(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, i);
        }
        return getParent();
    }

    public void setParent(android.view.View view) {
        this.mParentVirtualDescendantId = -1;
        this.getHighSpeedVideoSizes.setParent(view);
    }

    public void setParent(android.view.View view, int i) {
        this.mParentVirtualDescendantId = i;
        this.getHighSpeedVideoSizes.setParent(view, i);
    }

    @java.lang.Deprecated
    public void getBoundsInParent(android.graphics.Rect rect) {
        this.getHighSpeedVideoSizes.getBoundsInParent(rect);
    }

    @java.lang.Deprecated
    public void setBoundsInParent(android.graphics.Rect rect) {
        this.getHighSpeedVideoSizes.setBoundsInParent(rect);
    }

    public void getBoundsInScreen(android.graphics.Rect rect) {
        this.getHighSpeedVideoSizes.getBoundsInScreen(rect);
    }

    public void setBoundsInScreen(android.graphics.Rect rect) {
        this.getHighSpeedVideoSizes.setBoundsInScreen(rect);
    }

    public void getBoundsInWindow(android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes, rect);
            return;
        }
        android.graphics.Rect rect2 = (android.graphics.Rect) this.getHighSpeedVideoSizes.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void setBoundsInWindow(android.graphics.Rect rect) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, rect);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY", rect);
        }
    }

    public boolean isCheckable() {
        return this.getHighSpeedVideoSizes.isCheckable();
    }

    public void setCheckable(boolean z) {
        this.getHighSpeedVideoSizes.setCheckable(z);
    }

    @java.lang.Deprecated
    public boolean isChecked() {
        return this.getHighSpeedVideoSizes.isChecked();
    }

    @java.lang.Deprecated
    public void setChecked(boolean z) {
        this.getHighSpeedVideoSizes.setChecked(z);
    }

    public int getChecked() {
        if (android.os.Build.VERSION.SDK_INT < 36) {
            return this.getHighSpeedVideoSizes.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.getHighSpeedVideoSizes.isChecked() ? 1 : 0);
        }
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getOutputFormats(this.getHighSpeedVideoSizes);
    }

    public void setChecked(int i) {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, i);
            return;
        }
        if (i == 1 || i == 2 || i == 0) {
            this.getHighSpeedVideoSizes.setChecked(i == 1);
            this.getHighSpeedVideoSizes.getExtras().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", i);
            return;
        }
        throw new java.lang.IllegalArgumentException("Unknown checked argument: ".concat(java.lang.String.valueOf(i)));
    }

    public boolean isFieldRequired() {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void setFieldRequired(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, z);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY", z);
        }
    }

    public boolean isFocusable() {
        return this.getHighSpeedVideoSizes.isFocusable();
    }

    public void setFocusable(boolean z) {
        this.getHighSpeedVideoSizes.setFocusable(z);
    }

    public boolean isFocused() {
        return this.getHighSpeedVideoSizes.isFocused();
    }

    public void setFocused(boolean z) {
        this.getHighSpeedVideoSizes.setFocused(z);
    }

    public boolean isVisibleToUser() {
        return this.getHighSpeedVideoSizes.isVisibleToUser();
    }

    public void setVisibleToUser(boolean z) {
        this.getHighSpeedVideoSizes.setVisibleToUser(z);
    }

    public boolean isAccessibilityFocused() {
        return this.getHighSpeedVideoSizes.isAccessibilityFocused();
    }

    public void setAccessibilityFocused(boolean z) {
        this.getHighSpeedVideoSizes.setAccessibilityFocused(z);
    }

    public boolean isSelected() {
        return this.getHighSpeedVideoSizes.isSelected();
    }

    public void setSelected(boolean z) {
        this.getHighSpeedVideoSizes.setSelected(z);
    }

    public boolean isClickable() {
        return this.getHighSpeedVideoSizes.isClickable();
    }

    public void setClickable(boolean z) {
        this.getHighSpeedVideoSizes.setClickable(z);
    }

    public boolean isLongClickable() {
        return this.getHighSpeedVideoSizes.isLongClickable();
    }

    public void setLongClickable(boolean z) {
        this.getHighSpeedVideoSizes.setLongClickable(z);
    }

    public boolean isEnabled() {
        return this.getHighSpeedVideoSizes.isEnabled();
    }

    public void setEnabled(boolean z) {
        this.getHighSpeedVideoSizes.setEnabled(z);
    }

    public boolean isPassword() {
        return this.getHighSpeedVideoSizes.isPassword();
    }

    public void setPassword(boolean z) {
        this.getHighSpeedVideoSizes.setPassword(z);
    }

    public boolean isScrollable() {
        return this.getHighSpeedVideoSizes.isScrollable();
    }

    public void setScrollable(boolean z) {
        this.getHighSpeedVideoSizes.setScrollable(z);
    }

    public boolean isGranularScrollingSupported() {
        return getHighSpeedVideoSizes(67108864);
    }

    public void setGranularScrollingSupported(boolean z) {
        getHighSpeedVideoFpsRangesFor(67108864, z);
    }

    public boolean isTextSelectable() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        }
        return getHighSpeedVideoSizes(8388608);
    }

    public void setTextSelectable(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, z);
        } else {
            getHighSpeedVideoFpsRangesFor(8388608, z);
        }
    }

    public long getMinDurationBetweenContentChangesMillis() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY");
    }

    public void setMinDurationBetweenContentChangesMillis(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, j);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putLong("androidx.view.accessibility.AccessibilityNodeInfoCompat.MIN_DURATION_BETWEEN_CONTENT_CHANGES_KEY", j);
        }
    }

    public boolean isImportantForAccessibility() {
        return this.getHighSpeedVideoSizes.isImportantForAccessibility();
    }

    public void setImportantForAccessibility(boolean z) {
        this.getHighSpeedVideoSizes.setImportantForAccessibility(z);
    }

    public boolean isAccessibilityDataSensitive() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
        }
        return getHighSpeedVideoSizes(64);
    }

    public void setAccessibilityDataSensitive(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, z);
        } else {
            getHighSpeedVideoFpsRangesFor(64, z);
        }
    }

    public java.lang.CharSequence getPackageName() {
        return this.getHighSpeedVideoSizes.getPackageName();
    }

    public void setPackageName(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.setPackageName(charSequence);
    }

    public java.lang.CharSequence getClassName() {
        return this.getHighSpeedVideoSizes.getClassName();
    }

    public void setClassName(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.setClassName(charSequence);
    }

    public java.lang.CharSequence getText() {
        if (getHighSpeedVideoSizes()) {
            java.util.List<java.lang.Integer> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            java.util.List<java.lang.Integer> Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            java.util.List<java.lang.Integer> Camera2StreamConfigurationMap3 = Camera2StreamConfigurationMap("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            java.util.List<java.lang.Integer> Camera2StreamConfigurationMap4 = Camera2StreamConfigurationMap("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            android.text.SpannableString spannableString = new android.text.SpannableString(android.text.TextUtils.substring(this.getHighSpeedVideoSizes.getText(), 0, this.getHighSpeedVideoSizes.getText().length()));
            for (int i = 0; i < Camera2StreamConfigurationMap.size(); i++) {
                spannableString.setSpan(new androidx.core.view.accessibility.AccessibilityClickableSpanCompat(Camera2StreamConfigurationMap4.get(i).intValue(), this, getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), Camera2StreamConfigurationMap.get(i).intValue(), Camera2StreamConfigurationMap2.get(i).intValue(), Camera2StreamConfigurationMap3.get(i).intValue());
            }
            return spannableString;
        }
        return this.getHighSpeedVideoSizes.getText();
    }

    public void setText(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.setText(charSequence);
    }

    public static android.text.style.ClickableSpan[] getClickableSpans(java.lang.CharSequence charSequence) {
        if (charSequence instanceof android.text.Spanned) {
            return (android.text.style.ClickableSpan[]) ((android.text.Spanned) charSequence).getSpans(0, charSequence.length(), android.text.style.ClickableSpan.class);
        }
        return null;
    }

    private boolean getHighSpeedVideoSizes() {
        return !Camera2StreamConfigurationMap("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public java.lang.CharSequence getContentDescription() {
        return this.getHighSpeedVideoSizes.getContentDescription();
    }

    public java.lang.CharSequence getStateDescription() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api30Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void setContentDescription(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.setContentDescription(charSequence);
    }

    public void setStateDescription(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api30Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes, charSequence);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public java.lang.String getUniqueId() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void setUniqueId(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, str);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY", str);
        }
    }

    public void setContainerTitle(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, charSequence);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY", charSequence);
        }
    }

    public java.lang.CharSequence getContainerTitle() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void setViewIdResourceName(java.lang.String str) {
        this.getHighSpeedVideoSizes.setViewIdResourceName(str);
    }

    public java.lang.String getViewIdResourceName() {
        return this.getHighSpeedVideoSizes.getViewIdResourceName();
    }

    public int getLiveRegion() {
        return this.getHighSpeedVideoSizes.getLiveRegion();
    }

    public void setLiveRegion(int i) {
        this.getHighSpeedVideoSizes.setLiveRegion(i);
    }

    public int getDrawingOrder() {
        return this.getHighSpeedVideoSizes.getDrawingOrder();
    }

    public void setDrawingOrder(int i) {
        this.getHighSpeedVideoSizes.setDrawingOrder(i);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat getCollectionInfo() {
        android.view.accessibility.AccessibilityNodeInfo.CollectionInfo collectionInfo = this.getHighSpeedVideoSizes.getCollectionInfo();
        if (collectionInfo != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat(collectionInfo);
        }
        return null;
    }

    public void setCollectionInfo(java.lang.Object obj) {
        this.getHighSpeedVideoSizes.setCollectionInfo(obj == null ? null : (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) ((androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat) obj).getHighResolutionOutputSizeshNQ4ISI);
    }

    public void setCollectionItemInfo(java.lang.Object obj) {
        this.getHighSpeedVideoSizes.setCollectionItemInfo(obj == null ? null : (android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) ((androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat) obj).getHighSpeedVideoFpsRanges);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat getCollectionItemInfo() {
        android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = this.getHighSpeedVideoSizes.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat(collectionItemInfo);
        }
        return null;
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat getRangeInfo() {
        android.view.accessibility.AccessibilityNodeInfo.RangeInfo rangeInfo = this.getHighSpeedVideoSizes.getRangeInfo();
        if (rangeInfo != null) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat(rangeInfo);
        }
        return null;
    }

    public void setRangeInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.RangeInfoCompat rangeInfoCompat) {
        this.getHighSpeedVideoSizes.setRangeInfo((android.view.accessibility.AccessibilityNodeInfo.RangeInfo) rangeInfoCompat.getHighSpeedVideoFpsRangesFor);
    }

    public android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo getExtraRenderingInfo() {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api33Impl.cH_(this.getHighSpeedVideoSizes);
        }
        return null;
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionCompat getSelection() {
        android.view.accessibility.AccessibilityNodeInfo.Selection selection;
        if (!androidx.core.os.BuildCompat.isAtLeastB_1() || (selection = this.getHighSpeedVideoSizes.getSelection()) == null) {
            return null;
        }
        return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionCompat(selection);
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> getActionList() {
        java.util.List<android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction> actionList = this.getHighSpeedVideoSizes.getActionList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = actionList.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat(actionList.get(i)));
        }
        return arrayList;
    }

    public void setContentInvalid(boolean z) {
        this.getHighSpeedVideoSizes.setContentInvalid(z);
    }

    public boolean isContentInvalid() {
        return this.getHighSpeedVideoSizes.isContentInvalid();
    }

    public boolean isContextClickable() {
        return this.getHighSpeedVideoSizes.isContextClickable();
    }

    public void setContextClickable(boolean z) {
        this.getHighSpeedVideoSizes.setContextClickable(z);
    }

    public java.lang.CharSequence getHintText() {
        return this.getHighSpeedVideoSizes.getHintText();
    }

    public void setHintText(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.setHintText(charSequence);
    }

    public void setError(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.setError(charSequence);
    }

    public java.lang.CharSequence getError() {
        return this.getHighSpeedVideoSizes.getError();
    }

    public void setLabelFor(android.view.View view) {
        this.getHighSpeedVideoSizes.setLabelFor(view);
    }

    public void setLabelFor(android.view.View view, int i) {
        this.getHighSpeedVideoSizes.setLabelFor(view, i);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getLabelFor() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getLabelFor());
    }

    public void addLabeledBy(android.view.View view) {
        addLabeledBy(view, -1);
    }

    public void addLabeledBy(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT < 36) {
            setLabeledBy(view, i);
        } else {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, view, i);
        }
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> getLabeledByList() {
        if (android.os.Build.VERSION.SDK_INT < 36) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat labeledBy = getLabeledBy();
            if (labeledBy != null) {
                arrayList.add(labeledBy);
            }
            return arrayList;
        }
        return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getInputFormats(this.getHighSpeedVideoSizes);
    }

    public boolean removeLabeledBy(android.view.View view) {
        return removeLabeledBy(view, -1);
    }

    public boolean removeLabeledBy(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, view, i);
        }
        return false;
    }

    @java.lang.Deprecated
    public void setLabeledBy(android.view.View view) {
        this.getHighSpeedVideoSizes.setLabeledBy(view);
    }

    @java.lang.Deprecated
    public void setLabeledBy(android.view.View view, int i) {
        this.getHighSpeedVideoSizes.setLabeledBy(view, i);
    }

    @java.lang.Deprecated
    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getLabeledBy() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getLabeledBy());
    }

    public boolean canOpenPopup() {
        return this.getHighSpeedVideoSizes.canOpenPopup();
    }

    public void setCanOpenPopup(boolean z) {
        this.getHighSpeedVideoSizes.setCanOpenPopup(z);
    }

    public java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByViewId(java.lang.String str) {
        java.util.List<android.view.accessibility.AccessibilityNodeInfo> findAccessibilityNodeInfosByViewId = this.getHighSpeedVideoSizes.findAccessibilityNodeInfosByViewId(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<android.view.accessibility.AccessibilityNodeInfo> it = findAccessibilityNodeInfosByViewId.iterator();
        while (it.hasNext()) {
            arrayList.add(wrap(it.next()));
        }
        return arrayList;
    }

    public android.os.Bundle getExtras() {
        return this.getHighSpeedVideoSizes.getExtras();
    }

    public int getInputType() {
        return this.getHighSpeedVideoSizes.getInputType();
    }

    public void setInputType(int i) {
        this.getHighSpeedVideoSizes.setInputType(i);
    }

    public java.util.List<java.lang.String> getAvailableExtraData() {
        return this.getHighSpeedVideoSizes.getAvailableExtraData();
    }

    public void setAvailableExtraData(java.util.List<java.lang.String> list) {
        this.getHighSpeedVideoSizes.setAvailableExtraData(list);
    }

    public void setMaxTextLength(int i) {
        this.getHighSpeedVideoSizes.setMaxTextLength(i);
    }

    public int getMaxTextLength() {
        return this.getHighSpeedVideoSizes.getMaxTextLength();
    }

    public void setTextSelection(int i, int i2) {
        this.getHighSpeedVideoSizes.setTextSelection(i, i2);
    }

    public int getTextSelectionStart() {
        return this.getHighSpeedVideoSizes.getTextSelectionStart();
    }

    public int getTextSelectionEnd() {
        return this.getHighSpeedVideoSizes.getTextSelectionEnd();
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTraversalBefore() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getTraversalBefore());
    }

    public void setTraversalBefore(android.view.View view) {
        this.getHighSpeedVideoSizes.setTraversalBefore(view);
    }

    public void setTraversalBefore(android.view.View view, int i) {
        this.getHighSpeedVideoSizes.setTraversalBefore(view, i);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat getTraversalAfter() {
        return getHighSpeedVideoSizes(this.getHighSpeedVideoSizes.getTraversalAfter());
    }

    public void setTraversalAfter(android.view.View view) {
        this.getHighSpeedVideoSizes.setTraversalAfter(view);
    }

    public void setTraversalAfter(android.view.View view, int i) {
        this.getHighSpeedVideoSizes.setTraversalAfter(view, i);
    }

    public androidx.core.view.accessibility.AccessibilityWindowInfoCompat getWindow() {
        return androidx.core.view.accessibility.AccessibilityWindowInfoCompat.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes.getWindow());
    }

    public boolean isDismissable() {
        return this.getHighSpeedVideoSizes.isDismissable();
    }

    public void setDismissable(boolean z) {
        this.getHighSpeedVideoSizes.setDismissable(z);
    }

    public boolean isEditable() {
        return this.getHighSpeedVideoSizes.isEditable();
    }

    public void setEditable(boolean z) {
        this.getHighSpeedVideoSizes.setEditable(z);
    }

    public boolean isMultiLine() {
        return this.getHighSpeedVideoSizes.isMultiLine();
    }

    public void setMultiLine(boolean z) {
        this.getHighSpeedVideoSizes.setMultiLine(z);
    }

    public java.lang.CharSequence getTooltipText() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.getHighSpeedVideoSizes.getTooltipText();
        }
        return this.getHighSpeedVideoSizes.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void setTooltipText(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighSpeedVideoSizes.setTooltipText(charSequence);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY", charSequence);
        }
    }

    public void setPaneTitle(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighSpeedVideoSizes.setPaneTitle(charSequence);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public java.lang.CharSequence getPaneTitle() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.getHighSpeedVideoSizes.getPaneTitle();
        }
        return this.getHighSpeedVideoSizes.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY");
    }

    public boolean isScreenReaderFocusable() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.getHighSpeedVideoSizes.isScreenReaderFocusable();
        }
        return getHighSpeedVideoSizes(1);
    }

    public void setScreenReaderFocusable(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighSpeedVideoSizes.setScreenReaderFocusable(z);
        } else {
            getHighSpeedVideoFpsRangesFor(1, z);
        }
    }

    public void setSelection(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.SelectionCompat selectionCompat) {
        if (androidx.core.os.BuildCompat.isAtLeastB_1()) {
            if (selectionCompat == null) {
                this.getHighSpeedVideoSizes.setSelection(null);
            } else {
                this.getHighSpeedVideoSizes.setSelection(selectionCompat.getHighSpeedVideoSizes);
            }
        }
    }

    public boolean isShowingHintText() {
        return this.getHighSpeedVideoSizes.isShowingHintText();
    }

    public void setShowingHintText(boolean z) {
        this.getHighSpeedVideoSizes.setShowingHintText(z);
    }

    public boolean isHeading() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return this.getHighSpeedVideoSizes.isHeading();
        }
        if (getHighSpeedVideoSizes(2)) {
            return true;
        }
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat collectionItemInfo = getCollectionItemInfo();
        return collectionItemInfo != null && collectionItemInfo.isHeading();
    }

    public void setHeading(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.getHighSpeedVideoSizes.setHeading(z);
        } else {
            getHighSpeedVideoFpsRangesFor(2, z);
        }
    }

    public boolean isTextEntryKey() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return this.getHighSpeedVideoSizes.isTextEntryKey();
        }
        return getHighSpeedVideoSizes(8);
    }

    public void setTextEntryKey(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.getHighSpeedVideoSizes.setTextEntryKey(z);
        } else {
            getHighSpeedVideoFpsRangesFor(8, z);
        }
    }

    public boolean hasRequestInitialAccessibilityFocus() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes);
        }
        return getHighSpeedVideoSizes(32);
    }

    public void setRequestInitialAccessibilityFocus(boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoSizes, z);
        } else {
            getHighSpeedVideoFpsRangesFor(32, z);
        }
    }

    public boolean refresh() {
        return this.getHighSpeedVideoSizes.refresh();
    }

    public java.lang.CharSequence getRoleDescription() {
        return this.getHighSpeedVideoSizes.getExtras().getCharSequence("AccessibilityNodeInfo.roleDescription");
    }

    public void setRoleDescription(java.lang.CharSequence charSequence) {
        this.getHighSpeedVideoSizes.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat getTouchDelegateInfo() {
        android.view.accessibility.AccessibilityNodeInfo.TouchDelegateInfo touchDelegateInfo;
        if (android.os.Build.VERSION.SDK_INT < 29 || (touchDelegateInfo = this.getHighSpeedVideoSizes.getTouchDelegateInfo()) == null) {
            return null;
        }
        return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat(touchDelegateInfo);
    }

    public void setTouchDelegateInfo(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.TouchDelegateInfoCompat touchDelegateInfoCompat) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.getHighSpeedVideoSizes.setTouchDelegateInfo(touchDelegateInfoCompat.Camera2StreamConfigurationMap);
        }
    }

    public void setQueryFromAppProcessEnabled(android.view.View view, boolean z) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, view, z);
        }
    }

    public java.lang.CharSequence getSupplementalDescription() {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoSizes);
        }
        return this.getHighSpeedVideoSizes.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void setSupplementalDescription(java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.Api36Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoSizes, charSequence);
        } else {
            this.getHighSpeedVideoSizes.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY", charSequence);
        }
    }

    public int hashCode() {
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.getHighSpeedVideoSizes;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof androidx.core.view.accessibility.AccessibilityNodeInfoCompat)) {
            return false;
        }
        androidx.core.view.accessibility.AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = (androidx.core.view.accessibility.AccessibilityNodeInfoCompat) obj;
        android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo = this.getHighSpeedVideoSizes;
        if (accessibilityNodeInfo == null) {
            if (accessibilityNodeInfoCompat.getHighSpeedVideoSizes != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(accessibilityNodeInfoCompat.getHighSpeedVideoSizes)) {
            return false;
        }
        return this.getHighResolutionOutputSizeshNQ4ISI == accessibilityNodeInfoCompat.getHighResolutionOutputSizeshNQ4ISI && this.mParentVirtualDescendantId == accessibilityNodeInfoCompat.mParentVirtualDescendantId;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        android.graphics.Rect rect = new android.graphics.Rect();
        getBoundsInParent(rect);
        sb.append("; boundsInParent: ".concat(java.lang.String.valueOf(rect)));
        getBoundsInScreen(rect);
        sb.append("; boundsInScreen: ".concat(java.lang.String.valueOf(rect)));
        getBoundsInWindow(rect);
        sb.append("; boundsInWindow: ".concat(java.lang.String.valueOf(rect)));
        sb.append("; packageName: ");
        sb.append(getPackageName());
        sb.append("; className: ");
        sb.append(getClassName());
        sb.append("; text: ");
        sb.append(getText());
        sb.append("; error: ");
        sb.append(getError());
        sb.append("; maxTextLength: ");
        sb.append(getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(getStateDescription());
        sb.append("; contentDescription: ");
        sb.append(getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(getSupplementalDescription());
        sb.append("; tooltipText: ");
        sb.append(getTooltipText());
        sb.append("; viewIdResName: ");
        sb.append(getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(getUniqueId());
        sb.append("; checkable: ");
        sb.append(isCheckable());
        sb.append("; checked: ");
        sb.append(Camera2StreamConfigurationMap());
        sb.append("; fieldRequired: ");
        sb.append(isFieldRequired());
        sb.append("; focusable: ");
        sb.append(isFocusable());
        sb.append("; focused: ");
        sb.append(isFocused());
        sb.append("; selected: ");
        sb.append(isSelected());
        sb.append("; clickable: ");
        sb.append(isClickable());
        sb.append("; longClickable: ");
        sb.append(isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(isContextClickable());
        sb.append("; expandedState: ");
        sb.append(Camera2StreamConfigurationMap(getExpandedState()));
        sb.append("; enabled: ");
        sb.append(isEnabled());
        sb.append("; password: ");
        sb.append(isPassword());
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("; scrollable: ");
        sb2.append(isScrollable());
        sb.append(sb2.toString());
        sb.append("; containerTitle: ");
        sb.append(getContainerTitle());
        sb.append("; granularScrollingSupported: ");
        sb.append(isGranularScrollingSupported());
        sb.append("; importantForAccessibility: ");
        sb.append(isImportantForAccessibility());
        sb.append("; visible: ");
        sb.append(isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(isTextSelectable());
        sb.append("; accessibilityDataSensitive: ");
        sb.append(isAccessibilityDataSensitive());
        sb.append("; [");
        java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat> actionList = getActionList();
        for (int i = 0; i < actionList.size(); i++) {
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = actionList.get(i);
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(accessibilityActionCompat.getId());
            if (highSpeedVideoFpsRangesFor.equals("ACTION_UNKNOWN") && accessibilityActionCompat.getLabel() != null) {
                highSpeedVideoFpsRangesFor = accessibilityActionCompat.getLabel().toString();
            }
            sb.append(highSpeedVideoFpsRangesFor);
            if (i != actionList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
        android.os.Bundle extras = getExtras();
        if (extras != null) {
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", ((~i) & extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0)) | (z ? i : 0));
        }
    }

    private boolean getHighSpeedVideoSizes(int i) {
        android.os.Bundle extras = getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    private java.lang.String Camera2StreamConfigurationMap() {
        int checked = getChecked();
        if (checked == 1) {
            return "TRUE";
        }
        if (checked == 2) {
            return "PARTIAL";
        }
        return "FALSE";
    }

    static java.lang.String getHighSpeedVideoFpsRangesFor(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case android.R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case android.R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case android.R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case android.R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case android.R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case android.R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case android.R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case android.R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case android.R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case android.R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case android.R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case android.R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case android.R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case android.R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case android.R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case android.R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case android.R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case android.R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case android.R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case android.R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case android.R.id.accessibilityActionScrollInDirection:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case android.R.id.ALT:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    static java.lang.String Camera2StreamConfigurationMap(int i) {
        if (i == 0) {
            return "UNDEFINED";
        }
        if (i == 1) {
            return "COLLAPSED";
        }
        if (i == 2) {
            return "PARTIAL";
        }
        if (i == 3) {
            return "FULL";
        }
        return "UNKNOWN";
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        public static void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }

        public static java.lang.CharSequence Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static java.lang.Object getHighResolutionOutputSizeshNQ4ISI(int i, float f, float f2, float f3) {
            return new android.view.accessibility.AccessibilityNodeInfo.RangeInfo(i, f, f2, f3);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        public static android.view.accessibility.AccessibilityNodeInfo.ExtraRenderingInfo cH_(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExtraRenderingInfo();
        }

        public static boolean getHighSpeedVideoFpsRangesFor(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }

        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setTextSelectable(z);
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat Camera2StreamConfigurationMap(boolean z, int i, int i2, int i3, int i4, boolean z2, java.lang.String str, java.lang.String str2) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).build());
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighSpeedVideoSizes(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i, int i2) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoSizes(accessibilityNodeInfo.getChild(i, i2));
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            return androidx.core.view.accessibility.AccessibilityNodeInfoCompat.getHighSpeedVideoSizes(accessibilityNodeInfo.getParent(i));
        }

        public static java.lang.String Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.String str) {
            accessibilityNodeInfo.setUniqueId(str);
        }

        public static java.lang.String getHighSpeedVideoFpsRanges(java.lang.Object obj) {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getRowTitle();
        }

        public static java.lang.String getHighSpeedVideoSizes(java.lang.Object obj) {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnTitle();
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        public static boolean getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setAccessibilityDataSensitive(z);
        }

        public static java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
            accessibilityNodeInfo.setContainerTitle(charSequence);
        }

        public static void getHighSpeedVideoSizes(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.graphics.Rect rect) {
            accessibilityNodeInfo.setBoundsInWindow(rect);
        }

        public static boolean getHighSpeedVideoFpsRangesFor(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.hasRequestInitialAccessibilityFocus();
        }

        public static void getHighSpeedVideoFpsRangesFor(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setRequestInitialAccessibilityFocus(z);
        }

        public static long getHighSpeedVideoSizes(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getMinDurationBetweenContentChanges().toMillis();
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, long j) {
            accessibilityNodeInfo.setMinDurationBetweenContentChanges(java.time.Duration.ofMillis(j));
        }

        public static void getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, boolean z) {
            accessibilityNodeInfo.setQueryFromAppProcessEnabled(view, z);
        }

        public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getHighSpeedVideoFpsRangesFor() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }
    }

    /* loaded from: classes7.dex */
    static class Api35Impl {
        private Api35Impl() {
        }

        public static int Camera2StreamConfigurationMap(java.lang.Object obj) {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) obj).getItemCount();
        }

        public static int getHighResolutionOutputSizeshNQ4ISI(java.lang.Object obj) {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) obj).getImportantForAccessibilityItemCount();
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat getHighSpeedVideoFpsRanges(int i, int i2, boolean z, int i3, int i4, int i5) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat(new android.view.accessibility.AccessibilityNodeInfo.CollectionInfo.Builder().setRowCount(i).setColumnCount(i2).setHierarchical(z).setSelectionMode(i3).setItemCount(i4).setImportantForAccessibilityItemCount(i5).build());
        }
    }

    static class Api36Impl {
        private Api36Impl() {
        }

        public static int getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            accessibilityNodeInfo.setExpandedState(i);
        }

        public static boolean getHighSpeedVideoSizes(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }

        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, boolean z) {
            accessibilityNodeInfo.setFieldRequired(z);
        }

        public static java.lang.CharSequence getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, java.lang.CharSequence charSequence) {
            accessibilityNodeInfo.setSupplementalDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int getOutputFormats(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void getHighSpeedVideoFpsRanges(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, int i) {
            accessibilityNodeInfo.setChecked(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void Camera2StreamConfigurationMap(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, int i) {
            accessibilityNodeInfo.addLabeledBy(view, i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static java.util.List<androidx.core.view.accessibility.AccessibilityNodeInfoCompat> getInputFormats(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
            java.util.List<android.view.accessibility.AccessibilityNodeInfo> labeledByList = accessibilityNodeInfo.getLabeledByList();
            java.util.ArrayList arrayList = new java.util.ArrayList(labeledByList.size());
            for (android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo2 : labeledByList) {
                if (accessibilityNodeInfo2 != null) {
                    arrayList.add(androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo2));
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean getHighResolutionOutputSizeshNQ4ISI(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo, android.view.View view, int i) {
            return accessibilityNodeInfo.removeLabeledBy(view, i);
        }
    }

    static class Api36MinorImpl {
        private Api36MinorImpl() {
        }

        public static androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat getHighResolutionOutputSizeshNQ4ISI(boolean z, int i, int i2, int i3, int i4, boolean z2, java.lang.String str, java.lang.String str2, int i5) {
            return new androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat(new android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo.Builder().setHeading(z).setColumnIndex(i).setRowIndex(i2).setColumnSpan(i3).setRowSpan(i4).setSelected(z2).setRowTitle(str).setColumnTitle(str2).setSortDirection(i5).build());
        }

        public static int getHighSpeedVideoSizes(java.lang.Object obj) {
            return ((android.view.accessibility.AccessibilityNodeInfo.CollectionItemInfo) obj).getSortDirection();
        }

        public static android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction getHighSpeedVideoFpsRanges() {
            return android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_EXTENDED_SELECTION;
        }
    }
}
