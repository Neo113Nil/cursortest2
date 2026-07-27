package com.mbridge.msdk.advanced.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import java.util.ArrayList;

/* compiled from: NativeAdvancedLoadListenerImpl.java */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private NativeAdvancedAdListener f8842a;
    private c b;
    private MBridgeIds c;
    private String d;
    private String e;

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.b = cVar;
        this.c = mBridgeIds;
        this.d = mBridgeIds.getUnitId();
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f8842a = nativeAdvancedAdListener;
    }

    public void a(String str) {
        this.e = str;
    }

    public void a(CampaignEx campaignEx, int i) {
        c cVar;
        q0.b("NativeAdvancedLoadManager", "onLoadSuccessed: " + i);
        c cVar2 = this.b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f8842a;
        if (nativeAdvancedAdListener != null && this.b != null) {
            nativeAdvancedAdListener.onLoadSuccessed(this.c);
        }
        this.b.a(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.d, campaignEx.isBidCampaign());
        if (i != 2 || (cVar = this.b) == null) {
            return;
        }
        cVar.a(campaignEx, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i) {
        c cVar = this.b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String l = bVar.l();
            if (!TextUtils.isEmpty(l)) {
                str = l;
            }
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f8842a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.c, str);
        }
        this.b.a(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.d, !TextUtils.isEmpty(this.e), bVar != null ? bVar.d() : null);
    }
}
