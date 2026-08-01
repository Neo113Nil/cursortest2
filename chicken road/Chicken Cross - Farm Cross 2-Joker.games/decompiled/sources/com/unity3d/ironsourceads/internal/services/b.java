package com.unity3d.ironsourceads.internal.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C4478j9;
import com.ironsource.C4491k4;
import com.ironsource.C4689v5;
import com.ironsource.EnumC4514l9;
import com.ironsource.EnumC4707w5;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4415g;
import com.ironsource.InterfaceC4433h;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.ControllerActivity;
import com.ironsource.sdk.controller.k;
import com.unity3d.ironsourceads.internal.services.InlineStoreActivity;
import com.unity3d.ironsourceads.internal.services.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class b implements com.unity3d.ironsourceads.internal.services.a {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC4415g f11664a;
    private final InterfaceC4433h b;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11665a;

        static {
            int[] iArr = new int[EnumC4514l9.values().length];
            try {
                iArr[EnumC4514l9.DIRECT_INTENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4514l9.APP_ACTIVITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11665a = iArr;
        }
    }

    public b(InterfaceC4415g actionIntentFactory, InterfaceC4433h activityIntentFactory) {
        Intrinsics.checkNotNullParameter(actionIntentFactory, "actionIntentFactory");
        Intrinsics.checkNotNullParameter(activityIntentFactory, "activityIntentFactory");
        this.f11664a = actionIntentFactory;
        this.b = activityIntentFactory;
    }

    private final a.AbstractC1631a b(Activity activity, Intent intent) {
        activity.startActivityForResult(intent, 794006778);
        a(this, EnumC4707w5.INLINE_STORE_LAUNCHED, EnumC4514l9.DIRECT_INTENT, null, 4, null);
        return a.AbstractC1631a.b.f11663a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public a.AbstractC1631a a(Context context, C4478j9 request) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(request, "request");
        try {
            a(this, EnumC4707w5.INLINE_STORE_REQUESTED, request.g(), null, 4, null);
            if (TextUtils.isEmpty(request.h())) {
                a(EnumC4707w5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "storeUrl is empty")));
                return new a.AbstractC1631a.C1632a("storeUrl is empty");
            }
            if (!(context instanceof Activity)) {
                a(EnumC4707w5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new a.AbstractC1631a.C1632a("context is not an Activity");
            }
            Intent a2 = a(request);
            if (!a(context, a2)) {
                a(EnumC4707w5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", "Failed to resolve for packageManager")));
                return new a.AbstractC1631a.C1632a("Failed to resolve for packageManager");
            }
            int i = a.f11665a[request.g().ordinal()];
            if (i == 1) {
                return b((Activity) context, a2);
            }
            if (i == 2) {
                return a((Activity) context, a2);
            }
            throw new NoWhenBranchMatchedException();
        } catch (Exception e) {
            C4491k4.d().a(e);
            String str = "Failed to open inline store: " + e.getMessage();
            IronLog.INTERNAL.error(e.toString());
            a(EnumC4707w5.INLINE_STORE_FAILED, request.g(), MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new a.AbstractC1631a.C1632a(str);
        }
    }

    public b() {
        this(new k.a(), new k.b());
    }

    private final Intent a(C4478j9 c4478j9) {
        Intent a2 = this.f11664a.a();
        a2.setPackage(c4478j9.f());
        a2.setData(Uri.parse(c4478j9.h()));
        JSONObject e = c4478j9.e();
        if (e != null) {
            Iterator<String> keys = e.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object value = e.get(next);
                if (value instanceof String) {
                    a2.putExtra(next, (String) value);
                } else if (value instanceof Boolean) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).longValue());
                } else if (value instanceof Float) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).floatValue());
                } else if (value instanceof Double) {
                    Intrinsics.checkNotNullExpressionValue(value, "value");
                    a2.putExtra(next, ((Number) value).doubleValue());
                } else {
                    a2.putExtra(next, value.toString());
                }
            }
        }
        return a2;
    }

    private final boolean a(Context context, Intent intent) {
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    private final a.AbstractC1631a a(Activity activity, Intent intent) {
        activity.startActivity(new InlineStoreActivity.b(this.b).a(intent).a(activity));
        a(this, EnumC4707w5.INLINE_STORE_ACTIVITY_LAUNCHED, EnumC4514l9.APP_ACTIVITY, null, 4, null);
        return a.AbstractC1631a.b.f11663a;
    }

    @Override // com.unity3d.ironsourceads.internal.services.a
    public a.AbstractC1631a a(Context context, EnumC4514l9 strategy) {
        Intent intent;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        try {
            a(this, EnumC4707w5.INLINE_STORE_DESTROY_REQUESTED, strategy, null, 4, null);
            if (!(context instanceof Activity)) {
                a(EnumC4707w5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", "context is not an Activity")));
                return new a.AbstractC1631a.C1632a("context is not an Activity");
            }
            int i = a.f11665a[strategy.ordinal()];
            if (i == 1) {
                intent = new Intent(context, (Class<?>) ControllerActivity.class);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                intent = new Intent(context, (Class<?>) InlineStoreActivity.class);
            }
            intent.addFlags(603979776);
            intent.putExtra("destroy_inline_store", true);
            context.startActivity(intent);
            a(this, EnumC4707w5.INLINE_STORE_DESTROY_LAUNCHED, strategy, null, 4, null);
            return a.AbstractC1631a.b.f11663a;
        } catch (Exception e) {
            C4491k4.d().a(e);
            String str = "Failed to destroy inline store: " + e.getMessage();
            IronLog.INTERNAL.error(e.toString());
            a(EnumC4707w5.INLINE_STORE_DESTROY_FAILED, strategy, MapsKt.mutableMapOf(TuplesKt.to("reason", str)));
            return new a.AbstractC1631a.C1632a(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(b bVar, EnumC4707w5 enumC4707w5, EnumC4514l9 enumC4514l9, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            map = new LinkedHashMap();
        }
        bVar.a(enumC4707w5, enumC4514l9, map);
    }

    private final void a(EnumC4707w5 enumC4707w5, EnumC4514l9 enumC4514l9, Map<String, Object> map) {
        try {
            map.put(IronSourceConstants.EVENTS_EXT1, "strategy:" + enumC4514l9.b());
            Ib.v.d().q().a(new C4689v5(enumC4707w5, new JSONObject(MapsKt.toMap(map))));
        } catch (Exception e) {
            C4491k4.d().a(e);
        }
    }
}
