package com.inmobi.media;

import android.content.ContentValues;
import androidx.compose.material.TextFieldImplKt;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkService;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.Job;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Kb implements Ng {

    /* renamed from: a, reason: collision with root package name */
    public CrashConfig f6669a;
    public M6 b;
    public final Da c;
    public final Function1 d;

    public Kb(CrashConfig crashConfig) {
        Intrinsics.checkNotNullParameter(crashConfig, "crashConfig");
        this.f6669a = crashConfig;
        this.c = new Da(crashConfig);
        this.d = new Function1() { // from class: com.inmobi.media.Kb$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Kb.a(Kb.this, (C3698f3) obj);
            }
        };
    }

    public static final Unit a(Kb kb, C3698f3 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int i = it.f7098a;
        if (i != 1 && i != 2) {
            switch (i) {
                case TextFieldImplKt.AnimationDuration /* 150 */:
                case 151:
                case 152:
                    Map map = it.c;
                    if (map != null && map.containsKey("data")) {
                        Object obj = it.c.get("data");
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.inmobi.commons.core.incident.IncidentEvent");
                        Ca incident = (Ca) obj;
                        kb.getClass();
                        Intrinsics.checkNotNullParameter(incident, "incident");
                        AbstractC4143un.a(new Jb(kb, incident, null));
                        break;
                    }
                    break;
                default:
                    String str = "unwanted event received - " + i;
                    break;
            }
        } else {
            M6 m6 = kb.b;
            if (m6 != null) {
                m6.f.set(false);
                m6.g.set(true);
                Job job = m6.j;
                if (job != null) {
                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                }
                m6.j = null;
                m6.i = null;
            }
            kb.b = null;
            ((C4214xd) AbstractC3914mk.f.getValue()).a(kb.d);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ff, code lost:
    
        if (r13 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0101, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00aa, code lost:
    
        if (r13.a(r15, (kotlin.coroutines.jvm.internal.ContinuationImpl) r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
    
        if (r15 != r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0072, code lost:
    
        if (r15.a(r7, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Kb kb, Ca ca, ContinuationImpl continuationImpl) {
        Fb fb;
        int i;
        Ca ca2;
        String str;
        Object a2;
        kb.getClass();
        if (continuationImpl instanceof Fb) {
            fb = (Fb) continuationImpl;
            int i2 = fb.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fb.d = i2 - Integer.MIN_VALUE;
                Object obj = fb.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = fb.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis() - (kb.f6669a.getEventTTL() * 1000);
                    C4266za c4266za = (C4266za) Ba.f6473a.getValue();
                    fb.f6554a = ca;
                    fb.d = 1;
                } else if (i == 1) {
                    ca = fb.f6554a;
                    ResultKt.throwOnFailure(obj);
                } else if (i == 2) {
                    ca = fb.f6554a;
                    ResultKt.throwOnFailure(obj);
                    int intValue = (((Number) obj).intValue() + 1) - kb.f6669a.getMaxEventsToPersist();
                    if (intValue > 0) {
                        C4266za c4266za2 = (C4266za) Ba.f6473a.getValue();
                        fb.f6554a = ca;
                        fb.d = 3;
                    }
                    ca2 = ca;
                    C4266za c4266za3 = (C4266za) Ba.f6473a.getValue();
                    fb.f6554a = null;
                    fb.d = 4;
                    S9 s9 = c4266za3.b;
                    String str2 = c4266za3.f6529a;
                    ca2.getClass();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("eventId", ca2.e);
                    contentValues.put("componentType", ca2.f);
                    contentValues.put("eventType", ca2.f6546a);
                    str = ca2.b;
                    if (str == null) {
                    }
                    contentValues.put("payload", str);
                    contentValues.put("ts", String.valueOf(ca2.c));
                    a2 = s9.a(str2, contentValues, 4, fb);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    }
                } else {
                    if (i != 3) {
                        if (i != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ca2 = fb.f6554a;
                    ResultKt.throwOnFailure(obj);
                    C4266za c4266za32 = (C4266za) Ba.f6473a.getValue();
                    fb.f6554a = null;
                    fb.d = 4;
                    S9 s92 = c4266za32.b;
                    String str22 = c4266za32.f6529a;
                    ca2.getClass();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("eventId", ca2.e);
                    contentValues2.put("componentType", ca2.f);
                    contentValues2.put("eventType", ca2.f6546a);
                    str = ca2.b;
                    if (str == null) {
                        str = "";
                    }
                    contentValues2.put("payload", str);
                    contentValues2.put("ts", String.valueOf(ca2.c));
                    a2 = s92.a(str22, contentValues2, 4, fb);
                    if (a2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        a2 = Unit.INSTANCE;
                    }
                }
                C4266za c4266za4 = (C4266za) Ba.f6473a.getValue();
                fb.f6554a = ca;
                fb.d = 2;
                obj = c4266za4.a(fb);
            }
        }
        fb = new Fb(kb, continuationImpl);
        Object obj2 = fb.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = fb.d;
        if (i != 0) {
        }
        C4266za c4266za42 = (C4266za) Ba.f6473a.getValue();
        fb.f6554a = ca;
        fb.d = 2;
        obj2 = c4266za42.a(fb);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Kb kb, ContinuationImpl continuationImpl) {
        Ib ib;
        Object obj;
        int i;
        kb.getClass();
        if (continuationImpl instanceof Ib) {
            ib = (Ib) continuationImpl;
            int i2 = ib.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ib.c = i2 - Integer.MIN_VALUE;
                obj = ib.f6624a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = ib.c;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    C4266za c4266za = (C4266za) Ba.f6473a.getValue();
                    ib.c = 1;
                    obj = c4266za.a(ib);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (((Number) obj).intValue() > 0) {
                    kb.a();
                }
                return Unit.INSTANCE;
            }
        }
        ib = new Ib(kb, continuationImpl);
        obj = ib.f6624a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = ib.c;
        if (i != 0) {
        }
        if (((Number) obj).intValue() > 0) {
        }
        return Unit.INSTANCE;
    }

    public final void a() {
        D6 eventConfig = this.f6669a.getEventConfig();
        eventConfig.k = this.f6669a.getUrl();
        M6 m6 = this.b;
        if (m6 != null) {
            Intrinsics.checkNotNullParameter(eventConfig, "eventConfig");
            m6.i = eventConfig;
        } else {
            this.b = new M6(AppMeasurement.CRASH_ORIGIN, (C4266za) Ba.f6473a.getValue(), this, this.f6669a.getEventConfig(), null);
        }
        M6 m62 = this.b;
        if (m62 != null) {
            m62.a(false);
        }
    }

    @Override // com.inmobi.media.Ng
    public final Object a(Continuation continuation) {
        int a2;
        Object runBlocking$default;
        String str;
        Y5.f6965a.getClass();
        int n = Y5.n();
        int i = 1;
        if (n == 0) {
            a2 = this.f6669a.getMobileConfig().a();
        } else if (n != 1) {
            a2 = this.f6669a.getMobileConfig().a();
        } else {
            a2 = this.f6669a.getWifiConfig().a();
        }
        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new Eb(a2, null), 1, null);
        List<Ca> list = (List) runBlocking$default;
        if (!list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxInt(((Ca) it.next()).d));
            }
            try {
                HashMap hashMap = new HashMap(Y5.f6965a.a(false));
                hashMap.put("im-accid", AbstractC3914mk.c);
                hashMap.put("version", HsdpDeepLinkService.SDK_VERSION);
                hashMap.put("component", AppMeasurement.CRASH_ORIGIN);
                hashMap.put("mk-version", AbstractC3942nk.a());
                hashMap.putAll(U1.d);
                hashMap.put("tp", AbstractC3942nk.b);
                String str2 = AbstractC3942nk.f7270a;
                if (str2 == null) {
                    str2 = "";
                }
                hashMap.put("tpVer", str2);
                JSONObject jSONObject = new JSONObject(hashMap);
                JSONArray jSONArray = new JSONArray();
                for (Ca ca : list) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("eventId", ca.e);
                    jSONObject2.put("eventType", ca.f6546a);
                    String str3 = ca.b;
                    if (str3 == null) {
                        str3 = "";
                    }
                    int length = str3.length() - i;
                    int i2 = 0;
                    boolean z = false;
                    while (i2 <= length) {
                        boolean z2 = Intrinsics.compare((int) str3.charAt(!z ? i2 : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i2++;
                        } else {
                            z = true;
                        }
                    }
                    if (str3.subSequence(i2, length + 1).toString().length() > 0) {
                        String str4 = ca.b;
                        if (str4 == null) {
                            str4 = "";
                        }
                        jSONObject2.put("crash_report", str4);
                    }
                    jSONObject2.put("ts", ca.c);
                    jSONArray.put(jSONObject2);
                    i = 1;
                }
                jSONObject.put(AppMeasurement.CRASH_ORIGIN, jSONArray);
                str = jSONObject.toString();
            } catch (JSONException unused) {
                str = null;
            }
            if (str != null) {
                return new F6(str, arrayList);
            }
        }
        return null;
    }
}
