package com.startapp.flutter.sdk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.startapp.sdk.ads.nativead.NativeAdDetails;
import java.util.Map;

/* loaded from: classes.dex */
public class StartAppFlutterNative extends StartAppView {
    private static final String LOG_TAG = "StartAppFlutterNative";
    private final StartAppKeeper<NativeAdDetails> nativeAdKeeper;

    public StartAppFlutterNative(StartAppKeeper<NativeAdDetails> startAppKeeper) {
        this.nativeAdKeeper = startAppKeeper;
    }

    @Override // com.startapp.flutter.sdk.StartAppView
    public View onCreateView(Context context, int i3, Map<String, Object> map) {
        int i4;
        String str;
        if (map != null) {
            Object obj = map.get("width");
            int dpToPx = obj instanceof Number ? StartAppView.dpToPx(context, ((Number) obj).floatValue()) : -1;
            Object obj2 = map.get("height");
            int i5 = dpToPx;
            i4 = obj2 instanceof Number ? StartAppView.dpToPx(context, ((Number) obj2).floatValue()) : -1;
            r6 = i5;
        } else {
            i4 = -1;
        }
        View view = new View(context);
        view.setLayoutParams(new ViewGroup.LayoutParams(r6, i4));
        int i6 = StartAppView.getInt(map, "adId", 0);
        if (i6 <= 0) {
            str = "no_ad_id";
        } else {
            NativeAdDetails nativeAdDetails = this.nativeAdKeeper.get(i6);
            if (nativeAdDetails == null) {
                str = "no_ad_instance";
            } else {
                nativeAdDetails.registerViewForInteraction(view);
                str = null;
            }
        }
        if (str != null) {
            view.setBackground(new StartAppErrorDrawable(context.getResources(), "Error: ".concat(str)));
        }
        return view;
    }

    @Override // com.startapp.flutter.sdk.StartAppView, io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onFlutterViewAttached(View view) {
    }

    @Override // com.startapp.flutter.sdk.StartAppView, io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onFlutterViewDetached() {
    }

    @Override // com.startapp.flutter.sdk.StartAppView, io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onInputConnectionLocked() {
    }

    @Override // com.startapp.flutter.sdk.StartAppView, io.flutter.plugin.platform.g
    public /* bridge */ /* synthetic */ void onInputConnectionUnlocked() {
    }
}
