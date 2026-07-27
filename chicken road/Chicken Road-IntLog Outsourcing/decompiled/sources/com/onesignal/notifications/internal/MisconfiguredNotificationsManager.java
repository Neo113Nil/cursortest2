package com.onesignal.notifications.internal;

import com.onesignal.core.internal.minification.KeepStub;
import com.onesignal.notifications.INotificationClickListener;
import com.onesignal.notifications.INotificationLifecycleListener;
import com.onesignal.notifications.INotificationsManager;
import com.onesignal.notifications.IPermissionObserver;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

@KeepStub
/* loaded from: classes.dex */
public final class MisconfiguredNotificationsManager implements INotificationsManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Notification in order to use this functionality!");
        }

        private Companion() {
        }
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getCanRequestPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo23getCanRequestPermission() {
        return ((Boolean) getCanRequestPermission()).booleanValue();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: getPermission, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo24getPermission() {
        return ((Boolean) getPermission()).booleanValue();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    public Object requestPermission(boolean z, InterfaceC1218d interfaceC1218d) {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo19addClickListener(INotificationClickListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo20addForegroundLifecycleListener(INotificationLifecycleListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: addPermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo21addPermissionObserver(IPermissionObserver observer) {
        i.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: clearAllNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo22clearAllNotifications() {
        throw Companion.getEXCEPTION();
    }

    public Void getCanRequestPermission() {
        throw Companion.getEXCEPTION();
    }

    public Void getPermission() {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeClickListener, reason: merged with bridge method [inline-methods] */
    public Void mo25removeClickListener(INotificationClickListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeForegroundLifecycleListener, reason: merged with bridge method [inline-methods] */
    public Void mo26removeForegroundLifecycleListener(INotificationLifecycleListener listener) {
        i.e(listener, "listener");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeGroupedNotifications, reason: merged with bridge method [inline-methods] */
    public Void mo27removeGroupedNotifications(String group) {
        i.e(group, "group");
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removeNotification, reason: merged with bridge method [inline-methods] */
    public Void mo28removeNotification(int i2) {
        throw Companion.getEXCEPTION();
    }

    @Override // com.onesignal.notifications.INotificationsManager
    /* renamed from: removePermissionObserver, reason: merged with bridge method [inline-methods] */
    public Void mo29removePermissionObserver(IPermissionObserver observer) {
        i.e(observer, "observer");
        throw Companion.getEXCEPTION();
    }
}
