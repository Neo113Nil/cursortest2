package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class c3 {
    public static final a c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Object f4703a;
    public final CBError b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final c3 a(Object obj) {
            return new c3(obj, null, 0 == true ? 1 : 0);
        }

        public a() {
        }

        public final c3 a(CBError cBError) {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new c3(defaultConstructorMarker, cBError, defaultConstructorMarker);
        }
    }

    public /* synthetic */ c3(Object obj, CBError cBError, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, cBError);
    }

    public static final c3 a(CBError cBError) {
        return c.a(cBError);
    }

    public c3(Object obj, CBError cBError) {
        this.f4703a = obj;
        this.b = cBError;
    }
}
