package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ha, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3761ha {

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f7138a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.ha$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AbstractC3761ha.b();
        }
    });
    public static final String b = "ha";

    static {
        Intrinsics.checkNotNull("ha");
    }

    public static String a() {
        Db db = (Db) f7138a.getValue();
        String str = null;
        if (db != null) {
            Intrinsics.checkNotNullParameter("cip", "key");
            str = db.f6510a.getString("cip", null);
        }
        String TAG = b;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        String str2 = "Getting " + str;
        return str;
    }

    public static final Db b() {
        Context context = AbstractC3914mk.f7252a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Db.b;
        return Cb.a(context, "inmobi_store");
    }

    public static void a(String str) {
        Db db = (Db) f7138a.getValue();
        if (db != null) {
            ConcurrentHashMap concurrentHashMap = Db.b;
            db.a("cip", str, false);
            Unit unit = Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(b);
        String str2 = "Saving " + str;
    }
}
