package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes6.dex */
public class VideoCommunication extends BaseVideoCommunication {
    public static final /* synthetic */ int j = 0;
    private Handler i = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10232a;
        final /* synthetic */ String b;

        a(Object obj, String str) {
            this.f10232a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressBarOperate(this.f10232a, this.b);
        }
    }

    class a0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10233a;
        final /* synthetic */ String b;

        a0(Object obj, String str) {
            this.f10233a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewRect(this.f10233a, this.b);
        }
    }

    class a1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10234a;
        final /* synthetic */ String b;

        a1(Object obj, String str) {
            this.f10234a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUpdateFrame(this.f10234a, this.b);
        }
    }

    class a2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10235a;
        final /* synthetic */ String b;

        a2(Object obj, String str) {
            this.f10235a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardUnitSetting(this.f10235a, this.b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10236a;
        final /* synthetic */ String b;

        b(Object obj, String str) {
            this.f10236a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCurrentProgress(this.f10236a, this.b);
        }
    }

    class b0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10237a;
        final /* synthetic */ String b;

        b0(Object obj, String str) {
            this.f10237a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeFromSuperView(this.f10237a, this.b);
        }
    }

    class b1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10238a;
        final /* synthetic */ String b;

        b1(Object obj, String str) {
            this.f10238a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerMute(this.f10238a, this.b);
        }
    }

    class b2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10239a;
        final /* synthetic */ String b;

        b2(Object obj, String str) {
            this.f10239a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getUnitSetting(this.f10239a, this.b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10240a;
        final /* synthetic */ String b;

        c(Object obj, String str) {
            this.f10240a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoClickView(this.f10240a, this.b);
        }
    }

    class c0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10241a;
        final /* synthetic */ String b;

        c0(Object obj, String str) {
            this.f10241a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendSubView(this.f10241a, this.b);
        }
    }

    class c1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10242a;
        final /* synthetic */ String b;

        c1(Object obj, String str) {
            this.f10242a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showVideoLocation(this.f10242a, this.b);
        }
    }

    class c2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10243a;
        final /* synthetic */ String b;

        c2(Object obj, String str) {
            this.f10243a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getEncryptPrice(this.f10243a, this.b);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10244a;
        final /* synthetic */ String b;

        d(Object obj, String str) {
            this.f10244a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setScaleFitXY(this.f10244a, this.b);
        }
    }

    class d0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10245a;
        final /* synthetic */ String b;

        d0(Object obj, String str) {
            this.f10245a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.appendViewTo(this.f10245a, this.b);
        }
    }

    class d1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10246a;
        final /* synthetic */ String b;

        d1(Object obj, String str) {
            this.f10246a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerUnmute(this.f10246a, this.b);
        }
    }

    class d2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10247a;
        final /* synthetic */ String b;

        d2(Object obj, String str) {
            this.f10247a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeVideoOperte(this.f10247a, this.b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10248a;
        final /* synthetic */ String b;

        e(Object obj, String str) {
            this.f10248a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.notifyCloseBtn(this.f10248a, this.b);
        }
    }

    class e0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10249a;
        final /* synthetic */ String b;

        e0(Object obj, String str) {
            this.f10249a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendSubView(this.f10249a, this.b);
        }
    }

    class e1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10250a;
        final /* synthetic */ String b;

        e1(Object obj, String str) {
            this.f10250a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerGetMuteState(this.f10250a, this.b);
        }
    }

    class e2 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10251a;
        final /* synthetic */ String b;

        e2(Object obj, String str) {
            this.f10251a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.progressOperate(this.f10251a, this.b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10252a;
        final /* synthetic */ String b;

        f(Object obj, String str) {
            this.f10252a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.toggleCloseBtn(this.f10252a, this.b);
        }
    }

    class f0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10253a;
        final /* synthetic */ String b;

        f0(Object obj, String str) {
            this.f10253a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyAppendViewTo(this.f10253a, this.b);
        }
    }

    class f1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10254a;
        final /* synthetic */ String b;

        f1(Object obj, String str) {
            this.f10254a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetSource(this.f10254a, this.b);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10255a;
        final /* synthetic */ String b;

        g(Object obj, String str) {
            this.f10255a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handlerH5Exception(this.f10255a, this.b);
        }
    }

    class g0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10256a;
        final /* synthetic */ String b;

        g0(Object obj, String str) {
            this.f10256a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.statistics(this.f10256a, this.b);
        }
    }

    class g1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10257a;
        final /* synthetic */ String b;

        g1(Object obj, String str) {
            this.f10257a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerSetRenderType(this.f10257a, this.b);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10258a;
        final /* synthetic */ String b;

        h(Object obj, String str) {
            this.f10258a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.isSystemResume(this.f10258a, this.b);
        }
    }

    class h0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10259a;
        final /* synthetic */ String b;

        h0(Object obj, String str) {
            this.f10259a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.bringViewToFront(this.f10259a, this.b);
        }
    }

    class h1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10260a;
        final /* synthetic */ String b;

        h1(Object obj, String str) {
            this.f10260a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.preloadSubPlayTemplateView(this.f10260a, this.b);
        }
    }

    class i implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10261a;
        final /* synthetic */ String b;

        i(Object obj, String str) {
            this.f10261a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.readyStatus(this.f10261a, this.b);
        }
    }

    class i0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10262a;
        final /* synthetic */ String b;

        i0(Object obj, String str) {
            this.f10262a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.hideView(this.f10262a, this.b);
        }
    }

    class i1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10263a;
        final /* synthetic */ String b;

        i1(Object obj, String str) {
            this.f10263a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeAd(this.f10263a, this.b);
        }
    }

    class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10264a;
        final /* synthetic */ String b;

        j(Object obj, String str) {
            this.f10264a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playVideoFinishOperate(this.f10264a, this.b);
        }
    }

    class j0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10265a;
        final /* synthetic */ String b;

        j0(Object obj, String str) {
            this.f10265a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showView(this.f10265a, this.b);
        }
    }

    class j1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10266a;
        final /* synthetic */ String b;

        j1(Object obj, String str) {
            this.f10266a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.broadcast(this.f10266a, this.b);
        }
    }

    class k implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10267a;
        final /* synthetic */ String b;

        k(Object obj, String str) {
            this.f10267a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.init(this.f10267a, this.b);
        }
    }

    class k0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10268a;
        final /* synthetic */ String b;

        k0(Object obj, String str) {
            this.f10268a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewBgColor(this.f10268a, this.b);
        }
    }

    class k1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10269a;
        final /* synthetic */ String b;

        k1(Object obj, String str) {
            this.f10269a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.ivRewardAdsWithoutVideo(this.f10269a, this.b);
        }
    }

    class l implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10270a;
        final /* synthetic */ String b;

        l(Object obj, String str) {
            this.f10270a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.openURL(this.f10270a, this.b);
        }
    }

    class l0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10271a;
        final /* synthetic */ String b;

        l0(Object obj, String str) {
            this.f10271a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewAlpha(this.f10271a, this.b);
        }
    }

    class l1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10272a;
        final /* synthetic */ String b;

        l1(Object obj, String str) {
            this.f10272a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setSubPlayTemplateInfo(this.f10272a, this.b);
        }
    }

    class m implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10273a;
        final /* synthetic */ String b;

        m(Object obj, String str) {
            this.f10273a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.showAlertView(this.f10273a, this.b);
        }
    }

    class m0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10274a;
        final /* synthetic */ String b;

        m0(Object obj, String str) {
            this.f10274a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setViewScale(this.f10274a, this.b);
        }
    }

    class m1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10275a;
        final /* synthetic */ String b;

        m1(Object obj, String str) {
            this.f10275a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewFireEvent(this.f10275a, this.b);
        }
    }

    class n implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10276a;
        final /* synthetic */ String b;

        n(Object obj, String str) {
            this.f10276a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.closeWeb(this.f10276a, this.b);
        }
    }

    class n0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10277a;
        final /* synthetic */ String b;

        n0(Object obj, String str) {
            this.f10277a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewAbove(this.f10277a, this.b);
        }
    }

    class n1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10278a;
        final /* synthetic */ String b;

        n1(Object obj, String str) {
            this.f10278a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.soundOperate(this.f10278a, this.b);
        }
    }

    class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10279a;
        final /* synthetic */ String b;

        o(Object obj, String str) {
            this.f10279a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getSDKInfo(this.f10279a, this.b);
        }
    }

    class o0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10280a;
        final /* synthetic */ String b;

        o0(Object obj, String str) {
            this.f10280a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.insertViewBelow(this.f10280a, this.b);
        }
    }

    class o1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10281a;
        final /* synthetic */ String b;

        o1(Object obj, String str) {
            this.f10281a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.increaseOfferFrequence(this.f10281a, this.b);
        }
    }

    class p implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10282a;
        final /* synthetic */ String b;

        p(Object obj, String str) {
            this.f10282a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getFileInfo(this.f10282a, this.b);
        }
    }

    class p0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10283a;
        final /* synthetic */ String b;

        p0(Object obj, String str) {
            this.f10283a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewAbove(this.f10283a, this.b);
        }
    }

    class p1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10284a;
        final /* synthetic */ String b;

        p1(Object obj, String str) {
            this.f10284a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.handleNativeObject(this.f10284a, this.b);
        }
    }

    class q implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10285a;
        final /* synthetic */ String b;

        q(Object obj, String str) {
            this.f10285a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadads(this.f10285a, this.b);
        }
    }

    class q0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10286a;
        final /* synthetic */ String b;

        q0(Object obj, String str) {
            this.f10286a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.onlyInsertViewBelow(this.f10286a, this.b);
        }
    }

    class q1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10287a;
        final /* synthetic */ String b;

        q1(Object obj, String str) {
            this.f10287a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.loadingResourceStatus(this.f10287a, this.b);
        }
    }

    class r implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10288a;
        final /* synthetic */ String b;

        r(Object obj, String str) {
            this.f10288a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reactDeveloper(this.f10288a, this.b);
        }
    }

    class r0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10289a;
        final /* synthetic */ String b;

        r0(Object obj, String str) {
            this.f10289a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.triggerCloseBtn(this.f10289a, this.b);
        }
    }

    class r1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10290a;
        final /* synthetic */ String b;

        r1(Object obj, String str) {
            this.f10290a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createNativeEC(this.f10290a, this.b);
        }
    }

    class s implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10291a;
        final /* synthetic */ String b;

        s(Object obj, String str) {
            this.f10291a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.reportUrls(this.f10291a, this.b);
        }
    }

    class s0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10292a;
        final /* synthetic */ String b;

        s0(Object obj, String str) {
            this.f10292a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewLoad(this.f10292a, this.b);
        }
    }

    class s1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10293a;
        final /* synthetic */ String b;

        s1(Object obj, String str) {
            this.f10293a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.setCacheItem(this.f10293a, this.b);
        }
    }

    class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10294a;
        final /* synthetic */ String b;

        t(Object obj, String str) {
            this.f10294a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createWebview(this.f10294a, this.b);
        }
    }

    class t0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10295a;
        final /* synthetic */ String b;

        t0(Object obj, String str) {
            this.f10295a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewReload(this.f10295a, this.b);
        }
    }

    class t1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10296a;
        final /* synthetic */ String b;

        t1(Object obj, String str) {
            this.f10296a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.removeCacheItem(this.f10296a, this.b);
        }
    }

    class u implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10297a;
        final /* synthetic */ String b;

        u(Object obj, String str) {
            this.f10297a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createView(this.f10297a, this.b);
        }
    }

    class u0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10298a;
        final /* synthetic */ String b;

        u0(Object obj, String str) {
            this.f10298a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoBack(this.f10298a, this.b);
        }
    }

    class u1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10299a;
        final /* synthetic */ String b;

        u1(Object obj, String str) {
            this.f10299a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAllCache(this.f10299a, this.b);
        }
    }

    class v implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10300a;
        final /* synthetic */ String b;

        v(Object obj, String str) {
            this.f10300a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.click(this.f10300a, this.b);
        }
    }

    class v0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10301a;
        final /* synthetic */ String b;

        v0(Object obj, String str) {
            this.f10301a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.webviewGoForward(this.f10301a, this.b);
        }
    }

    class v1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10302a;
        final /* synthetic */ String b;

        v1(Object obj, String str) {
            this.f10302a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.clearAllCache(this.f10302a, this.b);
        }
    }

    class w implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10303a;
        final /* synthetic */ String b;

        w(Object obj, String str) {
            this.f10303a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createPlayerView(this.f10303a, this.b);
        }
    }

    class w0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10304a;
        final /* synthetic */ String b;

        w0(Object obj, String str) {
            this.f10304a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPlay(this.f10304a, this.b);
        }
    }

    class w1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10305a;
        final /* synthetic */ String b;

        w1(Object obj, String str) {
            this.f10305a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getCutout(this.f10305a, this.b);
        }
    }

    class x implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10306a;
        final /* synthetic */ String b;

        x(Object obj, String str) {
            this.f10306a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.createSubPlayTemplateView(this.f10306a, this.b);
        }
    }

    class x0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10307a;
        final /* synthetic */ String b;

        x0(Object obj, String str) {
            this.f10307a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerPause(this.f10307a, this.b);
        }
    }

    class x1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10308a;
        final /* synthetic */ String b;

        x1(Object obj, String str) {
            this.f10308a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getAppSetting(this.f10308a, this.b);
        }
    }

    class y implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10309a;
        final /* synthetic */ String b;

        y(Object obj, String str) {
            this.f10309a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.destroyComponent(this.f10309a, this.b);
        }
    }

    class y0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10310a;
        final /* synthetic */ String b;

        y0(Object obj, String str) {
            this.f10310a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerResume(this.f10310a, this.b);
        }
    }

    class y1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10311a;
        final /* synthetic */ String b;

        y1(Object obj, String str) {
            this.f10311a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.videoOperate(this.f10311a, this.b);
        }
    }

    class z implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10312a;
        final /* synthetic */ String b;

        z(Object obj, String str) {
            this.f10312a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getComponentOptions(this.f10312a, this.b);
        }
    }

    class z0 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10313a;
        final /* synthetic */ String b;

        z0(Object obj, String str) {
            this.f10313a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.playerStop(this.f10313a, this.b);
        }
    }

    class z1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10314a;
        final /* synthetic */ String b;

        z1(Object obj, String str) {
            this.f10314a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            VideoCommunication.super.getRewardSetting(this.f10314a, this.b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendSubView(obj, str);
        } else {
            this.i.post(new c0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void appendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.appendViewTo(obj, str);
        } else {
            this.i.post(new d0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void bringViewToFront(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.bringViewToFront(obj, str);
        } else {
            this.i.post(new h0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void broadcast(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.broadcast(obj, str);
        } else {
            this.i.post(new j1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void clearAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.clearAllCache(obj, str);
        } else {
            this.i.post(new v1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void click(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.click(obj, str);
        } else {
            this.i.post(new v(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeAd(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeAd(obj, str);
        } else {
            this.i.post(new i1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeVideoOperte(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeVideoOperte(obj, str);
        } else {
            this.i.post(new d2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void closeWeb(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.closeWeb(obj, str);
        } else {
            this.i.post(new n(obj, str));
            com.mbridge.msdk.foundation.tools.q0.b("JS-Video-Brigde", "type" + str);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createNativeEC(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createNativeEC(obj, str);
        } else {
            this.i.post(new r1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createPlayerView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createPlayerView(obj, str);
        } else {
            this.i.post(new w(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createSubPlayTemplateView(obj, str);
        } else {
            this.i.post(new x(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createView(obj, str);
        } else {
            this.i.post(new u(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void createWebview(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.createWebview(obj, str);
        } else {
            this.i.post(new t(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void destroyComponent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.destroyComponent(obj, str);
        } else {
            this.i.post(new y(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAllCache(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAllCache(obj, str);
        } else {
            this.i.post(new u1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getAppSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getAppSetting(obj, str);
        } else {
            this.i.post(new x1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getComponentOptions(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getComponentOptions(obj, str);
        } else {
            this.i.post(new z(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCurrentProgress(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCurrentProgress(obj, str);
        } else {
            this.i.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getCutout(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getCutout(obj, str);
        } else {
            this.i.post(new w1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getEncryptPrice(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getEncryptPrice(obj, str);
        } else {
            this.i.post(new c2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getFileInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getFileInfo(obj, str);
        } else {
            this.i.post(new p(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardSetting(obj, str);
        } else {
            this.i.post(new z1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getRewardUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getRewardUnitSetting(obj, str);
        } else {
            this.i.post(new a2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getSDKInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getSDKInfo(obj, str);
        } else {
            this.i.post(new o(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void getUnitSetting(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.getUnitSetting(obj, str);
        } else {
            this.i.post(new b2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handleNativeObject(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handleNativeObject(obj, str);
        } else {
            this.i.post(new p1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void handlerH5Exception(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.handlerH5Exception(obj, str);
        } else {
            this.i.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void hideView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.hideView(obj, str);
        } else {
            this.i.post(new i0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void increaseOfferFrequence(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.increaseOfferFrequence(obj, str);
        } else {
            this.i.post(new o1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void init(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.init(obj, str);
        } else {
            this.i.post(new k(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewAbove(obj, str);
        } else {
            this.i.post(new n0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void insertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.insertViewBelow(obj, str);
        } else {
            this.i.post(new o0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void isSystemResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.isSystemResume(obj, str);
        } else {
            this.i.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void ivRewardAdsWithoutVideo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.ivRewardAdsWithoutVideo(obj, str);
        } else {
            this.i.post(new k1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadads(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadads(obj, str);
        } else {
            this.i.post(new q(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void loadingResourceStatus(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.loadingResourceStatus(obj, str);
        } else {
            this.i.post(new q1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.i.post(new e(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendSubView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendSubView(obj, str);
        } else {
            this.i.post(new e0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyAppendViewTo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyAppendViewTo(obj, str);
        } else {
            this.i.post(new f0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewAbove(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewAbove(obj, str);
        } else {
            this.i.post(new p0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void onlyInsertViewBelow(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.onlyInsertViewBelow(obj, str);
        } else {
            this.i.post(new q0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void openURL(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.openURL(obj, str);
        } else {
            this.i.post(new l(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playVideoFinishOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playVideoFinishOperate(obj, str);
        } else {
            this.i.post(new j(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerGetMuteState(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerGetMuteState(obj, str);
        } else {
            this.i.post(new e1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerMute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerMute(obj, str);
        } else {
            this.i.post(new b1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPause(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPause(obj, str);
        } else {
            this.i.post(new x0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerPlay(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerPlay(obj, str);
        } else {
            this.i.post(new w0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerResume(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerResume(obj, str);
        } else {
            this.i.post(new y0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetRenderType(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetRenderType(obj, str);
        } else {
            this.i.post(new g1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerSetSource(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerSetSource(obj, str);
        } else {
            this.i.post(new f1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerStop(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerStop(obj, str);
        } else {
            this.i.post(new z0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUnmute(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUnmute(obj, str);
        } else {
            this.i.post(new d1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void playerUpdateFrame(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.playerUpdateFrame(obj, str);
        } else {
            this.i.post(new a1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void preloadSubPlayTemplateView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.preloadSubPlayTemplateView(obj, str);
        } else {
            this.i.post(new h1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressBarOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressBarOperate(obj, str);
        } else {
            this.i.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void progressOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.progressOperate(obj, str);
        } else {
            this.i.post(new e2(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reactDeveloper(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reactDeveloper(obj, str);
        } else {
            this.i.post(new r(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void readyStatus(Object obj, String str) {
        com.mbridge.msdk.foundation.tools.q0.c("JS-Video-Brigde", "VIDEOBridge readyStatus");
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.readyStatus(obj, str);
        } else {
            this.i.post(new i(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeCacheItem(obj, str);
        } else {
            this.i.post(new t1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void removeFromSuperView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.removeFromSuperView(obj, str);
        } else {
            this.i.post(new b0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void reportUrls(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.reportUrls(obj, str);
        } else {
            this.i.post(new s(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setCacheItem(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setCacheItem(obj, str);
        } else {
            this.i.post(new s1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setScaleFitXY(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setScaleFitXY(obj, str);
        } else {
            this.i.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setSubPlayTemplateInfo(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setSubPlayTemplateInfo(obj, str);
        } else {
            this.i.post(new l1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewAlpha(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewAlpha(obj, str);
        } else {
            this.i.post(new l0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewBgColor(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewBgColor(obj, str);
        } else {
            this.i.post(new k0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewRect(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewRect(obj, str);
        } else {
            this.i.post(new a0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void setViewScale(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.setViewScale(obj, str);
        } else {
            this.i.post(new m0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showAlertView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showAlertView(obj, str);
        } else {
            this.i.post(new m(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoClickView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoClickView(obj, str);
        } else {
            this.i.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showVideoLocation(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showVideoLocation(obj, str);
        } else {
            this.i.post(new c1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void showView(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.showView(obj, str);
        } else {
            this.i.post(new j0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void soundOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.soundOperate(obj, str);
        } else {
            this.i.post(new n1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void statistics(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.statistics(obj, str);
        } else {
            this.i.post(new g0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.i.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.i.post(new r0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void videoOperate(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.videoOperate(obj, str);
        } else {
            this.i.post(new y1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewFireEvent(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewFireEvent(obj, str);
        } else {
            this.i.post(new m1(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoBack(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoBack(obj, str);
        } else {
            this.i.post(new u0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewGoForward(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewGoForward(obj, str);
        } else {
            this.i.post(new v0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewLoad(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewLoad(obj, str);
        } else {
            this.i.post(new s0(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseVideoCommunication, com.mbridge.msdk.video.signal.communication.IVideoCommunication
    public void webviewReload(Object obj, String str) {
        if (com.mbridge.msdk.foundation.tools.v0.h()) {
            super.webviewReload(obj, str);
        } else {
            this.i.post(new t0(obj, str));
        }
    }
}
