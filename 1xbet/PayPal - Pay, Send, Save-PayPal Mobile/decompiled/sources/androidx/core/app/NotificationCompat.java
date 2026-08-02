package androidx.core.app;

/* loaded from: classes3.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final java.lang.String CATEGORY_ALARM = "alarm";
    public static final java.lang.String CATEGORY_CALL = "call";
    public static final java.lang.String CATEGORY_EMAIL = "email";
    public static final java.lang.String CATEGORY_ERROR = "err";
    public static final java.lang.String CATEGORY_EVENT = "event";
    public static final java.lang.String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final java.lang.String CATEGORY_MESSAGE = "msg";
    public static final java.lang.String CATEGORY_MISSED_CALL = "missed_call";
    public static final java.lang.String CATEGORY_NAVIGATION = "navigation";
    public static final java.lang.String CATEGORY_PROGRESS = "progress";
    public static final java.lang.String CATEGORY_PROMO = "promo";
    public static final java.lang.String CATEGORY_RECOMMENDATION = "recommendation";
    public static final java.lang.String CATEGORY_REMINDER = "reminder";
    public static final java.lang.String CATEGORY_SERVICE = "service";
    public static final java.lang.String CATEGORY_SOCIAL = "social";
    public static final java.lang.String CATEGORY_STATUS = "status";
    public static final java.lang.String CATEGORY_STOPWATCH = "stopwatch";
    public static final java.lang.String CATEGORY_SYSTEM = "sys";
    public static final java.lang.String CATEGORY_TRANSPORT = "transport";
    public static final java.lang.String CATEGORY_VOICEMAIL = "voicemail";
    public static final java.lang.String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;
    public static final java.lang.String EXTRA_ANSWER_COLOR = "android.answerColor";
    public static final java.lang.String EXTRA_ANSWER_INTENT = "android.answerIntent";
    public static final java.lang.String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";
    public static final java.lang.String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";
    public static final java.lang.String EXTRA_BIG_TEXT = "android.bigText";
    public static final java.lang.String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";
    public static final java.lang.String EXTRA_CALL_PERSON = "android.callPerson";
    public static final java.lang.String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";
    public static final java.lang.String EXTRA_CALL_TYPE = "android.callType";
    public static final java.lang.String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";
    public static final java.lang.String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";
    public static final java.lang.String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";
    public static final java.lang.String EXTRA_COLORIZED = "android.colorized";
    public static final java.lang.String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final java.lang.String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";
    public static final java.lang.String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";
    public static final java.lang.String EXTRA_DECLINE_COLOR = "android.declineColor";
    public static final java.lang.String EXTRA_DECLINE_INTENT = "android.declineIntent";
    public static final java.lang.String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";
    public static final java.lang.String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";
    public static final java.lang.String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";
    public static final java.lang.String EXTRA_INFO_TEXT = "android.infoText";
    public static final java.lang.String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";
    public static final java.lang.String EXTRA_LARGE_ICON = "android.largeIcon";
    public static final java.lang.String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";
    public static final java.lang.String EXTRA_MEDIA_SESSION = "android.mediaSession";
    public static final java.lang.String EXTRA_MESSAGES = "android.messages";
    public static final java.lang.String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";
    public static final java.lang.String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";
    public static final java.lang.String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @java.lang.Deprecated
    public static final java.lang.String EXTRA_PEOPLE = "android.people";
    public static final java.lang.String EXTRA_PEOPLE_LIST = "android.people.list";
    public static final java.lang.String EXTRA_PICTURE = "android.picture";
    public static final java.lang.String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";
    public static final java.lang.String EXTRA_PICTURE_ICON = "android.pictureIcon";
    public static final java.lang.String EXTRA_PROGRESS = "android.progress";
    public static final java.lang.String EXTRA_PROGRESS_END_ICON = "android.progressEndIcon";
    public static final java.lang.String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";
    public static final java.lang.String EXTRA_PROGRESS_MAX = "android.progressMax";
    public static final java.lang.String EXTRA_PROGRESS_POINTS = "android.progressPoints";
    public static final java.lang.String EXTRA_PROGRESS_SEGMENTS = "android.progressSegments";
    public static final java.lang.String EXTRA_PROGRESS_START_ICON = "android.progressStartIcon";
    public static final java.lang.String EXTRA_PROGRESS_TRACKER_ICON = "android.progressTrackerIcon";
    public static final java.lang.String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";
    public static final java.lang.String EXTRA_REQUEST_PROMOTED_ONGOING = "android.requestPromotedOngoing";
    public static final java.lang.String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";
    public static final java.lang.String EXTRA_SHORT_CRITICAL_TEXT = "android.shortCriticalText";
    public static final java.lang.String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";
    public static final java.lang.String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";
    public static final java.lang.String EXTRA_SHOW_WHEN = "android.showWhen";
    public static final java.lang.String EXTRA_SMALL_ICON = "android.icon";
    public static final java.lang.String EXTRA_STYLED_BY_PROGRESS = "android.styledByProgress";
    public static final java.lang.String EXTRA_SUB_TEXT = "android.subText";
    public static final java.lang.String EXTRA_SUMMARY_TEXT = "android.summaryText";
    public static final java.lang.String EXTRA_TEMPLATE = "android.template";
    public static final java.lang.String EXTRA_TEXT = "android.text";
    public static final java.lang.String EXTRA_TEXT_LINES = "android.textLines";
    public static final java.lang.String EXTRA_TITLE = "android.title";
    public static final java.lang.String EXTRA_TITLE_BIG = "android.title.big";
    public static final java.lang.String EXTRA_VERIFICATION_ICON = "android.verificationIcon";
    public static final java.lang.String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";
    public static final java.lang.String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @java.lang.Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final java.lang.String GROUP_KEY_SILENT = "silent";
    public static final java.lang.String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface BadgeIconType {
    }

    /* loaded from: classes7.dex */
    public interface Extender {
        androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface GroupAlertBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NotificationVisibility {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ServiceNotificationBehavior {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    public static class Builder {
        boolean AMEXKernel;
        long AMEXKernelCallback;
        int AMEXKernelJNI;
        boolean AMEXKernela;
        java.util.ArrayList<androidx.core.app.NotificationCompat.Action> ArtificialStackFrames;
        int Camera2StreamConfigurationMap;
        android.widget.RemoteViews CoroutineDebuggingKt;
        int _BOUNDARY;
        int _CREATION;

        /* renamed from: a, reason: collision with root package name */
        int f2730a;
        boolean accessartificialFrame;
        androidx.core.content.LocusIdCompat b;
        android.app.Notification c;
        boolean coroutineBoundary;
        androidx.core.graphics.drawable.IconCompat coroutineCreation;
        java.lang.CharSequence[] d;
        java.lang.Object exchange;
        boolean freeTransaction;
        android.app.Notification getARTIFICIAL_FRAME_PACKAGE_NAME;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        android.widget.RemoteViews getHighSpeedVideoFpsRanges;
        androidx.core.app.NotificationCompat.BubbleMetadata getHighSpeedVideoFpsRangesFor;
        java.lang.String getHighSpeedVideoSizes;
        int getHighSpeedVideoSizesFor;
        boolean getInputFormats;
        boolean getInputSizeshNQ4ISI;
        boolean getOutputFormats;
        java.lang.String getOutputMinFrameDuration;
        java.lang.CharSequence getOutputMinFrameDurationlomOqCM;
        android.app.PendingIntent getOutputSizes;
        android.widget.RemoteViews getOutputSizeshNQ4ISI;
        java.lang.CharSequence getOutputStallDuration;
        java.lang.CharSequence getOutputStallDurationlomOqCM;
        int getValidOutputFormatsForInputhNQ4ISI;
        int init;
        android.app.PendingIntent isOutputSupportedFor;
        int isOutputSupportedForhNQ4ISI;
        java.lang.CharSequence kernelVersion;
        android.widget.RemoteViews l;
        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> mActions;
        public android.content.Context mContext;

        @java.lang.Deprecated
        public java.util.ArrayList<java.lang.String> mPeople;
        public java.util.ArrayList<androidx.core.app.Person> mPersonList;
        boolean release;
        androidx.core.app.NotificationCompat.Style requestGoOnline;
        java.lang.String requestPINEntry;
        java.lang.String resetTransaction;
        java.lang.String startTransaction;
        android.os.Bundle toString;
        java.lang.String unwrapAs;
        java.lang.CharSequence updateUI;

        public Builder(android.content.Context context, android.app.Notification notification) {
            this(context, androidx.core.app.NotificationCompat.getChannelId(notification));
            java.util.ArrayList parcelableArrayList;
            android.os.Bundle bundle = notification.extras;
            androidx.core.app.NotificationCompat.Style extractStyleFromNotification = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(notification);
            setContentTitle(androidx.core.app.NotificationCompat.getContentTitle(notification)).setContentText(androidx.core.app.NotificationCompat.getContentText(notification)).setContentInfo(androidx.core.app.NotificationCompat.getContentInfo(notification)).setSubText(androidx.core.app.NotificationCompat.getSubText(notification)).setSettingsText(androidx.core.app.NotificationCompat.getSettingsText(notification)).setStyle(extractStyleFromNotification).setGroup(androidx.core.app.NotificationCompat.getGroup(notification)).setGroupSummary(androidx.core.app.NotificationCompat.isGroupSummary(notification)).setLocusId(androidx.core.app.NotificationCompat.getLocusId(notification)).setWhen(notification.when).setShowWhen(androidx.core.app.NotificationCompat.getShowWhen(notification)).setUsesChronometer(androidx.core.app.NotificationCompat.getUsesChronometer(notification)).setAutoCancel(androidx.core.app.NotificationCompat.getAutoCancel(notification)).setOnlyAlertOnce(androidx.core.app.NotificationCompat.getOnlyAlertOnce(notification)).setOngoing(androidx.core.app.NotificationCompat.getOngoing(notification)).setLocalOnly(androidx.core.app.NotificationCompat.getLocalOnly(notification)).setLargeIcon(notification.largeIcon).setBadgeIconType(androidx.core.app.NotificationCompat.getBadgeIconType(notification)).setCategory(androidx.core.app.NotificationCompat.getCategory(notification)).setBubbleMetadata(androidx.core.app.NotificationCompat.getBubbleMetadata(notification)).setNumber(notification.number).setTicker(notification.tickerText).setContentIntent(notification.contentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(notification.fullScreenIntent, androidx.core.app.NotificationCompat.Camera2StreamConfigurationMap(notification)).setSound(notification.sound, notification.audioStreamType).setSilent(androidx.core.app.NotificationCompat.getHighSpeedVideoSizes(notification)).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setDefaults(notification.defaults).setPriority(notification.priority).setColor(androidx.core.app.NotificationCompat.getColor(notification)).setVisibility(androidx.core.app.NotificationCompat.getVisibility(notification)).setPublicVersion(androidx.core.app.NotificationCompat.getPublicVersion(notification)).setSortKey(androidx.core.app.NotificationCompat.getSortKey(notification)).setTimeoutAfter(androidx.core.app.NotificationCompat.getTimeoutAfter(notification)).setShortcutId(androidx.core.app.NotificationCompat.getShortcutId(notification)).setProgress(bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_MAX), bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS), bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE)).setAllowSystemGeneratedContextualActions(androidx.core.app.NotificationCompat.getAllowSystemGeneratedContextualActions(notification)).setSmallIcon(notification.icon, notification.iconLevel).addExtras(getHighSpeedVideoFpsRangesFor(notification, extractStyleFromNotification));
            this.exchange = notification.getSmallIcon();
            android.graphics.drawable.Icon largeIcon = notification.getLargeIcon();
            if (largeIcon != null) {
                this.coroutineCreation = androidx.core.graphics.drawable.IconCompat.createFromIcon(largeIcon);
            }
            if (notification.actions != null && notification.actions.length != 0) {
                for (android.app.Notification.Action action : notification.actions) {
                    addAction(androidx.core.app.NotificationCompat.Action.Builder.fromAndroidAction(action).build());
                }
            }
            java.util.List<androidx.core.app.NotificationCompat.Action> invisibleActions = androidx.core.app.NotificationCompat.getInvisibleActions(notification);
            if (!invisibleActions.isEmpty()) {
                java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = invisibleActions.iterator();
                while (it.hasNext()) {
                    addInvisibleAction(it.next());
                }
            }
            java.lang.String[] stringArray = notification.extras.getStringArray(androidx.core.app.NotificationCompat.EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (java.lang.String str : stringArray) {
                    addPerson(str);
                }
            }
            if (android.os.Build.VERSION.SDK_INT >= 28 && (parcelableArrayList = notification.extras.getParcelableArrayList(androidx.core.app.NotificationCompat.EXTRA_PEOPLE_LIST)) != null && !parcelableArrayList.isEmpty()) {
                java.util.Iterator it2 = parcelableArrayList.iterator();
                while (it2.hasNext()) {
                    addPerson(androidx.core.app.Person.fromAndroidPerson((android.app.Person) it2.next()));
                }
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN)) {
                setChronometerCountDown(bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN));
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_COLORIZED)) {
                setColorized(bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_COLORIZED));
            }
            if (android.os.Build.VERSION.SDK_INT < 36 || !bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT)) {
                return;
            }
            setShortCriticalText(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT));
        }

        private static android.os.Bundle getHighSpeedVideoFpsRangesFor(android.app.Notification notification, androidx.core.app.NotificationCompat.Style style) {
            if (notification.extras == null) {
                return null;
            }
            android.os.Bundle bundle = new android.os.Bundle(notification.extras);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TITLE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_INFO_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SUB_TEXT);
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT);
            }
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CHANNEL_ID);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CHANNEL_GROUP_ID);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SHOW_WHEN);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_MAX);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_COLORIZED);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PEOPLE_LIST);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PEOPLE);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_SORT_KEY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_KEY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_GROUP_SUMMARY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_LOCAL_ONLY);
            bundle.remove(androidx.core.app.NotificationCompatExtras.EXTRA_ACTION_EXTRAS);
            android.os.Bundle bundle2 = bundle.getBundle("android.car.EXTENSIONS");
            if (bundle2 != null) {
                android.os.Bundle bundle3 = new android.os.Bundle(bundle2);
                bundle3.remove("invisible_actions");
                bundle.putBundle("android.car.EXTENSIONS", bundle3);
            }
            if (style != null) {
                style.clearCompatExtraKeys(bundle);
            }
            return bundle;
        }

        public Builder(android.content.Context context, java.lang.String str) {
            this.mActions = new java.util.ArrayList<>();
            this.mPersonList = new java.util.ArrayList<>();
            this.ArtificialStackFrames = new java.util.ArrayList<>();
            this.release = true;
            this.coroutineBoundary = false;
            this.getHighSpeedVideoSizesFor = 0;
            this.AMEXKernelJNI = 0;
            this.Camera2StreamConfigurationMap = 0;
            this.getValidOutputFormatsForInputhNQ4ISI = 0;
            this.isOutputSupportedForhNQ4ISI = 0;
            android.app.Notification notification = new android.app.Notification();
            this.getARTIFICIAL_FRAME_PACKAGE_NAME = notification;
            this.mContext = context;
            this.getOutputMinFrameDuration = str;
            notification.when = java.lang.System.currentTimeMillis();
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.audioStreamType = -1;
            this.f2730a = 0;
            this.mPeople = new java.util.ArrayList<>();
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }

        @java.lang.Deprecated
        public Builder(android.content.Context context) {
            this(context, (java.lang.String) null);
        }

        public androidx.core.app.NotificationCompat.Builder setWhen(long j) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.when = j;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShowWhen(boolean z) {
            this.release = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.exchange = iconCompat.toIcon(this.mContext);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setUsesChronometer(boolean z) {
            this.freeTransaction = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setChronometerCountDown(boolean z) {
            this.getInputSizeshNQ4ISI = z;
            getExtras().putBoolean(androidx.core.app.NotificationCompat.EXTRA_CHRONOMETER_COUNT_DOWN, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int i) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.icon = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSmallIcon(int i, int i2) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.icon = i;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.iconLevel = i2;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setNotificationSilent() {
            this.AMEXKernela = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSilent(boolean z) {
            this.AMEXKernela = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentTitle(java.lang.CharSequence charSequence) {
            this.getOutputStallDurationlomOqCM = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentText(java.lang.CharSequence charSequence) {
            this.getOutputMinFrameDurationlomOqCM = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSubText(java.lang.CharSequence charSequence) {
            this.updateUI = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSettingsText(java.lang.CharSequence charSequence) {
            this.kernelVersion = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setRemoteInputHistory(java.lang.CharSequence[] charSequenceArr) {
            this.d = charSequenceArr;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setNumber(int i) {
            this._CREATION = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentInfo(java.lang.CharSequence charSequence) {
            this.getOutputStallDuration = limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShortCriticalText(java.lang.String str) {
            this.startTransaction = str;
            if (android.os.Build.VERSION.SDK_INT < 36) {
                getExtras().putString(androidx.core.app.NotificationCompat.EXTRA_SHORT_CRITICAL_TEXT, str);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setRequestPromotedOngoing(boolean z) {
            getExtras().putBoolean(androidx.core.app.NotificationCompat.EXTRA_REQUEST_PROMOTED_ONGOING, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setProgress(int i, int i2, boolean z) {
            this.init = i;
            this._BOUNDARY = i2;
            this.AMEXKernel = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContent(android.widget.RemoteViews remoteViews) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.contentView = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setContentIntent(android.app.PendingIntent pendingIntent) {
            this.getOutputSizes = pendingIntent;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setDeleteIntent(android.app.PendingIntent pendingIntent) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.deleteIntent = pendingIntent;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setFullScreenIntent(android.app.PendingIntent pendingIntent, boolean z) {
            this.isOutputSupportedFor = pendingIntent;
            Camera2StreamConfigurationMap(128, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence charSequence) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.tickerText = limitCharSequenceLength(charSequence);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder setTicker(java.lang.CharSequence charSequence, android.widget.RemoteViews remoteViews) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.tickerText = limitCharSequenceLength(charSequence);
            this.l = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.Bitmap bitmap) {
            this.coroutineCreation = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.createWithBitmap(androidx.core.app.NotificationCompat.reduceLargeIconSize(this.mContext, bitmap));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLargeIcon(android.graphics.drawable.Icon icon) {
            this.coroutineCreation = icon == null ? null : androidx.core.graphics.drawable.IconCompat.createFromIcon(icon);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri uri) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.sound = uri;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.audioStreamType = -1;
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(4).setUsage(5);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.audioAttributes = usage.build();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSound(android.net.Uri uri, int i) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.sound = uri;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.audioStreamType = i;
            android.media.AudioAttributes.Builder legacyStreamType = new android.media.AudioAttributes.Builder().setContentType(4).setLegacyStreamType(i);
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.audioAttributes = legacyStreamType.build();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setVibrate(long[] jArr) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.vibrate = jArr;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLights(int i, int i2, int i3) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.ledARGB = i;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.ledOnMS = i2;
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.ledOffMS = i3;
            int i4 = (this.getARTIFICIAL_FRAME_PACKAGE_NAME.ledOnMS == 0 || this.getARTIFICIAL_FRAME_PACKAGE_NAME.ledOffMS == 0) ? 0 : 1;
            android.app.Notification notification = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
            notification.flags = i4 | (notification.flags & (-2));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setOngoing(boolean z) {
            Camera2StreamConfigurationMap(2, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setColorized(boolean z) {
            this.getOutputFormats = z;
            this.getInputFormats = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setOnlyAlertOnce(boolean z) {
            Camera2StreamConfigurationMap(8, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setAutoCancel(boolean z) {
            Camera2StreamConfigurationMap(16, z);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLocalOnly(boolean z) {
            this.coroutineBoundary = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setCategory(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setDefaults(int i) {
            this.getARTIFICIAL_FRAME_PACKAGE_NAME.defaults = i;
            if ((i & 4) != 0) {
                this.getARTIFICIAL_FRAME_PACKAGE_NAME.flags |= 1;
            }
            return this;
        }

        private void Camera2StreamConfigurationMap(int i, boolean z) {
            if (z) {
                android.app.Notification notification = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                notification.flags = i | notification.flags;
            } else {
                android.app.Notification notification2 = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public androidx.core.app.NotificationCompat.Builder setPriority(int i) {
            this.f2730a = i;
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.Builder addPerson(java.lang.String str) {
            if (str != null && !str.isEmpty()) {
                this.mPeople.add(str);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addPerson(androidx.core.app.Person person) {
            if (person != null) {
                this.mPersonList.add(person);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder clearPeople() {
            this.mPersonList.clear();
            this.mPeople.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setGroup(java.lang.String str) {
            this.unwrapAs = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setGroupSummary(boolean z) {
            this.accessartificialFrame = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setSortKey(java.lang.String str) {
            this.requestPINEntry = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addExtras(android.os.Bundle bundle) {
            if (bundle != null) {
                android.os.Bundle bundle2 = this.toString;
                if (bundle2 == null) {
                    this.toString = new android.os.Bundle(bundle);
                    return this;
                }
                bundle2.putAll(bundle);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setExtras(android.os.Bundle bundle) {
            this.toString = bundle;
            return this;
        }

        public android.os.Bundle getExtras() {
            if (this.toString == null) {
                this.toString = new android.os.Bundle();
            }
            return this.toString;
        }

        public androidx.core.app.NotificationCompat.Builder addAction(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this.mActions.add(new androidx.core.app.NotificationCompat.Action(i, charSequence, pendingIntent));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addAction(androidx.core.app.NotificationCompat.Action action) {
            if (action != null) {
                this.mActions.add(action);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder clearActions() {
            this.mActions.clear();
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this.ArtificialStackFrames.add(new androidx.core.app.NotificationCompat.Action(i, charSequence, pendingIntent));
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder addInvisibleAction(androidx.core.app.NotificationCompat.Action action) {
            if (action != null) {
                this.ArtificialStackFrames.add(action);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder clearInvisibleActions() {
            this.ArtificialStackFrames.clear();
            android.os.Bundle bundle = this.toString.getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                android.os.Bundle bundle2 = new android.os.Bundle(bundle);
                bundle2.remove("invisible_actions");
                this.toString.putBundle("android.car.EXTENSIONS", bundle2);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setStyle(androidx.core.app.NotificationCompat.Style style) {
            if (this.requestGoOnline != style) {
                this.requestGoOnline = style;
                if (style != null) {
                    style.setBuilder(this);
                }
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setColor(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setVisibility(int i) {
            this.AMEXKernelJNI = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setPublicVersion(android.app.Notification notification) {
            this.c = notification;
            return this;
        }

        private boolean getHighSpeedVideoFpsRangesFor() {
            androidx.core.app.NotificationCompat.Style style = this.requestGoOnline;
            return style == null || !style.displayCustomViewInline();
        }

        public android.widget.RemoteViews createContentView() {
            android.widget.RemoteViews makeContentView;
            if (this.getOutputSizeshNQ4ISI != null && getHighSpeedVideoFpsRangesFor()) {
                return this.getOutputSizeshNQ4ISI;
            }
            androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
            androidx.core.app.NotificationCompat.Style style = this.requestGoOnline;
            return (style == null || (makeContentView = style.makeContentView(notificationCompatBuilder)) == null) ? androidx.core.app.NotificationCompat.Builder.Api24Impl.getHighSpeedVideoFpsRanges(androidx.core.app.NotificationCompat.Builder.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(this.mContext, notificationCompatBuilder.getHighResolutionOutputSizeshNQ4ISI())) : makeContentView;
        }

        public android.widget.RemoteViews createBigContentView() {
            android.widget.RemoteViews makeBigContentView;
            if (this.getHighSpeedVideoFpsRanges != null && getHighSpeedVideoFpsRangesFor()) {
                return this.getHighSpeedVideoFpsRanges;
            }
            androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
            androidx.core.app.NotificationCompat.Style style = this.requestGoOnline;
            return (style == null || (makeBigContentView = style.makeBigContentView(notificationCompatBuilder)) == null) ? androidx.core.app.NotificationCompat.Builder.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(androidx.core.app.NotificationCompat.Builder.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(this.mContext, notificationCompatBuilder.getHighResolutionOutputSizeshNQ4ISI())) : makeBigContentView;
        }

        public android.widget.RemoteViews createHeadsUpContentView() {
            android.widget.RemoteViews makeHeadsUpContentView;
            if (this.CoroutineDebuggingKt != null && getHighSpeedVideoFpsRangesFor()) {
                return this.CoroutineDebuggingKt;
            }
            androidx.core.app.NotificationCompatBuilder notificationCompatBuilder = new androidx.core.app.NotificationCompatBuilder(this);
            androidx.core.app.NotificationCompat.Style style = this.requestGoOnline;
            return (style == null || (makeHeadsUpContentView = style.makeHeadsUpContentView(notificationCompatBuilder)) == null) ? androidx.core.app.NotificationCompat.Builder.Api24Impl.Camera2StreamConfigurationMap(androidx.core.app.NotificationCompat.Builder.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(this.mContext, notificationCompatBuilder.getHighResolutionOutputSizeshNQ4ISI())) : makeHeadsUpContentView;
        }

        public androidx.core.app.NotificationCompat.Builder setCustomContentView(android.widget.RemoteViews remoteViews) {
            this.getOutputSizeshNQ4ISI = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setCustomBigContentView(android.widget.RemoteViews remoteViews) {
            this.getHighSpeedVideoFpsRanges = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setCustomHeadsUpContentView(android.widget.RemoteViews remoteViews) {
            this.CoroutineDebuggingKt = remoteViews;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setChannelId(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setTimeoutAfter(long j) {
            this.AMEXKernelCallback = j;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutId(java.lang.String str) {
            this.resetTransaction = str;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setShortcutInfo(androidx.core.content.pm.ShortcutInfoCompat shortcutInfoCompat) {
            if (shortcutInfoCompat != null) {
                this.resetTransaction = shortcutInfoCompat.getId();
                if (this.b == null) {
                    if (shortcutInfoCompat.getLocusId() != null) {
                        this.b = shortcutInfoCompat.getLocusId();
                    } else if (shortcutInfoCompat.getId() != null) {
                        this.b = new androidx.core.content.LocusIdCompat(shortcutInfoCompat.getId());
                    }
                }
                if (this.getOutputStallDurationlomOqCM == null) {
                    setContentTitle(shortcutInfoCompat.getShortLabel());
                }
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setLocusId(androidx.core.content.LocusIdCompat locusIdCompat) {
            this.b = locusIdCompat;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setBadgeIconType(int i) {
            this.Camera2StreamConfigurationMap = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setGroupAlertBehavior(int i) {
            this.getValidOutputFormatsForInputhNQ4ISI = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setForegroundServiceBehavior(int i) {
            this.isOutputSupportedForhNQ4ISI = i;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setBubbleMetadata(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
            this.getHighSpeedVideoFpsRangesFor = bubbleMetadata;
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Extender extender) {
            extender.extend(this);
            return this;
        }

        public androidx.core.app.NotificationCompat.Builder setAllowSystemGeneratedContextualActions(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            return this;
        }

        @java.lang.Deprecated
        public android.app.Notification getNotification() {
            return build();
        }

        public android.app.Notification build() {
            return new androidx.core.app.NotificationCompatBuilder(this).getHighResolutionOutputSizeshNQ4ISI();
        }

        protected static java.lang.CharSequence limitCharSequenceLength(java.lang.CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public android.widget.RemoteViews getContentView() {
            return this.getOutputSizeshNQ4ISI;
        }

        public android.widget.RemoteViews getBigContentView() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public android.widget.RemoteViews getHeadsUpContentView() {
            return this.CoroutineDebuggingKt;
        }

        public long getWhenIfShowing() {
            if (this.release) {
                return this.getARTIFICIAL_FRAME_PACKAGE_NAME.when;
            }
            return 0L;
        }

        public int getPriority() {
            return this.f2730a;
        }

        public int getForegroundServiceBehavior() {
            return this.isOutputSupportedForhNQ4ISI;
        }

        public int getColor() {
            return this.getHighSpeedVideoSizesFor;
        }

        public androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* loaded from: classes7.dex */
        static class Api24Impl {
            private Api24Impl() {
            }

            static android.app.Notification.Builder getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, android.app.Notification notification) {
                return android.app.Notification.Builder.recoverBuilder(context, notification);
            }

            static android.widget.RemoteViews getHighSpeedVideoFpsRanges(android.app.Notification.Builder builder) {
                return builder.createContentView();
            }

            static android.widget.RemoteViews Camera2StreamConfigurationMap(android.app.Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            static android.widget.RemoteViews getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }
        }
    }

    public static abstract class Style {
        java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
        boolean getHighSpeedVideoFpsRanges = false;
        java.lang.CharSequence getHighSpeedVideoSizes;
        protected androidx.core.app.NotificationCompat.Builder mBuilder;

        private static float getHighSpeedVideoFpsRanges(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public boolean displayCustomViewInline() {
            return false;
        }

        protected java.lang.String getClassName() {
            return null;
        }

        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        public void setBuilder(androidx.core.app.NotificationCompat.Builder builder) {
            if (this.mBuilder != builder) {
                this.mBuilder = builder;
                if (builder != null) {
                    builder.setStyle(this);
                }
            }
        }

        public android.app.Notification build() {
            androidx.core.app.NotificationCompat.Builder builder = this.mBuilder;
            if (builder != null) {
                return builder.build();
            }
            return null;
        }

        public void addCompatExtras(android.os.Bundle bundle) {
            if (this.getHighSpeedVideoFpsRanges) {
                bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT, this.getHighSpeedVideoSizes);
            }
            java.lang.CharSequence charSequence = this.getHighResolutionOutputSizeshNQ4ISI;
            if (charSequence != null) {
                bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE_BIG, charSequence);
            }
            java.lang.String className = getClassName();
            if (className != null) {
                bundle.putString(androidx.core.app.NotificationCompat.EXTRA_COMPAT_TEMPLATE, className);
            }
        }

        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT)) {
                this.getHighSpeedVideoSizes = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT);
                this.getHighSpeedVideoFpsRanges = true;
            }
            this.getHighResolutionOutputSizeshNQ4ISI = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TITLE_BIG);
        }

        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SUMMARY_TEXT);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TITLE_BIG);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_COMPAT_TEMPLATE);
        }

        public static androidx.core.app.NotificationCompat.Style extractStyleFromNotification(android.app.Notification notification) {
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            if (extras == null) {
                return null;
            }
            return getHighSpeedVideoFpsRangesFor(extras);
        }

        private static androidx.core.app.NotificationCompat.Style Camera2StreamConfigurationMap(java.lang.String str) {
            if (str == null) {
                return null;
            }
            if (str.equals(android.app.Notification.BigPictureStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.BigPictureStyle();
            }
            if (str.equals(android.app.Notification.BigTextStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.BigTextStyle();
            }
            if (str.equals(android.app.Notification.InboxStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.InboxStyle();
            }
            if (android.os.Build.VERSION.SDK_INT >= 36 && str.equals(android.app.Notification.ProgressStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.ProgressStyle();
            }
            if (str.equals(android.app.Notification.MessagingStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.MessagingStyle();
            }
            if (str.equals(android.app.Notification.DecoratedCustomViewStyle.class.getName())) {
                return new androidx.core.app.NotificationCompat.DecoratedCustomViewStyle();
            }
            return null;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        static androidx.core.app.NotificationCompat.Style getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
            char c;
            if (str == null) {
                return null;
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1915466044:
                    if (str.equals("androidx.core.app.NotificationCompat$ProgressStyle")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 714386739:
                    if (str.equals("androidx.core.app.NotificationCompat$CallStyle")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return new androidx.core.app.NotificationCompat.ProgressStyle();
                case 1:
                    return new androidx.core.app.NotificationCompat.DecoratedCustomViewStyle();
                case 2:
                    return new androidx.core.app.NotificationCompat.BigPictureStyle();
                case 3:
                    return new androidx.core.app.NotificationCompat.CallStyle();
                case 4:
                    return new androidx.core.app.NotificationCompat.InboxStyle();
                case 5:
                    return new androidx.core.app.NotificationCompat.BigTextStyle();
                case 6:
                    return new androidx.core.app.NotificationCompat.MessagingStyle();
                default:
                    return null;
            }
        }

        static androidx.core.app.NotificationCompat.Style getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle) {
            androidx.core.app.NotificationCompat.Style highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_COMPAT_TEMPLATE));
            if (highResolutionOutputSizeshNQ4ISI != null) {
                return highResolutionOutputSizeshNQ4ISI;
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME) || bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                return new androidx.core.app.NotificationCompat.MessagingStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_PICTURE) || bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_PICTURE_ICON)) {
                return new androidx.core.app.NotificationCompat.BigPictureStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT)) {
                return new androidx.core.app.NotificationCompat.BigTextStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES)) {
                return new androidx.core.app.NotificationCompat.InboxStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_CALL_TYPE)) {
                return new androidx.core.app.NotificationCompat.CallStyle();
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_SEGMENTS) || bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_POINTS)) {
                return new androidx.core.app.NotificationCompat.ProgressStyle();
            }
            return Camera2StreamConfigurationMap(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_TEMPLATE));
        }

        static androidx.core.app.NotificationCompat.Style getHighSpeedVideoFpsRangesFor(android.os.Bundle bundle) {
            androidx.core.app.NotificationCompat.Style highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(bundle);
            if (highResolutionOutputSizeshNQ4ISI == null) {
                return null;
            }
            try {
                highResolutionOutputSizeshNQ4ISI.restoreFromCompatExtras(bundle);
                return highResolutionOutputSizeshNQ4ISI;
            } catch (java.lang.ClassCastException unused) {
                return null;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0117  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x01af  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01ba  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x01b1  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01aa  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public android.widget.RemoteViews applyStandardTemplate(boolean z, int i, boolean z2) {
            boolean z3;
            boolean z4;
            android.content.res.Resources resources = this.mBuilder.mContext.getResources();
            android.widget.RemoteViews remoteViews = new android.widget.RemoteViews(this.mBuilder.mContext.getPackageName(), i);
            if (this.mBuilder.coroutineCreation != null) {
                remoteViews.setViewVisibility(androidx.core.R.id.icon, 0);
                remoteViews.setImageViewBitmap(androidx.core.R.id.icon, getHighSpeedVideoFpsRanges(this.mBuilder.coroutineCreation, 0));
                if (z && this.mBuilder.getARTIFICIAL_FRAME_PACKAGE_NAME.icon != 0) {
                    int dimensionPixelSize = resources.getDimensionPixelSize(androidx.core.R.dimen.notification_right_icon_size);
                    remoteViews.setImageViewBitmap(androidx.core.R.id.right_icon, Camera2StreamConfigurationMap(this.mBuilder.getARTIFICIAL_FRAME_PACKAGE_NAME.icon, dimensionPixelSize, dimensionPixelSize - (resources.getDimensionPixelSize(androidx.core.R.dimen.notification_small_icon_background_padding) * 2), this.mBuilder.getColor()));
                    remoteViews.setViewVisibility(androidx.core.R.id.right_icon, 0);
                }
            } else if (z && this.mBuilder.getARTIFICIAL_FRAME_PACKAGE_NAME.icon != 0) {
                remoteViews.setViewVisibility(androidx.core.R.id.icon, 0);
                remoteViews.setImageViewBitmap(androidx.core.R.id.icon, Camera2StreamConfigurationMap(this.mBuilder.getARTIFICIAL_FRAME_PACKAGE_NAME.icon, resources.getDimensionPixelSize(androidx.core.R.dimen.notification_large_icon_width) - resources.getDimensionPixelSize(androidx.core.R.dimen.notification_big_circle_margin), resources.getDimensionPixelSize(androidx.core.R.dimen.notification_small_icon_size_as_large), this.mBuilder.getColor()));
            }
            if (this.mBuilder.getOutputStallDurationlomOqCM != null) {
                remoteViews.setTextViewText(androidx.core.R.id.title, this.mBuilder.getOutputStallDurationlomOqCM);
            }
            boolean z5 = true;
            if (this.mBuilder.getOutputMinFrameDurationlomOqCM != null) {
                remoteViews.setTextViewText(androidx.core.R.id.text, this.mBuilder.getOutputMinFrameDurationlomOqCM);
                z3 = true;
            } else {
                z3 = false;
            }
            if (this.mBuilder.getOutputStallDuration != null) {
                remoteViews.setTextViewText(androidx.core.R.id.info, this.mBuilder.getOutputStallDuration);
                remoteViews.setViewVisibility(androidx.core.R.id.info, 0);
            } else if (this.mBuilder._CREATION > 0) {
                if (this.mBuilder._CREATION > resources.getInteger(androidx.core.R.integer.status_bar_notification_info_maxnum)) {
                    remoteViews.setTextViewText(androidx.core.R.id.info, resources.getString(androidx.core.R.string.status_bar_notification_info_overflow));
                } else {
                    remoteViews.setTextViewText(androidx.core.R.id.info, java.text.NumberFormat.getIntegerInstance().format(this.mBuilder._CREATION));
                }
                remoteViews.setViewVisibility(androidx.core.R.id.info, 0);
            } else {
                remoteViews.setViewVisibility(androidx.core.R.id.info, 8);
                z4 = false;
                if (this.mBuilder.updateUI != null) {
                    remoteViews.setTextViewText(androidx.core.R.id.text, this.mBuilder.updateUI);
                    if (this.mBuilder.getOutputMinFrameDurationlomOqCM != null) {
                        remoteViews.setTextViewText(androidx.core.R.id.text2, this.mBuilder.getOutputMinFrameDurationlomOqCM);
                        remoteViews.setViewVisibility(androidx.core.R.id.text2, 0);
                        if (z2) {
                            remoteViews.setTextViewTextSize(androidx.core.R.id.text, 0, resources.getDimensionPixelSize(androidx.core.R.dimen.notification_subtext_size));
                        }
                        remoteViews.setViewPadding(androidx.core.R.id.line1, 0, 0, 0, 0);
                    } else {
                        remoteViews.setViewVisibility(androidx.core.R.id.text2, 8);
                    }
                }
                if (this.mBuilder.getWhenIfShowing() != 0) {
                    z5 = z4;
                } else if (this.mBuilder.freeTransaction) {
                    remoteViews.setViewVisibility(androidx.core.R.id.chronometer, 0);
                    remoteViews.setLong(androidx.core.R.id.chronometer, "setBase", this.mBuilder.getWhenIfShowing() + (android.os.SystemClock.elapsedRealtime() - java.lang.System.currentTimeMillis()));
                    remoteViews.setBoolean(androidx.core.R.id.chronometer, "setStarted", true);
                    if (this.mBuilder.getInputSizeshNQ4ISI) {
                        androidx.core.app.NotificationCompat.Style.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(remoteViews, androidx.core.R.id.chronometer, this.mBuilder.getInputSizeshNQ4ISI);
                    }
                } else {
                    remoteViews.setViewVisibility(androidx.core.R.id.time, 0);
                    remoteViews.setLong(androidx.core.R.id.time, "setTime", this.mBuilder.getWhenIfShowing());
                }
                remoteViews.setViewVisibility(androidx.core.R.id.right_side, !z5 ? 0 : 8);
                remoteViews.setViewVisibility(androidx.core.R.id.line3, z3 ? 0 : 8);
                return remoteViews;
            }
            z3 = true;
            z4 = true;
            if (this.mBuilder.updateUI != null) {
            }
            if (this.mBuilder.getWhenIfShowing() != 0) {
            }
            remoteViews.setViewVisibility(androidx.core.R.id.right_side, !z5 ? 0 : 8);
            remoteViews.setViewVisibility(androidx.core.R.id.line3, z3 ? 0 : 8);
            return remoteViews;
        }

        public android.graphics.Bitmap createColoredBitmap(int i, int i2) {
            return getHighSpeedVideoSizes(i, i2, 0);
        }

        android.graphics.Bitmap getHighSpeedVideoFpsRanges(androidx.core.graphics.drawable.IconCompat iconCompat, int i) {
            return getHighResolutionOutputSizeshNQ4ISI(iconCompat, i, 0);
        }

        private android.graphics.Bitmap getHighSpeedVideoSizes(int i, int i2, int i3) {
            return getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.drawable.IconCompat.createWithResource(this.mBuilder.mContext, i), i2, i3);
        }

        private android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI(androidx.core.graphics.drawable.IconCompat iconCompat, int i, int i2) {
            android.graphics.drawable.Drawable loadDrawable = iconCompat.loadDrawable(this.mBuilder.mContext);
            int intrinsicWidth = i2 == 0 ? loadDrawable.getIntrinsicWidth() : i2;
            if (i2 == 0) {
                i2 = loadDrawable.getIntrinsicHeight();
            }
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(intrinsicWidth, i2, android.graphics.Bitmap.Config.ARGB_8888);
            loadDrawable.setBounds(0, 0, intrinsicWidth, i2);
            if (i != 0) {
                loadDrawable.mutate().setColorFilter(new android.graphics.PorterDuffColorFilter(i, android.graphics.PorterDuff.Mode.SRC_IN));
            }
            loadDrawable.draw(new android.graphics.Canvas(createBitmap));
            return createBitmap;
        }

        private android.graphics.Bitmap Camera2StreamConfigurationMap(int i, int i2, int i3, int i4) {
            int i5 = androidx.core.R.drawable.notification_icon_background;
            if (i4 == 0) {
                i4 = 0;
            }
            android.graphics.Bitmap highSpeedVideoSizes = getHighSpeedVideoSizes(i5, i4, i2);
            android.graphics.Canvas canvas = new android.graphics.Canvas(highSpeedVideoSizes);
            android.graphics.drawable.Drawable mutate = this.mBuilder.mContext.getResources().getDrawable(i).mutate();
            mutate.setFilterBitmap(true);
            int i6 = (i2 - i3) / 2;
            int i7 = i3 + i6;
            mutate.setBounds(i6, i6, i7, i7);
            mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(-1, android.graphics.PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return highSpeedVideoSizes;
        }

        public void buildIntoRemoteViews(android.widget.RemoteViews remoteViews, android.widget.RemoteViews remoteViews2) {
            getHighSpeedVideoSizes(remoteViews);
            remoteViews.removeAllViews(androidx.core.R.id.notification_main_column);
            remoteViews.addView(androidx.core.R.id.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(androidx.core.R.id.notification_main_column, 0);
            remoteViews.setViewPadding(androidx.core.R.id.notification_main_column_container, 0, getHighResolutionOutputSizeshNQ4ISI(), 0, 0);
        }

        private void getHighSpeedVideoSizes(android.widget.RemoteViews remoteViews) {
            remoteViews.setViewVisibility(androidx.core.R.id.title, 8);
            remoteViews.setViewVisibility(androidx.core.R.id.text2, 8);
            remoteViews.setViewVisibility(androidx.core.R.id.text, 8);
        }

        private int getHighResolutionOutputSizeshNQ4ISI() {
            android.content.res.Resources resources = this.mBuilder.mContext.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(androidx.core.R.dimen.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(androidx.core.R.dimen.notification_top_pad_large_text);
            float highSpeedVideoFpsRanges = (getHighSpeedVideoFpsRanges(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return java.lang.Math.round(((1.0f - highSpeedVideoFpsRanges) * dimensionPixelSize) + (highSpeedVideoFpsRanges * dimensionPixelSize2));
        }

        /* loaded from: classes7.dex */
        static class Api24Impl {
            private Api24Impl() {
            }

            static void getHighResolutionOutputSizeshNQ4ISI(android.widget.RemoteViews remoteViews, int i, boolean z) {
                remoteViews.setChronometerCountDown(i, z);
            }
        }
    }

    public static class BigPictureStyle extends androidx.core.app.NotificationCompat.Style {
        private androidx.core.graphics.drawable.IconCompat Camera2StreamConfigurationMap;
        private boolean getHighSpeedVideoFpsRangesFor;
        private java.lang.CharSequence getInputFormats;
        private androidx.core.graphics.drawable.IconCompat getOutputFormats;
        private boolean getOutputMinFrameDuration;

        public BigPictureStyle() {
        }

        public BigPictureStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setBigContentTitle(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setSummaryText(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.getHighSpeedVideoFpsRanges = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle setContentDescription(java.lang.CharSequence charSequence) {
            this.getInputFormats = charSequence;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.Bitmap bitmap) {
            this.getOutputFormats = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigPicture(android.graphics.drawable.Icon icon) {
            this.getOutputFormats = androidx.core.graphics.drawable.IconCompat.createFromIcon(icon);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle showBigPictureWhenCollapsed(boolean z) {
            this.getOutputMinFrameDuration = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.Bitmap bitmap) {
            this.Camera2StreamConfigurationMap = bitmap == null ? null : androidx.core.graphics.drawable.IconCompat.createWithBitmap(bitmap);
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigPictureStyle bigLargeIcon(android.graphics.drawable.Icon icon) {
            this.Camera2StreamConfigurationMap = icon == null ? null : androidx.core.graphics.drawable.IconCompat.createFromIcon(icon);
            this.getHighSpeedVideoFpsRangesFor = true;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.BigPictureStyle bigContentTitle = new android.app.Notification.BigPictureStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.getHighResolutionOutputSizeshNQ4ISI);
            if (this.getOutputFormats != null) {
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.getHighSpeedVideoFpsRangesFor(bigContentTitle, this.getOutputFormats.toIcon(notificationBuilderWithBuilderAccessor instanceof androidx.core.app.NotificationCompatBuilder ? ((androidx.core.app.NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getHighSpeedVideoFpsRangesFor() : null));
                } else if (this.getOutputFormats.getType() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.getOutputFormats.getBitmap());
                }
            }
            if (this.getHighSpeedVideoFpsRangesFor) {
                if (this.Camera2StreamConfigurationMap == null) {
                    bigContentTitle.bigLargeIcon((android.graphics.Bitmap) null);
                } else {
                    bigContentTitle.bigLargeIcon(this.Camera2StreamConfigurationMap.toIcon(notificationBuilderWithBuilderAccessor instanceof androidx.core.app.NotificationCompatBuilder ? ((androidx.core.app.NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getHighSpeedVideoFpsRangesFor() : null));
                }
            }
            if (this.getHighSpeedVideoFpsRanges) {
                bigContentTitle.setSummaryText(this.getHighSpeedVideoSizes);
            }
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.getHighSpeedVideoFpsRanges(bigContentTitle, this.getOutputMinFrameDuration);
                androidx.core.app.NotificationCompat.BigPictureStyle.Api31Impl.getHighResolutionOutputSizeshNQ4ISI(bigContentTitle, this.getInputFormats);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_LARGE_ICON_BIG)) {
                this.Camera2StreamConfigurationMap = getHighSpeedVideoFpsRangesFor(bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_LARGE_ICON_BIG));
                this.getHighSpeedVideoFpsRangesFor = true;
            }
            this.getOutputFormats = getPictureIcon(bundle);
            this.getOutputMinFrameDuration = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        public static androidx.core.graphics.drawable.IconCompat getPictureIcon(android.os.Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            android.os.Parcelable parcelable = bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_PICTURE);
            if (parcelable != null) {
                return getHighSpeedVideoFpsRangesFor(parcelable);
            }
            return getHighSpeedVideoFpsRangesFor(bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_PICTURE_ICON));
        }

        private static androidx.core.graphics.drawable.IconCompat getHighSpeedVideoFpsRangesFor(android.os.Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof android.graphics.drawable.Icon) {
                return androidx.core.graphics.drawable.IconCompat.createFromIcon((android.graphics.drawable.Icon) parcelable);
            }
            if (parcelable instanceof android.graphics.Bitmap) {
                return androidx.core.graphics.drawable.IconCompat.createWithBitmap((android.graphics.Bitmap) parcelable);
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_LARGE_ICON_BIG);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PICTURE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PICTURE_ICON);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED);
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static void getHighSpeedVideoFpsRanges(android.app.Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }

            static void getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.BigPictureStyle bigPictureStyle, java.lang.CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void getHighSpeedVideoFpsRangesFor(android.app.Notification.BigPictureStyle bigPictureStyle, android.graphics.drawable.Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }
        }
    }

    public static class BigTextStyle extends androidx.core.app.NotificationCompat.Style {
        private java.lang.CharSequence Camera2StreamConfigurationMap;

        public BigTextStyle() {
        }

        public BigTextStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setBigContentTitle(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.BigTextStyle setSummaryText(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.getHighSpeedVideoFpsRanges = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.BigTextStyle bigText(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.BigTextStyle bigText = new android.app.Notification.BigTextStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.getHighResolutionOutputSizeshNQ4ISI).bigText(this.Camera2StreamConfigurationMap);
            if (this.getHighSpeedVideoFpsRanges) {
                bigText.setSummaryText(this.getHighSpeedVideoSizes);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.Camera2StreamConfigurationMap = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle bundle) {
            super.addCompatExtras(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_BIG_TEXT);
        }
    }

    /* loaded from: classes7.dex */
    public static class MessagingStyle extends androidx.core.app.NotificationCompat.Style {
        public static final int MAXIMUM_RETAINED_MESSAGES = 25;
        private java.lang.CharSequence Camera2StreamConfigurationMap;
        private java.lang.Boolean getHighSpeedVideoSizesFor;
        private androidx.core.app.Person getOutputFormats;
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getInputSizeshNQ4ISI = new java.util.ArrayList();
        private final java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();

        MessagingStyle() {
        }

        @java.lang.Deprecated
        public MessagingStyle(java.lang.CharSequence charSequence) {
            this.getOutputFormats = new androidx.core.app.Person.Builder().setName(charSequence).build();
        }

        public MessagingStyle(androidx.core.app.Person person) {
            if (android.text.TextUtils.isEmpty(person.getName())) {
                throw new java.lang.IllegalArgumentException("User's name must not be empty.");
            }
            this.getOutputFormats = person;
        }

        @java.lang.Deprecated
        public java.lang.CharSequence getUserDisplayName() {
            return this.getOutputFormats.getName();
        }

        public androidx.core.app.Person getUser() {
            return this.getOutputFormats;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setConversationTitle(java.lang.CharSequence charSequence) {
            this.Camera2StreamConfigurationMap = charSequence;
            return this;
        }

        public java.lang.CharSequence getConversationTitle() {
            return this.Camera2StreamConfigurationMap;
        }

        @java.lang.Deprecated
        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence charSequence, long j, java.lang.CharSequence charSequence2) {
            this.getInputSizeshNQ4ISI.add(new androidx.core.app.NotificationCompat.MessagingStyle.Message(charSequence, j, new androidx.core.app.Person.Builder().setName(charSequence2).build()));
            if (this.getInputSizeshNQ4ISI.size() > 25) {
                this.getInputSizeshNQ4ISI.remove(0);
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(java.lang.CharSequence charSequence, long j, androidx.core.app.Person person) {
            addMessage(new androidx.core.app.NotificationCompat.MessagingStyle.Message(charSequence, j, person));
            return this;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message message) {
            if (message != null) {
                this.getInputSizeshNQ4ISI.add(message);
                if (this.getInputSizeshNQ4ISI.size() > 25) {
                    this.getInputSizeshNQ4ISI.remove(0);
                }
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle addHistoricMessage(androidx.core.app.NotificationCompat.MessagingStyle.Message message) {
            if (message != null) {
                this.getHighSpeedVideoFpsRangesFor.add(message);
                if (this.getHighSpeedVideoFpsRangesFor.size() > 25) {
                    this.getHighSpeedVideoFpsRangesFor.remove(0);
                }
            }
            return this;
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getMessages() {
            return this.getInputSizeshNQ4ISI;
        }

        public java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> getHistoricMessages() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public androidx.core.app.NotificationCompat.MessagingStyle setGroupConversation(boolean z) {
            this.getHighSpeedVideoSizesFor = java.lang.Boolean.valueOf(z);
            return this;
        }

        public boolean isGroupConversation() {
            if (this.mBuilder != null && this.mBuilder.mContext.getApplicationInfo().targetSdkVersion < 28 && this.getHighSpeedVideoSizesFor == null) {
                return this.Camera2StreamConfigurationMap != null;
            }
            java.lang.Boolean bool = this.getHighSpeedVideoSizesFor;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public static androidx.core.app.NotificationCompat.MessagingStyle extractMessagingStyleFromNotification(android.app.Notification notification) {
            androidx.core.app.NotificationCompat.Style extractStyleFromNotification = androidx.core.app.NotificationCompat.Style.extractStyleFromNotification(notification);
            if (extractStyleFromNotification instanceof androidx.core.app.NotificationCompat.MessagingStyle) {
                return (androidx.core.app.NotificationCompat.MessagingStyle) extractStyleFromNotification;
            }
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.MessagingStyle highResolutionOutputSizeshNQ4ISI;
            setGroupConversation(isGroupConversation());
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                highResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl.bu_(this.getOutputFormats.toAndroidPerson());
            } else {
                highResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(this.getOutputFormats.getName());
            }
            java.util.Iterator<androidx.core.app.NotificationCompat.MessagingStyle.Message> it = this.getInputSizeshNQ4ISI.iterator();
            while (it.hasNext()) {
                androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, it.next().Camera2StreamConfigurationMap());
            }
            java.util.Iterator<androidx.core.app.NotificationCompat.MessagingStyle.Message> it2 = this.getHighSpeedVideoFpsRangesFor.iterator();
            while (it2.hasNext()) {
                androidx.core.app.NotificationCompat.MessagingStyle.Api26Impl.getHighSpeedVideoFpsRanges(highResolutionOutputSizeshNQ4ISI, it2.next().Camera2StreamConfigurationMap());
            }
            if (this.getHighSpeedVideoSizesFor.booleanValue() || android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.core.app.NotificationCompat.MessagingStyle.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(highResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
            }
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                androidx.core.app.NotificationCompat.MessagingStyle.Api28Impl.Camera2StreamConfigurationMap(highResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor.booleanValue());
            }
            highResolutionOutputSizeshNQ4ISI.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME, this.getOutputFormats.getName());
            bundle.putBundle(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER, this.getOutputFormats.toBundle());
            bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE, this.Camera2StreamConfigurationMap);
            if (this.Camera2StreamConfigurationMap != null && this.getHighSpeedVideoSizesFor.booleanValue()) {
                bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_CONVERSATION_TITLE, this.Camera2StreamConfigurationMap);
            }
            if (!this.getInputSizeshNQ4ISI.isEmpty()) {
                bundle.putParcelableArray(androidx.core.app.NotificationCompat.EXTRA_MESSAGES, androidx.core.app.NotificationCompat.MessagingStyle.Message.Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI));
            }
            if (!this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
                bundle.putParcelableArray(androidx.core.app.NotificationCompat.EXTRA_HISTORIC_MESSAGES, androidx.core.app.NotificationCompat.MessagingStyle.Message.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor));
            }
            java.lang.Boolean bool = this.getHighSpeedVideoSizesFor;
            if (bool != null) {
                bundle.putBoolean(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION, bool.booleanValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.getInputSizeshNQ4ISI.clear();
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER)) {
                this.getOutputFormats = androidx.core.app.Person.fromBundle(bundle.getBundle(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER));
            } else {
                this.getOutputFormats = new androidx.core.app.Person.Builder().setName(bundle.getString(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME)).build();
            }
            java.lang.CharSequence charSequence = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_CONVERSATION_TITLE);
            this.Camera2StreamConfigurationMap = charSequence;
            if (charSequence == null) {
                this.Camera2StreamConfigurationMap = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            }
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(androidx.core.app.NotificationCompat.EXTRA_MESSAGES);
            if (parcelableArray != null) {
                this.getInputSizeshNQ4ISI.addAll(androidx.core.app.NotificationCompat.MessagingStyle.Message.Camera2StreamConfigurationMap(parcelableArray));
            }
            android.os.Parcelable[] parcelableArray2 = bundle.getParcelableArray(androidx.core.app.NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            if (parcelableArray2 != null) {
                this.getHighSpeedVideoFpsRangesFor.addAll(androidx.core.app.NotificationCompat.MessagingStyle.Message.Camera2StreamConfigurationMap(parcelableArray2));
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION)) {
                this.getHighSpeedVideoSizesFor = java.lang.Boolean.valueOf(bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION));
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_MESSAGING_STYLE_USER);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_SELF_DISPLAY_NAME);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_CONVERSATION_TITLE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_HIDDEN_CONVERSATION_TITLE);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_MESSAGES);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_HISTORIC_MESSAGES);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_IS_GROUP_CONVERSATION);
        }

        public static final class Message {
            private java.lang.String Camera2StreamConfigurationMap;
            private android.net.Uri getHighResolutionOutputSizeshNQ4ISI;
            private final androidx.core.app.Person getHighSpeedVideoFpsRanges;
            private final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
            private android.os.Bundle getHighSpeedVideoSizes;
            private final long getInputSizeshNQ4ISI;

            public Message(java.lang.CharSequence charSequence, long j, androidx.core.app.Person person) {
                this.getHighSpeedVideoSizes = new android.os.Bundle();
                this.getHighSpeedVideoFpsRangesFor = charSequence;
                this.getInputSizeshNQ4ISI = j;
                this.getHighSpeedVideoFpsRanges = person;
            }

            @java.lang.Deprecated
            public Message(java.lang.CharSequence charSequence, long j, java.lang.CharSequence charSequence2) {
                this(charSequence, j, new androidx.core.app.Person.Builder().setName(charSequence2).build());
            }

            public final androidx.core.app.NotificationCompat.MessagingStyle.Message setData(java.lang.String str, android.net.Uri uri) {
                this.Camera2StreamConfigurationMap = str;
                this.getHighResolutionOutputSizeshNQ4ISI = uri;
                return this;
            }

            public final java.lang.CharSequence getText() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public final long getTimestamp() {
                return this.getInputSizeshNQ4ISI;
            }

            public final android.os.Bundle getExtras() {
                return this.getHighSpeedVideoSizes;
            }

            @java.lang.Deprecated
            public final java.lang.CharSequence getSender() {
                androidx.core.app.Person person = this.getHighSpeedVideoFpsRanges;
                if (person == null) {
                    return null;
                }
                return person.getName();
            }

            public final androidx.core.app.Person getPerson() {
                return this.getHighSpeedVideoFpsRanges;
            }

            public final java.lang.String getDataMimeType() {
                return this.Camera2StreamConfigurationMap;
            }

            public final android.net.Uri getDataUri() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            private android.os.Bundle getHighResolutionOutputSizeshNQ4ISI() {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.CharSequence charSequence = this.getHighSpeedVideoFpsRangesFor;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.getInputSizeshNQ4ISI);
                androidx.core.app.Person person = this.getHighSpeedVideoFpsRanges;
                if (person != null) {
                    bundle.putCharSequence("sender", person.getName());
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.bv_(this.getHighSpeedVideoFpsRanges.toAndroidPerson()));
                    } else {
                        bundle.putBundle("person", this.getHighSpeedVideoFpsRanges.toBundle());
                    }
                }
                java.lang.String str = this.Camera2StreamConfigurationMap;
                if (str != null) {
                    bundle.putString("type", str);
                }
                android.net.Uri uri = this.getHighResolutionOutputSizeshNQ4ISI;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                android.os.Bundle bundle2 = this.getHighSpeedVideoSizes;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            static android.os.Bundle[] Camera2StreamConfigurationMap(java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> list) {
                android.os.Bundle[] bundleArr = new android.os.Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).getHighResolutionOutputSizeshNQ4ISI();
                }
                return bundleArr;
            }

            static java.util.List<androidx.core.app.NotificationCompat.MessagingStyle.Message> Camera2StreamConfigurationMap(android.os.Parcelable[] parcelableArr) {
                androidx.core.app.NotificationCompat.MessagingStyle.Message highResolutionOutputSizeshNQ4ISI;
                java.util.ArrayList arrayList = new java.util.ArrayList(parcelableArr.length);
                for (android.os.Parcelable parcelable : parcelableArr) {
                    if ((parcelable instanceof android.os.Bundle) && (highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI((android.os.Bundle) parcelable)) != null) {
                        arrayList.add(highResolutionOutputSizeshNQ4ISI);
                    }
                }
                return arrayList;
            }

            static androidx.core.app.NotificationCompat.MessagingStyle.Message getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle) {
                androidx.core.app.Person build;
                try {
                    if (bundle.containsKey("text") && bundle.containsKey("time")) {
                        if (bundle.containsKey("person")) {
                            build = androidx.core.app.Person.fromBundle(bundle.getBundle("person"));
                        } else if (bundle.containsKey("sender_person") && android.os.Build.VERSION.SDK_INT >= 28) {
                            build = androidx.core.app.Person.fromAndroidPerson((android.app.Person) bundle.getParcelable("sender_person"));
                        } else {
                            build = bundle.containsKey("sender") ? new androidx.core.app.Person.Builder().setName(bundle.getCharSequence("sender")).build() : null;
                        }
                        androidx.core.app.NotificationCompat.MessagingStyle.Message message = new androidx.core.app.NotificationCompat.MessagingStyle.Message(bundle.getCharSequence("text"), bundle.getLong("time"), build);
                        if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                            message.setData(bundle.getString("type"), (android.net.Uri) bundle.getParcelable("uri"));
                        }
                        if (bundle.containsKey("extras")) {
                            message.getExtras().putAll(bundle.getBundle("extras"));
                        }
                        return message;
                    }
                } catch (java.lang.ClassCastException unused) {
                }
                return null;
            }

            final android.app.Notification.MessagingStyle.Message Camera2StreamConfigurationMap() {
                android.app.Notification.MessagingStyle.Message highSpeedVideoSizes;
                androidx.core.app.Person person = getPerson();
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    highSpeedVideoSizes = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api28Impl.bw_(getText(), getTimestamp(), person != null ? person.toAndroidPerson() : null);
                } else {
                    highSpeedVideoSizes = androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.getHighSpeedVideoSizes(getText(), getTimestamp(), person != null ? person.getName() : null);
                }
                if (getDataMimeType() != null) {
                    androidx.core.app.NotificationCompat.MessagingStyle.Message.Api24Impl.getHighSpeedVideoSizes(highSpeedVideoSizes, getDataMimeType(), getDataUri());
                }
                return highSpeedVideoSizes;
            }

            static class Api24Impl {
                private Api24Impl() {
                }

                static android.app.Notification.MessagingStyle.Message getHighSpeedVideoSizes(java.lang.CharSequence charSequence, long j, java.lang.CharSequence charSequence2) {
                    return new android.app.Notification.MessagingStyle.Message(charSequence, j, charSequence2);
                }

                static android.app.Notification.MessagingStyle.Message getHighSpeedVideoSizes(android.app.Notification.MessagingStyle.Message message, java.lang.String str, android.net.Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class Api28Impl {
                static android.os.Parcelable bv_(android.app.Person person) {
                    return person;
                }

                private Api28Impl() {
                }

                static android.app.Notification.MessagingStyle.Message bw_(java.lang.CharSequence charSequence, long j, android.app.Person person) {
                    return new android.app.Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static android.app.Notification.MessagingStyle getHighResolutionOutputSizeshNQ4ISI(java.lang.CharSequence charSequence) {
                return new android.app.Notification.MessagingStyle(charSequence);
            }

            static android.app.Notification.MessagingStyle Camera2StreamConfigurationMap(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static android.app.Notification.MessagingStyle getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.MessagingStyle messagingStyle, java.lang.CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class Api26Impl {
            private Api26Impl() {
            }

            static android.app.Notification.MessagingStyle getHighSpeedVideoFpsRanges(android.app.Notification.MessagingStyle messagingStyle, android.app.Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class Api28Impl {
            private Api28Impl() {
            }

            static android.app.Notification.MessagingStyle bu_(android.app.Person person) {
                return new android.app.Notification.MessagingStyle(person);
            }

            static android.app.Notification.MessagingStyle Camera2StreamConfigurationMap(android.app.Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }
    }

    public static class CallStyle extends androidx.core.app.NotificationCompat.Style {
        public static final int CALL_TYPE_INCOMING = 1;
        public static final int CALL_TYPE_ONGOING = 2;
        public static final int CALL_TYPE_SCREENING = 3;
        public static final int CALL_TYPE_UNKNOWN = 0;
        private java.lang.Integer Camera2StreamConfigurationMap;
        private android.app.PendingIntent getHighSpeedVideoFpsRangesFor;
        private java.lang.Integer getHighSpeedVideoSizesFor;
        private android.app.PendingIntent getInputFormats;
        private android.app.PendingIntent getInputSizeshNQ4ISI;
        private boolean getOutputFormats;
        private int getOutputMinFrameDuration;
        private androidx.core.graphics.drawable.IconCompat getOutputMinFrameDurationlomOqCM;
        private androidx.core.app.Person getOutputSizeshNQ4ISI;
        private java.lang.CharSequence getOutputStallDurationlomOqCM;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface CallType {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        public CallStyle() {
        }

        public CallStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public static androidx.core.app.NotificationCompat.CallStyle forIncomingCall(androidx.core.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
            return new androidx.core.app.NotificationCompat.CallStyle(1, person, null, (android.app.PendingIntent) java.util.Objects.requireNonNull(pendingIntent, "declineIntent is required"), (android.app.PendingIntent) java.util.Objects.requireNonNull(pendingIntent2, "answerIntent is required"));
        }

        public static androidx.core.app.NotificationCompat.CallStyle forOngoingCall(androidx.core.app.Person person, android.app.PendingIntent pendingIntent) {
            return new androidx.core.app.NotificationCompat.CallStyle(2, person, (android.app.PendingIntent) java.util.Objects.requireNonNull(pendingIntent, "hangUpIntent is required"), null, null);
        }

        public static androidx.core.app.NotificationCompat.CallStyle forScreeningCall(androidx.core.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
            return new androidx.core.app.NotificationCompat.CallStyle(3, person, (android.app.PendingIntent) java.util.Objects.requireNonNull(pendingIntent, "hangUpIntent is required"), null, (android.app.PendingIntent) java.util.Objects.requireNonNull(pendingIntent2, "answerIntent is required"));
        }

        private CallStyle(int i, androidx.core.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, android.app.PendingIntent pendingIntent3) {
            if (person == null || android.text.TextUtils.isEmpty(person.getName())) {
                throw new java.lang.IllegalArgumentException("person must have a non-empty a name");
            }
            this.getOutputMinFrameDuration = i;
            this.getOutputSizeshNQ4ISI = person;
            this.getHighSpeedVideoFpsRangesFor = pendingIntent3;
            this.getInputFormats = pendingIntent2;
            this.getInputSizeshNQ4ISI = pendingIntent;
        }

        public androidx.core.app.NotificationCompat.CallStyle setIsVideo(boolean z) {
            this.getOutputFormats = z;
            return this;
        }

        public androidx.core.app.NotificationCompat.CallStyle setVerificationIcon(android.graphics.drawable.Icon icon) {
            this.getOutputMinFrameDurationlomOqCM = icon == null ? null : androidx.core.graphics.drawable.IconCompat.createFromIcon(icon);
            return this;
        }

        public androidx.core.app.NotificationCompat.CallStyle setVerificationIcon(android.graphics.Bitmap bitmap) {
            this.getOutputMinFrameDurationlomOqCM = androidx.core.graphics.drawable.IconCompat.createWithBitmap(bitmap);
            return this;
        }

        public androidx.core.app.NotificationCompat.CallStyle setVerificationText(java.lang.CharSequence charSequence) {
            this.getOutputStallDurationlomOqCM = charSequence;
            return this;
        }

        public androidx.core.app.NotificationCompat.CallStyle setAnswerButtonColorHint(int i) {
            this.Camera2StreamConfigurationMap = java.lang.Integer.valueOf(i);
            return this;
        }

        public androidx.core.app.NotificationCompat.CallStyle setDeclineButtonColorHint(int i) {
            this.getHighSpeedVideoSizesFor = java.lang.Integer.valueOf(i);
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.getOutputMinFrameDuration = bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_CALL_TYPE);
            this.getOutputFormats = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_CALL_IS_VIDEO);
            if (android.os.Build.VERSION.SDK_INT >= 28 && bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_CALL_PERSON)) {
                this.getOutputSizeshNQ4ISI = androidx.core.app.Person.fromAndroidPerson((android.app.Person) bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_CALL_PERSON));
            } else if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_CALL_PERSON_COMPAT)) {
                this.getOutputSizeshNQ4ISI = androidx.core.app.Person.fromBundle(bundle.getBundle(androidx.core.app.NotificationCompat.EXTRA_CALL_PERSON_COMPAT));
            }
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_ICON)) {
                this.getOutputMinFrameDurationlomOqCM = androidx.core.graphics.drawable.IconCompat.createFromIcon((android.graphics.drawable.Icon) bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_ICON));
            } else if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT)) {
                this.getOutputMinFrameDurationlomOqCM = androidx.core.graphics.drawable.IconCompat.createFromBundle(bundle.getBundle(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_ICON_COMPAT));
            }
            this.getOutputStallDurationlomOqCM = bundle.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_TEXT);
            this.getHighSpeedVideoFpsRangesFor = (android.app.PendingIntent) bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_ANSWER_INTENT);
            this.getInputFormats = (android.app.PendingIntent) bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_DECLINE_INTENT);
            this.getInputSizeshNQ4ISI = (android.app.PendingIntent) bundle.getParcelable(androidx.core.app.NotificationCompat.EXTRA_HANG_UP_INTENT);
            this.Camera2StreamConfigurationMap = bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_ANSWER_COLOR) ? java.lang.Integer.valueOf(bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_ANSWER_COLOR)) : null;
            this.getHighSpeedVideoSizesFor = bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_DECLINE_COLOR) ? java.lang.Integer.valueOf(bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_DECLINE_COLOR)) : null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle bundle) {
            super.addCompatExtras(bundle);
            bundle.putInt(androidx.core.app.NotificationCompat.EXTRA_CALL_TYPE, this.getOutputMinFrameDuration);
            bundle.putBoolean(androidx.core.app.NotificationCompat.EXTRA_CALL_IS_VIDEO, this.getOutputFormats);
            if (this.getOutputSizeshNQ4ISI != null) {
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_CALL_PERSON, androidx.core.app.NotificationCompat.CallStyle.Api28Impl.bl_(this.getOutputSizeshNQ4ISI.toAndroidPerson()));
                } else {
                    bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_CALL_PERSON_COMPAT, this.getOutputSizeshNQ4ISI.toBundle());
                }
            }
            androidx.core.graphics.drawable.IconCompat iconCompat = this.getOutputMinFrameDurationlomOqCM;
            if (iconCompat != null) {
                bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_ICON, iconCompat.toIcon(this.mBuilder.mContext));
            }
            bundle.putCharSequence(androidx.core.app.NotificationCompat.EXTRA_VERIFICATION_TEXT, this.getOutputStallDurationlomOqCM);
            bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_ANSWER_INTENT, this.getHighSpeedVideoFpsRangesFor);
            bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_DECLINE_INTENT, this.getInputFormats);
            bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_HANG_UP_INTENT, this.getInputSizeshNQ4ISI);
            java.lang.Integer num = this.Camera2StreamConfigurationMap;
            if (num != null) {
                bundle.putInt(androidx.core.app.NotificationCompat.EXTRA_ANSWER_COLOR, num.intValue());
            }
            java.lang.Integer num2 = this.getHighSpeedVideoSizesFor;
            if (num2 != null) {
                bundle.putInt(androidx.core.app.NotificationCompat.EXTRA_DECLINE_COLOR, num2.intValue());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            java.lang.CharSequence charSequence = null;
            android.app.Notification.CallStyle bm_ = null;
            charSequence = null;
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                int i = this.getOutputMinFrameDuration;
                if (i == 1) {
                    bm_ = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bm_(this.getOutputSizeshNQ4ISI.toAndroidPerson(), this.getInputFormats, this.getHighSpeedVideoFpsRangesFor);
                } else if (i == 2) {
                    bm_ = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bn_(this.getOutputSizeshNQ4ISI.toAndroidPerson(), this.getInputSizeshNQ4ISI);
                } else if (i == 3) {
                    bm_ = androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bo_(this.getOutputSizeshNQ4ISI.toAndroidPerson(), this.getInputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
                } else {
                    android.util.Log.isLoggable("NotifCompat", 3);
                }
                if (bm_ != null) {
                    bm_.setBuilder(notificationBuilderWithBuilderAccessor.getBuilder());
                    java.lang.Integer num = this.Camera2StreamConfigurationMap;
                    if (num != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bp_(bm_, num.intValue());
                    }
                    java.lang.Integer num2 = this.getHighSpeedVideoSizesFor;
                    if (num2 != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bq_(bm_, num2.intValue());
                    }
                    androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bt_(bm_, this.getOutputStallDurationlomOqCM);
                    androidx.core.graphics.drawable.IconCompat iconCompat = this.getOutputMinFrameDurationlomOqCM;
                    if (iconCompat != null) {
                        androidx.core.app.NotificationCompat.CallStyle.Api31Impl.bs_(bm_, iconCompat.toIcon(this.mBuilder.mContext));
                    }
                    androidx.core.app.NotificationCompat.CallStyle.Api31Impl.br_(bm_, this.getOutputFormats);
                    return;
                }
                return;
            }
            android.app.Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
            androidx.core.app.Person person = this.getOutputSizeshNQ4ISI;
            builder.setContentTitle(person != null ? person.getName() : null);
            if (this.mBuilder.toString != null && this.mBuilder.toString.containsKey(androidx.core.app.NotificationCompat.EXTRA_TEXT)) {
                charSequence = this.mBuilder.toString.getCharSequence(androidx.core.app.NotificationCompat.EXTRA_TEXT);
            }
            if (charSequence == null) {
                charSequence = getHighResolutionOutputSizeshNQ4ISI();
            }
            builder.setContentText(charSequence);
            androidx.core.app.Person person2 = this.getOutputSizeshNQ4ISI;
            if (person2 != null) {
                if (person2.getIcon() != null) {
                    builder.setLargeIcon(this.getOutputSizeshNQ4ISI.getIcon().toIcon(this.mBuilder.mContext));
                }
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    androidx.core.app.NotificationCompat.CallStyle.Api28Impl.bk_(builder, this.getOutputSizeshNQ4ISI.toAndroidPerson());
                } else {
                    builder.addPerson(this.getOutputSizeshNQ4ISI.getUri());
                }
            }
            builder.setCategory(androidx.core.app.NotificationCompat.CATEGORY_CALL);
        }

        private java.lang.String getHighResolutionOutputSizeshNQ4ISI() {
            int i = this.getOutputMinFrameDuration;
            if (i == 1) {
                return this.mBuilder.mContext.getResources().getString(androidx.core.R.string.call_notification_incoming_text);
            }
            if (i == 2) {
                return this.mBuilder.mContext.getResources().getString(androidx.core.R.string.call_notification_ongoing_text);
            }
            if (i != 3) {
                return null;
            }
            return this.mBuilder.mContext.getResources().getString(androidx.core.R.string.call_notification_screening_text);
        }

        private androidx.core.app.NotificationCompat.Action Camera2StreamConfigurationMap() {
            int i = androidx.core.R.drawable.ic_call_decline;
            if (this.getInputFormats == null) {
                return getHighResolutionOutputSizeshNQ4ISI(i, androidx.core.R.string.call_notification_hang_up_action, this.getHighSpeedVideoSizesFor, androidx.core.R.color.call_notification_decline_color, this.getInputSizeshNQ4ISI);
            }
            return getHighResolutionOutputSizeshNQ4ISI(i, androidx.core.R.string.call_notification_decline_action, this.getHighSpeedVideoSizesFor, androidx.core.R.color.call_notification_decline_color, this.getInputFormats);
        }

        private androidx.core.app.NotificationCompat.Action getHighSpeedVideoFpsRanges() {
            int i;
            int i2 = androidx.core.R.drawable.ic_call_answer_video;
            int i3 = androidx.core.R.drawable.ic_call_answer;
            if (this.getHighSpeedVideoFpsRangesFor == null) {
                return null;
            }
            boolean z = this.getOutputFormats;
            int i4 = !z ? i3 : i2;
            if (z) {
                i = androidx.core.R.string.call_notification_answer_video_action;
            } else {
                i = androidx.core.R.string.call_notification_answer_action;
            }
            return getHighResolutionOutputSizeshNQ4ISI(i4, i, this.Camera2StreamConfigurationMap, androidx.core.R.color.call_notification_answer_color, this.getHighSpeedVideoFpsRangesFor);
        }

        private androidx.core.app.NotificationCompat.Action getHighResolutionOutputSizeshNQ4ISI(int i, int i2, java.lang.Integer num, int i3, android.app.PendingIntent pendingIntent) {
            if (num == null) {
                num = java.lang.Integer.valueOf(androidx.core.content.ContextCompat.getColor(this.mBuilder.mContext, i3));
            }
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            spannableStringBuilder.append((java.lang.CharSequence) this.mBuilder.mContext.getResources().getString(i2));
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            androidx.core.app.NotificationCompat.Action build = new androidx.core.app.NotificationCompat.Action.Builder(androidx.core.graphics.drawable.IconCompat.createWithResource(this.mBuilder.mContext, i), spannableStringBuilder, pendingIntent).build();
            build.getExtras().putBoolean("key_action_priority", true);
            return build;
        }

        private boolean getHighSpeedVideoFpsRanges(androidx.core.app.NotificationCompat.Action action) {
            return action != null && action.getExtras().getBoolean("key_action_priority");
        }

        public java.util.ArrayList<androidx.core.app.NotificationCompat.Action> getActionsListWithSystemActions() {
            androidx.core.app.NotificationCompat.Action Camera2StreamConfigurationMap = Camera2StreamConfigurationMap();
            androidx.core.app.NotificationCompat.Action highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            java.util.ArrayList<androidx.core.app.NotificationCompat.Action> arrayList = new java.util.ArrayList<>(3);
            arrayList.add(Camera2StreamConfigurationMap);
            java.util.ArrayList<androidx.core.app.NotificationCompat.Action> arrayList2 = this.mBuilder.mActions;
            int i = 2;
            if (arrayList2 != null) {
                for (androidx.core.app.NotificationCompat.Action action : arrayList2) {
                    if (action.isContextual()) {
                        arrayList.add(action);
                    } else if (!getHighSpeedVideoFpsRanges(action)) {
                        arrayList.add(action);
                        i--;
                    }
                    if (highSpeedVideoFpsRanges != null && i == 1) {
                        arrayList.add(highSpeedVideoFpsRanges);
                        i--;
                    }
                }
            }
            if (highSpeedVideoFpsRanges != null && i > 0) {
                arrayList.add(highSpeedVideoFpsRanges);
            }
            return arrayList;
        }

        static class Api28Impl {
            static android.os.Parcelable bl_(android.app.Person person) {
                return person;
            }

            private Api28Impl() {
            }

            static android.app.Notification.Builder bk_(android.app.Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static android.app.Notification.CallStyle bm_(android.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
                return android.app.Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static android.app.Notification.CallStyle bn_(android.app.Person person, android.app.PendingIntent pendingIntent) {
                return android.app.Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static android.app.Notification.CallStyle bo_(android.app.Person person, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2) {
                return android.app.Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static android.app.Notification.CallStyle br_(android.app.Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            static android.app.Notification.CallStyle bs_(android.app.Notification.CallStyle callStyle, android.graphics.drawable.Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static android.app.Notification.CallStyle bt_(android.app.Notification.CallStyle callStyle, java.lang.CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }

            static android.app.Notification.CallStyle bp_(android.app.Notification.CallStyle callStyle, int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            static android.app.Notification.CallStyle bq_(android.app.Notification.CallStyle callStyle, int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class InboxStyle extends androidx.core.app.NotificationCompat.Style {
        private java.util.ArrayList<java.lang.CharSequence> Camera2StreamConfigurationMap = new java.util.ArrayList<>();

        public InboxStyle() {
        }

        public InboxStyle(androidx.core.app.NotificationCompat.Builder builder) {
            setBuilder(builder);
        }

        public androidx.core.app.NotificationCompat.InboxStyle setBigContentTitle(java.lang.CharSequence charSequence) {
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            return this;
        }

        public androidx.core.app.NotificationCompat.InboxStyle setSummaryText(java.lang.CharSequence charSequence) {
            this.getHighSpeedVideoSizes = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.getHighSpeedVideoFpsRanges = true;
            return this;
        }

        public androidx.core.app.NotificationCompat.InboxStyle addLine(java.lang.CharSequence charSequence) {
            if (charSequence != null) {
                this.Camera2StreamConfigurationMap.add(androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence));
            }
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.InboxStyle bigContentTitle = new android.app.Notification.InboxStyle(notificationBuilderWithBuilderAccessor.getBuilder()).setBigContentTitle(this.getHighResolutionOutputSizeshNQ4ISI);
            if (this.getHighSpeedVideoFpsRanges) {
                bigContentTitle.setSummaryText(this.getHighSpeedVideoSizes);
            }
            java.util.Iterator<java.lang.CharSequence> it = this.Camera2StreamConfigurationMap.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.Camera2StreamConfigurationMap.clear();
            if (bundle.containsKey(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES)) {
                java.util.Collections.addAll(this.Camera2StreamConfigurationMap, bundle.getCharSequenceArray(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES));
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_TEXT_LINES);
        }
    }

    /* loaded from: classes7.dex */
    public static class ProgressStyle extends androidx.core.app.NotificationCompat.Style {
        private boolean Camera2StreamConfigurationMap;
        private androidx.core.graphics.drawable.IconCompat getHighSpeedVideoFpsRangesFor;
        private androidx.core.graphics.drawable.IconCompat getHighSpeedVideoSizesFor;
        private androidx.core.graphics.drawable.IconCompat getOutputStallDurationlomOqCM;
        private java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> getOutputFormats = new java.util.ArrayList();
        private java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> getInputSizeshNQ4ISI = new java.util.ArrayList();
        private int getOutputMinFrameDuration = 0;
        private boolean getInputFormats = true;

        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        public java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> getProgressSegments() {
            return this.getOutputFormats;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressSegments(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> list) {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = new java.util.ArrayList();
            }
            this.getOutputFormats.clear();
            java.util.Iterator<androidx.core.app.NotificationCompat.ProgressStyle.Segment> it = list.iterator();
            while (it.hasNext()) {
                addProgressSegment(it.next());
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle addProgressSegment(androidx.core.app.NotificationCompat.ProgressStyle.Segment segment) {
            if (this.getOutputFormats == null) {
                this.getOutputFormats = new java.util.ArrayList();
            }
            if (segment.getLength() > 0) {
                this.getOutputFormats.add(segment);
            }
            return this;
        }

        public java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> getProgressPoints() {
            return this.getInputSizeshNQ4ISI;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressPoints(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> list) {
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = new java.util.ArrayList();
            }
            this.getInputSizeshNQ4ISI.clear();
            java.util.Iterator<androidx.core.app.NotificationCompat.ProgressStyle.Point> it = list.iterator();
            while (it.hasNext()) {
                addProgressPoint(it.next());
            }
            return this;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle addProgressPoint(androidx.core.app.NotificationCompat.ProgressStyle.Point point) {
            if (this.getInputSizeshNQ4ISI == null) {
                this.getInputSizeshNQ4ISI = new java.util.ArrayList();
            }
            if (point.getPosition() > 0) {
                this.getInputSizeshNQ4ISI.add(point);
            }
            return this;
        }

        public int getProgress() {
            return this.getOutputMinFrameDuration;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgress(int i) {
            this.getOutputMinFrameDuration = i;
            return this;
        }

        public int getProgressMax() {
            java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> list = this.getOutputFormats;
            if (list == null || list.isEmpty()) {
                return 100;
            }
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < list.size(); i3++) {
                int length = list.get(i3).getLength();
                if (length > 0) {
                    try {
                        i2 = java.lang.Math.addExact(i2, length);
                        i++;
                    } catch (java.lang.ArithmeticException unused) {
                        return 100;
                    }
                }
            }
            if (i == 0) {
                return 100;
            }
            return i2;
        }

        public boolean isProgressIndeterminate() {
            return this.Camera2StreamConfigurationMap;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressIndeterminate(boolean z) {
            this.Camera2StreamConfigurationMap = z;
            return this;
        }

        public boolean isStyledByProgress() {
            return this.getInputFormats;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setStyledByProgress(boolean z) {
            this.getInputFormats = z;
            return this;
        }

        public androidx.core.graphics.drawable.IconCompat getProgressTrackerIcon() {
            return this.getOutputStallDurationlomOqCM;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressTrackerIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.getOutputStallDurationlomOqCM = iconCompat;
            return this;
        }

        public androidx.core.graphics.drawable.IconCompat getProgressStartIcon() {
            return this.getHighSpeedVideoSizesFor;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressStartIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.getHighSpeedVideoSizesFor = iconCompat;
            return this;
        }

        public androidx.core.graphics.drawable.IconCompat getProgressEndIcon() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public androidx.core.app.NotificationCompat.ProgressStyle setProgressEndIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
            this.getHighSpeedVideoFpsRangesFor = iconCompat;
            return this;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$ProgressStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            android.app.Notification.Builder builder = notificationBuilderWithBuilderAccessor.getBuilder();
            if (android.os.Build.VERSION.SDK_INT >= 36) {
                android.content.Context highSpeedVideoFpsRangesFor = notificationBuilderWithBuilderAccessor instanceof androidx.core.app.NotificationCompatBuilder ? ((androidx.core.app.NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).getHighSpeedVideoFpsRangesFor() : null;
                android.app.Notification.ProgressStyle progressStyle = new android.app.Notification.ProgressStyle();
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bE_(progressStyle, this.getInputFormats);
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bx_(progressStyle, this.getOutputMinFrameDuration);
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bz_(progressStyle, this.Camera2StreamConfigurationMap);
                androidx.core.graphics.drawable.IconCompat iconCompat = this.getHighSpeedVideoSizesFor;
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bC_(progressStyle, iconCompat != null ? iconCompat.toIcon(highSpeedVideoFpsRangesFor) : null);
                androidx.core.graphics.drawable.IconCompat iconCompat2 = this.getHighSpeedVideoFpsRangesFor;
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.by_(progressStyle, iconCompat2 != null ? iconCompat2.toIcon(highSpeedVideoFpsRangesFor) : null);
                androidx.core.graphics.drawable.IconCompat iconCompat3 = this.getOutputStallDurationlomOqCM;
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bD_(progressStyle, iconCompat3 != null ? iconCompat3.toIcon(highSpeedVideoFpsRangesFor) : null);
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bA_(progressStyle, this.getInputSizeshNQ4ISI);
                androidx.core.app.NotificationCompat.ProgressStyle.Api36Impl.bB_(progressStyle, this.getOutputFormats);
                builder.setStyle(progressStyle);
                return;
            }
            int progressMax = getProgressMax();
            builder.setProgress(progressMax, java.lang.Math.min(this.getOutputMinFrameDuration, progressMax), this.Camera2StreamConfigurationMap);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void addCompatExtras(android.os.Bundle bundle) {
            super.addCompatExtras(bundle);
            if (android.os.Build.VERSION.SDK_INT < 36) {
                bundle.putParcelableArrayList(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_SEGMENTS, Camera2StreamConfigurationMap(this.getOutputFormats));
                bundle.putParcelableArrayList(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_POINTS, getHighSpeedVideoFpsRanges(this.getInputSizeshNQ4ISI));
                bundle.putInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS, this.getOutputMinFrameDuration);
                bundle.putBoolean(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, this.Camera2StreamConfigurationMap);
                bundle.putInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_MAX, getProgressMax());
                bundle.putBoolean(androidx.core.app.NotificationCompat.EXTRA_STYLED_BY_PROGRESS, this.getInputFormats);
                android.content.Context context = this.mBuilder != null ? this.mBuilder.mContext : null;
                if (context != null) {
                    androidx.core.graphics.drawable.IconCompat iconCompat = this.getOutputStallDurationlomOqCM;
                    if (iconCompat != null) {
                        bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, iconCompat.toIcon(context));
                    } else {
                        bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
                    }
                    androidx.core.graphics.drawable.IconCompat iconCompat2 = this.getHighSpeedVideoSizesFor;
                    if (iconCompat2 != null) {
                        bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_START_ICON, iconCompat2.toIcon(context));
                    } else {
                        bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_START_ICON);
                    }
                    androidx.core.graphics.drawable.IconCompat iconCompat3 = this.getHighSpeedVideoFpsRangesFor;
                    if (iconCompat3 != null) {
                        bundle.putParcelable(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_END_ICON, iconCompat3.toIcon(context));
                    } else {
                        bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_END_ICON);
                    }
                }
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void restoreFromCompatExtras(android.os.Bundle bundle) {
            super.restoreFromCompatExtras(bundle);
            this.getOutputFormats = getHighSpeedVideoSizes(androidx.core.os.BundleCompat.getParcelableArrayList(bundle, androidx.core.app.NotificationCompat.EXTRA_PROGRESS_SEGMENTS, android.os.Bundle.class));
            this.getOutputMinFrameDuration = bundle.getInt(androidx.core.app.NotificationCompat.EXTRA_PROGRESS, 0);
            this.Camera2StreamConfigurationMap = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE, false);
            this.getInputFormats = bundle.getBoolean(androidx.core.app.NotificationCompat.EXTRA_STYLED_BY_PROGRESS, true);
            this.getInputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(androidx.core.os.BundleCompat.getParcelableArrayList(bundle, androidx.core.app.NotificationCompat.EXTRA_PROGRESS_POINTS, android.os.Bundle.class));
            this.getOutputStallDurationlomOqCM = getHighResolutionOutputSizeshNQ4ISI((android.os.Parcelable) androidx.core.os.BundleCompat.getParcelable(bundle, androidx.core.app.NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON, android.graphics.drawable.Icon.class));
            this.getHighSpeedVideoSizesFor = getHighResolutionOutputSizeshNQ4ISI((android.os.Parcelable) androidx.core.os.BundleCompat.getParcelable(bundle, androidx.core.app.NotificationCompat.EXTRA_PROGRESS_START_ICON, android.graphics.drawable.Icon.class));
            this.getHighSpeedVideoFpsRangesFor = getHighResolutionOutputSizeshNQ4ISI((android.os.Parcelable) androidx.core.os.BundleCompat.getParcelable(bundle, androidx.core.app.NotificationCompat.EXTRA_PROGRESS_END_ICON, android.graphics.drawable.Icon.class));
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected void clearCompatExtraKeys(android.os.Bundle bundle) {
            super.clearCompatExtraKeys(bundle);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_SEGMENTS);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_STYLED_BY_PROGRESS);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_TRACKER_ICON);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_START_ICON);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_END_ICON);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_POINTS);
            bundle.remove(androidx.core.app.NotificationCompat.EXTRA_PROGRESS_INDETERMINATE);
        }

        private static androidx.core.graphics.drawable.IconCompat getHighResolutionOutputSizeshNQ4ISI(android.os.Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (parcelable instanceof android.graphics.drawable.Icon) {
                return androidx.core.graphics.drawable.IconCompat.createFromIcon((android.graphics.drawable.Icon) parcelable);
            }
            if (parcelable instanceof android.graphics.Bitmap) {
                return androidx.core.graphics.drawable.IconCompat.createWithBitmap((android.graphics.Bitmap) parcelable);
            }
            return null;
        }

        private static java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> getHighSpeedVideoSizes(java.util.List<android.os.Bundle> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    android.os.Bundle bundle = list.get(i);
                    int i2 = bundle.getInt("length");
                    if (i2 > 0) {
                        arrayList.add(new androidx.core.app.NotificationCompat.ProgressStyle.Segment(i2).setId(bundle.getInt("id")).setColor(bundle.getInt("colorInt", 0)));
                    }
                }
            }
            return arrayList;
        }

        private static java.util.ArrayList<android.os.Bundle> getHighSpeedVideoFpsRanges(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> list) {
            java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    androidx.core.app.NotificationCompat.ProgressStyle.Point point = list.get(i);
                    if (point.getPosition() >= 0) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt(com.daon.sdk.face.license.License.FEATURE_POSITION, point.getPosition());
                        bundle.putInt("id", point.getId());
                        bundle.putInt("colorInt", point.getColor());
                        arrayList.add(bundle);
                    }
                }
            }
            return arrayList;
        }

        private static java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> getHighResolutionOutputSizeshNQ4ISI(java.util.List<android.os.Bundle> list) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    android.os.Bundle bundle = list.get(i);
                    int i2 = bundle.getInt(com.daon.sdk.face.license.License.FEATURE_POSITION);
                    if (i2 >= 0) {
                        arrayList.add(new androidx.core.app.NotificationCompat.ProgressStyle.Point(i2).setId(bundle.getInt("id")).setColor(bundle.getInt("colorInt", 0)));
                    }
                }
            }
            return arrayList;
        }

        private static java.util.ArrayList<android.os.Bundle> Camera2StreamConfigurationMap(java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> list) {
            java.util.ArrayList<android.os.Bundle> arrayList = new java.util.ArrayList<>();
            if (list != null && !list.isEmpty()) {
                for (int i = 0; i < list.size(); i++) {
                    androidx.core.app.NotificationCompat.ProgressStyle.Segment segment = list.get(i);
                    if (segment.getLength() > 0) {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putInt("length", segment.getLength());
                        bundle.putInt("id", segment.getId());
                        bundle.putInt("colorInt", segment.getColor());
                        arrayList.add(bundle);
                    }
                }
            }
            return arrayList;
        }

        public static final class Segment {
            private int Camera2StreamConfigurationMap;
            private int getHighResolutionOutputSizeshNQ4ISI = 0;
            private int getHighSpeedVideoFpsRangesFor = 0;

            public Segment(int i) {
                this.Camera2StreamConfigurationMap = i;
            }

            public final int getLength() {
                return this.Camera2StreamConfigurationMap;
            }

            public final int getId() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public final androidx.core.app.NotificationCompat.ProgressStyle.Segment setId(int i) {
                this.getHighResolutionOutputSizeshNQ4ISI = i;
                return this;
            }

            public final int getColor() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public final androidx.core.app.NotificationCompat.ProgressStyle.Segment setColor(int i) {
                this.getHighSpeedVideoFpsRangesFor = i;
                return this;
            }
        }

        public static final class Point {
            private int Camera2StreamConfigurationMap;
            private int getHighSpeedVideoSizes = 0;
            private int getHighSpeedVideoFpsRangesFor = 0;

            public Point(int i) {
                this.Camera2StreamConfigurationMap = i;
            }

            public final int getPosition() {
                return this.Camera2StreamConfigurationMap;
            }

            public final int getId() {
                return this.getHighSpeedVideoSizes;
            }

            public final androidx.core.app.NotificationCompat.ProgressStyle.Point setId(int i) {
                this.getHighSpeedVideoSizes = i;
                return this;
            }

            public final int getColor() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public final androidx.core.app.NotificationCompat.ProgressStyle.Point setColor(int i) {
                this.getHighSpeedVideoFpsRangesFor = i;
                return this;
            }
        }

        static final class Api36Impl {
            private Api36Impl() {
            }

            static void bE_(android.app.Notification.ProgressStyle progressStyle, boolean z) {
                progressStyle.setStyledByProgress(z);
            }

            static void bx_(android.app.Notification.ProgressStyle progressStyle, int i) {
                progressStyle.setProgress(i);
            }

            static void bz_(android.app.Notification.ProgressStyle progressStyle, boolean z) {
                progressStyle.setProgressIndeterminate(z);
            }

            static void bC_(android.app.Notification.ProgressStyle progressStyle, android.graphics.drawable.Icon icon) {
                progressStyle.setProgressStartIcon(icon);
            }

            static void by_(android.app.Notification.ProgressStyle progressStyle, android.graphics.drawable.Icon icon) {
                progressStyle.setProgressEndIcon(icon);
            }

            static void bD_(android.app.Notification.ProgressStyle progressStyle, android.graphics.drawable.Icon icon) {
                progressStyle.setProgressTrackerIcon(icon);
            }

            static void bA_(android.app.Notification.ProgressStyle progressStyle, java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Point> list) {
                for (androidx.core.app.NotificationCompat.ProgressStyle.Point point : list) {
                    progressStyle.addProgressPoint(new android.app.Notification.ProgressStyle.Point(point.getPosition()).setColor(point.getColor()).setId(point.getId()));
                }
            }

            static void bB_(android.app.Notification.ProgressStyle progressStyle, java.util.List<androidx.core.app.NotificationCompat.ProgressStyle.Segment> list) {
                for (androidx.core.app.NotificationCompat.ProgressStyle.Segment segment : list) {
                    progressStyle.addProgressSegment(new android.app.Notification.ProgressStyle.Segment(segment.getLength()).setColor(segment.getColor()).setId(segment.getId()));
                }
            }
        }
    }

    /* loaded from: classes7.dex */
    public static class DecoratedCustomViewStyle extends androidx.core.app.NotificationCompat.Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public boolean displayCustomViewInline() {
            return true;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            return null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        protected java.lang.String getClassName() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            notificationBuilderWithBuilderAccessor.getBuilder().setStyle(androidx.core.app.NotificationCompat.DecoratedCustomViewStyle.Api24Impl.Camera2StreamConfigurationMap());
        }

        public static java.util.List<java.lang.CharSequence> getTextsFromContentView(android.content.Context context, android.app.Notification notification) {
            android.widget.RemoteViews remoteViews;
            if (!android.app.Notification.DecoratedCustomViewStyle.class.getName().equals(notification.extras.getString(androidx.core.app.NotificationCompat.EXTRA_TEMPLATE))) {
                return java.util.Collections.emptyList();
            }
            if (notification.contentView == null && notification.bigContentView == null && notification.headsUpContentView == null) {
                return java.util.Collections.emptyList();
            }
            if (notification.bigContentView != null) {
                remoteViews = notification.bigContentView;
            } else {
                remoteViews = notification.contentView != null ? notification.contentView : notification.headsUpContentView;
            }
            java.lang.String str = remoteViews.getPackage();
            try {
                android.content.Context createPackageContext = context.createPackageContext(str, 0);
                createPackageContext.setTheme(context.getPackageManager().getApplicationInfo(str, 0).theme);
                android.view.View apply = remoteViews.apply(createPackageContext, null);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                getHighResolutionOutputSizeshNQ4ISI(apply, arrayList);
                return arrayList;
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                throw new java.lang.RuntimeException(e);
            }
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(android.view.View view, java.util.ArrayList<java.lang.CharSequence> arrayList) {
            java.lang.CharSequence text;
            if (!(view instanceof android.view.ViewGroup)) {
                return;
            }
            int i = 0;
            while (true) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return;
                }
                android.view.View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof android.widget.TextView) && (text = ((android.widget.TextView) childAt).getText()) != null && text.length() > 0) {
                    arrayList.add(text);
                }
                if (childAt instanceof android.view.ViewGroup) {
                    getHighResolutionOutputSizeshNQ4ISI(childAt, arrayList);
                }
                i++;
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static android.app.Notification.Style Camera2StreamConfigurationMap() {
                return new android.app.Notification.DecoratedCustomViewStyle();
            }
        }
    }

    public static class Action {
        public static final int SEMANTIC_ACTION_ARCHIVE = 5;
        public static final int SEMANTIC_ACTION_CALL = 10;
        public static final int SEMANTIC_ACTION_DELETE = 4;
        public static final int SEMANTIC_ACTION_MARK_AS_READ = 2;
        public static final int SEMANTIC_ACTION_MARK_AS_UNREAD = 3;
        public static final int SEMANTIC_ACTION_MUTE = 6;
        public static final int SEMANTIC_ACTION_NONE = 0;
        public static final int SEMANTIC_ACTION_REPLY = 1;
        public static final int SEMANTIC_ACTION_THUMBS_DOWN = 9;
        public static final int SEMANTIC_ACTION_THUMBS_UP = 8;
        public static final int SEMANTIC_ACTION_UNMUTE = 7;
        private boolean Camera2StreamConfigurationMap;
        public android.app.PendingIntent actionIntent;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        private final androidx.core.app.RemoteInput[] getHighSpeedVideoFpsRanges;
        final android.os.Bundle getHighSpeedVideoFpsRangesFor;
        private boolean getHighSpeedVideoSizes;
        private final boolean getHighSpeedVideoSizesFor;
        private androidx.core.graphics.drawable.IconCompat getInputSizeshNQ4ISI;
        private final androidx.core.app.RemoteInput[] getOutputFormats;
        private final int getOutputMinFrameDuration;

        @java.lang.Deprecated
        public int icon;
        public java.lang.CharSequence title;

        /* loaded from: classes7.dex */
        public interface Extender {
            androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder builder);
        }

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface SemanticAction {
        }

        public Action(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this(i != 0 ? androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent);
        }

        public Action(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), (androidx.core.app.RemoteInput[]) null, (androidx.core.app.RemoteInput[]) null, true, 0, true, false, false);
        }

        Action(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.RemoteInput[] remoteInputArr, androidx.core.app.RemoteInput[] remoteInputArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this(i != 0 ? androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, bundle, remoteInputArr, remoteInputArr2, z, i2, z2, z3, z4);
        }

        Action(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.RemoteInput[] remoteInputArr, androidx.core.app.RemoteInput[] remoteInputArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getInputSizeshNQ4ISI = iconCompat;
            if (iconCompat != null && iconCompat.getType() == 2) {
                this.icon = iconCompat.getResId();
            }
            this.title = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
            this.actionIntent = pendingIntent;
            this.getHighSpeedVideoFpsRangesFor = bundle == null ? new android.os.Bundle() : bundle;
            this.getOutputFormats = remoteInputArr;
            this.getHighSpeedVideoFpsRanges = remoteInputArr2;
            this.Camera2StreamConfigurationMap = z;
            this.getOutputMinFrameDuration = i;
            this.getHighResolutionOutputSizeshNQ4ISI = z2;
            this.getHighSpeedVideoSizesFor = z3;
            this.getHighSpeedVideoSizes = z4;
        }

        @java.lang.Deprecated
        public int getIcon() {
            return this.icon;
        }

        public androidx.core.graphics.drawable.IconCompat getIconCompat() {
            int i;
            if (this.getInputSizeshNQ4ISI == null && (i = this.icon) != 0) {
                this.getInputSizeshNQ4ISI = androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i);
            }
            return this.getInputSizeshNQ4ISI;
        }

        public java.lang.CharSequence getTitle() {
            return this.title;
        }

        public android.app.PendingIntent getActionIntent() {
            return this.actionIntent;
        }

        public android.os.Bundle getExtras() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public boolean getAllowGeneratedReplies() {
            return this.Camera2StreamConfigurationMap;
        }

        public boolean isAuthenticationRequired() {
            return this.getHighSpeedVideoSizes;
        }

        public androidx.core.app.RemoteInput[] getRemoteInputs() {
            return this.getOutputFormats;
        }

        public int getSemanticAction() {
            return this.getOutputMinFrameDuration;
        }

        public boolean isContextual() {
            return this.getHighSpeedVideoSizesFor;
        }

        public androidx.core.app.RemoteInput[] getDataOnlyRemoteInputs() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public boolean getShowsUserInterface() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public static final class Builder {
            private final androidx.core.graphics.drawable.IconCompat Camera2StreamConfigurationMap;
            private boolean getHighResolutionOutputSizeshNQ4ISI;
            private boolean getHighSpeedVideoFpsRanges;
            private final android.app.PendingIntent getHighSpeedVideoFpsRangesFor;
            private final android.os.Bundle getHighSpeedVideoSizes;
            private boolean getHighSpeedVideoSizesFor;
            private final java.lang.CharSequence getInputFormats;
            private int getInputSizeshNQ4ISI;
            private boolean getOutputFormats;
            private java.util.ArrayList<androidx.core.app.RemoteInput> getOutputMinFrameDuration;

            public static androidx.core.app.NotificationCompat.Action.Builder fromAndroidAction(android.app.Notification.Action action) {
                androidx.core.app.NotificationCompat.Action.Builder builder;
                if (action.getIcon() != null) {
                    builder = new androidx.core.app.NotificationCompat.Action.Builder(androidx.core.graphics.drawable.IconCompat.createFromIconOrNullIfZeroResId(action.getIcon()), action.title, action.actionIntent);
                } else {
                    builder = new androidx.core.app.NotificationCompat.Action.Builder(action.icon, action.title, action.actionIntent);
                }
                android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
                if (remoteInputs != null && remoteInputs.length != 0) {
                    for (android.app.RemoteInput remoteInput : remoteInputs) {
                        builder.addRemoteInput(androidx.core.app.RemoteInput.getHighResolutionOutputSizeshNQ4ISI(remoteInput));
                    }
                }
                builder.getHighResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.Action.Builder.Api24Impl.Camera2StreamConfigurationMap(action);
                if (android.os.Build.VERSION.SDK_INT >= 28) {
                    builder.setSemanticAction(androidx.core.app.NotificationCompat.Action.Builder.Api28Impl.Camera2StreamConfigurationMap(action));
                }
                if (android.os.Build.VERSION.SDK_INT >= 29) {
                    builder.setContextual(androidx.core.app.NotificationCompat.Action.Builder.Api29Impl.getHighSpeedVideoFpsRangesFor(action));
                }
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    builder.setAuthenticationRequired(androidx.core.app.NotificationCompat.Action.Builder.Api31Impl.getHighResolutionOutputSizeshNQ4ISI(action));
                }
                builder.addExtras(action.getExtras());
                return builder;
            }

            public Builder(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
            }

            public Builder(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
                this(i != 0 ? androidx.core.graphics.drawable.IconCompat.createWithResource(null, "", i) : null, charSequence, pendingIntent, new android.os.Bundle(), null, true, 0, true, false, false);
            }

            public Builder(androidx.core.app.NotificationCompat.Action action) {
                this(action.getIconCompat(), action.title, action.actionIntent, new android.os.Bundle(action.getHighSpeedVideoFpsRangesFor), action.getRemoteInputs(), action.getAllowGeneratedReplies(), action.getSemanticAction(), action.getHighResolutionOutputSizeshNQ4ISI, action.isContextual(), action.isAuthenticationRequired());
            }

            private Builder(androidx.core.graphics.drawable.IconCompat iconCompat, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent, android.os.Bundle bundle, androidx.core.app.RemoteInput[] remoteInputArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                this.getHighSpeedVideoSizesFor = true;
                this.Camera2StreamConfigurationMap = iconCompat;
                this.getInputFormats = androidx.core.app.NotificationCompat.Builder.limitCharSequenceLength(charSequence);
                this.getHighSpeedVideoFpsRangesFor = pendingIntent;
                this.getHighSpeedVideoSizes = bundle;
                this.getOutputMinFrameDuration = remoteInputArr == null ? null : new java.util.ArrayList<>(java.util.Arrays.asList(remoteInputArr));
                this.getHighResolutionOutputSizeshNQ4ISI = z;
                this.getInputSizeshNQ4ISI = i;
                this.getHighSpeedVideoSizesFor = z2;
                this.getOutputFormats = z3;
                this.getHighSpeedVideoFpsRanges = z4;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder addExtras(android.os.Bundle bundle) {
                if (bundle != null) {
                    this.getHighSpeedVideoSizes.putAll(bundle);
                }
                return this;
            }

            public final android.os.Bundle getExtras() {
                return this.getHighSpeedVideoSizes;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder addRemoteInput(androidx.core.app.RemoteInput remoteInput) {
                if (this.getOutputMinFrameDuration == null) {
                    this.getOutputMinFrameDuration = new java.util.ArrayList<>();
                }
                if (remoteInput != null) {
                    this.getOutputMinFrameDuration.add(remoteInput);
                }
                return this;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder setAllowGeneratedReplies(boolean z) {
                this.getHighResolutionOutputSizeshNQ4ISI = z;
                return this;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder setSemanticAction(int i) {
                this.getInputSizeshNQ4ISI = i;
                return this;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder setContextual(boolean z) {
                this.getOutputFormats = z;
                return this;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder setAuthenticationRequired(boolean z) {
                this.getHighSpeedVideoFpsRanges = z;
                return this;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder setShowsUserInterface(boolean z) {
                this.getHighSpeedVideoSizesFor = z;
                return this;
            }

            public final androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Extender extender) {
                extender.extend(this);
                return this;
            }

            private void getHighSpeedVideoSizes() {
                if (this.getOutputFormats && this.getHighSpeedVideoFpsRangesFor == null) {
                    throw new java.lang.NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public final androidx.core.app.NotificationCompat.Action build() {
                getHighSpeedVideoSizes();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.util.ArrayList<androidx.core.app.RemoteInput> arrayList3 = this.getOutputMinFrameDuration;
                if (arrayList3 != null) {
                    java.util.Iterator<androidx.core.app.RemoteInput> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        androidx.core.app.RemoteInput next = it.next();
                        if (next.isDataOnly()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                androidx.core.app.RemoteInput[] remoteInputArr = arrayList.isEmpty() ? null : (androidx.core.app.RemoteInput[]) arrayList.toArray(new androidx.core.app.RemoteInput[arrayList.size()]);
                return new androidx.core.app.NotificationCompat.Action(this.Camera2StreamConfigurationMap, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, arrayList2.isEmpty() ? null : (androidx.core.app.RemoteInput[]) arrayList2.toArray(new androidx.core.app.RemoteInput[arrayList2.size()]), remoteInputArr, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor, this.getOutputFormats, this.getHighSpeedVideoFpsRanges);
            }

            /* loaded from: classes7.dex */
            static class Api24Impl {
                private Api24Impl() {
                }

                static boolean Camera2StreamConfigurationMap(android.app.Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            /* loaded from: classes7.dex */
            static class Api28Impl {
                private Api28Impl() {
                }

                static int Camera2StreamConfigurationMap(android.app.Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            /* loaded from: classes7.dex */
            static class Api29Impl {
                private Api29Impl() {
                }

                static boolean getHighSpeedVideoFpsRangesFor(android.app.Notification.Action action) {
                    return action.isContextual();
                }
            }

            /* loaded from: classes7.dex */
            static class Api31Impl {
                private Api31Impl() {
                }

                static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }
        }

        /* loaded from: classes7.dex */
        public static final class WearableExtender implements androidx.core.app.NotificationCompat.Action.Extender {
            private int Camera2StreamConfigurationMap;
            private java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI;
            private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
            private java.lang.CharSequence getHighSpeedVideoSizes;

            public WearableExtender() {
                this.Camera2StreamConfigurationMap = 1;
            }

            public WearableExtender(androidx.core.app.NotificationCompat.Action action) {
                this.Camera2StreamConfigurationMap = 1;
                android.os.Bundle bundle = action.getExtras().getBundle("android.wearable.EXTENSIONS");
                if (bundle != null) {
                    this.Camera2StreamConfigurationMap = bundle.getInt("flags", 1);
                    this.getHighSpeedVideoSizes = bundle.getCharSequence("inProgressLabel");
                    this.getHighResolutionOutputSizeshNQ4ISI = bundle.getCharSequence("confirmLabel");
                    this.getHighSpeedVideoFpsRangesFor = bundle.getCharSequence("cancelLabel");
                }
            }

            @Override // androidx.core.app.NotificationCompat.Action.Extender
            public final androidx.core.app.NotificationCompat.Action.Builder extend(androidx.core.app.NotificationCompat.Action.Builder builder) {
                android.os.Bundle bundle = new android.os.Bundle();
                int i = this.Camera2StreamConfigurationMap;
                if (i != 1) {
                    bundle.putInt("flags", i);
                }
                java.lang.CharSequence charSequence = this.getHighSpeedVideoSizes;
                if (charSequence != null) {
                    bundle.putCharSequence("inProgressLabel", charSequence);
                }
                java.lang.CharSequence charSequence2 = this.getHighResolutionOutputSizeshNQ4ISI;
                if (charSequence2 != null) {
                    bundle.putCharSequence("confirmLabel", charSequence2);
                }
                java.lang.CharSequence charSequence3 = this.getHighSpeedVideoFpsRangesFor;
                if (charSequence3 != null) {
                    bundle.putCharSequence("cancelLabel", charSequence3);
                }
                builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
                return builder;
            }

            /* renamed from: clone, reason: merged with bridge method [inline-methods] */
            public final androidx.core.app.NotificationCompat.Action.WearableExtender m9057clone() {
                androidx.core.app.NotificationCompat.Action.WearableExtender wearableExtender = new androidx.core.app.NotificationCompat.Action.WearableExtender();
                wearableExtender.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
                wearableExtender.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
                wearableExtender.getHighResolutionOutputSizeshNQ4ISI = this.getHighResolutionOutputSizeshNQ4ISI;
                wearableExtender.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
                return wearableExtender;
            }

            public final androidx.core.app.NotificationCompat.Action.WearableExtender setAvailableOffline(boolean z) {
                getHighSpeedVideoSizes(1, z);
                return this;
            }

            public final boolean isAvailableOffline() {
                return (this.Camera2StreamConfigurationMap & 1) != 0;
            }

            private void getHighSpeedVideoSizes(int i, boolean z) {
                if (z) {
                    this.Camera2StreamConfigurationMap = i | this.Camera2StreamConfigurationMap;
                } else {
                    this.Camera2StreamConfigurationMap = (~i) & this.Camera2StreamConfigurationMap;
                }
            }

            @java.lang.Deprecated
            public final androidx.core.app.NotificationCompat.Action.WearableExtender setInProgressLabel(java.lang.CharSequence charSequence) {
                this.getHighSpeedVideoSizes = charSequence;
                return this;
            }

            @java.lang.Deprecated
            public final java.lang.CharSequence getInProgressLabel() {
                return this.getHighSpeedVideoSizes;
            }

            @java.lang.Deprecated
            public final androidx.core.app.NotificationCompat.Action.WearableExtender setConfirmLabel(java.lang.CharSequence charSequence) {
                this.getHighResolutionOutputSizeshNQ4ISI = charSequence;
                return this;
            }

            @java.lang.Deprecated
            public final java.lang.CharSequence getConfirmLabel() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            @java.lang.Deprecated
            public final androidx.core.app.NotificationCompat.Action.WearableExtender setCancelLabel(java.lang.CharSequence charSequence) {
                this.getHighSpeedVideoFpsRangesFor = charSequence;
                return this;
            }

            @java.lang.Deprecated
            public final java.lang.CharSequence getCancelLabel() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public final androidx.core.app.NotificationCompat.Action.WearableExtender setHintLaunchesActivity(boolean z) {
                getHighSpeedVideoSizes(2, z);
                return this;
            }

            public final boolean getHintLaunchesActivity() {
                return (this.Camera2StreamConfigurationMap & 2) != 0;
            }

            public final androidx.core.app.NotificationCompat.Action.WearableExtender setHintDisplayActionInline(boolean z) {
                getHighSpeedVideoSizes(4, z);
                return this;
            }

            public final boolean getHintDisplayActionInline() {
                return (this.Camera2StreamConfigurationMap & 4) != 0;
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class WearableExtender implements androidx.core.app.NotificationCompat.Extender {

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_LONG = -1;

        @java.lang.Deprecated
        public static final int SCREEN_TIMEOUT_SHORT = 0;

        @java.lang.Deprecated
        public static final int SIZE_DEFAULT = 0;

        @java.lang.Deprecated
        public static final int SIZE_FULL_SCREEN = 5;

        @java.lang.Deprecated
        public static final int SIZE_LARGE = 4;

        @java.lang.Deprecated
        public static final int SIZE_MEDIUM = 3;

        @java.lang.Deprecated
        public static final int SIZE_SMALL = 2;

        @java.lang.Deprecated
        public static final int SIZE_XSMALL = 1;
        public static final int UNSET_ACTION_INDEX = -1;
        private java.lang.String Camera2StreamConfigurationMap;
        private java.util.ArrayList<androidx.core.app.NotificationCompat.Action> getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getHighSpeedVideoSizesFor;
        private int getInputFormats;
        private int getInputSizeshNQ4ISI;
        private android.app.PendingIntent getOutputFormats;
        private java.lang.String getOutputMinFrameDuration;
        private int getOutputMinFrameDurationlomOqCM;
        private java.util.ArrayList<android.app.Notification> getOutputSizes;
        private int getOutputSizeshNQ4ISI;
        private int getOutputStallDurationlomOqCM;

        public WearableExtender() {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
            this.getOutputStallDurationlomOqCM = 1;
            this.getOutputSizes = new java.util.ArrayList<>();
            this.getInputSizeshNQ4ISI = androidx.core.view.GravityCompat.END;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoSizesFor = 0;
            this.getOutputMinFrameDurationlomOqCM = 80;
        }

        public WearableExtender(android.app.Notification notification) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
            this.getOutputStallDurationlomOqCM = 1;
            this.getOutputSizes = new java.util.ArrayList<>();
            this.getInputSizeshNQ4ISI = androidx.core.view.GravityCompat.END;
            this.getHighSpeedVideoSizes = -1;
            this.getHighSpeedVideoSizesFor = 0;
            this.getOutputMinFrameDurationlomOqCM = 80;
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            android.os.Bundle bundle = extras != null ? extras.getBundle("android.wearable.EXTENSIONS") : null;
            if (bundle != null) {
                java.util.ArrayList parcelableArrayList = bundle.getParcelableArrayList(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY);
                if (parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    androidx.core.app.NotificationCompat.Action[] actionArr = new androidx.core.app.NotificationCompat.Action[size];
                    for (int i = 0; i < size; i++) {
                        actionArr[i] = androidx.core.app.NotificationCompat.Camera2StreamConfigurationMap((android.app.Notification.Action) parcelableArrayList.get(i));
                    }
                    java.util.Collections.addAll(this.getHighResolutionOutputSizeshNQ4ISI, actionArr);
                }
                this.getOutputStallDurationlomOqCM = bundle.getInt("flags", 1);
                this.getOutputFormats = (android.app.PendingIntent) bundle.getParcelable("displayIntent");
                android.app.Notification[] highResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompat.getHighResolutionOutputSizeshNQ4ISI(bundle, "pages");
                if (highResolutionOutputSizeshNQ4ISI != null) {
                    java.util.Collections.addAll(this.getOutputSizes, highResolutionOutputSizeshNQ4ISI);
                }
                this.getHighSpeedVideoFpsRangesFor = (android.graphics.Bitmap) bundle.getParcelable(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY);
                this.getHighSpeedVideoFpsRanges = bundle.getInt("contentIcon");
                this.getInputSizeshNQ4ISI = bundle.getInt("contentIconGravity", androidx.core.view.GravityCompat.END);
                this.getHighSpeedVideoSizes = bundle.getInt("contentActionIndex", -1);
                this.getHighSpeedVideoSizesFor = bundle.getInt("customSizePreset", 0);
                this.getInputFormats = bundle.getInt("customContentHeight");
                this.getOutputMinFrameDurationlomOqCM = bundle.getInt("gravity", 80);
                this.getOutputSizeshNQ4ISI = bundle.getInt("hintScreenTimeout");
                this.getOutputMinFrameDuration = bundle.getString("dismissalId");
                this.Camera2StreamConfigurationMap = bundle.getString("bridgeTag");
            }
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public final androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder) {
            android.os.Bundle bundle = new android.os.Bundle();
            if (!this.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
                java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>(this.getHighResolutionOutputSizeshNQ4ISI.size());
                java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = this.getHighResolutionOutputSizeshNQ4ISI.iterator();
                while (it.hasNext()) {
                    arrayList.add(getHighSpeedVideoSizes(it.next()));
                }
                bundle.putParcelableArrayList(com.datadog.android.rum.internal.metric.SessionEndedMetric.NO_VIEW_EVENTS_COUNT_ACTIONS_KEY, arrayList);
            }
            int i = this.getOutputStallDurationlomOqCM;
            if (i != 1) {
                bundle.putInt("flags", i);
            }
            android.app.PendingIntent pendingIntent = this.getOutputFormats;
            if (pendingIntent != null) {
                bundle.putParcelable("displayIntent", pendingIntent);
            }
            if (!this.getOutputSizes.isEmpty()) {
                java.util.ArrayList<android.app.Notification> arrayList2 = this.getOutputSizes;
                bundle.putParcelableArray("pages", (android.os.Parcelable[]) arrayList2.toArray(new android.app.Notification[arrayList2.size()]));
            }
            android.graphics.Bitmap bitmap = this.getHighSpeedVideoFpsRangesFor;
            if (bitmap != null) {
                bundle.putParcelable(com.datadog.android.rum.internal.metric.SessionEndedMetric.VIEW_COUNTS_BG_KEY, bitmap);
            }
            int i2 = this.getHighSpeedVideoFpsRanges;
            if (i2 != 0) {
                bundle.putInt("contentIcon", i2);
            }
            int i3 = this.getInputSizeshNQ4ISI;
            if (i3 != 8388613) {
                bundle.putInt("contentIconGravity", i3);
            }
            int i4 = this.getHighSpeedVideoSizes;
            if (i4 != -1) {
                bundle.putInt("contentActionIndex", i4);
            }
            int i5 = this.getHighSpeedVideoSizesFor;
            if (i5 != 0) {
                bundle.putInt("customSizePreset", i5);
            }
            int i6 = this.getInputFormats;
            if (i6 != 0) {
                bundle.putInt("customContentHeight", i6);
            }
            int i7 = this.getOutputMinFrameDurationlomOqCM;
            if (i7 != 80) {
                bundle.putInt("gravity", i7);
            }
            int i8 = this.getOutputSizeshNQ4ISI;
            if (i8 != 0) {
                bundle.putInt("hintScreenTimeout", i8);
            }
            java.lang.String str = this.getOutputMinFrameDuration;
            if (str != null) {
                bundle.putString("dismissalId", str);
            }
            java.lang.String str2 = this.Camera2StreamConfigurationMap;
            if (str2 != null) {
                bundle.putString("bridgeTag", str2);
            }
            builder.getExtras().putBundle("android.wearable.EXTENSIONS", bundle);
            return builder;
        }

        private static android.app.Notification.Action getHighSpeedVideoSizes(androidx.core.app.NotificationCompat.Action action) {
            android.os.Bundle bundle;
            androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
            android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompat == null ? null : iconCompat.toIcon(), action.getTitle(), action.getActionIntent());
            if (action.getExtras() != null) {
                bundle = new android.os.Bundle(action.getExtras());
            } else {
                bundle = new android.os.Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
            androidx.core.app.NotificationCompat.WearableExtender.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(builder, action.getAllowGeneratedReplies());
            if (android.os.Build.VERSION.SDK_INT >= 31) {
                androidx.core.app.NotificationCompat.WearableExtender.Api31Impl.getHighSpeedVideoFpsRangesFor(builder, action.isAuthenticationRequired());
            }
            builder.addExtras(bundle);
            androidx.core.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
            if (remoteInputs != null) {
                for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.getHighSpeedVideoSizes(remoteInputs)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public final androidx.core.app.NotificationCompat.WearableExtender m9058clone() {
            androidx.core.app.NotificationCompat.WearableExtender wearableExtender = new androidx.core.app.NotificationCompat.WearableExtender();
            wearableExtender.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>(this.getHighResolutionOutputSizeshNQ4ISI);
            wearableExtender.getOutputStallDurationlomOqCM = this.getOutputStallDurationlomOqCM;
            wearableExtender.getOutputFormats = this.getOutputFormats;
            wearableExtender.getOutputSizes = new java.util.ArrayList<>(this.getOutputSizes);
            wearableExtender.getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoFpsRangesFor;
            wearableExtender.getHighSpeedVideoFpsRanges = this.getHighSpeedVideoFpsRanges;
            wearableExtender.getInputSizeshNQ4ISI = this.getInputSizeshNQ4ISI;
            wearableExtender.getHighSpeedVideoSizes = this.getHighSpeedVideoSizes;
            wearableExtender.getHighSpeedVideoSizesFor = this.getHighSpeedVideoSizesFor;
            wearableExtender.getInputFormats = this.getInputFormats;
            wearableExtender.getOutputMinFrameDurationlomOqCM = this.getOutputMinFrameDurationlomOqCM;
            wearableExtender.getOutputSizeshNQ4ISI = this.getOutputSizeshNQ4ISI;
            wearableExtender.getOutputMinFrameDuration = this.getOutputMinFrameDuration;
            wearableExtender.Camera2StreamConfigurationMap = this.Camera2StreamConfigurationMap;
            return wearableExtender;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender addAction(androidx.core.app.NotificationCompat.Action action) {
            this.getHighResolutionOutputSizeshNQ4ISI.add(action);
            return this;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender addActions(java.util.List<androidx.core.app.NotificationCompat.Action> list) {
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(list);
            return this;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender clearActions() {
            this.getHighResolutionOutputSizeshNQ4ISI.clear();
            return this;
        }

        public final java.util.List<androidx.core.app.NotificationCompat.Action> getActions() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setDisplayIntent(android.app.PendingIntent pendingIntent) {
            this.getOutputFormats = pendingIntent;
            return this;
        }

        @java.lang.Deprecated
        public final android.app.PendingIntent getDisplayIntent() {
            return this.getOutputFormats;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender addPage(android.app.Notification notification) {
            this.getOutputSizes.add(notification);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender addPages(java.util.List<android.app.Notification> list) {
            this.getOutputSizes.addAll(list);
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender clearPages() {
            this.getOutputSizes.clear();
            return this;
        }

        @java.lang.Deprecated
        public final java.util.List<android.app.Notification> getPages() {
            return this.getOutputSizes;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setBackground(android.graphics.Bitmap bitmap) {
            this.getHighSpeedVideoFpsRangesFor = bitmap;
            return this;
        }

        @java.lang.Deprecated
        public final android.graphics.Bitmap getBackground() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setContentIcon(int i) {
            this.getHighSpeedVideoFpsRanges = i;
            return this;
        }

        @java.lang.Deprecated
        public final int getContentIcon() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setContentIconGravity(int i) {
            this.getInputSizeshNQ4ISI = i;
            return this;
        }

        @java.lang.Deprecated
        public final int getContentIconGravity() {
            return this.getInputSizeshNQ4ISI;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender setContentAction(int i) {
            this.getHighSpeedVideoSizes = i;
            return this;
        }

        public final int getContentAction() {
            return this.getHighSpeedVideoSizes;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setGravity(int i) {
            this.getOutputMinFrameDurationlomOqCM = i;
            return this;
        }

        @java.lang.Deprecated
        public final int getGravity() {
            return this.getOutputMinFrameDurationlomOqCM;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setCustomSizePreset(int i) {
            this.getHighSpeedVideoSizesFor = i;
            return this;
        }

        @java.lang.Deprecated
        public final int getCustomSizePreset() {
            return this.getHighSpeedVideoSizesFor;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setCustomContentHeight(int i) {
            this.getInputFormats = i;
            return this;
        }

        @java.lang.Deprecated
        public final int getCustomContentHeight() {
            return this.getInputFormats;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender setStartScrollBottom(boolean z) {
            getHighSpeedVideoFpsRangesFor(8, z);
            return this;
        }

        public final boolean getStartScrollBottom() {
            return (this.getOutputStallDurationlomOqCM & 8) != 0;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender setContentIntentAvailableOffline(boolean z) {
            getHighSpeedVideoFpsRangesFor(1, z);
            return this;
        }

        public final boolean getContentIntentAvailableOffline() {
            return (this.getOutputStallDurationlomOqCM & 1) != 0;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setHintHideIcon(boolean z) {
            getHighSpeedVideoFpsRangesFor(2, z);
            return this;
        }

        @java.lang.Deprecated
        public final boolean getHintHideIcon() {
            return (this.getOutputStallDurationlomOqCM & 2) != 0;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setHintShowBackgroundOnly(boolean z) {
            getHighSpeedVideoFpsRangesFor(4, z);
            return this;
        }

        @java.lang.Deprecated
        public final boolean getHintShowBackgroundOnly() {
            return (this.getOutputStallDurationlomOqCM & 4) != 0;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setHintAvoidBackgroundClipping(boolean z) {
            getHighSpeedVideoFpsRangesFor(16, z);
            return this;
        }

        @java.lang.Deprecated
        public final boolean getHintAvoidBackgroundClipping() {
            return (this.getOutputStallDurationlomOqCM & 16) != 0;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setHintScreenTimeout(int i) {
            this.getOutputSizeshNQ4ISI = i;
            return this;
        }

        @java.lang.Deprecated
        public final int getHintScreenTimeout() {
            return this.getOutputSizeshNQ4ISI;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.WearableExtender setHintAmbientBigPicture(boolean z) {
            getHighSpeedVideoFpsRangesFor(32, z);
            return this;
        }

        @java.lang.Deprecated
        public final boolean getHintAmbientBigPicture() {
            return (this.getOutputStallDurationlomOqCM & 32) != 0;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender setHintContentIntentLaunchesActivity(boolean z) {
            getHighSpeedVideoFpsRangesFor(64, z);
            return this;
        }

        public final boolean getHintContentIntentLaunchesActivity() {
            return (this.getOutputStallDurationlomOqCM & 64) != 0;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender setDismissalId(java.lang.String str) {
            this.getOutputMinFrameDuration = str;
            return this;
        }

        public final java.lang.String getDismissalId() {
            return this.getOutputMinFrameDuration;
        }

        public final androidx.core.app.NotificationCompat.WearableExtender setBridgeTag(java.lang.String str) {
            this.Camera2StreamConfigurationMap = str;
            return this;
        }

        public final java.lang.String getBridgeTag() {
            return this.Camera2StreamConfigurationMap;
        }

        private void getHighSpeedVideoFpsRangesFor(int i, boolean z) {
            if (z) {
                this.getOutputStallDurationlomOqCM = i | this.getOutputStallDurationlomOqCM;
            } else {
                this.getOutputStallDurationlomOqCM = (~i) & this.getOutputStallDurationlomOqCM;
            }
        }

        static class Api24Impl {
            private Api24Impl() {
            }

            static android.app.Notification.Action.Builder getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Action.Builder builder, boolean z) {
                return builder.setAllowGeneratedReplies(z);
            }
        }

        static class Api31Impl {
            private Api31Impl() {
            }

            static android.app.Notification.Action.Builder getHighSpeedVideoFpsRangesFor(android.app.Notification.Action.Builder builder, boolean z) {
                return builder.setAuthenticationRequired(z);
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class CarExtender implements androidx.core.app.NotificationCompat.Extender {
        private android.graphics.Bitmap Camera2StreamConfigurationMap;
        private androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getHighSpeedVideoFpsRanges;
        private int getHighSpeedVideoFpsRangesFor;

        public CarExtender() {
            this.getHighSpeedVideoFpsRangesFor = 0;
        }

        public CarExtender(android.app.Notification notification) {
            this.getHighSpeedVideoFpsRangesFor = 0;
            android.os.Bundle bundle = androidx.core.app.NotificationCompat.getExtras(notification) == null ? null : androidx.core.app.NotificationCompat.getExtras(notification).getBundle("android.car.EXTENSIONS");
            if (bundle != null) {
                this.Camera2StreamConfigurationMap = (android.graphics.Bitmap) bundle.getParcelable("large_icon");
                this.getHighSpeedVideoFpsRangesFor = bundle.getInt("app_color", 0);
                this.getHighSpeedVideoFpsRanges = Camera2StreamConfigurationMap(bundle.getBundle("car_conversation"));
            }
        }

        private static androidx.core.app.NotificationCompat.CarExtender.UnreadConversation Camera2StreamConfigurationMap(android.os.Bundle bundle) {
            java.lang.String[] strArr;
            androidx.core.app.RemoteInput remoteInput = null;
            if (bundle == null) {
                return null;
            }
            android.os.Parcelable[] parcelableArray = bundle.getParcelableArray("messages");
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                java.lang.String[] strArr2 = new java.lang.String[length];
                for (int i = 0; i < length; i++) {
                    android.os.Parcelable parcelable = parcelableArray[i];
                    if (parcelable instanceof android.os.Bundle) {
                        java.lang.String string = ((android.os.Bundle) parcelable).getString("text");
                        strArr2[i] = string;
                        if (string != null) {
                        }
                    }
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("on_read");
            android.app.PendingIntent pendingIntent2 = (android.app.PendingIntent) bundle.getParcelable("on_reply");
            android.app.RemoteInput remoteInput2 = (android.app.RemoteInput) bundle.getParcelable("remote_input");
            java.lang.String[] stringArray = bundle.getStringArray("participants");
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            if (remoteInput2 != null) {
                remoteInput = new androidx.core.app.RemoteInput(remoteInput2.getResultKey(), remoteInput2.getLabel(), remoteInput2.getChoices(), remoteInput2.getAllowFreeFormInput(), android.os.Build.VERSION.SDK_INT >= 29 ? androidx.core.app.NotificationCompat.CarExtender.Api29Impl.Camera2StreamConfigurationMap(remoteInput2) : 0, remoteInput2.getExtras(), null);
            }
            return new androidx.core.app.NotificationCompat.CarExtender.UnreadConversation(strArr, remoteInput, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        private static android.os.Bundle Camera2StreamConfigurationMap(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation unreadConversation) {
            android.os.Bundle bundle = new android.os.Bundle();
            java.lang.String str = (unreadConversation.getParticipants() == null || unreadConversation.getParticipants().length <= 1) ? null : unreadConversation.getParticipants()[0];
            int length = unreadConversation.getMessages().length;
            android.os.Parcelable[] parcelableArr = new android.os.Parcelable[length];
            for (int i = 0; i < length; i++) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putString("text", unreadConversation.getMessages()[i]);
                bundle2.putString("author", str);
                parcelableArr[i] = bundle2;
            }
            bundle.putParcelableArray("messages", parcelableArr);
            androidx.core.app.RemoteInput remoteInput = unreadConversation.getRemoteInput();
            if (remoteInput != null) {
                android.app.RemoteInput.Builder builder = new android.app.RemoteInput.Builder(remoteInput.getResultKey());
                builder.setLabel(remoteInput.getLabel());
                builder.setChoices(remoteInput.getChoices());
                builder.setAllowFreeFormInput(remoteInput.getAllowFreeFormInput());
                builder.addExtras(remoteInput.getExtras());
                bundle.putParcelable("remote_input", builder.build());
            }
            bundle.putParcelable("on_reply", unreadConversation.getReplyPendingIntent());
            bundle.putParcelable("on_read", unreadConversation.getReadPendingIntent());
            bundle.putStringArray("participants", unreadConversation.getParticipants());
            bundle.putLong("timestamp", unreadConversation.getLatestTimestamp());
            return bundle;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public final androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder) {
            android.os.Bundle bundle = new android.os.Bundle();
            android.graphics.Bitmap bitmap = this.Camera2StreamConfigurationMap;
            if (bitmap != null) {
                bundle.putParcelable("large_icon", bitmap);
            }
            int i = this.getHighSpeedVideoFpsRangesFor;
            if (i != 0) {
                bundle.putInt("app_color", i);
            }
            androidx.core.app.NotificationCompat.CarExtender.UnreadConversation unreadConversation = this.getHighSpeedVideoFpsRanges;
            if (unreadConversation != null) {
                bundle.putBundle("car_conversation", Camera2StreamConfigurationMap(unreadConversation));
            }
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            return builder;
        }

        public final androidx.core.app.NotificationCompat.CarExtender setColor(int i) {
            this.getHighSpeedVideoFpsRangesFor = i;
            return this;
        }

        public final int getColor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.core.app.NotificationCompat.CarExtender setLargeIcon(android.graphics.Bitmap bitmap) {
            this.Camera2StreamConfigurationMap = bitmap;
            return this;
        }

        public final android.graphics.Bitmap getLargeIcon() {
            return this.Camera2StreamConfigurationMap;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.CarExtender setUnreadConversation(androidx.core.app.NotificationCompat.CarExtender.UnreadConversation unreadConversation) {
            this.getHighSpeedVideoFpsRanges = unreadConversation;
            return this;
        }

        @java.lang.Deprecated
        public final androidx.core.app.NotificationCompat.CarExtender.UnreadConversation getUnreadConversation() {
            return this.getHighSpeedVideoFpsRanges;
        }

        @java.lang.Deprecated
        public static class UnreadConversation {
            private final java.lang.String[] Camera2StreamConfigurationMap;
            private final java.lang.String[] getHighResolutionOutputSizeshNQ4ISI;
            private final androidx.core.app.RemoteInput getHighSpeedVideoFpsRanges;
            private final android.app.PendingIntent getHighSpeedVideoFpsRangesFor;
            private final long getHighSpeedVideoSizes;
            private final android.app.PendingIntent getInputFormats;

            UnreadConversation(java.lang.String[] strArr, androidx.core.app.RemoteInput remoteInput, android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, java.lang.String[] strArr2, long j) {
                this.Camera2StreamConfigurationMap = strArr;
                this.getHighSpeedVideoFpsRanges = remoteInput;
                this.getHighSpeedVideoFpsRangesFor = pendingIntent2;
                this.getInputFormats = pendingIntent;
                this.getHighResolutionOutputSizeshNQ4ISI = strArr2;
                this.getHighSpeedVideoSizes = j;
            }

            public java.lang.String[] getMessages() {
                return this.Camera2StreamConfigurationMap;
            }

            public androidx.core.app.RemoteInput getRemoteInput() {
                return this.getHighSpeedVideoFpsRanges;
            }

            public android.app.PendingIntent getReplyPendingIntent() {
                return this.getInputFormats;
            }

            public android.app.PendingIntent getReadPendingIntent() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            public java.lang.String[] getParticipants() {
                return this.getHighResolutionOutputSizeshNQ4ISI;
            }

            public java.lang.String getParticipant() {
                java.lang.String[] strArr = this.getHighResolutionOutputSizeshNQ4ISI;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public long getLatestTimestamp() {
                return this.getHighSpeedVideoSizes;
            }

            public static class Builder {
                private android.app.PendingIntent Camera2StreamConfigurationMap;
                private long getHighResolutionOutputSizeshNQ4ISI;
                private final java.lang.String getHighSpeedVideoFpsRanges;
                private final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
                private androidx.core.app.RemoteInput getHighSpeedVideoSizes;
                private android.app.PendingIntent getOutputFormats;

                public Builder(java.lang.String str) {
                    this.getHighSpeedVideoFpsRanges = str;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder addMessage(java.lang.String str) {
                    if (str != null) {
                        this.getHighSpeedVideoFpsRangesFor.add(str);
                    }
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReplyAction(android.app.PendingIntent pendingIntent, androidx.core.app.RemoteInput remoteInput) {
                    this.getHighSpeedVideoSizes = remoteInput;
                    this.getOutputFormats = pendingIntent;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setReadPendingIntent(android.app.PendingIntent pendingIntent) {
                    this.Camera2StreamConfigurationMap = pendingIntent;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation.Builder setLatestTimestamp(long j) {
                    this.getHighResolutionOutputSizeshNQ4ISI = j;
                    return this;
                }

                public androidx.core.app.NotificationCompat.CarExtender.UnreadConversation build() {
                    java.util.List<java.lang.String> list = this.getHighSpeedVideoFpsRangesFor;
                    return new androidx.core.app.NotificationCompat.CarExtender.UnreadConversation((java.lang.String[]) list.toArray(new java.lang.String[list.size()]), this.getHighSpeedVideoSizes, this.getOutputFormats, this.Camera2StreamConfigurationMap, new java.lang.String[]{this.getHighSpeedVideoFpsRanges}, this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static int Camera2StreamConfigurationMap(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }
    }

    /* loaded from: classes7.dex */
    public static final class TvExtender implements androidx.core.app.NotificationCompat.Extender {
        private int Camera2StreamConfigurationMap;
        private android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;
        private boolean getHighSpeedVideoFpsRanges;
        private android.app.PendingIntent getHighSpeedVideoFpsRangesFor;
        private java.lang.String getHighSpeedVideoSizes;

        public TvExtender() {
            this.Camera2StreamConfigurationMap = 1;
        }

        public TvExtender(android.app.Notification notification) {
            android.os.Bundle bundle = notification.extras == null ? null : notification.extras.getBundle("android.tv.EXTENSIONS");
            if (bundle != null) {
                this.Camera2StreamConfigurationMap = bundle.getInt("flags");
                this.getHighSpeedVideoSizes = bundle.getString("channel_id");
                this.getHighSpeedVideoFpsRanges = bundle.getBoolean("suppressShowOverApps");
                this.getHighSpeedVideoFpsRangesFor = (android.app.PendingIntent) bundle.getParcelable("content_intent");
                this.getHighResolutionOutputSizeshNQ4ISI = (android.app.PendingIntent) bundle.getParcelable("delete_intent");
            }
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public final androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("flags", this.Camera2StreamConfigurationMap);
            bundle.putString("channel_id", this.getHighSpeedVideoSizes);
            bundle.putBoolean("suppressShowOverApps", this.getHighSpeedVideoFpsRanges);
            android.app.PendingIntent pendingIntent = this.getHighSpeedVideoFpsRangesFor;
            if (pendingIntent != null) {
                bundle.putParcelable("content_intent", pendingIntent);
            }
            android.app.PendingIntent pendingIntent2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (pendingIntent2 != null) {
                bundle.putParcelable("delete_intent", pendingIntent2);
            }
            builder.getExtras().putBundle("android.tv.EXTENSIONS", bundle);
            return builder;
        }

        public final boolean isAvailableOnTv() {
            return (this.Camera2StreamConfigurationMap & 1) != 0;
        }

        public final androidx.core.app.NotificationCompat.TvExtender setChannelId(java.lang.String str) {
            this.getHighSpeedVideoSizes = str;
            return this;
        }

        public final java.lang.String getChannelId() {
            return this.getHighSpeedVideoSizes;
        }

        public final androidx.core.app.NotificationCompat.TvExtender setContentIntent(android.app.PendingIntent pendingIntent) {
            this.getHighSpeedVideoFpsRangesFor = pendingIntent;
            return this;
        }

        public final android.app.PendingIntent getContentIntent() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.core.app.NotificationCompat.TvExtender setDeleteIntent(android.app.PendingIntent pendingIntent) {
            this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
            return this;
        }

        public final android.app.PendingIntent getDeleteIntent() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final androidx.core.app.NotificationCompat.TvExtender setSuppressShowOverApps(boolean z) {
            this.getHighSpeedVideoFpsRanges = z;
            return this;
        }

        public final boolean isSuppressShowOverApps() {
            return this.getHighSpeedVideoFpsRanges;
        }
    }

    /* loaded from: classes7.dex */
    public static final class ProjectedExtender implements androidx.core.app.NotificationCompat.Extender {
        private android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;

        public ProjectedExtender() {
        }

        public ProjectedExtender(android.app.Notification notification) {
            android.os.Bundle extras = androidx.core.app.NotificationCompat.getExtras(notification);
            android.os.Bundle bundle = extras == null ? null : extras.getBundle("android.projected.EXTENSIONS");
            if (bundle != null) {
                this.getHighResolutionOutputSizeshNQ4ISI = (android.app.PendingIntent) androidx.core.os.BundleCompat.getParcelable(bundle, "content_intent", android.app.PendingIntent.class);
            }
        }

        public final androidx.core.app.NotificationCompat.ProjectedExtender setContentIntent(android.app.PendingIntent pendingIntent) {
            this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
            return this;
        }

        public final android.app.PendingIntent getContentIntent() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.core.app.NotificationCompat.Extender
        public final androidx.core.app.NotificationCompat.Builder extend(androidx.core.app.NotificationCompat.Builder builder) {
            android.os.Bundle bundle = new android.os.Bundle();
            android.app.PendingIntent pendingIntent = this.getHighResolutionOutputSizeshNQ4ISI;
            if (pendingIntent != null) {
                bundle.putParcelable("content_intent", pendingIntent);
            }
            builder.getExtras().putBundle("android.projected.EXTENSIONS", bundle);
            return builder;
        }
    }

    public static final class BubbleMetadata {
        private androidx.core.graphics.drawable.IconCompat Camera2StreamConfigurationMap;
        private int getHighResolutionOutputSizeshNQ4ISI;
        private int getHighSpeedVideoFpsRanges;
        private android.app.PendingIntent getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private java.lang.String getInputSizeshNQ4ISI;
        private android.app.PendingIntent getOutputFormats;

        private BubbleMetadata(android.app.PendingIntent pendingIntent, android.app.PendingIntent pendingIntent2, androidx.core.graphics.drawable.IconCompat iconCompat, int i, int i2, int i3, java.lang.String str) {
            this.getOutputFormats = pendingIntent;
            this.Camera2StreamConfigurationMap = iconCompat;
            this.getHighResolutionOutputSizeshNQ4ISI = i;
            this.getHighSpeedVideoSizes = i2;
            this.getHighSpeedVideoFpsRangesFor = pendingIntent2;
            this.getHighSpeedVideoFpsRanges = i3;
            this.getInputSizeshNQ4ISI = str;
        }

        public final android.app.PendingIntent getIntent() {
            return this.getOutputFormats;
        }

        public final java.lang.String getShortcutId() {
            return this.getInputSizeshNQ4ISI;
        }

        public final android.app.PendingIntent getDeleteIntent() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.core.graphics.drawable.IconCompat getIcon() {
            return this.Camera2StreamConfigurationMap;
        }

        public final int getDesiredHeight() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        public final int getDesiredHeightResId() {
            return this.getHighSpeedVideoSizes;
        }

        public final boolean getAutoExpandBubble() {
            return (this.getHighSpeedVideoFpsRanges & 1) != 0;
        }

        public final boolean isNotificationSuppressed() {
            return (this.getHighSpeedVideoFpsRanges & 2) != 0;
        }

        public final void setFlags(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public static android.app.Notification.BubbleMetadata toPlatform(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.bj_(bubbleMetadata);
            }
            if (android.os.Build.VERSION.SDK_INT == 29) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.bh_(bubbleMetadata);
            }
            return null;
        }

        public static androidx.core.app.NotificationCompat.BubbleMetadata fromPlatform(android.app.Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api30Impl.bi_(bubbleMetadata);
            }
            if (android.os.Build.VERSION.SDK_INT == 29) {
                return androidx.core.app.NotificationCompat.BubbleMetadata.Api29Impl.bg_(bubbleMetadata);
            }
            return null;
        }

        /* loaded from: classes7.dex */
        public static final class Builder {
            private int Camera2StreamConfigurationMap;
            private android.app.PendingIntent getHighResolutionOutputSizeshNQ4ISI;
            private androidx.core.graphics.drawable.IconCompat getHighSpeedVideoFpsRanges;
            private int getHighSpeedVideoFpsRangesFor;
            private int getHighSpeedVideoSizes;
            private java.lang.String getInputFormats;
            private android.app.PendingIntent getInputSizeshNQ4ISI;

            @java.lang.Deprecated
            public Builder() {
            }

            public Builder(java.lang.String str) {
                if (android.text.TextUtils.isEmpty(str)) {
                    throw new java.lang.NullPointerException("Bubble requires a non-null shortcut id");
                }
                this.getInputFormats = str;
            }

            public Builder(android.app.PendingIntent pendingIntent, androidx.core.graphics.drawable.IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new java.lang.NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new java.lang.NullPointerException("Bubbles require non-null icon");
                }
                this.getInputSizeshNQ4ISI = pendingIntent;
                this.getHighSpeedVideoFpsRanges = iconCompat;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIntent(android.app.PendingIntent pendingIntent) {
                if (this.getInputFormats != null) {
                    throw new java.lang.IllegalStateException("Created as a shortcut bubble, cannot set a PendingIntent. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (pendingIntent == null) {
                    throw new java.lang.NullPointerException("Bubble requires non-null pending intent");
                }
                this.getInputSizeshNQ4ISI = pendingIntent;
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setIcon(androidx.core.graphics.drawable.IconCompat iconCompat) {
                if (this.getInputFormats != null) {
                    throw new java.lang.IllegalStateException("Created as a shortcut bubble, cannot set an Icon. Consider using BubbleMetadata.Builder(PendingIntent,Icon) instead.");
                }
                if (iconCompat == null) {
                    throw new java.lang.NullPointerException("Bubbles require non-null icon");
                }
                this.getHighSpeedVideoFpsRanges = iconCompat;
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeight(int i) {
                this.Camera2StreamConfigurationMap = java.lang.Math.max(i, 0);
                this.getHighSpeedVideoFpsRangesFor = 0;
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDesiredHeightResId(int i) {
                this.getHighSpeedVideoFpsRangesFor = i;
                this.Camera2StreamConfigurationMap = 0;
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setAutoExpandBubble(boolean z) {
                getHighResolutionOutputSizeshNQ4ISI(1, z);
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setSuppressNotification(boolean z) {
                getHighResolutionOutputSizeshNQ4ISI(2, z);
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata.Builder setDeleteIntent(android.app.PendingIntent pendingIntent) {
                this.getHighResolutionOutputSizeshNQ4ISI = pendingIntent;
                return this;
            }

            public final androidx.core.app.NotificationCompat.BubbleMetadata build() {
                java.lang.String str = this.getInputFormats;
                if (str == null && this.getInputSizeshNQ4ISI == null) {
                    throw new java.lang.NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.getHighSpeedVideoFpsRanges == null) {
                    throw new java.lang.NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata = new androidx.core.app.NotificationCompat.BubbleMetadata(this.getInputSizeshNQ4ISI, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, this.getInputFormats);
                bubbleMetadata.setFlags(this.getHighSpeedVideoSizes);
                return bubbleMetadata;
            }

            private androidx.core.app.NotificationCompat.BubbleMetadata.Builder getHighResolutionOutputSizeshNQ4ISI(int i, boolean z) {
                if (z) {
                    this.getHighSpeedVideoSizes = i | this.getHighSpeedVideoSizes;
                    return this;
                }
                this.getHighSpeedVideoSizes = (~i) & this.getHighSpeedVideoSizes;
                return this;
            }
        }

        static class Api29Impl {
            private Api29Impl() {
            }

            static android.app.Notification.BubbleMetadata bh_(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                android.app.Notification.BubbleMetadata.Builder suppressNotification = new android.app.Notification.BubbleMetadata.Builder().setIcon(bubbleMetadata.getIcon().toIcon()).setIntent(bubbleMetadata.getIntent()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata bg_(android.app.Notification.BubbleMetadata bubbleMetadata) {
                if (bubbleMetadata == null || bubbleMetadata.getIntent() == null) {
                    return null;
                }
                androidx.core.app.NotificationCompat.BubbleMetadata.Builder suppressNotification = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(bubbleMetadata.getIntent(), androidx.core.graphics.drawable.IconCompat.createFromIcon(bubbleMetadata.getIcon())).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    suppressNotification.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    suppressNotification.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return suppressNotification.build();
            }
        }

        static class Api30Impl {
            private Api30Impl() {
            }

            static android.app.Notification.BubbleMetadata bj_(androidx.core.app.NotificationCompat.BubbleMetadata bubbleMetadata) {
                android.app.Notification.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new android.app.Notification.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new android.app.Notification.BubbleMetadata.Builder(bubbleMetadata.getIntent(), bubbleMetadata.getIcon().toIcon());
                }
                builder.setDeleteIntent(bubbleMetadata.getDeleteIntent()).setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }

            static androidx.core.app.NotificationCompat.BubbleMetadata bi_(android.app.Notification.BubbleMetadata bubbleMetadata) {
                androidx.core.app.NotificationCompat.BubbleMetadata.Builder builder;
                if (bubbleMetadata == null) {
                    return null;
                }
                if (bubbleMetadata.getShortcutId() != null) {
                    builder = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(bubbleMetadata.getShortcutId());
                } else {
                    builder = new androidx.core.app.NotificationCompat.BubbleMetadata.Builder(bubbleMetadata.getIntent(), androidx.core.graphics.drawable.IconCompat.createFromIcon(bubbleMetadata.getIcon()));
                }
                builder.setAutoExpandBubble(bubbleMetadata.getAutoExpandBubble()).setDeleteIntent(bubbleMetadata.getDeleteIntent()).setSuppressNotification(bubbleMetadata.isNotificationSuppressed());
                if (bubbleMetadata.getDesiredHeight() != 0) {
                    builder.setDesiredHeight(bubbleMetadata.getDesiredHeight());
                }
                if (bubbleMetadata.getDesiredHeightResId() != 0) {
                    builder.setDesiredHeightResId(bubbleMetadata.getDesiredHeightResId());
                }
                return builder.build();
            }
        }
    }

    static android.app.Notification[] getHighResolutionOutputSizeshNQ4ISI(android.os.Bundle bundle, java.lang.String str) {
        android.os.Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof android.app.Notification[]) || parcelableArray == null) {
            return (android.app.Notification[]) parcelableArray;
        }
        android.app.Notification[] notificationArr = new android.app.Notification[parcelableArray.length];
        for (int i = 0; i < parcelableArray.length; i++) {
            notificationArr[i] = (android.app.Notification) parcelableArray[i];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    @androidx.annotation.ReplaceWith(expression = "notification.extras")
    @java.lang.Deprecated
    public static android.os.Bundle getExtras(android.app.Notification notification) {
        return notification.extras;
    }

    public static int getActionCount(android.app.Notification notification) {
        if (notification.actions != null) {
            return notification.actions.length;
        }
        return 0;
    }

    public static androidx.core.app.NotificationCompat.Action getAction(android.app.Notification notification, int i) {
        return Camera2StreamConfigurationMap(notification.actions[i]);
    }

    public static androidx.core.app.NotificationCompat.BubbleMetadata getBubbleMetadata(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.app.NotificationCompat.BubbleMetadata.fromPlatform(androidx.core.app.NotificationCompat.Api29Impl.be_(notification));
        }
        return null;
    }

    static androidx.core.app.NotificationCompat.Action Camera2StreamConfigurationMap(android.app.Notification.Action action) {
        androidx.core.app.RemoteInput[] remoteInputArr;
        int i;
        android.app.RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            remoteInputArr = null;
        } else {
            androidx.core.app.RemoteInput[] remoteInputArr2 = new androidx.core.app.RemoteInput[remoteInputs.length];
            for (int i2 = 0; i2 < remoteInputs.length; i2++) {
                android.app.RemoteInput remoteInput = remoteInputs[i2];
                remoteInputArr2[i2] = new androidx.core.app.RemoteInput(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), android.os.Build.VERSION.SDK_INT >= 29 ? androidx.core.app.NotificationCompat.Api29Impl.Camera2StreamConfigurationMap(remoteInput) : 0, remoteInput.getExtras(), null);
            }
            remoteInputArr = remoteInputArr2;
        }
        boolean z = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || androidx.core.app.NotificationCompat.Api24Impl.getHighSpeedVideoFpsRangesFor(action);
        boolean z2 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            i = androidx.core.app.NotificationCompat.Api28Impl.Camera2StreamConfigurationMap(action);
        } else {
            i = action.getExtras().getInt("android.support.action.semanticAction", 0);
        }
        int i3 = i;
        boolean highResolutionOutputSizeshNQ4ISI = android.os.Build.VERSION.SDK_INT >= 29 ? androidx.core.app.NotificationCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(action) : false;
        boolean highSpeedVideoSizes = android.os.Build.VERSION.SDK_INT >= 31 ? androidx.core.app.NotificationCompat.Api31Impl.getHighSpeedVideoSizes(action) : false;
        if (action.getIcon() == null && action.icon != 0) {
            return new androidx.core.app.NotificationCompat.Action(action.icon, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (androidx.core.app.RemoteInput[]) null, z, i3, z2, highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes);
        }
        return new androidx.core.app.NotificationCompat.Action(action.getIcon() != null ? androidx.core.graphics.drawable.IconCompat.createFromIconOrNullIfZeroResId(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), remoteInputArr, (androidx.core.app.RemoteInput[]) null, z, i3, z2, highResolutionOutputSizeshNQ4ISI, highSpeedVideoSizes);
    }

    public static java.util.List<androidx.core.app.NotificationCompat.Action> getInvisibleActions(android.app.Notification notification) {
        android.os.Bundle bundle;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.os.Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int i = 0; i < bundle.size(); i++) {
                arrayList.add(androidx.core.app.NotificationCompatJellybean.Camera2StreamConfigurationMap(bundle.getBundle(java.lang.Integer.toString(i))));
            }
        }
        return arrayList;
    }

    public static java.util.List<androidx.core.app.Person> getPeople(android.app.Notification notification) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                java.util.Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(androidx.core.app.Person.fromAndroidPerson((android.app.Person) it.next()));
                }
            }
        } else {
            java.lang.String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (java.lang.String str : stringArray) {
                    arrayList.add(new androidx.core.app.Person.Builder().setUri(str).build());
                }
            }
        }
        return arrayList;
    }

    public static java.lang.CharSequence getContentTitle(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    public static java.lang.CharSequence getContentText(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    public static java.lang.CharSequence getContentInfo(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    public static java.lang.CharSequence getSubText(android.app.Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static java.lang.String getShortCriticalText(android.app.Notification notification) {
        return notification.extras.getString(EXTRA_SHORT_CRITICAL_TEXT);
    }

    public static boolean isRequestPromotedOngoing(android.app.Notification notification) {
        return notification.extras.getBoolean(EXTRA_REQUEST_PROMOTED_ONGOING, false);
    }

    public static java.lang.String getCategory(android.app.Notification notification) {
        return notification.category;
    }

    public static boolean getLocalOnly(android.app.Notification notification) {
        return (notification.flags & 256) != 0;
    }

    public static java.lang.String getGroup(android.app.Notification notification) {
        return notification.getGroup();
    }

    public static boolean getShowWhen(android.app.Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    public static boolean getUsesChronometer(android.app.Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static boolean getOnlyAlertOnce(android.app.Notification notification) {
        return (notification.flags & 8) != 0;
    }

    public static boolean getAutoCancel(android.app.Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static boolean getOngoing(android.app.Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static int getColor(android.app.Notification notification) {
        return notification.color;
    }

    public static int getVisibility(android.app.Notification notification) {
        return notification.visibility;
    }

    public static android.app.Notification getPublicVersion(android.app.Notification notification) {
        return notification.publicVersion;
    }

    static boolean Camera2StreamConfigurationMap(android.app.Notification notification) {
        return (notification.flags & 128) != 0;
    }

    public static boolean isGroupSummary(android.app.Notification notification) {
        return (notification.flags & 512) != 0;
    }

    public static java.lang.String getSortKey(android.app.Notification notification) {
        return notification.getSortKey();
    }

    public static java.lang.String getChannelId(android.app.Notification notification) {
        return androidx.core.app.NotificationCompat.Api26Impl.getHighSpeedVideoSizes(notification);
    }

    public static long getTimeoutAfter(android.app.Notification notification) {
        return androidx.core.app.NotificationCompat.Api26Impl.getOutputMinFrameDuration(notification);
    }

    public static int getBadgeIconType(android.app.Notification notification) {
        return androidx.core.app.NotificationCompat.Api26Impl.getHighSpeedVideoFpsRanges(notification);
    }

    public static java.lang.String getShortcutId(android.app.Notification notification) {
        return androidx.core.app.NotificationCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(notification);
    }

    public static java.lang.CharSequence getSettingsText(android.app.Notification notification) {
        return androidx.core.app.NotificationCompat.Api26Impl.Camera2StreamConfigurationMap(notification);
    }

    public static androidx.core.content.LocusIdCompat getLocusId(android.app.Notification notification) {
        android.content.LocusId bf_;
        if (android.os.Build.VERSION.SDK_INT < 29 || (bf_ = androidx.core.app.NotificationCompat.Api29Impl.bf_(notification)) == null) {
            return null;
        }
        return androidx.core.content.LocusIdCompat.toLocusIdCompat(bf_);
    }

    public static int getGroupAlertBehavior(android.app.Notification notification) {
        return androidx.core.app.NotificationCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(notification);
    }

    public static boolean getAllowSystemGeneratedContextualActions(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.app.NotificationCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(notification);
        }
        return false;
    }

    public static android.graphics.Bitmap reduceLargeIconSize(android.content.Context context, android.graphics.Bitmap bitmap) {
        if (bitmap != null && android.os.Build.VERSION.SDK_INT < 27) {
            android.content.res.Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(androidx.core.R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(androidx.core.R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                double min = java.lang.Math.min(dimensionPixelSize / java.lang.Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / java.lang.Math.max(1, bitmap.getHeight()));
                return android.graphics.Bitmap.createScaledBitmap(bitmap, (int) java.lang.Math.ceil(bitmap.getWidth() * min), (int) java.lang.Math.ceil(bitmap.getHeight() * min), true);
            }
        }
        return bitmap;
    }

    public static boolean hasPromotableCharacteristics(android.app.Notification notification) {
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            return androidx.core.app.NotificationCompat.Api36Impl.Camera2StreamConfigurationMap(notification);
        }
        return false;
    }

    static boolean getHighSpeedVideoSizes(android.app.Notification notification) {
        if (GROUP_KEY_SILENT.equals(notification.getGroup())) {
            return true;
        }
        return isGroupSummary(notification) ? getGroupAlertBehavior(notification) == 2 : getGroupAlertBehavior(notification) == 1;
    }

    @java.lang.Deprecated
    public NotificationCompat() {
    }

    /* loaded from: classes7.dex */
    static class Api24Impl {
        private Api24Impl() {
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.app.Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    /* loaded from: classes7.dex */
    static class Api26Impl {
        private Api26Impl() {
        }

        static int getHighResolutionOutputSizeshNQ4ISI(android.app.Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        static java.lang.CharSequence Camera2StreamConfigurationMap(android.app.Notification notification) {
            return notification.getSettingsText();
        }

        static java.lang.String getHighSpeedVideoFpsRangesFor(android.app.Notification notification) {
            return notification.getShortcutId();
        }

        static int getHighSpeedVideoFpsRanges(android.app.Notification notification) {
            return notification.getBadgeIconType();
        }

        static long getOutputMinFrameDuration(android.app.Notification notification) {
            return notification.getTimeoutAfter();
        }

        static java.lang.String getHighSpeedVideoSizes(android.app.Notification notification) {
            return notification.getChannelId();
        }
    }

    /* loaded from: classes7.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        static int Camera2StreamConfigurationMap(android.app.Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    /* loaded from: classes7.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        static android.content.LocusId bf_(android.app.Notification notification) {
            return notification.getLocusId();
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Action action) {
            return action.isContextual();
        }

        static int Camera2StreamConfigurationMap(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        static android.app.Notification.BubbleMetadata be_(android.app.Notification notification) {
            return notification.getBubbleMetadata();
        }
    }

    /* loaded from: classes7.dex */
    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.app.Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    /* loaded from: classes7.dex */
    static class Api36Impl {
        private Api36Impl() {
        }

        static boolean Camera2StreamConfigurationMap(android.app.Notification notification) {
            return notification.hasPromotableCharacteristics();
        }
    }
}
