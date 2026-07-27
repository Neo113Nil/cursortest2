package com.startapp.sdk.ads.video;

import G0.m;
import I1.x;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.ads.video.player.VideoPlayerInterface$VideoPlayerErrorType;
import com.startapp.sdk.ads.video.tracking.AbsoluteTrackingLink;
import com.startapp.sdk.ads.video.tracking.ActionTrackingLink;
import com.startapp.sdk.ads.video.tracking.FractionTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoClickedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoPausedTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoProgressTrackingParams;
import com.startapp.sdk.ads.video.tracking.VideoTrackingLink;
import com.startapp.sdk.ads.video.tracking.VideoTrackingParams;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.adsbase.VideoConfig;
import com.startapp.sdk.adsbase.adinformation.AdInformationView;
import com.startapp.sdk.adsbase.adlisteners.NotDisplayedReason;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.ak;
import com.startapp.sdk.internal.cb;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.e9;
import com.startapp.sdk.internal.ek;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.h0;
import com.startapp.sdk.internal.ii;
import com.startapp.sdk.internal.ij;
import com.startapp.sdk.internal.kj;
import com.startapp.sdk.internal.la;
import com.startapp.sdk.internal.lj;
import com.startapp.sdk.internal.ne;
import com.startapp.sdk.internal.nj;
import com.startapp.sdk.internal.oe;
import com.startapp.sdk.internal.pd;
import com.startapp.sdk.internal.pj;
import com.startapp.sdk.internal.qj;
import com.startapp.sdk.internal.rf;
import com.startapp.sdk.internal.rj;
import com.startapp.sdk.internal.sd;
import com.startapp.sdk.internal.sf;
import com.startapp.sdk.internal.si;
import com.startapp.sdk.internal.sj;
import com.startapp.sdk.internal.tj;
import com.startapp.sdk.internal.uj;
import com.startapp.sdk.internal.vj;
import com.startapp.sdk.internal.w0;
import com.startapp.sdk.internal.wa;
import com.startapp.sdk.internal.wb;
import com.startapp.sdk.internal.wj;
import com.startapp.sdk.internal.xf;
import com.startapp.sdk.internal.xj;
import com.startapp.sdk.internal.yj;
import com.startapp.sdk.internal.zj;
import com.startapp.sdk.omsdk.VerificationDetails;
import com.startapp.startappsdk.R;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o1.AbstractC1150b;
import o1.C1149a;
import o1.e;
import o1.i;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C1166b;
import p1.EnumC1165a;
import s1.C1202i;
import s1.C1203j;
import v1.AbstractC1217a;

/* loaded from: classes.dex */
public final class c extends wa {

    /* renamed from: s0, reason: collision with root package name */
    public static final int f3046s0 = R.id.io_start_video_view;

    /* renamed from: K, reason: collision with root package name */
    public long f3047K;
    public pd L;

    /* renamed from: M, reason: collision with root package name */
    public VideoView f3048M;

    /* renamed from: N, reason: collision with root package name */
    public RelativeLayout f3049N;

    /* renamed from: O, reason: collision with root package name */
    public RelativeLayout f3050O;

    /* renamed from: P, reason: collision with root package name */
    public ProgressBar f3051P;

    /* renamed from: R, reason: collision with root package name */
    public boolean f3053R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3054S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f3055T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3056U;

    /* renamed from: W, reason: collision with root package name */
    public boolean f3058W;

    /* renamed from: X, reason: collision with root package name */
    public boolean f3059X;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f3061Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f3062a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f3063b0;

    /* renamed from: d0, reason: collision with root package name */
    public int f3065d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f3066e0;
    public boolean f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f3067g0;

    /* renamed from: h0, reason: collision with root package name */
    public long f3068h0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f3075q0;

    /* renamed from: Q, reason: collision with root package name */
    public int f3052Q = 0;

    /* renamed from: V, reason: collision with root package name */
    public int f3057V = 1;

    /* renamed from: Y, reason: collision with root package name */
    public int f3060Y = 0;

    /* renamed from: c0, reason: collision with root package name */
    public int f3064c0 = 0;

    /* renamed from: i0, reason: collision with root package name */
    public String f3069i0 = null;

    /* renamed from: j0, reason: collision with root package name */
    public final Handler f3070j0 = new Handler();

    /* renamed from: k0, reason: collision with root package name */
    public final HashMap f3071k0 = new HashMap();
    public final HashMap l0 = new HashMap();

    /* renamed from: m0, reason: collision with root package name */
    public final HashMap f3072m0 = new HashMap();
    public final HashMap n0 = new HashMap();

    /* renamed from: o0, reason: collision with root package name */
    public final Handler f3073o0 = new Handler();

    /* renamed from: p0, reason: collision with root package name */
    public final tj f3074p0 = new tj(this);

