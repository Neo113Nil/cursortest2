package com.squareup.picasso;

/* loaded from: classes5.dex */
abstract class RemoteViewsAction extends com.squareup.picasso.Action<com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget> {
    com.squareup.picasso.Callback callback;
    final android.widget.RemoteViews remoteViews;
    private com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget target;
    final int viewId;

    abstract void update();

    RemoteViewsAction(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Request request, android.widget.RemoteViews remoteViews, int i, int i2, int i3, int i4, java.lang.Object obj, java.lang.String str, com.squareup.picasso.Callback callback) {
        super(picasso, null, request, i3, i4, i2, null, str, obj, false);
        this.remoteViews = remoteViews;
        this.viewId = i;
        this.callback = callback;
    }

    @Override // com.squareup.picasso.Action
    void complete(android.graphics.Bitmap bitmap, com.squareup.picasso.Picasso.LoadedFrom loadedFrom) {
        this.remoteViews.setImageViewBitmap(this.viewId, bitmap);
        update();
        com.squareup.picasso.Callback callback = this.callback;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.Action
    void cancel() {
        super.cancel();
        if (this.callback != null) {
            this.callback = null;
        }
    }

    @Override // com.squareup.picasso.Action
    public void error(java.lang.Exception exc) {
        if (this.errorResId != 0) {
            setImageResource(this.errorResId);
        }
        com.squareup.picasso.Callback callback = this.callback;
        if (callback != null) {
            callback.onError(exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.squareup.picasso.Action
    public com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
        if (this.target == null) {
            this.target = new com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget(this.remoteViews, this.viewId);
        }
        return this.target;
    }

    void setImageResource(int i) {
        this.remoteViews.setImageViewResource(this.viewId, i);
        update();
    }

    static class RemoteViewsTarget {
        final android.widget.RemoteViews remoteViews;
        final int viewId;

        RemoteViewsTarget(android.widget.RemoteViews remoteViews, int i) {
            this.remoteViews = remoteViews;
            this.viewId = i;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget remoteViewsTarget = (com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget) obj;
            return this.viewId == remoteViewsTarget.viewId && this.remoteViews.equals(remoteViewsTarget.remoteViews);
        }

        public int hashCode() {
            return (this.remoteViews.hashCode() * 31) + this.viewId;
        }
    }

    static class AppWidgetAction extends com.squareup.picasso.RemoteViewsAction {
        private final int[] appWidgetIds;

        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        /* bridge */ /* synthetic */ com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
            return super.getTarget();
        }

        AppWidgetAction(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Request request, android.widget.RemoteViews remoteViews, int i, int[] iArr, int i2, int i3, java.lang.String str, java.lang.Object obj, int i4, com.squareup.picasso.Callback callback) {
            super(picasso, request, remoteViews, i, i4, i2, i3, obj, str, callback);
            this.appWidgetIds = iArr;
        }

        @Override // com.squareup.picasso.RemoteViewsAction
        void update() {
            android.appwidget.AppWidgetManager.getInstance(this.picasso.context).updateAppWidget(this.appWidgetIds, this.remoteViews);
        }
    }

    static class NotificationAction extends com.squareup.picasso.RemoteViewsAction {
        private final android.app.Notification notification;
        private final int notificationId;
        private final java.lang.String notificationTag;

        @Override // com.squareup.picasso.RemoteViewsAction, com.squareup.picasso.Action
        /* bridge */ /* synthetic */ com.squareup.picasso.RemoteViewsAction.RemoteViewsTarget getTarget() {
            return super.getTarget();
        }

        NotificationAction(com.squareup.picasso.Picasso picasso, com.squareup.picasso.Request request, android.widget.RemoteViews remoteViews, int i, int i2, android.app.Notification notification, java.lang.String str, int i3, int i4, java.lang.String str2, java.lang.Object obj, int i5, com.squareup.picasso.Callback callback) {
            super(picasso, request, remoteViews, i, i5, i3, i4, obj, str2, callback);
            this.notificationId = i2;
            this.notificationTag = str;
            this.notification = notification;
        }

        @Override // com.squareup.picasso.RemoteViewsAction
        void update() {
            ((android.app.NotificationManager) com.squareup.picasso.Utils.getService(this.picasso.context, com.helpshift.util.ConfigValues.SOURCE_NOTIFICATION)).notify(this.notificationTag, this.notificationId, this.notification);
        }
    }
}
