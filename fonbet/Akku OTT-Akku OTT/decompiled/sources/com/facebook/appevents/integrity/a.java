package com.facebook.appevents.integrity;

import android.os.Bundle;
import java.util.HashSet;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONArray;

@SourceDebugExtension({"SMAP\nBannedParamManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BannedParamManager.kt\ncom/facebook/appevents/integrity/BannedParamManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1855#2,2:77\n*S KotlinDebug\n*F\n+ 1 BannedParamManager.kt\ncom/facebook/appevents/integrity/BannedParamManager\n*L\n64#1:77,2\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    public static boolean b;
    public static final a a = new a();
    public static HashSet<String> c = new HashSet<>();

    @JvmStatic
    public static final void a(Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.a.b(a.class)) {
            return;
        }
        try {
            if (b && bundle != null) {
                JSONArray jSONArray = new JSONArray();
                for (String str : c) {
                    if (bundle.containsKey(str)) {
                        bundle.remove(str);
                        jSONArray.put(str);
                    }
                }
                if (jSONArray.length() > 0) {
                    bundle.putString("_bannedParams", jSONArray.toString());
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, a.class);
        }
    }
}
