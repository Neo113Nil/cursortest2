package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import net.pubnative.lite.sdk.vpaid.PlayerInfo;
import net.pubnative.lite.sdk.vpaid.VideoAdListener;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᵅ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0959 extends VideoAdListener implements InterfaceC0997 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0957 f2794;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0807 f2795;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final VideoAdListener f2796;

    public C0959(C0957 c0957, VideoAdListener videoAdListener, C0807 c0807) {
        this.f2794 = c0957;
        this.f2796 = videoAdListener;
        this.f2795 = c0807;
    }

    public final void onAdClicked() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("kFC5g7mjwMuvSqmDuIfWqalXnIKVjs3krVy5\n", "xjnd5tbipIc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdClicked();
        }
    }

    public final void onAdCustomEndCardFound() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("LP/9Z5YfJkwT5e1nlzswLhX42Ga6KzF0FfvcbJ0dI3Ie0PZ3lzo=\n", "epaZAvleQgA=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdCustomEndCardFound();
        }
    }

    public final void onAdDidReachEnd() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("lMy3xS76Dqer1qfFL94Yxa3LksQF0g65p8SwyATVDg==\n", "wqXToEG7aus=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdDidReachEnd();
        }
    }

    public final void onAdDismissed() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("kph9F37+V22tgm0Xf9pBD6ufWBZV1kBMrYJqF3U=\n", "xPEZchG/MyE=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed();
        }
    }

    public final void onAdExpired() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("EKquQ9n3i20vsL5D2NOdDymti0Lzzp9INKau\n", "RsPKJra27yE=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdExpired();
        }
    }

    public final void onAdLoadFail(PlayerInfo playerInfo) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("Zfhdtzu2O1xa4k23OpItPlz/eLYYmD50dfBQvg==\n", "M5E50lT3XxA=\n"), playerInfo);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadFail(playerInfo);
        }
    }

    public final void onAdLoadSuccess() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("O/XQimTFTDAE78CKZeFaUgLy9YtH60kYPunXjG73Ww==\n", "bZy07wuEKHw=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdLoadSuccess();
        }
    }

    public final void onAdSkipped() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("uZkVCeZHF9iGgwUJ52MBuoCeMAjabRrkn5UV\n", "7/BxbIkGc5Q=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdSkipped();
        }
    }

    public final void onAdStarted() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("zkn3OI1zhAHxU+c4jFeSY/dO0jmxRoE/7EX3\n", "mCCTXeIy4E0=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdStarted();
        }
    }

    public final void onCustomCTACLick(boolean z) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("J6o1xL7BVPMYsCXEv+VCkR6tEtSi9F/SMpcQ4p3pU9Q=\n", "ccNRodGAML8=\n"), Boolean.valueOf(z));
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTACLick(z);
        }
    }

    public final void onCustomCTALoadFail() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("yUiB6mA+btT2UpHqYRp4tvBPpvp8C2X13HWkw2Aebt7+SIk=\n", "nyHljw9/Cpg=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTALoadFail();
        }
    }

    public final void onCustomCTAShow() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("vK4i/c40LTuDtDL9zxA7WYWpBe3SASYaqZMHy8kaPg==\n", "6sdGmKF1SXc=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onCustomCTAShow();
        }
    }

    public final void onCustomEndCardClick(String str) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("5Etom3VDxRjbUXibdGfTet1MT4tpds4590xovXtwxRfeS2+V\n", "siIM/hoCoVQ=\n"), str);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardClick(str);
        }
    }

    public final void onCustomEndCardShow(String str) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("oTrctR2VA0GeIMy1HLEVI5g9+6UBoAhgsj3ckxOmA16fPM8=\n", "91O40HLUZw0=\n"), str);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onCustomEndCardShow(str);
        }
    }

    public final void onDefaultEndCardClick(String str) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("BsUrSZMVNZM53ztJkjEj8T/CC0maNSSzJOkhSL81I7sTwCZPlw==\n", "UKxPLPxUUd8=\n"), str);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardClick(str);
        }
    }

    public final void onDefaultEndCardShow(String str) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("qnbdTQscQumVbM1NCjhUi5Nx/U0CPFPJiFrXTCc8VMGvd9Zf\n", "/B+5KGRdJqU=\n"), str);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onDefaultEndCardShow(str);
        }
    }

    public final void onEndCardClosed(Boolean bool) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("0uApqqQbTSbt+jmqpT9bROvnCKGvGUgY4MohoLg/TQ==\n", "hIlNz8taKWo=\n"), bool);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onEndCardClosed(bool);
        }
    }

    public final void onEndCardLoadFail(Boolean bool) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("z6U81GKe/PrwvyzUY7rqmPaiHd9pnPnE/YA30GmZ+d/1\n", "mcxYsQ3fmLY=\n"), bool);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadFail(bool);
        }
    }

    public final void onEndCardLoadSuccess(Boolean bool) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("xvaIZLdqpPv57Jhktk6ymf/xqW+8aKHF9NODYLx4tdTz+p9y\n", "kJ/sAdgrwLc=\n"), bool);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onEndCardLoadSuccess(bool);
        }
    }

    public final void onEndCardSkipped(Boolean bool) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("nvl6Gx8JiOSh42obHi2ehqf+WxAUC43arMN1FwA4icw=\n", "yJAefnBI7Kg=\n"), bool);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onEndCardSkipped(bool);
        }
    }

    public final void onLeaveApp() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("t7ao2C1+UJWIrLjYLFpG946xgNgjSVGYka8=\n", "4d/MvUI/NNk=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onLeaveApp();
        }
    }

    public final void onReplay() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("xp5mdsaQrcb5hHZ2x7S7pP+ZUHbZvajz\n", "kPcCE6nRyYo=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onReplay();
        }
    }

    public final void onReplayFinish() {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("Hy3gcIMSjy8gN/BwgjaZTSYq1nCcP4oaDy3qfJ87\n", "SUSEFexT62M=\n"), new Object[0]);
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onReplayFinish();
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0997
    /* renamed from: ﾒ */
    public final Object mo5381() {
        return this.f2796;
    }

    public final void onAdDismissed(int i) {
        this.f2794.m5529(this, this.f2795, StringFog.decrypt("VhQfHidXUwtpDg8eJnNFaW8TOh8Mf0QqaQ4IHixBXjNoLQkUL2RSNHM=\n", "AH17e0gWN0c=\n"), Integer.valueOf(i));
        VideoAdListener videoAdListener = this.f2796;
        if (videoAdListener != null) {
            videoAdListener.onAdDismissed(i);
        }
    }
}
