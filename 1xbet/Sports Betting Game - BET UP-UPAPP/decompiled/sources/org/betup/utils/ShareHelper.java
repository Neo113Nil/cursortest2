package org.betup.utils;

import android.content.Context;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.util.Locale;
import org.betup.R;
import org.betup.bus.ShareMessage;
import org.betup.services.user.UserService;
import org.betup.utils.InviteHelper;

/* loaded from: classes4.dex */
public class ShareHelper {
    private static final String POSTER_LINK = "http://betup.org/uploads_api/external/poster.png";
    public static final String SHARED_LOG = "SHARE_OFFER: ";

    private ShareHelper() {
    }

    public static String getSharedText(ShareMessage shareMessage, Context context, UserService userService) {
        if (shareMessage.getMsg() == null) {
            return String.format(Locale.getDefault(), context.getString(R.string.share_text), userService.getShortProfile().getUserModel().getReferralCode());
        }
        return shareMessage.getMsg();
    }

    public static String getImgUrl(ShareMessage shareMessage) {
        if (shareMessage.getLinkType() == InviteHelper.LinkType.INVITE) {
            return POSTER_LINK;
        }
        return String.format(Locale.getDefault(), FirebaseRemoteConfig.getInstance().getString("defaultMatchPoster"), Integer.valueOf(shareMessage.getBundle().getInt("matchId")));
    }
}
