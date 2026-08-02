package org.betup.services.share;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import org.betup.bus.ShareMessage;
import org.betup.services.user.UserService;
import org.betup.utils.InviteHelper;
import org.betup.utils.ShareHelper;

/* loaded from: classes2.dex */
public class ShareDefaultProvider implements ShareProvider {
    private static final int GENERIC_SHARE = 4;
    private Activity context;
    private final UserService userService;

    @Override // org.betup.services.share.ShareProvider
    public boolean onActivityResult(int requestCode, int resultCode, Intent data) {
        return false;
    }

    public ShareDefaultProvider(Activity context, UserService userService) {
        this.context = context;
        this.userService = userService;
    }

    @Override // org.betup.services.share.ShareProvider
    public void share(ShareMessage shareMessage) {
        Log.d(ShareHelper.SHARED_LOG, "Making share " + shareMessage.getLinkType());
        if (shareMessage.getLinkType() == InviteHelper.LinkType.MATCH && (shareMessage.getBundle() == null || shareMessage.getBundle().getInt("matchId") == 0)) {
            Log.d(ShareHelper.SHARED_LOG, "return");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", "BetUp #1 Betting App - " + ShareHelper.getSharedText(shareMessage, this.context, this.userService));
        intent.putExtra("android.intent.extra.STREAM", Uri.parse(ShareHelper.getImgUrl(shareMessage)));
        intent.setType("text/plain");
        this.context.startActivityForResult(intent, 4);
    }
}
