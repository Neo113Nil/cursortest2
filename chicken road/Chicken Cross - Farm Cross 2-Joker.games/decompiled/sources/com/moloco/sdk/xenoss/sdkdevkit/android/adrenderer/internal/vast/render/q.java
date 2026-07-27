package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import android.content.Context;
import android.webkit.WebSettings;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4817d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4818e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.y;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class q {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11533a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.f11311a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11533a = iArr;
        }
    }

    public static final C4817d a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4817d c4817d = new C4817d(context);
        c4817d.setScrollBarStyle(0);
        c4817d.setHorizontalScrollBarEnabled(false);
        c4817d.setVerticalScrollBarEnabled(false);
        WebSettings settings = c4817d.getSettings();
        settings.setSupportZoom(false);
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        c4817d.setBackgroundColor(0);
        return c4817d;
    }

    public static final void a(C4817d c4817d, y vastResource) {
        String str;
        Intrinsics.checkNotNullParameter(c4817d, "<this>");
        Intrinsics.checkNotNullParameter(vastResource, "vastResource");
        if (vastResource instanceof y.c) {
            y.c cVar = (y.c) vastResource;
            int i = a.f11533a[cVar.a().a().ordinal()];
            if (i == 1) {
                str = "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + cVar.a().b() + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
            } else if (i == 2) {
                str = "<script src=\"" + cVar.a().b() + "\"></script>";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (vastResource instanceof y.a) {
            str = ((y.a) vastResource).a().a();
        } else if (vastResource instanceof y.b) {
            str = "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=100% height=100% src=\"" + ((y.b) vastResource).a().a() + "\"></iframe>";
        } else {
            throw new NoWhenBranchMatchedException();
        }
        try {
            C4818e.a(c4817d, c4817d.getHtmlCssFixer().a(str));
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "BaseWebView", e.toString(), e, false, 8, null);
        }
    }
}
