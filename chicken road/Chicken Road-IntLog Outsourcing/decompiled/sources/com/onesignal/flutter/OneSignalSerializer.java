package com.onesignal.flutter;

import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.inAppMessages.IInAppMessage;
import com.onesignal.inAppMessages.IInAppMessageClickEvent;
import com.onesignal.inAppMessages.IInAppMessageClickResult;
import com.onesignal.inAppMessages.IInAppMessageDidDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageDidDisplayEvent;
import com.onesignal.inAppMessages.IInAppMessageWillDismissEvent;
import com.onesignal.inAppMessages.IInAppMessageWillDisplayEvent;
import com.onesignal.notifications.IActionButton;
import com.onesignal.notifications.INotification;
import com.onesignal.notifications.INotificationClickEvent;
import com.onesignal.notifications.INotificationClickResult;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import com.onesignal.notifications.internal.common.NotificationConstants;
import com.onesignal.session.internal.outcomes.impl.OutcomeConstants;
import com.onesignal.user.state.UserChangedState;
import com.onesignal.user.state.UserState;
import com.onesignal.user.subscriptions.PushSubscriptionChangedState;
import com.onesignal.user.subscriptions.PushSubscriptionState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
class OneSignalSerializer {
    public static List<HashMap<String, Object>> convertActionButtonsToMap(List<IActionButton> list) {
        ArrayList arrayList = new ArrayList();
        for (IActionButton iActionButton : list) {
            HashMap hashMap = new HashMap();
            hashMap.put(OutcomeConstants.OUTCOME_ID, iActionButton.getId());
            hashMap.put("text", iActionButton.getText());
            hashMap.put("icon", iActionButton.getIcon());
            arrayList.add(hashMap);
        }
        return arrayList;
    }

