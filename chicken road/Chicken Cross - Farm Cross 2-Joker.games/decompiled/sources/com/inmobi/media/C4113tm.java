package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.tm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4113tm {

    /* renamed from: a, reason: collision with root package name */
    public final C4092t1 f7400a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public String f;

    public C4113tm(C4092t1 c4092t1, String str, String str2, String str3, String markupType) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        this.f7400a = c4092t1;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = markupType;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C4092t1 c4092t1 = this.f7400a;
        if (c4092t1 != null) {
            linkedHashMap.put("adType", c4092t1.f7385a.m());
        }
        C4092t1 c4092t12 = this.f7400a;
        if (c4092t12 != null) {
            linkedHashMap.put("plId", Long.valueOf(c4092t12.f7385a.l.f7470a));
        }
        C4092t1 c4092t13 = this.f7400a;
        if (c4092t13 != null && (str = c4092t13.f7385a.l.f) != null) {
            linkedHashMap.put("plType", str);
        }
        C4092t1 c4092t14 = this.f7400a;
        String str2 = null;
        if (c4092t14 != null) {
            AdSet s = c4092t14.f7385a.s();
            Boolean valueOf = s != null ? Boolean.valueOf(s.getIsRewarded()) : null;
            if (valueOf != null) {
                linkedHashMap.put("isRewarded", valueOf);
            }
        }
        String str3 = this.c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.e);
        String str5 = this.f;
        if (str5 != null) {
            str2 = str5;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        C4092t1 c4092t15 = this.f7400a;
        if (c4092t15 != null && c4092t15.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f7400a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C4142um c4142um;
        AtomicBoolean atomicBoolean;
        C4092t1 c4092t1 = this.f7400a;
        if (c4092t1 == null || (c4142um = c4092t1.b) == null || (atomicBoolean = c4142um.f7419a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a2 = a();
            a2.put("networkType", Y5.g());
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2177);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("AdImpressionSuccessful", a2, EnumC3944nm.f7271a);
        }
    }

    public final void c() {
        C4142um c4142um;
        AtomicBoolean atomicBoolean;
        C4092t1 c4092t1 = this.f7400a;
        if (c4092t1 == null || (c4142um = c4092t1.b) == null || (atomicBoolean = c4142um.f7419a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap a2 = a();
            a2.put("networkType", Y5.g());
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 0);
            String str = this.d;
            if (str == null) {
                str = "";
            }
            a2.put("impressionId", str);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("AdImpressionSuccessful", a2, EnumC3944nm.f7271a);
        }
    }
}
