package com.chartboost.sdk.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class li {

    /* renamed from: a, reason: collision with root package name */
    public final e3 f4864a;
    public final ji b;
    public final Function1 c;
    public final h7 d;
    public final String e;

    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1 {
        public static final a b = new a();

        public a() {
            super(1, JSONArray.class, "<init>", "<init>(Ljava/util/Collection;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final JSONArray invoke(Collection collection) {
            return new JSONArray(collection);
        }
    }

    public li(e3 networkService, ji trackingEventCache, Function1 jsonFactory, h7 eventTracker, String sessionId) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(trackingEventCache, "trackingEventCache");
        Intrinsics.checkNotNullParameter(jsonFactory, "jsonFactory");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f4864a = networkService;
        this.b = trackingEventCache;
        this.c = jsonFactory;
        this.d = eventTracker;
        this.e = sessionId;
    }

    public final void a(String url, List events) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(events, "events");
        mi miVar = new mi(url, this.b, this.e, null, this.d, 8, null);
        miVar.a((JSONArray) this.c.invoke(events));
        this.f4864a.a(miVar);
    }

    public /* synthetic */ li(e3 e3Var, ji jiVar, Function1 function1, h7 h7Var, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(e3Var, jiVar, (i & 4) != 0 ? a.b : function1, h7Var, str);
    }
}
