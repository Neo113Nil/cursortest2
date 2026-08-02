package com.payair.logic.notifications;

@kotlin.Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\"2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010("}, d2 = {"Lcom/payair/logic/notifications/FirebaseNotificationHandlerImpl;", "Lcom/payair/logic/notifications/FirebaseNotificationHandler;", "Lcom/payair/logic/storage/StorageService;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/payair/logic/managers/PushManager;", "pushManager", "Lcom/payair/logic/managers/SetupManager;", "setupManager", "Lcom/payair/logic/managers/TokenManager;", "tokenManager", "Lcom/payair/logic/managers/TokenRefreshManager;", "refreshManager", "Lcom/payair/logic/managers/NewTransactionNotificationHandler;", "newTransactionNotificationHandler", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceInterface", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/payair/db/Database;", "database", "Landroid/content/Context;", "context", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "enrollmentIdStorage", "<init>", "(Lcom/payair/logic/storage/StorageService;Lcom/payair/logic/managers/PushManager;Lcom/payair/logic/managers/SetupManager;Lcom/payair/logic/managers/TokenManager;Lcom/payair/logic/managers/TokenRefreshManager;Lcom/payair/logic/managers/NewTransactionNotificationHandler;Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/managers/CoroutineDispatcherProvider;Lcom/payair/db/Database;Landroid/content/Context;Lcom/payair/logic/storage/EnrollmentIdStorage;)V", "", "Lcom/payair/model/NetworkTokenReference;", "networkTokenReferences", "", "onNotifyTokenUpdateReceived", "(Ljava/util/Set;)Z", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "onNewToken", "(Ljava/lang/String;)V", "Lcom/google/firebase/messaging/RemoteMessage;", "remoteMessage", "onMessageReceived", "(Lcom/google/firebase/messaging/RemoteMessage;)V", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FirebaseNotificationHandlerImpl implements com.payair.logic.notifications.FirebaseNotificationHandler {
    public static final java.lang.String TITLE_CARD_METADATA = "CARD_METADATA_UPDATE";
    public static final java.lang.String TITLE_MDES = "MDES_REMOTE_NOTIFICATION_MESSAGE";
    public static final java.lang.String TITLE_NEW_TRANSACTION = "NEW_TRANSACTION_NOTIFICATION";
    public static final java.lang.String TITLE_NOTIFY_TOKEN_UPDATE = "TOKEN_UPDATED_NOTIFICATION";

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.storage.StorageService f4461a;
    public final com.payair.logic.managers.PushManager b;
    public final com.payair.logic.managers.SetupManager c;
    public final com.payair.logic.managers.TokenManager d;
    public final com.payair.logic.managers.TokenRefreshManager e;
    public final com.payair.logic.managers.NewTransactionNotificationHandler f;
    public final com.payair.logic.implementation.HceSDKInterface g;
    public final com.payair.logic.managers.CoroutineDispatcherProvider h;
    public final com.payair.db.Database i;
    public final android.content.Context j;
    public final com.payair.logic.storage.EnrollmentIdStorage k;

    public FirebaseNotificationHandlerImpl(com.payair.logic.storage.StorageService storageService, com.payair.logic.managers.PushManager pushManager, com.payair.logic.managers.SetupManager setupManager, com.payair.logic.managers.TokenManager tokenManager, com.payair.logic.managers.TokenRefreshManager tokenRefreshManager, com.payair.logic.managers.NewTransactionNotificationHandler newTransactionNotificationHandler, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.db.Database database, android.content.Context context, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(setupManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRefreshManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newTransactionNotificationHandler, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentIdStorage, "");
        this.f4461a = storageService;
        this.b = pushManager;
        this.c = setupManager;
        this.d = tokenManager;
        this.e = tokenRefreshManager;
        this.f = newTransactionNotificationHandler;
        this.g = hceSDKInterface;
        this.h = coroutineDispatcherProvider;
        this.i = database;
        this.j = context;
        this.k = enrollmentIdStorage;
    }

    public final void a(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        java.lang.String str;
        kotlinx.coroutines.Job launch$default;
        java.util.Map<java.lang.String, java.lang.String> data = remoteMessage.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        java.lang.String str2 = data.get("title");
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -528399190) {
                if (hashCode != 780872885) {
                    if (hashCode == 1057451691 && str2.equals(TITLE_NEW_TRANSACTION)) {
                        java.lang.String str3 = data.get(com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY);
                        com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Received NEW_TRANSACTION_NOTIFICATION", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY, str3)), null, 4, null);
                        if (str3 != null) {
                            launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getIOScope(), null, null, new com.payair.csdk.s0(this, str3, null), 3, null);
                            if (launch$default != null) {
                                return;
                            }
                        }
                        com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Missing key: tokenUniqueReference", null, null, 6, null);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        return;
                    }
                } else if (str2.equals(TITLE_NOTIFY_TOKEN_UPDATE)) {
                    a(data);
                    return;
                }
            } else if (str2.equals(TITLE_CARD_METADATA)) {
                try {
                    str = (java.lang.String) kotlin.collections.MapsKt.getValue(data, "cardReference");
                } catch (java.util.NoSuchElementException unused) {
                    com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "No token reference in the notification data.", null, null, 6, null);
                    str = null;
                }
                if (str != null) {
                    kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getIOScope(), null, null, new com.payair.csdk.r0(this, str, null), 3, null);
                    return;
                }
                return;
            }
        }
        com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Unknown message received: ".concat(java.lang.String.valueOf(remoteMessage)), null, null, 6, null);
    }

    @Override // com.payair.logic.notifications.FirebaseNotificationHandler
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage remoteMessage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteMessage, "");
        java.util.Map<java.lang.String, java.lang.String> data = remoteMessage.getData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "");
        data.isEmpty();
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "Message data payload: ".concat(java.lang.String.valueOf(data)), null, null, 6, null);
        if (data.containsKey("payload")) {
            com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Received MDES push notification", null, null, 6, null);
            this.g.handleMDESPushPayload(remoteMessage);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(data.get("sender"), "PAYAIR")) {
            a(remoteMessage);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(data.get("sender"), "PAYAIR_ON_BEHALF_OF_MDES")) {
            com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Received MDES push notification", null, null, 6, null);
            this.g.handleMDESPushPayload(remoteMessage);
            return;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(data.get("sender"), "PAYPAL_TSP")) {
            if (data.containsKey("title")) {
                a(remoteMessage);
                return;
            } else {
                com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Unknown message received: ".concat(java.lang.String.valueOf(remoteMessage)), null, null, 6, null);
                return;
            }
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(data.get("title"), TITLE_MDES)) {
            a(remoteMessage);
        } else {
            com.paypal.android.logger.Logger.i$default(com.payair.logging.LoggerKt.getLog(), "Received MDES push notification", null, null, 6, null);
            this.g.handleMDESPushPayload(remoteMessage);
        }
    }

    @Override // com.payair.logic.notifications.FirebaseNotificationHandler
    public final void onNewToken(java.lang.String token) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(token, "");
        if (this.c.checkRegistrationStatus() == com.payair.model.RegistrationStatus.REGISTERED) {
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getIOScope(), null, null, new com.payair.csdk.w0(this, token, null), 3, null);
        }
    }

    @Override // com.payair.logic.notifications.FirebaseNotificationHandler
    public final boolean onNotifyTokenUpdateReceived(java.util.Set<com.payair.model.NetworkTokenReference> networkTokenReferences) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReferences, "");
        com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "onNotifyTokenUpdateReceived: ".concat(java.lang.String.valueOf(kotlin.collections.CollectionsKt.joinToString$default(networkTokenReferences, null, null, null, 0, null, com.payair.csdk.x0.f4332a, 31, null))), null, null, 6, null);
        kotlin.jvm.internal.Ref.BooleanRef booleanRef = new kotlin.jvm.internal.Ref.BooleanRef();
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getIOScope(), null, null, new com.payair.csdk.y0(this, networkTokenReferences, booleanRef, null), 3, null);
        return booleanRef.element;
    }

    public static final void access$resetTransactionData(com.payair.logic.notifications.FirebaseNotificationHandlerImpl firebaseNotificationHandlerImpl, java.lang.String str) {
        try {
            byte[] selectedCard = firebaseNotificationHandlerImpl.g.getSelectedCard();
            java.lang.String str2 = selectedCard != null ? new java.lang.String(selectedCard, kotlin.text.Charsets.UTF_8) : "";
            if (str2.equals("")) {
                com.payair.logic.implementation.HceSDKInterface hceSDKInterface = firebaseNotificationHandlerImpl.g;
                byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                hceSDKInterface.setSelectedCard(bytes);
            }
            firebaseNotificationHandlerImpl.g.stopTransaction();
            if (str2.equals("")) {
                com.payair.logic.implementation.HceSDKInterface hceSDKInterface2 = firebaseNotificationHandlerImpl.g;
                byte[] bytes2 = "".getBytes(kotlin.text.Charsets.UTF_8);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes2, "");
                hceSDKInterface2.setSelectedCard(bytes2);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public final void a(java.util.Map map) {
        try {
            java.lang.String str = (java.lang.String) kotlin.collections.MapsKt.getValue(map, com.paypal.oslo.feature.taptopay.data.pushnotification.TapToPaySilentPushHandler.TOKEN_UNIQUE_REFERENCE_KEY);
            java.lang.String str2 = (java.lang.String) kotlin.collections.MapsKt.getValue(map, "status");
            java.lang.String str3 = (java.lang.String) kotlin.collections.MapsKt.getValue(map, "notificationType");
            java.lang.String str4 = (java.lang.String) kotlin.collections.MapsKt.getValue(map, "cardNetwork");
            com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Updating the token status ");
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(" ");
            sb.append(str3);
            com.paypal.android.logger.Logger.d$default(log, sb.toString(), null, null, 6, null);
            if (str.length() <= 0 || str2.length() <= 0) {
                return;
            }
            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getMainScope(), null, null, new com.payair.csdk.v0(this, str, str3, str2, str4, map, null), 3, null);
        } catch (java.util.NoSuchElementException e) {
            com.paypal.android.logger.Logger.e$default(com.payair.logging.LoggerKt.getLog(), "Exception in parsing message: ".concat(java.lang.String.valueOf(e)), null, null, null, 14, null);
        }
    }

    public final void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.paypal.android.logger.Logger log = com.payair.logging.LoggerKt.getLog();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Received NOTIFY_TOKEN_UPDATE with ");
        sb.append(str);
        sb.append(" status");
        com.paypal.android.logger.Logger.i$default(log, sb.toString(), kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("networkTokenReference", str2), kotlin.TuplesKt.to("scheme", str3)), null, 4, null);
        byte[] bytes = str2.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatus.SUSPENDED.getStatusName())) {
            this.g.suspendCardForToken(bytes);
            return;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatus.INACTIVE.getStatusName())) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str3, "MASTERCARD")) {
                this.g.removeCard(bytes);
            }
        } else {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatus.ACTIVE.getStatusName())) {
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getIOScope(), null, null, new com.payair.csdk.p0(str3, this, bytes, str2, null), 3, null);
                com.payair.listener.ClientListener d = this.g.getD();
                if (d != null) {
                    d.onActivateToken(str2);
                    return;
                }
                return;
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatus.DEACTIVATED.getStatusName()) || kotlin.jvm.internal.Intrinsics.areEqual(str, com.payair.model.TokenStatus.DELETED.getStatusName())) {
                this.g.removeCard(bytes);
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.h.getIOScope(), null, null, new com.payair.csdk.q0(this, str2, null), 3, null);
            } else {
                com.paypal.android.logger.Logger.w$default(com.payair.logging.LoggerKt.getLog(), "Unknown token status", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, str)), null, 4, null);
            }
        }
    }
}
