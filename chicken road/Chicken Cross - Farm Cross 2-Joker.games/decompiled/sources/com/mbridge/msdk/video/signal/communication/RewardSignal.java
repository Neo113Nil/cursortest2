package com.mbridge.msdk.video.signal.communication;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.tools.v0;

/* loaded from: classes6.dex */
public class RewardSignal extends BaseRewardSignal implements BaseIRewardCommunication {
    public static final /* synthetic */ int i = 0;
    private Handler h = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10224a;
        final /* synthetic */ String b;

        a(Object obj, String str) {
            this.f10224a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f10224a, this.b);
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10225a;
        final /* synthetic */ String b;

        b(Object obj, String str) {
            this.f10225a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.install(this.f10225a, this.b);
        }
    }

    class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10226a;
        final /* synthetic */ String b;

        c(Object obj, String str) {
            this.f10226a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.notifyCloseBtn(this.f10226a, this.b);
        }
    }

    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10227a;
        final /* synthetic */ String b;

        d(Object obj, String str) {
            this.f10227a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.toggleCloseBtn(this.f10227a, this.b);
        }
    }

    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10228a;
        final /* synthetic */ String b;

        e(Object obj, String str) {
            this.f10228a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.getEndScreenInfo(this.f10228a, this.b);
        }
    }

    class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10229a;
        final /* synthetic */ String b;

        f(Object obj, String str) {
            this.f10229a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.setOrientation(this.f10229a, this.b);
        }
    }

    class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10230a;
        final /* synthetic */ String b;

        g(Object obj, String str) {
            this.f10230a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.handlerPlayableException(this.f10230a, this.b);
        }
    }

    class h implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f10231a;
        final /* synthetic */ String b;

        h(Object obj, String str) {
            this.f10231a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RewardSignal.super.openURL(this.f10231a, this.b);
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        if (v0.h()) {
            super.getEndScreenInfo(obj, str);
        } else {
            this.h.post(new a(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
        if (v0.h()) {
            super.handlerPlayableException(obj, str);
        } else {
            this.h.post(new g(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        if (v0.h()) {
            super.install(obj, str);
        } else {
            this.h.post(new b(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.notifyCloseBtn(obj, str);
        } else {
            this.h.post(new c(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) {
        if (v0.h()) {
            super.openURL(obj, str);
        } else {
            this.h.post(new h(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
        if (v0.h()) {
            super.setOrientation(obj, str);
        } else {
            this.h.post(new f(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.toggleCloseBtn(obj, str);
        } else {
            this.h.post(new d(obj, str));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseRewardSignal, com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        if (v0.h()) {
            super.triggerCloseBtn(obj, str);
        } else {
            this.h.post(new e(obj, str));
        }
    }
}