    /* renamed from: r0, reason: collision with root package name */
    public final uj f3076r0 = new uj(this);

    public final void A() {
        FractionTrackingLink[] c3 = x().getVideoTrackingDetails().c();
        if (c3 != null) {
            for (FractionTrackingLink fractionTrackingLink : c3) {
                List list = (List) this.f3072m0.get(Integer.valueOf(fractionTrackingLink.g()));
                if (list == null) {
                    list = new ArrayList();
                    this.f3072m0.put(Integer.valueOf(fractionTrackingLink.g()), list);
                }
                list.add(fractionTrackingLink);
            }
        }
        AbsoluteTrackingLink[] a3 = x().getVideoTrackingDetails().a();
        if (a3 != null) {
            for (AbsoluteTrackingLink absoluteTrackingLink : a3) {
                List list2 = (List) this.n0.get(Integer.valueOf(absoluteTrackingLink.g()));
                if (list2 == null) {
                    list2 = new ArrayList();
                    this.n0.put(Integer.valueOf(absoluteTrackingLink.g()), list2);
                }
                list2.add(absoluteTrackingLink);
            }
        }
    }

    public final boolean B() {
        return !this.f3061Z ? C() && this.f3054S : this.f3060Y >= AdsCommonMetaData.k().F().j() && C() && this.f3054S;
    }

    public final boolean C() {
        pd pdVar = this.L;
        return (pdVar == null || pdVar.f4213g == null) ? false : true;
    }

    public final boolean D() {
        pd pdVar;
        boolean isSkippable = x().isSkippable();
        Long unskipLess = x().getUnskipLess();
        if (unskipLess == null || (pdVar = this.L) == null || pdVar.f4213g == null) {
            return isSkippable;
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return isSkippable && timeUnit.toSeconds((long) pdVar.f4214h.getDuration()) > timeUnit.toSeconds(unskipLess.longValue());
    }

    public final boolean E() {
        return this.f4585A > 0 || D() || this.f3058W;
    }

    public final void F() {
        pd pdVar = this.L;
        if (pdVar != null) {
            try {
                boolean z3 = this.f3053R;
                MediaPlayer mediaPlayer = pdVar.f4213g;
                if (mediaPlayer != null) {
                    if (z3) {
                        mediaPlayer.setVolume(0.0f, 0.0f);
                    } else {
                        mediaPlayer.setVolume(1.0f, 1.0f);
                    }
                }
            } catch (Throwable th) {
                d9.a(th);
            }
        }
        si.a(this.f4595t, true, "videoApi.setSound", this.f3053R ? "OFF" : "ON");
    }

    public final void G() {
        ProgressBar progressBar;
        if (this.L == null) {
            return;
        }
        boolean q3 = AdsCommonMetaData.k().F().q();
        String localVideoPath = x().getLocalVideoPath();
        if (localVideoPath != null) {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.a(localVideoPath);
            }
            if (q3 && localVideoPath.endsWith(".temp")) {
                this.f3061Z = true;
                this.f3063b0 = true;
                this.f3060Y = AdsCommonMetaData.k().F().j();
            }
        } else if (q3) {
            String videoUrl = x().getVideoUrl();
            oe oeVar = ne.f4108a;
            if (videoUrl != null && videoUrl.equals(oeVar.f4165c)) {
                oeVar.f4163a = false;
            }
            pd pdVar2 = this.L;
            if (pdVar2 != null) {
                pdVar2.a(videoUrl);
            }
            this.f3061Z = true;
            if (!this.f0 && ((progressBar = this.f3051P) == null || !progressBar.isShown())) {
                this.f3070j0.postDelayed(new pj(this), AdsCommonMetaData.k().F().h());
            }
        } else {
            a(VideoMode$VideoFinishedReason.SKIPPED);
        }
        if (this.f3069i0 == null) {
            this.f3069i0 = this.f3061Z ? "2" : "1";
        }
    }

