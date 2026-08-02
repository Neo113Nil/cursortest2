package androidx.core.app;

/* loaded from: classes3.dex */
class NotificationCompatBuilder implements androidx.core.app.NotificationBuilderWithBuilderAccessor {
    private android.widget.RemoteViews Camera2StreamConfigurationMap;
    private android.widget.RemoteViews getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.core.app.NotificationCompat.Builder getHighSpeedVideoFpsRanges;
    private final android.app.Notification.Builder getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighSpeedVideoSizes;
    private int getInputSizeshNQ4ISI;
    private final android.os.Bundle getOutputFormats = new android.os.Bundle();
    private android.widget.RemoteViews getOutputMinFrameDuration;

    NotificationCompatBuilder(androidx.core.app.NotificationCompat.Builder builder) {
        java.util.List list;
        this.getHighSpeedVideoFpsRanges = builder;
        android.content.Context context = builder.mContext;
        this.getHighSpeedVideoSizes = context;
        android.app.Notification.Builder highResolutionOutputSizeshNQ4ISI = androidx.core.app.NotificationCompatBuilder.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(builder.mContext, builder.getOutputMinFrameDuration);
        this.getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI;
        android.app.Notification notification = builder.getARTIFICIAL_FRAME_PACKAGE_NAME;
        highResolutionOutputSizeshNQ4ISI.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, builder.l).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.getOutputStallDurationlomOqCM).setContentText(builder.getOutputMinFrameDurationlomOqCM).setContentInfo(builder.getOutputStallDuration).setContentIntent(builder.getOutputSizes).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(builder.isOutputSupportedFor, (notification.flags & 128) != 0).setNumber(builder._CREATION).setProgress(builder.init, builder._BOUNDARY, builder.AMEXKernel);
        highResolutionOutputSizeshNQ4ISI.setLargeIcon(builder.coroutineCreation == null ? null : builder.coroutineCreation.toIcon(context));
        highResolutionOutputSizeshNQ4ISI.setSubText(builder.updateUI).setUsesChronometer(builder.freeTransaction).setPriority(builder.f2730a);
        if (builder.requestGoOnline instanceof androidx.core.app.NotificationCompat.CallStyle) {
            java.util.Iterator<androidx.core.app.NotificationCompat.Action> it = ((androidx.core.app.NotificationCompat.CallStyle) builder.requestGoOnline).getActionsListWithSystemActions().iterator();
            while (it.hasNext()) {
                getHighSpeedVideoFpsRangesFor(it.next());
            }
        } else {
            java.util.Iterator<androidx.core.app.NotificationCompat.Action> it2 = builder.mActions.iterator();
            while (it2.hasNext()) {
                getHighSpeedVideoFpsRangesFor(it2.next());
            }
        }
        if (builder.toString != null) {
            this.getOutputFormats.putAll(builder.toString);
        }
        this.Camera2StreamConfigurationMap = builder.getOutputSizeshNQ4ISI;
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighSpeedVideoFpsRanges;
        this.getHighSpeedVideoFpsRangesFor.setShowWhen(builder.release);
        this.getHighSpeedVideoFpsRangesFor.setLocalOnly(builder.coroutineBoundary);
        this.getHighSpeedVideoFpsRangesFor.setGroup(builder.unwrapAs);
        this.getHighSpeedVideoFpsRangesFor.setSortKey(builder.requestPINEntry);
        this.getHighSpeedVideoFpsRangesFor.setGroupSummary(builder.accessartificialFrame);
        this.getInputSizeshNQ4ISI = builder.getValidOutputFormatsForInputhNQ4ISI;
        this.getHighSpeedVideoFpsRangesFor.setCategory(builder.getHighSpeedVideoSizes);
        this.getHighSpeedVideoFpsRangesFor.setColor(builder.getHighSpeedVideoSizesFor);
        this.getHighSpeedVideoFpsRangesFor.setVisibility(builder.AMEXKernelJNI);
        this.getHighSpeedVideoFpsRangesFor.setPublicVersion(builder.c);
        this.getHighSpeedVideoFpsRangesFor.setSound(notification.sound, notification.audioAttributes);
        if (android.os.Build.VERSION.SDK_INT < 28) {
            list = getHighSpeedVideoFpsRanges(Camera2StreamConfigurationMap(builder.mPersonList), builder.mPeople);
        } else {
            list = builder.mPeople;
        }
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                this.getHighSpeedVideoFpsRangesFor.addPerson((java.lang.String) it3.next());
            }
        }
        this.getOutputMinFrameDuration = builder.CoroutineDebuggingKt;
        if (builder.ArtificialStackFrames.size() > 0) {
            android.os.Bundle bundle = builder.getExtras().getBundle("android.car.EXTENSIONS");
            bundle = bundle == null ? new android.os.Bundle() : bundle;
            android.os.Bundle bundle2 = new android.os.Bundle(bundle);
            android.os.Bundle bundle3 = new android.os.Bundle();
            for (int i = 0; i < builder.ArtificialStackFrames.size(); i++) {
                bundle3.putBundle(java.lang.Integer.toString(i), androidx.core.app.NotificationCompatJellybean.getHighResolutionOutputSizeshNQ4ISI(builder.ArtificialStackFrames.get(i)));
            }
            bundle.putBundle("invisible_actions", bundle3);
            bundle2.putBundle("invisible_actions", bundle3);
            builder.getExtras().putBundle("android.car.EXTENSIONS", bundle);
            this.getOutputFormats.putBundle("android.car.EXTENSIONS", bundle2);
        }
        if (builder.exchange != null) {
            this.getHighSpeedVideoFpsRangesFor.setSmallIcon((android.graphics.drawable.Icon) builder.exchange);
        }
        this.getHighSpeedVideoFpsRangesFor.setExtras(builder.toString);
        androidx.core.app.NotificationCompatBuilder.Api24Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, builder.d);
        if (builder.getOutputSizeshNQ4ISI != null) {
            androidx.core.app.NotificationCompatBuilder.Api24Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, builder.getOutputSizeshNQ4ISI);
        }
        if (builder.getHighSpeedVideoFpsRanges != null) {
            androidx.core.app.NotificationCompatBuilder.Api24Impl.getHighSpeedVideoSizes(this.getHighSpeedVideoFpsRangesFor, builder.getHighSpeedVideoFpsRanges);
        }
        if (builder.CoroutineDebuggingKt != null) {
            androidx.core.app.NotificationCompatBuilder.Api24Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, builder.CoroutineDebuggingKt);
        }
        androidx.core.app.NotificationCompatBuilder.Api26Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, builder.Camera2StreamConfigurationMap);
        androidx.core.app.NotificationCompatBuilder.Api26Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, builder.kernelVersion);
        androidx.core.app.NotificationCompatBuilder.Api26Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, builder.resetTransaction);
        androidx.core.app.NotificationCompatBuilder.Api26Impl.Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRangesFor, builder.AMEXKernelCallback);
        androidx.core.app.NotificationCompatBuilder.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, builder.getValidOutputFormatsForInputhNQ4ISI);
        if (builder.getInputFormats) {
            androidx.core.app.NotificationCompatBuilder.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, builder.getOutputFormats);
        }
        if (!android.text.TextUtils.isEmpty(builder.getOutputMinFrameDuration)) {
            this.getHighSpeedVideoFpsRangesFor.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            java.util.Iterator<androidx.core.app.Person> it4 = builder.mPersonList.iterator();
            while (it4.hasNext()) {
                androidx.core.app.NotificationCompatBuilder.Api28Impl.bF_(this.getHighSpeedVideoFpsRangesFor, it4.next().toAndroidPerson());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.NotificationCompatBuilder.Api29Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, builder.getHighResolutionOutputSizeshNQ4ISI);
            androidx.core.app.NotificationCompatBuilder.Api29Impl.bG_(this.getHighSpeedVideoFpsRangesFor, androidx.core.app.NotificationCompat.BubbleMetadata.toPlatform(builder.getHighSpeedVideoFpsRangesFor));
            if (builder.b != null) {
                androidx.core.app.NotificationCompatBuilder.Api29Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, builder.b.toLocusId());
            }
        }
        if (android.os.Build.VERSION.SDK_INT >= 31 && builder.isOutputSupportedForhNQ4ISI != 0) {
            androidx.core.app.NotificationCompatBuilder.Api31Impl.getHighSpeedVideoFpsRangesFor(this.getHighSpeedVideoFpsRangesFor, builder.isOutputSupportedForhNQ4ISI);
        }
        if (android.os.Build.VERSION.SDK_INT >= 36) {
            androidx.core.app.NotificationCompatBuilder.Api36Impl.getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRangesFor, builder.startTransaction);
        }
        if (builder.AMEXKernela) {
            if (this.getHighSpeedVideoFpsRanges.accessartificialFrame) {
                this.getInputSizeshNQ4ISI = 2;
            } else {
                this.getInputSizeshNQ4ISI = 1;
            }
            this.getHighSpeedVideoFpsRangesFor.setVibrate(null);
            this.getHighSpeedVideoFpsRangesFor.setSound(null);
            notification.defaults &= -2;
            notification.defaults &= -3;
            this.getHighSpeedVideoFpsRangesFor.setDefaults(notification.defaults);
            if (android.text.TextUtils.isEmpty(this.getHighSpeedVideoFpsRanges.unwrapAs)) {
                this.getHighSpeedVideoFpsRangesFor.setGroup(androidx.core.app.NotificationCompat.GROUP_KEY_SILENT);
            }
            androidx.core.app.NotificationCompatBuilder.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor, this.getInputSizeshNQ4ISI);
        }
    }

    private static java.util.List<java.lang.String> getHighSpeedVideoFpsRanges(java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
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

    private static java.util.List<java.lang.String> Camera2StreamConfigurationMap(java.util.List<androidx.core.app.Person> list) {
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
        return this.getHighSpeedVideoFpsRangesFor;
    }

    android.content.Context getHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    public android.app.Notification getHighResolutionOutputSizeshNQ4ISI() {
        android.os.Bundle extras;
        android.widget.RemoteViews makeHeadsUpContentView;
        android.widget.RemoteViews makeBigContentView;
        androidx.core.app.NotificationCompat.Style style = this.getHighSpeedVideoFpsRanges.requestGoOnline;
        if (style != null) {
            style.apply(this);
        }
        android.widget.RemoteViews makeContentView = style != null ? style.makeContentView(this) : null;
        android.app.Notification highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (makeContentView != null) {
            highSpeedVideoSizes.contentView = makeContentView;
        } else if (this.getHighSpeedVideoFpsRanges.getOutputSizeshNQ4ISI != null) {
            highSpeedVideoSizes.contentView = this.getHighSpeedVideoFpsRanges.getOutputSizeshNQ4ISI;
        }
        if (style != null && (makeBigContentView = style.makeBigContentView(this)) != null) {
            highSpeedVideoSizes.bigContentView = makeBigContentView;
        }
        if (style != null && (makeHeadsUpContentView = this.getHighSpeedVideoFpsRanges.requestGoOnline.makeHeadsUpContentView(this)) != null) {
            highSpeedVideoSizes.headsUpContentView = makeHeadsUpContentView;
        }
        if (style != null && (extras = androidx.core.app.NotificationCompat.getExtras(highSpeedVideoSizes)) != null) {
            style.addCompatExtras(extras);
        }
        return highSpeedVideoSizes;
    }

    private void getHighSpeedVideoFpsRangesFor(androidx.core.app.NotificationCompat.Action action) {
        android.os.Bundle bundle;
        androidx.core.graphics.drawable.IconCompat iconCompat = action.getIconCompat();
        android.app.Notification.Action.Builder builder = new android.app.Notification.Action.Builder(iconCompat != null ? iconCompat.toIcon() : null, action.getTitle(), action.getActionIntent());
        if (action.getRemoteInputs() != null) {
            for (android.app.RemoteInput remoteInput : androidx.core.app.RemoteInput.getHighSpeedVideoSizes(action.getRemoteInputs())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        if (action.getExtras() != null) {
            bundle = new android.os.Bundle(action.getExtras());
        } else {
            bundle = new android.os.Bundle();
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", action.getAllowGeneratedReplies());
        androidx.core.app.NotificationCompatBuilder.Api24Impl.Camera2StreamConfigurationMap(builder, action.getAllowGeneratedReplies());
        bundle.putInt("android.support.action.semanticAction", action.getSemanticAction());
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.app.NotificationCompatBuilder.Api28Impl.getHighSpeedVideoFpsRanges(builder, action.getSemanticAction());
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.app.NotificationCompatBuilder.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(builder, action.isContextual());
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            androidx.core.app.NotificationCompatBuilder.Api31Impl.Camera2StreamConfigurationMap(builder, action.isAuthenticationRequired());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", action.getShowsUserInterface());
        builder.addExtras(bundle);
        this.getHighSpeedVideoFpsRangesFor.addAction(builder.build());
    }

    protected android.app.Notification getHighSpeedVideoSizes() {
        return this.getHighSpeedVideoFpsRangesFor.build();
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static android.app.Notification.Action.Builder Camera2StreamConfigurationMap(android.app.Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        static android.app.Notification.Builder getHighSpeedVideoSizes(android.app.Notification.Builder builder, java.lang.CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }

        static android.app.Notification.Builder getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static android.app.Notification.Builder getHighSpeedVideoSizes(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static android.app.Notification.Builder getHighSpeedVideoFpsRangesFor(android.app.Notification.Builder builder, android.widget.RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static android.app.Notification.Builder getHighResolutionOutputSizeshNQ4ISI(android.content.Context context, java.lang.String str) {
            return new android.app.Notification.Builder(context, str);
        }

        static android.app.Notification.Builder getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        static android.app.Notification.Builder getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        static android.app.Notification.Builder Camera2StreamConfigurationMap(android.app.Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        static android.app.Notification.Builder getHighSpeedVideoFpsRangesFor(android.app.Notification.Builder builder, java.lang.CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static android.app.Notification.Builder Camera2StreamConfigurationMap(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setShortcutId(str);
        }

        static android.app.Notification.Builder Camera2StreamConfigurationMap(android.app.Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.app.Notification.Action.Builder getHighSpeedVideoFpsRanges(android.app.Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }

        static android.app.Notification.Builder bF_(android.app.Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.app.Notification.Action.Builder getHighResolutionOutputSizeshNQ4ISI(android.app.Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        static android.app.Notification.Builder getHighSpeedVideoFpsRanges(android.app.Notification.Builder builder, java.lang.Object obj) {
            return builder.setLocusId((android.content.LocusId) obj);
        }

        static android.app.Notification.Builder bG_(android.app.Notification.Builder builder, android.app.Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static android.app.Notification.Builder getHighSpeedVideoFpsRanges(android.app.Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static android.app.Notification.Action.Builder Camera2StreamConfigurationMap(android.app.Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        static android.app.Notification.Builder getHighSpeedVideoFpsRangesFor(android.app.Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    static final class Api36Impl {
        private Api36Impl() {
        }

        static android.app.Notification.Builder getHighSpeedVideoFpsRanges(android.app.Notification.Builder builder, java.lang.String str) {
            return builder.setShortCriticalText(str);
        }
    }
}
