package androidx.core.app;

/* loaded from: classes.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private android.widget.RemoteViews mBigContentView;
    private final android.app.Notification.Builder mBuilder;
    private final androidx.core.app.NotificationCompat.Builder mBuilderCompat;
    private android.widget.RemoteViews mContentView;
    private final android.content.Context mContext;
    private int mGroupAlertBehavior;
    private android.widget.RemoteViews mHeadsUpContentView;
    private final java.util.List<android.os.Bundle> mActionExtrasList = new java.util.ArrayList();
    private final android.os.Bundle mExtras = new android.os.Bundle();

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder builder) {
        java.util.List list;
        this.mBuilderCompat = builder;
        android.content.Context context = builder.mContext;
        this.mContext = context;
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mBuilder = androidx.core.app.NotificationCompatBuilder.Api26Impl.createBuilder(builder.mContext, builder.mChannelId);
        } else {
            this.mBuilder = new android.app.Notification.Builder(builder.mContext);
        }
        android.app.Notification notification = builder.mNotification;
        this.mBuilder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.mTickerView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.mContentTitle).setContentText(builder.mContentText).setContentInfo(builder.mContentInfo).setContentIntent(builder.mContentIntent).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.mFullScreenIntent, (notification.flags & 128) != 0).setNumber(builder.mNumber).setProgress(builder.mProgressMax, builder.mProgress, builder.mProgressIndeterminate);
        if (android.os.Build.VERSION.SDK_INT < 23) {
            this.mBuilder.setLargeIcon(builder.mLargeIcon == null ? null : builder.mLargeIcon.getBitmap());
        } else {
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setLargeIcon(this.mBuilder, builder.mLargeIcon == null ? null : builder.mLargeIcon.toIcon(context));
        }
        this.mBuilder.setSubText(builder.mSubText).setUsesChronometer(builder.mUseChronometer).setPriority(builder.mPriority);
        if (builder.mStyle instanceof androidx.core.app.NotificationCompat.CallStyle) {
            java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = ((androidx.core.app.NotificationCompat.CallStyle) builder.mStyle).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                addAction(it.next());
            }
        } else {
            java.util.Iterator<androidx.core.app.NotificationCompat.Action> it2 = builder.mActions.iterator();
            while (it2.hasNext()) {
                addAction(it2.next());
            }
        }
        if (builder.mExtras != null) {
            this.mExtras.putAll(builder.mExtras);
        }
        this.mContentView = builder.mContentView;
        this.mBigContentView = builder.mBigContentView;
        this.mBuilder.setShowWhen(builder.mShowWhen);
        androidx.core.app.NotificationCompatBuilder.Api20Impl.setLocalOnly(this.mBuilder, builder.mLocalOnly);
        androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(this.mBuilder, builder.mGroupKey);
        androidx.core.app.NotificationCompatBuilder.Api20Impl.setSortKey(this.mBuilder, builder.mSortKey);
        androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroupSummary(this.mBuilder, builder.mGroupSummary);
        this.mGroupAlertBehavior = builder.mGroupAlertBehavior;
        androidx.core.app.NotificationCompatBuilder.Api21Impl.setCategory(this.mBuilder, builder.mCategory);
        androidx.core.app.NotificationCompatBuilder.Api21Impl.setColor(this.mBuilder, builder.mColor);
        androidx.core.app.NotificationCompatBuilder.Api21Impl.setVisibility(this.mBuilder, builder.mVisibility);
        androidx.core.app.NotificationCompatBuilder.Api21Impl.setPublicVersion(this.mBuilder, builder.mPublicVersion);
        androidx.core.app.NotificationCompatBuilder.Api21Impl.setSound(this.mBuilder, notification.sound, notification.audioAttributes);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            list = combineLists(getPeople(builder.mPersonList), builder.mPeople);
        } else {
            list = builder.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                androidx.core.app.NotificationCompatBuilder.Api21Impl.addPerson(this.mBuilder, (java.lang.String) it3.next());
            }
        }
        this.mHeadsUpContentView = builder.mHeadsUpContentView;
        if (builder.mInvisibleActions.size() > 0) {
            android.os.Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle = bundle == null ? new android.os.Bundle() : bundle;
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            android.os.Bundle bundle3 = new android.os.Bundle();
            for (int i = 0; i < builder.mInvisibleActions.size(); i++) {
                bundle3.putBundle(java.lang.Integer.toString(i), androidx.core.app.NotificationCompatJellybean.getBundleForAction(builder.mInvisibleActions.get(i)));
            }
            bundle.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            this.mExtras.putBundle("android.car.EXTENSIONS", bundle2);
        }
        if (android.os.Build.VERSION.SDK_INT >= 23 && builder.mSmallIcon != null) {
            androidx.core.app.NotificationCompatBuilder.Api23Impl.setSmallIcon(this.mBuilder, builder.mSmallIcon);
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            this.mBuilder.setExtras(builder.mExtras);
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setRemoteInputHistory(this.mBuilder, builder.mRemoteInputHistory);
            if (builder.mContentView != null) {
                androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomContentView(this.mBuilder, builder.mContentView);
            }
            if (builder.mBigContentView != null) {
                androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomBigContentView(this.mBuilder, builder.mBigContentView);
            }
            if (builder.mHeadsUpContentView != null) {
                androidx.core.app.NotificationCompatBuilder.Api24Impl.setCustomHeadsUpContentView(this.mBuilder, builder.mHeadsUpContentView);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setBadgeIconType(this.mBuilder, builder.mBadgeIcon);
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setSettingsText(this.mBuilder, builder.mSettingsText);
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setShortcutId(this.mBuilder, builder.mShortcutId);
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setTimeoutAfter(this.mBuilder, builder.mTimeout);
            androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(this.mBuilder, builder.mGroupAlertBehavior);
            if (builder.mColorizedSet) {
                androidx.core.app.NotificationCompatBuilder.Api26Impl.setColorized(this.mBuilder, builder.mColorized);
            }
            if (!android.text.TextUtils.isEmpty(builder.mChannelId)) {
                this.mBuilder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.Iterator<androidx.core.app.Person> it4 = builder.mPersonList.iterator();
            while (it4.hasNext()) {
                androidx.core.app.NotificationCompatBuilder.Api28Impl.addPerson(this.mBuilder, it4.next().toAndroidPerson());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setAllowSystemGeneratedContextualActions(this.mBuilder, builder.mAllowSystemGeneratedContextualActions);
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setBubbleMetadata(this.mBuilder, androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(builder.mBubbleMetadata));
            if (builder.mLocusId != null) {
                androidx.core.app.NotificationCompatBuilder.Api29Impl.setLocusId(this.mBuilder, builder.mLocusId.toLocusId());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && builder.mFgsDeferBehavior != 0) {
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setForegroundServiceBehavior(this.mBuilder, builder.mFgsDeferBehavior);
        }
        if (builder.mSilent) {
            if (this.mBuilderCompat.mGroupSummary) {
                this.mGroupAlertBehavior = 2;
            } else {
                this.mGroupAlertBehavior = 1;
            }
            this.mBuilder.setVibrate(null);
            this.mBuilder.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.mBuilder.setDefaults(notification.defaults);
            if (android.os.Build.VERSION.SDK_INT >= 26) {
                if (android.text.TextUtils.isEmpty(this.mBuilderCompat.mGroupKey)) {
                    androidx.core.app.NotificationCompatBuilder.Api20Impl.setGroup(this.mBuilder, androidx.core.app.NotificationCompat.GROUP_KEY_SILENT);
                }
                androidx.core.app.NotificationCompatBuilder.Api26Impl.setGroupAlertBehavior(this.mBuilder, this.mGroupAlertBehavior);
            }
        }
    }

    private static java.util.List<java.lang.String> combineLists(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        androidx.collection.ArraySet arraySet = new androidx.collection.ArraySet(list.size() + list2.size());
        arraySet.addAll(list);
        arraySet.addAll(list2);
        return new java.util.ArrayList(arraySet);
    }

    private static java.util.List<java.lang.String> getPeople(java.util.List<androidx.core.app.Person> list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator<androidx.core.app.Person> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().resolveToLegacyUri());
        }
        return arrayList;
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public android.app.Notification.Builder getBuilder() {
        return this.mBuilder;
    }

    android.content.Context getContext() {
        return this.mContext;
    }

    public android.app.Notification build() {
        android.os.Bundle extras;
        android.widget.RemoteViews makeHeadsUpContentView;
        android.widget.RemoteViews makeBigContentView;
        androidx.core.app.NotificationCompat.Style style = this.mBuilderCompat.mStyle;
        if (style != null) {
            style.apply(this);
        }
        android.widget.RemoteViews makeContentView = style != null ? style.makeContentView(this) : null;
        android.app.Notification buildInternal = buildInternal();
        if (makeContentView != null) {
            buildInternal.contentView = makeContentView;
        } else if (this.mBuilderCompat.mContentView != null) {
            buildInternal.contentView = this.mBuilderCompat.mContentView;
        }
        if (style != null && (makeBigContentView = style.makeBigContentView(this)) != null) {
            buildInternal.bigContentView = makeBigContentView;
        }
        if (style != null && (makeHeadsUpContentView = this.mBuilderCompat.mStyle.makeHeadsUpContentView(this)) != null) {
            buildInternal.headsUpContentView = makeHeadsUpContentView;
        }
        if (style != null && (extras = androidx.core.app.NotificationCompat.getExtras(buildInternal)) != null) {
            style.addCompatExtras(extras);
        }
        return buildInternal;
    }

    private void addAction(androidx.core.app.NotificationCompat.Action action) {
        android.app.Notification.Action.Builder createBuilder;
        android.os.Bundle bundle;
        androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            createBuilder = androidx.core.app.NotificationCompatBuilder.Api23Impl.createBuilder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
        } else {
            createBuilder = androidx.core.app.NotificationCompatBuilder.Api20Impl.createBuilder(iconCompat != null ? iconCompat.getResId() : 0, action.getTitle(), action.getActionIntent());
        }
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.fromCompat(action.getRemoteInputs())) {
                androidx.core.app.NotificationCompatBuilder.Api20Impl.addRemoteInput(createBuilder, remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new android.os.Bundle(action.getExtras());
        } else {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            androidx.core.app.NotificationCompatBuilder.Api24Impl.setAllowGeneratedReplies(createBuilder, action.getAllowGeneratedReplies());
        }
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.NotificationCompatBuilder.Api28Impl.setSemanticAction(createBuilder, action.getSemanticAction());
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.NotificationCompatBuilder.Api29Impl.setContextual(createBuilder, action.isContextual());
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.app.NotificationCompatBuilder.Api31Impl.setAuthenticationRequired(createBuilder, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        androidx.core.app.NotificationCompatBuilder.Api20Impl.addExtras(createBuilder, bundle);
        androidx.core.app.NotificationCompatBuilder.Api20Impl.addAction(this.mBuilder, androidx.core.app.NotificationCompatBuilder.Api20Impl.build(createBuilder));
    }

    protected android.app.Notification buildInternal() {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return this.mBuilder.build();
        }
        if (android.os.Build.VERSION.SDK_INT >= 24) {
            android.app.Notification build = this.mBuilder.build();
            if (this.mGroupAlertBehavior != 0) {
                if (androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(build) != null && (build.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                    removeSoundAndVibration(build);
                }
                if (androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(build) != null && (build.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                    removeSoundAndVibration(build);
                }
            }
            return build;
        }
        this.mBuilder.setExtras(this.mExtras);
        android.app.Notification build2 = this.mBuilder.build();
        android.widget.RemoteViews remoteViews = this.mContentView;
        if (remoteViews != null) {
            build2.contentView = remoteViews;
        }
        android.widget.RemoteViews remoteViews2 = this.mBigContentView;
        if (remoteViews2 != null) {
            build2.bigContentView = remoteViews2;
        }
        android.widget.RemoteViews remoteViews3 = this.mHeadsUpContentView;
        if (remoteViews3 != null) {
            build2.headsUpContentView = remoteViews3;
        }
        if (this.mGroupAlertBehavior != 0) {
            if (androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(build2) != null && (build2.flags & 512) != 0 && this.mGroupAlertBehavior == 2) {
                removeSoundAndVibration(build2);
            }
            if (androidx.core.app.NotificationCompatBuilder.Api20Impl.getGroup(build2) != null && (build2.flags & 512) == 0 && this.mGroupAlertBehavior == 1) {
                removeSoundAndVibration(build2);
            }
        }
        return build2;
    }

    private void removeSoundAndVibration(android.app.Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }

    static class Api20Impl {
        private Api20Impl() {
        }

        static android.app.Notification.Action.Builder createBuilder(int i, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            return new android.app.Notification.Action.Builder(i, charSequence, pendingIntent);
        }

        static android.app.Notification.Action.Builder addRemoteInput(android.app.Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        static android.app.Notification.Action.Builder addExtras(android.app.Notification.Action.Builder builder, android.os.Bundle bundle) {
            return builder.addExtras(bundle);
        }

        static android.app.Notification.Builder addAction(android.app.Notification.Builder builder, android.app.Notification.Action action) {
            return builder.addAction(action);
        }

        static android.app.Notification.Action build(android.app.Notification.Action.Builder builder) {
            return builder.build();
        }

        static java.lang.String getGroup(android.app.Notification notification) {
            return notification.getGroup();
        }

        static android.app.Notification.Builder setGroup(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setGroup(str);
        }

        static android.app.Notification.Builder setGroupSummary(android.app.Notification.Builder builder, boolean z) {
            return builder.setGroupSummary(z);
        }

        static android.app.Notification.Builder setLocalOnly(android.app.Notification.Builder builder, boolean z) {
            return builder.setLocalOnly(z);
        }

        static android.app.Notification.Builder setSortKey(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setSortKey(str);
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.app.Notification.Builder addPerson(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.addPerson(str);
        }

        static android.app.Notification.Builder setCategory(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setCategory(str);
        }

        static android.app.Notification.Builder setColor(android.app.Notification.Builder builder, int i) {
            return builder.setColor(i);
        }

        static android.app.Notification.Builder setVisibility(android.app.Notification.Builder builder, int i) {
            return builder.setVisibility(i);
        }

        static android.app.Notification.Builder setPublicVersion(android.app.Notification.Builder builder, android.app.Notification notification) {
            return builder.setPublicVersion(notification);
        }

        static android.app.Notification.Builder setSound(android.app.Notification.Builder builder, android.net.Uri uri, java.lang.Object obj) {
            return builder.setSound(uri, (android.media.AudioAttributes) obj);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.app.Notification.Action.Builder createBuilder(android.graphics.drawable.Icon icon, java.lang.CharSequence charSequence, android.app.PendingIntent pendingIntent) {
            return new android.app.Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        static android.app.Notification.Builder setSmallIcon(android.app.Notification.Builder builder, java.lang.Object obj) {
            return builder.setSmallIcon((android.graphics.drawable.Icon) obj);
        }

        static android.app.Notification.Builder setLargeIcon(android.app.Notification.Builder builder, android.graphics.drawable.Icon icon) {
            return builder.setLargeIcon(icon);
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.app.Notification.Action.Builder setAllowGeneratedReplies(android.app.Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        static android.app.Notification.Builder setRemoteInputHistory(android.app.Notification.Builder builder, java.lang.CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        static android.app.Notification.Builder setCustomContentView(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static android.app.Notification.Builder setCustomBigContentView(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static android.app.Notification.Builder setCustomHeadsUpContentView(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.app.Notification.Builder createBuilder(android.content.Context context, java.lang.String str) {
            return new android.app.Notification.Builder(context, str);
        }

        static android.app.Notification.Builder setGroupAlertBehavior(android.app.Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        static android.app.Notification.Builder setColorized(android.app.Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        static android.app.Notification.Builder setBadgeIconType(android.app.Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        static android.app.Notification.Builder setSettingsText(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static android.app.Notification.Builder setShortcutId(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setShortcutId(str);
        }

        static android.app.Notification.Builder setTimeoutAfter(android.app.Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.app.Notification.Action.Builder setSemanticAction(android.app.Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }

        static android.app.Notification.Builder addPerson(android.app.Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.app.Notification.Action.Builder setContextual(android.app.Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        static android.app.Notification.Builder setLocusId(android.app.Notification.Builder builder, java.lang.Object obj) {
            return builder.setLocusId((android.content.LocusId) obj);
        }

        static android.app.Notification.Builder setBubbleMetadata(android.app.Notification.Builder builder, android.app.Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static android.app.Notification.Builder setAllowSystemGeneratedContextualActions(android.app.Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static android.app.Notification.Action.Builder setAuthenticationRequired(android.app.Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        static android.app.Notification.Builder setForegroundServiceBehavior(android.app.Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }
}
