package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Q8 {
    private static final a b = new a(null);

    @Deprecated
    public static final String c = "mismatch";

    /* renamed from: a, reason: collision with root package name */
    private final C4703w1 f7858a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Q8() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a(String subscriberId, Class<?> listenerClass) {
        Intrinsics.checkNotNullParameter(subscriberId, "subscriberId");
        Intrinsics.checkNotNullParameter(listenerClass, "listenerClass");
        a(this, EnumC4707w5.TROUBLESHOOTING_ILR_THIRD_PARTY_SUBSCRIBE, subscriberId, listenerClass, null, 8, null);
    }

    public Q8(C4703w1 appEventsManager) {
        Intrinsics.checkNotNullParameter(appEventsManager, "appEventsManager");
        this.f7858a = appEventsManager;
    }

    public final void a(String subscriberId, Class<?> listenerClass, boolean z) {
        Intrinsics.checkNotNullParameter(subscriberId, "subscriberId");
        Intrinsics.checkNotNullParameter(listenerClass, "listenerClass");
        a(EnumC4707w5.TROUBLESHOOTING_ILR_THIRD_PARTY_SUBSCRIBE_FAILED, subscriberId, listenerClass, z ? c : null);
    }

    public /* synthetic */ Q8(C4703w1 c4703w1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Ib.v.d().q() : c4703w1);
    }

    public final void a(Class<?> listenerClass) {
        Intrinsics.checkNotNullParameter(listenerClass, "listenerClass");
        a(this, EnumC4707w5.TROUBLESHOOTING_ILR_THIRD_PARTY_UNSUBSCRIBE, null, listenerClass, null, 8, null);
    }

    static /* synthetic */ void a(Q8 q8, EnumC4707w5 enumC4707w5, String str, Class cls, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = null;
        }
        q8.a(enumC4707w5, str, cls, str2);
    }

    private final void a(EnumC4707w5 enumC4707w5, String str, Class<?> cls, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append("subId=" + str + ",");
        }
        sb.append("name=" + cls.getName());
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        JSONObject b2 = IronSourceUtils.b(false);
        b2.put(IronSourceConstants.EVENTS_EXT1, sb2);
        if (str2 != null) {
            b2.put("reason", str2);
        }
        this.f7858a.a(new C4689v5(enumC4707w5, b2));
    }
}
