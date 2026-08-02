package com.facebook.internal;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;

@SourceDebugExtension({"SMAP\nCustomTab.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CustomTab.kt\ncom/facebook/internal/CustomTab\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,60:1\n11335#2:61\n11670#2,3:62\n*S KotlinDebug\n*F\n+ 1 CustomTab.kt\ncom/facebook/internal/CustomTab\n*L\n52#1:61\n52#1:62,3\n*E\n"})
/* renamed from: com.facebook.internal.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C0708d {
    public static final a Companion = new a();
    public Uri a;

    /* renamed from: com.facebook.internal.d$a */
    public static final class a {
        @JvmStatic
        public static Uri a(Bundle bundle, String action) {
            Intrinsics.checkNotNullParameter(action, "action");
            return E.a(A.a(), com.facebook.w.d() + "/dialog/" + action, bundle);
        }
    }

    public C0708d(String action, Bundle bundle) {
        Uri a2;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        int[] b = com.bumptech.glide.request.e.b(2);
        ArrayList arrayList = new ArrayList(b.length);
        for (int i : b) {
            if (i == 1) {
                str = "context_choose";
            } else {
                if (i != 2) {
                    throw null;
                }
                str = "join_tournament";
            }
            arrayList.add(str);
        }
        if (arrayList.contains(action)) {
            int i2 = A.a;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            com.facebook.w wVar = com.facebook.w.a;
            a2 = E.a(androidx.credentials.provider.p.a(new Object[]{"fb.gg"}, 1, "%s", "format(format, *args)"), "/dialog/".concat(action), bundle);
        } else {
            Companion.getClass();
            a2 = a.a(bundle, action);
        }
        this.a = a2;
    }
}
