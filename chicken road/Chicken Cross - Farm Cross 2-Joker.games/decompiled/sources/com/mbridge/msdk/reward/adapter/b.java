package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.ironsource.W3;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.mbridge.msdk.videocommon.a;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* compiled from: RewardCampaignsResourceManager.java */
/* loaded from: classes6.dex */
public final class b {
    private static ConcurrentHashMap<String, f> g;

    /* renamed from: a, reason: collision with root package name */
    private final m f9683a;
    private boolean b;
    private final String c;
    private final String d;
    private final String e;
    private volatile List<WindVaneWebView> f;

    /* compiled from: RewardCampaignsResourceManager.java */
    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f9684a;
        final /* synthetic */ Context b;
        final /* synthetic */ String c;
        final /* synthetic */ int d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;
        final /* synthetic */ n h;

        a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i, String str2, String str3, String str4, n nVar) {
            this.f9684a = copyOnWriteArrayList;
            this.b = context;
            this.c = str;
            this.d = i;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:133:0x02ae A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x027a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:171:0x017e  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0258  */
        /* JADX WARN: Removed duplicated region for block: B:57:0x02da  */
        /* JADX WARN: Removed duplicated region for block: B:79:0x0394  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            String str;
            Iterator it;
            String str2;
            String str3;
            CharSequence charSequence;
            String str4;
            String iconUrl;
            String imageUrl;
            CampaignEx campaignEx;
            List<CampaignEx.c.a> d;
            List<String> list;
            int i;
            String str5;
            H5DownLoadManager h5DownLoadManager;
            Context context;
            String str6;
            String str7;
            String str8;
            m mVar;
            n nVar;
            CopyOnWriteArrayList copyOnWriteArrayList;
            String str9 = "_";
            CopyOnWriteArrayList copyOnWriteArrayList2 = this.f9684a;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) {
                return;
            }
            try {
                ResDownloadCheckManager.getInstance().setCampaignList(this.f9684a);
                com.mbridge.msdk.videocommon.download.b.getInstance().createUnitCache(this.b, this.c, this.f9684a, this.d, new k(b.this.f9683a, this.e, this.c, this.f, this.g));
                com.mbridge.msdk.videocommon.download.b.getInstance().load(this.c);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
            Iterator it2 = this.f9684a.iterator();
            while (it2.hasNext()) {
                CampaignEx campaignEx2 = (CampaignEx) it2.next();
                if (campaignEx2 != null) {
                    try {
                        Message obtain = Message.obtain();
                        obtain.what = 106;
                        Bundle bundle = new Bundle();
                        bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                        bundle.putString(MBridgeConstans.PLACEMENT_ID, this.e);
                        bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.f);
                        bundle.putString("key", this.c + str9 + this.f + str9 + campaignEx2.getSecondRequestIndex());
                        obtain.setData(bundle);
                        b.this.f9683a.sendMessage(obtain);
                    } catch (Exception unused) {
                    }
                    CampaignEx.c rewardTemplateMode = campaignEx2.getRewardTemplateMode();
                    if (rewardTemplateMode != null) {
                        String j = rewardTemplateMode.j();
                        int k = rewardTemplateMode.k();
                        if (campaignEx2.isDynamicView() && v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, j)) {
                            b.this.a(1, campaignEx2, k + "", j);
                        } else if (!TextUtils.isEmpty(j) && !j.contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                            com.mbridge.msdk.foundation.same.report.metrics.c a2 = b.this.a(campaignEx2, 2);
                            if (j.contains(".zip")) {
                                try {
                                    h5DownLoadManager = H5DownLoadManager.getInstance();
                                    context = this.b;
                                    str6 = this.e;
                                    str7 = this.c;
                                    str8 = this.f;
                                    str = str9;
                                    try {
                                        mVar = b.this.f9683a;
                                        try {
                                            nVar = this.h;
                                            copyOnWriteArrayList = this.f9684a;
                                            it = it2;
                                            str5 = "";
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            charSequence = ".zip";
                                        } catch (Exception e2) {
                                            e = e2;
                                            it = it2;
                                            str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                            charSequence = ".zip";
                                            str5 = "";
                                        }
                                    } catch (Exception e3) {
                                        e = e3;
                                        it = it2;
                                        str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                        str5 = "";
                                        charSequence = ".zip";
                                        if (MBridgeConstans.DEBUG) {
                                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                        }
                                        str3 = str5;
                                        str4 = campaignEx2.getendcard_url();
                                        boolean isDynamicView = campaignEx2.isDynamicView();
                                        boolean l = v0.l(str4);
                                        if (!TextUtils.isEmpty(str4)) {
                                        }
                                        if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                        }
                                        iconUrl = campaignEx2.getIconUrl();
                                        if (!TextUtils.isEmpty(iconUrl)) {
                                        }
                                        imageUrl = campaignEx2.getImageUrl();
                                        if (!TextUtils.isEmpty(imageUrl)) {
                                        }
                                        if (rewardTemplateMode != null) {
                                        }
                                        str9 = str;
                                        it2 = it;
                                    }
                                } catch (Exception e4) {
                                    e = e4;
                                    str = str9;
                                }
                                try {
                                    h5DownLoadManager.downloadH5Res(a2, j, new l(context, str6, str7, str8, campaignEx2, 859, mVar, nVar, copyOnWriteArrayList));
                                } catch (Exception e5) {
                                    e = e5;
                                    if (MBridgeConstans.DEBUG) {
                                    }
                                    str3 = str5;
                                    str4 = campaignEx2.getendcard_url();
                                    boolean isDynamicView2 = campaignEx2.isDynamicView();
                                    boolean l2 = v0.l(str4);
                                    if (!TextUtils.isEmpty(str4)) {
                                    }
                                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                    }
                                    iconUrl = campaignEx2.getIconUrl();
                                    if (!TextUtils.isEmpty(iconUrl)) {
                                    }
                                    imageUrl = campaignEx2.getImageUrl();
                                    if (!TextUtils.isEmpty(imageUrl)) {
                                    }
                                    if (rewardTemplateMode != null) {
                                    }
                                    str9 = str;
                                    it2 = it;
                                }
                                str3 = str5;
                            } else {
                                str = str9;
                                it = it2;
                                str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                                charSequence = ".zip";
                                q0.a("RewardCampaignsResourceManager", "开始下载 html 类型的 template");
                                try {
                                    str3 = "";
                                } catch (Exception e6) {
                                    e = e6;
                                    str3 = "";
                                }
                                try {
                                    H5DownLoadManager.getInstance().downloadH5Res(a2, j, new i(859, this.e, this.c, this.f, campaignEx2, this.h, b.this.f9683a, this.f9684a));
                                } catch (Exception e7) {
                                    e = e7;
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                    }
                                    str4 = campaignEx2.getendcard_url();
                                    boolean isDynamicView22 = campaignEx2.isDynamicView();
                                    boolean l22 = v0.l(str4);
                                    if (!TextUtils.isEmpty(str4)) {
                                    }
                                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                                    }
                                    iconUrl = campaignEx2.getIconUrl();
                                    if (!TextUtils.isEmpty(iconUrl)) {
                                    }
                                    imageUrl = campaignEx2.getImageUrl();
                                    if (!TextUtils.isEmpty(imageUrl)) {
                                    }
                                    if (rewardTemplateMode != null) {
                                    }
                                    str9 = str;
                                    it2 = it;
                                }
                            }
                            str4 = campaignEx2.getendcard_url();
                            boolean isDynamicView222 = campaignEx2.isDynamicView();
                            boolean l222 = v0.l(str4);
                            if (!TextUtils.isEmpty(str4)) {
                                if (!isDynamicView222) {
                                    b.this.a(this.b, this.e, this.c, this.f, campaignEx2, str4, this.h, (CopyOnWriteArrayList<CampaignEx>) this.f9684a);
                                } else if (l222) {
                                    b.this.a(this.b, this.e, this.c, this.f, campaignEx2, str4, this.h, (CopyOnWriteArrayList<CampaignEx>) this.f9684a);
                                } else if (v0.c(str2, str4)) {
                                    try {
                                        i = Integer.parseInt(c1.a(str4, "ecid"));
                                    } catch (Throwable th) {
                                        q0.b("RewardCampaignsResourceManager", th.getMessage());
                                        i = 404;
                                    }
                                    b.this.a(2, campaignEx2, i + str3, str4);
                                }
                            }
                            if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl()) && !campaignEx2.isDynamicView()) {
                                H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                            }
                            iconUrl = campaignEx2.getIconUrl();
                            if (!TextUtils.isEmpty(iconUrl)) {
                                try {
                                    com.mbridge.msdk.foundation.same.image.b.a(this.b).a(iconUrl, new j(b.this.f9683a, 0, this.e, this.c, this.f, campaignEx2));
                                } catch (Exception e8) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e8.getLocalizedMessage());
                                    }
                                }
                            }
                            imageUrl = campaignEx2.getImageUrl();
                            if (!TextUtils.isEmpty(imageUrl)) {
                                try {
                                    com.mbridge.msdk.foundation.same.image.b.a(this.b).a(imageUrl, new j(b.this.f9683a, 0, this.e, this.c, this.f, campaignEx2));
                                } catch (Exception e9) {
                                    if (MBridgeConstans.DEBUG) {
                                        q0.b("RewardCampaignsResourceManager", e9.getLocalizedMessage());
                                    }
                                }
                            }
                            if (rewardTemplateMode != null) {
                                String h = rewardTemplateMode.h();
                                if (TextUtils.isEmpty(h) || campaignEx2.isDynamicView()) {
                                    campaignEx = campaignEx2;
                                } else {
                                    int i2 = campaignEx2.getAabEntity() != null ? campaignEx2.getAabEntity().h3c : 0;
                                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c(true);
                                    cVar.f(i2);
                                    if (h.contains(charSequence)) {
                                        q0.a("RewardCampaignsResourceManager", "开始下载 zip 类型的 pause");
                                        try {
                                            campaignEx = campaignEx2;
                                        } catch (Exception e10) {
                                            e = e10;
                                            campaignEx = campaignEx2;
                                        }
                                        try {
                                            H5DownLoadManager.getInstance().downloadH5Res(cVar, h, new l(this.b, this.e, this.c, this.f, campaignEx2, Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, b.this.f9683a, this.h, this.f9684a));
                                        } catch (Exception e11) {
                                            e = e11;
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                                            }
                                            d = rewardTemplateMode.d();
                                            if (d != null) {
                                                while (r2.hasNext()) {
                                                }
                                            }
                                            str9 = str;
                                            it2 = it;
                                        }
                                    } else {
                                        campaignEx = campaignEx2;
                                        try {
                                            H5DownLoadManager.getInstance().downloadH5Res(cVar, h, new i(Sdk.SDKError.Reason.EVALUATE_JAVASCRIPT_FAILED_VALUE, this.e, this.c, this.f, campaignEx, this.h, b.this.f9683a, this.f9684a));
                                        } catch (Exception e12) {
                                            if (MBridgeConstans.DEBUG) {
                                                q0.b("RewardCampaignsResourceManager", e12.getLocalizedMessage());
                                            }
                                        }
                                    }
                                }
                                d = rewardTemplateMode.d();
                                if (d != null && d.size() > 0) {
                                    for (CampaignEx.c.a aVar : d) {
                                        if (aVar != null && (list = aVar.f9296a) != null && list.size() > 0) {
                                            for (String str10 : aVar.f9296a) {
                                                if (!TextUtils.isEmpty(str10)) {
                                                    try {
                                                        com.mbridge.msdk.foundation.same.image.b.a(this.b).a(str10, new j(b.this.f9683a, 1, this.e, this.c, this.f, campaignEx));
                                                    } catch (Exception e13) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            q0.b("RewardCampaignsResourceManager", e13.getLocalizedMessage());
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            str9 = str;
                            it2 = it;
                        }
                    }
                    str = str9;
                    it = it2;
                    str2 = MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW;
                    str3 = "";
                    charSequence = ".zip";
                    str4 = campaignEx2.getendcard_url();
                    boolean isDynamicView2222 = campaignEx2.isDynamicView();
                    boolean l2222 = v0.l(str4);
                    if (!TextUtils.isEmpty(str4)) {
                    }
                    if (!TextUtils.isEmpty(campaignEx2.getEndScreenUrl())) {
                        H5DownLoadManager.getInstance().download(b.this.a(campaignEx2, 6), campaignEx2.getEndScreenUrl());
                    }
                    iconUrl = campaignEx2.getIconUrl();
                    if (!TextUtils.isEmpty(iconUrl)) {
                    }
                    imageUrl = campaignEx2.getImageUrl();
                    if (!TextUtils.isEmpty(imageUrl)) {
                    }
                    if (rewardTemplateMode != null) {
                    }
                    str9 = str;
                    it2 = it;
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    class c implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f9686a;
        final /* synthetic */ String b;
        final /* synthetic */ String c;
        final /* synthetic */ CampaignEx d;
        final /* synthetic */ n e;
        final /* synthetic */ Context f;

        c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f9686a = str;
            this.b = str2;
            this.c = str3;
            this.d = campaignEx;
            this.e = nVar;
            this.f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onFailed(String str, String str2) {
            String str3;
            String str4;
            String str5;
            String str6;
            Exception exc;
            String str7;
            try {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message obtain = Message.obtain();
                obtain.what = 205;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f9686a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.c);
                bundle.putString("url", str2);
                bundle.putString("key", this.f9686a + "_" + this.c + "_" + this.d.getSecondRequestIndex());
                bundle.putString("message", str);
                obtain.setData(bundle);
                b.this.f9683a.sendMessage(obtain);
                if (this.e != null) {
                    try {
                    } catch (Exception e) {
                        e = e;
                    }
                    try {
                        this.e.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.f9686a, this.c), "", null, null));
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            q0.b("RewardCampaignsResourceManager", e.getMessage());
                            b bVar = b.this;
                            Context context = this.f;
                            CampaignEx campaignEx = this.d;
                            String str8 = this.f9686a;
                            str3 = "_";
                            str4 = "RewardCampaignsResourceManager";
                            str5 = "";
                            str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
                            bVar.a(context, 3, campaignEx, str2, str, str8, "");
                        } catch (Exception e3) {
                            exc = e3;
                            str3 = "_";
                            str4 = "RewardCampaignsResourceManager";
                            str5 = "";
                            str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
                            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                            Message obtain2 = Message.obtain();
                            obtain2.what = 105;
                            Bundle bundle2 = new Bundle();
                            bundle2.putString(str6, this.f9686a);
                            bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                            bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.c);
                            String str9 = str3;
                            bundle2.putString("key", this.f9686a + str9 + this.c + str9 + this.d.getSecondRequestIndex());
                            bundle2.putString("url", str2);
                            bundle2.putString("message", exc.getMessage());
                            obtain2.setData(bundle2);
                            b.this.f9683a.sendMessage(obtain2);
                            if (this.e != null) {
                                try {
                                    this.e.a(str2, this.c, b.b(880005, new MBridgeIds(this.b, this.f9686a, this.c), str5, exc, null));
                                } catch (Exception e4) {
                                    str7 = str4;
                                    q0.b(str7, e4.getMessage());
                                    q0.b(str7, exc.getLocalizedMessage());
                                }
                            }
                            str7 = str4;
                            q0.b(str7, exc.getLocalizedMessage());
                        }
                    }
                }
                b bVar2 = b.this;
                Context context2 = this.f;
                CampaignEx campaignEx2 = this.d;
                String str82 = this.f9686a;
                str3 = "_";
                str4 = "RewardCampaignsResourceManager";
                str5 = "";
                str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
            } catch (Exception e5) {
                e = e5;
                str3 = "_";
                str4 = "RewardCampaignsResourceManager";
                str5 = "";
                str6 = MBridgeConstans.PROPERTIES_UNIT_ID;
            }
            try {
                bVar2.a(context2, 3, campaignEx2, str2, str, str82, "");
            } catch (Exception e6) {
                e = e6;
                exc = e;
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
                Message obtain22 = Message.obtain();
                obtain22.what = 105;
                Bundle bundle22 = new Bundle();
                bundle22.putString(str6, this.f9686a);
                bundle22.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle22.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.c);
                String str92 = str3;
                bundle22.putString("key", this.f9686a + str92 + this.c + str92 + this.d.getSecondRequestIndex());
                bundle22.putString("url", str2);
                bundle22.putString("message", exc.getMessage());
                obtain22.setData(bundle22);
                b.this.f9683a.sendMessage(obtain22);
                if (this.e != null) {
                }
                str7 = str4;
                q0.b(str7, exc.getLocalizedMessage());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0147  */
        /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void onSuccess(String str, String str2, boolean z) {
            String str3;
            String str4;
            String str5;
            try {
                q0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f9686a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.c);
                bundle.putString("key", this.f9686a + "_" + this.c + "_" + this.d.getSecondRequestIndex());
                bundle.putString("url", str);
                obtain.setData(bundle);
                b.this.f9683a.sendMessage(obtain);
                n nVar = this.e;
                if (nVar != null) {
                    nVar.a(this.b, this.f9686a, this.c, str);
                }
                if (z) {
                    return;
                }
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
                try {
                    b.this.a(this.f, 1, this.d, str, "", this.f9686a, str2);
                } catch (Exception e) {
                    e = e;
                    Exception exc = e;
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                    Message obtain2 = Message.obtain();
                    obtain2.what = 205;
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f9686a);
                    bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.b);
                    bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.c);
                    bundle2.putString("key", this.f9686a + str4 + this.c + str4 + this.d.getSecondRequestIndex());
                    bundle2.putString("url", str);
                    obtain2.setData(bundle2);
                    b.this.f9683a.sendMessage(obtain2);
                    if (this.e != null) {
                        try {
                            this.e.a(str, this.c, b.b(880005, new MBridgeIds(this.b, this.f9686a, this.c), "", exc, null));
                        } catch (Exception e2) {
                            str5 = str3;
                            q0.b(str5, e2.getMessage());
                            b.this.a(this.f, 3, this.d, str, exc.getLocalizedMessage(), this.f9686a, str2);
                            if (MBridgeConstans.DEBUG) {
                            }
                        }
                    }
                    str5 = str3;
                    b.this.a(this.f, 3, this.d, str, exc.getLocalizedMessage(), this.f9686a, str2);
                    if (MBridgeConstans.DEBUG) {
                        return;
                    }
                    q0.b(str5, exc.getLocalizedMessage());
                }
            } catch (Exception e3) {
                e = e3;
                str3 = "RewardCampaignsResourceManager";
                str4 = "_";
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f9687a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;
        final /* synthetic */ String d;
        final /* synthetic */ String e;
        final /* synthetic */ String f;
        final /* synthetic */ String g;

        d(CampaignEx campaignEx, Context context, int i, String str, String str2, String str3, String str4) {
            this.f9687a = campaignEx;
            this.b = context;
            this.c = i;
            this.d = str;
            this.e = str2;
            this.f = str3;
            this.g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f9687a == null || this.b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.b;
                if (context != null) {
                    nVar.c(m0.s(context.getApplicationContext()));
                }
                nVar.d(this.c);
                CampaignEx campaignEx = this.f9687a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f9687a.getRequestId());
                    nVar.k(this.f9687a.getCurrentLocalRid());
                    nVar.o(this.f9687a.getRequestIdNotice());
                }
                nVar.b("url", this.d);
                nVar.t(this.d);
                nVar.m(this.e);
                nVar.u(this.f);
                if (!TextUtils.isEmpty(this.g)) {
                    nVar.q(this.g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f9687a);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f9688a;
        final /* synthetic */ WindVaneWebView b;
        final /* synthetic */ CampaignEx c;
        final /* synthetic */ CopyOnWriteArrayList d;
        final /* synthetic */ String e;
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f;
        final /* synthetic */ String g;

        e(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f9688a = z;
            this.b = windVaneWebView;
            this.c = campaignEx;
            this.d = copyOnWriteArrayList;
            this.e = str;
            this.f = cVar;
            this.g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f9688a, this.b, this.c.getRewardTemplateMode().j(), 0, this.c, (CopyOnWriteArrayList<CampaignEx>) this.d, H5DownLoadManager.getInstance().getH5ResAddress(this.c.getRewardTemplateMode().j()), this.e, this.f, this.g, b.this.b);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class f {

        /* renamed from: a, reason: collision with root package name */
        boolean f9689a;
        boolean b;
        int c;
        int d;
        String e;
        String f;
        int g;
        CopyOnWriteArrayList<CampaignEx> h;
        CopyOnWriteArrayList<CampaignEx> i;

        public f(boolean z, boolean z2, int i, int i2, String str, String str2, int i3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f9689a = z;
            this.b = z2;
            this.c = i;
            this.d = i2;
            this.e = str;
            this.f = str2;
            this.g = i3;
            this.h = copyOnWriteArrayList;
            this.i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class i implements H5DownLoadManager.IH5SourceDownloadListener {
        private int b;
        private final String c;
        private final String d;
        private final String e;
        private CampaignEx f;
        private n g;
        private Handler h;
        private CopyOnWriteArrayList<CampaignEx> i;

        /* renamed from: a, reason: collision with root package name */
        private boolean f9691a = false;
        private final long j = System.currentTimeMillis();

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f9692a;
            final /* synthetic */ long b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            a(int i, long j, String str, String str2, String str3) {
                this.f9692a = i;
                this.b = j;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f9692a, this.b + "", this.c, i.this.f.getId(), i.this.d, this.d, "2");
                    nVar.n(i.this.f.getRequestId());
                    nVar.k(i.this.f.getCurrentLocalRid());
                    nVar.o(i.this.f.getRequestIdNotice());
                    nVar.b(i.this.f.getId());
                    nVar.a(i.this.f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.c);
                    if (i.this.f.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (i.this.f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.e)) {
                        nVar.q(this.e);
                    }
                    b.b(nVar, i.this.f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.d, i.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = i;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = nVar;
            this.h = handler;
            this.i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i = this.b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString("message", str2);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle2.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString("message", str2);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.f9691a) {
                    a(3, System.currentTimeMillis() - this.j, str, "url download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 205;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
            bundle3.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            bundle3.putString("message", str2);
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            if (this.g != null) {
                try {
                    this.g.a(str, this.e, b.b(880006, new MBridgeIds(this.c, this.d, this.e), str2, null, null));
                } catch (Exception e) {
                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i = this.b;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.c);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle2.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.f9691a) {
                    a(1, System.currentTimeMillis() - this.j, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 105;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.d);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
            bundle3.putString("key", this.d + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            n nVar = this.g;
            if (nVar != null) {
                nVar.a(this.c, this.d, this.e, str);
            }
        }

        public void a(boolean z) {
            this.f9691a = z;
        }

        private void a(int i, long j, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i, j, str, str2, str3));
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        private Handler f9693a;
        private int b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f9694a;

            a(String str) {
                this.f9694a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n a2 = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                        q0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                        nVar.b(j.this.f.getId());
                        nVar.i(j.this.f.getImageUrl());
                        nVar.n(j.this.f.getRequestId());
                        nVar.k(j.this.f.getCurrentLocalRid());
                        nVar.o(j.this.f.getRequestIdNotice());
                        nVar.u(j.this.c);
                        nVar.m(this.f9694a);
                        nVar.b("scenes", "1");
                        a2.a(nVar);
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f9693a = handler;
            this.b = i;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message obtain = Message.obtain();
            obtain.what = this.b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
            bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain.setData(bundle);
            this.f9693a.sendMessage(obtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = this.b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
            bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain.setData(bundle);
            this.f9693a.sendMessage(obtain);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class l implements H5DownLoadManager.ZipDownloadListener {
        private Context b;
        private String c;
        private String d;
        private String e;
        private CampaignEx f;
        private int g;
        private Handler h;
        private n i;
        private CopyOnWriteArrayList<CampaignEx> j;

        /* renamed from: a, reason: collision with root package name */
        private boolean f9696a = false;
        private long k = System.currentTimeMillis();

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f9697a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;

            a(int i, String str, String str2, String str3) {
                this.f9697a = i;
                this.b = str;
                this.c = str2;
                this.d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f == null || l.this.b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.b != null) {
                        nVar.c(m0.s(l.this.b.getApplicationContext()));
                    }
                    nVar.d(this.f9697a);
                    if (l.this.f != null) {
                        nVar.b(l.this.f.getId());
                        nVar.n(l.this.f.getRequestId());
                        nVar.k(l.this.f.getCurrentLocalRid());
                        nVar.o(l.this.f.getRequestIdNotice());
                    }
                    nVar.t(this.b);
                    nVar.m(this.c);
                    nVar.u(l.this.c);
                    if (!TextUtils.isEmpty(this.d)) {
                        nVar.q(this.d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.b);
                    b.b(nVar, l.this.f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        /* compiled from: RewardCampaignsResourceManager.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        class RunnableC1411b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f9698a;
            final /* synthetic */ long b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            RunnableC1411b(int i, long j, String str, String str2, String str3) {
                this.f9698a = i;
                this.b = j;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f9698a, this.b + "", this.c, l.this.f.getId(), l.this.c, this.d, "1");
                    nVar.n(l.this.f.getRequestId());
                    nVar.k(l.this.f.getCurrentLocalRid());
                    nVar.o(l.this.f.getRequestIdNotice());
                    nVar.b(l.this.f.getId());
                    nVar.a(l.this.f.getAdSpaceT());
                    nVar.q(this.e);
                    nVar.b("scenes", "1");
                    if (l.this.f.getAdType() == 287) {
                        nVar.a(ExifInterface.GPS_MEASUREMENT_3D);
                    } else if (l.this.f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.c);
                    nVar.e(3);
                    b.b(nVar, l.this.f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.c, l.this.f);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.b = context;
            this.d = str;
            this.c = str2;
            this.e = str3;
            this.f = campaignEx;
            this.g = i;
            this.h = handler;
            this.i = nVar;
            this.j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString("message", str);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle2.putString("url", str2);
                bundle2.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("message", str);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.f9696a) {
                    a(3, currentTimeMillis, str2, "zip download failed", "");
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 203;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
            bundle3.putString("url", str2);
            bundle3.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            bundle3.putString("message", str);
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            if (this.i != null) {
                try {
                    this.i.a(str2, this.e, b.b(880006, new MBridgeIds(this.d, this.c, this.e), "", null, null));
                } catch (Exception e) {
                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
            a(3, str2, str, "");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long currentTimeMillis = System.currentTimeMillis() - this.k;
            int i = this.g;
            if (i == 313) {
                Message obtain = Message.obtain();
                obtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle.putString("url", str);
                obtain.setData(bundle);
                this.h.sendMessage(obtain);
                return;
            }
            if (i == 497) {
                Message obtain2 = Message.obtain();
                obtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.d);
                bundle2.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
                bundle2.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
                bundle2.putString("url", str);
                obtain2.setData(bundle2);
                this.h.sendMessage(obtain2);
                if (this.f9696a) {
                    a(1, currentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i != 859) {
                return;
            }
            Message obtain3 = Message.obtain();
            obtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.d);
            bundle3.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.e);
            bundle3.putString("key", this.c + "_" + this.e + "_" + this.f.getSecondRequestIndex());
            obtain3.setData(bundle3);
            this.h.sendMessage(obtain3);
            n nVar = this.i;
            if (nVar != null) {
                nVar.a(this.d, this.c, this.e, str);
            }
            if (z) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z) {
            this.f9696a = z;
        }

        private void a(int i, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i, str, str2, str3));
        }

        private void a(int i, long j, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC1411b(i, j, str, str2, str3));
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class m extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private Context f9699a;
        private ConcurrentHashMap<String, h> b;
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> c;

        public m(Looper looper) {
            super(looper);
            this.b = new ConcurrentHashMap<>();
            this.c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.b.put(str, hVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(18:7|(1:9)|10|(1:250)(1:14)|15|16|17|18|(3:73|74|(3:76|(6:(2:83|(2:85|(2:87|(2:89|(2:92|(0)(2:95|(2:99|(0))))(1:91))(2:104|(0)))(2:107|(0)))(2:110|(0)))|113|114|115|116|117)(10:125|126|127|128|(2:130|(2:132|(2:134|(1:(1:145)(1:143)))(1:(4:178|(4:181|(2:185|186)|187|179)|190|191)(1:176)))(1:(4:201|(6:204|(1:208)|209|(2:213|214)|215|202)|218|219)(1:199)))(1:(4:229|(4:232|(2:234|235)(1:237)|236|230)|238|239)(1:227))|146|147|148|149|(2:158|159)(2:151|(4:153|154|155|29)))|35))|20|21|22|23|24|25|(1:27)(5:(2:42|(2:44|(2:46|(2:48|(0))(2:54|(0)))(2:57|(0)))(2:60|(0)))|63|64|65|66)|28|29) */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x0485, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x0486, code lost:
        
            r6 = r14;
            r9 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0489, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:72:0x048a, code lost:
        
            r6 = r14;
            r9 = r9;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:262:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:264:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r10v13 */
        /* JADX WARN: Type inference failed for: r10v28 */
        /* JADX WARN: Type inference failed for: r10v33 */
        /* JADX WARN: Type inference failed for: r10v37 */
        /* JADX WARN: Type inference failed for: r10v38 */
        /* JADX WARN: Type inference failed for: r10v39 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r10v7, types: [com.mbridge.msdk.foundation.entity.CampaignEx] */
        /* JADX WARN: Type inference failed for: r10v9 */
        /* JADX WARN: Type inference failed for: r14v15, types: [int] */
        /* JADX WARN: Type inference failed for: r15v11 */
        /* JADX WARN: Type inference failed for: r15v14 */
        /* JADX WARN: Type inference failed for: r15v15 */
        /* JADX WARN: Type inference failed for: r15v2, types: [int] */
        /* JADX WARN: Type inference failed for: r15v3 */
        /* JADX WARN: Type inference failed for: r15v4 */
        /* JADX WARN: Type inference failed for: r15v5 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v7 */
        /* JADX WARN: Type inference failed for: r15v9 */
        /* JADX WARN: Type inference failed for: r20v0, types: [com.mbridge.msdk.videocommon.download.b] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v12 */
        /* JADX WARN: Type inference failed for: r9v13 */
        /* JADX WARN: Type inference failed for: r9v14 */
        /* JADX WARN: Type inference failed for: r9v24 */
        /* JADX WARN: Type inference failed for: r9v25 */
        /* JADX WARN: Type inference failed for: r9v46 */
        /* JADX WARN: Type inference failed for: r9v48 */
        /* JADX WARN: Type inference failed for: r9v49, types: [int] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r9v51 */
        /* JADX WARN: Type inference failed for: r9v52 */
        /* JADX WARN: Type inference failed for: r9v53 */
        /* JADX WARN: Type inference failed for: r9v54 */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8, types: [int] */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // android.os.Handler
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void handleMessage(Message message) {
            String str;
            boolean z;
            String str2;
            ?? r10;
            CampaignEx campaignEx;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID);
            String string4 = data.getString("key");
            f fVar = (f) b.g.get(string4);
            h hVar = this.b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.c.get(string4);
            int i = message.what;
            switch (i) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i) {
                        case 200:
                        case 201:
                        case 203:
                        case 205:
                            ?? r9 = "RewardCampaignsResourceManager";
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString("message");
                                if (string5 == null) {
                                    string5 = "";
                                }
                                ?? c = b.c(message.what);
                                String str3 = "resource download failed " + b.d(message.what) + ServerSentEventKt.SPACE + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.h;
                                CampaignEx campaignEx2 = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.h.get(0);
                                try {
                                    try {
                                    } catch (Exception e) {
                                        e = e;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    str2 = str3;
                                    r9 = c;
                                }
                                if (fVar.f9689a) {
                                    try {
                                    } catch (Exception e3) {
                                        e = e3;
                                        r9 = c;
                                        c = str3;
                                    }
                                    if (fVar.i != null) {
                                        if (fVar.c == 1) {
                                            if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                                                int i2 = message.what;
                                                if (i2 != 200) {
                                                    if (i2 != 201) {
                                                        if (i2 != 203) {
                                                            if (i2 == 205) {
                                                                if (!campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.h;
                                                                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                                        CampaignEx campaignEx3 = fVar.h.get(0);
                                                                        if (campaignEx3.getCMPTEntryUrl().equals(campaignEx3.getendcard_url()) && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else if (campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                        }
                                                    } else if (campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                                    }
                                                } else if (campaignEx2.getRsIgnoreCheckRule().contains(0)) {
                                                }
                                            }
                                            try {
                                                campaignEx = null;
                                            } catch (Exception e4) {
                                                e = e4;
                                                campaignEx = null;
                                            }
                                            try {
                                                hVar.a(fVar.h, b.b(c, new MBridgeIds(string, string2, string3), str3, null, null));
                                                this.b.remove(string4);
                                                b.g.remove(string4);
                                                this.c.remove(string4);
                                                break;
                                            } catch (Exception e5) {
                                                e = e5;
                                                r10 = campaignEx;
                                                str2 = str3;
                                                r9 = c;
                                                hVar.a(fVar.h, b.b(r9, new MBridgeIds(string, string2, string3), str2, e, r10));
                                                return;
                                            }
                                        } else {
                                            try {
                                                String string6 = data.getString("url");
                                                int i3 = message.what;
                                                try {
                                                    if (i3 == 200) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(0)) {
                                                            q0.c(r9, "Is TPL but  video download fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            for (int i4 = 0; i4 < fVar.i.size(); i4++) {
                                                                if (fVar.i.get(i4).getVideoUrlEncode().equals(string6)) {
                                                                    fVar.i.remove(i4);
                                                                }
                                                            }
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    } else if (i3 == 201) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                                            q0.c(r9, "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            for (int i5 = 0; i5 < fVar.i.size(); i5++) {
                                                                CampaignEx campaignEx4 = fVar.i.get(i5);
                                                                if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().h().equals(string6)) {
                                                                    fVar.i.remove(i5);
                                                                }
                                                                if (!TextUtils.isEmpty(campaignEx4.getendcard_url()) && campaignEx4.getendcard_url().equals(string6)) {
                                                                    fVar.i.remove(i5);
                                                                }
                                                            }
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    } else if (i3 == 203) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                            q0.c(r9, "Is TPL but download template fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            for (int i6 = 0; i6 < fVar.i.size(); i6++) {
                                                                CampaignEx campaignEx5 = fVar.i.get(i6);
                                                                if (campaignEx5.getRewardTemplateMode() != null && campaignEx5.getRewardTemplateMode().j().equals(string6)) {
                                                                    fVar.i.remove(i6);
                                                                }
                                                            }
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    } else if (i3 == 205) {
                                                        if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0 && campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                            q0.c(r9, "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                            break;
                                                        } else {
                                                            fVar.i.clear();
                                                            b.g.remove(string4);
                                                            b.g.put(string4, fVar);
                                                        }
                                                    }
                                                    try {
                                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.e, fVar.b, fVar.d, fVar.f9689a, fVar.c, copyOnWriteArrayList)) {
                                                            try {
                                                                hVar.a(string, string2, string3, fVar.h);
                                                                this.b.remove(string4);
                                                                b.g.remove(string4);
                                                                this.c.remove(string4);
                                                                break;
                                                            } catch (Exception e6) {
                                                                e = e6;
                                                                str2 = str3;
                                                                r9 = c;
                                                                r10 = null;
                                                                hVar.a(fVar.h, b.b(r9, new MBridgeIds(string, string2, string3), str2, e, r10));
                                                                return;
                                                            }
                                                        } else if (fVar.i.size() == 0) {
                                                            String str4 = str3;
                                                            boolean z2 = c;
                                                            str3 = null;
                                                            hVar.a(fVar.h, b.b(z2 ? 1 : 0, new MBridgeIds(string, string2, string3), str4, null, null));
                                                            this.b.remove(string4);
                                                            b.g.remove(string4);
                                                            this.c.remove(string4);
                                                            r9 = z2;
                                                            c = str4;
                                                            break;
                                                        }
                                                    } catch (Exception e7) {
                                                        e = e7;
                                                        c = str3;
                                                        r9 = c;
                                                        str3 = null;
                                                        r10 = str3;
                                                        str2 = c;
                                                        hVar.a(fVar.h, b.b(r9, new MBridgeIds(string, string2, string3), str2, e, r10));
                                                        return;
                                                    }
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    str2 = str3;
                                                    r9 = c;
                                                    r10 = null;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                                r9 = c;
                                                c = str3;
                                                str3 = null;
                                                r10 = str3;
                                                str2 = c;
                                                hVar.a(fVar.h, b.b(r9, new MBridgeIds(string, string2, string3), str2, e, r10));
                                                return;
                                            }
                                        }
                                        hVar.a(fVar.h, b.b(r9, new MBridgeIds(string, string2, string3), str2, e, r10));
                                    }
                                }
                                r9 = c;
                                ?? bVar = com.mbridge.msdk.videocommon.download.b.getInstance();
                                String str5 = fVar.e;
                                boolean z3 = fVar.b;
                                ?? r14 = fVar.d;
                                boolean z4 = fVar.f9689a;
                                if (bVar.a(94, str5, z3, r14, z4, fVar.c, copyOnWriteArrayList)) {
                                    hVar.a(string, string2, string3, fVar.h);
                                    str2 = str3;
                                    r10 = null;
                                } else {
                                    if (campaignEx2 != null && campaignEx2.getRsIgnoreCheckRule() != null && campaignEx2.getRsIgnoreCheckRule().size() > 0) {
                                        int i7 = message.what;
                                        if (i7 != 200) {
                                            if (i7 != 201) {
                                                if (i7 != 203) {
                                                    if (i7 == 205 && campaignEx2.getRsIgnoreCheckRule().contains(3)) {
                                                    }
                                                } else if (campaignEx2.getRsIgnoreCheckRule().contains(1)) {
                                                }
                                            } else if (campaignEx2.getRsIgnoreCheckRule().contains(2)) {
                                            }
                                        } else if (campaignEx2.getRsIgnoreCheckRule().contains(0)) {
                                        }
                                    }
                                    str2 = str3;
                                    r10 = null;
                                    try {
                                        hVar.a(fVar.h, b.b(r9, new MBridgeIds(string, string2, string3), str2, null, null));
                                    } catch (Exception e10) {
                                        e = e10;
                                    }
                                }
                                this.b.remove(string4);
                                b.g.remove(string4);
                                this.c.remove(string4);
                                r9 = r9;
                                str3 = r14;
                                c = z4;
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                str = "RewardCampaignsResourceManager";
            } catch (Exception e11) {
                e = e11;
                str = "RewardCampaignsResourceManager";
            }
            try {
                z = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.e, fVar.b, fVar.d, fVar.f9689a, fVar.c, copyOnWriteArrayList);
            } catch (Exception e12) {
                e = e12;
                if (MBridgeConstans.DEBUG) {
                    q0.b(str, e.getLocalizedMessage());
                }
                z = false;
                if (z) {
                }
            }
            if (z) {
                return;
            }
            hVar.a(string, string2, string3, fVar.h);
            this.b.remove(string4);
            b.g.remove(string4);
            this.c.remove(string4);
        }

        public void a(Context context) {
            this.f9699a = context;
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.c.put(str, copyOnWriteArrayList);
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    public interface o {
        void a(String str, String str2, String str3, a.C1462a c1462a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C1462a c1462a);
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f9700a;
        private Runnable b;
        private final boolean c;
        private final boolean d;
        private String e;
        private final o f;
        private final WindVaneWebView g;
        private final String h;
        private final String i;
        private final String j;
        private final a.C1462a k;
        private final CampaignEx l;
        private CopyOnWriteArrayList<CampaignEx> m;
        private long n;
        private boolean o;
        private boolean p;
        private final Runnable q;
        private final Runnable r;

        /* compiled from: RewardCampaignsResourceManager.java */
        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f9701a;
            final /* synthetic */ a.C1462a b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            a(o oVar, a.C1462a c1462a, String str, String str2, String str3, String str4) {
                this.f9701a = oVar;
                this.b = c1462a;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView b;
                a.C1462a c1462a;
                if (this.f9701a != null && (c1462a = this.b) != null) {
                    c1462a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.c + "_" + this.d + "_" + this.e, true);
                    this.f9701a.a(this.c + "_" + this.e, this.f, this.c, this.d, this.e, this.b);
                }
                a.C1462a c1462a2 = this.b;
                if (c1462a2 == null || (b = c1462a2.b()) == null) {
                    return;
                }
                try {
                    b.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        /* compiled from: RewardCampaignsResourceManager.java */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        class RunnableC1412b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f9702a;
            final /* synthetic */ a.C1462a b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;
            final /* synthetic */ String f;

            RunnableC1412b(o oVar, a.C1462a c1462a, String str, String str2, String str3, String str4) {
                this.f9702a = oVar;
                this.b = c1462a;
                this.c = str;
                this.d = str2;
                this.e = str3;
                this.f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView b;
                a.C1462a c1462a;
                if (this.f9702a != null && (c1462a = this.b) != null) {
                    c1462a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.c + "_" + this.d + "_" + this.e, true);
                    this.f9702a.a(this.c + "_" + this.e, this.f, this.c, this.d, this.e, this.b);
                }
                a.C1462a c1462a2 = this.b;
                if (c1462a2 == null || (b = c1462a2.b()) == null) {
                    return;
                }
                try {
                    b.release();
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z, boolean z2, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C1462a c1462a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j) {
            this.f9700a = handler;
            this.b = runnable;
            this.c = z;
            this.d = z2;
            this.e = str;
            this.f = oVar;
            this.g = windVaneWebView;
            this.h = str2;
            this.i = str4;
            this.j = str3;
            this.k = c1462a;
            this.l = campaignEx;
            this.m = copyOnWriteArrayList;
            this.n = j;
            a aVar = new a(oVar, c1462a, str4, str, str2, str3);
            this.r = aVar;
            this.q = new RunnableC1412b(oVar, c1462a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i);
            Handler handler2 = this.f9700a;
            if (handler2 != null && (runnable2 = this.q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f9700a;
            if (handler3 != null && (runnable = this.r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.l, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
            if (this.p) {
                return;
            }
            String str = this.i + "_" + this.h;
            if (i == 1) {
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f9700a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                a.C1462a c1462a = this.k;
                if (c1462a != null) {
                    c1462a.a(true);
                }
                if (this.c) {
                    if (this.d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                o oVar = this.f;
                if (oVar != null) {
                    oVar.a(str, this.j, this.i, this.e, this.h, this.k);
                }
            } else if (this.f != null) {
                this.f.a(str, this.e, this.h, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), "readyState:" + i, null, this.l));
            }
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.onPageFinished(webView, str);
            Handler handler2 = this.f9700a;
            if (handler2 != null && (runnable2 = this.r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.o) {
                return;
            }
            if (str.contains("wfr=1")) {
                Handler handler3 = this.f9700a;
                if (handler3 != null && (runnable = this.q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            } else {
                String str2 = this.i + "_" + this.h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, true);
                Runnable runnable3 = this.b;
                if (runnable3 != null && (handler = this.f9700a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C1462a c1462a = this.k;
                if (c1462a != null) {
                    c1462a.a(true);
                }
                if (this.c) {
                    if (this.l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.l.getRequestIdNotice(), this.k);
                    }
                } else if (this.l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.l.getRequestIdNotice(), this.k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.l.getRequestIdNotice(), this.k);
                }
                o oVar = this.f;
                if (oVar != null) {
                    oVar.a(str2, this.j, this.i, this.e, this.h, this.k);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.o = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.f9700a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.f9700a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.i + "_" + this.h;
                a.C1462a c1462a = this.k;
                if (c1462a != null) {
                    c1462a.a(false);
                }
                if (this.f != null) {
                    this.f.a(str3, this.e, str2, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), i + "#" + str, null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.onReceivedSslError(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.i + "_" + this.e + "_" + this.h, false);
            Handler handler = this.f9700a;
            if (handler != null) {
                if (this.q != null) {
                    handler.removeCallbacks(this.r);
                }
                Runnable runnable = this.q;
                if (runnable != null) {
                    this.f9700a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.i + "_" + this.h;
                a.C1462a c1462a = this.k;
                if (c1462a != null) {
                    c1462a.a(false);
                }
                if (this.f != null) {
                    this.f.a(str, this.e, this.h, this.k, b.b(880009, new MBridgeIds(this.j, this.i, this.e), "onReceivedSslError:" + (sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError())), null, this.l));
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("WindVaneWebView", e.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        private String f9703a;
        private final boolean b;
        private final WindVaneWebView c;
        private final String d;
        private final String e;
        private final a.C1462a f;
        private final CampaignEx g;
        private boolean h;
        private String i;
        private boolean j;
        private boolean k;

        public q(String str, boolean z, WindVaneWebView windVaneWebView, String str2, String str3, a.C1462a c1462a, CampaignEx campaignEx, boolean z2, String str4) {
            this.b = z;
            this.c = windVaneWebView;
            this.d = str2;
            this.e = str3;
            this.f = c1462a;
            this.g = campaignEx;
            this.f9703a = str;
            this.h = z2;
            this.i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.g, eVar);
            } catch (Throwable th) {
                q0.b("WindVaneWebView", th.getMessage());
            }
            if (this.k) {
                return;
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f9703a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
            String str = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
            if (i == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                a.C1462a c1462a = this.f;
                if (c1462a != null) {
                    c1462a.a(true);
                }
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f, false, this.h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
                a.C1462a c1462a2 = this.f;
                if (c1462a2 != null) {
                    c1462a2.a(false);
                }
            }
            this.k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            if (this.j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f9703a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("WindVaneWebView", e.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, true);
                a.C1462a c1462a = this.f;
                if (c1462a != null) {
                    c1462a.a(true);
                }
                String str2 = this.e + "_" + this.g.getId() + "_" + this.g.getRequestId() + "_" + this.d;
                if (this.b) {
                    if (this.g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.g.getRequestIdNotice(), this.f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                    }
                } else if (this.g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.g.getRequestIdNotice(), this.f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f, false, this.h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.j = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.e + "_" + this.i + "_" + this.d, false);
            a.C1462a c1462a = this.f;
            if (c1462a != null) {
                c1462a.a(false);
            }
            if (this.c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f9703a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("WindVaneWebView", e.getLocalizedMessage());
                    }
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class r {

        /* renamed from: a, reason: collision with root package name */
        private static final b f9704a = new b(null);
    }

    /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i2) {
        if (i2 == 200) {
            return 880004;
        }
        if (i2 == 201) {
            return 880007;
        }
        if (i2 != 203) {
            return i2 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i2) {
        synchronized (b.class) {
            return i2 != 200 ? i2 != 201 ? i2 != 203 ? i2 != 205 ? "unknown" : "tpl" : W3.D : "zip/html" : "video";
        }
    }

    public void c() {
    }

    private b() {
        this.c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.d = "down_type";
        this.e = "h3c";
        this.f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f9683a = new m(handlerThread.getLooper());
    }

    public static b b() {
        return r.f9704a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c c2 = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), campaignEx.getCampaignUnitId());
            if (c2 != null) {
                nVar.s(c2.x());
            }
            com.mbridge.msdk.videocommon.setting.a c3 = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (c3 != null) {
                nVar.r(c3.f());
            }
        } catch (Exception e2) {
            q0.b("RewardCampaignsResourceManager", e2.getMessage());
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f9695a;
        private final String b;
        private final String c;
        private final String d;
        private final String e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f9695a = handler;
            this.c = str;
            this.b = str2;
            this.d = str3;
            this.e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message obtain = Message.obtain();
            obtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.d);
            bundle.putString("key", this.e);
            bundle.putString("url", str);
            obtain.setData(bundle);
            this.f9695a.sendMessage(obtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message obtain = Message.obtain();
            obtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.c);
            bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.d);
            bundle.putString("url", str2);
            bundle.putString("key", this.e);
            bundle.putString("message", str);
            obtain.setData(bundle);
            this.f9695a.sendMessage(obtain);
        }
    }

    public synchronized void a(Context context, boolean z, int i2, boolean z2, int i3, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        g.put(str4, new f(z, z2, i2, copyOnWriteArrayList2.size(), str2, str3, i3, copyOnWriteArrayList2));
        this.f9683a.a(str4, hVar);
        this.f9683a.a(context);
        this.f9683a.a(str4, copyOnWriteArrayList2);
        this.f9683a.post(new a(copyOnWriteArrayList2, context, str2, i3, str, str3, str4, nVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i2, MBridgeIds mBridgeIds, String str, Throwable th, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i2);
        bVar.a(mBridgeIds);
        bVar.a(th);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, CampaignEx campaignEx, String str, String str2) {
        z.a(i2, str, str2, new C1410b(i2, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c a2 = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean isEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f9683a, nVar, copyOnWriteArrayList);
                lVar.a(isEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(a2, str4, lVar);
                return;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean isEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f9683a, copyOnWriteArrayList);
            iVar.a(isEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(a2, str4, iVar);
        } catch (Exception e3) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    private static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f9690a;
        private final Runnable b;
        private final boolean c;
        private final boolean d;
        private int e;
        private String f;
        private String g;
        private String h;
        private String i;
        private a.C1462a j;
        private CampaignEx k;
        private CopyOnWriteArrayList<CampaignEx> l;
        private com.mbridge.msdk.videocommon.setting.c m;
        private final o n;
        private boolean o;
        private boolean p;
        private boolean q;
        private int r = 0;
        private boolean s;
        private long t;

        public g(boolean z, Handler handler, Runnable runnable, boolean z2, boolean z3, int i, String str, String str2, String str3, String str4, a.C1462a c1462a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z4, long j) {
            this.f9690a = handler;
            this.b = runnable;
            this.c = z2;
            this.d = z3;
            this.e = i;
            this.f = str;
            this.h = str2;
            this.g = str3;
            this.i = str4;
            this.j = c1462a;
            this.k = campaignEx;
            this.l = copyOnWriteArrayList;
            this.m = cVar;
            this.n = oVar;
            this.o = z4;
            this.s = z;
            this.t = j;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.k, eVar);
            } catch (Throwable th) {
                q0.b("RVWindVaneWebView", th.getMessage());
            }
            if (this.q) {
                return;
            }
            String str = this.g + "_" + this.f;
            if (i == 1) {
                if (this.o) {
                    com.mbridge.msdk.videocommon.a.d(this.g + "_" + this.i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.g + "_" + this.i);
                }
                com.mbridge.msdk.videocommon.a.a(this.g + "_" + this.i + "_" + this.f, this.j, true, this.o);
                Handler handler = this.f9690a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                a.C1462a c1462a = this.j;
                if (c1462a != null) {
                    c1462a.a(true);
                }
                o oVar = this.n;
                if (oVar != null) {
                    oVar.a(str, this.h, this.g, this.i, this.f, this.j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
                a.C1462a c1462a2 = this.j;
                if (c1462a2 != null) {
                    c1462a2.a(false);
                }
                if (this.n != null) {
                    this.n.a(str, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "readyState:" + i, null, this.k));
                }
            }
            this.q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onPageFinished(WebView webView, String str) {
            Runnable runnable;
            super.onPageFinished(webView, str);
            if (this.p) {
                return;
            }
            String str2 = this.g + "_" + this.f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, true);
                Handler handler = this.f9690a;
                if (handler != null && (runnable = this.b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C1462a c1462a = this.j;
                if (c1462a != null) {
                    c1462a.a(true);
                }
                o oVar = this.n;
                if (oVar != null) {
                    oVar.a(str2, this.h, this.g, this.i, this.f, this.j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.g + "_" + this.i + "_" + this.f, false);
            if (this.n != null) {
                String str3 = this.g + "_" + this.f;
                a.C1462a c1462a = this.j;
                if (c1462a != null) {
                    c1462a.a(false);
                }
                this.n.a(str3, this.i, this.f, this.j, b.b(880008, new MBridgeIds(this.h, this.g, this.i), "onReceivedError： " + i + "  " + str, null, this.k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void onRenderProcessGone(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.g, this.i);
                } catch (Throwable th) {
                    q0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i, int i2) {
            boolean z = true;
            if (i == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i2 != 2) {
                        z = false;
                    }
                    aVar.d(z);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i2, str2, true, 1));
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        q0.b("RVWindVaneWebView", e.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String optString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, optString);
                    String f = com.mbridge.msdk.video.bt.component.d.c().f(optString);
                    CampaignEx c = com.mbridge.msdk.video.bt.component.d.c().c(optString);
                    com.mbridge.msdk.videocommon.setting.c d = com.mbridge.msdk.video.bt.component.d.c().d(optString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(c);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).b;
                    if (windVaneWebView != null) {
                        b.b().a(this.s, windVaneWebView, c, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, d, f, optString, this.r == 0 ? 3 : 6);
                        this.r++;
                    }
                } catch (Throwable th) {
                    q0.b("RVWindVaneWebView", th.getMessage());
                }
            }
        }
    }

    /* compiled from: RewardCampaignsResourceManager.java */
    /* renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    class C1410b implements z.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f9685a;
        final /* synthetic */ CampaignEx b;

        C1410b(int i, CampaignEx campaignEx) {
            this.f9685a = i;
            this.b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, String str2, String str3, String str4, boolean z) {
            if (z) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i = this.f9685a;
                if (i == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.b);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.z.c
        public void a(String str, DownloadError downloadError) {
            String str2 = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        str2 = downloadError.getException().getMessage();
                    }
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        e.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i = this.f9685a;
            if (i == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.b);
            nVar.o(this.b.getRequestIdNotice());
            nVar.m(str2);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.b);
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        this.f9683a.a(context);
        if (campaignEx != null) {
            String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
            if (campaignEx.isDynamicView()) {
                if (v0.c(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                    a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                }
                ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                Message obtain = Message.obtain();
                obtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str3);
                bundle.putString("key", str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                bundle.putString("url", cMPTEntryUrl);
                obtain.setData(bundle);
                this.f9683a.sendMessage(obtain);
                if (nVar != null) {
                    nVar.a(str, str2, str3, cMPTEntryUrl);
                }
                return;
            }
        }
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.c b = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                if (b == null) {
                    b = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                com.mbridge.msdk.foundation.same.report.metrics.c cVar = b;
                cVar.a(campaignEx);
                cVar.e(1);
                cVar.f(a(campaignEx));
                H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
            } catch (Exception e2) {
                q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i2, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i2, str, str2, str3, str4));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x01bf A[Catch: all -> 0x01ee, TryCatch #9 {, blocks: (B:4:0x000b, B:6:0x0026, B:9:0x002e, B:13:0x0040, B:26:0x0077, B:29:0x007d, B:31:0x0083, B:32:0x008e, B:35:0x00c7, B:37:0x00dd, B:44:0x01bb, B:46:0x01bf, B:48:0x01ca, B:50:0x0089, B:55:0x0162, B:60:0x00f8, B:63:0x0108, B:65:0x011e), top: B:3:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01ca A[Catch: all -> 0x01ee, TRY_LEAVE, TryCatch #9 {, blocks: (B:4:0x000b, B:6:0x0026, B:9:0x002e, B:13:0x0040, B:26:0x0077, B:29:0x007d, B:31:0x0083, B:32:0x008e, B:35:0x00c7, B:37:0x00dd, B:44:0x01bb, B:46:0x01bf, B:48:0x01ca, B:50:0x0089, B:55:0x0162, B:60:0x00f8, B:63:0x0108, B:65:0x011e), top: B:3:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(boolean z, Handler handler, boolean z2, boolean z3, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        a.C1462a c1462a;
        String str9;
        String str10;
        String str11;
        WindVaneWebView windVaneWebView2;
        com.mbridge.msdk.video.signal.impl.k kVar;
        com.mbridge.msdk.video.signal.impl.k kVar2;
        String str12 = str4 + "_" + str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e2) {
            e = e2;
            str7 = str5;
            str8 = str4;
        }
        if (v0.i(str)) {
            if (oVar != null) {
                oVar.a(str12, str3, str4, str5, str, null);
            }
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("type", 2);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
        a.C1462a c1462a2 = new a.C1462a();
        try {
        } catch (Exception e3) {
            e = e3;
        }
        try {
            try {
                try {
                } catch (Throwable unused) {
                    str7 = str5;
                    if (oVar != null) {
                        c1462a2.a(true);
                        str8 = str4;
                        try {
                            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str8 + "_" + str7 + "_" + str, true);
                            oVar.a(str8 + "_" + str, str3, str4, str5, str, c1462a2);
                            return;
                        } catch (Exception e4) {
                            e = e4;
                            if (MBridgeConstans.DEBUG) {
                                q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                            }
                            if (oVar != null) {
                                oVar.a(str12, str5, str, null, b(880009, new MBridgeIds(str3, str8, str7), "", e, campaignEx));
                            }
                        }
                    }
                    return;
                }
            } catch (Exception unused2) {
                c1462a = c1462a2;
                str9 = str5;
                str10 = str4;
                str11 = str;
            }
            try {
                windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
                if (campaignEx != null) {
                    windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView2.setTempTypeForMetrics(2);
                try {
                    c1462a2.a(windVaneWebView2);
                    if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                        kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                    } else {
                        kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                    }
                    kVar2 = kVar;
                    kVar2.g(i2);
                    kVar2.setUnitId(str4);
                    kVar2.setRewardUnitSetting(cVar);
                    kVar2.d(z);
                } catch (Exception e5) {
                    e = e5;
                    str7 = str5;
                }
            } catch (Exception unused3) {
                str9 = str5;
                str11 = str;
                str10 = str4;
                c1462a = c1462a2;
                if (oVar != null) {
                    c1462a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str10 + "_" + str9 + "_" + str11, true);
                    oVar.a(str10 + "_" + str11, str3, str4, str5, str, c1462a);
                }
                return;
            }
        } catch (Exception e6) {
            e = e6;
            if (MBridgeConstans.DEBUG) {
            }
            if (oVar != null) {
            }
        }
        try {
            windVaneWebView2.setWebViewListener(new p(handler, null, z2, z3, str5, oVar, windVaneWebView, str, str3, str4, c1462a2, campaignEx, copyOnWriteArrayList, currentTimeMillis));
            windVaneWebView2.setObject(kVar2);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e7) {
            e = e7;
            str7 = str5;
            str8 = str4;
            if (MBridgeConstans.DEBUG) {
            }
            if (oVar != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x01d6 A[Catch: all -> 0x0207, TRY_ENTER, TryCatch #2 {, blocks: (B:4:0x000d, B:7:0x0036, B:12:0x004a, B:14:0x007d, B:15:0x0084, B:17:0x009f, B:19:0x00a5, B:21:0x00af, B:24:0x00b6, B:26:0x00bc, B:27:0x00c6, B:29:0x00cc, B:31:0x00e0, B:33:0x00ee, B:39:0x00f7, B:41:0x00fb, B:42:0x0108, B:45:0x0159, B:48:0x016d, B:51:0x018d, B:57:0x01d6, B:58:0x01f8, B:60:0x01fc, B:68:0x0102), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01fc A[Catch: all -> 0x0207, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x000d, B:7:0x0036, B:12:0x004a, B:14:0x007d, B:15:0x0084, B:17:0x009f, B:19:0x00a5, B:21:0x00af, B:24:0x00b6, B:26:0x00bc, B:27:0x00c6, B:29:0x00cc, B:31:0x00e0, B:33:0x00ee, B:39:0x00f7, B:41:0x00fb, B:42:0x0108, B:45:0x0159, B:48:0x016d, B:51:0x018d, B:57:0x01d6, B:58:0x01f8, B:60:0x01fc, B:68:0x0102), top: B:3:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(boolean z, Handler handler, boolean z2, boolean z3, String str, String str2, String str3, String str4, String str5, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z4) {
        String str8;
        String str9;
        com.mbridge.msdk.video.signal.impl.k kVar;
        MBridgeBTRootLayout mBridgeBTRootLayout;
        this.b = z4;
        long currentTimeMillis = System.currentTimeMillis();
        String str10 = str4 + "_" + str5;
        this.b = z4;
        if (v0.i(str5)) {
            if (oVar != null) {
                oVar.a(str10, str3, str4, str, str5, null);
            }
            return;
        }
        try {
            q0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 1);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C1462a c1462a = new a.C1462a();
            WindVaneWebView windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView.setTempTypeForMetrics(1);
            c1462a.a(windVaneWebView);
            String b = com.mbridge.msdk.video.bt.component.d.c().b();
            String b2 = com.mbridge.msdk.video.bt.component.d.c().b();
            c1462a.a(b2);
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> b3 = com.mbridge.msdk.videocommon.download.b.getInstance().b(str4);
                if (b3 != null && b3.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : b3) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
            } else {
                kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
            }
            com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
            kVar2.g(i2);
            kVar2.setUnitId(str7);
            kVar2.c(b2);
            kVar2.d(b);
            kVar2.c(true);
            kVar2.setRewardUnitSetting(cVar);
            kVar2.d(z);
            try {
                windVaneWebView.setWebViewListener(new g(z, handler, null, z2, z3, i2, str5, str3, str4, str, c1462a, campaignEx, copyOnWriteArrayList, cVar, oVar, z4, currentTimeMillis));
                windVaneWebView.setObject(kVar2);
                windVaneWebView.loadUrl(str6);
                str9 = str;
            } catch (Exception e2) {
                e = e2;
                str9 = str;
            }
            try {
                windVaneWebView.setRid(str9);
                mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTRootLayout.setInstanceId(b);
                str8 = str4;
            } catch (Exception e3) {
                e = e3;
                str8 = str4;
                if (oVar != null) {
                    oVar.a(str10, str, str5, null, b(880008, new MBridgeIds(str3, str8, str9), "", e, campaignEx));
                }
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                }
            }
            try {
                mBridgeBTRootLayout.setUnitId(str8);
                MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.n().d());
                mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                mBridgeBTLayout.setInstanceId(b2);
                mBridgeBTLayout.setUnitId(str8);
                mBridgeBTLayout.setWebView(windVaneWebView);
                AbstractMap b4 = com.mbridge.msdk.video.bt.component.d.c().b(str8, str9);
                b4.put(b2, mBridgeBTLayout);
                b4.put(b, mBridgeBTRootLayout);
                mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
            } catch (Exception e4) {
                e = e4;
                if (oVar != null) {
                }
                if (MBridgeConstans.DEBUG) {
                }
            }
        } catch (Exception e5) {
            e = e5;
            str8 = str4;
            str9 = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i2) {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e2) {
                        if (MBridgeConstans.DEBUG) {
                            q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().j()) && campaignEx.getRewardTemplateMode().j().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    q0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i2 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    q0.b("RewardCampaignsResourceManager", e3.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z, WindVaneWebView windVaneWebView, String str, int i2, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z2) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str5;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C1462a c1462a = new a.C1462a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.n().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c1462a.a(windVaneWebView2);
            String str6 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> b = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (b != null && b.size() > 0) {
                    for (int i3 = 0; i3 < copyOnWriteArrayList.size(); i3++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i3);
                        for (CampaignEx campaignEx3 : b) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i3, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                str5 = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    str6 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                str5 = str6;
            }
            kVar.g(i2);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c1462a, campaignEx, z2, str5));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(str5);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                q0.b("RewardCampaignsResourceManager", e2.getLocalizedMessage());
            }
        }
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (campaignEx.getAabEntity() != null) {
                    return campaignEx.getAabEntity().h3c;
                }
            } catch (Throwable th) {
                q0.b("RewardCampaignsResourceManager", th.getMessage());
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i2) {
        com.mbridge.msdk.foundation.same.report.metrics.c b = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (b == null) {
            b = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        b.a(campaignEx);
        b.f(a(campaignEx));
        b.e(i2);
        return b;
    }
}
