package org.betup.services.share;

import android.app.Activity;
import org.betup.bus.ShareMessage;
import org.betup.services.user.UserService;
import org.betup.ui.ProgressDisplay;

/* loaded from: classes2.dex */
public class ShareProviderFactory {
    private final Activity activity;
    private final ProgressDisplay progressDisplay;
    private final UserService userService;

    private ShareProviderFactory(Activity activity, UserService userService, ProgressDisplay progressDisplay) {
        this.activity = activity;
        this.userService = userService;
        this.progressDisplay = progressDisplay;
    }

    public static ShareProviderFactory createFactory(Activity activity, UserService userService, ProgressDisplay progressDisplay) {
        return new ShareProviderFactory(activity, userService, progressDisplay);
    }

    /* renamed from: org.betup.services.share.ShareProviderFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$betup$bus$ShareMessage$Target;

        static {
            int[] iArr = new int[ShareMessage.Target.values().length];
            $SwitchMap$org$betup$bus$ShareMessage$Target = iArr;
            try {
                iArr[ShareMessage.Target.VK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$betup$bus$ShareMessage$Target[ShareMessage.Target.FACEBOOK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$betup$bus$ShareMessage$Target[ShareMessage.Target.FIREBASE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public ShareProvider createShareProvider(ShareMessage.Target target) {
        int i = AnonymousClass1.$SwitchMap$org$betup$bus$ShareMessage$Target[target.ordinal()];
        if (i == 1) {
            return new ShareVKProvider(this.activity, this.progressDisplay, this.userService);
        }
        if (i == 2) {
            return new ShareFacebookProvider(this.activity, this.userService);
        }
        if (i == 3) {
            return new ShareEmailProvider(this.activity, this.userService);
        }
        return new ShareDefaultProvider(this.activity, this.userService);
    }
}
