package com.chartboost.sdk.impl;

import android.content.Context;
import com.ironsource.Y1;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public abstract class rb {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f4995a = MapsKt.mapOf(TuplesKt.to(lj.e, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda9
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.a((ob) obj);
        }
    }), TuplesKt.to(lj.f, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda15
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.h((ob) obj);
        }
    }), TuplesKt.to(lj.g, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda16
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.i((ob) obj);
        }
    }), TuplesKt.to(lj.h, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.j((ob) obj);
        }
    }), TuplesKt.to(lj.i, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.k((ob) obj);
        }
    }), TuplesKt.to(lj.j, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda3
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.l((ob) obj);
        }
    }), TuplesKt.to(lj.k, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.m((ob) obj);
        }
    }), TuplesKt.to(lj.l, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.n((ob) obj);
        }
    }), TuplesKt.to(lj.m, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda6
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.o((ob) obj);
        }
    }), TuplesKt.to(lj.n, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda7
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.b((ob) obj);
        }
    }), TuplesKt.to(lj.o, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda10
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.c((ob) obj);
        }
    }), TuplesKt.to(lj.p, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda11
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.d((ob) obj);
        }
    }), TuplesKt.to(lj.q, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda12
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.e((ob) obj);
        }
    }), TuplesKt.to(lj.r, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda13
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.f((ob) obj);
        }
    }), TuplesKt.to(lj.s, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda14
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return rb.g((ob) obj);
        }
    }));
    public static final Regex b = new Regex("\\[[A-Z0-9]+]");
    public static final DateTimeFormatter c;

    static {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");
        Intrinsics.checkNotNullExpressionValue(ofPattern, "ofPattern(...)");
        c = ofPattern;
    }

    public static /* synthetic */ ob a(Context context, ae aeVar, u2 u2Var, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return rb.a((pb) obj2);
                }
            };
        }
        return a(context, aeVar, u2Var, function1);
    }

    public static final String b(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.e();
    }

    public static final String c(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.k();
    }

    public static final String d(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.b();
    }

    public static final String e(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Long l = context.l();
        if (l != null) {
            return a(l.longValue());
        }
        return null;
    }

    public static final String f(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Long l = context.l();
        if (l != null) {
            return a(l.longValue());
        }
        return null;
    }

    public static final String g(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Long l = context.l();
        if (l != null) {
            return a(l.longValue());
        }
        return null;
    }

    public static final String h(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return StringsKt.padStart(String.valueOf(context.c()), 8, '0');
    }

    public static final String i(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer g = context.g();
        return String.valueOf(g != null ? g.intValue() : -1);
    }

    public static final String j(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Integer m = context.m();
        return String.valueOf(m != null ? m.intValue() : -1);
    }

    public static final String k(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return String.valueOf(context.i());
    }

    public static final String l(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.a();
    }

    public static final String m(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.j();
    }

    public static final String n(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.h();
    }

    public static final String o(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.d();
    }

    public static final String b(long j) {
        String format = Instant.ofEpochMilli(j).atZone(ZoneId.systemDefault()).format(c);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final Unit a(pb pbVar) {
        Intrinsics.checkNotNullParameter(pbVar, "<this>");
        return Unit.INSTANCE;
    }

    public static final ob a(Context context, ae openMeasurementManager, u2 identity, Function1 block) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(openMeasurementManager, "openMeasurementManager");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(block, "block");
        pb pbVar = new pb(context, openMeasurementManager, identity);
        block.invoke(pbVar);
        return pbVar.a();
    }

    public static final String a(ob context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return b(context.f());
    }

    public static final String a(String str, final ob context) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return b.replace(str, new Function1() { // from class: com.chartboost.sdk.impl.rb$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return rb.a(ob.this, (MatchResult) obj);
            }
        });
    }

    public static final CharSequence a(ob obVar, MatchResult match) {
        String str;
        String a2;
        Intrinsics.checkNotNullParameter(match, "match");
        String value = match.getValue();
        lj a3 = lj.c.a(value);
        if (a3 == null) {
            return a(value);
        }
        Function1 function1 = (Function1) f4995a.get(a3);
        return (function1 == null || (str = (String) function1.invoke(obVar)) == null || (a2 = a(str)) == null) ? Y1.f : a2;
    }

    public static final String a(String str) {
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            Intrinsics.checkNotNull(encode);
            return encode;
        } catch (UnsupportedEncodingException e) {
            mb.b("Failed to encode macro value: " + str, e);
            return str;
        }
    }

    public static final String a(long j) {
        long coerceAtLeast = RangesKt.coerceAtLeast(j, 0L);
        long j2 = 1000;
        long j3 = coerceAtLeast / j2;
        long j4 = coerceAtLeast % j2;
        long j5 = 3600;
        long j6 = 60;
        String format = String.format("%02d:%02d:%02d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / j5), Long.valueOf((j3 % j5) / j6), Long.valueOf(j3 % j6), Long.valueOf(j4)}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String a(Boolean bool, u uVar, Long l, Long l2) {
        ArrayList arrayList = new ArrayList();
        if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
            arrayList.add("mautoplayed");
        } else if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
            arrayList.add("autoplayed");
        } else if (bool != null) {
            throw new NoWhenBranchMatchedException();
        }
        if (uVar == u.d) {
            arrayList.add("optin");
        }
        Long valueOf = l != null ? Long.valueOf(l.longValue() / 1000) : null;
        if (valueOf != null && l2 != null && valueOf.longValue() > l2.longValue()) {
            arrayList.add("skippable");
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, null, 62, null);
    }
}
