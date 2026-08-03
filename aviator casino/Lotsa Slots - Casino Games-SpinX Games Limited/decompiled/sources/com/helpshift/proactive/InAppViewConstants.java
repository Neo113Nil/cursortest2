package com.helpshift.proactive;

/* loaded from: classes5.dex */
public class InAppViewConstants {
    public static final java.lang.String ACTION = "action";
    public static final java.lang.String ACTION_CONFIG = "actionConfig";
    public static final java.lang.String ANIMATE = "animate";
    public static final java.lang.String ASPECT_RATIO = "aspectRatio";
    public static final java.lang.String AUTO_DISMISS = "autoDismiss";
    public static final java.lang.String BACKGROUND = "background";
    public static final java.lang.String BIG_TEXT = "bigText";
    public static final java.lang.String BOLD_ITALICS_URL = "boldItalicsUrl";
    public static final java.lang.String BOLD_URL = "boldUrl";
    public static final java.lang.String BUTTONS = "buttons";
    public static final java.lang.String CHILDREN = "children";
    public static final java.lang.String COLOR = "color";
    public static final java.lang.String CONFIG = "config";
    public static final java.lang.String CONTENT_DESCRIPTION_CROSS = "Cross Button";
    public static final java.lang.String CROSS_BUTTON = "crossButton";
    public static final java.lang.String DEFAULT_NOTIFICATION_ENABLED = "defaultNotificationEnabled";
    public static final java.lang.String DISMISS_AFTER = "dismissAfter";
    public static final java.lang.String ELLIPSIZE = "ellipsize";
    public static final java.lang.String EXPIRY = "expiry";
    public static final java.lang.String FONTS = "fonts";
    public static final java.lang.String FONT_SIZE = "fontSize";
    public static final java.lang.String GRAVITY = "gravity";
    public static final java.lang.String HEIGHT = "height";
    public static final java.lang.String IMAGE_URL = "imageUrl";
    public static final java.lang.String IN_APP_DATA = "inAppData";
    public static final java.lang.String ITALICS_URL = "italicsUrl";
    public static final java.lang.String LANDSCAPE = "landscape";
    public static final java.lang.String LARGE_IMAGE_URL = "largeImageUrl";
    public static final java.lang.String MARGIN = "margin";
    public static final java.lang.String MAX_HEIGHT = "maxHeight";
    public static final java.lang.String MAX_LINES = "maxLines";
    public static final java.lang.String MAX_WIDTH = "maxWidth";
    public static final java.lang.String MIN_HEIGHT = "minHeight";
    public static final java.lang.String MIN_WIDTH = "minWidth";
    public static final java.lang.String ORIENTATION = "orientation";
    public static final java.lang.String ORIENTATION_HORIZONTAL = "horizontal";
    public static final java.lang.String ORIENTATION_VERTICAL = "vertical";
    public static final java.lang.String OVERFLOW = "overflow";
    public static final java.lang.String PADDING = "padding";
    public static final java.lang.String PORTRAIT = "portrait";
    public static final java.lang.String POSITION = "position";
    public static final java.lang.String POSITION_BOTTOM = "bottom";
    public static final java.lang.String POSITION_CENTER = "center";
    public static final java.lang.String POSITION_TOP = "top";
    public static final java.lang.String PRIORITY_KEY = "priority";
    public static final java.lang.String RADII = "radii";
    public static final java.lang.String RADIUS = "radius";
    public static final java.lang.String REGULAR_URL = "regularUrl";
    public static final java.lang.String RTL = "rtl";
    public static final java.lang.String SCALE_TYPE = "scaleType";
    public static final java.lang.String SCROLL = "scroll";
    public static final java.lang.String SHOW_AFTER = "showAfter";
    public static final java.lang.String STROKE_COLOR = "strokeColor";
    public static final java.lang.String STROKE_WIDTH = "strokeWidth";
    public static final java.lang.String TAB_HEIGHT = "tabHeight";
    public static final java.lang.String TAB_WIDTH = "tabWidth";
    public static final java.lang.String TEXT = "text";
    public static final java.lang.String TEXT_ALIGNMENT = "textAlignment";
    public static final java.lang.String TEXT_COLOR = "textColor";
    public static final java.lang.String TEXT_KEY = "text";
    public static final java.lang.String TITLE = "title";
    public static final java.lang.String TYPE = "type";
    public static final java.lang.String VALUE = "value";
    public static final java.lang.String VISIBILITY = "visibility";
    public static final java.lang.String WEIGHT = "weight";
    public static final java.lang.String WIDTH = "width";

    public enum InAppNotificationType {
        MODAL("modal"),
        BANNER("banner"),
        CARD("card");

        private final java.lang.String value;

        InAppNotificationType(java.lang.String str) {
            this.value = str;
        }

        public java.lang.String getValue() {
            return this.value;
        }

        public static com.helpshift.proactive.InAppViewConstants.InAppNotificationType fromString(java.lang.String str) {
            if (str == null) {
                return null;
            }
            for (com.helpshift.proactive.InAppViewConstants.InAppNotificationType inAppNotificationType : values()) {
                if (inAppNotificationType.value.equalsIgnoreCase(str)) {
                    return inAppNotificationType;
                }
            }
            return null;
        }
    }

    public enum InAppViewType {
        LAYOUT("layout"),
        TEXT("text"),
        IMAGE("image"),
        BUTTON("button");

        private final java.lang.String value;

        InAppViewType(java.lang.String str) {
            this.value = str;
        }

        public java.lang.String getValue() {
            return this.value;
        }

        public static com.helpshift.proactive.InAppViewConstants.InAppViewType fromString(java.lang.String str) {
            if (str == null) {
                return null;
            }
            for (com.helpshift.proactive.InAppViewConstants.InAppViewType inAppViewType : values()) {
                if (inAppViewType.value.equalsIgnoreCase(str)) {
                    return inAppViewType;
                }
            }
            return null;
        }
    }
}
