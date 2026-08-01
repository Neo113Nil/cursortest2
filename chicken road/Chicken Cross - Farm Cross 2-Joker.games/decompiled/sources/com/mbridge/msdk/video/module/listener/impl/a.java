package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;

/* compiled from: CommonContainerNotifyListener.java */
/* loaded from: classes6.dex */
public class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private Activity f10210a;
    private CampaignEx b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f10210a = activity;
        this.b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        if (i != 106 || this.f10210a == null || this.b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String a2 = com.mbridge.msdk.click.c.a(this.b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(a2)) {
                intent.setData(Uri.parse(a2));
                this.f10210a.startActivity(intent);
            }
        } catch (Throwable th) {
            q0.b("NotifyListener", th.getMessage(), th);
        }
        this.f10210a.finish();
    }
}
