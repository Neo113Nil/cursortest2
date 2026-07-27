package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;

/* loaded from: classes6.dex */
public final class H3 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f6594a = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H3(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
    }

    public final void a(C4066s3 c4066s3) {
        X3 x3 = X3.f6941a;
        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
        String str = "Retry attemps exhausted for click (" + c4066s3.b + ")";
        b(c4066s3);
        X3 x32 = X3.f6941a;
        X3.a(c4066s3, "RETRY_EXHAUSTED");
        BuildersKt__BuildersKt.runBlocking$default(null, new F3(c4066s3, null), 1, null);
        X3.f.remove(c4066s3);
        if (X3.f.isEmpty()) {
            BuildersKt__BuildersKt.runBlocking$default(null, new G3(this, null), 1, null);
        }
    }

    public final void b(C4066s3 c4066s3) {
        int indexOf = CollectionsKt.indexOf((List<? extends C4066s3>) X3.f, c4066s3);
        if (-1 != indexOf) {
            C4066s3 c4066s32 = (C4066s3) X3.f.get(indexOf == X3.f.size() + (-1) ? 0 : indexOf + 1);
            Message obtain = Message.obtain();
            obtain.what = c4066s32.e ? 3 : 2;
            obtain.obj = c4066s32;
            X3 x3 = X3.f6941a;
            long pingInterval = X3.c().getPingInterval() * 1000;
            if (System.currentTimeMillis() - c4066s32.g < pingInterval) {
                sendMessageDelayed(obtain, pingInterval);
            } else {
                sendMessage(obtain);
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        Object runBlocking$default;
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (X3.h.get()) {
            try {
                int i = msg.what;
                int i2 = 3;
                if (i == 1) {
                    X3 x3 = X3.f6941a;
                    if (X3.e()) {
                        AdConfig.ImaiConfig c = X3.c();
                        C4177w3 c4177w3 = (C4177w3) X3.b.getValue();
                        runBlocking$default = BuildersKt__BuildersKt.runBlocking$default(null, new A3(c4177w3, c, null), 1, null);
                        List list = (List) runBlocking$default;
                        X3.f = list;
                        if (list.isEmpty()) {
                            BuildersKt__BuildersKt.runBlocking$default(null, new B3(c4177w3, this, c, null), 1, null);
                            return;
                        }
                        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                        for (C4066s3 c4066s3 : X3.f) {
                            X3 x32 = X3.f6941a;
                            Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                            String str = c4066s3.b;
                        }
                        C4066s3 c4066s32 = (C4066s3) X3.f.get(0);
                        Message obtain = Message.obtain();
                        if (!c4066s32.e) {
                            i2 = 2;
                        }
                        obtain.what = i2;
                        obtain.obj = c4066s32;
                        long currentTimeMillis = System.currentTimeMillis() - c4066s32.g;
                        if (currentTimeMillis < c.getPingInterval() * 1000) {
                            sendMessageDelayed(obtain, (c.getPingInterval() * 1000) - currentTimeMillis);
                            return;
                        } else {
                            sendMessage(obtain);
                            return;
                        }
                    }
                    return;
                }
                if (i == 2) {
                    if (Sf.a() != null) {
                        X3.g.set(false);
                        X3 x33 = X3.f6941a;
                        X3.g();
                        return;
                    }
                    Object obj = msg.obj;
                    X3 x34 = X3.f6941a;
                    AdConfig.ImaiConfig c2 = X3.c();
                    if (!(obj instanceof C4066s3)) {
                        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                        return;
                    }
                    if (((C4066s3) obj).f != 0) {
                        C4066s3 c4066s33 = (C4066s3) obj;
                        long pingCacheExpiry = c2.getPingCacheExpiry();
                        c4066s33.getClass();
                        if (System.currentTimeMillis() - c4066s33.h <= pingCacheExpiry * 1000) {
                            int maxRetries = (c2.getMaxRetries() - ((C4066s3) obj).f) + 1;
                            if (maxRetries == 0) {
                                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                                String str2 = "Pinging click (" + ((C4066s3) obj).b + ") over HTTP";
                            } else {
                                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                                String str3 = "Retry attempt #" + maxRetries + " for click (" + ((C4066s3) obj).b + ") over HTTP";
                            }
                            BuildersKt__BuildersKt.runBlocking$default(null, new C3((C4066s3) obj, this, null), 1, null);
                            return;
                        }
                    }
                    a((C4066s3) obj);
                    return;
                }
                if (i != 3) {
                    if (i != 4) {
                        Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                        String str4 = "Unhandled message ( " + msg.what + " ) in pingHandler";
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                    Object obj2 = msg.obj;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.inmobi.ads.core.Click");
                    C4066s3 click = (C4066s3) obj2;
                    Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                    String str5 = "Processing click (" + click.b + ") completed";
                    LinkedHashMap linkedHashMap = X3.j;
                    C3582b0 c3582b0 = (C3582b0) linkedHashMap.get(Integer.valueOf(click.f7366a));
                    if (c3582b0 != null) {
                        Intrinsics.checkNotNullParameter(click, "click");
                        c3582b0.f7020a.a(c3582b0.b);
                    }
                    linkedHashMap.remove(Integer.valueOf(click.f7366a));
                    BuildersKt__BuildersKt.runBlocking$default(null, new E3(click, this, null), 1, null);
                    return;
                }
                if (Sf.a() != null) {
                    X3.g.set(false);
                    X3 x35 = X3.f6941a;
                    X3.g();
                    return;
                }
                Object obj3 = msg.obj;
                X3 x36 = X3.f6941a;
                AdConfig.ImaiConfig c3 = X3.c();
                if (!(obj3 instanceof C4066s3)) {
                    Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                    return;
                }
                if (((C4066s3) obj3).f != 0) {
                    C4066s3 c4066s34 = (C4066s3) obj3;
                    long pingCacheExpiry2 = c3.getPingCacheExpiry();
                    c4066s34.getClass();
                    if (System.currentTimeMillis() - c4066s34.h <= pingCacheExpiry2 * 1000) {
                        int maxRetries2 = (c3.getMaxRetries() - ((C4066s3) obj3).f) + 1;
                        if (maxRetries2 == 0) {
                            Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                            String str6 = "Pinging click (" + ((C4066s3) obj3).b + ") in WebView";
                        } else {
                            Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                            String str7 = "Retry attempt #" + maxRetries2 + " for click (" + ((C4066s3) obj3).b + ") using WebView";
                        }
                        new J3(new D3(this)).a((C4066s3) obj3);
                        Unit unit2 = Unit.INSTANCE;
                        return;
                    }
                }
                a((C4066s3) obj3);
            } catch (Exception e) {
                X3 x37 = X3.f6941a;
                Intrinsics.checkNotNullExpressionValue("X3", "access$getTAG$p(...)");
                String str8 = "SDK encountered unexpected error in processing ping; " + e.getMessage();
            }
        }
    }
}
