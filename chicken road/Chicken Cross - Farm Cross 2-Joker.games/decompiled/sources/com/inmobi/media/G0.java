package com.inmobi.media;

import android.app.Activity;
import com.inmobi.media.core.config.models.AdConfig;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public abstract class G0 {
    public static C0 b;
    public static CoroutineScope e;
    public static CoroutineScope f;

    /* renamed from: a, reason: collision with root package name */
    public static final Lazy f6569a = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.G0$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return G0.a();
        }
    });
    public static final Lazy c = LazyKt.lazy(new Function0() { // from class: com.inmobi.media.G0$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return G0.b();
        }
    });
    public static final D0 d = new D0();

    public static final J0 a() {
        return new J0(T9.b());
    }

    public static final CopyOnWriteArrayList b() {
        return new CopyOnWriteArrayList();
    }

    public static void a(Activity activity, Ej renderView, String beaconUrl, boolean z, JSONObject extras, C3970oj listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(beaconUrl, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(activity, beaconUrl, z, extras, listener);
        C0 c0 = b;
        if (c0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            c0 = null;
        }
        c0.getClass();
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        c0.c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class);
            Lazy lazy = c;
            if (((CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }

    public static void a(Ej adView, Ej renderView, String beaconUrl, boolean z, JSONObject extras, C3970oj listener) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(renderView, "renderView");
        Intrinsics.checkNotNullParameter(beaconUrl, "url");
        Intrinsics.checkNotNullParameter(extras, "extras");
        Intrinsics.checkNotNullParameter(listener, "listener");
        renderView.getAdQualityManager().a(adView, beaconUrl, z, extras, listener);
        C0 c0 = b;
        if (c0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("executor");
            c0 = null;
        }
        c0.getClass();
        Intrinsics.checkNotNullParameter(beaconUrl, "beaconUrl");
        Intrinsics.checkNotNullParameter(listener, "listener");
        c0.c.put(beaconUrl, new WeakReference(listener));
        String creativeID = renderView.getCreativeID();
        if (creativeID.length() > 0) {
            J4 j4 = AbstractC4260z4.f7518a;
            Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
            AdConfig adConfig = (AdConfig) AbstractC4260z4.f7518a.a(AdConfig.class);
            Lazy lazy = c;
            if (((CopyOnWriteArrayList) lazy.getValue()).size() < adConfig.getAdReport().getCridls()) {
                ((CopyOnWriteArrayList) lazy.getValue()).add(creativeID);
            }
        }
    }
}
