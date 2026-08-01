package com.chartboost.sdk.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes4.dex */
public final class nb {
    public static final a b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f4894a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nb a(rc placementType) {
            Intrinsics.checkNotNullParameter(placementType, "placementType");
            return new nb("window.mraidbridge.setPlacementType('" + placementType.b() + "');");
        }

        public final nb b(bd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            ua b = screenMetrics.a().b();
            return new nb("window.mraidbridge.setCurrentPosition(" + b.c() + ", " + b.d() + ", " + b.b() + ", " + b.a() + ");");
        }

        public final nb c(bd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            ua b = screenMetrics.b().b();
            return new nb("window.mraidbridge.setDefaultPosition(" + b.c() + ", " + b.d() + ", " + b.b() + ", " + b.a() + ");");
        }

        public final nb d(bd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            ua b = screenMetrics.c().b();
            return new nb("window.mraidbridge.setMaxSize(" + b.b() + ", " + b.a() + ");");
        }

        public final nb e(bd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            ua b = screenMetrics.d().b();
            return new nb("window.mraidbridge.setScreenSize(" + b.b() + ", " + b.a() + ");");
        }

        public a() {
        }

        public final nb a() {
            return new nb("window.mraidbridge.notifyReadyEvent();");
        }

        public final nb a(bd screenMetrics) {
            Intrinsics.checkNotNullParameter(screenMetrics, "screenMetrics");
            ua b = screenMetrics.c().b();
            return new nb("window.mraidbridge.notifySizeChangeEvent(" + b.b() + ", " + b.a() + ");");
        }

        public final nb a(Float f) {
            String str;
            if (f != null) {
                float floatValue = f.floatValue();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(floatValue)}, 1));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            } else {
                str = "null";
            }
            return new nb("window.mraidbridge.notifyAudioVolumeChangeEvent(" + str + ");");
        }

        public final nb b(String sdkVersion) {
            Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
            return a("{hostSDKVersion: '" + sdkVersion + "'}");
        }

        public final nb b() {
            return a("{hostSDKName: 'Chartboost-Android-SDK'}");
        }

        public final nb a(qc orientation, boolean z) {
            Intrinsics.checkNotNullParameter(orientation, "orientation");
            return a("{orientation: '" + orientation.b() + "', locked: " + z + "}");
        }

        public final nb a(sc state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return a("{state: '" + state.b() + "'}");
        }

        public final nb a(boolean z) {
            String lowerCase = String.valueOf(z).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return a("{viewable: " + lowerCase + "}");
        }

        public final nb a(yc command) {
            Intrinsics.checkNotNullParameter(command, "command");
            return new nb("window.mraidbridge.nativeCallComplete({" + command.b() + "});");
        }

        public final nb a(String str) {
            return new nb("window.mraidbridge.fireChangeEvent(" + str + ");");
        }
    }

    public nb(String javascript) {
        Intrinsics.checkNotNullParameter(javascript, "javascript");
        this.f4894a = javascript;
    }

    public final String a() {
        return this.f4894a;
    }
}