    public static HashMap<String, Object> convertInAppMessageClickEventToMap(IInAppMessageClickEvent iInAppMessageClickEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, convertInAppMessageToMap(iInAppMessageClickEvent.getMessage()));
        hashMap.put("result", convertInAppMessageClickResultToMap(iInAppMessageClickEvent.getResult()));
        return hashMap;
    }

    public static HashMap<String, Object> convertInAppMessageClickResultToMap(IInAppMessageClickResult iInAppMessageClickResult) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("action_id", iInAppMessageClickResult.getActionId());
        hashMap.put("url", iInAppMessageClickResult.getUrl());
        hashMap.put("closing_message", Boolean.valueOf(iInAppMessageClickResult.getClosingMessage()));
        return hashMap;
    }

    public static HashMap<String, Object> convertInAppMessageDidDismissEventToMap(IInAppMessageDidDismissEvent iInAppMessageDidDismissEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, convertInAppMessageToMap(iInAppMessageDidDismissEvent.getMessage()));
        return hashMap;
    }

    public static HashMap<String, Object> convertInAppMessageDidDisplayEventToMap(IInAppMessageDidDisplayEvent iInAppMessageDidDisplayEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, convertInAppMessageToMap(iInAppMessageDidDisplayEvent.getMessage()));
        return hashMap;
    }

    public static HashMap<String, Object> convertInAppMessageToMap(IInAppMessage iInAppMessage) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.InAppMessageTable.COLUMN_NAME_MESSAGE_ID, iInAppMessage.getMessageId());
        return hashMap;
    }

    public static HashMap<String, Object> convertInAppMessageWillDismissEventToMap(IInAppMessageWillDismissEvent iInAppMessageWillDismissEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, convertInAppMessageToMap(iInAppMessageWillDismissEvent.getMessage()));
        return hashMap;
    }

    public static HashMap<String, Object> convertInAppMessageWillDisplayEventToMap(IInAppMessageWillDisplayEvent iInAppMessageWillDisplayEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, convertInAppMessageToMap(iInAppMessageWillDisplayEvent.getMessage()));
        return hashMap;
    }

    private static List<Object> convertJSONArrayToList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            Object obj = jSONArray.get(i2);
            if (obj instanceof JSONArray) {
                obj = convertJSONArrayToList((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = convertJSONObjectToHashMap((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static HashMap<String, Object> convertJSONObjectToHashMap(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        if (jSONObject != null && jSONObject != JSONObject.NULL) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!jSONObject.isNull(next)) {
                    Object obj = jSONObject.get(next);
                    if (obj instanceof JSONArray) {
                        obj = convertJSONArrayToList((JSONArray) obj);
                    } else if (obj instanceof JSONObject) {
                        obj = convertJSONObjectToHashMap((JSONObject) obj);
                    }
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    public static HashMap<String, Object> convertNotificationClickEventToMap(INotificationClickEvent iNotificationClickEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.TABLE_NAME, convertNotificationToMap(iNotificationClickEvent.getNotification()));
        hashMap.put("result", convertNotificationClickResultToMap(iNotificationClickEvent.getResult()));
        return hashMap;
    }

    private static HashMap<String, Object> convertNotificationClickResultToMap(INotificationClickResult iNotificationClickResult) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("action_id", iNotificationClickResult.getActionId());
        hashMap.put("url", iNotificationClickResult.getUrl());
        return hashMap;
    }

    public static HashMap<String, Object> convertNotificationToMap(INotification iNotification) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(NotificationConstants.BUNDLE_KEY_ANDROID_NOTIFICATION_ID, Integer.valueOf(iNotification.getAndroidNotificationId()));
        if (iNotification.getGroupedNotifications() != null) {
            hashMap.put("groupKey", iNotification.getGroupKey());
            hashMap.put("groupMessage", iNotification.getGroupMessage());
            hashMap.put("groupedNotifications", iNotification.getGroupedNotifications());
        }
        hashMap.put("notificationId", iNotification.getNotificationId());
        hashMap.put(OneSignalDbContract.NotificationTable.COLUMN_NAME_TITLE, iNotification.getTitle());
        if (iNotification.getBody() != null) {
            hashMap.put("body", iNotification.getBody());
        }
        if (iNotification.getSmallIcon() != null) {
            hashMap.put("smallIcon", iNotification.getSmallIcon());
        }
        if (iNotification.getLargeIcon() != null) {
            hashMap.put("largeIcon", iNotification.getLargeIcon());
        }
        if (iNotification.getBigPicture() != null) {
            hashMap.put("bigPicture", iNotification.getBigPicture());
        }
        if (iNotification.getSmallIconAccentColor() != null) {
            hashMap.put("smallIconAccentColor", iNotification.getSmallIconAccentColor());
        }
        if (iNotification.getLaunchURL() != null) {
            hashMap.put("launchUrl", iNotification.getLaunchURL());
        }
        if (iNotification.getSound() != null) {
            hashMap.put("sound", iNotification.getSound());
        }
        if (iNotification.getLedColor() != null) {
            hashMap.put("ledColor", iNotification.getLedColor());
        }
        hashMap.put("lockScreenVisibility", Integer.valueOf(iNotification.getLockScreenVisibility()));
        if (iNotification.getGroupKey() != null) {
            hashMap.put("groupKey", iNotification.getGroupKey());
        }
        if (iNotification.getGroupMessage() != null) {
            hashMap.put("groupMessage", iNotification.getGroupMessage());
        }
        if (iNotification.getFromProjectNumber() != null) {
            hashMap.put("fromProjectNumber", iNotification.getFromProjectNumber());
        }
        if (iNotification.getCollapseId() != null) {
            hashMap.put("collapseId", iNotification.getCollapseId());
        }
        hashMap.put("priority", Integer.valueOf(iNotification.getPriority()));
        if (iNotification.getAdditionalData() != null && iNotification.getAdditionalData().length() > 0) {
            hashMap.put("additionalData", convertJSONObjectToHashMap(iNotification.getAdditionalData()));
        }
        if (iNotification.getActionButtons() != null) {
            hashMap.put("buttons", convertActionButtonsToMap(iNotification.getActionButtons()));
        }
        hashMap.put("rawPayload", iNotification.getRawPayload());
        return hashMap;
    }

    public static HashMap<String, Object> convertNotificationWillDisplayEventToMap(INotificationWillDisplayEvent iNotificationWillDisplayEvent) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(OneSignalDbContract.NotificationTable.TABLE_NAME, convertNotificationToMap(iNotificationWillDisplayEvent.getNotification()));
        return hashMap;
    }

    public static HashMap<String, Object> convertOnPushSubscriptionChange(PushSubscriptionChangedState pushSubscriptionChangedState) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("current", convertPushSubscriptionState(pushSubscriptionChangedState.getCurrent()));
        hashMap.put("previous", convertPushSubscriptionState(pushSubscriptionChangedState.getPrevious()));
        return hashMap;
    }

    public static HashMap<String, Object> convertOnUserStateChange(UserChangedState userChangedState) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("current", convertUserState(userChangedState.getCurrent()));
        return hashMap;
    }

    public static HashMap<String, Object> convertPushSubscriptionState(PushSubscriptionState pushSubscriptionState) {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("token", pushSubscriptionState.getToken());
        hashMap.put(OutcomeConstants.OUTCOME_ID, pushSubscriptionState.getId());
        hashMap.put("optedIn", Boolean.valueOf(pushSubscriptionState.getOptedIn()));
        return hashMap;
    }

    public static HashMap<String, Object> convertUserState(UserState userState) {
        HashMap<String, Object> hashMap = new HashMap<>();
        String nullIfEmpty = setNullIfEmpty(userState.getOnesignalId());
        String nullIfEmpty2 = setNullIfEmpty(userState.getExternalId());
        hashMap.put("onesignalId", nullIfEmpty);
        hashMap.put("externalId", nullIfEmpty2);
        return hashMap;
    }

    public static String setNullIfEmpty(String str) {
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }
}
