package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes6.dex */
public final class Zi {

    /* renamed from: a, reason: collision with root package name */
    public final C3733ga f6994a;
    public final String b;
    public final P4 c;

    public Zi(C3733ga configClient) {
        Intrinsics.checkNotNullParameter(configClient, "configClient");
        this.f6994a = configClient;
        this.b = "Zi";
        this.c = new P4();
    }

    public static final boolean a(Set set, N4 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return set.contains(it.b.getType());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Q4 a(O4 o4, N4 n4) {
        D2 d2;
        String configType = n4.b.getType();
        Intrinsics.checkNotNullParameter(o4, "<this>");
        Intrinsics.checkNotNullParameter(configType, "configType");
        switch (configType.hashCode()) {
            case -60641721:
                if (configType.equals("crashReporting")) {
                    d2 = o4.b();
                    break;
                }
                d2 = null;
                break;
            case 96432:
                if (configType.equals(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS)) {
                    d2 = o4.a();
                    break;
                }
                d2 = null;
                break;
            case 3506402:
                if (configType.equals("root")) {
                    d2 = o4.c();
                    break;
                }
                d2 = null;
                break;
            case 780346297:
                if (configType.equals("telemetry")) {
                    d2 = o4.e();
                    break;
                }
                d2 = null;
                break;
            case 2088265419:
                if (configType.equals("signals")) {
                    d2 = o4.d();
                    break;
                }
                d2 = null;
                break;
            default:
                d2 = null;
                break;
        }
        if (d2 == null) {
            return new C4(5, n4.b.getLastUpdateTimeStamp(), n4.b.getType());
        }
        C4170vn a2 = this.c.a(d2, n4);
        int i = a2.f7443a;
        if (i == 200) {
            Config config = a2.b;
            config.setLastUpdateTimeStamp(System.currentTimeMillis());
            String tag = this.b;
            Intrinsics.checkNotNullExpressionValue(tag, "tag");
            String str = "Config cached successfully: " + n4.b.getType();
            return new R4(200, config);
        }
        if (i != 304) {
            return new C4(a2.f7443a, n4.b.getLastUpdateTimeStamp(), n4.b.getType());
        }
        Config config2 = a2.b;
        config2.setLastUpdateTimeStamp(System.currentTimeMillis());
        String tag2 = this.b;
        Intrinsics.checkNotNullExpressionValue(tag2, "tag");
        String str2 = "Config cached successfully: " + n4.b.getType();
        return new R4(Sdk.SDKError.Reason.AD_EXPIRED_VALUE, config2);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:112:0x04cd
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0200 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03ec A[LOOP:4: B:93:0x03e6->B:95:0x03ec, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x036f  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x049c -> B:13:0x04a4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String r27, java.lang.String r28, com.inmobi.media.core.config.models.RootConfig r29, java.util.List r30, kotlinx.coroutines.channels.ProducerScope r31, kotlin.coroutines.jvm.internal.ContinuationImpl r32) {
        /*
            Method dump skipped, instructions count: 1251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.Zi.a(java.lang.String, java.lang.String, com.inmobi.media.core.config.models.RootConfig, java.util.List, kotlinx.coroutines.channels.ProducerScope, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:11:0x002a, B:12:0x004e, B:14:0x0052, B:15:0x0056, B:17:0x005c, B:21:0x006b, B:22:0x0072), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b A[Catch: ClassCastException -> 0x0074, JSONException -> 0x0079, TryCatch #3 {ClassCastException -> 0x0074, JSONException -> 0x0079, blocks: (B:11:0x002a, B:12:0x004e, B:14:0x0052, B:15:0x0056, B:17:0x005c, B:21:0x006b, B:22:0x0072), top: B:10:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Of of, List list, ContinuationImpl continuationImpl) {
        Yi yi;
        int i;
        ArrayList arrayList;
        O4 o4;
        if (continuationImpl instanceof Yi) {
            yi = (Yi) continuationImpl;
            int i2 = yi.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yi.e = i2 - Integer.MIN_VALUE;
                Object obj = yi.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = yi.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ArrayList arrayList2 = new ArrayList();
                    try {
                        yi.f6975a = list;
                        yi.b = arrayList2;
                        yi.e = 1;
                        Object a2 = of.a();
                        if (a2 == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        obj = a2;
                        arrayList = arrayList2;
                    } catch (ClassCastException unused) {
                        arrayList = arrayList2;
                        a(list, 2);
                        return arrayList;
                    } catch (JSONException unused2) {
                        arrayList = arrayList2;
                        a(list, 2);
                        return arrayList;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    arrayList = yi.b;
                    list = yi.f6975a;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (ClassCastException unused3) {
                        a(list, 2);
                        return arrayList;
                    } catch (JSONException unused4) {
                        a(list, 2);
                        return arrayList;
                    }
                }
                o4 = (O4) obj;
                if (o4 == null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(a(o4, (N4) it.next()));
                    }
                    return arrayList;
                }
                throw new JSONException("Error parsing config response");
            }
        }
        yi = new Yi(this, continuationImpl);
        Object obj2 = yi.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = yi.e;
        if (i != 0) {
        }
        o4 = (O4) obj2;
        if (o4 == null) {
        }
    }

    public static void a(int i, List list, List list2) {
        Map mutableMapOf = MapsKt.mutableMapOf(TuplesKt.to(IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)), TuplesKt.to("name", list), TuplesKt.to("lts", list2), TuplesKt.to("networkType", Y5.o()));
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm.b("InvalidConfig", mutableMapOf, EnumC3944nm.f7271a);
    }

    public static void a(List list, int i) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((N4) it.next()).b.getType());
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Long.valueOf(((N4) it2.next()).b.getLastUpdateTimeStamp()));
        }
        a(i, arrayList, arrayList2);
    }
}
