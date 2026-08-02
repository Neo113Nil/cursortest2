package org.betup.bus;

import android.os.Bundle;
import org.betup.utils.InviteHelper;

/* loaded from: classes2.dex */
public class ShareMessage {
    private Bundle bundle;
    private InviteHelper.LinkType linkType = InviteHelper.LinkType.INVITE;
    private Target target;

    public enum Target {
        FACEBOOK,
        VK,
        FIREBASE,
        OTHER
    }

    public ShareMessage(Target target) {
        this.target = target;
    }

    public ShareMessage(Target target, Bundle bundle) {
        this.target = target;
        this.bundle = bundle;
    }

    public Bundle getArguments() {
        return this.bundle;
    }

    public Target getTarget() {
        return this.target;
    }

    public ShareMessage setMsg(String msg) {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        this.bundle.putString("msg", msg);
        return this;
    }

    public ShareMessage setBundle(Bundle bundle) {
        this.bundle = bundle;
        return this;
    }

    public ShareMessage setLinkType(InviteHelper.LinkType linkType) {
        this.linkType = linkType;
        return this;
    }

    public ShareMessage setRes(Res res) {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        this.bundle.putString("res", res.toString());
        return this;
    }

    public Bundle getBundle() {
        return this.bundle;
    }

    public InviteHelper.LinkType getLinkType() {
        return this.linkType;
    }

    public String getMsg() {
        return this.bundle.getString("msg", null);
    }

    public enum Res {
        WIDE("wide"),
        SQUARE("square");

        private String name;

        @Override // java.lang.Enum
        public String toString() {
            return this.name;
        }

        Res(String name) {
            this.name = name;
        }
    }
}
