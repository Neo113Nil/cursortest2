package com.ironsource.adqualitysdk.sdk.i;

import android.R;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4298b extends AbstractC0599 {
    static {
        StringFog.decrypt("rO/4cZvUbrOd4+lHufFkvIrp+FmJ6n+o\n", "y4qMMP+DC9E=\n");
        StringFog.decrypt("gTpOYLj/trybIHpluA==\n", "6EkYCd2I4NU=\n");
        StringFog.decrypt("OZ8Hj16sdQ==\n", "Xvpz2TfJAoo=\n");
        StringFog.decrypt("kW5cMMeWz/SYf34azY8=\n", "9gsoc6j4u5E=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m5363(ArrayList arrayList) {
        View view = (View) AbstractC0599.m5554(arrayList, 0, View.class);
        Rect rect = AbstractC4297a.f147;
        view.getHitRect(rect);
        return view.getGlobalVisibleRect(rect);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View m5364(ArrayList arrayList) {
        View view = (View) AbstractC0599.m5554(arrayList, 0, View.class);
        Class cls = (Class) AbstractC0599.m5554(arrayList, 1, Class.class);
        boolean booleanValue = ((Boolean) AbstractC0599.m5554(arrayList, 2, Boolean.class)).booleanValue();
        Rect rect = AbstractC4297a.f147;
        ArrayList arrayList2 = new ArrayList();
        AbstractC4297a.m5341(view, cls, null, true, booleanValue, null, null, arrayList2);
        if (arrayList2.isEmpty()) {
            return null;
        }
        return (View) arrayList2.get(0);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View m5365(ArrayList arrayList) {
        Activity activity = (Activity) AbstractC0599.m5554(arrayList, 0, Activity.class);
        Rect rect = AbstractC4297a.f147;
        return activity.findViewById(R.id.content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0064  */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.util.List] */
    /* renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static WebView m5366(ArrayList arrayList) {
        int i;
        ArrayList arrayList2;
        String str;
        Activity activity = (Activity) AbstractC0599.m5554(arrayList, 0, Activity.class);
        ArrayList arrayList3 = new ArrayList();
        if (arrayList.size() > 1) {
            int intValue = ((Integer) AbstractC0599.m5554(arrayList, 1, Integer.class)).intValue();
            if (arrayList.size() > 2) {
                String str2 = (String) AbstractC0599.m5554(arrayList, 2, String.class);
                arrayList2 = arrayList.size() > 3 ? (List) AbstractC0599.m5554(arrayList, 3, List.class) : arrayList3;
                str = str2;
                i = intValue;
                Rect rect = AbstractC4297a.f147;
                ArrayList arrayList4 = new ArrayList();
                AbstractC4297a.m5344(activity, WebView.class, i, str, true, false, null, arrayList2, arrayList4);
                return (WebView) (arrayList4.size() > 0 ? (View) arrayList4.get(0) : null);
            }
            arrayList2 = arrayList3;
            i = intValue;
        } else {
            i = -1;
            arrayList2 = arrayList3;
        }
        str = null;
        Rect rect2 = AbstractC4297a.f147;
        ArrayList arrayList42 = new ArrayList();
        AbstractC4297a.m5344(activity, WebView.class, i, str, true, false, null, arrayList2, arrayList42);
        return (WebView) (arrayList42.size() > 0 ? (View) arrayList42.get(0) : null);
    }
}
