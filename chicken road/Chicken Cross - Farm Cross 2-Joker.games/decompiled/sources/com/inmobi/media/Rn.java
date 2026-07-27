package com.inmobi.media;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C4665u;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vungle.ads.internal.protos.Sdk;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes6.dex */
public final class Rn {

    /* renamed from: a, reason: collision with root package name */
    public final AdConfig.VastVideoConfig f6834a;
    public final C4279zn b;
    public final Z9 c;
    public int d;
    public boolean e;
    public String f;
    public String g;
    public final ArrayList h;
    public final ArrayList i;
    public String j;
    public String k;
    public final ArrayList l;
    public final ArrayList m;
    public final ArrayList n;

    public Rn(AdConfig.VastVideoConfig vastVideoConfig, C4279zn vastEventProcessor, Z9 z9) {
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(vastEventProcessor, "vastEventProcessor");
        this.f6834a = vastVideoConfig;
        this.b = vastEventProcessor;
        this.c = z9;
        this.f = "";
        this.g = "";
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = "";
        this.k = "";
        this.l = new ArrayList();
        this.m = new ArrayList();
        this.n = new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(Rn rn, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        In in;
        int i;
        String str;
        Ref.BooleanRef booleanRef;
        rn.getClass();
        if (continuationImpl instanceof In) {
            in = (In) continuationImpl;
            int i2 = in.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                in.d = i2 - Integer.MIN_VALUE;
                Object obj = in.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = in.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    try {
                        str = xmlPullParser.getAttributeValue(null, "adType").toString();
                    } catch (Exception unused) {
                        str = "video";
                    }
                    if (!Intrinsics.areEqual(str, "video")) {
                        throw new Fn((short) 1125);
                    }
                    Function1 jn = new Jn(rn, null, booleanRef2, xmlPullParser);
                    in.f6634a = booleanRef2;
                    in.d = 1;
                    if (rn.a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.d, jn, in) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = in.f6634a;
                    ResultKt.throwOnFailure(obj);
                }
                if (booleanRef.element) {
                    throw new Fn((short) 1101);
                }
                return Unit.INSTANCE;
            }
        }
        in = new In(rn, continuationImpl);
        Object obj2 = in.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = in.d;
        if (i != 0) {
        }
        if (booleanRef.element) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(Rn rn, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        Mn mn;
        int i;
        Ref.BooleanRef booleanRef;
        Ref.BooleanRef booleanRef2;
        rn.getClass();
        if (continuationImpl instanceof Mn) {
            mn = (Mn) continuationImpl;
            int i2 = mn.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mn.e = i2 - Integer.MIN_VALUE;
                Object obj = mn.c;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = mn.e;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                    Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
                    Function1 nn = new Nn(xmlPullParser, rn, booleanRef4, booleanRef3, null);
                    mn.f6725a = booleanRef3;
                    mn.b = booleanRef4;
                    mn.e = 1;
                    if (rn.a(xmlPullParser, "VAST", nn, mn) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef3;
                    booleanRef2 = booleanRef4;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef2 = mn.b;
                    booleanRef = mn.f6725a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!booleanRef.element) {
                    return Unit.INSTANCE;
                }
                if (booleanRef2.element) {
                    throw new Fn((short) 1124);
                }
                throw new Fn((short) 1102);
            }
        }
        mn = new Mn(rn, continuationImpl);
        Object obj2 = mn.c;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = mn.e;
        if (i != 0) {
        }
        if (!booleanRef.element) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(Rn rn, XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        Pn pn;
        int i;
        Ref.BooleanRef booleanRef;
        rn.getClass();
        if (continuationImpl instanceof Pn) {
            pn = (Pn) continuationImpl;
            int i2 = pn.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pn.d = i2 - Integer.MIN_VALUE;
                Object obj = pn.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pn.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    int i3 = rn.d + 1;
                    rn.d = i3;
                    if (i3 > rn.f6834a.getMaxWrapperLimit()) {
                        throw new Fn((short) 1107);
                    }
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Function1 qn = new Qn(rn, null, booleanRef2, xmlPullParser);
                    pn.f6788a = booleanRef2;
                    pn.d = 1;
                    if (rn.a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f, qn, pn) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = pn.f6788a;
                    ResultKt.throwOnFailure(obj);
                }
                if (booleanRef.element) {
                    throw new Fn((short) 1121);
                }
                return Unit.INSTANCE;
            }
        }
        pn = new Pn(rn, continuationImpl);
        Object obj2 = pn.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pn.d;
        if (i != 0) {
        }
        if (booleanRef.element) {
        }
    }

    public static final Unit d(XmlPullParser xmlPullParser, Rn rn) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O)) {
            String b = An.b(rn.v(xmlPullParser));
            if (!An.a(b)) {
                b = null;
            }
            C4189wf c4189wf = b != null ? new C4189wf(b, "click") : null;
            if (c4189wf != null) {
                rn.m.add(c4189wf);
            }
        } else if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
            rn.m.addAll(rn.o(xmlPullParser));
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit e(XmlPullParser xmlPullParser, Rn rn) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M)) {
            rn.q(xmlPullParser);
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit h(XmlPullParser xmlPullParser, Rn rn) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
            rn.i.addAll(rn.o(xmlPullParser));
        } else if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x)) {
            rn.a(xmlPullParser, false);
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static void w(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            return;
        }
        int i = 1;
        while (i != 0) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public final void g(final XmlPullParser xmlPullParser) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.e, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this, booleanRef);
            }
        });
        if (!booleanRef.element) {
            throw new Fn((short) 1122);
        }
    }

    public final void i(final XmlPullParser xmlPullParser) {
        final Ref.IntRef intRef = new Ref.IntRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this, intRef);
            }
        });
        if (this.n.size() != 0) {
            if (this.e) {
                Z9 z9 = this.c;
                if (z9 != null) {
                    z9.a("VastParser", "VAST Companion Error: Format not supported");
                }
                Map a2 = AbstractC4169vm.a(this.b.f7529a);
                a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1152);
                C3829jm c3829jm = C3829jm.f7187a;
                C3829jm.b("VastParseEvent", a2, EnumC3944nm.f7271a);
                return;
            }
            return;
        }
        if (this.e) {
            HashMap hashMap = new HashMap();
            hashMap.put("[ERRORCODE]", String.valueOf(IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            C4279zn.a(hashMap, this.i, this.c);
            Map a3 = AbstractC4169vm.a(this.b.f7529a);
            a3.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1150);
            C3829jm c3829jm2 = C3829jm.f7187a;
            C3829jm.b("VastParseEvent", a3, EnumC3944nm.f7271a);
            return;
        }
        if (intRef.element > 0) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("[ERRORCODE]", String.valueOf(600));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            C4279zn.a(hashMap2, this.i, this.c);
            Map a4 = AbstractC4169vm.a(this.b.f7529a);
            a4.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1151);
            C3829jm c3829jm3 = C3829jm.f7187a;
            C3829jm.b("VastParseEvent", a4, EnumC3944nm.f7271a);
        }
    }

    public final boolean j(final XmlPullParser xmlPullParser) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.b(xmlPullParser, this, booleanRef);
            }
        });
        return booleanRef.element;
    }

    public final void k(final XmlPullParser xmlPullParser) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, booleanRef, this, booleanRef2);
            }
        });
        if (!booleanRef.element) {
            throw new Fn((short) 1112);
        }
        if (!booleanRef2.element) {
            throw new Fn((short) 1111);
        }
    }

    public final void l(final XmlPullParser xmlPullParser) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this, booleanRef, booleanRef2);
            }
        });
        if (!booleanRef.element) {
            throw new Fn((short) 1116);
        }
        if (!booleanRef2.element) {
            throw new Fn((short) 1117);
        }
    }

    public final ArrayList m(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this, booleanRef2, booleanRef, arrayList);
            }
        });
        if (!booleanRef2.element) {
            throw new Fn((short) 1118);
        }
        if (arrayList.isEmpty()) {
            throw new Fn((short) 1119);
        }
        if (booleanRef.element) {
            Map a2 = AbstractC4169vm.a(this.b.f7529a);
            a2.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 1153);
            C3829jm c3829jm = C3829jm.f7187a;
            C3829jm.b("VastParseEvent", a2, EnumC3944nm.f7271a);
        }
        return arrayList;
    }

    public final int n(XmlPullParser xmlPullParser) {
        try {
            return xmlPullParser.next();
        } catch (IOException unused) {
            Z9 z9 = this.c;
            if (z9 == null) {
                return -1;
            }
            z9.b("VastParser", "Parsing failed.");
            return -1;
        } catch (XmlPullParserException unused2) {
            Z9 z92 = this.c;
            if (z92 == null) {
                return -1;
            }
            z92.b("VastParser", "VAST Schema validation error: VAST node at appropriate hierarchy not found.");
            return -1;
        }
    }

    public final ArrayList o(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this, arrayList);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void p(final XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "vendor");
        if (attributeValue == null) {
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.b("VastParser", "VAST Schema Validation Error: Vendor not found");
                return;
            }
            return;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = "";
        final Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        final ArrayList arrayList = new ArrayList();
        a(xmlPullParser, "Verification", new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, booleanRef, this, objectRef, objectRef2, arrayList);
            }
        });
        if (!booleanRef.element) {
            HashMap hashMap = new HashMap();
            hashMap.put("[REASON]", String.valueOf(2));
            hashMap.put("[ADSERVINGID]", this.g);
            hashMap.put("[UNIVERSALADID]", this.f);
            C4279zn.a(hashMap, arrayList, this.c);
            return;
        }
        if (!An.a((String) objectRef.element)) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put("[REASON]", String.valueOf(3));
            hashMap2.put("[ADSERVINGID]", this.g);
            hashMap2.put("[UNIVERSALADID]", this.f);
            C4279zn.a(hashMap2, arrayList, this.c);
            return;
        }
        this.i.add(new Bg(attributeValue, (String) objectRef2.element, (String) objectRef.element));
        Z9 z92 = this.c;
        if (z92 != null) {
            z92.a("VastParser", "OMID ADVerification URL : " + objectRef.element);
        }
    }

    public final void q(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.d(xmlPullParser, this);
            }
        });
    }

    public final void r(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.e(xmlPullParser, this);
            }
        });
    }

    public final void s(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.f(xmlPullParser, this);
            }
        });
    }

    public final void t(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.g(xmlPullParser, this);
            }
        });
    }

    public final void u(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.h(xmlPullParser, this);
            }
        });
    }

    public final String v(XmlPullParser xmlPullParser) {
        String text;
        int n = n(xmlPullParser);
        if ((n == 4 || n == 5) && (text = xmlPullParser.getText()) != null && AbstractC3727g4.a(text)) {
            return text;
        }
        return null;
    }

    public final void f(XmlPullParser xmlPullParser) {
        String b = An.b(v(xmlPullParser));
        if (b.length() == 0) {
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.b("VastParser", "Vast Tracker Error: Impression");
                return;
            }
            return;
        }
        if (!An.a(b)) {
            b = null;
        }
        if (b == null) {
            return;
        }
        this.i.add(new C4189wf(b, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n));
    }

    public final void e(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extensions", new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.c(xmlPullParser, this);
            }
        });
    }

    public static final Unit f(XmlPullParser xmlPullParser, Rn rn) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q)) {
            rn.u(xmlPullParser);
        } else if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L)) {
            rn.r(xmlPullParser);
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h(final XmlPullParser xmlPullParser) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this, arrayList, objectRef, arrayList2);
            }
        });
        if (arrayList.isEmpty()) {
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.b("VastParser", "VAST Companion Error: No Companion resources found");
                return;
            }
            return;
        }
        this.n.add(new C4251yn(arrayList, arrayList2, this.m));
    }

    public final void d(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "Extension", new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.b(xmlPullParser, this);
            }
        });
    }

    public static final Unit g(XmlPullParser xmlPullParser, Rn rn) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p)) {
            rn.s(xmlPullParser);
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit b(XmlPullParser xmlPullParser, Rn rn, Ref.BooleanRef booleanRef) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2018804923) {
                if (hashCode != 1150879268) {
                    if (hashCode == 1539775849 && name.equals("UniversalAdId")) {
                        String v = rn.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        rn.f = v;
                    }
                } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.L)) {
                    rn.i(xmlPullParser);
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q)) {
                booleanRef.element = true;
                rn.l(xmlPullParser);
            }
            return Unit.INSTANCE;
        }
        rn.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final C4189wf b(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, NotificationCompat.CATEGORY_EVENT);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        String b = An.b(v(xmlPullParser));
        if (!An.a(b)) {
            return null;
        }
        if (Intrinsics.areEqual(attributeValue, NotificationCompat.CATEGORY_PROGRESS)) {
            if (attributeValue2 == null || attributeValue2.length() == 0) {
                return null;
            }
            if (!new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(attributeValue2) && !new Regex("^0?[0-9]%$|^100%$|^[1-9][0-9]%$").matches(attributeValue2)) {
                Z9 z9 = this.c;
                if (z9 != null) {
                    z9.b("VastParser", "VAST Schema Validation Error: " + attributeValue2 + " is not a valid offset");
                }
            } else {
                return new C3985p6(b, attributeValue2);
            }
        } else {
            if (Sn.f6858a.contains(attributeValue)) {
                Intrinsics.checkNotNull(attributeValue);
                return new C4189wf(b, attributeValue);
            }
            Z9 z92 = this.c;
            if (z92 != null) {
                z92.a("VastParser", "VAST Schema Validation Error: UnKnown Event: " + attributeValue);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.inmobi.media.Rn] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ArrayList urls, ContinuationImpl continuationImpl) {
        Hn hn;
        int i;
        ?? r3;
        try {
            if (continuationImpl instanceof Hn) {
                hn = (Hn) continuationImpl;
                int i2 = hn.d;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    hn.d = i2 - Integer.MIN_VALUE;
                    Object obj = hn.b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = hn.d;
                    r3 = 1;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        hn.f6610a = urls;
                        hn.d = 1;
                        urls = urls;
                        if (a(str, hn) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r13 = hn.f6610a;
                        ResultKt.throwOnFailure(obj);
                        urls = r13;
                    }
                    r3 = this.f;
                    return new Cn(r3, this.g, this.i, this.j, this.k, this.n, this.l);
                }
            }
            if (i != 0) {
            }
            r3 = this.f;
            return new Cn(r3, this.g, this.i, this.j, this.k, this.n, this.l);
        } catch (Fn e) {
            short s = e.f6565a;
            Pair pair = TuplesKt.to("[ERRORCODE]", String.valueOf((s == 1100 || s == 1102) ? 303 : (s == 1101 || s == 1124 || s == 1125 || s == 1103 || s == 1120 || s == 1121 || s == 1123 || s == 1122 || s == 1112 || s == 1109 || s == 1115 || s == 1116 || s == 1117) ? 101 : s == 1104 ? 100 : (s == 1105 || s == 1106) ? DescriptorProtos.Edition.EDITION_LEGACY_VALUE : s == 1107 ? Sdk.SDKError.Reason.INVALID_IFA_STATUS_VALUE : (s == 1108 || s == 1114) ? 300 : s == 1111 ? 201 : s == 1113 ? Sdk.SDKError.Reason.MRAID_ERROR_VALUE : s == 1118 ? 401 : s == 1119 ? 403 : 0));
            Pair pair2 = TuplesKt.to("[ADSERVINGID]", this.g);
            Pair pair3 = TuplesKt.to("[UNIVERSALADID]", this.f);
            Pair[] pairArr = new Pair[3];
            pairArr[0] = pair;
            pairArr[r3] = pair2;
            pairArr[2] = pair3;
            HashMap macros = MapsKt.hashMapOf(pairArr);
            short s2 = e.f6565a;
            if (s2 != 1102 && s2 != 1124) {
                C4279zn.a(macros, this.i, this.c);
            } else {
                C4279zn.a(macros, CollectionsKt.plus((Collection) this.h, (Iterable) this.i), this.c);
            }
            Z9 z9 = this.c;
            Intrinsics.checkNotNullParameter(macros, "macros");
            Intrinsics.checkNotNullParameter(urls, "urls");
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(urls, 10));
            for (String str2 : urls) {
                Intrinsics.checkNotNullParameter(str2, "<this>");
                Intrinsics.checkNotNullParameter(macros, "macros");
                String str3 = str2;
                for (Map.Entry entry : macros.entrySet()) {
                    str3 = StringsKt.replace$default(str3, (String) entry.getKey(), (String) entry.getValue(), false, 4, (Object) null);
                }
                arrayList.add(str3);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String url = (String) it.next();
                X3 x3 = X3.f6941a;
                Sh priority = Sh.b;
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(priority, "priority");
                Vh.a(priority, new O3(url, z9, null));
            }
            throw e;
        }
        hn = new Hn(this, continuationImpl);
        Object obj2 = hn.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = hn.d;
        r3 = 1;
    }

    public static final Unit b(XmlPullParser xmlPullParser, Rn rn) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "AdVerifications")) {
            rn.c(xmlPullParser);
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public final void c(final XmlPullParser xmlPullParser) {
        a(xmlPullParser, "AdVerifications", new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, this);
            }
        });
    }

    public static final Unit c(XmlPullParser xmlPullParser, Rn rn) {
        String str;
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Extension")) {
            try {
                str = xmlPullParser.getAttributeValue(null, "type");
            } catch (Exception unused) {
                str = "";
            }
            if (Intrinsics.areEqual(str, "AdVerifications")) {
                rn.d(xmlPullParser);
            }
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        On on;
        int i;
        try {
            if (continuationImpl instanceof On) {
                on = (On) continuationImpl;
                int i2 = on.c;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    on.c = i2 - Integer.MIN_VALUE;
                    Object obj = on.f6767a;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = on.c;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (TextUtils.isEmpty(str)) {
                            Z9 z9 = this.c;
                            if (z9 != null) {
                                z9.b("VastParser", "VAST Schema validation error: Empty VastXML");
                            }
                            throw new Fn((short) 1100);
                        }
                        try {
                            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
                            Y5.f6965a.getClass();
                            if (!Y5.s()) {
                                newInstance.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                            }
                            XmlPullParser newPullParser = newInstance.newPullParser();
                            newPullParser.setInput(new StringReader(str));
                            Intrinsics.checkNotNullExpressionValue(newPullParser, "apply(...)");
                            on.c = 1;
                            if (a(newPullParser, on) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (XmlPullParserException unused) {
                            Z9 z92 = this.c;
                            if (z92 != null) {
                                z92.b("VastParser", "VAST Schema validation error: (XmlPullParserException)");
                            }
                            throw new Fn((short) 1104);
                        } catch (Exception unused2) {
                            Z9 z93 = this.c;
                            if (z93 != null) {
                                z93.b("VastParser", "VAST Schema validation error: (Exception)");
                            }
                            throw new Fn((short) 1105);
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i != 0) {
            }
            return Unit.INSTANCE;
        } catch (Fn e) {
            Z9 z94 = this.c;
            if (z94 != null) {
                z94.b("VastParser", "VAST Schema validation error: " + ((int) e.f6565a));
            }
            throw e;
        } catch (Exception e2) {
            Z9 z95 = this.c;
            if (z95 != null) {
                String arrays = Arrays.toString(e2.getStackTrace());
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                z95.b("VastParser", "VAST Schema validation error: (Exception) " + arrays);
            }
            throw new Fn((short) 1106);
        }
        on = new On(this, continuationImpl);
        Object obj2 = on.f6767a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = on.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(XmlPullParser xmlPullParser, ContinuationImpl continuationImpl) {
        Kn kn;
        int i;
        Ref.BooleanRef booleanRef;
        if (continuationImpl instanceof Kn) {
            kn = (Kn) continuationImpl;
            int i2 = kn.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kn.d = i2 - Integer.MIN_VALUE;
                Object obj = kn.b;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = kn.d;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Function1 ln = new Ln(this, null, booleanRef2, xmlPullParser);
                    kn.f6679a = booleanRef2;
                    kn.d = 1;
                    if (a(xmlPullParser, "VAST", ln, kn) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    booleanRef = booleanRef2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    booleanRef = kn.f6679a;
                    ResultKt.throwOnFailure(obj);
                }
                if (!booleanRef.element) {
                    return Unit.INSTANCE;
                }
                throw new Fn((short) 1103);
            }
        }
        kn = new Kn(this, continuationImpl);
        Object obj2 = kn.b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = kn.d;
        if (i != 0) {
        }
        if (!booleanRef.element) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Unit a(XmlPullParser xmlPullParser, Rn rn, Ref.BooleanRef booleanRef) {
        String name = xmlPullParser.getName();
        if (name != null) {
            switch (name.hashCode()) {
                case -2077435339:
                    if (name.equals("AdVerifications")) {
                        rn.c(xmlPullParser);
                        break;
                    }
                    break;
                case -1692490108:
                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.o)) {
                        booleanRef.element = true;
                        rn.k(xmlPullParser);
                        break;
                    }
                    break;
                case -1499090620:
                    if (name.equals("AdServingId")) {
                        String v = rn.v(xmlPullParser);
                        if (v == null) {
                            v = "";
                        }
                        rn.g = v;
                        break;
                    }
                    break;
                case 67232232:
                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c)) {
                        C4189wf a2 = rn.a("error", xmlPullParser);
                        if (a2 != null) {
                            rn.i.add(a2);
                            break;
                        }
                    }
                    break;
                case 184043572:
                    if (name.equals("Extensions")) {
                        rn.e(xmlPullParser);
                        break;
                    }
                    break;
                case 2114088489:
                    if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.n)) {
                        rn.f(xmlPullParser);
                        break;
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
        rn.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Ref.BooleanRef booleanRef, Rn rn, Ref.BooleanRef booleanRef2) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.p)) {
            booleanRef.element = true;
            if (rn.j(xmlPullParser)) {
                booleanRef2.element = true;
            }
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Rn rn, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -2049897434) {
                if (hashCode != -1927368268) {
                    if (hashCode != -385055469) {
                        if (hashCode == 611554000 && name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                            rn.i.addAll(rn.o(xmlPullParser));
                        }
                    } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.t)) {
                        booleanRef2.element = true;
                        rn.l.addAll(rn.m(xmlPullParser));
                    }
                } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.s)) {
                    rn.k = rn.a(xmlPullParser);
                    booleanRef.element = true;
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x)) {
                rn.a(xmlPullParser, true);
            }
            return Unit.INSTANCE;
        }
        rn.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final String a(XmlPullParser xmlPullParser) {
        String v = v(xmlPullParser);
        if (v != null) {
            if (TextUtils.isEmpty(v) ? false : new Regex("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d(?:\\.\\d{1,3})?$").matches(v)) {
                return v;
            }
        }
        Z9 z9 = this.c;
        if (z9 != null) {
            z9.b("VastParser", "VAST Schema Validation Error: Invalid Duration " + xmlPullParser.getEventType());
        }
        throw new Fn((short) 1115);
    }

    public static final Unit a(XmlPullParser xmlPullParser, Rn rn, Ref.IntRef intRef) {
        int i;
        if (!Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M)) {
            rn.getClass();
            w(xmlPullParser);
            return Unit.INSTANCE;
        }
        intRef.element++;
        int i2 = 0;
        try {
            String attributeValue = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue, "getAttributeValue(...)");
            i = Integer.parseInt(attributeValue);
        } catch (Exception unused) {
            Z9 z9 = rn.c;
            if (z9 != null) {
                z9.b("VastParser", "Invalid width encountered for a companion and ignoring that.");
            }
            i = 0;
        }
        try {
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue2, "getAttributeValue(...)");
            i2 = Integer.parseInt(attributeValue2);
        } catch (Exception unused2) {
            Z9 z92 = rn.c;
            if (z92 != null) {
                z92.b("VastParser", "Invalid height encountered for a companion and ignoring that.");
            }
        }
        if (i > 0 && i2 > 0) {
            rn.h(xmlPullParser);
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.String] */
    public static final Unit a(XmlPullParser xmlPullParser, Rn rn, List list, Ref.ObjectRef objectRef, List list2) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != -348198615) {
                if (hashCode != 611554000) {
                    if (hashCode != 676623548) {
                        if (hashCode == 1877773523 && name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.O)) {
                            String b = An.b(rn.v(xmlPullParser));
                            if (!An.a(b)) {
                                b = null;
                            }
                            C4189wf c4189wf = b != null ? new C4189wf(b, "click") : null;
                            if (c4189wf != null) {
                                list2.add(c4189wf);
                            }
                        }
                    } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.D)) {
                        rn.a(xmlPullParser, list);
                    }
                } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                    list2.addAll(rn.o(xmlPullParser));
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.N)) {
                ?? b2 = An.b(rn.v(xmlPullParser));
                if (An.a(b2)) {
                    objectRef.element = b2;
                } else {
                    Z9 z9 = rn.c;
                    if (z9 != null) {
                        z9.b("VastParser", "Invalid ClickThrough URL: " + xmlPullParser.getText());
                    }
                }
            }
            return Unit.INSTANCE;
        }
        rn.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final void a(XmlPullParser xmlPullParser, List list) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "creativeType");
        String b = An.b(v(xmlPullParser));
        if (!An.a(b)) {
            Z9 z9 = this.c;
            if (z9 != null) {
                z9.a("VastParser", "VAST Companion Error: StaticResource URL is null or empty");
                return;
            }
            return;
        }
        if (attributeValue == null || StringsKt.isBlank(attributeValue)) {
            return;
        }
        List<String> allowedCompanionType = this.f6834a.getAllowedCompanionType();
        if (!(allowedCompanionType instanceof Collection) || !allowedCompanionType.isEmpty()) {
            Iterator<T> it = allowedCompanionType.iterator();
            while (it.hasNext()) {
                if (StringsKt.equals((String) it.next(), attributeValue, true)) {
                    list.add(new Xj(b));
                    return;
                }
            }
        }
        Z9 z92 = this.c;
        if (z92 != null) {
            z92.a("VastParser", "VAST Companion Error: Format not supported - " + attributeValue);
        }
        this.e = true;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Rn rn, List list) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.w)) {
            C4189wf b = rn.b(xmlPullParser);
            if (b != null) {
                list.add(b);
            }
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public final void a(final XmlPullParser xmlPullParser, final boolean z) {
        a(xmlPullParser, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.x, new Function0() { // from class: com.inmobi.media.Rn$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Rn.a(xmlPullParser, z, this);
            }
        });
    }

    public static final Unit a(XmlPullParser xmlPullParser, boolean z, Rn rn) {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.y)) {
            if (z) {
                String b = An.b(rn.v(xmlPullParser));
                if (An.a(b)) {
                    rn.j = b;
                }
            }
        } else if (Intrinsics.areEqual(name, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.z)) {
            C4189wf a2 = rn.a("click", xmlPullParser);
            if (a2 != null) {
                rn.i.add(a2);
            }
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    public final boolean a(int i, int i2, String str, String str2, int i3) {
        if (An.a(str) && i > 0 && i2 > 0) {
            if (this.f6834a.getBitRate().getBitrate_mandatory() && i3 <= 0) {
                Z9 z9 = this.c;
                if (z9 != null) {
                    z9.b("VastParser", "VAST Schema Validation Error: Bitrate not found or invalid - " + i3);
                }
                return false;
            }
            if (StringsKt.equals(str2, "Progressive", true)) {
                return true;
            }
            Z9 z92 = this.c;
            if (z92 != null) {
                z92.b("VastParser", "VAST Schema Validation Error: Delivery type NULL or invalid - " + str2);
            }
            return false;
        }
        Z9 z93 = this.c;
        if (z93 != null) {
            z93.b("VastParser", "VAST Schema Validation Error: Invalid Media - " + str + ServerSentEventKt.SPACE + i + ", " + i2);
        }
        return false;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Rn rn, Ref.BooleanRef booleanRef, Ref.BooleanRef booleanRef2, List list) {
        int i;
        int i2;
        int i3;
        if (!Intrinsics.areEqual(xmlPullParser.getName(), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.u)) {
            rn.getClass();
            w(xmlPullParser);
            return Unit.INSTANCE;
        }
        booleanRef.element = true;
        String attributeValue = xmlPullParser.getAttributeValue(null, C4665u.g);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        try {
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "bitrate");
            Intrinsics.checkNotNullExpressionValue(attributeValue3, "getAttributeValue(...)");
            i = Integer.parseInt(attributeValue3);
        } catch (Exception unused) {
            Z9 z9 = rn.c;
            if (z9 != null) {
                z9.b("VastParser", "Invalid Value for BitRate.");
            }
            i = 0;
        }
        try {
            String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
            Intrinsics.checkNotNullExpressionValue(attributeValue4, "getAttributeValue(...)");
            i2 = Integer.parseInt(attributeValue4);
        } catch (Exception unused2) {
            Z9 z92 = rn.c;
            if (z92 != null) {
                z92.b("VastParser", "Invalid Value for Media Width.");
            }
            i2 = 0;
        }
        try {
            String attributeValue5 = xmlPullParser.getAttributeValue(null, "height");
            Intrinsics.checkNotNullExpressionValue(attributeValue5, "getAttributeValue(...)");
            i3 = Integer.parseInt(attributeValue5);
        } catch (Exception unused3) {
            Z9 z93 = rn.c;
            if (z93 != null) {
                z93.b("VastParser", "Invalid Value for Media Height.");
            }
            i3 = 0;
        }
        String b = An.b(rn.v(xmlPullParser));
        if (!rn.a(i2, i3, b, attributeValue, i)) {
            return Unit.INSTANCE;
        }
        if (attributeValue2 != null) {
            List<String> allowedContentType = rn.f6834a.getAllowedContentType();
            if (!(allowedContentType instanceof Collection) || !allowedContentType.isEmpty()) {
                Iterator<T> it = allowedContentType.iterator();
                while (it.hasNext()) {
                    if (StringsKt.equals((String) it.next(), attributeValue2, true)) {
                        Intrinsics.checkNotNull(attributeValue);
                        Intrinsics.checkNotNull(attributeValue2);
                        list.add(new Bn(i2, i3, b, attributeValue, attributeValue2, i));
                        return Unit.INSTANCE;
                    }
                }
            }
        }
        Z9 z94 = rn.c;
        if (z94 != null) {
            z94.b("VastParser", "VAST Schema Validation Error: Media type Invalid - " + attributeValue2);
        }
        if (AbstractC3727g4.a(attributeValue2)) {
            booleanRef2.element = true;
        }
        return Unit.INSTANCE;
    }

    public static final Unit a(XmlPullParser xmlPullParser, Rn rn) {
        if (Intrinsics.areEqual(xmlPullParser.getName(), "Verification")) {
            rn.p(xmlPullParser);
        } else {
            rn.getClass();
            w(xmlPullParser);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [T, java.lang.String] */
    public static final Unit a(XmlPullParser xmlPullParser, Ref.BooleanRef booleanRef, Rn rn, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, List list) {
        String name = xmlPullParser.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != 611554000) {
                if (hashCode != 1561251035) {
                    if (hashCode == 1749252741 && name.equals("VerificationParameters")) {
                        objectRef2.element = An.b(rn.v(xmlPullParser));
                    }
                } else if (name.equals("JavaScriptResource")) {
                    if (booleanRef.element) {
                        rn.getClass();
                        w(xmlPullParser);
                        return Unit.INSTANCE;
                    }
                    String attributeValue = xmlPullParser.getAttributeValue(null, "apiFramework");
                    if (attributeValue != null && StringsKt.startsWith$default(attributeValue, CampaignEx.KEY_OMID, false, 2, (Object) null)) {
                        booleanRef.element = true;
                        objectRef.element = An.b(rn.v(xmlPullParser));
                    }
                }
            } else if (name.equals(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.v)) {
                list.addAll(rn.o(xmlPullParser));
            }
            return Unit.INSTANCE;
        }
        rn.getClass();
        w(xmlPullParser);
        return Unit.INSTANCE;
    }

    public final C4189wf a(String str, XmlPullParser xmlPullParser) {
        String b = An.b(v(xmlPullParser));
        if (!An.a(b)) {
            Z9 z9 = this.c;
            if (z9 == null) {
                return null;
            }
            z9.b("VastParser", "Vast Tracker Error: " + str + ServerSentEventKt.SPACE + b);
            return null;
        }
        return new C4189wf(b, str);
    }

    public final void a(XmlPullParser xmlPullParser, String str, Function0 function0) {
        n(xmlPullParser);
        while (xmlPullParser.getEventType() != 1) {
            if (xmlPullParser.getName() != null && Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3) {
                return;
            }
            if (xmlPullParser.getEventType() == 2) {
                function0.invoke();
            }
            n(xmlPullParser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0066 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:10:0x0077). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(XmlPullParser xmlPullParser, String str, Function1 function1, ContinuationImpl continuationImpl) {
        Gn gn;
        int i;
        if (continuationImpl instanceof Gn) {
            gn = (Gn) continuationImpl;
            int i2 = gn.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gn.f = i2 - Integer.MIN_VALUE;
                Object obj = gn.d;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gn.f;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                    return Unit.INSTANCE;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Function1 function12 = gn.c;
                str = gn.b;
                XmlPullParser xmlPullParser2 = gn.f6587a;
                ResultKt.throwOnFailure(obj);
                function1 = function12;
                xmlPullParser = xmlPullParser2;
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1 || (xmlPullParser.getName() != null && Intrinsics.areEqual(xmlPullParser.getName(), str) && xmlPullParser.getEventType() == 3)) {
                    return Unit.INSTANCE;
                }
                if (xmlPullParser.getEventType() == 2) {
                    gn.f6587a = xmlPullParser;
                    gn.b = str;
                    gn.c = function1;
                    gn.f = 1;
                    if (function1.invoke(gn) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                n(xmlPullParser);
                if (xmlPullParser.getEventType() == 1) {
                    if (xmlPullParser.getEventType() == 2) {
                    }
                    n(xmlPullParser);
                    if (xmlPullParser.getEventType() == 1) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        gn = new Gn(this, continuationImpl);
        Object obj2 = gn.d;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gn.f;
        if (i != 0) {
        }
    }
}