    public final void H() {
        VideoView videoView;
        sd sdVar;
        this.f3062a0 = true;
        if (this.f0) {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f4214h.pause();
                return;
            }
            return;
        }
        boolean z3 = u() == 0;
        if (z3) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            si.a(this.f4595t, true, "videoApi.setVideoDuration", Long.valueOf(timeUnit.toSeconds(v())));
            si.a(this.f4595t, true, "videoApi.setVideoRemainingTimer", 0);
            si.a(this.f4595t, true, "videoApi.setSkipTimer", Long.valueOf(timeUnit.toSeconds(w())));
            si.a(this.f4595t, true, "videoApi.setVideoCurrentPosition", Long.valueOf(timeUnit.toSeconds(u())));
        }
        if (this.L != null) {
            if (z3) {
                a((ImageButton) null);
            }
            pd pdVar2 = this.L;
            if (pdVar2 != null) {
                pdVar2.f4214h.start();
                this.f4595t.setBackgroundColor(33554431);
            }
            int v3 = v();
            if (z3 && v3 > 0 && (sdVar = this.f4588D) != null) {
                float f = v3;
                float f3 = this.f3053R ? 0.0f : 1.0f;
                C1166b c1166b = sdVar.f4334c;
                if (c1166b != null) {
                    if (f <= 0.0f) {
                        throw new IllegalArgumentException("Invalid Media duration");
                    }
                    if (f3 < 0.0f || f3 > 1.0f) {
                        throw new IllegalArgumentException("Invalid Media volume");
                    }
                    i iVar = c1166b.f10235a;
                    X0.a.c(iVar);
                    JSONObject jSONObject = new JSONObject();
                    w1.b.b(jSONObject, "duration", Float.valueOf(f));
                    w1.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f3));
                    w1.b.b(jSONObject, "deviceVolume", Float.valueOf(C1203j.b().f10334a));
                    iVar.f10172e.b("start", jSONObject);
                }
            }
            I();
            if (this.f3062a0 && (videoView = this.f3048M) != null) {
                a(videoView);
            }
        }
        this.f4424b.f3148b.setVisibility(0);
        F();
    }

    public final void I() {
        ProgressBar progressBar;
        this.f3070j0.removeCallbacksAndMessages(null);
        ProgressBar progressBar2 = this.f3051P;
        if (progressBar2 == null || !progressBar2.isShown() || (progressBar = this.f3051P) == null) {
            return;
        }
        progressBar.setVisibility(8);
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void a(Bundle bundle) {
        super.a(bundle);
        try {
            int i3 = AdsCommonMetaData.k().F().i();
            if (i3 > 0) {
                this.f3065d0 = 100 / i3;
            } else {
                this.f3065d0 = 0;
            }
            y();
            A();
            this.f3053R = x().isVideoMuted() || AdsCommonMetaData.k().F().m().equals("muted");
        } catch (Throwable th) {
            d9.a(th);
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            wb.a(this.f4423a).a(intent);
            this.f3056U = true;
            b();
        }
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void b() {
        String localVideoPath;
        super.b();
        if (this.f3063b0 && (localVideoPath = x().getLocalVideoPath()) != null && localVideoPath.endsWith(".temp")) {
            new File(localVideoPath).delete();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r5 <= 0) goto L17;
     */
    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c() {
        long j3;
        if (this.f0) {
            i();
            return false;
        }
        if (this.L == null) {
            return false;
        }
        int u3 = u();
        if (!this.f3058W && this.f4585A <= 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            j3 = timeUnit.toSeconds(w()) - timeUnit.toSeconds(u3);
        }
        j3 = 0;
        if (!E() || j3 != 0) {
            if (!x().isCloseable() && !this.f3059X) {
                return true;
            }
            i();
            return false;
        }
        ProgressBar progressBar = this.f3051P;
        if (progressBar != null && progressBar.isShown()) {
            I();
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
        a(this.f3067g0, new VideoTrackingParams(a(this.f3067g0), this.f4585A, this.f4435n, this.f3069i0), "skipped", x().getVideoTrackingDetails().p());
        return true;
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void f() {
        C1166b c1166b;
        if (!this.f0 && !this.f4423a.isFinishing() && !this.f3059X && !this.f3058W) {
            VideoPausedTrackingParams.PauseOrigin pauseOrigin = VideoPausedTrackingParams.PauseOrigin.EXTERNAL;
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f4214h.pause();
                sd sdVar = this.f4588D;
                if (sdVar != null && (c1166b = sdVar.f4334c) != null) {
                    i iVar = c1166b.f10235a;
                    X0.a.c(iVar);
                    iVar.f10172e.b("pause", null);
                }
            }
            a(this.f3067g0, new VideoPausedTrackingParams(this.f4435n, a(this.f3067g0), this.f4585A, this.f3057V, pauseOrigin, this.f3069i0), "paused", x().getVideoTrackingDetails().j());
        }
        pd pdVar2 = this.L;
        if (pdVar2 != null) {
            MediaPlayer mediaPlayer = pdVar2.f4213g;
            if (mediaPlayer != null) {
                mediaPlayer.setOnSeekCompleteListener(null);
                pdVar2.f4213g = null;
            }
            ne.f4108a.f4164b = null;
            this.L = null;
        }
        I();
        if (this.f3075q0) {
            this.f4423a.unregisterReceiver(this.f3076r0);
            this.f3075q0 = false;
        }
        this.f3073o0.removeCallbacksAndMessages(null);
        super.f();
    }

    @Override // com.startapp.sdk.internal.wa, com.startapp.sdk.internal.u7
    public final void g() {
        super.g();
        if (this.f4423a.isFinishing()) {
            return;
        }
        this.f4423a.registerReceiver(this.f3076r0, new IntentFilter("android.media.RINGER_MODE_CHANGED"));
        this.f3075q0 = true;
        if (this.f3048M == null) {
            Context a3 = w0.a(this.f4423a);
            if (a3 == null) {
                a3 = this.f4423a;
            }
            this.f3050O = (RelativeLayout) this.f4423a.findViewById(h0.f3816h);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            VideoView videoView = new VideoView(a3);
            this.f3048M = videoView;
            videoView.setId(f3046s0);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams2.addRule(13);
            ProgressBar progressBar = new ProgressBar(a3, null, android.R.attr.progressBarStyleInverse);
            this.f3051P = progressBar;
            progressBar.setVisibility(4);
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(14);
            layoutParams3.addRule(15);
            RelativeLayout relativeLayout = new RelativeLayout(a3);
            this.f3049N = relativeLayout;
            relativeLayout.setId(h0.f3819k);
            this.f4423a.setContentView(this.f3049N);
            this.f3049N.addView(this.f3048M, layoutParams2);
            this.f3049N.addView(this.f3050O, layoutParams);
            this.f3049N.addView(this.f3051P, layoutParams3);
            if (h0.f3815g.booleanValue()) {
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams4.addRule(12);
                layoutParams4.addRule(14);
                RelativeLayout relativeLayout2 = this.f3049N;
                TextView textView = new TextView(a3);
                textView.setBackgroundColor(-16777216);
                textView.setAlpha(0.5f);
                textView.setTextColor(-7829368);
                textView.setSingleLine(false);
                textView.setText("url=" + x().getVideoUrl());
                relativeLayout2.addView(textView, layoutParams4);
            }
            this.f4424b.f3148b.setVisibility(4);
        }
        if (this.L == null) {
            this.L = new pd(this.f3048M);
        }
        this.f3055T = false;
        RelativeLayout relativeLayout3 = this.f3049N;
        if (relativeLayout3 != null) {
            relativeLayout3.setBackgroundColor(-16777216);
        }
        G();
        if (this.f0) {
            this.f4424b.f3148b.setVisibility(0);
            this.f3048M.setVisibility(4);
        }
        pd pdVar = this.L;
        pdVar.f3485e = new vj(this);
        pdVar.f3482b = new wj(this);
        pdVar.f3484d = new b(this);
        xj xjVar = new xj(this);
        pdVar.f3483c = new yj(this);
        pdVar.f = xjVar;
        this.f3048M.addOnLayoutChangeListener(new nj(this));
        this.f3073o0.post(this.f3074p0);
    }

    @Override // com.startapp.sdk.internal.u7
    public final void h() {
        if (this.f3056U) {
            return;
        }
        super.h();
    }

    @Override // com.startapp.sdk.internal.wa
    public final void i() {
        if (this.f3056U) {
            return;
        }
        if (this.f0 || this.f3048M == null) {
            a(this.f3067g0, new VideoTrackingParams(a(this.f3067g0), this.f4585A, this.f4435n, this.f3069i0), "postrollClosed", x().getVideoTrackingDetails().l());
            super.i();
        } else {
            pd pdVar = this.L;
            int currentPosition = pdVar != null ? pdVar.f4214h.getCurrentPosition() : 0;
            a(currentPosition, new VideoTrackingParams(a(currentPosition), this.f4585A, this.f4435n, this.f3069i0), "closed", x().getVideoTrackingDetails().i());
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final long k() {
        return TimeUnit.MILLISECONDS.toSeconds(u());
    }

    @Override // com.startapp.sdk.internal.wa
    public final cb l() {
        OverlayActivity overlayActivity = this.f4423a;
        la laVar = this.f4592H;
        sj sjVar = new sj(this);
        a aVar = new a(this);
        rj rjVar = new rj(this);
        TrackingParams trackingParams = new TrackingParams(this.f4435n);
        boolean[] zArr = this.f;
        return new lj(overlayActivity, laVar, laVar, sjVar, aVar, rjVar, trackingParams, (zArr == null || zArr.length <= 0) ? true : zArr[0]);
    }

    @Override // com.startapp.sdk.internal.wa
    public final long m() {
        Long l3 = this.f4436o;
        return l3 != null ? TimeUnit.SECONDS.toMillis(l3.longValue()) : TimeUnit.SECONDS.toMillis(MetaData.E().A());
    }

    @Override // com.startapp.sdk.internal.wa
    public final TrackingParams n() {
        return new VideoTrackingParams(0, this.f4585A, this.f4435n, this.f3069i0);
    }

    @Override // com.startapp.sdk.internal.wa
    public final boolean o() {
        return this.f4432k.getType() == Ad.AdType.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.wa, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.f3052Q < x().getPostRollHtmlNum()) {
            z();
            return;
        }
        la laVar = this.f4592H;
        laVar.f3985a.i();
        laVar.f3985a.b();
    }

    @Override // com.startapp.sdk.internal.wa
    public final void p() {
    }

    @Override // com.startapp.sdk.internal.wa
    public final void q() {
        this.f3054S = true;
        if (this.f0) {
            a((View) this.f4595t);
            z();
            return;
        }
        si.a(this.f4595t, true, "videoApi.setClickableVideo", Boolean.valueOf(x().isClickable()));
        si.a(this.f4595t, true, "videoApi.setMode", "PLAYER");
        si.a(this.f4595t, true, "videoApi.setCloseable", Boolean.valueOf(x().isCloseable() || this.f3059X));
        si.a(this.f4595t, true, "videoApi.setSkippable", Boolean.valueOf(E()));
        if (B()) {
            H();
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final void r() {
        int l3 = AdsCommonMetaData.k().F().l();
        ActionTrackingLink[] o3 = x().getVideoTrackingDetails().o();
        a((v() * l3) / 100, new VideoTrackingParams(l3, this.f4585A, this.f4435n, this.f3069i0), "rewarded", o3);
    }

    public final int u() {
        pd pdVar = this.L;
        if (pdVar == null) {
            return this.f3067g0;
        }
        int currentPosition = pdVar.f4214h.getCurrentPosition();
        if (currentPosition > this.f3067g0) {
            this.f3067g0 = currentPosition;
        }
        return this.f3067g0;
    }

    public final int v() {
        pd pdVar = this.L;
        if (pdVar != null) {
            return pdVar.f4214h.getDuration();
        }
        return -1;
    }

    public final long w() {
        long skippableAfter = x().getSkippableAfter();
        pd pdVar = this.L;
        return (pdVar == null || pdVar.f4213g == null) ? skippableAfter : Math.min(skippableAfter, pdVar.f4214h.getDuration());
    }

    public final VideoAdDetails x() {
        return ((ij) this.f4432k).f3886r;
    }

    public final void y() {
        if (this.f4428g.equals("back")) {
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.BOTH)) {
                this.f3058W = true;
                this.f3059X = true;
                return;
            }
            if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.SKIP)) {
                this.f3058W = true;
                this.f3059X = false;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.CLOSE)) {
                this.f3058W = false;
                this.f3059X = true;
            } else if (AdsCommonMetaData.k().F().a().equals(VideoConfig.BackMode.DISABLED)) {
                this.f3058W = false;
                this.f3059X = false;
            } else {
                this.f3058W = false;
                this.f3059X = false;
            }
        }
    }

    public final void z() {
        String postRollHtml = x().getPostRollHtml(this.f3052Q);
        if (postRollHtml != null) {
            this.f3073o0.post(new m(7, this));
            this.f4595t.setWebViewClient(new zj(this));
            si.a(this.f4595t, postRollHtml);
            Log.println(2, "StartAppSDK", "Post-roll start rendering the ad content");
            this.f3052Q++;
            return;
        }
        si.a(this.f4595t, true, "videoApi.setReplayEnabled", Boolean.valueOf(this.L != null));
        si.a(this.f4595t, true, "videoApi.setMode", VideoMode$HtmlMode.POST_ROLL + "_" + x().getPostRollType());
        this.f3073o0.postDelayed(new qj(this), AdsCommonMetaData.k().F().b() * 1000);
    }

    public final void b(int i3) {
        List list;
        C1166b c1166b;
        if (!this.f3066e0 && this.f4585A <= 0 && i3 != 0) {
            this.f3066e0 = true;
            xf xfVar = this.f4599x;
            if (xfVar != null) {
                xfVar.c();
            }
            a(0, new VideoTrackingParams(0, this.f4585A, this.f4435n, this.f3069i0), "impression", x().getVideoTrackingDetails().d());
            a(0, new VideoTrackingParams(0, this.f4585A, this.f4435n, this.f3069i0), "creativeView", x().getVideoTrackingDetails().b());
            sd sdVar = this.f4588D;
            if (sdVar != null) {
                sdVar.a();
            }
        }
        for (Integer num : this.f3072m0.keySet()) {
            int intValue = num.intValue();
            if (i3 > 0 && i3 >= (v() * intValue) / 100 && this.f3071k0.get(num) == null) {
                if (this.f3072m0.containsKey(num)) {
                    List list2 = (List) this.f3072m0.get(num);
                    if (list2 != null) {
                        a((v() * intValue) / 100, new VideoProgressTrackingParams(intValue, this.f4585A, this.f4435n, this.f3069i0), "fraction", (VideoTrackingLink[]) list2.toArray(new FractionTrackingLink[0]));
                    }
                    sd sdVar2 = this.f4588D;
                    if (sdVar2 != null) {
                        if (intValue == 25) {
                            C1166b c1166b2 = sdVar2.f4334c;
                            if (c1166b2 != null) {
                                i iVar = c1166b2.f10235a;
                                X0.a.c(iVar);
                                iVar.f10172e.b("firstQuartile", null);
                            }
                        } else if (intValue == 50) {
                            C1166b c1166b3 = sdVar2.f4334c;
                            if (c1166b3 != null) {
                                i iVar2 = c1166b3.f10235a;
                                X0.a.c(iVar2);
                                iVar2.f10172e.b("midpoint", null);
                            }
                        } else if (intValue == 75 && (c1166b = sdVar2.f4334c) != null) {
                            i iVar3 = c1166b.f10235a;
                            X0.a.c(iVar3);
                            iVar3.f10172e.b("thirdQuartile", null);
                        }
                    }
                }
                this.f3071k0.put(num, Boolean.TRUE);
            }
        }
        for (Integer num2 : this.n0.keySet()) {
            int intValue2 = num2.intValue();
            if (i3 > 0 && i3 >= intValue2 && this.l0.get(num2) == null) {
                if (this.n0.containsKey(num2) && (list = (List) this.n0.get(num2)) != null) {
                    a(intValue2, new VideoProgressTrackingParams(intValue2, this.f4585A, this.f4435n, this.f3069i0), "absolute", (VideoTrackingLink[]) list.toArray(new AbsoluteTrackingLink[0]));
                }
                this.l0.put(num2, Boolean.TRUE);
            }
        }
        if (i3 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
            s();
        }
        if (this.f3061Z) {
            if (i3 >= (v() * AdsCommonMetaData.k().F().l()) / 100) {
                s();
            }
        }
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(WebView webView) {
        super.a(webView);
        webView.setLayerType(1, null);
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(ImageButton imageButton) {
        VideoAdDetails x3;
        List<VerificationDetails> adVerifications;
        x xVar;
        if (!MetaData.E().j0() || (x3 = x()) == null || (adVerifications = x3.getAdVerifications()) == null) {
            return;
        }
        sd sdVar = new sd(this.f4595t.getContext(), adVerifications, true);
        this.f4588D = sdVar;
        AbstractC1150b abstractC1150b = sdVar.f4332a;
        if (abstractC1150b != null) {
            try {
                AdInformationView adInformationView = this.f4424b.f3148b;
                e eVar = e.f10156c;
                if (adInformationView != null) {
                    abstractC1150b.a(adInformationView, eVar);
                }
                if (imageButton != null) {
                    sd sdVar2 = this.f4588D;
                    e eVar2 = e.f10155b;
                    AbstractC1150b abstractC1150b2 = sdVar2.f4332a;
                    if (abstractC1150b2 != null) {
                        abstractC1150b2.a(imageButton, eVar2);
                    }
                }
                sd sdVar3 = this.f4588D;
                WebView webView = this.f4595t;
                e eVar3 = e.f10154a;
                AbstractC1150b abstractC1150b3 = sdVar3.f4332a;
                if (abstractC1150b3 != null) {
                    abstractC1150b3.a(webView, eVar3);
                }
                sd sdVar4 = this.f4588D;
                RelativeLayout relativeLayout = this.f3050O;
                AbstractC1150b abstractC1150b4 = sdVar4.f4332a;
                if (abstractC1150b4 != null) {
                    abstractC1150b4.a(relativeLayout, eVar);
                }
            } catch (RuntimeException unused) {
            }
            sd sdVar5 = this.f4588D;
            VideoView videoView = this.f3048M;
            AbstractC1150b abstractC1150b5 = sdVar5.f4332a;
            if (abstractC1150b5 != null) {
                abstractC1150b5.d(videoView);
            }
            AbstractC1150b abstractC1150b6 = this.f4588D.f4332a;
            if (abstractC1150b6 != null) {
                abstractC1150b6.e();
            }
            sd sdVar6 = this.f4588D;
            boolean E3 = E();
            long w3 = D() ? w() : 0L;
            if (sdVar6.f4333b == null || !sdVar6.f4336e.compareAndSet(false, true)) {
                return;
            }
            if (E3) {
                xVar = new x(true, Float.valueOf(w3));
            } else {
                xVar = new x(false, null);
            }
            C1149a c1149a = sdVar6.f4333b;
            c1149a.getClass();
            i iVar = c1149a.f10143a;
            X0.a.c(iVar);
            iVar.f10169b.getClass();
            boolean z3 = xVar.f682a;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("skippable", z3);
                if (z3) {
                    jSONObject.put("skipOffset", (Float) xVar.f683b);
                }
                jSONObject.put("autoPlay", true);
                jSONObject.put("position", p1.c.STANDALONE);
            } catch (JSONException unused2) {
            }
            if (!iVar.f10176j) {
                AbstractC1217a abstractC1217a = iVar.f10172e;
                C1202i.f10332a.a(abstractC1217a.g(), "publishLoadedEvent", jSONObject, abstractC1217a.f10406a);
                iVar.f10176j = true;
                return;
            }
            throw new IllegalStateException("Loaded event can only be sent once");
        }
    }

    public static void a(c cVar) {
        cVar.getClass();
        try {
            ImageButton imageButton = cVar.f4597v;
            if (imageButton != null) {
                imageButton.setVisibility(4);
            }
        } catch (Throwable th) {
            d9.a(th);
        }
    }

    public final void a(View view) {
        si.a(this.f4595t, true, "videoApi.setVideoFrame", Integer.valueOf(ii.b(this.f4423a, view.getLeft())), Integer.valueOf(ii.b(this.f4423a, view.getTop())), Integer.valueOf(ii.b(this.f4423a, view.getWidth())), Integer.valueOf(ii.b(this.f4423a, view.getHeight())));
    }

    public final void a(VideoMode$VideoFinishedReason videoMode$VideoFinishedReason) {
        C1166b c1166b;
        sd sdVar;
        C1166b c1166b2;
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason2 = VideoMode$VideoFinishedReason.SKIPPED;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2 && (sdVar = this.f4588D) != null && (c1166b2 = sdVar.f4334c) != null) {
            i iVar = c1166b2.f10235a;
            X0.a.c(iVar);
            iVar.f10172e.b("skipped", null);
        }
        VideoMode$VideoFinishedReason videoMode$VideoFinishedReason3 = VideoMode$VideoFinishedReason.COMPLETE;
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3) {
            int v3 = v();
            this.f3067g0 = v3;
            b(v3);
            s();
            sd sdVar2 = this.f4588D;
            if (sdVar2 != null && (c1166b = sdVar2.f4334c) != null) {
                i iVar2 = c1166b.f10235a;
                X0.a.c(iVar2);
                iVar2.f10172e.b("complete", null);
            }
        } else {
            pd pdVar = this.L;
            if (pdVar != null) {
                pdVar.f4214h.pause();
            }
        }
        if (videoMode$VideoFinishedReason == videoMode$VideoFinishedReason3 || videoMode$VideoFinishedReason == videoMode$VideoFinishedReason2) {
            if (x().hasPostRoll()) {
                z();
                this.f4424b.f3148b.setVisibility(0);
            } else {
                b();
            }
            this.f0 = true;
            if (x().hasPostRoll()) {
                a(this.f3067g0, new VideoTrackingParams(a(this.f3067g0), this.f4585A, this.f4435n, this.f3069i0), "postrollImression", x().getVideoTrackingDetails().m());
            }
        }
    }

    public final void a(ak akVar) {
        VASTErrorCodes vASTErrorCodes;
        d9 d9Var = new d9(e9.f3618e);
        d9Var.f3574d = "Video player error: " + akVar.f3477a;
        d9Var.f3575e = akVar.f3478b;
        d9Var.f3576g = a();
        d9Var.a();
        int ordinal = akVar.f3477a.ordinal();
        if (ordinal == 1) {
            vASTErrorCodes = VASTErrorCodes.GeneralLinearError;
        } else if (ordinal == 2) {
            vASTErrorCodes = VASTErrorCodes.TimeoutMediaFileURI;
        } else if (ordinal != 3) {
            vASTErrorCodes = VASTErrorCodes.UndefinedError;
        } else {
            vASTErrorCodes = VASTErrorCodes.MediaFileDisplayError;
        }
        kj kjVar = new kj(this.f3067g0, new VideoTrackingParams(a(this.f3067g0), this.f4585A, this.f4435n, this.f3069i0), x().getVideoUrl(), x().getVideoTrackingDetails().e());
        kjVar.f3969e = vASTErrorCodes;
        ek.a(this.f4423a, kjVar.a());
        if (u() == 0) {
            g0.a(this.f4429h, this.f4435n, this.f4585A, "VIDEO_ERROR", (JSONObject) null);
            if (!this.f3061Z) {
                sf sfVar = (sf) com.startapp.sdk.components.a.a(this.f4423a).f3341G.a();
                int i3 = sfVar.getInt("videoErrorsCount", 0);
                rf edit = sfVar.edit();
                int i4 = i3 + 1;
                edit.a("videoErrorsCount", Integer.valueOf(i4));
                edit.f4299a.putInt("videoErrorsCount", i4);
                edit.apply();
            } else if (!akVar.f3477a.equals(VideoPlayerInterface$VideoPlayerErrorType.BUFFERING_TIMEOUT)) {
                sf sfVar2 = (sf) com.startapp.sdk.components.a.a(this.f4423a).f3341G.a();
                int i5 = sfVar2.getInt("videoErrorsCount", 0);
                rf edit2 = sfVar2.edit();
                int i6 = i5 + 1;
                edit2.a("videoErrorsCount", Integer.valueOf(i6));
                edit2.f4299a.putInt("videoErrorsCount", i6);
                edit2.apply();
            }
        }
        if ((o() && !this.f4600z) || !x().hasPostRoll()) {
            Intent intent = new Intent("com.startapp.android.ShowFailedDisplayBroadcastListener");
            intent.putExtra("showFailedReason", NotDisplayedReason.VIDEO_ERROR);
            wb.a(this.f4423a).a(intent);
            this.f3056U = true;
            b();
            return;
        }
        a(VideoMode$VideoFinishedReason.SKIPPED);
    }

    public final int a(int i3) {
        int v3 = v();
        if (v3 > 0) {
            return (i3 * 100) / v3;
        }
        return 0;
    }

    @Override // com.startapp.sdk.internal.wa
    public final void a(String str) {
        if (str.equals("vastClick")) {
            String postRollClickThroughUrl = this.f0 ? x().getPostRollClickThroughUrl() : null;
            if (postRollClickThroughUrl == null) {
                postRollClickThroughUrl = x().getClickUrl();
            }
            if (postRollClickThroughUrl != null) {
                super.a(postRollClickThroughUrl, true);
                return;
            }
            return;
        }
        super.a(str);
    }

    @Override // com.startapp.sdk.internal.wa
    public final boolean a(String str, boolean z3) {
        ActionTrackingLink[] h3;
        String postRollClickThroughUrl = this.f0 ? x().getPostRollClickThroughUrl() : null;
        if (postRollClickThroughUrl == null) {
            postRollClickThroughUrl = x().getClickUrl();
        }
        if (!TextUtils.isEmpty(postRollClickThroughUrl)) {
            z3 = true;
            str = postRollClickThroughUrl;
        }
        if (!this.f0) {
            a(VideoMode$VideoFinishedReason.CLICKED);
        }
        boolean z4 = this.f0;
        if (z4) {
            h3 = x().getVideoTrackingDetails().k();
        } else {
            h3 = x().getVideoTrackingDetails().h();
        }
        a(this.f3067g0, new VideoClickedTrackingParams(this.f4435n, a(this.f3067g0), this.f4585A, z4, this.f3069i0), "clicked", h3);
        sd sdVar = this.f4588D;
        if (sdVar != null) {
            EnumC1165a enumC1165a = EnumC1165a.CLICK;
            C1166b c1166b = sdVar.f4334c;
            if (c1166b != null) {
                i iVar = c1166b.f10235a;
                X0.a.c(iVar);
                JSONObject jSONObject = new JSONObject();
                w1.b.b(jSONObject, "interactionType", enumC1165a);
                iVar.f10172e.b("adUserInteraction", jSONObject);
            }
        }
        return super.a(str, z3);
    }

    public final void a(boolean z3) {
        ActionTrackingLink[] g3;
        if (this.L == null) {
            return;
        }
        if (z3) {
            g3 = x().getVideoTrackingDetails().f();
        } else {
            g3 = x().getVideoTrackingDetails().g();
        }
        a(this.L.f4214h.getCurrentPosition(), new VideoTrackingParams(a(this.L.f4214h.getCurrentPosition()), this.f4585A, this.f4435n, this.f3069i0), "sound", g3);
        sd sdVar = this.f4588D;
        if (sdVar != null) {
            float f = z3 ? 0.0f : 1.0f;
            C1166b c1166b = sdVar.f4334c;
            if (c1166b != null) {
                if (f >= 0.0f && f <= 1.0f) {
                    i iVar = c1166b.f10235a;
                    X0.a.c(iVar);
                    JSONObject jSONObject = new JSONObject();
                    w1.b.b(jSONObject, "mediaPlayerVolume", Float.valueOf(f));
                    w1.b.b(jSONObject, "deviceVolume", Float.valueOf(C1203j.b().f10334a));
                    iVar.f10172e.b("volumeChange", jSONObject);
                    return;
                }
                throw new IllegalArgumentException("Invalid Media volume");
            }
        }
    }

    public final void a(int i3, VideoTrackingParams videoTrackingParams, String str, VideoTrackingLink[] videoTrackingLinkArr) {
        ek.a(this.f4423a, new kj(i3, videoTrackingParams, x().getVideoUrl(), videoTrackingLinkArr).a());
    }
}
