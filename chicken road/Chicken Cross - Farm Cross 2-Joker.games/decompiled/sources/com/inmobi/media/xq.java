package com.inmobi.media;

import android.content.Context;
import android.webkit.MimeTypeMap;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import io.ktor.http.ContentDisposition;
import io.ktor.sse.ServerSentEventKt;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.Charsets;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* loaded from: classes6.dex */
public final class xq {

    /* renamed from: a, reason: collision with root package name */
    public static final xq f7488a = new xq();
    public static final C3991pc b = new C3991pc();
    public static final C4033qq c;

    static {
        Context context = AbstractC3914mk.f7252a;
        c = context != null ? new C4033qq(context, a()) : null;
    }

    public static AdConfig.WebAssetCacheConfig a() {
        J4 j4 = AbstractC4260z4.f7518a;
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        return ((AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class)).getWebAssetCache();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(24:0|1|(2:3|(20:5|6|(3:8|9|(2:11|(2:13|(14:15|16|17|18|19|(3:42|43|(15:(3:48|49|50)|57|58|59|60|61|62|63|64|65|66|67|68|69|70))|21|(1:23)|24|25|26|27|28|29)(2:102|103))(13:104|105|106|107|108|109|(7:128|129|130|131|132|133|134)(1:111)|112|113|114|115|116|(1:119)(11:118|19|(0)|21|(0)|24|25|26|27|28|29)))(3:148|149|150))(2:175|(2:215|(2:217|218)(1:219))(8:179|180|181|(3:183|184|185)(1:209)|(1:202)|(1:190)|191|(3:(1:194)|195|196)(2:197|(2:199|200)(1:201))))|151|152|153|154|155|156|(1:158)|107|108|109|(0)(0)|112|113|114|115|116|(0)(0)))|220|6|(0)(0)|151|152|153|154|155|156|(0)|107|108|109|(0)(0)|112|113|114|115|116|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0335, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x034c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x034d, code lost:
    
        r9 = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE;
        r8 = r18;
        r5 = r19;
        r6 = r21;
        r7 = r22;
        r3 = r3;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x033f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0340, code lost:
    
        r9 = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE;
        r8 = r18;
        r5 = r19;
        r6 = r21;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0365, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0366, code lost:
    
        r9 = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE;
        r8 = r18;
        r5 = r19;
        r6 = r21;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0387, code lost:
    
        r3 = r4;
        r6 = r6;
        r8 = r8;
        r15 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0359, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x035a, code lost:
    
        r9 = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE;
        r8 = r18;
        r5 = r19;
        r6 = r21;
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x037b, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x037d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x037e, code lost:
    
        r7 = "WebResourceHandler";
        r9 = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE;
        r8 = r18;
        r5 = r19;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0371, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0372, code lost:
    
        r7 = "WebResourceHandler";
        r9 = com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE;
        r8 = r18;
        r5 = r19;
        r6 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x039e, code lost:
    
        ((com.inmobi.media.Z9) r2).a(r7, "Unhandled exception occurred: " + r0.getMessage(), r0);
        r1 = r1;
        r6 = r6;
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02ef A[Catch: Exception -> 0x0320, TimeoutCancellationException -> 0x0323, TryCatch #32 {TimeoutCancellationException -> 0x0323, Exception -> 0x0320, blocks: (B:69:0x029d, B:23:0x02ef, B:24:0x030e), top: B:19:0x0228 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x022a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0042  */
    /* JADX WARN: Type inference failed for: r11v0, types: [int] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r1v38 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32 */
    /* JADX WARN: Type inference failed for: r6v33 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v39, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v47 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v38 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v42 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v46 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v52 */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Y9 y9, ContinuationImpl continuationImpl) {
        uq uqVar;
        Object obj;
        ?? r11;
        String str2;
        Object obj2;
        long currentTimeMillis;
        String str3;
        String str4;
        ?? r6;
        Object obj3;
        ?? r8;
        Object obj4;
        String str5;
        ?? r1;
        ?? r15;
        ?? r3;
        Object obj5;
        String str6;
        String str7;
        String str8;
        Map map;
        String str9;
        String str10;
        Object obj6;
        String str11;
        String str12;
        String str13;
        Object obj7;
        Of of;
        Map map2;
        String str14;
        Object obj8;
        String str15;
        Y9 y92 = y9;
        Object obj9 = "onSuccessfulResponse: ";
        String str16 = "onFailedResponse: ";
        if (continuationImpl instanceof uq) {
            uq uqVar2 = (uq) continuationImpl;
            int i = uqVar2.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqVar2.i = i - Integer.MIN_VALUE;
                uqVar = uqVar2;
                obj = uqVar.g;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                r11 = uqVar.i;
                if (r11 == 0) {
                    r15 = 1;
                    try {
                    } catch (TimeoutCancellationException e) {
                        e = e;
                        r3 = "mimeType is ";
                        str4 = "WebResourceHandler";
                        str13 = "ResourceCacheMiss";
                        obj9 = "latency";
                        obj7 = "networkType";
                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                        currentTimeMillis = str;
                        y92 = r11;
                    } catch (Exception e2) {
                        e = e2;
                        r8 = "ResourceCacheMiss";
                        obj9 = "latency";
                        r6 = "networkType";
                        currentTimeMillis = str;
                        r1 = "mimeType is ";
                        str4 = "WebResourceHandler";
                        y92 = r11;
                    }
                    if (r11 != 1) {
                        if (r11 == 2) {
                            long j = uqVar.f;
                            str8 = uqVar.d;
                            map = uqVar.c;
                            Y9 y93 = uqVar.b;
                            String str17 = uqVar.f7423a;
                            ResultKt.throwOnFailure(obj);
                            str3 = "onFailedResponse: ";
                            str10 = "WebResourceHandler";
                            str2 = "ResourceCacheMiss";
                            obj2 = "latency";
                            obj5 = "networkType";
                            currentTimeMillis = j;
                            str9 = "onSuccessfulResponse: ";
                            obj6 = coroutine_suspended;
                            y92 = y93;
                            str11 = str17;
                            Map map3 = map;
                            str12 = str8;
                            Map map4 = map3;
                            Of of2 = (Of) obj;
                            if (y92 != null) {
                                try {
                                    try {
                                    } catch (TimeoutCancellationException e3) {
                                        e = e3;
                                        str4 = str10;
                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        str13 = str2;
                                        obj9 = obj2;
                                        obj7 = obj5;
                                        r3 = map4;
                                        r15 = str11;
                                        r3.put(obj3, Boxing.boxShort((short) 2193));
                                        if (y92 != null) {
                                        }
                                        map2 = r3;
                                        obj8 = obj7;
                                        str14 = str13;
                                        map2.put(obj8, Y5.o());
                                        map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                        C3829jm c3829jm = C3829jm.f7187a;
                                        C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                        return null;
                                    }
                                    try {
                                        str4 = str10;
                                    } catch (Exception e4) {
                                        e = e4;
                                        str4 = str10;
                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        r8 = str2;
                                        obj9 = obj2;
                                        r6 = obj5;
                                        r1 = map4;
                                        r1.put(obj3, Boxing.boxShort((short) 2195));
                                        map2 = r1;
                                        obj8 = r6;
                                        str14 = r8;
                                        if (y92 != null) {
                                        }
                                        map2.put(obj8, Y5.o());
                                        map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                        C3829jm c3829jm2 = C3829jm.f7187a;
                                        C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                        return null;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    str4 = str10;
                                }
                                try {
                                    try {
                                        ((Z9) y92).c(str4, "Response received for url: " + str11);
                                    } catch (Exception e6) {
                                        e = e6;
                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                        r8 = str2;
                                        obj9 = obj2;
                                        r6 = obj5;
                                        r1 = map4;
                                        r1.put(obj3, Boxing.boxShort((short) 2195));
                                        map2 = r1;
                                        obj8 = r6;
                                        str14 = r8;
                                        if (y92 != null) {
                                        }
                                        map2.put(obj8, Y5.o());
                                        map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                        C3829jm c3829jm22 = C3829jm.f7187a;
                                        C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                        return null;
                                    }
                                } catch (TimeoutCancellationException e7) {
                                    e = e7;
                                    obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                    str13 = str2;
                                    obj9 = obj2;
                                    obj7 = obj5;
                                    r3 = map4;
                                    r15 = str11;
                                    r3.put(obj3, Boxing.boxShort((short) 2193));
                                    if (y92 != null) {
                                    }
                                    map2 = r3;
                                    obj8 = obj7;
                                    str14 = str13;
                                    map2.put(obj8, Y5.o());
                                    map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                    C3829jm c3829jm222 = C3829jm.f7187a;
                                    C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                    return null;
                                }
                            } else {
                                str4 = str10;
                            }
                            C3991pc c3991pc = b;
                            uqVar.f7423a = str11;
                            uqVar.b = y92;
                            uqVar.c = map4;
                            uqVar.d = str12;
                            uqVar.e = of2;
                            uqVar.f = currentTimeMillis;
                            r6 = 3;
                            uqVar.i = 3;
                            obj9 = c3991pc.a(str11, uqVar);
                            if (obj9 == obj6) {
                                return obj6;
                            }
                            r1 = map4;
                            of = of2;
                            r8 = uqVar;
                            str15 = str11;
                            if (of != null) {
                            }
                            r8 = str2;
                            obj9 = obj2;
                            r6 = obj5;
                            if (y92 != null) {
                            }
                            Short boxShort = Boxing.boxShort((short) 2194);
                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                            r1.put(obj3, boxShort);
                            map2 = r1;
                            obj8 = r6;
                            str14 = r8;
                            map2.put(obj8, Y5.o());
                            map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                            C3829jm c3829jm2222 = C3829jm.f7187a;
                            C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                            return null;
                        }
                        if (r11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        long j2 = uqVar.f;
                        of = uqVar.e;
                        str12 = uqVar.d;
                        Map map5 = uqVar.c;
                        Y9 y94 = uqVar.b;
                        String str18 = uqVar.f7423a;
                        try {
                            ResultKt.throwOnFailure(obj);
                            str3 = "onFailedResponse: ";
                            str15 = str18;
                            str2 = "ResourceCacheMiss";
                            obj2 = "latency";
                            obj5 = "networkType";
                            currentTimeMillis = j2;
                            str9 = "onSuccessfulResponse: ";
                            r1 = map5;
                            str4 = "WebResourceHandler";
                            y92 = y94;
                            r6 = str16;
                            r8 = str18;
                            try {
                                if (of != null) {
                                    try {
                                        try {
                                            if (AbstractC4086sn.a(of) && of.d().string(Charsets.UTF_8).length() > 0) {
                                                if (y92 != null) {
                                                    try {
                                                        try {
                                                            ((Z9) y92).c(str4, str9 + str15);
                                                        } catch (TimeoutCancellationException e8) {
                                                            e = e8;
                                                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                            r8 = str2;
                                                            obj9 = obj2;
                                                            r6 = obj5;
                                                            r3 = r1;
                                                            obj7 = r6;
                                                            str13 = r8;
                                                            r15 = str15;
                                                            r3.put(obj3, Boxing.boxShort((short) 2193));
                                                            if (y92 != null) {
                                                                ((Z9) y92).a(str4, "Timeout occurred for url: " + r15, e);
                                                            }
                                                            map2 = r3;
                                                            obj8 = obj7;
                                                            str14 = str13;
                                                            map2.put(obj8, Y5.o());
                                                            map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                            C3829jm c3829jm22222 = C3829jm.f7187a;
                                                            C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                                            return null;
                                                        }
                                                    } catch (Exception e9) {
                                                        e = e9;
                                                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                        r8 = str2;
                                                        obj9 = obj2;
                                                        r6 = obj5;
                                                        r1.put(obj3, Boxing.boxShort((short) 2195));
                                                        map2 = r1;
                                                        obj8 = r6;
                                                        str14 = r8;
                                                        if (y92 != null) {
                                                        }
                                                        map2.put(obj8, Y5.o());
                                                        map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                        C3829jm c3829jm222222 = C3829jm.f7187a;
                                                        C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                                        return null;
                                                    }
                                                }
                                                try {
                                                    obj9 = obj2;
                                                    try {
                                                        try {
                                                            r1.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                        } catch (TimeoutCancellationException e10) {
                                                            e = e10;
                                                            r8 = str2;
                                                            r6 = obj5;
                                                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                            r3 = r1;
                                                            obj7 = r6;
                                                            str13 = r8;
                                                            r15 = str15;
                                                            r3.put(obj3, Boxing.boxShort((short) 2193));
                                                            if (y92 != null) {
                                                            }
                                                            map2 = r3;
                                                            obj8 = obj7;
                                                            str14 = str13;
                                                            map2.put(obj8, Y5.o());
                                                            map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                            C3829jm c3829jm2222222 = C3829jm.f7187a;
                                                            C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                                            return null;
                                                        }
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        r8 = str2;
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                    r8 = str2;
                                                    obj9 = obj2;
                                                }
                                                try {
                                                    r1.put(ContentDisposition.Parameters.Size, Boxing.boxLong(of.b().c / 1024));
                                                    r6 = obj5;
                                                } catch (Exception e13) {
                                                    e = e13;
                                                    r8 = str2;
                                                    r6 = obj5;
                                                    obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                    r1.put(obj3, Boxing.boxShort((short) 2195));
                                                    map2 = r1;
                                                    obj8 = r6;
                                                    str14 = r8;
                                                    if (y92 != null) {
                                                    }
                                                    map2.put(obj8, Y5.o());
                                                    map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                    C3829jm c3829jm22222222 = C3829jm.f7187a;
                                                    C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                                    return null;
                                                }
                                                try {
                                                    r1.put(r6, Y5.o());
                                                    C3829jm c3829jm3 = C3829jm.f7187a;
                                                    C3829jm.b(str2, r1, EnumC3944nm.f7271a);
                                                    IntRange intRange = Tf.f6872a;
                                                    Intrinsics.checkNotNullParameter(of, "<this>");
                                                    return AbstractC3727g4.a(new ByteArrayInputStream(of.d().toByteArray()), str12);
                                                } catch (TimeoutCancellationException e14) {
                                                    e = e14;
                                                    r8 = str2;
                                                    obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                    r3 = r1;
                                                    obj7 = r6;
                                                    str13 = r8;
                                                    r15 = str15;
                                                    r3.put(obj3, Boxing.boxShort((short) 2193));
                                                    if (y92 != null) {
                                                    }
                                                    map2 = r3;
                                                    obj8 = obj7;
                                                    str14 = str13;
                                                    map2.put(obj8, Y5.o());
                                                    map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                    C3829jm c3829jm222222222 = C3829jm.f7187a;
                                                    C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                                    return null;
                                                } catch (Exception e15) {
                                                    e = e15;
                                                    r8 = str2;
                                                    obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                                    r1.put(obj3, Boxing.boxShort((short) 2195));
                                                    map2 = r1;
                                                    obj8 = r6;
                                                    str14 = r8;
                                                    if (y92 != null) {
                                                    }
                                                    map2.put(obj8, Y5.o());
                                                    map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                                    C3829jm c3829jm2222222222 = C3829jm.f7187a;
                                                    C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                                    return null;
                                                }
                                            }
                                        } catch (TimeoutCancellationException e16) {
                                            e = e16;
                                            r8 = str2;
                                            obj9 = obj2;
                                        }
                                    } catch (Exception e17) {
                                        e = e17;
                                        r8 = str2;
                                        obj9 = obj2;
                                    }
                                }
                                r8 = str2;
                                obj9 = obj2;
                                r6 = obj5;
                                if (y92 != null) {
                                    ((Z9) y92).b(str4, str3 + str15 + ServerSentEventKt.SPACE + of);
                                }
                                Short boxShort2 = Boxing.boxShort((short) 2194);
                                obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                try {
                                    r1.put(obj3, boxShort2);
                                    map2 = r1;
                                    obj8 = r6;
                                    str14 = r8;
                                } catch (TimeoutCancellationException e18) {
                                    e = e18;
                                    r3 = r1;
                                    obj7 = r6;
                                    str13 = r8;
                                    r15 = str15;
                                    r3.put(obj3, Boxing.boxShort((short) 2193));
                                    if (y92 != null) {
                                    }
                                    map2 = r3;
                                    obj8 = obj7;
                                    str14 = str13;
                                    map2.put(obj8, Y5.o());
                                    map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                    C3829jm c3829jm22222222222 = C3829jm.f7187a;
                                    C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                    return null;
                                } catch (Exception e19) {
                                    e = e19;
                                    r1.put(obj3, Boxing.boxShort((short) 2195));
                                    map2 = r1;
                                    obj8 = r6;
                                    str14 = r8;
                                    if (y92 != null) {
                                    }
                                    map2.put(obj8, Y5.o());
                                    map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                    C3829jm c3829jm222222222222 = C3829jm.f7187a;
                                    C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                    return null;
                                }
                            } catch (TimeoutCancellationException e20) {
                                e = e20;
                            } catch (Exception e21) {
                                e = e21;
                            }
                        } catch (TimeoutCancellationException e22) {
                            e = e22;
                            r3 = map5;
                            r15 = str18;
                            str4 = "WebResourceHandler";
                            str13 = "ResourceCacheMiss";
                            obj9 = "latency";
                            obj7 = "networkType";
                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                            currentTimeMillis = j2;
                            y92 = y94;
                            r3.put(obj3, Boxing.boxShort((short) 2193));
                            if (y92 != null) {
                            }
                            map2 = r3;
                            obj8 = obj7;
                            str14 = str13;
                            map2.put(obj8, Y5.o());
                            map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                            C3829jm c3829jm2222222222222 = C3829jm.f7187a;
                            C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                            return null;
                        } catch (Exception e23) {
                            e = e23;
                            r8 = "ResourceCacheMiss";
                            obj9 = "latency";
                            r6 = "networkType";
                            currentTimeMillis = j2;
                            r1 = map5;
                            str4 = "WebResourceHandler";
                            y92 = y94;
                            obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                            r1.put(obj3, Boxing.boxShort((short) 2195));
                            map2 = r1;
                            obj8 = r6;
                            str14 = r8;
                            if (y92 != null) {
                            }
                            map2.put(obj8, Y5.o());
                            map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                            C3829jm c3829jm22222222222222 = C3829jm.f7187a;
                            C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                            return null;
                        }
                        map2.put(obj8, Y5.o());
                        map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                        C3829jm c3829jm222222222222222 = C3829jm.f7187a;
                        C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                        return null;
                    }
                    long j3 = uqVar.f;
                    str8 = uqVar.d;
                    map = uqVar.c;
                    Y9 y95 = uqVar.b;
                    String str19 = uqVar.f7423a;
                    ResultKt.throwOnFailure(obj);
                    str3 = "onFailedResponse: ";
                    str2 = "ResourceCacheMiss";
                    obj2 = "latency";
                    obj5 = "networkType";
                    currentTimeMillis = j3;
                    y92 = y95;
                    str7 = str19;
                } else {
                    ResultKt.throwOnFailure(obj);
                    C4033qq c4033qq = c;
                    if (c4033qq == null || c4033qq.f7337a == null) {
                        if (y92 == null) {
                            return null;
                        }
                        ((Z9) y92).b("WebResourceHandler", "WebAsset Cache Helper was not Initialized. " + c4033qq + " for URL: " + ((String) str));
                        return null;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("url", str);
                    str2 = "ResourceCacheMiss";
                    obj2 = "latency";
                    currentTimeMillis = System.currentTimeMillis();
                    str3 = "onFailedResponse: ";
                    try {
                        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
                        if (AbstractC3727g4.a(fileExtensionFromUrl)) {
                            obj5 = "networkType";
                            try {
                                str6 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                            } catch (TimeoutCancellationException e24) {
                                e = e24;
                                str4 = "WebResourceHandler";
                                obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                str5 = str2;
                                obj9 = obj2;
                                obj4 = obj5;
                                r15 = str;
                                r3 = linkedHashMap;
                                obj7 = obj4;
                                str13 = str5;
                                r3.put(obj3, Boxing.boxShort((short) 2193));
                                if (y92 != null) {
                                }
                                map2 = r3;
                                obj8 = obj7;
                                str14 = str13;
                                map2.put(obj8, Y5.o());
                                map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                C3829jm c3829jm2222222222222222 = C3829jm.f7187a;
                                C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                return null;
                            } catch (Exception e25) {
                                e = e25;
                                str4 = "WebResourceHandler";
                                obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                                r8 = str2;
                                obj9 = obj2;
                                r6 = obj5;
                                r1 = linkedHashMap;
                                r1.put(obj3, Boxing.boxShort((short) 2195));
                                map2 = r1;
                                obj8 = r6;
                                str14 = r8;
                                if (y92 != null) {
                                }
                                map2.put(obj8, Y5.o());
                                map2.put(obj9, Boxing.boxLong(System.currentTimeMillis() - currentTimeMillis));
                                C3829jm c3829jm22222222222222222 = C3829jm.f7187a;
                                C3829jm.b(str14, map2, EnumC3944nm.f7271a);
                                return null;
                            }
                        } else {
                            obj5 = "networkType";
                            str6 = null;
                        }
                        if (str6 == null || str6.length() == 0) {
                            str6 = "text/html";
                        }
                        if (y92 != null) {
                            ((Z9) y92).a("WebResourceHandler", "mimeType is " + str6 + " for " + ((String) str));
                        }
                        InputStream a2 = c4033qq.a((String) str, y92);
                        if (a2 != null) {
                            if (y92 != null) {
                                ((Z9) y92).a("WebResourceHandler", "Found in cache: " + ((String) str));
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            linkedHashMap2.put("url", str);
                            C3829jm c3829jm4 = C3829jm.f7187a;
                            C3829jm.b("ResourceCacheHit", linkedHashMap2, EnumC3944nm.f7271a);
                            return AbstractC3727g4.a(a2, str6);
                        }
                        C3991pc c3991pc2 = b;
                        vq vqVar = new vq(str, y92, null);
                        uqVar.f7423a = str;
                        uqVar.b = y92;
                        uqVar.c = linkedHashMap;
                        uqVar.d = str6;
                        uqVar.f = currentTimeMillis;
                        uqVar.i = 1;
                        obj = c3991pc2.a(str, vqVar, uqVar);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str7 = str;
                        str8 = str6;
                        map = linkedHashMap;
                    } catch (TimeoutCancellationException e26) {
                        e = e26;
                        str4 = "WebResourceHandler";
                        obj4 = "networkType";
                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                        str5 = str2;
                        obj9 = obj2;
                    } catch (Exception e27) {
                        e = e27;
                        str4 = "WebResourceHandler";
                        r6 = "networkType";
                        obj3 = IronSourceConstants.EVENTS_ERROR_CODE;
                        r8 = str2;
                        obj9 = obj2;
                    }
                }
                str9 = "onSuccessfulResponse: ";
                str10 = "WebResourceHandler";
                long timeout = a().getTimeout() * Math.max(1, a().getMaxRetries());
                wq wqVar = new wq(y92, str7, (Deferred) obj, null);
                uqVar.f7423a = str7;
                uqVar.b = y92;
                uqVar.c = map;
                uqVar.d = str8;
                uqVar.f = currentTimeMillis;
                uqVar.i = 2;
                obj = TimeoutKt.withTimeout(timeout, wqVar, uqVar);
                obj6 = coroutine_suspended;
                str11 = str7;
                if (obj == obj6) {
                    return obj6;
                }
                Map map32 = map;
                str12 = str8;
                Map map42 = map32;
                Of of22 = (Of) obj;
                if (y92 != null) {
                }
                C3991pc c3991pc3 = b;
                uqVar.f7423a = str11;
                uqVar.b = y92;
                uqVar.c = map42;
                uqVar.d = str12;
                uqVar.e = of22;
                uqVar.f = currentTimeMillis;
                r6 = 3;
                uqVar.i = 3;
                obj9 = c3991pc3.a(str11, uqVar);
                if (obj9 == obj6) {
                }
            }
        }
        uqVar = new uq(this, continuationImpl);
        obj = uqVar.g;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r11 = uqVar.i;
        if (r11 == 0) {
        }
        str9 = "onSuccessfulResponse: ";
        str10 = "WebResourceHandler";
        long timeout2 = a().getTimeout() * Math.max(1, a().getMaxRetries());
        wq wqVar2 = new wq(y92, str7, (Deferred) obj, null);
        uqVar.f7423a = str7;
        uqVar.b = y92;
        uqVar.c = map;
        uqVar.d = str8;
        uqVar.f = currentTimeMillis;
        uqVar.i = 2;
        obj = TimeoutKt.withTimeout(timeout2, wqVar2, uqVar);
        obj6 = coroutine_suspended2;
        str11 = str7;
        if (obj == obj6) {
        }
        Map map322 = map;
        str12 = str8;
        Map map422 = map322;
        Of of222 = (Of) obj;
        if (y92 != null) {
        }
        C3991pc c3991pc32 = b;
        uqVar.f7423a = str11;
        uqVar.b = y92;
        uqVar.c = map422;
        uqVar.d = str12;
        uqVar.e = of222;
        uqVar.f = currentTimeMillis;
        r6 = 3;
        uqVar.i = 3;
        obj9 = c3991pc32.a(str11, uqVar);
        if (obj9 == obj6) {
        }
    }

    public static Deferred a(String str, Y9 y9) {
        if (y9 != null) {
            ((Z9) y9).c("WebResourceHandler", "downloadResourceFile(): " + str);
        }
        return ((C3733ga) If.d.getValue()).a(new Kf(str, null, new Cm(a().getTimeout(), a().getTimeout(), a().getTimeout()), null, new C3631ck(500L, a().getMaxRetries()), false, 42));
    }
}
