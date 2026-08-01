package com.chartboost.sdk.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Iterator;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yf {
    public static final a c;
    public static final yf d = new yf("MRAID", 0, CampaignEx.JSON_KEY_MRAID);
    public static final yf e = new yf("HTML", 1, "html");
    public static final yf f = new yf("VAST", 2, "vast");
    public static final yf g = new yf("UNKNOWN", 3, "unknown");
    public static final /* synthetic */ yf[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yf a(String str) {
            Object obj;
            Iterator<E> it = yf.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (StringsKt.equals(((yf) obj).c(), str, true)) {
                    break;
                }
            }
            yf yfVar = (yf) obj;
            return yfVar == null ? yf.g : yfVar;
        }

        public a() {
        }
    }

    static {
        yf[] a2 = a();
        h = a2;
        i = EnumEntriesKt.enumEntries(a2);
        c = new a(null);
    }

    public yf(String str, int i2, String str2) {
        this.b = str2;
    }

    public static final /* synthetic */ yf[] a() {
        return new yf[]{d, e, f, g};
    }

    public static EnumEntries b() {
        return i;
    }

    public static yf valueOf(String str) {
        return (yf) Enum.valueOf(yf.class, str);
    }

    public static yf[] values() {
        return (yf[]) h.clone();
    }

    public final String c() {
        return this.b;
    }
}
