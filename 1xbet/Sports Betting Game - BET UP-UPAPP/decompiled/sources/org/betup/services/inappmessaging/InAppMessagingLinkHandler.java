package org.betup.services.inappmessaging;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import androidx.credentials.provider.CredentialEntry;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.inappmessaging.FirebaseInAppMessaging;
import com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener;
import com.google.firebase.inappmessaging.model.Action;
import com.google.firebase.inappmessaging.model.Button;
import com.google.firebase.inappmessaging.model.InAppMessage;
import io.sentry.SentryBaseEvent;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.betup.BuildConfig;
import org.betup.bus.NavigateMessage;
import org.greenrobot.eventbus.EventBus;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: InAppMessagingLinkHandler.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0005H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/betup/services/inappmessaging/InAppMessagingLinkHandler;", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "TAG", "", "setup", "", "handleInAppMessageLink", "url", "parseUrlToTarget", "Lorg/betup/bus/NavigateMessage$Target;", ShareConstants.MEDIA_URI, "Landroid/net/Uri;", "parseUrlToBundle", "Landroid/os/Bundle;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class InAppMessagingLinkHandler {
    public static final int $stable = 0;
    public static final InAppMessagingLinkHandler INSTANCE = new InAppMessagingLinkHandler();
    private static final String TAG = "InAppMessagingLink";

    private InAppMessagingLinkHandler() {
    }

    public final void setup() {
        try {
            Log.d(TAG, "========================================");
            Log.d(TAG, "🔧 Setting up In-App Messaging click listener...");
            FirebaseInAppMessaging firebaseInAppMessaging = FirebaseInAppMessaging.getInstance();
            Intrinsics.checkNotNullExpressionValue(firebaseInAppMessaging, "getInstance(...)");
            firebaseInAppMessaging.addClickListener(new FirebaseInAppMessagingClickListener() { // from class: org.betup.services.inappmessaging.InAppMessagingLinkHandler$setup$1
                @Override // com.google.firebase.inappmessaging.FirebaseInAppMessagingClickListener
                public void messageClicked(InAppMessage inAppMessage, Action action) {
                    String actionUrl;
                    Intrinsics.checkNotNullParameter(inAppMessage, "inAppMessage");
                    Intrinsics.checkNotNullParameter(action, "action");
                    Log.d("InAppMessagingLink", "========================================");
                    Log.d("InAppMessagingLink", "🔥🔥🔥 CLICK DETECTED! 🔥🔥🔥");
                    Log.d("InAppMessagingLink", "Message Type: " + inAppMessage.getMessageType());
                    Log.d("InAppMessagingLink", "Campaign Name: " + inAppMessage.getCampaignName());
                    Log.d("InAppMessagingLink", "Action URL: " + action.getActionUrl());
                    Button button = action.getButton();
                    Log.d("InAppMessagingLink", "Button Text: " + (button != null ? button.getText() : null));
                    Log.d("InAppMessagingLink", "Action: " + action);
                    if (action.getActionUrl() == null || (actionUrl = action.getActionUrl()) == null || !(!StringsKt.isBlank(actionUrl))) {
                        Log.w("InAppMessagingLink", "❌ No action URL found in message");
                        Log.w("InAppMessagingLink", "⚠️ Make sure your Firebase campaign has an action button with a URL configured!");
                        Button button2 = action.getButton();
                        Log.w("InAppMessagingLink", "Action details: buttonText=" + (button2 != null ? button2.getText() : null) + ", actionUrl=" + action.getActionUrl());
                    } else {
                        String actionUrl2 = action.getActionUrl();
                        String obj = actionUrl2 != null ? StringsKt.trim((CharSequence) actionUrl2).toString() : null;
                        Log.d("InAppMessagingLink", "✅ Action URL found: " + obj);
                        InAppMessagingLinkHandler.INSTANCE.handleInAppMessageLink(obj);
                    }
                    Log.d("InAppMessagingLink", "========================================");
                }
            });
            Log.d(TAG, "✅ In-App Messaging click listener configured successfully");
            Log.d(TAG, "========================================");
        } catch (Exception e) {
            Log.e(TAG, "❌ Error setting up click listener", e);
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleInAppMessageLink(String url) {
        Uri parse;
        String scheme;
        String host;
        String path;
        String query;
        Class<?> cls;
        String str = url;
        Log.d(TAG, "========================================");
        Log.d(TAG, "📥 handleInAppMessageLink called");
        Log.d(TAG, "URL: " + str);
        if (str == null || StringsKt.isBlank(str)) {
            Log.w(TAG, "❌ URL is null or empty - cannot process");
            return;
        }
        try {
            parse = Uri.parse(StringsKt.trim((CharSequence) str).toString());
            scheme = parse.getScheme();
            host = parse.getHost();
            path = parse.getPath();
            query = parse.getQuery();
        } catch (Exception e) {
            e = e;
        }
        try {
            Log.d(TAG, "Parsed URI:");
            Log.d(TAG, "  - Scheme: " + scheme);
            Log.d(TAG, "  - Host: " + host);
            Log.d(TAG, "  - Path: " + path);
            Log.d(TAG, "  - Query: " + query);
            Log.d(TAG, "  - Full URI: " + parse);
            Intrinsics.checkNotNull(parse);
            NavigateMessage.Target parseUrlToTarget = parseUrlToTarget(parse);
            Log.d(TAG, "Parsed Target: " + parseUrlToTarget);
            Bundle parseUrlToBundle = parseUrlToBundle(parse);
            Log.d(TAG, "Parsed Bundle (" + parseUrlToBundle.size() + " items):");
            for (String str2 : parseUrlToBundle.keySet()) {
                Object obj = parseUrlToBundle.get(str2);
                Log.d(TAG, "  - " + str2 + " = " + obj + " (" + ((obj == null || (cls = obj.getClass()) == null) ? null : cls.getSimpleName()) + ")");
            }
            if (parseUrlToTarget == null) {
                str = url;
                Log.w(TAG, "❌ Could not determine navigation target for URL: " + str);
                Log.w(TAG, "Supported formats: betup://leagues?sportId=1, betup://matches, etc.");
                Log.d(TAG, "========================================");
                return;
            }
            NavigateMessage navigateMessage = new NavigateMessage(parseUrlToTarget, parseUrlToBundle);
            Log.d(TAG, "📤 Posting NavigateMessage to EventBus:");
            Log.d(TAG, "  - Target: " + parseUrlToTarget);
            Log.d(TAG, "  - Bundle size: " + parseUrlToBundle.size());
            Log.d(TAG, "  - Bundle keys: " + parseUrlToBundle.keySet());
            boolean hasSubscriberForEvent = EventBus.getDefault().hasSubscriberForEvent(NavigateMessage.class);
            Log.d(TAG, "  - EventBus has subscribers: " + hasSubscriberForEvent);
            if (!hasSubscriberForEvent) {
                Log.e(TAG, "⚠️ WARNING: No EventBus subscribers found for NavigateMessage!");
                Log.e(TAG, "⚠️ Make sure MainActivity is registered with EventBus in onResume()");
            }
            EventBus.getDefault().post(navigateMessage);
            Log.d(TAG, "✅ Navigation event posted to EventBus!");
            Log.d(TAG, "========================================");
        } catch (Exception e2) {
            e = e2;
            str = url;
            Log.e(TAG, "❌ Error processing In-App Messaging link: " + str, e);
            e.printStackTrace();
            Log.d(TAG, "========================================");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0212, code lost:
    
        if (r0.equals("bets") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.BETS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x021b, code lost:
    
        if (r0.equals("bet") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0228, code lost:
    
        if (r0.equals("messages") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0234, code lost:
    
        if (r0.equals(com.vk.sdk.api.model.VKScopes.OFFERS) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0240, code lost:
    
        if (r0.equals("league") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x024c, code lost:
    
        if (r0.equals("events") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0264, code lost:
    
        if (r0.equals("achievements") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0127, code lost:
    
        if (r0.equals(com.applovin.sdk.AppLovinEventTypes.USER_COMPLETED_ACHIEVEMENT) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.ACHIEVEMENTS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if (r0.equals("message") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.MESSAGES;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x014a, code lost:
    
        if (r0.equals("users") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.USER_DETAILS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0155, code lost:
    
        if (r0.equals("tasks") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.TASKS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x015f, code lost:
    
        if (r0.equals("offer") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.OFFERS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c3, code lost:
    
        if (r0.equals("event") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.EVENTS;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01cd, code lost:
    
        if (r0.equals("leagues") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:?, code lost:
    
        return org.betup.bus.NavigateMessage.Target.LEAGUES;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d8, code lost:
    
        if (r0.equals(io.sentry.SentryBaseEvent.JsonKeys.USER) == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01e7, code lost:
    
        if (r0.equals("task") == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0056, code lost:
    
        if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) "betup", false, 2, (java.lang.Object) null) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final NavigateMessage.Target parseUrlToTarget(Uri uri) {
        String lowerCase;
        String scheme = uri.getScheme();
        String host = uri.getHost();
        String path = uri.getPath();
        Log.d(TAG, "parseUrlToTarget - scheme: " + scheme + ", host: " + host + ", path: " + path);
        if (scheme != null && !Intrinsics.areEqual(scheme, "betup")) {
            if (host != null) {
                String str = host;
                if (!StringsKt.contains$default((CharSequence) str, (CharSequence) BuildConfig.MATCH_SHARE_LINK_HOST, false, 2, (Object) null)) {
                }
            }
            Log.d(TAG, "External URL, not processing: " + uri);
            return null;
        }
        String str2 = path;
        if (str2 == null || str2.length() == 0) {
            String str3 = host;
            if (str3 != null && str3.length() != 0) {
                lowerCase = host.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
            lowerCase = null;
        } else {
            if (StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
                path = path.substring(1);
                Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
            }
            List split$default = StringsKt.split$default((CharSequence) path, new String[]{"/"}, false, 0, 6, (Object) null);
            if (split$default.isEmpty()) {
                String str4 = host;
                if (str4 != null && str4.length() != 0) {
                    lowerCase = host.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                }
                lowerCase = null;
            } else {
                String str5 = (String) split$default.get(0);
                try {
                    Long.parseLong(str5);
                    String str6 = host;
                    if (str6 != null && str6.length() != 0) {
                        lowerCase = host.toLowerCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    }
                } catch (NumberFormatException unused) {
                }
                lowerCase = str5.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            }
        }
        Log.d(TAG, "Target segment determined: " + lowerCase);
        if (lowerCase == null) {
            return NavigateMessage.Target.HOME;
        }
        switch (lowerCase.hashCode()) {
            case -1658366172:
                break;
            case -1367569419:
                if (lowerCase.equals("casino")) {
                    return NavigateMessage.Target.CASINO;
                }
                Log.w(TAG, "Unsupported target segment: " + lowerCase + ", defaulting to HOME");
                return NavigateMessage.Target.HOME;
            case -1291329255:
                break;
            case -1106750929:
                break;
            case -1019793001:
                break;
            case -462094004:
                break;
            case 97425:
                break;
            case 3020290:
                break;
            case 3208415:
                if (lowerCase.equals("home")) {
                    return NavigateMessage.Target.HOME;
                }
                Log.w(TAG, "Unsupported target segment: " + lowerCase + ", defaulting to HOME");
                return NavigateMessage.Target.HOME;
            case 3529462:
                if (lowerCase.equals("shop")) {
                    return NavigateMessage.Target.SHOP;
                }
                Log.w(TAG, "Unsupported target segment: " + lowerCase + ", defaulting to HOME");
                return NavigateMessage.Target.HOME;
            case 3552645:
                break;
            case 3599307:
                break;
            case 50459684:
                break;
            case 96891546:
                break;
            case 103668165:
                if (lowerCase.equals("match")) {
                    String path2 = uri.getPath();
                    String str7 = path2;
                    if (str7 == null || str7.length() == 0) {
                        return NavigateMessage.Target.MATCHES;
                    }
                    if (StringsKt.startsWith$default(path2, "/", false, 2, (Object) null)) {
                        path2 = path2.substring(1);
                        Intrinsics.checkNotNullExpressionValue(path2, "substring(...)");
                    }
                    List split$default2 = StringsKt.split$default((CharSequence) path2, new String[]{"/"}, false, 0, 6, (Object) null);
                    if (split$default2.isEmpty()) {
                        return NavigateMessage.Target.MATCHES;
                    }
                    try {
                        Long.parseLong((String) split$default2.get(0));
                        return NavigateMessage.Target.MATCH_DETAILS;
                    } catch (NumberFormatException unused2) {
                        return NavigateMessage.Target.MATCHES;
                    }
                }
                Log.w(TAG, "Unsupported target segment: " + lowerCase + ", defaulting to HOME");
                return NavigateMessage.Target.HOME;
            case 105650780:
                break;
            case 110132110:
                break;
            case 111578632:
                break;
            case 840862003:
                if (lowerCase.equals("matches")) {
                    return NavigateMessage.Target.MATCHES;
                }
                Log.w(TAG, "Unsupported target segment: " + lowerCase + ", defaulting to HOME");
                return NavigateMessage.Target.HOME;
            case 954925063:
                break;
            case 1747619631:
                break;
            default:
                Log.w(TAG, "Unsupported target segment: " + lowerCase + ", defaulting to HOME");
                return NavigateMessage.Target.HOME;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x024d, code lost:
    
        if (r10 == null) goto L78;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:108:0x0306. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x0176. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:78:0x025c. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0388  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Bundle parseUrlToBundle(Uri uri) {
        String str;
        int parseInt;
        int i;
        String str2;
        int d;
        int d2;
        Object obj;
        String str3 = " = ";
        Bundle bundle = new Bundle();
        String path = uri.getPath();
        String str4 = path;
        if (str4 != null && str4.length() != 0) {
            if (StringsKt.startsWith$default(path, "/", false, 2, (Object) null)) {
                i = 1;
                path = path.substring(1);
                Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
            } else {
                i = 1;
            }
            String[] strArr = new String[i];
            strArr[0] = "/";
            List split$default = StringsKt.split$default((CharSequence) path, strArr, false, 0, 6, (Object) null);
            if (split$default.size() >= 2) {
                try {
                    String str5 = (String) split$default.get(1);
                    String lowerCase = ((String) split$default.get(0)).toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                    try {
                        int parseInt2 = Integer.parseInt(str5);
                        bundle.putInt("id", parseInt2);
                        switch (lowerCase.hashCode()) {
                            case -309425751:
                                obj = "profile";
                                try {
                                    if (!lowerCase.equals(obj)) {
                                        Log.d(TAG, "Added path ID: " + parseInt2);
                                    }
                                    Log.d(TAG, "Added user ID: " + parseInt2);
                                } catch (NumberFormatException unused) {
                                    try {
                                        long parseLong = Long.parseLong(str5);
                                        bundle.putLong("id", parseLong);
                                        switch (lowerCase.hashCode()) {
                                            case -2062812222:
                                                if (!lowerCase.equals("competition_details")) {
                                                    Log.d(TAG, "Added path ID (long): " + parseLong);
                                                    break;
                                                }
                                                bundle.putLong("competition_id", parseLong);
                                                Log.d(TAG, "Added competition ID (long): " + parseLong + " (both 'id' and 'competition_id')");
                                                break;
                                            case -1095396929:
                                                if (!lowerCase.equals("competition")) {
                                                    Log.d(TAG, "Added path ID (long): " + parseLong);
                                                    break;
                                                }
                                                bundle.putLong("competition_id", parseLong);
                                                Log.d(TAG, "Added competition ID (long): " + parseLong + " (both 'id' and 'competition_id')");
                                                break;
                                            case -309425751:
                                                if (!lowerCase.equals(obj)) {
                                                    Log.d(TAG, "Added path ID (long): " + parseLong);
                                                    break;
                                                }
                                                bundle.putLong("userId", parseLong);
                                                Log.d(TAG, "Added user ID (long): " + parseLong + " (both 'id' and 'userId')");
                                                break;
                                            case 3599307:
                                                if (!lowerCase.equals(SentryBaseEvent.JsonKeys.USER)) {
                                                    Log.d(TAG, "Added path ID (long): " + parseLong);
                                                    break;
                                                }
                                                bundle.putLong("userId", parseLong);
                                                Log.d(TAG, "Added user ID (long): " + parseLong + " (both 'id' and 'userId')");
                                                break;
                                            case 111578632:
                                                if (!lowerCase.equals("users")) {
                                                    Log.d(TAG, "Added path ID (long): " + parseLong);
                                                    break;
                                                }
                                                bundle.putLong("userId", parseLong);
                                                Log.d(TAG, "Added user ID (long): " + parseLong + " (both 'id' and 'userId')");
                                                break;
                                            default:
                                                Log.d(TAG, "Added path ID (long): " + parseLong);
                                                break;
                                        }
                                    } catch (NumberFormatException unused2) {
                                        Log.d(TAG, "Path segment is not a number: " + split$default.get(1));
                                    }
                                    while (r0.hasNext()) {
                                    }
                                    return bundle;
                                }
                            case 3555933:
                                if (!lowerCase.equals("team")) {
                                    Log.d(TAG, "Added path ID: " + parseInt2);
                                    break;
                                }
                                Log.d(TAG, "Added team ID: " + parseInt2);
                                break;
                            case 3599307:
                                if (!lowerCase.equals(SentryBaseEvent.JsonKeys.USER)) {
                                    Log.d(TAG, "Added path ID: " + parseInt2);
                                    break;
                                }
                                Log.d(TAG, "Added user ID: " + parseInt2);
                                break;
                            case 103668165:
                                if (lowerCase.equals("match")) {
                                    bundle.putInt("matchId", parseInt2);
                                    Log.d(TAG, "Added match ID: " + parseInt2 + " (both 'id' and 'matchId')");
                                    break;
                                } else {
                                    Log.d(TAG, "Added path ID: " + parseInt2);
                                    break;
                                }
                            case 110234038:
                                if (!lowerCase.equals("teams")) {
                                    Log.d(TAG, "Added path ID: " + parseInt2);
                                    break;
                                }
                                Log.d(TAG, "Added team ID: " + parseInt2);
                                break;
                            case 111578632:
                                if (!lowerCase.equals("users")) {
                                    Log.d(TAG, "Added path ID: " + parseInt2);
                                    break;
                                }
                                Log.d(TAG, "Added user ID: " + parseInt2);
                                break;
                            default:
                                Log.d(TAG, "Added path ID: " + parseInt2);
                                break;
                        }
                    } catch (NumberFormatException unused3) {
                        obj = "profile";
                    }
                } catch (Exception e) {
                    Log.d(TAG, "Error parsing path ID: " + e.getMessage());
                }
            } else if (split$default.size() == 1) {
                String str6 = (String) split$default.get(0);
                String host = uri.getHost();
                if (host != null) {
                    str2 = host.toLowerCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(str2, "toLowerCase(...)");
                }
                str2 = "";
                try {
                    try {
                        int parseInt3 = Integer.parseInt(str6);
                        bundle.putInt("id", parseInt3);
                        switch (str2.hashCode()) {
                            case -309425751:
                                if (!str2.equals("profile")) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                bundle.putInt("userId", parseInt3);
                                d2 = Log.d(TAG, "Added user ID from single path segment: " + parseInt3 + " (both 'id' and 'userId')");
                                break;
                            case 3555933:
                                if (!str2.equals("team")) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                d2 = Log.d(TAG, "Added team ID from single path segment: " + parseInt3);
                                break;
                            case 3599307:
                                if (!str2.equals(SentryBaseEvent.JsonKeys.USER)) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                bundle.putInt("userId", parseInt3);
                                d2 = Log.d(TAG, "Added user ID from single path segment: " + parseInt3 + " (both 'id' and 'userId')");
                                break;
                            case 103668165:
                                if (!str2.equals("match")) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                bundle.putInt("matchId", parseInt3);
                                d2 = Log.d(TAG, "Added match ID from single path segment: " + parseInt3 + " (both 'id' and 'matchId')");
                                break;
                            case 110234038:
                                if (!str2.equals("teams")) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                d2 = Log.d(TAG, "Added team ID from single path segment: " + parseInt3);
                                break;
                            case 111578632:
                                if (!str2.equals("users")) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                bundle.putInt("userId", parseInt3);
                                d2 = Log.d(TAG, "Added user ID from single path segment: " + parseInt3 + " (both 'id' and 'userId')");
                                break;
                            case 840862003:
                                if (!str2.equals("matches")) {
                                    d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                    break;
                                }
                                bundle.putInt("matchId", parseInt3);
                                d2 = Log.d(TAG, "Added match ID from single path segment: " + parseInt3 + " (both 'id' and 'matchId')");
                                break;
                            default:
                                d2 = Log.d(TAG, "Added ID from single path segment: " + parseInt3);
                                break;
                        }
                        Integer.valueOf(d2);
                    } catch (NumberFormatException unused4) {
                        Unit unit = Unit.INSTANCE;
                    }
                } catch (NumberFormatException unused5) {
                    long parseLong2 = Long.parseLong(str6);
                    bundle.putLong("id", parseLong2);
                    switch (str2.hashCode()) {
                        case -2062812222:
                            if (!str2.equals("competition_details")) {
                                d = Log.d(TAG, "Added ID (long) from single path segment: " + parseLong2);
                                break;
                            }
                            bundle.putLong("competition_id", parseLong2);
                            d = Log.d(TAG, "Added competition ID (long) from single path segment: " + parseLong2);
                            break;
                        case -1095396929:
                            if (!str2.equals("competition")) {
                                d = Log.d(TAG, "Added ID (long) from single path segment: " + parseLong2);
                                break;
                            }
                            bundle.putLong("competition_id", parseLong2);
                            d = Log.d(TAG, "Added competition ID (long) from single path segment: " + parseLong2);
                            break;
                        case -309425751:
                            if (!str2.equals("profile")) {
                                d = Log.d(TAG, "Added ID (long) from single path segment: " + parseLong2);
                                break;
                            }
                            bundle.putLong("userId", parseLong2);
                            d = Log.d(TAG, "Added user ID (long) from single path segment: " + parseLong2);
                            break;
                        case 3599307:
                            if (!str2.equals(SentryBaseEvent.JsonKeys.USER)) {
                                d = Log.d(TAG, "Added ID (long) from single path segment: " + parseLong2);
                                break;
                            }
                            bundle.putLong("userId", parseLong2);
                            d = Log.d(TAG, "Added user ID (long) from single path segment: " + parseLong2);
                            break;
                        case 111578632:
                            if (!str2.equals("users")) {
                                d = Log.d(TAG, "Added ID (long) from single path segment: " + parseLong2);
                                break;
                            }
                            bundle.putLong("userId", parseLong2);
                            d = Log.d(TAG, "Added user ID (long) from single path segment: " + parseLong2);
                            break;
                        default:
                            d = Log.d(TAG, "Added ID (long) from single path segment: " + parseLong2);
                            break;
                    }
                    Integer.valueOf(d);
                }
            }
        }
        for (String str7 : uri.getQueryParameterNames()) {
            String queryParameter = uri.getQueryParameter(str7);
            if (queryParameter != null) {
                String lowerCase2 = queryParameter.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.areEqual(lowerCase2, "true")) {
                    bundle.putBoolean(str7, true);
                    Log.d(TAG, "Added query parameter: " + str7 + " = true (boolean)");
                    str = str3;
                } else if (Intrinsics.areEqual(lowerCase2, CredentialEntry.FALSE_STRING)) {
                    bundle.putBoolean(str7, false);
                    Log.d(TAG, "Added query parameter: " + str7 + " = false (boolean)");
                    str = str3;
                } else {
                    try {
                        parseInt = Integer.parseInt(queryParameter);
                        bundle.putInt(str7, parseInt);
                        str = str3;
                    } catch (NumberFormatException unused6) {
                        str = str3;
                    }
                    try {
                        Log.d(TAG, "Added query parameter: " + str7 + str + parseInt + " (int)");
                    } catch (NumberFormatException unused7) {
                        try {
                            long parseLong3 = Long.parseLong(queryParameter);
                            bundle.putLong(str7, parseLong3);
                            Log.d(TAG, "Added query parameter: " + str7 + str + parseLong3 + " (long)");
                        } catch (NumberFormatException unused8) {
                            bundle.putString(str7, queryParameter);
                            Log.d(TAG, "Added query parameter: " + str7 + str + queryParameter + " (string)");
                        }
                        str3 = str;
                    }
                }
                str3 = str;
            }
        }
        return bundle;
    }
}
