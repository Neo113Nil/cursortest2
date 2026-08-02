package org.betup.services.share;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.util.Log;
import org.betup.R;
import org.betup.bus.ShareMessage;
import org.betup.services.user.UserService;
import org.betup.utils.InviteHelper;
import org.betup.utils.ShareHelper;
import org.betup.utils.SnackbarHelper;

/* loaded from: classes2.dex */
public class ShareEmailProvider implements ShareProvider {
    private Activity context;
    private final UserService userService;

    @Override // org.betup.services.share.ShareProvider
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        return false;
    }

    public ShareEmailProvider(Activity context, UserService userService) {
        this.context = context;
        this.userService = userService;
    }

    @Override // org.betup.services.share.ShareProvider
    public void share(final ShareMessage shareMessage) {
        Log.d(ShareHelper.SHARED_LOG, "Making share " + shareMessage.getLinkType());
        if (shareMessage.getLinkType() == InviteHelper.LinkType.MATCH && (shareMessage.getBundle() == null || shareMessage.getBundle().getInt("matchId") == 0)) {
            Log.d(ShareHelper.SHARED_LOG, "return");
        } else {
            InviteHelper.getLink(this.context, this.userService, shareMessage.getLinkType(), new InviteHelper.OnLinkGotListener() { // from class: org.betup.services.share.ShareEmailProvider.1
                @Override // org.betup.utils.InviteHelper.OnLinkGotListener
                public void linkGot(String link) {
                    if (link == null) {
                        Log.d(ShareHelper.SHARED_LOG, "LINK NULL");
                        return;
                    }
                    Intent intent = new Intent("android.intent.action.SEND");
                    intent.setType("message/rfc822");
                    intent.putExtra("android.intent.extra.SUBJECT", "BetUp #1 Betting App");
                    intent.putExtra("android.intent.extra.TEXT", ShareHelper.getSharedText(shareMessage, ShareEmailProvider.this.context, ShareEmailProvider.this.userService) + " " + ShareHelper.getImgUrl(shareMessage) + " " + link);
                    try {
                        ShareEmailProvider.this.context.startActivity(Intent.createChooser(intent, ShareEmailProvider.this.context.getString(R.string.send_email)));
                    } catch (ActivityNotFoundException unused) {
                        SnackbarHelper.showShort(ShareEmailProvider.this.context, R.string.no_email_clients);
                    }
                }
            }, shareMessage.getBundle());
        }
    }
}
