package org.betup.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.firebase.dynamiclinks.FirebaseDynamicLinks;
import com.google.firebase.dynamiclinks.ShortDynamicLink;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import org.betup.services.user.UserService;

/* loaded from: classes4.dex */
public final class InviteHelper {
    private static final String APP_STORE_ID = "1435732186";
    private static final String LINK_DOMAIN = "https://u3ze7.app.goo.gl";

    public enum LinkType {
        INVITE,
        MATCH
    }

    public interface OnLinkGotListener {
        void linkGot(String link);
    }

    private InviteHelper() {
    }

    public static void clear(Context context) {
        SharedPreferences.Editor edit = context.getSharedPreferences("inviteCode", 0).edit();
        edit.putString("inviteCode", null);
        edit.apply();
    }

    public static void saveInvited(Context context, String inviteCode) {
        SharedPreferences.Editor edit = context.getSharedPreferences("inviteCode", 0).edit();
        edit.putString("inviteCode", inviteCode);
        edit.apply();
    }

    public static String getInvited(Context context) {
        return context.getSharedPreferences("inviteCode", 0).getString("inviteCode", null);
    }

    public static void getLink(final Activity context, UserService userService, LinkType linkType, final OnLinkGotListener linkGotListener, Bundle bundle) {
        if (linkType == LinkType.INVITE) {
            linkGotListener.linkGot(PreferenceManager.getDefaultSharedPreferences(context).getString("invite_link", null));
            return;
        }
        Log.d("SHARE_OFFER", "GENERATING LINK FOR MATCH");
        if (!userService.isRegistered()) {
            Log.d("SHARE_OFFER", "NO USER: CANNOT CREATE LINK FOR NOBODY. SOMETHING WRONG WITH AUTHENTICATION.");
        } else {
            if (bundle == null || bundle.getInt("matchId", 0) == 0) {
                return;
            }
            FirebaseDynamicLinks.getInstance().createDynamicLink().setLink(Uri.parse(String.format(FirebaseRemoteConfig.getInstance().getString("defaultMatchLink"), bundle.getString("res", "wide"), userService.getShortProfile().getUserModel().getReferralCode(), Integer.valueOf(bundle.getInt("matchId"))))).setSocialMetaTagParameters(new DynamicLink.SocialMetaTagParameters.Builder().setImageUrl(Uri.parse(String.format(FirebaseRemoteConfig.getInstance().getString("custom_match_poster"), bundle.getString("res", "wide"), Integer.valueOf(bundle.getInt("matchId"))))).build()).setDynamicLinkDomain(LINK_DOMAIN).setIosParameters(new DynamicLink.IosParameters.Builder(APP_STORE_ID).build()).setAndroidParameters(new DynamicLink.AndroidParameters.Builder().build()).buildShortDynamicLink().addOnCompleteListener(context, new OnCompleteListener<ShortDynamicLink>() { // from class: org.betup.utils.InviteHelper.1
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public void onComplete(Task<ShortDynamicLink> task) {
                    if (task.isSuccessful()) {
                        OnLinkGotListener.this.linkGot(task.getResult().getShortLink().toString());
                        Log.d("SHARE_OFFER", "GENERATED FIREBASE LINK = " + task.getResult().getShortLink());
                    } else {
                        OnLinkGotListener.this.linkGot(null);
                        task.getException().printStackTrace();
                        Log.d("SHARE_OFFER", "ERROR WHILTE GENERATING FIREBASE INVITE LINK...");
                    }
                }
            });
        }
    }

    public static void genFirebaseLink(Activity activity, String referralCode) {
        Log.d("SHARE_OFFER", "STARTING LINK TASK");
        final Context applicationContext = activity.getApplicationContext();
        FirebaseDynamicLinks.getInstance().createDynamicLink().setLink(Uri.parse(String.format(FirebaseRemoteConfig.getInstance().getString("defaultInviteLink"), referralCode))).setDomainUriPrefix(LINK_DOMAIN).setAndroidParameters(new DynamicLink.AndroidParameters.Builder().build()).setIosParameters(new DynamicLink.IosParameters.Builder("org.betup.app").setAppStoreId(APP_STORE_ID).build()).buildShortDynamicLink().addOnFailureListener(activity, new OnFailureListener() { // from class: org.betup.utils.InviteHelper.3
            @Override // com.google.android.gms.tasks.OnFailureListener
            public void onFailure(Exception e) {
                Log.d("SHARE_OFFER", "FAILURE");
            }
        }).addOnCompleteListener(activity, new OnCompleteListener<ShortDynamicLink>() { // from class: org.betup.utils.InviteHelper.2
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(Task<ShortDynamicLink> task) {
                if (task.isSuccessful()) {
                    Log.d("SHARE_OFFER", "GENERATED FIREBASE LINK = " + task.getResult().getShortLink());
                    PreferenceManager.getDefaultSharedPreferences(applicationContext).edit().putString("invite_link", task.getResult().getShortLink().toString()).apply();
                } else {
                    Log.d("SHARE_OFFER", "ERROR WHILTE GENERATING FIREBASE INVITE LINK...");
                }
            }
        });
    }
}
